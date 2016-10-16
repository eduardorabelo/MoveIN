package com.example.shoaib.movein;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

public class ImageFileFloor2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_file_floor2);

        ImageView Im = (ImageView) findViewById(R.id.cross2);

        Bundle extras = getIntent().getExtras();


        String Image= extras.getString("image");


        if (Image.equals("Khyber2"))
        {
            Toast toast = Toast.makeText(ImageFileFloor2.this,Image,Toast.LENGTH_SHORT);

            toast.show();
            Im.setImageResource(R.drawable.khyber2);

        }

        else if(Image.equals("Khyber1")) {

            Toast toast = Toast.makeText(ImageFileFloor2.this,Image,Toast.LENGTH_SHORT);

            toast.show();

            Im.setImageResource(R.drawable.khyber1);


        }


        else if(Image.equals("Control room")) {

            Toast toast = Toast.makeText(ImageFileFloor2.this,Image,Toast.LENGTH_SHORT);

            toast.show();

            Im.setImageResource(R.drawable.controlroom);


        }
        else if(Image.equals("Nascon room")) {

            Toast toast = Toast.makeText(ImageFileFloor2.this,Image,Toast.LENGTH_SHORT);

            toast.show();
            Im.setImageResource(R.drawable.nasconroom);


        }

        else if(Image.equals("Faculty1")) {

            Toast toast = Toast.makeText(ImageFileFloor2.this,Image,Toast.LENGTH_SHORT);

            toast.show();
            Im.setImageResource(R.drawable.faculty1);


        }

        else if(Image.equals("Faculty2")) {

            Toast toast = Toast.makeText(ImageFileFloor2.this,Image,Toast.LENGTH_SHORT);

            toast.show();
            Im.setImageResource(R.drawable.faculty2);


        }

        else if(Image.equals("Faculty3")) {

            Toast toast = Toast.makeText(ImageFileFloor2.this,Image,Toast.LENGTH_SHORT);

            toast.show();
            Im.setImageResource(R.drawable.faculty3);


        }

        else if(Image.equals("Rawal lab")) {

            Toast toast = Toast.makeText(ImageFileFloor2.this,Image,Toast.LENGTH_SHORT);

            toast.show();
            Im.setImageResource(R.drawable.rawallab);


        }

        else if(Image.equals("Ladies room")) {

            Toast toast = Toast.makeText(ImageFileFloor2.this,Image,Toast.LENGTH_SHORT);

            toast.show();
            Im.setImageResource(R.drawable.ladiesroom);


        }

        else if(Image.equals("Men's room")) {

            Toast toast = Toast.makeText(ImageFileFloor2.this,Image,Toast.LENGTH_SHORT);

            toast.show();
            Im.setImageResource(R.drawable.mensroom);


        }

        else if(Image.equals("201")) {

            Toast toast = Toast.makeText(ImageFileFloor2.this,Image,Toast.LENGTH_SHORT);

            toast.show();
            Im.setImageResource(R.drawable.r201);


        }

        else if(Image.equals("202")) {

            Toast toast = Toast.makeText(ImageFileFloor2.this,Image,Toast.LENGTH_SHORT);

            toast.show();
            Im.setImageResource(R.drawable.r202);


        }

        else if(Image.equals("203")) {

            Toast toast = Toast.makeText(ImageFileFloor2.this,Image,Toast.LENGTH_SHORT);

            toast.show();
            Im.setImageResource(R.drawable.r203);


        }

        else if(Image.equals("Exam room")) {

            Toast toast = Toast.makeText(ImageFileFloor2.this,Image,Toast.LENGTH_SHORT);

            toast.show();
            Im.setImageResource(R.drawable.examroom);


        }

        else if(Image.equals("Academics")) {

            Toast toast = Toast.makeText(ImageFileFloor2.this,Image,Toast.LENGTH_SHORT);

            toast.show();
            Im.setImageResource(R.drawable.academics);


        }

        else if(Image.equals("Faculty4")) {

            Toast toast = Toast.makeText(ImageFileFloor2.this,Image,Toast.LENGTH_SHORT);

            toast.show();
            Im.setImageResource(R.drawable.faculty4);


        }

        else if(Image.equals("210")) {

            Toast toast = Toast.makeText(ImageFileFloor2.this,Image,Toast.LENGTH_SHORT);

            toast.show();
            Im.setImageResource(R.drawable.r210);


        }

        else if(Image.equals("211")) {

            Toast toast = Toast.makeText(ImageFileFloor2.this,Image,Toast.LENGTH_SHORT);

            toast.show();
            Im.setImageResource(R.drawable.r211);


        }

        else if(Image.equals("Faculty5")) {

            Toast toast = Toast.makeText(ImageFileFloor2.this,Image,Toast.LENGTH_SHORT);

            toast.show();
            Im.setImageResource(R.drawable.a);


        }



    }
}
