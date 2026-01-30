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
import android.widget.TextView;
import android.graphics.Color;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;


public class wordten extends BaseActivity {

    Button b1,b2,b3,b4,b5;
    ImageButton n10,ht10;
    TextView e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,e13,e14,e15,e16,t19,t20;
    ImageView img1,home10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wordten);

        currentLevel = 10;

        b1=findViewById(R.id.btnL10);
        b2=findViewById(R.id.btnD10);
        b3=findViewById(R.id.btnO10);
        b4=findViewById(R.id.btE10);
        b5=findViewById(R.id.btnG10);
        n10=findViewById(R.id.next10);
        ht10=findViewById(R.id.hint10);
        home10=findViewById(R.id.home10);


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
        t19=findViewById(R.id.tx19);
        t20=findViewById(R.id.tx20);

        img1=findViewById(R.id.chk10);


//        real code
        StringBuilder sb1=new StringBuilder();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b1.setBackgroundColor(Color.rgb(255,244,118));
                sb1.append("L");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b2.setBackgroundColor(Color.rgb(255,244,118));
                sb1.append("D");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b3.setBackgroundColor(Color.rgb(255,244,118));
                sb1.append("O");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b4.setBackgroundColor(Color.rgb(255,244,118));
                sb1.append("E");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b5.setBackgroundColor(Color.rgb(255,244,118));
                sb1.append("G");
            }
        });
        home10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(wordten.this);
                builder.setTitle("Exit Game");
                builder.setMessage("Your progress will be lost. Do you want to exit?");
                builder.setCancelable(false);

                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(wordten.this, OptScr.class);
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

                if(s.equals("LODGE"))
                {

                    e1.setText("L");
                    e2.setText("O");
                    e3.setText("D");
                    e4.setText("G");
                    e5.setText("E");

                    t19.setVisibility(View.VISIBLE);
                    Animation animation = AnimationUtils.loadAnimation(wordten.this, R.anim.scalingup);
                    t19.startAnimation(animation);
                    t20.setVisibility(View.GONE);

                    new android.os.Handler().postDelayed(() -> {
                        Animation fadeOut = AnimationUtils.loadAnimation(wordten.this, R.anim.fadeout);
                        t19.startAnimation(fadeOut);
                        t19.setVisibility(View.GONE);
                    }, 2000);

                    MediaPlayer mp=MediaPlayer.create(wordten.this,R.raw.animaone);
//        mp.setLooping(true);
                    mp.start();


                }

                else if(s.equals("OLD"))
                {
                    e9.setText("O");
                    e10.setText("L");
                    e11.setText("D");

//                    e8.setText("K");

                }

                else if(s.equals("LEG"))
                {
                    e12.setText("L");
                    e13.setText("E");
                    e14.setText("G");
//                    e16.setText("E");

                }
                else if(s.equals("GOD"))
                {
                    e4.setText("G");
                    e16.setText("O");
                    e6.setText("D");
//                    e5.setText("H");

                }

                else if(s.equals("DOG"))
                {
                    e6.setText("D");
                    e7.setText("O");
                    e8.setText("G");
//                    e9.setText("A");
//                    e1.setText("P");


                }
                else if(s.equals("GOLD"))
                {
                    e14.setText("G");
                    e2.setText("O");
                    e15.setText("L");
                    e11.setText("D");

                    t20.setVisibility(View.VISIBLE);
                    Animation animation = AnimationUtils.loadAnimation(wordten.this, R.anim.scalingup);
                    t20.startAnimation(animation);
                    t19.setVisibility(View.GONE);

                    new android.os.Handler().postDelayed(() -> {
                        Animation fadeOut = AnimationUtils.loadAnimation(wordten.this, R.anim.fadeout);
                        t20.startAnimation(fadeOut);
                        t20.setVisibility(View.GONE);
                    }, 2000);

                    MediaPlayer mp=MediaPlayer.create(wordten.this,R.raw.animatwo);
//        mp.setLooping(true);
                    mp.start();

                }
                else
                {
                    Toast.makeText(wordten.this, "Invalid word", Toast.LENGTH_SHORT).show();
                }

                sb1.setLength(0); // clear string builder

                b1.setBackgroundColor(Color.rgb(255,244,118));
                b2.setBackgroundColor(Color.rgb(255,244,118));
                b3.setBackgroundColor(Color.rgb(255,244,118));
                b4.setBackgroundColor(Color.rgb(255,244,118));
                b5.setBackgroundColor(Color.rgb(255,244,118));
            }
        });
        ht10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Define all words with their EditText boxes
                String[] words = {"LODGE", "OLD", "LEG", "GOD","DOG","GOLD"};
                TextView[][] boxes = {
                        {e1, e2, e3, e4, e5},
                        {e9,e10, e11},
                        {e12,e13, e14},
                        {e4, e16, e6},
                        {e6, e7, e8},
                        {e14, e2, e15, e11}
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
                    Toast.makeText(wordten.this, "All words completed!", Toast.LENGTH_SHORT).show();
                } else {
                    ht10.setEnabled(false); // disable after one use

                }

            }
        });
        n10.setOnClickListener(new View.OnClickListener() {
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

                    Toast.makeText(wordten.this, "Complete all words before moving ahead!", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent i15 = new Intent(wordten.this, dispten.class);
                    startActivity(i15);
                }
            }
        });
    }
}