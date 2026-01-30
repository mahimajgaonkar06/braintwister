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


public class wordseven extends BaseActivity {

    Button b1,b2,b3,b4,b5;
    ImageButton n7,ht7;
    TextView e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,e13,e14,e15,e16,e17,e18,t13,t14;
    ImageView img1,home7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wordseven);
        currentLevel = 7;
        b1=findViewById(R.id.btnN7);
        b2=findViewById(R.id.btnK7);
        b3=findViewById(R.id.btnE7);
        b4=findViewById(R.id.btE7);
        b5=findViewById(R.id.btnS7);
        n7=findViewById(R.id.next7);
        ht7=findViewById(R.id.hint7);
        home7=findViewById(R.id.home7);


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

        img1=findViewById(R.id.chk7);
        t13=findViewById(R.id.tx13);
        t14=findViewById(R.id.tx14);


//        real code
        StringBuilder sb1=new StringBuilder();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b1.setBackgroundColor(Color.rgb(255,244,118));
                sb1.append("N");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b2.setBackgroundColor(Color.rgb(255,244,118));
                sb1.append("K");
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
                sb1.append("E");
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b5.setBackgroundColor(Color.rgb(255,244,118));
                sb1.append("S");
            }
        });
        home7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(wordseven.this);
                builder.setTitle("Exit Game");
                builder.setMessage("Your progress will be lost. Do you want to exit?");
                builder.setCancelable(false);

                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(wordseven.this, OptScr.class);
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

                if(s.equals("KNEES"))
                {

                    e1.setText("K");
                    e2.setText("N");
                    e3.setText("E");
                    e4.setText("E");
                    e5.setText("S");

                    t13.setVisibility(View.VISIBLE);
                    Animation animation = AnimationUtils.loadAnimation(wordseven.this, R.anim.scalingup);
                    t13.startAnimation(animation);
                    t14.setVisibility(View.GONE);

                    new android.os.Handler().postDelayed(() -> {
                        Animation fadeOut = AnimationUtils.loadAnimation(wordseven.this, R.anim.fadeout);
                        t13.startAnimation(fadeOut);
                        t13.setVisibility(View.GONE);
                    }, 2000);

                    MediaPlayer mp=MediaPlayer.create(wordseven.this,R.raw.animaone);
//        mp.setLooping(true);
                    mp.start();

                }

                else if(s.equals("SEEK"))
                {
                    e5.setText("S");
                    e6.setText("E");
                    e7.setText("E");
                    e8.setText("K");

                }

                else if(s.equals("KEEN"))
                {
                    e1.setText("K");
                    e9.setText("E");
                    e10.setText("E");
                    e11.setText("N");

                }
                else if(s.equals("SEEN"))
                {
                    e12.setText("S");
                    e13.setText("E");
                    e14.setText("E");
                    e15.setText("N");


                    t14.setVisibility(View.VISIBLE);
                    Animation animation = AnimationUtils.loadAnimation(wordseven.this, R.anim.scalingup);
                    t14.startAnimation(animation);
                    t13.setVisibility(View.GONE);

                    new android.os.Handler().postDelayed(() -> {
                        Animation fadeOut = AnimationUtils.loadAnimation(wordseven.this, R.anim.fadeout);
                        t14.startAnimation(fadeOut);
                        t14.setVisibility(View.GONE);
                    }, 2000);

                    MediaPlayer mp=MediaPlayer.create(wordseven.this,R.raw.animatwo);
//        mp.setLooping(true);
                    mp.start();
                }

                else if(s.equals("SEE"))
                {
                    e12.setText("S");
                    e18.setText("E");
                    e7.setText("E");


                }
                else if(s.equals("KNEE"))
                {
                    e17.setText("K");
                    e11.setText("N");
                    e16.setText("E");
                    e13.setText("E");


                }
                else
                {
                    Toast.makeText(wordseven.this, "Invalid word", Toast.LENGTH_SHORT).show();
                }

                sb1.setLength(0); // clear string builder

                b1.setBackgroundColor(Color.rgb(255,244,118));
                b2.setBackgroundColor(Color.rgb(255,244,118));
                b3.setBackgroundColor(Color.rgb(255,244,118));
                b4.setBackgroundColor(Color.rgb(255,244,118));
                b5.setBackgroundColor(Color.rgb(255,244,118));
            }
        });
        ht7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Define all words with their EditText boxes
                String[] words = {"KNEES", "SEEK", "KEEN", "SEEN","SEE","KNEE"};
                TextView[][] boxes = {
                        {e1, e2, e3, e4, e5},
                        {e5, e6, e7, e8},
                        {e1, e9, e10,e11},
                        {e12, e13, e14, e15},
                        {e12, e18, e7},
                        {e17, e11, e16, e13}
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
                    Toast.makeText(wordseven.this, "All words completed!", Toast.LENGTH_SHORT).show();
                } else {
                    ht7.setEnabled(false); // disable after one use

                }

            }
        });



        n7.setOnClickListener(new View.OnClickListener() {
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
                        e18.getText().toString().trim().isEmpty()

                ) {

                    Toast.makeText(wordseven.this, "Complete all words before moving ahead!", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent i12 = new Intent(wordseven.this, dispseven.class);
                    startActivity(i12);
                }
            }
        });
    }
}