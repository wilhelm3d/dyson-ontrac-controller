package com.dyson.mobile.android.connectionjourney.addbyserial.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import bv1.f;
import h12.e;
import h12.l;
import h12.m;
import h12.n;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t42.b;
import t42.g;
import x12.r;
import x42.a2;
import x42.e0;
import x42.l1;
import x42.o1;
import x42.w1;
import xs.d;
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/addbyserial/navigation/AddBySerialDestination;", "Landroid/os/Parcelable;", "<init>", "()V", "ScanSerialNumber", "ManualSerialNumberEntry", "OwnershipConfirmation", "Lcom/dyson/mobile/android/connectionjourney/addbyserial/navigation/AddBySerialDestination$ManualSerialNumberEntry;", "Lcom/dyson/mobile/android/connectionjourney/addbyserial/navigation/AddBySerialDestination$OwnershipConfirmation;", "Lcom/dyson/mobile/android/connectionjourney/addbyserial/navigation/AddBySerialDestination$ScanSerialNumber;", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class AddBySerialDestination implements Parcelable {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/addbyserial/navigation/AddBySerialDestination$ManualSerialNumberEntry;", "Lcom/dyson/mobile/android/connectionjourney/addbyserial/navigation/AddBySerialDestination;", "<init>", "()V", "Lt42/b;", "serializer", "()Lt42/b;", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes2.dex */
    public static final class ManualSerialNumberEntry extends AddBySerialDestination {
        public static final ManualSerialNumberEntry INSTANCE = new ManualSerialNumberEntry();
        public static final Parcelable.Creator<ManualSerialNumberEntry> CREATOR = new a();
        public static final /* synthetic */ l<b<Object>> d = m.a(n.PUBLICATION, new d(3));

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class a implements Parcelable.Creator<ManualSerialNumberEntry> {
            @Override // android.os.Parcelable.Creator
            public final ManualSerialNumberEntry createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return ManualSerialNumberEntry.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final ManualSerialNumberEntry[] newArray(int i13) {
                return new ManualSerialNumberEntry[i13];
            }
        }

        private ManualSerialNumberEntry() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ManualSerialNumberEntry);
        }

        public final int hashCode() {
            return 1562341058;
        }

        public final b<ManualSerialNumberEntry> serializer() {
            return d.getValue();
        }

        public final String toString() {
            return "ManualSerialNumberEntry";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/addbyserial/navigation/AddBySerialDestination$ScanSerialNumber;", "Lcom/dyson/mobile/android/connectionjourney/addbyserial/navigation/AddBySerialDestination;", "<init>", "()V", "Lt42/b;", "serializer", "()Lt42/b;", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes2.dex */
    public static final class ScanSerialNumber extends AddBySerialDestination {
        public static final ScanSerialNumber INSTANCE = new ScanSerialNumber();
        public static final Parcelable.Creator<ScanSerialNumber> CREATOR = new a();
        public static final /* synthetic */ l<b<Object>> d = m.a(n.PUBLICATION, new d(4));

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class a implements Parcelable.Creator<ScanSerialNumber> {
            @Override // android.os.Parcelable.Creator
            public final ScanSerialNumber createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return ScanSerialNumber.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final ScanSerialNumber[] newArray(int i13) {
                return new ScanSerialNumber[i13];
            }
        }

        private ScanSerialNumber() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ScanSerialNumber);
        }

        public final int hashCode() {
            return 493229831;
        }

        public final b<ScanSerialNumber> serializer() {
            return d.getValue();
        }

        public final String toString() {
            return "ScanSerialNumber";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ AddBySerialDestination(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/addbyserial/navigation/AddBySerialDestination$OwnershipConfirmation;", "Lcom/dyson/mobile/android/connectionjourney/addbyserial/navigation/AddBySerialDestination;", "", "serialNumber", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lx42/w1;", "serializationConstructorMarker", "(ILjava/lang/String;Lx42/w1;)V", "Companion", "a", "b", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes2.dex */
    public static final class OwnershipConfirmation extends AddBySerialDestination {
        public final String d;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<OwnershipConfirmation> CREATOR = new c();

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/dyson/mobile/android/connectionjourney/addbyserial/navigation/AddBySerialDestination.OwnershipConfirmation.$serializer", "Lx42/e0;", "Lcom/dyson/mobile/android/connectionjourney/addbyserial/navigation/AddBySerialDestination$OwnershipConfirmation;", "<init>", "()V", "Lv42/e;", "descriptor", "Lv42/e;", "a", "()Lv42/e;", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @e
        /* loaded from: classes2.dex */
        public static final /* synthetic */ class a implements e0<OwnershipConfirmation> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f13266a;
            private static final v42.e descriptor;

            static {
                a aVar = new a();
                f13266a = aVar;
                o1 o1Var = new o1("com.dyson.mobile.android.connectionjourney.addbyserial.navigation.AddBySerialDestination.OwnershipConfirmation", aVar, 1);
                o1Var.i("serialNumber", false);
                descriptor = o1Var;
            }

            private a() {
            }

            @Override // t42.h, t42.a
            public final v42.e a() {
                return descriptor;
            }

            @Override // t42.a
            public final Object b(w42.e eVar) {
                v42.e eVar2 = descriptor;
                w42.c c13 = eVar.c(eVar2);
                boolean z13 = true;
                int i13 = 0;
                String str = null;
                while (z13) {
                    int w13 = c13.w(eVar2);
                    if (w13 == -1) {
                        z13 = false;
                    } else if (w13 != 0) {
                        jy1.a.q(w13);
                        return null;
                    } else {
                        str = c13.g(eVar2, 0);
                        i13 = 1;
                    }
                }
                c13.a(eVar2);
                return new OwnershipConfirmation(i13, str, null);
            }

            @Override // x42.e0
            public final t42.b<?>[] c() {
                return new t42.b[]{a2.f86824a};
            }

            @Override // t42.h
            public final void d(w42.b bVar, Object obj) {
                OwnershipConfirmation ownershipConfirmation = (OwnershipConfirmation) obj;
                ownershipConfirmation.getClass();
                v42.e eVar = descriptor;
                w42.d c13 = bVar.c(eVar);
                c13.l(eVar, 0, ownershipConfirmation.d);
                c13.a(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class c implements Parcelable.Creator<OwnershipConfirmation> {
            @Override // android.os.Parcelable.Creator
            public final OwnershipConfirmation createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new OwnershipConfirmation(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final OwnershipConfirmation[] newArray(int i13) {
                return new OwnershipConfirmation[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ OwnershipConfirmation(int i13, String str, w1 w1Var) {
            super(null);
            if (1 != (i13 & 1)) {
                l1.g(i13, 1, a.f13266a.a());
                throw null;
            }
            this.d = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OwnershipConfirmation) && r.c(this.d, ((OwnershipConfirmation) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return f.e("OwnershipConfirmation(serialNumber=", this.d, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeString(this.d);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/addbyserial/navigation/AddBySerialDestination$OwnershipConfirmation$b;", "", "<init>", "()V", "Lt42/b;", "Lcom/dyson/mobile/android/connectionjourney/addbyserial/navigation/AddBySerialDestination$OwnershipConfirmation;", "serializer", "()Lt42/b;", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final t42.b<OwnershipConfirmation> serializer() {
                return a.f13266a;
            }

            private b() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OwnershipConfirmation(String str) {
            super(null);
            str.getClass();
            this.d = str;
        }
    }

    private AddBySerialDestination() {
    }
}
