package com.dyson.mobile.android.robot.cloud.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.dyson.mobile.android.robot.cloud.model.ZonesDefinition;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x12.r;
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/dyson/mobile/android/robot/cloud/model/ZoneProperties;", "Landroid/os/Parcelable;", "", "", "zones", "", "keepOut", "Lcom/dyson/mobile/android/robot/cloud/model/ZonesDefinition$ZonesBehaviours;", "zonesBehaviours", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;Lcom/dyson/mobile/android/robot/cloud/model/ZonesDefinition$ZonesBehaviours;)V", "d", "Ljava/util/List;", "i", "()Ljava/util/List;", "e", "Ljava/lang/Boolean;", "getKeepOut", "()Ljava/lang/Boolean;", "f", "Lcom/dyson/mobile/android/robot/cloud/model/ZonesDefinition$ZonesBehaviours;", "j", "()Lcom/dyson/mobile/android/robot/cloud/model/ZonesDefinition$ZonesBehaviours;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ZoneProperties implements Parcelable {
    public static final Parcelable.Creator<ZoneProperties> CREATOR = new a();
    @SerializedName("zones")
    private final List<String> d;
    @SerializedName("keepOut")
    private final Boolean e;
    @SerializedName("zoneBehaviours")

    /* renamed from: f  reason: collision with root package name */
    private final ZonesDefinition.ZonesBehaviours f15955f;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<ZoneProperties> {
        @Override // android.os.Parcelable.Creator
        public final ZoneProperties createFromParcel(Parcel parcel) {
            Boolean valueOf;
            parcel.getClass();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ZoneProperties(createStringArrayList, valueOf, ZonesDefinition.ZonesBehaviours.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final ZoneProperties[] newArray(int i13) {
            return new ZoneProperties[i13];
        }
    }

    public ZoneProperties(List<String> list, Boolean bool, ZonesDefinition.ZonesBehaviours zonesBehaviours) {
        list.getClass();
        zonesBehaviours.getClass();
        this.d = list;
        this.e = bool;
        this.f15955f = zonesBehaviours;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneProperties) {
            ZoneProperties zoneProperties = (ZoneProperties) obj;
            return r.c(this.d, zoneProperties.d) && r.c(this.e, zoneProperties.e) && r.c(this.f15955f, zoneProperties.f15955f);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.d.hashCode() * 31;
        Boolean bool = this.e;
        return this.f15955f.hashCode() + ((hashCode + (bool == null ? 0 : bool.hashCode())) * 31);
    }

    public final List<String> i() {
        return this.d;
    }

    public final ZonesDefinition.ZonesBehaviours j() {
        return this.f15955f;
    }

    public final String toString() {
        List<String> list = this.d;
        Boolean bool = this.e;
        ZonesDefinition.ZonesBehaviours zonesBehaviours = this.f15955f;
        return "ZoneProperties(zones=" + list + ", keepOut=" + bool + ", zonesBehaviours=" + zonesBehaviours + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int i14;
        parcel.getClass();
        parcel.writeStringList(this.d);
        Boolean bool = this.e;
        if (bool == null) {
            i14 = 0;
        } else {
            parcel.writeInt(1);
            i14 = bool.booleanValue();
        }
        parcel.writeInt(i14);
        this.f15955f.writeToParcel(parcel, i13);
    }

    public /* synthetic */ ZoneProperties(List list, Boolean bool, ZonesDefinition.ZonesBehaviours zonesBehaviours, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i13 & 2) != 0 ? null : bool, zonesBehaviours);
    }
}
