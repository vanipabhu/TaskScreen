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
 * Created by vanip_000 on 24-08-2016.
 */
public class EditOpportunities extends AppCompatActivity {
    TextView mTVEditOppCancel,mTVEditOpp,mTVEditOppSave,mTVEditOppContacts,mTVEditOppContactsname,mTVEditOppOppTeam,mTVEditOppOppTeamName,
            mTVEditOppDescription,mTVEditOppDescriptionname,mTVEditOppDescriptionnum,mTVEditOppProGroup,mTVEditOppProGroupname,
            mTVEditOppContract,mTVEditOppContractdate;
    Typeface mfontRegularTypeFace,mfontSemiBoldTypeFace,mfontLightTypeFace;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_opportunities);

        Window window = EditOpportunities.this.getWindow();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(EditOpportunities.this.getResources().getColor(R.color.peach_opportunities));
        }

        mfontRegularTypeFace= Typeface.createFromAsset(getAssets(),"fonts/OpenSans-Regular.ttf");

        mfontLightTypeFace = Typeface.createFromAsset(getAssets(), "fonts/OpenSans-Light.ttf");
        mfontSemiBoldTypeFace=Typeface.createFromAsset(getAssets(),"fonts/OpenSans-Semibold.ttf");






        mTVEditOppCancel= (TextView) findViewById(R.id.txt_editopp_cancel);
        mTVEditOppCancel.setTypeface(mfontRegularTypeFace);
        mTVEditOpp= (TextView) findViewById(R.id.txt_editopp);
        mTVEditOpp.setTypeface(mfontSemiBoldTypeFace);
        mTVEditOppSave= (TextView) findViewById(R.id.txt_editopp_done);
        mTVEditOppSave.setTypeface(mfontRegularTypeFace);
        mTVEditOppSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),OpportunitiesAddProductGroup.class);
                startActivity(intent);

            }
        });
        mTVEditOppContacts= (TextView) findViewById(R.id.txt_editopp_contacts_header);
        mTVEditOppContacts.setTypeface(mfontRegularTypeFace);
        mTVEditOppContactsname= (TextView) findViewById(R.id.txt_editopp_contactsname);
        mTVEditOppContactsname.setTypeface(mfontRegularTypeFace);
        mTVEditOppOppTeam= (TextView) findViewById(R.id.txt_editopp_oppteam_header);
        mTVEditOppOppTeam.setTypeface(mfontRegularTypeFace);
        mTVEditOppOppTeamName= (TextView) findViewById(R.id.txt_editopp_oppteam_name);
        mTVEditOppOppTeamName.setTypeface(mfontRegularTypeFace);
        mTVEditOppDescription=(TextView) findViewById(R.id.txt_editopp_description_header);
        mTVEditOppDescription.setTypeface(mfontRegularTypeFace);
        mTVEditOppDescriptionname=(TextView) findViewById(R.id.txt_editopp_description_name);
        mTVEditOppDescriptionname.setTypeface(mfontRegularTypeFace);
        mTVEditOppDescriptionnum=(TextView) findViewById(R.id.txt_editopp_description_number);
        mTVEditOppDescriptionnum.setTypeface(mfontRegularTypeFace);
        mTVEditOppProGroup=(TextView) findViewById(R.id.txt_editopp_prodgroup_heading);
        mTVEditOppProGroup.setTypeface(mfontRegularTypeFace);
        mTVEditOppProGroupname=(TextView) findViewById(R.id.txt_editopp_prodgroup_name);
        mTVEditOppProGroupname.setTypeface(mfontRegularTypeFace);
        mTVEditOppContract=(TextView) findViewById(R.id.txt_editopp_contractdate);
        mTVEditOppContract.setTypeface(mfontRegularTypeFace);
        mTVEditOppContractdate=(TextView) findViewById(R.id.txt_editopp_datetime);
        mTVEditOppContractdate.setTypeface(mfontRegularTypeFace);






    }
}
