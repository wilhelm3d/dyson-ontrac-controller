package com.dyson.mobile.android.connectivity.ble;

import android.os.Parcel;
import android.os.Parcelable;
import com.dyson.mobile.android.connectivity.MachineScanRecord;
import com.google.gson.annotations.SerializedName;
import i12.g0;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q62.n;
import rf0.i0;
import u50.o;
import x12.r;
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001Bm\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\b\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0015R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001e\u0010\u0017R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010\u0017R\u001a\u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u0015\u001a\u0004\b%\u0010\u0017R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010\u0015R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b$\u0010)¨\u0006*"}, d2 = {"Lcom/dyson/mobile/android/connectivity/ble/BleScanningRecord;", "Lcom/dyson/mobile/android/connectivity/MachineScanRecord;", "", "macAddress", "", "rssi", "", "scanRecord", "machineId", "machineTypeName", "machineVariant", "", "isConnectable", "productNameFromMetadata", "machineCategory", "", "Lu50/o;", "productStatusAdvertisements", "<init>", "(Ljava/lang/String;I[BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "f", "Ljava/lang/String;", "r", "()Ljava/lang/String;", "g", "I", "h", "[B", "i", "j", "u", "k", "l", "Z", "E", "()Z", "m", "getProductNameFromMetadata", "n", "o", "Ljava/util/Set;", "()Ljava/util/Set;", "mod-connectivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BleScanningRecord extends MachineScanRecord {
    public static final Parcelable.Creator<BleScanningRecord> CREATOR = new a();
    @SerializedName("MacAddress")

    /* renamed from: f  reason: collision with root package name */
    private final String f13938f;
    @SerializedName("Rssi")

    /* renamed from: g  reason: collision with root package name */
    private final int f13939g;
    @SerializedName("ScanRecord")

    /* renamed from: h  reason: collision with root package name */
    private final byte[] f13940h;
    @SerializedName("MachineId")

    /* renamed from: i  reason: collision with root package name */
    private final String f13941i;
    @SerializedName("MachineModelNumber")

    /* renamed from: j  reason: collision with root package name */
    private final String f13942j;
    @SerializedName("MachineVariant")

    /* renamed from: k  reason: collision with root package name */
    private final String f13943k;
    @SerializedName("IsConnectable")

    /* renamed from: l  reason: collision with root package name */
    private final boolean f13944l;
    @SerializedName("ProductNameFromMetadata")

    /* renamed from: m  reason: collision with root package name */
    private final String f13945m;
    @SerializedName("MachineCategory")

    /* renamed from: n  reason: collision with root package name */
    private final String f13946n;
    @SerializedName("ProductStatus")

    /* renamed from: o  reason: collision with root package name */
    private final Set<o> f13947o;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<BleScanningRecord> {
        @Override // android.os.Parcelable.Creator
        public final BleScanningRecord createFromParcel(Parcel parcel) {
            parcel.getClass();
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            byte[] createByteArray = parcel.createByteArray();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            boolean z13 = parcel.readInt() != 0;
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            int readInt2 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(readInt2);
            for (int i13 = 0; i13 != readInt2; i13++) {
                linkedHashSet.add(o.valueOf(parcel.readString()));
            }
            return new BleScanningRecord(readString, readInt, createByteArray, readString2, readString3, readString4, z13, readString5, readString6, linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final BleScanningRecord[] newArray(int i13) {
            return new BleScanningRecord[i13];
        }
    }

    public BleScanningRecord(String str, int i13, byte[] bArr, String str2, String str3, String str4, boolean z13, String str5, String str6, Set set, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, bArr, str2, str3, str4, (i14 & 64) != 0 ? true : z13, (i14 & 128) != 0 ? null : str5, str6, (i14 & 512) != 0 ? g0.d : set);
    }

    public final boolean E() {
        return this.f13944l;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !BleScanningRecord.class.equals(obj.getClass())) {
            return false;
        }
        BleScanningRecord bleScanningRecord = (BleScanningRecord) obj;
        if (this.f13939g == bleScanningRecord.f13939g && r.c(this.f13938f, bleScanningRecord.f13938f) && Arrays.equals(this.f13940h, bleScanningRecord.f13940h) && r.c(this.f13941i, bleScanningRecord.f13941i) && r.c(this.f13942j, bleScanningRecord.f13942j) && r.c(this.f13943k, bleScanningRecord.f13943k) && this.f13944l == bleScanningRecord.f13944l) {
            String str = this.f13945m;
            if (str == null) {
                str = pf0.f.c(i0.H2);
            }
            String str2 = bleScanningRecord.f13945m;
            if (str2 == null) {
                str2 = pf0.f.c(i0.H2);
            }
            return r.c(str, str2) && r.c(this.f13946n, bleScanningRecord.f13946n) && r.c(this.f13947o, bleScanningRecord.f13947o);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f13938f;
        Integer valueOf = Integer.valueOf(this.f13939g);
        String str2 = this.f13941i;
        String str3 = this.f13942j;
        String str4 = this.f13943k;
        Boolean valueOf2 = Boolean.valueOf(this.f13944l);
        String str5 = this.f13945m;
        if (str5 == null) {
            str5 = pf0.f.c(i0.H2);
        }
        return Arrays.hashCode(this.f13940h) + (Objects.hash(str, valueOf, str2, str3, str4, valueOf2, str5, this.f13946n, this.f13947o) * 31);
    }

    @Override // com.dyson.mobile.android.connectivity.MachineScanRecord
    public final String j() {
        String str = this.f13941i;
        return str == null ? "" : str;
    }

    @Override // com.dyson.mobile.android.connectivity.MachineScanRecord
    public final String l() {
        return this.f13943k;
    }

    @Override // com.dyson.mobile.android.connectivity.MachineScanRecord
    public final Set<o> m() {
        return this.f13947o;
    }

    @Override // com.dyson.mobile.android.connectivity.MachineScanRecord
    public final int n() {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
        if (r9 == null) goto L12;
     */
    @Override // com.dyson.mobile.android.connectivity.MachineScanRecord
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.dyson.mobile.android.machinetype.MachineDescriptor p() {
        /*
            r9 = this;
            java.lang.String r1 = r9.f13942j
            java.lang.String r2 = r9.f13943k
            java.lang.String r0 = r9.f13945m
            if (r0 != 0) goto Le
            com.dyson.mobile.android.localisation.LocalisationKey r0 = rf0.i0.H2
            java.lang.String r0 = pf0.f.c(r0)
        Le:
            r6 = r0
            java.lang.String r9 = r9.f13946n
            if (r9 == 0) goto L21
            com.dyson.mobile.android.machinetype.MachineCategory$a r0 = com.dyson.mobile.android.machinetype.MachineCategory.Companion
            r0.getClass()
            com.dyson.mobile.android.machinetype.MachineCategory r9 = com.dyson.mobile.android.machinetype.MachineCategory.a.a(r9)
            if (r9 != 0) goto L1f
            goto L21
        L1f:
            r5 = r9
            goto L24
        L21:
            com.dyson.mobile.android.machinetype.MachineCategory r9 = com.dyson.mobile.android.machinetype.MachineCategory.EC
            goto L1f
        L24:
            com.dyson.mobile.android.machinetype.MachineDescriptor r0 = new com.dyson.mobile.android.machinetype.MachineDescriptor
            r7 = 12
            r8 = 0
            r3 = 0
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.connectivity.ble.BleScanningRecord.p():com.dyson.mobile.android.machinetype.MachineDescriptor");
    }

    @Override // com.dyson.mobile.android.connectivity.MachineScanRecord
    public final String q() {
        return this.f13942j;
    }

    public final String r() {
        return this.f13938f;
    }

    public final String s() {
        String str = this.f13941i;
        return str == null ? "" : str;
    }

    public final String toString() {
        String str = this.f13938f;
        int i13 = this.f13939g;
        byte[] bArr = this.f13940h;
        String q13 = bArr != null ? u12.a.q(bArr) : null;
        String str2 = this.f13941i;
        String str3 = this.f13942j;
        String str4 = this.f13943k;
        boolean z13 = this.f13944l;
        String str5 = this.f13945m;
        String str6 = this.f13946n;
        Set<o> set = this.f13947o;
        String c13 = str5 == null ? pf0.f.c(i0.H2) : str5;
        String j8 = j();
        String s13 = s();
        String str7 = this.f13943k;
        StringBuilder m13 = b0.g.m(i13, "BleScanningRecord(macAddress='", str, "', rssi=", ", scanRecord=");
        n.o(m13, q13, ", machineId=", str2, ", machineTypeName='");
        n.o(m13, str3, "', machineVariant='", str4, "', isConnectable=");
        m13.append(z13);
        m13.append(", productNameFromMetadata=");
        m13.append(str5);
        m13.append(", machineCategory=");
        m13.append(str6);
        m13.append(", productStatuses=");
        m13.append(set);
        m13.append(", type=1, productName='");
        n.o(m13, c13, "', machineSerial='", j8, "', machineIdentifier='");
        return jy1.a.f(m13, s13, "', machineVariant='", str7, "', )");
    }

    public final String u() {
        return this.f13942j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeString(this.f13938f);
        parcel.writeInt(this.f13939g);
        parcel.writeByteArray(this.f13940h);
        parcel.writeString(this.f13941i);
        parcel.writeString(this.f13942j);
        parcel.writeString(this.f13943k);
        parcel.writeInt(this.f13944l ? 1 : 0);
        parcel.writeString(this.f13945m);
        parcel.writeString(this.f13946n);
        Set<o> set = this.f13947o;
        parcel.writeInt(set.size());
        for (o oVar : set) {
            parcel.writeString(oVar.name());
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BleScanningRecord(String str, int i13, byte[] bArr, String str2, String str3, String str4, boolean z13, String str5) {
        this(str, i13, bArr, str2, str3, str4, z13, null, str5, null, 640, null);
        d72.a.v(str, str3, str4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BleScanningRecord(String str, int i13, byte[] bArr, String str2, String str3, String str4, boolean z13, String str5, String str6) {
        this(str, i13, bArr, str2, str3, str4, z13, str5, str6, null, 512, null);
        d72.a.v(str, str3, str4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BleScanningRecord(String str, int i13, byte[] bArr, String str2, String str3, String str4, boolean z13, String str5, String str6, Set<? extends o> set) {
        str.getClass();
        str3.getClass();
        str4.getClass();
        set.getClass();
        this.f13938f = str;
        this.f13939g = i13;
        this.f13940h = bArr;
        this.f13941i = str2;
        this.f13942j = str3;
        this.f13943k = str4;
        this.f13944l = z13;
        this.f13945m = str5;
        this.f13946n = str6;
        this.f13947o = set;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BleScanningRecord(String str, int i13, byte[] bArr, String str2, String str3, String str4, String str5) {
        this(str, i13, bArr, str2, str3, str4, false, null, str5, null, 704, null);
        d72.a.v(str, str3, str4);
    }
}
