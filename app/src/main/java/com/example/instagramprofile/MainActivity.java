package com.example.instagramprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    photos picc;
    int[] profiles={R.drawable.ppp,R.drawable.sfds,R.drawable.ppp,R.drawable.sfds,
            R.drawable.ppp,R.drawable.flower,R.drawable.flag,R.drawable.sfds};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView=findViewById(R.id.gridview);
        picc=new photos(MainActivity.this,profiles);
        gridView.setAdapter(picc);
    }
}