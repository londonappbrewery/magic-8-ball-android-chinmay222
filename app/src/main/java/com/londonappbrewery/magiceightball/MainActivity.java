package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView im = (ImageView) findViewById(R.id.imageball);
        final int[] balls = {R.drawable.ball1,
                R.drawable.ball2,
                R.drawable.ball3,R.drawable.ball4,R.drawable.ball5,};
        Button b = (Button) findViewById(R.id.rollbutton);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random r = new Random();
                int i = r.nextInt(5);
                im.setImageResource(balls[i]);
            }
        });
    }
}
