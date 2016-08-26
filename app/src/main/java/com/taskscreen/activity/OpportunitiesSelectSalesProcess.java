
package com.taskscreen.activity;

import android.graphics.Typeface;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.taskscreen.R;

public class OpportunitiesSelectSalesProcess extends AppCompatActivity {
    Typeface mfontRegularTypeFace,mfontLightTypeFace,mfontSemiBoldTypeFace;
    TextView mTVSelectSalesPro,mTVSelectSaleshu,mTVSelectSalesNew,mTVSelectSalesRegister,mTVSelectSalesBySalesbox,
    mTVSelectSalesTest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.opportunities_select_sales_process);

        Window window = OpportunitiesSelectSalesProcess.this.getWindow();
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(OpportunitiesSelectSalesProcess.this.getResources().getColor(R.color.colorPrimaryDark));
        }

        mfontRegularTypeFace= Typeface.createFromAsset(getAssets(),"fonts/OpenSans-Regular.ttf");

        mfontLightTypeFace = Typeface.createFromAsset(getAssets(), "fonts/OpenSans-Light.ttf");
        mfontSemiBoldTypeFace=Typeface.createFromAsset(getAssets(),"fonts/OpenSans-Semibold.ttf");

        mTVSelectSalesPro= (TextView) findViewById(R.id.txt_opp_selectsalesprocess_heading);
        mTVSelectSalesPro.setTypeface(mfontSemiBoldTypeFace);
        mTVSelectSaleshu= (TextView) findViewById(R.id.txt_opp_selectsalesprocess_name);
        mTVSelectSaleshu.setTypeface(mfontRegularTypeFace);
        mTVSelectSalesNew= (TextView) findViewById(R.id.txt_opp_selectsalesprocess_newprocess);
        mTVSelectSalesNew.setTypeface(mfontRegularTypeFace);
        mTVSelectSalesRegister= (TextView) findViewById(R.id.txt_opp_selectsalesprocess_register);
        mTVSelectSalesRegister.setTypeface(mfontRegularTypeFace);
        mTVSelectSalesBySalesbox= (TextView) findViewById(R.id.txt_opp_selectsalesprocess_bysalesbox);
        mTVSelectSalesBySalesbox.setTypeface(mfontRegularTypeFace);
        mTVSelectSalesTest= (TextView) findViewById(R.id.txt_opp_selectsalesprocess_test);
        mTVSelectSalesTest.setTypeface(mfontRegularTypeFace);
    }
}
