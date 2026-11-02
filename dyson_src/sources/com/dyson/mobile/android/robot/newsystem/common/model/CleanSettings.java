package com.dyson.mobile.android.robot.newsystem.common.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.dyson.mobile.android.robot.cloud.newsystem.common.ZoneSettings;
import com.dyson.mobile.android.robot.newsystem.common.model.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nu0.l;
import oi1.s;
import x12.r;
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/common/model/CleanSettings;", "Landroid/os/Parcelable;", "Lcom/dyson/mobile/android/robot/newsystem/common/model/c;", "cleanType", "Lcom/dyson/mobile/android/robot/newsystem/common/model/d;", "vacuumMode", "Lcom/dyson/mobile/android/robot/newsystem/common/model/e;", "waterLevel", "Lcom/dyson/mobile/android/robot/newsystem/common/model/a;", "mopPass", "vacuumPass", "", "isUvScanOn", "", "vacuumPowerMode", "<init>", "(Lcom/dyson/mobile/android/robot/newsystem/common/model/c;Lcom/dyson/mobile/android/robot/newsystem/common/model/d;Lcom/dyson/mobile/android/robot/newsystem/common/model/e;Lcom/dyson/mobile/android/robot/newsystem/common/model/a;Lcom/dyson/mobile/android/robot/newsystem/common/model/a;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CleanSettings implements Parcelable {
    public static final Parcelable.Creator<CleanSettings> CREATOR = new a();
    public final c d;
    public final d e;

    /* renamed from: f  reason: collision with root package name */
    public final e f16305f;

    /* renamed from: g  reason: collision with root package name */
    public final com.dyson.mobile.android.robot.newsystem.common.model.a f16306g;

    /* renamed from: h  reason: collision with root package name */
    public final com.dyson.mobile.android.robot.newsystem.common.model.a f16307h;

    /* renamed from: i  reason: collision with root package name */
    public final Boolean f16308i;

    /* renamed from: j  reason: collision with root package name */
    public final Integer f16309j;

    /* renamed from: k  reason: collision with root package name */
    public final com.dyson.mobile.android.robot.newsystem.common.model.a f16310k;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<CleanSettings> {
        @Override // android.os.Parcelable.Creator
        public final CleanSettings createFromParcel(Parcel parcel) {
            Boolean valueOf;
            parcel.getClass();
            c valueOf2 = c.valueOf(parcel.readString());
            d valueOf3 = d.valueOf(parcel.readString());
            e valueOf4 = e.valueOf(parcel.readString());
            com.dyson.mobile.android.robot.newsystem.common.model.a valueOf5 = com.dyson.mobile.android.robot.newsystem.common.model.a.valueOf(parcel.readString());
            com.dyson.mobile.android.robot.newsystem.common.model.a valueOf6 = com.dyson.mobile.android.robot.newsystem.common.model.a.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new CleanSettings(valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final CleanSettings[] newArray(int i13) {
            return new CleanSettings[i13];
        }
    }

    public CleanSettings(c cVar, d dVar, e eVar, com.dyson.mobile.android.robot.newsystem.common.model.a aVar, com.dyson.mobile.android.robot.newsystem.common.model.a aVar2, Boolean bool, Integer num, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        Integer num2;
        Boolean bool2;
        com.dyson.mobile.android.robot.newsystem.common.model.a aVar3;
        com.dyson.mobile.android.robot.newsystem.common.model.a aVar4;
        d dVar2;
        e eVar2;
        CleanSettings cleanSettings;
        c cVar2;
        if ((i13 & 1) != 0) {
            c.Companion.getClass();
            cVar = c.access$getDEFAULT$cp();
        }
        if ((i13 & 2) != 0) {
            d.Companion.getClass();
            dVar = d.access$getDEFAULT$cp();
        }
        if ((i13 & 4) != 0) {
            e.Companion.getClass();
            eVar = e.access$getDEFAULT$cp();
        }
        if ((i13 & 8) != 0) {
            com.dyson.mobile.android.robot.newsystem.common.model.a.Companion.getClass();
            aVar = com.dyson.mobile.android.robot.newsystem.common.model.a.access$getDEFAULT$cp();
        }
        if ((i13 & 16) != 0) {
            com.dyson.mobile.android.robot.newsystem.common.model.a.Companion.getClass();
            aVar2 = com.dyson.mobile.android.robot.newsystem.common.model.a.access$getDEFAULT$cp();
        }
        bool = (i13 & 32) != 0 ? null : bool;
        if ((i13 & 64) != 0) {
            num2 = null;
            aVar4 = aVar2;
            bool2 = bool;
            eVar2 = eVar;
            aVar3 = aVar;
            cVar2 = cVar;
            dVar2 = dVar;
            cleanSettings = this;
        } else {
            num2 = num;
            bool2 = bool;
            aVar3 = aVar;
            aVar4 = aVar2;
            dVar2 = dVar;
            eVar2 = eVar;
            cleanSettings = this;
            cVar2 = cVar;
        }
        new CleanSettings(cVar2, dVar2, eVar2, aVar3, aVar4, bool2, num2);
    }

    public static CleanSettings a(CleanSettings cleanSettings, c cVar, d dVar, e eVar, com.dyson.mobile.android.robot.newsystem.common.model.a aVar, com.dyson.mobile.android.robot.newsystem.common.model.a aVar2, Boolean bool, int i13) {
        if ((i13 & 1) != 0) {
            cVar = cleanSettings.d;
        }
        c cVar2 = cVar;
        if ((i13 & 2) != 0) {
            dVar = cleanSettings.e;
        }
        d dVar2 = dVar;
        if ((i13 & 4) != 0) {
            eVar = cleanSettings.f16305f;
        }
        e eVar2 = eVar;
        if ((i13 & 8) != 0) {
            aVar = cleanSettings.f16306g;
        }
        com.dyson.mobile.android.robot.newsystem.common.model.a aVar3 = aVar;
        if ((i13 & 16) != 0) {
            aVar2 = cleanSettings.f16307h;
        }
        com.dyson.mobile.android.robot.newsystem.common.model.a aVar4 = aVar2;
        if ((i13 & 32) != 0) {
            bool = cleanSettings.f16308i;
        }
        Integer num = cleanSettings.f16309j;
        cleanSettings.getClass();
        cVar2.getClass();
        dVar2.getClass();
        eVar2.getClass();
        aVar3.getClass();
        aVar4.getClass();
        return new CleanSettings(cVar2, dVar2, eVar2, aVar3, aVar4, bool, num);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CleanSettings) {
            CleanSettings cleanSettings = (CleanSettings) obj;
            return this.d == cleanSettings.d && this.e == cleanSettings.e && this.f16305f == cleanSettings.f16305f && this.f16306g == cleanSettings.f16306g && this.f16307h == cleanSettings.f16307h && r.c(this.f16308i, cleanSettings.f16308i) && r.c(this.f16309j, cleanSettings.f16309j);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.e.hashCode();
        int hashCode2 = this.f16305f.hashCode();
        int hashCode3 = (this.f16307h.hashCode() + ((this.f16306g.hashCode() + ((hashCode2 + ((hashCode + (this.d.hashCode() * 31)) * 31)) * 31)) * 31)) * 31;
        Boolean bool = this.f16308i;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num = this.f16309j;
        return hashCode4 + (num != null ? num.hashCode() : 0);
    }

    public final ZoneSettings i() {
        ky0.d dVar;
        nu0.c cVar;
        l lVar;
        nu0.a aVar;
        nu0.a aVar2;
        d dVar2 = this.e;
        dVar2.getClass();
        int i13 = b.a.f16313c[dVar2.ordinal()];
        if (i13 == 1) {
            dVar = ky0.d.AUTO;
        } else if (i13 == 2) {
            dVar = ky0.d.QUICK;
        } else if (i13 == 3) {
            dVar = ky0.d.QUIET;
        } else if (i13 != 4) {
            ma.e.o();
            return null;
        } else {
            dVar = ky0.d.BOOST;
        }
        ky0.d dVar3 = dVar;
        c cVar2 = this.d;
        cVar2.getClass();
        int i14 = b.a.f16311a[cVar2.ordinal()];
        if (i14 == 1) {
            cVar = nu0.c.VACUUM_AND_MOP;
        } else if (i14 == 2) {
            cVar = nu0.c.VACUUM;
        } else if (i14 == 3) {
            cVar = nu0.c.MOP;
        } else if (i14 != 4) {
            ma.e.o();
            return null;
        } else {
            cVar = nu0.c.VACUUM_THEN_MOP;
        }
        nu0.c cVar3 = cVar;
        e eVar = this.f16305f;
        eVar.getClass();
        int i15 = b.a.e[eVar.ordinal()];
        if (i15 == 1) {
            lVar = l.VERY_LOW;
        } else if (i15 == 2) {
            lVar = l.LOW;
        } else if (i15 == 3) {
            lVar = l.MEDIUM;
        } else if (i15 != 4) {
            ma.e.o();
            return null;
        } else {
            lVar = l.HIGH;
        }
        l lVar2 = lVar;
        com.dyson.mobile.android.robot.newsystem.common.model.a aVar3 = this.f16306g;
        aVar3.getClass();
        int[] iArr = b.a.f16315g;
        int i16 = iArr[aVar3.ordinal()];
        if (i16 == 1) {
            aVar = nu0.a.ONE;
        } else if (i16 != 2) {
            ma.e.o();
            return null;
        } else {
            aVar = nu0.a.TWO;
        }
        int apiValue = aVar.getApiValue();
        com.dyson.mobile.android.robot.newsystem.common.model.a aVar4 = this.f16307h;
        aVar4.getClass();
        int i17 = iArr[aVar4.ordinal()];
        if (i17 == 1) {
            aVar2 = nu0.a.ONE;
        } else if (i17 != 2) {
            ma.e.o();
            return null;
        } else {
            aVar2 = nu0.a.TWO;
        }
        return new ZoneSettings(dVar3, cVar3, lVar2, Integer.valueOf(apiValue), Integer.valueOf(aVar2.getApiValue()), this.f16309j, this.f16308i);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CleanSettings(cleanType=");
        sb2.append(this.d);
        sb2.append(", vacuumMode=");
        sb2.append(this.e);
        sb2.append(", waterLevel=");
        sb2.append(this.f16305f);
        sb2.append(", mopPass=");
        sb2.append(this.f16306g);
        sb2.append(", vacuumPass=");
        sb2.append(this.f16307h);
        sb2.append(", isUvScanOn=");
        sb2.append(this.f16308i);
        sb2.append(", vacuumPowerMode=");
        return s.d(sb2, this.f16309j, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeString(this.d.name());
        parcel.writeString(this.e.name());
        parcel.writeString(this.f16305f.name());
        parcel.writeString(this.f16306g.name());
        parcel.writeString(this.f16307h.name());
        Boolean bool = this.f16308i;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        Integer num = this.f16309j;
        if (num == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(num.intValue());
    }

    public CleanSettings(c cVar, d dVar, e eVar, com.dyson.mobile.android.robot.newsystem.common.model.a aVar, com.dyson.mobile.android.robot.newsystem.common.model.a aVar2, Boolean bool, Integer num) {
        cVar.getClass();
        dVar.getClass();
        eVar.getClass();
        aVar.getClass();
        aVar2.getClass();
        this.d = cVar;
        this.e = dVar;
        this.f16305f = eVar;
        this.f16306g = aVar;
        this.f16307h = aVar2;
        this.f16308i = bool;
        this.f16309j = num;
        aVar2 = aVar2 != aVar ? null : aVar2;
        this.f16310k = aVar2 == null ? com.dyson.mobile.android.robot.newsystem.common.model.a.ONE : aVar2;
    }

    public CleanSettings() {
        this(null, null, null, null, null, null, null, 127, null);
    }
}
