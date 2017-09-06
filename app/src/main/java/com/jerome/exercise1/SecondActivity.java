package com.jerome.exercise1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.jerome.exercise1.MainActivity;
import com.jerome.exercise1.R;

public class SecondActivity extends AppCompatActivity {
    TextView tvRA;
    TextView tvFG;
    Button btn_Back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvRA = (TextView) findViewById(R.id.RA);
        tvFG = (TextView) findViewById(R.id.FG);

        btn_Back = (Button) findViewById(R.id.btnBack);
        String ra = getIntent().getStringExtra("ra");
        String fg = getIntent().getStringExtra("fg");

        tvRA.setText("Your RA is "+ra);
        tvFG.setText("Your FG is "+fg);
    }
    public void goBackToMain(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}
