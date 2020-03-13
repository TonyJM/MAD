package com.example.database;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Locale;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    DatabaseHelper myDbHelper;
    Button btnInsert,btnDisplay,btnDelete,btnUpdate;
    EditText txtName,txtMarks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDbHelper=new DatabaseHelper(this);
        txtName=findViewById(R.id.name);
        txtMarks=findViewById(R.id.marks);
        btnInsert=findViewById(R.id.btnInsert);
        btnDisplay=findViewById(R.id.btnDisp);
        btnUpdate=findViewById(R.id.btnUpdate);
        btnDelete=findViewById(R.id.btnDel);

        btnInsert.setOnClickListener(this);
        btnDisplay.setOnClickListener(this);
        btnUpdate.setOnClickListener(this);
        btnDelete.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btnInsert){
            myDbHelper.insert_record(txtName.getText().toString(),Integer.parseInt(txtMarks.getText().toString()));
        }
        if(v.getId()==R.id.btnInsert){
            StringBuffer record_details=myDbHelper.display_all_records();
            showMessage("Display Status",record_details.toString());
        }

    }

}
