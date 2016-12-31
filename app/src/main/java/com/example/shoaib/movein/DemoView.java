package com.example.shoaib.movein;
//DEMO MAP
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

public class DemoView extends View {
    int counter=0;
    Paint paint1,paint2,paint3,paint4,paint5,paint6,paint7,paint8,paint9,paint10;
    float sourcex;
    float sourcey;
    float destx;
    float desty;

    //===============================================
    Paint paint;

    Bitmap bm;
    int bm_offsetX, bm_offsetY;

    Path animPath;
    PathMeasure pathMeasure;
    float pathLength;

    float step;   //distance each step
    float distance;  //distance moved

    float[] pos;
    float[] tan;

    Matrix matrix;
    //===============================================



    int nodeAx=390;
    int nodeBx=720;
    int nodeCx=800;
    int nodeDx=390;
    int nodeEx=720;
    int nodeFx=800;
    int nodeGx=500;
    int nodeGTMidX=390;
    int nodeHx=600;
    int nodeHRx=800;
    int nodeIx=1020;
    int nodeJx=480;
    int nodeKx=1020;
    int nodeBStairTopX=600;
    int nodeBStairTopY=1270;
    int nodeBStairMidX=670;
    int nodeBStairMidY=1270;
    int nodeBStairEX=670;
    int nodeBStairEY=1540;
    int nodeAStairTopX=800;
    int nodeAStairTopY=320;
    int nodeAStairMidX=800;
    int nodeAStairMidY=410;
    int nodeAStairEX=1050;
    int nodeAStairEY=410;

    int nodeAy=30;
    int nodeBy=30;
    int nodeCy=30;
    int nodeDy=320;
    int nodeEy=550;
    int nodeFy=550;
    int nodeGy=925;
    int nodeGTMidY=925;
    int nodeHy=925;
    int nodeHRy=925;
    int nodeIy=925;
    int nodeJy=1270;
    int nodeKy=1270;


    private Path path1 = new Path();

    public DemoView(Context context) {
        super(context);
        init();
    }

    public DemoView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public DemoView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private void init(){

        //===================================================
        paint = new Paint();
        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(1);
        paint.setStyle(Paint.Style.STROKE);

        bm = BitmapFactory.decodeResource(getResources(), R.mipmap.man);
        bm_offsetX = bm.getWidth()/2;
        bm_offsetY = bm.getHeight()/2;


        animPath = new Path();


        step = 4;
        distance = 0;
        pos = new float[2];
        tan = new float[2];

        matrix = new Matrix();



        //===================================================





        paint1 = new Paint();
        paint1.setColor(Color.CYAN);
        paint1.setStrokeWidth(10);
        paint1.setStyle(Paint.Style.STROKE);


        paint2 =new Paint();
        paint2.setColor(Color.BLUE);
        paint2.setStrokeWidth(12);
        paint2.setStyle(Paint.Style.STROKE);

        paint3 =new Paint();
        paint3.setColor(Color.GRAY);
        paint3.setStrokeWidth(10);
        paint3.setStyle(Paint.Style.STROKE);

        paint4 =new Paint();
        paint4.setColor(Color.BLACK);
        paint4.setStrokeWidth(8);
        paint4.setStyle(Paint.Style.STROKE);

        paint5 =new Paint();
        paint5.setColor(Color.RED);
        paint5.setStrokeWidth(10);
        paint5.setStyle(Paint.Style.STROKE);

        paint6 =new Paint();
        paint6.setColor(Color.GREEN);
        paint6.setStrokeWidth(10);
        paint6.setStyle(Paint.Style.STROKE);

        paint7 =new Paint();
        paint7.setColor(Color.MAGENTA);
        paint7.setStrokeWidth(17);
        paint7.setStyle(Paint.Style.STROKE);

        paint8 =new Paint();
        paint8.setColor(Color.GREEN);
        paint8.setStrokeWidth(10);
        paint8.setStyle(Paint.Style.FILL_AND_STROKE);

        paint9 =new Paint();
        paint9.setColor(Color.BLACK);
        paint9.setStrokeWidth(10);
        paint9.setStyle(Paint.Style.FILL_AND_STROKE);

        paint10 =new Paint();
        paint10.setColor(Color.BLACK);
        paint10.setStrokeWidth(5);
        paint10.setStyle(Paint.Style.STROKE);
        Canvas canvas1= new Canvas();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        // TODO Auto-generated method stub
        super.onDraw(canvas);

        canvas.drawPath(path1, paint7);

//=======================================================

        if(distance < pathLength){
            pathMeasure.getPosTan(distance, pos, tan);

            matrix.reset();
            float degrees = (float)(Math.atan2(tan[1], tan[0])*180.0/Math.PI);
            matrix.postRotate(degrees, bm_offsetX, bm_offsetY);
            matrix.postTranslate(pos[0]-bm_offsetX, pos[1]-bm_offsetY);

            canvas.drawBitmap(bm, matrix, null);

            distance += step;
        }else{
            distance = 0;
        }

        invalidate();




//========================================================



        //rooms on left side
        //drawRect(left, top, right, bottom, paint)
        canvas.drawRect(150, 10, 1050, 1540, paint1);

        paint4.setTextSize(70);
        paint10.setTextSize(40);
        //A
        canvas.drawRect(170, 30, 360, 300, paint2);
        canvas.drawText(" A ", 250, 180, paint4);
        //B
        canvas.drawRect(500, 30, 690, 300, paint2);
        canvas.drawText(" B ", 600, 180, paint4);
        //C
        canvas.drawRect(830, 30, 1020, 300, paint2);
        canvas.drawText(" C ", 920, 150, paint4);
        //D
        canvas.drawRect(170, 320, 360, 800, paint2);
        canvas.drawText(" D ", 260, 520, paint4);
        //E
        canvas.drawRect(500, 520, 690, 800, paint2);
        canvas.drawText(" E ", 600, 650, paint4);
        //F
        canvas.drawRect(830, 520, 1020, 800, paint2);
        canvas.drawText(" F ", 920, 650, paint4);
        //G
        canvas.drawRect(300, 950, 480, 1150, paint2);
        canvas.drawText(" G ", 400, 1050, paint4);
        //H
        canvas.drawRect(630, 950, 810, 1150, paint2);
        canvas.drawText(" H ", 720, 1050, paint4);
        //I
        canvas.drawRect(830, 950, 1020, 1150, paint2);
        canvas.drawText(" I ", 920, 1050, paint4);
        //J
        canvas.drawRect(170, 1300, 450, 1500, paint2);
        canvas.drawText(" J ", 300, 1400, paint4);
        //K
        canvas.drawRect(830, 1300, 1020, 1500, paint2);
        canvas.drawText(" K ", 920, 1400, paint4);



        //Stairs 1

        canvas.drawLine(830, 330, 1050, 330, paint4);
        canvas.drawLine(830, 490, 1050, 490, paint4);

        canvas.drawLine(850, 330, 850, 490, paint4);
        canvas.drawLine(890, 330, 890, 490, paint4);
        canvas.drawLine(930, 330, 930, 490, paint4);
        canvas.drawLine(970, 330, 970, 490, paint4);
        canvas.drawLine(1010, 330, 1010, 490, paint4);
        canvas.drawLine(1050, 330, 1050, 490, paint4);

        //Stairs 2

        canvas.drawLine(560, 1280, 560, 1540, paint4);
        canvas.drawLine(730, 1280, 730, 1540, paint4);

        canvas.drawLine(560, 1300, 730, 1300, paint4);
        canvas.drawLine(560, 1360, 730, 1360, paint4);
        canvas.drawLine(560, 1420, 730, 1420, paint4);
        canvas.drawLine(560, 1480, 730, 1480, paint4);
        canvas.drawLine(560, 1540, 730, 1540, paint4);

        //left buttons
        canvas.drawCircle(50, 60, 30, paint8);
        canvas.drawCircle(50, 180, 30, paint7);
        canvas.drawCircle(50,300,30,paint9);
        canvas.drawText(" FLoor 1 ", 1, 400, paint10);
        //canvas.drawText(" FLOORS ", 1, 460, paint10);
        canvas.drawCircle(50,470,30,paint9);
        canvas.drawText(" FLoor 2 ", 1, 570, paint10);




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
                    //A-K
                    if(((sourcex >=170 && sourcex<=360)&&(sourcey >=30 && sourcey<=300))&&((destx>=830 && destx<=1020)&&(desty>=1300&&desty<=1500))) {
                        path1.moveTo(nodeAx, nodeAy);
                        path1.lineTo(nodeDx, nodeDy);
                        path1.lineTo(nodeGTMidX, nodeGTMidY);
                        path1.lineTo(nodeHx,nodeHy);
                        path1.lineTo(nodeBStairTopX,nodeBStairTopY);
                        path1.lineTo(nodeKx,nodeKy);
                        path1.addCircle(nodeKx, nodeKy, 10, Path.Direction.CCW);

                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();

                        Toast.makeText(getContext(), "pathLength: " + pathLength, Toast.LENGTH_LONG).show();

                    }
                    //C-K
                    else if(((sourcex >=830 && sourcex<=1020)&&(sourcey >=30 && sourcey<=300))&&((destx>=830 && destx<=1020)&&(desty>=1300&&desty<=1500)))
                    {
                        path1.moveTo(nodeCx, nodeCy);
                        path1.lineTo(nodeFx, nodeFy);
                        path1.lineTo(nodeHRx, nodeHRy);
                        path1.lineTo(nodeHx,nodeHy);
                        path1.lineTo(nodeBStairTopX,nodeBStairTopY);
                        path1.lineTo(nodeKx,nodeKy);
                        path1.addCircle(nodeKx, nodeKy, 10, Path.Direction.CCW);

                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();

                        Toast.makeText(getContext(), "pathLength: " + pathLength, Toast.LENGTH_LONG).show();

                    }
                    //J-C
                    else if(((sourcex >=170 && sourcex<=450)&&(sourcey >=1300 && sourcey<=1500))&&((destx>=830 && destx<=1020)&&(desty>=30&&desty<=300)))
                    {
                        path1.moveTo(nodeJx, nodeJy);
                        path1.lineTo(nodeBStairTopX, nodeBStairTopY);
                        path1.lineTo(nodeHx, nodeHy);
                        path1.lineTo(nodeHRx, nodeHRy);
                        path1.lineTo(nodeFx, nodeFy);
                        path1.lineTo(nodeCx, nodeCy);
                        path1.addCircle(nodeCx, nodeCy, 10, Path.Direction.CCW);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();

                        Toast.makeText(getContext(), "pathLength: " + pathLength, Toast.LENGTH_LONG).show();


                    }



                    //A-topStairs
                    if(((sourcex >=170 && sourcex<=360)&&(sourcey >=30 && sourcey<=300))&&((destx>=20 && destx<=80)&&(desty>=420&&desty<=520)))
                    {
                        path1.moveTo(nodeAx, nodeAy);
                        path1.lineTo(nodeDx, nodeDy);
                        path1.lineTo(nodeAStairTopX, nodeAStairTopY);
                        path1.lineTo(nodeAStairMidX, nodeAStairMidY);
                        path1.lineTo(nodeAStairEX, nodeAStairEY);
                        path1.addCircle(nodeAStairEX, nodeAStairEY, 10, Path.Direction.CCW);

                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();

                        Toast.makeText(getContext(), "pathLength: " + pathLength, Toast.LENGTH_LONG).show();

                    }



                    //A-topStairs
                    if(((sourcex >=170 && sourcex<=360)&&(sourcey >=30 && sourcey<=300))&&((destx>=20 && destx<=80)&&(desty>=250&&desty<=350)))
                    {
                        path1.moveTo(nodeAx, nodeAy);
                        path1.lineTo(nodeDx, nodeDy);
                        path1.lineTo(nodeAStairTopX, nodeAStairTopY);
                        path1.lineTo(nodeAStairMidX, nodeAStairMidY);
                        path1.lineTo(nodeAStairEX, nodeAStairEY);
                        path1.addCircle(nodeAStairEX, nodeAStairEY, 10, Path.Direction.CCW);

                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();

                        Toast.makeText(getContext(), "pathLength: " + pathLength, Toast.LENGTH_LONG).show();

                    }

                    //G-DownStairs
                    if(((sourcex >=300 && sourcex<=480)&&(sourcey >=950 && sourcey<=1150))&&((destx>=20 && destx<=80)&&(desty>=420&&desty<=520)))
                    {
                        path1.moveTo(nodeGx, nodeGy);
                        path1.lineTo(nodeHx, nodeHy);
                        path1.lineTo(nodeBStairTopX, nodeBStairTopY);
                        path1.lineTo(nodeBStairMidX, nodeBStairMidY);
                        path1.lineTo(nodeBStairEX, nodeBStairEY);
                        path1.addCircle(nodeBStairEX, nodeBStairEY, 10, Path.Direction.CCW);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();

                        Toast.makeText(getContext(), "pathLength: " + pathLength, Toast.LENGTH_LONG).show();


                    }


                    //G-DownStairs
                    if(((sourcex >=300 && sourcex<=480)&&(sourcey >=950 && sourcey<=1150))&&((destx>=20 && destx<=80)&&(desty>=250&&desty<=350)))
                    {
                        path1.moveTo(nodeGx, nodeGy);
                        path1.lineTo(nodeHx, nodeHy);
                        path1.lineTo(nodeBStairTopX, nodeBStairTopY);
                        path1.lineTo(nodeBStairMidX, nodeBStairMidY);
                        path1.lineTo(nodeBStairEX, nodeBStairEY);
                        path1.addCircle(nodeBStairEX, nodeBStairEY, 10, Path.Direction.CCW);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();

                        Toast.makeText(getContext(), "pathLength: " + pathLength, Toast.LENGTH_LONG).show();


                    }



                    //Downstairs-I
                    if(((sourcex >=20 && sourcex<=80)&&(sourcey >=420 && sourcey<=520))&&((destx>=830 && destx<=1020)&&(desty>=950&&desty<=1150)))
                    {
                        path1.moveTo(nodeBStairEX, nodeBStairEY);
                        path1.lineTo(nodeBStairMidX, nodeBStairMidY);
                        path1.lineTo(nodeBStairTopX, nodeBStairTopY);
                        path1.lineTo(nodeHx,nodeHy);
                        path1.lineTo(nodeIx,nodeIy);
                        path1.addCircle(nodeIx, nodeIy, 10, Path.Direction.CCW);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();

                        Toast.makeText(getContext(), "pathLength: " + pathLength, Toast.LENGTH_LONG).show();


                    }
                    //Downstairs-I
                    if(((sourcex >=20 && sourcex<=80)&&(sourcey >=250 && sourcey<=350))&&((destx>=830 && destx<=1020)&&(desty>=950&&desty<=1150)))
                    {
                        path1.moveTo(nodeBStairEX, nodeBStairEY);
                        path1.lineTo(nodeBStairMidX, nodeBStairMidY);
                        path1.lineTo(nodeBStairTopX, nodeBStairTopY);
                        path1.lineTo(nodeHx,nodeHy);
                        path1.lineTo(nodeIx,nodeIy);
                        path1.addCircle(nodeIx, nodeIy, 10, Path.Direction.CCW);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();

                        Toast.makeText(getContext(), "pathLength: " + pathLength, Toast.LENGTH_LONG).show();


                    }
                    //Above stairs-E
                    if(((sourcex >=20 && sourcex<=80)&&(sourcey >=250 && sourcey<=350))&&((destx>=500 && destx<=690)&&(desty>=520&&desty<=800)))
                    {
                        path1.moveTo(nodeAStairEX, nodeAStairEY);
                        path1.lineTo(nodeAStairMidX, nodeAStairMidY);
                        path1.lineTo(nodeFx, nodeFy);
                        path1.lineTo(nodeEx,nodeEy);
                        path1.addCircle(nodeEx, nodeEy, 10, Path.Direction.CCW);

                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();

                        Toast.makeText(getContext(), "pathLength: " + pathLength, Toast.LENGTH_LONG).show();

                    }

                    //Above stairs-E
                    if(((sourcex >=20 && sourcex<=80)&&(sourcey >=420 && sourcey<=520))&&((destx>=500 && destx<=690)&&(desty>=520&&desty<=800)))
                    {
                        path1.moveTo(nodeAStairEX, nodeAStairEY);
                        path1.lineTo(nodeAStairMidX, nodeAStairMidY);
                        path1.lineTo(nodeFx, nodeFy);
                        path1.lineTo(nodeEx,nodeEy);
                        path1.addCircle(nodeEx, nodeEy, 10, Path.Direction.CCW);

                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();

                        Toast.makeText(getContext(), "pathLength: " + pathLength, Toast.LENGTH_LONG).show();

                    }

                    counter = 0;

                }
                if ((x>=20 && x<=80) && (y>=30 && y<=90))
                {
                    Toast toast4 = Toast.makeText(getContext(),"Navigation started, tap on source",Toast.LENGTH_SHORT);
                    toast4.show();
                    counter=1;


                }
                if ((x>=20 && x<=80) && (y>=150 && y<=210))
                {
                    Toast toast4 = Toast.makeText(getContext(),"Navigation ended",Toast.LENGTH_SHORT);
                    toast4.show();
                    counter=0;
                }
                break;
        }
        invalidate();
        return true;
    }
}



