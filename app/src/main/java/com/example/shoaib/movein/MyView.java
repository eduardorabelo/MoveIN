package com.example.shoaib.movein;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import static android.support.v4.app.ActivityCompat.startActivity;


public class MyView extends View  {

    int counter=0;
    Paint paint1,paint2,paint3,paint4,paint5,paint6,paint7;
    //  Path path;
    float sourcex;
    float sourcey;
    float destx;
    float desty;

    int nodeKhy2X=500;
    int nodeControlX=500;
    int nodeKhy1X=500;
    int nodeNasconX=500;
    int nodeFaculty1X=500;
    int nodeFaculty2X=500;
    int nodeFaculty3X=500;
    int nodeRawalX=500;
    int nodeLadiesRoomX=700;
    int nodeMensRoomX=700;
    int node201X=700;
    int node202X=700;
    int node203X=700;
    int nodeExamRoomX=700;
    int nodeAcademicsX=700;
    int nodeFaculty4X=700;
    int node210X=700;
    int node211X=700;
    int noderoomX=600;


    int nodeKhy2Y=55;
    int nodeControlY=365;
    int nodeKhy1Y=515;
    int nodeNasconY=825;
    int nodeFaculty1Y=995;
    int nodeFaculty2Y=1125;
    int nodeFaculty3Y=1255;
    int nodeRawalY=1385;
    int node2LadiesRoomY=55;
    int node2MensRoomY=185;
    int node201Y=315;
    int node202Y=485;
    int node203Y=655;
    int nodeExamRoomY=995;
    int nodeAcademicsY=1095;
    int nodeFaculty4Y=1235;
    int node210Y=1365;
    int node211Y=1485;
    int noderoomY=1485;
    private Path path = new Path();

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

        paint5 =new Paint();
        paint5.setColor(Color.RED);
        paint5.setStrokeWidth(10);
        paint5.setStyle(Paint.Style.FILL_AND_STROKE);


        paint6 =new Paint();
        paint6.setColor(Color.GREEN);
        paint6.setStrokeWidth(10);
        paint6.setStyle(Paint.Style.FILL_AND_STROKE);

        paint7 =new Paint();
        paint7.setColor(Color.MAGENTA);
        paint7.setStrokeWidth(10);
        paint7.setStyle(Paint.Style.STROKE);

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

        canvas.drawCircle(740,900,15,paint2);
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
        canvas.drawCircle(440,130,18,paint5);


        canvas.drawText("TA's Office", 200, 230, paint4);
        canvas.drawCircle(440,255,18,paint5);


        canvas.drawText("Lab Instructors", 200, 380, paint4);
        canvas.drawCircle(440,430,18,paint5);


        canvas.drawText("Room # 305", 200, 530, paint4);
        canvas.drawCircle(440,600,18,paint5);

        canvas.drawText("Faculty Offices", 200, 730, paint4);
        canvas.drawCircle(440,770,18,paint5);

        canvas.drawText("Boys Common ", 200, 900, paint4);
        canvas.drawCircle(440,940,18,paint5);


        canvas.drawText("Room", 200, 950, paint4);
        canvas.drawText("Room # 316", 200, 1100, paint4);
        canvas.drawCircle(440,1110,18,paint5);





        canvas.drawText("Room # 315", 200, 1280, paint4);
        canvas.drawCircle(440,1280,18,paint5);

        canvas.drawText("Room # 314", 200, 1450, paint4);
        canvas.drawCircle(440,1450,18,paint5);


        canvas.drawText("FYP Lab", 200, 1590, paint4);
        canvas.drawCircle(440,1600,18,paint5);


        //for Naming the rooms on left side
        canvas.drawText("Ladies Room", 750, 100, paint4);
        canvas.drawCircle(980,130,18,paint5);


        canvas.drawText("Men's Room", 750, 230, paint4);
        canvas.drawCircle(980,260,18,paint5);

        canvas.drawText("Room # 301", 750, 380, paint4);
        canvas.drawCircle(980,430,18,paint5);

        canvas.drawText("Room # 302", 750, 530, paint4);
        canvas.drawCircle(980,600,18,paint5);

        canvas.drawText("Room # 303", 750, 730, paint4);
        canvas.drawCircle(980,770,18,paint5);

        canvas.drawText("Store", 750, 1100, paint4);
        canvas.drawCircle(980,1110,18,paint5);

        canvas.drawText("Room # 310", 750, 1280, paint4);
        canvas.drawCircle(990,1280,18,paint5);

        canvas.drawText("Room # 311", 750, 1450, paint4);
        canvas.drawCircle(990,1450,18,paint5);

        canvas.drawText("Karakoram Lab", 730, 1590, paint4);
        canvas.drawCircle(980,1540,18,paint5);

        canvas.drawText("Graduate", 510, 1590, paint4);
        canvas.drawText("Lab", 510, 1620, paint4);
        canvas.drawCircle(670,1540,18,paint5);

        //for naming 3rd floor on path
        canvas.drawText(" 3rd ", 550, 50,  paint4);
        canvas.drawText(" Floor ", 530, 100,  paint4);
        canvas.drawText(" 3rd Floor ", 850, 900,  paint4);
        canvas.drawText(" 3rd ", 550, 1420,  paint4);
        canvas.drawText(" Floor ", 530, 1450,  paint4);
        //drawRect(left, top, right, bottom, paint)



        canvas.drawCircle(50,60,30,paint6);

        canvas.drawCircle(50,180,30,paint7);

    }

    @Override
    public boolean onTouchEvent( MotionEvent event) {

        switch (event.getAction()) {


            case MotionEvent.ACTION_DOWN:

                float x = event.getX();
                float y = event.getY();



                if(counter==1)
                {
                    sourcex = event.getX();
                    sourcey = event.getY();
                    Toast toast5 = Toast.makeText(getContext(),"source"+" "+sourcex+" "+sourcey,Toast.LENGTH_SHORT);
                    toast5.show();

                    counter=2;

                }



                if ((x>=20 && x<=80) && (y>=30 && y<=90))
                {

                    Toast toast4 = Toast.makeText(getContext(),"Navigation started, tap on source",Toast.LENGTH_SHORT);
                    toast4.show();

                    // Toast toast5 = Toast.makeText(getContext(),"Navigation started",Toast.LENGTH_SHORT);
                    //toast5.show();

                    counter=1;


                }





                if ((x>=20 && x<=80) && (y>=150 && y<=210))
                {        invalidate();


                    Toast toast4 = Toast.makeText(getContext(),"Navigation ended",Toast.LENGTH_SHORT);
                    toast4.show();

                    // Toast toast5 = Toast.makeText(getContext(),"Navigation started",Toast.LENGTH_SHORT);
                    //toast5.show();


                    counter=0;


                }






//checks for red buttons used for image display
                if ((x>=420 && x<=460))
                {

                    if (y>=110 && y<=150)
                    {
                        //  Toast toast2 = Toast.makeText(getContext(),"Khyber II pressed",Toast.LENGTH_SHORT);
                        // toast2.show();

                        Intent Intent = new Intent(getContext(), ImageFileFloor3.class);
                        Intent.putExtra("image","Reveal Lab");
                        getContext().startActivity(Intent);


                    }


                    else if (y>=235 && y<=275)
                    {
//                        Toast toast2 = Toast.makeText(getContext(),"Control room pressed",Toast.LENGTH_SHORT);
//                        toast2.show();

                        Intent Intent = new Intent(getContext(), ImageFileFloor3.class);
                        Intent.putExtra("image","TA's Office");
                        getContext().startActivity(Intent);

                    }

                    else if (y>=410 && y<=450)
                    {
                        //Toast toast2 = Toast.makeText(getContext(),"Khyber I pressed",Toast.LENGTH_SHORT);
                        // toast2.show();
                        Intent Intent = new Intent(getContext(), ImageFileFloor3.class);
                        Intent.putExtra("image","Lab Instructors");
                        getContext().startActivity(Intent);


                    }


                    else if (y>=580 && y<=620)
                    {
//                        Toast toast2 = Toast.makeText(getContext(),"Nascon room pressed",Toast.LENGTH_SHORT);
//                        toast2.show();

                        Intent Intent = new Intent(getContext(), ImageFileFloor3.class);
                        Intent.putExtra("image","305");
                        getContext().startActivity(Intent);
                    }


                    else if (y>=750 && y<=790)
                    {
//                        Toast toast2 = Toast.makeText(getContext(),"Faculty offices pressed",Toast.LENGTH_SHORT);
//                        toast2.show();

                        Intent Intent = new Intent(getContext(), ImageFileFloor3.class);
                        Intent.putExtra("image","Faculty1");
                        getContext().startActivity(Intent);
                    }


                    else if (y>=920 && y<=960)
                    {
//                        Toast toast2 = Toast.makeText(getContext(),"Faculty offices pressed",Toast.LENGTH_SHORT);
//                        toast2.show();

                        Intent Intent = new Intent(getContext(), ImageFileFloor3.class);
                        Intent.putExtra("image","Boys Common Room");
                        getContext().startActivity(Intent);
                    }


                    else if (y>=1090 && y<=1130)
                    {
//                        Toast toast2 = Toast.makeText(getContext(),"Faculty offices pressed",Toast.LENGTH_SHORT);
//                        toast2.show();

                        Intent Intent = new Intent(getContext(), ImageFileFloor3.class);
                        Intent.putExtra("image","316");
                        getContext().startActivity(Intent);
                    }


                    else if (y>=1260 && y<=1300)
                    {
//                        Toast toast2 = Toast.makeText(getContext(),"Rawal lab pressed",Toast.LENGTH_SHORT);
//                        toast2.show();

                        Intent Intent = new Intent(getContext(), ImageFileFloor3.class);
                        Intent.putExtra("image","315");
                        getContext().startActivity(Intent);
                    }
                    else if (y>=1430 && y<=1470)
                    {
//                        Toast toast2 = Toast.makeText(getContext(),"Rawal lab pressed",Toast.LENGTH_SHORT);
//                        toast2.show();

                        Intent Intent = new Intent(getContext(), ImageFileFloor3.class);
                        Intent.putExtra("image","314");
                        getContext().startActivity(Intent);
                    }

                    else if (y>=1580 && y<=1620)
                    {
//                        Toast toast2 = Toast.makeText(getContext(),"Rawal lab pressed",Toast.LENGTH_SHORT);
//                        toast2.show();

                        Intent Intent = new Intent(getContext(), ImageFileFloor3.class);
                        Intent.putExtra("image","Fyp Lab");
                        getContext().startActivity(Intent);
                    }



                }

                else if ((x>=960 && x<=1000))
                {

                    if (y>=110 && y<=150)
                    {
//                        Toast toast2 = Toast.makeText(getContext(),"Ladies room pressed",Toast.LENGTH_SHORT);
//                        toast2.show();

                        Intent Intent = new Intent(getContext(), ImageFileFloor3.class);
                        Intent.putExtra("image","Ladies room");
                        getContext().startActivity(Intent);
                    }

                    else if (y>=240 && y<=280)
                    {
//                        Toast toast2 = Toast.makeText(getContext(),"Men's room pressed",Toast.LENGTH_SHORT);
//                        toast2.show();

                        Intent Intent = new Intent(getContext(), ImageFileFloor3.class);
                        Intent.putExtra("image","Men's room");
                        getContext().startActivity(Intent);
                    }

                    else if (y>=410 && y<=450)
                    {
//                        Toast toast2 = Toast.makeText(getContext(),"201 room pressed",Toast.LENGTH_SHORT);
//                        toast2.show();

                        Intent Intent = new Intent(getContext(), ImageFileFloor3.class);
                        Intent.putExtra("image","301");
                        getContext().startActivity(Intent);
                    }
                    else if (y>=580 && y<=620)
                    {
//                        Toast toast2 = Toast.makeText(getContext(),"202 room pressed",Toast.LENGTH_SHORT);
//                        toast2.show();

                        Intent Intent = new Intent(getContext(), ImageFileFloor3.class);
                        Intent.putExtra("image","302");
                        getContext().startActivity(Intent);
                    }
                    else if (y>=750 && y<=790)
                    {
//                        Toast toast2 = Toast.makeText(getContext(),"203 room pressed",Toast.LENGTH_SHORT);
//                        toast2.show();

                        Intent Intent = new Intent(getContext(), ImageFileFloor3.class);
                        Intent.putExtra("image","303");
                        getContext().startActivity(Intent);
                    }
                    else if (y>=1090 && y<=1130)
                    {
//                        Toast toast2 = Toast.makeText(getContext(),"Exam room pressed",Toast.LENGTH_SHORT);
//                        toast2.show();

                        Intent Intent = new Intent(getContext(), ImageFileFloor3.class);
                        Intent.putExtra("image","Store");
                        getContext().startActivity(Intent);
                    }
                    else if (y>=1260 && y<=1300)
                    {
//                        Toast toast2 = Toast.makeText(getContext(),"Academics room pressed",Toast.LENGTH_SHORT);
//                        toast2.show();

                        Intent Intent = new Intent(getContext(), ImageFileFloor3.class);
                        Intent.putExtra("image","310");
                        getContext().startActivity(Intent);
                    }
                    else if (y>=1430 && y<=1470)
                    {
//                        Toast toast2 = Toast.makeText(getContext(),"Faculty4 room pressed",Toast.LENGTH_SHORT);
//                        toast2.show();

                        Intent Intent = new Intent(getContext(), ImageFileFloor3.class);
                        Intent.putExtra("image","311");
                        getContext().startActivity(Intent);
                    }
                    else if (y>=1520 && y<=1560)
                    {
//                        Toast toast2 = Toast.makeText(getContext(),"210 room pressed",Toast.LENGTH_SHORT);
//                        toast2.show();

                        Intent Intent = new Intent(getContext(), ImageFileFloor3.class);
                        Intent.putExtra("image","Karakoram Lab");
                        getContext().startActivity(Intent);
                    }


                }

                else if ((x>=650 && x<=690) && (y>=1520 && y<=1560))
                {
//                    Toast toast2 = Toast.makeText(getContext(),"faculty5 room pressed",Toast.LENGTH_SHORT);
//                    toast2.show();

                    Intent Intent = new Intent(getContext(), ImageFileFloor3.class);
                    Intent.putExtra("image","Graduate Lab");
                    getContext().startActivity(Intent);
                }

                break;
            //    case MotionEvent.ACTION_MOVE:
            //       Toast toast1 = Toast.makeText(getContext(),"Hello",Toast.LENGTH_LONG);
            //      toast1.show();
            //     break;
            //  case MotionEvent.ACTION_UP:
            //    Toast toast2 = Toast.makeText(getContext(),"Hello",Toast.LENGTH_LONG);
            //   toast2.show();
            //  break;
        }

        invalidate();

        return true;

    }
}