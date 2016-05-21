package com.example.shoaib.movein;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IndoorMapOptions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indoor_map_options);
    }

    public void gotooutdoormap(View view)
    {

        Intent i= new Intent(IndoorMapOptions.this, MainActivity.class);
        startActivity(i);
    }

    public void gotoindoormap(View view)
    {

        Intent i= new Intent(IndoorMapOptions.this, IndoorMap.class);
        startActivity(i);

    }
    public void gotodesignmap(View view)
    {

        Intent i= new Intent(IndoorMapOptions.this, DesignMap.class);
        startActivity(i);

    }

}
