package com.dyson.mobile.android.audio.home.customisation;

import a90.b0;
import ac0.o;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.w;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.brightcove.player.C;
import com.dyson.mobile.android.audio.home.customisation.d;
import com.dyson.mobile.android.audio.home.customisation.k;
import com.dyson.mobile.android.audio.home.customisation.m;
import com.dyson.mobile.android.localisation.LocalisationKey;
import com.dyson.nst.dyson3d.schema.SchemaSceneManager;
import e6.f;
import f5.g;
import f5.i0;
import g4.c;
import g5.p2;
import g5.t1;
import ga0.a0;
import gl.n;
import h12.f0;
import h12.r;
import j2.s1;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import n4.c1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import rf0.p;
import u3.k1;
import u3.m0;
import u3.o3;
import u3.p1;
import u3.w1;
import z32.c0;
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final float f12478a;

    /* renamed from: b  reason: collision with root package name */
    public static final float f12479b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f12480c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.audio.home.customisation.CustomisationScreenKt$ApplyFinish$1$1$1", f = "CustomisationScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class a extends n12.i implements Function2<c0, l12.d<? super f0>, Object> {
        public final /* synthetic */ SchemaSceneManager d;
        public final /* synthetic */ String e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SchemaSceneManager schemaSceneManager, String str, l12.d<? super a> dVar) {
            super(2, dVar);
            this.d = schemaSceneManager;
            this.e = str;
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            return new a(this.d, this.e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
            return ((a) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            r.b(obj);
            this.d.getFinishCoordinator().apply(this.e);
            return f0.f36844a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.audio.home.customisation.CustomisationScreenKt$CustomisationScreen$1$1$2$1", f = "CustomisationScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class b extends n12.i implements Function2<c0, l12.d<? super f0>, Object> {
        public final /* synthetic */ Function1<d, f0> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super d, f0> function1, l12.d<? super b> dVar) {
            super(2, dVar);
            this.d = function1;
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            return new b(this.d, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
            return ((b) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            r.b(obj);
            this.d.invoke(d.C0345d.f12475a);
            return f0.f36844a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.audio.home.customisation.CustomisationScreenKt$RotationHint$1$1", f = "CustomisationScreen.kt", l = {372, 374}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class c extends n12.i implements Function2<c0, l12.d<? super f0>, Object> {
        public int d;
        public final /* synthetic */ boolean e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ SchemaSceneManager f12481f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ k1<Boolean> f12482g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z13, SchemaSceneManager schemaSceneManager, k1<Boolean> k1Var, l12.d<? super c> dVar) {
            super(2, dVar);
            this.e = z13;
            this.f12481f = schemaSceneManager;
            this.f12482g = k1Var;
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            return new c(this.e, this.f12481f, this.f12482g, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
            return ((c) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
            if (z32.n0.c(r6, r8) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
            if (z32.n0.c(r1, r8) == r0) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0057, code lost:
            return r0;
         */
        @Override // n12.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                m12.a r0 = m12.a.COROUTINE_SUSPENDED
                int r1 = r8.d
                com.dyson.nst.dyson3d.schema.SchemaSceneManager r2 = r8.f12481f
                r3 = 2
                u3.k1<java.lang.Boolean> r4 = r8.f12482g
                r5 = 1
                if (r1 == 0) goto L1f
                if (r1 == r5) goto L1b
                if (r1 != r3) goto L14
                h12.r.b(r9)
                goto L58
            L14:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                pa.c.w(r8)
                r8 = 0
                return r8
            L1b:
                h12.r.b(r9)
                goto L3e
            L1f:
                h12.r.b(r9)
                com.dyson.mobile.android.audio.home.customisation.e.f12480c = r5
                boolean r9 = r8.e
                if (r9 != 0) goto L60
                java.lang.Boolean r9 = java.lang.Boolean.TRUE
                r4.setValue(r9)
                w32.b$a r9 = w32.b.e
                w32.e r9 = w32.e.SECONDS
                long r6 = w32.d.g(r5, r9)
                r8.d = r5
                java.lang.Object r9 = z32.n0.c(r6, r8)
                if (r9 != r0) goto L3e
                goto L57
            L3e:
                com.dyson.nst.dyson3d.schema.SceneAnimationCoordinator r9 = r2.getAnimationCoordinator()
                java.lang.String r1 = "interaction_hint_wiggle"
                r9.playAnimation(r1)
                w32.b$a r9 = w32.b.e
                w32.e r9 = w32.e.SECONDS
                long r1 = w32.d.g(r5, r9)
                r8.d = r3
                java.lang.Object r8 = z32.n0.c(r1, r8)
                if (r8 != r0) goto L58
            L57:
                return r0
            L58:
                float r8 = com.dyson.mobile.android.audio.home.customisation.e.f12478a
                java.lang.Boolean r8 = java.lang.Boolean.FALSE
                r4.setValue(r8)
                goto L91
            L60:
                com.dyson.nst.dyson3d.schema.SceneAnimationCoordinator r8 = r2.getAnimationCoordinator()
                jg1.b r8 = r8.getScene()
                if (r8 == 0) goto L8c
                java.util.ArrayList<tg1.f> r8 = r8.f45128c
                java.util.List r8 = i12.c0.A0(r8)
                if (r8 == 0) goto L8c
                java.util.Iterator r8 = r8.iterator()
            L76:
                boolean r9 = r8.hasNext()
                if (r9 == 0) goto L8c
                java.lang.Object r9 = r8.next()
                tg1.f r9 = (tg1.f) r9
                ug1.a r9 = r9.k()
                java.util.Set<kg1.a<NodeType>> r9 = r9.f82020a
                r9.clear()
                goto L76
            L8c:
                java.lang.Boolean r8 = java.lang.Boolean.FALSE
                r4.setValue(r8)
            L91:
                h12.f0 r8 = h12.f0.f36844a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.audio.home.customisation.e.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        f.a aVar = e6.f.e;
        f12478a = 246.0f;
        f12479b = 48.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0080, code lost:
        if (r1 == androidx.compose.runtime.Composer.a.f3142b) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.dyson.nst.dyson3d.schema.SchemaSceneManager r7, java.lang.String r8, androidx.compose.runtime.Composer r9, int r10) {
        /*
            r0 = -1458082182(0xffffffffa9176e7a, float:-3.362456E-14)
            androidx.compose.runtime.a r9 = r9.k(r0)
            r0 = r10 & 6
            r1 = 4
            if (r0 != 0) goto L20
            r0 = r10 & 8
            if (r0 != 0) goto L15
            boolean r0 = r9.Q(r7)
            goto L19
        L15:
            boolean r0 = r9.D(r7)
        L19:
            if (r0 == 0) goto L1d
            r0 = r1
            goto L1e
        L1d:
            r0 = 2
        L1e:
            r0 = r0 | r10
            goto L21
        L20:
            r0 = r10
        L21:
            r2 = r10 & 48
            r3 = 32
            if (r2 != 0) goto L32
            boolean r2 = r9.Q(r8)
            if (r2 == 0) goto L2f
            r2 = r3
            goto L31
        L2f:
            r2 = 16
        L31:
            r0 = r0 | r2
        L32:
            r2 = r0 & 19
            r4 = 18
            r5 = 0
            r6 = 1
            if (r2 == r4) goto L3c
            r2 = r6
            goto L3d
        L3c:
            r2 = r5
        L3d:
            r4 = r0 & 1
            boolean r2 = r9.t(r4, r2)
            if (r2 == 0) goto L94
            u3.p1 r2 = androidx.compose.runtime.b.f3172a
            if (r8 != 0) goto L53
            r0 = 1573040504(0x5dc2b178, float:1.7536408E18)
            r9.R(r0)
            r9.a0(r5)
            goto L97
        L53:
            r2 = 1573040505(0x5dc2b179, float:1.7536409E18)
            r9.R(r2)
            r2 = r0 & 14
            if (r2 == r1) goto L6a
            r1 = r0 & 8
            if (r1 == 0) goto L68
            boolean r1 = r9.D(r7)
            if (r1 == 0) goto L68
            goto L6a
        L68:
            r1 = r5
            goto L6b
        L6a:
            r1 = r6
        L6b:
            r0 = r0 & 112(0x70, float:1.57E-43)
            if (r0 != r3) goto L70
            goto L71
        L70:
            r6 = r5
        L71:
            r0 = r1 | r6
            java.lang.Object r1 = r9.B()
            if (r0 != 0) goto L82
            androidx.compose.runtime.Composer$a r0 = androidx.compose.runtime.Composer.f3140a
            r0.getClass()
            androidx.compose.runtime.Composer$a$a r0 = androidx.compose.runtime.Composer.a.f3142b
            if (r1 != r0) goto L8b
        L82:
            com.dyson.mobile.android.audio.home.customisation.e$a r1 = new com.dyson.mobile.android.audio.home.customisation.e$a
            r0 = 0
            r1.<init>(r7, r8, r0)
            r9.u(r1)
        L8b:
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            u3.m0.d(r9, r8, r1)
            r9.a0(r5)
            goto L97
        L94:
            r9.J()
        L97:
            androidx.compose.runtime.f r9 = r9.c0()
            if (r9 == 0) goto La6
            ac0.m r0 = new ac0.m
            r1 = 11
            r0.<init>(r7, r8, r10, r1)
            r9.d = r0
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.audio.home.customisation.e.a(com.dyson.nst.dyson3d.schema.SchemaSceneManager, java.lang.String, androidx.compose.runtime.Composer, int):void");
    }

    public static final void b(SchemaSceneManager schemaSceneManager, gl.h hVar, Composer composer, int i13) {
        int i14;
        androidx.compose.runtime.a k13 = composer.k(2054901224);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? k13.Q(schemaSceneManager) : k13.D(schemaSceneManager) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= k13.Q(hVar) ? 32 : 16;
        }
        if (k13.t(i14 & 1, (i14 & 19) != 18)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            String str = hVar.f35123a;
            int i15 = (i14 & 14) | SchemaSceneManager.$stable;
            a(schemaSceneManager, str, k13, i15);
            a(schemaSceneManager, hVar.f35124b, k13, i15);
            a(schemaSceneManager, hVar.f35125c, k13, i15);
            a(schemaSceneManager, hVar.d, k13, i15);
            a(schemaSceneManager, hVar.e, k13, i15);
        } else {
            k13.J();
        }
        androidx.compose.runtime.f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new ac0.m(schemaSceneManager, hVar, i13, 10);
        }
    }

    public static final void c(k.d dVar, boolean z13, Function1<? super d, f0> function1, Composer composer, int i13) {
        androidx.compose.runtime.a k13 = composer.k(764453146);
        int i14 = (k13.D(dVar) ? 4 : 2) | i13;
        if ((i13 & 48) == 0) {
            i14 |= k13.c(z13) ? 32 : 16;
        }
        if ((i13 & MLKEMEngine.KyberPolyBytes) == 0) {
            i14 |= k13.D(function1) ? 256 : 128;
        }
        if (k13.t(i14 & 1, (i14 & 147) != 146)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            vd1.a.b(c4.d.c(1564289999, new az0.e(function1, 4), k13), androidx.compose.ui.platform.j.a(Modifier.f3231b, "TAG_CUSTOMISATION_CONTROLS"), null, c4.d.c(1643007157, new gl.l(dVar, function1, z13, 0), k13), k13, 3126, 4);
        } else {
            k13.J();
        }
        androidx.compose.runtime.f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new gl.m(dVar, z13, function1, i13, 0);
        }
    }

    public static final void d(Composer composer, int i13) {
        androidx.compose.runtime.a k13 = composer.k(256028729);
        if (k13.t(i13 & 1, i13 != 0)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            Modifier.a aVar = Modifier.f3231b;
            FillElement fillElement = w.f2903c;
            aVar.u(fillElement);
            md1.b.f53765a.getClass();
            Modifier b13 = androidx.compose.foundation.a.b(fillElement, md1.b.a(k13).f41047a.f41064a, c1.f55579a);
            g4.c.f33023a.getClass();
            d5.c0 d = p2.i.d(c.a.f33027f, false);
            int hashCode = Long.hashCode(k13.U);
            w1 U = k13.U();
            Modifier c13 = androidx.compose.ui.c.c(k13, b13);
            f5.g.f29643z0.getClass();
            i0.a aVar2 = g.a.f29645b;
            if (k13.f3143b == null) {
                u3.h.s();
                throw null;
            }
            k13.G();
            if (k13.T) {
                k13.i(aVar2);
            } else {
                k13.s();
            }
            o3.a(k13, d, g.a.f29648g);
            o3.a(k13, U, g.a.f29647f);
            g.a.C0974a c0974a = g.a.f29651j;
            if (k13.T || !x12.r.c(k13.B(), Integer.valueOf(hashCode))) {
                x1.i.m(hashCode, k13, hashCode, c0974a);
            }
            o3.a(k13, c13, g.a.d);
            androidx.compose.foundation.layout.e eVar = androidx.compose.foundation.layout.e.f2852a;
            ya1.b.a(0, 25, k13, null, pf0.f.c(p.f72286g1), pf0.f.c(p.f72289h1), null, null);
            k13.a0(true);
        } else {
            k13.J();
        }
        androidx.compose.runtime.f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new a0(i13, 16);
        }
    }

    public static final void e(Composer composer, int i13) {
        androidx.compose.runtime.a k13 = composer.k(-2084051859);
        if (k13.t(i13 & 1, i13 != 0)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            Modifier.a aVar = Modifier.f3231b;
            FillElement fillElement = w.f2903c;
            aVar.u(fillElement);
            md1.b.f53765a.getClass();
            Modifier b13 = androidx.compose.foundation.a.b(fillElement, md1.b.a(k13).f41047a.f41064a, c1.f55579a);
            g4.c.f33023a.getClass();
            d5.c0 d = p2.i.d(c.a.f33027f, false);
            int hashCode = Long.hashCode(k13.U);
            w1 U = k13.U();
            Modifier c13 = androidx.compose.ui.c.c(k13, b13);
            f5.g.f29643z0.getClass();
            i0.a aVar2 = g.a.f29645b;
            if (k13.f3143b == null) {
                u3.h.s();
                throw null;
            }
            k13.G();
            if (k13.T) {
                k13.i(aVar2);
            } else {
                k13.s();
            }
            o3.a(k13, d, g.a.f29648g);
            o3.a(k13, U, g.a.f29647f);
            g.a.C0974a c0974a = g.a.f29651j;
            if (k13.T || !x12.r.c(k13.B(), Integer.valueOf(hashCode))) {
                x1.i.m(hashCode, k13, hashCode, c0974a);
            }
            o3.a(k13, c13, g.a.d);
            androidx.compose.foundation.layout.e eVar = androidx.compose.foundation.layout.e.f2852a;
            sc1.a.a(sc1.b.Large, null, k13, 6, 2);
            k13.a0(true);
        } else {
            k13.J();
        }
        androidx.compose.runtime.f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new a0(i13, 17);
        }
    }

    public static final void f(m mVar, k kVar, boolean z13, Function1<? super d, f0> function1, w12.a<f0> aVar, w12.a<f0> aVar2, Composer composer, int i13) {
        int i14;
        boolean z14;
        Object obj;
        androidx.compose.runtime.a aVar3;
        mVar.getClass();
        kVar.getClass();
        function1.getClass();
        androidx.compose.runtime.a k13 = composer.k(-881759050);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? k13.Q(mVar) : k13.D(mVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? k13.Q(kVar) : k13.D(kVar) ? 32 : 16;
        }
        if ((i13 & MLKEMEngine.KyberPolyBytes) == 0) {
            z14 = z13;
            i14 |= k13.c(z14) ? 256 : 128;
        } else {
            z14 = z13;
        }
        if ((i13 & 3072) == 0) {
            obj = function1;
            i14 |= k13.D(obj) ? 2048 : 1024;
        } else {
            obj = function1;
        }
        if ((i13 & 24576) == 0) {
            i14 |= k13.D(aVar) ? 16384 : C.DASH_ROLE_ALTERNATE_FLAG;
        }
        if ((196608 & i13) == 0) {
            i14 |= k13.D(aVar2) ? C.DASH_ROLE_COMMENTARY_FLAG : C.DASH_ROLE_SUPPLEMENTARY_FLAG;
        }
        int i15 = i14;
        if (k13.t(i15 & 1, (74899 & i15) != 74898)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            Boolean bool = (Boolean) k13.A(p2.f33261a);
            boolean booleanValue = bool.booleanValue();
            Object B = k13.B();
            Composer.f3140a.getClass();
            if (B == Composer.a.f3142b) {
                B = androidx.compose.runtime.d.j(bool);
                k13.u(B);
            }
            k1 k1Var = (k1) B;
            aVar3 = k13;
            qs0.c.a(pf0.f.c(p.f72278d1), "TAG_CUSTOMISATION_SCREEN", null, ((mVar instanceof m.a) && (kVar instanceof k.d) && ((Boolean) k1Var.getValue()).booleanValue()) ? xc1.j.SURFACE : xc1.j.BACKGROUND, aVar, aVar2, null, c4.d.c(-92600380, new ed1.e(mVar, kVar, obj, z14, booleanValue, k1Var, 2), k13), aVar3, (57344 & i15) | 12582960 | (458752 & i15), 68);
        } else {
            aVar3 = k13;
            aVar3.J();
        }
        androidx.compose.runtime.f c03 = aVar3.c0();
        if (c03 != null) {
            c03.d = new d90.m(mVar, kVar, z13, function1, aVar, aVar2, i13);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c9, code lost:
        if (r4 == androidx.compose.runtime.Composer.a.f3142b) goto L77;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(p2.l r32, com.dyson.nst.dyson3d.schema.model.Schema r33, com.dyson.mobile.android.audio.home.customisation.k r34, w12.a<h12.f0> r35, androidx.compose.runtime.Composer r36, int r37) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.audio.home.customisation.e.g(p2.l, com.dyson.nst.dyson3d.schema.model.Schema, com.dyson.mobile.android.audio.home.customisation.k, w12.a, androidx.compose.runtime.Composer, int):void");
    }

    public static final void h(String str, List<gl.i> list, List<gl.i> list2, h12.p<String, String> pVar, boolean z13, String str2, Function2<? super String, ? super Boolean, f0> function2, Composer composer, int i13) {
        androidx.compose.runtime.a k13 = composer.k(2057372243);
        int i14 = i13 | (k13.Q(str) ? 4 : 2) | (k13.D(list) ? 32 : 16) | (k13.D(list2) ? 256 : 128) | (k13.Q(pVar) ? 2048 : 1024) | (k13.c(z13) ? 16384 : C.DASH_ROLE_ALTERNATE_FLAG) | (k13.D(function2) ? 1048576 : 524288);
        if (k13.t(i14 & 1, (599187 & i14) != 599186)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            xd1.e.b(androidx.compose.ui.platform.j.a(Modifier.f3231b, str2), c4.d.c(1069796563, new b0(str, pVar, z13), k13), c4.d.c(-2114413426, new d90.l(list, pVar, str2, function2, z13, list2), k13), k13, 432);
        } else {
            k13.J();
        }
        androidx.compose.runtime.f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new o(str, list, list2, pVar, z13, str2, function2, i13);
        }
    }

    public static final void i(p2.l lVar, SchemaSceneManager schemaSceneManager, boolean z13, Composer composer, int i13) {
        int i14;
        androidx.compose.runtime.a k13 = composer.k(-525710474);
        if ((i13 & 6) == 0) {
            i14 = (k13.Q(lVar) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? k13.Q(schemaSceneManager) : k13.D(schemaSceneManager) ? 32 : 16;
        }
        if ((i13 & MLKEMEngine.KyberPolyBytes) == 0) {
            i14 |= k13.c(z13) ? 256 : 128;
        }
        boolean z14 = false;
        if (k13.t(i14 & 1, (i14 & 147) != 146)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            Object B = k13.B();
            Composer.f3140a.getClass();
            Composer.a.C0094a c0094a = Composer.a.f3142b;
            if (B == c0094a) {
                B = androidx.compose.runtime.d.j(Boolean.FALSE);
                k13.u(B);
            }
            k1 k1Var = (k1) B;
            Boolean valueOf = Boolean.valueOf(z13);
            boolean z15 = (i14 & 896) == 256;
            if ((i14 & com.salesforce.marketingcloud.analytics.stats.b.f20728p) == 32 || ((i14 & 64) != 0 && k13.D(schemaSceneManager))) {
                z14 = true;
            }
            boolean z16 = z15 | z14;
            Object B2 = k13.B();
            if (z16 || B2 == c0094a) {
                B2 = new c(z13, schemaSceneManager, k1Var, null);
                k13.u(B2);
            }
            m0.d(k13, valueOf, (Function2) B2);
            boolean booleanValue = ((Boolean) k1Var.getValue()).booleanValue();
            Modifier.a aVar = Modifier.f3231b;
            g4.c.f33023a.getClass();
            Modifier h13 = lVar.h(aVar, c.a.f33030i);
            md1.b.f53765a.getClass();
            Modifier u8 = androidx.compose.foundation.layout.d.u(h13, 0.0f, 0.0f, 0.0f, md1.b.f53766b.e.f41188b, 7);
            com.dyson.mobile.android.audio.home.customisation.c.f12465a.getClass();
            se1.b.a(booleanValue, u8, null, null, null, com.dyson.mobile.android.audio.home.customisation.c.f12467c, k13, 196608, 28);
        } else {
            k13.J();
        }
        androidx.compose.runtime.f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new gl.m(lVar, schemaSceneManager, z13, i13, 1);
        }
    }

    public static final void j(boolean z13, Function1<? super Boolean, f0> function1, Composer composer, int i13) {
        androidx.compose.runtime.a k13 = composer.k(1892742269);
        int i14 = (k13.c(z13) ? 4 : 2) | i13 | (k13.D(function1) ? 32 : 16);
        if (k13.t(i14 & 1, (i14 & 19) != 18)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            xd1.a.a(null, null, null, null, null, null, c4.d.c(-266348211, new n(z13, function1, 0), k13), k13, 12582912, 127);
        } else {
            k13.J();
        }
        androidx.compose.runtime.f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new e21.l(z13, function1, i13, 1);
        }
    }

    public static final void k(w12.a<f0> aVar, Composer composer, int i13) {
        androidx.compose.runtime.a k13 = composer.k(1871789103);
        int i14 = (k13.D(aVar) ? 4 : 2) | i13;
        if (k13.t(i14 & 1, (i14 & 3) != 2)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            xd1.a.a(null, null, null, null, null, null, c4.d.c(220305759, new a90.a0(aVar, 10), k13), k13, 12582912, 127);
        } else {
            k13.J();
        }
        androidx.compose.runtime.f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new g40.b(i13, 7, aVar);
        }
    }

    public static final j2.w1 l(List list, String str, float f13, Composer composer) {
        p1 p1Var = androidx.compose.runtime.b.f3172a;
        float f14 = ((Configuration) composer.A(AndroidCompositionLocals_androidKt.f3654a)).screenWidthDp;
        f.a aVar = e6.f.e;
        Object B = composer.B();
        Composer.f3140a.getClass();
        if (B == Composer.a.f3142b) {
            Iterator it = list.iterator();
            int i13 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i13 = -1;
                    break;
                } else if (x12.r.c(((gl.i) it.next()).f35126a, str)) {
                    break;
                } else {
                    i13++;
                }
            }
            Integer valueOf = Integer.valueOf(i13);
            if (i13 < 0) {
                valueOf = null;
            }
            int intValue = valueOf != null ? valueOf.intValue() : 0;
            md1.b.f53765a.getClass();
            float f15 = md1.b.f53766b.f41171c.f41175f;
            float f16 = f12479b;
            e6.f a13 = e6.f.a(((f16 / 2.0f) + (((f15 + f16) * (intValue + 1)) + f13)) - f14);
            e6.f fVar = Float.compare(a13.d, 0.0f) > 0 ? a13 : null;
            B = e6.f.a(fVar != null ? fVar.d : 0.0f);
            composer.u(B);
        }
        j2.w1 a14 = s1.a(((e6.c) composer.A(t1.f33310h)).G0(((e6.f) B).d), 0, 0, composer);
        p1 p1Var2 = androidx.compose.runtime.b.f3172a;
        return a14;
    }

    public static final String m(String str) {
        if (str != null) {
            LocalisationKey.f15077f.getClass();
            String c13 = pf0.f.c(new LocalisationKey(null, str));
            return c13 == null ? "" : c13;
        }
        return "";
    }
}
