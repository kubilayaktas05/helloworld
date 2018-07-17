package com.kubilayaktas.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Calculator extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        Button p = findViewById(R.id.plus);
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText Number = findViewById(R.id.number);
                int n1 = Integer.parseInt(Number.getText().toString());
                EditText Number2 = findViewById(R.id.number2);
                int n2 = Integer.parseInt(Number2.getText().toString());
                String str = Integer.toString(n1 + n2);
                TextView Solution = findViewById(R.id.solution);
                Solution.setText(str);
            }
        });

        Button m = findViewById(R.id.minus);
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText Number = findViewById(R.id.number);
                int n1 = Integer.parseInt(Number.getText().toString());
                EditText Number2 = findViewById(R.id.number2);
                int n2 = Integer.parseInt(Number2.getText().toString());
                String str = Integer.toString(n1 - n2);
                TextView Solution = findViewById(R.id.solution);
                Solution.setText(str);
            }
        });

        Button multiplication = findViewById(R.id.multiplication);
        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText Number = findViewById(R.id.number);
                int n1 = Integer.parseInt(Number.getText().toString());
                EditText Number2 = findViewById(R.id.number2);
                int n2 = Integer.parseInt(Number2.getText().toString());
                String str = Integer.toString(n1 * n2);
                TextView Solution = findViewById(R.id.solution);
                Solution.setText(str);
            }
        });

        Button d = findViewById(R.id.divide);
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText Number = findViewById(R.id.number);
                int n1 = Integer.parseInt(Number.getText().toString());
                EditText Number2 = findViewById(R.id.number2);
                int n2 = Integer.parseInt(Number2.getText().toString());
                String str = Integer.toString(n1 / n2);
                TextView Solution = findViewById(R.id.solution);
                Solution.setText(str);
            }
        });
    }
}
