package com.dyson.mobile.android.schedule.response;

import android.os.Parcel;
import android.os.Parcelable;
import cj1.f;
import com.dyson.mobile.android.schedule.response.Event;
import com.dyson.mobile.android.schedule.response.Schedule;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.gson.annotations.SerializedName;
import dg0.p;
import dz1.r;
import go1.a1;
import go1.c3;
import go1.d2;
import go1.f0;
import go1.q2;
import go1.s0;
import go1.t0;
import go1.x0;
import go1.y2;
import go1.z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kz1.a;
import o61.b;
import o61.e;
import rz1.i0;
import rz1.q;
/* loaded from: classes3.dex */
public class Schedule implements Parcelable {
    public static final Parcelable.Creator<Schedule> CREATOR = new a();
    @SerializedName("serial")
    private String d;
    @SerializedName("enabled")
    private boolean e;
    @SerializedName("updatedEvents")

    /* renamed from: f  reason: collision with root package name */
    private Set<Integer> f16740f;
    @SerializedName("events")

    /* renamed from: g  reason: collision with root package name */
    private List<Event> f16741g;

    /* renamed from: h  reason: collision with root package name */
    public transient e f16742h;

    /* loaded from: classes3.dex */
    public class a implements Parcelable.Creator<Schedule> {
        @Override // android.os.Parcelable.Creator
        public final Schedule createFromParcel(Parcel parcel) {
            return new Schedule(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final Schedule[] newArray(int i13) {
            return new Schedule[i13];
        }
    }

    public Schedule(Parcel parcel) {
        this.d = parcel.readString();
        this.e = parcel.readByte() != 0;
        this.f16741g = parcel.readArrayList(Event.class.getClassLoader());
    }

    public final void E(ArrayList arrayList) {
        this.f16741g = arrayList;
    }

    public final void F(HashSet hashSet) {
        this.f16740f = hashSet;
    }

    public final void b(Integer num) {
        if (this.f16740f == null) {
            this.f16740f = new HashSet();
        }
        this.f16740f.add(num);
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
        return Arrays.hashCode(new Object[]{this.d, this.f16741g});
    }

    public final s0 i() {
        return f0.l(this.f16741g).b(new b(this, 0)).b(new b(this, 1)).o();
    }

    public final Event j(Event event) {
        if (f0.l(this.f16741g).a(Predicates.equalTo(event))) {
            s0 n13 = ((t0) l()).n(Integer.valueOf(event.j()));
            n13.getClass();
            return (Event) f0.l(n13).j(Predicates.not(Predicates.equalTo(event))).orNull();
        }
        return null;
    }

    public final z k() {
        List<Event> p13 = p();
        Event.c cVar = Event.f16734l;
        p pVar = new p(p13, 8);
        cVar.getClass();
        return new z(cVar, (Comparator) Preconditions.checkNotNull(pVar));
    }

    public final x0<Integer, Event> l() {
        x0.a aVar = new x0.a();
        aVar.f36145b = (Comparator) Preconditions.checkNotNull(d2.f35966f);
        aVar.f36146c = (Comparator) Preconditions.checkNotNull(Event.f16735m);
        for (Event event : this.f16741g) {
            aVar.b(Integer.valueOf(event.j()), event);
        }
        return aVar.a();
    }

    public final x0<Integer, Event> m(int i13) {
        Object j8;
        Iterable n13 = f0.l(n(i13)).p(new f(2)).n();
        int i14 = a1.f35948f;
        if (n13 instanceof Collection) {
            j8 = a1.s((Collection) n13);
        } else {
            Iterator it = n13.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    a1.a aVar = new a1.a();
                    aVar.c(next);
                    Preconditions.checkNotNull(it);
                    while (it.hasNext()) {
                        aVar.c(it.next());
                    }
                    j8 = aVar.j();
                } else {
                    j8 = new y2(next);
                }
            } else {
                j8 = q2.f36093m;
            }
        }
        x0.a aVar2 = new x0.a();
        for (Map.Entry entry : f0.l(l().m()).b(new ef0.b(j8, 3))) {
            aVar2.b(entry.getKey(), entry.getValue());
        }
        return aVar2.a();
    }

    public final s0 n(final int i13) {
        return f0.l(p()).b(new Predicate() { // from class: o61.a
            @Override // com.google.common.base.Predicate
            public final boolean apply(Object obj) {
                Parcelable.Creator<Schedule> creator = Schedule.CREATOR;
                return ((Event) obj).i().contains(Integer.valueOf(i13));
            }
        }).o();
    }

    public final List<Event> p() {
        i0 A = r.A(l().o());
        o1.a aVar = new o1.a(11);
        a.r rVar = kz1.a.f50213a;
        a.q qVar = a.q.INSTANCE;
        kz1.b.a(aVar, "keySelector is null");
        kz1.b.a(qVar, "collectionSupplier is null");
        return (List) new q(A, aVar, qVar).Z().d();
    }

    public final int q() {
        if (this.f16741g == null) {
            return 0;
        }
        c3<Integer> it = l().f36142h.keySet().iterator();
        int i13 = 0;
        while (it.hasNext()) {
            Integer next = it.next();
            next.getClass();
            s0 n13 = ((t0) l()).n(next);
            n13.getClass();
            i13 += ((Event) n13.get(0)).i().size();
        }
        return i13;
    }

    public final List<Event> r() {
        return this.f16741g;
    }

    public final boolean s() {
        return this.e;
    }

    public final void u(boolean z13) {
        this.e = z13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeString(this.d);
        parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
        parcel.writeList(this.f16741g);
    }
}
