package com.kubilayaktas.helloworld;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button B = findViewById(R.id.button);
        B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText E = findViewById(R.id.editName);
                String str = E.getText().toString();
                EditText E1 = findViewById(R.id.editSurname);
                String str1 = E1.getText().toString();
                if(str1.isEmpty() && str.isEmpty()){
                    str = "Please enter name and surname!";
                }
                else if(str.isEmpty()) {
                    str = "Please enter name!";
                  str += " " + str1;
                }else if(str1.isEmpty()){
                    str = "Please enter surname!";
                }
                else{
                    str += " " + str1;
                }
                Toast.makeText(MainActivity.this,  str, Toast.LENGTH_LONG).show();
                startActivity(new Intent(MainActivity.this, Calculator.class));
            }
        });
    }
}
