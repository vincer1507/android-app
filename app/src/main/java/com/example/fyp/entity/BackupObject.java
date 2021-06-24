package com.example.fyp.entity;

import java.util.ArrayList;
import java.util.Date;


public class BackupObject {
    private Date created_on;
    private ArrayList<Diary> diary;

    public Date getCreated_on() {
        return created_on;
    }

    public void setCreated_on(Date created_on) {
        this.created_on = created_on;
    }

    public ArrayList<Diary> getDiary() {
        return diary;
    }

    public void setDiary(ArrayList<Diary> diary) {
        this.diary = diary;
    }
}
