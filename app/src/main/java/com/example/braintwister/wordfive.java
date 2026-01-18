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

public class wordfive extends BaseActivity {
    Button b1,b2,b3,b4,b5;
    ImageButton n5,ht5;
    EditText e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,e13,e14,e15,e16;
    ImageView img1;
    TextView t9,t10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wordfive);
        currentLevel = 5;
        b1=findViewById(R.id.btnA5);
        b2=findViewById(R.id.btnT5);
        b3=findViewById(R.id.btnL5);
        b4=findViewById(R.id.btnB5);
        b5=findViewById(R.id.btnE5);
        n5=findViewById(R.id.next5);
        ht5=findViewById(R.id.hint5);


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

        img1=findViewById(R.id.chk5);
        t9=findViewById(R.id.tx9);
        t10=findViewById(R.id.tx10);
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
                sb1.append("T");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b3.setBackgroundColor(Color.rgb(255,244,118));
                sb1.append("L");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b4.setBackgroundColor(Color.rgb(255,244,118));
                sb1.append("B");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b5.setBackgroundColor(Color.rgb(255,244,118));
                sb1.append("E");
            }
        });

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=sb1.toString();

                if(s.equals("TABLE"))
                {

                    e1.setText("T");
                    e2.setText("A");
                    e3.setText("B");
                    e4.setText("L");
                    e5.setText("E");

                    t9.setVisibility(View.VISIBLE);
                    Animation animation = AnimationUtils.loadAnimation(wordfive.this, R.anim.scalingup);
                    t9.startAnimation(animation);
                    t10.setVisibility(View.GONE);

                    new android.os.Handler().postDelayed(() -> {
                        Animation fadeOut = AnimationUtils.loadAnimation(wordfive.this, R.anim.fadeout);
                        t9.startAnimation(fadeOut);
                        t9.setVisibility(View.GONE);
                    }, 2000);

                    MediaPlayer mp=MediaPlayer.create(wordfive.this,R.raw.animaone);
//        mp.setLooping(true);
                    mp.start();
                }

                else if(s.equals("BELT"))
                {
                    e6.setText("B");
                    e7.setText("E");
                    e8.setText("L");
                    e9.setText("T");
                }

                else if(s.equals("TEA"))
                {
                    e10.setText("T");
                    e11.setText("E");
                    e12.setText("A");

                    t10.setVisibility(View.VISIBLE);
                    Animation animation = AnimationUtils.loadAnimation(wordfive.this, R.anim.scalingup);
                    t10.startAnimation(animation);
                    t9.setVisibility(View.GONE);

                    new android.os.Handler().postDelayed(() -> {
                        Animation fadeOut = AnimationUtils.loadAnimation(wordfive.this, R.anim.fadeout);
                        t10.startAnimation(fadeOut);
                        t10.setVisibility(View.GONE);
                    }, 2000);

                    MediaPlayer mp=MediaPlayer.create(wordfive.this,R.raw.animatwo);
//        mp.setLooping(true);
                    mp.start();
                }
                else if(s.equals("LATE"))
                {
                    e13.setText("L");
                    e14.setText("A");
                    e15.setText("T");
                    e16.setText("E");
                }
                else
                {
                    Toast.makeText(wordfive.this, "Invalid word", Toast.LENGTH_SHORT).show();
                }

                sb1.setLength(0); // clear string builder

                b1.setBackgroundColor(Color.rgb(255,244,118));
                b2.setBackgroundColor(Color.rgb(255,244,118));
                b3.setBackgroundColor(Color.rgb(255,244,118));
                b4.setBackgroundColor(Color.rgb(255,244,118));
                b5.setBackgroundColor(Color.rgb(255,244,118));
            }
        });

        ht5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Define all words with their EditText boxes
                String[] words = {"TABLE", "BELT", "TEA", "LATE"};
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
                    Toast.makeText(wordfive.this, "All words completed!", Toast.LENGTH_SHORT).show();
                } else {
                    ht5.setEnabled(false); // disable after one use

                }

            }
        });

        n5.setOnClickListener(new View.OnClickListener() {
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

                    Toast.makeText(wordfive.this, "Complete all words before moving ahead!", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent i10 = new Intent(wordfive.this, dispfive.class);
                    startActivity(i10);
                }
            }
        });
    }
}