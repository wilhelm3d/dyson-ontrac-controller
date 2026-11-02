package com.dyson.mobile.android.resources.brightcove;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.SystemClock;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.accessibility.CaptioningManager;
import androidx.activity.result.ActivityResultRegistry;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.brightcove.player.captioning.BrightcoveCaptionFormat;
import com.brightcove.player.captioning.BrightcoveCaptionStyle;
import com.brightcove.player.captioning.preferences.CaptionConstants;
import com.brightcove.player.edge.CatalogError;
import com.brightcove.player.edge.VideoListener;
import com.brightcove.player.event.AbstractEvent;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
import com.brightcove.player.event.EventType;
import com.brightcove.player.management.BrightcoveClosedCaptioningManager;
import com.brightcove.player.mediacontroller.BrightcoveMediaController;
import com.brightcove.player.model.BrightcoveError;
import com.brightcove.player.model.Video;
import com.brightcove.player.model.VideoFields;
import com.brightcove.player.view.BrightcoveExoPlayerVideoView;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.logging.Logger;
import com.dyson.mobile.android.resources.brightcove.b;
import com.dyson.mobile.android.resources.brightcove.fullscreenhandler.DysonBrightcovePlayerFullscreenActivity;
import com.paypal.pyplcheckout.ui.feature.addressbook.view.customviews.PayPalNewShippingAddressReviewViewKt;
import g5.h;
import h12.f0;
import h12.p;
import i.d;
import i12.c0;
import i12.p0;
import i12.q0;
import i12.u;
import java.net.URI;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ma.e;
import ms0.i;
import ms0.j;
import ms0.k;
import q8.g;
import q8.n;
import qv1.s;
import v32.w;
import v32.y;
import w32.b;
import x12.r;
import x12.u0;
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001:\u0001lB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u0013\u0010\u0011\u001a\u00020\u000b*\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u000b*\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0012R\"\u0010\u0019\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0012R$\u0010!\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00105\u001a\u00020*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010,\u001a\u0004\b3\u0010.\"\u0004\b4\u00100R\"\u0010;\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010\rR.\u0010D\u001a\u0004\u0018\u00010<2\b\u0010=\u001a\u0004\u0018\u00010<8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR.\u0010H\u001a\u0004\u0018\u00010\u001a2\b\u0010=\u001a\u0004\u0018\u00010\u001a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010\u001c\u001a\u0004\bF\u0010\u001e\"\u0004\bG\u0010 R\"\u0010P\u001a\u00020I8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR$\u0010X\u001a\u0004\u0018\u00010Q8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR0\u0010a\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0018\u00010Yj\u0004\u0018\u0001`Z8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\"\u0010e\u001a\u00020*8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010,\u001a\u0004\bc\u0010.\"\u0004\bd\u00100R*\u0010f\u001a\u00020*2\u0006\u0010=\u001a\u00020*8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010,\u001a\u0004\bf\u0010.\"\u0004\bg\u00100R*\u0010h\u001a\u00020*2\u0006\u0010=\u001a\u00020*8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\bh\u0010,\u001a\u0004\bh\u0010.\"\u0004\bi\u00100R$\u0010j\u001a\u00020I2\u0006\u0010=\u001a\u00020I8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bj\u0010K\"\u0004\bk\u0010O¨\u0006m"}, d2 = {"Lcom/dyson/mobile/android/resources/brightcove/DysonBrightcoveVideoPlayerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", PayPalNewShippingAddressReviewViewKt.STATE, "Lh12/f0;", "setUpMediaSession", "(I)V", "currentState", "setMediaSessionState", "Lcom/brightcove/player/view/BrightcoveExoPlayerVideoView;", "setPreferredLocale", "(Lcom/brightcove/player/view/BrightcoveExoPlayerVideoView;)V", "setInitialCaptionsLocale", "d", "Lcom/brightcove/player/view/BrightcoveExoPlayerVideoView;", "getBrightcoveExoPlayerVideoView", "()Lcom/brightcove/player/view/BrightcoveExoPlayerVideoView;", "setBrightcoveExoPlayerVideoView", "brightcoveExoPlayerVideoView", "", "e", "Ljava/lang/String;", "getCurrentMarket", "()Ljava/lang/String;", "setCurrentMarket", "(Ljava/lang/String;)V", "currentMarket", "Lms0/a;", "f", "Lms0/a;", "getAccount", "()Lms0/a;", "setAccount", "(Lms0/a;)V", EventType.ACCOUNT, "", "g", "Z", "getLoopMode", "()Z", "setLoopMode", "(Z)V", "loopMode", "h", "getShowControlWhenLoopModeEnabled", "setShowControlWhenLoopModeEnabled", "showControlWhenLoopModeEnabled", "i", "I", "getHorizontalMargin", "()I", "setHorizontalMargin", "horizontalMargin", "Lcom/brightcove/player/model/Video;", "value", "j", "Lcom/brightcove/player/model/Video;", "getVideo", "()Lcom/brightcove/player/model/Video;", EventType.SET_VIDEO, "(Lcom/brightcove/player/model/Video;)V", "video", "k", "getVideoId", "setVideoId", "videoId", "", "l", "J", "getVideoStartTime", "()J", "setVideoStartTime", "(J)V", "videoStartTime", "Lcom/brightcove/player/event/EventListener;", "m", "Lcom/brightcove/player/event/EventListener;", "getEventListener", "()Lcom/brightcove/player/event/EventListener;", "setEventListener", "(Lcom/brightcove/player/event/EventListener;)V", "eventListener", "Lkotlin/Function0;", "Lcom/dyson/mobile/android/resources/brightcove/OnRetryClickedListener;", "n", "Lw12/a;", "getDefaultRetryAction", "()Lw12/a;", "setDefaultRetryAction", "(Lw12/a;)V", "defaultRetryAction", "o", "getEnableCaptionsByDefault", "setEnableCaptionsByDefault", "enableCaptionsByDefault", "isLoadingVideo", "setLoadingVideo", "isVideoError", "setVideoError", "videoDurationMillis", "setVideoDurationMillis", "a", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DysonBrightcoveVideoPlayerView extends ConstraintLayout {
    public static final URI A;

    /* renamed from: z */
    public static final int f15628z;
    public BrightcoveExoPlayerVideoView d;
    public String e;

    /* renamed from: f */
    public ms0.a f15629f;

    /* renamed from: g */
    public boolean f15630g;

    /* renamed from: h */
    public boolean f15631h;

    /* renamed from: i */
    public int f15632i;

    /* renamed from: j */
    public Video f15633j;

    /* renamed from: k */
    public String f15634k;

    /* renamed from: l */
    public long f15635l;

    /* renamed from: m */
    public EventListener f15636m;

    /* renamed from: n */
    public w12.a<f0> f15637n;

    /* renamed from: o */
    public boolean f15638o;

    /* renamed from: p */
    public boolean f15639p;

    /* renamed from: q */
    public boolean f15640q;

    /* renamed from: r */
    public URI f15641r;

    /* renamed from: s */
    public final MediaSessionCompat f15642s;

    /* renamed from: t */
    public boolean f15643t;

    /* renamed from: u */
    public d f15644u;

    /* renamed from: v */
    public String f15645v;

    /* renamed from: w */
    public final com.dyson.mobile.android.resources.brightcove.a f15646w;

    /* renamed from: x */
    public final h f15647x;

    /* renamed from: y */
    public final j f15648y;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/resources/brightcove/DysonBrightcoveVideoPlayerView$b", "Lcom/brightcove/player/edge/VideoListener;", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b extends VideoListener {

        /* renamed from: b */
        public final /* synthetic */ BrightcoveExoPlayerVideoView f15650b;

        public b(BrightcoveExoPlayerVideoView brightcoveExoPlayerVideoView) {
            DysonBrightcoveVideoPlayerView.this = r1;
            this.f15650b = brightcoveExoPlayerVideoView;
        }

        @Override // com.brightcove.player.edge.ErrorListener
        public final void onError(List<CatalogError> list) {
            list.getClass();
            this.f15650b.getEventEmitter().emit("error", q0.g(new p(BrightcoveError.ERROR_CODE, ((CatalogError) c0.N(list)).getMessage())));
        }

        @Override // com.brightcove.player.edge.VideoListener
        public final void onVideo(Video video) {
            video.getClass();
            int i13 = DysonBrightcoveVideoPlayerView.f15628z;
            DysonBrightcoveVideoPlayerView.this.f(video);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/resources/brightcove/DysonBrightcoveVideoPlayerView$c", "Landroid/support/v4/media/session/MediaSessionCompat$b;", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c extends MediaSessionCompat.b {
        public c() {
            DysonBrightcoveVideoPlayerView.this = r1;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public final void onPause() {
            super.onPause();
            DysonBrightcoveVideoPlayerView.this.getBrightcoveExoPlayerVideoView().pause();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.b
        public final void onPlay() {
            super.onPlay();
            DysonBrightcoveVideoPlayerView.this.getBrightcoveExoPlayerVideoView().start();
        }
    }

    static {
        new a(null);
        f15628z = 8;
        URI create = URI.create("");
        create.getClass();
        A = create;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DysonBrightcoveVideoPlayerView(Context context, AttributeSet attributeSet, int i13) {
        super(context, attributeSet, i13);
        context.getClass();
        this.f15629f = ms0.a.MAIN;
        this.f15638o = true;
        this.f15641r = A;
        this.f15642s = new MediaSessionCompat(context, "DysonBrightcoveVideoPlayerView");
        this.f15645v = "";
        com.dyson.mobile.android.resources.brightcove.a aVar = new com.dyson.mobile.android.resources.brightcove.a(null, null, 3, null);
        aVar.f15657i = new i(this, 0);
        aVar.f15658j = new i(this, 1);
        this.f15646w = aVar;
        ss0.p pVar = (ss0.p) g.c(LayoutInflater.from(context), R.layout.dyson_brightcove_video_player, this, true, null);
        pVar.l(aVar);
        BrightcoveExoPlayerVideoView brightcoveExoPlayerVideoView = pVar.d;
        brightcoveExoPlayerVideoView.getClass();
        this.d = brightcoveExoPlayerVideoView;
        e(brightcoveExoPlayerVideoView, 1.7777778f);
        BrightcoveMediaController brightcoveMediaController = new BrightcoveMediaController(brightcoveExoPlayerVideoView);
        brightcoveMediaController.setShowHideTimeout(3000);
        brightcoveMediaController.setShowControllerEnable(false);
        brightcoveExoPlayerVideoView.setMediaController(brightcoveMediaController);
        brightcoveExoPlayerVideoView.getEventEmitter().on(EventType.SET_VIDEO_STILL, new j(this));
        brightcoveExoPlayerVideoView.getEventEmitter().on(EventType.ANY, new ji1.h(12, this, brightcoveExoPlayerVideoView));
        this.f15647x = new h(this, 1);
        this.f15648y = new j(this);
    }

    public static void c(DysonBrightcoveVideoPlayerView dysonBrightcoveVideoPlayerView, BrightcoveExoPlayerVideoView brightcoveExoPlayerVideoView, Event event) {
        Map<String, Object> properties;
        Object obj;
        String obj2;
        event.getClass();
        com.dyson.mobile.android.resources.brightcove.a aVar = dysonBrightcoveVideoPlayerView.f15646w;
        EventListener eventListener = dysonBrightcoveVideoPlayerView.f15636m;
        if (eventListener != null) {
            eventListener.processEvent(event);
        }
        String type = event.getType();
        Logger.a("Brightcove event emitted - " + type);
        String type2 = event.getType();
        if (type2 != null) {
            switch (type2.hashCode()) {
                case -1645818152:
                    if (type2.equals(EventType.DID_SET_VIDEO) && dysonBrightcoveVideoPlayerView.f15630g) {
                        dysonBrightcoveVideoPlayerView.d.getEventEmitter().emit(EventType.SET_VOLUME, p0.c(new p(AbstractEvent.VOLUME, Float.valueOf(0.0f))));
                        dysonBrightcoveVideoPlayerView.d.setImportantForAccessibility(2);
                        brightcoveExoPlayerVideoView.start();
                        return;
                    }
                    return;
                case -1402931637:
                    if (type2.equals("completed")) {
                        dysonBrightcoveVideoPlayerView.f15639p = true;
                        dysonBrightcoveVideoPlayerView.f15640q = false;
                        brightcoveExoPlayerVideoView.getEventEmitter().emit(EventType.EXIT_FULL_SCREEN);
                        aVar.a(new b.f(dysonBrightcoveVideoPlayerView.f15630g));
                        if (dysonBrightcoveVideoPlayerView.f15630g) {
                            brightcoveExoPlayerVideoView.start();
                            return;
                        }
                        return;
                    }
                    return;
                case -1386188599:
                    if (type2.equals(EventType.BUFFERING_COMPLETED)) {
                        aVar.a(b.c.f15661a);
                        return;
                    }
                    return;
                case -174217033:
                    if (type2.equals(EventType.DID_PAUSE)) {
                        dysonBrightcoveVideoPlayerView.setMediaSessionState(2);
                        dysonBrightcoveVideoPlayerView.f15640q = false;
                        return;
                    }
                    return;
                case 91011918:
                    if (!type2.equals(EventType.CAPTIONS_LANGUAGES)) {
                        return;
                    }
                    break;
                case 96784904:
                    if (type2.equals("error")) {
                        brightcoveExoPlayerVideoView.stopPlayback();
                        brightcoveExoPlayerVideoView.getEventEmitter().emit(EventType.EXIT_FULL_SCREEN);
                        dysonBrightcoveVideoPlayerView.f15640q = false;
                        dysonBrightcoveVideoPlayerView.f15639p = true;
                        aVar.a(b.C0539b.f15660a);
                        return;
                    }
                    return;
                case 213694823:
                    if (type2.equals(EventType.FRAGMENT_RESUMED)) {
                        if (dysonBrightcoveVideoPlayerView.f15630g) {
                            dysonBrightcoveVideoPlayerView.d.getEventEmitter().on(EventType.SET_VIDEO_STILL, new e(5));
                            return;
                        } else {
                            brightcoveExoPlayerVideoView.getEventEmitter().emit(EventType.SET_VIDEO_STILL, q0.g(new p(AbstractEvent.VIDEO_STILL, dysonBrightcoveVideoPlayerView.f15641r)));
                            return;
                        }
                    }
                    return;
                case 794915207:
                    if (type2.equals(EventType.VIDEO_SIZE_KNOWN)) {
                        dysonBrightcoveVideoPlayerView.e(brightcoveExoPlayerVideoView, event.getIntegerProperty("width") / event.getIntegerProperty("height"));
                        if (dysonBrightcoveVideoPlayerView.f15640q) {
                            return;
                        }
                        aVar.a(new b.f(dysonBrightcoveVideoPlayerView.f15630g));
                        return;
                    }
                    return;
                case 837852371:
                    if (type2.equals(EventType.ENTER_FULL_SCREEN)) {
                        brightcoveExoPlayerVideoView.getEventEmitter().emit(EventType.EXIT_FULL_SCREEN);
                        long playerCurrentPosition = dysonBrightcoveVideoPlayerView.d.getVideoDisplay().getPlayerCurrentPosition();
                        String id2 = brightcoveExoPlayerVideoView.getCurrentVideo().getId();
                        id2.getClass();
                        ms0.a aVar2 = dysonBrightcoveVideoPlayerView.f15629f;
                        boolean isPlaying = dysonBrightcoveVideoPlayerView.d.isPlaying();
                        Video currentVideo = brightcoveExoPlayerVideoView.getCurrentVideo();
                        ns0.b bVar = new ns0.b(id2, aVar2, playerCurrentPosition, isPlaying, (currentVideo == null || (properties = currentVideo.getProperties()) == null || (obj = properties.get(Video.Fields.SELECTED_TEXT_LABEL)) == null || (obj2 = obj.toString()) == null) ? "" : obj2, dysonBrightcoveVideoPlayerView.e);
                        DysonBrightcovePlayerFullscreenActivity.a aVar3 = DysonBrightcovePlayerFullscreenActivity.f15665o;
                        Context context = brightcoveExoPlayerVideoView.getContext();
                        context.getClass();
                        aVar3.getClass();
                        Intent intent = new Intent(DysonBrightcovePlayerFullscreenActivity.a.a(context), DysonBrightcovePlayerFullscreenActivity.class);
                        Bundle bundle = new Bundle();
                        bundle.putSerializable("video_state", bVar);
                        intent.putExtras(bundle);
                        d dVar = dysonBrightcoveVideoPlayerView.f15644u;
                        if (dVar != null) {
                            dVar.a(intent);
                            return;
                        }
                        return;
                    }
                    return;
                case 1656958035:
                    if (type2.equals(EventType.DID_PLAY)) {
                        if (!dysonBrightcoveVideoPlayerView.f15630g || dysonBrightcoveVideoPlayerView.f15631h) {
                            brightcoveExoPlayerVideoView.getBrightcoveMediaController().show();
                            brightcoveExoPlayerVideoView.getBrightcoveMediaController().setShowControllerEnable(true);
                        }
                        aVar.a(b.e.f15663a);
                        dysonBrightcoveVideoPlayerView.f15640q = true;
                        dysonBrightcoveVideoPlayerView.f15639p = false;
                        dysonBrightcoveVideoPlayerView.setMediaSessionState(3);
                        return;
                    }
                    return;
                case 1843610239:
                    if (type2.equals(EventType.BUFFERING_STARTED) && !dysonBrightcoveVideoPlayerView.f15639p) {
                        aVar.a(b.a.f15659a);
                        return;
                    }
                    return;
                case 1948053069:
                    if (type2.equals(EventType.DID_CHANGE_LIST)) {
                        brightcoveExoPlayerVideoView.getBrightcoveMediaController().hide();
                        brightcoveExoPlayerVideoView.getBrightcoveMediaController().setShowControllerEnable(false);
                        return;
                    }
                    return;
                case 2133749244:
                    if (!type2.equals(EventType.CAPTIONS_AVAILABLE)) {
                        return;
                    }
                    break;
                default:
                    return;
            }
            if (!r.c(dysonBrightcoveVideoPlayerView.f15645v, "")) {
                dysonBrightcoveVideoPlayerView.setPreferredLocale(dysonBrightcoveVideoPlayerView.d);
                return;
            }
            if (!dysonBrightcoveVideoPlayerView.f15643t && dysonBrightcoveVideoPlayerView.f15638o) {
                dysonBrightcoveVideoPlayerView.setInitialCaptionsLocale(dysonBrightcoveVideoPlayerView.d);
            }
            dysonBrightcoveVideoPlayerView.f15643t = true;
        }
    }

    private final void setInitialCaptionsLocale(BrightcoveExoPlayerVideoView brightcoveExoPlayerVideoView) {
        int a13;
        int i13;
        Object obj;
        List list;
        Object obj2 = brightcoveExoPlayerVideoView.getCurrentVideo().getProperties().get(Video.Fields.CAPTION_SOURCES);
        obj2.getClass();
        List<Pair> list2 = (List) obj2;
        ArrayList arrayList = new ArrayList(u.o(list2, 10));
        for (Pair pair : list2) {
            arrayList.add(((BrightcoveCaptionFormat) pair.second).language());
        }
        com.dyson.mobile.android.resources.brightcove.a aVar = this.f15646w;
        aVar.getClass();
        aVar.f15652b.getClass();
        String languageTags = LocaleList.getAdjustedDefault().toLanguageTags();
        languageTags.getClass();
        List<String> L = y.L(languageTags, new String[]{","}, 0, 6);
        ArrayList arrayList2 = new ArrayList();
        for (String str : L) {
            Locale forLanguageTag = Locale.forLanguageTag(str);
            if (forLanguageTag != null) {
                arrayList2.add(forLanguageTag);
            }
        }
        Iterator it = arrayList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                a13 = ms0.b.a("en-gb", arrayList);
                break;
            }
            Locale locale = (Locale) it.next();
            String languageTag = locale.toLanguageTag();
            languageTag.getClass();
            int a14 = ms0.b.a(languageTag, arrayList);
            Integer valueOf = Integer.valueOf(a14);
            if (a14 < 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                a13 = valueOf.intValue();
                break;
            }
            int a15 = ms0.b.a(locale.getLanguage() + "-" + locale.getCountry(), arrayList);
            Integer valueOf2 = Integer.valueOf(a15);
            if (a15 < 0) {
                valueOf2 = null;
            }
            if (valueOf2 != null) {
                a13 = valueOf2.intValue();
                break;
            }
            String language = locale.getLanguage();
            language.getClass();
            Iterator it2 = arrayList.iterator();
            int i14 = 0;
            while (true) {
                i13 = -1;
                if (!it2.hasNext()) {
                    i14 = -1;
                    break;
                } else if (w.j((String) y.K((String) it2.next(), new char[]{'-'}).get(0), language, true)) {
                    break;
                } else {
                    i14++;
                }
            }
            Integer valueOf3 = Integer.valueOf(i14);
            if (i14 < 0) {
                valueOf3 = null;
            }
            if (valueOf3 != null) {
                a13 = valueOf3.intValue();
                break;
            }
            String languageTag2 = locale.toLanguageTag();
            languageTag2.getClass();
            Iterator<T> it3 = ms0.b.f54575a.entrySet().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it3.next();
                if (((List) ((Map.Entry) obj).getKey()).contains(languageTag2)) {
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) obj;
            if (entry != null && (list = (List) entry.getValue()) != null) {
                Iterator it4 = list.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        break;
                    }
                    String str2 = (String) it4.next();
                    Iterator it5 = arrayList.iterator();
                    int i15 = 0;
                    while (true) {
                        if (!it5.hasNext()) {
                            i15 = -1;
                            break;
                        } else if (w.j((String) it5.next(), str2, true)) {
                            break;
                        } else {
                            i15++;
                        }
                    }
                    Integer valueOf4 = Integer.valueOf(i15);
                    if (i15 <= 0) {
                        valueOf4 = null;
                        continue;
                    }
                    if (valueOf4 != null) {
                        i13 = valueOf4.intValue();
                        break;
                    }
                }
            }
            Integer valueOf5 = Integer.valueOf(i13);
            if (i13 < 0) {
                valueOf5 = null;
                continue;
            }
            if (valueOf5 != null) {
                a13 = valueOf5.intValue();
                break;
            }
        }
        this.d.getClosedCaptioningController().selectCaptions(a13 + 1);
        Object systemService = brightcoveExoPlayerVideoView.getContext().getApplicationContext().getSystemService(VideoFields.CAPTIONING);
        CaptioningManager captioningManager = systemService instanceof CaptioningManager ? (CaptioningManager) systemService : null;
        if (captioningManager == null || !captioningManager.isEnabled()) {
            BrightcoveClosedCaptioningManager.getInstance(brightcoveExoPlayerVideoView.getContext().getApplicationContext()).setStyle(BrightcoveCaptionStyle.createCaptionStyle("0.75", CaptionConstants.DEFAULT_TYPEFACE, -1, -1, 0, -16777216, -1090519040, -1090519040, 0, 0));
        }
    }

    private final void setMediaSessionState(int i13) {
        PlaybackStateCompat.d dVar = new PlaybackStateCompat.d();
        dVar.f1713f = 591L;
        long currentPositionLong = this.d.getCurrentPositionLong();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        dVar.f1711b = i13;
        dVar.f1712c = currentPositionLong;
        dVar.f1716i = elapsedRealtime;
        dVar.e = 1.0f;
        this.f15642s.f1675a.e(dVar.a());
    }

    private final void setPreferredLocale(BrightcoveExoPlayerVideoView brightcoveExoPlayerVideoView) {
        brightcoveExoPlayerVideoView.setClosedCaptioningEnabled(true);
        brightcoveExoPlayerVideoView.setSubtitleLocale(this.f15645v);
        this.f15645v = "";
    }

    private final void setUpMediaSession(int i13) {
        c cVar = new c();
        MediaSessionCompat mediaSessionCompat = this.f15642s;
        mediaSessionCompat.c(cVar, null);
        mediaSessionCompat.b(true);
        setMediaSessionState(i13);
    }

    private final void setVideoDurationMillis(long j8) {
        String i13;
        com.dyson.mobile.android.resources.brightcove.a aVar = this.f15646w;
        n<String> nVar = aVar.f15655g;
        aVar.f15651a.getClass();
        long g13 = w32.d.g((int) j8, w32.e.MILLISECONDS);
        b.a aVar2 = w32.b.e;
        long o13 = w32.b.o(g13, w32.e.HOURS);
        int g14 = w32.b.g(g13);
        int i14 = w32.b.i(g13);
        if (o13 > 0) {
            u0 u0Var = u0.f86723a;
            i13 = jy1.a.c(String.format("%02d", Arrays.copyOf(new Object[]{Long.valueOf(o13)}, 1)), ":", ms0.c.a(g14), ":", ms0.c.a(i14));
        } else {
            i13 = s.i(ms0.c.a(g14), ":", ms0.c.a(i14));
        }
        nVar.m(i13);
    }

    public static final void setVideoStill$lambda$0(Event event) {
        event.preventDefault();
        event.stopPropagation();
    }

    public final void d(String str) {
        this.f15646w.a(b.d.f15662a);
        String str2 = this.e;
        ms0.d dVar = str2 != null ? new ms0.d(str2) : null;
        BrightcoveExoPlayerVideoView brightcoveExoPlayerVideoView = this.d;
        if (dVar != null) {
            String accountId = this.f15629f.getAccountId();
            String policyKey = this.f15629f.getPolicyKey();
            EventEmitter eventEmitter = brightcoveExoPlayerVideoView.getEventEmitter();
            eventEmitter.getClass();
            new k(accountId, policyKey, eventEmitter, dVar.a()).findVideoByID(str, dVar.b(), new b(brightcoveExoPlayerVideoView));
        }
    }

    public final void e(BrightcoveExoPlayerVideoView brightcoveExoPlayerVideoView, float f13) {
        int i13 = brightcoveExoPlayerVideoView.getContext().getResources().getDisplayMetrics().widthPixels;
        brightcoveExoPlayerVideoView.setLayoutParams(new ConstraintLayout.b(i13 - (((int) (this.f15632i * getContext().getResources().getDisplayMetrics().density)) * 2), ((int) (i13 / f13)) - ((int) ((((int) (this.f15632i * getContext().getResources().getDisplayMetrics().density)) * 2) / f13))));
    }

    public final void f(Video video) {
        this.f15646w.a(b.d.f15662a);
        setVideoDurationMillis(video.getDurationLong());
        URI stillImageUri = video.getStillImageUri();
        if (stillImageUri == null) {
            stillImageUri = A;
        }
        this.f15641r = stillImageUri;
        this.d.clear();
        try {
            this.d.add(video);
        } catch (Exception e) {
            Logger.b("Brightcove player error:", e);
        }
    }

    public final ms0.a getAccount() {
        return this.f15629f;
    }

    public final BrightcoveExoPlayerVideoView getBrightcoveExoPlayerVideoView() {
        return this.d;
    }

    public final String getCurrentMarket() {
        return this.e;
    }

    public final w12.a<f0> getDefaultRetryAction() {
        return this.f15637n;
    }

    public final boolean getEnableCaptionsByDefault() {
        return this.f15638o;
    }

    public final EventListener getEventListener() {
        return this.f15636m;
    }

    public final int getHorizontalMargin() {
        return this.f15632i;
    }

    public final boolean getLoopMode() {
        return this.f15630g;
    }

    public final boolean getShowControlWhenLoopModeEnabled() {
        return this.f15631h;
    }

    public final Video getVideo() {
        return this.f15633j;
    }

    public final String getVideoId() {
        return this.f15634k;
    }

    public final long getVideoStartTime() {
        return this.f15635l;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnScrollChangedListener(this.f15647x);
        DysonBrightcovePlayerFullscreenActivity.a aVar = DysonBrightcovePlayerFullscreenActivity.f15665o;
        Context context = getContext();
        context.getClass();
        aVar.getClass();
        f.g a13 = DysonBrightcovePlayerFullscreenActivity.a.a(context);
        d dVar = null;
        ActivityResultRegistry activityResultRegistry = a13 != null ? a13.getActivityResultRegistry() : null;
        if (activityResultRegistry != null) {
            String obj = toString();
            obj.getClass();
            dVar = activityResultRegistry.d(obj, new j.a(), this.f15648y);
        }
        this.f15644u = dVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f15642s.f1675a.release();
        getViewTreeObserver().removeOnScrollChangedListener(this.f15647x);
        this.d.clear();
        BrightcoveMediaController brightcoveMediaController = this.d.getBrightcoveMediaController();
        if (brightcoveMediaController != null) {
            brightcoveMediaController.removeListeners();
        }
        d dVar = this.f15644u;
        if (dVar != null) {
            dVar.b();
        }
        this.f15644u = null;
    }

    @Override // android.view.View
    public final void onVisibilityAggregated(boolean z13) {
        PlaybackStateCompat a13;
        super.onVisibilityAggregated(z13);
        int i13 = 0;
        MediaSessionCompat mediaSessionCompat = this.f15642s;
        if (!z13) {
            mediaSessionCompat.c(null, null);
            mediaSessionCompat.b(false);
            return;
        }
        MediaControllerCompat mediaControllerCompat = mediaSessionCompat.f1676b;
        if (mediaControllerCompat != null && (a13 = mediaControllerCompat.a()) != null) {
            i13 = a13.d;
        }
        setUpMediaSession(i13);
    }

    public final void setAccount(ms0.a aVar) {
        aVar.getClass();
        this.f15629f = aVar;
    }

    public final void setBrightcoveExoPlayerVideoView(BrightcoveExoPlayerVideoView brightcoveExoPlayerVideoView) {
        brightcoveExoPlayerVideoView.getClass();
        this.d = brightcoveExoPlayerVideoView;
    }

    public final void setCurrentMarket(String str) {
        this.e = str;
    }

    public final void setDefaultRetryAction(w12.a<f0> aVar) {
        this.f15637n = aVar;
    }

    public final void setEnableCaptionsByDefault(boolean z13) {
        this.f15638o = z13;
    }

    public final void setEventListener(EventListener eventListener) {
        this.f15636m = eventListener;
    }

    public final void setHorizontalMargin(int i13) {
        this.f15632i = i13;
    }

    public final void setLoadingVideo(boolean z13) {
        this.f15646w.a(z13 ? b.a.f15659a : b.c.f15661a);
    }

    public final void setLoopMode(boolean z13) {
        this.f15630g = z13;
    }

    public final void setShowControlWhenLoopModeEnabled(boolean z13) {
        this.f15631h = z13;
    }

    public final void setVideo(Video video) {
        this.f15633j = video;
        if (video != null) {
            f(video);
        }
    }

    public final void setVideoError(boolean z13) {
        this.f15646w.a(z13 ? b.C0539b.f15660a : b.c.f15661a);
    }

    public final void setVideoId(String str) {
        this.f15634k = str;
        if (str != null) {
            d(str);
        }
    }

    public final void setVideoStartTime(long j8) {
        this.f15635l = j8;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/dyson/mobile/android/resources/brightcove/DysonBrightcoveVideoPlayerView$a;", "", "<init>", "()V", "", "INITIAL_ASPECT_RATIO", "F", "", "VIDEO_STILL_KEY", "Ljava/lang/String;", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DysonBrightcoveVideoPlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DysonBrightcoveVideoPlayerView(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ DysonBrightcoveVideoPlayerView(Context context, AttributeSet attributeSet, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i14 & 2) != 0 ? null : attributeSet, (i14 & 4) != 0 ? 0 : i13);
    }
}
