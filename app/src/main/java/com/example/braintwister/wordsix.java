package com.example.braintwister;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.graphics.Color;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;


public class wordsix extends BaseActivity {

    Button b1,b2,b3,b4,b5;
    ImageButton n6,ht6;
    TextView e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,e13,e14,e15,e16,t11,t12;
    ImageView img1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wordsix);
        currentLevel = 6;
        b1=findViewById(R.id.btnT6);
        b2=findViewById(R.id.btnO6);
        b3=findViewById(R.id.btnH6);
        b4=findViewById(R.id.btO6);
        b5=findViewById(R.id.btnS6);
        n6=findViewById(R.id.next6);
        ht6=findViewById(R.id.hint6);


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

        img1=findViewById(R.id.chk6);

        t11=findViewById(R.id.tx11);
        t12=findViewById(R.id.tx12);

//        real code
        StringBuilder sb1=new StringBuilder();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b1.setBackgroundColor(Color.rgb(255,244,118));
                sb1.append("T");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b2.setBackgroundColor(Color.rgb(255,244,118));
                sb1.append("O");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b3.setBackgroundColor(Color.rgb(255,244,118));
                sb1.append("H");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b4.setBackgroundColor(Color.rgb(255,244,118));
                sb1.append("O");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b5.setBackgroundColor(Color.rgb(255,244,118));
                sb1.append("S");
            }
        });

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=sb1.toString();

                if(s.equals("SHOOT"))
                {

                    e1.setText("S");
                    e2.setText("H");
                    e3.setText("O");
                    e4.setText("O");
                    e5.setText("T");

                    t11.setVisibility(View.VISIBLE);
                    Animation animation = AnimationUtils.loadAnimation(wordsix.this, R.anim.scalingup);
                    t11.startAnimation(animation);
                    t12.setVisibility(View.GONE);

                    new android.os.Handler().postDelayed(() -> {
                        Animation fadeOut = AnimationUtils.loadAnimation(wordsix.this, R.anim.fadeout);
                        t11.startAnimation(fadeOut);
                        t11.setVisibility(View.GONE);
                    }, 2000);

                    MediaPlayer mp=MediaPlayer.create(wordsix.this,R.raw.animaone);
//        mp.setLooping(true);
                    mp.start();

                }

                else if(s.equals("SHOO"))
                {
                    e6.setText("S");
                    e7.setText("H");
                    e8.setText("O");
                    e9.setText("O");
                }

                else if(s.equals("SOOT"))
                {
                    e15.setText("S");
                    e12.setText("O");
                    e16.setText("O");
                    e13.setText("T");

                }
                else if(s.equals("HOOT"))
                {
                    e2.setText("H");
                    e8.setText("O");
                    e14.setText("O");
                    e10.setText("T");

                    t12.setVisibility(View.VISIBLE);
                    Animation animation = AnimationUtils.loadAnimation(wordsix.this, R.anim.scalingup);
                    t12.startAnimation(animation);
                    t11.setVisibility(View.GONE);

                    new android.os.Handler().postDelayed(() -> {
                        Animation fadeOut = AnimationUtils.loadAnimation(wordsix.this, R.anim.fadeout);
                        t12.startAnimation(fadeOut);
                        t12.setVisibility(View.GONE);
                    }, 2000);

                    MediaPlayer mp=MediaPlayer.create(wordsix.this,R.raw.animatwo);
//        mp.setLooping(true);
                    mp.start();

                }

                else if(s.equals("TOO"))
                {
                    e10.setText("T");
                    e11.setText("O");
                    e12.setText("O");


                }
                else
                {
                    Toast.makeText(wordsix.this, "Invalid word", Toast.LENGTH_SHORT).show();
                }

                sb1.setLength(0); // clear string builder

                b1.setBackgroundColor(Color.rgb(255,244,118));
                b2.setBackgroundColor(Color.rgb(255,244,118));
                b3.setBackgroundColor(Color.rgb(255,244,118));
                b4.setBackgroundColor(Color.rgb(255,244,118));
                b5.setBackgroundColor(Color.rgb(255,244,118));
            }
        });

        ht6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Define all words with their EditText boxes
                String[] words = {"SHOOT", "SHOO", "SOOT", "HOOT","TOO"};
                TextView[][] boxes = {
                        {e1, e2, e3, e4, e5},
                        {e6, e7, e8, e9},
                        {e15, e12, e16,e13},
                        {e2, e8, e14, e10},
                        {e10, e11, e12}
                };

                boolean hintGiven = false;

                for (int i = 0; i < words.length; i++) {
                    boolean allEmpty = true;
                    boolean allFilled = true;

                    // check each box
                    for (TextView box : boxes[i]) {
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
                    Toast.makeText(wordsix.this, "All words completed!", Toast.LENGTH_SHORT).show();
                } else {
                    ht6.setEnabled(false); // disable after one use

                }

            }
        });

        n6.setOnClickListener(new View.OnClickListener() {
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
                        e15.getText().toString().trim().isEmpty()
                        ) {

                    Toast.makeText(wordsix.this, "Complete all words before moving ahead!", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent i11 = new Intent(wordsix.this, dispsix.class);
                    startActivity(i11);
                }
            }
        });
    }
}