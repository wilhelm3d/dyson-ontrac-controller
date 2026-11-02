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
import t42.g;
import w42.d;
import x12.r;
import x42.a2;
import x42.e0;
import x42.l1;
import x42.o1;
import x42.w1;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/RenameRoomDestination;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/RobotDestination;", "<init>", "()V", "Graph", "RoomNameSelection", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/RenameRoomDestination$Graph;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/RenameRoomDestination$RoomNameSelection;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class RenameRoomDestination implements RobotDestination {
    public /* synthetic */ RenameRoomDestination(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00102\u00020\u0001:\u0002\u0011\u0012B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\t\u0010\nBS\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/RenameRoomDestination$Graph;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/RenameRoomDestination;", "", "mapId", "roomId", "currentRoomName", "currentRoomType", "", "existingRoomNames", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lx42/w1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lx42/w1;)V", "Companion", "a", "b", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes3.dex */
    public static final class Graph extends RenameRoomDestination {
        public final String d;
        public final String e;

        /* renamed from: f  reason: collision with root package name */
        public final String f16518f;

        /* renamed from: g  reason: collision with root package name */
        public final String f16519g;

        /* renamed from: h  reason: collision with root package name */
        public final List<String> f16520h;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<Graph> CREATOR = new c();

        /* renamed from: i  reason: collision with root package name */
        public static final l<t42.b<Object>>[] f16517i = {null, null, null, null, m.a(n.PUBLICATION, new qy.a(24))};

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/dyson/mobile/android/robot/newsystem/navigation/destination/RenameRoomDestination.Graph.$serializer", "Lx42/e0;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/RenameRoomDestination$Graph;", "<init>", "()V", "Lv42/e;", "descriptor", "Lv42/e;", "a", "()Lv42/e;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @e
        /* loaded from: classes3.dex */
        public static final /* synthetic */ class a implements e0<Graph> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f16521a;
            private static final v42.e descriptor;

            static {
                a aVar = new a();
                f16521a = aVar;
                o1 o1Var = new o1("com.dyson.mobile.android.robot.newsystem.navigation.destination.RenameRoomDestination.Graph", aVar, 5);
                o1Var.i("mapId", false);
                o1Var.i("roomId", false);
                o1Var.i("currentRoomName", false);
                o1Var.i("currentRoomType", false);
                o1Var.i("existingRoomNames", false);
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
                l<t42.b<Object>>[] lVarArr = Graph.f16517i;
                boolean z13 = true;
                int i13 = 0;
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
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
                    } else if (w13 == 2) {
                        str3 = c13.g(eVar2, 2);
                        i13 |= 4;
                    } else if (w13 == 3) {
                        str4 = c13.g(eVar2, 3);
                        i13 |= 8;
                    } else if (w13 != 4) {
                        jy1.a.q(w13);
                        return null;
                    } else {
                        list = (List) c13.i(eVar2, 4, lVarArr[4].getValue(), list);
                        i13 |= 16;
                    }
                }
                c13.a(eVar2);
                return new Graph(i13, str, str2, str3, str4, list, null);
            }

            @Override // x42.e0
            public final t42.b<?>[] c() {
                l<t42.b<Object>>[] lVarArr = Graph.f16517i;
                a2 a2Var = a2.f86824a;
                return new t42.b[]{a2Var, a2Var, a2Var, a2Var, lVarArr[4].getValue()};
            }

            @Override // t42.h
            public final void d(w42.b bVar, Object obj) {
                Graph graph = (Graph) obj;
                graph.getClass();
                v42.e eVar = descriptor;
                d c13 = bVar.c(eVar);
                l<t42.b<Object>>[] lVarArr = Graph.f16517i;
                c13.l(eVar, 0, graph.d);
                c13.l(eVar, 1, graph.e);
                c13.l(eVar, 2, graph.f16518f);
                c13.l(eVar, 3, graph.f16519g);
                c13.B(eVar, 4, lVarArr[4].getValue(), graph.f16520h);
                c13.a(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class c implements Parcelable.Creator<Graph> {
            @Override // android.os.Parcelable.Creator
            public final Graph createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new Graph(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            public final Graph[] newArray(int i13) {
                return new Graph[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Graph(int i13, String str, String str2, String str3, String str4, List list, w1 w1Var) {
            super(null);
            if (31 != (i13 & 31)) {
                l1.g(i13, 31, a.f16521a.a());
                throw null;
            }
            this.d = str;
            this.e = str2;
            this.f16518f = str3;
            this.f16519g = str4;
            this.f16520h = list;
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
                return r.c(this.d, graph.d) && r.c(this.e, graph.e) && r.c(this.f16518f, graph.f16518f) && r.c(this.f16519g, graph.f16519g) && r.c(this.f16520h, graph.f16520h);
            }
            return false;
        }

        public final int hashCode() {
            return this.f16520h.hashCode() + y.c(y.c(y.c(this.d.hashCode() * 31, 31, this.e), 31, this.f16518f), 31, this.f16519g);
        }

        public final String toString() {
            StringBuilder m13 = ma.e.m("Graph(mapId=", this.d, ", roomId=", this.e, ", currentRoomName=");
            q62.n.o(m13, this.f16518f, ", currentRoomType=", this.f16519g, ", existingRoomNames=");
            return b0.g.k(m13, this.f16520h, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeString(this.f16518f);
            parcel.writeString(this.f16519g);
            parcel.writeStringList(this.f16520h);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/RenameRoomDestination$Graph$b;", "", "<init>", "()V", "Lt42/b;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/RenameRoomDestination$Graph;", "serializer", "()Lt42/b;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final t42.b<Graph> serializer() {
                return a.f16521a;
            }

            private b() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Graph(String str, String str2, String str3, String str4, List<String> list) {
            super(null);
            str.getClass();
            str2.getClass();
            str3.getClass();
            str4.getClass();
            list.getClass();
            this.d = str;
            this.e = str2;
            this.f16518f = str3;
            this.f16519g = str4;
            this.f16520h = list;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00102\u00020\u0001:\u0002\u0011\u0012B?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007¢\u0006\u0004\b\t\u0010\nBS\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/RenameRoomDestination$RoomNameSelection;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/RenameRoomDestination;", "", "mapId", "roomId", "currentRoomName", "currentRoomType", "", "existingRoomNames", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lx42/w1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lx42/w1;)V", "Companion", "a", "b", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes3.dex */
    public static final class RoomNameSelection extends RenameRoomDestination {
        public final String d;
        public final String e;

        /* renamed from: f  reason: collision with root package name */
        public final String f16523f;

        /* renamed from: g  reason: collision with root package name */
        public final String f16524g;

        /* renamed from: h  reason: collision with root package name */
        public final List<String> f16525h;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<RoomNameSelection> CREATOR = new c();

        /* renamed from: i  reason: collision with root package name */
        public static final l<t42.b<Object>>[] f16522i = {null, null, null, null, m.a(n.PUBLICATION, new qy.a(25))};

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/dyson/mobile/android/robot/newsystem/navigation/destination/RenameRoomDestination.RoomNameSelection.$serializer", "Lx42/e0;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/RenameRoomDestination$RoomNameSelection;", "<init>", "()V", "Lv42/e;", "descriptor", "Lv42/e;", "a", "()Lv42/e;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @e
        /* loaded from: classes3.dex */
        public static final /* synthetic */ class a implements e0<RoomNameSelection> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f16526a;
            private static final v42.e descriptor;

            static {
                a aVar = new a();
                f16526a = aVar;
                o1 o1Var = new o1("com.dyson.mobile.android.robot.newsystem.navigation.destination.RenameRoomDestination.RoomNameSelection", aVar, 5);
                o1Var.i("mapId", true);
                o1Var.i("roomId", true);
                o1Var.i("currentRoomName", true);
                o1Var.i("currentRoomType", true);
                o1Var.i("existingRoomNames", true);
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
                l<t42.b<Object>>[] lVarArr = RoomNameSelection.f16522i;
                boolean z13 = true;
                int i13 = 0;
                String str = null;
                String str2 = null;
                String str3 = null;
                String str4 = null;
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
                    } else if (w13 == 2) {
                        str3 = c13.g(eVar2, 2);
                        i13 |= 4;
                    } else if (w13 == 3) {
                        str4 = c13.g(eVar2, 3);
                        i13 |= 8;
                    } else if (w13 != 4) {
                        jy1.a.q(w13);
                        return null;
                    } else {
                        list = (List) c13.i(eVar2, 4, lVarArr[4].getValue(), list);
                        i13 |= 16;
                    }
                }
                c13.a(eVar2);
                return new RoomNameSelection(i13, str, str2, str3, str4, list, (w1) null);
            }

            @Override // x42.e0
            public final t42.b<?>[] c() {
                l<t42.b<Object>>[] lVarArr = RoomNameSelection.f16522i;
                a2 a2Var = a2.f86824a;
                return new t42.b[]{a2Var, a2Var, a2Var, a2Var, lVarArr[4].getValue()};
            }

            @Override // t42.h
            public final void d(w42.b bVar, Object obj) {
                RoomNameSelection roomNameSelection = (RoomNameSelection) obj;
                roomNameSelection.getClass();
                List<String> list = roomNameSelection.f16525h;
                String str = roomNameSelection.f16524g;
                String str2 = roomNameSelection.f16523f;
                String str3 = roomNameSelection.e;
                String str4 = roomNameSelection.d;
                v42.e eVar = descriptor;
                d c13 = bVar.c(eVar);
                l<t42.b<Object>>[] lVarArr = RoomNameSelection.f16522i;
                if (c13.h(eVar) || !r.c(str4, "")) {
                    c13.l(eVar, 0, str4);
                }
                if (c13.h(eVar) || !r.c(str3, "")) {
                    c13.l(eVar, 1, str3);
                }
                if (c13.h(eVar) || !r.c(str2, "")) {
                    c13.l(eVar, 2, str2);
                }
                if (c13.h(eVar) || !r.c(str, "")) {
                    c13.l(eVar, 3, str);
                }
                if (c13.h(eVar) || !r.c(list, i12.e0.d)) {
                    c13.B(eVar, 4, lVarArr[4].getValue(), list);
                }
                c13.a(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class c implements Parcelable.Creator<RoomNameSelection> {
            @Override // android.os.Parcelable.Creator
            public final RoomNameSelection createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new RoomNameSelection(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            public final RoomNameSelection[] newArray(int i13) {
                return new RoomNameSelection[i13];
            }
        }

        public RoomNameSelection(int i13, String str, String str2, String str3, String str4, List list, w1 w1Var) {
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
                this.f16523f = "";
            } else {
                this.f16523f = str3;
            }
            if ((i13 & 8) == 0) {
                this.f16524g = "";
            } else {
                this.f16524g = str4;
            }
            if ((i13 & 16) == 0) {
                this.f16525h = i12.e0.d;
            } else {
                this.f16525h = list;
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
            if (obj instanceof RoomNameSelection) {
                RoomNameSelection roomNameSelection = (RoomNameSelection) obj;
                return r.c(this.d, roomNameSelection.d) && r.c(this.e, roomNameSelection.e) && r.c(this.f16523f, roomNameSelection.f16523f) && r.c(this.f16524g, roomNameSelection.f16524g) && r.c(this.f16525h, roomNameSelection.f16525h);
            }
            return false;
        }

        public final int hashCode() {
            return this.f16525h.hashCode() + y.c(y.c(y.c(this.d.hashCode() * 31, 31, this.e), 31, this.f16523f), 31, this.f16524g);
        }

        public final String toString() {
            StringBuilder m13 = ma.e.m("RoomNameSelection(mapId=", this.d, ", roomId=", this.e, ", currentRoomName=");
            q62.n.o(m13, this.f16523f, ", currentRoomType=", this.f16524g, ", existingRoomNames=");
            return b0.g.k(m13, this.f16525h, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeString(this.f16523f);
            parcel.writeString(this.f16524g);
            parcel.writeStringList(this.f16525h);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/RenameRoomDestination$RoomNameSelection$b;", "", "<init>", "()V", "Lt42/b;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/RenameRoomDestination$RoomNameSelection;", "serializer", "()Lt42/b;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final t42.b<RoomNameSelection> serializer() {
                return a.f16526a;
            }

            private b() {
            }
        }

        public RoomNameSelection() {
            this((String) null, (String) null, (String) null, (String) null, (List) null, 31, (DefaultConstructorMarker) null);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RoomNameSelection(String str, String str2, String str3, String str4, List<String> list) {
            super(null);
            str.getClass();
            str2.getClass();
            str3.getClass();
            str4.getClass();
            list.getClass();
            this.d = str;
            this.e = str2;
            this.f16523f = str3;
            this.f16524g = str4;
            this.f16525h = list;
        }

        public RoomNameSelection(String str, String str2, String str3, String str4, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? "" : str4, (i13 & 16) != 0 ? i12.e0.d : list);
        }
    }

    private RenameRoomDestination() {
    }
}
