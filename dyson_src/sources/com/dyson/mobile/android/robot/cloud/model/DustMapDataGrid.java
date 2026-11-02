package com.dyson.mobile.android.robot.cloud.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import qv1.s;
import x12.r;
import xw0.v;
import y9.w;
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\f\u001a\u0004\b\u0012\u0010\u000eR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/dyson/mobile/android/robot/cloud/model/DustMapDataGrid;", "Landroid/os/Parcelable;", "", "resolution", "width", "height", "", "Lcom/dyson/mobile/android/robot/cloud/model/DustData;", "data", "<init>", "(IIILjava/util/List;)V", "d", "I", "i", "()I", "e", "j", "f", "getHeight", "g", "Ljava/util/List;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DustMapDataGrid implements Parcelable {
    public static final Parcelable.Creator<DustMapDataGrid> CREATOR = new a();
    @SerializedName("resolution")
    private final int d;
    @SerializedName("width")
    private final int e;
    @SerializedName("height")

    /* renamed from: f  reason: collision with root package name */
    private final int f15934f;
    @SerializedName("dustData")

    /* renamed from: g  reason: collision with root package name */
    private final List<DustData> f15935g;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<DustMapDataGrid> {
        @Override // android.os.Parcelable.Creator
        public final DustMapDataGrid createFromParcel(Parcel parcel) {
            parcel.getClass();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt4);
            int i13 = 0;
            while (i13 != readInt4) {
                i13 = d72.a.d(DustData.CREATOR, parcel, arrayList, i13, 1);
            }
            return new DustMapDataGrid(readInt, readInt2, readInt3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final DustMapDataGrid[] newArray(int i13) {
            return new DustMapDataGrid[i13];
        }
    }

    public DustMapDataGrid(int i13, int i14, int i15, List<DustData> list) {
        list.getClass();
        this.d = i13;
        this.e = i14;
        this.f15934f = i15;
        this.f15935g = list;
    }

    public final DustData a(v vVar) {
        Object obj;
        vVar.getClass();
        Iterator<T> it = this.f15935g.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (r.c(((DustData) obj).j(), vVar.getJsonKey())) {
                break;
            }
        }
        return (DustData) obj;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DustMapDataGrid) {
            DustMapDataGrid dustMapDataGrid = (DustMapDataGrid) obj;
            return this.d == dustMapDataGrid.d && this.e == dustMapDataGrid.e && this.f15934f == dustMapDataGrid.f15934f && r.c(this.f15935g, dustMapDataGrid.f15935g);
        }
        return false;
    }

    public final int hashCode() {
        return this.f15935g.hashCode() + w.b(this.f15934f, w.b(this.e, Integer.hashCode(this.d) * 31, 31), 31);
    }

    public final int i() {
        return this.d;
    }

    public final int j() {
        return this.e;
    }

    public final String toString() {
        int i13 = this.d;
        int i14 = this.e;
        int i15 = this.f15934f;
        List<DustData> list = this.f15935g;
        StringBuilder k13 = s.k("DustMapDataGrid(resolution=", i13, ", width=", i14, ", height=");
        k13.append(i15);
        k13.append(", data=");
        k13.append(list);
        k13.append(")");
        return k13.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f15934f);
        Iterator n13 = d72.a.n(this.f15935g, parcel);
        while (n13.hasNext()) {
            ((DustData) n13.next()).writeToParcel(parcel, i13);
        }
    }
}
