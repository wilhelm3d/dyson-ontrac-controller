package com.dyson.mobile.android.home;

import androidx.lifecycle.ViewModelProvider;
import c42.f2;
import c42.g2;
import c42.r;
import c42.r1;
import i12.s;
import kotlin.Metadata;
import m9.u;
import m9.v;
import z32.g0;
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/dyson/mobile/android/home/a;", "Lm9/u;", "Ln81/a;", "marketInformationRepository", "Laf1/i;", "dispatcherProvider", "Lhj/e;", "trackingManager", "Lk71/c;", "supportContactManager", "Lw80/e;", "systemBarsConfigurationProvider", "<init>", "(Ln81/a;Laf1/i;Lhj/e;Lk71/c;Lw80/e;)V", "a", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a extends u {
    public final n81.a d;
    public final af1.i e;

    /* renamed from: f  reason: collision with root package name */
    public final hj.e f14160f;

    /* renamed from: g  reason: collision with root package name */
    public final w80.e f14161g;

    /* renamed from: h  reason: collision with root package name */
    public final f2 f14162h;

    /* renamed from: i  reason: collision with root package name */
    public final f2 f14163i;

    /* renamed from: j  reason: collision with root package name */
    public final r1 f14164j;

    /* renamed from: k  reason: collision with root package name */
    public final r1 f14165k;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/dyson/mobile/android/home/a$a;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Ln81/a;", "marketInformationRepository", "Laf1/i;", "dispatcherProvider", "Lhj/e;", "trackingManager", "Lk71/c;", "supportContactManager", "Lw80/e;", "systemBarsConfigurationProvider", "<init>", "(Ln81/a;Laf1/i;Lhj/e;Lk71/c;Lw80/e;)V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.home.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0457a implements ViewModelProvider.Factory {

        /* renamed from: a  reason: collision with root package name */
        public final n81.a f14166a;

        /* renamed from: b  reason: collision with root package name */
        public final af1.i f14167b;

        /* renamed from: c  reason: collision with root package name */
        public final hj.e f14168c;
        public final k71.c d;
        public final w80.e e;

        public C0457a(n81.a aVar, af1.i iVar, hj.e eVar, k71.c cVar, w80.e eVar2) {
            aVar.getClass();
            iVar.getClass();
            eVar.getClass();
            cVar.getClass();
            eVar2.getClass();
            this.f14166a = aVar;
            this.f14167b = iVar;
            this.f14168c = eVar;
            this.d = cVar;
            this.e = eVar2;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public final <T extends u> T create(Class<T> cls) {
            cls.getClass();
            return new a(this.f14166a, this.f14167b, this.f14168c, this.d, this.e);
        }
    }

    public a(n81.a aVar, af1.i iVar, hj.e eVar, k71.c cVar, w80.e eVar2) {
        aVar.getClass();
        iVar.getClass();
        eVar.getClass();
        cVar.getClass();
        eVar2.getClass();
        this.d = aVar;
        this.e = iVar;
        this.f14160f = eVar;
        this.f14161g = eVar2;
        f2 a13 = g2.a(new w80.d(o81.b.a(aVar.c()), S(o81.b.a(aVar.c()))));
        this.f14162h = a13;
        f2 a14 = g2.a(null);
        this.f14163i = a14;
        this.f14164j = r.d(a13);
        this.f14165k = r.d(a14);
        g0.r(v.a(this), iVar.c(), null, new w80.g(this, null), 2);
        cVar.c();
    }

    public static j12.b S(boolean z13) {
        j12.b b13 = s.b();
        if (z13) {
            b13.add(w80.f.SHOP);
        }
        b13.add(w80.f.MY_PRODUCTS);
        b13.add(w80.f.SUPPORT);
        b13.add(w80.f.PROFILE);
        return s.a(b13);
    }
}
