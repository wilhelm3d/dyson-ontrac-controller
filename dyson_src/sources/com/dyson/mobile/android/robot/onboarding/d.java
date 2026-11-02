package com.dyson.mobile.android.robot.onboarding;

import androidx.databinding.ObservableInt;
import androidx.viewpager2.widget.ViewPager2;
import c41.c;
import com.dyson.mobile.android.logging.Logger;
import com.dyson.mobile.android.robot.onboarding.steps.OnboardingStep;
import com.dyson.mobile.android.robot.onboarding.steps.OnboardingSteps;
import h12.f0;
import hj.e;
import i12.e0;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import lj.a;
import m9.u;
import nj.ia;
import x12.r;
import y31.h;
import y31.j;
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB5\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/dyson/mobile/android/robot/onboarding/d;", "Lm9/u;", "Lc41/c;", "onboardingStepsProvider", "Ly31/h;", "robotOnboardingRegistry", "Lhj/e;", "trackingManager", "Ly31/j;", "onboardingType", "Lcom/dyson/mobile/android/robot/onboarding/b;", "onboardingStepsAdapter", "<init>", "(Lc41/c;Ly31/h;Lhj/e;Ly31/j;Lcom/dyson/mobile/android/robot/onboarding/b;)V", "a", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d extends u {
    public final h d;
    public final hj.e e;

    /* renamed from: f  reason: collision with root package name */
    public final j f16565f;

    /* renamed from: g  reason: collision with root package name */
    public final com.dyson.mobile.android.robot.onboarding.b f16566g;

    /* renamed from: h  reason: collision with root package name */
    public final com.dyson.mobile.android.robot.onboarding.b f16567h;

    /* renamed from: i  reason: collision with root package name */
    public final ObservableInt f16568i;

    /* renamed from: j  reason: collision with root package name */
    public final xf1.a<f0> f16569j;

    /* renamed from: k  reason: collision with root package name */
    public final b f16570k;

    /* renamed from: l  reason: collision with root package name */
    public final int f16571l;

    @wy1.a
    /* loaded from: classes3.dex */
    public interface a {
        d a(j jVar, com.dyson.mobile.android.robot.onboarding.b bVar);
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/robot/onboarding/d$b", "Landroidx/viewpager2/widget/ViewPager2$h;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b extends ViewPager2.h {
        public b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.h
        public final void c(int i13) {
            d dVar = d.this;
            ObservableInt observableInt = dVar.f16568i;
            j jVar = dVar.f16565f;
            observableInt.l(i13);
            if (i13 == dVar.f16571l) {
                dVar.d.a(jVar);
                String key = jVar.getKey();
                Logger.c("Onboarding flag " + key + " cleared");
            }
            List<OnboardingStep> list = dVar.f16566g.f16563l;
            if (list == null) {
                r.i("onboardingSteps");
                throw null;
            }
            hj.e eVar = dVar.e;
            String str = list.get(i13).d;
            int i14 = ia.f57532a;
            str.getClass();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            a.q.f52180a.getClass();
            ij.b e = ma.e.e(linkedHashMap, a.q.e, str, "robot.onboarding.first_clean", linkedHashMap);
            e.a aVar = hj.e.f38312g;
            eVar.h(e, null);
        }
    }

    public d(c41.c cVar, h hVar, hj.e eVar, j jVar, com.dyson.mobile.android.robot.onboarding.b bVar) {
        cVar.getClass();
        hVar.getClass();
        eVar.getClass();
        jVar.getClass();
        bVar.getClass();
        this.d = hVar;
        this.e = eVar;
        this.f16565f = jVar;
        this.f16566g = bVar;
        bVar.f16563l = (c.a.f10218a[jVar.ordinal()] == 1 ? (OnboardingSteps) cVar.f10217a.e.getValue() : new OnboardingSteps(e0.d)).d;
        this.f16567h = bVar;
        this.f16568i = new ObservableInt();
        this.f16569j = new xf1.a<>();
        this.f16570k = new b();
        this.f16571l = bVar.getItemCount() - 1;
    }
}
