package com.wpf.photoalbum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;

public class photoActivity extends AppCompatActivity {
    private ImageView[] img=new ImageView[3];
    private int[] imagePath=new int[]{
            R.mipmap.img01,R.mipmap.img02,R.mipmap.img03

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.photoactivity_main);
        GridLayout layout =(GridLayout) findViewById(R.id.layout);
        for(int i=0;i<imagePath.length;i++){
            img[i]=new ImageView(photoActivity.this);
            img[i].setImageResource(imagePath[i]);
            img[i].setPadding(2,2,2,2);
            ViewGroup.LayoutParams params =new ViewGroup.LayoutParams(50,68);
            img[i].setLayoutParams(params);
            layout.addView(img[i]);
        }
    }
}
