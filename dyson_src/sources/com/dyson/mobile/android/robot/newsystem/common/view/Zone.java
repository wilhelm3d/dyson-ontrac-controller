package com.dyson.mobile.android.robot.newsystem.common.view;

import android.os.Parcel;
import android.os.Parcelable;
import b0.y1;
import com.dyson.mobile.android.robot.newsystem.common.model.CleanSettings;
import com.salesforce.marketingcloud.messages.inbox.b;
import h12.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ma.e;
import x12.r;
import y9.w;
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/common/view/Zone;", "Landroid/os/Parcelable;", "", "id", "name", b.f21448j, "", "icon", "", "isChecked", "order", "Lcom/dyson/mobile/android/robot/newsystem/common/model/CleanSettings;", "cleanSettings", "", "areaSqMeter", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZILcom/dyson/mobile/android/robot/newsystem/common/model/CleanSettings;DLjava/lang/String;)V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Zone implements Parcelable {
    public static final Parcelable.Creator<Zone> CREATOR = new a();
    public final String d;
    public final String e;

    /* renamed from: f  reason: collision with root package name */
    public final String f16320f;

    /* renamed from: g  reason: collision with root package name */
    public final int f16321g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f16322h;

    /* renamed from: i  reason: collision with root package name */
    public final int f16323i;

    /* renamed from: j  reason: collision with root package name */
    public final CleanSettings f16324j;

    /* renamed from: k  reason: collision with root package name */
    public final double f16325k;

    /* renamed from: l  reason: collision with root package name */
    public final String f16326l;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<Zone> {
        @Override // android.os.Parcelable.Creator
        public final Zone createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new Zone(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt(), CleanSettings.CREATOR.createFromParcel(parcel), parcel.readDouble(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Zone[] newArray(int i13) {
            return new Zone[i13];
        }
    }

    public Zone(String str, String str2, String str3, int i13, boolean z13, int i14, CleanSettings cleanSettings, double d, String str4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        cleanSettings.getClass();
        str4.getClass();
        this.d = str;
        this.e = str2;
        this.f16320f = str3;
        this.f16321g = i13;
        this.f16322h = z13;
        this.f16323i = i14;
        this.f16324j = cleanSettings;
        this.f16325k = d;
        this.f16326l = str4;
    }

    public static Zone a(Zone zone, boolean z13, int i13, CleanSettings cleanSettings, String str, int i14) {
        String str2 = zone.d;
        String str3 = zone.e;
        String str4 = zone.f16320f;
        int i15 = zone.f16321g;
        if ((i14 & 16) != 0) {
            z13 = zone.f16322h;
        }
        boolean z14 = z13;
        if ((i14 & 32) != 0) {
            i13 = zone.f16323i;
        }
        int i16 = i13;
        CleanSettings cleanSettings2 = (i14 & 64) != 0 ? zone.f16324j : cleanSettings;
        double d = zone.f16325k;
        String str5 = (i14 & 256) != 0 ? zone.f16326l : str;
        zone.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        cleanSettings2.getClass();
        str5.getClass();
        return new Zone(str2, str3, str4, i15, z14, i16, cleanSettings2, d, str5);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Zone) {
            Zone zone = (Zone) obj;
            return r.c(this.d, zone.d) && r.c(this.e, zone.e) && r.c(this.f16320f, zone.f16320f) && this.f16321g == zone.f16321g && this.f16322h == zone.f16322h && this.f16323i == zone.f16323i && r.c(this.f16324j, zone.f16324j) && Double.compare(this.f16325k, zone.f16325k) == 0 && r.c(this.f16326l, zone.f16326l);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16326l.hashCode() + o1.a.a((this.f16324j.hashCode() + w.b(this.f16323i, w.c(w.b(this.f16321g, y.c(y.c(this.d.hashCode() * 31, 31, this.e), 31, this.f16320f), 31), 31, this.f16322h), 31)) * 31, 31, this.f16325k);
    }

    public final String toString() {
        StringBuilder m13 = e.m("Zone(id=", this.d, ", name=", this.e, ", type=");
        m13.append(this.f16320f);
        m13.append(", icon=");
        m13.append(this.f16321g);
        m13.append(", isChecked=");
        m13.append(this.f16322h);
        m13.append(", order=");
        m13.append(this.f16323i);
        m13.append(", cleanSettings=");
        m13.append(this.f16324j);
        m13.append(", areaSqMeter=");
        m13.append(this.f16325k);
        return y1.m(m13, ", description=", this.f16326l, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f16320f);
        parcel.writeInt(this.f16321g);
        parcel.writeInt(this.f16322h ? 1 : 0);
        parcel.writeInt(this.f16323i);
        this.f16324j.writeToParcel(parcel, i13);
        parcel.writeDouble(this.f16325k);
        parcel.writeString(this.f16326l);
    }

    public /* synthetic */ Zone(String str, String str2, String str3, int i13, boolean z13, int i14, CleanSettings cleanSettings, double d, String str4, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, i13, z13, i14, cleanSettings, d, (i15 & 256) != 0 ? "" : str4);
    }
}
