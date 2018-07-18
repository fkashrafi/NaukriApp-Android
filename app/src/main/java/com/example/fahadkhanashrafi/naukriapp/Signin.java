package com.example.fahadkhanashrafi.naukriapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Signin extends AppCompatActivity {
    TextView signUp;
    EditText email,pass;
    String uemail,upass;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        signUp = (TextView) findViewById(R.id.txtSign_up);
        email = (EditText) findViewById(R.id.et_email);
        pass = (EditText) findViewById(R.id.et_pass);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        //OnClick SignUp Text
        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Signin.this,Regopt.class));
            }
        });
        //Onclick Login btn
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Login();
            }
        });

    }

    private void Login() {
        uemail = email.getText().toString().trim();
        upass = pass.getText().toString().trim();
        if (TextUtils.isEmpty(uemail)) {
            email.setError("Please Enter Email");
            return;
        }
        else if (TextUtils.isEmpty(upass)){
            pass.setError("Please Enter Password");
        return;
        }
        startActivity(new Intent(Signin.this,Navigation.class));
        finish();
    }

}
