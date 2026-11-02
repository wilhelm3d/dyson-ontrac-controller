package com.dyson.mobile.android.connectionjourney.nonconnected.ownership.confirmation;

import android.os.Bundle;
import android.os.Parcelable;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.machinetype.MachineDescriptor;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import y9.m0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/nonconnected/ownership/confirmation/a;", "", "<init>", "()V", "b", "a", "c", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final c f13665a = new c(null);

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/nonconnected/ownership/confirmation/a$a;", "Ly9/m0;", "", "serialNumber", "Lcom/dyson/mobile/android/machinetype/MachineDescriptor;", "machineDescriptor", "<init>", "(Ljava/lang/String;Lcom/dyson/mobile/android/machinetype/MachineDescriptor;)V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.connectionjourney.nonconnected.ownership.confirmation.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0435a implements m0 {

        /* renamed from: a  reason: collision with root package name */
        public final String f13666a;

        /* renamed from: b  reason: collision with root package name */
        public final MachineDescriptor f13667b;

        public C0435a(String str, MachineDescriptor machineDescriptor) {
            str.getClass();
            machineDescriptor.getClass();
            this.f13666a = str;
            this.f13667b = machineDescriptor;
        }

        @Override // y9.m0
        public final int a() {
            return R.id.actionToOwnershipBypass;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0435a) {
                C0435a c0435a = (C0435a) obj;
                return this.f13666a.equals(c0435a.f13666a) && this.f13667b.equals(c0435a.f13667b);
            }
            return false;
        }

        @Override // y9.m0
        public final Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString("serialNumber", this.f13666a);
            boolean isAssignableFrom = Parcelable.class.isAssignableFrom(MachineDescriptor.class);
            MachineDescriptor machineDescriptor = this.f13667b;
            if (isAssignableFrom) {
                bundle.putParcelable("machineDescriptor", (Parcelable) machineDescriptor);
                return bundle;
            } else if (Serializable.class.isAssignableFrom(MachineDescriptor.class)) {
                bundle.putSerializable("machineDescriptor", machineDescriptor);
                return bundle;
            } else {
                ie.a.t(MachineDescriptor.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                return null;
            }
        }

        public final int hashCode() {
            return this.f13667b.hashCode() + (this.f13666a.hashCode() * 31);
        }

        public final String toString() {
            return "ActionToOwnershipBypass(serialNumber=" + this.f13666a + ", machineDescriptor=" + this.f13667b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/nonconnected/ownership/confirmation/a$b;", "Ly9/m0;", "", "serialNumber", "Lcom/dyson/mobile/android/machinetype/MachineDescriptor;", "machineDescriptor", "<init>", "(Ljava/lang/String;Lcom/dyson/mobile/android/machinetype/MachineDescriptor;)V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements m0 {

        /* renamed from: a  reason: collision with root package name */
        public final String f13668a;

        /* renamed from: b  reason: collision with root package name */
        public final MachineDescriptor f13669b;

        public b(String str, MachineDescriptor machineDescriptor) {
            str.getClass();
            machineDescriptor.getClass();
            this.f13668a = str;
            this.f13669b = machineDescriptor;
        }

        @Override // y9.m0
        public final int a() {
            return R.id.actionToOwnershipPurchaseDate;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.f13668a.equals(bVar.f13668a) && this.f13669b.equals(bVar.f13669b);
            }
            return false;
        }

        @Override // y9.m0
        public final Bundle getArguments() {
            Bundle bundle = new Bundle();
            bundle.putString("serialNumber", this.f13668a);
            boolean isAssignableFrom = Parcelable.class.isAssignableFrom(MachineDescriptor.class);
            MachineDescriptor machineDescriptor = this.f13669b;
            if (isAssignableFrom) {
                bundle.putParcelable("machineDescriptor", (Parcelable) machineDescriptor);
                return bundle;
            } else if (Serializable.class.isAssignableFrom(MachineDescriptor.class)) {
                bundle.putSerializable("machineDescriptor", machineDescriptor);
                return bundle;
            } else {
                ie.a.t(MachineDescriptor.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
                return null;
            }
        }

        public final int hashCode() {
            return this.f13669b.hashCode() + (this.f13668a.hashCode() * 31);
        }

        public final String toString() {
            return "ActionToOwnershipPurchaseDate(serialNumber=" + this.f13668a + ", machineDescriptor=" + this.f13669b + ")";
        }
    }

    private a() {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/nonconnected/ownership/confirmation/a$c;", "", "<init>", "()V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }
}
