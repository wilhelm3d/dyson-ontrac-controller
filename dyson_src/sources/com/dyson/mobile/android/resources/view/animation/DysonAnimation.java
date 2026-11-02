package com.dyson.mobile.android.resources.view.animation;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.AttributeSet;
import b50.p;
import com.airbnb.lottie.LottieAnimationView;
import dt0.a;
import dt0.b;
import dt0.c;
import dt0.d;
import hd.c0;
import hd.g;
import hd.j;
import hd.r;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.WeakHashMap;
import kz1.b;
import mz1.e;
import nz1.f;
/* loaded from: classes3.dex */
public class DysonAnimation extends LottieAnimationView {

    /* renamed from: y  reason: collision with root package name */
    public static final /* synthetic */ int f15756y = 0;

    /* renamed from: r  reason: collision with root package name */
    public Context f15757r;

    /* renamed from: s  reason: collision with root package name */
    public LinkedList f15758s;

    /* renamed from: t  reason: collision with root package name */
    public e f15759t;

    /* renamed from: u  reason: collision with root package name */
    public d f15760u;

    /* renamed from: v  reason: collision with root package name */
    public dt0.e f15761v;

    /* renamed from: w  reason: collision with root package name */
    public WeakHashMap f15762w;

    /* renamed from: x  reason: collision with root package name */
    public AssetManager f15763x;

    public DysonAnimation(Context context) {
        super(context);
        h(context);
    }

    public static void g(DysonAnimation dysonAnimation, b bVar, f.a aVar) {
        r rVar = dysonAnimation.f11868h;
        WeakHashMap weakHashMap = dysonAnimation.f15762w;
        String str = bVar.f24995a;
        float f13 = bVar.f24999g;
        float f14 = bVar.f24998f;
        g gVar = (g) weakHashMap.get(str);
        if (gVar == null) {
            Context context = dysonAnimation.f15757r;
            HashMap hashMap = j.f38052a;
            gVar = j.b(context, str, "asset_" + str).f38124a;
            dysonAnimation.f15762w.put(str, gVar);
        }
        dysonAnimation.f15761v = new dt0.e(dysonAnimation, bVar, aVar);
        dysonAnimation.clearAnimation();
        rVar.e.addListener(dysonAnimation.f15761v);
        dysonAnimation.setImageAssetsFolder(bVar.d);
        dysonAnimation.setImageAssetLoader(bVar);
        dysonAnimation.setComposition(gVar);
        if (f14 == f13) {
            dysonAnimation.setProgress(f14);
        } else {
            float duration = (float) dysonAnimation.getDuration();
            boolean z13 = (f14 == 0.0f && f13 == 1.0f) ? false : true;
            Long l13 = bVar.f25000h;
            if (z13) {
                duration *= f13 - f14;
            }
            float longValue = l13.longValue() != -1 ? (float) l13.longValue() : duration;
            dysonAnimation.setSpeed(duration == longValue ? 1.0f : duration / longValue);
            if (bVar.e) {
                ud.f fVar = rVar.e;
                fVar.f81820g = -fVar.f81820g;
            }
            if (f14 != 0.0f || f13 != 1.0f) {
                rVar.t(f14, f13);
            }
            super.f();
        }
        String str2 = bVar.f24997c;
        if (str2 != null) {
            dysonAnimation.setContentDescription(str2);
        }
    }

    private void setImageAssetLoader(b bVar) {
        setImageAssetDelegate(new c(this, bVar));
    }

    @Override // com.airbnb.lottie.LottieAnimationView
    public final void c() {
        this.f15758s.clear();
        setImageDrawable(null);
        e eVar = this.f15759t;
        if (eVar != null && !eVar.b()) {
            e eVar2 = this.f15759t;
            eVar2.getClass();
            jz1.d.dispose(eVar2);
        }
        dt0.e eVar3 = this.f15761v;
        r rVar = this.f11868h;
        rVar.e.removeListener(eVar3);
        this.f15761v = null;
        rVar.e.removeListener(this.f15760u);
        this.f15760u = null;
        super.c();
    }

    @Override // com.airbnb.lottie.LottieAnimationView
    public final void f() {
        if (this.f15758s.isEmpty()) {
            return;
        }
        a aVar = (a) this.f15758s.poll();
        if (aVar.f24994c) {
            e eVar = this.f15759t;
            if (eVar != null) {
                jz1.d.dispose(eVar);
            }
            j(aVar);
            return;
        }
        r rVar = this.f11868h;
        if (!rVar.i()) {
            j(aVar);
            return;
        }
        rVar.e.removeListener(this.f15761v);
        this.f15761v = null;
        rVar.e.removeListener(this.f15760u);
        this.f15760u = null;
        this.f15760u = new d(this, aVar);
        e eVar2 = this.f15759t;
        if (eVar2 != null) {
            jz1.d.dispose(eVar2);
        }
        rVar.e.addListener(this.f15760u);
    }

    public final void h(Context context) {
        this.f15757r = context;
        this.f15758s = new LinkedList();
        this.f15762w = new WeakHashMap();
        this.f15763x = context.getAssets();
        setRepeatCount(-1);
        setRenderMode(c0.HARDWARE);
    }

    public final void i(a aVar) {
        if (aVar != null) {
            if (aVar.f24994c) {
                setAnimation(aVar);
                return;
            }
            this.f15758s.add(aVar);
            if (this.f11868h.i() || !aVar.d) {
                return;
            }
            f();
        }
    }

    public final void j(a aVar) {
        List<b> list;
        if (aVar == null || (list = aVar.f24992a) == null || list.isEmpty()) {
            return;
        }
        c cVar = new c(this, list.get(0));
        b.a aVar2 = kz1.b.f50218a;
        dz1.b fVar = new f(cVar);
        if (list.size() > 1) {
            for (int i13 = 1; i13 < list.size(); i13++) {
                c cVar2 = new c(this, list.get(i13));
                b.a aVar3 = kz1.b.f50218a;
                fVar = fVar.g(new f(cVar2));
            }
        }
        this.f15759t = fVar.z(fz1.a.a()).r(fz1.a.a()).w(new p(5, this, aVar));
    }

    public void setAnimation(a aVar) {
        c();
        if (aVar != null) {
            this.f15758s.add(aVar);
            if (aVar.d) {
                f();
            }
        }
    }

    public void setAnimationListener(dt0.f fVar) {
    }

    public DysonAnimation(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        h(context);
    }

    public DysonAnimation(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        h(context);
    }
}
