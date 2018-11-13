package com.example.student.twobuttongame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int P1Score=0;
    private int P2Score=0;
    private TextView P1View;
    private TextView P2View;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        P1View = (TextView) findViewById(R.id.P1Score);
        P2View = (TextView) findViewById(R.id.P2Score);
    }

    public void score_function(View view) {
        P1View.setText(++P1Score + "");
    }

    public void score2_function(View view) {
        P2View.setText(++P2Score + "");
    }
}
