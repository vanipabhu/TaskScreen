package com.taskscreen.activity.Utilities;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;


public class TextViewSemiBold extends TextView {

    public TextViewSemiBold(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public TextViewSemiBold(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public TextViewSemiBold(Context context) {
        super(context);
        init();
    }

    public void init() {

        Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/OpenSans-Semibold.ttf");
        setTypeface(tf);
        // setTextColor(Color.WHITE); {
    }
}
