package com.example.fahadkhanashrafi.naukriapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SignUp extends AppCompatActivity {
    TextView txtAlready;
   private EditText username,email,mobile,pass;
     String uname,uemail,umobile,upass;

    Button btnReg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        txtAlready = (TextView) findViewById(R.id.txtAlready);
        btnReg = (Button) findViewById(R.id.btnReg);
        username = (EditText) findViewById(R.id.et_username);
        email = (EditText) findViewById(R.id.et_email);
        mobile = (EditText) findViewById(R.id.et_mobile);
        pass = (EditText) findViewById(R.id.et_pass);
        txtAlready.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignUp.this,Signin.class));
            }
        });
        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Reg();

            }
        });
    }


    private void Reg() {
        uname = username.getText().toString().trim();
        uemail = email.getText().toString().trim();
        umobile = mobile.getText().toString().trim();
        upass = pass.getText().toString().trim();
        if (TextUtils.isEmpty(uname)) {
            username.setError("Please Enter Name");
            return;
        }
        else if (TextUtils.isEmpty(uemail)) {
            email.setError("Please Enter Email");
            return;
        }
        else if (TextUtils.isEmpty(umobile)) {
            mobile.setError("Please Enter Mobile Number");
            return;
        }
        else if (umobile.length() != 11) {
            mobile.setError("Please Enter Valid Contact");
            return;
        }
        else if (TextUtils.isEmpty(upass)) {
            pass.setError("Please Enter Password");
            return;
        }

        startActivity(new Intent(SignUp.this,Signin.class));
        finish();
    }



}
