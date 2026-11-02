package com.dyson.mobile.android.robot.newsystem.navigation.destination;

import android.os.Parcel;
import android.os.Parcelable;
import h12.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t42.g;
import w42.d;
import x12.r;
import x42.a2;
import x42.e0;
import x42.l1;
import x42.m0;
import x42.o1;
import x42.w1;
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \f2\u00020\u0001:\u0002\r\u000eB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000b¨\u0006\u000f"}, d2 = {"com/dyson/mobile/android/robot/newsystem/navigation/destination/ScheduleCleanDestination$Graph", "", "", "currentMapName", "", "groupId", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "seen0", "Lx42/w1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Integer;Lx42/w1;)V", "Companion", "a", "b", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
@g
/* loaded from: classes3.dex */
public final class ScheduleCleanDestination$Graph implements RobotDestination {
    public final String d;
    public final Integer e;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<ScheduleCleanDestination$Graph> CREATOR = new c();

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/dyson/mobile/android/robot/newsystem/navigation/destination/ScheduleCleanDestination.Graph.$serializer", "Lx42/e0;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ScheduleCleanDestination$Graph;", "<init>", "()V", "Lv42/e;", "descriptor", "Lv42/e;", "a", "()Lv42/e;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @e
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class a implements e0<ScheduleCleanDestination$Graph> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f16531a;
        private static final v42.e descriptor;

        static {
            a aVar = new a();
            f16531a = aVar;
            o1 o1Var = new o1("com.dyson.mobile.android.robot.newsystem.navigation.destination.ScheduleCleanDestination.Graph", aVar, 2);
            o1Var.i("currentMapName", false);
            o1Var.i("groupId", false);
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
            Integer num = null;
            while (z13) {
                int w13 = c13.w(eVar2);
                if (w13 == -1) {
                    z13 = false;
                } else if (w13 == 0) {
                    str = c13.g(eVar2, 0);
                    i13 |= 1;
                } else if (w13 != 1) {
                    jy1.a.q(w13);
                    return null;
                } else {
                    num = (Integer) c13.A(eVar2, 1, m0.f86890a, num);
                    i13 |= 2;
                }
            }
            c13.a(eVar2);
            return new ScheduleCleanDestination$Graph(i13, str, num, null);
        }

        @Override // x42.e0
        public final t42.b<?>[] c() {
            return new t42.b[]{a2.f86824a, u42.a.a(m0.f86890a)};
        }

        @Override // t42.h
        public final void d(w42.b bVar, Object obj) {
            ScheduleCleanDestination$Graph scheduleCleanDestination$Graph = (ScheduleCleanDestination$Graph) obj;
            scheduleCleanDestination$Graph.getClass();
            v42.e eVar = descriptor;
            d c13 = bVar.c(eVar);
            c13.l(eVar, 0, scheduleCleanDestination$Graph.d);
            c13.s(eVar, 1, m0.f86890a, scheduleCleanDestination$Graph.e);
            c13.a(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c implements Parcelable.Creator<ScheduleCleanDestination$Graph> {
        @Override // android.os.Parcelable.Creator
        public final ScheduleCleanDestination$Graph createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new ScheduleCleanDestination$Graph(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final ScheduleCleanDestination$Graph[] newArray(int i13) {
            return new ScheduleCleanDestination$Graph[i13];
        }
    }

    public /* synthetic */ ScheduleCleanDestination$Graph(int i13, String str, Integer num, w1 w1Var) {
        if (3 != (i13 & 3)) {
            l1.g(i13, 3, a.f16531a.a());
            throw null;
        }
        this.d = str;
        this.e = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ScheduleCleanDestination$Graph) {
            ScheduleCleanDestination$Graph scheduleCleanDestination$Graph = (ScheduleCleanDestination$Graph) obj;
            return r.c(this.d, scheduleCleanDestination$Graph.d) && r.c(this.e, scheduleCleanDestination$Graph.e);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.d.hashCode() * 31;
        Integer num = this.e;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "Graph(currentMapName=" + this.d + ", groupId=" + this.e + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeString(this.d);
        Integer num = this.e;
        if (num == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(num.intValue());
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ScheduleCleanDestination$Graph$b;", "", "<init>", "()V", "Lt42/b;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ScheduleCleanDestination$Graph;", "serializer", "()Lt42/b;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final t42.b<ScheduleCleanDestination$Graph> serializer() {
            return a.f16531a;
        }

        private b() {
        }
    }

    public ScheduleCleanDestination$Graph(String str, Integer num) {
        str.getClass();
        this.d = str;
        this.e = num;
    }
}
