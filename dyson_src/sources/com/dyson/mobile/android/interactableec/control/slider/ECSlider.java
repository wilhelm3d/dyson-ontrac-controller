package com.dyson.mobile.android.interactableec.control.slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import com.brightcove.player.captioning.TTMLParser;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.logging.Logger;
import com.dyson.mobile.android.resources.view.DysonVerticalSeekbar;
import d22.k;
import i12.c0;
import i12.q;
import i12.s;
import i12.t;
import i12.y;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import k30.o;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0003IJKB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u000eR*\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R*\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R.\u0010$\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0011\u001a\u0004\u0018\u00010\u001d8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R*\u0010*\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010\u000eR*\u0010.\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010\u0013\u001a\u0004\b,\u0010\u0015\"\u0004\b-\u0010\u0017RF\u00108\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u000200\u0018\u00010/2\u0014\u00101\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u000200\u0018\u00010/8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R.\u0010@\u001a\u0004\u0018\u0001092\b\u0010\u0011\u001a\u0004\u0018\u0001098\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R.\u0010H\u001a\u0004\u0018\u00010A2\b\u0010\u0011\u001a\u0004\u0018\u00010A8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010G¨\u0006L"}, d2 = {"Lcom/dyson/mobile/android/interactableec/control/slider/ECSlider;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "activated", "Lh12/f0;", "setActivated", "(Z)V", "enabled", "setEnabled", "value", "j", "I", "getIcon", "()I", "setIcon", "(I)V", "icon", "k", "getProgressDrawable", "setProgressDrawable", "progressDrawable", "", "l", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "setLabel", "(Ljava/lang/String;)V", AnnotatedPrivateKey.LABEL, "m", "Z", "getShowError", "()Z", "setShowError", "showError", "n", "getRange", "setRange", "range", "Lkotlin/Function1;", "", "newFormat", "o", "Lkotlin/jvm/functions/Function1;", "getSliderFormat", "()Lkotlin/jvm/functions/Function1;", "setSliderFormat", "(Lkotlin/jvm/functions/Function1;)V", "sliderFormat", "Lcom/dyson/mobile/android/interactableec/control/slider/ECSlider$d;", TTMLParser.Tags.CAPTION, "Lcom/dyson/mobile/android/interactableec/control/slider/ECSlider$d;", "getSliderListener", "()Lcom/dyson/mobile/android/interactableec/control/slider/ECSlider$d;", "setSliderListener", "(Lcom/dyson/mobile/android/interactableec/control/slider/ECSlider$d;)V", "sliderListener", "Lcom/dyson/mobile/android/interactableec/control/slider/ECSlider$c;", "q", "Lcom/dyson/mobile/android/interactableec/control/slider/ECSlider$c;", "getDragListener", "()Lcom/dyson/mobile/android/interactableec/control/slider/ECSlider$c;", "setDragListener", "(Lcom/dyson/mobile/android/interactableec/control/slider/ECSlider$c;)V", "dragListener", "b", "d", "c", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ECSlider extends FrameLayout {

    /* renamed from: r  reason: collision with root package name */
    public static final /* synthetic */ int f14411r = 0;
    public final ObjectAnimator d;
    public final DysonVerticalSeekbar e;

    /* renamed from: f  reason: collision with root package name */
    public final ImageView f14412f;

    /* renamed from: g  reason: collision with root package name */
    public final TextView f14413g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f14414h;

    /* renamed from: i  reason: collision with root package name */
    public final ImageView f14415i;

    /* renamed from: j  reason: collision with root package name */
    public int f14416j;

    /* renamed from: k  reason: collision with root package name */
    public int f14417k;

    /* renamed from: l  reason: collision with root package name */
    public String f14418l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f14419m;

    /* renamed from: n  reason: collision with root package name */
    public int f14420n;

    /* renamed from: o  reason: collision with root package name */
    public Function1<? super Integer, ? extends CharSequence> f14421o;

    /* renamed from: p  reason: collision with root package name */
    public d f14422p;

    /* renamed from: q  reason: collision with root package name */
    public c f14423q;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/interactableec/control/slider/ECSlider$a", "Landroid/widget/SeekBar$OnSeekBarChangeListener;", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements SeekBar.OnSeekBarChangeListener {
        public a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i13, boolean z13) {
            ECSlider eCSlider = ECSlider.this;
            TextView textView = eCSlider.f14413g;
            Function1<Integer, CharSequence> sliderFormat = eCSlider.getSliderFormat();
            textView.setText(sliderFormat != null ? sliderFormat.invoke(Integer.valueOf(i13)) : null);
            eCSlider.setActivated(i13 > 0);
            d sliderListener = eCSlider.getSliderListener();
            if (sliderListener != null) {
                sliderListener.a(eCSlider, i13, z13);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
            c dragListener = ECSlider.this.getDragListener();
            if (dragListener != null) {
                ((ra0.d) dragListener).a(0);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
            c dragListener = ECSlider.this.getDragListener();
            if (dragListener != null) {
                ((ra0.d) dragListener).a(1);
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface c {
    }

    /* loaded from: classes2.dex */
    public interface d {
        void a(ECSlider eCSlider, int i13, boolean z13);
    }

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"com/dyson/mobile/android/interactableec/control/slider/ECSlider$e", "Landroid/util/Property;", "Landroid/view/View;", "", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class e extends Property<View, Integer> {
        public e(Class<Integer> cls) {
            super(cls, "height");
        }

        @Override // android.util.Property
        public final Integer get(View view) {
            View view2 = view;
            view2.getClass();
            return Integer.valueOf(view2.getHeight());
        }

        @Override // android.util.Property
        public final void set(View view, Integer num) {
            View view2 = view;
            Integer num2 = num;
            view2.getClass();
            if (num2 != null) {
                view2.getLayoutParams().height = num2.intValue();
                view2.requestLayout();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/interactableec/control/slider/ECSlider$f", "Landroid/animation/AnimatorListenerAdapter;", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class f extends AnimatorListenerAdapter {
        public final Drawable d;
        public final List<View> e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ ObjectAnimator f14425f;

        public f(ECSlider eCSlider, ObjectAnimator objectAnimator) {
            this.f14425f = objectAnimator;
            this.d = eCSlider.e.getProgressDrawable();
            this.e = t.h(eCSlider.f14412f, eCSlider.f14413g, eCSlider.f14414h);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            animator.getClass();
            if (this.f14425f.getAnimatedFraction() < 0.01f) {
                for (View view : this.e) {
                    view.setVisibility(0);
                }
                Drawable drawable = this.d;
                int[] state = drawable.getState();
                state.getClass();
                List c13 = s.c(16843625);
                LinkedHashSet d03 = q.d0(state);
                d03.removeAll(y.u(c13));
                drawable.setState(c0.z0(d03));
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            animator.getClass();
            if (this.f14425f.getAnimatedFraction() < 0.01f) {
                for (View view : this.e) {
                    view.setVisibility(4);
                }
                Drawable drawable = this.d;
                int[] state = drawable.getState();
                state.getClass();
                int length = state.length;
                int[] copyOf = Arrays.copyOf(state, length + 1);
                copyOf[length] = 16843625;
                drawable.setState(copyOf);
            }
        }
    }

    static {
        new b(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ECSlider(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        context.getClass();
        ObjectAnimator objectAnimator = new ObjectAnimator();
        this.d = objectAnimator;
        this.f14420n = 100;
        this.f14421o = new o(1);
        LayoutInflater.from(context).inflate(R.layout.layout_ec_slider, this);
        View findViewById = findViewById(R.id.slider);
        findViewById.getClass();
        DysonVerticalSeekbar dysonVerticalSeekbar = (DysonVerticalSeekbar) findViewById;
        this.e = dysonVerticalSeekbar;
        View findViewById2 = findViewById(R.id.slider_icon);
        findViewById2.getClass();
        this.f14412f = (ImageView) findViewById2;
        View findViewById3 = findViewById(R.id.slider_text);
        findViewById3.getClass();
        TextView textView = (TextView) findViewById3;
        this.f14413g = textView;
        View findViewById4 = findViewById(R.id.slider_label);
        findViewById4.getClass();
        this.f14414h = (TextView) findViewById4;
        View findViewById5 = findViewById(R.id.warning_icon);
        findViewById5.getClass();
        this.f14415i = (ImageView) findViewById5;
        dysonVerticalSeekbar.setOnSeekBarChangeListener(new a());
        dysonVerticalSeekbar.setCurrentProgress(0);
        Function1<? super Integer, ? extends CharSequence> function1 = this.f14421o;
        textView.setText(function1 != null ? function1.invoke(0) : null);
        a(objectAnimator);
    }

    public final void a(ObjectAnimator objectAnimator) {
        objectAnimator.setDuration(getResources().getInteger(R.integer.duration_0200));
        objectAnimator.setAutoCancel(true);
        DysonVerticalSeekbar dysonVerticalSeekbar = this.e;
        objectAnimator.setTarget(dysonVerticalSeekbar);
        int i13 = dysonVerticalSeekbar.getLayoutParams().height;
        k kVar = new k(i13, i13 * 2);
        objectAnimator.setIntValues(kVar.d, kVar.e);
        objectAnimator.setProperty(new e(Integer.TYPE));
        objectAnimator.addListener(new f(this, objectAnimator));
    }

    public final c getDragListener() {
        return this.f14423q;
    }

    public final int getIcon() {
        return this.f14416j;
    }

    public final String getLabel() {
        return this.f14418l;
    }

    public final int getProgressDrawable() {
        return this.f14417k;
    }

    public final int getRange() {
        return this.f14420n;
    }

    public final boolean getShowError() {
        return this.f14419m;
    }

    public final Function1<Integer, CharSequence> getSliderFormat() {
        return this.f14421o;
    }

    public final d getSliderListener() {
        return this.f14422p;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Integer valueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        ObjectAnimator objectAnimator = this.d;
        if (valueOf != null && valueOf.intValue() == 0) {
            Rect rect = new Rect();
            this.e.getGlobalVisibleRect(rect);
            if (rect.contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                boolean isEnabled = isEnabled();
                boolean z13 = this.f14419m;
                if (!isEnabled || z13) {
                    return true;
                }
                objectAnimator.start();
            }
        } else if ((valueOf != null && valueOf.intValue() == 1) || (valueOf != null && valueOf.intValue() == 3)) {
            objectAnimator.reverse();
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null || motionEvent.getAction() != 1) {
            return super.onTouchEvent(motionEvent);
        }
        performClick();
        return true;
    }

    @Override // android.view.View
    public void setActivated(boolean z13) {
        this.f14412f.setActivated(z13);
        this.f14413g.setActivated(z13);
    }

    public final void setDragListener(c cVar) {
        int i13 = r8.c.f70713a;
        getTag(R.id.dragListener);
        setTag(R.id.dragListener, cVar);
        this.f14423q = cVar;
    }

    @Override // android.view.View
    public void setEnabled(boolean z13) {
        super.setEnabled(z13);
        for (View view : t.h(this.e, this.f14412f, this.f14413g)) {
            view.setAlpha(z13 ? 1.0f : 0.55f);
        }
    }

    public final void setIcon(int i13) {
        this.f14412f.setImageResource(i13);
        this.f14416j = i13;
    }

    public final void setLabel(String str) {
        this.f14414h.setText(str);
        this.f14418l = str;
    }

    public final void setProgressDrawable(int i13) {
        try {
            DysonVerticalSeekbar dysonVerticalSeekbar = this.e;
            Context context = getContext();
            context.getClass();
            dysonVerticalSeekbar.setProgressDrawable(c7.a.e(new se1.y(context).f76070a, i13));
            a(this.d);
            this.f14417k = i13;
        } catch (Resources.NotFoundException unused) {
            Logger.e("Drawable with resourceId " + i13 + " cannot be found", null);
        }
    }

    public final void setRange(int i13) {
        this.e.setMax(i13);
        this.f14420n = i13;
    }

    public final void setShowError(boolean z13) {
        this.f14415i.setVisibility(z13 ? 0 : 8);
        this.f14419m = z13;
    }

    public final void setSliderFormat(Function1<? super Integer, ? extends CharSequence> function1) {
        this.f14413g.setText(function1 != null ? function1.invoke(Integer.valueOf(this.e.getProgress())) : null);
        this.f14421o = function1;
    }

    public final void setSliderListener(d dVar) {
        int i13 = r8.c.f70713a;
        getTag(R.id.progressListener);
        setTag(R.id.progressListener, dVar);
        if (dVar != null) {
            dVar.a(this, this.e.getProgress(), false);
        }
        this.f14422p = dVar;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/dyson/mobile/android/interactableec/control/slider/ECSlider$b;", "", "<init>", "()V", "", "DEFAULT_SLIDER_RANGE", "I", "", "ANIMATED_FRACTION_DURATION", "F", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ECSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ECSlider(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ ECSlider(Context context, AttributeSet attributeSet, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }
}
