package com.example.fyp;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class PlayAgainActivity extends Activity {

    Button playAgain;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_again);
       //Initialize
        playAgain = (Button) findViewById(R.id.playAgainButton);


        //play again button onclick listener
        playAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), QuizGameStartPageActivity.class);
                startActivity(intent);
                finish();
            }
        });

        //Setting typefaces for textview and button - this will give stylish fonts on textview and button
        Typeface typeface = Typeface.createFromAsset(getAssets(),"fonts/shablagooital.ttf");
        playAgain.setTypeface(typeface);

    }

    @Override
    public void onBackPressed() {
        finish();
    }

    public static class Question extends Activity {
        private int id;
        private String question;
        private String opta;
        private String optb;
        private String optc;
        private String optd;
        private String answer;

        public Question(String q, String oa, String ob, String oc, String od, String ans) {

            question = q;
            opta = oa;
            optb = ob;
            optc = oc;
            optd = od;
            answer = ans;
        }

        public Question() {
            id = 0;
            question = "";
            opta = "";
            optb = "";
            optc = "";
            optd = "";
            answer = "";
        }

        public String getQuestion() {
            return question;
        }

        public String getOptA() {
            return opta;
        }

        public String getOptB() {
            return optb;
        }

        public String getOptC() {
            return optc;
        }

        public String getOptD() {
            return optd;
        }

        public String getAnswer() {
            return answer;
        }

        public void setId(int i) {
            id = i;
        }

        public void setQuestion(String q1) {
            question = q1;
        }

        public void setOptA(String o1) {
            opta = o1;
        }

        public void setOptB(String o2) {
            optb = o2;
        }

        public void setOptC(String o3) {
            optc = o3;
        }

        public void setOptD(String o4) {
            optd = o4;
        }

        public void setAnswer(String ans) {
            answer = ans;
        }


    }
}
