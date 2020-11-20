package com.example.calculator_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private CustomView  customView;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button nine;
    private Button point;
    private Button sum;
    private Button addition;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);

        //works well color changing
//        one.setBackgroundColor(getResources().getColor(R.color.black));

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Hello 1");
            }
        });
    }
}