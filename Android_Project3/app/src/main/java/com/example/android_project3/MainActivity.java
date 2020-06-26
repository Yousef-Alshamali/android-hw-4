package com.example.android_project3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView mytext;
    Button mybutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         mytext = (TextView) findViewById(R.id.TextView2);
         mybutton = (Button) findViewById(R.id.button1);
         Button reset = findViewById(R.id.button2);
         final EditText w = findViewById(R.id.EditText1);
         final EditText x = findViewById(R.id.EditText2);
         final EditText y = findViewById(R.id.EditText3);
         final EditText z = findViewById(R.id.EditText4);

         mybutton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 String number1String = w.getText().toString();
                 String number2String = x.getText().toString();
                 String number3String = y.getText().toString();
                 String number4String = z.getText().toString();
                 double number1 = Double.parseDouble(number1String);
                 double number2 = Double.parseDouble(number2String);
                 double number3 = Double.parseDouble(number3String);
                 double number4 = Double.parseDouble(number4String);
                 double Sum = number1 + number2 + number3 + number4;
                 mytext.setText(Grade(Sum));


             }
         });

         reset.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 //reset edit text
                 w.setText(null);
                 w.dispatchDisplayHint(View.VISIBLE);

                 x.setText(null);
                 x.dispatchDisplayHint(View.VISIBLE);

                 y.setText(null);
                 y.dispatchDisplayHint(View.VISIBLE);

                 z.setText(null);
                 z.dispatchDisplayHint(View.VISIBLE);

                 //reset text view
                 mytext.setText("Your grade will appear here");
             }
         });
    }
    public static String Grade(double Sum){
        boolean A = Sum >= 90;
        boolean B = Sum >= 80;
        boolean C = Sum >= 70;
        boolean D = Sum >= 60;

        if (A) {
            return("You got an A. Great job.");
        } else if (B) {
            return("You got a B. Good job.");
        } else if (C) {
            return("You got a C. Not bad.");
        } else if (D) {
            return("You got a D. You could do better.");
        } else {
            return("You got an F.");
        }
    }
}