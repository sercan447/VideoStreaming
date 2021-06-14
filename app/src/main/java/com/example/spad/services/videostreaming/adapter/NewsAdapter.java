package com.example.spad.services.videostreaming.adapter;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.spad.services.videostreaming.DetailActivity;
import com.example.spad.services.videostreaming.Model.Data;
import com.example.spad.services.videostreaming.R;

import java.text.Normalizer;
import java.util.List;
import java.util.Locale;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.MyViewHolder> {

    private Context context;
    private List<Data> movieList;

    public NewsAdapter(){

    }
    public NewsAdapter(Context context,List<Data> movieList){
        this.context = context;
        this.movieList = movieList;
    }


    public void setMovieList(List<Data> movieList) {
        this.movieList = movieList;
    }


    @NonNull
    @Override
    public NewsAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.recycler_row,parent,false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NewsAdapter.MyViewHolder holder, int position) {

        Locale trlocale= new Locale("tr");

        String val = this.movieList.get(0).getItemList().get(position).getTitle().toLowerCase(trlocale);
        String a = Normalizer.normalize(val, Normalizer.Form.NFD).replaceAll("\\p{Mn}", "");

       // holder.tvTitle.setText(a);


        Glide.with(context)
                .load(this.movieList.get(0).getItemList().get(position).getImageUrl())
                .apply(RequestOptions.centerCropTransform())
                .into(holder.imageView);

        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                context.startActivity(new Intent(context, DetailActivity.class));
            }
        });

    }

    @Override
    public int getItemCount() {
        if(this.movieList != null){
           return this.movieList.get(0).getItemList().size();// return this.movieList.size();
        }
        return 0;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tvTitle;
        ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            tvTitle = itemView.findViewById(R.id.titleView);
            imageView = itemView.findViewById(R.id.imageView);


        }
    }
}
