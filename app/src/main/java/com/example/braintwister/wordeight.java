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
public class wordeight extends BaseActivity{

    Button b1,b2,b3,b4,b5;
    ImageButton n8,ht8;
    TextView e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,e13,e14,e15,e16,e17,t15,t16;
    ImageView img1,home8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wordeight);
        currentLevel = 8;

        b1=findViewById(R.id.btnL8);
        b2=findViewById(R.id.btnO8);
        b3=findViewById(R.id.btnC8);
        b4=findViewById(R.id.btE8);
        b5=findViewById(R.id.btnN8);
        n8=findViewById(R.id.next8);
        ht8=findViewById(R.id.hint8);
        home8=findViewById(R.id.home8);


//        textboxes

        e1=findViewById(R.id.ed1);
        e2=findViewById(R.id.ed2);
        e3=findViewById(R.id.ed3);
        e4=findViewById(R.id.ed4);
        e5=findViewById(R.id.ed5);
        e6=findViewById(R.id.ed6);
        e7=findViewById(R.id.ed7);
        e8=findViewById(R.id.ed8);
//        e9=findViewById(R.id.ed9);
//        e10=findViewById(R.id.ed10);
        e11=findViewById(R.id.ed11);
        e12=findViewById(R.id.ed12);
        e13=findViewById(R.id.ed13);
        e14=findViewById(R.id.ed14);
        e15=findViewById(R.id.ed15);
        e16=findViewById(R.id.ed16);
        e17=findViewById(R.id.ed17);
//        e18=findViewById(R.id.ed18);

        img1=findViewById(R.id.chk8);
        t15=findViewById(R.id.tx15);
        t16=findViewById(R.id.tx16);


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
                sb1.append("O");
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
                sb1.append("E");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b5.setBackgroundColor(Color.rgb(255,244,118));
                sb1.append("N");
            }
        });
        home8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(wordeight.this);
                builder.setTitle("Exit Game");
                builder.setMessage("Your progress will be lost. Do you want to exit?");
                builder.setCancelable(false);

                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(wordeight.this, OptScr.class);
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

                if(s.equals("CLONE"))
                {

                    e1.setText("C");
                    e2.setText("L");
                    e3.setText("O");
                    e4.setText("N");
                    e5.setText("E");

                    t15.setVisibility(View.VISIBLE);
                    Animation animation = AnimationUtils.loadAnimation(wordeight.this, R.anim.scalingup);
                    t15.startAnimation(animation);
                    t16.setVisibility(View.GONE);

                    new android.os.Handler().postDelayed(() -> {
                        Animation fadeOut = AnimationUtils.loadAnimation(wordeight.this, R.anim.fadeout);
                        t15.startAnimation(fadeOut);
                        t15.setVisibility(View.GONE);
                    }, 2000);

                    MediaPlayer mp=MediaPlayer.create(wordeight.this,R.raw.animaone);
//        mp.setLooping(true);
                    mp.start();


                }

                else if(s.equals("ONE"))
                {
                    e7.setText("O");
                    e17.setText("N");
                    e5.setText("E");
//                    e8.setText("K");

                }

                else if(s.equals("CONE"))
                {
                    e14.setText("C");
                    e3.setText("O");
                    e15.setText("N");
                    e16.setText("E");

                }
                else if(s.equals("LONE"))
                {
                    e2.setText("L");
                    e12.setText("O");
                    e13.setText("N");
                    e11.setText("E");

                    t16.setVisibility(View.VISIBLE);
                    Animation animation = AnimationUtils.loadAnimation(wordeight.this, R.anim.scalingup);
                    t16.startAnimation(animation);
                    t15.setVisibility(View.GONE);

                    new android.os.Handler().postDelayed(() -> {
                        Animation fadeOut = AnimationUtils.loadAnimation(wordeight.this, R.anim.fadeout);
                        t16.startAnimation(fadeOut);
                        t16.setVisibility(View.GONE);
                    }, 2000);

                    MediaPlayer mp=MediaPlayer.create(wordeight.this,R.raw.animatwo);
//        mp.setLooping(true);
                    mp.start();

                }

                else if(s.equals("CON"))
                {
                    e6.setText("C");
                    e7.setText("O");
                    e8.setText("N");


                }

                else
                {
                    Toast.makeText(wordeight.this, "Invalid word", Toast.LENGTH_SHORT).show();
                }

                sb1.setLength(0); // clear string builder

                b1.setBackgroundColor(Color.rgb(255,244,118));
                b2.setBackgroundColor(Color.rgb(255,244,118));
                b3.setBackgroundColor(Color.rgb(255,244,118));
                b4.setBackgroundColor(Color.rgb(255,244,118));
                b5.setBackgroundColor(Color.rgb(255,244,118));
            }
        });
        ht8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Define all words with their EditText boxes
                String[] words = {"CLONE", "ONE", "CONE", "LONE","CON",};
                TextView[][] boxes = {
                        {e1, e2, e3, e4, e5},
                        {e5, e17, e5},
                        {e14, e3, e15,e16},
                        {e2, e12, e13, e11},
                        {e6, e7, e8}
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
                    Toast.makeText(wordeight.this, "All words completed!", Toast.LENGTH_SHORT).show();
                } else {
                    ht8.setEnabled(false); // disable after one use

                }

            }
        });
        n8.setOnClickListener(new View.OnClickListener() {
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
//                        e9.getText().toString().trim().isEmpty() ||
//                        e10.getText().toString().trim().isEmpty() ||
                        e11.getText().toString().trim().isEmpty() ||
                        e12.getText().toString().trim().isEmpty() ||
                        e13.getText().toString().trim().isEmpty() ||
                        e14.getText().toString().trim().isEmpty() ||
                        e15.getText().toString().trim().isEmpty()
                ) {

                    Toast.makeText(wordeight.this, "Complete all words before moving ahead!", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent i13 = new Intent(wordeight.this, dispeight.class);
                    startActivity(i13);
                }
            }
        });
    }
}