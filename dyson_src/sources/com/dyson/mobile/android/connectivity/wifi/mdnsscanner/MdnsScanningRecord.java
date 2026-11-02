package com.dyson.mobile.android.connectivity.wifi.mdnsscanner;

import android.os.Parcel;
import android.os.Parcelable;
import com.dyson.mobile.android.connectivity.MachineScanRecord;
import com.dyson.mobile.android.machinetype.MachineCategory;
import com.dyson.mobile.android.machinetype.MachineDescriptor;
import com.google.gson.annotations.SerializedName;
import i12.g0;
import in0.i;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ma.e;
import s70.g;
import u50.o;
import v32.y;
import x12.r;
import y9.w;
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u0014\u0010\u000e\"\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/dyson/mobile/android/connectivity/wifi/mdnsscanner/MdnsScanningRecord;", "Lcom/dyson/mobile/android/connectivity/MachineScanRecord;", "", "machineIdentifierName", "hostname", "", "port", "productNameFromMetadata", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "f", "Ljava/lang/String;", "g", "r", "()Ljava/lang/String;", "h", "I", "u", "()I", "i", "getProductNameFromMetadata", "E", "(Ljava/lang/String;)V", "mod-connectivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MdnsScanningRecord extends MachineScanRecord {
    public static final Parcelable.Creator<MdnsScanningRecord> CREATOR = new a();
    @SerializedName("machineIdentifier")

    /* renamed from: f  reason: collision with root package name */
    private final String f14009f;
    @SerializedName("hostName")

    /* renamed from: g  reason: collision with root package name */
    private final String f14010g;
    @SerializedName("port")

    /* renamed from: h  reason: collision with root package name */
    private final int f14011h;
    @SerializedName("productNameFromMetadata")

    /* renamed from: i  reason: collision with root package name */
    private String f14012i;

    /* renamed from: j  reason: collision with root package name */
    public final String f14013j;

    /* renamed from: k  reason: collision with root package name */
    public final g0 f14014k;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<MdnsScanningRecord> {
        @Override // android.os.Parcelable.Creator
        public final MdnsScanningRecord createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new MdnsScanningRecord(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MdnsScanningRecord[] newArray(int i13) {
            return new MdnsScanningRecord[i13];
        }
    }

    /* loaded from: classes2.dex */
    public static final /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f14015a;

        static {
            int[] iArr = new int[MachineCategory.values().length];
            try {
                iArr[MachineCategory.ROBOT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MachineCategory.EC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f14015a = iArr;
        }
    }

    public MdnsScanningRecord(String str, String str2, int i13, String str3) {
        str.getClass();
        this.f14009f = str;
        this.f14010g = str2;
        this.f14011h = i13;
        this.f14012i = str3;
        this.f14013j = "";
        this.f14014k = g0.d;
    }

    public final void E(String str) {
        this.f14012i = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MdnsScanningRecord) {
            MdnsScanningRecord mdnsScanningRecord = (MdnsScanningRecord) obj;
            return r.c(this.f14009f, mdnsScanningRecord.f14009f) && r.c(this.f14010g, mdnsScanningRecord.f14010g) && this.f14011h == mdnsScanningRecord.f14011h && r.c(this.f14012i, mdnsScanningRecord.f14012i);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f14009f.hashCode() * 31;
        String str = this.f14010g;
        int b13 = w.b(this.f14011h, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.f14012i;
        return b13 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.dyson.mobile.android.connectivity.MachineScanRecord
    public final String j() {
        String str = this.f14009f;
        int i13 = b.f14015a[(str.startsWith("360EYE-") ? MachineCategory.ROBOT : g.b(str) ? MachineCategory.EC : MachineCategory.EC).ordinal()];
        String str2 = this.f14009f;
        if (i13 != 1) {
            if (i13 != 2) {
                return str2;
            }
            return this.f14009f.substring(y.y(str2, "_", 0, false, 6) + 1);
        }
        return v32.w.m(str2, "360EYE-", "", false);
    }

    @Override // com.dyson.mobile.android.connectivity.MachineScanRecord
    public final String l() {
        return this.f14013j;
    }

    @Override // com.dyson.mobile.android.connectivity.MachineScanRecord
    public final Set<o> m() {
        return this.f14014k;
    }

    @Override // com.dyson.mobile.android.connectivity.MachineScanRecord
    public final int n() {
        return 2;
    }

    @Override // com.dyson.mobile.android.connectivity.MachineScanRecord
    public final MachineDescriptor p() {
        String a13 = g.a(this.f14009f);
        a13.getClass();
        String value = i.NO_VARIANT.getValue();
        String str = this.f14009f;
        MachineCategory machineCategory = str.startsWith("360EYE-") ? MachineCategory.ROBOT : g.b(str) ? MachineCategory.EC : MachineCategory.EC;
        machineCategory.getClass();
        return new MachineDescriptor(a13, value, "", null, machineCategory, "", 8, null);
    }

    @Override // com.dyson.mobile.android.connectivity.MachineScanRecord
    public final String q() {
        String a13 = g.a(this.f14009f);
        a13.getClass();
        return a13;
    }

    public final String r() {
        return this.f14010g;
    }

    public final String s() {
        return this.f14009f;
    }

    public final String toString() {
        String str = this.f14009f;
        String str2 = this.f14010g;
        int i13 = this.f14011h;
        String str3 = this.f14012i;
        StringBuilder m13 = e.m("MdnsScanningRecord(machineIdentifierName=", str, ", hostname=", str2, ", port=");
        m13.append(i13);
        m13.append(", productNameFromMetadata=");
        m13.append(str3);
        m13.append(")");
        return m13.toString();
    }

    public final int u() {
        return this.f14011h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeString(this.f14009f);
        parcel.writeString(this.f14010g);
        parcel.writeInt(this.f14011h);
        parcel.writeString(this.f14012i);
    }

    public /* synthetic */ MdnsScanningRecord(String str, String str2, int i13, String str3, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i13, (i14 & 8) != 0 ? null : str3);
    }
}
