package com.example.shoaib.movein;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class ImageFileFloor3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_file_floor3);

        ImageView Im = (ImageView) findViewById(R.id.cross3);

        Bundle extras = getIntent().getExtras();


        String Image= extras.getString("image");


//        if (Image.equals("Reveal Lab"))
//        {
//            Toast toast = Toast.makeText(ImageFileFloor3.this,Image,Toast.LENGTH_SHORT);
//
//            toast.show();
//            Im.setImageResource(R.drawable.reveallab);
//
//        }

//         if(Image.equals("TA's Office")) {
//
//            Toast toast = Toast.makeText(ImageFileFloor3.this,Image,Toast.LENGTH_SHORT);
//
//            toast.show();
//
//            Im.setImageResource(R.drawable.taoffice);
//
//
//        }


         if(Image.equals("Lab Instructors")) {

            Toast toast = Toast.makeText(ImageFileFloor3.this,Image,Toast.LENGTH_SHORT);

            toast.show();

            Im.setImageResource(R.drawable.labinstructors);


        }
        else if(Image.equals("305")) {

            Toast toast = Toast.makeText(ImageFileFloor3.this,Image,Toast.LENGTH_SHORT);

            toast.show();
            Im.setImageResource(R.drawable.r305);


        }

        else if(Image.equals("Faculty1")) {

            Toast toast = Toast.makeText(ImageFileFloor3.this,Image,Toast.LENGTH_SHORT);

            toast.show();
            Im.setImageResource(R.drawable.faculty13);


        }

        else if(Image.equals("Boys Common Room")) {

            Toast toast = Toast.makeText(ImageFileFloor3.this,Image,Toast.LENGTH_SHORT);

            toast.show();
            Im.setImageResource(R.drawable.boyscommonroom);


        }

        else if(Image.equals("316")) {

            Toast toast = Toast.makeText(ImageFileFloor3.this,Image,Toast.LENGTH_SHORT);

            toast.show();
            Im.setImageResource(R.drawable.r316);


        }

        else if(Image.equals("315")) {

            Toast toast = Toast.makeText(ImageFileFloor3.this,Image,Toast.LENGTH_SHORT);

            toast.show();
            Im.setImageResource(R.drawable.r315);


        }

        else if(Image.equals("314")) {

            Toast toast = Toast.makeText(ImageFileFloor3.this,Image,Toast.LENGTH_SHORT);

            toast.show();
            Im.setImageResource(R.drawable.r314);


        }

        else if(Image.equals("Fyp Lab")) {

            Toast toast = Toast.makeText(ImageFileFloor3.this,Image,Toast.LENGTH_SHORT);

            toast.show();
            Im.setImageResource(R.drawable.fyplab);


        }

        else if(Image.equals("201")) {

            Toast toast = Toast.makeText(ImageFileFloor3.this,Image,Toast.LENGTH_SHORT);

            toast.show();
            Im.setImageResource(R.drawable.r201);


        }

        else if(Image.equals("Ladies room")) {

            Toast toast = Toast.makeText(ImageFileFloor3.this,Image,Toast.LENGTH_SHORT);

            toast.show();
            Im.setImageResource(R.drawable.ladiesroom3);


        }

        else if(Image.equals("Men's room")) {

            Toast toast = Toast.makeText(ImageFileFloor3.this,Image,Toast.LENGTH_SHORT);

            toast.show();
            Im.setImageResource(R.drawable.mendsroom3);


        }

        else if(Image.equals("301")) {

            Toast toast = Toast.makeText(ImageFileFloor3.this,Image,Toast.LENGTH_SHORT);

            toast.show();
            Im.setImageResource(R.drawable.r301);


        }

        else if(Image.equals("302")) {

            Toast toast = Toast.makeText(ImageFileFloor3.this,Image,Toast.LENGTH_SHORT);

            toast.show();
            Im.setImageResource(R.drawable.r302);


        }

        else if(Image.equals("303")) {

            Toast toast = Toast.makeText(ImageFileFloor3.this,Image,Toast.LENGTH_SHORT);

            toast.show();
            Im.setImageResource(R.drawable.r303);


        }

//        else if(Image.equals("Store")) {
//
//            Toast toast = Toast.makeText(ImageFileFloor3.this,Image,Toast.LENGTH_SHORT);
//
//            toast.show();
//            Im.setImageResource(R.drawable.store);
//
//
//        }

        else if(Image.equals("310")) {

            Toast toast = Toast.makeText(ImageFileFloor3.this,Image,Toast.LENGTH_SHORT);

            toast.show();
            Im.setImageResource(R.drawable.r310);


        }

        else if(Image.equals("311")) {

            Toast toast = Toast.makeText(ImageFileFloor3.this,Image,Toast.LENGTH_SHORT);

            toast.show();
            Im.setImageResource(R.drawable.r311);


        }

        else if(Image.equals("Karakoram Lab")) {

            Toast toast = Toast.makeText(ImageFileFloor3.this,Image,Toast.LENGTH_SHORT);

            toast.show();
            Im.setImageResource(R.drawable.karakoramlab);


        }

        else if(Image.equals("Graduate Lab")) {

            Toast toast = Toast.makeText(ImageFileFloor3.this,Image,Toast.LENGTH_SHORT);

            toast.show();
            Im.setImageResource(R.drawable.graduatelab);


        }

    }
}
