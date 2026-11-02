package com.dyson.mobile.android.robot.cloud.newsystem.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import m4.c;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/dyson/mobile/android/robot/cloud/newsystem/common/Point;", "Landroid/os/Parcelable;", "", "x", "y", "<init>", "(DD)V", "d", "D", "i", "()D", "e", "j", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Point implements Parcelable {
    public static final Parcelable.Creator<Point> CREATOR = new a();
    @SerializedName("x")
    private final double d;
    @SerializedName("y")
    private final double e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<Point> {
        @Override // android.os.Parcelable.Creator
        public final Point createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new Point(parcel.readDouble(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final Point[] newArray(int i13) {
            return new Point[i13];
        }
    }

    public Point(double d, double d13) {
        this.d = d;
        this.e = d13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Point) {
            Point point = (Point) obj;
            return Double.compare(this.d, point.d) == 0 && Double.compare(this.e, point.e) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Double.hashCode(this.e) + (Double.hashCode(this.d) * 31);
    }

    public final double i() {
        return this.d;
    }

    public final double j() {
        return this.e;
    }

    public final long k() {
        long floatToRawIntBits = (Float.floatToRawIntBits((float) this.d) << 32) | (Float.floatToRawIntBits((float) this.e) & 4294967295L);
        c.a aVar = c.f53022b;
        return floatToRawIntBits;
    }

    public final String toString() {
        double d = this.d;
        double d13 = this.e;
        return "Point(x=" + d + ", y=" + d13 + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeDouble(this.d);
        parcel.writeDouble(this.e);
    }
}
