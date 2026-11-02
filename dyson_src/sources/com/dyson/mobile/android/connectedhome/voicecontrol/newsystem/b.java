package com.dyson.mobile.android.connectedhome.voicecontrol.newsystem;

import android.net.Uri;
import androidx.lifecycle.ViewModelProvider;
import c42.a2;
import c42.f2;
import c42.g2;
import c42.i1;
import c42.r1;
import com.dyson.mobile.android.connectedhome.voicecontrol.alexa.parser.AlexaAuthResult;
import com.dyson.mobile.android.logging.Logger;
import h12.f0;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import l00.n;
import m9.u;
import m9.v;
import n12.i;
import w12.o;
import x12.r;
import z32.c0;
import z32.g0;
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001:\u0003\f\r\u000eB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/newsystem/b;", "Lm9/u;", "Ll00/c;", "provider", "Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/parser/a;", "alexaAuthResultParser", "Lhj/e;", "trackingManager", "Lc00/d;", "voiceControlTaskFactory", "<init>", "(Ll00/c;Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/parser/a;Lhj/e;Lc00/d;)V", "c", "b", "a", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class b extends u {
    public final l00.c d;
    public final com.dyson.mobile.android.connectedhome.voicecontrol.alexa.parser.a e;

    /* renamed from: f  reason: collision with root package name */
    public final hj.e f13213f;

    /* renamed from: g  reason: collision with root package name */
    public final c00.d f13214g;

    /* renamed from: h  reason: collision with root package name */
    public final f2 f13215h;

    /* renamed from: i  reason: collision with root package name */
    public final f2 f13216i;

    /* renamed from: j  reason: collision with root package name */
    public final f2 f13217j;

    /* renamed from: k  reason: collision with root package name */
    public final r1 f13218k;

    /* renamed from: l  reason: collision with root package name */
    public final f2 f13219l;

    /* renamed from: m  reason: collision with root package name */
    public final r1 f13220m;

    /* renamed from: n  reason: collision with root package name */
    public final f2 f13221n;

    /* renamed from: o  reason: collision with root package name */
    public final r1 f13222o;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/newsystem/b$a;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Ll00/c;", "contentProvider", "Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/parser/a;", "alexaAuthResultParser", "Lhj/e;", "trackingManager", "Lc00/d;", "voiceControlTaskFactory", "<init>", "(Ll00/c;Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/parser/a;Lhj/e;Lc00/d;)V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements ViewModelProvider.Factory {

        /* renamed from: a  reason: collision with root package name */
        public final l00.c f13223a;

        /* renamed from: b  reason: collision with root package name */
        public final com.dyson.mobile.android.connectedhome.voicecontrol.alexa.parser.a f13224b;

        /* renamed from: c  reason: collision with root package name */
        public final hj.e f13225c;
        public final c00.d d;

        public a(l00.c cVar, com.dyson.mobile.android.connectedhome.voicecontrol.alexa.parser.a aVar, hj.e eVar, c00.d dVar) {
            cVar.getClass();
            aVar.getClass();
            eVar.getClass();
            dVar.getClass();
            this.f13223a = cVar;
            this.f13224b = aVar;
            this.f13225c = eVar;
            this.d = dVar;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public final <T extends u> T create(Class<T> cls) {
            cls.getClass();
            return new b(this.f13223a, this.f13224b, this.f13225c, this.d);
        }
    }

    /* renamed from: com.dyson.mobile.android.connectedhome.voicecontrol.newsystem.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public interface InterfaceC0400b {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/newsystem/b$b$a;", "Lcom/dyson/mobile/android/connectedhome/voicecontrol/newsystem/b$b;", "<init>", "()V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.connectedhome.voicecontrol.newsystem.b$b$a */
        /* loaded from: classes2.dex */
        public static final class a implements InterfaceC0400b {

            /* renamed from: a  reason: collision with root package name */
            public static final a f13226a = new a();

            private a() {
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1947751924;
            }

            public final String toString() {
                return "DismissBottomSheetModalEvent";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/newsystem/b$b$b;", "Lcom/dyson/mobile/android/connectedhome/voicecontrol/newsystem/b$b;", "<init>", "()V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.connectedhome.voicecontrol.newsystem.b$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0401b implements InterfaceC0400b {

            /* renamed from: a  reason: collision with root package name */
            public static final C0401b f13227a = new C0401b();

            private C0401b() {
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0401b);
            }

            public final int hashCode() {
                return 920947468;
            }

            public final String toString() {
                return "FailureBottomSheetModalEvent";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/newsystem/b$b$c;", "Lcom/dyson/mobile/android/connectedhome/voicecontrol/newsystem/b$b;", "<init>", "()V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.connectedhome.voicecontrol.newsystem.b$b$c */
        /* loaded from: classes2.dex */
        public static final class c implements InterfaceC0400b {

            /* renamed from: a  reason: collision with root package name */
            public static final c f13228a = new c();

            private c() {
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return 165822371;
            }

            public final String toString() {
                return "FetchStatusEvent";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/newsystem/b$b$d;", "Lcom/dyson/mobile/android/connectedhome/voicecontrol/newsystem/b$b;", "Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/parser/AlexaAuthResult$AlexaAuthArgs;", "alexaAuthArgs", "<init>", "(Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/parser/AlexaAuthResult$AlexaAuthArgs;)V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.connectedhome.voicecontrol.newsystem.b$b$d */
        /* loaded from: classes2.dex */
        public static final class d implements InterfaceC0400b {

            /* renamed from: a  reason: collision with root package name */
            public final AlexaAuthResult.AlexaAuthArgs f13229a;

            public d(AlexaAuthResult.AlexaAuthArgs alexaAuthArgs) {
                alexaAuthArgs.getClass();
                this.f13229a = alexaAuthArgs;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && this.f13229a == ((d) obj).f13229a;
            }

            public final int hashCode() {
                return this.f13229a.hashCode();
            }

            public final String toString() {
                return "LinkingScreenEvent(alexaAuthArgs=" + this.f13229a + ")";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/newsystem/b$b$e;", "Lcom/dyson/mobile/android/connectedhome/voicecontrol/newsystem/b$b;", "Landroid/net/Uri;", "lwaUri", "<init>", "(Landroid/net/Uri;)V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.connectedhome.voicecontrol.newsystem.b$b$e */
        /* loaded from: classes2.dex */
        public static final class e implements InterfaceC0400b {

            /* renamed from: a  reason: collision with root package name */
            public final Uri f13230a;

            public e(Uri uri) {
                uri.getClass();
                this.f13230a = uri;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && this.f13230a.equals(((e) obj).f13230a);
            }

            public final int hashCode() {
                return this.f13230a.hashCode();
            }

            public final String toString() {
                return "LwaScreenEvent(lwaUri=" + this.f13230a + ")";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/newsystem/b$b$f;", "Lcom/dyson/mobile/android/connectedhome/voicecontrol/newsystem/b$b;", "<init>", "()V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.connectedhome.voicecontrol.newsystem.b$b$f */
        /* loaded from: classes2.dex */
        public static final class f implements InterfaceC0400b {

            /* renamed from: a  reason: collision with root package name */
            public static final f f13231a = new f();

            private f() {
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return 544567859;
            }

            public final String toString() {
                return "SuccessBottomSheetModalEvent";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/newsystem/b$b$g;", "Lcom/dyson/mobile/android/connectedhome/voicecontrol/newsystem/b$b;", "<init>", "()V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.connectedhome.voicecontrol.newsystem.b$b$g */
        /* loaded from: classes2.dex */
        public static final class g implements InterfaceC0400b {

            /* renamed from: a  reason: collision with root package name */
            public static final g f13232a = new g();

            private g() {
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            public final int hashCode() {
                return 872188351;
            }

            public final String toString() {
                return "UnlinkAlexaEvent";
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface c {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/newsystem/b$c$a;", "Lcom/dyson/mobile/android/connectedhome/voicecontrol/newsystem/b$c;", "Ll00/e;", "voiceControlNdsContent", "<init>", "(Ll00/e;)V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class a implements c {

            /* renamed from: a  reason: collision with root package name */
            public final l00.e f13233a;

            public a(l00.e eVar) {
                this.f13233a = eVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && r.c(this.f13233a, ((a) obj).f13233a);
            }

            public final int hashCode() {
                l00.e eVar = this.f13233a;
                if (eVar == null) {
                    return 0;
                }
                return eVar.hashCode();
            }

            public final String toString() {
                return "FailureScreen(voiceControlNdsContent=" + this.f13233a + ")";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/newsystem/b$c$b;", "Lcom/dyson/mobile/android/connectedhome/voicecontrol/newsystem/b$c;", "Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/parser/AlexaAuthResult$AlexaAuthArgs;", "alexaAuthArgs", "<init>", "(Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/parser/AlexaAuthResult$AlexaAuthArgs;)V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.connectedhome.voicecontrol.newsystem.b$c$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0402b implements c {

            /* renamed from: a  reason: collision with root package name */
            public final AlexaAuthResult.AlexaAuthArgs f13234a;

            public C0402b(AlexaAuthResult.AlexaAuthArgs alexaAuthArgs) {
                alexaAuthArgs.getClass();
                this.f13234a = alexaAuthArgs;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0402b) && this.f13234a == ((C0402b) obj).f13234a;
            }

            public final int hashCode() {
                return this.f13234a.hashCode();
            }

            public final String toString() {
                return "LinkingScreen(alexaAuthArgs=" + this.f13234a + ")";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/newsystem/b$c$c;", "Lcom/dyson/mobile/android/connectedhome/voicecontrol/newsystem/b$c;", "Landroid/net/Uri;", "lwaUri", "<init>", "(Landroid/net/Uri;)V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.connectedhome.voicecontrol.newsystem.b$c$c  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0403c implements c {

            /* renamed from: a  reason: collision with root package name */
            public final Uri f13235a;

            public C0403c(Uri uri) {
                uri.getClass();
                this.f13235a = uri;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0403c) && this.f13235a.equals(((C0403c) obj).f13235a);
            }

            public final int hashCode() {
                return this.f13235a.hashCode();
            }

            public final String toString() {
                return "LwaScreen(lwaUri=" + this.f13235a + ")";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/newsystem/b$c$d;", "Lcom/dyson/mobile/android/connectedhome/voicecontrol/newsystem/b$c;", "Ll00/e;", "voiceControlNdsContent", "<init>", "(Ll00/e;)V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class d implements c {

            /* renamed from: a  reason: collision with root package name */
            public final l00.e f13236a;

            public d(l00.e eVar) {
                this.f13236a = eVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && r.c(this.f13236a, ((d) obj).f13236a);
            }

            public final int hashCode() {
                l00.e eVar = this.f13236a;
                if (eVar == null) {
                    return 0;
                }
                return eVar.hashCode();
            }

            public final String toString() {
                return "StatusFailureScreen(voiceControlNdsContent=" + this.f13236a + ")";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/newsystem/b$c$e;", "Lcom/dyson/mobile/android/connectedhome/voicecontrol/newsystem/b$c;", "Ll00/e;", "voiceControlNdsContent", "<init>", "(Ll00/e;)V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class e implements c {

            /* renamed from: a  reason: collision with root package name */
            public final l00.e f13237a;

            public e(l00.e eVar) {
                this.f13237a = eVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && r.c(this.f13237a, ((e) obj).f13237a);
            }

            public final int hashCode() {
                l00.e eVar = this.f13237a;
                if (eVar == null) {
                    return 0;
                }
                return eVar.hashCode();
            }

            public final String toString() {
                return "SuccessScreen(voiceControlNdsContent=" + this.f13237a + ")";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/newsystem/b$c$f;", "Lcom/dyson/mobile/android/connectedhome/voicecontrol/newsystem/b$c;", "Ll00/e;", "voiceControlNdsContent", "<init>", "(Ll00/e;)V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class f implements c {

            /* renamed from: a  reason: collision with root package name */
            public final l00.e f13238a;

            public f(l00.e eVar) {
                this.f13238a = eVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && r.c(this.f13238a, ((f) obj).f13238a);
            }

            public final int hashCode() {
                l00.e eVar = this.f13238a;
                if (eVar == null) {
                    return 0;
                }
                return eVar.hashCode();
            }

            public final String toString() {
                return "UnlinkFailureScreen(voiceControlNdsContent=" + this.f13238a + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.connectedhome.voicecontrol.newsystem.VoiceControlNdsViewModel$fetchAlexaLinkStatusIfSupported$1", f = "VoiceControlNdsViewModel.kt", l = {120}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class d extends i implements Function2<c0, l12.d<? super f0>, Object> {
        public int d;

        public d(l12.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            return new d(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
            return ((d) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            int i13 = this.d;
            b bVar = b.this;
            try {
                try {
                    try {
                        if (i13 == 0) {
                            h12.r.b(obj);
                            c00.d dVar = bVar.f13214g;
                            this.d = 1;
                            obj = dVar.f10001a.c(this);
                            if (obj == aVar) {
                                return aVar;
                            }
                        } else if (i13 != 1) {
                            pa.c.w("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        } else {
                            h12.r.b(obj);
                        }
                        bVar.f13217j.setValue(null);
                        if (((a00.c) obj).a()) {
                            bVar.V(n.AMAZON_ALEXA_UNLINK);
                        } else {
                            bVar.V(n.AMAZON_ALEXA);
                        }
                    } catch (Exception e) {
                        bVar.V(null);
                        Logger.b("Failed to get Alexa link status", e);
                        f2 f2Var = bVar.f13217j;
                        do {
                            value = f2Var.getValue();
                            c cVar = (c) value;
                        } while (!f2Var.f(value, new c.d(bVar.d.a(n.AMAZON_ALEXA_UNLINK_FAILURE))));
                    }
                    return f0.f36844a;
                } catch (CancellationException e13) {
                    f2 f2Var2 = bVar.f13217j;
                    while (true) {
                        Object value2 = f2Var2.getValue();
                        c cVar2 = (c) value2;
                        bVar.V(null);
                        if (f2Var2.f(value2, new c.d(bVar.d.a(n.AMAZON_ALEXA_UNLINK_FAILURE)))) {
                            break;
                        }
                    }
                    throw e13;
                }
            } finally {
                bVar.f13219l.l(null, Boolean.FALSE);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ll00/n;", com.salesforce.marketingcloud.messages.inbox.b.f21448j, "", "isChecking", "isUnlinking", "Ll00/e;", "<anonymous>", "(Ll00/n;ZZ)Ll00/e;"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.connectedhome.voicecontrol.newsystem.VoiceControlNdsViewModel$voiceControlNdsContent$1", f = "VoiceControlNdsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class e extends i implements o<n, Boolean, Boolean, l12.d<? super l00.e>, Object> {
        public /* synthetic */ n d;
        public /* synthetic */ boolean e;

        /* renamed from: f  reason: collision with root package name */
        public /* synthetic */ boolean f13239f;

        public e(l12.d<? super e> dVar) {
            super(4, dVar);
        }

        @Override // w12.o
        public final Object invoke(n nVar, Boolean bool, Boolean bool2, l12.d<? super l00.e> dVar) {
            boolean booleanValue = bool.booleanValue();
            boolean booleanValue2 = bool2.booleanValue();
            e eVar = new e(dVar);
            eVar.d = nVar;
            eVar.e = booleanValue;
            eVar.f13239f = booleanValue2;
            return eVar.invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            l00.e a13;
            n nVar = this.d;
            boolean z13 = this.e;
            boolean z14 = this.f13239f;
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            h12.r.b(obj);
            if (nVar != null) {
                if ((nVar == n.AMAZON_ALEXA && z13) || (a13 = b.this.d.a(nVar)) == null) {
                    return null;
                }
                boolean z15 = nVar == n.AMAZON_ALEXA_UNLINK && z14;
                int i13 = a13.f50246a;
                String str = a13.f50247b;
                String str2 = a13.f50248c;
                String str3 = a13.d;
                List<String> list = a13.e;
                String str4 = a13.f50249f;
                boolean z16 = a13.f50250g;
                boolean z17 = a13.f50251h;
                boolean z18 = a13.f50252i;
                ij.b bVar = a13.f50254k;
                str.getClass();
                str2.getClass();
                list.getClass();
                bVar.getClass();
                return new l00.e(i13, str, str2, str3, list, str4, z16, z17, z18, z15, bVar);
            }
            return null;
        }
    }

    public b(l00.c cVar, com.dyson.mobile.android.connectedhome.voicecontrol.alexa.parser.a aVar, hj.e eVar, c00.d dVar) {
        cVar.getClass();
        aVar.getClass();
        eVar.getClass();
        dVar.getClass();
        this.d = cVar;
        this.e = aVar;
        this.f13213f = eVar;
        this.f13214g = dVar;
        f2 a13 = g2.a(n.UNKNOWN);
        this.f13215h = a13;
        this.f13216i = a13;
        f2 a14 = g2.a(null);
        this.f13217j = a14;
        this.f13218k = c42.r.d(a14);
        Boolean bool = Boolean.FALSE;
        f2 a15 = g2.a(bool);
        this.f13219l = a15;
        this.f13220m = c42.r.d(a15);
        f2 a16 = g2.a(bool);
        this.f13221n = a16;
        c42.r.d(a16);
        i1 j8 = c42.r.j(a13, a15, a16, new e(null));
        s9.a a17 = v.a(this);
        a2.f10222a.getClass();
        this.f13222o = c42.r.D(j8, a17, a2.a.f10224b, null);
    }

    public final void S() {
        l00.c cVar = this.d;
        xz.a aVar = cVar.f50241a;
        if (aVar.f88327a.contains(cVar.f50242b.c())) {
            this.f13219l.l(null, Boolean.TRUE);
            g0.r(v.a(this), null, null, new d(null), 3);
        }
    }

    public final void T(InterfaceC0400b interfaceC0400b) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        Object value5;
        interfaceC0400b.getClass();
        boolean equals = interfaceC0400b.equals(InterfaceC0400b.C0401b.f13227a);
        l00.c cVar = this.d;
        f2 f2Var = this.f13217j;
        if (equals) {
            V(null);
            do {
                value5 = f2Var.getValue();
                c cVar2 = (c) value5;
            } while (!f2Var.f(value5, new c.a(cVar.a(n.AMAZON_ALEXA_FAILURE))));
        } else if (interfaceC0400b instanceof InterfaceC0400b.e) {
            do {
                value4 = f2Var.getValue();
                c cVar3 = (c) value4;
            } while (!f2Var.f(value4, new c.C0403c(((InterfaceC0400b.e) interfaceC0400b).f13230a)));
        } else if (interfaceC0400b.equals(InterfaceC0400b.f.f13231a)) {
            do {
                value3 = f2Var.getValue();
                c cVar4 = (c) value3;
            } while (!f2Var.f(value3, new c.e(cVar.a(n.AMAZON_ALEXA_SUCCESS))));
        } else if (interfaceC0400b instanceof InterfaceC0400b.d) {
            do {
                value2 = f2Var.getValue();
                c cVar5 = (c) value2;
            } while (!f2Var.f(value2, new c.C0402b(((InterfaceC0400b.d) interfaceC0400b).f13229a)));
        } else if (interfaceC0400b.equals(InterfaceC0400b.a.f13226a)) {
            do {
                value = f2Var.getValue();
                c cVar6 = (c) value;
            } while (!f2Var.f(value, null));
        } else if (interfaceC0400b.equals(InterfaceC0400b.g.f13232a)) {
            g0.r(v.a(this), null, null, new com.dyson.mobile.android.connectedhome.voicecontrol.newsystem.c(this, null), 3);
        } else if (interfaceC0400b.equals(InterfaceC0400b.c.f13228a)) {
            S();
        } else {
            ma.e.o();
        }
    }

    public final void U(n nVar) {
        if (nVar != n.AMAZON_ALEXA) {
            V(nVar);
            return;
        }
        V(nVar);
        S();
    }

    public final void V(n nVar) {
        this.f13215h.setValue(nVar);
    }
}
