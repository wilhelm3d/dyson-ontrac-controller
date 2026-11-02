package com.dyson.mobile.android.resources.brightcove.fullscreenhandler;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;
import com.brightcove.player.appcompat.BrightcovePlayerActivity;
import com.brightcove.player.event.EventType;
import com.brightcove.player.mediacontroller.BrightcoveMediaController;
import com.brightcove.player.model.Video;
import com.brightcove.player.view.BaseVideoView;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.resources.brightcove.fullscreenhandler.a;
import f.j;
import f.q;
import f.x;
import h12.f0;
import h12.h;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kz1.b;
import lw0.e;
import m9.p;
import ms0.d;
import ms0.g;
import ms0.l;
import mz1.f;
import sz1.i;
import sz1.k;
import sz1.v;
import x12.m;
import x12.p0;
import x12.r;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/resources/brightcove/fullscreenhandler/DysonBrightcovePlayerFullscreenActivity;", "Lcom/brightcove/player/appcompat/BrightcovePlayerActivity;", "<init>", "()V", "a", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DysonBrightcovePlayerFullscreenActivity extends BrightcovePlayerActivity {

    /* renamed from: o  reason: collision with root package name */
    public static final a f15665o = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public com.dyson.mobile.android.resources.brightcove.fullscreenhandler.a f15666j;

    /* renamed from: k  reason: collision with root package name */
    public final b f15667k = new b();

    /* renamed from: l  reason: collision with root package name */
    public String f15668l = "";

    /* renamed from: m  reason: collision with root package name */
    public boolean f15669m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f15670n;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/resources/brightcove/fullscreenhandler/DysonBrightcovePlayerFullscreenActivity$b", "Lf/q;", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b extends q {
        public b() {
            super(true);
        }

        @Override // f.q
        public final void b() {
            DysonBrightcovePlayerFullscreenActivity dysonBrightcovePlayerFullscreenActivity = DysonBrightcovePlayerFullscreenActivity.this;
            BaseVideoView baseVideoView = ((BrightcovePlayerActivity) dysonBrightcovePlayerFullscreenActivity).baseVideoView;
            baseVideoView.getClass();
            dysonBrightcovePlayerFullscreenActivity.g1(baseVideoView);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c implements p, m {
        public final /* synthetic */ Function1 d;

        public c(Function1 function1) {
            function1.getClass();
            this.d = function1;
        }

        @Override // x12.m
        public final h<?> d() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof p) && (obj instanceof m)) {
                return r.c(d(), ((m) obj).d());
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

    public static f0 c1(DysonBrightcovePlayerFullscreenActivity dysonBrightcovePlayerFullscreenActivity, ns0.b bVar, Video video) {
        video.getClass();
        long j8 = bVar.f58923f;
        boolean z13 = bVar.f58924g;
        BaseVideoView baseVideoView = dysonBrightcovePlayerFullscreenActivity.baseVideoView;
        baseVideoView.add(video);
        baseVideoView.seekTo(j8);
        if (z13) {
            baseVideoView.start();
        } else {
            baseVideoView.pause();
        }
        return f0.f36844a;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d1(com.dyson.mobile.android.resources.brightcove.fullscreenhandler.DysonBrightcovePlayerFullscreenActivity r5, ns0.b r6, com.brightcove.player.event.Event r7) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.resources.brightcove.fullscreenhandler.DysonBrightcovePlayerFullscreenActivity.d1(com.dyson.mobile.android.resources.brightcove.fullscreenhandler.DysonBrightcovePlayerFullscreenActivity, ns0.b, com.brightcove.player.event.Event):void");
    }

    public static f0 e1(DysonBrightcovePlayerFullscreenActivity dysonBrightcovePlayerFullscreenActivity, Boolean bool) {
        if (r.c(bool, Boolean.TRUE)) {
            dysonBrightcovePlayerFullscreenActivity.baseVideoView.getEventEmitter().emit("error");
        }
        return f0.f36844a;
    }

    public final void g1(BaseVideoView baseVideoView) {
        Map<String, Object> properties;
        Object obj;
        Intent intent = new Intent();
        long playerCurrentPosition = baseVideoView.getVideoDisplay().getPlayerCurrentPosition();
        Video currentVideo = baseVideoView.getCurrentVideo();
        ns0.c cVar = new ns0.c(playerCurrentPosition, (currentVideo == null || (properties = currentVideo.getProperties()) == null || (obj = properties.get(Video.Fields.SELECTED_TEXT_LABEL)) == null || (r6 = obj.toString()) == null) ? "" : "", this.baseVideoView.isPlaying());
        Bundle bundle = new Bundle();
        bundle.putSerializable("video_state", cVar);
        intent.putExtras(bundle);
        setResult(12, intent);
        finish();
    }

    @Override // com.brightcove.player.appcompat.BrightcovePlayerActivity, androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        x.e.getClass();
        j.a(this, x.a.a(0), x.a.a(0));
        super.onCreate(bundle);
        Intent intent = getIntent();
        intent.getClass();
        Serializable c13 = k7.b.c(cd.b.I(intent), "video_state", ns0.b.class);
        if (c13 == null) {
            pa.c.p("Required value was null.");
            return;
        }
        ns0.b bVar = (ns0.b) c13;
        com.dyson.mobile.android.resources.brightcove.fullscreenhandler.a aVar = (com.dyson.mobile.android.resources.brightcove.fullscreenhandler.a) new ViewModelProvider(this, new a.C0540a(new g(), new ms0.b(), new d(String.valueOf(bVar.f58926i)))).a(p0.f86717a.b(com.dyson.mobile.android.resources.brightcove.fullscreenhandler.a.class));
        this.f15666j = aVar;
        aVar.f15675j.observe(this, new c(new l2.b(17, this, bVar)));
        com.dyson.mobile.android.resources.brightcove.fullscreenhandler.a aVar2 = this.f15666j;
        if (aVar2 == null) {
            r.i("fullscreenViewModel");
            throw null;
        }
        aVar2.f15673h.observe(this, new c(new e(this, 24)));
        ss0.d dVar = (ss0.d) q8.g.d(this, R.layout.activity_dyson_brightcove_player);
        com.dyson.mobile.android.resources.brightcove.fullscreenhandler.a aVar3 = this.f15666j;
        if (aVar3 == null) {
            r.i("fullscreenViewModel");
            throw null;
        }
        dVar.l(aVar3);
        this.baseVideoView = dVar.d;
        getOnBackPressedDispatcher().a(this, this.f15667k);
        this.f15668l = bVar.f58925h;
        BaseVideoView baseVideoView = this.baseVideoView;
        BrightcoveMediaController brightcoveMediaController = new BrightcoveMediaController(baseVideoView);
        brightcoveMediaController.setShowHideTimeout(3000);
        brightcoveMediaController.setShowControllerEnable(false);
        baseVideoView.setMediaController(brightcoveMediaController);
        baseVideoView.getEventEmitter().on(EventType.ANY, new ji1.h(13, this, bVar));
        com.dyson.mobile.android.resources.brightcove.fullscreenhandler.a aVar4 = this.f15666j;
        if (aVar4 == null) {
            r.i("fullscreenViewModel");
            throw null;
        }
        String str = bVar.d;
        ms0.a aVar5 = bVar.e;
        d dVar2 = aVar4.e;
        v j8 = aVar4.d.a(str, dVar2.b(), new l(dVar2.a()).a(aVar5)).r(c02.a.f10004c).j(fz1.a.a());
        nn.e eVar = new nn.e(new ns0.a(aVar4, 0), 11);
        b.a aVar6 = kz1.b.f50218a;
        aVar4.f15676k = (f) new i(new sz1.j(new k(j8, eVar), new nn.e(new ns0.a(aVar4, 1), 12)), new nn.e(new ns0.a(aVar4, 2), 13)).n();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/dyson/mobile/android/resources/brightcove/fullscreenhandler/DysonBrightcovePlayerFullscreenActivity$a;", "", "<init>", "()V", "", "ERROR_CODE_KEY", "Ljava/lang/String;", "VIDEO_STATE_KEY", "EMPTY_LANGUAGE_LOCALE", "", "RESULT_CODE", "I", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static f.g a(Context context) {
            context.getClass();
            if (context instanceof f.g) {
                return (f.g) context;
            }
            if (context instanceof ContextWrapper) {
                Context baseContext = ((ContextWrapper) context).getBaseContext();
                baseContext.getClass();
                return a(baseContext);
            }
            return null;
        }

        private a() {
        }
    }
}
