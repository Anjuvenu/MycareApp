package com.example.myprojects;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText aadharno,pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aadharno=(EditText)findViewById(R.id.aadarno);
        pass=(EditText)findViewById(R.id.pass);
    }
    public void enter (View view)
    {
        String getaadharno=aadharno.getText().toString();
        String getpass=pass.getText().toString();
        Toast.makeText(this,getaadharno+getpass,Toast.LENGTH_LONG).show();

        if(getaadharno.equals("test")&& getpass.equals("123"))
        {

            Intent intent=new Intent(this,MenuActivity.class);
            startActivity(intent);

        }
        else{

            Toast.makeText(this,"Invalid credentials",Toast.LENGTH_LONG).show();


        }

    }
}