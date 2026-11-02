package com.dyson.mobile.android.robot.cloud.newsystem.common;

import android.os.Parcel;
import android.os.Parcelable;
import b0.y1;
import com.google.gson.annotations.SerializedName;
import com.salesforce.marketingcloud.messages.inbox.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import x12.r;
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/dyson/mobile/android/robot/cloud/newsystem/common/DustMap;", "Landroid/os/Parcelable;", "", b.f21448j, "", "", "data", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "d", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "e", "Ljava/util/List;", "i", "()Ljava/util/List;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DustMap implements Parcelable {
    public static final Parcelable.Creator<DustMap> CREATOR = new a();
    @SerializedName(b.f21448j)
    private final String d;
    @SerializedName("data")
    private final List<Integer> e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<DustMap> {
        @Override // android.os.Parcelable.Creator
        public final DustMap createFromParcel(Parcel parcel) {
            parcel.getClass();
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i13 = 0; i13 != readInt; i13++) {
                arrayList.add(Integer.valueOf(parcel.readInt()));
            }
            return new DustMap(readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final DustMap[] newArray(int i13) {
            return new DustMap[i13];
        }
    }

    public DustMap(String str, List<Integer> list) {
        str.getClass();
        list.getClass();
        this.d = str;
        this.e = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DustMap) {
            DustMap dustMap = (DustMap) obj;
            return r.c(this.d, dustMap.d) && r.c(this.e, dustMap.e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }

    public final List<Integer> i() {
        return this.e;
    }

    public final String j() {
        return this.d;
    }

    public final String toString() {
        return y1.k("DustMap(type=", this.d, ", data=", ")", this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeString(this.d);
        Iterator n13 = d72.a.n(this.e, parcel);
        while (n13.hasNext()) {
            parcel.writeInt(((Number) n13.next()).intValue());
        }
    }
}
