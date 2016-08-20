package com.taskscreen.activity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.taskscreen.R;

/**
 * Created by vanip_000 on 19-08-2016.
 */
public class Task_MainScreen extends AppCompatActivity {

    ImageView image_running;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task_mainlayout);


        image_running= (ImageView) findViewById(R.id.image_running);
        image_running.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),Task_webinar.class);
                startActivity(i);
            }
        });

        Window window = Task_MainScreen.this.getWindow();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Task_MainScreen.this.getResources().getColor(R.color.taskbackgrounddark));
        }
    }
}
