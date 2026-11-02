package com.dyson.mobile.android.connectionjourney.nonconnected.scanserial;

import com.dyson.mobile.android.machinetype.MachineDescriptor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x12.r;
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/nonconnected/scanserial/a;", "", "<init>", "()V", "d", "c", "e", "f", "a", "g", "b", "Lcom/dyson/mobile/android/connectionjourney/nonconnected/scanserial/a$a;", "Lcom/dyson/mobile/android/connectionjourney/nonconnected/scanserial/a$b;", "Lcom/dyson/mobile/android/connectionjourney/nonconnected/scanserial/a$c;", "Lcom/dyson/mobile/android/connectionjourney/nonconnected/scanserial/a$d;", "Lcom/dyson/mobile/android/connectionjourney/nonconnected/scanserial/a$e;", "Lcom/dyson/mobile/android/connectionjourney/nonconnected/scanserial/a$f;", "Lcom/dyson/mobile/android/connectionjourney/nonconnected/scanserial/a$g;", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class a {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/nonconnected/scanserial/a$a;", "Lcom/dyson/mobile/android/connectionjourney/nonconnected/scanserial/a;", "<init>", "()V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.connectionjourney.nonconnected.scanserial.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0438a extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0438a f13718a = new C0438a();

        private C0438a() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0438a);
        }

        public final int hashCode() {
            return -1227193702;
        }

        public final String toString() {
            return "CantFindSerial";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/nonconnected/scanserial/a$b;", "Lcom/dyson/mobile/android/connectionjourney/nonconnected/scanserial/a;", "<init>", "()V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f13719a = new b();

        private b() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1956136680;
        }

        public final String toString() {
            return "CloseClicked";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/nonconnected/scanserial/a$d;", "Lcom/dyson/mobile/android/connectionjourney/nonconnected/scanserial/a;", "", "serialNumber", "Lcom/dyson/mobile/android/machinetype/MachineDescriptor;", "machineDescriptor", "<init>", "(Ljava/lang/String;Lcom/dyson/mobile/android/machinetype/MachineDescriptor;)V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class d extends a {

        /* renamed from: a  reason: collision with root package name */
        public final String f13722a;

        /* renamed from: b  reason: collision with root package name */
        public final MachineDescriptor f13723b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, MachineDescriptor machineDescriptor) {
            super(null);
            str.getClass();
            machineDescriptor.getClass();
            this.f13722a = str;
            this.f13723b = machineDescriptor;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return r.c(this.f13722a, dVar.f13722a) && r.c(this.f13723b, dVar.f13723b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f13723b.hashCode() + (this.f13722a.hashCode() * 31);
        }

        public final String toString() {
            return "ContinueNonConnected(serialNumber=" + this.f13722a + ", machineDescriptor=" + this.f13723b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/nonconnected/scanserial/a$e;", "Lcom/dyson/mobile/android/connectionjourney/nonconnected/scanserial/a;", "<init>", "()V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class e extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final e f13724a = new e();

        private e() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 2041169330;
        }

        public final String toString() {
            return "ContinueToBarcodeNotScanned";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/nonconnected/scanserial/a$f;", "Lcom/dyson/mobile/android/connectionjourney/nonconnected/scanserial/a;", "<init>", "()V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class f extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final f f13725a = new f();

        private f() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -512851786;
        }

        public final String toString() {
            return "EnterSerialManually";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/nonconnected/scanserial/a$g;", "Lcom/dyson/mobile/android/connectionjourney/nonconnected/scanserial/a;", "<init>", "()V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class g extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final g f13726a = new g();

        private g() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 1474686159;
        }

        public final String toString() {
            return "RefreshScan";
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private a() {
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/nonconnected/scanserial/a$c;", "Lcom/dyson/mobile/android/connectionjourney/nonconnected/scanserial/a;", "Lcom/dyson/mobile/android/machinetype/MachineDescriptor;", "machineDescriptor", "", "isHaircare", "<init>", "(Lcom/dyson/mobile/android/machinetype/MachineDescriptor;Z)V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c extends a {

        /* renamed from: a  reason: collision with root package name */
        public final MachineDescriptor f13720a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f13721b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(MachineDescriptor machineDescriptor, boolean z13) {
            super(null);
            machineDescriptor.getClass();
            this.f13720a = machineDescriptor;
            this.f13721b = z13;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return r.c(this.f13720a, cVar.f13720a) && this.f13721b == cVar.f13721b;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f13721b) + (this.f13720a.hashCode() * 31);
        }

        public final String toString() {
            return "ContinueConnected(machineDescriptor=" + this.f13720a + ", isHaircare=" + this.f13721b + ")";
        }

        public /* synthetic */ c(MachineDescriptor machineDescriptor, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(machineDescriptor, (i13 & 2) != 0 ? false : z13);
        }
    }
}
