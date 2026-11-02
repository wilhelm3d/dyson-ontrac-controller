package com.dyson.mobile.android.resources.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.NumberPicker;
import android.widget.TimePicker;
import com.dyson.mobile.android.logging.Logger;
import java.util.ArrayList;
import java.util.Locale;
/* loaded from: classes3.dex */
public class DysonTimePickerWithInterval extends TimePicker {
    public Locale d;

    public DysonTimePickerWithInterval(Context context) {
        super(context);
        this.d = Locale.getDefault();
        setDescendantFocusability(393216);
        b();
    }

    public static void a(NumberPicker numberPicker, int i13, int i14, Locale locale) {
        numberPicker.setMinValue(0);
        numberPicker.setMaxValue((i13 / i14) - 1);
        ArrayList arrayList = new ArrayList();
        int i15 = 0;
        while (i15 < i13) {
            arrayList.add(String.format(locale, "%02d", Integer.valueOf(i15)));
            i15 += i14;
        }
        numberPicker.setDisplayedValues((String[]) arrayList.toArray(new String[0]));
    }

    public final void b() {
        NumberPicker numberPicker = (NumberPicker) findViewById(getResources().getIdentifier("android:id/minute", null, null));
        if (numberPicker != null) {
            a(numberPicker, 60, 5, this.d);
        } else {
            Logger.e("Failed to get the Minute number picker - the default formatting and locale will be used", null);
        }
        NumberPicker numberPicker2 = (NumberPicker) findViewById(getResources().getIdentifier("android:id/hour", null, null));
        if (numberPicker2 != null) {
            a(numberPicker2, 24, 1, this.d);
        } else {
            Logger.e("Failed to get the Hour number picker - the default formatting and locale will be used", null);
        }
    }

    @Override // android.widget.TimePicker
    public int getMinute() {
        return super.getMinute() * 5;
    }

    public void setLocale(Locale locale) {
        this.d = locale;
        b();
    }

    public DysonTimePickerWithInterval(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = Locale.getDefault();
        setDescendantFocusability(393216);
        b();
    }

    public DysonTimePickerWithInterval(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.d = Locale.getDefault();
        setDescendantFocusability(393216);
        b();
    }
}
