package com.dyson.mobile.android.robot.newsystem.navigation.destination;

import android.os.Parcel;
import android.os.Parcelable;
import h12.e;
import h12.l;
import h12.m;
import h12.n;
import h12.y;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t42.b;
import t42.g;
import w42.d;
import x12.r;
import x42.a2;
import x42.e0;
import x42.o1;
import x42.w1;
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/MapManagementDestination;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/RobotDestination;", "<init>", "()V", "Graph", "MapManagement", "MapNameSelection", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/MapManagementDestination$Graph;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/MapManagementDestination$MapManagement;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/MapManagementDestination$MapNameSelection;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class MapManagementDestination implements RobotDestination {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/MapManagementDestination$Graph;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/MapManagementDestination;", "<init>", "()V", "Lt42/b;", "serializer", "()Lt42/b;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes3.dex */
    public static final class Graph extends MapManagementDestination {
        public static final Graph INSTANCE = new Graph();
        public static final Parcelable.Creator<Graph> CREATOR = new a();
        public static final /* synthetic */ l<b<Object>> d = m.a(n.PUBLICATION, new qy.a(16));

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator<Graph> {
            @Override // android.os.Parcelable.Creator
            public final Graph createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return Graph.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final Graph[] newArray(int i13) {
                return new Graph[i13];
            }
        }

        private Graph() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Graph);
        }

        public final int hashCode() {
            return 1546150009;
        }

        public final b<Graph> serializer() {
            return d.getValue();
        }

        public final String toString() {
            return "Graph";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/MapManagementDestination$MapManagement;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/MapManagementDestination;", "<init>", "()V", "Lt42/b;", "serializer", "()Lt42/b;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes3.dex */
    public static final class MapManagement extends MapManagementDestination {
        public static final MapManagement INSTANCE = new MapManagement();
        public static final Parcelable.Creator<MapManagement> CREATOR = new a();
        public static final /* synthetic */ l<b<Object>> d = m.a(n.PUBLICATION, new qy.a(17));

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator<MapManagement> {
            @Override // android.os.Parcelable.Creator
            public final MapManagement createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return MapManagement.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final MapManagement[] newArray(int i13) {
                return new MapManagement[i13];
            }
        }

        private MapManagement() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MapManagement);
        }

        public final int hashCode() {
            return 795294442;
        }

        public final b<MapManagement> serializer() {
            return d.getValue();
        }

        public final String toString() {
            return "MapManagement";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ MapManagementDestination(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u0010B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB?\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/MapManagementDestination$MapNameSelection;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/MapManagementDestination;", "", "mapId", "currentMapName", "", "existingMapNames", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lx42/w1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;Lx42/w1;)V", "Companion", "a", "b", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes3.dex */
    public static final class MapNameSelection extends MapManagementDestination {
        public final String d;
        public final String e;

        /* renamed from: f  reason: collision with root package name */
        public final List<String> f16508f;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<MapNameSelection> CREATOR = new c();

        /* renamed from: g  reason: collision with root package name */
        public static final l<t42.b<Object>>[] f16507g = {null, null, m.a(n.PUBLICATION, new qy.a(18))};

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/dyson/mobile/android/robot/newsystem/navigation/destination/MapManagementDestination.MapNameSelection.$serializer", "Lx42/e0;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/MapManagementDestination$MapNameSelection;", "<init>", "()V", "Lv42/e;", "descriptor", "Lv42/e;", "a", "()Lv42/e;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @e
        /* loaded from: classes3.dex */
        public static final /* synthetic */ class a implements e0<MapNameSelection> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f16509a;
            private static final v42.e descriptor;

            static {
                a aVar = new a();
                f16509a = aVar;
                o1 o1Var = new o1("com.dyson.mobile.android.robot.newsystem.navigation.destination.MapManagementDestination.MapNameSelection", aVar, 3);
                o1Var.i("mapId", true);
                o1Var.i("currentMapName", true);
                o1Var.i("existingMapNames", true);
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
                l<t42.b<Object>>[] lVarArr = MapNameSelection.f16507g;
                boolean z13 = true;
                int i13 = 0;
                String str = null;
                String str2 = null;
                List list = null;
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
                        list = (List) c13.i(eVar2, 2, lVarArr[2].getValue(), list);
                        i13 |= 4;
                    }
                }
                c13.a(eVar2);
                return new MapNameSelection(i13, str, str2, list, (w1) null);
            }

            @Override // x42.e0
            public final t42.b<?>[] c() {
                l<t42.b<Object>>[] lVarArr = MapNameSelection.f16507g;
                a2 a2Var = a2.f86824a;
                return new t42.b[]{a2Var, a2Var, lVarArr[2].getValue()};
            }

            @Override // t42.h
            public final void d(w42.b bVar, Object obj) {
                MapNameSelection mapNameSelection = (MapNameSelection) obj;
                mapNameSelection.getClass();
                List<String> list = mapNameSelection.f16508f;
                String str = mapNameSelection.e;
                String str2 = mapNameSelection.d;
                v42.e eVar = descriptor;
                d c13 = bVar.c(eVar);
                l<t42.b<Object>>[] lVarArr = MapNameSelection.f16507g;
                if (c13.h(eVar) || !r.c(str2, "")) {
                    c13.l(eVar, 0, str2);
                }
                if (c13.h(eVar) || !r.c(str, "")) {
                    c13.l(eVar, 1, str);
                }
                if (c13.h(eVar) || !r.c(list, i12.e0.d)) {
                    c13.B(eVar, 2, lVarArr[2].getValue(), list);
                }
                c13.a(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class c implements Parcelable.Creator<MapNameSelection> {
            @Override // android.os.Parcelable.Creator
            public final MapNameSelection createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new MapNameSelection(parcel.readString(), parcel.readString(), parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            public final MapNameSelection[] newArray(int i13) {
                return new MapNameSelection[i13];
            }
        }

        public MapNameSelection(int i13, String str, String str2, List list, w1 w1Var) {
            super(null);
            if ((i13 & 1) == 0) {
                this.d = "";
            } else {
                this.d = str;
            }
            if ((i13 & 2) == 0) {
                this.e = "";
            } else {
                this.e = str2;
            }
            if ((i13 & 4) == 0) {
                this.f16508f = i12.e0.d;
            } else {
                this.f16508f = list;
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
            if (obj instanceof MapNameSelection) {
                MapNameSelection mapNameSelection = (MapNameSelection) obj;
                return r.c(this.d, mapNameSelection.d) && r.c(this.e, mapNameSelection.e) && r.c(this.f16508f, mapNameSelection.f16508f);
            }
            return false;
        }

        public final int hashCode() {
            return this.f16508f.hashCode() + y.c(this.d.hashCode() * 31, 31, this.e);
        }

        public final String toString() {
            return b0.g.k(ma.e.m("MapNameSelection(mapId=", this.d, ", currentMapName=", this.e, ", existingMapNames="), this.f16508f, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeStringList(this.f16508f);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/MapManagementDestination$MapNameSelection$b;", "", "<init>", "()V", "Lt42/b;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/MapManagementDestination$MapNameSelection;", "serializer", "()Lt42/b;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final t42.b<MapNameSelection> serializer() {
                return a.f16509a;
            }

            private b() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MapNameSelection(String str, String str2, List<String> list) {
            super(null);
            d72.a.x(str, str2, list);
            this.d = str;
            this.e = str2;
            this.f16508f = list;
        }

        public MapNameSelection() {
            this((String) null, (String) null, (List) null, 7, (DefaultConstructorMarker) null);
        }

        public MapNameSelection(String str, String str2, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? i12.e0.d : list);
        }
    }

    private MapManagementDestination() {
    }
}
