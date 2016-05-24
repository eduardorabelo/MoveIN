package com.example.shoaib.movein;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by shoai on 24/05/2016.
 */
public class SetView1 extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




        setContentView(new MyView1(this));

    }







}

