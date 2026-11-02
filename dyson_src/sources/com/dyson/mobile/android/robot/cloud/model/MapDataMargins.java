package com.dyson.mobile.android.robot.cloud.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q62.n;
import qv1.s;
import y9.w;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/robot/cloud/model/MapDataMargins;", "Landroid/os/Parcelable;", "", "left", "top", "right", "bottom", "<init>", "(IIII)V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MapDataMargins implements Parcelable {
    public static final Parcelable.Creator<MapDataMargins> CREATOR = new a();
    public final int d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final int f15936f;

    /* renamed from: g  reason: collision with root package name */
    public final int f15937g;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<MapDataMargins> {
        @Override // android.os.Parcelable.Creator
        public final MapDataMargins createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new MapDataMargins(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final MapDataMargins[] newArray(int i13) {
            return new MapDataMargins[i13];
        }
    }

    public /* synthetic */ MapDataMargins(int i13, int i14, int i15, int i16, int i17, DefaultConstructorMarker defaultConstructorMarker) {
        this((i17 & 1) != 0 ? 0 : i13, (i17 & 2) != 0 ? 0 : i14, (i17 & 4) != 0 ? 0 : i15, (i17 & 8) != 0 ? 0 : i16);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MapDataMargins) {
            MapDataMargins mapDataMargins = (MapDataMargins) obj;
            return this.d == mapDataMargins.d && this.e == mapDataMargins.e && this.f15936f == mapDataMargins.f15936f && this.f15937g == mapDataMargins.f15937g;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15937g) + w.b(this.f15936f, w.b(this.e, Integer.hashCode(this.d) * 31, 31), 31);
    }

    public final String toString() {
        return n.c(this.f15936f, this.f15937g, ", bottom=", ")", s.k("MapDataMargins(left=", this.d, ", top=", this.e, ", right="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f15936f);
        parcel.writeInt(this.f15937g);
    }

    public MapDataMargins(int i13, int i14, int i15, int i16) {
        this.d = i13;
        this.e = i14;
        this.f15936f = i15;
        this.f15937g = i16;
    }

    public MapDataMargins() {
        this(0, 0, 0, 0, 15, null);
    }
}
