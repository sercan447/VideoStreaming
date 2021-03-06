package com.example.spad.services.videostreaming;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.spad.services.videostreaming.Model.DataDetail;
import com.example.spad.services.videostreaming.Model.Item;
import com.example.spad.services.videostreaming.Model.Model;
import com.example.spad.services.videostreaming.Model.ModelDetail;
import com.example.spad.services.videostreaming.viewmodel.NewsListViewModel;

import java.text.Normalizer;
import java.util.Locale;

public class DetailActivity extends AppCompatActivity {

    public TextView tvTitle;
    ImageView imageView;

    private NewsListViewModel viewModel;
    private Item item=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvTitle = findViewById(R.id.titleView);
        imageView = findViewById(R.id.imageView1);



        if(getIntent() != null){
             item =  (Item) getIntent().getExtras().get("itemNews");

             if(item != null) {
                 Glide.with(getApplicationContext())
                         .load(item.getImageUrl())
                         .placeholder(R.drawable.placeholder)
                         .apply(RequestOptions.centerCropTransform())
                         .into(imageView);

                 tvTitle.setText(Html.fromHtml(item.getShortText(), Html.FROM_HTML_MODE_COMPACT));
             }
        }



        /*
        viewModel = ViewModelProviders.of(this).get(NewsListViewModel.class);
        viewModel.getNewsDetailObServer().observe(this, new Observer<ModelDetail>() {

            @Override
            public void onChanged(ModelDetail newsModel) {

                Glide.with(getApplicationContext())
                         .load(newsModel.getData().getNewDetail().getImageUrl())
                        .placeholder(R.drawable.placeholder)
                        .apply(RequestOptions.centerCropTransform())
                        .into(imageView);

                Locale trlocale = new Locale("tr");

                String val = newsModel.getData().getNewDetail().getBodyText().toLowerCase(trlocale);

                String t = TurkishCharacterToEnglish(val);
                tvTitle.setText(Html.fromHtml(t, Html.FROM_HTML_MODE_COMPACT));

            }

        });
        viewModel.makeNewsDetaill();
        */

    }

    public String TurkishCharacterToEnglish(String text) {
        char[] turkishChars = {'??', '??', '??', '??', '??', '??', '??', '??', '??', '??', '??', '??'};
        char[] englishChars = {'i', 'g', 'I', 'G', 'c', 'C', 's', 'S', 'o', 'O', 'u', 'U'};

        // Match chars
        for (int i = 0; i < turkishChars.length; i++)
            text = text.replace(turkishChars[i], englishChars[i]);


        return text;
    }
}