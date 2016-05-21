package com.example.shoaib.movein;

/**
 * Created by shoai on 22/05/2016.
 */
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

public class MyView extends View {

    Paint paint1;
    Paint paint2;
    Paint paint3;
    Paint paint4;
    Path path;

    public MyView(Context context) {
        super(context);
        init();
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyView(Context context, AttributeSet attrs, int defStyle) {
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
        canvas.drawRect(180, 50, 480, 160, paint2);
        canvas.drawRect(180, 180, 480, 290, paint2);
        canvas.drawRect(180, 310, 480, 460, paint2);
        canvas.drawRect(180, 480, 480, 630, paint2);
        canvas.drawRect(180, 650, 480, 800, paint2);
        canvas.drawRect(180, 820, 480, 970, paint2);
        canvas.drawRect(180, 990, 480, 1140, paint2);
        canvas.drawRect(180, 1160, 480, 1310, paint2);
        canvas.drawRect(180, 1330, 480, 1480, paint2);
        canvas.drawRect(180, 1500, 480, 1630, paint2);

        //rooms on right side
        canvas.drawRect(720, 50, 1020, 160, paint2);
        canvas.drawRect(720, 180, 1020, 290, paint2);
        canvas.drawRect(720, 310, 1020, 460, paint2);
        canvas.drawRect(720, 480, 1020, 630, paint2);
        canvas.drawRect(720, 650, 1020, 800, paint2);
        canvas.drawRect(720, 990, 1020, 1140, paint2);
        canvas.drawRect(720, 1160, 1020, 1310, paint2);
        canvas.drawRect(720, 1330, 1020, 1480, paint2);
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
        canvas.drawText("Reveal Lab", 200, 100, paint4);
        canvas.drawText("TA's Office", 200, 230, paint4);
        canvas.drawText("Lab Instructors", 200, 380, paint4);
        canvas.drawText("Room # 305", 200, 530, paint4);
        canvas.drawText("Faculty Offices", 200, 730, paint4);
        canvas.drawText("Boys Common ", 200, 900, paint4);
        canvas.drawText("Room", 200, 950, paint4);
        canvas.drawText("Room # 316", 200, 1100, paint4);
        canvas.drawText("Room # 315", 200, 1280, paint4);
        canvas.drawText("Room # 314", 200, 1450, paint4);
        canvas.drawText("FYP Lab", 200, 1590, paint4);

        //for Naming the rooms on left side
        canvas.drawText("Ladies Room", 750, 100, paint4);
        canvas.drawText("Men's Room", 750, 230, paint4);
        canvas.drawText("Room # 301", 750, 380, paint4);
        canvas.drawText("Room # 302", 750, 530, paint4);
        canvas.drawText("Room # 303", 750, 730, paint4);
        canvas.drawText("Store", 750, 1100, paint4);
        canvas.drawText("Room # 310", 750, 1280, paint4);
        canvas.drawText("Room # 311", 750, 1450, paint4);
        canvas.drawText("Karakoram Lab", 730, 1590, paint4);
        canvas.drawText("Graduate", 510, 1590, paint4);
        canvas.drawText("Lab", 510, 1620, paint4);

        //for naming 3rd floor on path
        canvas.drawText(" 3rd ", 550, 50,  paint4);
        canvas.drawText(" Floor ", 530, 100,  paint4);
        canvas.drawText(" 3rd Floor ", 850, 900,  paint4);
        canvas.drawText(" 3rd ", 550, 1420,  paint4);
        canvas.drawText(" Floor ", 530, 1450,  paint4);
        //drawRect(left, top, right, bottom, paint)

    }

}