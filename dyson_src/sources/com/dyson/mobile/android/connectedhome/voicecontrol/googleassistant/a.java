package com.dyson.mobile.android.connectedhome.voicecontrol.googleassistant;

import androidx.lifecycle.ViewModelProvider;
import e22.m;
import kotlin.Metadata;
import m9.u;
import pf0.c;
import rf0.j0;
import x12.p0;
import x12.y;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/googleassistant/a;", "Lm9/u;", "Lpf0/c;", "localisationManager", "<init>", "(Lpf0/c;)V", "a", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a extends u {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ m<Object>[] f13192f = {p0.f86717a.f(new y(a.class, "navigator", "getNavigator()Lcom/dyson/mobile/android/connectedhome/voicecontrol/googleassistant/GoogleHomeLandingScreenNavigator;", 0))};
    public final String d;
    public final tf1.a e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/googleassistant/a$a;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Lpf0/c;", "localisationManager", "<init>", "(Lpf0/c;)V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.connectedhome.voicecontrol.googleassistant.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0398a implements ViewModelProvider.Factory {

        /* renamed from: a  reason: collision with root package name */
        public final c f13193a;

        static {
            int i13 = c.d;
        }

        public C0398a(c cVar) {
            cVar.getClass();
            this.f13193a = cVar;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public final <T extends u> T create(Class<T> cls) {
            cls.getClass();
            return new a(this.f13193a);
        }
    }

    public a(c cVar) {
        cVar.getClass();
        this.d = cVar.d(j0.f72082g);
        this.e = new tf1.a(null, 1, null);
    }
}
