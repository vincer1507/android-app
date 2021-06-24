package com.example.fyp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MaterialYoutubeActivity extends AppCompatActivity {
    String[] listviewTitle = new String[]{
           "抑鬱你我齊面對 衞生署衞生防護中心","正面思維","如何界定情緒病與精神病?","醫生與你：抑鬱症"
    };
    int[] listviewImage = new int[]{
            R.drawable.youtubeimg01, R.drawable.youtubeimg02, R.drawable.youtubeimg03, R.drawable.youtubeimg04,
    };
    String[] listviewShortDescription = new String[]{
            "衞生署衞生防護中心, CHP, Department of Health, HKSARG", "Youth Can - 【正面思維】準備好未呀？ 我們出發喇！#懷有希望  #留意自己  #相信自己  #設定目標  #心存感恩", "本影片醫健資訊由專業人士義務提供, 如影片涉及任何疾病的診斷、治療或醫療建議，僅供參考用途，請諮詢您的醫生。", "維思維WeisWay - 憂鬱和憂鬱症是有區別的,我們日常生活中遇到不如意的時候，會感到不開心、沮喪～, 過幾天或問題解決後，我們心情又會回到了原本正常狀態這是屬於憂鬱的情緒。",
    };

    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_youtube);
/*
        YouTubePlayerView youTubePlayerView1 = findViewById(R.id.youtube_player_view1);
        getLifecycle().addObserver(youTubePlayerView1);
        youTubePlayerView1.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                String videoId = "drNZb2o3R14";
                youTubePlayer.loadVideo(videoId, 0);
            }
        });

    YouTubePlayerView youTubePlayerView2 = findViewById(R.id.youtube_player_view2);
        getLifecycle().addObserver(youTubePlayerView2);
        youTubePlayerView2.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                String videoId = "vuytsNJyLNg";
                youTubePlayer.loadVideo(videoId, 0);
            }
        });
        YouTubePlayerView youTubePlayerView3 = findViewById(R.id.youtube_player_view3);
        getLifecycle().addObserver(youTubePlayerView3);
        youTubePlayerView3.addYouTubePlayerListener(new AbstractYouTubePlayerListener() {
            @Override
            public void onReady(@NonNull YouTubePlayer youTubePlayer) {
                String videoId = "_5h71YyU0kg";
                youTubePlayer.loadVideo(videoId, 0);
            }
        });


*/

        list = findViewById(R.id.youtube_listview);
        MyAdapter adapter = new MyAdapter(this,listviewTitle,listviewImage,listviewShortDescription);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch(position)
                {
                    case 0:
                        Intent newActivity1 = new Intent(getApplicationContext(), MaterialYoutubeVideoActivity.class);
                        newActivity1.putExtra("An", "drNZb2o3R14");
                        startActivity(newActivity1);
                        break;
                    case 1:
                        Intent newActivity2 = new Intent(getApplicationContext(), MaterialYoutubeVideoActivity.class);
                        newActivity2.putExtra("An","vuytsNJyLNg");
                        startActivity(newActivity2);
                    case 2:
                        Intent newActivity3 = new Intent(getApplicationContext(), MaterialYoutubeVideoActivity.class);
                        newActivity3.putExtra("An", "DxAkqp62FbU");
                        startActivity(newActivity3);
                    default:
                        Intent newActivity4 = new Intent(getApplicationContext(), MaterialYoutubeVideoActivity.class);
                        newActivity4.putExtra("An", "uhy17n448qM");
                        startActivity(newActivity4);
                }

            }
        });


}
    class MyAdapter extends ArrayAdapter<String>
    {
        Context context ;
        String listview_title[];
        String listview_discription[];
        int[] listview_image;

        MyAdapter(Context c ,String [] title , int[] imgs, String [] descriptions) {
            super(c,R.layout.activityyoutubelist, R.id.listview_item_title,title);
            this.context = c;
            this.listview_image =imgs;
            this.listview_title = title;
            this.listview_discription =descriptions;

        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.articlelissviewlayout,parent,false);
            ImageView images = row.findViewById(R.id.listview_image);
            TextView myTitle = row.findViewById(R.id.listview_item_title);
            TextView myDesccisption = row.findViewById(R.id.listview_item_short_description);
            images.setImageResource(listview_image[position]);
            myTitle.setText(listview_title[position]);
            myDesccisption.setText(listview_discription[position]);
            return row;
        }
    }
}