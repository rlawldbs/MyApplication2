package com.example.administrator.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }

    public void on(View view) { // 전화번호추가
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
    }

    public void cl(View view) { // 프로필
        Intent intent = new Intent(this, Main4Activity.class);
        startActivity(intent);
    }

    public void ic(View view) {// 통화
        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);
    }

    public void ck(View view) {// 연락처
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
}
