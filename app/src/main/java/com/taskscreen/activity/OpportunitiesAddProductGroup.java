package com.taskscreen.activity;

import android.content.Intent;
import android.graphics.Typeface;
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
 * Created by vanip_000 on 25-08-2016.
 */
public class OpportunitiesAddProductGroup extends AppCompatActivity {
    Typeface mfontRegularTypeFace,mfontLightTypeFace,mfontSemiBoldTypeFace;
    TextView mTVOppProGroupCancel,mTVOppProGroupDone,mTVOppProGroup,mTVOppProGroupname,mTVOppProGroupnamerequired,mTVOppProGroupdefault,
            mTVOppProGroupdefaultname;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.opportunities_addproduct_group);
        Window window = OpportunitiesAddProductGroup.this.getWindow();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(OpportunitiesAddProductGroup.this.getResources().getColor(R.color.colorPrimaryDark));
        }

        mfontRegularTypeFace= Typeface.createFromAsset(getAssets(),"fonts/OpenSans-Regular.ttf");

        mfontLightTypeFace = Typeface.createFromAsset(getAssets(), "fonts/OpenSans-Light.ttf");
        mfontSemiBoldTypeFace=Typeface.createFromAsset(getAssets(),"fonts/OpenSans-Semibold.ttf");

        mTVOppProGroupCancel= (TextView) findViewById(R.id.txt_opp_addproductgroup_cancel);
        mTVOppProGroupCancel.setTypeface(mfontRegularTypeFace);
        mTVOppProGroupDone= (TextView) findViewById(R.id.txt_opp_addproductgroup_done);
        mTVOppProGroupDone.setTypeface(mfontRegularTypeFace);
        mTVOppProGroupDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),OpportunitiesSelectSalesProcess.class);
                startActivity(intent);
            }
        });
        mTVOppProGroup= (TextView) findViewById(R.id.txt_opp_addproductgroup);
        mTVOppProGroup.setTypeface(mfontSemiBoldTypeFace);
        mTVOppProGroupname= (TextView) findViewById(R.id.txt_opp_productgroup_name);
        mTVOppProGroupname.setTypeface(mfontRegularTypeFace);
        mTVOppProGroupnamerequired= (TextView) findViewById(R.id.et_opp_productgroupname);
        mTVOppProGroupnamerequired.setTypeface(mfontRegularTypeFace);
        mTVOppProGroupdefault= (TextView) findViewById(R.id.txt_opp_productgroup_default);
        mTVOppProGroupdefault.setTypeface(mfontRegularTypeFace);
        mTVOppProGroupdefaultname= (TextView) findViewById(R.id.txt_opp_productgroup_defaultsales);
        mTVOppProGroupdefaultname.setTypeface(mfontRegularTypeFace);


    }
}
