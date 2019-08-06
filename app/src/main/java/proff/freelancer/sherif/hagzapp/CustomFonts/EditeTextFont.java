package proff.freelancer.sherif.hagzapp.CustomFonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

public class EditeTextFont extends android.support.v7.widget.AppCompatEditText{

    public EditeTextFont(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public EditeTextFont(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public EditeTextFont(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/bukra_light.ttf");
            setTypeface(tf);
        }
    }
}
