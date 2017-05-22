package net.ranjbar.persiantextview;

import android.content.Context;
import android.graphics.Typeface;

/**
 * Created by hadi dynamic on 13/08/15.
 */

public class FontHelper {
    private static FontHelper instance;
    private static Typeface persianTypeface;

    private FontHelper(Context context) {
        persianTypeface = Typeface.createFromAsset(context.getAssets(), "font.ttf");
    }

    public static synchronized FontHelper getInstance(Context context) {
        if (instance == null)
            instance = new FontHelper(context);
        return instance;
    }


    public static void restGetInstance(Context context) {
       instance = new FontHelper(context);
    }

    public Typeface getPersianTextTypeface() {
        return persianTypeface;
    }

}