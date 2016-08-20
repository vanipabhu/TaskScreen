package com.taskscreen.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;


public class OpenSansRegularEditText extends EditText {

    public OpenSansRegularEditText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public OpenSansRegularEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public OpenSansRegularEditText(Context context) {
        super(context);
        init();
    }

    public void init() {

        Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/OpenSans-Regular.ttf");
        setTypeface(tf);
        // setTextColor(Color.WHITE); {
    }
}
