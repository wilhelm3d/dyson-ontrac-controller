package com.dyson.mobile.android.robot.cloud.newsystem.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.salesforce.marketingcloud.messages.inbox.b;
import h12.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import v80.c;
import x12.r;
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0015\u0010\u000fR\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lcom/dyson/mobile/android/robot/cloud/newsystem/common/Furniture;", "Landroid/os/Parcelable;", "", "id", "", "Lcom/dyson/mobile/android/robot/cloud/newsystem/common/Point;", "points", b.f21448j, "", "userDefined", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Z)V", "d", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "e", "Ljava/util/List;", "j", "()Ljava/util/List;", "f", "k", "g", "Z", "l", "()Z", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Furniture implements Parcelable {
    public static final Parcelable.Creator<Furniture> CREATOR = new a();
    @SerializedName("id")
    private final String d;
    @SerializedName("points")
    private final List<Point> e;
    @SerializedName(b.f21448j)

    /* renamed from: f  reason: collision with root package name */
    private final String f15984f;
    @SerializedName("userDefined")

    /* renamed from: g  reason: collision with root package name */
    private final boolean f15985g;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<Furniture> {
        @Override // android.os.Parcelable.Creator
        public final Furniture createFromParcel(Parcel parcel) {
            parcel.getClass();
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i13 = 0;
            while (i13 != readInt) {
                i13 = d72.a.d(Point.CREATOR, parcel, arrayList, i13, 1);
            }
            return new Furniture(readString, arrayList, parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Furniture[] newArray(int i13) {
            return new Furniture[i13];
        }
    }

    public Furniture(String str, List<Point> list, String str2, boolean z13) {
        str.getClass();
        list.getClass();
        str2.getClass();
        this.d = str;
        this.e = list;
        this.f15984f = str2;
        this.f15985g = z13;
    }

    public static Furniture a(Furniture furniture, ArrayList arrayList) {
        String str = furniture.d;
        String str2 = furniture.f15984f;
        boolean z13 = furniture.f15985g;
        str.getClass();
        str2.getClass();
        return new Furniture(str, arrayList, str2, z13);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Furniture) {
            Furniture furniture = (Furniture) obj;
            return r.c(this.d, furniture.d) && r.c(this.e, furniture.e) && r.c(this.f15984f, furniture.f15984f) && this.f15985g == furniture.f15985g;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15985g) + y.c(tq1.a.h(this.d.hashCode() * 31, 31, this.e), 31, this.f15984f);
    }

    public final String i() {
        return this.d;
    }

    public final List<Point> j() {
        return this.e;
    }

    public final String k() {
        return this.f15984f;
    }

    public final boolean l() {
        return this.f15985g;
    }

    public final String toString() {
        String str = this.d;
        List<Point> list = this.e;
        String str2 = this.f15984f;
        boolean z13 = this.f15985g;
        StringBuilder sb2 = new StringBuilder("Furniture(id=");
        sb2.append(str);
        sb2.append(", points=");
        sb2.append(list);
        sb2.append(", type=");
        return c.d(sb2, str2, ", userDefined=", z13, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeString(this.d);
        Iterator n13 = d72.a.n(this.e, parcel);
        while (n13.hasNext()) {
            ((Point) n13.next()).writeToParcel(parcel, i13);
        }
        parcel.writeString(this.f15984f);
        parcel.writeInt(this.f15985g ? 1 : 0);
    }
}
