package com.dyson.mobile.android.machine.ui.permissions;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.m;
import c42.q1;
import c42.u1;
import c42.w1;
import com.dyson.mobile.android.machine.ui.permissions.c;
import h12.f0;
import h12.r;
import h12.t;
import hj.e;
import ij.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.u;
import m9.v;
import mj.w;
import n12.i;
import ps0.l;
import rf0.i0;
import rf0.q;
import rf1.a;
import se1.e;
import z32.c0;
import z32.g0;
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\r\u000eB)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/permissions/a;", "Lm9/u;", "Landroidx/lifecycle/m;", "Lse1/e;", "buildVersionProvider", "Lpf0/c;", "localisationManager", "Lv60/b;", "locationServicesHelper", "Lhj/e;", "trackingManager", "<init>", "(Lse1/e;Lpf0/c;Lv60/b;Lhj/e;)V", "b", "a", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a extends u implements m {
    public final e d;
    public final pf0.c e;

    /* renamed from: f  reason: collision with root package name */
    public final v60.b f15386f;

    /* renamed from: g  reason: collision with root package name */
    public final hj.e f15387g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f15388h;

    /* renamed from: i  reason: collision with root package name */
    public final u1 f15389i;

    /* renamed from: j  reason: collision with root package name */
    public final q1 f15390j;

    /* renamed from: k  reason: collision with root package name */
    public final t f15391k;

    /* renamed from: l  reason: collision with root package name */
    public final t f15392l;

    /* renamed from: m  reason: collision with root package name */
    public final t f15393m;

    @wy1.a
    /* loaded from: classes3.dex */
    public interface b {
        a create();
    }

    /* loaded from: classes3.dex */
    public static final /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15394a;

        static {
            int[] iArr = new int[Lifecycle.a.values().length];
            try {
                iArr[Lifecycle.a.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f15394a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.machine.ui.permissions.DysonPermissionExperienceViewModel$emitEvent$1", f = "DysonPermissionExperienceViewModel.kt", l = {166}, m = "invokeSuspend", v = 2)
    /* loaded from: classes3.dex */
    public static final class d extends i implements Function2<c0, l12.d<? super f0>, Object> {
        public int d;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ com.dyson.mobile.android.machine.ui.permissions.c f15395f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.dyson.mobile.android.machine.ui.permissions.c cVar, l12.d<? super d> dVar) {
            super(2, dVar);
            this.f15395f = cVar;
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            return new d(this.f15395f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
            return ((d) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            int i13 = this.d;
            if (i13 == 0) {
                r.b(obj);
                u1 u1Var = a.this.f15389i;
                this.d = 1;
                if (u1Var.emit(this.f15395f, this) == aVar) {
                    return aVar;
                }
            } else if (i13 != 1) {
                pa.c.w("call to 'resume' before 'invoke' with coroutine");
                return null;
            } else {
                r.b(obj);
            }
            return f0.f36844a;
        }
    }

    static {
        new C0523a(null);
    }

    public a(e eVar, pf0.c cVar, v60.b bVar, hj.e eVar2) {
        eVar.getClass();
        cVar.getClass();
        bVar.getClass();
        eVar2.getClass();
        this.d = eVar;
        this.e = cVar;
        this.f15386f = bVar;
        this.f15387g = eVar2;
        u1 b13 = w1.b(1, 0, null, 6);
        this.f15389i = b13;
        this.f15390j = c42.r.c(b13);
        this.f15391k = h12.m.b(new w12.a(this) { // from class: em0.h
            public final /* synthetic */ com.dyson.mobile.android.machine.ui.permissions.a e;

            {
                this.e = this;
            }

            @Override // w12.a
            public final Object invoke() {
                int i13 = r2;
                com.dyson.mobile.android.machine.ui.permissions.a aVar = this.e;
                switch (i13) {
                    case 0:
                        return aVar.d.b() ? a.c.f73033b.f73030a : a.d.f73034b.f73030a;
                    case 1:
                        boolean b14 = aVar.d.b();
                        pf0.c cVar2 = aVar.e;
                        return b14 ? new j(cVar2.d(i0.f71691ib), 2131232545, cVar2.d(i0.f71817qd), cVar2.d(i0.f71847sd), null, 16, null) : new j(cVar2.d(i0.f71737lb), 2131232545, cVar2.d(i0.f71817qd), cVar2.d(i0.f71832rd), null, 16, null);
                    default:
                        boolean b15 = aVar.d.b();
                        pf0.c cVar3 = aVar.e;
                        return b15 ? new l(cVar3.d(q.M3), cVar3.d(q.N3), cVar3.d(i0.f71695j), cVar3.d(i0.E8)) : new l(cVar3.d(i0.f71682i2), cVar3.d(i0.f71753mb), cVar3.d(i0.f71695j), cVar3.d(i0.E8));
                }
            }
        });
        this.f15392l = h12.m.b(new w12.a(this) { // from class: em0.h
            public final /* synthetic */ com.dyson.mobile.android.machine.ui.permissions.a e;

            {
                this.e = this;
            }

            @Override // w12.a
            public final Object invoke() {
                int i13 = r2;
                com.dyson.mobile.android.machine.ui.permissions.a aVar = this.e;
                switch (i13) {
                    case 0:
                        return aVar.d.b() ? a.c.f73033b.f73030a : a.d.f73034b.f73030a;
                    case 1:
                        boolean b14 = aVar.d.b();
                        pf0.c cVar2 = aVar.e;
                        return b14 ? new j(cVar2.d(i0.f71691ib), 2131232545, cVar2.d(i0.f71817qd), cVar2.d(i0.f71847sd), null, 16, null) : new j(cVar2.d(i0.f71737lb), 2131232545, cVar2.d(i0.f71817qd), cVar2.d(i0.f71832rd), null, 16, null);
                    default:
                        boolean b15 = aVar.d.b();
                        pf0.c cVar3 = aVar.e;
                        return b15 ? new l(cVar3.d(q.M3), cVar3.d(q.N3), cVar3.d(i0.f71695j), cVar3.d(i0.E8)) : new l(cVar3.d(i0.f71682i2), cVar3.d(i0.f71753mb), cVar3.d(i0.f71695j), cVar3.d(i0.E8));
                }
            }
        });
        this.f15393m = h12.m.b(new w12.a(this) { // from class: em0.h
            public final /* synthetic */ com.dyson.mobile.android.machine.ui.permissions.a e;

            {
                this.e = this;
            }

            @Override // w12.a
            public final Object invoke() {
                int i13 = r2;
                com.dyson.mobile.android.machine.ui.permissions.a aVar = this.e;
                switch (i13) {
                    case 0:
                        return aVar.d.b() ? a.c.f73033b.f73030a : a.d.f73034b.f73030a;
                    case 1:
                        boolean b14 = aVar.d.b();
                        pf0.c cVar2 = aVar.e;
                        return b14 ? new j(cVar2.d(i0.f71691ib), 2131232545, cVar2.d(i0.f71817qd), cVar2.d(i0.f71847sd), null, 16, null) : new j(cVar2.d(i0.f71737lb), 2131232545, cVar2.d(i0.f71817qd), cVar2.d(i0.f71832rd), null, 16, null);
                    default:
                        boolean b15 = aVar.d.b();
                        pf0.c cVar3 = aVar.e;
                        return b15 ? new l(cVar3.d(q.M3), cVar3.d(q.N3), cVar3.d(i0.f71695j), cVar3.d(i0.E8)) : new l(cVar3.d(i0.f71682i2), cVar3.d(i0.f71753mb), cVar3.d(i0.f71695j), cVar3.d(i0.E8));
                }
            }
        });
    }

    public final void S(com.dyson.mobile.android.machine.ui.permissions.c cVar) {
        g0.r(v.a(this), null, null, new d(cVar, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void T(boolean r9) {
        /*
            r8 = this;
            se1.e r0 = r8.d
            boolean r0 = r0.b()
            r1 = 0
            if (r0 == 0) goto Ld
            mj.w$a r0 = mj.w.a.NEARBY_DEVICES_PERMISSION
        Lb:
            r3 = r0
            goto L23
        Ld:
            h12.t r0 = r8.f15391k
            java.lang.Object r0 = r0.getValue()
            java.lang.String[] r0 = (java.lang.String[]) r0
            rf1.a$d r2 = rf1.a.d.f73034b
            java.lang.String[] r2 = r2.f73030a
            boolean r0 = java.util.Arrays.equals(r0, r2)
            if (r0 == 0) goto L22
            mj.w$a r0 = mj.w.a.LOCATION_PERMISSION
            goto Lb
        L22:
            r3 = r1
        L23:
            if (r3 != 0) goto L26
            return
        L26:
            mj.w r2 = new mj.w
            java.lang.String r4 = java.lang.String.valueOf(r9)
            r6 = 4
            r7 = 0
            r5 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            ij.f r9 = r2.a()
            hj.e$a r0 = hj.e.f38312g
            hj.e r8 = r8.f15387g
            r8.g(r9, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.machine.ui.permissions.a.T(boolean):void");
    }

    @Override // androidx.lifecycle.m
    public final void g(LifecycleOwner lifecycleOwner, Lifecycle.a aVar) {
        if (c.f15394a[aVar.ordinal()] == 1 && this.f15388h) {
            boolean a13 = this.f15386f.a();
            hj.e eVar = this.f15387g;
            if (!a13) {
                w.a aVar2 = w.a.DEVICE_LOCATION_PERMISSION;
                if (aVar2 == null) {
                    return;
                }
                f a14 = new w(aVar2, String.valueOf(false), null, 4, null).a();
                e.a aVar3 = hj.e.f38312g;
                eVar.g(a14, null);
                return;
            }
            this.f15388h = false;
            w.a aVar4 = w.a.DEVICE_LOCATION_PERMISSION;
            if (aVar4 != null) {
                f a15 = new w(aVar4, String.valueOf(true), null, 4, null).a();
                e.a aVar5 = hj.e.f38312g;
                eVar.g(a15, null);
            }
            S(c.a.f15397a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/permissions/a$a;", "", "<init>", "()V", "", "LINK_NAME_DEVICE_SETTINGS", "Ljava/lang/String;", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.machine.ui.permissions.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0523a {
        public /* synthetic */ C0523a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0523a() {
        }
    }
}
