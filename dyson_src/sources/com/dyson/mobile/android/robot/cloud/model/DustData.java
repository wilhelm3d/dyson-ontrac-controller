package com.dyson.mobile.android.robot.cloud.model;

import android.os.Parcel;
import android.os.Parcelable;
import b0.g;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import x12.r;
import y9.w;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\f¨\u0006\u0013"}, d2 = {"Lcom/dyson/mobile/android/robot/cloud/model/DustData;", "Landroid/os/Parcelable;", "", "name", "", "scaleFactor", "data", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "d", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "e", "I", "k", "()I", "f", "i", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DustData implements Parcelable {
    public static final Parcelable.Creator<DustData> CREATOR = new a();
    @SerializedName("name")
    private final String d;
    @SerializedName("scaleFactor")
    private final int e;
    @SerializedName("data")

    /* renamed from: f  reason: collision with root package name */
    private final String f15933f;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<DustData> {
        @Override // android.os.Parcelable.Creator
        public final DustData createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new DustData(parcel.readString(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final DustData[] newArray(int i13) {
            return new DustData[i13];
        }
    }

    public DustData(String str, int i13, String str2) {
        str.getClass();
        str2.getClass();
        this.d = str;
        this.e = i13;
        this.f15933f = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DustData) {
            DustData dustData = (DustData) obj;
            return r.c(this.d, dustData.d) && this.e == dustData.e && r.c(this.f15933f, dustData.f15933f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15933f.hashCode() + w.b(this.e, this.d.hashCode() * 31, 31);
    }

    public final String i() {
        return this.f15933f;
    }

    public final String j() {
        return this.d;
    }

    public final int k() {
        return this.e;
    }

    public final String toString() {
        String str = this.d;
        int i13 = this.e;
        return ie.a.h(g.m(i13, "DustData(name=", str, ", scaleFactor=", ", data="), this.f15933f, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
        parcel.writeString(this.f15933f);
    }
}
