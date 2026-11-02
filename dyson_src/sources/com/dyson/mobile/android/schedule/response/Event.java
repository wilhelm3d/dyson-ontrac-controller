package com.dyson.mobile.android.schedule.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.brightcove.player.event.AbstractEvent;
import com.google.gson.annotations.SerializedName;
import go1.f0;
import go1.f2;
import go1.j2;
import go1.m2;
import go1.n2;
import go1.o0;
import go1.s0;
import go1.z;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes3.dex */
public class Event implements Comparable<Event>, Parcelable {
    public static final Parcelable.Creator<Event> CREATOR;

    /* renamed from: j  reason: collision with root package name */
    public static final m2 f16732j;

    /* renamed from: k  reason: collision with root package name */
    public static final n2 f16733k;

    /* renamed from: l  reason: collision with root package name */
    public static final c f16734l;

    /* renamed from: m  reason: collision with root package name */
    public static final f2 f16735m;
    @SerializedName("groupId")
    private int d;
    @SerializedName("days")
    private List<Integer> e;
    @SerializedName(AbstractEvent.START_TIME)

    /* renamed from: f  reason: collision with root package name */
    private String f16736f;
    @SerializedName("weeklyRepeat")

    /* renamed from: g  reason: collision with root package name */
    private boolean f16737g;
    @SerializedName("enabled")

    /* renamed from: h  reason: collision with root package name */
    private boolean f16738h;
    @SerializedName("settings")

    /* renamed from: i  reason: collision with root package name */
    private ScheduleSettings f16739i;

    /* loaded from: classes3.dex */
    public class a extends j2<Event> {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Integer.compare(((Event) obj).d, ((Event) obj2).d);
        }
    }

    /* loaded from: classes3.dex */
    public class b extends j2<Event> {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int intValue = ((Integer) f0.l(((Event) obj).i()).h().get()).intValue();
            int intValue2 = ((Integer) f0.l(((Event) obj2).i()).h().get()).intValue();
            if (intValue == 6 && intValue2 == 0) {
                return -1;
            }
            if (intValue == 0 && intValue2 == 6) {
                return 1;
            }
            return Integer.compare(intValue, intValue2);
        }
    }

    /* loaded from: classes3.dex */
    public class c extends j2<Event> {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return ((Event) obj).l().compareTo(((Event) obj2).l());
        }
    }

    /* loaded from: classes3.dex */
    public class d implements Parcelable.Creator<Event> {
        @Override // android.os.Parcelable.Creator
        public final Event createFromParcel(Parcel parcel) {
            return new Event(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final Event[] newArray(int i13) {
            return new Event[i13];
        }
    }

    static {
        o0.a aVar = new o0.a();
        aVar.g(1, 2);
        aVar.g(2, 3);
        aVar.g(3, 4);
        aVar.g(4, 5);
        aVar.g(5, 6);
        aVar.g(6, 7);
        aVar.g(0, 1);
        f16732j = aVar.b();
        n2 v13 = s0.v(1, 2, 3, 4, 5);
        n2 x13 = s0.x(6, 0);
        s0.a aVar2 = new s0.a();
        aVar2.e(v13);
        aVar2.e(x13);
        f16733k = aVar2.h();
        a aVar3 = new a();
        b bVar = new b();
        c cVar = new c();
        f16734l = cVar;
        f16735m = new f2(new z(Arrays.asList(aVar3, new f2(new z(Arrays.asList(bVar, cVar))))));
        CREATOR = new d();
    }

    public Event(Parcel parcel) {
        this.d = parcel.readInt();
        this.f16736f = parcel.readString();
        this.f16737g = parcel.readByte() != 0;
        this.f16738h = parcel.readByte() != 0;
        this.f16739i = (ScheduleSettings) parcel.readParcelable(ScheduleSettings.class.getClassLoader());
        this.e = parcel.readArrayList(Integer.class.getClassLoader());
    }

    public final void E(boolean z13) {
        this.f16738h = z13;
    }

    public final void F(int i13) {
        this.d = i13;
    }

    public final void H(ScheduleSettings scheduleSettings) {
        this.f16739i = scheduleSettings;
    }

    public final void J(String str) {
        this.f16736f = str;
    }

    public final void K() {
        this.f16737g = true;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Event event) {
        return f16735m.compare(this, event);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && hashCode() == obj.hashCode();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.d), this.e, this.f16736f, Boolean.valueOf(this.f16737g), Boolean.valueOf(this.f16738h), this.f16739i});
    }

    public final List<Integer> i() {
        return this.e;
    }

    public final int j() {
        return this.d;
    }

    public final ScheduleSettings k() {
        return this.f16739i;
    }

    public final String l() {
        return this.f16736f;
    }

    public final boolean p() {
        return this.f16738h;
    }

    public final boolean r() {
        return this.e.size() > 1;
    }

    public final String toString() {
        StringBuffer stringBuffer = new StringBuffer("group=");
        stringBuffer.append(this.d);
        stringBuffer.append(" days=");
        stringBuffer.append(this.e);
        stringBuffer.append(" time=");
        stringBuffer.append(this.f16736f);
        return stringBuffer.toString();
    }

    public final void u(List<Integer> list) {
        this.e = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeInt(this.d);
        parcel.writeString(this.f16736f);
        parcel.writeByte(this.f16737g ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f16738h ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f16739i, i13);
        parcel.writeList(this.e);
    }

    public Event() {
    }
}
