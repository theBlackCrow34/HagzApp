package proff.freelancer.sherif.hagzapp.CustomFonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

public class TextViewFont extends android.support.v7.widget.AppCompatTextView{

    public TextViewFont(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public TextViewFont(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public TextViewFont(Context context) {
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
