package com.taskscreen.activity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.taskscreen.R;

/**
 * Created by vanip_000 on 26-08-2016.
 */
public class OpportunitiesAddOrderRow extends AppCompatActivity {
    TextView txt_addorderdone;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.opportunities_addorderrow);

        Window window = OpportunitiesAddOrderRow.this.getWindow();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(OpportunitiesAddOrderRow.this.getResources().getColor(R.color.peach_opportunities));
        }

        txt_addorderdone= (TextView) findViewById(R.id.txt_oppaddorderrow_done);
        txt_addorderdone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),OpportunitiesMainActivity.class);
                startActivity(intent);
            }
        });
    }


}
