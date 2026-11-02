package com.dyson.mobile.android.machine.machinecontent.expertcontent.onboarding;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.m;
import c42.f2;
import c42.g2;
import c42.q1;
import c42.r;
import c42.r1;
import c42.u1;
import c42.w1;
import com.dyson.mobile.android.logging.Logger;
import com.dyson.mobile.android.machine.machinecontent.expertcontent.onboarding.g;
import kotlin.Metadata;
import m9.u;
import m9.v;
import z32.g0;
import z32.z;
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000bB/\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/onboarding/c;", "Lm9/u;", "Landroidx/lifecycle/m;", "Lvi0/i;", "machineContentRepository", "", "machineSerial", "topic", "onboardingTitle", "<init>", "(Lvi0/i;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c extends u implements m {
    public final vi0.i d;
    public final String e;

    /* renamed from: f  reason: collision with root package name */
    public final String f15238f;

    /* renamed from: g  reason: collision with root package name */
    public final f2 f15239g;

    /* renamed from: h  reason: collision with root package name */
    public final r1 f15240h;

    /* renamed from: i  reason: collision with root package name */
    public final u1 f15241i;

    /* renamed from: j  reason: collision with root package name */
    public final q1 f15242j;

    @wy1.a
    /* loaded from: classes3.dex */
    public interface a {
        c a(String str, String str2, String str3);
    }

    public c(vi0.i iVar, String str, String str2, String str3) {
        iVar.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.d = iVar;
        this.e = str;
        this.f15238f = str2;
        f2 a13 = g2.a(new i(str3, g.b.f15246a));
        this.f15239g = a13;
        this.f15240h = r.d(a13);
        u1 b13 = w1.b(1, 0, null, 6);
        this.f15241i = b13;
        this.f15242j = r.c(b13);
    }

    public static final void S(c cVar, Throwable th2) {
        Object value;
        String str = cVar.e;
        String str2 = cVar.f15238f;
        String message = th2.getMessage();
        StringBuilder m13 = ma.e.m("Expert content error for ", str, ", topic: ", str2, ", error: ");
        m13.append(message);
        Logger.b(m13.toString(), null);
        f2 f2Var = cVar.f15239g;
        do {
            value = f2Var.getValue();
        } while (!f2Var.f(value, i.a((i) value, new g.a(th2))));
    }

    @Override // androidx.lifecycle.m
    public final void g(LifecycleOwner lifecycleOwner, Lifecycle.a aVar) {
        if (aVar == Lifecycle.a.ON_START) {
            g0.r(v.a(this), new pi0.d(z.Z0, this), null, new d(this, null), 2);
        }
    }
}
