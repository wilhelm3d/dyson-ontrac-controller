package com.dyson.mobile.android.robot.newsystem.navigation.destination;

import android.os.Parcel;
import android.os.Parcelable;
import com.dyson.mobile.android.robot.newsystem.activityhistory.data.ActivityHistoryMapType;
import h12.e;
import h12.l;
import h12.m;
import h12.n;
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
import y9.w;
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ZoomMapViewDestination;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/RobotDestination;", "<init>", "()V", "Graph", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ZoomMapViewDestination$Graph;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ZoomMapViewDestination implements RobotDestination {
    public /* synthetic */ ZoomMapViewDestination(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000f2\u00020\u0001:\u0002\u0010\u0011B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB7\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ZoomMapViewDestination$Graph;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ZoomMapViewDestination;", "", "id", "", "isOverview", "Lcom/dyson/mobile/android/robot/newsystem/activityhistory/data/ActivityHistoryMapType;", "historyMapType", "<init>", "(Ljava/lang/String;ZLcom/dyson/mobile/android/robot/newsystem/activityhistory/data/ActivityHistoryMapType;)V", "", "seen0", "Lx42/w1;", "serializationConstructorMarker", "(ILjava/lang/String;ZLcom/dyson/mobile/android/robot/newsystem/activityhistory/data/ActivityHistoryMapType;Lx42/w1;)V", "Companion", "a", "b", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes3.dex */
    public static final class Graph extends ZoomMapViewDestination {
        public final String d;
        public final boolean e;

        /* renamed from: f  reason: collision with root package name */
        public final ActivityHistoryMapType f16541f;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<Graph> CREATOR = new c();

        /* renamed from: g  reason: collision with root package name */
        public static final l<t42.b<Object>>[] f16540g = {null, null, m.a(n.PUBLICATION, new r11.b(0))};

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/dyson/mobile/android/robot/newsystem/navigation/destination/ZoomMapViewDestination.Graph.$serializer", "Lx42/e0;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ZoomMapViewDestination$Graph;", "<init>", "()V", "Lv42/e;", "descriptor", "Lv42/e;", "a", "()Lv42/e;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @e
        /* loaded from: classes3.dex */
        public static final /* synthetic */ class a implements e0<Graph> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f16542a;
            private static final v42.e descriptor;

            static {
                a aVar = new a();
                f16542a = aVar;
                o1 o1Var = new o1("com.dyson.mobile.android.robot.newsystem.navigation.destination.ZoomMapViewDestination.Graph", aVar, 3);
                o1Var.i("id", false);
                o1Var.i("isOverview", false);
                o1Var.i("historyMapType", true);
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
                l<t42.b<Object>>[] lVarArr = Graph.f16540g;
                boolean z13 = true;
                int i13 = 0;
                boolean z14 = false;
                String str = null;
                ActivityHistoryMapType activityHistoryMapType = null;
                while (z13) {
                    int w13 = c13.w(eVar2);
                    if (w13 == -1) {
                        z13 = false;
                    } else if (w13 == 0) {
                        str = c13.g(eVar2, 0);
                        i13 |= 1;
                    } else if (w13 == 1) {
                        z14 = c13.v(eVar2, 1);
                        i13 |= 2;
                    } else if (w13 != 2) {
                        jy1.a.q(w13);
                        return null;
                    } else {
                        activityHistoryMapType = (ActivityHistoryMapType) c13.i(eVar2, 2, lVarArr[2].getValue(), activityHistoryMapType);
                        i13 |= 4;
                    }
                }
                c13.a(eVar2);
                return new Graph(i13, str, z14, activityHistoryMapType, (w1) null);
            }

            @Override // x42.e0
            public final t42.b<?>[] c() {
                return new t42.b[]{a2.f86824a, x42.g.f86854a, Graph.f16540g[2].getValue()};
            }

            @Override // t42.h
            public final void d(w42.b bVar, Object obj) {
                Graph graph = (Graph) obj;
                graph.getClass();
                v42.e eVar = descriptor;
                d c13 = bVar.c(eVar);
                l<t42.b<Object>>[] lVarArr = Graph.f16540g;
                String str = graph.d;
                ActivityHistoryMapType activityHistoryMapType = graph.f16541f;
                c13.l(eVar, 0, str);
                c13.n(eVar, 1, graph.e);
                if (c13.h(eVar) || activityHistoryMapType != ActivityHistoryMapType.CLEAN_PATHS) {
                    c13.B(eVar, 2, lVarArr[2].getValue(), activityHistoryMapType);
                }
                c13.a(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class c implements Parcelable.Creator<Graph> {
            @Override // android.os.Parcelable.Creator
            public final Graph createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new Graph(parcel.readString(), parcel.readInt() != 0, ActivityHistoryMapType.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Graph[] newArray(int i13) {
                return new Graph[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Graph(int i13, String str, boolean z13, ActivityHistoryMapType activityHistoryMapType, w1 w1Var) {
            super(null);
            if (3 != (i13 & 3)) {
                l1.g(i13, 3, a.f16542a.a());
                throw null;
            }
            this.d = str;
            this.e = z13;
            if ((i13 & 4) == 0) {
                this.f16541f = ActivityHistoryMapType.CLEAN_PATHS;
            } else {
                this.f16541f = activityHistoryMapType;
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
            if (obj instanceof Graph) {
                Graph graph = (Graph) obj;
                return r.c(this.d, graph.d) && this.e == graph.e && this.f16541f == graph.f16541f;
            }
            return false;
        }

        public final int hashCode() {
            return this.f16541f.hashCode() + w.c(this.d.hashCode() * 31, 31, this.e);
        }

        public final String toString() {
            StringBuilder m13 = d72.a.m("Graph(id=", this.d, ", isOverview=", this.e, ", historyMapType=");
            m13.append(this.f16541f);
            m13.append(")");
            return m13.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeString(this.d);
            parcel.writeInt(this.e ? 1 : 0);
            parcel.writeString(this.f16541f.name());
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ZoomMapViewDestination$Graph$b;", "", "<init>", "()V", "Lt42/b;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ZoomMapViewDestination$Graph;", "serializer", "()Lt42/b;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final t42.b<Graph> serializer() {
                return a.f16542a;
            }

            private b() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Graph(String str, boolean z13, ActivityHistoryMapType activityHistoryMapType) {
            super(null);
            str.getClass();
            activityHistoryMapType.getClass();
            this.d = str;
            this.e = z13;
            this.f16541f = activityHistoryMapType;
        }

        public /* synthetic */ Graph(String str, boolean z13, ActivityHistoryMapType activityHistoryMapType, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, z13, (i13 & 4) != 0 ? ActivityHistoryMapType.CLEAN_PATHS : activityHistoryMapType);
        }
    }

    private ZoomMapViewDestination() {
    }
}
