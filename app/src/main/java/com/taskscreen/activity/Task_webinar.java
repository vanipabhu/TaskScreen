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
import android.widget.RelativeLayout;

import com.taskscreen.R;

/**
 * Created by vanip_000 on 20-08-2016.
 */
public class Task_webinar extends AppCompatActivity {
    RelativeLayout rl;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task_webinar);




        Window window = Task_webinar.this.getWindow();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Task_webinar.this.getResources().getColor(R.color.taskbackgrounddark));
        }
        rl= (RelativeLayout) findViewById(R.id.firstitemlayout);
        rl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),Edit_Task_Activity.class);
                startActivity(intent);
            }
        });
    }
}
