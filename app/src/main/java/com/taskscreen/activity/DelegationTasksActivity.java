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
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.taskscreen.R;

/**
 * Created by vanip_000 on 23-08-2016.
 */
public class DelegationTasksActivity extends AppCompatActivity{
    TextView mTvDelegation,mTvDelegationContactName;
    TextView mBTDelegationTask,mBTDelegationLeads ;
    EditText mETDelegationSearch;
    TextView mTvDelegationYear,mTvDelegationNumber;
    Typeface mfontLightTypeFace,mfontRegularTypeFace,mfontSemiBoldTypeFace;
    ImageView mIVDelegationRunning,mIVDelegationFilter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.delegation_tasks);


        mTvDelegation= (TextView) findViewById(R.id.txt_delegation_lead_heading);
        mTvDelegationContactName= (TextView) findViewById(R.id.txt_delegation_heading_name);
        mBTDelegationLeads= (TextView) findViewById(R.id.txt_delegationtask_task);
        mBTDelegationTask= (TextView) findViewById(R.id.txt_delegationtask_leads);
        mETDelegationSearch= (EditText) findViewById(R.id.edit_delegation_tasksearch);
        mTvDelegationYear= (TextView) findViewById(R.id.textYearSelection_deltask);
        mTvDelegationNumber= (TextView) findViewById(R.id.textYearSelection_numeric_deltask);
        mIVDelegationRunning= (ImageView) findViewById(R.id.image_running_delegationtask);
        mIVDelegationFilter= (ImageView) findViewById(R.id.image_filter_delegationtask);


        mfontRegularTypeFace=Typeface.createFromAsset(getAssets(),"fonts/OpenSans-Regular.ttf");

        mfontLightTypeFace = Typeface.createFromAsset(getAssets(), "fonts/OpenSans-Light.ttf");
        mfontSemiBoldTypeFace=Typeface.createFromAsset(getAssets(),"fonts/OpenSans-Semibold.ttf");


        mBTDelegationLeads.setTypeface(mfontRegularTypeFace);
        mBTDelegationTask.setTypeface(mfontRegularTypeFace);
        mTvDelegation.setTypeface(mfontRegularTypeFace);
        mTvDelegationContactName.setTypeface(mfontRegularTypeFace);
        mETDelegationSearch.setTypeface(mfontRegularTypeFace);
        mTvDelegationNumber.setTypeface(mfontSemiBoldTypeFace);
        mTvDelegationYear.setTypeface(mfontRegularTypeFace);
        mIVDelegationRunning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),OpportunitiesMainActivity.class);
                startActivity(i);
            }
        });
        mIVDelegationFilter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MySettingPersonalInfo.class);
                startActivity(intent);
            }
        });


        Window window = DelegationTasksActivity.this.getWindow();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(DelegationTasksActivity.this.getResources().getColor(R.color.taskbackgrounddark));
        }



    }


}
