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
public class wordfor extends BaseActivity {
    Button b1,b2,b3,b4,b5,b6;
    ImageButton n14,h14;
    TextView e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,e13,e14,e15,e16,e17,e18,e19,e20,e21,e22,t27,t28;
    ImageView img1,home14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wordfor);

        currentLevel = 14;

        b1=findViewById(R.id.btnH14);
        b2=findViewById(R.id.btnU14);
        b3=findViewById(R.id.btnN14);
        b4=findViewById(R.id.btT14);
        b5=findViewById(R.id.btnE14);
        b6=findViewById(R.id.btnR14);
        n14=findViewById(R.id.next14);
        h14=findViewById(R.id.hint14);
        home14=findViewById(R.id.home14);


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
//        e23=findViewById(R.id.ed23);

        t27=findViewById(R.id.tx27);
        t28=findViewById(R.id.tx28);
        img1=findViewById(R.id.chk14);



//        real code
        StringBuilder sb1=new StringBuilder();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b1.setBackgroundColor(Color.rgb(109,95,179));
                sb1.append("H");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b2.setBackgroundColor(Color.rgb(109,95,179));
                sb1.append("U");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b3.setBackgroundColor(Color.rgb(109,95,179));
                sb1.append("N");
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b4.setBackgroundColor(Color.rgb(109,95,179));
                sb1.append("T");
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
                sb1.append("R");
            }
        });
        home14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(wordfor.this);
                builder.setTitle("Exit Game");
                builder.setMessage("Your progress will be lost. Do you want to exit?");
                builder.setCancelable(false);

                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(wordfor.this, OptScr.class);
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

                if(s.equals("HUNTER"))
                {

                    e1.setText("H");
                    e2.setText("U");
                    e3.setText("N");
                    e4.setText("T");
                    e5.setText("E");
                    e6.setText("R");

                    t27.setVisibility(View.VISIBLE);
                    Animation animation = AnimationUtils.loadAnimation(wordfor.this, R.anim.scalingup);
                    t27.startAnimation(animation);
                    t28.setVisibility(View.GONE);

                    new android.os.Handler().postDelayed(() -> {
                        Animation fadeOut = AnimationUtils.loadAnimation(wordfor.this, R.anim.fadeout);
                        t27.startAnimation(fadeOut);
                        t27.setVisibility(View.GONE);
                    }, 2000);

                    MediaPlayer mp=MediaPlayer.create(wordfor.this,R.raw.animaone);
//        mp.setLooping(true);
                    mp.start();

                }

                else if(s.equals("TRUE"))
                {
                    e7.setText("T");
                    e6.setText("R");
                    e8.setText("U");
                    e9.setText("E");
//                    e10.setText("E");


                }

                else if(s.equals("NET"))
                {
                    e10.setText("N");
                    e9.setText("E");
                    e11.setText("T");
//                    e13.setText("S");


                }
                else if(s.equals("RUNT"))
                {
//                    e11.setText("S");
//
                    e12.setText("R");
                    e13.setText("U");
                    e14.setText("N");
                    e4.setText("T");

                    t28.setVisibility(View.VISIBLE);
                    Animation animation = AnimationUtils.loadAnimation(wordfor.this, R.anim.scalingup);
                    t28.startAnimation(animation);
                    t27.setVisibility(View.GONE);

                    new android.os.Handler().postDelayed(() -> {
                        Animation fadeOut = AnimationUtils.loadAnimation(wordfor.this, R.anim.fadeout);
                        t28.startAnimation(fadeOut);
                        t28.setVisibility(View.GONE);
                    }, 2000);

                    MediaPlayer mp=MediaPlayer.create(wordfor.this,R.raw.animatwo);
//        mp.setLooping(true);
                    mp.start();

                }

                else if(s.equals("RUN"))
                {
//
                    e12.setText("R");
                    e15.setText("U");
                    e16.setText("N");


                }
                else if(s.equals("RENT"))
                {
                    e17.setText("R");
                    e18.setText("E");
                    e3.setText("N");
                    e22.setText("T");


                }

                else if(s.equals("HUNT"))
                {
                    e19.setText("H");
                    e2.setText("U");
                    e20.setText("N");
                    e21.setText("T");

                }
                else
                {
                    Toast.makeText(wordfor.this, "Invalid word", Toast.LENGTH_SHORT).show();
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
        h14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Define all words with their EditText boxes
                String[] words = {"HUNTER", "TRUE", "NET", "RUNT","RUN","RENT","HUNT"};
                TextView[][] boxes = {
                        {e1, e2, e3, e4, e5,e6},
                        {e7, e6, e8, e9},
                        {e10, e9, e11},
                        {e12,e13, e14, e4},
                        {e12, e15, e16},
                        {e17, e18, e3, e22},
                        {e19, e2, e20,e21}

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
                    Toast.makeText(wordfor.this, "All words completed!", Toast.LENGTH_SHORT).show();
                } else {
                    h14.setEnabled(false); // disable after one use

                }

            }
        });
        n14.setOnClickListener(new View.OnClickListener() {
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

                    Toast.makeText(wordfor.this, "Complete all words before moving ahead!", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent i18 = new Intent(wordfor.this, dispfor.class);
                    startActivity(i18);
                }
            }
        });
    }
}