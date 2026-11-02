package com.dyson.mobile.android.machine.ui.settings.notifications.nds;

import c42.a2;
import c42.f2;
import c42.g2;
import c42.r1;
import com.paypal.android.platform.authsdk.BR;
import h12.f0;
import h12.r;
import hj.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import l12.d;
import m9.u;
import m9.v;
import n12.i;
import nl0.h;
import qh.j;
import rm0.l;
import rm0.m;
import w12.o;
import z32.c0;
import z32.g0;
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\fB+\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/settings/notifications/nds/a;", "Lm9/u;", "", "serialNumber", "Lfg0/b;", "machineApiRepository", "Lqh/j;", "accountManager", "Lhj/e;", "trackingManager", "<init>", "(Ljava/lang/String;Lfg0/b;Lqh/j;Lhj/e;)V", "b", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a extends u {
    public final String d;
    public final fg0.b e;

    /* renamed from: f  reason: collision with root package name */
    public final j f15509f;

    /* renamed from: g  reason: collision with root package name */
    public final e f15510g;

    /* renamed from: h  reason: collision with root package name */
    public final f2 f15511h;

    /* renamed from: i  reason: collision with root package name */
    public final f2 f15512i;

    /* renamed from: j  reason: collision with root package name */
    public final f2 f15513j;

    /* renamed from: k  reason: collision with root package name */
    public final j42.c f15514k;

    /* renamed from: l  reason: collision with root package name */
    public final r1 f15515l;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.machine.ui.settings.notifications.nds.NotificationsOptionsViewModel$1", f = "NotificationsOptionsViewModel.kt", l = {BR.progressRange}, m = "invokeSuspend", v = 2)
    /* renamed from: com.dyson.mobile.android.machine.ui.settings.notifications.nds.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0533a extends i implements Function2<c0, d<? super f0>, Object> {
        public int d;

        public C0533a(d<? super C0533a> dVar) {
            super(2, dVar);
        }

        @Override // n12.a
        public final d<f0> create(Object obj, d<?> dVar) {
            return new C0533a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c0 c0Var, d<? super f0> dVar) {
            return ((C0533a) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            int i13 = this.d;
            if (i13 == 0) {
                r.b(obj);
                this.d = 1;
                if (a.S(a.this, this) == aVar) {
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

    @wy1.a
    /* loaded from: classes3.dex */
    public interface b {
        a a(String str);
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00002\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lnl0/h;", "", "Lrm0/a;", "optionsState", "", "listEnabled", "showAlert", "Lrm0/l;", "<anonymous>", "(Lnl0/h;ZZ)Lnl0/h;"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.machine.ui.settings.notifications.nds.NotificationsOptionsViewModel$viewState$1", f = "NotificationsOptionsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    /* loaded from: classes3.dex */
    public static final class c extends i implements o<h<? extends List<? extends rm0.a>>, Boolean, Boolean, d<? super h<? extends l>>, Object> {
        public /* synthetic */ h d;
        public /* synthetic */ boolean e;

        /* renamed from: f  reason: collision with root package name */
        public /* synthetic */ boolean f15516f;

        public c(d<? super c> dVar) {
            super(4, dVar);
        }

        @Override // w12.o
        public final Object invoke(h<? extends List<? extends rm0.a>> hVar, Boolean bool, Boolean bool2, d<? super h<? extends l>> dVar) {
            boolean booleanValue = bool.booleanValue();
            boolean booleanValue2 = bool2.booleanValue();
            c cVar = new c(dVar);
            cVar.d = hVar;
            cVar.e = booleanValue;
            cVar.f15516f = booleanValue2;
            return cVar.invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            h hVar = this.d;
            boolean z13 = this.e;
            boolean z14 = this.f15516f;
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            r.b(obj);
            if (hVar instanceof h.b) {
                return h.b.f57897a;
            }
            if (hVar instanceof h.a) {
                return new h.a(((h.a) hVar).f57896a);
            }
            if (hVar instanceof h.c) {
                return new h.c(new l(z13, z14, (List) ((h.c) hVar).f57898a));
            }
            if (x12.r.c(hVar, h.d.f57899a)) {
                return h.b.f57897a;
            }
            ma.e.o();
            return null;
        }
    }

    public a(String str, fg0.b bVar, j jVar, e eVar) {
        str.getClass();
        bVar.getClass();
        jVar.getClass();
        eVar.getClass();
        this.d = str;
        this.e = bVar;
        this.f15509f = jVar;
        this.f15510g = eVar;
        h.b bVar2 = h.b.f57897a;
        f2 a13 = g2.a(bVar2);
        this.f15511h = a13;
        f2 a14 = g2.a(Boolean.TRUE);
        this.f15512i = a14;
        f2 a15 = g2.a(Boolean.FALSE);
        this.f15513j = a15;
        this.f15514k = j42.d.a();
        this.f15515l = c42.r.D(c42.r.j(a13, a14, a15, new c(null)), v.a(this), a2.a.a(a2.f10222a, 0L, 3), bVar2);
        g0.r(v.a(this), null, null, new C0533a(null), 3);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:1|(2:3|(7:5|6|7|(1:(1:10)(2:42|43))(5:44|45|(1:47)|48|(1:50))|11|12|(6:18|(1:20)|21|(4:23|(7:26|(1:36)|30|(2:33|31)|34|35|24)|37|38)|39|40)(1:16)))|53|6|7|(0)(0)|11|12|(1:14)|18|(0)|21|(0)|39|40) */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002a, code lost:
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
        r1 = h12.q.e;
        r12 = new h12.q.b(r12);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object S(com.dyson.mobile.android.machine.ui.settings.notifications.nds.a r11, n12.c r12) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.machine.ui.settings.notifications.nds.a.S(com.dyson.mobile.android.machine.ui.settings.notifications.nds.a, n12.c):java.lang.Object");
    }

    public static final void T(a aVar, String str, boolean z13) {
        Object value;
        Object obj;
        f2 f2Var = aVar.f15511h;
        do {
            value = f2Var.getValue();
            obj = (h) value;
            if (obj instanceof h.c) {
                Iterable<rm0.a> iterable = (Iterable) ((h.c) obj).f57898a;
                ArrayList arrayList = new ArrayList(i12.u.o(iterable, 10));
                for (rm0.a aVar2 : iterable) {
                    List<m> list = aVar2.f73417b;
                    ArrayList arrayList2 = new ArrayList(i12.u.o(list, 10));
                    for (m mVar : list) {
                        if (mVar.f73439b.equals(str)) {
                            mVar = new m(mVar.f73438a, mVar.f73439b, mVar.f73440c, z13);
                        }
                        arrayList2.add(mVar);
                    }
                    arrayList.add(new rm0.a(aVar2.f73416a, arrayList2));
                }
                obj = new h.c(arrayList);
            }
        } while (!f2Var.f(value, obj));
    }
}
