package com.example.sayhi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mBtnTextView;
    private Button mBtnButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnTextView=(Button) findViewById(R.id.btn_textview);
        mBtnTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //跳转到TextView界面
                Intent intent=new Intent(MainActivity.this,TextViewActivity.class);
                startActivity(intent);
            }
        });

        mBtnButton=(Button) findViewById(R.id.btn_button);
        mBtnTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public  void onClick(View v) {
                //跳转到Button界面
                Intent intent=new Intent(MainActivity.this,ButtonActivity.class);
                startActivity(intent);
            }
        });
    }
}
