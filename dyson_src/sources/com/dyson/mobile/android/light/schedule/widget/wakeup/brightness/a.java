package com.dyson.mobile.android.light.schedule.widget.wakeup.brightness;

import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableInt;
import androidx.lifecycle.LifecycleOwner;
import com.dyson.mobile.android.localisation.LocalisationKey;
import e22.m;
import in0.g;
import in0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.c;
import nf0.d;
import og0.d;
import q8.n;
import x12.p0;
import x12.y;
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\f\rB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/dyson/mobile/android/light/schedule/widget/wakeup/brightness/a;", "Lm9/c;", "Llf0/a;", "bleTaskFactory", "Log0/a;", "machineDataObject", "Lpf0/c;", "localisationManager", "Lin0/g;", "lightingMachineInfo", "<init>", "(Llf0/a;Log0/a;Lpf0/c;Lin0/g;)V", "b", "a", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a implements c {

    /* renamed from: u  reason: collision with root package name */
    public static final /* synthetic */ m<Object>[] f14947u = {p0.f86717a.f(new y(a.class, "navigator", "getNavigator()Lcom/dyson/mobile/android/light/schedule/widget/wakeup/brightness/WakeUpBrightnessViewModel$Navigator;", 0))};
    public final lf0.a d;
    public final LocalisationKey e;

    /* renamed from: f  reason: collision with root package name */
    public final LocalisationKey f14948f;

    /* renamed from: g  reason: collision with root package name */
    public final String f14949g;

    /* renamed from: h  reason: collision with root package name */
    public final LocalisationKey f14950h;

    /* renamed from: i  reason: collision with root package name */
    public final String f14951i;

    /* renamed from: j  reason: collision with root package name */
    public final ObservableInt f14952j;

    /* renamed from: k  reason: collision with root package name */
    public final ObservableBoolean f14953k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f14954l;

    /* renamed from: m  reason: collision with root package name */
    public int f14955m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f14956n;

    /* renamed from: o  reason: collision with root package name */
    public final n<String> f14957o;

    /* renamed from: p  reason: collision with root package name */
    public final int f14958p;

    /* renamed from: q  reason: collision with root package name */
    public final String f14959q;

    /* renamed from: r  reason: collision with root package name */
    public final int f14960r;

    /* renamed from: s  reason: collision with root package name */
    public final gz1.b f14961s;

    /* renamed from: t  reason: collision with root package name */
    public final tf1.a f14962t;

    /* loaded from: classes2.dex */
    public interface b {
        void a();
    }

    static {
        new C0500a(null);
    }

    public a(lf0.a aVar, og0.a aVar2, pf0.c cVar, g gVar) {
        aVar.getClass();
        aVar2.getClass();
        cVar.getClass();
        gVar.getClass();
        this.d = aVar;
        this.e = aVar2.b(d.light_scheduleWakeUpModeBrightness);
        this.f14948f = aVar2.b(d.light_wakeUpBrightnessLumensHeader);
        d.a aVar3 = d.a.LUMEN;
        this.f14949g = nf0.d.a(aVar3, 100);
        this.f14950h = aVar2.b(og0.d.light_units_brightness);
        this.f14951i = if1.g.a(cVar.d(aVar2.b(og0.d.light_wakeUpBrightnessDescription)), nf0.d.a(aVar3, 300));
        this.f14952j = new ObservableInt();
        this.f14953k = new ObservableBoolean(false);
        this.f14954l = true;
        this.f14955m = 100;
        this.f14957o = new n<>("300");
        int i13 = gVar.f42336b.equals(i.VARIANT_552A.getValue()) ? 850 : 1000;
        this.f14958p = i13;
        this.f14959q = nf0.d.a(aVar3, i13);
        this.f14960r = (i13 / 10) - 10;
        this.f14961s = new gz1.b();
        this.f14962t = new tf1.a(null, 1, null);
    }

    @Override // m9.c
    public final void onPause(LifecycleOwner lifecycleOwner) {
        this.f14961s.e();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/dyson/mobile/android/light/schedule/widget/wakeup/brightness/a$a;", "", "<init>", "()V", "", "BRIGHTNESS_SLIDER_CONVERSION_RATIO", "I", "", "STATE_SERVICE_DELAY_MILLIS", "J", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.light.schedule.widget.wakeup.brightness.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0500a {
        public /* synthetic */ C0500a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0500a() {
        }
    }
}
