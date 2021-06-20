package com.example.spad.services.videostreaming;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.RelativeLayout;
import android.widget.VideoView;

import com.example.spad.services.videostreaming.Model.Data;
import com.example.spad.services.videostreaming.Model.Item;
import com.example.spad.services.videostreaming.Model.Model;
import com.example.spad.services.videostreaming.adapter.NewsAdapter;
import com.example.spad.services.videostreaming.viewmodel.NewsListViewModel;
import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.ExoPlayerFactory;
import com.google.android.exoplayer2.LoadControl;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.extractor.DefaultExtractorsFactory;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.source.ExtractorMediaSource;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter;
import com.google.android.exoplayer2.upstream.DefaultHttpDataSourceFactory;
import com.google.android.exoplayer2.util.Util;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    String url = "https://turkmedya-live.ercdn.net/tv24/tv24.m3u8";
    VideoView videoView;
    PlayerView playerView;
    SimpleExoPlayer simpleExoPlayer;
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

        //videoView = findViewById(R.id.videoView);
        playerView = findViewById(R.id.videoView);


        Uri uri = Uri.parse(url);

        LoadControl loadControl = new DefaultLoadControl();
        BandwidthMeter bandwidthMeter = new DefaultBandwidthMeter();
        TrackSelector trackSelector = new DefaultTrackSelector(new AdaptiveTrackSelection.Factory(bandwidthMeter));

        simpleExoPlayer = ExoPlayerFactory.newSimpleInstance(MainActivity.this,trackSelector,loadControl);


        //extractor media source kullanımı canlı akışlarda kullanılmamaktadır.
            //MediaSource mediaSource = new ExtractorMediaSource(uri,factory,extractorsFactory,null,null);
            //DefaultHttpDataSourceFactory factory = new DefaultHttpDataSourceFactory("exoplayer_video");
            //ExtractorsFactory extractorsFactory = new DefaultExtractorsFactory();


        Handler mHandler = new Handler();
        String userAgent = Util.getUserAgent(this, "24 TV");
        DataSource.Factory dataSourceFactory = new DefaultHttpDataSourceFactory(
                userAgent, null,
               100000,
                1800000,
                true);

        //CANLI AKIŞLAR İÇİN HSL DATA SOURCE KULLANILMASI GEREKMEKTEDİR.
        HlsMediaSource mediaSource = new HlsMediaSource(uri,dataSourceFactory, 1800000,mHandler, null);

        playerView.setPlayer(simpleExoPlayer);
        playerView.setKeepScreenOn(true);
        simpleExoPlayer.prepare(mediaSource);
        simpleExoPlayer.setPlayWhenReady(true);
        simpleExoPlayer.addListener(new Player.EventListener() {
            @Override
            public void onTimelineChanged(Timeline timeline, Object manifest, int reason) {

            }

            @Override
            public void onTracksChanged(TrackGroupArray trackGroups, TrackSelectionArray trackSelections) {

            }

            @Override
            public void onLoadingChanged(boolean isLoading) {

            }

            @Override
            public void onPlayerStateChanged(boolean playWhenReady, int playbackState) {

            }

            @Override
            public void onRepeatModeChanged(int repeatMode) {

            }

            @Override
            public void onShuffleModeEnabledChanged(boolean shuffleModeEnabled) {

            }

            @Override
            public void onPlayerError(ExoPlaybackException error) {

                switch (error.type) {
                    case ExoPlaybackException.TYPE_SOURCE:
                            Log.e("TAG", "TYPE_SOURCE: " + error.getSourceException().getMessage());
                        break;

                    case ExoPlaybackException.TYPE_RENDERER:
                        Log.e("TAG", "TYPE_RENDERER: " + error.getRendererException().getMessage());
                        break;

                    case ExoPlaybackException.TYPE_UNEXPECTED:
                        Log.e("TAG", "TYPE_UNEXPECTED: " + error.getUnexpectedException().getMessage());
                        break;
                }

            }

            @Override
            public void onPositionDiscontinuity(int reason) {

            }

            @Override
            public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {

            }

            @Override
            public void onSeekProcessed() {

            }
        });



        //setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        //setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

       // videoView.setVideoURI(uri);
        /*
        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {

                Log.e("secan","veri 4");

            }
        });
        */

        /*
        videoView.requestFocus();
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mp) {
                videoView.start();
                Log.e("secan","veri 5");
            }
        });
*/

        //android 7 ve 9 versiyonlar için mediacontroller çalışmak da
        // android 11 için mediaController ile play ve stop durumları calısmamaktadır.
        /*
        MediaController mediaController =new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        */

    }//oncreate
}