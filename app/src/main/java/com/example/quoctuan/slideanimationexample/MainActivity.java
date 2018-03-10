package com.example.quoctuan.slideanimationexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_1 = findViewById(R.id.btn_1);
        final Animation animation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.slide_up);
        animation.setDuration(5000);
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn_1.startAnimation(animation);
                Intent main2 = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(main2);

            }
        });
    }
}
