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


public class wordele extends BaseActivity {


    Button b1,b2,b3,b4,b5,b6;
    ImageButton n11,h11;
    TextView e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,e13,e14,e15,e16,e17,e18,e19,e20,e21,e22,t21,t22;
    ImageView img1,home11;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wordele);


        currentLevel = 11;
        b1=findViewById(R.id.btnA11);
        b2=findViewById(R.id.btnY11);
        b3=findViewById(R.id.btnP11);
        b4=findViewById(R.id.btS11);
        b5=findViewById(R.id.btnB11);
        b6=findViewById(R.id.btnS11);
        n11=findViewById(R.id.next11);
        h11=findViewById(R.id.hint11);
        home11=findViewById(R.id.home11);


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
//        e14=findViewById(R.id.ed14);
        e15=findViewById(R.id.ed15);
//        e16=findViewById(R.id.ed16);
        e17=findViewById(R.id.ed17);
        e18=findViewById(R.id.ed18);
//        e19=findViewById(R.id.ed19);
//        e20=findViewById(R.id.ed20);
        e21=findViewById(R.id.ed21);
//        e22=findViewById(R.id.ed22);

        t21=findViewById(R.id.tx21);
        t22=findViewById(R.id.tx22);

        img1=findViewById(R.id.chk11);



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
                sb1.append("Y");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b3.setBackgroundColor(Color.rgb(109,95,179));
                sb1.append("P");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b4.setBackgroundColor(Color.rgb(109,95,179));
                sb1.append("S");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b5.setBackgroundColor(Color.rgb(109,95,179));
                sb1.append("B");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b6.setBackgroundColor(Color.rgb(109,95,179));
                sb1.append("S");
            }
        });
        home11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent h1 =new Intent(wordele.this,OptScr.class);
                startActivity(h1);
            }
        });
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=sb1.toString();

                if(s.equals("BYPASS"))
                {

                    e1.setText("B");
                    e2.setText("Y");
                    e3.setText("P");
                    e4.setText("A");
                    e5.setText("S");
                    e6.setText("S");

                    t21.setVisibility(View.VISIBLE);
                    Animation animation = AnimationUtils.loadAnimation(wordele.this, R.anim.scalingup);
                    t21.startAnimation(animation);
                    t22.setVisibility(View.GONE);

                    new android.os.Handler().postDelayed(() -> {
                        Animation fadeOut = AnimationUtils.loadAnimation(wordele.this, R.anim.fadeout);
                        t21.startAnimation(fadeOut);
                        t21.setVisibility(View.GONE);
                    }, 2000);

                    MediaPlayer mp=MediaPlayer.create(wordele.this,R.raw.animaone);
//        mp.setLooping(true);
                    mp.start();

                }

                else if(s.equals("PASS"))
                {
                    e7.setText("P");
                    e8.setText("A");
                    e9.setText("S");
                    e10.setText("S");


                }

                else if(s.equals("BASS"))
                {
                    e1.setText("B");
                    e11.setText("A");
                    e12.setText("S");
                    e13.setText("S");


                }


                else if(s.equals("SPYS"))
                {
                    e10.setText("S");
                    e17.setText("P");
                    e18.setText("Y");
                    e15.setText("S");

                    t22.setVisibility(View.VISIBLE);
                    Animation animation = AnimationUtils.loadAnimation(wordele.this, R.anim.scalingup);
                    t22.startAnimation(animation);
                    t21.setVisibility(View.GONE);

                    new android.os.Handler().postDelayed(() -> {
                        Animation fadeOut = AnimationUtils.loadAnimation(wordele.this, R.anim.fadeout);
                        t22.startAnimation(fadeOut);
                        t22.setVisibility(View.GONE);
                    }, 2000);

                    MediaPlayer mp=MediaPlayer.create(wordele.this,R.raw.animatwo);
//        mp.setLooping(true);
                    mp.start();

                }
                else if(s.equals("YAP"))
                {
                    e21.setText("Y");
                    e4.setText("A");
                    e7.setText("P");


                }
                else
                {
                    Toast.makeText(wordele.this, "Invalid word", Toast.LENGTH_SHORT).show();
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
        h11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Define all words with their EditText boxes
                String[] words = {"BYPASS", "PASS", "BASS", "SPYS","YAP"};
                TextView[][] boxes = {
                        {e1, e2, e3, e4, e5,e6},
                        {e7, e8, e9, e10},
                        {e1, e11, e12,e13},
                        {e10, e17, e18, e15},
                        {e21, e4, e7}
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
                    Toast.makeText(wordele.this, "All words completed!", Toast.LENGTH_SHORT).show();
                } else {
                    h11.setEnabled(false); // disable after one use

                }

            }
        });
        n11.setOnClickListener(new View.OnClickListener() {
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
//                        e14.getText().toString().trim().isEmpty() ||
                        e15.getText().toString().trim().isEmpty() ||
//                        e16.getText().toString().trim().isEmpty() ||
                        e17.getText().toString().trim().isEmpty() ||
                        e18.getText().toString().trim().isEmpty() ||
//                        e19.getText().toString().trim().isEmpty() ||
//                        e20.getText().toString().trim().isEmpty() ||
                        e21.getText().toString().trim().isEmpty()
                ) {

                    Toast.makeText(wordele.this, "Complete all words before moving ahead!", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent i16 = new Intent(wordele.this, dispele.class);
                    startActivity(i16);
                }
            }
        });

    }
}