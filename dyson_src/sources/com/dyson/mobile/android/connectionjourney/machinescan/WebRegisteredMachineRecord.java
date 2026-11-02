package com.dyson.mobile.android.connectionjourney.machinescan;

import android.os.Parcel;
import android.os.Parcelable;
import com.dyson.mobile.android.connectivity.MachineScanRecord;
import com.dyson.mobile.android.machinetype.MachineDescriptor;
import i12.g0;
import java.util.Set;
import kotlin.Metadata;
import u50.o;
import x12.r;
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/machinescan/WebRegisteredMachineRecord;", "Lcom/dyson/mobile/android/connectivity/MachineScanRecord;", "Landroid/os/Parcelable;", "", "serialNumber", "Lcom/dyson/mobile/android/machinetype/MachineDescriptor;", "productDescriptor", "<init>", "(Ljava/lang/String;Lcom/dyson/mobile/android/machinetype/MachineDescriptor;)V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WebRegisteredMachineRecord extends MachineScanRecord implements Parcelable {
    public static final Parcelable.Creator<WebRegisteredMachineRecord> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public final String f13547f;

    /* renamed from: g  reason: collision with root package name */
    public final MachineDescriptor f13548g;

    /* renamed from: h  reason: collision with root package name */
    public final String f13549h;

    /* renamed from: i  reason: collision with root package name */
    public final g0 f13550i;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<WebRegisteredMachineRecord> {
        @Override // android.os.Parcelable.Creator
        public final WebRegisteredMachineRecord createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new WebRegisteredMachineRecord(parcel.readString(), (MachineDescriptor) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final WebRegisteredMachineRecord[] newArray(int i13) {
            return new WebRegisteredMachineRecord[i13];
        }
    }

    public WebRegisteredMachineRecord(String str, MachineDescriptor machineDescriptor) {
        str.getClass();
        machineDescriptor.getClass();
        this.f13547f = str;
        this.f13548g = machineDescriptor;
        this.f13549h = i().getMachineVariant();
        this.f13550i = g0.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WebRegisteredMachineRecord) {
            WebRegisteredMachineRecord webRegisteredMachineRecord = (WebRegisteredMachineRecord) obj;
            return r.c(this.f13547f, webRegisteredMachineRecord.f13547f) && r.c(this.f13548g, webRegisteredMachineRecord.f13548g);
        }
        return false;
    }

    public final int hashCode() {
        return this.f13548g.hashCode() + (this.f13547f.hashCode() * 31);
    }

    @Override // com.dyson.mobile.android.connectivity.MachineScanRecord
    public final String j() {
        return this.f13547f;
    }

    @Override // com.dyson.mobile.android.connectivity.MachineScanRecord
    public final String l() {
        return this.f13549h;
    }

    @Override // com.dyson.mobile.android.connectivity.MachineScanRecord
    public final Set<o> m() {
        return this.f13550i;
    }

    @Override // com.dyson.mobile.android.connectivity.MachineScanRecord
    public final int n() {
        return 0;
    }

    @Override // com.dyson.mobile.android.connectivity.MachineScanRecord
    public final MachineDescriptor p() {
        return this.f13548g;
    }

    @Override // com.dyson.mobile.android.connectivity.MachineScanRecord
    public final String q() {
        return i().getMachineType();
    }

    public final String toString() {
        return "WebRegisteredMachineRecord(serialNumber=" + this.f13547f + ", productDescriptor=" + this.f13548g + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeString(this.f13547f);
        parcel.writeSerializable(this.f13548g);
    }
}
