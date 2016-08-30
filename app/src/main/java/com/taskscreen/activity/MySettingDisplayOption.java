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
import android.widget.TextView;

import com.taskscreen.R;

/**
 * Created by vanip_000 on 29-08-2016.
 */
public class MySettingDisplayOption extends AppCompatActivity {
    ImageView imgcontact;
    TextView txtdisplayoption;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mysetting_displayoption);

        Window window = MySettingDisplayOption.this.getWindow();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(MySettingDisplayOption.this.getResources().getColor(R.color.colorPrimary));
        }
        txtdisplayoption= (TextView) findViewById(R.id.txt_displayoption);
        txtdisplayoption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MySettingImport.class);
                startActivity(intent);
            }
        });
    }
}
