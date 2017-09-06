package com.jerome.exercise1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.jerome.exercise1.R;

public class MainActivity extends AppCompatActivity {

    EditText etquiz1;
    EditText etquiz2;
    EditText etseatworks;
    EditText etlabexercise;
    EditText etmajorexam;
    Button btn_Send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etquiz1 = (EditText) findViewById(R.id.etQ1);
        etquiz2 = (EditText) findViewById(R.id.etQ2);
        etseatworks = (EditText) findViewById(R.id.etSW);
        etlabexercise = (EditText) findViewById(R.id.etLE);
        etmajorexam = (EditText) findViewById(R.id.etME);
        btn_Send = (Button) findViewById(R.id.btnSend);
    }

    public void callSecondActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        double Q1 =.10*(Integer.parseInt(etquiz1.getText().toString()));
        double Q2 =.10*(Integer.parseInt(etquiz2.getText().toString()));
        double SW =.10*(Integer.parseInt(etseatworks.getText().toString()));
        double LE =.40*(Integer.parseInt(etlabexercise.getText().toString()));
        double ME =.30*(Integer.parseInt(etmajorexam.getText().toString()));
        double ra = Q1 + Q2 + SW + LE + ME;
        intent.putExtra("ra",Double.toString(ra));
        String FG = new String();
        if ( ra < 60 ) {
            FG = "Failed";
        } else if ( ra <= 65 ) {
            FG = "3.00";
        }
        else if ( ra <= 70 ) {
            FG = "2.75";
        }
        else if ( ra <= 75 ) {
            FG="2.50";
        }
        else if ( ra <= 80 ) {
            FG = "2.25";
        }
        else if ( ra <= 85 ) {
            FG = "2.00";
        }
        else if ( ra <= 90 ) {
            FG = "1.75";
        }else if ( ra <= 92 ) {
            FG = "1.5";
        }
        else if ( ra <= 94 ) {
            FG = "1.25";
        }
        else if ( ra <= 100 ) {
            FG = "1.00";
        }
        intent.putExtra("fg",FG);
        startActivity(intent);
    }
}
