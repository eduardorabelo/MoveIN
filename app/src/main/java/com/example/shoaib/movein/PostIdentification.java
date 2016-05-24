package com.example.shoaib.movein;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
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
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Hamza on 5/25/2016.
 */
public class PostIdentification extends Activity {

    EditText Full_Name, Email_ID,Password;
    Button SignUp;

    private static ProgressDialog pDialog;
    private static String TAG = PostIdentification.class.getSimpleName();

    static String StrName;
    static String StrEmail;
    static String strPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        pDialog = new ProgressDialog(this);
        pDialog.setMessage("Please wait...");
        pDialog.setCancelable(false);


        Full_Name=(EditText)findViewById(R.id.editText_FullName);
        Email_ID=(EditText)findViewById(R.id.editText_EmailID);
        Password=(EditText)findViewById(R.id.editText_InPassword);


        SignUp=(Button)findViewById(R.id.button_SignUpDone);

        SignUp.setOnClickListener(new View.OnClickListener() {
            @TargetApi(Build.VERSION_CODES.GINGERBREAD)
            @Override
            public void onClick(View v) {

                StrName = Full_Name.getText().toString();
                StrEmail = Email_ID.getText().toString();
                strPassword=Password.getText().toString();

                if(StrEmail.isEmpty() || StrName.isEmpty() || strPassword.isEmpty() ) {

                    showMessgae("Error"," Kindly Fill In All the Fields");

                }else {

                    postNewComment(getApplicationContext());
                }
            }
        });

    }

    public void postNewComment(Context context){

        showpDialog();

        final PostCommentResponseListener mPostCommentResponse=new PostCommentResponseListener() {
            @Override
            public void requestStarted()
            {

            }

            @Override
            public void requestCompleted()
            {

                Toast.makeText(getApplicationContext(),
                        "Congratulations SignUp Successfull!!", Toast.LENGTH_LONG).show();

                Intent i = new Intent(PostIdentification.this, GetIdentification.class);
                startActivity(i);

            }

            @Override
            public void requestEndedWithError(VolleyError error) {

                Toast.makeText(getApplicationContext(),
                        error.getMessage(), Toast.LENGTH_SHORT).show();

            }
        };
        mPostCommentResponse.requestStarted();
        RequestQueue queue = Volley.newRequestQueue(context);
        StringRequest sr = new StringRequest(Request.Method.POST,"http://movein.azurewebsites.net/api/User_Identification", new Response.Listener<String>()
        {
            @Override
            public void onResponse(String response) {
                mPostCommentResponse.requestCompleted();

                Log.d(TAG, response.toString());

                hidepDialog();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                mPostCommentResponse.requestEndedWithError(error);

                VolleyLog.d(TAG, "Error: " + error.getMessage());
                Toast.makeText(getApplicationContext(),
                        error.getMessage(), Toast.LENGTH_SHORT).show();

                hidepDialog();
            }
        }){
            @Override
            protected Map<String,String> getParams(){
                Map<String,String> params = new HashMap<String, String>();
                params.put("Email_ID", StrEmail);
                params.put("Name", StrName);
                params.put("Password", strPassword);

                return params;
            }

        };
        queue.add(sr);
    }

    public interface PostCommentResponseListener {
        public void requestStarted();
        public void requestCompleted();
        public void requestEndedWithError(VolleyError error);
    }

    private static void showpDialog() {
        if (!pDialog.isShowing())
            pDialog.show();
    }
    private static void hidepDialog() {
        if (pDialog.isShowing())
            pDialog.dismiss();
    }
    public void showMessgae(String title, String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
    }
}
