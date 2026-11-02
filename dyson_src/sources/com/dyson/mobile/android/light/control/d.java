package com.dyson.mobile.android.light.control;

import android.graphics.PorterDuff;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableInt;
import androidx.lifecycle.LifecycleOwner;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.localisation.LocalisationKey;
import e22.m;
import hj.e;
import kotlin.Metadata;
import nj.f7;
import x12.p0;
import x12.y;
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/dyson/mobile/android/light/control/d;", "Lq8/a;", "Lm9/c;", "", "serialNumber", "Lmf0/a;", "colorBrightnessViewModel", "Lyd0/d;", "dataStore", "Log0/a;", "machineDataObject", "Lhj/e;", "trackingManager", "Lin0/g;", "lightingMachineInfo", "<init>", "(Ljava/lang/String;Lmf0/a;Lyd0/d;Log0/a;Lhj/e;Lin0/g;)V", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class d extends q8.a implements m9.c {

    /* renamed from: u  reason: collision with root package name */
    public static final /* synthetic */ m<Object>[] f14814u = {p0.f86717a.f(new y(d.class, "navigator", "getNavigator()Lcom/dyson/mobile/android/light/control/LightCustomModeDescriptionNavigator;", 0))};
    public final String d;
    public final mf0.a e;

    /* renamed from: f  reason: collision with root package name */
    public final yd0.d f14815f;

    /* renamed from: g  reason: collision with root package name */
    public final hj.e f14816g;

    /* renamed from: h  reason: collision with root package name */
    public int f14817h;

    /* renamed from: i  reason: collision with root package name */
    public int f14818i;

    /* renamed from: j  reason: collision with root package name */
    public final LocalisationKey f14819j;

    /* renamed from: k  reason: collision with root package name */
    public final LocalisationKey f14820k;

    /* renamed from: l  reason: collision with root package name */
    public final LocalisationKey f14821l;

    /* renamed from: m  reason: collision with root package name */
    public int f14822m;

    /* renamed from: n  reason: collision with root package name */
    public final ObservableInt f14823n;

    /* renamed from: o  reason: collision with root package name */
    public PorterDuff.Mode f14824o;

    /* renamed from: p  reason: collision with root package name */
    public String f14825p;

    /* renamed from: q  reason: collision with root package name */
    public String f14826q;

    /* renamed from: r  reason: collision with root package name */
    public final ObservableBoolean f14827r;

    /* renamed from: s  reason: collision with root package name */
    public final tf1.a f14828s;

    /* renamed from: t  reason: collision with root package name */
    public final boolean f14829t;

    public d(String str, mf0.a aVar, yd0.d dVar, og0.a aVar2, hj.e eVar, in0.g gVar) {
        str.getClass();
        aVar.getClass();
        dVar.getClass();
        aVar2.getClass();
        eVar.getClass();
        gVar.getClass();
        this.d = str;
        this.e = aVar;
        this.f14815f = dVar;
        this.f14816g = eVar;
        this.f14819j = aVar2.b(og0.d.light_modeLabel);
        this.f14820k = aVar2.b(og0.d.light_modeLabelDescription);
        this.f14821l = aVar2.b(og0.d.light_save);
        ie0.f.f41557a.getClass();
        this.f14822m = ie0.f.f41560f;
        this.f14823n = new ObservableInt();
        this.f14824o = PorterDuff.Mode.SRC_ATOP;
        this.f14825p = "";
        this.f14826q = "";
        this.f14827r = new ObservableBoolean(false);
        this.f14828s = new tf1.a(null, 1, null);
        this.f14829t = gVar.f42336b.equals(in0.i.VARIANT_552A.getValue());
        aVar.f53826c.l(R.color.accessibleGrey);
    }

    @Override // m9.c
    public final void onResume(LifecycleOwner lifecycleOwner) {
        int i13 = f7.f57479a;
        ij.b bVar = new ij.b("light.modes.mode_description", null, 2, null);
        e.a aVar = hj.e.f38312g;
        this.f14816g.h(bVar, null);
    }
}
