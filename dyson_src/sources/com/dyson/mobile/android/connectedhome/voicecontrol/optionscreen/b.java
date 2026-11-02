package com.dyson.mobile.android.connectedhome.voicecontrol.optionscreen;

import androidx.lifecycle.ViewModelProvider;
import e22.m;
import i12.t;
import java.util.List;
import kotlin.Metadata;
import m9.u;
import pf0.c;
import rf0.i0;
import x12.p0;
import x12.y;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/optionscreen/b;", "Lm9/u;", "Lpf0/c;", "localisationManager", "<init>", "(Lpf0/c;)V", "a", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class b extends u {

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ m<Object>[] f13250h = {p0.f86717a.f(new y(b.class, "navigator", "getNavigator()Lcom/dyson/mobile/android/connectedhome/voicecontrol/optionscreen/VoiceControlOptionNavigator;", 0))};
    public final c d;
    public final tf1.a e;

    /* renamed from: f  reason: collision with root package name */
    public final String f13251f;

    /* renamed from: g  reason: collision with root package name */
    public final List<tt0.b> f13252g;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/optionscreen/b$a;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Lpf0/c;", "localisationManager", "<init>", "(Lpf0/c;)V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements ViewModelProvider.Factory {

        /* renamed from: a  reason: collision with root package name */
        public final c f13253a;

        static {
            int i13 = c.d;
        }

        public a(c cVar) {
            cVar.getClass();
            this.f13253a = cVar;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public final <T extends u> T create(Class<T> cls) {
            cls.getClass();
            return new b(this.f13253a);
        }
    }

    public b(c cVar) {
        cVar.getClass();
        this.d = cVar;
        this.e = new tf1.a(null, 1, null);
        this.f13251f = cVar.d(i0.f71596c8);
        this.f13252g = t.h(new s00.b(this), new s00.c(this));
    }
}
