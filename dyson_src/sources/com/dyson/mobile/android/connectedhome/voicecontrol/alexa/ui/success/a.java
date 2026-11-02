package com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.success;

import androidx.lifecycle.ViewModelProvider;
import com.dyson.mobile.android.R;
import h12.f0;
import hj.e;
import kotlin.Metadata;
import m9.u;
import pf0.c;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/success/a;", "Lm9/u;", "Lhj/e;", "trackingManager", "Lpf0/c;", "localisationManager", "<init>", "(Lhj/e;Lpf0/c;)V", "a", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a extends u {
    public final e d;
    public final xf1.a<f0> e;

    /* renamed from: f  reason: collision with root package name */
    public final String f13177f;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/success/a$a;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Lhj/e;", "trackingManager", "Lpf0/c;", "localisationManager", "<init>", "(Lhj/e;Lpf0/c;)V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.success.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0397a implements ViewModelProvider.Factory {

        /* renamed from: a  reason: collision with root package name */
        public final e f13178a;

        /* renamed from: b  reason: collision with root package name */
        public final c f13179b;

        public C0397a(e eVar, c cVar) {
            eVar.getClass();
            cVar.getClass();
            this.f13178a = eVar;
            this.f13179b = cVar;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public final <T extends u> T create(Class<T> cls) {
            cls.getClass();
            return new a(this.f13178a, this.f13179b);
        }
    }

    public a(e eVar, c cVar) {
        eVar.getClass();
        cVar.getClass();
        this.d = eVar;
        this.e = new xf1.a<>();
        this.f13177f = cVar.c(R.string.voiceControl_alexa_title);
    }
}
