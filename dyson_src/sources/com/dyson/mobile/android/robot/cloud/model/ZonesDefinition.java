package com.dyson.mobile.android.robot.cloud.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.brightcove.player.captioning.TTMLParser;
import com.dyson.mobile.android.robot.cloud.model.PersistentMapMetadata;
import com.google.gson.annotations.SerializedName;
import h12.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ky0.d;
import qv1.s;
import x12.r;
import y9.w;
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001:\u0002-.B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\t¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010(\u001a\u0004\b)\u0010*R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010%\u001a\u0004\b+\u0010'R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010%\u001a\u0004\b,\u0010'¨\u0006/"}, d2 = {"Lcom/dyson/mobile/android/robot/cloud/model/ZonesDefinition;", "Landroid/os/Parcelable;", "", "persistentMapVersion", "", "persistentMapName", "persistentMapDisplayOrientation", "Lcom/dyson/mobile/android/robot/cloud/model/MapPosition;", "persistentMapOffset", "", "Lcom/dyson/mobile/android/robot/cloud/model/ZonesDefinition$ZoneThreshold;", "thresholds", "Lcom/dyson/mobile/android/robot/cloud/model/MapDataGrid;", "zonesMap", "Lcom/dyson/mobile/android/robot/cloud/model/PersistentMapMetadata$ZoneMetadata;", "zones", "Lcom/dyson/mobile/android/robot/cloud/model/ZoneProperties;", "zoneProperties", "<init>", "(ILjava/lang/String;Ljava/lang/Integer;Lcom/dyson/mobile/android/robot/cloud/model/MapPosition;Ljava/util/List;Lcom/dyson/mobile/android/robot/cloud/model/MapDataGrid;Ljava/util/List;Ljava/util/List;)V", "d", "I", "getPersistentMapVersion", "()I", "e", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "f", "Ljava/lang/Integer;", "i", "()Ljava/lang/Integer;", "g", "Lcom/dyson/mobile/android/robot/cloud/model/MapPosition;", "k", "()Lcom/dyson/mobile/android/robot/cloud/model/MapPosition;", "h", "Ljava/util/List;", "l", "()Ljava/util/List;", "Lcom/dyson/mobile/android/robot/cloud/model/MapDataGrid;", TTMLParser.Tags.CAPTION, "()Lcom/dyson/mobile/android/robot/cloud/model/MapDataGrid;", "n", "m", "ZoneThreshold", "ZonesBehaviours", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ZonesDefinition implements Parcelable {
    public static final Parcelable.Creator<ZonesDefinition> CREATOR = new a();
    @SerializedName("persistentMapVersion")
    private final int d;
    @SerializedName("persistentMapName")
    private final String e;
    @SerializedName("persistentMapDisplayOrientation")

    /* renamed from: f  reason: collision with root package name */
    private final Integer f15956f;
    @SerializedName("persistentMapOffset")

    /* renamed from: g  reason: collision with root package name */
    private final MapPosition f15957g;
    @SerializedName("thresholds")

    /* renamed from: h  reason: collision with root package name */
    private final List<ZoneThreshold> f15958h;
    @SerializedName("zonesMap")

    /* renamed from: i  reason: collision with root package name */
    private final MapDataGrid f15959i;
    @SerializedName("zones")

    /* renamed from: j  reason: collision with root package name */
    private final List<PersistentMapMetadata.ZoneMetadata> f15960j;
    @SerializedName("zoneProperties")

    /* renamed from: k  reason: collision with root package name */
    private final List<ZoneProperties> f15961k;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u000fR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/dyson/mobile/android/robot/cloud/model/ZonesDefinition$ZoneThreshold;", "Landroid/os/Parcelable;", "", "startX", "startY", "endX", "endY", "", "leftZone", "rightZone", "<init>", "(IIIILjava/lang/String;Ljava/lang/String;)V", "d", "I", "m", "()I", "e", "n", "f", "i", "g", "j", "h", "Ljava/lang/String;", "k", "()Ljava/lang/String;", "l", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class ZoneThreshold implements Parcelable {
        public static final Parcelable.Creator<ZoneThreshold> CREATOR = new a();
        @SerializedName("startX")
        private final int d;
        @SerializedName("startY")
        private final int e;
        @SerializedName("endX")

        /* renamed from: f  reason: collision with root package name */
        private final int f15962f;
        @SerializedName("endY")

        /* renamed from: g  reason: collision with root package name */
        private final int f15963g;
        @SerializedName("leftZone")

        /* renamed from: h  reason: collision with root package name */
        private final String f15964h;
        @SerializedName("rightZone")

        /* renamed from: i  reason: collision with root package name */
        private final String f15965i;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator<ZoneThreshold> {
            @Override // android.os.Parcelable.Creator
            public final ZoneThreshold createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ZoneThreshold(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ZoneThreshold[] newArray(int i13) {
                return new ZoneThreshold[i13];
            }
        }

        public ZoneThreshold(int i13, int i14, int i15, int i16, String str, String str2) {
            str.getClass();
            str2.getClass();
            this.d = i13;
            this.e = i14;
            this.f15962f = i15;
            this.f15963g = i16;
            this.f15964h = str;
            this.f15965i = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ZoneThreshold) {
                ZoneThreshold zoneThreshold = (ZoneThreshold) obj;
                return this.d == zoneThreshold.d && this.e == zoneThreshold.e && this.f15962f == zoneThreshold.f15962f && this.f15963g == zoneThreshold.f15963g && r.c(this.f15964h, zoneThreshold.f15964h) && r.c(this.f15965i, zoneThreshold.f15965i);
            }
            return false;
        }

        public final int hashCode() {
            return this.f15965i.hashCode() + y.c(w.b(this.f15963g, w.b(this.f15962f, w.b(this.e, Integer.hashCode(this.d) * 31, 31), 31), 31), 31, this.f15964h);
        }

        public final int i() {
            return this.f15962f;
        }

        public final int j() {
            return this.f15963g;
        }

        public final String k() {
            return this.f15964h;
        }

        public final String l() {
            return this.f15965i;
        }

        public final int m() {
            return this.d;
        }

        public final int n() {
            return this.e;
        }

        public final String toString() {
            int i13 = this.d;
            int i14 = this.e;
            int i15 = this.f15962f;
            int i16 = this.f15963g;
            String str = this.f15964h;
            String str2 = this.f15965i;
            StringBuilder k13 = s.k("ZoneThreshold(startX=", i13, ", startY=", i14, ", endX=");
            o1.a.k(i15, i16, ", endY=", ", leftZone=", k13);
            return jy1.a.f(k13, str, ", rightZone=", str2, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeInt(this.d);
            parcel.writeInt(this.e);
            parcel.writeInt(this.f15962f);
            parcel.writeInt(this.f15963g);
            parcel.writeString(this.f15964h);
            parcel.writeString(this.f15965i);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<ZonesDefinition> {
        @Override // android.os.Parcelable.Creator
        public final ZonesDefinition createFromParcel(Parcel parcel) {
            parcel.getClass();
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            MapPosition createFromParcel = MapPosition.CREATOR.createFromParcel(parcel);
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i13 = 0;
            int i14 = 0;
            while (i14 != readInt2) {
                i14 = d72.a.d(ZoneThreshold.CREATOR, parcel, arrayList, i14, 1);
            }
            MapDataGrid createFromParcel2 = MapDataGrid.CREATOR.createFromParcel(parcel);
            int readInt3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt3);
            int i15 = 0;
            while (i15 != readInt3) {
                i15 = d72.a.d(PersistentMapMetadata.ZoneMetadata.CREATOR, parcel, arrayList2, i15, 1);
            }
            int readInt4 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt4);
            while (i13 != readInt4) {
                i13 = d72.a.d(ZoneProperties.CREATOR, parcel, arrayList3, i13, 1);
            }
            return new ZonesDefinition(readInt, readString, valueOf, createFromParcel, arrayList, createFromParcel2, arrayList2, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final ZonesDefinition[] newArray(int i13) {
            return new ZonesDefinition[i13];
        }
    }

    public ZonesDefinition(int i13, String str, Integer num, MapPosition mapPosition, List<ZoneThreshold> list, MapDataGrid mapDataGrid, List<PersistentMapMetadata.ZoneMetadata> list2, List<ZoneProperties> list3) {
        mapPosition.getClass();
        list.getClass();
        mapDataGrid.getClass();
        list2.getClass();
        list3.getClass();
        this.d = i13;
        this.e = str;
        this.f15956f = num;
        this.f15957g = mapPosition;
        this.f15958h = list;
        this.f15959i = mapDataGrid;
        this.f15960j = list2;
        this.f15961k = list3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZonesDefinition) {
            ZonesDefinition zonesDefinition = (ZonesDefinition) obj;
            return this.d == zonesDefinition.d && r.c(this.e, zonesDefinition.e) && r.c(this.f15956f, zonesDefinition.f15956f) && r.c(this.f15957g, zonesDefinition.f15957g) && r.c(this.f15958h, zonesDefinition.f15958h) && r.c(this.f15959i, zonesDefinition.f15959i) && r.c(this.f15960j, zonesDefinition.f15960j) && r.c(this.f15961k, zonesDefinition.f15961k);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.d) * 31;
        String str = this.e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f15956f;
        return this.f15961k.hashCode() + tq1.a.h((this.f15959i.hashCode() + tq1.a.h((this.f15957g.hashCode() + ((hashCode2 + (num != null ? num.hashCode() : 0)) * 31)) * 31, 31, this.f15958h)) * 31, 31, this.f15960j);
    }

    public final Integer i() {
        return this.f15956f;
    }

    public final String j() {
        return this.e;
    }

    public final MapPosition k() {
        return this.f15957g;
    }

    public final List<ZoneThreshold> l() {
        return this.f15958h;
    }

    public final List<ZoneProperties> m() {
        return this.f15961k;
    }

    public final List<PersistentMapMetadata.ZoneMetadata> n() {
        return this.f15960j;
    }

    public final MapDataGrid p() {
        return this.f15959i;
    }

    public final String toString() {
        int i13 = this.d;
        String str = this.e;
        Integer num = this.f15956f;
        MapPosition mapPosition = this.f15957g;
        List<ZoneThreshold> list = this.f15958h;
        MapDataGrid mapDataGrid = this.f15959i;
        List<PersistentMapMetadata.ZoneMetadata> list2 = this.f15960j;
        List<ZoneProperties> list3 = this.f15961k;
        StringBuilder h13 = w.h(i13, "ZonesDefinition(persistentMapVersion=", ", persistentMapName=", str, ", persistentMapDisplayOrientation=");
        h13.append(num);
        h13.append(", persistentMapOffset=");
        h13.append(mapPosition);
        h13.append(", thresholds=");
        h13.append(list);
        h13.append(", zonesMap=");
        h13.append(mapDataGrid);
        h13.append(", zones=");
        h13.append(list2);
        h13.append(", zoneProperties=");
        h13.append(list3);
        h13.append(")");
        return h13.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int intValue;
        parcel.getClass();
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
        Integer num = this.f15956f;
        if (num == null) {
            intValue = 0;
        } else {
            parcel.writeInt(1);
            intValue = num.intValue();
        }
        parcel.writeInt(intValue);
        this.f15957g.writeToParcel(parcel, i13);
        Iterator n13 = d72.a.n(this.f15958h, parcel);
        while (n13.hasNext()) {
            ((ZoneThreshold) n13.next()).writeToParcel(parcel, i13);
        }
        this.f15959i.writeToParcel(parcel, i13);
        Iterator n14 = d72.a.n(this.f15960j, parcel);
        while (n14.hasNext()) {
            ((PersistentMapMetadata.ZoneMetadata) n14.next()).writeToParcel(parcel, i13);
        }
        Iterator n15 = d72.a.n(this.f15961k, parcel);
        while (n15.hasNext()) {
            ((ZoneProperties) n15.next()).writeToParcel(parcel, i13);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001aB7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lcom/dyson/mobile/android/robot/cloud/model/ZonesDefinition$ZonesBehaviours;", "Landroid/os/Parcelable;", "", "noClimb", "", "brushBar", "", "vacuumPowerMode", "Lky0/d;", "_cleaningStrategy", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Lky0/d;)V", "d", "Ljava/lang/Boolean;", "getNoClimb", "()Ljava/lang/Boolean;", "e", "Ljava/lang/String;", "getBrushBar", "()Ljava/lang/String;", "f", "Ljava/lang/Integer;", "j", "()Ljava/lang/Integer;", "g", "Lky0/d;", "a", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class ZonesBehaviours implements Parcelable {
        public static final Parcelable.Creator<ZonesBehaviours> CREATOR;
        @SerializedName("noClimb")
        private final Boolean d;
        @SerializedName("brushBar")
        private final String e;
        @SerializedName("vacuumPowerMode")

        /* renamed from: f  reason: collision with root package name */
        private final Integer f15966f;
        @SerializedName("cleaningStrategy")

        /* renamed from: g  reason: collision with root package name */
        private final d f15967g;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class b implements Parcelable.Creator<ZonesBehaviours> {
            @Override // android.os.Parcelable.Creator
            public final ZonesBehaviours createFromParcel(Parcel parcel) {
                Boolean valueOf;
                parcel.getClass();
                if (parcel.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new ZonesBehaviours(valueOf, parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? d.valueOf(parcel.readString()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final ZonesBehaviours[] newArray(int i13) {
                return new ZonesBehaviours[i13];
            }
        }

        static {
            new a(null);
            CREATOR = new b();
        }

        public /* synthetic */ ZonesBehaviours(Boolean bool, String str, Integer num, d dVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : bool, (i13 & 2) != 0 ? null : str, num, (i13 & 8) != 0 ? null : dVar);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ZonesBehaviours) {
                ZonesBehaviours zonesBehaviours = (ZonesBehaviours) obj;
                return r.c(this.d, zonesBehaviours.d) && r.c(this.e, zonesBehaviours.e) && r.c(this.f15966f, zonesBehaviours.f15966f) && this.f15967g == zonesBehaviours.f15967g;
            }
            return false;
        }

        public final int hashCode() {
            Boolean bool = this.d;
            int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            String str = this.e;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Integer num = this.f15966f;
            int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            d dVar = this.f15967g;
            return hashCode3 + (dVar != null ? dVar.hashCode() : 0);
        }

        public final d i() {
            d dVar = this.f15967g;
            return dVar == null ? d.MIXED : dVar;
        }

        public final Integer j() {
            return this.f15966f;
        }

        public final String toString() {
            Boolean bool = this.d;
            String str = this.e;
            Integer num = this.f15966f;
            d dVar = this.f15967g;
            return "ZonesBehaviours(noClimb=" + bool + ", brushBar=" + str + ", vacuumPowerMode=" + num + ", _cleaningStrategy=" + dVar + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            Boolean bool = this.d;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(bool.booleanValue() ? 1 : 0);
            }
            parcel.writeString(this.e);
            Integer num = this.f15966f;
            if (num == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(num.intValue());
            }
            d dVar = this.f15967g;
            if (dVar == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            parcel.writeString(dVar.name());
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/dyson/mobile/android/robot/cloud/model/ZonesDefinition$ZonesBehaviours$a;", "", "<init>", "()V", "", "BRUSH_BAR_ON", "Ljava/lang/String;", "BRUSH_BAR_OFF", "", "VACUUM_POWER_MODE_OFF", "I", "VACUUM_POWER_MODE_ONE", "VACUUM_POWER_MODE_TWO", "VACUUM_POWER_MODE_THREE", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private a() {
            }
        }

        public ZonesBehaviours(Boolean bool, String str, Integer num, d dVar) {
            this.d = bool;
            this.e = str;
            this.f15966f = num;
            this.f15967g = dVar;
        }
    }
}
