package com.example.shoaib.drawing;

/**
 * Created by shoai on 22/05/2016.
 */

import java.util.ArrayList;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class Editor extends View implements View.OnTouchListener{
    private Paint p,p1,p2,p3;
    public int x1;
    public int y1;
    public int x2;
    public int y2;
    public int name_x1;
    public int name_x2;
    public String room_name="";

    private ArrayList<Rect> rectangles = new ArrayList<Rect>();

    public Editor(Context context, AttributeSet aSet) {
        super(context, aSet);
        p = new Paint();
        p1= new Paint();
        p2= new Paint();
        p3= new Paint();
    }

    public void getvalues(int a, int b, int c, int d,int name1,int name2,String rname)
    {

        x1=a;
        y1=b;
        x2=c;
        y2=d;
        name_x1=name1;
        name_x2=name2;
        room_name=rname;

    }
    @Override
    synchronized  public void onDraw(Canvas canvas) {

        p.setStyle(Paint.Style.STROKE);
        p.setAlpha(200);
        p.setColor(Color.CYAN);
        p.setStrokeWidth(15);
        p1.setColor(Color.BLUE);
        p1.setAlpha(200);
        p1.setStrokeWidth(10);
        p1.setStyle(Paint.Style.STROKE);
        p2.setColor(Color.BLACK);
        p2.setAlpha(200);
        p2.setStrokeWidth(10);
        p2.setStyle(Paint.Style.STROKE);
        p3.setColor(Color.BLACK);
        p3.setAlpha(200);
        p3.setStrokeWidth(0);
        p3.setStyle(Paint.Style.STROKE);
        p3.setTextSize(30);




        canvas.drawRect(0, 0, getWidth() - 10, getHeight() - 10, p);
        rectangles.add(new Rect(x1, y1, x2, y2));

        for (Rect rect:rectangles) {
            canvas.drawRect(rect, p1);
            canvas.drawText(room_name, x1 + 30, y1 + 30, p3);

        }
    }

    @Override
    public void onDrawForeground(Canvas canvas) {
//        super.onDrawForeground(canvas);
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:

                Toast toast = Toast.makeText(getContext(),"Hello",Toast.LENGTH_LONG);
                toast.show();
                break;
            case MotionEvent.ACTION_MOVE:
                Toast toast1 = Toast.makeText(getContext(),"Hello",Toast.LENGTH_LONG);
                toast1.show();
                break;
            case MotionEvent.ACTION_UP:
                Toast toast2 = Toast.makeText(getContext(),"Hello",Toast.LENGTH_LONG);
                toast2.show();
                break;
        }
        return true;
    }
}
