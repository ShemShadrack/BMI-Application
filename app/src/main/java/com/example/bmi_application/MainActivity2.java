package com.example.bmi_application;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void calcBmi(View view){

        double weight=0;
        double height=0;
        double bmi=0;
        String result="";

        EditText edit=(EditText) findViewById(R.id.entWeight);
        EditText edit1=(EditText) findViewById(R.id.entHeight);

        Button button=(Button) findViewById(R.id.calcBut);

        TextView textView=(TextView) findViewById(R.id.YBmi);
        TextView textView1=(TextView) findViewById(R.id.YResult);


        weight =Double.parseDouble(edit.getText().toString());
        height =Double.parseDouble(edit1.getText().toString());

        bmi=height * height;
        bmi=weight / bmi;

        textView.setText(String.valueOf(bmi));

        if(bmi < 18.5){
            result="Under Weight";
        }else if (bmi > 18.5 && bmi < 25){
            result="Normal";
        }else if (bmi > 25){
            result="OverWeight";
        }

        textView1.setText(result);
    }
}