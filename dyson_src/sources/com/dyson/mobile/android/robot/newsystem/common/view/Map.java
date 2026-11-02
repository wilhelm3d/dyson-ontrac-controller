package com.dyson.mobile.android.robot.newsystem.common.view;

import android.os.Parcel;
import android.os.Parcelable;
import h12.y;
import kotlin.Metadata;
import ma.e;
import v80.c;
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/common/view/Map;", "Landroid/os/Parcelable;", "", "id", "name", "zonesDefinitionLastUpdatedDate", "", "isCurrentMap", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Map implements Parcelable {
    public static final Parcelable.Creator<Map> CREATOR = new a();
    public final String d;
    public final String e;

    /* renamed from: f  reason: collision with root package name */
    public final String f16318f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f16319g;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<Map> {
        @Override // android.os.Parcelable.Creator
        public final Map createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new Map(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Map[] newArray(int i13) {
            return new Map[i13];
        }
    }

    public Map(String str, String str2, String str3, boolean z13) {
        d72.a.v(str, str2, str3);
        this.d = str;
        this.e = str2;
        this.f16318f = str3;
        this.f16319g = z13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            return this.d.equals(map.d) && this.e.equals(map.e) && this.f16318f.equals(map.f16318f) && this.f16319g == map.f16319g;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f16319g) + y.c(y.c(this.d.hashCode() * 31, 31, this.e), 31, this.f16318f);
    }

    public final String toString() {
        return c.d(e.m("Map(id=", this.d, ", name=", this.e, ", zonesDefinitionLastUpdatedDate="), this.f16318f, ", isCurrentMap=", this.f16319g, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f16318f);
        parcel.writeInt(this.f16319g ? 1 : 0);
    }
}
