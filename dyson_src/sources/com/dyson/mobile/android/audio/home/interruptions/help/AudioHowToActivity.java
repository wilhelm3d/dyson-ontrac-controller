package com.dyson.mobile.android.audio.home.interruptions.help;

import android.content.Intent;
import android.os.Bundle;
import androidx.compose.animation.i;
import androidx.compose.animation.x;
import androidx.compose.animation.y;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.u;
import c42.j;
import com.dyson.mobile.android.audio.home.interruptions.help.a;
import com.dyson.mobile.android.audio.home.interruptions.help.c;
import com.dyson.mobile.android.audio.home.interruptions.help.d;
import com.paypal.android.platform.authsdk.BR;
import f.x;
import fm1.o0;
import h12.f0;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n12.i;
import vj.f;
import we1.a;
import x12.p;
import x12.r;
import y9.q0;
import y9.z;
import z32.c0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/audio/home/interruptions/help/AudioHowToActivity;", "Ll/b;", "<init>", "()V", "a", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AudioHowToActivity extends l.b {

    /* renamed from: l  reason: collision with root package name */
    public static final a f12526l = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public d.a f12527j;

    /* renamed from: k  reason: collision with root package name */
    public AudioHelpType f12528k;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.audio.home.interruptions.help.AudioHowToActivity$onCreate$1$1$1$1$1$1$1", f = "AudioHowToActivity.kt", l = {BR.productName}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class b extends i implements Function2<c0, l12.d<? super f0>, Object> {
        public int d;
        public final /* synthetic */ Lifecycle e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ com.dyson.mobile.android.audio.home.interruptions.help.d f12529f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ q0 f12530g;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ AudioHowToActivity f12531h;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
        @n12.e(c = "com.dyson.mobile.android.audio.home.interruptions.help.AudioHowToActivity$onCreate$1$1$1$1$1$1$1$1", f = "AudioHowToActivity.kt", l = {BR.progressRange}, m = "invokeSuspend", v = 2)
        /* loaded from: classes2.dex */
        public static final class a extends i implements Function2<c0, l12.d<? super f0>, Object> {
            public int d;
            public final /* synthetic */ com.dyson.mobile.android.audio.home.interruptions.help.d e;

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ q0 f12532f;

            /* renamed from: g  reason: collision with root package name */
            public final /* synthetic */ AudioHowToActivity f12533g;

            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* renamed from: com.dyson.mobile.android.audio.home.interruptions.help.AudioHowToActivity$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0349a<T> implements j {
                public final /* synthetic */ q0 d;
                public final /* synthetic */ AudioHowToActivity e;

                public C0349a(q0 q0Var, AudioHowToActivity audioHowToActivity) {
                    this.d = q0Var;
                    this.e = audioHowToActivity;
                }

                @Override // c42.j
                public final Object emit(Object obj, l12.d dVar) {
                    com.dyson.mobile.android.audio.home.interruptions.help.c cVar = (com.dyson.mobile.android.audio.home.interruptions.help.c) obj;
                    if (r.c(cVar, c.b.f12538a)) {
                        y9.c0.j(this.d, new pl.a(AudioHelpType.RESTART), null, 6);
                    } else if (!r.c(cVar, c.a.f12537a)) {
                        ma.e.o();
                        return null;
                    } else {
                        this.e.finish();
                    }
                    return f0.f36844a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(com.dyson.mobile.android.audio.home.interruptions.help.d dVar, q0 q0Var, AudioHowToActivity audioHowToActivity, l12.d<? super a> dVar2) {
                super(2, dVar2);
                this.e = dVar;
                this.f12532f = q0Var;
                this.f12533g = audioHowToActivity;
            }

            @Override // n12.a
            public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
                return new a(this.e, this.f12532f, this.f12533g, dVar);
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
                    h12.r.b(obj);
                    c42.e eVar = this.e.f12541h;
                    C0349a c0349a = new C0349a(this.f12532f, this.f12533g);
                    this.d = 1;
                    if (eVar.collect(c0349a, this) == aVar) {
                        return aVar;
                    }
                } else if (i13 != 1) {
                    pa.c.w("call to 'resume' before 'invoke' with coroutine");
                    return null;
                } else {
                    h12.r.b(obj);
                }
                return f0.f36844a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Lifecycle lifecycle, com.dyson.mobile.android.audio.home.interruptions.help.d dVar, q0 q0Var, AudioHowToActivity audioHowToActivity, l12.d<? super b> dVar2) {
            super(2, dVar2);
            this.e = lifecycle;
            this.f12529f = dVar;
            this.f12530g = q0Var;
            this.f12531h = audioHowToActivity;
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            return new b(this.e, this.f12529f, this.f12530g, this.f12531h, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
            return ((b) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            int i13 = this.d;
            if (i13 == 0) {
                h12.r.b(obj);
                Lifecycle.State state = Lifecycle.State.STARTED;
                a aVar2 = new a(this.f12529f, this.f12530g, this.f12531h, null);
                this.d = 1;
                if (u.a(this.e, state, aVar2, this) == aVar) {
                    return aVar;
                }
            } else if (i13 != 1) {
                pa.c.w("call to 'resume' before 'invoke' with coroutine");
                return null;
            } else {
                h12.r.b(obj);
            }
            return f0.f36844a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.audio.home.interruptions.help.AudioHowToActivity$onCreate$1$1$1$1$1$2$1", f = "AudioHowToActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class c extends i implements Function2<c0, l12.d<? super f0>, Object> {
        public final /* synthetic */ com.dyson.mobile.android.audio.home.interruptions.help.d d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.dyson.mobile.android.audio.home.interruptions.help.d dVar, l12.d<? super c> dVar2) {
            super(2, dVar2);
            this.d = dVar;
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            return new c(this.d, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
            return ((c) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            h12.r.b(obj);
            this.d.S(a.c.f12536a);
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class d extends p implements Function1<com.dyson.mobile.android.audio.home.interruptions.help.a, f0> {
        public d(Object obj) {
            super(1, obj, com.dyson.mobile.android.audio.home.interruptions.help.d.class, "onEvent", "onEvent(Lcom/dyson/mobile/android/audio/home/interruptions/help/AudioHowToEvent;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final f0 invoke(com.dyson.mobile.android.audio.home.interruptions.help.a aVar) {
            com.dyson.mobile.android.audio.home.interruptions.help.a aVar2 = aVar;
            aVar2.getClass();
            ((com.dyson.mobile.android.audio.home.interruptions.help.d) this.receiver).S(aVar2);
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class e implements Function1<androidx.compose.animation.i<z>, x> {
        public static final e d = new e();

        @Override // kotlin.jvm.functions.Function1
        public final x invoke(androidx.compose.animation.i<z> iVar) {
            androidx.compose.animation.i<z> iVar2 = iVar;
            iVar2.getClass();
            if (pf1.a.a(iVar2)) {
                i.a.f2669b.getClass();
                return androidx.compose.animation.i.a(iVar2, i.a.f2671f, null, 6);
            }
            x.f2747a.getClass();
            return x.f2748b;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class f implements Function1<androidx.compose.animation.i<z>, y> {
        public static final f d = new f();

        @Override // kotlin.jvm.functions.Function1
        public final y invoke(androidx.compose.animation.i<z> iVar) {
            androidx.compose.animation.i<z> iVar2 = iVar;
            iVar2.getClass();
            if (pf1.a.a(iVar2)) {
                i.a.f2669b.getClass();
                return androidx.compose.animation.i.g(iVar2, i.a.f2671f, null, 6);
            }
            y.f2749a.getClass();
            return y.f2750b;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class g implements Function1<androidx.compose.animation.i<z>, x> {
        public static final g d = new g();

        @Override // kotlin.jvm.functions.Function1
        public final x invoke(androidx.compose.animation.i<z> iVar) {
            androidx.compose.animation.i<z> iVar2 = iVar;
            iVar2.getClass();
            i.a.f2669b.getClass();
            return androidx.compose.animation.i.a(iVar2, i.a.f2672g, null, 6);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class h implements Function1<androidx.compose.animation.i<z>, y> {
        public static final h d = new h();

        @Override // kotlin.jvm.functions.Function1
        public final y invoke(androidx.compose.animation.i<z> iVar) {
            androidx.compose.animation.i<z> iVar2 = iVar;
            iVar2.getClass();
            if (pf1.a.a(iVar2)) {
                i.a.f2669b.getClass();
                return androidx.compose.animation.i.g(iVar2, i.a.f2672g, null, 6);
            }
            y.f2749a.getClass();
            return y.f2750b;
        }
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        f.x.e.getClass();
        f.j.a(this, x.a.a(0), x.a.a(0));
        super.onCreate(bundle);
        if (cd.b.J(this)) {
            return;
        }
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Please use the newInstance method to create AudioHowToActivity";
        Bundle a14 = a13.a("COORDINATOR_ID", "HELP_TYPE");
        Serializable c13 = k7.b.c(a14, "HELP_TYPE", AudioHelpType.class);
        if (c13 == null) {
            pa.c.w("HELP_TYPE was null");
            return;
        }
        this.f12528k = (AudioHelpType) c13;
        String y13 = o0.y("COORDINATOR_ID", a14);
        vj.f.f84306m.getClass();
        vj.f a15 = f.a.a(y13);
        if (a15 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        gk.a aVar = a15.f84312l;
        this.f12527j = (d.a) aVar.R3.f88315a;
        aVar.d();
        g.f.a(this, new c4.c(276834327, true, new n71.a(this, 15)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/audio/home/interruptions/help/AudioHowToActivity$a;", "", "<init>", "()V", "", "HELP_TYPE", "Ljava/lang/String;", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static Intent a(androidx.fragment.app.e eVar, String str, AudioHelpType audioHelpType) {
            str.getClass();
            audioHelpType.getClass();
            Intent putExtra = new Intent(eVar, AudioHowToActivity.class).putExtra("COORDINATOR_ID", str).putExtra("HELP_TYPE", audioHelpType);
            putExtra.getClass();
            return putExtra;
        }

        private a() {
        }
    }
}
