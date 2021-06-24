package com.example.fyp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

    public class QuizHelper extends SQLiteOpenHelper {

        private Context context;
        private static final String DB_NAME = "TQuiz.db";

        //If you want to add more questions or wanna update table values
        //or any kind of modification in db just increment version no.
        private static final int DB_VERSION = 3;
        //Table name
        private static final String TABLE_NAME = "TQ";
        //Id of question
        private static final String UID = "_UID";
        //Question
        private static final String QUESTION = "QUESTION";
        //Option A
        private static final String OPTA = "OPTA";
        //Option B
        private static final String OPTB = "OPTB";
        //Option C
        private static final String OPTC = "OPTC";
        //Option D
        private static final String OPTD = "OPTD";
        //Answer
        private static final String ANSWER = "ANSWER";
        //So basically we are now creating table with first column-id , sec column-question , third column -option A, fourth column -option B , Fifth column -option C , sixth column -option D , seventh column - answer(i.e ans of  question)
        private static final String CREATE_TABLE = "CREATE TABLE " + TABLE_NAME + " ( " + UID + " INTEGER PRIMARY KEY AUTOINCREMENT , " + QUESTION + " VARCHAR(255), " + OPTA + " VARCHAR(255), " + OPTB + " VARCHAR(255), " + OPTC + " VARCHAR(255), " + OPTD + " VARCHAR(255), " + ANSWER + " VARCHAR(255));";
        //Drop table query
        private static final String DROP_TABLE = "DROP TABLE IF EXISTS " + TABLE_NAME;

        QuizHelper(Context context) {
            super(context, DB_NAME, null, DB_VERSION);
            this.context = context;
        }

        @Override
        public void onCreate(SQLiteDatabase sqLiteDatabase) {
            //OnCreate is called only once
            sqLiteDatabase.execSQL(CREATE_TABLE);
        }

        @Override
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
            //OnUpgrade is called when ever we upgrade or increment our database version no
            sqLiteDatabase.execSQL(DROP_TABLE);
            clearDatabase("TQuiz");
            onCreate(sqLiteDatabase);
        }

        void allQuestion() {
            ArrayList<PlayAgainActivity.Question> arraylist = new ArrayList<>();
            arraylist.add(new PlayAgainActivity.Question("如果你在面對一些困難的處境時（例如：親友離世、考試在即、適應新環境）出現暴躁、反叛、易哭或情緒波動等情況，並持續影響到日常生活， 你應該有什麼行動?", "用暴力發洩不滿", "尋求輔導或其他相關專業的意見", "逃避問題", "自我放縱", "尋求輔導或其他相關專業的意見"));
            arraylist.add(new PlayAgainActivity.Question("以下那個選擇能區分「情緒低落」和「抑鬱症」", "不會關心別人", "負面情緒無論有多傷痛，都會隨著時間而淡化", "對周遭事物失去興趣", "人際關係差", "負面情緒無論有多傷痛，都會隨著時間而淡化"));
            arraylist.add(new PlayAgainActivity.Question("以下那個選擇不是抑鬱症的徵狀?", "長期且持續地情緒低落、悶悶不樂或煩躁", "未必能感受到其他人對自己的關心及重視", "認為生活沒有意義", "被人責備時感到不快", "被人責備時感到不快"));
            arraylist.add(new PlayAgainActivity.Question("以下那個選擇是焦慮症的徵狀?", "重覆地想着可能出現的負面結果和威脅", "和家人關係不佳", "生活中不會感到壓力", "學習出現困難", "重覆地想着可能出現的負面結果和威脅"));
            arraylist.add(new PlayAgainActivity.Question("以下那個選擇不能反映抑鬱症如何影響學生的學校表現?", "記憶力及集中力下降等原因難以 完成學習的項目", "容易專注課堂學習或活動", "會懷疑自己的學習能力", "在學校和同學容易產生磨擦", "容易專注課堂學習或活動"));
            this.addAllQuestions(arraylist);

        }
        public void clearDatabase(String TABLE_NAME) {
            SQLiteDatabase db = this.getWritableDatabase();
            String clearDBQuery = "DELETE FROM "+TABLE_NAME;
            db.execSQL(clearDBQuery);
        }

        private void addAllQuestions(ArrayList<PlayAgainActivity.Question> allQuestions) {
            SQLiteDatabase db = this.getWritableDatabase();
            db.beginTransaction();
            try {
                ContentValues values = new ContentValues();
                for (PlayAgainActivity.Question question : allQuestions) {
                    values.put(QUESTION, question.getQuestion());
                    values.put(OPTA, question.getOptA());
                    values.put(OPTB, question.getOptB());
                    values.put(OPTC, question.getOptC());
                    values.put(OPTD, question.getOptD());
                    values.put(ANSWER, question.getAnswer());
                    db.insert(TABLE_NAME, null, values);
                }
                db.setTransactionSuccessful();
            } finally {
                db.endTransaction();
                db.close();
            }
        }


        List<PlayAgainActivity.Question> getAllOfTheQuestions() {

            List<PlayAgainActivity.Question> questionsList = new ArrayList<>();
            SQLiteDatabase db = this.getWritableDatabase();
            db.beginTransaction();
            String coloumn[] = {UID, QUESTION, OPTA, OPTB, OPTC, OPTD, ANSWER};
            Cursor cursor = db.query(TABLE_NAME, coloumn, null, null, null, null, null);


            while (cursor.moveToNext()) {
                PlayAgainActivity.Question question = new PlayAgainActivity.Question();
                question.setId(cursor.getInt(0));
                question.setQuestion(cursor.getString(1));
                question.setOptA(cursor.getString(2));
                question.setOptB(cursor.getString(3));
                question.setOptC(cursor.getString(4));
                question.setOptD(cursor.getString(5));
                question.setAnswer(cursor.getString(6));
                questionsList.add(question);
            }

            db.setTransactionSuccessful();
            db.endTransaction();
            cursor.close();
            db.close();
            return questionsList;
        }
    }

