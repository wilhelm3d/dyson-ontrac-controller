package com.dyson.mobile.android.robot.cloud.model.schedule;

import android.os.Parcel;
import android.os.Parcelable;
import bv1.f;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import x12.r;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/dyson/mobile/android/robot/cloud/model/schedule/ZoneDescription;", "Landroid/os/Parcelable;", "", "zoneId", "<init>", "(Ljava/lang/String;)V", "d", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ZoneDescription implements Parcelable {
    public static final Parcelable.Creator<ZoneDescription> CREATOR = new a();
    @SerializedName("zoneId")
    private final String d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<ZoneDescription> {
        @Override // android.os.Parcelable.Creator
        public final ZoneDescription createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new ZoneDescription(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ZoneDescription[] newArray(int i13) {
            return new ZoneDescription[i13];
        }
    }

    public ZoneDescription(String str) {
        str.getClass();
        this.d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ZoneDescription) && r.c(this.d, ((ZoneDescription) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String i() {
        return this.d;
    }

    public final String toString() {
        return f.e("ZoneDescription(zoneId=", this.d, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeString(this.d);
    }
}
