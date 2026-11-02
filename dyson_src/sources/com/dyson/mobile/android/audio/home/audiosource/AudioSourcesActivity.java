package com.dyson.mobile.android.audio.home.audiosource;

import android.content.Intent;
import android.os.Bundle;
import androidx.compose.animation.i;
import androidx.compose.animation.x;
import androidx.compose.animation.y;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import bl.j;
import c42.f2;
import com.dyson.mobile.android.audio.home.audiosource.b;
import com.dyson.mobile.android.audio.home.audiosource.e;
import com.dyson.mobile.android.audio.home.audiosource.h;
import f.x;
import fm1.o0;
import h12.f0;
import hj.e;
import io.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nj.de;
import tl.b;
import vj.f;
import we1.a;
import wk.a;
import x12.p0;
import y9.c0;
import y9.q0;
import y9.z;
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\r²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002²\u0006\f\u0010\f\u001a\u00020\u000b8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/dyson/mobile/android/audio/home/audiosource/AudioSourcesActivity;", "Ll/b;", "<init>", "()V", "a", "Lcom/dyson/mobile/android/audio/home/audiosource/j;", "viewState", "", "isShortcutOnboardingBottomSheetOpen", "Lwk/d;", "otaViewState", "Lcom/dyson/mobile/android/audio/home/audiosource/c;", "alertState", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AudioSourcesActivity extends l.b {

    /* renamed from: n  reason: collision with root package name */
    public static final a f12379n = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public fk.d f12380j;

    /* renamed from: k  reason: collision with root package name */
    public pf0.c f12381k;

    /* renamed from: l  reason: collision with root package name */
    public final d0 f12382l;

    /* renamed from: m  reason: collision with root package name */
    public final d0 f12383m;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/dyson/mobile/android/audio/home/audiosource/h;", com.salesforce.marketingcloud.push.g.f21676h, "Lh12/f0;", "<anonymous>", "(Lcom/dyson/mobile/android/audio/home/audiosource/h;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.audio.home.audiosource.AudioSourcesActivity$onCreate$2$1$1", f = "AudioSourcesActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class b extends n12.i implements Function2<com.dyson.mobile.android.audio.home.audiosource.h, l12.d<? super f0>, Object> {
        public /* synthetic */ Object d;
        public final /* synthetic */ q0 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(q0 q0Var, l12.d<? super b> dVar) {
            super(2, dVar);
            this.e = q0Var;
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            b bVar = new b(this.e, dVar);
            bVar.d = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(com.dyson.mobile.android.audio.home.audiosource.h hVar, l12.d<? super f0> dVar) {
            return ((b) create(hVar, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            h12.r.b(obj);
            if (x12.r.c((com.dyson.mobile.android.audio.home.audiosource.h) this.d, h.b.f12409a)) {
                c0.j(this.e, b.a.INSTANCE, null, 6);
            }
            return f0.f36844a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/dyson/mobile/android/audio/home/audiosource/h;", com.salesforce.marketingcloud.push.g.f21676h, "Lh12/f0;", "<anonymous>", "(Lcom/dyson/mobile/android/audio/home/audiosource/h;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.audio.home.audiosource.AudioSourcesActivity$onCreate$2$2$1", f = "AudioSourcesActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class c extends n12.i implements Function2<com.dyson.mobile.android.audio.home.audiosource.h, l12.d<? super f0>, Object> {
        public /* synthetic */ Object d;

        public c(l12.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            c cVar = new c(dVar);
            cVar.d = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(com.dyson.mobile.android.audio.home.audiosource.h hVar, l12.d<? super f0> dVar) {
            return ((c) create(hVar, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            h12.r.b(obj);
            if (x12.r.c((com.dyson.mobile.android.audio.home.audiosource.h) this.d, h.a.f12408a)) {
                AudioSourcesActivity.this.finish();
            }
            return f0.f36844a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.audio.home.audiosource.AudioSourcesActivity$onCreate$2$3$1$1$1$1$1", f = "AudioSourcesActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class d extends n12.i implements Function2<z32.c0, l12.d<? super f0>, Object> {
        public d(l12.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            return new d(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(z32.c0 c0Var, l12.d<? super f0> dVar) {
            return ((d) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            h12.r.b(obj);
            a aVar2 = AudioSourcesActivity.f12379n;
            AudioSourcesActivity.this.c1().S(new e.C0342e(b.C0341b.INSTANCE));
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class e extends x12.p implements Function1<com.dyson.mobile.android.audio.home.audiosource.e, f0> {
        public e(Object obj) {
            super(1, obj, com.dyson.mobile.android.audio.home.audiosource.i.class, "onEvent", "onEvent(Lcom/dyson/mobile/android/audio/home/audiosource/AudioSourcesScreenEvent;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final f0 invoke(com.dyson.mobile.android.audio.home.audiosource.e eVar) {
            com.dyson.mobile.android.audio.home.audiosource.e eVar2 = eVar;
            eVar2.getClass();
            ((com.dyson.mobile.android.audio.home.audiosource.i) this.receiver).S(eVar2);
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class f extends x12.p implements Function1<wk.a, f0> {
        public f(Object obj) {
            super(1, obj, wk.b.class, "onOtaEvent", "onOtaEvent(Lcom/dyson/mobile/android/audio/home/audiosource/ota/AudioSourcesOtaScreenEvent;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final f0 invoke(wk.a aVar) {
            Object value;
            wk.a aVar2 = aVar;
            aVar2.getClass();
            wk.b bVar = (wk.b) this.receiver;
            bVar.getClass();
            if (aVar2 instanceof a.C2560a) {
                f2 f2Var = bVar.f85954i;
                do {
                    value = f2Var.getValue();
                    ((Boolean) value).getClass();
                } while (!f2Var.f(value, Boolean.TRUE));
                return f0.f36844a;
            }
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class g extends x12.p implements Function1<tl.b, f0> {
        public g(Object obj) {
            super(1, obj, wk.b.class, "onOtaBottomSheetEvent", "onOtaBottomSheetEvent(Lcom/dyson/mobile/android/audio/home/ota/bottomsheet/OtaBottomSheetViewEvent;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final f0 invoke(tl.b bVar) {
            Object value;
            tl.b bVar2 = bVar;
            bVar2.getClass();
            wk.b bVar3 = (wk.b) this.receiver;
            bVar3.getClass();
            if (bVar2 instanceof b.a) {
                en.c cVar = bVar3.f85952g;
                rl.t tVar = bVar3.e;
                rl.h hVar = bVar3.d;
                io.e eVar = ((b.a) bVar2).f79893a;
                if (x12.r.c(eVar, e.a.f42373a)) {
                    io.d dVar = hVar.f73373a;
                    io.f fVar = dVar.d;
                    eh0.e<xo.a> eVar2 = dVar.f42351a;
                    if (eVar2.isConnected()) {
                        eVar2.u().b();
                    } else {
                        fVar.f42392b.onNext(e.b.f42374a);
                    }
                } else if (x12.r.c(eVar, e.f.f42379a)) {
                    io.d dVar2 = hVar.f73373a;
                    io.f fVar2 = dVar2.d;
                    eh0.e<xo.a> eVar3 = dVar2.f42351a;
                    if (eVar3.isConnected()) {
                        eVar3.u().k();
                    } else {
                        fVar2.f42392b.onNext(e.g.f42380a);
                    }
                } else if (x12.r.c(eVar, e.b.f42374a) || x12.r.c(eVar, e.C1336e.f42378a)) {
                    tVar.a(false);
                } else if (x12.r.c(eVar, e.g.f42380a) || x12.r.c(eVar, e.j.f42384a)) {
                    tVar.a(true);
                }
                en.f fVar3 = en.f.OTA;
                cVar.getClass();
                fVar3.getClass();
                if (cVar.f28151b.contains(fVar3)) {
                    cVar.a(fVar3, false);
                }
                aq.f.b(bVar3.f85956k, m9.v.a(bVar3), h.a.f12408a);
            } else if (!(bVar2 instanceof b.C2315b)) {
                ma.e.o();
                return null;
            } else {
                f2 f2Var = bVar3.f85954i;
                do {
                    value = f2Var.getValue();
                    ((Boolean) value).getClass();
                } while (!f2Var.f(value, Boolean.FALSE));
            }
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class h extends x12.p implements Function1<bl.j, f0> {
        public h(Object obj) {
            super(1, obj, com.dyson.mobile.android.audio.home.audiosource.i.class, "onShortcutBottomSheetScreenEvent", "onShortcutBottomSheetScreenEvent(Lcom/dyson/mobile/android/audio/home/bottomsheet/BottomSheetScreenEvent;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final f0 invoke(bl.j jVar) {
            Object value;
            bl.j jVar2 = jVar;
            jVar2.getClass();
            com.dyson.mobile.android.audio.home.audiosource.i iVar = (com.dyson.mobile.android.audio.home.audiosource.i) this.receiver;
            iVar.getClass();
            if (jVar2.equals(j.b.f7971a)) {
                iVar.f12414i.f84297a.putBoolean("audio_sources_shortcut_onboarding_shown", true);
                hj.e eVar = iVar.e;
                int i13 = de.f57454a;
                ij.b bVar = new ij.b("wearable_ec.help.how_to_add_widget", null, 2, null);
                e.a aVar = hj.e.f38312g;
                eVar.h(bVar, null);
            } else if (!jVar2.equals(j.a.f7970a)) {
                ma.e.o();
                return null;
            } else {
                f2 f2Var = iVar.f12422q;
                do {
                    value = f2Var.getValue();
                    ((Boolean) value).getClass();
                } while (!f2Var.f(value, Boolean.FALSE));
            }
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class i extends x12.p implements w12.a<f0> {
        public i(Object obj) {
            super(0, obj, AudioSourcesActivity.class, "finish", "finish()V", 0);
        }

        @Override // w12.a
        public final f0 invoke() {
            ((AudioSourcesActivity) this.receiver).finish();
            return f0.f36844a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.audio.home.audiosource.AudioSourcesActivity$onCreate$2$3$1$1$2$1$1", f = "AudioSourcesActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class j extends n12.i implements Function2<z32.c0, l12.d<? super f0>, Object> {
        public j(l12.d<? super j> dVar) {
            super(2, dVar);
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            return new j(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(z32.c0 c0Var, l12.d<? super f0> dVar) {
            return ((j) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            h12.r.b(obj);
            a aVar2 = AudioSourcesActivity.f12379n;
            AudioSourcesActivity.this.c1().S(new e.C0342e(b.a.INSTANCE));
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class k implements Function1<androidx.compose.animation.i<z>, x> {
        public static final k d = new k();

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
    public static final class l implements Function1<androidx.compose.animation.i<z>, y> {
        public static final l d = new l();

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
    public static final class m implements Function1<androidx.compose.animation.i<z>, x> {
        public static final m d = new m();

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
    public static final class n implements Function1<androidx.compose.animation.i<z>, y> {
        public static final n d = new n();

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

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class o implements Function1<androidx.compose.animation.i<z>, x> {
        public static final o d = new o();

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
    public static final class p implements Function1<androidx.compose.animation.i<z>, y> {
        public static final p d = new p();

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
    public static final class q implements Function1<androidx.compose.animation.i<z>, x> {
        public static final q d = new q();

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
    public static final class r implements Function1<androidx.compose.animation.i<z>, y> {
        public static final r d = new r();

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

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class s extends x12.t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ f.g f12384f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(f.g gVar) {
            super(0);
            this.f12384f = gVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return this.f12384f.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class t extends x12.t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f12385f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ f.g f12386g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(w12.a aVar, f.g gVar) {
            super(0);
            this.f12385f = aVar;
            this.f12386g = gVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f12385f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f12386g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class u extends x12.t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ f.g f12387f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(f.g gVar) {
            super(0);
            this.f12387f = gVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return this.f12387f.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class v extends x12.t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f12388f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ f.g f12389g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(w12.a aVar, f.g gVar) {
            super(0);
            this.f12388f = aVar;
            this.f12389g = gVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f12388f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f12389g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public AudioSourcesActivity() {
        vk.a aVar = new vk.a(this, 0);
        x12.q0 q0Var = p0.f86717a;
        this.f12382l = new d0(q0Var.b(com.dyson.mobile.android.audio.home.audiosource.i.class), new s(this), aVar, new t(null, this));
        this.f12383m = new d0(q0Var.b(wk.b.class), new u(this), new vk.a(this, 1), new v(null, this));
    }

    public final com.dyson.mobile.android.audio.home.audiosource.i c1() {
        return (com.dyson.mobile.android.audio.home.audiosource.i) this.f12382l.getValue();
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
        a13.f85710b = "Please use newIntent method";
        String y13 = o0.y("COORDINATOR_ID", a13.a("COORDINATOR_ID"));
        vj.f.f84306m.getClass();
        vj.f a14 = f.a.a(y13);
        if (a14 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        gk.a aVar = a14.f84312l;
        this.f12380j = aVar.d();
        this.f12381k = aVar.f();
        g.f.a(this, new c4.c(-1879649089, true, new sa0.p(this, 19)));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/audio/home/audiosource/AudioSourcesActivity$a;", "", "<init>", "()V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
