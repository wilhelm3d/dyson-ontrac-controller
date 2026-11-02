package com.dyson.mobile.android.connectedhaircare.ui.common;

import androidx.compose.runtime.Composer;
import com.dyson.mobile.android.connectedhaircare.ui.common.b;
import h12.f0;
import h12.r;
import hz.n;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import l12.d;
import l91.g;
import l91.k;
import n12.e;
import n12.i;
import pf0.f;
import u3.m0;
import u3.p1;
import z32.c0;
/* loaded from: classes2.dex */
public final class a {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.dyson.mobile.android.connectedhaircare.ui.common.HaircarePopoverBannerViewKt$HaircarePopoverBanner$1$1", f = "HaircarePopoverBannerView.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.dyson.mobile.android.connectedhaircare.ui.common.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0373a extends i implements Function2<c0, d<? super f0>, Object> {
        public final /* synthetic */ g d;
        public final /* synthetic */ b e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ long f12935f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0373a(g gVar, b bVar, long j8, d<? super C0373a> dVar) {
            super(2, dVar);
            this.d = gVar;
            this.e = bVar;
            this.f12935f = j8;
        }

        @Override // n12.a
        public final d<f0> create(Object obj, d<?> dVar) {
            return new C0373a(this.d, this.e, this.f12935f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c0 c0Var, d<? super f0> dVar) {
            return ((C0373a) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            r.b(obj);
            b.AbstractC0374b abstractC0374b = (b.AbstractC0374b) this.e;
            g.b(this.d, f.c(abstractC0374b.f12937a), new k(abstractC0374b.f12938b, this.f12935f, null), 4);
            return f0.f36844a;
        }
    }

    public static final void a(b bVar, Composer composer, int i13) {
        b bVar2;
        bVar.getClass();
        androidx.compose.runtime.a k13 = composer.k(-887180123);
        int i14 = (k13.Q(bVar) ? 4 : 2) | i13;
        if (k13.t(i14 & 1, (i14 & 3) != 2)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            g gVar = (g) k13.A(l91.e.f51001a);
            if (bVar instanceof b.AbstractC0374b) {
                k13.R(1245943293);
                long j8 = ((b.AbstractC0374b) bVar).f12939c.invoke(k13, 0).f55668a;
                boolean D = k13.D(gVar) | ((i14 & 14) == 4) | k13.g(j8);
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
                C0373a c0373a = new C0373a(gVar, bVar2, j8, null);
                k13.u(c0373a);
                B = c0373a;
                m0.d(k13, bVar2, (Function2) B);
                k13.a0(false);
            } else {
                bVar2 = bVar;
                k13.R(1246423607);
                k13.a0(false);
            }
        } else {
            bVar2 = bVar;
            k13.J();
        }
        androidx.compose.runtime.f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new n(bVar2, i13);
        }
    }
}
