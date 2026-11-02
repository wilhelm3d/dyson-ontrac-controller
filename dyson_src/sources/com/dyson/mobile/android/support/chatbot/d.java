package com.dyson.mobile.android.support.chatbot;

import ac0.j1;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.f;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.LifecycleOwner;
import gl.k;
import h12.f0;
import h12.h;
import h12.r;
import h71.j;
import java.util.List;
import k3.s2;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import l12.g;
import m9.p;
import n12.i;
import u3.k1;
import u3.m0;
import u3.p1;
import x12.m;
import z32.c0;
import z32.g0;
/* loaded from: classes3.dex */
public final class d {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.support.chatbot.ChatBotViewKt$hideSheet$1", f = "ChatBotView.kt", l = {206}, m = "invokeSuspend", v = 2)
    /* loaded from: classes3.dex */
    public static final class a extends i implements Function2<c0, l12.d<? super f0>, Object> {
        public int d;
        public final /* synthetic */ androidx.compose.material.d e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(androidx.compose.material.d dVar, l12.d<? super a> dVar2) {
            super(2, dVar2);
            this.e = dVar;
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            return new a(this.e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
            return ((a) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            int i13 = this.d;
            if (i13 == 0) {
                r.b(obj);
                androidx.compose.material.d dVar = this.e;
                if (dVar.c()) {
                    this.d = 1;
                    if (dVar.b(this) == aVar) {
                        return aVar;
                    }
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

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b implements p, m {
        public final /* synthetic */ Function1 d;

        public b(Function1 function1) {
            function1.getClass();
            this.d = function1;
        }

        @Override // x12.m
        public final h<?> d() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof p) && (obj instanceof m)) {
                return x12.r.c(d(), ((m) obj).d());
            }
            return false;
        }

        public final int hashCode() {
            return d().hashCode();
        }

        @Override // m9.p
        public final /* synthetic */ void onChanged(Object obj) {
            this.d.invoke(obj);
        }
    }

    public static final void a(e eVar, Modifier modifier, LifecycleOwner lifecycleOwner, Composer composer, int i13) {
        LifecycleOwner lifecycleOwner2;
        LifecycleOwner lifecycleOwner3;
        LifecycleOwner lifecycleOwner4;
        c0 c0Var;
        e eVar2;
        c cVar;
        eVar.getClass();
        androidx.compose.runtime.a k13 = composer.k(-1513179212);
        int i14 = i13 | (k13.D(eVar) ? 4 : 2) | 128;
        if (k13.t(i14 & 1, (i14 & 147) != 146)) {
            k13.C0();
            if ((i13 & 1) == 0 || k13.i0()) {
                lifecycleOwner3 = (LifecycleOwner) k13.A(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            } else {
                k13.J();
                lifecycleOwner3 = lifecycleOwner;
            }
            k13.b0();
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            Object B = k13.B();
            Composer.f3140a.getClass();
            Composer.a.C0094a c0094a = Composer.a.f3142b;
            if (B == c0094a) {
                B = new hu0.d();
                k13.u(B);
            }
            hu0.d dVar = (hu0.d) B;
            Object B2 = k13.B();
            if (B2 == c0094a) {
                B2 = m0.i(g.d, k13);
                k13.u(B2);
            }
            c0 c0Var2 = (c0) B2;
            Object B3 = k13.B();
            if (B3 == c0094a) {
                B3 = eVar.f16797j;
                k13.u(B3);
            }
            k1 k1Var = (k1) B3;
            androidx.compose.material.d c13 = androidx.compose.material.c.c(s2.Hidden, k13);
            Object B4 = k13.B();
            if (B4 == c0094a) {
                B4 = androidx.compose.runtime.d.j(Boolean.FALSE);
                k13.u(B4);
            }
            k1 k1Var2 = (k1) B4;
            x12.m0 m0Var = new x12.m0();
            int B5 = k13.B();
            if (B5 == c0094a) {
                B5 = 0;
                k13.u(0);
            }
            m0Var.d = ((Number) B5).intValue();
            List list = (List) k1Var.getValue();
            Modifier v13 = androidx.compose.foundation.layout.d.v(Modifier.f3231b);
            boolean D = k13.D(eVar);
            Object B6 = k13.B();
            if (D || B6 == c0094a) {
                B6 = new j(eVar, 0);
                k13.u(B6);
            }
            a90.f0 f0Var = new a90.f0(modifier, dVar, eVar, k1Var2, c13, m0Var);
            androidx.compose.material.d dVar2 = c13;
            com.dyson.mobile.android.support.chatbot.b.c(dVar2, list, (Function1) B6, c4.d.c(-1535455484, f0Var, k13), v13, k13, androidx.compose.material.d.e | 3072);
            k13 = k13;
            Boolean bool = Boolean.TRUE;
            boolean D2 = k13.D(eVar) | k13.D(lifecycleOwner3) | k13.D(dVar) | k13.D(c0Var2) | k13.D(dVar2);
            Object B7 = k13.B();
            if (D2 || B7 == c0094a) {
                LifecycleOwner lifecycleOwner5 = lifecycleOwner3;
                c cVar2 = new c(eVar, lifecycleOwner5, dVar, c0Var2, dVar2, null);
                lifecycleOwner4 = lifecycleOwner5;
                c0Var = c0Var2;
                eVar2 = eVar;
                dVar2 = dVar2;
                k13.u(cVar2);
                cVar = cVar2;
            } else {
                eVar2 = eVar;
                cVar = B7;
                lifecycleOwner4 = lifecycleOwner3;
                c0Var = c0Var2;
            }
            m0.d(k13, bool, (Function2) cVar);
            boolean D3 = k13.D(dVar2) | k13.D(c0Var) | k13.D(dVar) | k13.D(eVar2);
            Object B8 = k13.B();
            if (D3 || B8 == c0094a) {
                j1 j1Var = new j1((Object) dVar2, c0Var, (Object) dVar, (Object) eVar2, 8);
                k13.u(j1Var);
                B8 = j1Var;
            }
            g.d.a(true, (w12.a) B8, k13, 6, 0);
            lifecycleOwner2 = lifecycleOwner4;
        } else {
            k13.J();
            lifecycleOwner2 = lifecycleOwner;
        }
        f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new f01.d(i13, 20, eVar, modifier, lifecycleOwner2);
        }
    }

    public static final void b(androidx.compose.material.d dVar, c0 c0Var) {
        g0.r(c0Var, null, null, new a(dVar, null), 3);
    }

    public static final void c(hu0.d dVar, e eVar) {
        final k kVar = new k(new j(eVar, 1), 12);
        dVar.getClass();
        WebView webView = dVar.f39607a;
        if (webView != null) {
            webView.evaluateJavascript("isSurveyRequired();", new ValueCallback() { // from class: hu0.c
                @Override // android.webkit.ValueCallback
                public final void onReceiveValue(Object obj) {
                    k.this.invoke((String) obj);
                }
            });
        } else {
            x12.r.i("webView");
            throw null;
        }
    }
}
