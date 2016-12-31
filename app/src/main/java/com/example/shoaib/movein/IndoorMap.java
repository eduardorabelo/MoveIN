package com.example.shoaib.movein;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IndoorMap extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indoor_map);
        Button f1= (Button) findViewById(R.id.floor1);
        Button f2 = (Button) findViewById(R.id.floor2);
        Button f3 = (Button) findViewById(R.id.floor3);
        Button f4 = (Button) findViewById(R.id.demomap);


        f1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(IndoorMap.this, SetView.class);
                i.putExtra("floor1",1);
                startActivity(i);


            }
        });

        f2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(IndoorMap.this, SetView1.class);
                i.putExtra("floor2",2);
                startActivity(i);
            }
        });

        f3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(IndoorMap.this, SetView2.class);
                i.putExtra("floor3",3);
                startActivity(i);
            }
        });


        f4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(IndoorMap.this, SetViewDemo.class);
                i.putExtra("demomap",3);
                startActivity(i);
            }
        });


    }
}
