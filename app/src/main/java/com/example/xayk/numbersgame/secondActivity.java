package com.example.xayk.numbersgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {

    TextView tvText;
    int Min,Max;
    int min,max;
    boolean flag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tvText=findViewById(R.id.TextV);
        String str= getIntent().getStringExtra("Min");
        Min=Integer.parseInt(str);
        str=getIntent().getStringExtra("Max");

        Max=Integer.parseInt(str);
        min=Min;max=(Max-Min)/2+Min;
        tvText.setText("Ваше число между "+min+" и " + max+"?");
    }

    public void onClick1(View view)//Yes
    {
        if(flag)return;

        Max=max;Min=min;
        if(Max==Min) {
            tvText.setText("Ваше число  " + Max + "");
            flag=true;
            return ;
        }
        max=(Max-Min)/2+Min;min=Min;

        tvText.setText("Ваше число между "+min+" и " + max+"?");
    }

    public void onClick2(View view)//NO
    {
        if(flag)return;
        Min=max;
        if(max==min) {
            max++;
            flag=true;
            tvText.setText("Ваше число  " + max + "");
            return ;
        }
        max=(Max-Min)/2+Min;min=Min;
        tvText.setText("Ваше число между "+min+" и " + max+"?");
    }
}
