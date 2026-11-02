package com.dyson.mobile.android.audio.bonding;

import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableFloat;
import androidx.databinding.ObservableInt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.m;
import com.dyson.mobile.android.localisation.LocalisationKey;
import com.dyson.mobile.android.machinetype.MachineDefinition;
import hj.e;
import hx.v;
import im1.zb;
import in0.l;
import kotlin.Metadata;
import kz1.b;
import nj.i1;
import nj.j1;
import nj.k1;
import nz1.i;
import nz1.w;
import q8.n;
import rf0.i0;
import sz1.k;
import x12.p0;
import x12.y;
import xh0.d;
import xj.g;
import xj.q;
import xk0.e;
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0011B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/dyson/mobile/android/audio/bonding/a;", "Lfu0/a;", "Landroidx/lifecycle/m;", "Lxj/g;", "bondingProvider", "Lek/c;", "audioDataObject", "Lpf0/c;", "localisationManager", "Lxk0/e;", "machineDefinitionProvider", "Lpm0/a;", "bluetoothAliasManager", "Lhj/e;", "trackingManager", "<init>", "(Lxj/g;Lek/c;Lpf0/c;Lxk0/e;Lpm0/a;Lhj/e;)V", "a", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a implements fu0.a, m {
    public static final /* synthetic */ e22.m<Object>[] G = {p0.f86717a.f(new y(a.class, "navigator", "getNavigator()Lcom/dyson/mobile/android/audio/bonding/BleBondingNavigator;", 0))};
    public final ObservableBoolean A;
    public final n<String> B;
    public final tf1.a C;
    public l D;
    public final gz1.b E;
    public EnumC0338a F;
    public final g d;
    public final ek.c e;

    /* renamed from: f  reason: collision with root package name */
    public final pf0.c f12340f;

    /* renamed from: g  reason: collision with root package name */
    public final e f12341g;

    /* renamed from: h  reason: collision with root package name */
    public final pm0.a f12342h;

    /* renamed from: i  reason: collision with root package name */
    public final hj.e f12343i;

    /* renamed from: j  reason: collision with root package name */
    public final n<String> f12344j;

    /* renamed from: k  reason: collision with root package name */
    public final ObservableBoolean f12345k;

    /* renamed from: l  reason: collision with root package name */
    public final ObservableBoolean f12346l;

    /* renamed from: m  reason: collision with root package name */
    public final ObservableBoolean f12347m;

    /* renamed from: n  reason: collision with root package name */
    public final ObservableBoolean f12348n;

    /* renamed from: o  reason: collision with root package name */
    public final ObservableBoolean f12349o;

    /* renamed from: p  reason: collision with root package name */
    public final ObservableBoolean f12350p;

    /* renamed from: q  reason: collision with root package name */
    public final ObservableBoolean f12351q;

    /* renamed from: r  reason: collision with root package name */
    public final ObservableBoolean f12352r;

    /* renamed from: s  reason: collision with root package name */
    public final ObservableFloat f12353s;

    /* renamed from: t  reason: collision with root package name */
    public final ObservableBoolean f12354t;

    /* renamed from: u  reason: collision with root package name */
    public final ObservableInt f12355u;

    /* renamed from: v  reason: collision with root package name */
    public final n<String> f12356v;

    /* renamed from: w  reason: collision with root package name */
    public final n<String> f12357w;

    /* renamed from: x  reason: collision with root package name */
    public final n<String> f12358x;

    /* renamed from: y  reason: collision with root package name */
    public final n<String> f12359y;

    /* renamed from: z  reason: collision with root package name */
    public final ObservableBoolean f12360z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/audio/bonding/a$a;", "", "<init>", "(Ljava/lang/String;I)V", "BONDING_REQUIRED", "BONDING_COMPLETE", "BONDING_IN_PROGRESS", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.audio.bonding.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class EnumC0338a {
        private static final /* synthetic */ o12.a $ENTRIES;
        private static final /* synthetic */ EnumC0338a[] $VALUES;
        public static final EnumC0338a BONDING_REQUIRED = new EnumC0338a("BONDING_REQUIRED", 0);
        public static final EnumC0338a BONDING_COMPLETE = new EnumC0338a("BONDING_COMPLETE", 1);
        public static final EnumC0338a BONDING_IN_PROGRESS = new EnumC0338a("BONDING_IN_PROGRESS", 2);

        private static final /* synthetic */ EnumC0338a[] $values() {
            return new EnumC0338a[]{BONDING_REQUIRED, BONDING_COMPLETE, BONDING_IN_PROGRESS};
        }

        static {
            EnumC0338a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = v.l($values);
        }

        private EnumC0338a(String str, int i13) {
        }

        public static o12.a<EnumC0338a> getEntries() {
            return $ENTRIES;
        }

        public static EnumC0338a valueOf(String str) {
            return (EnumC0338a) Enum.valueOf(EnumC0338a.class, str);
        }

        public static EnumC0338a[] values() {
            return (EnumC0338a[]) $VALUES.clone();
        }
    }

    /* loaded from: classes2.dex */
    public static final /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f12361a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f12362b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f12363c;

        static {
            int[] iArr = new int[Lifecycle.a.values().length];
            try {
                iArr[Lifecycle.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.a.ON_DESTROY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f12361a = iArr;
            int[] iArr2 = new int[q.values().length];
            try {
                iArr2[q.NOT_STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[q.OTHER_ISSUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[q.COULD_NOT_CONNECT_BLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[q.LINE_IN_PLUGGED_IN.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[q.SOMEONE_ELSE_CONNECTED_BLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[q.FAILED_TO_ESTABLISH_BOND.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[q.NON_AUDIO_BOND_CREATED.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[q.AUDIO_INITIALIZING.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            f12362b = iArr2;
            int[] iArr3 = new int[l.values().length];
            try {
                iArr3[l.INITIAL_AUDIO_PAIRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[l.FIX_AUDIO_PAIRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[l.PAIR_AUDIO_LATER.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            f12363c = iArr3;
        }
    }

    public a(g gVar, ek.c cVar, pf0.c cVar2, e eVar, pm0.a aVar, hj.e eVar2) {
        gVar.getClass();
        cVar.getClass();
        cVar2.getClass();
        eVar.getClass();
        eVar2.getClass();
        this.d = gVar;
        this.e = cVar;
        this.f12340f = cVar2;
        this.f12341g = eVar;
        this.f12342h = aVar;
        this.f12343i = eVar2;
        this.f12344j = new n<>();
        this.f12345k = new ObservableBoolean();
        this.f12346l = new ObservableBoolean();
        this.f12347m = new ObservableBoolean();
        this.f12348n = new ObservableBoolean();
        this.f12349o = new ObservableBoolean();
        this.f12350p = new ObservableBoolean();
        this.f12351q = new ObservableBoolean();
        this.f12352r = new ObservableBoolean(true);
        this.f12353s = new ObservableFloat();
        this.f12354t = new ObservableBoolean();
        this.f12355u = new ObservableInt();
        this.f12356v = new n<>();
        this.f12357w = new n<>();
        this.f12358x = new n<>();
        this.f12359y = new n<>();
        this.f12360z = new ObservableBoolean();
        this.A = new ObservableBoolean();
        this.B = new n<>();
        this.C = new tf1.a(null, 1, null);
        this.D = l.INITIAL_AUDIO_PAIRING;
        this.E = new gz1.b();
        this.F = EnumC0338a.BONDING_REQUIRED;
    }

    @Override // fu0.a
    public final ObservableBoolean D() {
        return this.f12345k;
    }

    @Override // fu0.a
    public final n<String> E() {
        return this.f12357w;
    }

    @Override // fu0.a
    public final ObservableInt G() {
        return this.f12355u;
    }

    @Override // fu0.a
    public final ObservableBoolean K() {
        return this.f12360z;
    }

    @Override // fu0.a
    public final n<String> M() {
        return this.f12359y;
    }

    @Override // fu0.a
    public final void N() {
        EnumC0338a enumC0338a = this.F;
        if (enumC0338a == EnumC0338a.BONDING_COMPLETE) {
            xj.c e = e();
            if (e != null) {
                e.b();
            }
        } else if (enumC0338a == EnumC0338a.BONDING_REQUIRED) {
            w o13 = this.d.b().o(new d(new xj.e(this, 2), 21));
            s70.b bVar = new s70.b(this, 20);
            b.a aVar = kz1.b.f50218a;
            zb.z(this.E, new i(o13, bVar).v());
        }
    }

    @Override // fu0.a
    public final ObservableBoolean P() {
        return this.f12354t;
    }

    @Override // fu0.a
    public final ObservableBoolean Q() {
        return this.f12348n;
    }

    public final void a() {
        this.F = EnumC0338a.BONDING_REQUIRED;
        this.f12355u.l(this.e.c(ek.e.BLE_BONDING));
        int i13 = b.f12363c[this.D.ordinal()];
        n<String> nVar = this.f12358x;
        n<String> nVar2 = this.f12357w;
        pf0.c cVar = this.f12340f;
        if (i13 == 1) {
            nVar2.m(cVar.d(rf0.q.Q));
            nVar.m(cVar.d(rf0.q.R));
        } else if (i13 == 2) {
            nVar2.m(cVar.d(rf0.q.S));
            nVar.m(cVar.d(rf0.q.T));
        } else if (i13 != 3) {
            ma.e.o();
            return;
        } else {
            nVar2.m(cVar.d(rf0.q.Q));
            nVar.m(cVar.d(rf0.q.R));
        }
        this.f12345k.m(true);
        this.f12347m.m(true);
        this.f12349o.m(false);
        this.f12351q.m(false);
        this.f12359y.m(cVar.d(rf0.q.U));
        this.f12360z.m(false);
    }

    public final void b(q qVar) {
        LocalisationKey localisationKey = i0.f71612d9;
        pf0.c cVar = this.f12340f;
        String d = cVar.d(localisationKey);
        String d13 = cVar.d(i0.G8);
        int i13 = b.f12362b[qVar.ordinal()];
        hj.e eVar = this.f12343i;
        switch (i13) {
            case 1:
            case 2:
                break;
            case 3:
                xj.c e = e();
                if (e != null) {
                    e.c(cVar.d(rf0.q.K3), cVar.d(rf0.q.L3), d, d13, new xj.d(this, 4));
                    break;
                }
                break;
            case 4:
                xj.c e13 = e();
                if (e13 != null) {
                    e13.c(cVar.d(rf0.q.Z), cVar.d(rf0.q.f72330a0), cVar.d(i0.Ba), null, new x30.a(22));
                    break;
                }
                break;
            case 5:
                xj.c e14 = e();
                if (e14 != null) {
                    e14.c(cVar.d(rf0.q.I3), cVar.d(rf0.q.J3), d, d13, new xj.d(this, 1));
                    break;
                }
                break;
            case 6:
                xj.c e15 = e();
                if (e15 != null) {
                    e15.c(cVar.d(rf0.q.Z3), cVar.d(rf0.q.J3), d, d13, new xj.d(this, 2));
                    break;
                }
                break;
            case 7:
                xj.c e16 = e();
                if (e16 != null) {
                    e16.c(cVar.d(rf0.q.Z3), cVar.d(rf0.q.f72334a4), d, d13, new xj.d(this, 3));
                    break;
                }
                break;
            case 8:
                i(true);
                int i14 = k1.f57556a;
                ij.b bVar = new ij.b("connection_journey.ble_authentication.audio_bonding_initialising", null, 2, null);
                e.a aVar = hj.e.f38312g;
                eVar.h(bVar, null);
                return;
            default:
                ma.e.o();
                return;
        }
        int i15 = j1.f57539a;
        ij.b bVar2 = new ij.b("connection_journey.ble_authentication.audio_bonding_failure", null, 2, null);
        e.a aVar2 = hj.e.f38312g;
        eVar.h(bVar2, null);
        a();
        this.f12346l.m(false);
        this.f12344j.m(cVar.d(i0.H8));
        this.f12360z.m(true);
    }

    @Override // fu0.a
    public final ObservableBoolean c() {
        return this.f12351q;
    }

    @Override // fu0.a
    public final ObservableBoolean d() {
        return this.f12346l;
    }

    public final xj.c e() {
        return (xj.c) this.C.getValue(this, G[0]);
    }

    @Override // fu0.a
    public final ObservableBoolean f() {
        return this.f12349o;
    }

    @Override // androidx.lifecycle.m
    public final void g(LifecycleOwner lifecycleOwner, Lifecycle.a aVar) {
        int i13 = b.f12361a[aVar.ordinal()];
        gz1.b bVar = this.E;
        if (i13 != 1) {
            if (i13 != 2) {
                return;
            }
            bVar.e();
            return;
        }
        a();
        this.f12346l.m(false);
        this.f12344j.m(this.f12340f.d(i0.S8));
        g gVar = this.d;
        zb.z(bVar, gVar.a().H(fz1.a.a()).t(new d(new xj.e(this, 0), 19)).N());
        sz1.d c13 = gVar.c();
        d dVar = new d(new xj.e(this, 1), 20);
        b.a aVar2 = kz1.b.f50218a;
        bVar.a(new k(c13, dVar).n());
        int i14 = i1.f57523a;
        ij.b bVar2 = new ij.b("connection_journey.ble_authentication.audio_bonding", null, 2, null);
        e.a aVar3 = hj.e.f38312g;
        this.f12343i.h(bVar2, null);
    }

    @Override // fu0.a
    public final ObservableBoolean h() {
        return this.A;
    }

    public final void i(boolean z13) {
        String l13;
        pm0.a aVar;
        MachineDefinition a13 = this.f12341g.a();
        if (a13 != null && (l13 = a13.l()) != null && (aVar = this.f12342h) != null) {
            aVar.c(l13);
        }
        this.F = EnumC0338a.BONDING_COMPLETE;
        n<String> nVar = this.f12358x;
        pf0.c cVar = this.f12340f;
        n<String> nVar2 = this.f12357w;
        if (z13) {
            nVar2.m(cVar.d(rf0.q.X));
            nVar.m(cVar.d(rf0.q.Y));
        } else {
            nVar2.m(cVar.d(rf0.q.W));
            nVar.m(null);
        }
        this.f12345k.m(true);
        this.f12346l.m(false);
        this.f12347m.m(false);
        this.f12344j.m(cVar.d(i0.D8));
        this.f12349o.m(false);
        this.f12351q.m(true);
        this.f12360z.m(false);
    }

    @Override // fu0.a
    public final n<String> l() {
        return this.B;
    }

    @Override // fu0.a
    public final n<String> m() {
        return this.f12358x;
    }

    @Override // fu0.a
    public final ObservableBoolean n() {
        return this.f12350p;
    }

    @Override // fu0.a
    public final n<String> o() {
        return this.f12344j;
    }

    @Override // fu0.a
    public final n<String> q() {
        return this.f12356v;
    }

    @Override // fu0.a
    public final ObservableBoolean t() {
        return this.f12347m;
    }

    @Override // fu0.a
    public final ObservableBoolean x() {
        return this.f12352r;
    }

    @Override // fu0.a
    public final ObservableFloat y() {
        return this.f12353s;
    }

    @Override // fu0.a
    public final void z() {
        xj.c e = e();
        if (e != null) {
            LocalisationKey localisationKey = rf0.q.Y3;
            pf0.c cVar = this.f12340f;
            e.c(cVar.d(localisationKey), cVar.d(rf0.q.f72342b4), cVar.d(i0.P8), cVar.d(i0.Q8), new xj.d(this, 0));
        }
    }
}
