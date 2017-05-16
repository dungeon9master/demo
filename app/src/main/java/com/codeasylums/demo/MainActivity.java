package com.codeasylums.demo;

import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int f;
    String s="",q="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b1=(Button)findViewById(R.id.button1);
        Button b2=(Button)findViewById(R.id.button2);
        Button b3=(Button)findViewById(R.id.button3);
        Button b4=(Button)findViewById(R.id.button4);
        Button b5=(Button)findViewById(R.id.button5);
        Button b6=(Button)findViewById(R.id.button6);
        Button b7=(Button)findViewById(R.id.button7);
        Button b8=(Button)findViewById(R.id.button8);
        Button b9=(Button)findViewById(R.id.button9);
        Button b10=(Button)findViewById(R.id.button10);
        Button b11=(Button)findViewById(R.id.button11);
        Button b12=(Button)findViewById(R.id.button12);Button b13=(Button)findViewById(R.id.button13);
        Button b20=(Button)findViewById(R.id.button20);
        Button b19=(Button)findViewById(R.id.button19);
        final EditText e1=(EditText)findViewById(R.id.editText1);


        Button b14=(Button)findViewById(R.id.button14);
        Button b15=(Button)findViewById(R.id.button15);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=e1.getText().toString();
                s=s+"1";
                e1.setText(s);
            }}
        );
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=e1.getText().toString();
                s=s+"2";
                e1.setText(s);
            }}
        ); b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=e1.getText().toString();

                s=s+"3";
                e1.setText(s);
            }}
        ); b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=e1.getText().toString();
                s=s+"4";
                e1.setText(s);
            }}
        ); b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=e1.getText().toString();
                s=s+"5";
                e1.setText(s);
            }}
        ); b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=e1.getText().toString();
                s=s+"6";
                e1.setText(s);
            }}
        );
        b19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s = e1.getText().toString();
                s = s + ".";
                e1.setText(s);
            }});
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=e1.getText().toString();
                s=s+"8";
                e1.setText(s);
            }}
        ); b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=e1.getText().toString();
                s=s+"9";
                e1.setText(s);
            }}
        ); b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s=e1.getText().toString();
                s=s+"0";
                e1.setText(s);
            }}
        );
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q=s;
                f=1;
                e1.setText("");
                s="";
            }
        });
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                q=s;
                f=2;
                e1.setText("");
                s="";
            }
        });
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                q=s;
                f=3;
                e1.setText("");
                s="";
            }
        });
        b20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                q=s;
                f=4;
                e1.setText("");
                s="";
            }
        });

        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double a= Double.parseDouble(q);
                double b=Double.parseDouble(s);
                        if(f==1){
                            double c=a+b;
                            e1.setText(String.valueOf(c));
                        }
                else if(f==2){
                            double c=a-b;
                            e1.setText(String.valueOf(c));
                        }
                else if(f==3)
                        {
                            double c=a*b;
                            e1.setText(String.valueOf(c));
                        }
                else if(f==4){
                            double c=a/b;
                            e1.setText(String.valueOf(c));
                        }
                f=0;
                q="";
                s="";
            }
        });
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText("");}
        });
    }
}
