package com.example.braintwister;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.graphics.Color;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;


public class wordtwo extends BaseActivity {
    Button b1,b2,b3,b4,b5;
    ImageButton n2,ht2;
    EditText e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,e13,e14,e15,e16;
    ImageView img1;

    TextView t3,t4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wordtwo);
        currentLevel = 2;
        b1=findViewById(R.id.btnA2);
        b2=findViewById(R.id.btnG2);
        b3=findViewById(R.id.btnR2);
        b4=findViewById(R.id.btnI2);
        b5=findViewById(R.id.btnN2);
        n2=findViewById(R.id.next2);
        ht2=findViewById(R.id.hint2);


//        textboxes

        e1=findViewById(R.id.ed1);
        e2=findViewById(R.id.ed2);
        e3=findViewById(R.id.ed3);
        e4=findViewById(R.id.ed4);
        e5=findViewById(R.id.ed5);
        e6=findViewById(R.id.ed6);
        e7=findViewById(R.id.ed7);
        e8=findViewById(R.id.ed8);
        e9=findViewById(R.id.ed9);
        e10=findViewById(R.id.ed10);
        e11=findViewById(R.id.ed11);
        e12=findViewById(R.id.ed12);
        e13=findViewById(R.id.ed13);
        e14=findViewById(R.id.ed14);
        e15=findViewById(R.id.ed15);
        e16=findViewById(R.id.ed16);

        img1=findViewById(R.id.chk2);

        t3=findViewById(R.id.tx3);
        t4=findViewById(R.id.tx4);

//        real code
        StringBuilder sb1=new StringBuilder();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b1.setBackgroundColor(Color.rgb(255,244,118));
                sb1.append("A");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b2.setBackgroundColor(Color.rgb(255,244,118));
                sb1.append("G");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b3.setBackgroundColor(Color.rgb(255,244,118));
                sb1.append("R");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b4.setBackgroundColor(Color.rgb(255,244,118));
                sb1.append("I");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b5.setBackgroundColor(Color.rgb(255,244,118));
                sb1.append("N");
            }
        });

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=sb1.toString();

                if(s.equals("GRAIN"))
                {

                    e1.setText("G");
                    e2.setText("R");
                    e3.setText("A");
                    e4.setText("I");
                    e5.setText("N");

                    t3.setVisibility(View.VISIBLE);
                    Animation animation = AnimationUtils.loadAnimation(wordtwo.this, R.anim.scalingup);
                    t3.startAnimation(animation);
                    t4.setVisibility(View.GONE);

                    new android.os.Handler().postDelayed(() -> {
                        Animation fadeOut = AnimationUtils.loadAnimation(wordtwo.this, R.anim.fadeout);
                        t3.startAnimation(fadeOut);
                        t3.setVisibility(View.GONE);
                    }, 2000);

                    MediaPlayer mp=MediaPlayer.create(wordtwo.this,R.raw.animaone);
//        mp.setLooping(true);
                    mp.start();

                }

                else if(s.equals("RAIN"))
                {
                    e6.setText("R");
                    e7.setText("A");
                    e8.setText("I");
                    e9.setText("N");
                }

                else if(s.equals("GIN"))
                {
                    e10.setText("G");
                    e11.setText("I");
                    e12.setText("N");

                }
                else if(s.equals("GAIN"))
                {
                    e13.setText("G");
                    e14.setText("A");
                    e15.setText("I");
                    e16.setText("N");

                    t4.setVisibility(View.VISIBLE);
                    Animation animation = AnimationUtils.loadAnimation(wordtwo.this, R.anim.scalingup);
                    t4.startAnimation(animation);
                    t3.setVisibility(View.GONE);

                    new android.os.Handler().postDelayed(() -> {
                        Animation fadeOut = AnimationUtils.loadAnimation(wordtwo.this, R.anim.fadeout);
                        t4.startAnimation(fadeOut);
                        t4.setVisibility(View.GONE);
                    }, 2000);

                    MediaPlayer mp=MediaPlayer.create(wordtwo.this,R.raw.animatwo);
//        mp.setLooping(true);
                    mp.start();
                }
                else
                {
                    Toast.makeText(wordtwo.this, "Invalid word", Toast.LENGTH_SHORT).show();
                }

                sb1.setLength(0); // clear string builder

                b1.setBackgroundColor(Color.rgb(255,244,118));
                b2.setBackgroundColor(Color.rgb(255,244,118));
                b3.setBackgroundColor(Color.rgb(255,244,118));
                b4.setBackgroundColor(Color.rgb(255,244,118));
                b5.setBackgroundColor(Color.rgb(255,244,118));
            }
        });

        ht2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Define all words with their EditText boxes
                String[] words = {"GRAIN", "RAIN", "GIN", "GAIN"};
                EditText[][] boxes = {
                        {e1, e2, e3, e4, e5},
                        {e6, e7, e8, e9},
                        {e10, e11, e12},
                        {e13, e14, e15, e16}
                };

                boolean hintGiven = false;

                for (int i = 0; i < words.length; i++) {
                    boolean allEmpty = true;
                    boolean allFilled = true;

                    // check each box
                    for (EditText box : boxes[i]) {
                        String text = box.getText().toString().trim();
                        if (text.isEmpty()) allFilled = false;
                        else allEmpty = false;
                    }

                    // give hint to the first incomplete word
                    if (!allFilled) {
                        boxes[i][0].setText(String.valueOf(words[i].charAt(0))); // show 1st letter
                        hintGiven = true;
                        break;
                    }
                }

                if (!hintGiven) {
                    Toast.makeText(wordtwo.this, "All words completed!", Toast.LENGTH_SHORT).show();
                } else {
                    ht2.setEnabled(false); // disable after one use

                }

            }
        });


        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (e1.getText().toString().trim().isEmpty() ||
                        e2.getText().toString().trim().isEmpty() ||
                        e3.getText().toString().trim().isEmpty() ||
                        e4.getText().toString().trim().isEmpty() ||
                        e5.getText().toString().trim().isEmpty() ||
                        e6.getText().toString().trim().isEmpty() ||
                        e7.getText().toString().trim().isEmpty() ||
                        e8.getText().toString().trim().isEmpty() ||
                        e9.getText().toString().trim().isEmpty() ||
                        e10.getText().toString().trim().isEmpty() ||
                        e11.getText().toString().trim().isEmpty() ||
                        e12.getText().toString().trim().isEmpty() ||
                        e13.getText().toString().trim().isEmpty() ||
                        e14.getText().toString().trim().isEmpty() ||
                        e15.getText().toString().trim().isEmpty() ||
                        e16.getText().toString().trim().isEmpty()) {

                    Toast.makeText(wordtwo.this, "Complete all words before moving ahead!", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent i = new Intent(wordtwo.this, disptwo.class);
                    startActivity(i);
                }
            }
        });}}

