package com.example.hrida.imagecirculation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private Button bt1,bt2,bt3;
    private ImageView iv1;
    private int[] pictures;
    private int  pos=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt1=(Button)findViewById(R.id.bt1);
        bt2=(Button)findViewById(R.id.bt2);
        bt3=(Button)findViewById(R.id.bt3);
        iv1=(ImageView)findViewById(R.id.iv1);

        pictures = new int[4];
        pictures[0]=R.drawable.p1;
        pictures[1]=R.drawable.p2;
        pictures[2]=R.drawable.p3;
        pictures[3]=R.drawable.p4;


        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pos =(pos+1)%4;
                iv1.setImageResource(pictures[pos]);
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(--pos<0){
                    pos=3;
                }
                iv1.setImageResource(pictures[pos]);
            }
        });

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = (int)(Math.random()*4);

                iv1.setImageResource(pictures[pos]);
            }
        });

    }
}
