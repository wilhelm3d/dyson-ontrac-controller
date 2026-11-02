package com.dyson.mobile.android.connectionjourney.machineprefixcheck;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.m;
import com.dyson.mobile.android.connectionjourney.store.ConnectionJourneyDataStore;
import com.dyson.mobile.android.machinetype.MachineDescriptor;
import he0.e;
import im1.zb;
import kotlin.Metadata;
import m9.u;
import rl0.c;
import rx1.j;
import y60.d;
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\rB)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/machineprefixcheck/a;", "Lm9/u;", "Landroidx/lifecycle/m;", "Lcom/dyson/mobile/android/connectionjourney/store/ConnectionJourneyDataStore;", "dataStore", "Ly60/b;", "machinePrefixMetadataProvider", "Ly60/d;", "machinePrefixMetadataRepository", "Lf60/u;", "bleDeviceObtainer", "<init>", "(Lcom/dyson/mobile/android/connectionjourney/store/ConnectionJourneyDataStore;Ly60/b;Ly60/d;Lf60/u;)V", "a", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a extends u implements m {
    public final ConnectionJourneyDataStore d;
    public final y60.b e;

    /* renamed from: f  reason: collision with root package name */
    public final d f13529f;

    /* renamed from: g  reason: collision with root package name */
    public final f60.u f13530g;

    /* renamed from: h  reason: collision with root package name */
    public final gz1.b f13531h;

    /* renamed from: i  reason: collision with root package name */
    public final xf1.a<C0425a> f13532i;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/machineprefixcheck/a$a;", "", "", "machineSerial", "Lcom/dyson/mobile/android/machinetype/MachineDescriptor;", "machineDescriptor", "<init>", "(Ljava/lang/String;Lcom/dyson/mobile/android/machinetype/MachineDescriptor;)V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.connectionjourney.machineprefixcheck.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0425a {

        /* renamed from: a  reason: collision with root package name */
        public final String f13533a;

        /* renamed from: b  reason: collision with root package name */
        public final MachineDescriptor f13534b;

        public C0425a(String str, MachineDescriptor machineDescriptor) {
            str.getClass();
            machineDescriptor.getClass();
            this.f13533a = str;
            this.f13534b = machineDescriptor;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0425a) {
                C0425a c0425a = (C0425a) obj;
                return this.f13533a.equals(c0425a.f13533a) && this.f13534b.equals(c0425a.f13534b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f13534b.hashCode() + (this.f13533a.hashCode() * 31);
        }

        public final String toString() {
            return "MachineDetails(machineSerial=" + this.f13533a + ", machineDescriptor=" + this.f13534b + ")";
        }
    }

    /* loaded from: classes2.dex */
    public static final /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f13535a;

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
            f13535a = iArr;
        }
    }

    public a(ConnectionJourneyDataStore connectionJourneyDataStore, y60.b bVar, d dVar, f60.u uVar) {
        connectionJourneyDataStore.getClass();
        bVar.getClass();
        dVar.getClass();
        uVar.getClass();
        this.d = connectionJourneyDataStore;
        this.e = bVar;
        this.f13529f = dVar;
        this.f13530g = uVar;
        this.f13531h = new gz1.b();
        this.f13532i = new xf1.a<>();
    }

    @Override // androidx.lifecycle.m
    public final void g(LifecycleOwner lifecycleOwner, Lifecycle.a aVar) {
        int i13 = b.f13535a[aVar.ordinal()];
        gz1.b bVar = this.f13531h;
        if (i13 == 1) {
            zb.z(bVar, this.f13529f.a().z(c02.a.f10004c).r(fz1.a.a()).m(new c(new j(8), 8)).s().w(new e(this, 29)));
        } else if (i13 != 2) {
        } else {
            bVar.e();
        }
    }
}
