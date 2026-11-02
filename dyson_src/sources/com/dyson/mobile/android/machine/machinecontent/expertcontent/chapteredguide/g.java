package com.dyson.mobile.android.machine.machinecontent.expertcontent.chapteredguide;

import androidx.lifecycle.LifecycleOwner;
import com.brightcove.player.event.AbstractEvent;
import com.brightcove.player.model.Video;
import com.dyson.mobile.android.machine.machinecontent.expertcontent.chapteredguide.g;
import com.dyson.mobile.android.machine.response.expertcontent.ExpertContentVideoPlaylist;
import h12.f0;
import h12.y;
import hj.e;
import hx.v;
import java.util.Arrays;
import java.util.LinkedHashMap;
import ji1.k;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kz1.b;
import lj.a;
import m9.u;
import nj.l7;
import rf0.i0;
import sz1.i;
import sz1.j;
import u3.k1;
import u3.y2;
import x12.o0;
import x12.r;
import x12.u0;
import y9.w;
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u000f\u0010\u0011B3\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/chapteredguide/g;", "Lm9/u;", "Lm9/c;", "Ldk0/f;", "expertContentVideoRepository", "Lpf0/c;", "localisationManager", "Lhj/e;", "trackingManager", "Lms0/e;", "brightcoveVideoTracker", "Lcom/dyson/mobile/android/machine/response/expertcontent/ExpertContentVideoPlaylist;", AbstractEvent.PLAYLIST, "<init>", "(Ldk0/f;Lpf0/c;Lhj/e;Lms0/e;Lcom/dyson/mobile/android/machine/response/expertcontent/ExpertContentVideoPlaylist;)V", "b", "c", "a", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class g extends u implements m9.c {
    public final dk0.f d;
    public final pf0.c e;

    /* renamed from: f  reason: collision with root package name */
    public final hj.e f15137f;

    /* renamed from: g  reason: collision with root package name */
    public final ms0.e f15138g;

    /* renamed from: h  reason: collision with root package name */
    public final ExpertContentVideoPlaylist f15139h;

    /* renamed from: i  reason: collision with root package name */
    public final xf1.a<f0> f15140i;

    /* renamed from: j  reason: collision with root package name */
    public final xf1.a<f0> f15141j;

    /* renamed from: k  reason: collision with root package name */
    public final k1 f15142k;

    @wy1.a
    /* loaded from: classes3.dex */
    public interface b {
        g a(ExpertContentVideoPlaylist expertContentVideoPlaylist);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/chapteredguide/g$c;", "", "<init>", "(Ljava/lang/String;I)V", "FIRST", "MIDDLE", "LAST", "OTHER", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c {
        private static final /* synthetic */ o12.a $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        public static final c FIRST = new c("FIRST", 0);
        public static final c MIDDLE = new c("MIDDLE", 1);
        public static final c LAST = new c("LAST", 2);
        public static final c OTHER = new c("OTHER", 3);

        private static final /* synthetic */ c[] $values() {
            return new c[]{FIRST, MIDDLE, LAST, OTHER};
        }

        static {
            c[] $values = $values();
            $VALUES = $values;
            $ENTRIES = v.l($values);
        }

        private c(String str, int i13) {
        }

        public static o12.a<c> getEntries() {
            return $ENTRIES;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }
    }

    public g(dk0.f fVar, pf0.c cVar, hj.e eVar, ms0.e eVar2, ExpertContentVideoPlaylist expertContentVideoPlaylist) {
        fVar.getClass();
        cVar.getClass();
        eVar.getClass();
        eVar2.getClass();
        expertContentVideoPlaylist.getClass();
        this.d = fVar;
        this.e = cVar;
        this.f15137f = eVar;
        this.f15138g = eVar2;
        this.f15139h = expertContentVideoPlaylist;
        this.f15140i = new xf1.a<>();
        this.f15141j = new xf1.a<>();
        this.f15142k = androidx.compose.runtime.d.j(new a(0, null, null, false, false, null, null, null, 255, null));
        S(0);
    }

    public final void S(final int i13) {
        final o0 o0Var = new o0();
        sz1.v j8 = this.d.b(this.f15139h.getVideos().get(i13).k().i()).r(c02.a.f10004c).j(fz1.a.a());
        k kVar = new k(new ki0.f(this, 0), 28);
        b.a aVar = kz1.b.f50218a;
        new sz1.h(new i(new sz1.k(new j(j8, kVar), new k(new fl0.d(o0Var, this, i13, 4), 29)), new ki0.g(new ki0.f(this, 1), 0)), new iz1.a() { // from class: ki0.h
            @Override // iz1.a
            public final void run() {
                com.dyson.mobile.android.machine.machinecontent.expertcontent.chapteredguide.g gVar = com.dyson.mobile.android.machine.machinecontent.expertcontent.chapteredguide.g.this;
                k1 k1Var = gVar.f15142k;
                g.a aVar2 = (g.a) ((y2) k1Var).getValue();
                ExpertContentVideoPlaylist expertContentVideoPlaylist = gVar.f15139h;
                int size = expertContentVideoPlaylist.getVideos().size() - 1;
                int i14 = i13;
                g.c cVar = i14 == 0 ? g.c.FIRST : (1 > i14 || i14 >= size) ? i14 == size ? g.c.LAST : g.c.OTHER : g.c.MIDDLE;
                Video video = (Video) o0Var.d;
                int size2 = expertContentVideoPlaylist.getVideos().size();
                u0 u0Var = u0.f86723a;
                ((y2) k1Var).setValue(g.a.a(aVar2, i14, cVar, video, false, false, expertContentVideoPlaylist, String.format(gVar.e.d(i0.f71920xb), Arrays.copyOf(new Object[]{Integer.valueOf(i14 + 1), Integer.valueOf(size2)}, 2)), expertContentVideoPlaylist.getVideos().get(i14).l(), 16));
            }
        }).n();
    }

    @Override // m9.c
    public final void onResume(LifecycleOwner lifecycleOwner) {
        String id2 = this.f15139h.getId();
        int i13 = l7.f57579a;
        id2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        a.h.f52154a.getClass();
        ij.b e = ma.e.e(linkedHashMap, a.h.f52155b, id2, "machine.expert_content.playlist", linkedHashMap);
        e.a aVar = hj.e.f38312g;
        this.f15137f.h(e, null);
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/chapteredguide/g$a;", "", "", AbstractEvent.INDEX, "Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/chapteredguide/g$c;", "indexState", "Lcom/brightcove/player/model/Video;", "video", "", "isLoadingVideo", "isVideoError", "Lcom/dyson/mobile/android/machine/response/expertcontent/ExpertContentVideoPlaylist;", AbstractEvent.PLAYLIST, "", "progressBarAccessibilityDescription", "videoVoiceOverText", "<init>", "(ILcom/dyson/mobile/android/machine/machinecontent/expertcontent/chapteredguide/g$c;Lcom/brightcove/player/model/Video;ZZLcom/dyson/mobile/android/machine/response/expertcontent/ExpertContentVideoPlaylist;Ljava/lang/String;Ljava/lang/String;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f15143a;

        /* renamed from: b  reason: collision with root package name */
        public final c f15144b;

        /* renamed from: c  reason: collision with root package name */
        public final Video f15145c;
        public final boolean d;
        public final boolean e;

        /* renamed from: f  reason: collision with root package name */
        public final ExpertContentVideoPlaylist f15146f;

        /* renamed from: g  reason: collision with root package name */
        public final String f15147g;

        /* renamed from: h  reason: collision with root package name */
        public final String f15148h;

        public /* synthetic */ a(int i13, c cVar, Video video, boolean z13, boolean z14, ExpertContentVideoPlaylist expertContentVideoPlaylist, String str, String str2, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this((i14 & 1) != 0 ? 0 : i13, (i14 & 2) != 0 ? c.FIRST : cVar, (i14 & 4) != 0 ? null : video, (i14 & 8) != 0 ? true : z13, (i14 & 16) != 0 ? false : z14, (i14 & 32) != 0 ? null : expertContentVideoPlaylist, (i14 & 64) != 0 ? "" : str, (i14 & 128) != 0 ? null : str2);
        }

        public static a a(a aVar, int i13, c cVar, Video video, boolean z13, boolean z14, ExpertContentVideoPlaylist expertContentVideoPlaylist, String str, String str2, int i14) {
            if ((i14 & 1) != 0) {
                i13 = aVar.f15143a;
            }
            int i15 = i13;
            if ((i14 & 2) != 0) {
                cVar = aVar.f15144b;
            }
            c cVar2 = cVar;
            if ((i14 & 4) != 0) {
                video = aVar.f15145c;
            }
            Video video2 = video;
            if ((i14 & 8) != 0) {
                z13 = aVar.d;
            }
            boolean z15 = z13;
            if ((i14 & 16) != 0) {
                z14 = aVar.e;
            }
            boolean z16 = z14;
            if ((i14 & 32) != 0) {
                expertContentVideoPlaylist = aVar.f15146f;
            }
            ExpertContentVideoPlaylist expertContentVideoPlaylist2 = expertContentVideoPlaylist;
            String str3 = (i14 & 64) != 0 ? aVar.f15147g : str;
            String str4 = (i14 & 128) != 0 ? aVar.f15148h : str2;
            aVar.getClass();
            cVar2.getClass();
            str3.getClass();
            return new a(i15, cVar2, video2, z15, z16, expertContentVideoPlaylist2, str3, str4);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.f15143a == aVar.f15143a && this.f15144b == aVar.f15144b && r.c(this.f15145c, aVar.f15145c) && this.d == aVar.d && this.e == aVar.e && r.c(this.f15146f, aVar.f15146f) && r.c(this.f15147g, aVar.f15147g) && r.c(this.f15148h, aVar.f15148h);
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = (this.f15144b.hashCode() + (Integer.hashCode(this.f15143a) * 31)) * 31;
            Video video = this.f15145c;
            int c13 = w.c(w.c((hashCode + (video == null ? 0 : video.hashCode())) * 31, 31, this.d), 31, this.e);
            ExpertContentVideoPlaylist expertContentVideoPlaylist = this.f15146f;
            int c14 = y.c((c13 + (expertContentVideoPlaylist == null ? 0 : expertContentVideoPlaylist.hashCode())) * 31, 31, this.f15147g);
            String str = this.f15148h;
            return c14 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ExpertContentChapteredGuideUiState(index=");
            sb2.append(this.f15143a);
            sb2.append(", indexState=");
            sb2.append(this.f15144b);
            sb2.append(", video=");
            sb2.append(this.f15145c);
            sb2.append(", isLoadingVideo=");
            sb2.append(this.d);
            sb2.append(", isVideoError=");
            sb2.append(this.e);
            sb2.append(", playlist=");
            sb2.append(this.f15146f);
            sb2.append(", progressBarAccessibilityDescription=");
            return jy1.a.f(sb2, this.f15147g, ", videoVoiceOverText=", this.f15148h, ")");
        }

        public a(int i13, c cVar, Video video, boolean z13, boolean z14, ExpertContentVideoPlaylist expertContentVideoPlaylist, String str, String str2) {
            cVar.getClass();
            str.getClass();
            this.f15143a = i13;
            this.f15144b = cVar;
            this.f15145c = video;
            this.d = z13;
            this.e = z14;
            this.f15146f = expertContentVideoPlaylist;
            this.f15147g = str;
            this.f15148h = str2;
        }

        public a() {
            this(0, null, null, false, false, null, null, null, 255, null);
        }
    }
}
