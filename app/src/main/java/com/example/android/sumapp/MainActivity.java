package com.example.android.sumapp;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private EditText firstNumberEditText , secondNumberEditText;
    private Button addButton;
    private AddNumbers sumObject = new AddNumbers();
    private float firstNumber=0;
    private float secondNumber=0;
    private float sum=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumberEditText = (EditText) findViewById(R.id.firstNumberEditText);
        secondNumberEditText = (EditText) findViewById(R.id.secondNumberEditText);
        addButton = (Button) findViewById(R.id.addButton);


        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                firstNumber = Float.parseFloat(firstNumberEditText.getText().toString());
                secondNumber = Float.parseFloat(secondNumberEditText.getText().toString());

                sum = sumObject.getSum(firstNumber, secondNumber);

                Toast msg = Toast.makeText(MainActivity.this, "The sum is " + sum, Toast.LENGTH_LONG);
                msg.show();

            }
        });
    }



}
