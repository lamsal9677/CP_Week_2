package com.example.cp_week_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.drawable.DrawableCompat;

import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LightingColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //((ImageView) findViewById(R.id.hide)).setImageResource(R.drawable.ic_iconmonstr_eye_8);
        //((ImageView) findViewById(R.id.see)).setImageResource(R.drawable.ic_see);

        findViewById(R.id.hide).setVisibility(View.VISIBLE);
        findViewById(R.id.see).setVisibility(View.INVISIBLE);
        TextView textView = (TextView) findViewById(R.id.Result);
        textView.setText("Select One");

        findViewById(R.id.hide).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.Ans1).setVisibility(View.INVISIBLE);
                findViewById(R.id.Ans2).setVisibility(View.INVISIBLE);
                findViewById(R.id.Ans3).setVisibility(View.INVISIBLE);
                findViewById(R.id.Ans4).setVisibility(View.INVISIBLE);
                findViewById(R.id.Result).setVisibility(View.INVISIBLE);
                findViewById(R.id.hide).setVisibility(View.INVISIBLE);
                findViewById(R.id.see).setVisibility(View.VISIBLE);
            }
        });

        findViewById(R.id.see).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.Ans1).setVisibility(View.VISIBLE);
                findViewById(R.id.Ans2).setVisibility(View.VISIBLE);
                findViewById(R.id.Ans3).setVisibility(View.VISIBLE);
                findViewById(R.id.Ans4).setVisibility(View.VISIBLE);
                findViewById(R.id.hide).setVisibility(View.VISIBLE);
                findViewById(R.id.see).setVisibility(View.INVISIBLE);
                findViewById(R.id.Result).setVisibility(View.VISIBLE);
            }
        });

        findViewById(R.id.Ans1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.Ans1).setBackgroundResource(R.drawable.incorrect);
                findViewById(R.id.Ans2).setBackgroundResource(R.drawable.correct);
                findViewById(R.id.Ans3).setBackgroundResource(R.drawable.incorrect);
                findViewById(R.id.Ans4).setBackgroundResource(R.drawable.incorrect);
                TextView textView = (TextView) findViewById(R.id.Result);
                textView.setText("Incorrect:(");
            }
        });
        findViewById(R.id.Ans2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.Ans1).setBackgroundResource(R.drawable.incorrect);
                findViewById(R.id.Ans2).setBackgroundResource(R.drawable.correct);
                findViewById(R.id.Ans3).setBackgroundResource(R.drawable.incorrect);
                findViewById(R.id.Ans4).setBackgroundResource(R.drawable.incorrect);

                TextView textView = (TextView) findViewById(R.id.Result);
                textView.setText("Correct!!");
            }
        });
        findViewById(R.id.Ans3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.Ans1).setBackgroundResource(R.drawable.incorrect);
                findViewById(R.id.Ans2).setBackgroundResource(R.drawable.correct);
                findViewById(R.id.Ans3).setBackgroundResource(R.drawable.incorrect);
                findViewById(R.id.Ans4).setBackgroundResource(R.drawable.incorrect);

                TextView textView = (TextView) findViewById(R.id.Result);
                textView.setText("Incorrect:(");
            }
        });
        findViewById(R.id.Ans4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.Ans1).setBackgroundResource(R.drawable.incorrect);
                findViewById(R.id.Ans2).setBackgroundResource(R.drawable.correct);
                findViewById(R.id.Ans3).setBackgroundResource(R.drawable.incorrect);
                findViewById(R.id.Ans4).setBackgroundResource(R.drawable.incorrect);

                TextView textView = (TextView) findViewById(R.id.Result);
                textView.setText("Incorrect:(");
            }
        });

        findViewById(R.id.refresh).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                findViewById(R.id.Ans1).setBackgroundResource(R.drawable.shape);
                findViewById(R.id.Ans2).setBackgroundResource(R.drawable.shape);
                findViewById(R.id.Ans3).setBackgroundResource(R.drawable.shape);
                findViewById(R.id.Ans4).setBackgroundResource(R.drawable.shape);

                TextView textView = (TextView) findViewById(R.id.Result);
                textView.setText("Select One");
            }
        });


    }
}
