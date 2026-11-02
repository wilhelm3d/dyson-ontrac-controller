package com.dyson.mobile.android.audio.settings.filtermanagement;

import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableInt;
import b70.g;
import e22.m;
import eh0.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.u;
import ny.a0;
import pf0.c;
import pp.r;
import q8.n;
import qo0.d;
import rf0.f;
import rf0.q;
import wm0.b;
import x12.p0;
import x12.y;
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000fB5\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/dyson/mobile/android/audio/settings/filtermanagement/AudioFilterManagementViewModel;", "Lm9/u;", "Leh0/e;", "Lxo/a;", "machine", "Lpf0/c;", "localisationManager", "Lpp/r;", "filterLifeWarningProvider", "Lqo0/d;", "purchaseLinkRetriever", "Lb70/g;", "networkConnectivityObserver", "<init>", "(Leh0/e;Lpf0/c;Lpp/r;Lqo0/d;Lb70/g;)V", "a", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AudioFilterManagementViewModel extends u {

    /* renamed from: v  reason: collision with root package name */
    public static final /* synthetic */ m<Object>[] f12764v = {p0.f86717a.f(new y(AudioFilterManagementViewModel.class, "navigator", "getNavigator()Lcom/dyson/mobile/android/audio/settings/filtermanagement/AudioFilterManagementNavigator;", 0))};
    public final e<xo.a> d;
    public final c e;

    /* renamed from: f  reason: collision with root package name */
    public final r f12765f;

    /* renamed from: g  reason: collision with root package name */
    public final d f12766g;

    /* renamed from: h  reason: collision with root package name */
    public final g f12767h;

    /* renamed from: i  reason: collision with root package name */
    public final tf1.a f12768i;

    /* renamed from: j  reason: collision with root package name */
    public final gz1.b f12769j;

    /* renamed from: k  reason: collision with root package name */
    public final ObservableInt f12770k;

    /* renamed from: l  reason: collision with root package name */
    public final ObservableInt f12771l;

    /* renamed from: m  reason: collision with root package name */
    public final ObservableBoolean f12772m;

    /* renamed from: n  reason: collision with root package name */
    public final n<String> f12773n;

    /* renamed from: o  reason: collision with root package name */
    public final n<String> f12774o;

    /* renamed from: p  reason: collision with root package name */
    public final AudioFilterManagementViewModel$filterLifeRemaining$1 f12775p;

    /* renamed from: q  reason: collision with root package name */
    public final ObservableInt f12776q;

    /* renamed from: r  reason: collision with root package name */
    public final ObservableBoolean f12777r;

    /* renamed from: s  reason: collision with root package name */
    public final ObservableBoolean f12778s;

    /* renamed from: t  reason: collision with root package name */
    public final ObservableBoolean f12779t;

    /* renamed from: u  reason: collision with root package name */
    public final wm0.b f12780u;

    static {
        new a(null);
    }

    public AudioFilterManagementViewModel(e<xo.a> eVar, c cVar, r rVar, d dVar, g gVar) {
        eVar.getClass();
        cVar.getClass();
        rVar.getClass();
        dVar.getClass();
        gVar.getClass();
        this.d = eVar;
        this.e = cVar;
        this.f12765f = rVar;
        this.f12766g = dVar;
        this.f12767h = gVar;
        this.f12768i = new tf1.a(null, 1, null);
        this.f12769j = new gz1.b();
        this.f12770k = new ObservableInt(8);
        this.f12771l = new ObservableInt(0);
        this.f12772m = new ObservableBoolean(false);
        this.f12773n = new n<>(cVar.d(f.f71244j1));
        this.f12774o = new n<>(cVar.d(q.f72377g1));
        this.f12775p = new AudioFilterManagementViewModel$filterLifeRemaining$1(this);
        this.f12776q = new ObservableInt(0);
        this.f12777r = new ObservableBoolean(false);
        this.f12778s = new ObservableBoolean(false);
        this.f12779t = new ObservableBoolean(false);
        b.a aVar = new b.a();
        aVar.f86131a = cVar.d(q.f72393i1);
        aVar.f86133c = new wm0.a(new a0(this, 23), 0);
        this.f12780u = aVar.a();
    }

    public final po.a S() {
        return (po.a) this.f12768i.getValue(this, f12764v[0]);
    }

    @Override // m9.u
    public final void onCleared() {
        this.f12769j.e();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/dyson/mobile/android/audio/settings/filtermanagement/AudioFilterManagementViewModel$a;", "", "<init>", "()V", "", "MULTIPLIER_FOR_SMOOTH_PROGRESS", "I", "MAX_FILTER_LIFE", "", "FILTER_HOW_TO_CHANGE", "Ljava/lang/String;", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
