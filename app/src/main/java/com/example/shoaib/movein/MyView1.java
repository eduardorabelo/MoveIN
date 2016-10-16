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

import com.example.shoaib.movein.ImageFileFloor2;

import static android.support.v4.app.ActivityCompat.startActivity;


public class MyView1 extends View  {

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
        paint7.setStrokeWidth(20);
        paint7.setStyle(Paint.Style.STROKE);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        // TODO Auto-generated method stub
        super.onDraw(canvas);
        //rooms on left side
        //drawRect(left, top, right, bottom, paint)
        canvas.drawPath(path, paint7);

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


        paint4.setTextSize(40);
        //for Naming the rooms on left side
        //  canvas.drawText("Reveal Lab", 200, 100, paint4);
        canvas.drawText(" Khyber II", 180, 180, paint4);
        canvas.drawCircle(440,300,18,paint5);

        canvas.drawText(" Control room", 200, 410, paint4);
        canvas.drawCircle(440,445,18,paint5);

        canvas.drawText(" Khyber I", 180, 650, paint4);
        canvas.drawCircle(440,770,18,paint5);

        //    canvas.drawText("Faculty Offices", 200, 730, paint4);
        canvas.drawText("Nascon Room ", 200, 900, paint4);
        canvas.drawCircle(440,940,18,paint5);

        canvas.drawText("Faculty Offices", 200, 1045, paint4);
        canvas.drawCircle(440,1070,18,paint5);

        canvas.drawText("Faculty Offices", 200, 1175, paint4);
        canvas.drawCircle(440,1200,18,paint5);

        canvas.drawText("Faculty Offices", 200, 1300, paint4);
        canvas.drawCircle(440,1330,18,paint5);


        canvas.drawText("Rawal Lab", 200, 1500, paint4);
        canvas.drawCircle(440,1600,18,paint5);



        //for Naming the rooms on left side
        canvas.drawText("Ladies Room", 750, 100, paint4);
        canvas.drawCircle(980,130,18,paint5);
        canvas.drawText("Men's Room", 750, 230, paint4);
        canvas.drawCircle(980,260,18,paint5);

        canvas.drawText("Room # 201", 750, 380, paint4);
        canvas.drawCircle(980,430,18,paint5);

        canvas.drawText("Room # 202", 750, 530, paint4);
        canvas.drawCircle(980,600,18,paint5);

        canvas.drawText("Room # 203", 750, 730, paint4);
        canvas.drawCircle(980,770,18,paint5);

        canvas.drawText("Exam room", 750, 1050, paint4);
        canvas.drawCircle(980,1040,18,paint5);

        canvas.drawText("Academics", 750, 1170, paint4);
        canvas.drawCircle(980,1185,18,paint5);

        canvas.drawText("Faculty", 750, 1290, paint4);
        canvas.drawCircle(980,1310,18,paint5);

        canvas.drawText("Room # 210", 750, 1435, paint4);
        canvas.drawCircle(980,1450,18,paint5);

        canvas.drawText("Room # 211", 750, 1580, paint4);
        canvas.drawCircle(980,1600,18,paint5);

        canvas.drawText("Faculty", 510, 1590, paint4);
        canvas.drawText("room", 510, 1620, paint4);
        canvas.drawCircle(660,1600,18,paint5);

        canvas.drawCircle(740,900,15,paint2);

        //for naming 3rd floor on path
        canvas.drawText(" 2nd ", 550, 50,  paint4);
        canvas.drawText(" Floor ", 530, 100,  paint4);
        canvas.drawText(" 2nd Floor ", 850, 900,  paint4);
        canvas.drawText(" 2nd ", 550, 1420,  paint4);
        canvas.drawText(" Floor ", 530, 1450,  paint4);

        canvas.drawCircle(660,1600,18,paint5);

        canvas.drawCircle(50,60,30,paint6);

        canvas.drawCircle(50,180,30,paint7);


        //drawRect(left, top, right, bottom, paint)


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
                else if(counter==2)
                {
                    destx = event.getX();
                    desty = event.getY();
                    Toast toast6 = Toast.makeText(getContext(),"dest"+" "+destx+" "+desty,Toast.LENGTH_SHORT);
                    toast6.show();
                    int i = 0;
                    //RoomKhyber2
                    if(((sourcex >=180 && sourcex<=480)&&(sourcey >=40 && sourcey<=330))&&((destx>=180 && destx<=480)&&(desty>=360&&desty<=475)))
                    {
                        path.moveTo(nodeKhy2X, nodeKhy2Y);
                        path.lineTo(nodeControlX, nodeControlY);
                    //    path.addCircle(nodeControlX,nodeControlY,10,Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=40 && sourcey<=330))&&((destx>=180 && destx<=480)&&(desty>=510&&desty<=800)))
                    {
                        path.moveTo(nodeKhy2X, nodeKhy2Y);
                        path.lineTo(nodeKhy1X, nodeKhy1Y);
                     //   path.addCircle(nodeKhy1X, nodeKhy1Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=40 && sourcey<=330))&&((destx>=180 && destx<=480)&&(desty>=820&&desty<=970)))
                    {
                        path.moveTo(nodeKhy2X, nodeKhy2Y);
                        path.lineTo(nodeNasconX, nodeNasconY);
                     //   path.addCircle(nodeNasconX, nodeNasconY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=40 && sourcey<=330))&&((destx>=180 && destx<=480)&&(desty>=990&&desty<=1100)))
                    {
                        path.moveTo(nodeKhy2X, nodeKhy2Y);
                        path.lineTo(nodeFaculty1X, nodeFaculty1Y);
                      //  path.addCircle(nodeFaculty1X, nodeFaculty1Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=40 && sourcey<=330))&&((destx>=180 && destx<=480)&&(desty>=1120&&desty<=1230)))
                    {
                        path.moveTo(nodeKhy2X, nodeKhy2Y);
                        path.lineTo(nodeFaculty2X, nodeFaculty2Y);
                     //   path.addCircle(nodeFaculty2X, nodeFaculty2Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=40 && sourcey<=330))&&((destx>=180 && destx<=480)&&(desty>=1250&&desty<=1360)))
                    {
                        path.moveTo(nodeKhy2X, nodeKhy2Y);
                        path.lineTo(nodeFaculty3X, nodeFaculty3Y);
                     //   path.addCircle(nodeFaculty3X, nodeFaculty3Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=40 && sourcey<=330))&&((destx>=180 && destx<=480)&&(desty>=1380&&desty<=1630)))
                    {
                        path.moveTo(nodeKhy2X, nodeKhy2Y);
                        path.lineTo(nodeRawalX, nodeRawalY);
                     //   path.addCircle(nodeRawalX, nodeRawalY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=40 && sourcey<=330))&&((destx>=500 && destx<=700)&&(desty>=1500&&desty<=1630)))
                    {
                        path.moveTo(nodeKhy2X, nodeKhy2Y);
                        path.lineTo(nodeRawalX, nodeRawalY);
                        path.lineTo(noderoomX, noderoomY);
                     //   path.addCircle(noderoomX, noderoomY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=40 && sourcey<=330))&&((destx>=720 && destx<=1020)&&(desty>=1500&&desty<=1630)))
                    {
                        path.moveTo(nodeKhy2X, nodeKhy2Y);
                        path.lineTo(nodeRawalX, nodeRawalY);
                        path.lineTo(node211X, node211Y);
                     //   path.addCircle(node211X, node211Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=40 && sourcey<=330))&&((destx>=720 && destx<=1020)&&(desty>=1360&&desty<=1480)))
                    {
                        path.moveTo(nodeKhy2X, nodeKhy2Y);
                        path.lineTo(nodeRawalX, nodeRawalY);
                        path.lineTo(noderoomX,noderoomY);
                        path.lineTo(node210X, node210Y);
                     //   path.addCircle(node210X, node210Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=40 && sourcey<=330))&&((destx>=720 && destx<=1020)&&(desty>=1230&&desty<=1340)))
                    {
                        path.moveTo(nodeKhy2X, nodeKhy2Y);
                        path.lineTo(nodeRawalX, nodeRawalY);
                        path.lineTo(node210X, node210Y);
                        path.lineTo(nodeFaculty4X,nodeFaculty4Y);
                     //   path.addCircle(nodeFaculty4X, nodeFaculty4Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=40 && sourcey<=330))&&((destx>=720 && destx<=1020)&&(desty>=1090&&desty<=1215)))
                    {
                        path.moveTo(nodeKhy2X, nodeKhy2Y);
                        path.lineTo(nodeRawalX, nodeRawalY);
                        path.lineTo(node210X, node210Y);
                        path.lineTo(nodeAcademicsX,nodeAcademicsY);
                      //  path.addCircle(nodeAcademicsX, nodeAcademicsY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=40 && sourcey<=330))&&((destx>=720 && destx<=1020)&&(desty>=990&&desty<=1070)))
                    {
                        path.moveTo(nodeKhy2X, nodeKhy2Y);
                        path.lineTo(nodeRawalX, nodeRawalY);
                        path.lineTo(node210X, node210Y);
                        path.lineTo(nodeExamRoomX,nodeExamRoomY);
                    //    path.addCircle(nodeExamRoomX, nodeExamRoomY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=40 && sourcey<=330))&&((destx>=720 && destx<=1020)&&(desty>=50&&desty<=160)))
                    {
                        path.moveTo(nodeKhy2X, nodeKhy2Y);
                        path.lineTo(nodeLadiesRoomX, node2LadiesRoomY);
                   //     path.addCircle(nodeLadiesRoomX, node2LadiesRoomY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=40 && sourcey<=330))&&((destx>=720 && destx<=1020)&&(desty>=180&&desty<=290)))
                    {
                        path.moveTo(nodeKhy2X, nodeKhy2Y);
                        path.lineTo(nodeLadiesRoomX, node2LadiesRoomY);
                        path.lineTo(nodeMensRoomX, node2MensRoomY);
                   //     path.addCircle(nodeMensRoomX, node2MensRoomY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=40 && sourcey<=330))&&((destx>=720 && destx<=1020)&&(desty>=310&&desty<=460)))
                    {
                        path.moveTo(nodeKhy2X, nodeKhy2Y);
                        path.lineTo(nodeLadiesRoomX, node2LadiesRoomY);
                        path.lineTo(node201X, node201Y);
                   //     path.addCircle(node201X, node201Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=40 && sourcey<=330))&&((destx>=720 && destx<=1020)&&(desty>=480&&desty<=630)))
                    {
                        path.moveTo(nodeKhy2X, nodeKhy2Y);
                        path.lineTo(nodeLadiesRoomX, node2LadiesRoomY);
                        path.lineTo(node202X, node202Y);
                    //    path.addCircle(node202X, node202Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=40 && sourcey<=330))&&((destx>=720 && destx<=1020)&&(desty>=650&&desty<=800)))
                    {
                        path.moveTo(nodeKhy2X, nodeKhy2Y);
                        path.lineTo(nodeLadiesRoomX, node2LadiesRoomY);
                        path.lineTo(node203X, node203Y);
                        //path.addCircle(node203X, node203Y, 10, Path.Direction.CCW);
                    }
                    //RoomControl
                    if(((sourcex >=180 && sourcex<=480)&&(sourcey >=360 && sourcey<=475))&&((destx>=180 && destx<=480)&&(desty>=40&&desty<=330)))
                    {
                        path.moveTo(nodeControlX, nodeControlY);
                        path.lineTo(nodeKhy2X, nodeKhy2Y);
                        //path.addCircle(nodeKhy2X, nodeKhy2Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=360 && sourcey<=475))&&((destx>=180 && destx<=480)&&(desty>=510&&desty<=800)))
                    {
                        path.moveTo(nodeControlX, nodeControlY);
                        path.lineTo(nodeKhy1X, nodeKhy1Y);
                        //path.addCircle(nodeKhy1X, nodeKhy1Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=360 && sourcey<=475))&&((destx>=180 && destx<=480)&&(desty>=820&&desty<=970)))
                    {
                        path.moveTo(nodeControlX, nodeControlY);
                        path.lineTo(nodeNasconX, nodeNasconY);
                        //path.addCircle(nodeNasconX, nodeNasconY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=360 && sourcey<=475))&&((destx>=180 && destx<=480)&&(desty>=990&&desty<=1100)))
                    {
                        path.moveTo(nodeControlX, nodeControlY);
                        path.lineTo(nodeFaculty1X, nodeFaculty1Y);
                        //path.addCircle(nodeFaculty1X, nodeFaculty1Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=360 && sourcey<=475))&&((destx>=180 && destx<=480)&&(desty>=1120&&desty<=1230)))
                    {
                        path.moveTo(nodeControlX, nodeControlY);
                        path.lineTo(nodeFaculty2X, nodeFaculty2Y);
                        //path.addCircle(nodeFaculty2X, nodeFaculty2Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=360 && sourcey<=475))&&((destx>=180 && destx<=480)&&(desty>=1250&&desty<=1360)))
                    {
                        path.moveTo(nodeControlX, nodeControlY);
                        path.lineTo(nodeFaculty3X, nodeFaculty3Y);
                        //path.addCircle(nodeFaculty3X, nodeFaculty3Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=360 && sourcey<=475))&&((destx>=180 && destx<=480)&&(desty>=1380&&desty<=1630)))
                    {
                        path.moveTo(nodeControlX, nodeControlY);
                        path.lineTo(nodeRawalX, nodeRawalY);
                        //path.addCircle(nodeRawalX, nodeRawalY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=360 && sourcey<=475))&&((destx>=500 && destx<=700)&&(desty>=1500&&desty<=1630)))
                    {
                        path.moveTo(nodeControlX, nodeControlY);
                        path.lineTo(nodeRawalX, nodeRawalY);
                        path.lineTo(noderoomX, noderoomY);
                        //path.addCircle(noderoomX, noderoomY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=360 && sourcey<=475))&&((destx>=720 && destx<=1020)&&(desty>=1500&&desty<=1630)))
                    {
                        path.moveTo(nodeControlX, nodeControlY);
                        path.lineTo(nodeRawalX, nodeRawalY);
                        path.lineTo(node211X, node211Y);
                        //path.addCircle(node211X, node211Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=360 && sourcey<=475))&&((destx>=720 && destx<=1020)&&(desty>=1360&&desty<=1480)))
                    {
                        path.moveTo(nodeControlX, nodeControlY);
                        path.lineTo(nodeRawalX, nodeRawalY);
                        path.lineTo(node210X, node210Y);
                     //   path.addCircle(node210X, node210Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=360 && sourcey<=475))&&((destx>=720 && destx<=1020)&&(desty>=1230&&desty<=1340)))
                    {
                        path.moveTo(nodeControlX, nodeControlY);
                        path.lineTo(nodeRawalX, nodeRawalY);
                        path.lineTo(node210X, node210Y);
                        path.lineTo(nodeFaculty4X,nodeFaculty4Y);
                       // path.addCircle(nodeFaculty4X, nodeFaculty4Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=360 && sourcey<=475))&&((destx>=720 && destx<=1020)&&(desty>=1090&&desty<=1215)))
                    {
                        path.moveTo(nodeControlX, nodeControlY);
                        path.lineTo(nodeRawalX, nodeRawalY);
                        path.lineTo(node210X, node210Y);
                        path.lineTo(nodeAcademicsX,nodeAcademicsY);
                          //path.addCircle(nodeAcademicsX, nodeAcademicsY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=360 && sourcey<=475))&&((destx>=720 && destx<=1020)&&(desty>=990&&desty<=1070)))
                    {
                        path.moveTo(nodeControlX, nodeControlY);
                        path.lineTo(nodeRawalX, nodeRawalY);
                        path.lineTo(node210X, node210Y);
                        path.lineTo(nodeExamRoomX,nodeExamRoomY);
                        //path.addCircle(nodeExamRoomX, nodeExamRoomY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=360 && sourcey<=475))&&((destx>=720 && destx<=1020)&&(desty>=50&&desty<=160)))
                    {
                        path.moveTo(nodeControlX, nodeControlY);
                        path.lineTo(nodeKhy2X, nodeKhy2Y);
                        path.lineTo(nodeLadiesRoomX, node2LadiesRoomY);
                        //path.addCircle(nodeLadiesRoomX, node2LadiesRoomY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=360 && sourcey<=475))&&((destx>=720 && destx<=1020)&&(desty>=180&&desty<=290)))
                    {
                        path.moveTo(nodeControlX, nodeControlY);
                        path.lineTo(nodeKhy2X, nodeKhy2Y);
                        path.lineTo(nodeLadiesRoomX, node2LadiesRoomY);
                        path.lineTo(nodeMensRoomX, node2MensRoomY);
                        //path.addCircle(nodeMensRoomX, node2MensRoomY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=360 && sourcey<=475))&&((destx>=720 && destx<=1020)&&(desty>=310&&desty<=460)))
                    {
                        path.moveTo(nodeControlX, nodeControlY);
                        path.lineTo(node201X, node201Y);
                        //path.addCircle(node201X, node201Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=360 && sourcey<=475))&&((destx>=720 && destx<=1020)&&(desty>=480&&desty<=630)))
                    {
                        path.moveTo(nodeControlX, nodeControlY);
                        path.lineTo(node201X, node201Y);
                        path.lineTo(node202X, node202Y);
                        //path.addCircle(node202X, node202Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=360 && sourcey<=475))&&((destx>=720 && destx<=1020)&&(desty>=650&&desty<=800)))
                    {
                        path.moveTo(nodeControlX, nodeControlY);
                        path.lineTo(node201X, node201Y);
                        path.lineTo(node203X, node203Y);
                        //path.addCircle(node203X, node203Y, 10, Path.Direction.CCW);
                    }
                    //RoomKhyber1
                    if(((sourcex >=180 && sourcex<=480)&&(sourcey >=510 && sourcey<=800))&&((destx>=180 && destx<=480)&&(desty>=40&&desty<=330)))
                    {
                        path.moveTo(nodeKhy1X, nodeKhy1Y);
                        path.lineTo(nodeKhy2X, nodeKhy2Y);
                        //path.addCircle(nodeKhy2X, nodeKhy2Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=510 && sourcey<=800))&&((destx>=180 && destx<=480)&&(desty>=360&&desty<=475)))
                    {
                        path.moveTo(nodeKhy1X, nodeKhy1Y);
                        path.lineTo(nodeControlX, nodeControlY);
                        //path.addCircle(nodeControlX, nodeControlY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=510 && sourcey<=800))&&((destx>=180 && destx<=480)&&(desty>=820&&desty<=970)))
                    {
                        path.moveTo(nodeKhy1X, nodeKhy1Y);
                        path.lineTo(nodeNasconX, nodeNasconY);
                        //path.addCircle(nodeNasconX, nodeNasconY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=510 && sourcey<=800))&&((destx>=180 && destx<=480)&&(desty>=990&&desty<=1100)))
                    {
                        path.moveTo(nodeKhy1X, nodeKhy1Y);
                        path.lineTo(nodeFaculty1X, nodeFaculty1Y);
                        //path.addCircle(nodeFaculty1X, nodeFaculty1Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=510 && sourcey<=800))&&((destx>=180 && destx<=480)&&(desty>=1120&&desty<=1230)))
                    {
                        path.moveTo(nodeKhy1X, nodeKhy1Y);
                        path.lineTo(nodeFaculty2X, nodeFaculty2Y);
                        //path.addCircle(nodeFaculty2X, nodeFaculty2Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=510 && sourcey<=800))&&((destx>=180 && destx<=480)&&(desty>=1250&&desty<=1360)))
                    {
                        path.moveTo(nodeKhy1X, nodeKhy1Y);
                        path.lineTo(nodeFaculty3X, nodeFaculty3Y);
                        //path.addCircle(nodeFaculty3X, nodeFaculty3Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=510 && sourcey<=800))&&((destx>=180 && destx<=480)&&(desty>=1380&&desty<=1630)))
                    {
                        path.moveTo(nodeKhy1X, nodeKhy1Y);
                        path.lineTo(nodeRawalX, nodeRawalY);
                        //path.addCircle(nodeControlX, nodeControlY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=510 && sourcey<=800))&&((destx>=500 && destx<=700)&&(desty>=1500&&desty<=1630)))
                    {
                        path.moveTo(nodeKhy1X, nodeKhy1Y);
                        path.lineTo(nodeRawalX, nodeRawalY);
                        path.lineTo(noderoomX, noderoomY);
                        //path.addCircle(noderoomX, noderoomY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=510 && sourcey<=800))&&((destx>=720 && destx<=1020)&&(desty>=1500&&desty<=1630)))
                    {
                        path.moveTo(nodeKhy1X, nodeKhy1Y);
                        path.lineTo(nodeRawalX, nodeRawalY);
                        path.lineTo(noderoomX,noderoomY);
                        path.lineTo(node211X, node211Y);
                        //path.addCircle(node211X, node211Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=510 && sourcey<=800))&&((destx>=720 && destx<=1020)&&(desty>=1360&&desty<=1480)))
                    {
                        path.moveTo(nodeKhy1X, nodeKhy1Y);
                        path.lineTo(nodeRawalX, nodeRawalY);
                        path.lineTo(node210X, node210Y);
                        //path.addCircle(node210X, node210Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=510 && sourcey<=800))&&((destx>=720 && destx<=1020)&&(desty>=1230&&desty<=1340)))
                    {
                        path.moveTo(nodeKhy1X, nodeKhy1Y);
                        path.lineTo(nodeRawalX, nodeRawalY);
                        path.lineTo(node210X, node210Y);
                        path.lineTo(nodeFaculty4X,nodeFaculty4Y);
                        //path.addCircle(nodeFaculty4X, nodeFaculty4Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=510 && sourcey<=800))&&((destx>=720 && destx<=1020)&&(desty>=1090&&desty<=1215)))
                    {
                        path.moveTo(nodeKhy1X, nodeKhy1Y);
                        path.lineTo(nodeRawalX, nodeRawalY);
                        path.lineTo(node210X, node210Y);
                        path.lineTo(nodeAcademicsX,nodeAcademicsY);
                        //path.addCircle(nodeAcademicsX, nodeAcademicsY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=510 && sourcey<=800))&&((destx>=720 && destx<=1020)&&(desty>=990&&desty<=1070)))
                    {
                        path.moveTo(nodeKhy1X, nodeKhy1Y);
                        path.lineTo(nodeRawalX, nodeRawalY);
                        path.lineTo(node210X, node210Y);
                        path.lineTo(nodeExamRoomX,nodeExamRoomY);
                        //path.addCircle(nodeExamRoomX, nodeExamRoomY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=510 && sourcey<=800))&&((destx>=720 && destx<=1020)&&(desty>=50&&desty<=160)))
                    {
                        path.moveTo(nodeKhy1X, nodeKhy1Y);
                        path.lineTo(nodeKhy2X, nodeKhy2Y);
                        path.lineTo(nodeLadiesRoomX, node2LadiesRoomY);
                        //path.addCircle(nodeLadiesRoomX, node2LadiesRoomY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=510 && sourcey<=800))&&((destx>=720 && destx<=1020)&&(desty>=180&&desty<=290)))
                    {
                        path.moveTo(nodeKhy1X, nodeKhy1Y);
                        path.lineTo(nodeKhy2X, nodeKhy2Y);
                        path.lineTo(nodeLadiesRoomX, node2LadiesRoomY);
                        path.lineTo(nodeMensRoomX, node2MensRoomY);
                        //path.addCircle(nodeMensRoomX, node2MensRoomY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=510 && sourcey<=800))&&((destx>=720 && destx<=1020)&&(desty>=310&&desty<=460)))
                    {
                        path.moveTo(nodeKhy1X,nodeKhy1Y);
                        path.lineTo(nodeControlX, nodeControlY);
                        path.lineTo(node201X, node201Y);
                        //path.addCircle(node201X, node201Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=510 && sourcey<=800))&&((destx>=720 && destx<=1020)&&(desty>=480&&desty<=630)))
                    {
                        path.moveTo(nodeKhy1X, nodeKhy1Y);
                        path.lineTo(node202X, node202Y);
                        //path.addCircle(node202X, node202Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=510 && sourcey<=800))&&((destx>=720 && destx<=1020)&&(desty>=650&&desty<=800)))
                    {
                        path.moveTo(nodeKhy1X, nodeKhy1Y);
                        path.lineTo(node202X, node202Y);
                        path.lineTo(node203X, node203Y);
                        //path.addCircle(node203X, node203Y, 10, Path.Direction.CCW);
                    }
                    //RoomNascon
                    if(((sourcex >=180 && sourcex<=480)&&(sourcey >=820 && sourcey<=970))&&((destx>=180 && destx<=480)&&(desty>=40&&desty<=330)))
                    {
                        path.moveTo(nodeNasconX, nodeNasconY);
                        path.lineTo(nodeKhy2X, nodeKhy2Y);
                        //path.addCircle(nodeKhy2X, nodeKhy2Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=820 && sourcey<=970))&&((destx>=180 && destx<=480)&&(desty>=360&&desty<=475)))
                    {
                        path.moveTo(nodeNasconX, nodeNasconY);
                        path.lineTo(nodeControlX, nodeControlY);
                        //path.addCircle(nodeControlX, nodeControlY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=820 && sourcey<=970))&&((destx>=180 && destx<=480)&&(desty>=510&&desty<=800)))
                    {
                        path.moveTo(nodeNasconX, nodeNasconY);
                        path.lineTo(nodeKhy1X, nodeKhy1Y);
                        //path.addCircle(nodeKhy1X, nodeKhy1Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=820 && sourcey<=970))&&((destx>=180 && destx<=480)&&(desty>=990&&desty<=1100)))
                    {
                        path.moveTo(nodeNasconX, nodeNasconY);
                        path.lineTo(nodeFaculty1X, nodeFaculty1Y);
                        //path.addCircle(nodeFaculty1X, nodeFaculty1Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=820 && sourcey<=970))&&((destx>=180 && destx<=480)&&(desty>=1120&&desty<=1230)))
                    {
                        path.moveTo(nodeNasconX, nodeNasconY);
                        path.lineTo(nodeFaculty2X, nodeFaculty2Y);
                        //path.addCircle(nodeFaculty2X, nodeFaculty2Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=820 && sourcey<=970))&&((destx>=180 && destx<=480)&&(desty>=1250&&desty<=1360)))
                    {
                        path.moveTo(nodeNasconX, nodeNasconY);
                        path.lineTo(nodeFaculty3X, nodeFaculty3Y);
                        //path.addCircle(nodeFaculty3X, nodeFaculty3Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=820 && sourcey<=970))&&((destx>=180 && destx<=480)&&(desty>=1380&&desty<=1630)))
                    {
                        path.moveTo(nodeNasconX, nodeNasconY);
                        path.lineTo(nodeRawalX, nodeRawalY);
                        //path.addCircle(nodeRawalX, nodeRawalY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=820 && sourcey<=970))&&((destx>=500 && destx<=700)&&(desty>=1500&&desty<=1630)))
                    {
                        path.moveTo(nodeNasconX, nodeNasconY);
                        path.lineTo(nodeRawalX, nodeRawalY);
                        path.lineTo(noderoomX, noderoomY);
                        //path.addCircle(noderoomX, noderoomY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=820 && sourcey<=970))&&((destx>=720 && destx<=1020)&&(desty>=1500&&desty<=1630)))
                    {
                        path.moveTo(nodeNasconX, nodeNasconY);
                        path.lineTo(nodeRawalX, nodeRawalY);
                        path.lineTo(noderoomX,noderoomY);
                        path.lineTo(node211X, node211Y);
                        //path.addCircle(node211X, node211Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=820 && sourcey<=970))&&((destx>=720 && destx<=1020)&&(desty>=1360&&desty<=1480)))
                    {
                        path.moveTo(nodeNasconX, nodeNasconY);
                        path.lineTo(nodeRawalX, nodeRawalY);
                        path.lineTo(node210X, node210Y);
                        //path.addCircle(node210X, node210Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=820 && sourcey<=970))&&((destx>=720 && destx<=1020)&&(desty>=1230&&desty<=1340)))
                    {
                        path.moveTo(nodeNasconX, nodeNasconY);
                        path.lineTo(nodeRawalX, nodeRawalY);
                        path.lineTo(node210X, node210Y);
                        path.lineTo(nodeFaculty4X,nodeFaculty4Y);
                        //path.addCircle(nodeFaculty4X, nodeFaculty4Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=820 && sourcey<=970))&&((destx>=720 && destx<=1020)&&(desty>=1090&&desty<=1215)))
                    {
                        path.moveTo(nodeNasconX, nodeNasconY);
                        path.lineTo(nodeRawalX, nodeRawalY);
                        path.lineTo(node210X, node210Y);
                        path.lineTo(nodeAcademicsX,nodeAcademicsY);
                        //path.addCircle(nodeAcademicsX, nodeAcademicsY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=820 && sourcey<=970))&&((destx>=720 && destx<=1020)&&(desty>=990&&desty<=1070)))
                    {
                        path.moveTo(nodeNasconX, nodeNasconY);
                        path.lineTo(nodeRawalX, nodeRawalY);
                        path.lineTo(node210X, node210Y);
                        path.lineTo(nodeExamRoomX,nodeExamRoomY);
                        //path.addCircle(nodeExamRoomX, nodeExamRoomY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=820 && sourcey<=970))&&((destx>=720 && destx<=1020)&&(desty>=50&&desty<=160)))
                    {
                        path.moveTo(nodeNasconX, nodeNasconY);
                        path.lineTo(nodeKhy2X, nodeKhy2Y);
                        path.lineTo(nodeLadiesRoomX, node2LadiesRoomY);
                        //path.addCircle(nodeLadiesRoomX, node2LadiesRoomY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=820 && sourcey<=970))&&((destx>=720 && destx<=1020)&&(desty>=180&&desty<=290)))
                    {
                        path.moveTo(nodeNasconX, nodeNasconY);
                        path.lineTo(nodeKhy2X, nodeKhy2Y);
                        path.lineTo(nodeLadiesRoomX, node2LadiesRoomY);
                        path.lineTo(nodeMensRoomX, node2MensRoomY);
                        //path.addCircle(nodeMensRoomX, node2MensRoomY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=820 && sourcey<=970))&&((destx>=720 && destx<=1020)&&(desty>=310&&desty<=460)))
                    {
                        path.moveTo(nodeNasconX,nodeNasconY);
                        path.lineTo(nodeControlX, nodeControlY);
                        path.lineTo(node201X, node201Y);
                        //path.addCircle(node201X, node201Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=820 && sourcey<=970))&&((destx>=720 && destx<=1020)&&(desty>=480&&desty<=630)))
                    {
                        path.moveTo(nodeNasconX, nodeNasconY);
                        path.lineTo(nodeKhy1X, nodeKhy1Y);
                        path.lineTo(node202X, node202Y);
                        //path.addCircle(node202X, node202Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=820 && sourcey<=970))&&((destx>=720 && destx<=1020)&&(desty>=650&&desty<=800)))
                    {
                        path.moveTo(nodeNasconX, nodeNasconY);
                        path.lineTo(nodeKhy1X, nodeKhy1Y);
                        path.lineTo(node202X, node202Y);
                        path.lineTo(node203X, node203Y);
                        //path.addCircle(node203X, node203Y, 10, Path.Direction.CCW);
                    }
                    //RoomFaculty1
                    if(((sourcex >=180 && sourcex<=480)&&(sourcey >=990 && sourcey<=1100))&&((destx>=180 && destx<=480)&&(desty>=40&&desty<=330)))
                    {
                        path.moveTo(nodeFaculty1X, nodeFaculty1Y);
                        path.lineTo(nodeKhy2X, nodeKhy2Y);
                        //path.addCircle(nodeKhy2X, nodeKhy2Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=990 && sourcey<=1100))&&((destx>=180 && destx<=480)&&(desty>=360&&desty<=475)))
                    {
                        path.moveTo(nodeFaculty1X, nodeFaculty1Y);
                        path.lineTo(nodeControlX, nodeControlY);
                        //path.addCircle(nodeControlX, nodeControlY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=990 && sourcey<=1100))&&((destx>=180 && destx<=480)&&(desty>=510&&desty<=800)))
                    {
                        path.moveTo(nodeFaculty1X, nodeFaculty1Y);
                        path.lineTo(nodeKhy1X, nodeKhy1Y);
                        //path.addCircle(nodeKhy1X, nodeKhy1Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=990 && sourcey<=1100))&&((destx>=180 && destx<=480)&&(desty>=820&&desty<=970)))
                    {
                        path.moveTo(nodeFaculty1X, nodeFaculty1Y);
                        path.lineTo(nodeNasconX, nodeNasconY);
                        //path.addCircle(nodeNasconX, nodeNasconY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=990 && sourcey<=1100))&&((destx>=180 && destx<=480)&&(desty>=1120&&desty<=1230)))
                    {
                        path.moveTo(nodeFaculty1X, nodeFaculty1Y);
                        path.lineTo(nodeFaculty2X, nodeFaculty2Y);
                        //path.addCircle(nodeFaculty2X, nodeFaculty2Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=990 && sourcey<=1100))&&((destx>=180 && destx<=480)&&(desty>=1250&&desty<=1360)))
                    {
                        path.moveTo(nodeFaculty1X, nodeFaculty1Y);
                        path.lineTo(nodeFaculty3X, nodeFaculty3Y);
                        //path.addCircle(nodeFaculty3X, nodeFaculty3Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=990 && sourcey<=1100))&&((destx>=180 && destx<=480)&&(desty>=1380&&desty<=1630)))
                    {
                        path.moveTo(nodeFaculty1X, nodeFaculty1Y);
                        path.lineTo(nodeRawalX, nodeRawalY);
                        //path.addCircle(nodeRawalX, nodeRawalY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=990 && sourcey<=1100))&&((destx>=500 && destx<=700)&&(desty>=1500&&desty<=1630)))
                    {
                        path.moveTo(nodeFaculty1X, nodeFaculty1Y);
                        path.lineTo(nodeRawalX, nodeRawalY);
                        path.lineTo(noderoomX, noderoomY);
                        //path.addCircle(noderoomX, noderoomY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=990 && sourcey<=1100))&&((destx>=720 && destx<=1020)&&(desty>=1500&&desty<=1630)))
                    {
                        path.moveTo(nodeFaculty1X, nodeFaculty1Y);
                        path.lineTo(nodeRawalX, nodeRawalY);
                        path.lineTo(noderoomX,noderoomY);
                        path.lineTo(node211X, node211Y);
                        //path.addCircle(node211X, node211Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=990 && sourcey<=1100))&&((destx>=720 && destx<=1020)&&(desty>=1360&&desty<=1480)))
                    {
                        path.moveTo(nodeFaculty1X, nodeFaculty1Y);
                        path.lineTo(nodeRawalX, nodeRawalY);
                        path.lineTo(node210X, node210Y);
                     //   path.addCircle(node210X, node210Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=990 && sourcey<=1100))&&((destx>=720 && destx<=1020)&&(desty>=1230&&desty<=1340)))
                    {
                        path.moveTo(nodeFaculty1X, nodeFaculty1Y);
                        path.lineTo(nodeRawalX, nodeRawalY);
                        path.lineTo(node210X, node210Y);
                        path.lineTo(nodeFaculty4X,nodeFaculty4Y);
                       // path.addCircle(nodeFaculty4X, nodeFaculty4Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=990 && sourcey<=1100))&&((destx>=720 && destx<=1020)&&(desty>=1090&&desty<=1215)))
                    {
                        path.moveTo(nodeFaculty1X, nodeFaculty1Y);
                        path.lineTo(nodeRawalX, nodeRawalY);
                        path.lineTo(node210X, node210Y);
                        path.lineTo(nodeAcademicsX,nodeAcademicsY);
                       // path.addCircle(nodeAcademicsX, nodeAcademicsY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=990 && sourcey<=1100))&&((destx>=720 && destx<=1020)&&(desty>=990&&desty<=1070)))
                    {
                        path.moveTo(nodeFaculty1X, nodeFaculty1Y);
                        path.lineTo(nodeExamRoomX, nodeExamRoomY);
                    //    path.addCircle(nodeExamRoomX, nodeExamRoomY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=990 && sourcey<=1100))&&((destx>=720 && destx<=1020)&&(desty>=50&&desty<=160)))
                    {
                        path.moveTo(nodeFaculty1X, nodeFaculty1Y);
                        path.lineTo(nodeKhy2X, nodeKhy2Y);
                        path.lineTo(nodeLadiesRoomX, node2LadiesRoomY);
                      //  path.addCircle(nodeLadiesRoomX, node2LadiesRoomY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=990 && sourcey<=1100))&&((destx>=720 && destx<=1020)&&(desty>=180&&desty<=290)))
                    {
                        path.moveTo(nodeFaculty1X, nodeFaculty1Y);
                        path.lineTo(nodeKhy2X, nodeKhy2Y);
                        path.lineTo(nodeLadiesRoomX, node2LadiesRoomY);
                        path.lineTo(nodeMensRoomX, node2MensRoomY);
                        //path.addCircle(nodeMensRoomX, node2MensRoomY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=990 && sourcey<=1100))&&((destx>=720 && destx<=1020)&&(desty>=310&&desty<=460)))
                    {
                        path.moveTo(nodeFaculty1X,nodeFaculty1Y);
                        path.lineTo(nodeControlX, nodeControlY);
                        path.lineTo(node201X, node201Y);
                        //path.addCircle(node201X, node201Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=990 && sourcey<=1100))&&((destx>=720 && destx<=1020)&&(desty>=480&&desty<=630)))
                    {
                        path.moveTo(nodeFaculty1X, nodeFaculty1Y);
                        path.lineTo(nodeKhy1X, nodeKhy1Y);
                        path.lineTo(node202X, node202Y);
                        //path.addCircle(node202X, node202Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=990 && sourcey<=1100))&&((destx>=720 && destx<=1020)&&(desty>=650&&desty<=800)))
                    {
                        path.moveTo(nodeFaculty1X, nodeFaculty1Y);
                        path.lineTo(nodeKhy1X, nodeKhy1Y);
                        path.lineTo(node202X, node202Y);
                        path.lineTo(node203X, node203Y);
                        //path.addCircle(node203X, node203Y, 10, Path.Direction.CCW);
                    }
                    //RoomFaculty2
                    if(((sourcex >=180 && sourcex<=480)&&(sourcey >=1120 && sourcey<=1230))&&((destx>=180 && destx<=480)&&(desty>=40&&desty<=330)))
                    {
                        path.moveTo(nodeFaculty2X, nodeFaculty2Y);
                        path.lineTo(nodeKhy2X, nodeKhy2Y);
                        //path.addCircle(nodeKhy2X, nodeKhy2Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=1120 && sourcey<=1230))&&((destx>=180 && destx<=480)&&(desty>=360&&desty<=475)))
                    {
                        path.moveTo(nodeFaculty2X, nodeFaculty2Y);
                        path.lineTo(nodeControlX, nodeControlY);
                        //path.addCircle(nodeControlX, nodeControlY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=1120 && sourcey<=1230))&&((destx>=180 && destx<=480)&&(desty>=510&&desty<=800)))
                    {
                        path.moveTo(nodeFaculty2X, nodeFaculty2Y);
                        path.lineTo(nodeKhy1X, nodeKhy1Y);
                        //path.addCircle(nodeKhy1X, nodeKhy1Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=1120 && sourcey<=1230))&&((destx>=180 && destx<=480)&&(desty>=820&&desty<=970)))
                    {
                        path.moveTo(nodeFaculty2X, nodeFaculty2Y);
                        path.lineTo(nodeNasconX, nodeNasconY);
                        //path.addCircle(nodeNasconX, nodeNasconY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=1120 && sourcey<=1230))&&((destx>=180 && destx<=480)&&(desty>=990&&desty<=1100)))
                    {
                        path.moveTo(nodeFaculty2X, nodeFaculty2Y);
                        path.lineTo(nodeFaculty1X, nodeFaculty1Y);
                        //path.addCircle(nodeFaculty1X, nodeFaculty1Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=1120 && sourcey<=1230))&&((destx>=180 && destx<=480)&&(desty>=1250&&desty<=1360)))
                    {
                        path.moveTo(nodeFaculty2X, nodeFaculty2Y);
                        path.lineTo(nodeFaculty3X, nodeFaculty3Y);
                        //path.addCircle(nodeFaculty3X, nodeFaculty3Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=1120 && sourcey<=1230))&&((destx>=180 && destx<=480)&&(desty>=1380&&desty<=1630)))
                    {
                        path.moveTo(nodeFaculty2X, nodeFaculty2Y);
                        path.lineTo(nodeRawalX, nodeRawalY);
                        //path.addCircle(nodeRawalX, nodeRawalY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=1120 && sourcey<=1230))&&((destx>=500 && destx<=700)&&(desty>=1500&&desty<=1630)))
                    {
                        path.moveTo(nodeFaculty2X, nodeFaculty2Y);
                        path.lineTo(nodeRawalX, nodeRawalY);
                        path.lineTo(noderoomX, noderoomY);
                        //path.addCircle(noderoomX, noderoomY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=1120 && sourcey<=1230))&&((destx>=720 && destx<=1020)&&(desty>=1500&&desty<=1630)))
                    {
                        path.moveTo(nodeFaculty2X, nodeFaculty2Y);
                        path.lineTo(nodeRawalX, nodeRawalY);
                        path.lineTo(noderoomX,noderoomY);
                        path.lineTo(node211X, node211Y);
                        //path.addCircle(node211X, node211Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=1120 && sourcey<=1230))&&((destx>=720 && destx<=1020)&&(desty>=1360&&desty<=1480)))
                    {
                        path.moveTo(nodeFaculty2X, nodeFaculty2Y);
                        path.lineTo(nodeRawalX, nodeRawalY);
                        path.lineTo(node210X, node210Y);
                        //path.addCircle(node210X, node210Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=1120 && sourcey<=1230))&&((destx>=720 && destx<=1020)&&(desty>=1230&&desty<=1340)))
                    {
                        path.moveTo(nodeFaculty2X, nodeFaculty2Y);
                        path.lineTo(nodeRawalX, nodeRawalY);
                        path.lineTo(node210X, node210Y);
                        path.lineTo(nodeFaculty4X,nodeFaculty4Y);
                        //path.addCircle(nodeFaculty4X, nodeFaculty4Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=1120 && sourcey<=1230))&&((destx>=720 && destx<=1020)&&(desty>=1090&&desty<=1215)))
                    {
                        path.moveTo(nodeFaculty2X, nodeFaculty2Y);
                        path.lineTo(nodeAcademicsX, nodeAcademicsY);
                        //path.addCircle(nodeAcademicsX, nodeAcademicsY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=1120 && sourcey<=1230))&&((destx>=720 && destx<=1020)&&(desty>=990&&desty<=1070)))
                    {
                        path.moveTo(nodeFaculty2X, nodeFaculty2Y);
                        path.lineTo(nodeAcademicsX, nodeAcademicsY);
                        path.lineTo(nodeExamRoomX,nodeExamRoomY);
                        //path.addCircle(nodeExamRoomX, nodeExamRoomY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=1120 && sourcey<=1230))&&((destx>=720 && destx<=1020)&&(desty>=50&&desty<=160)))
                    {
                        path.moveTo(nodeFaculty2X, nodeFaculty2Y);
                        path.lineTo(nodeKhy2X, nodeKhy2Y);
                        path.lineTo(nodeLadiesRoomX, node2LadiesRoomY);
                        //path.addCircle(nodeLadiesRoomX, node2LadiesRoomY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=1120 && sourcey<=1230))&&((destx>=720 && destx<=1020)&&(desty>=180&&desty<=290)))
                    {
                        path.moveTo(nodeFaculty2X, nodeFaculty2Y);
                        path.lineTo(nodeKhy2X, nodeKhy2Y);
                        path.lineTo(nodeLadiesRoomX, node2LadiesRoomY);
                        path.lineTo(nodeMensRoomX, node2MensRoomY);
                        //path.addCircle(nodeMensRoomX, node2MensRoomY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=1120 && sourcey<=1230))&&((destx>=720 && destx<=1020)&&(desty>=310&&desty<=460)))
                    {
                        path.moveTo(nodeFaculty2X,nodeFaculty2Y);
                        path.lineTo(nodeControlX, nodeControlY);
                        path.lineTo(node201X, node201Y);
                        //path.addCircle(node201X, node201Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=1120 && sourcey<=1230))&&((destx>=720 && destx<=1020)&&(desty>=480&&desty<=630)))
                    {
                        path.moveTo(nodeFaculty2X, nodeFaculty2Y);
                        path.lineTo(nodeKhy1X, nodeKhy1Y);
                        path.lineTo(node202X, node202Y);
                        //path.addCircle(node202X, node202Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=1120 && sourcey<=1230))&&((destx>=720 && destx<=1020)&&(desty>=650&&desty<=800)))
                    {
                        path.moveTo(nodeFaculty2X, nodeFaculty2Y);
                        path.lineTo(nodeExamRoomX, nodeExamRoomY);
                        path.lineTo(node203X, node203Y);
                        //path.addCircle(node203X, node203Y, 10, Path.Direction.CCW);
                    }
                    if(((sourcex >=180 && sourcex<=480)&&(sourcey >=1250 && sourcey<=1360))&&((destx>=180 && destx<=480)&&(desty>=40&&desty<=330)))
                    {
                        path.moveTo(nodeFaculty3X, nodeFaculty3Y);
                        path.lineTo(nodeKhy2X, nodeKhy2Y);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=1250 && sourcey<=1360))&&((destx>=180 && destx<=480)&&(desty>=360&&desty<=475)))
                    {
                        path.moveTo(nodeFaculty3X, nodeFaculty3Y);
                        path.lineTo(nodeControlX, nodeControlY);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=1250 && sourcey<=1360))&&((destx>=180 && destx<=480)&&(desty>=510&&desty<=800)))
                    {
                        path.moveTo(nodeFaculty3X, nodeFaculty3Y);
                        path.lineTo(nodeKhy1X, nodeKhy1Y);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=1250 && sourcey<=1360))&&((destx>=180 && destx<=480)&&(desty>=820&&desty<=970)))
                    {
                        path.moveTo(nodeFaculty3X, nodeFaculty3Y);
                        path.lineTo(nodeNasconX, nodeNasconY);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=1250 && sourcey<=1360))&&((destx>=180 && destx<=480)&&(desty>=990&&desty<=1100)))
                    {
                        path.moveTo(nodeFaculty3X, nodeFaculty3Y);
                        path.lineTo(nodeFaculty1X, nodeFaculty1Y);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=1250 && sourcey<=1360))&&((destx>=180 && destx<=480)&&(desty>=1120&&desty<=1230)))
                    {
                        path.moveTo(nodeFaculty3X, nodeFaculty3Y);
                        path.lineTo(nodeFaculty2X, nodeFaculty2Y);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=1250 && sourcey<=1360))&&((destx>=180 && destx<=480)&&(desty>=1380&&desty<=1630)))
                    {
                        path.moveTo(nodeFaculty3X, nodeFaculty3Y);
                        path.lineTo(nodeRawalX, nodeRawalY);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=1250 && sourcey<=1360))&&((destx>=500 && destx<=700)&&(desty>=1500&&desty<=1630)))
                    {
                        path.moveTo(nodeFaculty3X, nodeFaculty3Y);
                        path.lineTo(nodeRawalX, nodeRawalY);
                        path.lineTo(noderoomX, noderoomY);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=1250 && sourcey<=1360))&&((destx>=720 && destx<=1020)&&(desty>=1500&&desty<=1630)))
                    {
                        path.moveTo(nodeFaculty3X, nodeFaculty3Y);
                        path.lineTo(nodeRawalX, nodeRawalY);
                        path.lineTo(noderoomX,noderoomY);
                        path.lineTo(node211X, node211Y);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=1250 && sourcey<=1360))&&((destx>=720 && destx<=1020)&&(desty>=1360&&desty<=1480)))
                    {
                        path.moveTo(nodeFaculty3X, nodeFaculty3Y);
                        path.lineTo(nodeRawalX, nodeRawalY);
                        path.lineTo(node210X, node210Y);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=1250 && sourcey<=1360))&&((destx>=720 && destx<=1020)&&(desty>=1230&&desty<=1340)))
                    {
                        path.moveTo(nodeFaculty3X, nodeFaculty3Y);
                        path.lineTo(nodeFaculty4X,nodeFaculty4Y);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=1250 && sourcey<=1360))&&((destx>=720 && destx<=1020)&&(desty>=1090&&desty<=1215)))
                    {
                        path.moveTo(nodeFaculty3X, nodeFaculty3Y);
                        path.lineTo(nodeFaculty4X, nodeFaculty4Y);
                        path.lineTo(nodeAcademicsX, nodeAcademicsY);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=1250 && sourcey<=1360))&&((destx>=720 && destx<=1020)&&(desty>=990&&desty<=1070)))
                    {
                        path.moveTo(nodeFaculty3X, nodeFaculty3Y);
                        path.lineTo(nodeFaculty4X,nodeFaculty4Y);
                        path.lineTo(nodeExamRoomX,nodeExamRoomY);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=1250 && sourcey<=1360))&&((destx>=720 && destx<=1020)&&(desty>=50&&desty<=160)))
                    {
                        path.moveTo(nodeFaculty3X, nodeFaculty3Y);
                        path.lineTo(nodeKhy2X,nodeKhy2Y);
                        path.lineTo(nodeLadiesRoomX, node2LadiesRoomY);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=1250 && sourcey<=1360))&&((destx>=720 && destx<=1020)&&(desty>=180&&desty<=290)))
                    {
                        path.moveTo(nodeFaculty3X, nodeFaculty3Y);
                        path.lineTo(nodeKhy2X, nodeKhy2Y);
                        path.lineTo(nodeLadiesRoomX, node2LadiesRoomY);
                        path.lineTo(nodeMensRoomX, node2MensRoomY);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=1250 && sourcey<=1360))&&((destx>=720 && destx<=1020)&&(desty>=310&&desty<=460)))
                    {
                        path.moveTo(nodeFaculty3X,nodeFaculty3Y);
                        path.lineTo(nodeControlX, nodeControlY);
                        path.lineTo(node201X, node201Y);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=1250 && sourcey<=1360))&&((destx>=720 && destx<=1020)&&(desty>=480&&desty<=630)))
                    {
                        path.moveTo(nodeFaculty3X, nodeFaculty3Y);
                        path.lineTo(nodeKhy1X,nodeKhy1Y);
                        path.lineTo(node202X, node202Y);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=1250 && sourcey<=1360))&&((destx>=720 && destx<=1020)&&(desty>=650&&desty<=800)))
                    {
                        path.moveTo(nodeFaculty3X, nodeFaculty3Y);
                        path.lineTo(nodeFaculty4X,nodeFaculty4Y);
                        path.lineTo(node203X, node203Y);
                    }
                    //RoomRawal
                    if(((sourcex >=180 && sourcex<=480)&&(sourcey >=1380 && sourcey<=1630))&&((destx>=180 && destx<=480)&&(desty>=40&&desty<=330)))
                    {
                        path.moveTo(nodeRawalX, nodeRawalY);
                        path.lineTo(nodeKhy2X, nodeKhy2Y);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=1380 && sourcey<=1630))&&((destx>=180 && destx<=480)&&(desty>=360&&desty<=475)))
                    {
                        path.moveTo(nodeRawalX, nodeRawalY);
                        path.lineTo(nodeControlX, nodeControlY);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=1380 && sourcey<=1630))&&((destx>=180 && destx<=480)&&(desty>=510&&desty<=800)))
                    {
                        path.moveTo(nodeRawalX, nodeRawalY);
                        path.lineTo(nodeKhy1X, nodeKhy1Y);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=1380 && sourcey<=1630))&&((destx>=180 && destx<=480)&&(desty>=820&&desty<=970)))
                    {
                        path.moveTo(nodeRawalX, nodeRawalY);
                        path.lineTo(nodeNasconX, nodeNasconY);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=1380 && sourcey<=1630))&&((destx>=180 && destx<=480)&&(desty>=990&&desty<=1100)))
                    {
                        path.moveTo(nodeRawalX, nodeRawalY);
                        path.lineTo(nodeFaculty1X, nodeFaculty1Y);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=1380 && sourcey<=1630))&&((destx>=180 && destx<=480)&&(desty>=1120&&desty<=1230)))
                    {
                        path.moveTo(nodeRawalX, nodeRawalY);
                        path.lineTo(nodeFaculty2X, nodeFaculty2Y);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=1380 && sourcey<=1630))&&((destx>=180 && destx<=480)&&(desty>=1250&&desty<=1360)))
                    {
                        path.moveTo(nodeRawalX, nodeRawalY);
                        path.lineTo(nodeFaculty3X, nodeFaculty3Y);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=1380 && sourcey<=1630))&&((destx>=500 && destx<=700)&&(desty>=1500&&desty<=1630)))
                    {
                        path.moveTo(nodeRawalX, nodeRawalY);
                        path.lineTo(noderoomX, noderoomY);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=1380 && sourcey<=1630))&&((destx>=720 && destx<=1020)&&(desty>=1500&&desty<=1630)))
                    {
                        path.moveTo(nodeRawalX, nodeRawalY);
                        path.lineTo(noderoomX,noderoomY);
                        path.lineTo(node211X, node211Y);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=1380 && sourcey<=1630))&&((destx>=720 && destx<=1020)&&(desty>=1360&&desty<=1480)))
                    {
                        path.moveTo(nodeRawalX, nodeRawalY);
                        path.lineTo(node210X, node210Y);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=1380 && sourcey<=1630))&&((destx>=720 && destx<=1020)&&(desty>=1230&&desty<=1340)))
                    {
                        path.moveTo(nodeRawalX, nodeRawalY);
                        path.lineTo(node210X, node210Y);
                        path.lineTo(nodeFaculty4X,nodeFaculty4Y);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=1380 && sourcey<=1630))&&((destx>=720 && destx<=1020)&&(desty>=1090&&desty<=1215)))
                    {
                        path.moveTo(nodeRawalX, nodeRawalY);
                        path.lineTo(node210X, node210Y);
                        path.lineTo(nodeAcademicsX, nodeAcademicsY);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=1380 && sourcey<=1630))&&((destx>=720 && destx<=1020)&&(desty>=990&&desty<=1070)))
                    {
                        path.moveTo(nodeRawalX, nodeRawalY);
                        path.lineTo(node210X, node210Y);
                        path.lineTo(nodeExamRoomX,nodeExamRoomY);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=1380 && sourcey<=1630))&&((destx>=720 && destx<=1020)&&(desty>=50&&desty<=160)))
                    {
                        path.moveTo(nodeRawalX, nodeRawalY);
                        path.lineTo(node210X, node210Y);
                        path.lineTo(nodeLadiesRoomX, node2LadiesRoomY);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=1380 && sourcey<=1630))&&((destx>=720 && destx<=1020)&&(desty>=180&&desty<=290)))
                    {
                        path.moveTo(nodeRawalX, nodeRawalY);
                        path.lineTo(node210X, node210Y);
                        path.lineTo(nodeMensRoomX, node2MensRoomY);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=1380 && sourcey<=1630))&&((destx>=720 && destx<=1020)&&(desty>=310&&desty<=460)))
                    {
                        path.moveTo(nodeRawalX, nodeRawalY);
                        path.lineTo(node210X, node210Y);
                        path.lineTo(node201X, node201Y);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=1380 && sourcey<=1630))&&((destx>=720 && destx<=1020)&&(desty>=480&&desty<=630)))
                    {
                        path.moveTo(nodeRawalX, nodeRawalY);
                        path.lineTo(node210X, node210Y);
                        path.lineTo(node202X, node202Y);
                    }
                    else if(((sourcex >=180 && sourcex<=480)&&(sourcey >=1380 && sourcey<=1630))&&((destx>=720 && destx<=1020)&&(desty>=650&&desty<=800)))
                    {
                        path.moveTo(nodeRawalX, nodeRawalY);
                        path.lineTo(node210X, node210Y);
                        path.lineTo(node203X, node203Y);
                    }
                    //RoomLadies
                    if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=50 && sourcey<=160))&&((destx>=180 && destx<=480)&&(desty>=50&&desty<=330)))
                    {
                        path.moveTo(nodeLadiesRoomX, node2LadiesRoomY);
                        path.lineTo(nodeKhy2X, nodeKhy2Y);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=50 && sourcey<=160))&&((destx>=180 && destx<=480)&&(desty>=360&&desty<=475)))
                    {
                        path.moveTo(nodeLadiesRoomX, node2LadiesRoomY);
                        path.lineTo(nodeKhy2X, nodeKhy2Y);
                        path.lineTo(nodeControlX, nodeControlY);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=50 && sourcey<=160))&&((destx>=180 && destx<=480)&&(desty>=510&&desty<=800)))
                    {
                        path.moveTo(nodeLadiesRoomX, node2LadiesRoomY);
                        path.lineTo(nodeKhy2X, nodeKhy2Y);
                        path.lineTo(nodeKhy1X, nodeKhy1Y);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=50 && sourcey<=160))&&((destx>=180 && destx<=480)&&(desty>=820&&desty<=970)))
                    {
                        path.moveTo(nodeLadiesRoomX, node2LadiesRoomY);
                        path.lineTo(nodeKhy2X, nodeKhy2Y);
                        path.lineTo(nodeNasconX, nodeNasconY);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=50 && sourcey<=160))&&((destx>=180 && destx<=480)&&(desty>=990&&desty<=1100)))
                    {
                        path.moveTo(nodeLadiesRoomX, node2LadiesRoomY);
                        path.lineTo(nodeKhy2X, nodeKhy2Y);
                        path.lineTo(nodeFaculty1X, nodeFaculty1Y);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=50 && sourcey<=160))&&((destx>=180 && destx<=480)&&(desty>=1120&&desty<=1230)))
                    {
                        path.moveTo(nodeLadiesRoomX, node2LadiesRoomY);
                        path.lineTo(nodeKhy2X, nodeKhy2Y);
                        path.lineTo(nodeFaculty2X, nodeFaculty2Y);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=50 && sourcey<=160))&&((destx>=180 && destx<=480)&&(desty>=1250&&desty<=1360)))
                    {
                        path.moveTo(nodeLadiesRoomX, node2LadiesRoomY);
                        path.lineTo(nodeKhy2X, nodeKhy2Y);
                        path.lineTo(nodeFaculty3X, nodeFaculty3Y);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=50 && sourcey<=160))&&((destx>=180 && destx<=480)&&(desty>=1380&&desty<=1630)))
                    {
                        path.moveTo(nodeLadiesRoomX, node2LadiesRoomY);
                        path.lineTo(nodeKhy2X, nodeKhy2Y);
                        path.lineTo(nodeRawalX, nodeRawalY);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=50 && sourcey<=160))&&((destx>=500 && destx<=700)&&(desty>=1500&&desty<=1630)))
                    {
                        path.moveTo(nodeLadiesRoomX, node2LadiesRoomY);
                        path.lineTo(nodeKhy2X, nodeKhy2Y);
                        path.lineTo(nodeRawalX, nodeRawalY);
                        path.lineTo(noderoomX, noderoomY);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=50 && sourcey<=160))&&((destx>=720 && destx<=1020)&&(desty>=1500&&desty<=1630)))
                    {
                        path.moveTo(nodeLadiesRoomX, node2LadiesRoomY);
                        path.lineTo(node211X, node211Y);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=50 && sourcey<=160))&&((destx>=720 && destx<=1020)&&(desty>=1360&&desty<=1480)))
                    {
                        path.moveTo(nodeLadiesRoomX, node2LadiesRoomY);
                        path.lineTo(node210X, node210Y);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=50 && sourcey<=160))&&((destx>=720 && destx<=1020)&&(desty>=1230&&desty<=1340)))
                    {
                        path.moveTo(nodeLadiesRoomX, node2LadiesRoomY);
                        path.lineTo(nodeFaculty4X,nodeFaculty4Y);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=50 && sourcey<=160))&&((destx>=720 && destx<=1020)&&(desty>=1090&&desty<=1215)))
                    {
                        path.moveTo(nodeLadiesRoomX, node2LadiesRoomY);
                        path.lineTo(nodeAcademicsX,nodeAcademicsY);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=50 && sourcey<=160))&&((destx>=720 && destx<=1020)&&(desty>=990&&desty<=1070)))
                    {
                        path.moveTo(nodeLadiesRoomX, node2LadiesRoomY);
                        path.lineTo(nodeExamRoomX,nodeExamRoomY);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=50 && sourcey<=160))&&((destx>=720 && destx<=1020)&&(desty>=180&&desty<=290)))
                    {
                        path.moveTo(nodeLadiesRoomX, node2LadiesRoomY);
                        path.lineTo(nodeMensRoomX, node2MensRoomY);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=50 && sourcey<=160))&&((destx>=720 && destx<=1020)&&(desty>=310&&desty<=460)))
                    {
                        path.moveTo(nodeLadiesRoomX, node2LadiesRoomY);
                        path.lineTo(node201X, node201Y);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=50 && sourcey<=160))&&((destx>=720 && destx<=1020)&&(desty>=480&&desty<=630)))
                    {
                        path.moveTo(nodeLadiesRoomX, node2LadiesRoomY);
                        path.lineTo(node202X, node202Y);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=50 && sourcey<=160))&&((destx>=720 && destx<=1020)&&(desty>=650&&desty<=800)))
                    {
                        path.moveTo(nodeLadiesRoomX, node2LadiesRoomY);
                        path.lineTo(node203X, node203Y);
                    }
                    //MensRoom
                    if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=180 && sourcey<=290))&&((destx>=180 && destx<=480)&&(desty>=50&&desty<=330)))
                    {
                        path.moveTo(nodeMensRoomX, node2MensRoomY);
                        path.lineTo(nodeLadiesRoomX, node2LadiesRoomY);
                        path.lineTo(nodeKhy2X, nodeKhy2Y);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=180 && sourcey<=290))&&((destx>=180 && destx<=480)&&(desty>=360&&desty<=475)))
                    {
                        path.moveTo(nodeMensRoomX, node2MensRoomY);
                        path.lineTo(node201X, node201Y);
                        path.lineTo(nodeControlX, nodeControlY);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=180 && sourcey<=290))&&((destx>=180 && destx<=480)&&(desty>=510&&desty<=800)))
                    {
                        path.moveTo(nodeMensRoomX, node2MensRoomY);
                        path.lineTo(node202X, node202Y);
                        path.lineTo(nodeKhy1X, nodeKhy1Y);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=180 && sourcey<=290))&&((destx>=180 && destx<=480)&&(desty>=820&&desty<=970)))
                    {
                        path.moveTo(nodeMensRoomX, node2MensRoomY);
                        path.lineTo(node202X, node202Y);
                        path.lineTo(nodeKhy1X, nodeKhy1Y);
                        path.lineTo(nodeNasconX, nodeNasconY);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=180 && sourcey<=290))&&((destx>=180 && destx<=480)&&(desty>=990&&desty<=1100)))
                    {
                        path.moveTo(nodeMensRoomX, node2MensRoomY);
                        path.lineTo(node202X, node202Y);
                        path.lineTo(nodeKhy1X, nodeKhy1Y);
                        path.lineTo(nodeFaculty1X, nodeFaculty1Y);
                        path.addCircle(nodeFaculty1X,nodeFaculty1Y,10,Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=180 && sourcey<=290))&&((destx>=180 && destx<=480)&&(desty>=1120&&desty<=1230)))
                    {
                        path.moveTo(nodeMensRoomX, node2MensRoomY);
                        path.lineTo(node202X, node202Y);
                        path.lineTo(nodeKhy1X, nodeKhy1Y);
                        path.lineTo(nodeFaculty2X, nodeFaculty2Y);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=180 && sourcey<=290))&&((destx>=180 && destx<=480)&&(desty>=1250&&desty<=1360)))
                    {
                        path.moveTo(nodeMensRoomX, node2MensRoomY);
                        path.lineTo(node202X, node202Y);
                        path.lineTo(nodeKhy1X, nodeKhy1Y);
                        path.lineTo(nodeFaculty3X, nodeFaculty3Y);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=180 && sourcey<=290))&&((destx>=180 && destx<=480)&&(desty>=1380&&desty<=1630)))
                    {
                        path.moveTo(nodeMensRoomX, node2MensRoomY);
                        path.lineTo(node202X, node202Y);
                        path.lineTo(nodeKhy1X, nodeKhy1Y);
                        path.lineTo(nodeRawalX, nodeRawalY);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=180 && sourcey<=290))&&((destx>=500 && destx<=700)&&(desty>=1500&&desty<=1630)))
                    {
                        path.moveTo(nodeMensRoomX, node2MensRoomY);
                        path.lineTo(node211X, node211Y);
                        path.lineTo(noderoomX, noderoomY);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=180 && sourcey<=290))&&((destx>=720 && destx<=1020)&&(desty>=1500&&desty<=1630)))
                    {
                        path.moveTo(nodeMensRoomX, node2MensRoomY);
                        path.lineTo(node211X, node211Y);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=180 && sourcey<=290))&&((destx>=720 && destx<=1020)&&(desty>=1360&&desty<=1480)))
                    {
                        path.moveTo(nodeMensRoomX, node2MensRoomY);
                        path.lineTo(node210X, node210Y);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=180 && sourcey<=290))&&((destx>=720 && destx<=1020)&&(desty>=1230&&desty<=1340)))
                    {
                        path.moveTo(nodeMensRoomX, node2MensRoomY);
                        path.lineTo(nodeFaculty4X,nodeFaculty4Y);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=180 && sourcey<=290))&&((destx>=720 && destx<=1020)&&(desty>=1090&&desty<=1215)))
                    {
                        path.moveTo(nodeMensRoomX, node2MensRoomY);
                        path.lineTo(nodeAcademicsX,nodeAcademicsY);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=180 && sourcey<=290))&&((destx>=720 && destx<=1020)&&(desty>=990&&desty<=1070)))
                    {
                        path.moveTo(nodeMensRoomX, node2MensRoomY);
                        path.lineTo(nodeExamRoomX,nodeExamRoomY);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=180 && sourcey<=290))&&((destx>=720 && destx<=1020)&&(desty>=50&&desty<=160)))
                    {
                        path.moveTo(nodeMensRoomX, node2MensRoomY);
                        path.lineTo(nodeLadiesRoomX, node2LadiesRoomY);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=180 && sourcey<=290))&&((destx>=720 && destx<=1020)&&(desty>=310&&desty<=460)))
                    {
                        path.moveTo(nodeMensRoomX, node2MensRoomY);
                        path.lineTo(node201X, node201Y);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=180 && sourcey<=290))&&((destx>=720 && destx<=1020)&&(desty>=480&&desty<=630)))
                    {
                        path.moveTo(nodeMensRoomX, node2MensRoomY);
                        path.lineTo(node202X, node202Y);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=190 && sourcey<=290))&&((destx>=720 && destx<=1020)&&(desty>=650&&desty<=800)))
                    {
                        path.moveTo(nodeMensRoomX, node2MensRoomY);
                        path.lineTo(node203X, node203Y);
                    }

                    //Room201
                    if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=310 && sourcey<=460))&&((destx>=180 && destx<=480)&&(desty>=50&&desty<=330)))
                    {
                        path.moveTo(node201X, node201Y);
                        path.lineTo(nodeLadiesRoomX, node2LadiesRoomY);
                        path.lineTo(nodeKhy2X, nodeKhy2Y);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=310 && sourcey<=460))&&((destx>=180 && destx<=480)&&(desty>=360&&desty<=475)))
                    {
                        path.moveTo(node201X, node201Y);
                        path.lineTo(nodeControlX, nodeControlY);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=310 && sourcey<=460))&&((destx>=180 && destx<=480)&&(desty>=510&&desty<=800)))
                    {
                        path.moveTo(node201X, node201Y);
                        path.lineTo(nodeControlX, nodeControlY);
                        path.lineTo(nodeKhy1X, nodeKhy1Y);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=310 && sourcey<=460))&&((destx>=180 && destx<=480)&&(desty>=820&&desty<=970)))
                    {
                        path.moveTo(node201X, node201Y);
                        path.lineTo(nodeControlX, nodeControlY);
                        path.lineTo(nodeNasconX, nodeNasconY);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=310 && sourcey<=460))&&((destx>=180 && destx<=480)&&(desty>=990&&desty<=1100)))
                    {
                        path.moveTo(node201X, node202Y);
                        path.lineTo(nodeControlX, nodeControlY);
                        path.lineTo(nodeFaculty1X, nodeFaculty1Y);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=310 && sourcey<=460))&&((destx>=180 && destx<=480)&&(desty>=1120&&desty<=1230)))
                    {
                        path.moveTo(node201X, node201Y);
                        path.lineTo(nodeControlX, nodeControlY);
                        path.lineTo(nodeFaculty2X, nodeFaculty2Y);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=310 && sourcey<=460))&&((destx>=180 && destx<=480)&&(desty>=1250&&desty<=1360)))
                    {
                        path.moveTo(node201X, node201Y);
                        path.lineTo(nodeControlX, nodeControlY);
                        path.lineTo(nodeFaculty3X, nodeFaculty3Y);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=310 && sourcey<=460))&&((destx>=180 && destx<=480)&&(desty>=1380&&desty<=1630)))
                    {
                        path.moveTo(node201X, node201Y);
                        path.lineTo(nodeControlX, nodeControlY);
                        path.lineTo(nodeRawalX, nodeRawalY);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=310 && sourcey<=460))&&((destx>=500 && destx<=700)&&(desty>=1500&&desty<=1630)))
                    {
                        path.moveTo(node201X, node201Y);
                        path.lineTo(node211X, node211Y);
                        path.lineTo(noderoomX, noderoomY);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=310 && sourcey<=460))&&((destx>=720 && destx<=1020)&&(desty>=1500&&desty<=1630)))
                    {
                        path.moveTo(node201X, node201Y);
                        path.lineTo(node211X, node211Y);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=310 && sourcey<=460))&&((destx>=720 && destx<=1020)&&(desty>=1360&&desty<=1480)))
                    {
                        path.moveTo(node201X, node201Y);
                        path.lineTo(node210X, node210Y);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=310 && sourcey<=460))&&((destx>=720 && destx<=1020)&&(desty>=1230&&desty<=1340)))
                    {
                        path.moveTo(node201X, node201Y);
                        path.lineTo(nodeFaculty4X,nodeFaculty4Y);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=310 && sourcey<=460))&&((destx>=720 && destx<=1020)&&(desty>=1090&&desty<=1215)))
                    {
                        path.moveTo(node201X, node201Y);
                        path.lineTo(nodeAcademicsX,nodeAcademicsY);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=310 && sourcey<=460))&&((destx>=720 && destx<=1020)&&(desty>=990&&desty<=1070)))
                    {
                        path.moveTo(node201X, node201Y);
                        path.lineTo(nodeExamRoomX,nodeExamRoomY);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=310 && sourcey<=460))&&((destx>=720 && destx<=1020)&&(desty>=50&&desty<=160)))
                    {
                        path.moveTo(node201X, node201Y);
                        path.lineTo(nodeLadiesRoomX, node2LadiesRoomY);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=310 && sourcey<=460))&&((destx>=720 && destx<=1020)&&(desty>=180&&desty<=290)))
                    {
                        path.moveTo(node201X, node201Y);
                        path.lineTo(nodeMensRoomX, node2MensRoomY);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=310 && sourcey<=460))&&((destx>=720 && destx<=1020)&&(desty>=480&&desty<=630)))
                    {
                        path.moveTo(node201X, node201Y);
                        path.lineTo(node202X, node202Y);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=310 && sourcey<=460))&&((destx>=720 && destx<=1020)&&(desty>=650&&desty<=800)))
                    {
                        path.moveTo(node201X, node201Y);
                        path.lineTo(node203X, node203Y);
                    }
                    //Room202

                    if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=480 && sourcey<=630))&&((destx>=180 && destx<=480)&&(desty>=50&&desty<=330)))
                    {
                        path.moveTo(node202X, node202Y);
                        path.lineTo(nodeLadiesRoomX, node2LadiesRoomY);
                        path.lineTo(nodeKhy2X, nodeKhy2Y);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=480 && sourcey<=630))&&((destx>=180 && destx<=480)&&(desty>=360&&desty<=475)))
                    {
                        path.moveTo(node202X, node202Y);
                        path.lineTo(node201X,node201Y);
                        path.lineTo(nodeControlX, nodeControlY);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=480 && sourcey<=630))&&((destx>=180 && destx<=480)&&(desty>=510&&desty<=800)))
                    {
                        path.moveTo(node202X, node202Y);
                        path.lineTo(nodeKhy1X, nodeKhy1Y);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=480 && sourcey<=630))&&((destx>=180 && destx<=480)&&(desty>=820&&desty<=970)))
                    {
                        path.moveTo(node202X, node202Y);
                        path.lineTo(nodeKhy1X, nodeKhy1Y);
                        path.lineTo(nodeNasconX, nodeNasconY);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=480 && sourcey<=630))&&((destx>=180 && destx<=480)&&(desty>=990&&desty<=1100)))
                    {
                        path.moveTo(node202X, node202Y);
                        path.lineTo(nodeKhy1X, nodeKhy1Y);
                        path.lineTo(nodeFaculty1X, nodeFaculty1Y);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=480 && sourcey<=630))&&((destx>=180 && destx<=480)&&(desty>=1120&&desty<=1230)))
                    {
                        path.moveTo(node202X, node202Y);
                        path.lineTo(nodeKhy1X, nodeKhy1Y);
                        path.lineTo(nodeFaculty2X, nodeFaculty2Y);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=480 && sourcey<=630))&&((destx>=180 && destx<=480)&&(desty>=1250&&desty<=1360)))
                    {
                        path.moveTo(node202X, node202Y);
                        path.lineTo(nodeKhy1X, nodeKhy1Y);
                        path.lineTo(nodeFaculty3X, nodeFaculty3Y);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=480 && sourcey<=630))&&((destx>=180 && destx<=480)&&(desty>=1380&&desty<=1630)))
                    {
                        path.moveTo(node202X, node202Y);
                        path.lineTo(nodeKhy1X, nodeKhy1Y);
                        path.lineTo(nodeRawalX, nodeRawalY);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=480 && sourcey<=630))&&((destx>=500 && destx<=700)&&(desty>=1500&&desty<=1630)))
                    {
                        path.moveTo(node202X, node202Y);
                        path.lineTo(node211X, node211Y);
                        path.lineTo(noderoomX, noderoomY);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=480 && sourcey<=630))&&((destx>=720 && destx<=1020)&&(desty>=1500&&desty<=1630)))
                    {
                        path.moveTo(node202X, node202Y);
                        path.lineTo(node211X, node211Y);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=480 && sourcey<=630))&&((destx>=720 && destx<=1020)&&(desty>=1360&&desty<=1480)))
                    {
                        path.moveTo(node202X, node202Y);
                        path.lineTo(node210X, node210Y);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=480 && sourcey<=630))&&((destx>=720 && destx<=1020)&&(desty>=1230&&desty<=1340)))
                    {
                        path.moveTo(node202X, node202Y);
                        path.lineTo(nodeFaculty4X,nodeFaculty4Y);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=480 && sourcey<=630))&&((destx>=720 && destx<=1020)&&(desty>=1090&&desty<=1215)))
                    {
                        path.moveTo(node202X, node202Y);
                        path.lineTo(nodeAcademicsX,nodeAcademicsY);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=480 && sourcey<=630))&&((destx>=720 && destx<=1020)&&(desty>=990&&desty<=1070)))
                    {
                        path.moveTo(node202X, node202Y);
                        path.lineTo(nodeExamRoomX,nodeExamRoomY);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=480 && sourcey<=630))&&((destx>=720 && destx<=1020)&&(desty>=50&&desty<=160)))
                    {
                        path.moveTo(node202X, node202Y);
                        path.lineTo(nodeLadiesRoomX, node2LadiesRoomY);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=480 && sourcey<=630))&&((destx>=720 && destx<=1020)&&(desty>=180&&desty<=290)))
                    {
                        path.moveTo(node202X, node202Y);
                        path.lineTo(nodeMensRoomX, node2MensRoomY);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=480 && sourcey<=630))&&((destx>=720 && destx<=1020)&&(desty>=310&&desty<=460)))
                    {
                        path.moveTo(node202X, node202Y);
                        path.lineTo(node201X, node201Y);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=480 && sourcey<=630))&&((destx>=720 && destx<=1020)&&(desty>=650&&desty<=800)))
                    {
                        path.moveTo(node202X, node202Y);
                        path.lineTo(node203X, node203Y);
                    }
                    //Room203

                    if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=650 && sourcey<=800))&&((destx>=180 && destx<=480)&&(desty>=50&&desty<=330)))
                    {
                        path.moveTo(node203X, node203Y);
                        path.lineTo(nodeLadiesRoomX, node2LadiesRoomY);
                        path.lineTo(nodeKhy2X, nodeKhy2Y);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=650 && sourcey<=800))&&((destx>=180 && destx<=480)&&(desty>=360&&desty<=475)))
                    {
                        path.moveTo(node203X, node203Y);
                        path.lineTo(node201X,node201Y);
                        path.lineTo(nodeControlX, nodeControlY);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=650 && sourcey<=800))&&((destx>=180 && destx<=480)&&(desty>=510&&desty<=800)))
                    {
                        path.moveTo(node203X, node203Y);
                        path.lineTo(node202X,node202Y);
                        path.lineTo(nodeKhy1X, nodeKhy1Y);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=650 && sourcey<=800))&&((destx>=180 && destx<=480)&&(desty>=820&&desty<=970)))
                    {
                        path.moveTo(node203X, node203Y);
                        path.lineTo(node202X, node202Y);
                        path.lineTo(nodeKhy1X, nodeKhy1Y);
                        path.lineTo(nodeNasconX, nodeNasconY);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=650 && sourcey<=800))&&((destx>=180 && destx<=480)&&(desty>=990&&desty<=1100)))
                    {
                        path.moveTo(node203X, node203Y);
                        path.lineTo(node202X, node202Y);
                        path.lineTo(nodeKhy1X, nodeKhy1Y);
                        path.lineTo(nodeFaculty1X, nodeFaculty1Y);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=650 && sourcey<=800))&&((destx>=180 && destx<=480)&&(desty>=1120&&desty<=1230)))
                    {
                        path.moveTo(node203X, node203Y);
                        path.lineTo(node202X, node202Y);
                        path.lineTo(nodeKhy1X, nodeKhy1Y);
                        path.lineTo(nodeFaculty2X, nodeFaculty2Y);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=650 && sourcey<=800))&&((destx>=180 && destx<=480)&&(desty>=1250&&desty<=1360)))
                    {
                        path.moveTo(node203X, node203Y);
                        path.lineTo(node202X, node202Y);
                        path.lineTo(nodeKhy1X, nodeKhy1Y);
                        path.lineTo(nodeFaculty3X, nodeFaculty3Y);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=650 && sourcey<=800))&&((destx>=180 && destx<=480)&&(desty>=1380&&desty<=1630)))
                    {
                        path.moveTo(node203X, node203Y);
                        path.lineTo(node202X,node202Y);
                        path.lineTo(nodeKhy1X, nodeKhy1Y);
                        path.lineTo(nodeRawalX, nodeRawalY);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=650 && sourcey<=800))&&((destx>=500 && destx<=700)&&(desty>=1500&&desty<=1630)))
                    {
                        path.moveTo(node203X, node203Y);
                        path.lineTo(node211X, node211Y);
                        path.lineTo(noderoomX, noderoomY);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=650 && sourcey<=800))&&((destx>=720 && destx<=1020)&&(desty>=1500&&desty<=1630)))
                    {
                        path.moveTo(node203X, node203Y);
                        path.lineTo(node211X, node211Y);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=650 && sourcey<=800))&&((destx>=720 && destx<=1020)&&(desty>=1360&&desty<=1480)))
                    {
                        path.moveTo(node203X, node203Y);
                        path.lineTo(node210X, node210Y);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=650 && sourcey<=800))&&((destx>=720 && destx<=1020)&&(desty>=1230&&desty<=1340)))
                    {
                        path.moveTo(node203X, node203Y);
                        path.lineTo(nodeFaculty4X,nodeFaculty4Y);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=650 && sourcey<=800))&&((destx>=720 && destx<=1020)&&(desty>=1090&&desty<=1215)))
                    {
                        path.moveTo(node203X, node203Y);
                        path.lineTo(nodeAcademicsX,nodeAcademicsY);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=650 && sourcey<=800))&&((destx>=720 && destx<=1020)&&(desty>=990&&desty<=1070)))
                    {
                        path.moveTo(node203X, node203Y);
                        path.lineTo(nodeExamRoomX,nodeExamRoomY);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=650 && sourcey<=800))&&((destx>=720 && destx<=1020)&&(desty>=50&&desty<=160)))
                    {
                        path.moveTo(node203X, node203Y);
                        path.lineTo(nodeLadiesRoomX, node2LadiesRoomY);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=650 && sourcey<=800))&&((destx>=720 && destx<=1020)&&(desty>=180&&desty<=290)))
                    {
                        path.moveTo(node203X, node203Y);
                        path.lineTo(nodeMensRoomX, node2MensRoomY);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=650 && sourcey<=800))&&((destx>=720 && destx<=1020)&&(desty>=310&&desty<=460)))
                    {
                        path.moveTo(node203X, node203Y);
                        path.lineTo(node201X, node201Y);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=650 && sourcey<=800))&&((destx>=720 && destx<=1020)&&(desty>=480&&desty<=630)))
                    {
                        path.moveTo(node203X, node203Y);
                        path.lineTo(node202X, node202Y);
                    }


                    //RoomExam
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=990 && sourcey<=1070))&&((destx>=180 && destx<=480)&&(desty>=50&&desty<=330)))
                    {
                        path.moveTo(nodeExamRoomX, nodeExamRoomY);
                        path.lineTo(nodeLadiesRoomX, node2LadiesRoomY);
                        path.lineTo(nodeKhy2X, nodeKhy2Y);
                       // path.addCircle(nodeKhy2X, nodeKhy2Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=990 && sourcey<=1070))&&((destx>=180 && destx<=480)&&(desty>=360&&desty<=475)))
                    {
                        path.moveTo(nodeExamRoomX, nodeExamRoomY);
                        path.lineTo(node201X, node201Y);
                        path.lineTo(nodeControlX, nodeControlY);
                    //    path.addCircle(nodeControlX, nodeControlY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=990 && sourcey<=1070))&&((destx>=180 && destx<=480)&&(desty>=510&&desty<=800)))
                    {
                        path.moveTo(nodeExamRoomX, nodeExamRoomY);
                        path.lineTo(node202X, node202Y);
                        path.lineTo(nodeKhy1X, nodeKhy1Y);

                      //  path.addCircle(nodeKhy1X, nodeKhy1Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=990 && sourcey<=1070))&&((destx>=180 && destx<=480)&&(desty>=820&&desty<=970)))
                    {
                        path.moveTo(nodeExamRoomX, nodeExamRoomY);
                        path.lineTo(node202X, node202Y);
                        path.lineTo(nodeKhy1X, nodeKhy1Y);
                        path.lineTo(nodeNasconX, nodeNasconY);
  //                      path.addCircle(nodeNasconX, nodeNasconY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=990 && sourcey<=1070))&&((destx>=180 && destx<=480)&&(desty>=990&&desty<=1100)))
                    {
                        path.moveTo(nodeExamRoomX, nodeExamRoomY);
                        path.lineTo(nodeFaculty1X, nodeFaculty1Y);
                        //path.addCircle(nodeFaculty1X, nodeFaculty1Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=990 && sourcey<=1070))&&((destx>=180 && destx<=480)&&(desty>=1120&&desty<=1230)))
                    {
                        path.moveTo(nodeExamRoomX, nodeExamRoomY);
                        path.lineTo(nodeFaculty1X, nodeFaculty1Y);
                        path.lineTo(nodeFaculty2X, nodeFaculty2Y);
                      //  path.addCircle(nodeFaculty2X, nodeFaculty2Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=990 && sourcey<=1070))&&((destx>=180 && destx<=480)&&(desty>=1250&&desty<=1360)))
                    {
                        path.moveTo(nodeExamRoomX, nodeExamRoomY);
                        path.lineTo(nodeFaculty1X, nodeFaculty1Y);
                        path.lineTo(nodeFaculty3X, nodeFaculty3Y);
                    //    path.addCircle(nodeFaculty3X, nodeFaculty3Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=990 && sourcey<=1070))&&((destx>=180 && destx<=480)&&(desty>=1380&&desty<=1630)))
                    {
                        path.moveTo(nodeExamRoomX, nodeExamRoomY);
                        path.lineTo(nodeFaculty1X, nodeFaculty1Y);
                        path.lineTo(nodeRawalX, nodeRawalY);
                  //      path.addCircle(nodeRawalX, nodeRawalY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=990 && sourcey<=1070))&&((destx>=500 && destx<=700)&&(desty>=1500&&desty<=1630)))
                    {
                        path.moveTo(nodeExamRoomX, nodeExamRoomY);
                        path.lineTo(node211X, node211Y);
                        path.lineTo(noderoomX, noderoomY);
                //        path.addCircle(noderoomX, noderoomY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=990 && sourcey<=1070))&&((destx>=720 && destx<=1020)&&(desty>=1500&&desty<=1630)))
                    {
                        path.moveTo(nodeExamRoomX, nodeExamRoomY);
                        path.lineTo(node211X, node211Y);
              //          path.addCircle(node211X, node211Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=990 && sourcey<=1070))&&((destx>=720 && destx<=1020)&&(desty>=1360&&desty<=1480)))
                    {
                        path.moveTo(nodeExamRoomX, nodeExamRoomY);
                        path.lineTo(node210X, node210Y);
            //            path.addCircle(node210X, node210Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=990 && sourcey<=1070))&&((destx>=720 && destx<=1020)&&(desty>=1230&&desty<=1340)))
                    {
                        path.moveTo(nodeExamRoomX, nodeExamRoomY);
                        path.lineTo(nodeFaculty4X, nodeFaculty4Y);
          //              path.addCircle(nodeFaculty4X, nodeFaculty4Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=990 && sourcey<=1070))&&((destx>=720 && destx<=1020)&&(desty>=1090&&desty<=1215)))
                    {
                        path.moveTo(nodeExamRoomX, nodeExamRoomY);
                        path.lineTo(nodeAcademicsX, nodeAcademicsY);
        //                path.addCircle(nodeAcademicsX, nodeAcademicsY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=990 && sourcey<=1070))&&((destx>=720 && destx<=1020)&&(desty>=650&&desty<=800)))
                    {
                        path.moveTo(nodeExamRoomX, nodeExamRoomY);
                        path.lineTo(node203X, node203Y);
      //                  path.addCircle(node203X, node203Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=990 && sourcey<=1070))&&((destx>=720 && destx<=1020)&&(desty>=50&&desty<=160)))
                    {
                        path.moveTo(nodeExamRoomX, nodeExamRoomY);
                        path.lineTo(nodeLadiesRoomX, node2LadiesRoomY);
    //                    path.addCircle(nodeLadiesRoomX, node2LadiesRoomY, 10, Path.Direction.CCW);

                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=990 && sourcey<=1070))&&((destx>=720 && destx<=1020)&&(desty>=180&&desty<=290)))
                    {
                        path.moveTo(nodeExamRoomX, nodeExamRoomY);
                        path.lineTo(nodeMensRoomX, node2MensRoomY);
  //                      path.addCircle(nodeMensRoomX, node2MensRoomY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=990 && sourcey<=1070))&&((destx>=720 && destx<=1020)&&(desty>=310&&desty<=460)))
                    {
                        path.moveTo(nodeExamRoomX, nodeExamRoomY);
                        path.lineTo(node201X, node201Y);
//                        path.addCircle(node201X, node201Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=990 && sourcey<=1070))&&((destx>=720 && destx<=1020)&&(desty>=480&&desty<=630)))
                    {
                        path.moveTo(nodeExamRoomX, nodeExamRoomY);
                        path.lineTo(node202X, node202Y);
             //           path.addCircle(node202X, node202Y, 10, Path.Direction.CCW);
                    }
                    //RoomAcademics
                    if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1090 && sourcey<=1215))&&((destx>=180 && destx<=480)&&(desty>=50&&desty<=330)))
                    {
                        path.moveTo(nodeAcademicsX, nodeAcademicsY);
                        path.lineTo(nodeLadiesRoomX, node2LadiesRoomY);
                        path.lineTo(nodeKhy2X, nodeKhy2Y);
           //             path.addCircle(nodeKhy2X, nodeKhy2Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1090 && sourcey<=1215))&&((destx>=180 && destx<=480)&&(desty>=360&&desty<=475)))
                    {
                        path.moveTo(nodeAcademicsX, nodeAcademicsY);
                        path.lineTo(node201X, node201Y);
                        path.lineTo(nodeControlX, nodeControlY);
                   //     path.addCircle(nodeControlX, nodeControlY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1090 && sourcey<=1215))&&((destx>=180 && destx<=480)&&(desty>=510&&desty<=800)))
                    {
                        path.moveTo(nodeAcademicsX, nodeAcademicsY);
                        path.lineTo(node202X, node202Y);
                        path.lineTo(nodeKhy1X, nodeKhy1Y);
                   //     path.addCircle(nodeKhy1X, nodeKhy1Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1090 && sourcey<=1215))&&((destx>=180 && destx<=480)&&(desty>=820&&desty<=970)))
                    {
                        path.moveTo(nodeAcademicsX, nodeAcademicsY);
                        path.lineTo(node202X, node202Y);
                        path.lineTo(nodeKhy1X, nodeKhy1Y);
                        path.lineTo(nodeNasconX, nodeNasconY);
                   //     path.addCircle(nodeNasconX, nodeNasconY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1090 && sourcey<=1215))&&((destx>=180 && destx<=480)&&(desty>=990&&desty<=1100)))
                    {
                        path.moveTo(nodeAcademicsX, nodeAcademicsY);
                        path.lineTo(nodeExamRoomX, nodeExamRoomY);
                        path.lineTo(nodeFaculty1X, nodeFaculty1Y);
                   //     path.addCircle(nodeFaculty1X, nodeFaculty1Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1090 && sourcey<=1215))&&((destx>=180 && destx<=480)&&(desty>=1120&&desty<=1230)))
                    {
                        path.moveTo(nodeAcademicsX, nodeAcademicsY);
                        path.lineTo(nodeFaculty2X, nodeFaculty2Y);
                    //    path.addCircle(nodeFaculty2X, nodeFaculty2Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1090 && sourcey<=1215))&&((destx>=180 && destx<=480)&&(desty>=1250&&desty<=1360)))
                    {
                        path.moveTo(nodeAcademicsX, nodeAcademicsY);
                        path.lineTo(nodeFaculty2X, nodeFaculty2Y);
                        path.lineTo(nodeFaculty3X, nodeFaculty3Y);
                    //    path.addCircle(nodeFaculty3X, nodeFaculty3Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1090 && sourcey<=1215))&&((destx>=180 && destx<=480)&&(desty>=1380&&desty<=1630)))
                    {
                        path.moveTo(nodeAcademicsX, nodeAcademicsY);
                        path.lineTo(nodeFaculty2X, nodeFaculty2Y);
                        path.lineTo(nodeRawalX, nodeRawalY);
                   //     path.addCircle(nodeRawalX, nodeRawalY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1090 && sourcey<=1215))&&((destx>=500 && destx<=700)&&(desty>=1500&&desty<=1630)))
                    {
                        path.moveTo(nodeAcademicsX, nodeAcademicsY);
                        path.lineTo(node211X, node211Y);
                        path.lineTo(noderoomX, noderoomY);
                   //     path.addCircle(noderoomX, noderoomY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1090 && sourcey<=1215))&&((destx>=720 && destx<=1020)&&(desty>=1500&&desty<=1630)))
                    {
                        path.moveTo(nodeAcademicsX, nodeAcademicsY);
                        path.lineTo(node211X, node211Y);
                   //     path.addCircle(node211X, node211Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1090 && sourcey<=1215))&&((destx>=720 && destx<=1020)&&(desty>=1360&&desty<=1480)))
                    {
                        path.moveTo(nodeAcademicsX, nodeAcademicsY);
                        path.lineTo(node210X, node210Y);
                   //     path.addCircle(node210X, node210Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1090 && sourcey<=1215))&&((destx>=720 && destx<=1020)&&(desty>=1230&&desty<=1340)))
                    {
                        path.moveTo(nodeAcademicsX, nodeAcademicsY);
                        path.lineTo(nodeFaculty4X, nodeFaculty4Y);
                   //     path.addCircle(nodeFaculty4X, nodeFaculty4Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1090 && sourcey<=1215))&&((destx>=720 && destx<=1020)&&(desty>=990&&desty<=1070)))
                    {
                        path.moveTo(nodeAcademicsX, nodeAcademicsY);
                        path.lineTo(nodeExamRoomX, nodeExamRoomY);
                   //     path.addCircle(nodeExamRoomX, nodeExamRoomY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1090 && sourcey<=1215))&&((destx>=720 && destx<=1020)&&(desty>=650&&desty<=800)))
                    {
                        path.moveTo(nodeAcademicsX, nodeAcademicsY);
                        path.lineTo(node203X, node203Y);
                   //     path.addCircle(node203X, node203Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1090 && sourcey<=1215))&&((destx>=720 && destx<=1020)&&(desty>=50&&desty<=160)))
                    {
                        path.moveTo(nodeAcademicsX, nodeAcademicsY);
                        path.lineTo(nodeLadiesRoomX, node2LadiesRoomY);
                    //    path.addCircle(nodeLadiesRoomX, node2LadiesRoomY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1090 && sourcey<=1215))&&((destx>=720 && destx<=1020)&&(desty>=180&&desty<=290)))
                    {
                        path.moveTo(nodeAcademicsX, nodeAcademicsY);
                        path.lineTo(nodeMensRoomX, node2MensRoomY);
                   //     path.addCircle(nodeMensRoomX, node2MensRoomY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1090 && sourcey<=1215))&&((destx>=720 && destx<=1020)&&(desty>=310&&desty<=460)))
                    {
                        path.moveTo(nodeAcademicsX, nodeAcademicsY);
                        path.lineTo(node201X, node201Y);
                    //    path.addCircle(node201X, node201Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1090 && sourcey<=1215))&&((destx>=720 && destx<=1020)&&(desty>=480&&desty<=630)))
                    {
                        path.moveTo(nodeAcademicsX, nodeAcademicsY);
                        path.lineTo(node202X, node202Y);
                    //    path.addCircle(node202X, node202Y, 10, Path.Direction.CCW);
                    }
                    //Room4Faculty
                    if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1230 && sourcey<=1340))&&((destx>=180 && destx<=480)&&(desty>=50&&desty<=330)))
                    {
                        path.moveTo(nodeFaculty4X, nodeFaculty4Y);
                        path.lineTo(nodeLadiesRoomX, node2LadiesRoomY);
                        path.lineTo(nodeKhy2X, nodeKhy2Y);
                    //    path.addCircle(nodeKhy2X, nodeKhy2Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1230 && sourcey<=1340))&&((destx>=180 && destx<=480)&&(desty>=360&&desty<=475)))
                    {
                        path.moveTo(nodeFaculty4X, nodeFaculty4Y);
                        path.lineTo(node201X, node201Y);
                        path.lineTo(nodeControlX, nodeControlY);
                    //    path.addCircle(nodeControlX, nodeControlY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1230 && sourcey<=1340))&&((destx>=180 && destx<=480)&&(desty>=510&&desty<=800)))
                    {
                        path.moveTo(nodeFaculty4X, nodeFaculty4Y);
                        path.lineTo(node202X, node202Y);
                        path.lineTo(nodeKhy1X, nodeKhy1Y);
                    //    path.addCircle(nodeKhy1X, nodeKhy1Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1230 && sourcey<=1340))&&((destx>=180 && destx<=480)&&(desty>=820&&desty<=970)))
                    {
                        path.moveTo(nodeFaculty4X, nodeFaculty4Y);
                        path.lineTo(node202X, node202Y);
                        path.lineTo(nodeKhy1X, nodeKhy1Y);
                        path.lineTo(nodeNasconX, nodeNasconY);
                    //    path.addCircle(nodeNasconX, nodeNasconY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1230 && sourcey<=1340))&&((destx>=180 && destx<=480)&&(desty>=990&&desty<=1100)))
                    {
                        path.moveTo(nodeFaculty4X, nodeFaculty4Y);
                        path.lineTo(nodeExamRoomX, nodeExamRoomY);
                        path.lineTo(nodeFaculty1X, nodeFaculty1Y);
                    //    path.addCircle(nodeFaculty1X, nodeFaculty1Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1230 && sourcey<=1340))&&((destx>=180 && destx<=480)&&(desty>=1120&&desty<=1230)))
                    {
                        path.moveTo(nodeFaculty4X, nodeFaculty4Y);
                        path.lineTo(nodeAcademicsX, nodeAcademicsY);
                        path.lineTo(nodeFaculty2X, nodeFaculty2Y);
                    //    path.addCircle(nodeFaculty2X, nodeFaculty2Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1230 && sourcey<=1340))&&((destx>=180 && destx<=480)&&(desty>=1250&&desty<=1360)))
                    {
                        path.moveTo(nodeFaculty4X, nodeFaculty4Y);
                        path.lineTo(nodeFaculty3X, nodeFaculty3Y);
                    //    path.addCircle(nodeFaculty3X, nodeFaculty3Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1230 && sourcey<=1340))&&((destx>=180 && destx<=480)&&(desty>=1380&&desty<=1630)))
                    {
                        path.moveTo(nodeFaculty4X, nodeFaculty4Y);
                        path.lineTo(nodeFaculty3X, nodeFaculty3Y);
                        path.lineTo(nodeRawalX, nodeRawalY);
                    //    path.addCircle(nodeRawalX, nodeRawalY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1230 && sourcey<=1340))&&((destx>=500 && destx<=700)&&(desty>=1500&&desty<=1630)))
                    {
                        path.moveTo(nodeFaculty4X, nodeFaculty4Y);
                        path.lineTo(node211X, node211Y);
                        path.lineTo(noderoomX, noderoomY);
                    //    path.addCircle(noderoomX, noderoomY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1230 && sourcey<=1340))&&((destx>=720 && destx<=1020)&&(desty>=1500&&desty<=1630)))
                    {
                        path.moveTo(nodeFaculty4X, nodeFaculty4Y);
                        path.lineTo(node211X, node211Y);
                    //    path.addCircle(node211X, node211Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1230 && sourcey<=1340))&&((destx>=720 && destx<=1020)&&(desty>=1360&&desty<=1480)))
                    {
                        path.moveTo(nodeFaculty4X, nodeFaculty4Y);
                        path.lineTo(node210X, node210Y);
                    //    path.addCircle(node210X, node210Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1230 && sourcey<=1340))&&((destx>=720 && destx<=1020)&&(desty>=1090&&desty<=1215)))
                    {
                        path.moveTo(nodeFaculty4X, nodeFaculty4Y);
                        path.lineTo(nodeAcademicsX, nodeAcademicsY);
                    //    path.addCircle(nodeAcademicsX, nodeAcademicsY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1230 && sourcey<=1340))&&((destx>=720 && destx<=1020)&&(desty>=990&&desty<=1070)))
                    {
                        path.moveTo(nodeFaculty4X, nodeFaculty4Y);
                        path.lineTo(nodeExamRoomX, nodeExamRoomY);
                    //    path.addCircle(nodeExamRoomX, nodeExamRoomY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1230 && sourcey<=1340))&&((destx>=720 && destx<=1020)&&(desty>=650&&desty<=800)))
                    {
                        path.moveTo(nodeFaculty4X, nodeFaculty4Y);
                        path.lineTo(node203X, node203Y);
                    //    path.addCircle(node203X, node203Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1230 && sourcey<=1340))&&((destx>=720 && destx<=1020)&&(desty>=50&&desty<=160)))
                    {
                        path.moveTo(nodeFaculty4X, nodeFaculty4Y);
                        path.lineTo(nodeLadiesRoomX, node2LadiesRoomY);
                    //    path.addCircle(nodeLadiesRoomX, node2LadiesRoomY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1230 && sourcey<=1340))&&((destx>=720 && destx<=1020)&&(desty>=180&&desty<=290)))
                    {
                        path.moveTo(nodeFaculty4X, nodeFaculty4Y);
                        path.lineTo(nodeMensRoomX, node2MensRoomY);
                    //    path.addCircle(nodeMensRoomX, node2MensRoomY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1230 && sourcey<=1340))&&((destx>=720 && destx<=1020)&&(desty>=310&&desty<=460)))
                    {
                        path.moveTo(nodeFaculty4X, nodeFaculty4Y);
                        path.lineTo(node201X, node201Y);
                    //    path.addCircle(node201X, node201Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1230 && sourcey<=1340))&&((destx>=720 && destx<=1020)&&(desty>=480&&desty<=630)))
                    {
                        path.moveTo(nodeFaculty4X, nodeFaculty4Y);
                        path.lineTo(node202X, node202Y);
                     //   path.addCircle(node202X, node202Y, 10, Path.Direction.CCW);
                    }
                    //Room210
                    if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1360 && sourcey<=1480))&&((destx>=180 && destx<=480)&&(desty>=50&&desty<=330)))
                    {
                        path.moveTo(node210X, node210Y);
                        path.lineTo(nodeLadiesRoomX, node2LadiesRoomY);
                        path.lineTo(nodeKhy2X, nodeKhy2Y);
                        //path.addCircle(nodeKhy2X, nodeKhy2Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1360 && sourcey<=1480))&&((destx>=180 && destx<=480)&&(desty>=360&&desty<=475)))
                    {
                        path.moveTo(node210X, node210Y);
                        path.lineTo(node201X, node201Y);
                        path.lineTo(nodeControlX, nodeControlY);
                      //  path.addCircle(nodeControlX, nodeControlY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1360 && sourcey<=1480))&&((destx>=180 && destx<=480)&&(desty>=510&&desty<=800)))
                    {
                        path.moveTo(node210X, node210Y);
                        path.lineTo(node202X, node202Y);
                        path.lineTo(nodeKhy1X, nodeKhy1Y);
                        //path.addCircle(nodeKhy1X, nodeKhy1Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1360 && sourcey<=1480))&&((destx>=180 && destx<=480)&&(desty>=820&&desty<=970)))
                    {
                        path.moveTo(node210X, node210Y);
                        path.lineTo(nodeRawalX, nodeRawalY);
                        path.lineTo(nodeNasconX, nodeNasconY);
                        //path.addCircle(nodeNasconX, nodeNasconY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1360 && sourcey<=1480))&&((destx>=180 && destx<=480)&&(desty>=990&&desty<=1100)))
                    {
                        path.moveTo(node210X, node210Y);
                        path.lineTo(nodeExamRoomX, nodeExamRoomY);
                        path.lineTo(nodeFaculty1X, nodeFaculty1Y);
                        //path.addCircle(nodeFaculty1X, nodeFaculty1Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1360 && sourcey<=1480))&&((destx>=180 && destx<=480)&&(desty>=1120&&desty<=1230)))
                    {
                        path.moveTo(node210X, node210Y);
                        path.lineTo(nodeAcademicsX, nodeAcademicsY);
                        path.lineTo(nodeFaculty2X, nodeFaculty2Y);
                        //path.addCircle(nodeFaculty2X, nodeFaculty2Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1360 && sourcey<=1480))&&((destx>=180 && destx<=480)&&(desty>=1250&&desty<=1360)))
                    {
                        path.moveTo(node210X, node210Y);
                        path.lineTo(nodeFaculty4X, nodeFaculty4Y);
                        path.lineTo(nodeFaculty3X, nodeFaculty3Y);
                       // path.addCircle(nodeFaculty3X, nodeFaculty3Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1360 && sourcey<=1480))&&((destx>=180 && destx<=480)&&(desty>=1380&&desty<=1630)))
                    {
                        path.moveTo(node210X, node210Y);
                        path.lineTo(nodeRawalX, nodeRawalY);
                        //path.addCircle(nodeRawalX, nodeRawalY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1360 && sourcey<=1480))&&((destx>=500 && destx<=700)&&(desty>=1500&&desty<=1630)))
                    {
                        path.moveTo(node210X, node210Y);
                        path.lineTo(node211X, node211Y);
                        path.lineTo(noderoomX, noderoomY);
                        //path.addCircle(noderoomX, noderoomY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1360 && sourcey<=1480))&&((destx>=720 && destx<=1020)&&(desty>=1500&&desty<=1630)))
                    {
                        path.moveTo(node210X, node210Y);
                        path.lineTo(node211X, node211Y);
                        //path.addCircle(node211X, node211X, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1360 && sourcey<=1480))&&((destx>=720 && destx<=1020)&&(desty>=1230&&desty<=1340)))
                    {
                        path.moveTo(node210X, node210Y);
                        path.lineTo(nodeFaculty4X, nodeFaculty4Y);
                        //path.addCircle(nodeFaculty4X, nodeFaculty4Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1360 && sourcey<=1480))&&((destx>=720 && destx<=1020)&&(desty>=1090&&desty<=1215)))
                    {
                        path.moveTo(node210X, node210Y);
                        path.lineTo(nodeAcademicsX, nodeAcademicsY);
                        //path.addCircle(nodeAcademicsX, nodeAcademicsY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1360 && sourcey<=1480))&&((destx>=720 && destx<=1020)&&(desty>=990&&desty<=1070)))
                    {
                        path.moveTo(node210X, node210Y);
                        path.lineTo(nodeExamRoomX, nodeExamRoomY);
                        //path.addCircle(nodeExamRoomX, nodeExamRoomY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1360 && sourcey<=1480))&&((destx>=720 && destx<=1020)&&(desty>=650&&desty<=800)))
                    {
                        path.moveTo(node210X, node210Y);
                        path.lineTo(node203X, node203Y);
                        //path.addCircle(node203X, node203Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1360 && sourcey<=1480))&&((destx>=720 && destx<=1020)&&(desty>=50&&desty<=160)))
                    {
                        path.moveTo(node210X, node210Y);
                        path.lineTo(nodeLadiesRoomX, node2LadiesRoomY);
                        //path.addCircle(nodeLadiesRoomX, node2LadiesRoomY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1360 && sourcey<=1480))&&((destx>=720 && destx<=1020)&&(desty>=180&&desty<=290)))
                    {
                        path.moveTo(node210X, node210Y);
                        path.lineTo(nodeMensRoomX, node2MensRoomY);
                        //path.addCircle(nodeMensRoomX, node2MensRoomY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1360 && sourcey<=1480))&&((destx>=720 && destx<=1020)&&(desty>=310&&desty<=460)))
                    {
                        path.moveTo(node210X, node210Y);
                        path.lineTo(node201X, node201Y);
                        //path.addCircle(node201X, node201Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1360 && sourcey<=1480))&&((destx>=720 && destx<=1020)&&(desty>=480&&desty<=630)))
                    {
                        path.moveTo(node210X, node210Y);
                        path.lineTo(node202X, node202Y);
                        //path.addCircle(node202X, node202Y, 10, Path.Direction.CCW);
                    }
                    //Room211
                    if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1500 && sourcey<=1630))&&((destx>=180 && destx<=480)&&(desty>=50&&desty<=330)))
                    {
                        path.moveTo(node211X, node211Y);
                        path.lineTo(nodeLadiesRoomX, node2LadiesRoomY);
                        path.lineTo(nodeKhy2X, nodeKhy2Y);
                        //path.addCircle(nodeKhy2X, nodeKhy2Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1500 && sourcey<=1630))&&((destx>=180 && destx<=480)&&(desty>=360&&desty<=475)))
                    {
                        path.moveTo(node211X, node211Y);
                        path.lineTo(node201X, node201Y);
                        path.lineTo(nodeControlX, nodeControlY);
                        path.addCircle(nodeControlX, nodeControlY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1500 && sourcey<=1630))&&((destx>=180 && destx<=480)&&(desty>=510&&desty<=800)))
                    {
                        path.moveTo(node211X, node211Y);
                        path.lineTo(node202X, node202Y);
                        path.lineTo(nodeKhy1X, nodeKhy1Y);
                        //path.addCircle(nodeKhy1X, nodeKhy1Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1500 && sourcey<=1630))&&((destx>=180 && destx<=480)&&(desty>=820&&desty<=970)))
                    {
                        path.moveTo(node211X, node211Y);
                        path.lineTo(nodeRawalX, nodeRawalY);
                        path.lineTo(nodeNasconX, nodeNasconY);
                        //path.addCircle(nodeNasconX, nodeNasconY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1500 && sourcey<=1630))&&((destx>=180 && destx<=480)&&(desty>=990&&desty<=1100)))
                    {
                        path.moveTo(node211X, node211Y);
                        path.lineTo(nodeExamRoomX, nodeExamRoomY);
                        path.lineTo(nodeFaculty1X, nodeFaculty1Y);
                        //path.addCircle(nodeFaculty1X, nodeFaculty1Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1500 && sourcey<=1630))&&((destx>=180 && destx<=480)&&(desty>=1120&&desty<=1230)))
                    {
                        path.moveTo(node211X, node211Y);
                        path.lineTo(nodeAcademicsX, nodeAcademicsY);
                        path.lineTo(nodeFaculty2X, nodeFaculty2Y);
                        //path.addCircle(nodeFaculty2X, nodeFaculty2Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1500 && sourcey<=1630))&&((destx>=180 && destx<=480)&&(desty>=1250&&desty<=1360)))
                    {
                        path.moveTo(node211X, node211Y);
                        path.lineTo(nodeFaculty4X, nodeFaculty4Y);
                        path.lineTo(nodeFaculty3X, nodeFaculty3Y);
                        //path.addCircle(nodeFaculty3X, nodeFaculty3Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1500 && sourcey<=1630))&&((destx>=180 && destx<=480)&&(desty>=1380&&desty<=1630)))
                    {
                        path.moveTo(node211X, node211Y);
                        path.moveTo(node210X, node210Y);
                        path.lineTo(nodeRawalX, nodeRawalY);
                        //path.addCircle(nodeRawalX, nodeRawalY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1500 && sourcey<=1630))&&((destx>=500 && destx<=700)&&(desty>=1500&&desty<=1630)))
                    {
                        path.moveTo(node211X, node211Y);
                        path.lineTo(noderoomX, noderoomY);
                        //path.addCircle(noderoomX, noderoomY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1500 && sourcey<=1630))&&((destx>=720 && destx<=1020)&&(desty>=1360&&desty<=1480)))
                    {
                        path.moveTo(node211X, node211Y);
                        path.lineTo(node210X, node210Y);
                        //path.addCircle(node210X, node210Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1500 && sourcey<=1630))&&((destx>=720 && destx<=1020)&&(desty>=1230&&desty<=1340)))
                    {
                        path.moveTo(node211X, node211Y);
                        path.lineTo(nodeFaculty4X, nodeFaculty4Y);
                        //path.addCircle(nodeFaculty4X, nodeFaculty4Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1500 && sourcey<=1630))&&((destx>=720 && destx<=1020)&&(desty>=1090&&desty<=1215)))
                    {
                        path.moveTo(node211X, node211Y);
                        path.lineTo(nodeAcademicsX, nodeAcademicsY);
                        //path.addCircle(nodeAcademicsX, nodeAcademicsY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1500 && sourcey<=1630))&&((destx>=720 && destx<=1020)&&(desty>=990&&desty<=1070)))
                    {
                        path.moveTo(node211X, node211Y);
                        path.lineTo(nodeExamRoomX, nodeExamRoomY);
                        //path.addCircle(nodeExamRoomX, nodeExamRoomY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1500 && sourcey<=1630))&&((destx>=720 && destx<=1020)&&(desty>=650&&desty<=800)))
                    {
                        path.moveTo(node211X, node211Y);
                        path.lineTo(node203X, node203Y);
                        //path.addCircle(node203X, node203Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1500 && sourcey<=1630))&&((destx>=720 && destx<=1020)&&(desty>=50&&desty<=160)))
                    {
                        path.moveTo(node211X, node211Y);
                        path.lineTo(nodeLadiesRoomX, node2LadiesRoomY);
                        //path.addCircle(nodeLadiesRoomX, node2LadiesRoomY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1500 && sourcey<=1630))&&((destx>=720 && destx<=1020)&&(desty>=180&&desty<=290)))
                    {
                        path.moveTo(node211X, node211Y);
                        path.lineTo(nodeMensRoomX, node2MensRoomY);
                        //path.addCircle(nodeMensRoomX, node2MensRoomY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1500 && sourcey<=1630))&&((destx>=720 && destx<=1020)&&(desty>=310&&desty<=460)))
                    {
                        path.moveTo(node211X, node211Y);
                        path.lineTo(node201X, node201Y);
                        //path.addCircle(node201X, node201Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=720 && sourcex<=1020)&&(sourcey >=1500 && sourcey<=1630))&&((destx>=720 && destx<=1020)&&(desty>=480&&desty<=630)))
                    {
                        path.moveTo(node211X, node211Y);
                        path.lineTo(node202X, node202Y);
                        //path.addCircle(node202X, node202Y, 10, Path.Direction.CCW);
                    }
                    //room
                    if(((sourcex >=500 && sourcex<=700)&&(sourcey >=1500 && sourcey<=1630))&&((destx>=180 && destx<=480)&&(desty>=50&&desty<=330)))
                    {
                        path.moveTo(noderoomX, noderoomY);
                        path.lineTo(nodeRawalX, nodeRawalY);
                        path.lineTo(nodeKhy2X, nodeKhy2Y);
                        //path.addCircle(nodeKhy2X, nodeKhy2Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=500 && sourcex<=700)&&(sourcey >=1500 && sourcey<=1630))&&((destx>=180 && destx<=480)&&(desty>=360&&desty<=475)))
                    {
                        path.moveTo(noderoomX, noderoomY);
                        path.lineTo(nodeRawalX, nodeRawalY);
                        path.lineTo(nodeControlX, nodeControlY);
                        //path.addCircle(nodeControlX, nodeControlY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=500 && sourcex<=700)&&(sourcey >=1500 && sourcey<=1630))&&((destx>=180 && destx<=480)&&(desty>=510&&desty<=800)))
                    {
                        path.moveTo(noderoomX, noderoomY);
                        path.lineTo(nodeRawalX, nodeRawalY);
                        path.lineTo(nodeKhy1X, nodeKhy1Y);
                        //path.addCircle(nodeKhy1X, nodeKhy1Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=500 && sourcex<=700)&&(sourcey >=1500 && sourcey<=1630))&&((destx>=180 && destx<=480)&&(desty>=820&&desty<=970)))
                    {
                        path.moveTo(noderoomX, noderoomY);
                        path.lineTo(nodeRawalX, nodeRawalY);
                        path.lineTo(nodeNasconX, nodeNasconY);
                        //path.addCircle(nodeNasconX, nodeNasconY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=500 && sourcex<=700)&&(sourcey >=1500 && sourcey<=1630))&&((destx>=180 && destx<=480)&&(desty>=990&&desty<=1100)))
                    {
                        path.moveTo(noderoomX, noderoomY);
                        path.lineTo(nodeRawalX, nodeRawalY);
                        path.lineTo(nodeFaculty1X, nodeFaculty1Y);
                        //path.addCircle(nodeFaculty1X, nodeFaculty1Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=500 && sourcex<=700)&&(sourcey >=1500 && sourcey<=1630))&&((destx>=180 && destx<=480)&&(desty>=1120&&desty<=1230)))
                    {
                        path.moveTo(noderoomX, noderoomY);
                        path.lineTo(nodeRawalX, nodeRawalY);
                        path.lineTo(nodeFaculty2X, nodeFaculty2Y);
                        //path.addCircle(nodeFaculty2X, nodeFaculty2Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=500 && sourcex<=700)&&(sourcey >=1500 && sourcey<=1630))&&((destx>=180 && destx<=480)&&(desty>=1250&&desty<=1360)))
                    {
                        path.moveTo(noderoomX, noderoomY);
                        path.lineTo(nodeRawalX, nodeRawalY);
                        path.lineTo(nodeFaculty3X, nodeFaculty3Y);
                        //path.addCircle(nodeFaculty3X, nodeFaculty3Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=500 && sourcex<=700)&&(sourcey >=1500 && sourcey<=1630))&&((destx>=180 && destx<=480)&&(desty>=1380&&desty<=1630)))
                    {
                        path.moveTo(noderoomX, noderoomY);
                        path.lineTo(nodeRawalX, nodeRawalY);
                        //path.addCircle(nodeRawalX, nodeRawalY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=500 && sourcex<=700)&&(sourcey >=1500 && sourcey<=1630))&&((destx>=720 && destx<=1020)&&(desty>=1500&&desty<=1630)))
                    {
                        path.moveTo(noderoomX, noderoomY);
                        path.lineTo(node211X, node211Y);
                        //path.addCircle(node211X, node211Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=500 && sourcex<=700)&&(sourcey >=1500 && sourcey<=1630))&&((destx>=720 && destx<=1020)&&(desty>=1360&&desty<=1480)))
                    {
                        path.moveTo(noderoomX, noderoomY);
                        path.lineTo(node211X, node211Y);
                        path.lineTo(node210X, node210Y);
                        //path.addCircle(node210X, node210Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=500 && sourcex<=700)&&(sourcey >=1500 && sourcey<=1630))&&((destx>=720 && destx<=1020)&&(desty>=1230&&desty<=1340)))
                    {
                        path.moveTo(noderoomX, noderoomY);
                        path.lineTo(node211X, node211Y);
                        path.lineTo(nodeFaculty4X, nodeFaculty4Y);
                        //path.addCircle(nodeFaculty4X, nodeFaculty4Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=500 && sourcex<=700)&&(sourcey >=1500 && sourcey<=1630))&&((destx>=720 && destx<=1020)&&(desty>=1090&&desty<=1215)))
                    {
                        path.moveTo(noderoomX, noderoomY);
                        path.lineTo(node211X, node211Y);
                        path.lineTo(nodeAcademicsX,nodeAcademicsY);
                        //path.addCircle(nodeAcademicsX, nodeAcademicsY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=500 && sourcex<=700)&&(sourcey >=1500 && sourcey<=1630))&&((destx>=720 && destx<=1020)&&(desty>=990&&desty<=1070)))
                    {
                        path.moveTo(noderoomX, noderoomY);
                        path.lineTo(node211X, node211Y);
                        path.lineTo(nodeExamRoomX,nodeExamRoomY);
                        //path.addCircle(nodeExamRoomX, nodeExamRoomY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=500 && sourcex<=700)&&(sourcey >=1500 && sourcey<=1630))&&((destx>=720 && destx<=1020)&&(desty>=650&&desty<=800)))
                    {
                        path.moveTo(noderoomX, noderoomY);
                        path.lineTo(node211X, node211Y);
                        path.lineTo(node203X,node203Y);
                        //path.addCircle(node203X, node203Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=500 && sourcex<=700)&&(sourcey >=1500 && sourcey<=1630))&&((destx>=720 && destx<=1020)&&(desty>=50&&desty<=160)))
                    {
                        path.moveTo(noderoomX, noderoomY);
                        path.lineTo(node211X, node211Y);
                        path.lineTo(nodeLadiesRoomX, node2LadiesRoomY);
                        //path.addCircle(nodeLadiesRoomX, node2LadiesRoomY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=500 && sourcex<=700)&&(sourcey >=1500 && sourcey<=1630))&&((destx>=720 && destx<=1020)&&(desty>=180&&desty<=290)))
                    {
                        path.moveTo(noderoomX, noderoomY);
                        path.lineTo(node211X, node211Y);
                        path.lineTo(nodeMensRoomX, node2MensRoomY);
                        //path.addCircle(nodeMensRoomX, node2MensRoomY, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=500 && sourcex<=700)&&(sourcey >=1500 && sourcey<=1630))&&((destx>=720 && destx<=1020)&&(desty>=310&&desty<=460)))
                    {
                        path.moveTo(noderoomX, noderoomY);
                        path.lineTo(node211X, node211Y);
                        path.lineTo(node201X, node201Y);
                      //  path.addCircle(node201X, node201Y, 10, Path.Direction.CCW);
                    }
                    else if(((sourcex >=500 && sourcex<=700)&&(sourcey >=1500 && sourcey<=1630))&&((destx>=720 && destx<=1020)&&(desty>=480&&desty<=630)))
                    {
                        path.moveTo(noderoomX, noderoomY);
                        path.lineTo(node211X, node211Y);
                        path.lineTo(node202X, node202Y);
                    //    path.addCircle(node202X, node202Y, 10, Path.Direction.CCW);
                    }

                    counter = 0;

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
                {

                    Toast toast4 = Toast.makeText(getContext(),"Navigation ended",Toast.LENGTH_SHORT);
                    toast4.show();

                    // Toast toast5 = Toast.makeText(getContext(),"Navigation started",Toast.LENGTH_SHORT);
                    //toast5.show();


                    counter=0;


                }







//checks for red buttons used for image display
                if ((x>=420 && x<=460))
                {

                    if (y>=280 && y<=320)
                    {

                        Intent Intent = new Intent(getContext(), ImageFileFloor2.class);
                        Intent.putExtra("image","Khyber2");
                        getContext().startActivity(Intent);


                    }


                    else if (y>=425 && y<=465)
                    {

                        Intent Intent = new Intent(getContext(), ImageFileFloor2.class);
                        Intent.putExtra("image","Control room");
                        getContext().startActivity(Intent);

                    }

                    else if (y>=750 && y<=790)
                    {
                        Intent Intent = new Intent(getContext(), ImageFileFloor2.class);
                        Intent.putExtra("image","Khyber1");
                        getContext().startActivity(Intent);


                    }


                    else if (y>=920 && y<=960)
                    {

                        Intent Intent = new Intent(getContext(), ImageFileFloor2.class);
                        Intent.putExtra("image","Nascon room");
                        getContext().startActivity(Intent);
                    }


                    else if (y>=1050 && y<=1090)
                    {

                        Intent Intent = new Intent(getContext(), ImageFileFloor2.class);
                        Intent.putExtra("image","Faculty1");
                        getContext().startActivity(Intent);
                    }


                    else if (y>=1180 && y<=1220)
                    {

                        Intent Intent = new Intent(getContext(), ImageFileFloor2.class);
                        Intent.putExtra("image","Faculty2");
                        getContext().startActivity(Intent);
                    }


                    else if (y>=1310 && y<=1350)
                    {
                        Intent Intent = new Intent(getContext(), ImageFileFloor2.class);
                        Intent.putExtra("image","Faculty3");
                        getContext().startActivity(Intent);
                    }


                    else if (y>=1580 && y<=1620)
                    {

                        Intent Intent = new Intent(getContext(), ImageFileFloor2.class);
                        Intent.putExtra("image","Rawal lab");
                        getContext().startActivity(Intent);
                    }


                }

                else if ((x>=960 && x<=1000))
                {

                    if (y>=110 && y<=150)
                    {

                        Intent Intent = new Intent(getContext(), ImageFileFloor2.class);
                        Intent.putExtra("image","Ladies room");
                        getContext().startActivity(Intent);
                    }

                    else if (y>=240 && y<=280)
                    {

                        Intent Intent = new Intent(getContext(), ImageFileFloor2.class);
                        Intent.putExtra("image","Men's room");
                        getContext().startActivity(Intent);
                    }

                    else if (y>=410 && y<=450)
                    {

                        Intent Intent = new Intent(getContext(), ImageFileFloor2.class);
                        Intent.putExtra("image","201");
                        getContext().startActivity(Intent);
                    }
                    else if (y>=580 && y<=620)
                    {

                        Intent Intent = new Intent(getContext(), ImageFileFloor2.class);
                        Intent.putExtra("image","202");
                        getContext().startActivity(Intent);
                    }
                    else if (y>=750 && y<=790)
                    {

                        Intent Intent = new Intent(getContext(), ImageFileFloor2.class);
                        Intent.putExtra("image","203");
                        getContext().startActivity(Intent);
                    }
                    else if (y>=1020 && y<=1060)
                    {

                        Intent Intent = new Intent(getContext(), ImageFileFloor2.class);
                        Intent.putExtra("image","Exam room");
                        getContext().startActivity(Intent);
                    }
                    else if (y>=1165 && y<=1205)
                    {

                        Intent Intent = new Intent(getContext(), ImageFileFloor2.class);
                        Intent.putExtra("image","Academics");
                        getContext().startActivity(Intent);
                    }
                    else if (y>=1290 && y<=1330)
                    {

                        Intent Intent = new Intent(getContext(), ImageFileFloor2.class);
                        Intent.putExtra("image","Faculty4");
                        getContext().startActivity(Intent);
                    }
                    else if (y>=1430 && y<=1470)
                    {

                        Intent Intent = new Intent(getContext(), ImageFileFloor2.class);
                        Intent.putExtra("image","210");
                        getContext().startActivity(Intent);
                    }
                    else if (y>=1580 && y<=1620)
                    {

                        Intent Intent = new Intent(getContext(), ImageFileFloor2.class);
                        Intent.putExtra("image","211");
                        getContext().startActivity(Intent);
                    }


                }

                else if ((x>=640 && x<=680) && (y>=1580 && y<=1620))
                {

                    Intent Intent = new Intent(getContext(), ImageFileFloor2.class);
                    Intent.putExtra("image","Faculty5");
                    getContext().startActivity(Intent);
                }

                break;
        }

        invalidate();

        return true;

    }
}