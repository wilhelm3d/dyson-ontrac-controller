package com.dyson.mobile.android.machine.ui.settings.devicesharing.inviteuser;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.f;
import com.dyson.mobile.android.machine.ui.settings.devicesharing.inviteuser.b;
import h12.f0;
import h12.r;
import h2.o0;
import hx.v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import l12.d;
import l91.g;
import l91.k;
import n12.e;
import n12.i;
import u3.m0;
import u3.p1;
import z32.c0;
/* loaded from: classes3.dex */
public final class a {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.dyson.mobile.android.machine.ui.settings.devicesharing.inviteuser.DeviceSharingInviteUserStatusPopOverBannerViewKt$DeviceSharingInviteUserStatusPopOverBannerView$1$1", f = "DeviceSharingInviteUserStatusPopOverBannerView.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.dyson.mobile.android.machine.ui.settings.devicesharing.inviteuser.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0526a extends i implements Function2<c0, d<? super f0>, Object> {
        public final /* synthetic */ g d;
        public final /* synthetic */ String e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ b f15407f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ long f15408g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0526a(g gVar, String str, b bVar, long j8, d<? super C0526a> dVar) {
            super(2, dVar);
            this.d = gVar;
            this.e = str;
            this.f15407f = bVar;
            this.f15408g = j8;
        }

        @Override // n12.a
        public final d<f0> create(Object obj, d<?> dVar) {
            return new C0526a(this.d, this.e, this.f15407f, this.f15408g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c0 c0Var, d<? super f0> dVar) {
            return ((C0526a) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            r.b(obj);
            g.b(this.d, this.e, new k(((b.AbstractC0527b) this.f15407f).f15411b, this.f15408g, null), 4);
            return f0.f36844a;
        }
    }

    public static final void a(b bVar, Composer composer, int i13) {
        b bVar2;
        bVar.getClass();
        androidx.compose.runtime.a k13 = composer.k(-1505955708);
        int i14 = (k13.Q(bVar) ? 4 : 2) | i13;
        if (k13.t(i14 & 1, (i14 & 3) != 2)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            g gVar = (g) k13.A(l91.e.f51001a);
            if (bVar instanceof b.AbstractC0527b) {
                k13.R(1302199607);
                b.AbstractC0527b abstractC0527b = (b.AbstractC0527b) bVar;
                long j8 = abstractC0527b.f15412c.invoke(k13, 0).f55668a;
                String T = v.T(abstractC0527b.f15410a, 0, k13);
                boolean D = k13.D(gVar) | k13.Q(T) | ((i14 & 14) == 4) | k13.g(j8);
                Object B = k13.B();
                if (!D) {
                    Composer.f3140a.getClass();
                    if (B != Composer.a.f3142b) {
                        bVar2 = bVar;
                        m0.d(k13, bVar2, (Function2) B);
                        k13.a0(false);
                    }
                }
                bVar2 = bVar;
                C0526a c0526a = new C0526a(gVar, T, bVar2, j8, null);
                k13.u(c0526a);
                B = c0526a;
                m0.d(k13, bVar2, (Function2) B);
                k13.a0(false);
            } else {
                bVar2 = bVar;
                k13.R(1302716284);
                k13.a0(false);
            }
        } else {
            bVar2 = bVar;
            k13.J();
        }
        f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new o0(bVar2, i13, 25);
        }
    }
}
