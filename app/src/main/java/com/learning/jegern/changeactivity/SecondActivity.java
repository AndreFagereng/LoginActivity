package com.learning.jegern.changeactivity;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class SecondActivity extends Activity {

    Button _getBackBtn;
    TextView getEmail;
    TextView getPassword;
    private ArrayAdapter<String> mArrayAdapter;
    ListView listView;
    private PlaceAdapter placeAdapter;

    Place[] places = new Place[]{
            new Place("Norway", 951, "norway", "Good country"),
            new Place("America", 2012, "murica", "Also good country"),
            new Place("Macedonia", 21515, "macedonia", "Good country"),
            new Place("France", 54, "france", "Good country"),
            new Place("Lebanon", 325, "lebanon", "Good country"),
            new Place("Lebanon", 325, "lebanon", "Good country"),
            new Place("Lebanon", 325, "lebanon", "Good country"),
            new Place("Lebanon", 325, "lebanon", "Good country"),
            new Place("Lebanon", 325, "lebanon", "Good country")
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        listView = (ListView)findViewById(R.id.listView);

        placeAdapter = new PlaceAdapter(this, R.layout.row, places);

        if(listView != null){
            listView.setAdapter(placeAdapter);
        }



        //String pass;
        //String email;

        //getEmail = (TextView)findViewById(R.id.getEmail);
        //getPassword = (TextView)findViewById(R.id.getPassword);


        /*Bundle extra = getIntent().getExtras();

        if(extra == null){
            System.out.println("EXTRA IS NULL");
        }
        if(extra != null){
            pass = extra.getString("Password");
            email = extra.getString("Email");
            if(pass != null || email != null){
                getEmail.setText(email);
                getPassword.setText(pass);
            }
        }*/
        _getBackBtn = (Button)findViewById(R.id._getBackBtn);

        _getBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });



    }
}
