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
    int nodeBTLx=470;
    int nodeBTRx=720;
    int nodeBBLx=470;
    int nodeBBRx=720;
    int nodeCTLx=800;
    int nodeCBLx=800;
    int nodeDtrx=390;
    int nodeDbrx=390;
    int nodeEtrx=720;
    int nodeEtlx=470;
    int nodeEbrx=720;
    int nodeEblx=470;
    int nodeFTlx=800;
    int nodeFblx=800;
    int nodeGTrx=470;
    int nodeGTMidtX=390;
    int nodeGTlx=270;
    int nodeGblx=270;
    int nodeGBMidx=390;
    int nodeGBrx=510;
    int nodeHTlx=600;
    int nodeHTRx=800;
    int nodeHMidtx=720;
    int nodeHBlx=600;
    int nodeHBrx=800;
    int nodeHMidBx=720;
    int nodeITrx=1020;
    int nodeITlx=810;
    int nodeIBrx=1020;
    int nodeIBlx=810;
    int nodeJtrx=480;
    int nodeJTlx=170;
    int nodeJMidtx=270;
    int nodeKTrx=1020;
    int nodeKTlx=810;
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
    int nodeBTLy=30;
    int nodeBTRy=30;
    int nodeBBLy=320;
    int nodeBBRy=320;
    int nodeCTLy=30;
    int nodeCBLy=320;
    int nodeDtry=320;
    int nodeDbry=820;
    int nodeEtry=500;
    int nodeEtly=500;
    int nodeEbry=820;
    int nodeEbly=820;
    int nodeFTly=500;
    int nodeFbly=820;
    int nodeGTry=930;
    int nodeGTMidty=930;
    int nodeGTly=930;
    int nodeGbly=1170;
    int nodeGBMidy=1170;
    int nodeGBry=1170;
    int nodeHTly=930;
    int nodeHTRy=930;
    int nodeHMidty=930;
    int nodeHBly=1170;
    int nodeHBry=1170;
    int nodeHMidBy=1170;
    int nodeITry=930;
    int nodeITly=930;
    int nodeIBry=1170;
    int nodeIBly=1170;
    int nodeJtry=1280;
    int nodeJTly=1280;
    int nodeJMidty=1280;
    int nodeKTry=1280;
    int nodeKTly=1280;
    int nodeCy=30;
    int nodeDy=300;
    int nodeGTMidY=930;
    int nodeHy=925;
    int nodeHRy=925;
    int nodeIy=925;
    int nodeJy=1270;
    int nodeKy=1280;


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
                    /*

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

                    }*/
                    //A-B
                    if(((sourcex >=170 && sourcex<=360)&&(sourcey >=30 && sourcey<=300))&&((destx>=500 && destx<=690)&&(desty>=30&&desty<=300))) {
                        path1.moveTo(nodeAx,nodeAy);
                        path1.lineTo(nodeBTLx,nodeBTLy);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }

                    //A-C
                    if(((sourcex >=170 && sourcex<=360)&&(sourcey >=30 && sourcey<=300))&&((destx>=830 && destx<=1020)&&(desty>=30&&desty<=300))) {
                        path1.moveTo(nodeAx,nodeAy);
                        path1.lineTo(nodeDtrx,nodeDtry);
                        path1.lineTo(nodeCBLx, nodeCBLy);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }

                    //A-D
                    if(((sourcex >=170 && sourcex<=360)&&(sourcey >=30 && sourcey<=300))&&((destx>=170 && destx<=360)&&(desty>=320&&desty<=800))) {
                        path1.moveTo(nodeAx,nodeAy);
                        path1.lineTo(nodeDtrx,nodeDtry);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }

                    //A-E
                    if(((sourcex >=170 && sourcex<=360)&&(sourcey >=30 && sourcey<=300))&&((destx>=500 && destx<=690)&&(desty>=520&&desty<=800))) {
                        path1.moveTo(nodeAx,nodeAy);
                        path1.lineTo(nodeDbrx,nodeDbry);
                        path1.lineTo(nodeEblx, nodeEbly);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }

                    //A-F
                    if(((sourcex >=170 && sourcex<=360)&&(sourcey >=30 && sourcey<=300))&&((destx>=830 && destx<=1020)&&(desty>=520&&desty<=800))) {
                        path1.moveTo(nodeAx,nodeAy);
                        path1.lineTo(nodeDbrx,nodeDbry);
                        path1.lineTo(nodeFblx, nodeFbly);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }
                    //A-G
                    if(((sourcex >=170 && sourcex<=360)&&(sourcey >=30 && sourcey<=300))&&((destx>=300 && destx<=480)&&(desty>=950&&desty<=1150))) {
                        path1.moveTo(nodeAx,nodeAy);
                        path1.lineTo(nodeDbrx,nodeDbry);
                        path1.lineTo(nodeGTMidtX, nodeGTMidY);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }

                    //A-H
                    if(((sourcex >=170 && sourcex<=360)&&(sourcey >=30 && sourcey<=300))&&((destx>=630 && destx<=810)&&(desty>=950&&desty<=1150))) {
                        path1.moveTo(nodeAx,nodeAy);
                        path1.lineTo(nodeDbrx,nodeDbry);
                        path1.lineTo(nodeGTMidtX, nodeGTMidY);
                        path1.lineTo(nodeHTlx,nodeHTly);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }

                    //A-I
                    if(((sourcex >=170 && sourcex<=360)&&(sourcey >=30 && sourcey<=300))&&((destx>=830 && destx<=1020)&&(desty>=950&&desty<=1150))) {
                        path1.moveTo(nodeAx,nodeAy);
                        path1.lineTo(nodeDbrx,nodeDbry);
                        path1.lineTo(nodeGTMidtX, nodeGTMidY);
                        path1.lineTo(nodeHTlx,nodeHTly);
                        path1.lineTo(nodeITrx,nodeITry);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }
                    //A-J
                    if(((sourcex >=170 && sourcex<=360)&&(sourcey >=30 && sourcey<=300))&&((destx>=170 && destx<=450)&&(desty>=1300&&desty<=1500))) {
                        path1.moveTo(nodeAx,nodeAy);
                        path1.lineTo(nodeDbrx,nodeDbry);
                        path1.lineTo(nodeGTMidtX, nodeGTMidY);
                        path1.lineTo(nodeGTlx,nodeGTly);
                        path1.lineTo(nodeJMidtx,nodeJMidty);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }
                    //A-K
                    if(((sourcex >=170 && sourcex<=360)&&(sourcey >=30 && sourcey<=300))&&((destx>=830 && destx<=1020)&&(desty>=1300&&desty<=1500))) {
                        path1.moveTo(nodeAx, nodeAy);
                        path1.lineTo(nodeDbrx, nodeDy);
                        path1.lineTo(nodeGTMidtX, nodeGTMidY);
                        path1.lineTo(nodeHTlx,nodeHy);
                        path1.lineTo(nodeBStairTopX, nodeBStairTopY);
                        path1.lineTo(nodeKTlx,nodeKy);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }
                    //B-A
                    if(((sourcex >=500 && sourcex<=690)&&(sourcey >=30 && sourcey<=300))&&((destx>=170 && destx<=360)&&(desty>=30&&desty<=300))) {
                        path1.moveTo(nodeBTLx, nodeBTLy);
                        path1.lineTo(nodeAx,nodeAy);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }

                    //B-C
                    if(((sourcex >=500 && sourcex<=690)&&(sourcey >=30 && sourcey<=300))&&((destx>=830 && destx<=1020)&&(desty>=30&&desty<=300))) {
                        path1.moveTo(nodeBTRx, nodeBTLy);
                        path1.lineTo(nodeCTLx,nodeCTLy);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }
                    //B-D
                    if(((sourcex >=500 && sourcex<=690)&&(sourcey >=30 && sourcey<=300))&&((destx>=170 && destx<=360)&&(desty>=320&&desty<=800))) {
                        path1.moveTo(nodeBTLx, nodeBTLy);
                        path1.lineTo(nodeAx,nodeAy);
                        path1.lineTo(nodeDtrx, nodeDtry);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }
                    //B-E
                    if(((sourcex >=500 && sourcex<=690)&&(sourcey >=30 && sourcey<=300))&&((destx>=500 && destx<=690)&&(desty>=520&&desty<=800))) {
                        path1.moveTo(nodeBTRx, nodeBTRy);
                        path1.lineTo(nodeEtrx,nodeEtry);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }
                    //B-F
                    if(((sourcex >=500 && sourcex<=690)&&(sourcey >=30 && sourcey<=300))&&((destx>=830 && destx<=1020)&&(desty>=520&&desty<=800))) {
                        path1.moveTo(nodeBTRx, nodeBTRy);
                        path1.lineTo(nodeCTLx,nodeCTLy);
                        path1.lineTo(nodeFTlx,nodeFTly);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }
                    //B-G
                    if(((sourcex >=500 && sourcex<=690)&&(sourcey >=30 && sourcey<=300))&&((destx>=300 && destx<=480)&&(desty>=950&&desty<=1150))) {
                        path1.moveTo(nodeBTLx, nodeBTLy);
                        path1.lineTo(nodeGTrx,nodeGTry);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }
                    //B-H
                    if(((sourcex >=500 && sourcex<=690)&&(sourcey >=30 && sourcey<=300))&&((destx>=630 && destx<=810)&&(desty>=950&&desty<=1150))) {
                        path1.moveTo(nodeBTRx, nodeBTRy);
                        path1.lineTo(nodeHMidtx,nodeHMidty);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }
                    //B-I
                    if(((sourcex >=500 && sourcex<=690)&&(sourcey >=30 && sourcey<=300))&&((destx>=830 && destx<=1020)&&(desty>=950&&desty<=1150))) {
                        path1.moveTo(nodeBTRx, nodeBTRy);
                        path1.lineTo(nodeHMidtx,nodeHMidty);
                        path1.lineTo(nodeITrx, nodeITry);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }
                    //B-J
                    if(((sourcex >=500 && sourcex<=690)&&(sourcey >=30 && sourcey<=300))&&((destx>=170 && destx<=450)&&(desty>=1300&&desty<=1500))) {
                        path1.moveTo(nodeBTLx, nodeBTLy);
                        path1.lineTo(nodeGTrx, nodeGTry);
                        path1.lineTo(nodeGTlx,nodeGTly);
                        path1.lineTo(nodeJMidtx,nodeJMidty);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }
                    //B-K
                    if(((sourcex >=500 && sourcex<=690)&&(sourcey >=30 && sourcey<=300))&&((destx>=830 && destx<=1020)&&(desty>=1300&&desty<=1500))) {
                        path1.moveTo(nodeBTRx, nodeBTRy);
                        path1.lineTo(nodeHMidtx, nodeHMidty);
                        path1.lineTo(nodeHTlx, nodeHTly);
                        path1.lineTo(nodeHBlx,nodeHBly);
                        path1.lineTo(nodeIBrx,nodeIBry);
                        path1.lineTo(nodeKTrx,nodeKTry);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }

                    //C-A
                    if(((sourcex >=830 && sourcex<=1020)&&(sourcey >=30 && sourcey<=300))&&((destx>=170 && destx<=360)&&(desty>=30&&desty<=300))) {
                        path1.moveTo(nodeCTLx,nodeCTLy);
                        path1.lineTo(nodeAStairTopX,nodeAStairTopY);
                        path1.lineTo(nodeDtrx, nodeDtry);
                        path1.lineTo(nodeAx, nodeAy);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }
                    //C-b
                    if(((sourcex >=830 && sourcex<=1020)&&(sourcey >=30 && sourcey<=300))&&((destx>=500 && destx<=690)&&(desty>=30&&desty<=300))) {
                        path1.moveTo(nodeCTLx,nodeCTLy);
                        path1.lineTo(nodeBTRx,nodeBTRy);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }
                    //C-d
                    if(((sourcex >=830 && sourcex<=1020)&&(sourcey >=30 && sourcey<=300))&&((destx>=170 && destx<=360)&&(desty>=320&&desty<=800))) {
                        path1.moveTo(nodeCTLx, nodeCTLy);
                        path1.lineTo(nodeAStairTopX,nodeAStairTopY);
                        path1.lineTo(nodeDtrx, nodeDtry);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }
                    //C-e
                    if(((sourcex >=830 && sourcex<=1020)&&(sourcey >=30 && sourcey<=300))&&((destx>=500 && destx<=690)&&(desty>=520&&desty<=800))) {
                        path1.moveTo(nodeCTLx,nodeCTLy);
                        path1.lineTo(nodeFTlx,nodeFTly);
                        path1.lineTo(nodeEtrx, nodeEtry);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }
                    //C-f
                    if(((sourcex >=830 && sourcex<=1020)&&(sourcey >=30 && sourcey<=300))&&((destx>=830 && destx<=1020)&&(desty>=520&&desty<=800))) {
                        path1.moveTo(nodeCTLx, nodeCTLy);
                        path1.lineTo(nodeFTlx,nodeFTly);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }
                    //C-g
                    if(((sourcex >=830 && sourcex<=1020)&&(sourcey >=30 && sourcey<=300))&&((destx>=300 && destx<=480)&&(desty>=950&&desty<=1150))) {
                        path1.moveTo(nodeCTLx,nodeCTLy);
                        path1.lineTo(nodeHTRx,nodeHTRy);
                        path1.lineTo(nodeGTrx, nodeGTry);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }
                    //C-h
                    if(((sourcex >=830 && sourcex<=1020)&&(sourcey >=30 && sourcey<=300))&&((destx>=630 && destx<=810)&&(desty>=950&&desty<=1150))) {
                        path1.moveTo(nodeCTLx, nodeCTLy);
                        path1.lineTo(nodeHTRx,nodeHTRy);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }
                    //C-i
                    if(((sourcex >=830 && sourcex<=1020)&&(sourcey >=30 && sourcey<=300))&&((destx>=830 && destx<=1020)&&(desty>=950&&desty<=1150))) {
                        path1.moveTo(nodeCTLx,nodeCTLy);
                        path1.lineTo(nodeHTRx,nodeHTRy);
                        path1.lineTo(nodeITrx, nodeITry);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }
                    //C-j
                    if(((sourcex >=830 && sourcex<=1020)&&(sourcey >=30 && sourcey<=300))&&((destx>=170 && destx<=450)&&(desty>=1300&&desty<=1500))) {
                        path1.moveTo(nodeCTLx,nodeCTLy);
                        path1.lineTo(nodeHTRx,nodeHTRy);
                        path1.lineTo(nodeGTlx, nodeGTly);
                        path1.lineTo(nodeJMidtx,nodeJMidty);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }
                    //C-k
                    if(((sourcex >=830 && sourcex<=1020)&&(sourcey >=30 && sourcey<=300))&&((destx>=830 && destx<=1020)&&(desty>=1300&&desty<=1500))) {
                        path1.moveTo(nodeCTLx, nodeCTLy);
                        path1.lineTo(nodeHTRx, nodeHTRy);
                        path1.lineTo(nodeHTlx, nodeHTly);
                        path1.lineTo(nodeHBlx,nodeHBly);
                        path1.lineTo(nodeIBrx,nodeIBry);
                        path1.lineTo(nodeKTrx,nodeKTry);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }
                    //D-A
                    if(((sourcex >=170 && sourcex<=360)&&(sourcey >=320 && sourcey<=800))&&((destx>=170 && destx<=360)&&(desty>=30&&desty<=300))) {
                        path1.moveTo(nodeDtrx, nodeDtry);
                        path1.lineTo(nodeAx,nodeAy);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }
                    //D-b
                    if(((sourcex >=170 && sourcex<=360)&&(sourcey >=320 && sourcey<=800))&&((destx>=500 && destx<=690)&&(desty>=30&&desty<=300))) {
                        path1.moveTo(nodeDtrx, nodeDtry);
                        path1.lineTo(nodeAx,nodeAy);
                        path1.lineTo(nodeBTLx, nodeBTLy);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }
                    //D-c
                    if(((sourcex >=170 && sourcex<=360)&&(sourcey >=320 && sourcey<=800))&&((destx>=830 && destx<=1020)&&(desty>=30&&desty<=300))) {
                        path1.moveTo(nodeDtrx, nodeDtry);
                        path1.lineTo(nodeAStairTopX,nodeAStairTopY);
                        path1.lineTo(nodeCTLx, nodeCTLy);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }
                    //D-e
                    if(((sourcex >=170 && sourcex<=360)&&(sourcey >=320 && sourcey<=800))&&((destx>=500 && destx<=690)&&(desty>=520&&desty<=800))) {
                        path1.moveTo(nodeDtrx, nodeDtry);
                        path1.lineTo(nodeBBLx,nodeBBLy);
                        path1.lineTo(nodeEtlx, nodeEtly);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }
                    //D-f
                    if(((sourcex >=170 && sourcex<=360)&&(sourcey >=320 && sourcey<=800))&&((destx>=830 && destx<=1020)&&(desty>=520&&desty<=800))) {
                        path1.moveTo(nodeDtrx, nodeDtry);
                        path1.lineTo(nodeCBLx,nodeCBLy);
                        path1.lineTo(nodeFTlx, nodeFTly);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }
                    //D-g
                    if(((sourcex >=170 && sourcex<=360)&&(sourcey >=320 && sourcey<=800))&&((destx>=300 && destx<=480)&&(desty>=950&&desty<=1150))) {
                        path1.moveTo(nodeDtrx, nodeDtry);
                        path1.lineTo(nodeGTMidtX,nodeGTMidY);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }
                    //D-h
                    if(((sourcex >=170 && sourcex<=360)&&(sourcey >=320 && sourcey<=800))&&((destx>=630 && destx<=810)&&(desty>=950&&desty<=1150))) {
                        path1.moveTo(nodeDtrx, nodeDtry);
                        path1.lineTo(nodeGTMidtX,nodeGTMidY);
                        path1.lineTo(nodeHMidtx, nodeHMidty);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }
                    //D-i
                    if(((sourcex >=170 && sourcex<=360)&&(sourcey >=320 && sourcey<=800))&&((destx>=830 && destx<=1020)&&(desty>=950&&desty<=1150))) {
                        path1.moveTo(nodeDtrx, nodeDtry);
                        path1.lineTo(nodeGTMidtX,nodeGTMidY);
                        path1.lineTo(nodeITrx,nodeITry);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }
                    //D-j
                    if(((sourcex >=170 && sourcex<=360)&&(sourcey >=320 && sourcey<=800))&&((destx>=170 && destx<=450)&&(desty>=1300&&desty<=1500))) {
                        path1.moveTo(nodeDtrx, nodeDtry);
                        path1.lineTo(nodeGTMidtX,nodeGTMidY);
                        path1.lineTo(nodeGTlx, nodeGTly);
                        path1.lineTo(nodeJMidtx,nodeJMidty);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }
                    //D-k
                    if(((sourcex >=170 && sourcex<=360)&&(sourcey >=320 && sourcey<=800))&&((destx>=830 && destx<=1020)&&(desty>=1300&&desty<=1500))) {
                        path1.moveTo(nodeDtrx, nodeDtry);
                        path1.lineTo(nodeGTMidtX,nodeGTMidY);
                        path1.lineTo(nodeHTlx, nodeHTly);
                        path1.lineTo(nodeHBlx, nodeHBly);
                        path1.lineTo(nodeIBrx, nodeIBry);
                        path1.lineTo(nodeKTrx, nodeKTry);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }
                    //E-A
                    if(((sourcex >=500 && sourcex<=690)&&(sourcey >=520 && sourcey<=800))&&((destx>=170 && destx<=360)&&(desty>=30&&desty<=300))) {
                        path1.moveTo(nodeEtlx, nodeEtly);
                        path1.lineTo(nodeBTLx,nodeBTLy);
                        path1.lineTo(nodeAx, nodeAy);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }
                    //E-b
                    if(((sourcex >=500 && sourcex<=690)&&(sourcey >=520 && sourcey<=800))&&((destx>=500 && destx<=690)&&(desty>=30&&desty<=300))) {
                        path1.moveTo(nodeEtlx, nodeEtly);
                        path1.lineTo(nodeBTLx,nodeBTLy);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }
                    //E-C
                    if(((sourcex >=500 && sourcex<=690)&&(sourcey >=520 && sourcey<=800))&&((destx>=830 && destx<=1020)&&(desty>=30&&desty<=300))) {
                        path1.moveTo(nodeEtrx, nodeEtry);
                        path1.lineTo(nodeFTlx,nodeFTly);
                        path1.lineTo(nodeCTLx,nodeCTLy);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }
                    //E-D
                    if(((sourcex >=500 && sourcex<=690)&&(sourcey >=520 && sourcey<=800))&&((destx>=170 && destx<=360)&&(desty>=320&&desty<=800))) {
                        path1.moveTo(nodeEblx, nodeEbly);
                        path1.lineTo(nodeDbrx, nodeDbry);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }
                    //E-F
                    if(((sourcex >=500 && sourcex<=690)&&(sourcey >=520 && sourcey<=800))&&((destx>=830 && destx<=1020)&&(desty>=520&&desty<=800))) {
                        path1.moveTo(nodeEtrx, nodeEtry);
                        path1.lineTo(nodeFTlx, nodeFTly);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }
                    //E-G
                    if(((sourcex >=500 && sourcex<=690)&&(sourcey >=520 && sourcey<=800))&&((destx>=300 && destx<=480)&&(desty>=950&&desty<=1150))) {
                        path1.moveTo(nodeEtlx, nodeEtly);
                        path1.lineTo(nodeGTrx,nodeGTry);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }
                    //E-H
                    if(((sourcex >=500 && sourcex<=690)&&(sourcey >=520 && sourcey<=800))&&((destx>=630 && destx<=810)&&(desty>=950&&desty<=1150))) {
                        path1.moveTo(nodeEtrx, nodeEtry);
                        path1.lineTo(nodeHMidtx, nodeHMidty);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }
                    //E-I
                    if(((sourcex >=500 && sourcex<=690)&&(sourcey >=520 && sourcey<=800))&&((destx>=830 && destx<=1020)&&(desty>=950&&desty<=1150))) {
                        path1.moveTo(nodeEtrx, nodeEtry);
                        path1.lineTo(nodeHMidtx, nodeHMidty);
                        path1.lineTo(nodeITrx, nodeITry);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }
                    //E-J
                    if(((sourcex >=500 && sourcex<=690)&&(sourcey >=520 && sourcey<=800))&&((destx>=170 && destx<=450)&&(desty>=1300&&desty<=1500))) {
                        path1.moveTo(nodeEtlx, nodeEtly);
                        path1.lineTo(nodeGTrx,nodeGTry);
                        path1.lineTo(nodeGTlx, nodeGTly);
                        path1.lineTo(nodeJMidtx, nodeJMidty);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }
                    //E-K
                    if(((sourcex >=500 && sourcex<=690)&&(sourcey >=520 && sourcey<=800))&&((destx>=830 && destx<=1020)&&(desty>=1300&&desty<=1500))) {
                        path1.moveTo(nodeEtrx, nodeEtry);
                        path1.lineTo(nodeHMidtx,nodeHMidty);
                        path1.lineTo(nodeHTlx,nodeHTly);
                        path1.lineTo(nodeHBlx,nodeHBly);
                        path1.lineTo(nodeIBrx,nodeIBry);
                        path1.lineTo(nodeKTrx,nodeKTry);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }
                    //F-A
                    if(((sourcex >=830 && sourcex<=1020)&&(sourcey >=520 && sourcey<=800))&&((destx>=170 && destx<=360)&&(desty>=30&&desty<=300))) {
                        path1.moveTo(nodeFTlx, nodeFTly);
                        path1.lineTo(nodeAStairTopX,nodeAStairTopY);
                        path1.lineTo(nodeDtrx, nodeDtry);
                        path1.lineTo(nodeAx, nodeAy);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }
                    //F-B
                    if(((sourcex >=830 && sourcex<=1020)&&(sourcey >=520 && sourcey<=800))&&((destx>=500 && destx<=690)&&(desty>=30&&desty<=300))) {
                        path1.moveTo(nodeFTlx, nodeFTly);
                        path1.lineTo(nodeCTLx,nodeCTLy);
                        path1.lineTo(nodeBTRx, nodeBTRy);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }
                    //F-C
                    if(((sourcex >=830 && sourcex<=1020)&&(sourcey >=520 && sourcey<=800))&&((destx>=830 && destx<=1020)&&(desty>=30&&desty<=300))) {
                        path1.moveTo(nodeFTlx, nodeFTly);
                        path1.lineTo(nodeCTLx,nodeCTLy);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }
                    //F-D
                    if(((sourcex >=830 && sourcex<=1020)&&(sourcey >=520 && sourcey<=800))&&((destx>=170 && destx<=360)&&(desty>=320&&desty<=800))) {
                        path1.moveTo(nodeFTlx, nodeFTly);
                        path1.lineTo(nodeAStairTopX,nodeAStairTopY);
                        path1.lineTo(nodeDtrx, nodeDtry);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }
                    //F-E
                    if(((sourcex >=830 && sourcex<=1020)&&(sourcey >=520 && sourcey<=800))&&((destx>=500 && destx<=690)&&(desty>=520&&desty<=800))) {
                        path1.moveTo(nodeFTlx, nodeFTly);
                        path1.lineTo(nodeEtrx, nodeEtry);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }
                    //F-G
                    if(((sourcex >=830 && sourcex<=1020)&&(sourcey >=520 && sourcey<=800))&&((destx>=300 && destx<=480)&&(desty>=950&&desty<=1150))) {
                        path1.moveTo(nodeFblx, nodeFbly);
                        path1.lineTo(nodeHTRx, nodeHTRy);
                        path1.lineTo(nodeGTrx,nodeGTry);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }
                    //F-H
                    if(((sourcex >=830 && sourcex<=1020)&&(sourcey >=520 && sourcey<=800))&&((destx>=630 && destx<=810)&&(desty>=950&&desty<=1150))) {
                        path1.moveTo(nodeFTlx,nodeFTly);
                        path1.lineTo(nodeHTRx,nodeHTRy);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }
                    //F-I
                    if(((sourcex >=830 && sourcex<=1020)&&(sourcey >=520 && sourcey<=800))&&((destx>=830 && destx<=1020)&&(desty>=950&&desty<=1150))) {
                        path1.moveTo(nodeFblx, nodeFbly);
                        path1.lineTo(nodeITlx, nodeITly);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }
                    //F-J
                    if(((sourcex >=830 && sourcex<=1020)&&(sourcey >=520 && sourcey<=800))&&((destx>=170 && destx<=450)&&(desty>=1300&&desty<=1500))) {
                        path1.moveTo(nodeFTlx,nodeFTly);
                        path1.lineTo(nodeHTRx,nodeHTRy);
                        path1.lineTo(nodeGTlx, nodeGTly);
                        path1.lineTo(nodeJMidtx, nodeJMidty);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }
                    //F-K
                    if(((sourcex >=830 && sourcex<=1020)&&(sourcey >=520 && sourcey<=800))&&((destx>=830 && destx<=1020)&&(desty>=1300&&desty<=1500))) {
                        path1.moveTo(nodeFTlx,nodeFTly);
                        path1.lineTo(nodeHTRx,nodeHTRy);
                        path1.lineTo(nodeHTlx, nodeHTly);
                        path1.lineTo(nodeHBlx, nodeHBly);
                        path1.lineTo(nodeIBrx, nodeIBry);
                        path1.lineTo(nodeKTrx, nodeKTry);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }

                    //G-A
                    if(((sourcex >=300 && sourcex<=480)&&(sourcey >=950 && sourcey<=1150))&&((destx>=170 && destx<=360)&&(desty>=30&&desty<=300))) {

                        path1.moveTo(nodeGTMidtX, nodeGTMidty);
                        path1.lineTo(nodeAx, nodeAy);

                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();


                    }
                    //G-B
                    if(((sourcex >=300 && sourcex<=480)&&(sourcey >=950 && sourcey<=1150))&&((destx>=500 && destx<=690)&&(desty>=30&&desty<=300))) {

                        path1.moveTo(nodeGTrx, nodeGTry);
                        path1.lineTo(nodeBTLx, nodeBTLy);

                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();


                    }
                    //G-C
                    if(((sourcex >=300 && sourcex<=480)&&(sourcey >=950 && sourcey<=1150))&&((destx>=830 && destx<=1020)&&(desty>=30&&desty<=300))) {

                        path1.moveTo(nodeGTrx, nodeGTry);
                        path1.lineTo(nodeBBLx, nodeBBLy);
                        path1.lineTo(nodeCBLx, nodeCBLy);
                        path1.lineTo(nodeCTLx, nodeCTLy);

                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();


                    }
                    //G-D
                    if(((sourcex >=300 && sourcex<=480)&&(sourcey >=950 && sourcey<=1150))&&((destx>=170 && destx<=360)&&(desty>=320&&desty<=800))) {
                        path1.moveTo(nodeGTMidtX, nodeGTMidty);
                        path1.lineTo(nodeDtrx, nodeDtry);

                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();




                    }
                    //G-E
                    if(((sourcex >=300 && sourcex<=480)&&(sourcey >=950 && sourcey<=1150))&&((destx>=500 && destx<=690)&&(desty>=520&&desty<=800))) {

                        path1.moveTo(nodeGTrx, nodeGTry);
                        path1.lineTo(nodeEblx, nodeEbly);

                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();


                    }
                    //G-F
                    if(((sourcex >=300 && sourcex<=480)&&(sourcey >=950 && sourcey<=1150))&&((destx>=830 && destx<=1020)&&(desty>=520&&desty<=800))) {
                        path1.moveTo(nodeGTMidtX, nodeGTMidty);
                        path1.lineTo(nodeITlx, nodeITly);
                        path1.lineTo(nodeFblx, nodeFbly);

                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();




                    }
                    //G-H
                    if(((sourcex >=300 && sourcex<=480)&&(sourcey >=950 && sourcey<=1150))&&((destx>=630 && destx<=810)&&(desty>=950&&desty<=1150))) {
                        path1.moveTo(nodeGTrx, nodeGTry);

                        path1.lineTo(nodeHTlx, nodeHTly);

                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();


                    }
                    //G-I
                    if(((sourcex >=300 && sourcex<=480)&&(sourcey >=950 && sourcey<=1150))&&((destx>=830 && destx<=1020)&&(desty>=950&&desty<=1150))) {

                        path1.moveTo(nodeGTMidtX, nodeGTMidty);

                        path1.lineTo(nodeITrx, nodeITry);

                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();

                    }
                    //G-J
                    if(((sourcex >=300 && sourcex<=480)&&(sourcey >=950 && sourcey<=1150))&&((destx>=170 && destx<=450)&&(desty>=1300&&desty<=1500))) {
                        path1.moveTo(nodeGblx, nodeGbly);
                        path1.lineTo(nodeJMidtx, nodeJMidty);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();


                    }
                    //G-K
                    if(((sourcex >=300 && sourcex<=480)&&(sourcey >=950 && sourcey<=1150))&&((destx>=830 && destx<=1020)&&(desty>=1300&&desty<=1500))) {

                        path1.moveTo(nodeGTMidtX, nodeGTMidty);

                        path1.lineTo(nodeHTlx, nodeHTly);
                        path1.lineTo(nodeHBlx, nodeHBly);
                        path1.lineTo(nodeIBlx, nodeIBly);
                        path1.lineTo(nodeKTlx, nodeKTly);

                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();


                    }



                    //h-A
                    if(((sourcex >=630 && sourcex<=810)&&(sourcey >=950 && sourcey<=1150))&&((destx>=170 && destx<=360)&&(desty>=30&&desty<=300))) {

                        path1.moveTo(nodeHTlx, nodeHTly);

                        path1.lineTo(nodeGTMidtX, nodeGTMidty);
                        path1.lineTo(nodeAx, nodeAy);

                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();



                    }


                    //h-B
                    if(((sourcex >=630 && sourcex<=810)&&(sourcey >=950 && sourcey<=1150))&&((destx>=500 && destx<=690)&&(desty>=30&&desty<=300))) {

                        path1.moveTo(nodeHTRx, nodeHTRy);

                        path1.lineTo(nodeCTLx, nodeCTLy);
                        path1.lineTo(nodeBTRx, nodeBTRy);

                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();


                    }
                    //H-C
                    if(((sourcex >=630 && sourcex<=810)&&(sourcey >=950 && sourcey<=1150))&&((destx>=830 && destx<=1020)&&(desty>=30&&desty<=300))) {
                        path1.moveTo(nodeHTRx, nodeGTry);

                        path1.lineTo(nodeCTLx, nodeCTLy);

                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();


                    }
                    //H-D
                    if(((sourcex >=630 && sourcex<=810)&&(sourcey >=950 && sourcey<=1150))&&((destx>=170 && destx<=360)&&(desty>=320&&desty<=800))) {
                        path1.moveTo(nodeHTlx, nodeHTly);

                        path1.lineTo(nodeGTMidtX, nodeGTMidty);
                        path1.lineTo(nodeDtrx, nodeDtry);

                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();


                    }
                    //H-E
                    if(((sourcex >=630 && sourcex<=810)&&(sourcey >=950 && sourcey<=1150))&&((destx>=500 && destx<=690)&&(desty>=520&&desty<=800))) {
                        path1.moveTo(nodeHMidtx, nodeHMidty);

                        path1.lineTo(nodeEtrx, nodeEtry);

                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();


                    }
                    //H-F
                    if(((sourcex >=630 && sourcex<=810)&&(sourcey >=950 && sourcey<=1150))&&((destx>=830 && destx<=1020)&&(desty>=520&&desty<=800))) {
                        path1.moveTo(nodeHTRx, nodeHTRy);

                        path1.lineTo(nodeFblx, nodeFbly);

                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();


                    }
                    //H-G
                    if(((sourcex >=630 && sourcex<=810)&&(sourcey >=950 && sourcey<=1150))&&((destx>=300 && destx<=480)&&(desty>=950&&desty<=1150))) {

                        path1.moveTo(nodeHTlx, nodeHTly);

                        path1.lineTo(nodeGTrx, nodeGTry);

                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();



                    }
                    //H-I
                    if(((sourcex >=630 && sourcex<=810)&&(sourcey >=950 && sourcey<=1150))&&((destx>=830 && destx<=1020)&&(desty>=950&&desty<=1150))) {

                        path1.moveTo(nodeHTRx, nodeHTRy);

                        path1.lineTo(nodeITrx, nodeITry);

                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();


                    }
                    //H-J
                    if(((sourcex >=630 && sourcex<=810)&&(sourcey >=950 && sourcey<=1150))&&((destx>=170 && destx<=450)&&(desty>=1300&&desty<=1500))) {
                        path1.moveTo(nodeHBlx, nodeHBly);
                        path1.lineTo(nodeGblx, nodeGbly);
                        path1.lineTo(nodeJMidtx, nodeJMidty);

                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();


                    }
                    //H-K
                    if(((sourcex >=630 && sourcex<=810)&&(sourcey >=950 && sourcey<=1150))&&((destx>=830 && destx<=1020)&&(desty>=1300&&desty<=1500))) {
                        path1.moveTo(nodeHBrx, nodeHBry);
                        path1.lineTo(nodeIBrx,nodeIBry);
                        path1.lineTo(nodeKTrx, nodeKTry);

                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();


                    }

                    //I-A
                    if(((sourcex >=830 && sourcex<=1020)&&(sourcey >=950 && sourcey<=1150))&&((destx>=170 && destx<=360)&&(desty>=30&&desty<=300))) {

                        path1.moveTo(nodeITlx, nodeITly);

                        path1.lineTo(nodeGTMidtX, nodeGTMidty);
                        path1.lineTo(nodeAx, nodeAy);

                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();


                    }

                    //I-B
                    if(((sourcex >=830 && sourcex<=1020)&&(sourcey >=950 && sourcey<=1150))&&((destx>=500 && destx<=690)&&(desty>=30&&desty<=300))) {

                        path1.moveTo(nodeITlx, nodeITly);

                        path1.lineTo(nodeHTRx, nodeHTRy);
                        path1.lineTo(nodeCTLx, nodeCTLy);
                        path1.lineTo(nodeBTRx,nodeBTRy);

                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();

                    }
                    //I-C
                    if(((sourcex >=830 && sourcex<=1020)&&(sourcey >=950 && sourcey<=1150))&&((destx>=830 && destx<=1020)&&(desty>=30&&desty<=300))) {

                        path1.moveTo(nodeITlx, nodeITly);

                        path1.lineTo(nodeHTRx, nodeHTRy);
                        path1.lineTo(nodeCTLx, nodeCTLy);

                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }
                    //I-D
                    if(((sourcex >=830 && sourcex<=1020)&&(sourcey >=950 && sourcey<=1150))&&((destx>=170 && destx<=360)&&(desty>=320&&desty<=800))) {

                        path1.moveTo(nodeITlx, nodeITly);

                        path1.lineTo(nodeGTMidtX, nodeGTMidty);
                        path1.lineTo(nodeDtrx, nodeDtry);

                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();


                    }
                    //I-E
                    if(((sourcex >=830 && sourcex<=1020)&&(sourcey >=950 && sourcey<=1150))&&((destx>=500 && destx<=690)&&(desty>=520&&desty<=800))) {

                        path1.moveTo(nodeITlx, nodeITly);

                        path1.lineTo(nodeHTlx, nodeHTly);
                        path1.lineTo(nodeEblx, nodeEbly);

                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();

                    }
                    //I-F
                    if(((sourcex >=830 && sourcex<=1020)&&(sourcey >=950 && sourcey<=1150))&&((destx>=830 && destx<=1020)&&(desty>=520&&desty<=800))) {
                        path1.moveTo(nodeITlx, nodeITly);

                        path1.lineTo(nodeFblx, nodeFbly);

                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();


                    }
                    //I-G
                    if(((sourcex >=830 && sourcex<=1020)&&(sourcey >=950 && sourcey<=1150))&&((destx>=300 && destx<=480)&&(desty>=950&&desty<=1150))) {
                        path1.moveTo(nodeITrx, nodeITry);

                        path1.lineTo(nodeGTMidtX, nodeGTMidty);

                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();



                    }
                    //I-H
                    if(((sourcex >=830 && sourcex<=1020)&&(sourcey >=950 && sourcey<=1150))&&((destx>=630 && destx<=810)&&(desty>=950&&desty<=1150))) {

                        path1.moveTo(nodeITrx, nodeITry);

                        path1.lineTo(nodeHTRx, nodeHTRy);

                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();


                    }
                    //I-J
                    if(((sourcex >=830 && sourcex<=1020)&&(sourcey >=950 && sourcey<=1150))&&((destx>=170 && destx<=450)&&(desty>=1300&&desty<=1500))) {
                        path1.moveTo(nodeIBlx, nodeIBly);

                        path1.lineTo(nodeGBrx, nodeGBry);
                        path1.lineTo(nodeJtrx, nodeJtry);

                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();



                    }
                    //I-K
                    if(((sourcex >=830 && sourcex<=1020)&&(sourcey >=950 && sourcey<=1150))&&((destx>=830 && destx<=1020)&&(desty>=1300&&desty<=1500))) {

                        path1.moveTo(nodeIBrx, nodeIBry);

                        path1.lineTo(nodeKTrx, nodeKTry);

                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();


                    }

                    //J-A
                    if(((sourcex >=170 && sourcex<=450)&&(sourcey >=1300 && sourcey<=1500))&&((destx>=170 && destx<=360)&&(desty>=30&&desty<=300))) {

                        path1.moveTo(nodeJMidtx, nodeJMidty);
                        path1.lineTo(nodeGTlx, nodeGTly);
                        path1.lineTo(nodeGTMidtX, nodeGTMidty);
                        path1.lineTo(nodeAx, nodeAy);

                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();


                    }
                    //J-B
                    if(((sourcex >=170 && sourcex<=450)&&(sourcey >=1300 && sourcey<=1500))&&((destx>=500 && destx<=690)&&(desty>=30&&desty<=300))) {

                        path1.moveTo(nodeJMidtx, nodeJMidty);
                        path1.lineTo(nodeGTlx, nodeGTly);
                        path1.lineTo(nodeGTMidtX, nodeGTMidty);
                        path1.lineTo(nodeAx, nodeAy);
                        path1.lineTo(nodeBTLx, nodeBTLy);

                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();



                    }
                    //J-C
                    if(((sourcex >=170 && sourcex<=450)&&(sourcey >=1300 && sourcey<=1500))&&((destx>=830 && destx<=1020)&&(desty>=30&&desty<=300))) {

                        path1.moveTo(nodeJtrx, nodeJtry);
                        path1.lineTo(nodeGblx, nodeGBry);
                        path1.lineTo(nodeHBlx, nodeHBly);
                        path1.lineTo(nodeHTlx,nodeHTly);
                        path1.lineTo(nodeHTRx,nodeHTRy);
                        path1.lineTo(nodeCTLx, nodeCTLy);
                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();
                    }
                    //J-D
                    if(((sourcex >=170 && sourcex<=450)&&(sourcey >=1300 && sourcey<=1500))&&((destx>=170 && destx<=360)&&(desty>=320&&desty<=800))) {

                        path1.moveTo(nodeJMidtx, nodeJMidty);

                        path1.lineTo(nodeGTlx, nodeGTly);
                        path1.lineTo(nodeGTMidtX,nodeGTMidY);

                        path1.lineTo(nodeDtrx, nodeDtry);

                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();

                    }
                    //J-E
                    if(((sourcex >=170 && sourcex<=450)&&(sourcey >=1300 && sourcey<=1500))&&((destx>=500 && destx<=690)&&(desty>=520&&desty<=800))) {


                        path1.moveTo(nodeJMidtx, nodeJMidty);

                        path1.lineTo(nodeGTlx, nodeGTly);
                        path1.lineTo(nodeGTrx, nodeGTry);
                        path1.lineTo(nodeEtlx, nodeEtly);

                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();

                    }
                    //J-F
                    if(((sourcex >=170 && sourcex<=450)&&(sourcey >=1300 && sourcey<=1500))&&((destx>=830 && destx<=1020)&&(desty>=520&&desty<=800))) {
                        path1.moveTo(nodeJtrx, nodeJtry);
                        path1.lineTo(nodeBStairTopX, nodeBStairTopY);
                        path1.lineTo(nodeHTlx, nodeHTly);
                        path1.lineTo(nodeHTRx,nodeHTRy);
                        path1.lineTo(nodeFTlx, nodeFTly);

                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();


                    }
                    //J-G
                    if(((sourcex >=170 && sourcex<=450)&&(sourcey >=1300 && sourcey<=1500))&&((destx>=300 && destx<=480)&&(desty>=950&&desty<=1150))) {

                        path1.moveTo(nodeJMidtx, nodeJMidty);

                        path1.lineTo(nodeGTlx, nodeGTly);

                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();


                    }
                    //J-H
                    if(((sourcex >=170 && sourcex<=450)&&(sourcey >=1300 && sourcey<=1500))&&((destx>=630 && destx<=810)&&(desty>=950&&desty<=1150))) {
                        path1.moveTo(nodeJtrx, nodeJtry);
                        path1.lineTo(nodeBStairTopX,nodeBStairTopY);
                        path1.lineTo(nodeHTlx, nodeHTly);

                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();



                    }
                    //J-I
                    if(((sourcex >=170 && sourcex<=450)&&(sourcey >=1300 && sourcey<=1500))&&((destx>=830 && destx<=1020)&&(desty>=950&&desty<=1150))) {
                        path1.moveTo(nodeJtrx, nodeJtry);
                        path1.lineTo(nodeBStairTopX,nodeBStairTopY);
                        path1.lineTo(nodeHTlx, nodeHTly);
                        path1.lineTo(nodeITrx, nodeITry);

                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();


                    }
                    //J-K
                    if(((sourcex >=170 && sourcex<=450)&&(sourcey >=1300 && sourcey<=1500))&&((destx>=830 && destx<=1020)&&(desty>=1300&&desty<=1500))) {
                        path1.moveTo(nodeJtrx, nodeJtry);

                        path1.lineTo(nodeKTrx, nodeKTry);

                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();


                    }

                    //K-A
                    if(((sourcex >=830 && sourcex<=1020)&&(sourcey >=1300 && sourcey<=1500))&&((destx>=170 && destx<=360)&&(desty>=30&&desty<=300))) {

                        path1.moveTo(nodeKTlx,nodeKy);
                        path1.lineTo(nodeBStairTopX, nodeBStairTopY);
                        path1.lineTo(nodeHTlx,nodeHy);
                        path1.lineTo(nodeGTMidtX, nodeGTMidY);
                        path1.lineTo(nodeDbrx, nodeDy);
                        path1.lineTo(nodeAx,nodeAy);

                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();


                    }
                    //K-B
                    if(((sourcex >=830 && sourcex<=1020)&&(sourcey >=1300 && sourcey<=1500))&&((destx>=500 && destx<=690)&&(desty>=30&&desty<=300))) {

                        path1.moveTo(nodeKTlx,nodeKy);
                        path1.lineTo(nodeBStairTopX, nodeBStairTopY);
                        path1.lineTo(nodeHTlx,nodeHy);
                        path1.lineTo(nodeGTrx, nodeGTry);
                        path1.lineTo(nodeBTLx, nodeBTLy);

                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();


                    }
                    //K-C
                    if(((sourcex >=830 && sourcex<=1020)&&(sourcey >=1300 && sourcey<=1500))&&((destx>=830 && destx<=1020)&&(desty>=30&&desty<=300))) {

                        path1.moveTo(nodeKTlx,nodeKy);
                        path1.lineTo(nodeBStairTopX, nodeBStairTopY);
                        path1.lineTo(nodeHTlx,nodeHy);

                        path1.lineTo(nodeHTRx,nodeHTRy);
                        path1.lineTo(nodeCTLx, nodeCTLy);

                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();


                    }
                    //K-D
                    if(((sourcex >=830 && sourcex<=1020)&&(sourcey >=1300 && sourcey<=1500))&&((destx>=170 && destx<=360)&&(desty>=320&&desty<=800))) {

                        path1.moveTo(nodeKTlx,nodeKy);
                        path1.lineTo(nodeBStairTopX, nodeBStairTopY);
                        path1.lineTo(nodeHTlx,nodeHy);
                        path1.lineTo(nodeGTMidtX, nodeGTMidY);
                        path1.lineTo(nodeDbrx, nodeDy);

                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();

                    }

                    //K-E
                    if(((sourcex >=830 && sourcex<=1020)&&(sourcey >=1300 && sourcey<=1500))&&((destx>=500 && destx<=690)&&(desty>=520&&desty<=800))) {


                        path1.moveTo(nodeKTlx,nodeKy);
                        path1.lineTo(nodeBStairTopX, nodeBStairTopY);
                        path1.lineTo(nodeHTlx,nodeHy);
                        path1.lineTo(nodeGTrx, nodeGTry);
                        path1.lineTo(nodeEtlx, nodeEtly);

                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();


                    }
                    //K-F
                    if(((sourcex >=830 && sourcex<=1020)&&(sourcey >=1300 && sourcey<=1500))&&((destx>=830 && destx<=1020)&&(desty>=520&&desty<=800))) {
                        path1.moveTo(nodeKTlx,nodeKy);
                        path1.lineTo(nodeBStairTopX, nodeBStairTopY);
                        path1.lineTo(nodeHTlx,nodeHy);

                        path1.lineTo(nodeHTRx,nodeHTRy);
                        path1.lineTo(nodeFTlx, nodeFTly);

                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();


                    }
                    //K-G
                    if(((sourcex >=830 && sourcex<=1020)&&(sourcey >=1300 && sourcey<=1500))&&((destx>=300 && destx<=480)&&(desty>=950&&desty<=1150))) {
                        path1.moveTo(nodeKTlx,nodeKy);
                        path1.lineTo(nodeBStairTopX, nodeBStairTopY);
                        path1.lineTo(nodeHTlx,nodeHy);
                        path1.lineTo(nodeGTMidtX, nodeGTMidY);

                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();

                    }
                    //K-H
                    if(((sourcex >=830 && sourcex<=1020)&&(sourcey >=1300 && sourcey<=1500))&&((destx>=630 && destx<=800)&&(desty>=950&&desty<=1150))) {

                        path1.moveTo(nodeKTlx,nodeKy);
                        path1.lineTo(nodeBStairTopX, nodeBStairTopY);
                        path1.lineTo(nodeHTlx,nodeHy);

                        path1.lineTo(nodeHTRx,nodeHTRy);

                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();


                    }
                    //K-I
                    if(((sourcex >=830 && sourcex<=1020)&&(sourcey >=1300 && sourcey<=1500))&&((destx>=830 && destx<=1020)&&(desty>=950&&desty<=1150))) {

                        path1.moveTo(nodeKTrx,nodeKTry);
                        path1.lineTo(nodeIBrx, nodeIBry);

                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();




                    }
                    //K-J
                    if(((sourcex >=830 && sourcex<=1020)&&(sourcey >=1300 && sourcey<=1500))&&((destx>=170 && destx<=450)&&(desty>=1300&&desty<=1500))) {

                        path1.moveTo(nodeKTlx,nodeKy);
                        path1.lineTo(nodeJtrx, nodeJtry);

                        pathMeasure = new PathMeasure(path1, false);
                        pathLength = pathMeasure.getLength();

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



