package com.example.paycheckcalculator;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    } // end onCreate()

    public void calcGross(View v){
        // capture field inputs
        final EditText h = (EditText) findViewById(R.id.hrs);
        final EditText r = (EditText) findViewById(R.id.payRate);
        final TextView g = (TextView) findViewById(R.id.grossOutput);
        final ImageView i = (ImageView) findViewById(R.id.logo);

        // declare local variables
        Double hours, rate, grossPay = 0.0;

        // capture text field inputs
        hours = Double.parseDouble(h.getText().toString());
        rate = Double.parseDouble(r.getText().toString());
        grossPay = hours * rate;

        // setup output string formatting
        String outputFormat = String.format("$%, .2f", grossPay);

        // post output to view
        g.setText(outputFormat);

        // swap image within image view
        i.setImageResource(R.drawable.grosspay);

    } // end calcGross()
} // end MainActivity
