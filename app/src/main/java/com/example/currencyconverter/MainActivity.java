package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnclick(View view) {
        EditText ed = (EditText) findViewById(R.id.input);
        double res = 0;
        double inp = Double.parseDouble(ed.getText().toString());
        res = inp /65;
        String amountinrupees = String.format("%.2f", res);
        Toast.makeText(this, "" + ed.getText().toString() + "₹ is " + amountinrupees + "$", Toast.LENGTH_SHORT).show();
    }
}