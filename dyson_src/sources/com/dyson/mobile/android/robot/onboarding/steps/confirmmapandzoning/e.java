package com.dyson.mobile.android.robot.onboarding.steps.confirmmapandzoning;

import c42.f2;
import c42.g2;
import c42.q1;
import c42.r;
import c42.r1;
import c42.u1;
import c42.w1;
import com.dyson.mobile.android.robot.onboarding.steps.OnboardingStep;
import com.dyson.mobile.android.robot.onboarding.steps.OnboardingSteps;
import com.dyson.mobile.android.robot.onboarding.steps.confirmmapandzoning.c;
import hj.e;
import iu0.a0;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import lj.a;
import m9.u;
import nj.ka;
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB3\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/dyson/mobile/android/robot/onboarding/steps/confirmmapandzoning/e;", "Lm9/u;", "Lcom/dyson/mobile/android/robot/onboarding/steps/confirmmapandzoning/c;", "confirmMapAndZoningOnboardingStepsProvider", "Lhj/e;", "trackingManager", "Liu0/a0;", "robotDataStore", "Lpf0/c;", "localisationManager", "Lcom/dyson/mobile/android/robot/onboarding/steps/confirmmapandzoning/c$b;", "onboardingType", "<init>", "(Lcom/dyson/mobile/android/robot/onboarding/steps/confirmmapandzoning/c;Lhj/e;Liu0/a0;Lpf0/c;Lcom/dyson/mobile/android/robot/onboarding/steps/confirmmapandzoning/c$b;)V", "a", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e extends u {
    public final hj.e d;
    public final a0 e;

    /* renamed from: f  reason: collision with root package name */
    public final pf0.c f16644f;

    /* renamed from: g  reason: collision with root package name */
    public final c.b f16645g;

    /* renamed from: h  reason: collision with root package name */
    public final List<OnboardingStep> f16646h;

    /* renamed from: i  reason: collision with root package name */
    public int f16647i;

    /* renamed from: j  reason: collision with root package name */
    public final f2 f16648j;

    /* renamed from: k  reason: collision with root package name */
    public final r1 f16649k;

    /* renamed from: l  reason: collision with root package name */
    public final u1 f16650l;

    /* renamed from: m  reason: collision with root package name */
    public final q1 f16651m;

    /* renamed from: n  reason: collision with root package name */
    public final u1 f16652n;

    /* renamed from: o  reason: collision with root package name */
    public final q1 f16653o;

    @wy1.a
    /* loaded from: classes3.dex */
    public interface a {
        e a(c.b bVar);
    }

    /* loaded from: classes3.dex */
    public static final /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f16654a;

        static {
            int[] iArr = new int[c.b.values().length];
            try {
                iArr[c.b.OOB_CONFIRM_MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.b.OOB_ZONING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.b.ZONING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f16654a = iArr;
        }
    }

    public e(c cVar, hj.e eVar, a0 a0Var, pf0.c cVar2, c.b bVar) {
        OnboardingSteps onboardingSteps;
        cVar.getClass();
        eVar.getClass();
        a0Var.getClass();
        cVar2.getClass();
        bVar.getClass();
        this.d = eVar;
        this.e = a0Var;
        this.f16644f = cVar2;
        this.f16645g = bVar;
        int i13 = c.C0597c.f16643a[bVar.ordinal()];
        if (i13 == 1) {
            onboardingSteps = (OnboardingSteps) cVar.e.getValue();
        } else if (i13 == 2) {
            onboardingSteps = (OnboardingSteps) cVar.d.getValue();
        } else if (i13 != 3) {
            ma.e.o();
            throw null;
        } else {
            onboardingSteps = (OnboardingSteps) cVar.f16642f.getValue();
        }
        List<OnboardingStep> list = onboardingSteps.d;
        this.f16646h = list;
        f2 a13 = g2.a(new d41.d(list.get(this.f16647i), true));
        this.f16648j = a13;
        this.f16649k = r.d(a13);
        u1 b13 = w1.b(1, 0, null, 6);
        this.f16650l = b13;
        this.f16651m = r.c(b13);
        u1 b14 = w1.b(1, 0, null, 6);
        this.f16652n = b14;
        this.f16653o = r.c(b14);
    }

    public final void S(int i13) {
        f2 f2Var;
        Object value;
        this.f16647i = i13;
        do {
            f2Var = this.f16648j;
            value = f2Var.getValue();
        } while (!f2Var.f(value, d41.d.a((d41.d) value, this.f16646h.get(i13), false, 2)));
        T();
    }

    public final void T() {
        String str = ((d41.d) this.f16649k.d.getValue()).f22772a.d;
        int i13 = ka.f57565a;
        str.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a.q.f52180a.getClass();
        ij.b e = ma.e.e(linkedHashMap, a.q.e, str, "robot.onboarding.zoning", linkedHashMap);
        e.a aVar = hj.e.f38312g;
        this.d.h(e, null);
    }
}
