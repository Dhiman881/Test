package com.dsvisualisation.datastructurevisualisation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        start();
    }
    void start(){
        //btn1 for linked list
        btn1 = (Button)findViewById(R.id.btnlink);
        //btn2 for stack
        btn2 = (Button)findViewById(R.id.btnstk);
        //btn3 for queue
        btn3 = (Button)findViewById(R.id.btnque);
        //btn4 for binary tree
        btn4= (Button)findViewById(R.id.btnbtre);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //write
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //write
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //write
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //write
            }
        });
    }
}
