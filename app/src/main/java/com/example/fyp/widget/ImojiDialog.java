package com.example.fyp.widget;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.GridView;


import androidx.annotation.NonNull;

import com.example.fyp.R;
import com.example.fyp.adapter.ImojiListAdapter;

import java.util.ArrayList;

import hani.momanii.supernova_emoji_library.emoji.Emojicon;

/**
 * Created by ThinkPad on 4/20/2017.
 */

public class ImojiDialog extends Dialog {
    private GridView grid;
    private ImojiListAdapter adapter;
    private Context context;
    private ImojiListener listener;
    private ArrayList<String> data;
    public ImojiDialog(@NonNull Context context) {
        super(context);
        this.context = context;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        setContentView(R.layout.view_imoji);

        grid = (GridView)findViewById(R.id.gridview);
        adapter = new ImojiListAdapter(this.context);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
               Emojicon emo  = (Emojicon)adapter.getItem(position);
                if(listener != null)
                    listener.onSelect(emo.getEmoji());

                dismiss();
            }
        });

    }

    public void setImojiListener(ImojiListener listener)
    {
        this.listener = listener;
    }

    public interface ImojiListener {
        public void onSelect(String result);
    }


}
