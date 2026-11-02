package com.dyson.mobile.android.resources.brightcove.fullscreenhandler;

import androidx.databinding.ObservableBoolean;
import androidx.lifecycle.ViewModelProvider;
import com.brightcove.player.model.Video;
import com.dyson.mobile.android.resources.brightcove.b;
import kotlin.Metadata;
import m9.o;
import m9.u;
import ms0.b;
import ms0.d;
import ms0.g;
import mz1.f;
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/dyson/mobile/android/resources/brightcove/fullscreenhandler/a;", "Lm9/u;", "Lms0/g;", "videoRepository", "Lms0/b;", "brightcoveCaptionLocaleProvider", "Lms0/d;", "brightcoveVideoConfigResolver", "<init>", "(Lms0/g;Lms0/b;Lms0/d;)V", "a", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a extends u {
    public final g d;
    public final d e;

    /* renamed from: f  reason: collision with root package name */
    public final ObservableBoolean f15671f;

    /* renamed from: g  reason: collision with root package name */
    public final o<Boolean> f15672g;

    /* renamed from: h  reason: collision with root package name */
    public final o f15673h;

    /* renamed from: i  reason: collision with root package name */
    public final o<Video> f15674i;

    /* renamed from: j  reason: collision with root package name */
    public final o f15675j;

    /* renamed from: k  reason: collision with root package name */
    public f f15676k;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/dyson/mobile/android/resources/brightcove/fullscreenhandler/a$a;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Lms0/g;", "videoRepository", "Lms0/b;", "brightcoveCaptionLocaleProvider", "Lms0/d;", "brightcoveVideoConfigResolver", "<init>", "(Lms0/g;Lms0/b;Lms0/d;)V", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.resources.brightcove.fullscreenhandler.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0540a implements ViewModelProvider.Factory {

        /* renamed from: a  reason: collision with root package name */
        public final g f15677a;

        /* renamed from: b  reason: collision with root package name */
        public final b f15678b;

        /* renamed from: c  reason: collision with root package name */
        public final d f15679c;

        public C0540a(g gVar, b bVar, d dVar) {
            gVar.getClass();
            bVar.getClass();
            dVar.getClass();
            this.f15677a = gVar;
            this.f15678b = bVar;
            this.f15679c = dVar;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public final <T extends u> T create(Class<T> cls) {
            cls.getClass();
            return new a(this.f15677a, this.f15678b, this.f15679c);
        }
    }

    public a(g gVar, b bVar, d dVar) {
        gVar.getClass();
        bVar.getClass();
        dVar.getClass();
        this.d = gVar;
        this.e = dVar;
        this.f15671f = new ObservableBoolean(false);
        o<Boolean> oVar = new o<>(Boolean.FALSE);
        this.f15672g = oVar;
        this.f15673h = oVar;
        o<Video> oVar2 = new o<>();
        this.f15674i = oVar2;
        this.f15675j = oVar2;
    }

    public final void S(com.dyson.mobile.android.resources.brightcove.b bVar) {
        bVar.getClass();
        boolean z13 = bVar instanceof b.f;
        o<Boolean> oVar = this.f15672g;
        ObservableBoolean observableBoolean = this.f15671f;
        if (z13) {
            observableBoolean.m(false);
            oVar.setValue(Boolean.FALSE);
        } else if (bVar.equals(b.e.f15663a)) {
            observableBoolean.m(false);
            oVar.setValue(Boolean.FALSE);
        } else if (bVar.equals(b.a.f15659a)) {
            observableBoolean.m(true);
        } else if (bVar.equals(b.c.f15661a)) {
            observableBoolean.m(false);
        }
    }

    @Override // m9.u
    public final void onCleared() {
        super.onCleared();
        f fVar = this.f15676k;
        if (fVar != null) {
            jz1.d.dispose(fVar);
        }
    }
}
