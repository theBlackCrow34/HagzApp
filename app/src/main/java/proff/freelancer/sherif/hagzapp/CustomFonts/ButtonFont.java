package proff.freelancer.sherif.hagzapp.CustomFonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

public class ButtonFont extends android.support.v7.widget.AppCompatButton {
    public ButtonFont(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public ButtonFont(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public ButtonFont(Context context) {
        super(context);
        init();
    }

    private void init() {
        if (!isInEditMode()) {
            Typeface tf = Typeface.createFromAsset(getContext().getAssets(), "fonts/kayar.ttf");
            setTypeface(tf);
        }
    }
}
