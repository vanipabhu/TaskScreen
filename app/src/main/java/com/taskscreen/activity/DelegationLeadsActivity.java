package com.taskscreen.activity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import com.michael.easydialog.EasyDialog;
import com.taskscreen.R;

/**
 * Created by vanip_000 on 22-08-2016.
 */
public class DelegationLeadsActivity extends AppCompatActivity implements View.OnClickListener{

    EasyDialog mEasyDialogYearSelection;
    View mViewAddAccountDialogView;
    Typeface mfontLightTypeFace,mfontRegularTypeFace,mfontSemiBoldTypeFace;
    ImageView mImdelLeads_running;

    TextView mTvDelegation,mTvDelegationPersonname;
    TextView mDelegationLeads,mDegelationTasks;
    EditText mDelegationLeadsSearch;

    TextView txtYear,txtYearNumberic;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.delegation_leads);

        mTvDelegation= (TextView) findViewById(R.id.txt_delegation_lead_heading);
        mTvDelegationPersonname= (TextView) findViewById(R.id.txt_delegation_heading_name);
        mDegelationTasks= (TextView) findViewById(R.id.txt_delegationleads_task);
        mDelegationLeads= (TextView) findViewById(R.id.txt_delegationleads_leads);
        mDelegationLeadsSearch= (EditText) findViewById(R.id.edit_tasksearch);
        txtYearNumberic= (TextView) findViewById(R.id.textYearSelection_numeric);
        mImdelLeads_running= (ImageView) findViewById(R.id.image_running);
        mImdelLeads_running.setOnClickListener(this);

        //mIconAccountDropDown=findViewById(R.id.)

        txtYear= (TextView) findViewById(R.id.textYearSelection);
        txtYear.setOnClickListener(this);


        Window window = DelegationLeadsActivity.this.getWindow();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(DelegationLeadsActivity.this.getResources().getColor(R.color.taskbackgrounddark));
        }

       mfontLightTypeFace = Typeface.createFromAsset(getAssets(), "fonts/OpenSans-Light.ttf");
        mfontSemiBoldTypeFace=Typeface.createFromAsset(getAssets(),"fonts/OpenSans-Semibold.ttf");
        mfontRegularTypeFace=Typeface.createFromAsset(getAssets(),"fonts/OpenSans-Regular.ttf");


        mTvDelegation.setTypeface(mfontRegularTypeFace);
        mTvDelegationPersonname.setTypeface(mfontRegularTypeFace);
        mDegelationTasks.setTypeface(mfontRegularTypeFace);
        mDelegationLeads.setTypeface(mfontRegularTypeFace);
        mDelegationLeadsSearch.setTypeface(mfontRegularTypeFace);
        txtYearNumberic.setTypeface(mfontSemiBoldTypeFace);

        mViewAddAccountDialogView = getLayoutInflater().inflate(R.layout.custom_year_sort, null);






    }




    public void toolPitsAddAccount(){
//        AlertDialog.Builder alertDialog = new AlertDialog.Builder(AddLead.this);
////        alertDialog.setMessage("add + account");
////        alertDialog.setView(R.layout.accnt_alerdialog);
//
//        AlertDialog dialog_card = alertDialog.create();
//        dialog_card.getWindow().setGravity(Gravity.RIGHT);
//
//        dialog_card.show();
//
//        alertDialog.show();
        if(mEasyDialogYearSelection == null){
            mEasyDialogYearSelection = new EasyDialog(this)
                    .setLayout(mViewAddAccountDialogView)
//                            .setBackgroundColor(getResources().getColor(R.color.lead_color_primary))
                    .setBackgroundColor(ContextCompat.getColor(this,R.color.white))
                    .setLocationByAttachedView(txtYear)
                    .setGravity(EasyDialog.GRAVITY_BOTTOM)
                    .setAnimationAlphaShow(300, 0.0f, 1.0f)
                    .setAnimationAlphaDismiss(300, 1.0f, 0.0f)
                    .setTouchOutsideDismiss(true)
                    .setMatchParent(false)
            ;
        }
        mEasyDialogYearSelection.show();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.textYearSelection:
                toolPitsAddAccount();
                break;
            case R.id.image_running:
                Intent intent=new Intent(getApplicationContext(),DelegationTasksActivity.class);
                startActivity(intent);
        }
    }
}
