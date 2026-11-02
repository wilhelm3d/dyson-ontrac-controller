package com.dyson.mobile.android.robot.menu.mappingandzoning.restrictions;

import android.os.Parcel;
import android.os.Parcelable;
import h12.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ma.e;
import mx0.d;
import x12.r;
import y9.w;
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000fB;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/dyson/mobile/android/robot/menu/mappingandzoning/restrictions/ManageRestrictionData;", "Landroid/os/Parcelable;", "", "coordinatorId", "persistentMapId", "", "restrictionId", "Lmx0/d;", "manageAction", "Lmx0/b;", "restrictionBehavior", "", "restrictionBehaviorChanged", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILmx0/d;Lmx0/b;Z)V", "a", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ManageRestrictionData implements Parcelable {
    public static final Parcelable.Creator<ManageRestrictionData> CREATOR;
    public final String d;
    public final String e;

    /* renamed from: f  reason: collision with root package name */
    public final int f16122f;

    /* renamed from: g  reason: collision with root package name */
    public final d f16123g;

    /* renamed from: h  reason: collision with root package name */
    public final mx0.b f16124h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f16125i;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b implements Parcelable.Creator<ManageRestrictionData> {
        @Override // android.os.Parcelable.Creator
        public final ManageRestrictionData createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new ManageRestrictionData(parcel.readString(), parcel.readString(), parcel.readInt(), d.valueOf(parcel.readString()), mx0.b.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ManageRestrictionData[] newArray(int i13) {
            return new ManageRestrictionData[i13];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public ManageRestrictionData(String str, String str2, int i13, d dVar, mx0.b bVar, boolean z13) {
        str.getClass();
        str2.getClass();
        dVar.getClass();
        bVar.getClass();
        this.d = str;
        this.e = str2;
        this.f16122f = i13;
        this.f16123g = dVar;
        this.f16124h = bVar;
        this.f16125i = z13;
    }

    public static ManageRestrictionData a(ManageRestrictionData manageRestrictionData, int i13, mx0.b bVar, boolean z13, int i14) {
        String str = manageRestrictionData.d;
        String str2 = manageRestrictionData.e;
        if ((i14 & 4) != 0) {
            i13 = manageRestrictionData.f16122f;
        }
        int i15 = i13;
        d dVar = manageRestrictionData.f16123g;
        if ((i14 & 16) != 0) {
            bVar = manageRestrictionData.f16124h;
        }
        mx0.b bVar2 = bVar;
        if ((i14 & 32) != 0) {
            z13 = manageRestrictionData.f16125i;
        }
        str.getClass();
        str2.getClass();
        dVar.getClass();
        bVar2.getClass();
        return new ManageRestrictionData(str, str2, i15, dVar, bVar2, z13);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ManageRestrictionData) {
            ManageRestrictionData manageRestrictionData = (ManageRestrictionData) obj;
            return r.c(this.d, manageRestrictionData.d) && r.c(this.e, manageRestrictionData.e) && this.f16122f == manageRestrictionData.f16122f && this.f16123g == manageRestrictionData.f16123g && this.f16124h == manageRestrictionData.f16124h && this.f16125i == manageRestrictionData.f16125i;
        }
        return false;
    }

    public final int hashCode() {
        int b13 = w.b(this.f16122f, y.c(this.d.hashCode() * 31, 31, this.e), 31);
        int hashCode = this.f16124h.hashCode();
        return Boolean.hashCode(this.f16125i) + ((hashCode + ((this.f16123g.hashCode() + b13) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder m13 = e.m("ManageRestrictionData(coordinatorId=", this.d, ", persistentMapId=", this.e, ", restrictionId=");
        m13.append(this.f16122f);
        m13.append(", manageAction=");
        m13.append(this.f16123g);
        m13.append(", restrictionBehavior=");
        m13.append(this.f16124h);
        m13.append(", restrictionBehaviorChanged=");
        m13.append(this.f16125i);
        m13.append(")");
        return m13.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeInt(this.f16122f);
        parcel.writeString(this.f16123g.name());
        parcel.writeString(this.f16124h.name());
        parcel.writeInt(this.f16125i ? 1 : 0);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/robot/menu/mappingandzoning/restrictions/ManageRestrictionData$a;", "", "<init>", "()V", "", "UNDEFINED_RESTRICTION_ID", "I", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ ManageRestrictionData(String str, String str2, int i13, d dVar, mx0.b bVar, boolean z13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, i13, dVar, (i14 & 16) != 0 ? mx0.b.AVOID : bVar, (i14 & 32) != 0 ? false : z13);
    }
}
