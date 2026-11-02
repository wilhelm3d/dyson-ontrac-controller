package com.dyson.mobile.android.support.forsta.survey;

import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.lifecycle.ViewModelProvider;
import bm.z;
import com.dyson.mobile.android.support.forsta.ForstaSurveyConfig;
import com.dyson.mobile.android.support.forsta.survey.d;
import e6.f;
import ef1.g;
import g5.t1;
import h12.f0;
import h12.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.UninitializedPropertyAccessException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m9.u;
import n12.i;
import os0.o;
import r3.c7;
import r3.ha;
import u3.k1;
import u3.p1;
import x12.p;
/* loaded from: classes3.dex */
public final class b {

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/support/forsta/survey/b$a", "Landroidx/lifecycle/ViewModelProvider$Factory;", "mod-utilities"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements ViewModelProvider.Factory {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ForstaSurveyConfig f16832a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ List f16833b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ q71.c f16834c;

        public a(ForstaSurveyConfig forstaSurveyConfig, List list, q71.c cVar) {
            this.f16832a = forstaSurveyConfig;
            this.f16833b = list;
            this.f16834c = cVar;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [com.dyson.mobile.android.support.forsta.survey.d$a, VMF] */
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public final <T extends u> T create(Class<T> cls) {
            cls.getClass();
            if (d.a.class.isAnnotationPresent(wy1.a.class)) {
                ef1.a aVar = new ef1.a();
                aVar.f26823a = (d.a) ((q71.b) this.f16834c).Y.f88315a;
                try {
                    return ((d.a) aVar.a()).a(this.f16832a, this.f16833b);
                } catch (UninitializedPropertyAccessException unused) {
                    throw new ef1.b();
                }
            }
            throw new g();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/dyson/mobile/android/support/forsta/survey/d$b;", "navigationEvent", "Lh12/f0;", "<anonymous>", "(Lcom/dyson/mobile/android/support/forsta/survey/d$b;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.support.forsta.survey.ForstaSurveyBottomSheetKt$ForstaSurveyBottomSheet$1$1", f = "ForstaSurveyBottomSheet.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.dyson.mobile.android.support.forsta.survey.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0607b extends i implements Function2<d.b, l12.d<? super f0>, Object> {
        public /* synthetic */ Object d;
        public final /* synthetic */ Function1<Boolean, f0> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0607b(Function1<? super Boolean, f0> function1, l12.d<? super C0607b> dVar) {
            super(2, dVar);
            this.e = function1;
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            C0607b c0607b = new C0607b(this.e, dVar);
            c0607b.d = obj;
            return c0607b;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(d.b bVar, l12.d<? super f0> dVar) {
            return ((C0607b) create(bVar, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            d.b bVar = (d.b) this.d;
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            r.b(obj);
            if (!(bVar instanceof d.b.a)) {
                ma.e.o();
                return null;
            }
            this.e.invoke(Boolean.valueOf(((d.b.a) bVar).f16840a));
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class c extends p implements Function1<d.c, f0> {
        public c(Object obj) {
            super(1, obj, d.class, "onUiEvent", "onUiEvent(Lcom/dyson/mobile/android/support/forsta/survey/ForstaSurveyViewModel$UiEvent;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final f0 invoke(d.c cVar) {
            d.c cVar2 = cVar;
            cVar2.getClass();
            ((d) this.receiver).S(cVar2);
            return f0.f36844a;
        }
    }

    public static final void a(d.InterfaceC0610d interfaceC0610d, Function1 function1, hu0.e eVar, Modifier modifier, Composer composer, int i13) {
        float f13;
        interfaceC0610d.getClass();
        function1.getClass();
        androidx.compose.runtime.a k13 = composer.k(2042361910);
        int i14 = i13 | (k13.Q(interfaceC0610d) ? 4 : 2) | (k13.D(function1) ? 32 : 16) | (k13.D(eVar) ? 256 : 128);
        if (k13.t(i14 & 1, (i14 & 1171) != 1170)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            o a13 = os0.p.a(k13);
            float f14 = a13.d;
            float density = ((e6.c) k13.A(t1.f33310h)).getDensity();
            Object B = k13.B();
            Composer.f3140a.getClass();
            Composer.a.C0094a c0094a = Composer.a.f3142b;
            if (B == c0094a) {
                B = androidx.compose.runtime.d.j(f.a(0.75f * f14));
                k13.u(B);
            }
            k1 k1Var = (k1) B;
            if (x12.r.c(a13.f61516b, o.a.b.f61519a)) {
                k1Var.setValue(f.a(f14 * 0.5f));
                f13 = 0.8f;
            } else {
                if (0.0f <= density && density <= 2.0f) {
                    k1Var.setValue(f.a(f14 * 0.9f));
                }
                f13 = 0.9f;
            }
            boolean d = k13.d(((f) k1Var.getValue()).d);
            Object B2 = k13.B();
            if (d || B2 == c0094a) {
                B2 = androidx.compose.runtime.d.j(f.a(((f) k1Var.getValue()).d));
                k13.u(B2);
            }
            k1 k1Var2 = (k1) B2;
            Object B3 = k13.B();
            if (B3 == c0094a) {
                B3 = androidx.compose.runtime.d.j(f.a(((f) k1Var2.getValue()).d * f13));
                k13.u(B3);
            }
            k1 k1Var3 = (k1) B3;
            ha f15 = c7.f(6, 2, k13);
            boolean z13 = (i14 & com.salesforce.marketingcloud.analytics.stats.b.f20728p) == 32;
            Object B4 = k13.B();
            if (z13 || B4 == c0094a) {
                B4 = new xz0.g(function1, 24);
                k13.u(B4);
            }
            n91.g.b("", (w12.a) B4, modifier, null, 0L, f15, null, null, c4.d.c(-868416456, new z(interfaceC0610d, function1, eVar, k1Var3, 27), k13), k13, 100663686, 216);
        } else {
            k13.J();
        }
        androidx.compose.runtime.f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new sa1.a(interfaceC0610d, function1, eVar, modifier, i13, 18);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0084, code lost:
        if (r12 == androidx.compose.runtime.Composer.a.f3142b) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(kotlin.jvm.functions.Function1<? super java.lang.Boolean, h12.f0> r9, java.util.List<java.lang.String> r10, com.dyson.mobile.android.support.forsta.ForstaSurveyConfig r11, androidx.compose.runtime.Composer r12, int r13) {
        /*
            r9.getClass()
            r11.getClass()
            r0 = 100178297(0x5f89979, float:2.3378185E-35)
            androidx.compose.runtime.a r4 = r12.k(r0)
            boolean r12 = r4.D(r9)
            r0 = 4
            if (r12 == 0) goto L16
            r12 = r0
            goto L17
        L16:
            r12 = 2
        L17:
            r12 = r12 | r13
            boolean r1 = r4.D(r10)
            if (r1 == 0) goto L21
            r1 = 32
            goto L23
        L21:
            r1 = 16
        L23:
            r12 = r12 | r1
            r1 = r12 & 147(0x93, float:2.06E-43)
            r2 = 146(0x92, float:2.05E-43)
            r7 = 0
            r3 = 1
            if (r1 == r2) goto L2e
            r1 = r3
            goto L2f
        L2e:
            r1 = r7
        L2f:
            r2 = r12 & 1
            boolean r1 = r4.t(r2, r1)
            if (r1 == 0) goto Lbc
            u3.p1 r1 = androidx.compose.runtime.b.f3172a
            e71.n$a r1 = e71.n.f26183r
            r1.getClass()
            q71.c r1 = e71.n.a.b()
            r9.a r2 = r9.a.f70754a
            r2.getClass()
            m9.w r2 = r9.a.a(r4)
            if (r2 == 0) goto Lb6
            boolean r5 = r2 instanceof androidx.lifecycle.g
            if (r5 == 0) goto L59
            r5 = r2
            androidx.lifecycle.g r5 = (androidx.lifecycle.g) r5
            androidx.lifecycle.viewmodel.CreationExtras r5 = r5.getDefaultViewModelCreationExtras()
            goto L5b
        L59:
            androidx.lifecycle.viewmodel.CreationExtras$b r5 = androidx.lifecycle.viewmodel.CreationExtras.b.f4572c
        L5b:
            com.dyson.mobile.android.support.forsta.survey.b$a r6 = new com.dyson.mobile.android.support.forsta.survey.b$a
            r6.<init>(r11, r10, r1)
            java.lang.Class<com.dyson.mobile.android.support.forsta.survey.d> r1 = com.dyson.mobile.android.support.forsta.survey.d.class
            x12.q0 r8 = x12.p0.f86717a
            e22.d r1 = r8.b(r1)
            m9.u r1 = r9.b.a(r1, r2, r6, r5, r4)
            r8 = r1
            com.dyson.mobile.android.support.forsta.survey.d r8 = (com.dyson.mobile.android.support.forsta.survey.d) r8
            c42.e r1 = r8.f16839j
            r12 = r12 & 14
            if (r12 != r0) goto L76
            goto L77
        L76:
            r3 = r7
        L77:
            java.lang.Object r12 = r4.B()
            if (r3 != 0) goto L86
            androidx.compose.runtime.Composer$a r0 = androidx.compose.runtime.Composer.f3140a
            r0.getClass()
            androidx.compose.runtime.Composer$a$a r0 = androidx.compose.runtime.Composer.a.f3142b
            if (r12 != r0) goto L8f
        L86:
            com.dyson.mobile.android.support.forsta.survey.b$b r12 = new com.dyson.mobile.android.support.forsta.survey.b$b
            r0 = 0
            r12.<init>(r9, r0)
            r4.u(r12)
        L8f:
            r3 = r12
            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
            r5 = 0
            r6 = 2
            r2 = 0
            af1.b.a(r1, r2, r3, r4, r5, r6)
            c42.r1 r12 = r8.f16837h
            u3.k1 r12 = n9.b.c(r12, r4)
            boolean r0 = r11.isSurveyInDarkTheme()
            xz0.f r1 = new xz0.f
            r2 = 11
            r1.<init>(r2, r8, r12)
            r12 = -1882046605(0xffffffff8fd23f73, float:-2.0732039E-29)
            c4.c r12 = c4.d.c(r12, r1, r4)
            r1 = 48
            md1.d.a(r0, r12, r4, r1, r7)
            goto Lbf
        Lb6:
            java.lang.String r9 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner"
            pa.c.w(r9)
            return
        Lbc:
            r4.J()
        Lbf:
            androidx.compose.runtime.f r12 = r4.c0()
            if (r12 == 0) goto Lcc
            x20.c r0 = new x20.c
            r0.<init>(r9, r10, r11, r13)
            r12.d = r0
        Lcc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.support.forsta.survey.b.b(kotlin.jvm.functions.Function1, java.util.List, com.dyson.mobile.android.support.forsta.ForstaSurveyConfig, androidx.compose.runtime.Composer, int):void");
    }
}
