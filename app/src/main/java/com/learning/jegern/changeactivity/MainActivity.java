package com.learning.jegern.changeactivity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    Button _registerBtn;
    TextView test;
    EditText getPassword;
    EditText getEmail;
    String pass;
    String email;

    public static final int DETAIL_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        test = (TextView) findViewById(R.id.test);
        getPassword = (EditText) findViewById(R.id.password);
        getEmail = (EditText) findViewById(R.id.email);


        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ForgotInfoActivity.class);
                startActivity(i);

            }
        });

        _registerBtn = (Button)findViewById(R.id._registerBtn);

        _registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                pass = getPassword.getText().toString();
                email = getEmail.getText().toString();

                Intent i = new Intent(v.getContext(), SecondActivity.class);
                i.putExtra("Password", pass).putExtra("Email", email);
                startActivityForResult(i,DETAIL_REQUEST);
            }
        });

    }


}
