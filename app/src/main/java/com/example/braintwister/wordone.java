package com.example.braintwister;

import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import androidx.appcompat.app.AlertDialog;

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
import java.util.List;
import java.util.Random;
import java.util.ArrayList;

import android.os.Bundle;
import android.widget.ToggleButton;

public class wordone extends BaseActivity {
    Button b1,b2,b3,b4,b5;
    ImageButton n1,ht1;
    EditText e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,e13,e14,e15,e16;
    ImageView img1,home1;
    ToggleButton tog1;

    TextView t1,t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wordone);
        currentLevel = 1;
        b1=findViewById(R.id.btnF1);
        b2=findViewById(R.id.btnO1);
        b3=findViewById(R.id.btnD1);
        b4=findViewById(R.id.btO1);
        b5=findViewById(R.id.btnL1);
        n1=findViewById(R.id.next1);
        ht1=findViewById(R.id.hint1);
        home1=findViewById(R.id.home1);

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

        img1=findViewById(R.id.chk1);
//        tog1=findViewById(R.id.tog);

        t1=findViewById(R.id.tx1);
        t2=findViewById(R.id.tx2);

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
                sb1.append("S");
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
                sb1.append("T");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b5.setBackgroundColor(Color.rgb(255,244,118));
                sb1.append("E");
            }
        });

        home1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder builder = new AlertDialog.Builder(wordone.this);
                builder.setTitle("Exit Game");
                builder.setMessage("Your progress will be lost. Do you want to exit?");
                builder.setCancelable(false);

                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(wordone.this, OptScr.class);
                        startActivity(intent);
                        finish();
                    }
                });

                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });

                builder.show();
            }
        });
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=sb1.toString();

                if(sb1.length()==0)
                {
                    Toast.makeText(wordone.this, "Fill all the Blanks!", Toast.LENGTH_SHORT).show();
                }

                if(s.equals("STARE"))
                {

                    e1.setText("S");
                    e2.setText("T");
                    e3.setText("A");
                    e4.setText("R");
                    e5.setText("E");

                    t1.setVisibility(View.VISIBLE);
                    Animation animation = AnimationUtils.loadAnimation(wordone.this, R.anim.scalingup);
                    t1.startAnimation(animation);
                    t2.setVisibility(View.GONE);

                    new android.os.Handler().postDelayed(() -> {
                        Animation fadeOut = AnimationUtils.loadAnimation(wordone.this, R.anim.fadeout);
                        t1.startAnimation(fadeOut);
                        t1.setVisibility(View.GONE);
                    }, 2000);

                    MediaPlayer mp=MediaPlayer.create(wordone.this,R.raw.animaone);
//        mp.setLooping(true);
                    mp.start();

                }

                else if(s.equals("TEAR"))
                {
                    e6.setText("T");
                    e7.setText("E");
                    e8.setText("A");
                    e9.setText("R");
                }

                else if(s.equals("EAT"))
                {
                    e10.setText("E");
                    e11.setText("A");
                    e12.setText("T");

                }
                else if(s.equals("STAR"))
                {
                    e13.setText("S");
                    e14.setText("T");
                    e15.setText("A");
                    e16.setText("R");

                    t2.setVisibility(View.VISIBLE);
                    Animation animation = AnimationUtils.loadAnimation(wordone.this, R.anim.scalingup);
                    t2.startAnimation(animation);
                    t1.setVisibility(View.GONE);

                    new android.os.Handler().postDelayed(() -> {
                        Animation fadeOut = AnimationUtils.loadAnimation(wordone.this, R.anim.fadeout);
                        t2.startAnimation(fadeOut);
                        t2.setVisibility(View.GONE);
                    }, 2000);

                    MediaPlayer mp=MediaPlayer.create(wordone.this,R.raw.animatwo);
//        mp.setLooping(true);
                    mp.start();
                }
                else
                {
                    Toast.makeText(wordone.this, "Invalid word", Toast.LENGTH_SHORT).show();
                }

                sb1.setLength(0); // clear string builder

                b1.setBackgroundColor(Color.rgb(255,244,118));
                b2.setBackgroundColor(Color.rgb(255,244,118));
                b3.setBackgroundColor(Color.rgb(255,244,118));
                b4.setBackgroundColor(Color.rgb(255,244,118));
                b5.setBackgroundColor(Color.rgb(255,244,118));
            }
        });

        ht1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                       // Define all words with their EditText boxes
        String[] words = {"STARE", "TEAR", "EAT", "STAR"};
        EditText[][] boxes = {
                {e1, e2, e3, e4, e5},      // STARE
                {e6, e7, e8, e9},          // TEAR
                {e10, e11, e12},           // EAT
                {e13, e14, e15, e16}       // STAR
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
            Toast.makeText(wordone.this, "All words completed!", Toast.LENGTH_SHORT).show();
        } else {
            ht1.setEnabled(false); // disable after one use
            
        }

            }
        });

        n1.setOnClickListener(new View.OnClickListener() {
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

                    Toast.makeText(wordone.this, "Complete all words before moving ahead!", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Intent i5=new Intent(wordone.this,dispone.class);
                    startActivity(i5);
                }
            }
        });




//        tog1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            @Override
//            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
//                if(isChecked)
//                {
//                    mp.setVolume(1.0F,1.0F);
//
//                }
//                else
//                {
//                    mp.setVolume(0f, 0f);
//                }
//            }
//        });


    }
}