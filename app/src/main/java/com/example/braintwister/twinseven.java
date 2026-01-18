package com.example.braintwister;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class twinseven extends BaseActivity {

    Button b7;

    ImageView i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12,i13,i14,i15,i16,i17,i18,i19,i20,i21,i22;
    ImageView firstCard = null;
    int firstId = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twinseven);
        currentLevel =7;
        b7=findViewById(R.id.btn7);
        i1=findViewById(R.id.i1);
        i2=findViewById(R.id.i2);
        i3=findViewById(R.id.i3);
        i4=findViewById(R.id.i4);
        i5=findViewById(R.id.i5);
        i6=findViewById(R.id.i6);
        i7=findViewById(R.id.i7);
        i8=findViewById(R.id.i8);
        i9=findViewById(R.id.i9);
        i10=findViewById(R.id.i10);
        i11=findViewById(R.id.i11);
        i12=findViewById(R.id.i12);
        i13=findViewById(R.id.i13);
        i14=findViewById(R.id.i14);
        i15=findViewById(R.id.i15);
        i16=findViewById(R.id.i16);
        i17=findViewById(R.id.i17);
        i18=findViewById(R.id.i18);
        i19=findViewById(R.id.i19);
        i20=findViewById(R.id.i20);
        i21=findViewById(R.id.i21);
        i22=findViewById(R.id.i22);

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (i1.getVisibility() == View.INVISIBLE &&
                        i2.getVisibility() == View.INVISIBLE &&
                        i3.getVisibility() == View.INVISIBLE &&
                        i4.getVisibility() == View.INVISIBLE &&
                        i5.getVisibility() == View.INVISIBLE &&
                        i6.getVisibility() == View.INVISIBLE &&
                        i7.getVisibility() == View.INVISIBLE &&
                        i8.getVisibility() == View.INVISIBLE &&
                        i9.getVisibility() == View.INVISIBLE &&
                        i10.getVisibility() == View.INVISIBLE &&
                        i11.getVisibility() == View.INVISIBLE &&
                        i12.getVisibility() == View.INVISIBLE &&
                        i13.getVisibility() == View.INVISIBLE &&
                        i14.getVisibility() == View.INVISIBLE &&
                        i15.getVisibility() == View.INVISIBLE &&
                        i16.getVisibility() == View.INVISIBLE &&
                        i17.getVisibility() == View.INVISIBLE &&
                        i18.getVisibility() == View.INVISIBLE &&
                        i19.getVisibility() == View.INVISIBLE &&
                        i20.getVisibility() == View.INVISIBLE &&
                        i21.getVisibility() == View.INVISIBLE &&
                        i22.getVisibility() == View.INVISIBLE) {

                    // All matched → go to next level
                    Intent in2 = new Intent(twinseven.this, twineight.class);
                    startActivity(in2);

                } else {
                    Toast.makeText(twinseven.this, "Complete all matches before moving ahead!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectCard(1, i1);
            }
        });

        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectCard(10, i2);
            }
        });

        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectCard(5, i3);
            }
        });

        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectCard(4, i4);
            }
        });

        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectCard(6, i5);
            }
        });

        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectCard(1, i6);
            }
        });

        i7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectCard(7, i7);
            }
        });

        i8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectCard(7, i8);
            }
        });

        i9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectCard(3, i9);
            }
        });

        i10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectCard(9, i10);
            }
        });

        i11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectCard(2, i11);
            }
        });

        i12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectCard(2, i12);
            }
        });

        i13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectCard(8, i13);
            }
        });

        i14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectCard(11, i14);
            }
        });

        i15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectCard(4, i15);
            }
        });

        i16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectCard(3, i16);
            }
        });

        i17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectCard(10, i17);
            }
        });

        i18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectCard(8, i18);
            }
        });

        i19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectCard(11, i19);
            }
        });

        i20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectCard(5, i20);
            }
        });

        i21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectCard(9, i21);
            }
        });

        i22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectCard(6, i22);
            }
        });

    }

    private void selection(ImageView card) {
        card.setColorFilter(0x8842A5F5);
    }

    private void disselect(ImageView card) {
        card.clearColorFilter();   // removes bg
    }

    private void selectCard(int id, ImageView card) {
        // FIRST CLICK
        if (firstCard == null) {
            firstCard = card;
            firstId = id;
            selection(firstCard);
            return;
        }

        // If user clicks the SAME CARD again then ignore
        if (firstCard == card) {
            return;
        }

        // SECOND CLICK ... CHECK MATCH
        if (firstId == id) {
            disselect(firstCard);
            disselect(card);
            // MATCH FOUND
            firstCard.setVisibility(View.INVISIBLE);
            card.setVisibility(View.INVISIBLE);

        } else {

            // WRONG MATCH
            MediaPlayer mp = MediaPlayer.create(this, R.raw.error);
            mp.start();

            // Remove highlight
            disselect(firstCard);
            disselect(card);
        }
        // RESET for next attempt
        firstCard = null;
        firstId = -1;
    }


}