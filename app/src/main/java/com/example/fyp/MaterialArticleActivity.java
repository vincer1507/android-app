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

public class MaterialArticleActivity extends AppCompatActivity {

//    String[] mobileArray = {"認識精神病-有關精神病的謬誤與事實","精神病的成因","甚麼是抑鬱症？","抑鬱症的成因",
  //          "甚麼是精神健康狀況？","我能做什麼來維持良好精神健康？"};
    String[] listviewTitle = new String[]{
        "認識精神病", "精神病的成因", "甚麼是抑鬱症", "抑鬱症的成因","甚麼是精神健康狀況","我能做什麼來維持良好精神健康",

    };


    int[] listviewImage = new int[]{
            R.drawable.article01, R.drawable.article02, R.drawable.article3, R.drawable.article4,R.drawable.article05,R.drawable.article06,

    };

    String[] listviewShortDescription = new String[]{
            "有關精神病的謬誤與事實", "精神病是疾病的一種，其成因涉及不同層面，包括生理、心理和社會因素等", "抑鬱症是一種精神疾病", "抑鬱症有很多种成因",
            "了解什麼是精神狀況","我能做什麼",
    };

    ListView list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material_article);
        list = findViewById(R.id.list_view);

        MyAdapter adapter = new MyAdapter (this,listviewTitle,listviewImage,listviewShortDescription);
        list.setAdapter(adapter);
    //    ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.activity_material_article_detail, mobileArray);

      // ListView listView = (ListView) findViewById(R.id.mobile_list);
        //listView.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch(position)
                {
                    case 0:
                        Intent newActivity1 = new Intent(getApplicationContext(), MaterialArticleDetailActivity.class);
                        newActivity1.putExtra("An", "認識精神病-有關精神病的謬誤與事實");
                        startActivity(newActivity1);
                        break;

                    case 1:
                        Intent newActivity2 = new Intent(getApplicationContext(), MaterialArticleDetailActivity.class);
                        newActivity2.putExtra("An","精神病的成因");
                        startActivity(newActivity2);
                    case 2:
                        Intent newActivity3 = new Intent(getApplicationContext(), MaterialArticleDetailActivity.class);
                        newActivity3.putExtra("An", "甚麼是抑鬱症？");
                        startActivity(newActivity3);
                    case 3:
                        Intent newActivity4 = new Intent(getApplicationContext(), MaterialArticleDetailActivity.class);
                        newActivity4.putExtra("An", "抑鬱症的成因");
                        startActivity(newActivity4);
                    case 4:
                        Intent newActivity5 = new Intent(getApplicationContext(), MaterialArticleDetailActivity.class);
                        newActivity5.putExtra("An", "甚麼是精神健康狀況？");
                        startActivity(newActivity5);
                    default:
                        Intent newActivity6 = new Intent(getApplicationContext(), MaterialArticleDetailActivity.class);
                        newActivity6.putExtra("An", "我能做什麼來維持良好精神健康？");
                        startActivity(newActivity6);
                }

            }
        });



    }
    class MyAdapter extends  ArrayAdapter<String>
    {
        Context context ;
        String listview_title[];
        String listview_discription[];
        int[] listview_image;

        MyAdapter(Context c ,String [] title , int[] imgs, String [] descriptions) {
            super(c,R.layout.articlelissviewlayout, R.id.listview_item_title,title);
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