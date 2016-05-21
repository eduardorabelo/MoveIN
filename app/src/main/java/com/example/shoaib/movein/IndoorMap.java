package com.example.shoaib.movein;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class IndoorMap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MyView(this));     }
}
