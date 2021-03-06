package com.example.stirdiary;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DcText extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.diary_creation_text);
        //下一步按钮事件绑定
        Button btn_for_continue_to_choose_stirway;
        btn_for_continue_to_choose_stirway = findViewById(R.id.creatingAddText_nextbtn);
        btn_for_continue_to_choose_stirway.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it_for_choose_stirway = new Intent(DcText.this, DcChooseWay.class);
                startActivity(it_for_choose_stirway);
                finish();
            }
        });
    }
}
