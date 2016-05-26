package com.example.shoaib.movein;

/**
 * Created by shoai on 24/05/2016.
 */

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

public class MyView1 extends View {

    Paint paint1;
    Paint paint2;
    Paint paint3;
    Paint paint4;
    Path path;

    public MyView1(Context context) {
        super(context);
        init();
    }

    public MyView1(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyView1(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private void init(){
        paint1 = new Paint();
        paint1.setColor(Color.CYAN);
        paint1.setStrokeWidth(10);
        paint1.setStyle(Paint.Style.STROKE);


        paint2 =new Paint();
        paint2.setColor(Color.BLUE);
        paint2.setStrokeWidth(10);
        paint2.setStyle(Paint.Style.STROKE);

        paint3 =new Paint();
        paint3.setColor(Color.GRAY);
        paint3.setStrokeWidth(10);
        paint3.setStyle(Paint.Style.STROKE);

        paint4 =new Paint();
        paint4.setColor(Color.BLACK);
        paint4.setStrokeWidth(5);
        paint4.setStyle(Paint.Style.STROKE);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        // TODO Auto-generated method stub
        super.onDraw(canvas);
        //rooms on left side
        //drawRect(left, top, right, bottom, paint)
        canvas.drawRect(150, 10, 1050, 1650, paint1);
        canvas.drawRect(180, 40, 480, 330, paint2);
        //   canvas.drawRect(180, 180, 480, 290, paint2);
        canvas.drawRect(180, 360, 480, 475, paint2);
        canvas.drawRect(180, 510, 480, 800, paint2);
        //   canvas.drawRect(180, 650, 480, 800, paint2);
        canvas.drawRect(180, 820, 480, 970, paint2);
        canvas.drawRect(180, 990, 480, 1100, paint2);
        canvas.drawRect(180, 1120, 480, 1230, paint2);
        canvas.drawRect(180, 1250, 480, 1360, paint2);

        canvas.drawRect(180, 1380, 480, 1630, paint2);
        //  canvas.drawRect(180, 1500, 480, 1630, paint2);

        //rooms on right side
        canvas.drawRect(720, 50, 1020, 160, paint2);
        canvas.drawRect(720, 180, 1020, 290, paint2);
        canvas.drawRect(720, 310, 1020, 460, paint2);
        canvas.drawRect(720, 480, 1020, 630, paint2);
        canvas.drawRect(720, 650, 1020, 800, paint2);
        canvas.drawRect(720, 990, 1020, 1070, paint2);
        canvas.drawRect(720, 1090, 1020, 1215, paint2);
        canvas.drawRect(720, 1230, 1020, 1340, paint2);

        canvas.drawRect(720, 1360, 1020, 1480, paint2);

        canvas.drawRect(720, 1500, 1020, 1630, paint2);
        canvas.drawRect(500, 1500, 700, 1630, paint2);

        //path in the centre
        canvas.drawLine(500, 20, 500, 1480, paint3);
        canvas.drawLine(700, 20, 700, 820, paint3);
        canvas.drawLine(700, 980, 700, 1480, paint3);
        canvas.drawLine(700, 980, 700, 1480, paint3);
        canvas.drawLine(700, 820, 1040, 820, paint3);
        canvas.drawLine(700, 970, 1040, 970, paint3);
        canvas.drawLine(500, 1480, 700, 1480, paint3);


        paint4.setTextSize(40);
        //for Naming the rooms on left side
        //  canvas.drawText("Reveal Lab", 200, 100, paint4);
        canvas.drawText(" Khyber II", 180, 180, paint4);
        canvas.drawText(" Control room", 200, 410, paint4);
        canvas.drawText(" Khyber I", 180, 650, paint4);
        //    canvas.drawText("Faculty Offices", 200, 730, paint4);
        canvas.drawText("Nascon Room ", 200, 900, paint4);
        canvas.drawText("Faculty Offices", 200, 1075, paint4);
        canvas.drawText("Faculty Offices", 200, 1185, paint4);
        canvas.drawText("Faculty Offices", 200, 1315, paint4);

        canvas.drawText("Rawal Lab", 200, 1500, paint4);


        //for Naming the rooms on left side
        canvas.drawText("Ladies Room", 750, 100, paint4);
        canvas.drawText("Men's Room", 750, 230, paint4);
        canvas.drawText("Room # 201", 750, 380, paint4);
        canvas.drawText("Room # 202", 750, 530, paint4);
        canvas.drawText("Room # 203", 750, 730, paint4);
        canvas.drawText("Exam room", 750, 1050, paint4);
        canvas.drawText("Academics", 750, 1170, paint4);
        canvas.drawText("Faculty", 750, 1290, paint4);
        canvas.drawText("Room # 210", 750, 1450, paint4);
        canvas.drawText("Room # 211", 750, 1590, paint4);
        canvas.drawText("Faculty", 510, 1590, paint4);
        canvas.drawText("room", 510, 1620, paint4);
        canvas.drawCircle(740,900,15,paint2);

        //for naming 3rd floor on path
        canvas.drawText(" 2nd ", 550, 50,  paint4);
        canvas.drawText(" Floor ", 530, 100,  paint4);
        canvas.drawText(" 2nd Floor ", 850, 900,  paint4);
        canvas.drawText(" 2nd ", 550, 1420,  paint4);
        canvas.drawText(" Floor ", 530, 1450,  paint4);
        //drawRect(left, top, right, bottom, paint)

    }

}