package com.vidu.toss;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView text;

    public void blink(View view){
        ImageView imagev = (ImageView)findViewById(R.id.imagev);
        Animation animation1 =
                AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.blink);

        imagev.startAnimation(animation1);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageView imagev =  (ImageView) findViewById(R.id.imagev) ;


        Button btn1 = (Button) findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random r = new Random();
                int key = r.nextInt(1000);
            text = (TextView) findViewById(R.id.text);
                int toss = key%2;
                final String outs ;
                blink(v);
                if(toss==0)
                {
                   imagev.setImageResource(R.drawable.heads);
                    outs ="HEADS" ;
                }
                else
                {
                    imagev.setImageResource(R.drawable.tails);
                    outs = "TAILS";
                }
                    text.setText("");
                text.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        text.setText(outs);
                    }
                }, 1800);

            }
        });
    }

}
