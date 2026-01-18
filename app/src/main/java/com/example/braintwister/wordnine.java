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

public class wordnine extends BaseActivity {

    Button b1,b2,b3,b4,b5;
    ImageButton n9,ht9;
    TextView e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,e13,e14,e15,e16,e17,e18,e19,t17,t18;
    ImageView img1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wordnine);

        currentLevel = 9;
        b1=findViewById(R.id.btnE9);
        b2=findViewById(R.id.btnP9);
        b3=findViewById(R.id.btnC9);
        b4=findViewById(R.id.btH9);
        b5=findViewById(R.id.btnA9);
        n9=findViewById(R.id.next9);
        ht9=findViewById(R.id.hint9);


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

        img1=findViewById(R.id.chk9);
        t17=findViewById(R.id.tx17);
        t18=findViewById(R.id.tx18);

//        real code
        StringBuilder sb1=new StringBuilder();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b1.setBackgroundColor(Color.rgb(255,244,118));
                sb1.append("E");
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
                sb1.append("C");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b4.setBackgroundColor(Color.rgb(255,244,118));
                sb1.append("H");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b5.setBackgroundColor(Color.rgb(255,244,118));
                sb1.append("A");
            }
        });

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=sb1.toString();

                if(s.equals("PEACH"))
                {

                    e1.setText("P");
                    e2.setText("E");
                    e3.setText("A");
                    e4.setText("C");
                    e5.setText("H");

                    t17.setVisibility(View.VISIBLE);
                    Animation animation = AnimationUtils.loadAnimation(wordnine.this, R.anim.scalingup);
                    t17.startAnimation(animation);
                    t18.setVisibility(View.GONE);

                    new android.os.Handler().postDelayed(() -> {
                        Animation fadeOut = AnimationUtils.loadAnimation(wordnine.this, R.anim.fadeout);
                        t17.startAnimation(fadeOut);
                        t17.setVisibility(View.GONE);
                    }, 2000);

                    MediaPlayer mp=MediaPlayer.create(wordnine.this,R.raw.animaone);
//        mp.setLooping(true);
                    mp.start();

                }

                else if(s.equals("APE"))
                {
                    e10.setText("A");
                    e11.setText("P");
                    e12.setText("E");
//                    e8.setText("K");

                }

                else if(s.equals("PEA"))
                {
                    e13.setText("P");
                    e14.setText("E");
                    e15.setText("A");
//                    e16.setText("E");

                }
                else if(s.equals("EACH"))
                {
                    e14.setText("E");
                    e16.setText("A");
                    e17.setText("C");
                    e5.setText("H");

                }

                else if(s.equals("CHEAP"))
                {
                    e6.setText("C");
                    e7.setText("H");
                    e8.setText("E");
                    e9.setText("A");
                    e1.setText("P");

                    t18.setVisibility(View.VISIBLE);
                    Animation animation = AnimationUtils.loadAnimation(wordnine.this, R.anim.scalingup);
                    t18.startAnimation(animation);
                    t17.setVisibility(View.GONE);

                    new android.os.Handler().postDelayed(() -> {
                        Animation fadeOut = AnimationUtils.loadAnimation(wordnine.this, R.anim.fadeout);
                        t18.startAnimation(fadeOut);
                        t18.setVisibility(View.GONE);
                    }, 2000);

                    MediaPlayer mp=MediaPlayer.create(wordnine.this,R.raw.animatwo);
//        mp.setLooping(true);
                    mp.start();



                }
                else if(s.equals("ACHE"))
                {
                    e18.setText("A");
                    e4.setText("C");
                    e19.setText("H");
                    e12.setText("E");


                }
                else
                {
                    Toast.makeText(wordnine.this, "Invalid word", Toast.LENGTH_SHORT).show();
                }

                sb1.setLength(0); // clear string builder

                b1.setBackgroundColor(Color.rgb(255,244,118));
                b2.setBackgroundColor(Color.rgb(255,244,118));
                b3.setBackgroundColor(Color.rgb(255,244,118));
                b4.setBackgroundColor(Color.rgb(255,244,118));
                b5.setBackgroundColor(Color.rgb(255,244,118));
            }
        });
        ht9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Define all words with their EditText boxes
                String[] words = {"PEACH", "APE", "PEA", "EACH","CHEAP","ACHE"};
                TextView[][] boxes = {
                        {e1, e2, e3, e4, e5},
                        {e10, e11, e12},
                        {e13, e14, e15},
                        {e14, e16, e17, e5},
                        {e6, e7, e8,e9,e1},
                        {e18, e4, e19, e12}
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
                    Toast.makeText(wordnine.this, "All words completed!", Toast.LENGTH_SHORT).show();
                } else {
                    ht9.setEnabled(false); // disable after one use

                }

            }
        });
        n9.setOnClickListener(new View.OnClickListener() {
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
                        e15.getText().toString().trim().isEmpty()||
                        e16.getText().toString().trim().isEmpty()||
                        e17.getText().toString().trim().isEmpty()||
                        e18.getText().toString().trim().isEmpty()||
                        e19.getText().toString().trim().isEmpty()
                ) {

                    Toast.makeText(wordnine.this, "Complete all words before moving ahead!", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent i14 = new Intent(wordnine.this, dispnine.class);
                    startActivity(i14);
                }
            }
        });
    }
}