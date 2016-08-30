package com.taskscreen.activity;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.taskscreen.R;

public class MySettingPersonalInfo extends AppCompatActivity {
    TextView txt_personaldone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mysetting_personal_info);
        Window window = MySettingPersonalInfo.this.getWindow();



        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(MySettingPersonalInfo.this.getResources().getColor(R.color.colorPrimary));
        }

        txt_personaldone= (TextView) findViewById(R.id.txt_personalinfodone);
        txt_personaldone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MySettingChangePassword.class);
                startActivity(intent);
            }
        });
    }
}
