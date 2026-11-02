package com.dyson.mobile.android.connectionjourney.userguidance.steps;

import androidx.lifecycle.LifecycleOwner;
import com.dyson.mobile.android.connectionjourney.userguidance.steps.UserGuidanceView;
import kotlin.Metadata;
import m9.u;
import q8.n;
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/userguidance/steps/c;", "Lm9/u;", "Lm9/c;", "Lpf0/c;", "localisationManager", "<init>", "(Lpf0/c;)V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class c extends u implements m9.c {
    public final pf0.c d;
    public final n<String> e;

    /* renamed from: f  reason: collision with root package name */
    public UserGuidanceView.d f13931f;

    /* renamed from: g  reason: collision with root package name */
    public UserGuidanceView.a f13932g;

    public c(pf0.c cVar) {
        cVar.getClass();
        this.d = cVar;
        this.e = new n<>("");
        this.f13931f = UserGuidanceView.d.FIRST;
    }

    public abstract void S();

    @Override // m9.c
    public final void onResume(LifecycleOwner lifecycleOwner) {
        S();
    }
}
