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

public class wordfif extends BaseActivity {

    Button b1,b2,b3,b4,b5,b6;
    ImageButton n15,h15;
    TextView e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,e13,e14,e15,e16,e17,e18,e19,e20,e21,e22,e23,e24,
            e25,e26,e27,e28,e29,t29,t30;
    ImageView img1,home15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wordfif);


        currentLevel = 15;

        b1=findViewById(R.id.btnM15);
        b2=findViewById(R.id.btnS15);
        b3=findViewById(R.id.btnA15);
        b4=findViewById(R.id.btT15);
        b5=findViewById(R.id.btnE15);
        b6=findViewById(R.id.btnR15);
        n15=findViewById(R.id.next15);
        h15=findViewById(R.id.hint15);
        home15=findViewById(R.id.home15);


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
        e24=findViewById(R.id.ed24);
        e25=findViewById(R.id.ed25);
        e26=findViewById(R.id.ed26);
        e27=findViewById(R.id.ed27);
        e28=findViewById(R.id.ed28);
        e29=findViewById(R.id.ed29);

        t29=findViewById(R.id.tx29);
        t30=findViewById(R.id.tx30);
        img1=findViewById(R.id.chk15);



//        real code
        StringBuilder sb1=new StringBuilder();
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b1.setBackgroundColor(Color.rgb(109,95,179));
                sb1.append("M");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b2.setBackgroundColor(Color.rgb(109,95,179));
                sb1.append("S");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b3.setBackgroundColor(Color.rgb(109,95,179));
                sb1.append("A");
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
        home15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(wordfif.this);
                builder.setTitle("Exit Game");
                builder.setMessage("Your progress will be lost. Do you want to exit?");
                builder.setCancelable(false);

                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(wordfif.this, OptScr.class);
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

                if(s.equals("STREAM"))
                {

                    e1.setText("S");
                    e2.setText("T");
                    e3.setText("R");
                    e4.setText("E");
                    e5.setText("A");
                    e6.setText("M");

                }

                else if(s.equals("MASTER"))
                {
                    e6.setText("M");
                    e7.setText("A");
                    e8.setText("S");
                    e9.setText("T");
                    e10.setText("E");
                    e11.setText("R");

                    t29.setVisibility(View.VISIBLE);
                    Animation animation = AnimationUtils.loadAnimation(wordfif.this, R.anim.scalingup);
                    t29.startAnimation(animation);
                    t30.setVisibility(View.GONE);

                    new android.os.Handler().postDelayed(() -> {
                        Animation fadeOut = AnimationUtils.loadAnimation(wordfif.this, R.anim.fadeout);
                        t29.startAnimation(fadeOut);
                        t29.setVisibility(View.GONE);
                    }, 2000);

                    MediaPlayer mp=MediaPlayer.create(wordfif.this,R.raw.animaone);
//        mp.setLooping(true);
                    mp.start();

                }

                else if(s.equals("ART"))
                {
                    e14.setText("A");
                    e16.setText("R");
                    e17.setText("T");
//                    e13.setText("S");


                }
                else if(s.equals("STEAM"))
                {
                    e12.setText("S");
                    e2.setText("T");
                    e13.setText("E");
                    e14.setText("A");
                    e15.setText("M");


                }

                else if(s.equals("ARE"))
                {
//                    e23.setText("R");
                    e19.setText("A");
                    e20.setText("R");
                    e10.setText("E");


                }
                else if(s.equals("RAM"))
                {
//                    e23.setText("R");
                    e28.setText("R");
                    e7.setText("A");
                    e29.setText("M");


                }
                else if(s.equals("TEAM"))
                {
                    e17.setText("T");
                    e18.setText("E");
                    e19.setText("A");
                    e21.setText("M");

                    t30.setVisibility(View.VISIBLE);
                    Animation animation = AnimationUtils.loadAnimation(wordfif.this, R.anim.scalingup);
                    t30.startAnimation(animation);
                    t29.setVisibility(View.GONE);

                    new android.os.Handler().postDelayed(() -> {
                        Animation fadeOut = AnimationUtils.loadAnimation(wordfif.this, R.anim.fadeout);
                        t30.startAnimation(fadeOut);
                        t30.setVisibility(View.GONE);
                    }, 2000);

                    MediaPlayer mp=MediaPlayer.create(wordfif.this,R.raw.animatwo);
//        mp.setLooping(true);
                    mp.start();
                }

                else if(s.equals("SEAT"))
                {
//                    e19.setText("H");
                    e12.setText("S");
                    e25.setText("E");
                    e26.setText("A");
                    e27.setText("T");


                }
                else if(s.equals("TERM"))
                {
//                    e19.setText("H");
                    e24.setText("T");
                    e23.setText("E");
                    e22.setText("R");
                    e21.setText("M");


                }
                else
                {
                    Toast.makeText(wordfif.this, "Invalid word", Toast.LENGTH_SHORT).show();
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
        h15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Define all words with their EditText boxes
                String[] words = {"STREAM", "MASTER", "ART", "STEAM","ARE","RAM","TEAM","SEAT","TERM"};
                TextView[][] boxes = {
                        {e1, e2, e3, e4, e5,e6},
                        {e6, e7, e8, e9, e10,e11},
                        {e14, e16, e7},
                        {e12,e2,e13, e14, e15},
                        {e19, e20, e10},
                        {e28, e7, e29},
                        {e17, e18, e19,e21},
                        {e12, e25, e26,e27},
                        {e24, e23, e22,e21}

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
                    Toast.makeText(wordfif.this, "All words completed!", Toast.LENGTH_SHORT).show();
                } else {
                    h15.setEnabled(false); // disable after one use

                }

            }
        });
        n15.setOnClickListener(new View.OnClickListener() {
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
                        e15.getText().toString().trim().isEmpty()  ||
                        e16.getText().toString().trim().isEmpty() ||
                        e17.getText().toString().trim().isEmpty() ||
                        e18.getText().toString().trim().isEmpty() ||
                        e19.getText().toString().trim().isEmpty() ||
                        e20.getText().toString().trim().isEmpty() ||
                        e21.getText().toString().trim().isEmpty() ||
                        e22.getText().toString().trim().isEmpty() ||
                        e23.getText().toString().trim().isEmpty() ||
                        e24.getText().toString().trim().isEmpty() ||
                        e25.getText().toString().trim().isEmpty() ||
                        e26.getText().toString().trim().isEmpty() ||
                        e27.getText().toString().trim().isEmpty() ||
                        e28.getText().toString().trim().isEmpty()
                ) {

                    Toast.makeText(wordfif.this, "Complete all words before moving ahead!", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent i19 = new Intent(wordfif.this, dispfif.class);
                    startActivity(i19);
                }
            }
        });

}
}