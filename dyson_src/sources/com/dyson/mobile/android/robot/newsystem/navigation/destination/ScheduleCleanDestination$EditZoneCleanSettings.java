package com.dyson.mobile.android.robot.newsystem.navigation.destination;

import android.os.Parcel;
import android.os.Parcelable;
import h12.e;
import h12.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t42.g;
import w42.d;
import x12.r;
import x42.a2;
import x42.e0;
import x42.l1;
import x42.o1;
import x42.w1;
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \r2\u00020\u0001:\u0002\u000e\u000fB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\u0010"}, d2 = {"com/dyson/mobile/android/robot/newsystem/navigation/destination/ScheduleCleanDestination$EditZoneCleanSettings", "", "", "mapId", "zoneId", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lx42/w1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lx42/w1;)V", "Companion", "a", "b", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
@g
/* loaded from: classes3.dex */
public final class ScheduleCleanDestination$EditZoneCleanSettings implements RobotDestination {
    public final String d;
    public final String e;

    /* renamed from: f  reason: collision with root package name */
    public final String f16529f;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<ScheduleCleanDestination$EditZoneCleanSettings> CREATOR = new c();

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/dyson/mobile/android/robot/newsystem/navigation/destination/ScheduleCleanDestination.EditZoneCleanSettings.$serializer", "Lx42/e0;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ScheduleCleanDestination$EditZoneCleanSettings;", "<init>", "()V", "Lv42/e;", "descriptor", "Lv42/e;", "a", "()Lv42/e;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @e
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class a implements e0<ScheduleCleanDestination$EditZoneCleanSettings> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f16530a;
        private static final v42.e descriptor;

        static {
            a aVar = new a();
            f16530a = aVar;
            o1 o1Var = new o1("com.dyson.mobile.android.robot.newsystem.navigation.destination.ScheduleCleanDestination.EditZoneCleanSettings", aVar, 3);
            o1Var.i("mapId", false);
            o1Var.i("zoneId", false);
            o1Var.i("title", false);
            descriptor = o1Var;
        }

        private a() {
        }

        @Override // t42.h, t42.a
        public final v42.e a() {
            return descriptor;
        }

        @Override // t42.a
        public final Object b(w42.e eVar) {
            v42.e eVar2 = descriptor;
            w42.c c13 = eVar.c(eVar2);
            boolean z13 = true;
            int i13 = 0;
            String str = null;
            String str2 = null;
            String str3 = null;
            while (z13) {
                int w13 = c13.w(eVar2);
                if (w13 == -1) {
                    z13 = false;
                } else if (w13 == 0) {
                    str = c13.g(eVar2, 0);
                    i13 |= 1;
                } else if (w13 == 1) {
                    str2 = c13.g(eVar2, 1);
                    i13 |= 2;
                } else if (w13 != 2) {
                    jy1.a.q(w13);
                    return null;
                } else {
                    str3 = c13.g(eVar2, 2);
                    i13 |= 4;
                }
            }
            c13.a(eVar2);
            return new ScheduleCleanDestination$EditZoneCleanSettings(i13, str, str2, str3, null);
        }

        @Override // x42.e0
        public final t42.b<?>[] c() {
            a2 a2Var = a2.f86824a;
            return new t42.b[]{a2Var, a2Var, a2Var};
        }

        @Override // t42.h
        public final void d(w42.b bVar, Object obj) {
            ScheduleCleanDestination$EditZoneCleanSettings scheduleCleanDestination$EditZoneCleanSettings = (ScheduleCleanDestination$EditZoneCleanSettings) obj;
            scheduleCleanDestination$EditZoneCleanSettings.getClass();
            v42.e eVar = descriptor;
            d c13 = bVar.c(eVar);
            c13.l(eVar, 0, scheduleCleanDestination$EditZoneCleanSettings.d);
            c13.l(eVar, 1, scheduleCleanDestination$EditZoneCleanSettings.e);
            c13.l(eVar, 2, scheduleCleanDestination$EditZoneCleanSettings.f16529f);
            c13.a(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c implements Parcelable.Creator<ScheduleCleanDestination$EditZoneCleanSettings> {
        @Override // android.os.Parcelable.Creator
        public final ScheduleCleanDestination$EditZoneCleanSettings createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new ScheduleCleanDestination$EditZoneCleanSettings(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ScheduleCleanDestination$EditZoneCleanSettings[] newArray(int i13) {
            return new ScheduleCleanDestination$EditZoneCleanSettings[i13];
        }
    }

    public /* synthetic */ ScheduleCleanDestination$EditZoneCleanSettings(int i13, String str, String str2, String str3, w1 w1Var) {
        if (7 != (i13 & 7)) {
            l1.g(i13, 7, a.f16530a.a());
            throw null;
        }
        this.d = str;
        this.e = str2;
        this.f16529f = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ScheduleCleanDestination$EditZoneCleanSettings) {
            ScheduleCleanDestination$EditZoneCleanSettings scheduleCleanDestination$EditZoneCleanSettings = (ScheduleCleanDestination$EditZoneCleanSettings) obj;
            return r.c(this.d, scheduleCleanDestination$EditZoneCleanSettings.d) && r.c(this.e, scheduleCleanDestination$EditZoneCleanSettings.e) && r.c(this.f16529f, scheduleCleanDestination$EditZoneCleanSettings.f16529f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16529f.hashCode() + y.c(this.d.hashCode() * 31, 31, this.e);
    }

    public final String toString() {
        return ie.a.h(ma.e.m("EditZoneCleanSettings(mapId=", this.d, ", zoneId=", this.e, ", title="), this.f16529f, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f16529f);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ScheduleCleanDestination$EditZoneCleanSettings$b;", "", "<init>", "()V", "Lt42/b;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ScheduleCleanDestination$EditZoneCleanSettings;", "serializer", "()Lt42/b;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final t42.b<ScheduleCleanDestination$EditZoneCleanSettings> serializer() {
            return a.f16530a;
        }

        private b() {
        }
    }

    public ScheduleCleanDestination$EditZoneCleanSettings(String str, String str2, String str3) {
        d72.a.v(str, str2, str3);
        this.d = str;
        this.e = str2;
        this.f16529f = str3;
    }
}
