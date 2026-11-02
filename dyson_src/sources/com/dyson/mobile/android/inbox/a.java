package com.dyson.mobile.android.inbox;

import androidx.lifecycle.ViewModelProvider;
import com.dyson.mobile.android.inbox.c;
import h12.f0;
import im1.zb;
import kotlin.Metadata;
import kz1.b;
import m9.u;
import no0.e;
import no0.h;
import sz1.i;
import sz1.j;
import sz1.k;
import sz1.v;
import u3.k1;
import u3.y2;
import v90.m;
import v90.t;
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0011B9\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/dyson/mobile/android/inbox/a;", "Lm9/u;", "Lv90/t;", "Lpf0/c;", "localisationManager", "Lv90/m;", "inboxRepository", "Lno0/h;", "salesforceMarketingCloudProvider", "Lhj/e;", "trackingManager", "Lcom/dyson/mobile/android/salesforce/b;", "salesForceDeepLinkParser", "Leo0/b;", "deepLinkIntentBroadcaster", "<init>", "(Lpf0/c;Lv90/m;Lno0/h;Lhj/e;Lcom/dyson/mobile/android/salesforce/b;Leo0/b;)V", "a", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a extends u implements t {
    public final m d;
    public final h e;

    /* renamed from: f  reason: collision with root package name */
    public final hj.e f14250f;

    /* renamed from: g  reason: collision with root package name */
    public final com.dyson.mobile.android.salesforce.b f14251g;

    /* renamed from: h  reason: collision with root package name */
    public final eo0.b f14252h;

    /* renamed from: i  reason: collision with root package name */
    public final k1<c> f14253i;

    /* renamed from: j  reason: collision with root package name */
    public final xf1.a<com.dyson.mobile.android.inbox.b> f14254j;

    /* renamed from: k  reason: collision with root package name */
    public final xf1.a<f0> f14255k;

    /* renamed from: l  reason: collision with root package name */
    public final gz1.b f14256l;

    /* renamed from: m  reason: collision with root package name */
    public boolean f14257m;

    /* renamed from: n  reason: collision with root package name */
    public final uk.a f14258n;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/dyson/mobile/android/inbox/a$a;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Lpf0/c;", "localisationManager", "Lv90/m;", "inboxRepository", "Lno0/h;", "salesforceMarketingCloudProvider", "Lhj/e;", "trackingManager", "Lcom/dyson/mobile/android/salesforce/b;", "salesForceDeepLinkParser", "Leo0/b;", "deepLinkIntentBroadcaster", "<init>", "(Lpf0/c;Lv90/m;Lno0/h;Lhj/e;Lcom/dyson/mobile/android/salesforce/b;Leo0/b;)V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.inbox.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0463a implements ViewModelProvider.Factory {

        /* renamed from: a  reason: collision with root package name */
        public final pf0.c f14259a;

        /* renamed from: b  reason: collision with root package name */
        public final m f14260b;

        /* renamed from: c  reason: collision with root package name */
        public final h f14261c;
        public final hj.e d;
        public final com.dyson.mobile.android.salesforce.b e;

        /* renamed from: f  reason: collision with root package name */
        public final eo0.b f14262f;

        public C0463a(pf0.c cVar, m mVar, h hVar, hj.e eVar, com.dyson.mobile.android.salesforce.b bVar, eo0.b bVar2) {
            cVar.getClass();
            mVar.getClass();
            hVar.getClass();
            eVar.getClass();
            bVar.getClass();
            bVar2.getClass();
            this.f14259a = cVar;
            this.f14260b = mVar;
            this.f14261c = hVar;
            this.d = eVar;
            this.e = bVar;
            this.f14262f = bVar2;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public final <T extends u> T create(Class<T> cls) {
            cls.getClass();
            return new a(this.f14259a, this.f14260b, this.f14261c, this.d, this.e, this.f14262f);
        }
    }

    /* loaded from: classes2.dex */
    public static final /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f14263a;

        static {
            int[] iArr = new int[e.b.values().length];
            try {
                iArr[e.b.UNINITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e.b.INITIALIZING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e.b.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e.b.READY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f14263a = iArr;
        }
    }

    public a(pf0.c cVar, m mVar, h hVar, hj.e eVar, com.dyson.mobile.android.salesforce.b bVar, eo0.b bVar2) {
        cVar.getClass();
        mVar.getClass();
        hVar.getClass();
        eVar.getClass();
        bVar.getClass();
        bVar2.getClass();
        this.d = mVar;
        this.e = hVar;
        this.f14250f = eVar;
        this.f14251g = bVar;
        this.f14252h = bVar2;
        this.f14253i = androidx.compose.runtime.d.j(c.C0465c.f14270a);
        this.f14254j = new xf1.a<>();
        this.f14255k = new xf1.a<>();
        gz1.b bVar3 = new gz1.b();
        this.f14256l = bVar3;
        bVar3.a(hVar.f().O(new uo.c(new v90.c(this, 4), 19)));
        this.f14258n = new uk.a(this, 13);
    }

    @Override // v90.t
    public final w12.a<f0> I() {
        return this.f14258n;
    }

    public final void S(boolean z13) {
        v j8 = this.d.getMessages().r(c02.a.f10004c).j(fz1.a.a());
        uo.c cVar = new uo.c(new an0.c(this, z13, 20), 20);
        b.a aVar = kz1.b.f50218a;
        zb.z(this.f14256l, new i(new k(new j(j8, cVar), new uo.c(new v90.c(this, 8), 21)), new uo.c(new v90.c(this, 0), 18)).n());
    }

    public final void T() {
        ((y2) this.f14253i).setValue(!this.f14257m ? new c.a(new v90.c(this, 6)) : new c.b(new v90.c(this, 7)));
    }

    @Override // v90.t
    public final k1<c> i() {
        return this.f14253i;
    }

    @Override // m9.u
    public final void onCleared() {
        super.onCleared();
        this.f14256l.e();
    }
}
