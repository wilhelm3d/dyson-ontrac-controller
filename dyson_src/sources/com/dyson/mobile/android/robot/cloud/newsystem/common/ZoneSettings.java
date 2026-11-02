package com.dyson.mobile.android.robot.cloud.newsystem.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ky0.d;
import nu0.c;
import nu0.l;
import x12.r;
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001d\u001a\u0004\b\"\u0010\u001fR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\r\u0010%¨\u0006&"}, d2 = {"Lcom/dyson/mobile/android/robot/cloud/newsystem/common/ZoneSettings;", "Landroid/os/Parcelable;", "Lky0/d;", "cleaningStrategy", "Lnu0/c;", "cleanTypeData", "Lnu0/l;", "waterLevelData", "", "mopPassData", "vacuumPassData", "vacuumPowerMode", "", "isUvScanOn", "<init>", "(Lky0/d;Lnu0/c;Lnu0/l;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "d", "Lky0/d;", "getCleaningStrategy", "()Lky0/d;", "e", "Lnu0/c;", "i", "()Lnu0/c;", "f", "Lnu0/l;", "getWaterLevelData", "()Lnu0/l;", "g", "Ljava/lang/Integer;", "getMopPassData", "()Ljava/lang/Integer;", "h", "getVacuumPassData", "getVacuumPowerMode", "j", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ZoneSettings implements Parcelable {
    public static final Parcelable.Creator<ZoneSettings> CREATOR = new a();
    @SerializedName("cleaningStrategy")
    private final d d;
    @SerializedName("cleanType")
    private final c e;
    @SerializedName("waterLevel")

    /* renamed from: f  reason: collision with root package name */
    private final l f15987f;
    @SerializedName("mopPasses")

    /* renamed from: g  reason: collision with root package name */
    private final Integer f15988g;
    @SerializedName("dryPasses")

    /* renamed from: h  reason: collision with root package name */
    private final Integer f15989h;
    @SerializedName("vacuumPowerMode")

    /* renamed from: i  reason: collision with root package name */
    private final Integer f15990i;
    @SerializedName("isUvScanOn")

    /* renamed from: j  reason: collision with root package name */
    private final Boolean f15991j;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<ZoneSettings> {
        @Override // android.os.Parcelable.Creator
        public final ZoneSettings createFromParcel(Parcel parcel) {
            parcel.getClass();
            Boolean bool = null;
            d valueOf = parcel.readInt() == 0 ? null : d.valueOf(parcel.readString());
            c valueOf2 = parcel.readInt() == 0 ? null : c.valueOf(parcel.readString());
            l valueOf3 = parcel.readInt() == 0 ? null : l.valueOf(parcel.readString());
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ZoneSettings(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final ZoneSettings[] newArray(int i13) {
            return new ZoneSettings[i13];
        }
    }

    public /* synthetic */ ZoneSettings(d dVar, c cVar, l lVar, Integer num, Integer num2, Integer num3, Boolean bool, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : dVar, (i13 & 2) != 0 ? null : cVar, (i13 & 4) != 0 ? null : lVar, (i13 & 8) != 0 ? null : num, (i13 & 16) != 0 ? null : num2, (i13 & 32) != 0 ? null : num3, (i13 & 64) != 0 ? null : bool);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneSettings) {
            ZoneSettings zoneSettings = (ZoneSettings) obj;
            return this.d == zoneSettings.d && this.e == zoneSettings.e && this.f15987f == zoneSettings.f15987f && r.c(this.f15988g, zoneSettings.f15988g) && r.c(this.f15989h, zoneSettings.f15989h) && r.c(this.f15990i, zoneSettings.f15990i) && r.c(this.f15991j, zoneSettings.f15991j);
        }
        return false;
    }

    public final int hashCode() {
        d dVar = this.d;
        int hashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        c cVar = this.e;
        int hashCode2 = (hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        l lVar = this.f15987f;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Integer num = this.f15988g;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f15989h;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f15990i;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Boolean bool = this.f15991j;
        return hashCode6 + (bool != null ? bool.hashCode() : 0);
    }

    public final c i() {
        return this.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
        if (r2 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0078, code lost:
        if (r3 == null) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.dyson.mobile.android.robot.newsystem.common.model.CleanSettings j() {
        /*
            r10 = this;
            com.dyson.mobile.android.robot.newsystem.common.model.CleanSettings r0 = new com.dyson.mobile.android.robot.newsystem.common.model.CleanSettings
            nu0.c r1 = r10.e
            if (r1 == 0) goto Lc
            com.dyson.mobile.android.robot.newsystem.common.model.c r1 = com.dyson.mobile.android.robot.newsystem.common.model.b.b(r1)
            if (r1 != 0) goto L15
        Lc:
            com.dyson.mobile.android.robot.newsystem.common.model.c$a r1 = com.dyson.mobile.android.robot.newsystem.common.model.c.Companion
            r1.getClass()
            com.dyson.mobile.android.robot.newsystem.common.model.c r1 = com.dyson.mobile.android.robot.newsystem.common.model.c.access$getDEFAULT$cp()
        L15:
            ky0.d r2 = r10.d
            r3 = 0
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L4c
            int[] r8 = com.dyson.mobile.android.robot.newsystem.common.model.b.a.d
            int r2 = r2.ordinal()
            r2 = r8[r2]
            if (r2 == r7) goto L48
            if (r2 == r6) goto L45
            if (r2 == r5) goto L42
            if (r2 == r4) goto L3f
            r8 = 5
            if (r2 != r8) goto L3b
            com.dyson.mobile.android.robot.newsystem.common.model.d$a r2 = com.dyson.mobile.android.robot.newsystem.common.model.d.Companion
            r2.getClass()
            com.dyson.mobile.android.robot.newsystem.common.model.d r2 = com.dyson.mobile.android.robot.newsystem.common.model.d.access$getDEFAULT$cp()
            goto L4a
        L3b:
            ma.e.o()
            return r3
        L3f:
            com.dyson.mobile.android.robot.newsystem.common.model.d r2 = com.dyson.mobile.android.robot.newsystem.common.model.d.BOOST
            goto L4a
        L42:
            com.dyson.mobile.android.robot.newsystem.common.model.d r2 = com.dyson.mobile.android.robot.newsystem.common.model.d.QUIET
            goto L4a
        L45:
            com.dyson.mobile.android.robot.newsystem.common.model.d r2 = com.dyson.mobile.android.robot.newsystem.common.model.d.QUICK
            goto L4a
        L48:
            com.dyson.mobile.android.robot.newsystem.common.model.d r2 = com.dyson.mobile.android.robot.newsystem.common.model.d.AUTO
        L4a:
            if (r2 != 0) goto L55
        L4c:
            com.dyson.mobile.android.robot.newsystem.common.model.d$a r2 = com.dyson.mobile.android.robot.newsystem.common.model.d.Companion
            r2.getClass()
            com.dyson.mobile.android.robot.newsystem.common.model.d r2 = com.dyson.mobile.android.robot.newsystem.common.model.d.access$getDEFAULT$cp()
        L55:
            nu0.l r8 = r10.f15987f
            if (r8 == 0) goto L7a
            int[] r9 = com.dyson.mobile.android.robot.newsystem.common.model.b.a.f16314f
            int r8 = r8.ordinal()
            r8 = r9[r8]
            if (r8 == r7) goto L76
            if (r8 == r6) goto L73
            if (r8 == r5) goto L70
            if (r8 != r4) goto L6c
            com.dyson.mobile.android.robot.newsystem.common.model.e r3 = com.dyson.mobile.android.robot.newsystem.common.model.e.HIGH
            goto L78
        L6c:
            ma.e.o()
            return r3
        L70:
            com.dyson.mobile.android.robot.newsystem.common.model.e r3 = com.dyson.mobile.android.robot.newsystem.common.model.e.MEDIUM
            goto L78
        L73:
            com.dyson.mobile.android.robot.newsystem.common.model.e r3 = com.dyson.mobile.android.robot.newsystem.common.model.e.LOW
            goto L78
        L76:
            com.dyson.mobile.android.robot.newsystem.common.model.e r3 = com.dyson.mobile.android.robot.newsystem.common.model.e.VERY_LOW
        L78:
            if (r3 != 0) goto L83
        L7a:
            com.dyson.mobile.android.robot.newsystem.common.model.e$a r3 = com.dyson.mobile.android.robot.newsystem.common.model.e.Companion
            r3.getClass()
            com.dyson.mobile.android.robot.newsystem.common.model.e r3 = com.dyson.mobile.android.robot.newsystem.common.model.e.access$getDEFAULT$cp()
        L83:
            java.lang.Integer r4 = r10.f15988g
            if (r4 == 0) goto L91
            int r4 = r4.intValue()
            com.dyson.mobile.android.robot.newsystem.common.model.a r4 = com.dyson.mobile.android.robot.newsystem.common.model.b.a(r4)
            if (r4 != 0) goto L9a
        L91:
            com.dyson.mobile.android.robot.newsystem.common.model.a$a r4 = com.dyson.mobile.android.robot.newsystem.common.model.a.Companion
            r4.getClass()
            com.dyson.mobile.android.robot.newsystem.common.model.a r4 = com.dyson.mobile.android.robot.newsystem.common.model.a.access$getDEFAULT$cp()
        L9a:
            java.lang.Integer r5 = r10.f15989h
            if (r5 == 0) goto La8
            int r5 = r5.intValue()
            com.dyson.mobile.android.robot.newsystem.common.model.a r5 = com.dyson.mobile.android.robot.newsystem.common.model.b.a(r5)
            if (r5 != 0) goto Lb1
        La8:
            com.dyson.mobile.android.robot.newsystem.common.model.a$a r5 = com.dyson.mobile.android.robot.newsystem.common.model.a.Companion
            r5.getClass()
            com.dyson.mobile.android.robot.newsystem.common.model.a r5 = com.dyson.mobile.android.robot.newsystem.common.model.a.access$getDEFAULT$cp()
        Lb1:
            java.lang.Boolean r6 = r10.f15991j
            java.lang.Integer r7 = r10.f15990i
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.robot.cloud.newsystem.common.ZoneSettings.j():com.dyson.mobile.android.robot.newsystem.common.model.CleanSettings");
    }

    public final String toString() {
        d dVar = this.d;
        c cVar = this.e;
        l lVar = this.f15987f;
        Integer num = this.f15988g;
        Integer num2 = this.f15989h;
        Integer num3 = this.f15990i;
        Boolean bool = this.f15991j;
        return "ZoneSettings(cleaningStrategy=" + dVar + ", cleanTypeData=" + cVar + ", waterLevelData=" + lVar + ", mopPassData=" + num + ", vacuumPassData=" + num2 + ", vacuumPowerMode=" + num3 + ", isUvScanOn=" + bool + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        d dVar = this.d;
        if (dVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(dVar.name());
        }
        c cVar = this.e;
        if (cVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(cVar.name());
        }
        l lVar = this.f15987f;
        if (lVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(lVar.name());
        }
        Integer num = this.f15988g;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.f15989h;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        Integer num3 = this.f15990i;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num3.intValue());
        }
        Boolean bool = this.f15991j;
        if (bool == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public ZoneSettings(d dVar, c cVar, l lVar, Integer num, Integer num2, Integer num3, Boolean bool) {
        this.d = dVar;
        this.e = cVar;
        this.f15987f = lVar;
        this.f15988g = num;
        this.f15989h = num2;
        this.f15990i = num3;
        this.f15991j = bool;
    }

    public ZoneSettings() {
        this(null, null, null, null, null, null, null, 127, null);
    }
}
