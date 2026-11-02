package com.dyson.mobile.android.cat6.traits.language;

import android.annotation.SuppressLint;
import b50.p;
import c42.a2;
import c42.r1;
import cc0.z;
import com.dyson.mobile.android.cat6.traits.language.ProductUILanguage;
import d02.d;
import dz1.r;
import em1.c4;
import f60.i;
import gi0.f;
import i12.e0;
import i12.u;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kz1.b;
import rf0.i0;
import rz1.d0;
import rz1.t;
import sz1.v;
import x50.l0;
import xk0.l;
import z32.c0;
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0010B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/dyson/mobile/android/cat6/traits/language/a;", "Lds/c;", "Lf60/i;", "authenticatedBleConnector", "Lx50/l0;", "bleClient", "Lgi0/f;", "messageAttributeValueController", "Lds/f;", "productLanguageUtils", "Lpf0/c;", "localisationManager", "Lz32/c0;", "scope", "<init>", "(Lf60/i;Lx50/l0;Lgi0/f;Lds/f;Lpf0/c;Lz32/c0;)V", "a", "mod-cat6-connected-floorcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SuppressLint({"LocalisationKeyUsage"})
/* loaded from: classes2.dex */
public final class a implements ds.c {

    /* renamed from: j  reason: collision with root package name */
    public static final /* synthetic */ int f12843j = 0;

    /* renamed from: a  reason: collision with root package name */
    public final l0 f12844a;

    /* renamed from: b  reason: collision with root package name */
    public final f f12845b;

    /* renamed from: c  reason: collision with root package name */
    public final ds.f f12846c;
    public final pf0.c d;
    public final c0 e;

    /* renamed from: f  reason: collision with root package name */
    public final d<ProductUILanguage> f12847f;

    /* renamed from: g  reason: collision with root package name */
    public final ProductUILanguage.Ble f12848g;

    /* renamed from: h  reason: collision with root package name */
    public final r<xk0.f<ProductUILanguage>> f12849h;

    /* renamed from: i  reason: collision with root package name */
    public final r1 f12850i;

    static {
        new C0364a(null);
    }

    public a(i iVar, l0 l0Var, f fVar, ds.f fVar2, pf0.c cVar, c0 c0Var) {
        iVar.getClass();
        l0Var.getClass();
        fVar.getClass();
        fVar2.getClass();
        cVar.getClass();
        c0Var.getClass();
        this.f12844a = l0Var;
        this.f12845b = fVar;
        this.f12846c = fVar2;
        this.d = cVar;
        this.e = c0Var;
        this.f12847f = new d<>();
        this.f12848g = new ProductUILanguage.Ble(0, cVar.d(i0.Cc));
        this.f12849h = c4.C(l.a(iVar.f29963o, new z(this, 16)), kz1.a.f50213a, 1);
        List<BleProductUILanguage> list = fVar2.f24985f;
        ArrayList arrayList = new ArrayList(u.o(list, 10));
        for (BleProductUILanguage bleProductUILanguage : list) {
            arrayList.add(new ProductUILanguage.Ble(bleProductUILanguage.getValue(), this.d.d(bleProductUILanguage.getLocalisationKey())));
        }
        c42.l lVar = new c42.l(arrayList);
        c0 c0Var2 = this.e;
        a2.f10222a.getClass();
        this.f12850i = c42.r.D(lVar, c0Var2, a2.a.f10224b, e0.d);
    }

    @Override // ds.c
    @SuppressLint({"CheckResult"})
    public final void a(ProductUILanguage productUILanguage, ys.f fVar) {
        productUILanguage.getClass();
        v j8 = this.f12844a.a(new ir.b((ProductUILanguage.Ble) productUILanguage)).s(4L, TimeUnit.SECONDS).r(c02.a.f10004c).j(fz1.a.a());
        df0.d dVar = new df0.d(new ds.a(fVar, 0), 21);
        b.a aVar = kz1.b.f50218a;
        new sz1.i(j8, dVar).o(new df0.d(new ds.a(fVar, 1), 22));
    }

    @Override // ds.c
    public final r1 b(String str) {
        BleProductUILanguage bleProductUILanguage = this.f12846c.e.get(str);
        ProductUILanguage.Ble ble = this.f12848g;
        c42.l lVar = new c42.l(bleProductUILanguage != null ? new ProductUILanguage.Ble(bleProductUILanguage.getValue(), this.d.d(bleProductUILanguage.getLocalisationKey())) : ble);
        a2.f10222a.getClass();
        return c42.r.D(lVar, this.e, a2.a.f10224b, ble);
    }

    @Override // ds.c
    public final d0 c(ProductUILanguage productUILanguage) {
        t p13 = this.f12849h.U(1L).p(new p(4, this, productUILanguage));
        df0.d dVar = new df0.d(new a42.b(26, productUILanguage, this), 20);
        b.a aVar = kz1.b.f50218a;
        return new d0(p13, dVar, false);
    }

    @Override // ds.c
    public final r<xk0.f<ProductUILanguage>> d() {
        return this.f12849h;
    }

    @Override // ds.c
    public final r1 e() {
        return this.f12850i;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/cat6/traits/language/a$a;", "", "<init>", "()V", "", "COMMUNICATION_TIMEOUT_SECONDS", "J", "mod-cat6-connected-floorcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.cat6.traits.language.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0364a {
        public /* synthetic */ C0364a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0364a() {
        }
    }
}
