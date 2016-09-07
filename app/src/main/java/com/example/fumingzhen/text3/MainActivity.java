package com.example.fumingzhen.text3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText show;
    Button b;
    RadioButton cb;
    RadioButton rb;
    TextView tv;
    TextView tv1;
    TextView tv2;
    TextView tv3;
    TextView tv4;
    TextView tv5;
    TextView tv6;

    CheckBox cb1;
    CheckBox cb2;
    CheckBox cb3;
    CheckBox cb4;
    CheckBox cb5;
    CheckBox cb6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear);
       b=(Button)findViewById(R.id.button1) ;
        cb=(RadioButton)findViewById(R.id.radioButton1);
        rb=(RadioButton)findViewById(R.id.radioButton2);
        tv=(TextView)findViewById(R.id.textView2);
        tv1=(TextView)findViewById(R.id.textView4);
        tv2=(TextView)findViewById(R.id.textView5);
        tv3=(TextView)findViewById(R.id.textView6);
        tv4=(TextView)findViewById(R.id.textView7);
        tv5=(TextView)findViewById(R.id.textView8);
        tv6=(TextView)findViewById(R.id.textView9);
        cb1=(CheckBox)findViewById(R.id.checkBox1);
        cb2=(CheckBox)findViewById(R.id.checkBox2);
        cb3=(CheckBox)findViewById(R.id.checkBox3);
        cb4=(CheckBox)findViewById(R.id.checkBox4);
        cb5=(CheckBox)findViewById(R.id.checkBox5);
        cb6=(CheckBox)findViewById(R.id.checkBox6);
        show=(EditText)findViewById(R.id.editText1) ;
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                show.setText("OK被点击了");
            }
        });
        cb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    tv1.setText("开朗");
                else
                    tv1.setText("_");
            }
        });
        cb2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    tv2.setText("内向");
                else
                    tv2.setText("_");
            }
        });
        cb3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    tv3.setText("怕生");
                else
                    tv3.setText("_");
            }
        });
        cb4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    tv4.setText("有亲和力");
                else
                    tv4.setText("_");
            }
        });
        cb5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    tv5.setText("外向");
                else
                    tv5.setText("_");
            }
        });
        cb6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked)
                    tv6.setText("学习能力强");
                else
                    tv6.setText("_");
            }
        });


        cb.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tv.setText("男");
            }

        });
        rb.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                tv.setText("女");
            }

        });

    }
}
