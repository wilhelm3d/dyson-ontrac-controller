package com.dyson.mobile.android.robot.drawer.controls;

import android.os.Parcel;
import android.os.Parcelable;
import h12.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ma.e;
import q62.n;
import x12.r;
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000bB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/dyson/mobile/android/robot/drawer/controls/MapItem;", "Landroid/os/Parcelable;", "", "id", "name", "zonesDefinitionLastUpdatedDate", "", "Lcom/dyson/mobile/android/robot/drawer/controls/MapItem$Zone;", "zones", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Zone", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MapItem implements Parcelable {
    public static final Parcelable.Creator<MapItem> CREATOR = new a();
    public final String d;
    public final String e;

    /* renamed from: f  reason: collision with root package name */
    public final String f15997f;

    /* renamed from: g  reason: collision with root package name */
    public final List<Zone> f15998g;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/dyson/mobile/android/robot/drawer/controls/MapItem$Zone;", "Landroid/os/Parcelable;", "", "id", "name", "icon", "stateValue", "", "area", "", "dustMilligrams", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Float;)V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Zone implements Parcelable {
        public static final Parcelable.Creator<Zone> CREATOR = new a();
        public final String d;
        public final String e;

        /* renamed from: f  reason: collision with root package name */
        public final String f15999f;

        /* renamed from: g  reason: collision with root package name */
        public final String f16000g;

        /* renamed from: h  reason: collision with root package name */
        public final Double f16001h;

        /* renamed from: i  reason: collision with root package name */
        public final Float f16002i;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator<Zone> {
            @Override // android.os.Parcelable.Creator
            public final Zone createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new Zone(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final Zone[] newArray(int i13) {
                return new Zone[i13];
            }
        }

        public Zone(String str, String str2, String str3, String str4, Double d, Float f13) {
            d72.a.v(str, str2, str3);
            this.d = str;
            this.e = str2;
            this.f15999f = str3;
            this.f16000g = str4;
            this.f16001h = d;
            this.f16002i = f13;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Zone) {
                Zone zone = (Zone) obj;
                return this.d.equals(zone.d) && this.e.equals(zone.e) && this.f15999f.equals(zone.f15999f) && r.c(this.f16000g, zone.f16000g) && r.c(this.f16001h, zone.f16001h) && r.c(this.f16002i, zone.f16002i);
            }
            return false;
        }

        public final int hashCode() {
            int c13 = y.c(y.c(this.d.hashCode() * 31, 31, this.e), 31, this.f15999f);
            String str = this.f16000g;
            int hashCode = (c13 + (str == null ? 0 : str.hashCode())) * 31;
            Double d = this.f16001h;
            int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
            Float f13 = this.f16002i;
            return hashCode2 + (f13 != null ? f13.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder m13 = e.m("Zone(id=", this.d, ", name=", this.e, ", icon=");
            n.o(m13, this.f15999f, ", stateValue=", this.f16000g, ", area=");
            m13.append(this.f16001h);
            m13.append(", dustMilligrams=");
            m13.append(this.f16002i);
            m13.append(")");
            return m13.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeString(this.f15999f);
            parcel.writeString(this.f16000g);
            Double d = this.f16001h;
            if (d == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeDouble(d.doubleValue());
            }
            Float f13 = this.f16002i;
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
    public static final class a implements Parcelable.Creator<MapItem> {
        @Override // android.os.Parcelable.Creator
        public final MapItem createFromParcel(Parcel parcel) {
            parcel.getClass();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i13 = 0;
            while (i13 != readInt) {
                i13 = d72.a.d(Zone.CREATOR, parcel, arrayList, i13, 1);
            }
            return new MapItem(readString, readString2, readString3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MapItem[] newArray(int i13) {
            return new MapItem[i13];
        }
    }

    public MapItem(String str, String str2, String str3, List<Zone> list) {
        d72.a.x(str, str3, list);
        this.d = str;
        this.e = str2;
        this.f15997f = str3;
        this.f15998g = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MapItem) {
            MapItem mapItem = (MapItem) obj;
            return this.d.equals(mapItem.d) && r.c(this.e, mapItem.e) && this.f15997f.equals(mapItem.f15997f) && this.f15998g.equals(mapItem.f15998g);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.d.hashCode() * 31;
        String str = this.e;
        return this.f15998g.hashCode() + y.c((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f15997f);
    }

    public final String toString() {
        StringBuilder m13 = e.m("MapItem(id=", this.d, ", name=", this.e, ", zonesDefinitionLastUpdatedDate=");
        m13.append(this.f15997f);
        m13.append(", zones=");
        m13.append(this.f15998g);
        m13.append(")");
        return m13.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f15997f);
        Iterator n13 = d72.a.n(this.f15998g, parcel);
        while (n13.hasNext()) {
            ((Zone) n13.next()).writeToParcel(parcel, i13);
        }
    }
}
