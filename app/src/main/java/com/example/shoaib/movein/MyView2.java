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

public class MyView2 extends View {

    Paint paint1;
    Paint paint2;
    Paint paint3;
    Paint paint4;
    Path path;

    public MyView2(Context context) {
        super(context);
        init();
    }

    public MyView2(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public MyView2(Context context, AttributeSet attrs, int defStyle) {
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
        canvas.drawRect(150, 10, 1050, 1800, paint1);
        canvas.drawRect(180, 50, 480, 290, paint2);
        canvas.drawRect(180, 310, 480, 460, paint2);
        canvas.drawRect(180, 480, 480, 630, paint2);
        canvas.drawRect(180, 650, 480, 800, paint2);
        canvas.drawRect(180, 1040, 480, 1190, paint2);
        canvas.drawRect(180, 1210, 480, 1360, paint2);
        canvas.drawRect(180, 1380, 480, 1530, paint2);
        canvas.drawRect(180, 1550, 1020, 1750, paint2);

        //rooms on right side
        canvas.drawRect(720, 50, 1020, 250, paint2);
        canvas.drawRect(720, 270, 1020, 460, paint2);
        canvas.drawRect(720, 480, 1020, 630, paint2);
        canvas.drawRect(720, 650, 1020, 800, paint2);
        canvas.drawRect(720, 1040, 1020, 1240, paint2);
        canvas.drawRect(720, 1260, 1020, 1385, paint2);
        canvas.drawRect(720, 1405, 1020, 1530, paint2);

        //path in the centre
        canvas.drawLine(500, 20, 500, 820, paint3);
        canvas.drawLine(500, 1020, 500, 1530, paint3);
        canvas.drawLine(700, 20, 700, 820, paint3);
        canvas.drawLine(700, 1020, 700, 1530, paint3);
        canvas.drawLine(700, 1020, 700, 1530, paint3);
        canvas.drawLine(150, 820, 500, 820, paint3);
        canvas.drawLine(150, 1020, 500, 1020, paint3);
        canvas.drawLine(700, 820, 1040, 820, paint3);
        canvas.drawLine(700, 1020, 1040, 1020, paint3);
        canvas.drawLine(500, 1530, 700, 1530, paint3);


        paint4.setTextSize(40);
        //for Naming the rooms on left side
        canvas.drawText("Margallah", 200, 130, paint4);
        canvas.drawText("Lab", 200, 200, paint4);
        canvas.drawText("Accounts", 200, 380, paint4);
        canvas.drawText("Accounts", 200, 530, paint4);
        canvas.drawText("Student Affairs", 200, 730, paint4);
        canvas.drawText("1st Floor ", 200, 900, paint4);
        canvas.drawText("Meeting room", 200, 1100, paint4);
        canvas.drawText("Girl's Common", 200, 1270, paint4);
        canvas.drawText("Room", 200, 1330, paint4);
        canvas.drawText("Control room", 200, 1450, paint4);

        //for Naming the rooms on left side
        canvas.drawText("Room # 01", 750, 130, paint4);
        canvas.drawText("Room # 02", 750, 380, paint4);
        canvas.drawText("Room # 03", 750, 550, paint4);
        canvas.drawText("Room # 04", 750, 730, paint4);
        canvas.drawText("Director's", 750, 1100, paint4);
        canvas.drawText("office", 750, 1150, paint4);
        canvas.drawText("Ladies Room", 750, 1330, paint4);
        canvas.drawText("Men's Room", 750, 1450, paint4);
        canvas.drawText("AUDITORIUM", 510, 1630, paint4);

        //for naming 1st floor on path
        canvas.drawText(" 1st ", 550, 50,  paint4);
        canvas.drawText(" Floor ", 530, 100,  paint4);
        canvas.drawText(" 1st Floor ", 850, 900,  paint4);
        canvas.drawText(" 1st ", 550, 1450,  paint4);
        canvas.drawText(" Floor ", 530, 1500,  paint4);
        //drawRect(left, top, right, bottom, paint)

    }

}