package com.example.fyp;

import androidx.appcompat.app.AppCompatActivity;


import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;




public class RatingActivtiy extends AppCompatActivity {
  RatingBar ratingBar;
  double sum;
  int counter;
  float ratingBuffer;
  Button btn_ok;
  Button btn_quit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_rating);
        ratingBar = findViewById(R.id.rating);
        btn_ok = findViewById(R.id.btnOk);
        btn_quit = findViewById(R.id.btnCancel);
        ratingBar.setRating(load());
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                ratingBuffer = rating;
                sum += rating;
                counter++;
                Log.e("Check", "This is rating." + ratingBuffer );

            }
        });

        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                save(ratingBuffer);
                Toast toast= Toast.makeText(getApplicationContext(), "Your mood index today is "+ ratingBuffer +" \n\n\n"+" Your mood index this week is " + countAver(), Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER,0,0);
                toast.show();

                ratingBuffer=0;
                finish();
            }
        });

        btn_quit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
    public void save(float f)
    {
        SharedPreferences sharedPreferences = getSharedPreferences("floder",MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putFloat("rating", f);
        sum += f;
        counter++;
        editor.commit();
    }

    public float load()
    {
        SharedPreferences sharedPreferences = getSharedPreferences("floder",MODE_PRIVATE);
        float f = sharedPreferences.getFloat("rating",0f);
        return  f;
    }

    public double countAver() {

        double aver = sum / counter;

        return aver;
    }

}