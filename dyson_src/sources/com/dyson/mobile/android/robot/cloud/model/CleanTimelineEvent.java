package com.dyson.mobile.android.robot.cloud.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.dyson.mobile.android.utilities.gson.ValidationTypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import hx.v;
import java.util.Date;
import kotlin.Metadata;
import pa.c;
import q62.n;
import x12.r;
@lf1.b(nullIfInvalid = true, value = {CleanTimelineEventValidator.class})
@JsonAdapter(ValidationTypeAdapterFactory.class)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001:\u0002!\"B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/dyson/mobile/android/robot/cloud/model/CleanTimelineEvent;", "Landroid/os/Parcelable;", "Lcom/dyson/mobile/android/robot/cloud/model/CleanTimelineEvent$b;", com.salesforce.marketingcloud.config.a.f20855h, "Ljava/util/Date;", "time", "", "zoneId", "faultCode", "faultType", "Lcom/dyson/mobile/android/robot/cloud/model/CleanTimelineEvent$FaultLocation;", "faultLocation", "<init>", "(Lcom/dyson/mobile/android/robot/cloud/model/CleanTimelineEvent$b;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/dyson/mobile/android/robot/cloud/model/CleanTimelineEvent$FaultLocation;)V", "d", "Lcom/dyson/mobile/android/robot/cloud/model/CleanTimelineEvent$b;", "i", "()Lcom/dyson/mobile/android/robot/cloud/model/CleanTimelineEvent$b;", "e", "Ljava/util/Date;", "m", "()Ljava/util/Date;", "f", "Ljava/lang/String;", "getZoneId", "()Ljava/lang/String;", "g", "j", "h", "l", "Lcom/dyson/mobile/android/robot/cloud/model/CleanTimelineEvent$FaultLocation;", "k", "()Lcom/dyson/mobile/android/robot/cloud/model/CleanTimelineEvent$FaultLocation;", "b", "FaultLocation", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CleanTimelineEvent implements Parcelable {
    public static final Parcelable.Creator<CleanTimelineEvent> CREATOR = new a();
    @SerializedName(com.salesforce.marketingcloud.config.a.f20855h)
    private final b d;
    @SerializedName("time")
    private final Date e;
    @SerializedName("zone")

    /* renamed from: f  reason: collision with root package name */
    private final String f15929f;
    @SerializedName("faultCode")

    /* renamed from: g  reason: collision with root package name */
    private final String f15930g;
    @SerializedName("faultType")

    /* renamed from: h  reason: collision with root package name */
    private final String f15931h;
    @SerializedName("faultLocation")

    /* renamed from: i  reason: collision with root package name */
    private final FaultLocation f15932i;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/dyson/mobile/android/robot/cloud/model/CleanTimelineEvent$FaultLocation;", "Landroid/os/Parcelable;", "", "x", "y", "<init>", "(II)V", "d", "I", "i", "()I", "e", "j", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class FaultLocation implements Parcelable {
        public static final Parcelable.Creator<FaultLocation> CREATOR = new a();
        @SerializedName("x")
        private final int d;
        @SerializedName("y")
        private final int e;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator<FaultLocation> {
            @Override // android.os.Parcelable.Creator
            public final FaultLocation createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new FaultLocation(parcel.readInt(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final FaultLocation[] newArray(int i13) {
                return new FaultLocation[i13];
            }
        }

        public FaultLocation(int i13, int i14) {
            this.d = i13;
            this.e = i14;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof FaultLocation) {
                FaultLocation faultLocation = (FaultLocation) obj;
                return this.d == faultLocation.d && this.e == faultLocation.e;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.e) + (Integer.hashCode(this.d) * 31);
        }

        public final int i() {
            return this.d;
        }

        public final int j() {
            return this.e;
        }

        public final String toString() {
            return c.f("FaultLocation(x=", this.d, ", y=", this.e, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeInt(this.d);
            parcel.writeInt(this.e);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<CleanTimelineEvent> {
        @Override // android.os.Parcelable.Creator
        public final CleanTimelineEvent createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new CleanTimelineEvent(b.valueOf(parcel.readString()), (Date) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : FaultLocation.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final CleanTimelineEvent[] newArray(int i13) {
            return new CleanTimelineEvent[i13];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0015\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/dyson/mobile/android/robot/cloud/model/CleanTimelineEvent$b;", "", "<init>", "(Ljava/lang/String;I)V", "CLEAN_STARTED", "CLEAN_ENDED", "RUN_STARTED", "RUN_ENDED", "ZONE_ENTERED", "ZONE_LEFT", "TRAVERSE_STARTED", "TRAVERSE_ENDED", "ZONE_UNREACHABLE", "PAUSED", "RESUMED", "NEEDS_CHARGE", "CHARGING", "IM_LOST", "FAULT_USER_RECOVERABLE", "FAULT_REPLACE_ON_DOCK", "FAULT_CONTACT_HELPLINE", "FAULT_POWER_CYCLE", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b {
        private static final /* synthetic */ o12.a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        @SerializedName("CLEAN_STARTED")
        public static final b CLEAN_STARTED = new b("CLEAN_STARTED", 0);
        @SerializedName("CLEAN_ENDED")
        public static final b CLEAN_ENDED = new b("CLEAN_ENDED", 1);
        @SerializedName("RUN_STARTED")
        public static final b RUN_STARTED = new b("RUN_STARTED", 2);
        @SerializedName("RUN_ENDED")
        public static final b RUN_ENDED = new b("RUN_ENDED", 3);
        @SerializedName("ZONE_ENTERED")
        public static final b ZONE_ENTERED = new b("ZONE_ENTERED", 4);
        @SerializedName("ZONE_LEFT")
        public static final b ZONE_LEFT = new b("ZONE_LEFT", 5);
        @SerializedName("TRAVERSE_STARTED")
        public static final b TRAVERSE_STARTED = new b("TRAVERSE_STARTED", 6);
        @SerializedName("TRAVERSE_ENDED")
        public static final b TRAVERSE_ENDED = new b("TRAVERSE_ENDED", 7);
        @SerializedName("ZONE_UNREACHABLE")
        public static final b ZONE_UNREACHABLE = new b("ZONE_UNREACHABLE", 8);
        @SerializedName("PAUSED")
        public static final b PAUSED = new b("PAUSED", 9);
        @SerializedName("RESUMED")
        public static final b RESUMED = new b("RESUMED", 10);
        @SerializedName("NEEDS_CHARGE")
        public static final b NEEDS_CHARGE = new b("NEEDS_CHARGE", 11);
        @SerializedName("CHARGING")
        public static final b CHARGING = new b("CHARGING", 12);
        @SerializedName("IM_LOST")
        public static final b IM_LOST = new b("IM_LOST", 13);
        @SerializedName("FAULT_USER_RECOVERABLE")
        public static final b FAULT_USER_RECOVERABLE = new b("FAULT_USER_RECOVERABLE", 14);
        @SerializedName("FAULT_REPLACE_ON_DOCK")
        public static final b FAULT_REPLACE_ON_DOCK = new b("FAULT_REPLACE_ON_DOCK", 15);
        @SerializedName("FAULT_CONTACT_HELPLINE")
        public static final b FAULT_CONTACT_HELPLINE = new b("FAULT_CONTACT_HELPLINE", 16);
        @SerializedName("FAULT_POWER_CYCLE")
        public static final b FAULT_POWER_CYCLE = new b("FAULT_POWER_CYCLE", 17);

        private static final /* synthetic */ b[] $values() {
            return new b[]{CLEAN_STARTED, CLEAN_ENDED, RUN_STARTED, RUN_ENDED, ZONE_ENTERED, ZONE_LEFT, TRAVERSE_STARTED, TRAVERSE_ENDED, ZONE_UNREACHABLE, PAUSED, RESUMED, NEEDS_CHARGE, CHARGING, IM_LOST, FAULT_USER_RECOVERABLE, FAULT_REPLACE_ON_DOCK, FAULT_CONTACT_HELPLINE, FAULT_POWER_CYCLE};
        }

        static {
            b[] $values = $values();
            $VALUES = $values;
            $ENTRIES = v.l($values);
        }

        private b(String str, int i13) {
        }

        public static o12.a<b> getEntries() {
            return $ENTRIES;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    public CleanTimelineEvent(b bVar, Date date, String str, String str2, String str3, FaultLocation faultLocation) {
        bVar.getClass();
        date.getClass();
        this.d = bVar;
        this.e = date;
        this.f15929f = str;
        this.f15930g = str2;
        this.f15931h = str3;
        this.f15932i = faultLocation;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CleanTimelineEvent) {
            CleanTimelineEvent cleanTimelineEvent = (CleanTimelineEvent) obj;
            return this.d == cleanTimelineEvent.d && r.c(this.e, cleanTimelineEvent.e) && r.c(this.f15929f, cleanTimelineEvent.f15929f) && r.c(this.f15930g, cleanTimelineEvent.f15930g) && r.c(this.f15931h, cleanTimelineEvent.f15931h) && r.c(this.f15932i, cleanTimelineEvent.f15932i);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + (this.d.hashCode() * 31)) * 31;
        String str = this.f15929f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f15930g;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f15931h;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        FaultLocation faultLocation = this.f15932i;
        return hashCode4 + (faultLocation != null ? faultLocation.hashCode() : 0);
    }

    public final b i() {
        return this.d;
    }

    public final String j() {
        return this.f15930g;
    }

    public final FaultLocation k() {
        return this.f15932i;
    }

    public final String l() {
        return this.f15931h;
    }

    public final Date m() {
        return this.e;
    }

    public final String toString() {
        b bVar = this.d;
        Date date = this.e;
        String str = this.f15929f;
        String str2 = this.f15930g;
        String str3 = this.f15931h;
        FaultLocation faultLocation = this.f15932i;
        StringBuilder sb2 = new StringBuilder("CleanTimelineEvent(eventName=");
        sb2.append(bVar);
        sb2.append(", time=");
        sb2.append(date);
        sb2.append(", zoneId=");
        n.o(sb2, str, ", faultCode=", str2, ", faultType=");
        sb2.append(str3);
        sb2.append(", faultLocation=");
        sb2.append(faultLocation);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeString(this.d.name());
        parcel.writeSerializable(this.e);
        parcel.writeString(this.f15929f);
        parcel.writeString(this.f15930g);
        parcel.writeString(this.f15931h);
        FaultLocation faultLocation = this.f15932i;
        if (faultLocation == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        faultLocation.writeToParcel(parcel, i13);
    }
}
