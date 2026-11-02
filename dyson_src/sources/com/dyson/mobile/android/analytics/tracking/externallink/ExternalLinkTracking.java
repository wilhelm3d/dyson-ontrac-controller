package com.dyson.mobile.android.analytics.tracking.externallink;

import android.os.Parcel;
import android.os.Parcelable;
import h12.y;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mj.m;
import x12.r;
import y9.w;
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/dyson/mobile/android/analytics/tracking/externallink/ExternalLinkTracking;", "Landroid/os/Parcelable;", "", "linkName", "Lmj/m$a;", "linkLocation", "interactionId", "", "extras", "<init>", "(Ljava/lang/String;Lmj/m$a;Ljava/lang/String;Ljava/util/Map;)V", "mod-analytics"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ExternalLinkTracking implements Parcelable {
    public static final Parcelable.Creator<ExternalLinkTracking> CREATOR = new a();
    public final String d;
    public final m.a e;

    /* renamed from: f  reason: collision with root package name */
    public final String f12301f;

    /* renamed from: g  reason: collision with root package name */
    public final Map<String, String> f12302g;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<ExternalLinkTracking> {
        @Override // android.os.Parcelable.Creator
        public final ExternalLinkTracking createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            parcel.getClass();
            String readString = parcel.readString();
            m.a valueOf = m.a.valueOf(parcel.readString());
            String readString2 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                for (int i13 = 0; i13 != readInt; i13++) {
                    linkedHashMap2.put(parcel.readString(), parcel.readString());
                }
                linkedHashMap = linkedHashMap2;
            }
            return new ExternalLinkTracking(readString, valueOf, readString2, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final ExternalLinkTracking[] newArray(int i13) {
            return new ExternalLinkTracking[i13];
        }
    }

    public ExternalLinkTracking(String str, m.a aVar, String str2, Map<String, String> map) {
        str.getClass();
        aVar.getClass();
        str2.getClass();
        this.d = str;
        this.e = aVar;
        this.f12301f = str2;
        this.f12302g = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ExternalLinkTracking) {
            ExternalLinkTracking externalLinkTracking = (ExternalLinkTracking) obj;
            return r.c(this.d, externalLinkTracking.d) && this.e == externalLinkTracking.e && r.c(this.f12301f, externalLinkTracking.f12301f) && r.c(this.f12302g, externalLinkTracking.f12302g);
        }
        return false;
    }

    public final int hashCode() {
        int c13 = y.c((this.e.hashCode() + (this.d.hashCode() * 31)) * 31, 31, this.f12301f);
        Map<String, String> map = this.f12302g;
        return c13 + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        return "ExternalLinkTracking(linkName=" + this.d + ", linkLocation=" + this.e + ", interactionId=" + this.f12301f + ", extras=" + this.f12302g + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeString(this.d);
        parcel.writeString(this.e.name());
        parcel.writeString(this.f12301f);
        Map<String, String> map = this.f12302g;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeString(entry.getValue());
        }
    }

    public /* synthetic */ ExternalLinkTracking(String str, m.a aVar, String str2, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, aVar, (i13 & 4) != 0 ? w.e() : str2, (i13 & 8) != 0 ? null : map);
    }
}
