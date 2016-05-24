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

public class GetIdentification  extends Activity {

    EditText username, password;
    Button signIn;

    // json array response url
    private String urlJsonArray = "http://movein.azurewebsites.net/api/User_Identification";

    private static String TAG1 = GetIdentification.class.getSimpleName();


    // Progress dialog
    private ProgressDialog pDialog;

    // temporary string to show the parsed response
    private String EmailID,Password,str1="",str2="";

    private static int CHeck=0;


    private static final String TAG = "LogIn";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        pDialog = new ProgressDialog(this);
        pDialog.setMessage("Please wait...");
        pDialog.setCancelable(false);



        username=(EditText)findViewById(R.id.editText_InEmailID);
        password=(EditText)findViewById(R.id.editText_InPassword);

        username.setText("");
        password.setText("");

        signIn=(Button)findViewById(R.id.button_InSignin);

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                str1=username.getText().toString();
                str2=password.getText().toString();

                makeJsonArrayRequest();

            }
        });

    }

    /**
     * Method to make json array request where response starts with [
     * */
    private void makeJsonArrayRequest() {

        showpDialog();

        RequestQueue queue = Volley.newRequestQueue(getApplicationContext());
        JsonArrayRequest req = new JsonArrayRequest(urlJsonArray,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {
                        Log.d(TAG, response.toString());

                        try {
                            // Parsing json array response
                            // loop through each json object
                            //jsonResponse = "";
                            for (int i = 0; i < response.length(); i++) {

                                JSONObject person = (JSONObject) response
                                        .get(i);

                                EmailID = person.getString("Email_ID");
                                Password= person.getString("Password");


                                if (EmailID.equals(str1) && Password.equals(str2)) {

                                    CHeck = 1;
                                    Intent k = new Intent(GetIdentification.this, MainActivity.class);
                                    k.putExtra("User-ID", EmailID);
                                    startActivity(k);

                                }
                            }
                            if(CHeck==0) {

                                showMessgae("Error :","Username Or Password is incorrect!");

                                password.setText("");
                            }

                        } catch (JSONException e) {
                            e.printStackTrace();
                            Toast.makeText(getApplicationContext(),
                                    "Error: " + e.getMessage(),
                                    Toast.LENGTH_LONG).show();
                        }

                        hidepDialog();
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                VolleyLog.d(TAG, "Error: " + error.getMessage());
                Toast.makeText(getApplicationContext(),
                        error.getMessage(), Toast.LENGTH_SHORT).show();
                hidepDialog();
            }
        });


        // Adding request to request queue
        queue.add(req);

    }


    private void showpDialog() {
        if (!pDialog.isShowing())
            pDialog.show();
    }

    private void hidepDialog() {
        if (pDialog.isShowing())
            pDialog.dismiss();
    }

    public void showMessgae(String title, String message) {
        Builder builder = new Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
    }

}
