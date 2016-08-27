package com.taskscreen.activity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.taskscreen.R;

/**
 * Created by vanip_000 on 27-08-2016.
 */
public class OpportunitiesDetailsCardItems extends AppCompatActivity
{

    Typeface mfontRegularTypeFace,mfontLightTypeFace,mfontSemiBoldTypeFace;
    TextView mTVDetailDate,mTVDetailNumber,mTVDetailname,mTVDetailClosedSales,mTVDetailClosedProfit,mTVDetailClosedSalesValue,
            mTVDetailClosedProfitValue,mTVDetailTaskValue,mTVDetailContactValue,mTVDetailCalenderValue;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.opportunities_details_carditems);

        mfontRegularTypeFace= Typeface.createFromAsset(getAssets(),"fonts/OpenSans-Regular.ttf");

        mfontLightTypeFace = Typeface.createFromAsset(getAssets(), "fonts/OpenSans-Light.ttf");
        mfontSemiBoldTypeFace=Typeface.createFromAsset(getAssets(),"fonts/OpenSans-Semibold.ttf");

        mTVDetailDate= (TextView) findViewById(R.id.txt_opp_detailsdate);
        mTVDetailDate.setTypeface(mfontRegularTypeFace);
        mTVDetailNumber= (TextView) findViewById(R.id.txt_opp_detailsnumber);
        mTVDetailNumber.setTypeface(mfontSemiBoldTypeFace);
        mTVDetailname= (TextView) findViewById(R.id.txt_opp_detailname);
        mTVDetailname.setTypeface(mfontRegularTypeFace);
        mTVDetailClosedSales= (TextView) findViewById(R.id.txt_oppdetails_closedsales);
        mTVDetailClosedSales.setTypeface(mfontSemiBoldTypeFace);
        mTVDetailClosedProfit= (TextView) findViewById(R.id.txt_oppdetails_closedprofit);
        mTVDetailClosedProfit.setTypeface(mfontSemiBoldTypeFace);
        mTVDetailClosedSalesValue= (TextView) findViewById(R.id.txt_opp_details_closedsalesvalue);
        mTVDetailClosedSalesValue.setTypeface(mfontRegularTypeFace);
        mTVDetailClosedProfitValue= (TextView) findViewById(R.id.txt_opp_details_closedprofitvalue);
       mTVDetailClosedProfitValue.setTypeface(mfontRegularTypeFace);
        mTVDetailTaskValue= (TextView) findViewById(R.id.txt_opp_details_taskvalue);
        mTVDetailTaskValue.setTypeface(mfontRegularTypeFace);
        mTVDetailContactValue= (TextView) findViewById(R.id.txt_opp_details_contactvalue);
        mTVDetailContactValue.setTypeface(mfontRegularTypeFace);

        mTVDetailCalenderValue= (TextView) findViewById(R.id.txt_opp_details_calendervalue);
        mTVDetailCalenderValue.setTypeface(mfontRegularTypeFace);










    }
}
