package com.test.conductor.conductortest.views;


import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;

public class TestAttachView extends FrameLayout {

    private static final String TAG = "TestAttachView";

    public TestAttachView(Context context) {
        super(context);
        init();
    }

    public TestAttachView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public TestAttachView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    public TestAttachView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init();
    }

    private void init() {
        addOnAttachStateChangeListener(new OnAttachStateChangeListener() {
            @Override
            public void onViewAttachedToWindow(View v) {
                Log.d(TAG, "onViewAttachedToWindow");
            }

            @Override
            public void onViewDetachedFromWindow(View v) {
                Log.d(TAG, "onViewDetachedFromWindow");
            }
        });
    }
}
