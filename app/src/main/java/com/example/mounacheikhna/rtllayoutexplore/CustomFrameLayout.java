package com.example.mounacheikhna.rtllayoutexplore;

import android.content.Context;
import android.graphics.Rect;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

/**
 * Created by mounacheikhna on 09/02/2018.
 */

public class CustomFrameLayout extends FrameLayout {

    private Rect mBounds;

    public CustomFrameLayout(@NonNull final Context context) {
        this(context, null);
    }

    public CustomFrameLayout(
            @NonNull final Context context,
            @Nullable final AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public CustomFrameLayout(
            @NonNull final Context context,
            @Nullable final AttributeSet attrs,
            final int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setBounds(Rect bounds) {
        mBounds = bounds;
    }

    public void show(final MainView mainView) {
        RelativeLayout.LayoutParams margins = getMargins(mainView);
        setLayoutParams(margins);

        setVisibility(VISIBLE);
    }

    @NonNull
    RelativeLayout.LayoutParams getMargins(final MainView mainView) {
        RelativeLayout.LayoutParams margins = new RelativeLayout.LayoutParams(
                mBounds.width(), mBounds.height());

       int leftOffset = 10;
       int rightOffset = 10;
       int topOffset = 10;

        if (ViewCompat.getLayoutDirection(mainView) == ViewCompat.LAYOUT_DIRECTION_RTL) {
            margins.setMargins(
                    0,
                    topOffset,
                    mainView.getWidth() - rightOffset,
                    0);
        } else {
            margins.setMargins(leftOffset, topOffset, 0, 0);
        }


        return margins;
    }

}
