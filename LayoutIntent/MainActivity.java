package  com.example.layoutintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Spinner;


public class MainActivity extends AppCompatActivity {

    Spinner s;
    String n,r,dept;

    String d[]={"CSE","ECE","IT","Mech","Civil"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        s=(Spinner)findViewById(R.id.dept);

        ArrayAdapter adapter=new ArrayAdapter(MainActivity.this,android.R.layout.simple_spinner_item,d);
        s.setAdapter(adapter);

        final EditText name=(EditText)findViewById(R.id.txtName);
        final EditText reg=(EditText)findViewById(R.id.txtReg);

        Button btnSubmit=(Button)findViewById(R.id.submit);

        btnSubmit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i=new Intent(MainActivity.this,SecondActivity.class);

                n= name.getText().toString();
                r=reg.getText().toString();
                dept=s.getSelectedItem().toString();


                i.putExtra("name_key",n);
                i.putExtra("reg_key",r);
                i.putExtra("dept_key",dept);
                startActivity(i);
            }

        });

    }
}
