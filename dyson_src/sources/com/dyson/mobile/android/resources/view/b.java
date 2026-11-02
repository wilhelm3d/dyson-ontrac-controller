package com.dyson.mobile.android.resources.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Paint;
import android.util.Property;
import android.util.SparseArray;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import at0.g;
import com.brightcove.player.video360.SphericalSceneRenderer;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.resources.view.a;
import d22.k;
import h12.p;
import i12.c0;
import i12.q;
import i12.t;
import java.util.ArrayList;
import kotlin.Metadata;
import zs0.j;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/resources/view/b;", "", "<init>", "()V", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f15764a = new b();

    /* renamed from: b  reason: collision with root package name */
    public static final k f15765b = new k(5, 355);

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f15766c = {0, 45, 90, SphericalSceneRenderer.SPHERE_SLICES, 350};
    public static final DecelerateInterpolator d = new DecelerateInterpolator(2.0f);

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/resources/view/b$a", "Landroid/animation/AnimatorListenerAdapter;", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends AnimatorListenerAdapter {
        public final /* synthetic */ View d;
        public final /* synthetic */ p<Float, Float> e;

        public a(View view, p<Float, Float> pVar) {
            this.d = view;
            this.e = pVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            animator.getClass();
            this.d.setRotation(this.e.e.floatValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"com/dyson/mobile/android/resources/view/b$b", "Landroid/util/Property;", "Landroid/widget/ImageView;", "", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.resources.view.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0543b extends Property<ImageView, Float> {
        public C0543b(Class<Float> cls) {
            super(cls, "rotation");
        }

        @Override // android.util.Property
        public final Float get(ImageView imageView) {
            ImageView imageView2 = imageView;
            imageView2.getClass();
            return Float.valueOf(imageView2.getRotation());
        }

        @Override // android.util.Property
        public final void set(ImageView imageView, Float f13) {
            ImageView imageView2 = imageView;
            float floatValue = f13.floatValue();
            imageView2.getClass();
            imageView2.setRotation(floatValue);
            imageView2.invalidate();
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/resources/view/b$c", "Landroid/animation/AnimatorListenerAdapter;", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c extends AnimatorListenerAdapter {
        public final /* synthetic */ DysonSeekArc d;
        public final /* synthetic */ a.f e;

        public c(DysonSeekArc dysonSeekArc, a.f fVar) {
            this.d = dysonSeekArc;
            this.e = fVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            animator.getClass();
            this.d.arcMark.m(this.e);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/resources/view/b$d", "Landroid/animation/AnimatorListenerAdapter;", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d extends AnimatorListenerAdapter {
        public final /* synthetic */ DysonSeekArc d;
        public final /* synthetic */ a.c e;

        public d(DysonSeekArc dysonSeekArc, a.c cVar) {
            this.d = dysonSeekArc;
            this.e = cVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            animator.getClass();
            this.d.arcMark.m(this.e);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/resources/view/b$e", "Landroid/animation/AnimatorListenerAdapter;", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class e extends AnimatorListenerAdapter {
        public final /* synthetic */ DysonSeekArc d;
        public final /* synthetic */ a.f e;

        public e(DysonSeekArc dysonSeekArc, a.f fVar) {
            this.d = dysonSeekArc;
            this.e = fVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            animator.getClass();
            this.d.arcMark.m(this.e);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/resources/view/b$f", "Landroid/animation/AnimatorListenerAdapter;", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class f extends AnimatorListenerAdapter {
        public final /* synthetic */ DysonSeekArc d;
        public final /* synthetic */ a.c e;

        public f(DysonSeekArc dysonSeekArc, a.c cVar) {
            this.d = dysonSeekArc;
            this.e = cVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            animator.getClass();
            this.d.arcMark.m(this.e);
        }
    }

    private b() {
    }

    public static ObjectAnimator a(com.dyson.mobile.android.resources.view.a aVar) {
        ObjectAnimator ofInt = ObjectAnimator.ofInt(aVar, com.dyson.mobile.android.resources.view.a.d, 0, 255);
        ofInt.getClass();
        return ofInt;
    }

    public static final void b(DysonDial dysonDial, int i13, int i14) {
        dysonDial.getClass();
        int f13 = d22.p.f(i13, f15765b);
        View findViewById = dysonDial.findViewById(16908312);
        DecelerateInterpolator decelerateInterpolator = d;
        if (findViewById != null) {
            p pVar = new p(Float.valueOf(findViewById.getRotation()), Float.valueOf(f13));
            C0543b c0543b = new C0543b(Float.TYPE);
            ObjectAnimator objectAnimator = new ObjectAnimator();
            objectAnimator.setDuration(dysonDial.getResources().getInteger(i14));
            objectAnimator.setInterpolator(decelerateInterpolator);
            objectAnimator.setProperty(c0543b);
            objectAnimator.setFloatValues(((Number) pVar.d).floatValue(), ((Number) pVar.e).floatValue());
            objectAnimator.setTarget(findViewById);
            objectAnimator.addListener(new a(findViewById, pVar));
            objectAnimator.start();
        }
        com.dyson.mobile.android.resources.view.a l13 = dysonDial.d.arcMark.l();
        if (l13 != null) {
            ObjectAnimator objectAnimator2 = new ObjectAnimator();
            objectAnimator2.setDuration(dysonDial.getResources().getInteger(i14));
            objectAnimator2.setInterpolator(decelerateInterpolator);
            objectAnimator2.setProperty(com.dyson.mobile.android.resources.view.a.f15748c);
            objectAnimator2.setTarget(l13);
            objectAnimator2.setIntValues(l13.f15750b, f13);
            objectAnimator2.start();
        }
    }

    public static int c(k kVar) {
        kVar.getClass();
        return (kVar.d + kVar.e) / 2;
    }

    public static final int d(int i13, int i14) {
        k f13 = f(Integer.valueOf(i14));
        int i15 = f13.d;
        f15764a.getClass();
        return d22.p.f(i13, new k(0, f13.e - i15)) + i15;
    }

    public static final void e(DysonDial dysonDial, int i13) {
        DysonSeekArc dysonSeekArc = dysonDial.d;
        Integer valueOf = Integer.valueOf(dysonSeekArc.getSweepAngle());
        f15764a.getClass();
        i(dysonDial, valueOf);
        Object paint = new Paint();
        Object a13 = j.a(paint.getClass(), dysonSeekArc, "mArcPaint");
        if (a13 != null) {
            paint = a13;
        }
        Paint paint2 = (Paint) paint;
        paint2.setColor(c7.a.c(dysonDial.getContext(), R.color.secondaryButtonPressedBackground));
        paint2.setStyle(Paint.Style.FILL_AND_STROKE);
        dysonSeekArc.mMarkNotchPaint.setColor(c7.a.c(dysonDial.getContext(), R.color.navigationGrey));
        dysonSeekArc.mMarkNotchPaint.setStyle(Paint.Style.FILL);
        dysonSeekArc.arcMark.m(new a.f(dysonSeekArc, null));
        dysonSeekArc.mDrawRoutines.clear();
        dysonSeekArc.mDrawRoutines.addAll(t.h(new g(dysonDial, i13, 0), new at0.f(dysonSeekArc, 0), dysonSeekArc.doDrawThumb));
    }

    public static final k f(Integer num) {
        int N;
        int intValue;
        int intValue2 = num.intValue();
        k kVar = f15765b;
        if (intValue2 <= 0) {
            N = 0;
        } else if (kVar.o(num.intValue())) {
            int intValue3 = num.intValue() / 2;
            intValue = num.intValue() - intValue3;
            N = intValue3;
            return new k(kVar.d + N, kVar.e - intValue);
        } else {
            N = q.N(f15766c) / 2;
        }
        intValue = N;
        return new k(kVar.d + N, kVar.e - intValue);
    }

    public static final void g(DysonDial dysonDial, int i13, Integer num, Paint paint) {
        dysonDial.getClass();
        int[] iArr = f15766c;
        int f13 = d22.p.f(i13, new k(q.x(iArr), q.N(iArr)));
        b bVar = f15764a;
        if (num != null) {
            h(dysonDial, num.intValue());
            dysonDial.setDialPosition(0);
        } else {
            int dialValue = dysonDial.getDialValue();
            Integer valueOf = Integer.valueOf(f13);
            bVar.getClass();
            k i14 = i(dysonDial, valueOf);
            DysonSeekArc dysonSeekArc = dysonDial.d;
            dysonSeekArc.setStartAngle(i14.d);
            dysonSeekArc.setSweepAngle(dysonSeekArc.getMax());
            dysonSeekArc.setProgress(dysonDial.getDialOptions().indexOfKey(d22.p.f(dialValue, i14)));
        }
        DysonSeekArc dysonSeekArc2 = dysonDial.d;
        com.dyson.mobile.android.resources.view.a l13 = dysonSeekArc2.arcMark.l();
        boolean z13 = l13 instanceof a.c;
        int i15 = z13 ? ((a.c) l13).e : l13 instanceof a.d ? 90 : 0;
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(dysonSeekArc2.getResources().getInteger(17694720));
        animatorSet.setInterpolator(d);
        if (f13 == 0 && (l13 instanceof a.d)) {
            a.f fVar = new a.f(dysonSeekArc2, ((a.d) l13).f15750b, paint);
            bVar.getClass();
            ObjectAnimator ofInt = ObjectAnimator.ofInt(l13, com.dyson.mobile.android.resources.view.a.d, 255, 0);
            ofInt.getClass();
            ObjectAnimator a13 = a(fVar);
            a13.addListener(new c(dysonSeekArc2, fVar));
            animatorSet.playSequentially(ofInt, a13);
        } else if (f13 > 0 && (l13 instanceof a.d)) {
            a.c cVar = new a.c(dysonSeekArc2, f13);
            cVar.f15750b = num != null ? num.intValue() : ((a.d) l13).f15750b;
            bVar.getClass();
            ObjectAnimator ofInt2 = ObjectAnimator.ofInt(l13, com.dyson.mobile.android.resources.view.a.d, 255, 0);
            ofInt2.getClass();
            ObjectAnimator a14 = a(cVar);
            a14.addListener(new d(dysonSeekArc2, cVar));
            animatorSet.playSequentially(ofInt2, a14);
        } else if (f13 == 0 && z13) {
            a.c cVar2 = (a.c) l13;
            a.f fVar2 = new a.f(dysonSeekArc2, cVar2.f15750b, paint);
            bVar.getClass();
            ObjectAnimator ofInt3 = ObjectAnimator.ofInt(cVar2, a.c.f15751g, i15, 0);
            ofInt3.getClass();
            ObjectAnimator a15 = a(fVar2);
            a15.addListener(new e(dysonSeekArc2, fVar2));
            animatorSet.playSequentially(ofInt3, a15);
        } else if (f13 > 0 && (l13 instanceof a.f)) {
            a.c cVar3 = new a.c(dysonSeekArc2, f13);
            cVar3.f15750b = num != null ? num.intValue() : d22.p.f(((a.f) l13).f15750b, f(Integer.valueOf(f13)));
            bVar.getClass();
            ObjectAnimator ofInt4 = ObjectAnimator.ofInt(cVar3, a.c.f15751g, 0, f13);
            ofInt4.getClass();
            ofInt4.addListener(new f(dysonSeekArc2, cVar3));
            animatorSet.play(ofInt4);
        } else if (i15 != f13 && z13) {
            bVar.getClass();
            ObjectAnimator ofInt5 = ObjectAnimator.ofInt((a.c) l13, a.c.f15751g, i15, f13);
            ofInt5.getClass();
            animatorSet.play(ofInt5);
        }
        ArrayList<Animator> childAnimations = animatorSet.getChildAnimations();
        childAnimations.getClass();
        if (childAnimations.isEmpty()) {
            return;
        }
        animatorSet.start();
    }

    public static final void h(DysonDial dysonDial, int i13) {
        dysonDial.getClass();
        Integer valueOf = Integer.valueOf(q.N(f15766c));
        f15764a.getClass();
        i(dysonDial, valueOf);
        DysonSeekArc dysonSeekArc = dysonDial.d;
        dysonSeekArc.setStartAngle(d22.p.f(i13, f15765b));
        dysonSeekArc.setSweepAngle(0);
    }

    public static k i(DysonDial dysonDial, Integer num) {
        k f13 = f(num);
        if (c0.G(f13) <= 1) {
            int c13 = c(f15765b);
            SparseArray<CharSequence> sparseArray = new SparseArray<>();
            sparseArray.put(c13, dysonDial.getResources().getString(R.string.format_temperature_int, Integer.valueOf(c13)));
            dysonDial.setDialOptions(sparseArray);
            dysonDial.d.setMax(-1);
            return f13;
        }
        int i13 = f13.d;
        int i14 = f13.e;
        dysonDial.getClass();
        if (i13 >= i14) {
            pa.c.p("require upper greater than lower");
            return null;
        }
        SparseArray<CharSequence> sparseArray2 = new SparseArray<>();
        while (i13 <= i14) {
            sparseArray2.put(i13, dysonDial.getResources().getString(R.string.format_temperature_int, Integer.valueOf(i13)));
            i13++;
        }
        dysonDial.setDialOptions(sparseArray2);
        return f13;
    }
}
