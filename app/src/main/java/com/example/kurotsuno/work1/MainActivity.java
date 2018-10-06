package com.example.kurotsuno.work1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button b1;
    TextView t1;
    TextView t2;
    EditText e1;
    EditText e2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.Et1);
        e2=(EditText)findViewById(R.id.Et2);
        b1=(Button) findViewById(R.id.Bb1);
        t1=(TextView) findViewById(R.id.Tv1);
        t2=(TextView) findViewById(R.id.Tv2);
        BtnClick();
    }
    private void BtnClick(){
        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                t1.setText(e1.getText().toString());
                t2.setText(e2.getText().toString());
            }
        });
    }
}
