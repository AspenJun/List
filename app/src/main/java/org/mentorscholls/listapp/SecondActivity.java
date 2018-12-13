package org.mentorscholls.listapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button addBtn = (Button) findViewById(R.id.addBtn);
        Button minusBtn = (Button) findViewById(R.id.minusBtn);
        Button mupltiplyBtn = (Button) findViewById(R.id.multiplyBtn);
        Button divideBtn = (Button) findViewById(R.id.divideBtn);

        minusBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                EditText firstNumEditText = (EditText) findViewById(R.id.editText);
                EditText secondNumEditText = (EditText) findViewById(R.id.editText2);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                float num1 = Float.parseFloat(firstNumEditText.getText().toString());
                float num2 = Float.parseFloat(secondNumEditText.getText().toString());
                float dif = num1 - num2;
                resultTextView.setText(dif + "");
            }
        });

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                EditText firstNumEditText = (EditText) findViewById(R.id.editText);
                EditText secondNumEditText = (EditText) findViewById(R.id.editText2);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                float num1 = Float.parseFloat(firstNumEditText.getText().toString());
                float num2 = Float.parseFloat(secondNumEditText.getText().toString());
                float dif = num1 + num2;
                resultTextView.setText(dif + "");

            }
        });

        mupltiplyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                EditText firstNumEditText = (EditText) findViewById(R.id.editText);
                EditText secondNumEditText = (EditText) findViewById(R.id.editText2);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                float num1 = Float.parseFloat(firstNumEditText.getText().toString());
                float num2 = Float.parseFloat(secondNumEditText.getText().toString());
                float dif = num1 * num2;
                resultTextView.setText(dif + "");
            }
        });

        divideBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                EditText firstNumEditText = (EditText) findViewById(R.id.editText);
                EditText secondNumEditText = (EditText) findViewById(R.id.editText2);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                float num1 = Float.parseFloat(firstNumEditText.getText().toString());
                float num2 = Float.parseFloat(secondNumEditText.getText().toString());
                float dif = num1 / num2;
                resultTextView.setText(dif + "");
            }
        });

        if (getIntent().hasExtra("org.mentorschools.quicklauncher.SOMETHING")) {
            TextView tv = (TextView) findViewById(R.id.textView);
            String text = getIntent().getExtras().getString("org.mentorschools.quicklauncher.SOMETHING");
            tv.setText(text);
        }
    }
}

