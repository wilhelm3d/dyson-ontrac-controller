package com.dyson.mobile.android.resources.view.viewpager;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.viewpager.widget.ViewPager;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.resources.view.DysonTextView;
import java.util.Locale;
import ks0.n;
import ob.a;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import pa.c;
/* loaded from: classes3.dex */
public class NumericPagerIndicator extends RelativeLayout implements ViewPager.j {
    public final DysonTextView d;
    public Locale e;

    /* renamed from: f  reason: collision with root package name */
    public ViewPager f15876f;

    /* renamed from: g  reason: collision with root package name */
    public String f15877g;

    public NumericPagerIndicator(Context context) {
        super(context);
        this.e = Locale.getDefault();
        this.d = new DysonTextView(context);
        d(context, null);
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void a(float f13, int i13, int i14) {
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void b(int i13) {
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void c(int i13) {
        e(i13);
    }

    public final void d(Context context, AttributeSet attributeSet) {
        View view = this.d;
        view.setId(R.id.indicator_page_label);
        addView(view);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams.addRule(13);
        setLayoutParams(layoutParams);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, n.A);
            this.f15877g = obtainStyledAttributes.getString(0);
            obtainStyledAttributes.recycle();
        }
        if (TextUtils.isEmpty(this.f15877g)) {
            this.f15877g = MqttTopic.TOPIC_LEVEL_SEPARATOR;
        }
    }

    public final void e(int i13) {
        int i14 = i13 + 1;
        a adapter = this.f15876f.getAdapter();
        if (adapter == null) {
            c.w("The ViewPager PagerAdapter is null");
            return;
        }
        this.d.setText(String.format(this.e, "%d %s %d", Integer.valueOf(i14), this.f15877g, Integer.valueOf(adapter.getCount())));
    }

    public void setDividerText(String str) {
        this.f15877g = str;
        ViewPager viewPager = this.f15876f;
        if (viewPager != null) {
            e(viewPager.getCurrentItem());
        }
    }

    public void setLocale(Locale locale) {
        this.e = locale;
        ViewPager viewPager = this.f15876f;
        if (viewPager != null) {
            e(viewPager.getCurrentItem());
        }
    }

    public void setViewPager(ViewPager viewPager) {
        this.f15876f = viewPager;
        viewPager.b(this);
        e(this.f15876f.getCurrentItem());
    }

    public NumericPagerIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = Locale.getDefault();
        this.d = new DysonTextView(context, attributeSet);
        d(context, attributeSet);
    }

    public NumericPagerIndicator(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        this.e = Locale.getDefault();
        this.d = new DysonTextView(context, attributeSet, i13);
        d(context, attributeSet);
    }

    public NumericPagerIndicator(Context context, AttributeSet attributeSet, int i13, int i14) {
        super(context, attributeSet, i13, i14);
        this.e = Locale.getDefault();
        this.d = new DysonTextView(context, attributeSet, i13);
        d(context, attributeSet);
    }
}
