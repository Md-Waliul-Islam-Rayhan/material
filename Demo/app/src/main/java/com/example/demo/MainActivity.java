package com.example.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.location.GnssAntennaInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editText1, editText2;
    private Button button1;
    private TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        TextInputEditText phoneNumber = findViewById(R.id.phoneNumber);
//        TextInputEditText password = findViewById(R.id.password);

        editText1 = findViewById(R.id.phoneNumber);
        editText2 = findViewById(R.id.password);

        button1 = findViewById(R.id.materialButton);

        textView1 = findViewById(R.id.textViewID);

        button1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        String Number1 = editText1.getText().toString();
        String Number2 = editText2.getText().toString();

        int num1 = Integer.parseInt(Number1);
        int num2 = Integer.parseInt(Number2);

        if(v.getId() == R.id.materialButton) {
            int sum = num1 + num2;
            textView1.setText("Result: " + sum);
        }
    }
}