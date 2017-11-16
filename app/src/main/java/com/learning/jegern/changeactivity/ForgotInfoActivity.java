package com.learning.jegern.changeactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ForgotInfoActivity extends AppCompatActivity {

    Button _sendPWBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_info);

        _sendPWBtn = (Button)findViewById(R.id._sendPWBtn);

        _sendPWBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), ForgotInfoActivity.class);
                startActivity(i);
            }
        });

    }
}
