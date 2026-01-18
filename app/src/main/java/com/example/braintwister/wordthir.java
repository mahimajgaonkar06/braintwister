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
import android.widget.TextView;
import android.graphics.Color;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class wordthir extends BaseActivity {

    Button b1,b2,b3,b4,b5,b6;
    ImageButton n13,h13;
    TextView e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,e13,e14,e15,e16,e17,e18,e19,e20,e21,e22,e23,t25,t26;
    ImageView img1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wordthir);

        currentLevel = 13;

        b1=findViewById(R.id.btnA13);
        b2=findViewById(R.id.btnC13);
        b3=findViewById(R.id.btnS13);
        b4=findViewById(R.id.btL13);
        b5=findViewById(R.id.btnE13);
        b6=findViewById(R.id.btnT13);
        n13=findViewById(R.id.next13);
        h13=findViewById(R.id.hint13);


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
        e17=findViewById(R.id.ed17);
        e18=findViewById(R.id.ed18);
       e19=findViewById(R.id.ed19);
        e20=findViewById(R.id.ed20);
        e21=findViewById(R.id.ed21);
        e22=findViewById(R.id.ed22);
        e23=findViewById(R.id.ed23);

        t25=findViewById(R.id.tx25);
        t26=findViewById(R.id.tx26);
        img1=findViewById(R.id.chk13);



//        real code
        StringBuilder sb1=new StringBuilder();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b1.setBackgroundColor(Color.rgb(109,95,179));
                sb1.append("A");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b2.setBackgroundColor(Color.rgb(109,95,179));
                sb1.append("C");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b3.setBackgroundColor(Color.rgb(109,95,179));
                sb1.append("S");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b4.setBackgroundColor(Color.rgb(109,95,179));
                sb1.append("L");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b5.setBackgroundColor(Color.rgb(109,95,179));
                sb1.append("E");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b6.setBackgroundColor(Color.rgb(109,95,179));
                sb1.append("T");
            }
        });

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=sb1.toString();

                if(s.equals("CASTLE"))
                {

                    e1.setText("C");
                    e2.setText("A");
                    e3.setText("S");
                    e4.setText("T");
                    e5.setText("L");
                    e6.setText("E");

                    t25.setVisibility(View.VISIBLE);
                    Animation animation = AnimationUtils.loadAnimation(wordthir.this, R.anim.scalingup);
                    t25.startAnimation(animation);
                    t26.setVisibility(View.GONE);

                    new android.os.Handler().postDelayed(() -> {
                        Animation fadeOut = AnimationUtils.loadAnimation(wordthir.this, R.anim.fadeout);
                        t25.startAnimation(fadeOut);
                        t25.setVisibility(View.GONE);
                    }, 2000);

                    MediaPlayer mp=MediaPlayer.create(wordthir.this,R.raw.animaone);
//        mp.setLooping(true);
                    mp.start();

                }

                else if(s.equals("SLATE"))
                {
                    e3.setText("S");
                    e7.setText("L");
                    e8.setText("A");
                    e9.setText("T");
                    e10.setText("E");


                }

                else if(s.equals("CAT"))
                {
                    e1.setText("C");
                    e19.setText("A");
                    e20.setText("T");
//                    e13.setText("S");


                }
                else if(s.equals("STEAL"))
                {
                    e11.setText("S");
                    e9.setText("T");
                    e12.setText("E");
                    e13.setText("A");
                    e14.setText("L");

                    t26.setVisibility(View.VISIBLE);
                    Animation animation = AnimationUtils.loadAnimation(wordthir.this, R.anim.scalingup);
                    t26.startAnimation(animation);
                    t25.setVisibility(View.GONE);

                    new android.os.Handler().postDelayed(() -> {
                        Animation fadeOut = AnimationUtils.loadAnimation(wordthir.this, R.anim.fadeout);
                        t25.startAnimation(fadeOut);
                        t25.setVisibility(View.GONE);
                    }, 2000);

                    MediaPlayer mp=MediaPlayer.create(wordthir.this,R.raw.animatwo);
//        mp.setLooping(true);
                    mp.start();
                }

                else if(s.equals("CAST"))
                {
                    e23.setText("C");
                    e13.setText("A");
                    e15.setText("S");
                    e16.setText("T");


                }
                else if(s.equals("TEA"))
                {
                    e16.setText("T");
                    e17.setText("E");
                    e18.setText("A");


                }

                else if(s.equals("SEA"))
                {
                    e11.setText("S");
                    e21.setText("E");
                    e22.setText("A");


                }
                else
                {
                    Toast.makeText(wordthir.this, "Invalid word", Toast.LENGTH_SHORT).show();
                }

                sb1.setLength(0); // clear string builder

                b1.setBackgroundColor(Color.rgb(157,138,251));
                b2.setBackgroundColor(Color.rgb(157,138,251));
                b3.setBackgroundColor(Color.rgb(157,138,251));
                b4.setBackgroundColor(Color.rgb(157,138,251));
                b5.setBackgroundColor(Color.rgb(157,138,251));
                b6.setBackgroundColor(Color.rgb(157,138,251));
            }
        });
        h13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Define all words with their EditText boxes
                String[] words = {"CASTLE", "SLATE", "CAT", "STEAL","CAST","TEA","SEA"};
                TextView[][] boxes = {
                        {e1, e2, e3, e4, e5,e6},
                        {e3, e7, e8, e9, e10},
                        {e1, e19, e20},
                        {e11,e9,e12, e13, e14},
                        {e23, e13, e15, e16},
                        {e16, e17, e18},
                        {e11, e21, e22}

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
                    Toast.makeText(wordthir.this, "All words completed!", Toast.LENGTH_SHORT).show();
                } else {
                    h13.setEnabled(false); // disable after one use

                }

            }
        });
        n13.setOnClickListener(new View.OnClickListener() {
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
                        e16.getText().toString().trim().isEmpty() ||
                        e17.getText().toString().trim().isEmpty() ||
                        e18.getText().toString().trim().isEmpty() ||
                        e19.getText().toString().trim().isEmpty() ||
                        e20.getText().toString().trim().isEmpty() ||
                        e21.getText().toString().trim().isEmpty()
                ) {

                    Toast.makeText(wordthir.this, "Complete all words before moving ahead!", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent i18 = new Intent(wordthir.this, dispthir.class);
                    startActivity(i18);
                }
            }
        });
    }
}