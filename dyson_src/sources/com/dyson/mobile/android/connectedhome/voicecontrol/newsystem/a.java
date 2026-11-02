package com.dyson.mobile.android.connectedhome.voicecontrol.newsystem;

import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.ViewModelProvider;
import com.dyson.mobile.android.connectedhome.voicecontrol.alexa.AlexaError;
import com.dyson.mobile.android.connectedhome.voicecontrol.alexa.parser.AlexaAuthResult;
import com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.linking.b;
import com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.lwa.b;
import com.dyson.mobile.android.connectedhome.voicecontrol.newsystem.b;
import ef1.g;
import h12.f0;
import h12.r;
import kotlin.Metadata;
import kotlin.UninitializedPropertyAccessException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kz.a;
import l00.n;
import m9.u;
import n12.i;
import u3.k3;
import z32.c0;
/* loaded from: classes2.dex */
public final class a {

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/connectedhome/voicecontrol/newsystem/a$a", "Landroidx/lifecycle/ViewModelProvider$Factory;", "mod-utilities"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.connectedhome.voicecontrol.newsystem.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0399a implements ViewModelProvider.Factory {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AlexaAuthResult.AlexaAuthArgs f13207a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f13208b;

        public C0399a(AlexaAuthResult.AlexaAuthArgs alexaAuthArgs, Context context) {
            this.f13207a = alexaAuthArgs;
            this.f13208b = context;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.linking.b$b, VMF] */
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public final <T extends u> T create(Class<T> cls) {
            cls.getClass();
            if (b.InterfaceC0390b.class.isAnnotationPresent(wy1.a.class)) {
                ef1.a aVar = new ef1.a();
                kz.a.f50192c.getClass();
                aVar.f26823a = (b.InterfaceC0390b) a.C1547a.a(this.f13208b).f50194b.f55385i.f88315a;
                try {
                    return ((b.InterfaceC0390b) aVar.a()).a(this.f13207a);
                } catch (UninitializedPropertyAccessException unused) {
                    throw new ef1.b();
                }
            }
            throw new g();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.connectedhome.voicecontrol.newsystem.VoiceControlNdsScreenKt$AlexaLinkingBottomSheetModal$1$1", f = "VoiceControlNdsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class b extends i implements Function2<c0, l12.d<? super f0>, Object> {
        public final /* synthetic */ Function1<b.InterfaceC0400b, f0> d;
        public final /* synthetic */ k3<b.c> e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super b.InterfaceC0400b, f0> function1, k3<? extends b.c> k3Var, l12.d<? super b> dVar) {
            super(2, dVar);
            this.d = function1;
            this.e = k3Var;
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            return new b(this.d, this.e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
            return ((b) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            r.b(obj);
            b.c value = this.e.getValue();
            boolean z13 = value instanceof b.c.C0391b;
            Function1<b.InterfaceC0400b, f0> function1 = this.d;
            if (z13) {
                function1.invoke(b.InterfaceC0400b.f.f13231a);
            } else if (value instanceof b.c.a) {
                function1.invoke(b.InterfaceC0400b.C0401b.f13227a);
            }
            return f0.f36844a;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/connectedhome/voicecontrol/newsystem/a$c", "Landroidx/lifecycle/ViewModelProvider$Factory;", "mod-utilities"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c implements ViewModelProvider.Factory {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Uri f13209a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ Context f13210b;

        public c(Uri uri, Context context) {
            this.f13209a = uri;
            this.f13210b = context;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.lwa.b$c, VMF] */
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public final <T extends u> T create(Class<T> cls) {
            cls.getClass();
            if (b.c.class.isAnnotationPresent(wy1.a.class)) {
                ef1.a aVar = new ef1.a();
                kz.a.f50192c.getClass();
                aVar.f26823a = (b.c) a.C1547a.a(this.f13210b).f50194b.f55383g.f88315a;
                try {
                    return ((b.c) aVar.a()).a(this.f13209a);
                } catch (UninitializedPropertyAccessException unused) {
                    throw new ef1.b();
                }
            }
            throw new g();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.connectedhome.voicecontrol.newsystem.VoiceControlNdsScreenKt$LoginWithAlexaScreen$1$1", f = "VoiceControlNdsScreen.kt", l = {}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class d extends i implements Function2<c0, l12.d<? super f0>, Object> {
        public final /* synthetic */ Function1<b.InterfaceC0400b, f0> d;
        public final /* synthetic */ Function1<n, f0> e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ k3<b.a> f13211f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Function1<? super b.InterfaceC0400b, f0> function1, Function1<? super n, f0> function12, k3<? extends b.a> k3Var, l12.d<? super d> dVar) {
            super(2, dVar);
            this.d = function1;
            this.e = function12;
            this.f13211f = k3Var;
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            return new d(this.d, this.e, this.f13211f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
            return ((d) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            r.b(obj);
            b.a value = this.f13211f.getValue();
            boolean z13 = value instanceof b.a.C0393a;
            Function1<n, f0> function1 = this.e;
            Function1<b.InterfaceC0400b, f0> function12 = this.d;
            if (z13) {
                AlexaError.AuthorizeError authorizeError = ((b.a.C0393a) value).f13157a;
                if (x12.r.c(authorizeError != null ? authorizeError.d : null, "access_denied")) {
                    function12.invoke(b.InterfaceC0400b.a.f13226a);
                } else {
                    function1.invoke(null);
                    function12.invoke(b.InterfaceC0400b.C0401b.f13227a);
                }
            } else if (value instanceof b.a.C0394b) {
                function1.invoke(null);
                AlexaAuthResult.AlexaAuthArgs alexaAuthArgs = ((b.a.C0394b) value).f13158a;
                if (alexaAuthArgs != null) {
                    function12.invoke(new b.InterfaceC0400b.d(alexaAuthArgs));
                }
            }
            return f0.f36844a;
        }
    }

    /* loaded from: classes2.dex */
    public static final /* synthetic */ class e {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f13212a;

        static {
            int[] iArr = new int[n.values().length];
            try {
                iArr[n.GOOGLE_HOME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n.AMAZON_ALEXA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n.AMAZON_ALEXA_UNLINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[n.TMALL_GENIE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[n.AMAZON_ALEXA_FAILURE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[n.AMAZON_ALEXA_SUCCESS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[n.AMAZON_ALEXA_UNLINK_FAILURE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[n.AMAZON_ALEXA_UNLINK_SUCCESS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[n.UNKNOWN.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f13212a = iArr;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0096, code lost:
        if (r9 == androidx.compose.runtime.Composer.a.f3142b) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b5, code lost:
        if (r0 == androidx.compose.runtime.Composer.a.f3142b) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.dyson.mobile.android.connectedhome.voicecontrol.alexa.parser.AlexaAuthResult.AlexaAuthArgs r11, kotlin.jvm.functions.Function1<? super com.dyson.mobile.android.connectedhome.voicecontrol.newsystem.b.InterfaceC0400b, h12.f0> r12, androidx.compose.runtime.Composer r13, int r14) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.connectedhome.voicecontrol.newsystem.a.a(com.dyson.mobile.android.connectedhome.voicecontrol.alexa.parser.AlexaAuthResult$AlexaAuthArgs, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x008b, code lost:
        if (r6 == androidx.compose.runtime.Composer.a.f3142b) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00af, code lost:
        if (r7 == androidx.compose.runtime.Composer.a.f3142b) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(l00.e r13, w12.a<h12.f0> r14, kotlin.jvm.functions.Function1<? super com.dyson.mobile.android.connectedhome.voicecontrol.newsystem.b.InterfaceC0400b, h12.f0> r15, kotlin.jvm.functions.Function1<? super ij.b, h12.f0> r16, androidx.compose.runtime.Composer r17, int r18) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.connectedhome.voicecontrol.newsystem.a.b(l00.e, w12.a, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a7, code lost:
        if (r1 == androidx.compose.runtime.Composer.a.f3142b) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00db, code lost:
        if (r6 == androidx.compose.runtime.Composer.a.f3142b) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f6, code lost:
        if (r8 == androidx.compose.runtime.Composer.a.f3142b) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(android.net.Uri r11, kotlin.jvm.functions.Function1<? super com.dyson.mobile.android.connectedhome.voicecontrol.newsystem.b.InterfaceC0400b, h12.f0> r12, kotlin.jvm.functions.Function1<? super l00.n, h12.f0> r13, androidx.compose.runtime.Composer r14, int r15) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.connectedhome.voicecontrol.newsystem.a.c(android.net.Uri, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x01a6, code lost:
        if (r3 == androidx.compose.runtime.Composer.a.f3142b) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x01cc, code lost:
        if (r14 == androidx.compose.runtime.Composer.a.f3142b) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0214, code lost:
        if (r3 == androidx.compose.runtime.Composer.a.f3142b) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0274, code lost:
        if (r14 == androidx.compose.runtime.Composer.a.f3142b) goto L212;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0296, code lost:
        if (r2 == androidx.compose.runtime.Composer.a.f3142b) goto L210;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02bd, code lost:
        if (r5 == androidx.compose.runtime.Composer.a.f3142b) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0317, code lost:
        if (r3 == androidx.compose.runtime.Composer.a.f3142b) goto L225;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x036b, code lost:
        if (r3 == androidx.compose.runtime.Composer.a.f3142b) goto L258;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0389, code lost:
        if (r5 == androidx.compose.runtime.Composer.a.f3142b) goto L256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0411, code lost:
        if (r5 == androidx.compose.runtime.Composer.a.f3142b) goto L294;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x043c, code lost:
        if (r5 == androidx.compose.runtime.Composer.a.f3142b) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x04d7, code lost:
        if (r0 == androidx.compose.runtime.Composer.a.f3142b) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x053a, code lost:
        if (r2 == androidx.compose.runtime.Composer.a.f3142b) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:287:0x0581, code lost:
        if (r1 == androidx.compose.runtime.Composer.a.f3142b) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x05c6, code lost:
        if (r1 == androidx.compose.runtime.Composer.a.f3142b) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x060a, code lost:
        if (r1 == androidx.compose.runtime.Composer.a.f3142b) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00f3, code lost:
        if (r2 == androidx.compose.runtime.Composer.a.f3142b) goto L302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0113, code lost:
        if (r14 == androidx.compose.runtime.Composer.a.f3142b) goto L300;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0137, code lost:
        if (r3 == androidx.compose.runtime.Composer.a.f3142b) goto L298;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(l00.e r27, l00.n r28, com.dyson.mobile.android.connectedhome.voicecontrol.newsystem.b.c r29, boolean r30, boolean r31, w12.a r32, kotlin.jvm.functions.Function1 r33, kotlin.jvm.functions.Function1 r34, w12.a r35, w12.a r36, kotlin.jvm.functions.Function1 r37, androidx.compose.runtime.Composer r38, int r39) {
        /*
            Method dump skipped, instructions count: 1664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.connectedhome.voicecontrol.newsystem.a.d(l00.e, l00.n, com.dyson.mobile.android.connectedhome.voicecontrol.newsystem.b$c, boolean, boolean, w12.a, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, w12.a, w12.a, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }
}
