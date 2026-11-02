package com.dyson.mobile.android.robot.cloud.model;

import android.os.Parcel;
import android.os.Parcelable;
import b0.g;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import qv1.s;
import y9.w;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/dyson/mobile/android/robot/cloud/model/MapPosition;", "Landroid/os/Parcelable;", "", "x", "y", "angle", "<init>", "(III)V", "d", "I", "j", "()I", "e", "k", "f", "i", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MapPosition implements Parcelable {
    public static final Parcelable.Creator<MapPosition> CREATOR = new a();
    @SerializedName("x")
    private final int d;
    @SerializedName("y")
    private final int e;
    @SerializedName("angle")

    /* renamed from: f  reason: collision with root package name */
    private final int f15938f;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<MapPosition> {
        @Override // android.os.Parcelable.Creator
        public final MapPosition createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new MapPosition(parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final MapPosition[] newArray(int i13) {
            return new MapPosition[i13];
        }
    }

    public MapPosition(int i13, int i14, int i15) {
        this.d = i13;
        this.e = i14;
        this.f15938f = i15;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MapPosition) {
            MapPosition mapPosition = (MapPosition) obj;
            return this.d == mapPosition.d && this.e == mapPosition.e && this.f15938f == mapPosition.f15938f;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15938f) + w.b(this.e, Integer.hashCode(this.d) * 31, 31);
    }

    public final int i() {
        return this.f15938f;
    }

    public final int j() {
        return this.d;
    }

    public final int k() {
        return this.e;
    }

    public final String toString() {
        return g.i(this.f15938f, ")", s.k("MapPosition(x=", this.d, ", y=", this.e, ", angle="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f15938f);
    }
}
