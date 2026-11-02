package com.dyson.mobile.android.light.configuration.custombaseline;

import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableInt;
import androidx.lifecycle.LifecycleOwner;
import com.dyson.mobile.android.localisation.LocalisationKey;
import e22.m;
import hj.e;
import in0.g;
import in0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.c;
import nf0.d;
import og0.d;
import org.bouncycastle.asn1.x509.DisplayText;
import x12.p0;
import x12.y;
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/dyson/mobile/android/light/configuration/custombaseline/a;", "Lm9/c;", "Llf0/a;", "bleTaskFactory", "Log0/a;", "machineDataObject", "Lpf0/c;", "localisationManager", "Lin0/g;", "lightingMachineInfo", "Lhj/e;", "trackingManager", "<init>", "(Llf0/a;Log0/a;Lpf0/c;Lin0/g;Lhj/e;)V", "b", "a", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a implements c {
    public static final /* synthetic */ m<Object>[] B = {p0.f86717a.f(new y(a.class, "navigator", "getNavigator()Lcom/dyson/mobile/android/light/configuration/custombaseline/CustomBaselineViewModel$Navigator;", 0))};
    public final tf1.a A;
    public final lf0.a d;
    public final e e;

    /* renamed from: f  reason: collision with root package name */
    public final LocalisationKey f14751f;

    /* renamed from: g  reason: collision with root package name */
    public final LocalisationKey f14752g;

    /* renamed from: h  reason: collision with root package name */
    public final LocalisationKey f14753h;

    /* renamed from: i  reason: collision with root package name */
    public final String f14754i;

    /* renamed from: j  reason: collision with root package name */
    public final String f14755j;

    /* renamed from: k  reason: collision with root package name */
    public final String f14756k;

    /* renamed from: l  reason: collision with root package name */
    public final String f14757l;

    /* renamed from: m  reason: collision with root package name */
    public final LocalisationKey f14758m;

    /* renamed from: n  reason: collision with root package name */
    public final ObservableInt f14759n;

    /* renamed from: o  reason: collision with root package name */
    public final ObservableInt f14760o;

    /* renamed from: p  reason: collision with root package name */
    public final ObservableBoolean f14761p;

    /* renamed from: q  reason: collision with root package name */
    public boolean f14762q;

    /* renamed from: r  reason: collision with root package name */
    public int f14763r;

    /* renamed from: s  reason: collision with root package name */
    public int f14764s;

    /* renamed from: t  reason: collision with root package name */
    public boolean f14765t;

    /* renamed from: u  reason: collision with root package name */
    public int f14766u;

    /* renamed from: v  reason: collision with root package name */
    public int f14767v;

    /* renamed from: w  reason: collision with root package name */
    public final int f14768w;

    /* renamed from: x  reason: collision with root package name */
    public final String f14769x;

    /* renamed from: y  reason: collision with root package name */
    public final int f14770y;

    /* renamed from: z  reason: collision with root package name */
    public final gz1.b f14771z;

    /* loaded from: classes2.dex */
    public interface b {
        void a();
    }

    static {
        new C0492a(null);
    }

    public a(lf0.a aVar, og0.a aVar2, pf0.c cVar, g gVar, e eVar) {
        aVar.getClass();
        aVar2.getClass();
        cVar.getClass();
        gVar.getClass();
        eVar.getClass();
        this.d = aVar;
        this.e = eVar;
        this.f14751f = aVar2.b(d.light_configurationCustomBaseline);
        this.f14752g = aVar2.b(d.light_configurationKelvinHeader);
        this.f14753h = aVar2.b(d.light_configurationLumensHeader);
        d.a aVar3 = d.a.KELVIN;
        this.f14754i = nf0.d.a(aVar3, 2700);
        this.f14755j = nf0.d.a(aVar3, 6500);
        d.a aVar4 = d.a.LUMEN;
        this.f14756k = nf0.d.a(aVar4, 100);
        this.f14757l = if1.g.a(cVar.d(aVar2.b(og0.d.light_configurationCustomBaselineDescriptionOff)), nf0.d.a(aVar3, 3000), nf0.d.a(aVar4, DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE));
        this.f14758m = aVar2.b(og0.d.light_configurationResetButton);
        this.f14759n = new ObservableInt();
        this.f14760o = new ObservableInt();
        this.f14761p = new ObservableBoolean(false);
        int i13 = gVar.f42336b.equals(i.VARIANT_552A.getValue()) ? 850 : 1000;
        this.f14768w = i13;
        this.f14769x = nf0.d.a(aVar4, i13);
        this.f14770y = (i13 / 10) - 10;
        this.f14771z = new gz1.b();
        this.A = new tf1.a(null, 1, null);
    }

    @Override // m9.c
    public final void onPause(LifecycleOwner lifecycleOwner) {
        this.f14771z.e();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/dyson/mobile/android/light/configuration/custombaseline/a$a;", "", "<init>", "()V", "", "BRIGHTNESS_SLIDER_CONVERSION_RATIO", "I", "", "STATE_SERVICE_DELAY_MILLIS", "J", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.light.configuration.custombaseline.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0492a {
        public /* synthetic */ C0492a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0492a() {
        }
    }
}
