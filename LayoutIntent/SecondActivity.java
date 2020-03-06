package com.example.layoutintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    String n,r,d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent i=getIntent();

        TextView txtName=(TextView)findViewById(R.id.name);
        TextView txtReg=(TextView)findViewById(R.id.reg);
        TextView txtDept=(TextView)findViewById(R.id.dept);

        n=i.getStringExtra("name_key");
        r=i.getStringExtra("reg_key");
        d=i.getStringExtra("dept_key");

        txtName.setText(n);
        txtReg.setText(r);
        txtDept.setText(d);
    }
}
