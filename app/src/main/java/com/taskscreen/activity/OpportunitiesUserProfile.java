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
 * Created by vanip_000 on 27-08-2016.
 */
public class OpportunitiesUserProfile extends AppCompatActivity

{
    ImageView img_actionmore;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.opportunities_userprofile);

        Window window = OpportunitiesUserProfile.this.getWindow();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(OpportunitiesUserProfile.this.getResources().getColor(R.color.taskbackgrounddark));
        }

        img_actionmore= (ImageView) findViewById(R.id.img_oppuserprofile_moreaction);
        img_actionmore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),Task_webinar.class);
                startActivity(intent);
            }
        });
    }
}
