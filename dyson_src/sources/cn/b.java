package cn;

import androidx.databinding.ObservableInt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import b0.y1;
import com.dyson.mobile.android.localisation.LocalisationKey;
import dz1.r;
import im1.zb;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.u;
import q8.n;
import rf0.q;
import se1.e0;
import x12.p0;
import x12.y;
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001eBo\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcn/b;", "Lm9/u;", "Landroidx/lifecycle/m;", "Lek/c;", "audioDataObject", "Ldz1/r;", "Lo60/a;", "connectionStatus", "Lyo/c;", "ancModeController", "Lep/c;", "audioStatusProvider", "Ltp/d;", "purifierPowerProvider", "Lvj/h;", "machineDataStore", "Lwj/a;", "analyticsEventFactory", "Lhj/e;", "trackingManager", "Lnp/d;", "fatalFaultProvider", "Lio/d;", "otaController", "Lfp/c;", "batteryStatusProvider", "Laf1/i;", "dispatcherProvider", "<init>", "(Lek/c;Ldz1/r;Lyo/c;Lep/c;Ltp/d;Lvj/h;Lwj/a;Lhj/e;Lnp/d;Lio/d;Lfp/c;Laf1/i;)V", "a", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class b extends u implements androidx.lifecycle.m {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ e22.m<Object>[] f11753w = {p0.f86717a.f(new y(b.class, "navigator", "getNavigator()Lcom/dyson/mobile/android/audio/home571/soundcontrol/AudioSoundControlFragmentNavigator;", 0))};
    public final ek.c d;
    public final r<o60.a> e;

    /* renamed from: f  reason: collision with root package name */
    public final yo.c f11754f;

    /* renamed from: g  reason: collision with root package name */
    public final tp.d f11755g;

    /* renamed from: h  reason: collision with root package name */
    public final vj.h f11756h;

    /* renamed from: i  reason: collision with root package name */
    public final wj.a f11757i;

    /* renamed from: j  reason: collision with root package name */
    public final hj.e f11758j;

    /* renamed from: k  reason: collision with root package name */
    public final np.d f11759k;

    /* renamed from: l  reason: collision with root package name */
    public final io.d f11760l;

    /* renamed from: m  reason: collision with root package name */
    public final fp.c f11761m;

    /* renamed from: n  reason: collision with root package name */
    public final af1.i f11762n;

    /* renamed from: o  reason: collision with root package name */
    public final tf1.a f11763o;

    /* renamed from: p  reason: collision with root package name */
    public final gz1.b f11764p;

    /* renamed from: q  reason: collision with root package name */
    public final ObservableInt f11765q;

    /* renamed from: r  reason: collision with root package name */
    public final ObservableInt f11766r;

    /* renamed from: s  reason: collision with root package name */
    public final ObservableInt f11767s;

    /* renamed from: t  reason: collision with root package name */
    public final ObservableInt f11768t;

    /* renamed from: u  reason: collision with root package name */
    public final n<a> f11769u;

    /* renamed from: v  reason: collision with root package name */
    public final r<l> f11770v;

    /* renamed from: cn.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class C0312b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f11785a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f11786b;

        static {
            int[] iArr = new int[l.values().length];
            try {
                iArr[l.CALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.ISOLATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l.CONVERSATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[l.TRANSPARENCY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[l.OFF.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f11785a = iArr;
            int[] iArr2 = new int[Lifecycle.a.values().length];
            try {
                iArr2[Lifecycle.a.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Lifecycle.a.ON_PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            f11786b = iArr2;
        }
    }

    public b(ek.c cVar, r<o60.a> rVar, yo.c cVar2, ep.c cVar3, tp.d dVar, vj.h hVar, wj.a aVar, hj.e eVar, np.d dVar2, io.d dVar3, fp.c cVar4, af1.i iVar) {
        cVar.getClass();
        rVar.getClass();
        cVar2.getClass();
        cVar3.getClass();
        hVar.getClass();
        aVar.getClass();
        eVar.getClass();
        dVar2.getClass();
        dVar3.getClass();
        cVar4.getClass();
        iVar.getClass();
        this.d = cVar;
        this.e = rVar;
        this.f11754f = cVar2;
        this.f11755g = dVar;
        this.f11756h = hVar;
        this.f11757i = aVar;
        this.f11758j = eVar;
        this.f11759k = dVar2;
        this.f11760l = dVar3;
        this.f11761m = cVar4;
        this.f11762n = iVar;
        this.f11763o = new tf1.a(null, 1, null);
        this.f11764p = new gz1.b();
        this.f11765q = new ObservableInt(cVar.c(ek.e.ANC_CONTROL_ISOLATION_ICON));
        this.f11766r = new ObservableInt(cVar.c(ek.e.ANC_CONTROL_TRANSPARENCY_ICON));
        this.f11767s = new ObservableInt(cVar.c(ek.e.ANC_CONTROL_OFF_ICON));
        this.f11768t = new ObservableInt(cVar.b() ? 0 : 8);
        this.f11769u = new n<>(new a.C0311b(cVar.c(ek.e.ANC_NOT_CONNECTED)));
        e0 e0Var = e0.f76037a;
        rz1.l p13 = cd.b.p(cVar2.a());
        r<ep.a> a13 = cVar3.a();
        c90.a aVar2 = new c90.a(13, (byte) 0);
        e0Var.getClass();
        this.f11770v = e0.e(p13, a13, aVar2);
    }

    @Override // androidx.lifecycle.m
    public final void g(LifecycleOwner lifecycleOwner, Lifecycle.a aVar) {
        r<tp.c> D;
        int i13 = C0312b.f11786b[aVar.ordinal()];
        gz1.b bVar = this.f11764p;
        if (i13 != 1) {
            if (i13 != 2) {
                return;
            }
            bVar.e();
            return;
        }
        e0 e0Var = e0.f76037a;
        tp.d dVar = this.f11755g;
        if (dVar == null || (D = dVar.a()) == null) {
            D = r.D(tp.c.DISABLED);
        }
        r<tp.c> rVar = D;
        rz1.r a13 = this.f11759k.a();
        rz1.r rVar2 = this.f11760l.f42357i;
        r<fp.b> a14 = this.f11761m.a();
        cn.a aVar2 = new cn.a(this, 0);
        e0Var.getClass();
        zb.z(bVar, e0.a(this.e, this.f11770v, rVar, a13, rVar2, a14, aVar2).S(c02.a.f10004c).H(fz1.a.a()).N());
        vj.h hVar = this.f11756h;
        if (hVar.f84328a.getBoolean("sound_control_about_shown", false)) {
            return;
        }
        f fVar = (f) this.f11763o.getValue(this, f11753w[0]);
        if (fVar != null) {
            fVar.w();
        }
        hVar.f84328a.putBoolean("sound_control_about_shown", true);
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u000e\u000f\u0010\u0011\u0012\u0013BC\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\r\u0082\u0001\u0006\u0014\u0015\u0016\u0017\u0018\u0019¨\u0006\u001a"}, d2 = {"Lcn/b$a;", "", "Lcom/dyson/mobile/android/localisation/LocalisationKey;", "title", "description", "", "icon", "Lat0/l;", "isolationSelectableButtonState", "transparencySelectableButtonState", "offSelectableButtonState", "buttonsImportantForAccessibility", "<init>", "(Lcom/dyson/mobile/android/localisation/LocalisationKey;Lcom/dyson/mobile/android/localisation/LocalisationKey;ILat0/l;Lat0/l;Lat0/l;I)V", "c", "f", "d", "a", "e", "b", "Lcn/b$a$a;", "Lcn/b$a$b;", "Lcn/b$a$c;", "Lcn/b$a$d;", "Lcn/b$a$e;", "Lcn/b$a$f;", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static abstract class a {

        /* renamed from: a  reason: collision with root package name */
        public final LocalisationKey f11771a;

        /* renamed from: b  reason: collision with root package name */
        public final LocalisationKey f11772b;

        /* renamed from: c  reason: collision with root package name */
        public final int f11773c;
        public final at0.l d;
        public final at0.l e;

        /* renamed from: f  reason: collision with root package name */
        public final at0.l f11774f;

        /* renamed from: g  reason: collision with root package name */
        public final int f11775g;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcn/b$a$a;", "Lcn/b$a;", "", "icon", "<init>", "(I)V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: cn.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0310a extends a {

            /* renamed from: h  reason: collision with root package name */
            public final int f11776h;

            static {
                LocalisationKey.a aVar = LocalisationKey.f15077f;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public C0310a(int r11) {
                /*
                    r10 = this;
                    com.dyson.mobile.android.localisation.LocalisationKey r1 = rf0.q.f72442o2
                    com.dyson.mobile.android.localisation.LocalisationKey r2 = rf0.q.f72450p2
                    at0.l r4 = at0.l.DESELECTED
                    r8 = 64
                    r9 = 0
                    r7 = 0
                    r5 = r4
                    r6 = r4
                    r0 = r10
                    r3 = r11
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                    r0.f11776h = r3
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: cn.b.a.C0310a.<init>(int):void");
            }

            @Override // cn.b.a
            public final int b() {
                return this.f11776h;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0310a) && this.f11776h == ((C0310a) obj).f11776h;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f11776h);
            }

            public final String toString() {
                return y1.i(this.f11776h, "ConversationStatus(icon=", ")");
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcn/b$a$b;", "Lcn/b$a;", "", "icon", "<init>", "(I)V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: cn.b$a$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0311b extends a {

            /* renamed from: h  reason: collision with root package name */
            public final int f11777h;

            static {
                LocalisationKey.a aVar = LocalisationKey.f15077f;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public C0311b(int r10) {
                /*
                    r9 = this;
                    com.dyson.mobile.android.localisation.LocalisationKey r1 = rf0.q.f72329a
                    com.dyson.mobile.android.localisation.LocalisationKey r2 = rf0.q.f72337b
                    at0.l r4 = at0.l.DISABLED
                    r7 = 2
                    r8 = 0
                    r5 = r4
                    r6 = r4
                    r0 = r9
                    r3 = r10
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                    r0.f11777h = r3
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: cn.b.a.C0311b.<init>(int):void");
            }

            @Override // cn.b.a
            public final int b() {
                return this.f11777h;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0311b) && this.f11777h == ((C0311b) obj).f11777h;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f11777h);
            }

            public final String toString() {
                return y1.i(this.f11777h, "DisconnectedStatus(icon=", ")");
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcn/b$a$c;", "Lcn/b$a;", "", "icon", "Lat0/l;", "selectableButtonState", "<init>", "(ILat0/l;)V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class c extends a {

            /* renamed from: h  reason: collision with root package name */
            public final int f11778h;

            /* renamed from: i  reason: collision with root package name */
            public final at0.l f11779i;

            static {
                LocalisationKey.a aVar = LocalisationKey.f15077f;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(int i13, at0.l lVar) {
                super(q.f72378g2, q.f72386h2, i13, at0.l.SELECTED, at0.l.DESELECTED, lVar, 0, 64, null);
                lVar.getClass();
                this.f11778h = i13;
                this.f11779i = lVar;
            }

            @Override // cn.b.a
            public final int b() {
                return this.f11778h;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof c) {
                    c cVar = (c) obj;
                    return this.f11778h == cVar.f11778h && this.f11779i == cVar.f11779i;
                }
                return false;
            }

            public final int hashCode() {
                return this.f11779i.hashCode() + (Integer.hashCode(this.f11778h) * 31);
            }

            public final String toString() {
                return "IsolationStatus(icon=" + this.f11778h + ", selectableButtonState=" + this.f11779i + ")";
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcn/b$a$d;", "Lcn/b$a;", "", "icon", "Lcom/dyson/mobile/android/localisation/LocalisationKey;", "description", "<init>", "(ILcom/dyson/mobile/android/localisation/LocalisationKey;)V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class d extends a {

            /* renamed from: h  reason: collision with root package name */
            public final int f11780h;

            /* renamed from: i  reason: collision with root package name */
            public final LocalisationKey f11781i;

            static {
                LocalisationKey.a aVar = LocalisationKey.f15077f;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public d(int r11, com.dyson.mobile.android.localisation.LocalisationKey r12) {
                /*
                    r10 = this;
                    r12.getClass()
                    com.dyson.mobile.android.localisation.LocalisationKey r1 = rf0.q.f72410k2
                    at0.l r4 = at0.l.DESELECTED
                    at0.l r6 = at0.l.SELECTED
                    r8 = 64
                    r9 = 0
                    r7 = 0
                    r5 = r4
                    r0 = r10
                    r3 = r11
                    r2 = r12
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                    r0.f11780h = r3
                    r0.f11781i = r2
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: cn.b.a.d.<init>(int, com.dyson.mobile.android.localisation.LocalisationKey):void");
            }

            @Override // cn.b.a
            public final LocalisationKey a() {
                return this.f11781i;
            }

            @Override // cn.b.a
            public final int b() {
                return this.f11780h;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof d) {
                    d dVar = (d) obj;
                    return this.f11780h == dVar.f11780h && x12.r.c(this.f11781i, dVar.f11781i);
                }
                return false;
            }

            public final int hashCode() {
                return this.f11781i.hashCode() + (Integer.hashCode(this.f11780h) * 31);
            }

            public final String toString() {
                return "OffStatus(icon=" + this.f11780h + ", description=" + this.f11781i + ")";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcn/b$a$e;", "Lcn/b$a;", "", "icon", "<init>", "(I)V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class e extends a {

            /* renamed from: h  reason: collision with root package name */
            public final int f11782h;

            static {
                LocalisationKey.a aVar = LocalisationKey.f15077f;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public e(int r10) {
                /*
                    r9 = this;
                    com.dyson.mobile.android.localisation.LocalisationKey r1 = rf0.q.f72426m2
                    com.dyson.mobile.android.localisation.LocalisationKey r2 = rf0.q.f72434n2
                    at0.l r4 = at0.l.DISABLED
                    r7 = 2
                    r8 = 0
                    r5 = r4
                    r6 = r4
                    r0 = r9
                    r3 = r10
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                    r0.f11782h = r3
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: cn.b.a.e.<init>(int):void");
            }

            @Override // cn.b.a
            public final int b() {
                return this.f11782h;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && this.f11782h == ((e) obj).f11782h;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f11782h);
            }

            public final String toString() {
                return y1.i(this.f11782h, "OnCallStatus(icon=", ")");
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcn/b$a$f;", "Lcn/b$a;", "", "icon", "Lat0/l;", "selectableButtonState", "<init>", "(ILat0/l;)V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class f extends a {

            /* renamed from: h  reason: collision with root package name */
            public final int f11783h;

            /* renamed from: i  reason: collision with root package name */
            public final at0.l f11784i;

            static {
                LocalisationKey.a aVar = LocalisationKey.f15077f;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(int i13, at0.l lVar) {
                super(q.f72394i2, q.f72402j2, i13, at0.l.DESELECTED, at0.l.SELECTED, lVar, 0, 64, null);
                lVar.getClass();
                this.f11783h = i13;
                this.f11784i = lVar;
            }

            @Override // cn.b.a
            public final int b() {
                return this.f11783h;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof f) {
                    f fVar = (f) obj;
                    return this.f11783h == fVar.f11783h && this.f11784i == fVar.f11784i;
                }
                return false;
            }

            public final int hashCode() {
                return this.f11784i.hashCode() + (Integer.hashCode(this.f11783h) * 31);
            }

            public final String toString() {
                return "TransparencyStatus(icon=" + this.f11783h + ", selectableButtonState=" + this.f11784i + ")";
            }
        }

        static {
            LocalisationKey.a aVar = LocalisationKey.f15077f;
        }

        public /* synthetic */ a(LocalisationKey localisationKey, LocalisationKey localisationKey2, int i13, at0.l lVar, at0.l lVar2, at0.l lVar3, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
            this(localisationKey, localisationKey2, i13, lVar, lVar2, lVar3, (i15 & 64) != 0 ? 1 : i14, null);
        }

        public LocalisationKey a() {
            return this.f11772b;
        }

        public int b() {
            return this.f11773c;
        }

        private a(LocalisationKey localisationKey, LocalisationKey localisationKey2, int i13, at0.l lVar, at0.l lVar2, at0.l lVar3, int i14) {
            this.f11771a = localisationKey;
            this.f11772b = localisationKey2;
            this.f11773c = i13;
            this.d = lVar;
            this.e = lVar2;
            this.f11774f = lVar3;
            this.f11775g = i14;
        }

        public /* synthetic */ a(LocalisationKey localisationKey, LocalisationKey localisationKey2, int i13, at0.l lVar, at0.l lVar2, at0.l lVar3, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this(localisationKey, localisationKey2, i13, lVar, lVar2, lVar3, i14);
        }
    }
}
