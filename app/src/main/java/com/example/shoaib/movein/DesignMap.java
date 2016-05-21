package com.example.shoaib.movein;


import com.example.shoaib.drawing.Editor;
//import com.example.gamedevjava.R;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.shoaib.drawing.Editor;

public class DesignMap extends Activity {


    private Handler frame = new Handler();
    Button b1;
    EditText e1,e2,e3,e4;
    Editor g1;
    Canvas canvas = new Canvas();
    String a,b,k,l,Myroom;
    int c,d,e,f;
    float myX,myY;
    //Divide the frame by 1000 to calculate how many times per second the screen will update.
    private static final int FRAME_RATE = 20; //50 frames per second

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_design_map);
        final     Handler h = new Handler();
        b1 = (Button) findViewById(R.id.the_button);


        b1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(getApplicationContext(), "Now tap where you want to draw bro ", Toast.LENGTH_LONG).show();

                //    a= e1.getText().toString();
                //   b= e2.getText().toString();
                //   k= e3.getText().toString();
                //  l= e4.getText().toString();

                //    c= Integer.parseInt(a);
                //   d= Integer.parseInt(b);
                //    e= Integer.parseInt(k);
                //   f= Integer.parseInt(l);


                g1 = (Editor) findViewById(R.id.the_canvas);
                g1.setOnTouchListener(new View.OnTouchListener() {
                    @Override
                    public boolean onTouch(View v, MotionEvent event) {
                        switch (event.getAction()) {
                            case MotionEvent.ACTION_DOWN:
                                myX = event.getX();
                                myY = event.getY();
                                c = (int) myX;
                                d = (int) myY;
                                e=200;
                                f=200;


                                /*===================================*/
                                /*Alertdialog Code*/


                                final AlertDialog.Builder alert = new AlertDialog.Builder(DesignMap.this);

                                LinearLayout l1= new LinearLayout(DesignMap.this);
                                l1.setOrientation(LinearLayout.VERTICAL);
                                final EditText input1 = new EditText(DesignMap.this);


                                final EditText input2 = new EditText(DesignMap.this);
                                final EditText name = new EditText(DesignMap.this);
                                input1.setHint("Length");
                                input2.setHint("Width");
                                name.setHint("Name");
                                l1.addView(input1);
                                l1.addView(input2);
                                l1.addView(name);
                                alert.setView(l1);

                                alert.setTitle("AlertDialog!");
                                alert.setMessage("Enter Length and Width Values ");

                                alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog, int whichButton) {
                                        String value1= input1.getText().toString().trim();
                                        String value2= input2.getText().toString().trim();
                                        String name_string= name.getText().toString().trim();
                                        String value3= value1 + value2 + name_string;

                                        e= Integer.parseInt(value1);
                                        f= Integer.parseInt(value2);
                                        Myroom=name_string;

                                        if (e<c || f<d)
                                        {

                                            Toast.makeText(getApplicationContext(), "Sorry values out of bound. Try again please", Toast.LENGTH_LONG).show();

                                        }

                                        else {
                                            Toast.makeText(getApplicationContext(), value3, Toast.LENGTH_SHORT).show();
                                            h.postDelayed(new Runnable() {
                                                @Override
                                                public void run() {
                                                    initGfx();
                                                }
                                            }, 1000);
                                        }
                                    }
                                });
                                alert.setNegativeButton("Cancel",
                                        new DialogInterface.OnClickListener()
                                        {
                                            public void onClick(DialogInterface dialog, int whichButton)
                                            {
                                                dialog.cancel();
                                            }
                                        });
                                alert.create();
                                alert.show();

                                /*Alertdialog Code*/
                                /*================================*/
                                // Toast toast = Toast.makeText(getApplicationContext(), "Hello" + " " + myX + " " + myY, Toast.LENGTH_SHORT);
                                // toast.show();









                                break;

                        }

                        return true;
                    }
                });

                //    initGfx();
                //   g1.onDrawForeground(canvas);
            }
        });
    }
    synchronized public void initGfx() {
        g1 = (Editor) findViewById(R.id.the_canvas);
        frame.removeCallbacks(frameUpdate);
        frame.postDelayed(frameUpdate, FRAME_RATE);
    }

    private Runnable frameUpdate = new Runnable() {
        @Override
        synchronized public void run() {
            frame.removeCallbacks(frameUpdate);
            ((Editor) findViewById(R.id.the_canvas)).invalidate();
            g1.invalidate();
    /*        g1.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View v, MotionEvent event) {
                    switch (event.getAction()) {
                        case MotionEvent.ACTION_DOWN:
                            myX= event.getX();
                            myY=event.getY();
                            Toast toast = Toast.makeText(getApplicationContext(),"Hello"+" "+ myX+" "+myY ,Toast.LENGTH_SHORT);
                            toast.show();
                            break;
                        case MotionEvent.ACTION_MOVE:
                            myX= event.getX();
                            myY=event.getY();
                            Toast toast1 = Toast.makeText(getApplicationContext(),"Hello"+" "+ myX+" "+myY,Toast.LENGTH_SHORT);
                            toast1.show();
                            break;
                        case MotionEvent.ACTION_UP:
                            myX= event.getX();
                            myY=event.getY();
                            Toast toast2 = Toast.makeText(getApplicationContext(),"Hello"+" "+ myX+" "+myY,Toast.LENGTH_SHORT);
                            toast2.show();
                            break;
                    }

                    return true;
                }
            });*/
            g1.getvalues(c, d, e, f,1,2,Myroom);

            frame.postDelayed(frameUpdate, FRAME_RATE);
        }
    };

}