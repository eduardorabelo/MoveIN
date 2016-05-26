package com.example.shoaib.movein;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Hamza on 5/25/2016.
 */

public class GetIdentification1  extends Activity {

    EditText username1, password1;
    Button signIn1;

    // json array response url
    private String urlJsonArray1 = "http://movein.azurewebsites.net/api/User_Identification";

    private static String TAG11 = GetIdentification.class.getSimpleName();


    // Progress dialog
    private ProgressDialog pDialog;

    // temporary string to show the parsed response
    private String EmailID1,Password1,str11="",str22="";

    private static int CHecki=0;


    private static final String TAG2 = "LogIn";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        pDialog = new ProgressDialog(this);
        pDialog.setMessage("Please wait...");
        pDialog.setCancelable(false);



        username1=(EditText)findViewById(R.id.editText_InEmailID);
        password1=(EditText)findViewById(R.id.editText_InPassword);

        username1.setText("");
        password1.setText("");

        signIn1=(Button)findViewById(R.id.button_InSignin);

        signIn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                str11=username1.getText().toString();
                str22=password1.getText().toString();

                makeJsonArrayRequest1();

            }
        });

    }

    /**
     * Method to make json array request where response starts with [
     * */
    private void makeJsonArrayRequest1() {

        showpDialog1();

        RequestQueue queue11 = Volley.newRequestQueue(getApplicationContext());
        JsonArrayRequest req11 = new JsonArrayRequest(urlJsonArray1,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        Log.d(TAG2, response.toString());

                        try {
                            // Parsing json array response
                            // loop through each json object
                            //jsonResponse = "";
                            for (int i = 0; i < response.length(); i++) {

                                JSONObject person = (JSONObject) response
                                        .get(i);

                                EmailID1 = person.getString("Email_ID");
                                Password1= person.getString("Password");


                                if (EmailID1.equals(str11) && Password1.equals(str22)) {

                                    CHecki = 1;
                                    Intent k = new Intent(GetIdentification1.this, DesignMap.class);
                                    k.putExtra("User-ID", EmailID1);
                                    startActivity(k);

                                }
                            }
                            if(CHecki==0) {

                                showMessgae1("Error :","Username Or Password is incorrect!");

                                password1.setText("");
                            }

                        } catch (JSONException e) {
                            e.printStackTrace();
                            Toast.makeText(getApplicationContext(),
                                    "Error: " + e.getMessage(),
                                    Toast.LENGTH_LONG).show();
                        }

                        hidepDialog1();
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                VolleyLog.d(TAG2, "Error: " + error.getMessage());
                Toast.makeText(getApplicationContext(),
                        error.getMessage(), Toast.LENGTH_SHORT).show();
                hidepDialog1();
            }
        });


        // Adding request to request queue
        queue11.add(req11);

    }


    private void showpDialog1() {
        if (!pDialog.isShowing())
            pDialog.show();
    }

    private void hidepDialog1() {
        if (pDialog.isShowing())
            pDialog.dismiss();
    }

    public void showMessgae1(String title, String message) {
        Builder builder = new Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
    }

}
