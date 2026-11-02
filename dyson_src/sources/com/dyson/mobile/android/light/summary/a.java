package com.dyson.mobile.android.light.summary;

import android.os.Handler;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableInt;
import androidx.lifecycle.LifecycleOwner;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.light.summary.a;
import com.dyson.mobile.android.localisation.LocalisationKey;
import com.dyson.mobile.android.logging.Logger;
import e22.m;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.c;
import og0.d;
import q8.n;
import x12.p0;
import x12.y;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/light/summary/a;", "Lm9/c;", "Log0/a;", "machineDataObject", "<init>", "(Log0/a;)V", "b", "a", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a implements c {

    /* renamed from: p  reason: collision with root package name */
    public static final /* synthetic */ m<Object>[] f15066p = {p0.f86717a.f(new y(a.class, "navigator", "getNavigator()Lcom/dyson/mobile/android/light/summary/LightProfileSummaryViewModel$Navigator;", 0))};
    public final LocalisationKey d;
    public final LocalisationKey e;

    /* renamed from: f  reason: collision with root package name */
    public final LocalisationKey f15067f;

    /* renamed from: g  reason: collision with root package name */
    public final ObservableBoolean f15068g;

    /* renamed from: h  reason: collision with root package name */
    public final n<LocalisationKey> f15069h;

    /* renamed from: i  reason: collision with root package name */
    public final ObservableInt f15070i;

    /* renamed from: j  reason: collision with root package name */
    public final ObservableInt f15071j;

    /* renamed from: k  reason: collision with root package name */
    public final tf1.a f15072k;

    /* renamed from: l  reason: collision with root package name */
    public final Handler f15073l;

    /* renamed from: m  reason: collision with root package name */
    public final Handler f15074m;

    /* renamed from: n  reason: collision with root package name */
    public final jf0.a f15075n;

    /* renamed from: o  reason: collision with root package name */
    public final jf0.a f15076o;

    /* loaded from: classes2.dex */
    public interface b {
        void a();
    }

    static {
        new C0506a(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [jf0.a, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r2v1, types: [jf0.a] */
    public a(og0.a aVar) {
        aVar.getClass();
        this.d = aVar.b(d.light_profileSummary);
        LocalisationKey b13 = aVar.b(d.light_addingLocation);
        this.e = aVar.b(d.light_locationAdded);
        this.f15067f = aVar.b(d.light_configurationComplete);
        this.f15068g = new ObservableBoolean(true);
        this.f15069h = new n<>(b13);
        this.f15070i = new ObservableInt((int) R.color.white);
        this.f15071j = new ObservableInt(4);
        this.f15072k = new tf1.a(null, 1, null);
        Handler handler = new Handler();
        this.f15073l = handler;
        this.f15074m = new Handler();
        ?? r03 = new Runnable(this) { // from class: jf0.a
            public final /* synthetic */ com.dyson.mobile.android.light.summary.a e;

            {
                this.e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i13 = r2;
                com.dyson.mobile.android.light.summary.a aVar2 = this.e;
                switch (i13) {
                    case 0:
                        aVar2.f15069h.m(aVar2.e);
                        aVar2.f15070i.l(R.color.accessibleGrey);
                        aVar2.f15068g.m(false);
                        aVar2.f15071j.l(0);
                        aVar2.f15074m.postDelayed(aVar2.f15076o, 1000L);
                        return;
                    default:
                        a.b bVar = (a.b) aVar2.f15072k.getValue(aVar2, com.dyson.mobile.android.light.summary.a.f15066p[0]);
                        if (bVar != null) {
                            bVar.a();
                            return;
                        } else {
                            Logger.b("Navigator is null", null);
                            return;
                        }
                }
            }
        };
        this.f15075n = r03;
        this.f15076o = new Runnable(this) { // from class: jf0.a
            public final /* synthetic */ com.dyson.mobile.android.light.summary.a e;

            {
                this.e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i13 = r2;
                com.dyson.mobile.android.light.summary.a aVar2 = this.e;
                switch (i13) {
                    case 0:
                        aVar2.f15069h.m(aVar2.e);
                        aVar2.f15070i.l(R.color.accessibleGrey);
                        aVar2.f15068g.m(false);
                        aVar2.f15071j.l(0);
                        aVar2.f15074m.postDelayed(aVar2.f15076o, 1000L);
                        return;
                    default:
                        a.b bVar = (a.b) aVar2.f15072k.getValue(aVar2, com.dyson.mobile.android.light.summary.a.f15066p[0]);
                        if (bVar != null) {
                            bVar.a();
                            return;
                        } else {
                            Logger.b("Navigator is null", null);
                            return;
                        }
                }
            }
        };
        handler.postDelayed(r03, 1000L);
    }

    @Override // m9.c
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        this.f15073l.removeCallbacks(this.f15075n);
        this.f15074m.removeCallbacks(this.f15076o);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/light/summary/a$a;", "", "<init>", "()V", "", "ANIMATION_DELAY_MILLIS", "J", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.light.summary.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0506a {
        public /* synthetic */ C0506a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0506a() {
        }
    }
}
