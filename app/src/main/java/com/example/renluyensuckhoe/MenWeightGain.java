package com.example.renluyensuckhoe;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MenWeightGain extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menweightgain);
        //Thứ 2
        Button button1 = (Button) findViewById(R.id.bt1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MenWeightGain.this,MWG_Monday.class);
                startActivity(intent1);
            }
        });

        //Thứ 3
        Button button2 = (Button) findViewById(R.id.bt1);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MenWeightGain.this,MWG_Tursday.class);
                startActivity(intent2);
            }
        });

        //Thứ 4
        Button button3 = (Button) findViewById(R.id.bt1);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(MenWeightGain.this,MWG_Wednesday.class);
                startActivity(intent3);
            }
        });

        //Thứ 5
        Button button4 = (Button) findViewById(R.id.bt1);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(MenWeightGain.this,MWG_Thursday.class);
                startActivity(intent4);
            }
        });

        //Thứ 6
        Button button5 = (Button) findViewById(R.id.bt1);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent5 = new Intent(MenWeightGain.this,MWG_Friday.class);
                startActivity(intent5);
            }
        });

        //Thứ 7
        Button button6 = (Button) findViewById(R.id.bt1);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent6 = new Intent(MenWeightGain.this,MWG_Saturday.class);
                startActivity(intent6);
            }
        });
        //Chủ Nhật
        Button button7 = (Button) findViewById(R.id.bt1);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7 = new Intent(MenWeightGain.this,MWG_Sunday.class);
                startActivity(intent7);
            }
        });
    }
}
