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
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \f2\u00020\u0001:\u0002\r\u000eB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000b¨\u0006\u000f"}, d2 = {"com/dyson/mobile/android/robot/newsystem/navigation/destination/ScheduleCleanDestination$ScheduleForm", "", "", "currentMapName", "", "groupId", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;)V", "seen0", "Lx42/w1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Integer;Lx42/w1;)V", "Companion", "a", "b", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
@g
/* loaded from: classes3.dex */
public final class ScheduleCleanDestination$ScheduleForm implements RobotDestination {
    public final String d;
    public final Integer e;
    public static final b Companion = new b(null);
    public static final Parcelable.Creator<ScheduleCleanDestination$ScheduleForm> CREATOR = new c();

    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/dyson/mobile/android/robot/newsystem/navigation/destination/ScheduleCleanDestination.ScheduleForm.$serializer", "Lx42/e0;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ScheduleCleanDestination$ScheduleForm;", "<init>", "()V", "Lv42/e;", "descriptor", "Lv42/e;", "a", "()Lv42/e;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @e
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class a implements e0<ScheduleCleanDestination$ScheduleForm> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f16532a;
        private static final v42.e descriptor;

        static {
            a aVar = new a();
            f16532a = aVar;
            o1 o1Var = new o1("com.dyson.mobile.android.robot.newsystem.navigation.destination.ScheduleCleanDestination.ScheduleForm", aVar, 2);
            o1Var.i("currentMapName", false);
            o1Var.i("groupId", true);
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
            return new ScheduleCleanDestination$ScheduleForm(i13, str, num, (w1) null);
        }

        @Override // x42.e0
        public final t42.b<?>[] c() {
            return new t42.b[]{a2.f86824a, u42.a.a(m0.f86890a)};
        }

        @Override // t42.h
        public final void d(w42.b bVar, Object obj) {
            ScheduleCleanDestination$ScheduleForm scheduleCleanDestination$ScheduleForm = (ScheduleCleanDestination$ScheduleForm) obj;
            scheduleCleanDestination$ScheduleForm.getClass();
            v42.e eVar = descriptor;
            d c13 = bVar.c(eVar);
            String str = scheduleCleanDestination$ScheduleForm.d;
            Integer num = scheduleCleanDestination$ScheduleForm.e;
            c13.l(eVar, 0, str);
            if (c13.h(eVar) || num != null) {
                c13.s(eVar, 1, m0.f86890a, num);
            }
            c13.a(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c implements Parcelable.Creator<ScheduleCleanDestination$ScheduleForm> {
        @Override // android.os.Parcelable.Creator
        public final ScheduleCleanDestination$ScheduleForm createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new ScheduleCleanDestination$ScheduleForm(parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final ScheduleCleanDestination$ScheduleForm[] newArray(int i13) {
            return new ScheduleCleanDestination$ScheduleForm[i13];
        }
    }

    public /* synthetic */ ScheduleCleanDestination$ScheduleForm(int i13, String str, Integer num, w1 w1Var) {
        if (1 != (i13 & 1)) {
            l1.g(i13, 1, a.f16532a.a());
            throw null;
        }
        this.d = str;
        if ((i13 & 2) == 0) {
            this.e = null;
        } else {
            this.e = num;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ScheduleCleanDestination$ScheduleForm) {
            ScheduleCleanDestination$ScheduleForm scheduleCleanDestination$ScheduleForm = (ScheduleCleanDestination$ScheduleForm) obj;
            return r.c(this.d, scheduleCleanDestination$ScheduleForm.d) && r.c(this.e, scheduleCleanDestination$ScheduleForm.e);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.d.hashCode() * 31;
        Integer num = this.e;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "ScheduleForm(currentMapName=" + this.d + ", groupId=" + this.e + ")";
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

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ScheduleCleanDestination$ScheduleForm$b;", "", "<init>", "()V", "Lt42/b;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ScheduleCleanDestination$ScheduleForm;", "serializer", "()Lt42/b;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final t42.b<ScheduleCleanDestination$ScheduleForm> serializer() {
            return a.f16532a;
        }

        private b() {
        }
    }

    public ScheduleCleanDestination$ScheduleForm(String str, Integer num) {
        str.getClass();
        this.d = str;
        this.e = num;
    }

    public /* synthetic */ ScheduleCleanDestination$ScheduleForm(String str, Integer num, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : num);
    }
}
