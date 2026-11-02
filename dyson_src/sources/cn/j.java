package cn;

import androidx.databinding.ObservableInt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import b0.y1;
import com.dyson.mobile.android.R;
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
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u001a\u001bB]\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcn/j;", "Lm9/u;", "Landroidx/lifecycle/m;", "Ldz1/r;", "Lo60/a;", "connectionStatus", "Llp/l;", "equalizationModeController", "Lvj/h;", "machineDataStore", "Lwj/a;", "analyticsEventFactory", "Lhj/e;", "trackingManager", "Lnp/d;", "fatalFaultProvider", "Lio/d;", "otaController", "Lek/c;", "audioDataObject", "Lfp/c;", "batteryStatusProvider", "Laf1/i;", "dispatcherProvider", "<init>", "(Ldz1/r;Llp/l;Lvj/h;Lwj/a;Lhj/e;Lnp/d;Lio/d;Lek/c;Lfp/c;Laf1/i;)V", "b", "a", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class j extends u implements androidx.lifecycle.m {
    public final r<o60.a> d;
    public final lp.l e;

    /* renamed from: f  reason: collision with root package name */
    public final vj.h f11795f;

    /* renamed from: g  reason: collision with root package name */
    public final wj.a f11796g;

    /* renamed from: h  reason: collision with root package name */
    public final hj.e f11797h;

    /* renamed from: i  reason: collision with root package name */
    public final np.d f11798i;

    /* renamed from: j  reason: collision with root package name */
    public final io.d f11799j;

    /* renamed from: k  reason: collision with root package name */
    public final ek.c f11800k;

    /* renamed from: l  reason: collision with root package name */
    public final fp.c f11801l;

    /* renamed from: m  reason: collision with root package name */
    public final af1.i f11802m;

    /* renamed from: n  reason: collision with root package name */
    public final tf1.a f11803n;

    /* renamed from: o  reason: collision with root package name */
    public final ObservableInt f11804o;

    /* renamed from: p  reason: collision with root package name */
    public final ObservableInt f11805p;

    /* renamed from: q  reason: collision with root package name */
    public final ObservableInt f11806q;

    /* renamed from: r  reason: collision with root package name */
    public final n<b> f11807r;

    /* renamed from: s  reason: collision with root package name */
    public final gz1.b f11808s;

    /* renamed from: u  reason: collision with root package name */
    public static final /* synthetic */ e22.m<Object>[] f11793u = {p0.f86717a.f(new y(j.class, "navigator", "getNavigator()Lcom/dyson/mobile/android/audio/home571/soundcontrol/AudioSoundControlFragmentNavigator;", 0))};

    /* renamed from: t  reason: collision with root package name */
    public static final a f11792t = new a(null);

    /* renamed from: v  reason: collision with root package name */
    public static final int f11794v = R.drawable.audio_sound_control_disconnected_profile;

    /* loaded from: classes2.dex */
    public static final /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f11819a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f11820b;

        static {
            int[] iArr = new int[Lifecycle.a.values().length];
            try {
                iArr[Lifecycle.a.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.a.ON_PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f11819a = iArr;
            int[] iArr2 = new int[lp.j.values().length];
            try {
                iArr2[lp.j.NEUTRAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[lp.j.BASS_BOOST.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[lp.j.ENHANCED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[lp.j.MODE_3.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            f11820b = iArr2;
        }
    }

    public j(r<o60.a> rVar, lp.l lVar, vj.h hVar, wj.a aVar, hj.e eVar, np.d dVar, io.d dVar2, ek.c cVar, fp.c cVar2, af1.i iVar) {
        rVar.getClass();
        lVar.getClass();
        hVar.getClass();
        aVar.getClass();
        eVar.getClass();
        dVar.getClass();
        dVar2.getClass();
        cVar.getClass();
        cVar2.getClass();
        iVar.getClass();
        this.d = rVar;
        this.e = lVar;
        this.f11795f = hVar;
        this.f11796g = aVar;
        this.f11797h = eVar;
        this.f11798i = dVar;
        this.f11799j = dVar2;
        this.f11800k = cVar;
        this.f11801l = cVar2;
        this.f11802m = iVar;
        this.f11803n = new tf1.a(null, 1, null);
        this.f11804o = new ObservableInt(cVar.c(ek.e.EQ_CONTROL_ENHANCED_ICON));
        this.f11805p = new ObservableInt(cVar.c(ek.e.EQ_CONTROL_BASS_BOOST_ICON));
        this.f11806q = new ObservableInt(cVar.c(ek.e.EQ_CONTROL_NEUTRAL_ICON));
        this.f11807r = new n<>(b.C0313b.f11816i);
        this.f11808s = new gz1.b();
    }

    @Override // androidx.lifecycle.m
    public final void g(LifecycleOwner lifecycleOwner, Lifecycle.a aVar) {
        int i13 = c.f11819a[aVar.ordinal()];
        gz1.b bVar = this.f11808s;
        if (i13 != 1) {
            if (i13 != 2) {
                return;
            }
            bVar.e();
            return;
        }
        e0 e0Var = e0.f76037a;
        rz1.l p13 = cd.b.p(this.e.a());
        rz1.r a13 = this.f11798i.a();
        rz1.r rVar = this.f11799j.f42357i;
        r<fp.b> a14 = this.f11801l.a();
        i iVar = new i(this, 0);
        e0Var.getClass();
        zb.z(bVar, e0.b(this.d, p13, a13, rVar, a14, iVar).S(c02.a.f10004c).H(fz1.a.a()).N());
        vj.h hVar = this.f11795f;
        if (hVar.f84328a.getBoolean("sound_control_about_shown", false)) {
            return;
        }
        f fVar = (f) this.f11803n.getValue(this, f11793u[0]);
        if (fVar != null) {
            fVar.w();
        }
        hVar.f84328a.putBoolean("sound_control_about_shown", true);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcn/j$a;", "", "<init>", "()V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0010\u0011\u0012\u0013BS\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0001\u0004\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcn/j$b;", "", "Lcom/dyson/mobile/android/localisation/LocalisationKey;", "title", "description", "", "icon", "", "labelsEnabled", "Lat0/l;", "enhancedButtonState", "bassBoostButtonState", "neutralButtonState", "buttonsImportantForAccessibility", "<init>", "(Lcom/dyson/mobile/android/localisation/LocalisationKey;Lcom/dyson/mobile/android/localisation/LocalisationKey;IZLat0/l;Lat0/l;Lat0/l;I)V", "c", "a", "d", "b", "Lcn/j$b$a;", "Lcn/j$b$b;", "Lcn/j$b$c;", "Lcn/j$b$d;", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        public final LocalisationKey f11809a;

        /* renamed from: b  reason: collision with root package name */
        public final LocalisationKey f11810b;

        /* renamed from: c  reason: collision with root package name */
        public final int f11811c;
        public final boolean d;
        public final at0.l e;

        /* renamed from: f  reason: collision with root package name */
        public final at0.l f11812f;

        /* renamed from: g  reason: collision with root package name */
        public final at0.l f11813g;

        /* renamed from: h  reason: collision with root package name */
        public final int f11814h;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcn/j$b$a;", "Lcn/j$b;", "", "icon", "<init>", "(I)V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class a extends b {

            /* renamed from: i  reason: collision with root package name */
            public final int f11815i;

            static {
                LocalisationKey.a aVar = LocalisationKey.f15077f;
            }

            public a(int i13) {
                super(q.f72506w2, q.f72514x2, i13, false, null, at0.l.SELECTED, null, 0, 216, null);
                this.f11815i = i13;
            }

            @Override // cn.j.b
            public final int a() {
                return this.f11815i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.f11815i == ((a) obj).f11815i;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f11815i);
            }

            public final String toString() {
                return y1.i(this.f11815i, "BassBoost(icon=", ")");
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcn/j$b$b;", "Lcn/j$b;", "<init>", "()V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: cn.j$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0313b extends b {

            /* renamed from: i  reason: collision with root package name */
            public static final C0313b f11816i = new C0313b();

            static {
                LocalisationKey.a aVar = LocalisationKey.f15077f;
            }

            /* JADX WARN: Illegal instructions before constructor call */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private C0313b() {
                /*
                    r10 = this;
                    com.dyson.mobile.android.localisation.LocalisationKey r1 = rf0.q.f72329a
                    com.dyson.mobile.android.localisation.LocalisationKey r2 = rf0.q.f72337b
                    cn.j$a r0 = cn.j.f11792t
                    r0.getClass()
                    int r3 = cn.j.f11794v
                    at0.l r5 = at0.l.DISABLED
                    r8 = 2
                    r9 = 0
                    r4 = 0
                    r6 = r5
                    r7 = r5
                    r0 = r10
                    r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: cn.j.b.C0313b.<init>():void");
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcn/j$b$c;", "Lcn/j$b;", "", "icon", "<init>", "(I)V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class c extends b {

            /* renamed from: i  reason: collision with root package name */
            public final int f11817i;

            static {
                LocalisationKey.a aVar = LocalisationKey.f15077f;
            }

            public c(int i13) {
                super(q.f72490u2, q.f72498v2, i13, false, at0.l.SELECTED, null, null, 0, 232, null);
                this.f11817i = i13;
            }

            @Override // cn.j.b
            public final int a() {
                return this.f11817i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.f11817i == ((c) obj).f11817i;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f11817i);
            }

            public final String toString() {
                return y1.i(this.f11817i, "Enhanced(icon=", ")");
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcn/j$b$d;", "Lcn/j$b;", "", "icon", "<init>", "(I)V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class d extends b {

            /* renamed from: i  reason: collision with root package name */
            public final int f11818i;

            static {
                LocalisationKey.a aVar = LocalisationKey.f15077f;
            }

            public d(int i13) {
                super(q.f72522y2, q.f72530z2, i13, false, null, null, at0.l.SELECTED, 0, 184, null);
                this.f11818i = i13;
            }

            @Override // cn.j.b
            public final int a() {
                return this.f11818i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && this.f11818i == ((d) obj).f11818i;
            }

            public final int hashCode() {
                return Integer.hashCode(this.f11818i);
            }

            public final String toString() {
                return y1.i(this.f11818i, "Neutral(icon=", ")");
            }
        }

        static {
            LocalisationKey.a aVar = LocalisationKey.f15077f;
        }

        public /* synthetic */ b(LocalisationKey localisationKey, LocalisationKey localisationKey2, int i13, boolean z13, at0.l lVar, at0.l lVar2, at0.l lVar3, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
            this(localisationKey, localisationKey2, i13, (i15 & 8) != 0 ? true : z13, (i15 & 16) != 0 ? at0.l.DESELECTED : lVar, (i15 & 32) != 0 ? at0.l.DESELECTED : lVar2, (i15 & 64) != 0 ? at0.l.DESELECTED : lVar3, (i15 & 128) != 0 ? 1 : i14, null);
        }

        public int a() {
            return this.f11811c;
        }

        private b(LocalisationKey localisationKey, LocalisationKey localisationKey2, int i13, boolean z13, at0.l lVar, at0.l lVar2, at0.l lVar3, int i14) {
            this.f11809a = localisationKey;
            this.f11810b = localisationKey2;
            this.f11811c = i13;
            this.d = z13;
            this.e = lVar;
            this.f11812f = lVar2;
            this.f11813g = lVar3;
            this.f11814h = i14;
        }

        public /* synthetic */ b(LocalisationKey localisationKey, LocalisationKey localisationKey2, int i13, boolean z13, at0.l lVar, at0.l lVar2, at0.l lVar3, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this(localisationKey, localisationKey2, i13, z13, lVar, lVar2, lVar3, i14);
        }
    }
}
