package com.dyson.mobile.android.robot.cloud.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import h12.y;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ma.e;
import x12.r;
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001:\u0001 BG\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u001f\u0010\u0012¨\u0006!"}, d2 = {"Lcom/dyson/mobile/android/robot/cloud/model/PersistentMapMetadata;", "Landroid/os/Parcelable;", "", "name", "id", "Ljava/util/Date;", "lastVisited", "", "Lcom/dyson/mobile/android/robot/cloud/model/PersistentMapMetadata$ZoneMetadata;", "zones", "Lcom/dyson/mobile/android/robot/cloud/model/ZoneProperties;", "zoneProperties", "zonesDefinitionLastUpdatedDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "d", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "e", "i", "f", "Ljava/util/Date;", "getLastVisited", "()Ljava/util/Date;", "g", "Ljava/util/List;", "l", "()Ljava/util/List;", "h", "getZoneProperties", "m", "ZoneMetadata", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PersistentMapMetadata implements Parcelable {
    public static final Parcelable.Creator<PersistentMapMetadata> CREATOR = new a();
    @SerializedName("name")
    private final String d;
    @SerializedName("id")
    private final String e;
    @SerializedName("lastVisited")

    /* renamed from: f  reason: collision with root package name */
    private final Date f15939f;
    @SerializedName("zones")

    /* renamed from: g  reason: collision with root package name */
    private final List<ZoneMetadata> f15940g;
    @SerializedName("zoneProperties")

    /* renamed from: h  reason: collision with root package name */
    private final List<ZoneProperties> f15941h;
    @SerializedName("zonesDefinitionLastUpdatedDate")

    /* renamed from: i  reason: collision with root package name */
    private final String f15942i;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/dyson/mobile/android/robot/cloud/model/PersistentMapMetadata$ZoneMetadata;", "Landroid/os/Parcelable;", "", "name", "id", "icon", "", "area", "", "dustMilligrams", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Float;)V", "d", "Ljava/lang/String;", "m", "()Ljava/lang/String;", "e", "l", "f", "k", "g", "Ljava/lang/Double;", "i", "()Ljava/lang/Double;", "h", "Ljava/lang/Float;", "j", "()Ljava/lang/Float;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class ZoneMetadata implements Parcelable {
        public static final Parcelable.Creator<ZoneMetadata> CREATOR = new a();
        @SerializedName("name")
        private final String d;
        @SerializedName("id")
        private final String e;
        @SerializedName("icon")

        /* renamed from: f  reason: collision with root package name */
        private final String f15943f;
        @SerializedName("area")

        /* renamed from: g  reason: collision with root package name */
        private final Double f15944g;
        @SerializedName("dustMiligrams")

        /* renamed from: h  reason: collision with root package name */
        private final Float f15945h;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator<ZoneMetadata> {
            @Override // android.os.Parcelable.Creator
            public final ZoneMetadata createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ZoneMetadata(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final ZoneMetadata[] newArray(int i13) {
                return new ZoneMetadata[i13];
            }
        }

        public ZoneMetadata(String str, String str2, String str3, Double d, Float f13) {
            d72.a.v(str, str2, str3);
            this.d = str;
            this.e = str2;
            this.f15943f = str3;
            this.f15944g = d;
            this.f15945h = f13;
        }

        public static ZoneMetadata a(ZoneMetadata zoneMetadata, Float f13) {
            String str = zoneMetadata.d;
            String str2 = zoneMetadata.e;
            String str3 = zoneMetadata.f15943f;
            Double d = zoneMetadata.f15944g;
            zoneMetadata.getClass();
            str.getClass();
            str2.getClass();
            str3.getClass();
            return new ZoneMetadata(str, str2, str3, d, f13);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ZoneMetadata) {
                ZoneMetadata zoneMetadata = (ZoneMetadata) obj;
                return r.c(this.d, zoneMetadata.d) && r.c(this.e, zoneMetadata.e) && r.c(this.f15943f, zoneMetadata.f15943f) && r.c(this.f15944g, zoneMetadata.f15944g) && r.c(this.f15945h, zoneMetadata.f15945h);
            }
            return false;
        }

        public final int hashCode() {
            int c13 = y.c(y.c(this.d.hashCode() * 31, 31, this.e), 31, this.f15943f);
            Double d = this.f15944g;
            int hashCode = (c13 + (d == null ? 0 : d.hashCode())) * 31;
            Float f13 = this.f15945h;
            return hashCode + (f13 != null ? f13.hashCode() : 0);
        }

        public final Double i() {
            return this.f15944g;
        }

        public final Float j() {
            return this.f15945h;
        }

        public final String k() {
            return this.f15943f;
        }

        public final String l() {
            return this.e;
        }

        public final String m() {
            return this.d;
        }

        public final String toString() {
            String str = this.d;
            String str2 = this.e;
            String str3 = this.f15943f;
            Double d = this.f15944g;
            Float f13 = this.f15945h;
            StringBuilder m13 = e.m("ZoneMetadata(name=", str, ", id=", str2, ", icon=");
            m13.append(str3);
            m13.append(", area=");
            m13.append(d);
            m13.append(", dustMilligrams=");
            m13.append(f13);
            m13.append(")");
            return m13.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeString(this.f15943f);
            Double d = this.f15944g;
            if (d == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeDouble(d.doubleValue());
            }
            Float f13 = this.f15945h;
            if (f13 == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            parcel.writeFloat(f13.floatValue());
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<PersistentMapMetadata> {
        @Override // android.os.Parcelable.Creator
        public final PersistentMapMetadata createFromParcel(Parcel parcel) {
            parcel.getClass();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Date date = (Date) parcel.readSerializable();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i13 = 0;
            int i14 = 0;
            while (i14 != readInt) {
                i14 = d72.a.d(ZoneMetadata.CREATOR, parcel, arrayList, i14, 1);
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            while (i13 != readInt2) {
                i13 = d72.a.d(ZoneProperties.CREATOR, parcel, arrayList2, i13, 1);
            }
            return new PersistentMapMetadata(readString, readString2, date, arrayList, arrayList2, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PersistentMapMetadata[] newArray(int i13) {
            return new PersistentMapMetadata[i13];
        }
    }

    public PersistentMapMetadata(String str, String str2, Date date, List<ZoneMetadata> list, List<ZoneProperties> list2, String str3) {
        str2.getClass();
        date.getClass();
        list.getClass();
        list2.getClass();
        this.d = str;
        this.e = str2;
        this.f15939f = date;
        this.f15940g = list;
        this.f15941h = list2;
        this.f15942i = str3;
    }

    public static PersistentMapMetadata a(PersistentMapMetadata persistentMapMetadata, List list) {
        String str = persistentMapMetadata.d;
        String str2 = persistentMapMetadata.e;
        Date date = persistentMapMetadata.f15939f;
        List<ZoneProperties> list2 = persistentMapMetadata.f15941h;
        String str3 = persistentMapMetadata.f15942i;
        persistentMapMetadata.getClass();
        str2.getClass();
        date.getClass();
        list.getClass();
        list2.getClass();
        return new PersistentMapMetadata(str, str2, date, list, list2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PersistentMapMetadata) {
            PersistentMapMetadata persistentMapMetadata = (PersistentMapMetadata) obj;
            return r.c(this.d, persistentMapMetadata.d) && r.c(this.e, persistentMapMetadata.e) && r.c(this.f15939f, persistentMapMetadata.f15939f) && r.c(this.f15940g, persistentMapMetadata.f15940g) && r.c(this.f15941h, persistentMapMetadata.f15941h) && r.c(this.f15942i, persistentMapMetadata.f15942i);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.d;
        int h13 = tq1.a.h(tq1.a.h((this.f15939f.hashCode() + y.c((str == null ? 0 : str.hashCode()) * 31, 31, this.e)) * 31, 31, this.f15940g), 31, this.f15941h);
        String str2 = this.f15942i;
        return h13 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String i() {
        return this.e;
    }

    public final String j() {
        return this.d;
    }

    public final ZoneProperties k(String str) {
        Object obj;
        str.getClass();
        Iterator<T> it = this.f15941h.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ZoneProperties) obj).i().contains(str)) {
                break;
            }
        }
        return (ZoneProperties) obj;
    }

    public final List<ZoneMetadata> l() {
        return this.f15940g;
    }

    public final String m() {
        return this.f15942i;
    }

    public final boolean n() {
        return !this.f15940g.isEmpty();
    }

    public final String toString() {
        String str = this.d;
        String str2 = this.e;
        Date date = this.f15939f;
        List<ZoneMetadata> list = this.f15940g;
        List<ZoneProperties> list2 = this.f15941h;
        String str3 = this.f15942i;
        StringBuilder m13 = e.m("PersistentMapMetadata(name=", str, ", id=", str2, ", lastVisited=");
        m13.append(date);
        m13.append(", zones=");
        m13.append(list);
        m13.append(", zoneProperties=");
        m13.append(list2);
        m13.append(", zonesDefinitionLastUpdatedDate=");
        m13.append(str3);
        m13.append(")");
        return m13.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeSerializable(this.f15939f);
        Iterator n13 = d72.a.n(this.f15940g, parcel);
        while (n13.hasNext()) {
            ((ZoneMetadata) n13.next()).writeToParcel(parcel, i13);
        }
        Iterator n14 = d72.a.n(this.f15941h, parcel);
        while (n14.hasNext()) {
            ((ZoneProperties) n14.next()).writeToParcel(parcel, i13);
        }
        parcel.writeString(this.f15942i);
    }
}
