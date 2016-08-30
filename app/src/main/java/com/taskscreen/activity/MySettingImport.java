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

public class MySettingImport extends AppCompatActivity {

    TextView txt_importstorage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mysetting_import);



        Window window = MySettingImport.this.getWindow();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(MySettingImport.this.getResources().getColor(R.color.colorPrimary));
        }

        txt_importstorage= (TextView) findViewById(R.id.txt_mysetting_importstorage);
        txt_importstorage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MySettingStorage.class);
                startActivity(intent);
            }
        });
    }
}
