package com.taskscreen.utils;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;


public class OpenSansLightEditText extends EditText {

    public OpenSansLightEditText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public OpenSansLightEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public OpenSansLightEditText(Context context) {
        super(context);
        init();
    }

    public void init() {

        Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/OpenSans-Light.ttf");
        setTypeface(tf);
        // setTextColor(Color.WHITE); {
    }
}
