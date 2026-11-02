package com.dyson.mobile.android.machine.machinecontent.expertcontent.chapteredguide;

import androidx.compose.foundation.layout.w;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.j;
import ay1.k;
import com.dyson.mobile.android.machine.machinecontent.expertcontent.chapteredguide.g;
import com.dyson.mobile.android.machine.response.expertcontent.ExpertContentVideo;
import com.dyson.mobile.android.machine.response.expertcontent.ExpertContentVideoPlaylist;
import e6.f;
import i91.c;
import java.util.List;
import q5.t0;
import r3.nd;
import u3.p1;
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final float f15135a;

    /* loaded from: classes3.dex */
    public static final /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15136a;

        static {
            int[] iArr = new int[g.c.values().length];
            try {
                iArr[g.c.MIDDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.c.LAST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f15136a = iArr;
        }
    }

    static {
        f.a aVar = e6.f.e;
        f15135a = 10.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0086, code lost:
        if (r0 == androidx.compose.runtime.Composer.a.f3142b) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x014f, code lost:
        if (r13 == androidx.compose.runtime.Composer.a.f3142b) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.dyson.mobile.android.machine.machinecontent.expertcontent.chapteredguide.g.a r25, androidx.compose.ui.Modifier r26, kotlin.jvm.functions.Function1<? super com.dyson.mobile.android.machine.machinecontent.expertcontent.chapteredguide.c, h12.f0> r27, androidx.compose.runtime.Composer r28, int r29) {
        /*
            Method dump skipped, instructions count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.machine.machinecontent.expertcontent.chapteredguide.f.a(com.dyson.mobile.android.machine.machinecontent.expertcontent.chapteredguide.g$a, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ed, code lost:
        if (x12.r.c(r11.B(), java.lang.Integer.valueOf(r8)) == false) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(androidx.compose.ui.Modifier r21, com.dyson.mobile.android.machine.machinecontent.expertcontent.chapteredguide.g.a r22, com.dyson.mobile.android.resources.brightcove.DysonBrightcoveVideoPlayerView r23, kotlin.jvm.functions.Function1<? super com.dyson.mobile.android.machine.machinecontent.expertcontent.chapteredguide.c, h12.f0> r24, androidx.compose.runtime.Composer r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.machine.machinecontent.expertcontent.chapteredguide.f.b(androidx.compose.ui.Modifier, com.dyson.mobile.android.machine.machinecontent.expertcontent.chapteredguide.g$a, com.dyson.mobile.android.resources.brightcove.DysonBrightcoveVideoPlayerView, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final void c(ExpertContentVideoPlaylist expertContentVideoPlaylist, int i13, Composer composer, int i14) {
        androidx.compose.runtime.a aVar;
        List<ExpertContentVideo> videos;
        ExpertContentVideo expertContentVideo;
        String j8;
        List<ExpertContentVideo> videos2;
        ExpertContentVideo expertContentVideo2;
        androidx.compose.runtime.a k13 = composer.k(273692797);
        int i15 = i14 | (k13.D(expertContentVideoPlaylist) ? 4 : 2) | (k13.f(i13) ? 32 : 16);
        if (k13.t(i15 & 1, (i15 & 19) != 18)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            Modifier.a aVar2 = Modifier.f3231b;
            md1.b.f53765a.getClass();
            i91.c cVar = md1.b.f53766b;
            c.C1280c c1280c = cVar.e;
            float f13 = c1280c.e;
            Modifier a13 = j.a(w.d(androidx.compose.foundation.layout.d.u(aVar2, f13, 0.0f, f13, c1280c.f41189c, 2), 1.0f), "ExpertContentChapteredGuideDescriptionTestTag");
            String str = (expertContentVideoPlaylist == null || (videos2 = expertContentVideoPlaylist.getVideos()) == null || (expertContentVideo2 = videos2.get(i13)) == null || (str = expertContentVideo2.i()) == null) ? "" : "";
            t0 t0Var = md1.b.c(k13).f53773b;
            long j13 = md1.b.a(k13).f41049c.f41082a;
            b6.h.f7062b.getClass();
            aVar = k13;
            nd.c(str, a13, j13, 0L, null, null, null, 0L, null, b6.h.a(b6.h.f7065g), 0L, 0, false, 0, 0, null, t0Var, aVar, 0, 0, 130040);
            cd1.b.a((expertContentVideoPlaylist == null || (videos = expertContentVideoPlaylist.getVideos()) == null || (expertContentVideo = videos.get(i13)) == null || (j8 = expertContentVideo.j()) == null) ? "" : j8, j.a(w.d(androidx.compose.foundation.layout.d.s(aVar2, cVar.e.e, 0.0f, 2), 1.0f), "ExpertContentChapteredGuideLongDescriptionTestTag"), md1.b.a(aVar).f41049c.e, md1.b.c(aVar).f53779j, aVar, 0, 0);
        } else {
            aVar = k13;
            aVar.J();
        }
        androidx.compose.runtime.f c03 = aVar.c0();
        if (c03 != null) {
            c03.d = new k(i13, i14, 5, expertContentVideoPlaylist);
        }
    }
}
