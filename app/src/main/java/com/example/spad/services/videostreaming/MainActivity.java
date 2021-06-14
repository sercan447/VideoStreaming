package com.example.spad.services.videostreaming;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.VideoView;

import com.example.spad.services.videostreaming.Model.Data;
import com.example.spad.services.videostreaming.Model.Item;
import com.example.spad.services.videostreaming.Model.Model;
import com.example.spad.services.videostreaming.adapter.NewsAdapter;
import com.example.spad.services.videostreaming.viewmodel.NewsListViewModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    String url = "https://turkmedya-live.ercdn.net/tv24/tv24.m3u8";
    VideoView videoView;
    ImageButton imageButton;

    private NewsListViewModel viewModel;

    private List<Data> newsModelList;

    private NewsAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewModel = ViewModelProviders.of(this).get(NewsListViewModel.class);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        LinearLayoutManager layoutManager = new GridLayoutManager(this,1);
        recyclerView.setLayoutManager(layoutManager);

        adapter = new NewsAdapter(this,newsModelList);

        recyclerView.setAdapter(adapter);

        viewModel = ViewModelProviders.of(this).get(NewsListViewModel.class);

        viewModel.getNewsListObServer().observe(this, new Observer<Model>() {

            @Override
            public void onChanged(Model newsModel) {

                if(newsModel != null){
                    newsModelList = newsModel.getDatas();
                    adapter.setMovieList(newsModelList);

                    adapter.notifyDataSetChanged();
                }
            }
        });

        viewModel.makeApiCall();

        videoView = findViewById(R.id.videoView);

        Uri uri = Uri.parse(url);
        videoView.setVideoURI(uri);
        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {

            }
        });

        videoView.requestFocus();
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                videoView.start();
            }
        });


    }
}