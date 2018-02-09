package com.example.mounacheikhna.rtllayoutexplore;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/**
 * Created by mounacheikhna on 08/02/2018.
 */
// not sure if this enough or if there's a need for a keyboard service to get a window
// that matches the keyboard
public class MainView extends LinearLayout {

    private RelativeLayout mPopupFrame;

    public MainView(@NonNull final Context context) {
        this(context, null);
    }

    public MainView(
            @NonNull final Context context,
            @Nullable final AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MainView(
            @NonNull final Context context,
            @Nullable final AttributeSet attrs,
            final int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        LayoutInflater.from(context).inflate(R.layout.main_view, null, false);

        /*mPopupFrame = new RelativeLayout(context);
        findViewById(R.id.show_popup).setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(final View v) {

            }
        });
        */
    }


}
