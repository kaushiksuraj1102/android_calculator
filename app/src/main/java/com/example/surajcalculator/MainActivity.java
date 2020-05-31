package com.example.surajcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnDot,btnEqual,btnAdd,btnSub,btnMul,btnDiv,btnClear;
    EditText ed1;
    TextView tx1;
    Double Res1,Res2;
    boolean Add,Sub,Mul,Div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
        btn5=(Button)findViewById(R.id.btn5);
        btn6=(Button)findViewById(R.id.btn6);
        btn7=(Button)findViewById(R.id.btn7);
        btn8=(Button)findViewById(R.id.btn8);
        btn9=(Button)findViewById(R.id.btn9);
        btn0=(Button)findViewById(R.id.btn0);
        btnDot=(Button)findViewById(R.id.btnDot);
        btnEqual=(Button)findViewById(R.id.btnEqual);
        btnAdd=(Button)findViewById(R.id.btnAdd);
        btnSub=(Button)findViewById(R.id.btnSub);
        btnMul=(Button)findViewById(R.id.btnMul);
        btnDiv=(Button)findViewById(R.id.btnDiv);
        btnClear=(Button)findViewById(R.id.btnClear);
        ed1=(EditText)findViewById(R.id.editText);
        tx1=(TextView)findViewById(R.id.textView);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"9");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+"0");
            }
        });
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed1.setText(ed1.getText()+".");
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1==null){
                    ed1.setText("");
                }
                else{
                    Res1=Double.parseDouble(ed1.getText()+"");
                    Add=true;
                    ed1.setText(null);
                    tx1.setText(Res1+" + ");

                }
            }
        });
        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1==null){
                    ed1.setText("");
                }
                else{
                    Res1=Double.parseDouble(ed1.getText()+"");
                    Sub=true;
                    ed1.setText(null);
                    tx1.setText(Res1+" - ");

                }
            }
        });
        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1==null){
                    ed1.setText("");
                }
                else{
                    Res1=Double.parseDouble(ed1.getText()+"");
                    Mul=true;
                    ed1.setText(null);
                    tx1.setText(Res1+" * ");

                }
            }
        });
        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed1==null){
                    ed1.setText("");
                }
                else{
                    Res1=Double.parseDouble(ed1.getText()+"");
                    Div=true;
                    ed1.setText(null);
                    tx1.setText(Res1+" / ");
                }
            }
        });
        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Res2=Double.parseDouble(ed1.getText()+"");
                if(Add==true){
                    tx1.setText(Res1+" + "+Res2);
                    ed1.setText(Res1+Res2+"");
                    Add=false;
                }
                if(Sub==true){
                    tx1.setText(Res1+" - "+Res2);
                    ed1.setText(Res1-Res2+"");
                    Sub=false;
                }
                if(Mul==true){
                    tx1.setText(Res1+" * "+Res2);
                    ed1.setText(Res1*Res2+"");
                    Mul=false;
                }
                if(Div==true){
                    tx1.setText(Res1+" / "+Res2);
                    ed1.setText(Res1/Res2+"");
                    Div=false;
                }
            }
        });
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tx1.setText("");
                ed1.setText("");
            }
        });
    }
}