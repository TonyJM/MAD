package com.example.addition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText n1=(EditText)findViewById(R.id.n1);
        final EditText n2=(EditText)findViewById(R.id.n2);
        Button btnAdd=(Button) findViewById(R.id.btnAdd);
        final TextView res=(TextView)findViewById(R.id.res);

        btnAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
               int a=Integer.parseInt(n1.getText().toString());
               int b=Integer.parseInt(n2.getText().toString());
               int c=a+b;
               res.setText("Result = "+c);
            }
        });
    }
}
