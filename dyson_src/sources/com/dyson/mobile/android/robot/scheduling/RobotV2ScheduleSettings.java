package com.dyson.mobile.android.robot.scheduling;

import android.os.Parcel;
import android.os.Parcelable;
import b0.y1;
import com.dyson.mobile.android.robot.cloud.newsystem.response.mapmetadata.MetadataMapZoneData;
import com.dyson.mobile.android.schedule.response.ScheduleSettings;
import com.google.gson.annotations.SerializedName;
import ew0.k;
import h12.m;
import h12.t;
import i12.e0;
import i12.p0;
import i12.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x12.r;
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0013B!\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/dyson/mobile/android/robot/scheduling/RobotV2ScheduleSettings;", "Lcom/dyson/mobile/android/schedule/response/ScheduleSettings;", "Lf61/b;", "Landroid/os/Parcelable;", "", "persistentMapId", "", "Lcom/dyson/mobile/android/robot/cloud/newsystem/response/mapmetadata/MetadataMapZoneData;", "metadataMapZones", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "d", "Ljava/lang/String;", "getPersistentMapId", "()Ljava/lang/String;", "e", "Ljava/util/List;", "n", "()Ljava/util/List;", "a", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RobotV2ScheduleSettings extends ScheduleSettings implements f61.b, Parcelable {
    @SerializedName("persistentMapId")
    private final String d;
    @SerializedName("zones")
    private final List<MetadataMapZoneData> e;

    /* renamed from: f  reason: collision with root package name */
    public final transient t f16662f;

    /* renamed from: g  reason: collision with root package name */
    public static final a f16661g = new a(null);
    public static final Parcelable.Creator<RobotV2ScheduleSettings> CREATOR = new b();

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b implements Parcelable.Creator<RobotV2ScheduleSettings> {
        @Override // android.os.Parcelable.Creator
        public final RobotV2ScheduleSettings createFromParcel(Parcel parcel) {
            parcel.getClass();
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i13 = 0;
            while (i13 != readInt) {
                i13 = d72.a.d(MetadataMapZoneData.CREATOR, parcel, arrayList, i13, 1);
            }
            return new RobotV2ScheduleSettings(readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final RobotV2ScheduleSettings[] newArray(int i13) {
            return new RobotV2ScheduleSettings[i13];
        }
    }

    public RobotV2ScheduleSettings(String str, List<MetadataMapZoneData> list) {
        str.getClass();
        list.getClass();
        this.d = str;
        this.e = list;
        this.f16662f = m.b(new k(this, 6));
    }

    public static LinkedHashMap k(RobotV2ScheduleSettings robotV2ScheduleSettings) {
        List<MetadataMapZoneData> list = robotV2ScheduleSettings.e;
        int b13 = p0.b(u.o(list, 10));
        if (b13 < 16) {
            b13 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(b13);
        for (Object obj : list) {
            linkedHashMap.put(((MetadataMapZoneData) obj).j(), obj);
        }
        return linkedHashMap;
    }

    @Override // com.dyson.mobile.android.schedule.response.ScheduleSettings
    public final Object clone() {
        String str = this.d;
        List<MetadataMapZoneData> list = this.e;
        str.getClass();
        list.getClass();
        return new RobotV2ScheduleSettings(str, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RobotV2ScheduleSettings) {
            RobotV2ScheduleSettings robotV2ScheduleSettings = (RobotV2ScheduleSettings) obj;
            return r.c(this.d, robotV2ScheduleSettings.d) && r.c(this.e, robotV2ScheduleSettings.e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }

    @Override // com.dyson.mobile.android.schedule.response.ScheduleSettings
    public final ScheduleSettings i() {
        String str = this.d;
        List<MetadataMapZoneData> list = this.e;
        str.getClass();
        list.getClass();
        return new RobotV2ScheduleSettings(str, list);
    }

    public final List<MetadataMapZoneData> n() {
        return this.e;
    }

    public final String toString() {
        return y1.k("RobotV2ScheduleSettings(persistentMapId=", this.d, ", metadataMapZones=", ")", this.e);
    }

    @Override // com.dyson.mobile.android.schedule.response.ScheduleSettings, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeString(this.d);
        Iterator n13 = d72.a.n(this.e, parcel);
        while (n13.hasNext()) {
            ((MetadataMapZoneData) n13.next()).writeToParcel(parcel, i13);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/robot/scheduling/RobotV2ScheduleSettings$a;", "", "<init>", "()V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public RobotV2ScheduleSettings() {
        this(null, null, 3, null);
    }

    public RobotV2ScheduleSettings(String str, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? e0.d : list);
    }
}
