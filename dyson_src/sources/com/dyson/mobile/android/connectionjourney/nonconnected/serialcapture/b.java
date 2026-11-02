package com.dyson.mobile.android.connectionjourney.nonconnected.serialcapture;

import af1.i;
import androidx.databinding.ObservableBoolean;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.m;
import b30.h;
import com.dyson.mobile.android.connectionjourney.store.ConnectionJourneyDataStore;
import com.dyson.mobile.android.localisation.LocalisationKey;
import com.dyson.mobile.android.machinetype.MachineDescriptor;
import hj.e;
import jz1.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.u;
import nj.l2;
import nj.w2;
import nj.y2;
import q8.n;
import rf0.d0;
import x12.r;
import y9.w;
import yi0.f;
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0011\u0012B9\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/nonconnected/serialcapture/b;", "Lm9/u;", "Landroidx/lifecycle/m;", "Lcom/dyson/mobile/android/connectionjourney/store/ConnectionJourneyDataStore;", "dataStore", "Lyi0/f;", "machineManager", "Lpf0/c;", "localisationManager", "Lhj/e;", "trackingManager", "Lb30/h;", "serialNumberValidator", "Laf1/i;", "dispatcherProvider", "<init>", "(Lcom/dyson/mobile/android/connectionjourney/store/ConnectionJourneyDataStore;Lyi0/f;Lpf0/c;Lhj/e;Lb30/h;Laf1/i;)V", "b", "a", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class b extends u implements m {

    /* renamed from: v  reason: collision with root package name */
    public static final /* synthetic */ int f13750v = 0;
    public final ConnectionJourneyDataStore d;
    public final f e;

    /* renamed from: f  reason: collision with root package name */
    public final pf0.c f13751f;

    /* renamed from: g  reason: collision with root package name */
    public final e f13752g;

    /* renamed from: h  reason: collision with root package name */
    public final h f13753h;

    /* renamed from: i  reason: collision with root package name */
    public final i f13754i;

    /* renamed from: j  reason: collision with root package name */
    public final n<String> f13755j;

    /* renamed from: k  reason: collision with root package name */
    public final n<String> f13756k;

    /* renamed from: l  reason: collision with root package name */
    public final ObservableBoolean f13757l;

    /* renamed from: m  reason: collision with root package name */
    public final ObservableBoolean f13758m;

    /* renamed from: n  reason: collision with root package name */
    public final ObservableBoolean f13759n;

    /* renamed from: o  reason: collision with root package name */
    public final n<String> f13760o;

    /* renamed from: p  reason: collision with root package name */
    public final n<String> f13761p;

    /* renamed from: q  reason: collision with root package name */
    public final ObservableBoolean f13762q;

    /* renamed from: r  reason: collision with root package name */
    public final ObservableBoolean f13763r;

    /* renamed from: s  reason: collision with root package name */
    public final xf1.a<AbstractC0441b> f13764s;

    /* renamed from: t  reason: collision with root package name */
    public pz1.b f13765t;

    /* renamed from: u  reason: collision with root package name */
    public LaunchState f13766u;

    /* loaded from: classes2.dex */
    public static final /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f13772a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f13773b;

        static {
            int[] iArr = new int[LaunchState.values().length];
            try {
                iArr[LaunchState.ENTER_SN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LaunchState.ENTER_SN_AFTER_SCAN_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LaunchState.ENTER_SN_AFTER_INVALID_SN_SCANNED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f13772a = iArr;
            int[] iArr2 = new int[Lifecycle.a.values().length];
            try {
                iArr2[Lifecycle.a.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Lifecycle.a.ON_PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f13773b = iArr2;
        }
    }

    static {
        new a(null);
    }

    public b(ConnectionJourneyDataStore connectionJourneyDataStore, f fVar, pf0.c cVar, e eVar, h hVar, i iVar) {
        connectionJourneyDataStore.getClass();
        fVar.getClass();
        cVar.getClass();
        eVar.getClass();
        hVar.getClass();
        iVar.getClass();
        this.d = connectionJourneyDataStore;
        this.e = fVar;
        this.f13751f = cVar;
        this.f13752g = eVar;
        this.f13753h = hVar;
        this.f13754i = iVar;
        this.f13755j = new n<>(pf0.f.c(d0.f71124j));
        this.f13756k = new n<>(pf0.f.c(d0.f71127m));
        this.f13757l = new ObservableBoolean(false);
        this.f13758m = new ObservableBoolean(false);
        this.f13759n = new ObservableBoolean(false);
        this.f13760o = new n<>("");
        this.f13761p = new n<>("");
        this.f13762q = new ObservableBoolean(false);
        this.f13763r = new ObservableBoolean(false);
        this.f13764s = new xf1.a<>();
    }

    public final void S(LocalisationKey localisationKey) {
        this.f13761p.m(this.f13751f.d(localisationKey));
        this.f13762q.m(true);
        this.f13760o.m("");
        this.f13763r.m(false);
    }

    @Override // androidx.lifecycle.m
    public final void g(LifecycleOwner lifecycleOwner, Lifecycle.a aVar) {
        pz1.b bVar;
        int i13 = c.f13773b[aVar.ordinal()];
        if (i13 != 1) {
            if (i13 == 2 && (bVar = this.f13765t) != null) {
                d.dispose(bVar);
                return;
            }
            return;
        }
        LaunchState launchState = this.f13766u;
        if (launchState == null) {
            r.i("launchState");
            throw null;
        }
        int i14 = c.f13772a[launchState.ordinal()];
        if (i14 == 1) {
            int i15 = l2.f57574a;
            w.t("connection_journey.non_connected_product.input_serial_number", null, 2, null);
        } else if (i14 == 2) {
            int i16 = y2.f57792a;
            w.t("connection_journey.ocr.scan_failed_input_serial", null, 2, null);
        } else if (i14 != 3) {
            ma.e.o();
            return;
        } else {
            int i17 = w2.f57760a;
            w.t("connection_journey.ocr.machine_not_compatible", null, 2, null);
        }
        this.f13765t = this.e.f90155b.i().w().f(new m30.b(new lm0.a(this, 26), 0)).h(kz1.a.d, kz1.a.e, kz1.a.f50215c);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/nonconnected/serialcapture/b$a;", "", "<init>", "()V", "", "SERIAL_NUMBER_CHARS", "I", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/nonconnected/serialcapture/b$b;", "", "<init>", "()V", "b", "a", "c", "Lcom/dyson/mobile/android/connectionjourney/nonconnected/serialcapture/b$b$a;", "Lcom/dyson/mobile/android/connectionjourney/nonconnected/serialcapture/b$b$b;", "Lcom/dyson/mobile/android/connectionjourney/nonconnected/serialcapture/b$b$c;", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.connectionjourney.nonconnected.serialcapture.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC0441b {

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/nonconnected/serialcapture/b$b$b;", "Lcom/dyson/mobile/android/connectionjourney/nonconnected/serialcapture/b$b;", "", "serialNumber", "Lcom/dyson/mobile/android/machinetype/MachineDescriptor;", "machineDescriptor", "<init>", "(Ljava/lang/String;Lcom/dyson/mobile/android/machinetype/MachineDescriptor;)V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.connectionjourney.nonconnected.serialcapture.b$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0442b extends AbstractC0441b {

            /* renamed from: a  reason: collision with root package name */
            public final String f13769a;

            /* renamed from: b  reason: collision with root package name */
            public final MachineDescriptor f13770b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0442b(String str, MachineDescriptor machineDescriptor) {
                super(null);
                str.getClass();
                machineDescriptor.getClass();
                this.f13769a = str;
                this.f13770b = machineDescriptor;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/nonconnected/serialcapture/b$b$c;", "Lcom/dyson/mobile/android/connectionjourney/nonconnected/serialcapture/b$b;", "<init>", "()V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.connectionjourney.nonconnected.serialcapture.b$b$c */
        /* loaded from: classes2.dex */
        public static final class c extends AbstractC0441b {

            /* renamed from: a  reason: collision with root package name */
            public static final c f13771a = new c();

            private c() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -2102711688;
            }

            public final String toString() {
                return "OnWhereIsSerialSelected";
            }
        }

        public /* synthetic */ AbstractC0441b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC0441b() {
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/nonconnected/serialcapture/b$b$a;", "Lcom/dyson/mobile/android/connectionjourney/nonconnected/serialcapture/b$b;", "Lcom/dyson/mobile/android/machinetype/MachineDescriptor;", "machineDescriptor", "", "isHaircare", "<init>", "(Lcom/dyson/mobile/android/machinetype/MachineDescriptor;Z)V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.connectionjourney.nonconnected.serialcapture.b$b$a */
        /* loaded from: classes2.dex */
        public static final class a extends AbstractC0441b {

            /* renamed from: a  reason: collision with root package name */
            public final MachineDescriptor f13767a;

            /* renamed from: b  reason: collision with root package name */
            public final boolean f13768b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(MachineDescriptor machineDescriptor, boolean z13) {
                super(null);
                machineDescriptor.getClass();
                this.f13767a = machineDescriptor;
                this.f13768b = z13;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    return r.c(this.f13767a, aVar.f13767a) && this.f13768b == aVar.f13768b;
                }
                return false;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f13768b) + (this.f13767a.hashCode() * 31);
            }

            public final String toString() {
                return "OnConnectedRoute(machineDescriptor=" + this.f13767a + ", isHaircare=" + this.f13768b + ")";
            }

            public /* synthetic */ a(MachineDescriptor machineDescriptor, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
                this(machineDescriptor, (i13 & 2) != 0 ? false : z13);
            }
        }
    }
}
