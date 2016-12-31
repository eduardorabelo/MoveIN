package com.example.shoaib.movein;

/**
 * Created by shoai on 31/12/2016.
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


public class SetViewDemo extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




        setContentView(new DemoView(this));

    }







}
