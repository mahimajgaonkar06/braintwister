package com.example.braintwister;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
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


public class wordthree extends BaseActivity {

    Button b1,b2,b3,b4,b5;
    ImageButton n3,ht3;
    EditText e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,e13,e14,e15,e16;
    ImageView img1,home3;

    TextView t5,t6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wordthree);
        currentLevel = 3;
        b1=findViewById(R.id.btnA3);
        b2=findViewById(R.id.btnP3);
        b3=findViewById(R.id.btnE3);
        b4=findViewById(R.id.btnL3);
        b5=findViewById(R.id.btnN3);
        n3=findViewById(R.id.next3);
        ht3=findViewById(R.id.hint3);
        home3=findViewById(R.id.home3);


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

        img1=findViewById(R.id.chk3);

        t5=findViewById(R.id.tx5);
        t6=findViewById(R.id.tx6);

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
                sb1.append("P");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b3.setBackgroundColor(Color.rgb(255,244,118));
                sb1.append("E");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b4.setBackgroundColor(Color.rgb(255,244,118));
                sb1.append("L");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b5.setBackgroundColor(Color.rgb(255,244,118));
                sb1.append("N");
            }
        });
        home3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(wordthree.this);
                builder.setTitle("Exit Game");
                builder.setMessage("Your progress will be lost. Do you want to exit?");
                builder.setCancelable(false);

                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(wordthree.this, OptScr.class);
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

                if(s.equals("PANEL"))
                {

                    e1.setText("P");
                    e2.setText("A");
                    e3.setText("N");
                    e4.setText("E");
                    e5.setText("L");

                    t5.setVisibility(View.VISIBLE);
                    Animation animation = AnimationUtils.loadAnimation(wordthree.this, R.anim.scalingup);
                    t5.startAnimation(animation);
                    t6.setVisibility(View.GONE);

                    new android.os.Handler().postDelayed(() -> {
                        Animation fadeOut = AnimationUtils.loadAnimation(wordthree.this, R.anim.fadeout);
                        t5.startAnimation(fadeOut);
                        t5.setVisibility(View.GONE);
                    }, 2000);

                    MediaPlayer mp=MediaPlayer.create(wordthree.this,R.raw.animaone);
//        mp.setLooping(true);
                    mp.start();


                }

                else if(s.equals("LEAN"))
                {
                    e6.setText("L");
                    e7.setText("E");
                    e8.setText("A");
                    e9.setText("N");

                    t6.setVisibility(View.VISIBLE);
                    Animation animation = AnimationUtils.loadAnimation(wordthree.this, R.anim.scalingup);
                    t6.startAnimation(animation);
                    t5.setVisibility(View.GONE);

                    new android.os.Handler().postDelayed(() -> {
                        Animation fadeOut = AnimationUtils.loadAnimation(wordthree.this, R.anim.fadeout);
                        t6.startAnimation(fadeOut);
                        t6.setVisibility(View.GONE);
                    }, 2000);

                    MediaPlayer mp=MediaPlayer.create(wordthree.this,R.raw.animatwo);
//        mp.setLooping(true);
                    mp.start();
                }

                else if(s.equals("PAN"))
                {
                    e10.setText("P");
                    e11.setText("A");
                    e12.setText("N");

                }
                else if(s.equals("PALE"))
                {
                    e13.setText("P");
                    e14.setText("A");
                    e15.setText("L");
                    e16.setText("E");
                }
                else
                {
                    Toast.makeText(wordthree.this, "Invalid word", Toast.LENGTH_SHORT).show();
                }

                sb1.setLength(0); // clear string builder

                b1.setBackgroundColor(Color.rgb(255,244,118));
                b2.setBackgroundColor(Color.rgb(255,244,118));
                b3.setBackgroundColor(Color.rgb(255,244,118));
                b4.setBackgroundColor(Color.rgb(255,244,118));
                b5.setBackgroundColor(Color.rgb(255,244,118));
            }
        });

        ht3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Define all words with their EditText boxes
                String[] words = {"PANEL", "LEAN", "PAN", "PALE"};
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
                    Toast.makeText(wordthree.this, "All words completed!", Toast.LENGTH_SHORT).show();
                } else {
                    ht3.setEnabled(false); // disable after one use

                }

            }
        });

        n3.setOnClickListener(new View.OnClickListener() {
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

                    Toast.makeText(wordthree.this, "Complete all words before moving ahead!", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent i8 = new Intent(wordthree.this, dispthree.class);
                    startActivity(i8);
                }
            }
        });
    }
}