package com.example.stirdiary;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;
import java.util.List;

public class OwnDiary extends AppCompatActivity {
    private LinearLayout container;

    public void addWine() {
        String imgsrc;
        final String contentsrc;
        DiaryFileHelper mDFH = new DiaryFileHelper(getApplicationContext());
        List<Diary> Dlist = null;
        int temp;
        try {
            Dlist = mDFH.readDiaryListFromFile("diary_list_storage");
        } catch (IOException e) {
            e.printStackTrace();
        }
        contentsrc = "test";
        int num = Dlist.size();
        temp = Math.min(num, 3);
        num -= 3;
        for (int i = 0; i < temp; i++) {
            final Diary Diarytemp = Dlist.get(i);
            String name = getApplicationContext().getFilesDir().getPath() + Diarytemp.getDiary_title();
            container = findViewById(R.id.container1);
            ImageView child = new ImageView(this);
            child.setImageResource(R.drawable.ic_glass1);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(400, 200);
            params.setMargins(5, 0, 5, 0);
            child.setLayoutParams(params);
            child.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent it = new Intent(OwnDiary.this, DiaryReading.class);
                    it.putExtra("file", Diarytemp);
                    startActivity(it);
                }
            });
            container.addView(child);
        }
        temp = Math.min(num, 3);
        num -= 3;
        for (int i = 0; i < temp; i++) {
            final Diary Diarytemp = Dlist.get(i + 3);
            String name = getApplicationContext().getFilesDir().getPath() + Diarytemp.getDiary_title();
            container = findViewById(R.id.container2);
            ImageView child = new ImageView(this);
            child.setImageResource(R.drawable.ic_glass1);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(400, 200);
            params.setMargins(5, 0, 5, 0);
            child.setLayoutParams(params);
            child.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent it = new Intent(OwnDiary.this, DiaryReading.class);
                    it.putExtra("file", Diarytemp);
                    startActivity(it);
                }
            });
            container.addView(child);
        }
        temp = Math.min(num, 3);
        num -= 3;
        for (int i = 0; i < temp; i++) {
            final Diary Diarytemp = Dlist.get(i + 6);
            String name = getApplicationContext().getFilesDir().getPath() + Diarytemp.getDiary_title();
            container = findViewById(R.id.container3);
            ImageView child = new ImageView(this);
            child.setImageResource(R.drawable.ic_glass1);
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(400, 200);
            params.setMargins(5, 0, 5, 0);
            child.setLayoutParams(params);
            child.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent it = new Intent(OwnDiary.this, DiaryReading.class);
                    it.putExtra("file", Diarytemp);
                    startActivity(it);
                }
            });
            container.addView(child);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.own_diary_page);
        addWine();
    }
}
