package com.dyson.mobile.android.robot.cloud.model.schedule;

import android.os.Parcel;
import android.os.Parcelable;
import b0.g;
import com.google.gson.annotations.SerializedName;
import h12.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ma.e;
import x12.r;
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/dyson/mobile/android/robot/cloud/model/schedule/RobotScheduleCleaningProgram;", "Landroid/os/Parcelable;", "", "persistentMapId", "zonesDefinitionLastUpdatedDate", "", "Lcom/dyson/mobile/android/robot/cloud/model/schedule/ZoneDescription;", "unorderedZones", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "d", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "e", "k", "f", "Ljava/util/List;", "j", "()Ljava/util/List;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RobotScheduleCleaningProgram implements Parcelable {
    public static final Parcelable.Creator<RobotScheduleCleaningProgram> CREATOR = new a();
    @SerializedName("persistentMapId")
    private final String d;
    @SerializedName("zonesDefinitionLastUpdatedDate")
    private final String e;
    @SerializedName("unorderedZones")

    /* renamed from: f  reason: collision with root package name */
    private final List<ZoneDescription> f15981f;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<RobotScheduleCleaningProgram> {
        @Override // android.os.Parcelable.Creator
        public final RobotScheduleCleaningProgram createFromParcel(Parcel parcel) {
            parcel.getClass();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i13 = 0;
            while (i13 != readInt) {
                i13 = d72.a.d(ZoneDescription.CREATOR, parcel, arrayList, i13, 1);
            }
            return new RobotScheduleCleaningProgram(readString, readString2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final RobotScheduleCleaningProgram[] newArray(int i13) {
            return new RobotScheduleCleaningProgram[i13];
        }
    }

    public RobotScheduleCleaningProgram(String str, String str2, List<ZoneDescription> list) {
        d72.a.x(str, str2, list);
        this.d = str;
        this.e = str2;
        this.f15981f = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RobotScheduleCleaningProgram) {
            RobotScheduleCleaningProgram robotScheduleCleaningProgram = (RobotScheduleCleaningProgram) obj;
            return r.c(this.d, robotScheduleCleaningProgram.d) && r.c(this.e, robotScheduleCleaningProgram.e) && r.c(this.f15981f, robotScheduleCleaningProgram.f15981f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15981f.hashCode() + y.c(this.d.hashCode() * 31, 31, this.e);
    }

    public final String i() {
        return this.d;
    }

    public final List<ZoneDescription> j() {
        return this.f15981f;
    }

    public final String k() {
        return this.e;
    }

    public final String toString() {
        String str = this.d;
        String str2 = this.e;
        return g.k(e.m("RobotScheduleCleaningProgram(persistentMapId=", str, ", zonesDefinitionLastUpdatedDate=", str2, ", unorderedZones="), this.f15981f, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        Iterator n13 = d72.a.n(this.f15981f, parcel);
        while (n13.hasNext()) {
            ((ZoneDescription) n13.next()).writeToParcel(parcel, i13);
        }
    }
}
