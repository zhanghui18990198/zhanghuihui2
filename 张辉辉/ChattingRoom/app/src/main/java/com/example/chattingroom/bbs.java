package com.example.chattingroom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.format.DateUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

import com.example.chattingroom.util.DateUtil;

public class bbs extends AppCompatActivity implements View.OnClickListener,View.OnLongClickListener {
    private TextView tv_bbs;
    private TextView tv_chattingroom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bbs);

        tv_chattingroom = findViewById(R.id.tv_chattingroom);
        tv_chattingroom.setOnClickListener(this);
        tv_chattingroom.setOnLongClickListener(this);
        tv_bbs = findViewById(R.id.tv_bbs);
        tv_bbs.setOnClickListener(this);
        tv_bbs.setOnLongClickListener(this);
        tv_bbs.setMovementMethod(new ScrollingMovementMethod());
    }

    private String[] mChatStr = {"今天和喜欢的人说话了吗？","今天的心情怎么样？","今天的工作怎么样？","晚上一起看电影啊！","智能手机的作业写完了吗？",};

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.tv_chattingroom || v.getId() == R.id.tv_bbs) {
            int random = (int) (Math.random() *10) %5;
            String newStr = String.format("%s\n%s %s",
                    tv_bbs.getText().toString(), DateUtil.getNowTime(),mChatStr[random]);
            tv_bbs.setText(newStr);
        }
    }

    @Override
    public boolean onLongClick(View v) {
        return false;
    }
}