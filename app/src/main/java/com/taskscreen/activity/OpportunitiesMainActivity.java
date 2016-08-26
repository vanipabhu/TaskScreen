package com.taskscreen.activity;

import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.taskscreen.R;

/**
 * Created by vanip_000 on 24-08-2016.
 */
public class OpportunitiesMainActivity extends AppCompatActivity {
    Typeface mfontLightTypeFace,mfontRegularTypeFace,mfontSemiBoldTypeFace;
    TextView mTvOppHeading, mTvOppPearsonName,mTvOppMessage,mTvOppYearNum,mTvOppYear;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.opportunities_mainlayout);

        mTvOppHeading= (TextView) findViewById(R.id.txt_opportunities_heading);
        mTvOppPearsonName= (TextView) findViewById(R.id.txt_opportunities_heading_name);
        mTvOppMessage= (TextView) findViewById(R.id.txt_opportunities_message);
        mTvOppYearNum= (TextView) findViewById(R.id.txt_opportunities_yearnum);
        mTvOppYear= (TextView) findViewById(R.id.txt_opportunities_yaer);


        mfontRegularTypeFace= Typeface.createFromAsset(getAssets(),"fonts/OpenSans-Regular.ttf");

        mfontLightTypeFace = Typeface.createFromAsset(getAssets(), "fonts/OpenSans-Light.ttf");
        mfontSemiBoldTypeFace=Typeface.createFromAsset(getAssets(),"fonts/OpenSans-Semibold.ttf");

        mTvOppHeading.setTypeface(mfontRegularTypeFace);
        mTvOppPearsonName.setTypeface(mfontRegularTypeFace);
        mTvOppMessage.setTypeface(mfontRegularTypeFace);
        mTvOppYear.setTypeface(mfontRegularTypeFace);
        mTvOppYearNum.setTypeface(mfontSemiBoldTypeFace);
        mTvOppYear.setTypeface(mfontSemiBoldTypeFace);


        Window window = OpportunitiesMainActivity.this.getWindow();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(OpportunitiesMainActivity.this.getResources().getColor(R.color.taskbackgrounddark));
        }
    }
}