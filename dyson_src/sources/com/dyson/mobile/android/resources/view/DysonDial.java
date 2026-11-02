package com.dyson.mobile.android.resources.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.resources.view.a;
import java.util.Arrays;
import java.util.Map;
import ks0.n;
/* loaded from: classes3.dex */
public class DysonDial extends RelativeLayout {
    public DysonSeekArc d;
    public View e;

    /* renamed from: f  reason: collision with root package name */
    public View f15709f;

    /* renamed from: g  reason: collision with root package name */
    public TextView f15710g;

    /* renamed from: h  reason: collision with root package name */
    public AppCompatImageView f15711h;

    public DysonDial(Context context) {
        super(context, null, 0);
        a(context, null, 0);
    }

    public final void a(Context context, AttributeSet attributeSet, int i13) {
        View inflate = ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(R.layout.dial, (ViewGroup) this, true);
        this.e = inflate.findViewById(R.id.dial_less);
        this.f15709f = inflate.findViewById(R.id.dial_more);
        DysonSeekArc dysonSeekArc = (DysonSeekArc) inflate.findViewById(16908300);
        this.d = dysonSeekArc;
        dysonSeekArc.init(attributeSet, i13);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, n.f50084j, i13, 0);
            ViewStub viewStub = (ViewStub) findViewById(16908308);
            viewStub.setLayoutResource(obtainStyledAttributes.getResourceId(2, R.layout.dial_text));
            this.f15711h = (AppCompatImageView) viewStub.inflate().findViewById(16908312);
            setDialFineTuning(obtainStyledAttributes.getBoolean(0, getDialFineTuning()));
            obtainStyledAttributes.recycle();
        }
        this.f15710g = (TextView) findViewById(16908308);
    }

    public boolean getDialFineTuning() {
        return (this.e.getVisibility() == 0) && (this.f15709f.getVisibility() == 0);
    }

    public SparseArray<CharSequence> getDialOptions() {
        return this.d.mOptions.clone();
    }

    public int getDialPosition() {
        return this.d.getProgress();
    }

    public CharSequence getDialText() {
        return this.f15710g.getText();
    }

    public int getDialValue() {
        return this.d.mOptions.keyAt(getDialPosition());
    }

    public void setArcMark(Integer num) {
        if (num == null) {
            this.d.arcMark.m(null);
        } else if (num.intValue() < 0 || num.intValue() > this.d.getMax()) {
        } else {
            this.d.arcMark.m(new a.e(this.d, num.intValue(), this.d.mOptions.valueAt(num.intValue())));
        }
    }

    public void setDialFineTuning(boolean z13) {
        int i13 = z13 ? 0 : 8;
        this.e.setVisibility(i13);
        this.f15709f.setVisibility(i13);
    }

    public void setDialGraduationsShown(boolean z13) {
        this.d.hasGraduations.m(z13);
    }

    public void setDialOptions(Map<Integer, CharSequence> map) {
        SparseArray<CharSequence> sparseArray = new SparseArray<>();
        for (Map.Entry<Integer, CharSequence> entry : map.entrySet()) {
            sparseArray.put(entry.getKey().intValue(), entry.getValue());
        }
        setDialOptions(sparseArray);
    }

    public void setDialPosition(float f13) {
        this.d.setProgress(Math.round(f13));
        this.d.setProgressSweep((f13 / this.d.getMax()) * this.d.getSweepAngle());
    }

    public void setDialText(CharSequence charSequence) {
        this.f15710g.setText(charSequence);
    }

    public void setLayoutResource(int i13) {
        AppCompatImageView appCompatImageView = this.f15711h;
        if (appCompatImageView != null) {
            appCompatImageView.setImageResource(i13);
        }
    }

    public DysonDial(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a(context, attributeSet, 0);
    }

    public DysonDial(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        a(context, attributeSet, i13);
    }

    public void setDialPosition(int i13) {
        this.d.setProgress(i13);
    }

    public void setDialOptions(SparseArray<CharSequence> sparseArray) {
        this.d.mOptions = sparseArray.clone();
        this.d.setMax(sparseArray.size() - 1);
    }

    public void setDialOptions(Iterable<CharSequence> iterable) {
        SparseArray<CharSequence> sparseArray = new SparseArray<>();
        int i13 = 0;
        for (CharSequence charSequence : iterable) {
            sparseArray.put(i13, charSequence);
            i13++;
        }
        setDialOptions(sparseArray);
    }

    public void setDialOptions(CharSequence[] charSequenceArr) {
        setDialOptions(Arrays.asList(charSequenceArr));
    }
}
