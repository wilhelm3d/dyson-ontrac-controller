package com.dyson.mobile.android.robot.faults;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import ma.e;
import x12.r;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/dyson/mobile/android/robot/faults/RobotFaultResolutionStep;", "Landroid/os/Parcelable;", "", "text", "image", "videoId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "d", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "e", "i", "f", "k", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RobotFaultResolutionStep implements Parcelable {
    public static final Parcelable.Creator<RobotFaultResolutionStep> CREATOR = new a();
    @SerializedName("text")
    private final String d;
    @SerializedName("image")
    private final String e;
    @SerializedName("videoId")

    /* renamed from: f  reason: collision with root package name */
    private final String f16031f;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<RobotFaultResolutionStep> {
        @Override // android.os.Parcelable.Creator
        public final RobotFaultResolutionStep createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new RobotFaultResolutionStep(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RobotFaultResolutionStep[] newArray(int i13) {
            return new RobotFaultResolutionStep[i13];
        }
    }

    public RobotFaultResolutionStep(String str, String str2, String str3) {
        this.d = str;
        this.e = str2;
        this.f16031f = str3;
    }

    public static RobotFaultResolutionStep a(RobotFaultResolutionStep robotFaultResolutionStep, String str) {
        return new RobotFaultResolutionStep(str, robotFaultResolutionStep.e, robotFaultResolutionStep.f16031f);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RobotFaultResolutionStep) {
            RobotFaultResolutionStep robotFaultResolutionStep = (RobotFaultResolutionStep) obj;
            return r.c(this.d, robotFaultResolutionStep.d) && r.c(this.e, robotFaultResolutionStep.e) && r.c(this.f16031f, robotFaultResolutionStep.f16031f);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.d;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f16031f;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String i() {
        return this.e;
    }

    public final String j() {
        return this.d;
    }

    public final String k() {
        return this.f16031f;
    }

    public final String toString() {
        String str = this.d;
        String str2 = this.e;
        return ie.a.h(e.m("RobotFaultResolutionStep(text=", str, ", image=", str2, ", videoId="), this.f16031f, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f16031f);
    }
}
