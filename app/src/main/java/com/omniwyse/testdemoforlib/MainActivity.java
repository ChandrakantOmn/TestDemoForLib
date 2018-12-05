package com.omniwyse.testdemoforlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.omniwyse.addnumbers.MyMaths;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView= findViewById(R.id.resultTv);
        textView.setText(MyMaths.getSum(2000,8654));
    }
}
