package com.dyson.mobile.android.robot.cloud.newsystem.response.mapmetadata;

import android.os.Parcel;
import android.os.Parcelable;
import com.brightcove.player.captioning.TTMLParser;
import com.dyson.mobile.android.robot.cloud.newsystem.common.ZoneSettings;
import com.google.gson.annotations.SerializedName;
import com.salesforce.marketingcloud.messages.inbox.b;
import h12.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ma.e;
import v80.c;
import x12.r;
import y9.w;
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010$\u001a\u0004\b \u0010%¨\u0006&"}, d2 = {"Lcom/dyson/mobile/android/robot/cloud/newsystem/response/mapmetadata/MetadataMapZoneData;", "Landroid/os/Parcelable;", "", "id", "name", b.f21448j, "", "isSelected", "", "order", "Lcom/dyson/mobile/android/robot/cloud/newsystem/common/ZoneSettings;", "settings", "", "areaSqMeter", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILcom/dyson/mobile/android/robot/cloud/newsystem/common/ZoneSettings;D)V", "d", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "e", "k", "f", "n", "g", "Z", TTMLParser.Tags.CAPTION, "()Z", "h", "I", "l", "()I", "i", "Lcom/dyson/mobile/android/robot/cloud/newsystem/common/ZoneSettings;", "m", "()Lcom/dyson/mobile/android/robot/cloud/newsystem/common/ZoneSettings;", "D", "()D", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MetadataMapZoneData implements Parcelable {
    public static final Parcelable.Creator<MetadataMapZoneData> CREATOR = new a();
    @SerializedName("id")
    private final String d;
    @SerializedName("name")
    private final String e;
    @SerializedName(b.f21448j)

    /* renamed from: f  reason: collision with root package name */
    private final String f15992f;
    @SerializedName("isSelected")

    /* renamed from: g  reason: collision with root package name */
    private final boolean f15993g;
    @SerializedName("order")

    /* renamed from: h  reason: collision with root package name */
    private final int f15994h;
    @SerializedName("settings")

    /* renamed from: i  reason: collision with root package name */
    private final ZoneSettings f15995i;
    @SerializedName("area")

    /* renamed from: j  reason: collision with root package name */
    private final double f15996j;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<MetadataMapZoneData> {
        @Override // android.os.Parcelable.Creator
        public final MetadataMapZoneData createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new MetadataMapZoneData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt(), ZoneSettings.CREATOR.createFromParcel(parcel), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final MetadataMapZoneData[] newArray(int i13) {
            return new MetadataMapZoneData[i13];
        }
    }

    public /* synthetic */ MetadataMapZoneData(String str, String str2, String str3, boolean z13, int i13, ZoneSettings zoneSettings, double d, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i14 & 4) != 0 ? null : str3, (i14 & 8) != 0 ? true : z13, (i14 & 16) != 0 ? 0 : i13, zoneSettings, (i14 & 64) != 0 ? 0.0d : d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MetadataMapZoneData) {
            MetadataMapZoneData metadataMapZoneData = (MetadataMapZoneData) obj;
            return r.c(this.d, metadataMapZoneData.d) && r.c(this.e, metadataMapZoneData.e) && r.c(this.f15992f, metadataMapZoneData.f15992f) && this.f15993g == metadataMapZoneData.f15993g && this.f15994h == metadataMapZoneData.f15994h && r.c(this.f15995i, metadataMapZoneData.f15995i) && Double.compare(this.f15996j, metadataMapZoneData.f15996j) == 0;
        }
        return false;
    }

    public final int hashCode() {
        int c13 = y.c(this.d.hashCode() * 31, 31, this.e);
        String str = this.f15992f;
        return Double.hashCode(this.f15996j) + ((this.f15995i.hashCode() + w.b(this.f15994h, w.c((c13 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f15993g), 31)) * 31);
    }

    public final double i() {
        return this.f15996j;
    }

    public final String j() {
        return this.d;
    }

    public final String k() {
        return this.e;
    }

    public final int l() {
        return this.f15994h;
    }

    public final ZoneSettings m() {
        return this.f15995i;
    }

    public final String n() {
        return this.f15992f;
    }

    public final boolean p() {
        return this.f15993g;
    }

    public final String toString() {
        String str = this.d;
        String str2 = this.e;
        String str3 = this.f15992f;
        boolean z13 = this.f15993g;
        int i13 = this.f15994h;
        ZoneSettings zoneSettings = this.f15995i;
        double d = this.f15996j;
        StringBuilder m13 = e.m("MetadataMapZoneData(id=", str, ", name=", str2, ", type=");
        c.j(m13, str3, ", isSelected=", z13, ", order=");
        m13.append(i13);
        m13.append(", settings=");
        m13.append(zoneSettings);
        m13.append(", areaSqMeter=");
        m13.append(d);
        m13.append(")");
        return m13.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f15992f);
        parcel.writeInt(this.f15993g ? 1 : 0);
        parcel.writeInt(this.f15994h);
        this.f15995i.writeToParcel(parcel, i13);
        parcel.writeDouble(this.f15996j);
    }

    public MetadataMapZoneData(String str, String str2, String str3, boolean z13, int i13, ZoneSettings zoneSettings, double d) {
        str.getClass();
        str2.getClass();
        zoneSettings.getClass();
        this.d = str;
        this.e = str2;
        this.f15992f = str3;
        this.f15993g = z13;
        this.f15994h = i13;
        this.f15995i = zoneSettings;
        this.f15996j = d;
    }
}
