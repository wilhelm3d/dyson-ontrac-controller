package com.dyson.mobile.android.machinetype;

import android.os.Parcel;
import android.os.Parcelable;
import com.dyson.mobile.android.machinetype.MachineType;
import com.dyson.mobile.android.machinetype.a;
import h12.y;
import i3.n;
import java.util.List;
import kotlin.Metadata;
import ln0.d;
import x12.r;
import y9.w;
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/dyson/mobile/android/machinetype/MachineDefinition;", "Landroid/os/Parcelable;", "Lcom/dyson/mobile/android/machinetype/MachineSerial;", "machineSerial", "", "machineName", "machineTypeName", "machineVariant", "machineModel", "Lcom/dyson/mobile/android/machinetype/ConnectedConfiguration;", "connectedConfiguration", "", "isSupported", "Lcom/dyson/mobile/android/machinetype/MachineConnectionCategory;", "connectionCategory", "Lcom/dyson/mobile/android/machinetype/MachineCategory;", "machineCategory", "productName", "<init>", "(Lcom/dyson/mobile/android/machinetype/MachineSerial;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/dyson/mobile/android/machinetype/ConnectedConfiguration;ZLcom/dyson/mobile/android/machinetype/MachineConnectionCategory;Lcom/dyson/mobile/android/machinetype/MachineCategory;Ljava/lang/String;)V", "mod-machine-type"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MachineDefinition implements Parcelable {
    public static final Parcelable.Creator<MachineDefinition> CREATOR = new a();
    public final MachineSerial d;
    public final String e;

    /* renamed from: f  reason: collision with root package name */
    public final String f15558f;

    /* renamed from: g  reason: collision with root package name */
    public final String f15559g;

    /* renamed from: h  reason: collision with root package name */
    public final String f15560h;

    /* renamed from: i  reason: collision with root package name */
    public final ConnectedConfiguration f15561i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f15562j;

    /* renamed from: k  reason: collision with root package name */
    public final MachineConnectionCategory f15563k;

    /* renamed from: l  reason: collision with root package name */
    public final MachineCategory f15564l;

    /* renamed from: m  reason: collision with root package name */
    public final String f15565m;

    /* renamed from: n  reason: collision with root package name */
    public final yf1.b f15566n;

    /* renamed from: o  reason: collision with root package name */
    public final com.dyson.mobile.android.machinetype.a f15567o;

    /* renamed from: p  reason: collision with root package name */
    public final MachineType f15568p;

    /* renamed from: q  reason: collision with root package name */
    public final MachineDescriptor f15569q;

    /* renamed from: r  reason: collision with root package name */
    public final boolean f15570r;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<MachineDefinition> {
        @Override // android.os.Parcelable.Creator
        public final MachineDefinition createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new MachineDefinition(MachineSerial.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : ConnectedConfiguration.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, MachineConnectionCategory.valueOf(parcel.readString()), MachineCategory.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MachineDefinition[] newArray(int i13) {
            return new MachineDefinition[i13];
        }
    }

    public MachineDefinition(MachineSerial machineSerial, String str, String str2, String str3, String str4, ConnectedConfiguration connectedConfiguration, boolean z13, MachineConnectionCategory machineConnectionCategory, MachineCategory machineCategory, String str5) {
        machineSerial.getClass();
        str2.getClass();
        machineConnectionCategory.getClass();
        machineCategory.getClass();
        str5.getClass();
        this.d = machineSerial;
        this.e = str;
        this.f15558f = str2;
        this.f15559g = str3;
        this.f15560h = str4;
        this.f15561i = connectedConfiguration;
        this.f15562j = z13;
        this.f15563k = machineConnectionCategory;
        this.f15564l = machineCategory;
        this.f15565m = str5;
        String str6 = connectedConfiguration != null ? connectedConfiguration.f15553g : null;
        this.f15566n = d.a(str6 == null ? "" : str6);
        com.dyson.mobile.android.machinetype.a.Companion.getClass();
        this.f15567o = a.C0538a.a(str2);
        MachineType.Companion.getClass();
        MachineType a13 = MachineType.a.a(str2);
        this.f15568p = a13;
        this.f15569q = new MachineDescriptor(a13.getTypeName(), i(), str4 == null ? "" : str4, machineConnectionCategory, machineCategory, null, 32, null);
        this.f15570r = connectedConfiguration != null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MachineDefinition) {
            MachineDefinition machineDefinition = (MachineDefinition) obj;
            return this.d.equals(machineDefinition.d) && r.c(this.e, machineDefinition.e) && this.f15558f.equals(machineDefinition.f15558f) && r.c(this.f15559g, machineDefinition.f15559g) && r.c(this.f15560h, machineDefinition.f15560h) && r.c(this.f15561i, machineDefinition.f15561i) && this.f15562j == machineDefinition.f15562j && this.f15563k == machineDefinition.f15563k && this.f15564l == machineDefinition.f15564l && this.f15565m.equals(machineDefinition.f15565m);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.d.d.hashCode() * 31;
        String str = this.e;
        int c13 = y.c((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f15558f);
        String str2 = this.f15559g;
        int hashCode2 = (c13 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f15560h;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        ConnectedConfiguration connectedConfiguration = this.f15561i;
        int c14 = w.c((hashCode3 + (connectedConfiguration != null ? connectedConfiguration.hashCode() : 0)) * 31, 31, this.f15562j);
        return this.f15565m.hashCode() + ((this.f15564l.hashCode() + ((this.f15563k.hashCode() + c14) * 31)) * 31);
    }

    public final String i() {
        String str = this.f15559g;
        if (str == null) {
            str = "";
        }
        String str2 = this.f15560h;
        return n.n(this.f15558f, str, str2 != null ? str2 : "");
    }

    public final String j() {
        String str = this.e;
        str = (str == null || v32.y.A(str)) ? null : null;
        return str == null ? this.f15565m : str;
    }

    public final String k() {
        String str;
        ConnectedConfiguration connectedConfiguration = this.f15561i;
        return (connectedConfiguration == null || (str = connectedConfiguration.f15552f) == null) ? this.f15568p.getTypeName() : str;
    }

    public final String l() {
        String str = this.e;
        if (str == null || v32.y.A(str) || str.equals(this.f15565m)) {
            return null;
        }
        return str;
    }

    public final boolean m(String str) {
        List<String> list;
        str.getClass();
        ConnectedConfiguration connectedConfiguration = this.f15561i;
        if (connectedConfiguration == null || (list = connectedConfiguration.f15556j) == null) {
            return false;
        }
        return list.contains(str);
    }

    public final boolean n(MachineCategory machineCategory) {
        machineCategory.getClass();
        return this.f15564l == machineCategory;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MachineDefinition(machineSerial=");
        sb2.append(this.d);
        sb2.append(", machineName=");
        sb2.append(this.e);
        sb2.append(", machineTypeName=");
        q62.n.o(sb2, this.f15558f, ", machineVariant=", this.f15559g, ", machineModel=");
        sb2.append(this.f15560h);
        sb2.append(", connectedConfiguration=");
        sb2.append(this.f15561i);
        sb2.append(", isSupported=");
        sb2.append(this.f15562j);
        sb2.append(", connectionCategory=");
        sb2.append(this.f15563k);
        sb2.append(", machineCategory=");
        sb2.append(this.f15564l);
        sb2.append(", productName=");
        sb2.append(this.f15565m);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeString(this.d.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f15558f);
        parcel.writeString(this.f15559g);
        parcel.writeString(this.f15560h);
        ConnectedConfiguration connectedConfiguration = this.f15561i;
        if (connectedConfiguration == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            connectedConfiguration.writeToParcel(parcel, i13);
        }
        parcel.writeInt(this.f15562j ? 1 : 0);
        parcel.writeString(this.f15563k.name());
        parcel.writeString(this.f15564l.name());
        parcel.writeString(this.f15565m);
    }
}
