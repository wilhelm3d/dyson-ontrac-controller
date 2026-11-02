package com.dyson.mobile.android.robot.cloud.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import x12.r;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/dyson/mobile/android/robot/cloud/model/MapDataGrid;", "Landroid/os/Parcelable;", "", "resolution", "", "data", "<init>", "(ILjava/lang/String;)V", "d", "I", "j", "()I", "e", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MapDataGrid implements Parcelable {
    public static final Parcelable.Creator<MapDataGrid> CREATOR = new a();
    @SerializedName("resolution")
    private final int d;
    @SerializedName("data")
    private final String e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<MapDataGrid> {
        @Override // android.os.Parcelable.Creator
        public final MapDataGrid createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new MapDataGrid(parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MapDataGrid[] newArray(int i13) {
            return new MapDataGrid[i13];
        }
    }

    public MapDataGrid(int i13, String str) {
        str.getClass();
        this.d = i13;
        this.e = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MapDataGrid) {
            MapDataGrid mapDataGrid = (MapDataGrid) obj;
            return this.d == mapDataGrid.d && r.c(this.e, mapDataGrid.e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + (Integer.hashCode(this.d) * 31);
    }

    public final String i() {
        return this.e;
    }

    public final int j() {
        return this.d;
    }

    public final String toString() {
        int i13 = this.d;
        String str = this.e;
        return "MapDataGrid(resolution=" + i13 + ", data=" + str + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeInt(this.d);
        parcel.writeString(this.e);
    }
}
