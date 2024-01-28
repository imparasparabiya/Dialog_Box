package com.example.dialogbox;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.ViewModelProvider;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    RelativeLayout relative1, relative2;
    ImageView background;
    TextView txtwelcome;
    FloatingActionButton btnFloting;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        relative1 = findViewById(R.id.relative1);
        relative2 = findViewById(R.id.relative2);
        background = findViewById(R.id.background);
        btnFloting = findViewById(R.id.btnFloting);

        btnFloting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.dialogbox);
                dialog.show();

                dialogBinding(dialog);
                imageBinnding(dialog);
                textBinding(dialog);
            }
        });
    }

    void dialogBinding(Dialog dialog) {

        LinearLayout color1, color2, color3, color4, color5, color6, color7, color8, color9, color10, color11, color12, color13;

        color1 = dialog.findViewById(R.id.color1);
        color2 = dialog.findViewById(R.id.color2);
        color3 = dialog.findViewById(R.id.color3);
        color4 = dialog.findViewById(R.id.color4);
        color5 = dialog.findViewById(R.id.color5);
        color6 = dialog.findViewById(R.id.color6);
        color7 = dialog.findViewById(R.id.color7);
        color8 = dialog.findViewById(R.id.color8);
        color9 = dialog.findViewById(R.id.color9);
        color10 = dialog.findViewById(R.id.color10);
        color11 = dialog.findViewById(R.id.color11);
        color12 = dialog.findViewById(R.id.color12);
        color13 = dialog.findViewById(R.id.color13);

        color1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                relative1.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.black));
            }
        });
        color2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                relative1.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.Pink));
            }
        });
        color3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                relative1.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.yellow));
            }
        });
        color4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                relative1.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.Red));
            }
        });
        color5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                relative1.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.green));
            }
        });
        color6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                relative1.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.Maroon));
            }
        });
        color7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                relative1.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.Olive));
            }
        });
        color8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                relative1.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.Navy));
            }
        });

        color9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                relative1.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.Purple));
            }
        });
        color10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                relative1.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.Aquamarine));
            }
        });

        color11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                relative1.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.LightBlue));
            }
        });

        color12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                relative1.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.Cream));
            }
        });
        color13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                relative1.setBackgroundColor(ContextCompat.getColor(MainActivity.this, R.color.DarkCoffee));
            }
        });


    }

    void imageBinnding(Dialog dialog) {

        ImageView design1, design2, design3, design4, design5, design6, design7;

        design1 = dialog.findViewById(R.id.design1);
        design2 = dialog.findViewById(R.id.design2);
        design3 = dialog.findViewById(R.id.design3);
        design4 = dialog.findViewById(R.id.design4);
        design5 = dialog.findViewById(R.id.design5);
        design6 = dialog.findViewById(R.id.design6);
        design7 = dialog.findViewById(R.id.design7);

        design1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                background.setImageDrawable(getDrawable(R.drawable.b4));
            }
        });

        design2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                background.setImageDrawable(getDrawable(R.drawable.b5));
            }
        });
        design3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                background.setImageDrawable(getDrawable(R.drawable.bng));
            }
        });
        design4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                background.setImageDrawable(getDrawable(R.drawable.wpb2));
            }
        });
        design5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                background.setImageDrawable(getDrawable(R.drawable.wpb3));
            }
        });
        design6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                background.setImageDrawable(getDrawable(R.drawable.wpb4));
            }
        });
        design7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                background.setImageDrawable(getDrawable(R.drawable.wpbackground));
            }
        });
    }
    void textBinding(Dialog dialog) {
        TextView font1,font2,font3,font4,font5,font6,font7;

        font1 = dialog.findViewById(R.id.font1);
        font2 = dialog.findViewById(R.id.font2);
        font3 = dialog.findViewById(R.id.font3);
        font4 = dialog.findViewById(R.id.font4);
        font5 = dialog.findViewById(R.id.font5);
        font6 = dialog.findViewById(R.id.font6);
        font7 = dialog.findViewById(R.id.font7);

        font1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}