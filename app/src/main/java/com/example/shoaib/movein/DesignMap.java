package com.example.shoaib.movein;


import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.shoaib.drawing.Editor;
//import com.example.gamedevjava.R;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.shoaib.drawing.Editor;

import org.w3c.dom.Text;

import java.util.HashMap;
import java.util.Map;

public class DesignMap extends Activity {


    private Handler frame = new Handler();
    Button b1;
    private static ProgressDialog pDialog12;
    private static String TAGs = DesignMap.class.getSimpleName();
    EditText e1,e2,e3,e4;
    Editor g1;

    Canvas canvas = new Canvas();
    String a,b,k,l,Myroom;
    int c,d,e,f;
    float myX,myY;
    String value1,value2,valuex,valuey;
    //Divide the frame by 1000 to calculate how many times per second the screen will update.
    private static final int FRAME_RATE = 20; //50 frames per second

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_design_map);

        pDialog12 = new ProgressDialog(this);
        pDialog12.setMessage("Please wait...");
        pDialog12.setCancelable(false);


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
                                final TextView x= (TextView) findViewById(R.id.x);
                                final TextView y= (TextView) findViewById(R.id.y);
                                myX = event.getX();
                                myY = event.getY();
                                c = (int) myX;
                                d = (int) myY;
                                valuex= Integer.toString(c);
                                valuey= Integer.toString(d);
                                e=200;
                                f=200;
                                String getx = String.valueOf(c);
                                String gety = String.valueOf(d);
                             //   x.setText(getx);
                              //  y.setText(gety);


                                /*===================================*/
                                /*Alertdialog Code*/


                                final AlertDialog.Builder alert = new AlertDialog.Builder(DesignMap.this);

                                LinearLayout l1= new LinearLayout(DesignMap.this);
                                l1.setOrientation(LinearLayout.VERTICAL);
                                final EditText input1 = new EditText(DesignMap.this);


                                final EditText input2 = new EditText(DesignMap.this);
                                final EditText name = new EditText(DesignMap.this);

                                final TextView w= (TextView) findViewById(R.id.w);

                                final TextView l= (TextView) findViewById(R.id.l);
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
                                   value1= input1.getText().toString().trim();
                                    value2= input2.getText().toString().trim();
                                        String name_string= name.getText().toString().trim();
                                        String value3= value1 + value2 + name_string;
                                      //  l.setText(value1);
                                      //  w.setText(value2);
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

                                        postNewComment123(DesignMap.this);

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

    public void postNewComment123(final Context context){

        showpDialog();

        final PostCommentResponseListener mPostCommentResponse123=new PostCommentResponseListener() {
            @Override
            public void requestStarted123()
            {

            }

            @Override
            public void requestCompleted123()
            {

                Toast.makeText(context,
                        "Congratulations Stored Successfully!!", Toast.LENGTH_LONG).show();



            }

            @Override
            public void requestEndedWithError123(VolleyError error) {

                Toast.makeText(getApplicationContext(),
                        error.getMessage(), Toast.LENGTH_SHORT).show();

            }
        };
        mPostCommentResponse123.requestStarted123();
        RequestQueue queue123 = Volley.newRequestQueue(context);
        StringRequest sr123 = new StringRequest(Request.Method.POST,"http://movein.azurewebsites.net/api/Mapping", new Response.Listener<String>()
        {
            @Override
            public void onResponse(String response) {
                mPostCommentResponse123.requestCompleted123();

                Log.d(TAGs, response.toString());

                hidepDialog();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                mPostCommentResponse123.requestEndedWithError123(error);

                VolleyLog.d(TAGs, "Error: " + error.getMessage());
                Toast.makeText(getApplicationContext(),
                        error.getMessage(), Toast.LENGTH_SHORT).show();

                hidepDialog();
            }
        }){
            @Override
            protected Map<String,String> getParams(){
                Map<String,String> params = new HashMap<String, String>();

                params.put("X_Coordinate",valuex);
                params.put("Y_Coordinate", valuey);
                params.put("Length", value1);
                params.put("Width", value2);

                return params;
            }

        };
        queue123.add(sr123);
    }

    public interface PostCommentResponseListener {
        public void requestStarted123();
        public void requestCompleted123();
        public void requestEndedWithError123(VolleyError error);
    }

    private static void showpDialog() {
        if (!pDialog12.isShowing())
            pDialog12.show();
    }
    private static void hidepDialog() {
        if (pDialog12.isShowing())
            pDialog12.dismiss();
    }
    public void showMessgae123(String title, String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
    }

    public void gotoindoormapoptions(View view)
    {
        Intent I= new Intent(DesignMap.this,IndoorMapOptions.class);
        startActivity(I);


    }

}