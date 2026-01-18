package com.example.braintwister;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class wizalert extends AppCompatActivity {
    Button b4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wizalert);

        b4=findViewById(R.id.btn4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4=new Intent(wizalert.this,wordone.class);
                i4.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                startActivity(i4);

            }
        });

        SharedPreferences sharedPreferences = getSharedPreferences("GameData", MODE_PRIVATE);
        int savedLevel = sharedPreferences.getInt("currentLevel", 1); // 1 = default

// Then start that level’s activity
        if (savedLevel == 1) {
            startActivity(new Intent(this, wordone.class));
        }
        else if (savedLevel == 2) {
            startActivity(new Intent(this, wordtwo.class));
        }
        else if (savedLevel == 3) {
            startActivity(new Intent(this, wordthree.class));
        }
        else if (savedLevel == 4) {
            startActivity(new Intent(this, wordfour.class));
        }
        else if (savedLevel == 5) {
            startActivity(new Intent(this, wordfive.class));
        }
        else if (savedLevel == 6) {
            startActivity(new Intent(this, wordsix.class));
        }
        else if (savedLevel == 7) {
            startActivity(new Intent(this, wordseven.class));
        }
        else if (savedLevel == 8) {
            startActivity(new Intent(this, wordeight.class));
        }
        else if (savedLevel == 9) {
            startActivity(new Intent(this, wordnine.class));
        }
        else if (savedLevel == 10) {
            startActivity(new Intent(this, wordten.class));
        }
        else if (savedLevel == 11) {
            startActivity(new Intent(this, wordele.class));
        }
        else if (savedLevel == 12) {
            startActivity(new Intent(this, wordtwe.class));
        }
        else if (savedLevel == 13) {
            startActivity(new Intent(this, wordthir.class));
        }
        else if (savedLevel == 14) {
            startActivity(new Intent(this, wordfor.class));
        }
        else if (savedLevel == 15) {
            startActivity(new Intent(this, wordfif.class));
        }
    }
}