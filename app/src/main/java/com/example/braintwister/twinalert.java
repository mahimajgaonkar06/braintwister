package com.example.braintwister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class twinalert extends AppCompatActivity {
    Button b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twinalert);

        b5=findViewById(R.id.btn5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent i6=new Intent(twinalert.this,twinone.class);
               startActivity(i6);
            }
        });

        SharedPreferences sharedPreferences = getSharedPreferences("GameData", MODE_PRIVATE);
        int savedLevel = sharedPreferences.getInt("currentLevel", 1);

// Then start saved level’s activity
        if (savedLevel == 1) {
            startActivity(new Intent(this, twinone.class));
        }
        else if (savedLevel == 2) {
            startActivity(new Intent(this, twintwo.class));
        }
        else if (savedLevel == 3) {
            startActivity(new Intent(this, twinthree.class));
        }
        else if (savedLevel == 4) {
            startActivity(new Intent(this, twinfour.class));
        }
        else if (savedLevel == 5) {
            startActivity(new Intent(this, twinfive.class));
        }
        else if (savedLevel == 6) {
            startActivity(new Intent(this, twinsix.class));
        }
        else if (savedLevel == 7) {
            startActivity(new Intent(this, twinseven.class));
        }
        else if (savedLevel == 8) {
            startActivity(new Intent(this, twineight.class));
        }
        else if (savedLevel == 9) {
            startActivity(new Intent(this, twinnine.class));
        }
        else if (savedLevel == 10) {
            startActivity(new Intent(this, twinten.class));
        }


    }
}