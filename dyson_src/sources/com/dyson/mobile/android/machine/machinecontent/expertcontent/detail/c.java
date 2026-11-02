package com.dyson.mobile.android.machine.machinecontent.expertcontent.detail;

import b0.y1;
import b42.m;
import c42.f2;
import c42.g2;
import c42.r1;
import com.brightcove.player.event.AbstractEvent;
import com.brightcove.player.event.Event;
import com.brightcove.player.model.Video;
import com.dyson.mobile.android.machine.response.expertcontent.ExpertContentItem;
import com.dyson.mobile.android.machine.response.expertcontent.ExpertContentVideoPlaylist;
import com.paypal.android.platform.authsdk.authcommon.analytics.EventsNameKt;
import h12.f0;
import h12.p;
import h12.q;
import h12.r;
import java.time.Instant;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.u;
import m9.v;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import q62.n;
import v32.k;
import v32.l;
import z32.c0;
import z32.d2;
import z32.g0;
import z32.m1;
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001:\u0007\u0010\u0011\u0012\u0013\u0014\u0015\u0016BG\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\f\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, d2 = {"Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/detail/c;", "Lm9/u;", "Ldk0/f;", "expertContentVideoRepository", "Lvi0/i;", "machineContentRepository", "Lms0/e;", "brightcoveVideoTracker", "Ltj/a;", "marketManager", "", "machineSerial", "collectionId", "itemId", "<init>", "(Ldk0/f;Lvi0/i;Lms0/e;Ltj/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "c", "e", "f", "g", "d", "b", "a", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c extends u {

    /* renamed from: t  reason: collision with root package name */
    public static final /* synthetic */ int f15182t = 0;
    public final dk0.f d;
    public final vi0.i e;

    /* renamed from: f  reason: collision with root package name */
    public final ms0.e f15183f;

    /* renamed from: g  reason: collision with root package name */
    public final tj.a f15184g;

    /* renamed from: h  reason: collision with root package name */
    public final String f15185h;

    /* renamed from: i  reason: collision with root package name */
    public final String f15186i;

    /* renamed from: j  reason: collision with root package name */
    public final String f15187j;

    /* renamed from: k  reason: collision with root package name */
    public final f2 f15188k;

    /* renamed from: l  reason: collision with root package name */
    public final r1 f15189l;

    /* renamed from: m  reason: collision with root package name */
    public final f2 f15190m;

    /* renamed from: n  reason: collision with root package name */
    public final r1 f15191n;

    /* renamed from: o  reason: collision with root package name */
    public final b42.c f15192o;

    /* renamed from: p  reason: collision with root package name */
    public final c42.e f15193p;

    /* renamed from: q  reason: collision with root package name */
    public final AtomicBoolean f15194q;

    /* renamed from: r  reason: collision with root package name */
    public d2 f15195r;

    /* renamed from: s  reason: collision with root package name */
    public d2 f15196s;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/detail/c$b;", "", "", "url", AnnotatedPrivateKey.LABEL, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f15197a;

        /* renamed from: b  reason: collision with root package name */
        public final String f15198b;

        public b(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.f15197a = str;
            this.f15198b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.f15197a.equals(bVar.f15197a) && this.f15198b.equals(bVar.f15198b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f15198b.hashCode() + (this.f15197a.hashCode() * 31);
        }

        public final String toString() {
            return y1.j("ExpertContentCtaLink(url=", this.f15197a, ", label=", this.f15198b, ")");
        }
    }

    @wy1.a
    /* renamed from: com.dyson.mobile.android.machine.machinecontent.expertcontent.detail.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0511c {
        c a(String str, String str2, String str3);
    }

    /* loaded from: classes3.dex */
    public interface d {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/detail/c$d$a;", "Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/detail/c$d;", "<init>", "()V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a implements d {

            /* renamed from: a  reason: collision with root package name */
            public static final a f15199a = new a();

            private a() {
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1793469392;
            }

            public final String toString() {
                return EventsNameKt.GENERIC_ERROR_MESSAGE;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/detail/c$d$b;", "Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/detail/c$d;", "<init>", "()V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class b implements d {

            /* renamed from: a  reason: collision with root package name */
            public static final b f15200a = new b();

            private b() {
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -1237128956;
            }

            public final String toString() {
                return "Loading";
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface e {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/detail/c$e$a;", "Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/detail/c$e;", "Lcom/dyson/mobile/android/machine/response/expertcontent/ExpertContentVideoPlaylist;", AbstractEvent.PLAYLIST, "<init>", "(Lcom/dyson/mobile/android/machine/response/expertcontent/ExpertContentVideoPlaylist;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a implements e {

            /* renamed from: a  reason: collision with root package name */
            public final ExpertContentVideoPlaylist f15201a;

            public a(ExpertContentVideoPlaylist expertContentVideoPlaylist) {
                expertContentVideoPlaylist.getClass();
                this.f15201a = expertContentVideoPlaylist;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.f15201a.equals(((a) obj).f15201a);
            }

            public final int hashCode() {
                return this.f15201a.hashCode();
            }

            public final String toString() {
                return "LaunchChapteredGuide(playlist=" + this.f15201a + ")";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/detail/c$e$b;", "Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/detail/c$e;", "<init>", "()V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class b implements e {

            /* renamed from: a  reason: collision with root package name */
            public static final b f15202a = new b();

            private b() {
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -2010127276;
            }

            public final String toString() {
                return "NavigateBack";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/detail/c$e$c;", "Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/detail/c$e;", "Lkj/b;", "urlWithTracking", "<init>", "(Lkj/b;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.machine.machinecontent.expertcontent.detail.c$e$c  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0512c implements e {

            /* renamed from: a  reason: collision with root package name */
            public final kj.b f15203a;

            public C0512c(kj.b bVar) {
                bVar.getClass();
                this.f15203a = bVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0512c) && this.f15203a.equals(((C0512c) obj).f15203a);
            }

            public final int hashCode() {
                return this.f15203a.hashCode();
            }

            public final String toString() {
                return "OpenExternalUrl(urlWithTracking=" + this.f15203a + ")";
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface f {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/detail/c$f$a;", "Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/detail/c$f;", "<init>", "()V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a implements f {

            /* renamed from: a  reason: collision with root package name */
            public static final a f15204a = new a();

            private a() {
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -2053530189;
            }

            public final String toString() {
                return "BackButtonClick";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/detail/c$f$b;", "Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/detail/c$f;", "<init>", "()V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class b implements f {

            /* renamed from: a  reason: collision with root package name */
            public static final b f15205a = new b();

            private b() {
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1552844977;
            }

            public final String toString() {
                return "ExpertContentCtaLinkClick";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/detail/c$f$c;", "Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/detail/c$f;", "<init>", "()V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.machine.machinecontent.expertcontent.detail.c$f$c  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0513c implements f {

            /* renamed from: a  reason: collision with root package name */
            public static final C0513c f15206a = new C0513c();

            private C0513c() {
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0513c);
            }

            public final int hashCode() {
                return -447037823;
            }

            public final String toString() {
                return "LaunchPlaylist";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/detail/c$f$d;", "Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/detail/c$f;", "<init>", "()V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class d implements f {

            /* renamed from: a  reason: collision with root package name */
            public static final d f15207a = new d();

            private d() {
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -588378766;
            }

            public final String toString() {
                return "RefreshExpertContentDetails";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/detail/c$f$e;", "Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/detail/c$f;", "<init>", "()V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class e implements f {

            /* renamed from: a  reason: collision with root package name */
            public static final e f15208a = new e();

            private e() {
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 644972860;
            }

            public final String toString() {
                return "RefreshVideo";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/detail/c$f$f;", "Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/detail/c$f;", "Lcom/brightcove/player/event/Event;", "event", "<init>", "(Lcom/brightcove/player/event/Event;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.machine.machinecontent.expertcontent.detail.c$f$f  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0514f implements f {

            /* renamed from: a  reason: collision with root package name */
            public final Event f15209a;

            public C0514f(Event event) {
                event.getClass();
                this.f15209a = event;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0514f) && this.f15209a.equals(((C0514f) obj).f15209a);
            }

            public final int hashCode() {
                return this.f15209a.hashCode();
            }

            public final String toString() {
                return "VideoPlayerEvent(event=" + this.f15209a + ")";
            }
        }
    }

    /* loaded from: classes3.dex */
    public interface g {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/detail/c$g$a;", "Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/detail/c$g;", "<init>", "()V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a implements g {

            /* renamed from: a  reason: collision with root package name */
            public static final a f15210a = new a();

            private a() {
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1069424892;
            }

            public final String toString() {
                return EventsNameKt.GENERIC_ERROR_MESSAGE;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/detail/c$g$b;", "Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/detail/c$g;", "<init>", "()V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class b implements g {

            /* renamed from: a  reason: collision with root package name */
            public static final b f15211a = new b();

            private b() {
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 595500856;
            }

            public final String toString() {
                return "Loading";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/detail/c$g$c;", "Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/detail/c$g;", "Lcom/brightcove/player/model/Video;", "video", "<init>", "(Lcom/brightcove/player/model/Video;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.machine.machinecontent.expertcontent.detail.c$g$c  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0515c implements g {

            /* renamed from: a  reason: collision with root package name */
            public final Video f15212a;

            public C0515c(Video video) {
                video.getClass();
                this.f15212a = video;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0515c) && this.f15212a.equals(((C0515c) obj).f15212a);
            }

            public final int hashCode() {
                return this.f15212a.hashCode();
            }

            public final String toString() {
                return "Ready(video=" + this.f15212a + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.machine.machinecontent.expertcontent.detail.ExpertContentDetailViewModel$fetchExpertContentDetails$2", f = "ExpertContentDetailViewModel.kt", l = {122}, m = "invokeSuspend", v = 2)
    /* loaded from: classes3.dex */
    public static final class h extends n12.i implements Function2<c0, l12.d<? super f0>, Object> {
        public c d;
        public int e;

        /* renamed from: f  reason: collision with root package name */
        public /* synthetic */ Object f15213f;

        public h(l12.d<? super h> dVar) {
            super(2, dVar);
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            h hVar = new h(dVar);
            hVar.f15213f = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
            return ((h) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            Object bVar;
            Object value;
            c cVar;
            d eVar;
            Object value2;
            c0 c0Var = (c0) this.f15213f;
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            int i13 = this.e;
            b bVar2 = null;
            c cVar2 = c.this;
            try {
                if (i13 == 0) {
                    r.b(obj);
                    int i14 = q.e;
                    vi0.i iVar = cVar2.e;
                    String str = cVar2.f15186i;
                    String str2 = cVar2.f15187j;
                    String str3 = cVar2.f15185h;
                    this.f15213f = c0Var;
                    this.d = cVar2;
                    this.e = 1;
                    obj = g0.v(iVar.f84265b.c(), new vi0.d(iVar, str, str3, str2, null), this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    cVar = cVar2;
                } else if (i13 != 1) {
                    pa.c.w("call to 'resume' before 'invoke' with coroutine");
                    return null;
                } else {
                    cVar = this.d;
                    r.b(obj);
                }
                p pVar = (p) obj;
                ExpertContentItem expertContentItem = (ExpertContentItem) pVar.d;
                String str4 = (String) pVar.e;
                ExpertContentVideoPlaylist playlist = expertContentItem.getPlaylist();
                if (playlist == null || playlist.getVideos().size() <= 1) {
                    String i15 = expertContentItem.getVideo().k().i();
                    String title = expertContentItem.getTitle();
                    String j8 = expertContentItem.getVideo().j();
                    String str5 = j8 == null ? "" : j8;
                    String ctaTitle = expertContentItem.getCtaTitle();
                    String ctaLink = expertContentItem.getCtaLink();
                    int i16 = c.f15182t;
                    cVar.getClass();
                    if (ctaTitle != null && ctaTitle.length() != 0 && ctaLink != null && ctaLink.length() != 0) {
                        bVar2 = new b(ctaLink, ctaTitle);
                    }
                    eVar = new com.dyson.mobile.android.machine.machinecontent.expertcontent.detail.e(str4, title, str5, bVar2, i15, cVar.f15184g.c());
                    cVar.T(expertContentItem.getVideo().k().i());
                } else {
                    String title2 = expertContentItem.getTitle();
                    String j13 = expertContentItem.getVideo().j();
                    eVar = new com.dyson.mobile.android.machine.machinecontent.expertcontent.detail.d(expertContentItem.getPoster().i(), str4, title2, j13 == null ? "" : j13, playlist);
                }
                f2 f2Var = cVar.f15188k;
                do {
                    value2 = f2Var.getValue();
                    d dVar = (d) value2;
                } while (!f2Var.f(value2, eVar));
                bVar = f0.f36844a;
                int i17 = q.e;
            } catch (Throwable th2) {
                int i18 = q.e;
                bVar = new q.b(th2);
            }
            Throwable b13 = q.b(bVar);
            if (b13 != null) {
                n.n("Unable to fetch expert content item: ", b13.getMessage(), b13);
                f2 f2Var2 = cVar2.f15188k;
                do {
                    value = f2Var2.getValue();
                    d dVar2 = (d) value;
                } while (!f2Var2.f(value, d.a.f15199a));
                g0.j(c0Var.getCoroutineContext());
            }
            return f0.f36844a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.machine.machinecontent.expertcontent.detail.ExpertContentDetailViewModel$fetchVideo$2", f = "ExpertContentDetailViewModel.kt", l = {166}, m = "invokeSuspend", v = 2)
    /* loaded from: classes3.dex */
    public static final class i extends n12.i implements Function2<c0, l12.d<? super f0>, Object> {
        public c d;
        public int e;

        /* renamed from: f  reason: collision with root package name */
        public /* synthetic */ Object f15215f;

        /* renamed from: h  reason: collision with root package name */
        public final /* synthetic */ String f15217h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, l12.d<? super i> dVar) {
            super(2, dVar);
            this.f15217h = str;
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            i iVar = new i(this.f15217h, dVar);
            iVar.f15215f = obj;
            return iVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
            return ((i) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            Object bVar;
            Object value;
            c cVar;
            Object value2;
            c0 c0Var = (c0) this.f15215f;
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            int i13 = this.e;
            c cVar2 = c.this;
            try {
                if (i13 == 0) {
                    r.b(obj);
                    String str = this.f15217h;
                    int i14 = q.e;
                    dk0.f fVar = cVar2.d;
                    this.f15215f = c0Var;
                    this.d = cVar2;
                    this.e = 1;
                    obj = fVar.a(str, false, this);
                    if (obj == aVar) {
                        return aVar;
                    }
                    cVar = cVar2;
                } else if (i13 != 1) {
                    pa.c.w("call to 'resume' before 'invoke' with coroutine");
                    return null;
                } else {
                    cVar = this.d;
                    r.b(obj);
                }
                Video video = (Video) obj;
                f2 f2Var = cVar.f15190m;
                do {
                    value2 = f2Var.getValue();
                    g gVar = (g) value2;
                } while (!f2Var.f(value2, new g.C0515c(video)));
                bVar = f0.f36844a;
                int i15 = q.e;
            } catch (Throwable th2) {
                int i16 = q.e;
                bVar = new q.b(th2);
            }
            Throwable b13 = q.b(bVar);
            if (b13 != null) {
                n.n("Unable to fetch expert content video: ", b13.getMessage(), b13);
                f2 f2Var2 = cVar2.f15190m;
                do {
                    value = f2Var2.getValue();
                    g gVar2 = (g) value;
                } while (!f2Var2.f(value, g.a.f15210a));
                g0.j(c0Var.getCoroutineContext());
            }
            return f0.f36844a;
        }
    }

    static {
        new a(null);
    }

    public c(dk0.f fVar, vi0.i iVar, ms0.e eVar, tj.a aVar, String str, String str2, String str3) {
        fVar.getClass();
        iVar.getClass();
        eVar.getClass();
        aVar.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.d = fVar;
        this.e = iVar;
        this.f15183f = eVar;
        this.f15184g = aVar;
        this.f15185h = str;
        this.f15186i = str2;
        this.f15187j = str3;
        f2 a13 = g2.a(d.b.f15200a);
        this.f15188k = a13;
        this.f15189l = c42.r.d(a13);
        f2 a14 = g2.a(g.b.f15211a);
        this.f15190m = a14;
        this.f15191n = c42.r.d(a14);
        b42.c b13 = m.b(0, null, null, 7);
        this.f15192o = b13;
        this.f15193p = c42.r.B(b13);
        this.f15194q = new AtomicBoolean(false);
        S();
    }

    public final void S() {
        f2 f2Var;
        Object value;
        do {
            f2Var = this.f15188k;
            value = f2Var.getValue();
            d dVar = (d) value;
        } while (!f2Var.f(value, d.b.f15200a));
        d2 d2Var = this.f15196s;
        if (d2Var != null) {
            m1.a aVar = m1.f91486a1;
            d2Var.c(null);
        }
        this.f15196s = g0.r(v.a(this), null, null, new h(null), 3);
    }

    public final void T(String str) {
        f2 f2Var;
        Object value;
        do {
            f2Var = this.f15190m;
            value = f2Var.getValue();
            g gVar = (g) value;
        } while (!f2Var.f(value, g.b.f15211a));
        d2 d2Var = this.f15195r;
        if (d2Var != null) {
            m1.a aVar = m1.f91486a1;
            d2Var.c(null);
        }
        this.f15195r = g0.r(v.a(this), null, null, new i(str, null), 3);
    }

    public final void U(String str, String str2) {
        k b13 = new l("exp=([0-9]+)").b(str2);
        if (b13 == null || !Instant.ofEpochSecond(Long.parseLong((String) ((k.a) b13.a()).get(1))).isBefore(Instant.now())) {
            return;
        }
        this.f15194q.set(true);
        T(str);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/detail/c$a;", "", "<init>", "()V", "", "REGEX_EXPIRATION_TIMESTAMP", "Ljava/lang/String;", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
