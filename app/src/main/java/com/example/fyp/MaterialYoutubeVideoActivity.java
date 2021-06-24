package com.example.fyp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener;
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView;

public class MaterialYoutubeVideoActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_youtube_video);

        Intent intent = getIntent();
        String articleName = intent.getStringExtra("An");
        TextView article = findViewById(R.id.label);

        switch (articleName) {
            case "drNZb2o3R14":
                YouTubePlayerView youTubePlayerView = findViewById(R.id.youtube_player_view);
                getLifecycle().addObserver(youTubePlayerView);
                youTubePlayerView.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "drNZb2o3R14";
                        youTubePlayer.loadVideo(videoId, 0);
                    }
                });
                break;
            case "vuytsNJyLNg":
                YouTubePlayerView youTubePlayerView1 = findViewById(R.id.youtube_player_view);
                getLifecycle().addObserver(youTubePlayerView1);
                youTubePlayerView1.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "vuytsNJyLNg";
                        youTubePlayer.loadVideo(videoId, 0);
                    }
                });
                break;
            case "DxAkqp62FbU？":
                YouTubePlayerView youTubePlayerView2 = findViewById(R.id.youtube_player_view);
                getLifecycle().addObserver(youTubePlayerView2);
                youTubePlayerView2.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "DxAkqp62FbU";
                        youTubePlayer.loadVideo(videoId, 0);
                    }
                });
                break;
            case"uhy17n448qM":
                YouTubePlayerView youTubePlayerView3 = findViewById(R.id.youtube_player_view);
                getLifecycle().addObserver(youTubePlayerView3);
                youTubePlayerView3.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
                    @Override
                    public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                        String videoId = "uhy17n448qM";
                        youTubePlayer.loadVideo(videoId, 0);
                    }
                });
                break;
            default:

        }
    }
}
