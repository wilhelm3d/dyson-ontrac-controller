package com.dyson.mobile.android.robot.cloud.model.schedule;

import android.os.Parcel;
import android.os.Parcelable;
import com.brightcove.player.captioning.TTMLParser;
import com.dyson.mobile.android.schedule.response.ScheduleSettings;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x12.r;
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B7\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/dyson/mobile/android/robot/cloud/model/schedule/RobotScheduleSettings;", "Lcom/dyson/mobile/android/schedule/response/ScheduleSettings;", "Landroid/os/Parcelable;", "", "powerMode", "", "cleaningStrategy", "Lky0/a;", "currentCleaningMode", "Lcom/dyson/mobile/android/robot/cloud/model/schedule/RobotScheduleCleaningProgram;", "cleaningProgram", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Lky0/a;Lcom/dyson/mobile/android/robot/cloud/model/schedule/RobotScheduleCleaningProgram;)V", "d", "Ljava/lang/Integer;", "r", "()Ljava/lang/Integer;", "e", "Ljava/lang/String;", TTMLParser.Tags.CAPTION, "()Ljava/lang/String;", "f", "Lky0/a;", "q", "()Lky0/a;", "g", "Lcom/dyson/mobile/android/robot/cloud/model/schedule/RobotScheduleCleaningProgram;", "n", "()Lcom/dyson/mobile/android/robot/cloud/model/schedule/RobotScheduleCleaningProgram;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RobotScheduleSettings extends ScheduleSettings implements Parcelable {
    public static final Parcelable.Creator<RobotScheduleSettings> CREATOR = new a();
    @SerializedName("powerMode")
    private final Integer d;
    @SerializedName("cleaningStrategy")
    private final String e;
    @SerializedName("currentCleaningMode")

    /* renamed from: f  reason: collision with root package name */
    private final ky0.a f15982f;
    @SerializedName("cleaningProgramme")

    /* renamed from: g  reason: collision with root package name */
    private final RobotScheduleCleaningProgram f15983g;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<RobotScheduleSettings> {
        @Override // android.os.Parcelable.Creator
        public final RobotScheduleSettings createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new RobotScheduleSettings(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() == 0 ? null : ky0.a.valueOf(parcel.readString()), parcel.readInt() != 0 ? RobotScheduleCleaningProgram.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final RobotScheduleSettings[] newArray(int i13) {
            return new RobotScheduleSettings[i13];
        }
    }

    public /* synthetic */ RobotScheduleSettings(Integer num, String str, ky0.a aVar, RobotScheduleCleaningProgram robotScheduleCleaningProgram, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : num, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? null : aVar, (i13 & 8) != 0 ? null : robotScheduleCleaningProgram);
    }

    public static RobotScheduleSettings k(RobotScheduleSettings robotScheduleSettings, Integer num, String str, ky0.a aVar, RobotScheduleCleaningProgram robotScheduleCleaningProgram, int i13) {
        if ((i13 & 1) != 0) {
            num = robotScheduleSettings.d;
        }
        if ((i13 & 2) != 0) {
            str = robotScheduleSettings.e;
        }
        if ((i13 & 4) != 0) {
            aVar = robotScheduleSettings.f15982f;
        }
        if ((i13 & 8) != 0) {
            robotScheduleCleaningProgram = robotScheduleSettings.f15983g;
        }
        robotScheduleSettings.getClass();
        return new RobotScheduleSettings(num, str, aVar, robotScheduleCleaningProgram);
    }

    @Override // com.dyson.mobile.android.schedule.response.ScheduleSettings
    public final Object clone() {
        return k(this, null, null, null, null, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RobotScheduleSettings) {
            RobotScheduleSettings robotScheduleSettings = (RobotScheduleSettings) obj;
            return r.c(this.d, robotScheduleSettings.d) && r.c(this.e, robotScheduleSettings.e) && this.f15982f == robotScheduleSettings.f15982f && r.c(this.f15983g, robotScheduleSettings.f15983g);
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.d;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ky0.a aVar = this.f15982f;
        int hashCode3 = (hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        RobotScheduleCleaningProgram robotScheduleCleaningProgram = this.f15983g;
        return hashCode3 + (robotScheduleCleaningProgram != null ? robotScheduleCleaningProgram.hashCode() : 0);
    }

    @Override // com.dyson.mobile.android.schedule.response.ScheduleSettings
    public final ScheduleSettings i() {
        return k(this, null, null, null, null, 15);
    }

    public final RobotScheduleCleaningProgram n() {
        return this.f15983g;
    }

    public final String p() {
        return this.e;
    }

    public final ky0.a q() {
        return this.f15982f;
    }

    public final Integer r() {
        return this.d;
    }

    public final String toString() {
        Integer num = this.d;
        String str = this.e;
        ky0.a aVar = this.f15982f;
        RobotScheduleCleaningProgram robotScheduleCleaningProgram = this.f15983g;
        return "RobotScheduleSettings(powerMode=" + num + ", cleaningStrategy=" + str + ", currentCleaningMode=" + aVar + ", cleaningProgram=" + robotScheduleCleaningProgram + ")";
    }

    @Override // com.dyson.mobile.android.schedule.response.ScheduleSettings, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        Integer num = this.d;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.e);
        ky0.a aVar = this.f15982f;
        if (aVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(aVar.name());
        }
        RobotScheduleCleaningProgram robotScheduleCleaningProgram = this.f15983g;
        if (robotScheduleCleaningProgram == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        robotScheduleCleaningProgram.writeToParcel(parcel, i13);
    }

    public RobotScheduleSettings(Integer num, String str, ky0.a aVar, RobotScheduleCleaningProgram robotScheduleCleaningProgram) {
        this.d = num;
        this.e = str;
        this.f15982f = aVar;
        this.f15983g = robotScheduleCleaningProgram;
    }

    public RobotScheduleSettings() {
        this(null, null, null, null, 15, null);
    }
}
