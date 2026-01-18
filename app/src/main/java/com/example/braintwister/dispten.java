package com.example.braintwister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class dispten extends AppCompatActivity {

    Button y,no;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dispten);

        y=findViewById(R.id.btY);
        no=findViewById(R.id.btN);

        y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent y=new Intent(dispten.this,wordele.class);
                startActivity(y);
            }
        });

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j=new Intent(dispten.this,OptScr.class);
                startActivity(j);
            }
        });
    }
}