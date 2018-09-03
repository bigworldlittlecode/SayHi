package com.example.sayhi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class TextViewActivity extends AppCompatActivity {
    private TextView mTv1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
        mTv1=(TextView)findViewById(R.id.tv_1);
        mTv1.setText(Html.fromHtml("<u>恭喜二等奖<／u>"));
    }
}
