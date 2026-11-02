package com.dyson.mobile.android.robot.cloud.model;

import android.os.Parcel;
import android.os.Parcelable;
import b0.g;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pa.c;
import qv1.s;
import x12.r;
import y9.w;
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001dB-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lcom/dyson/mobile/android/robot/cloud/model/RestrictionsDefinition;", "Landroid/os/Parcelable;", "", "persistentMapId", "", "persistentMapVersion", "Lcom/dyson/mobile/android/robot/cloud/model/MapPosition;", "persistentMapOffset", "", "Lcom/dyson/mobile/android/robot/cloud/model/RestrictionsDefinition$MapRestriction;", "restrictions", "<init>", "(Ljava/lang/String;ILcom/dyson/mobile/android/robot/cloud/model/MapPosition;Ljava/util/List;)V", "d", "Ljava/lang/String;", "getPersistentMapId", "()Ljava/lang/String;", "e", "I", "getPersistentMapVersion", "()I", "f", "Lcom/dyson/mobile/android/robot/cloud/model/MapPosition;", "i", "()Lcom/dyson/mobile/android/robot/cloud/model/MapPosition;", "g", "Ljava/util/List;", "j", "()Ljava/util/List;", "MapRestriction", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RestrictionsDefinition implements Parcelable {
    public static final Parcelable.Creator<RestrictionsDefinition> CREATOR = new a();
    @SerializedName("persistentMapId")
    private final String d;
    @SerializedName("persistentMapVersion")
    private final int e;
    @SerializedName("persistentMapOffset")

    /* renamed from: f  reason: collision with root package name */
    private final MapPosition f15946f;
    @SerializedName("restrictions")

    /* renamed from: g  reason: collision with root package name */
    private final List<MapRestriction> f15947g;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<RestrictionsDefinition> {
        @Override // android.os.Parcelable.Creator
        public final RestrictionsDefinition createFromParcel(Parcel parcel) {
            parcel.getClass();
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            MapPosition createFromParcel = MapPosition.CREATOR.createFromParcel(parcel);
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i13 = 0;
            while (i13 != readInt2) {
                i13 = d72.a.d(MapRestriction.CREATOR, parcel, arrayList, i13, 1);
            }
            return new RestrictionsDefinition(readString, readInt, createFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final RestrictionsDefinition[] newArray(int i13) {
            return new RestrictionsDefinition[i13];
        }
    }

    public RestrictionsDefinition(String str, int i13, MapPosition mapPosition, List<MapRestriction> list) {
        str.getClass();
        mapPosition.getClass();
        list.getClass();
        this.d = str;
        this.e = i13;
        this.f15946f = mapPosition;
        this.f15947g = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RestrictionsDefinition) {
            RestrictionsDefinition restrictionsDefinition = (RestrictionsDefinition) obj;
            return r.c(this.d, restrictionsDefinition.d) && this.e == restrictionsDefinition.e && r.c(this.f15946f, restrictionsDefinition.f15946f) && r.c(this.f15947g, restrictionsDefinition.f15947g);
        }
        return false;
    }

    public final int hashCode() {
        int b13 = w.b(this.e, this.d.hashCode() * 31, 31);
        return this.f15947g.hashCode() + ((this.f15946f.hashCode() + b13) * 31);
    }

    public final MapPosition i() {
        return this.f15946f;
    }

    public final List<MapRestriction> j() {
        return this.f15947g;
    }

    public final String toString() {
        String str = this.d;
        int i13 = this.e;
        MapPosition mapPosition = this.f15946f;
        List<MapRestriction> list = this.f15947g;
        StringBuilder m13 = g.m(i13, "RestrictionsDefinition(persistentMapId=", str, ", persistentMapVersion=", ", persistentMapOffset=");
        m13.append(mapPosition);
        m13.append(", restrictions=");
        m13.append(list);
        m13.append(")");
        return m13.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
        this.f15946f.writeToParcel(parcel, i13);
        Iterator n13 = d72.a.n(this.f15947g, parcel);
        while (n13.hasNext()) {
            ((MapRestriction) n13.next()).writeToParcel(parcel, i13);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\"#BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001e\u001a\u0004\b!\u0010 ¨\u0006$"}, d2 = {"Lcom/dyson/mobile/android/robot/cloud/model/RestrictionsDefinition$MapRestriction;", "Landroid/os/Parcelable;", "", "id", "priority", "", "Lcom/dyson/mobile/android/robot/cloud/model/RestrictionsDefinition$MapRestriction$RestrictionVertex;", "vertices", "Lcom/dyson/mobile/android/robot/cloud/model/RestrictionsDefinition$MapRestriction$RestrictionProperties;", "properties", "", "name", "icon", "<init>", "(IILjava/util/List;Lcom/dyson/mobile/android/robot/cloud/model/RestrictionsDefinition$MapRestriction$RestrictionProperties;Ljava/lang/String;Ljava/lang/String;)V", "d", "I", "i", "()I", "e", "getPriority", "f", "Ljava/util/List;", "l", "()Ljava/util/List;", "g", "Lcom/dyson/mobile/android/robot/cloud/model/RestrictionsDefinition$MapRestriction$RestrictionProperties;", "k", "()Lcom/dyson/mobile/android/robot/cloud/model/RestrictionsDefinition$MapRestriction$RestrictionProperties;", "h", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "getIcon", "RestrictionVertex", "RestrictionProperties", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class MapRestriction implements Parcelable {
        public static final Parcelable.Creator<MapRestriction> CREATOR = new a();
        @SerializedName("id")
        private final int d;
        @SerializedName("priority")
        private final int e;
        @SerializedName("vertices")

        /* renamed from: f  reason: collision with root package name */
        private final List<RestrictionVertex> f15948f;
        @SerializedName("properties")

        /* renamed from: g  reason: collision with root package name */
        private final RestrictionProperties f15949g;
        @SerializedName("name")

        /* renamed from: h  reason: collision with root package name */
        private final String f15950h;
        @SerializedName("icon")

        /* renamed from: i  reason: collision with root package name */
        private final String f15951i;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/dyson/mobile/android/robot/cloud/model/RestrictionsDefinition$MapRestriction$RestrictionVertex;", "Landroid/os/Parcelable;", "", "x", "y", "<init>", "(II)V", "d", "I", "i", "()I", "e", "j", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class RestrictionVertex implements Parcelable {
            public static final Parcelable.Creator<RestrictionVertex> CREATOR = new a();
            @SerializedName("x")
            private final int d;
            @SerializedName("y")
            private final int e;

            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* loaded from: classes3.dex */
            public static final class a implements Parcelable.Creator<RestrictionVertex> {
                @Override // android.os.Parcelable.Creator
                public final RestrictionVertex createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new RestrictionVertex(parcel.readInt(), parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final RestrictionVertex[] newArray(int i13) {
                    return new RestrictionVertex[i13];
                }
            }

            public RestrictionVertex(int i13, int i14) {
                this.d = i13;
                this.e = i14;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof RestrictionVertex) {
                    RestrictionVertex restrictionVertex = (RestrictionVertex) obj;
                    return this.d == restrictionVertex.d && this.e == restrictionVertex.e;
                }
                return false;
            }

            public final int hashCode() {
                return Integer.hashCode(this.e) + (Integer.hashCode(this.d) * 31);
            }

            public final int i() {
                return this.d;
            }

            public final int j() {
                return this.e;
            }

            public final String toString() {
                return c.f("RestrictionVertex(x=", this.d, ", y=", this.e, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i13) {
                parcel.getClass();
                parcel.writeInt(this.d);
                parcel.writeInt(this.e);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator<MapRestriction> {
            @Override // android.os.Parcelable.Creator
            public final MapRestriction createFromParcel(Parcel parcel) {
                parcel.getClass();
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt3);
                int i13 = 0;
                while (i13 != readInt3) {
                    i13 = d72.a.d(RestrictionVertex.CREATOR, parcel, arrayList, i13, 1);
                }
                return new MapRestriction(readInt, readInt2, arrayList, RestrictionProperties.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final MapRestriction[] newArray(int i13) {
                return new MapRestriction[i13];
            }
        }

        public MapRestriction(int i13, int i14, List<RestrictionVertex> list, RestrictionProperties restrictionProperties, String str, String str2) {
            list.getClass();
            restrictionProperties.getClass();
            this.d = i13;
            this.e = i14;
            this.f15948f = list;
            this.f15949g = restrictionProperties;
            this.f15950h = str;
            this.f15951i = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof MapRestriction) {
                MapRestriction mapRestriction = (MapRestriction) obj;
                return this.d == mapRestriction.d && this.e == mapRestriction.e && r.c(this.f15948f, mapRestriction.f15948f) && r.c(this.f15949g, mapRestriction.f15949g) && r.c(this.f15950h, mapRestriction.f15950h) && r.c(this.f15951i, mapRestriction.f15951i);
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = (this.f15949g.hashCode() + tq1.a.h(w.b(this.e, Integer.hashCode(this.d) * 31, 31), 31, this.f15948f)) * 31;
            String str = this.f15950h;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f15951i;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final int i() {
            return this.d;
        }

        public final String j() {
            return this.f15950h;
        }

        public final RestrictionProperties k() {
            return this.f15949g;
        }

        public final List<RestrictionVertex> l() {
            return this.f15948f;
        }

        public final String toString() {
            int i13 = this.d;
            int i14 = this.e;
            List<RestrictionVertex> list = this.f15948f;
            RestrictionProperties restrictionProperties = this.f15949g;
            String str = this.f15950h;
            String str2 = this.f15951i;
            StringBuilder k13 = s.k("MapRestriction(id=", i13, ", priority=", i14, ", vertices=");
            k13.append(list);
            k13.append(", properties=");
            k13.append(restrictionProperties);
            k13.append(", name=");
            return jy1.a.f(k13, str, ", icon=", str2, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeInt(this.d);
            parcel.writeInt(this.e);
            Iterator n13 = d72.a.n(this.f15948f, parcel);
            while (n13.hasNext()) {
                ((RestrictionVertex) n13.next()).writeToParcel(parcel, i13);
            }
            this.f15949g.writeToParcel(parcel, i13);
            parcel.writeString(this.f15950h);
            parcel.writeString(this.f15951i);
        }

        public /* synthetic */ MapRestriction(int i13, int i14, List list, RestrictionProperties restrictionProperties, String str, String str2, int i15, DefaultConstructorMarker defaultConstructorMarker) {
            this(i13, i14, list, restrictionProperties, (i15 & 16) != 0 ? null : str, (i15 & 32) != 0 ? null : str2);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/dyson/mobile/android/robot/cloud/model/RestrictionsDefinition$MapRestriction$RestrictionProperties;", "Landroid/os/Parcelable;", "", "keepOut", "brushBarOff", "noClimb", "lowObjectSensitivity", "", "vacuumPowerMode", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "d", "Ljava/lang/Boolean;", "j", "()Ljava/lang/Boolean;", "e", "i", "f", "l", "g", "k", "h", "Ljava/lang/Integer;", "getVacuumPowerMode", "()Ljava/lang/Integer;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class RestrictionProperties implements Parcelable {
            public static final Parcelable.Creator<RestrictionProperties> CREATOR = new a();
            @SerializedName("keepOut")
            private final Boolean d;
            @SerializedName("brushBarOff")
            private final Boolean e;
            @SerializedName("noClimb")

            /* renamed from: f  reason: collision with root package name */
            private final Boolean f15952f;
            @SerializedName("lowObjectSensitivity")

            /* renamed from: g  reason: collision with root package name */
            private final Boolean f15953g;
            @SerializedName("vacuumPowerMode")

            /* renamed from: h  reason: collision with root package name */
            private final Integer f15954h;

            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* loaded from: classes3.dex */
            public static final class a implements Parcelable.Creator<RestrictionProperties> {
                @Override // android.os.Parcelable.Creator
                public final RestrictionProperties createFromParcel(Parcel parcel) {
                    Boolean valueOf;
                    Boolean valueOf2;
                    Boolean valueOf3;
                    Boolean valueOf4;
                    parcel.getClass();
                    if (parcel.readInt() == 0) {
                        valueOf = null;
                    } else {
                        valueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    if (parcel.readInt() == 0) {
                        valueOf2 = null;
                    } else {
                        valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    if (parcel.readInt() == 0) {
                        valueOf3 = null;
                    } else {
                        valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    if (parcel.readInt() == 0) {
                        valueOf4 = null;
                    } else {
                        valueOf4 = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    return new RestrictionProperties(valueOf, valueOf2, valueOf3, valueOf4, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
                }

                @Override // android.os.Parcelable.Creator
                public final RestrictionProperties[] newArray(int i13) {
                    return new RestrictionProperties[i13];
                }
            }

            public /* synthetic */ RestrictionProperties(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num, int i13, DefaultConstructorMarker defaultConstructorMarker) {
                this((i13 & 1) != 0 ? null : bool, (i13 & 2) != 0 ? null : bool2, (i13 & 4) != 0 ? null : bool3, (i13 & 8) != 0 ? null : bool4, (i13 & 16) != 0 ? null : num);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof RestrictionProperties) {
                    RestrictionProperties restrictionProperties = (RestrictionProperties) obj;
                    return r.c(this.d, restrictionProperties.d) && r.c(this.e, restrictionProperties.e) && r.c(this.f15952f, restrictionProperties.f15952f) && r.c(this.f15953g, restrictionProperties.f15953g) && r.c(this.f15954h, restrictionProperties.f15954h);
                }
                return false;
            }

            public final int hashCode() {
                Boolean bool = this.d;
                int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                Boolean bool2 = this.e;
                int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                Boolean bool3 = this.f15952f;
                int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                Boolean bool4 = this.f15953g;
                int hashCode4 = (hashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
                Integer num = this.f15954h;
                return hashCode4 + (num != null ? num.hashCode() : 0);
            }

            public final Boolean i() {
                return this.e;
            }

            public final Boolean j() {
                return this.d;
            }

            public final Boolean k() {
                return this.f15953g;
            }

            public final Boolean l() {
                return this.f15952f;
            }

            public final String toString() {
                Boolean bool = this.d;
                Boolean bool2 = this.e;
                Boolean bool3 = this.f15952f;
                Boolean bool4 = this.f15953g;
                Integer num = this.f15954h;
                StringBuilder sb2 = new StringBuilder("RestrictionProperties(keepOut=");
                sb2.append(bool);
                sb2.append(", brushBarOff=");
                sb2.append(bool2);
                sb2.append(", noClimb=");
                sb2.append(bool3);
                sb2.append(", lowObjectSensitivity=");
                sb2.append(bool4);
                sb2.append(", vacuumPowerMode=");
                return oi1.s.d(sb2, num, ")");
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
                Boolean bool2 = this.e;
                if (bool2 == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeInt(bool2.booleanValue() ? 1 : 0);
                }
                Boolean bool3 = this.f15952f;
                if (bool3 == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeInt(bool3.booleanValue() ? 1 : 0);
                }
                Boolean bool4 = this.f15953g;
                if (bool4 == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeInt(bool4.booleanValue() ? 1 : 0);
                }
                Integer num = this.f15954h;
                if (num == null) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(1);
                parcel.writeInt(num.intValue());
            }

            public RestrictionProperties(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Integer num) {
                this.d = bool;
                this.e = bool2;
                this.f15952f = bool3;
                this.f15953g = bool4;
                this.f15954h = num;
            }

            public RestrictionProperties() {
                this(null, null, null, null, null, 31, null);
            }
        }
    }
}
