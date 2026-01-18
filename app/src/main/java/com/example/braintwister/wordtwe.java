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

public class wordtwe extends BaseActivity {

    Button b1,b2,b3,b4,b5,b6;
    ImageButton n12,h12;
    TextView e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,e13,e14,e15,e16,e17,e18,t23,t24;
//            e19,e20,e21,e22;
    ImageView img1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wordtwe);

        currentLevel = 12;

        b1=findViewById(R.id.btnF12);
        b2=findViewById(R.id.btnD12);
        b3=findViewById(R.id.btnI12);
        b4=findViewById(R.id.btR12);
        b5=findViewById(R.id.btnE12);
        b6=findViewById(R.id.btnN12);
        n12=findViewById(R.id.next12);
        h12=findViewById(R.id.hint12);


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
//       e19=findViewById(R.id.ed19);
//        e20=findViewById(R.id.ed20);
//        e21=findViewById(R.id.ed21);
//        e22=findViewById(R.id.ed22);

        t23=findViewById(R.id.tx23);
        t24=findViewById(R.id.tx24);


        img1=findViewById(R.id.chk12);



//        real code
        StringBuilder sb1=new StringBuilder();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b1.setBackgroundColor(Color.rgb(109,95,179));
                sb1.append("F");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b2.setBackgroundColor(Color.rgb(109,95,179));
                sb1.append("D");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b3.setBackgroundColor(Color.rgb(109,95,179));
                sb1.append("I");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b4.setBackgroundColor(Color.rgb(109,95,179));
                sb1.append("R");
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
                sb1.append("N");
            }
        });

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=sb1.toString();

                if(s.equals("FRIEND"))
                {

                    e1.setText("F");
                    e2.setText("R");
                    e3.setText("I");
                    e4.setText("E");
                    e5.setText("N");
                    e6.setText("D");

                    t23.setVisibility(View.VISIBLE);
                    Animation animation = AnimationUtils.loadAnimation(wordtwe.this, R.anim.scalingup);
                    t23.startAnimation(animation);
                    t24.setVisibility(View.GONE);

                    new android.os.Handler().postDelayed(() -> {
                        Animation fadeOut = AnimationUtils.loadAnimation(wordtwe.this, R.anim.fadeout);
                        t23.startAnimation(fadeOut);
                        t23.setVisibility(View.GONE);
                    }, 2000);

                    MediaPlayer mp=MediaPlayer.create(wordtwe.this,R.raw.animaone);
//        mp.setLooping(true);
                    mp.start();

                }

                else if(s.equals("END"))
                {
                    e7.setText("E");
                    e8.setText("N");
                    e9.setText("D");
//                    e10.setText("S");


                }

                else if(s.equals("RED"))
                {
                    e10.setText("R");
                    e11.setText("E");
                    e12.setText("D");
//                    e13.setText("S");


                }
                else if(s.equals("FERN"))
                {
                    e1.setText("F");
                    e13.setText("E");
                    e10.setText("R");
                    e14.setText("N");

                    t24.setVisibility(View.VISIBLE);
                    Animation animation = AnimationUtils.loadAnimation(wordtwe.this, R.anim.scalingup);
                    t24.startAnimation(animation);
                    t23.setVisibility(View.GONE);

                    new android.os.Handler().postDelayed(() -> {
                        Animation fadeOut = AnimationUtils.loadAnimation(wordtwe.this, R.anim.fadeout);
                        t24.startAnimation(fadeOut);
                        t24.setVisibility(View.GONE);
                    }, 2000);

                    MediaPlayer mp=MediaPlayer.create(wordtwe.this,R.raw.animatwo);
//        mp.setLooping(true);
                    mp.start();

                }

                else if(s.equals("FIND"))
                {
                    e18.setText("F");
                    e3.setText("I");
                    e15.setText("N");
                    e12.setText("D");


                }
                else if(s.equals("REND"))
                {
                    e17.setText("R");
                    e7.setText("E");
                    e5.setText("N");
                    e16.setText("D");


                }
                else
                {
                    Toast.makeText(wordtwe.this, "Invalid word", Toast.LENGTH_SHORT).show();
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
        h12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Define all words with their EditText boxes
                String[] words = {"FRIEND", "END", "RED", "FERN","FIND","REND"};
                TextView[][] boxes = {
                        {e1, e2, e3, e4, e5,e6},
                        {e7, e8, e9},
                        {e10, e11, e12},
                        {e1,e13, e10, e14},
                        {e18, e3, e15, e12},
                        {e17, e7, e5,e16}

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
                    Toast.makeText(wordtwe.this, "All words completed!", Toast.LENGTH_SHORT).show();
                } else {
                    h12.setEnabled(false); // disable after one use

                }

            }
        });
        n12.setOnClickListener(new View.OnClickListener() {
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
                        e17.getText().toString().trim().isEmpty()
                ) {

                    Toast.makeText(wordtwe.this, "Complete all words before moving ahead!", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent i17 = new Intent(wordtwe.this, disptwe.class);
                    startActivity(i17);
                }
            }
        });

    }
}