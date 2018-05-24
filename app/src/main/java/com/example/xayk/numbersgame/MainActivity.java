package com.example.xayk.numbersgame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText etMin,etMax;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etMin=findViewById(R.id.M1);
        etMax=findViewById(R.id.M2);
    }


    public void onClick(View view)
    {

        if(Integer.parseInt(etMin.getText().toString()) <= Integer.parseInt(etMax.getText().toString())) {
            Intent i = new Intent(this, secondActivity.class);
            i.putExtra("Min", etMin.getText().toString());
            i.putExtra("Max", etMax.getText().toString());
            startActivity(i);
        }
        else
            Toast.makeText(getApplicationContext(),"Число введено непрвильно",Toast.LENGTH_LONG).show();
    }



}
