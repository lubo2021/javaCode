package com.lb.qqxiangce;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView[] imageViews=new ImageView[12];
    private int[] imagePaths=new int[]{
            R.mipmap.image1, R.mipmap.image2, R.mipmap.image3, R.mipmap.image4, R.mipmap.image5,
            R.mipmap.image6, R.mipmap.image7, R.mipmap.image8, R.mipmap.image9, R.mipmap.image10,
            R.mipmap.image11, R.mipmap.image12
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridLayout gridLayout=(GridLayout) findViewById(R.id.gridLayout);
        for(int i=0;i<imagePaths.length;i++){
            imageViews[i]=new ImageView(MainActivity.this);
            imageViews[i].setImageResource(imagePaths[i]);
            imageViews[i].setPadding(2,2,2,2);
            ViewGroup.LayoutParams params=new ViewGroup.LayoutParams(680,180);
            imageViews[i].setLayoutParams(params);
            gridLayout.addView(imageViews[i]);

        }


    }
}