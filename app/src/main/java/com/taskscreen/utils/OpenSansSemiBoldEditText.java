package com.taskscreen.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;


public class OpenSansSemiBoldEditText extends EditText {

    public OpenSansSemiBoldEditText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public OpenSansSemiBoldEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public OpenSansSemiBoldEditText(Context context) {
        super(context);
        init();
    }

    public void init() {

        Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/OpenSans-Semibold.ttf");
        setTypeface(tf);
        // setTextColor(Color.WHITE); {
    }
}
