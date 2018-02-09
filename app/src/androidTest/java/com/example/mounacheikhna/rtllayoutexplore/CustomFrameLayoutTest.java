package com.example.mounacheikhna.rtllayoutexplore;

import android.content.Context;
import android.graphics.Rect;
import android.support.test.InstrumentationRegistry;
import android.view.View;
import android.widget.RelativeLayout;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by mounacheikhna on 09/02/2018.
 */
public class CustomFrameLayoutTest {

    private CustomFrameLayout customFrameLayout;
    private MainView mainView;

    @Before
    public void setUp() throws Exception {
        final Context context = InstrumentationRegistry.getTargetContext();
        customFrameLayout = new CustomFrameLayout(context);
        mainView = new MainView(context);
        customFrameLayout.setBounds(new Rect(10, 10, 10, 10));
    }

    @Test
    public void testLtr() throws Exception {
        mainView.setLayoutDirection(View.LAYOUT_DIRECTION_LTR);
        customFrameLayout.show(mainView);
        assertEquals(View.VISIBLE, mainView.getVisibility());
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) customFrameLayout.getLayoutParams();

        assertEquals(10, layoutParams.leftMargin);
        assertEquals(10, layoutParams.topMargin);
        assertEquals(0, layoutParams.rightMargin);
        assertEquals(0, layoutParams.bottomMargin);
    }



}