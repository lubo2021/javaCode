package com.lb.zhuomiantaiqiu;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FrameLayout frameLayout=new FrameLayout(this);
        frameLayout.setBackgroundResource(R.mipmap.bg);
        setContentView(frameLayout);
        Button bt=new Button(this);
        bt.setText("开始游戏");
        bt.setTextSize(TypedValue.COMPLEX_UNIT_SP,18);
        bt.setTextColor(Color.rgb(17,85,114));
        bt.setBackgroundColor(Color.rgb(255,255,0));
        FrameLayout.LayoutParams params=new FrameLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        params.gravity= Gravity.CENTER;
        bt.setLayoutParams(params);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new AlertDialog.Builder(MainActivity.this).setTitle("系统提示")
                        .setMessage("游戏有风险，进入需谨慎，真的要进入吗？")
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Log.i("桌面台球", "进入游戏！");
                            }
                        })
                        .setNegativeButton("退出", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Log.i("桌面台球", "退出游戏！");
                                finish();
                            }
                        }).show();
            }
        });
        frameLayout.addView(bt.getRootView());
    }
}