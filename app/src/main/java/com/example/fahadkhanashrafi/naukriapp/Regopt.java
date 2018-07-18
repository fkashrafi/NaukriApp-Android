package com.example.fahadkhanashrafi.naukriapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Regopt extends AppCompatActivity {
    Button hire,work;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regopt);
        hire = (Button) findViewById(R.id.btnhire);
        work = (Button) findViewById(R.id.btnwork);
        hire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RegView();
            }
        });
        work.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RegView();
            }
        });
    }

    private void RegView(){
        startActivity(new Intent(Regopt.this,SignUp.class));
    }
}
