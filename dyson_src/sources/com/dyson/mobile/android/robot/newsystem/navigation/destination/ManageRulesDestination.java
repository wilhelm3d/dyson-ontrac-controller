package com.dyson.mobile.android.robot.newsystem.navigation.destination;

import android.os.Parcel;
import android.os.Parcelable;
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
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ManageRulesDestination;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/RobotDestination;", "Graph", "a", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ManageRulesDestination$Graph;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface ManageRulesDestination extends RobotDestination {

    /* renamed from: l0  reason: collision with root package name */
    public static final a f16502l0 = a.f16506a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ManageRulesDestination$a;", "", "<init>", "()V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ a f16506a = new a();

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000f\u0010B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ManageRulesDestination$Graph;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ManageRulesDestination;", "", "mapId", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ManageRulesEntryPoint;", "entryPoint", "stuckFaultLocation", "<init>", "(Ljava/lang/String;Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ManageRulesEntryPoint;Ljava/lang/String;)V", "", "seen0", "Lx42/w1;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ManageRulesEntryPoint;Ljava/lang/String;Lx42/w1;)V", "Companion", "a", "b", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes3.dex */
    public static final class Graph implements ManageRulesDestination {
        public final String d;
        public final ManageRulesEntryPoint e;

        /* renamed from: f  reason: collision with root package name */
        public final String f16504f;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<Graph> CREATOR = new c();

        /* renamed from: g  reason: collision with root package name */
        public static final l<t42.b<Object>>[] f16503g = {null, m.a(n.PUBLICATION, new qy.a(15)), null};

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/dyson/mobile/android/robot/newsystem/navigation/destination/ManageRulesDestination.Graph.$serializer", "Lx42/e0;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ManageRulesDestination$Graph;", "<init>", "()V", "Lv42/e;", "descriptor", "Lv42/e;", "a", "()Lv42/e;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @e
        /* loaded from: classes3.dex */
        public static final /* synthetic */ class a implements e0<Graph> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f16505a;
            private static final v42.e descriptor;

            static {
                a aVar = new a();
                f16505a = aVar;
                o1 o1Var = new o1("com.dyson.mobile.android.robot.newsystem.navigation.destination.ManageRulesDestination.Graph", aVar, 3);
                o1Var.i("mapId", false);
                o1Var.i("entryPoint", false);
                o1Var.i("stuckFaultLocation", true);
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
                l<t42.b<Object>>[] lVarArr = Graph.f16503g;
                boolean z13 = true;
                int i13 = 0;
                String str = null;
                ManageRulesEntryPoint manageRulesEntryPoint = null;
                String str2 = null;
                while (z13) {
                    int w13 = c13.w(eVar2);
                    if (w13 == -1) {
                        z13 = false;
                    } else if (w13 == 0) {
                        str = c13.g(eVar2, 0);
                        i13 |= 1;
                    } else if (w13 == 1) {
                        manageRulesEntryPoint = (ManageRulesEntryPoint) c13.i(eVar2, 1, lVarArr[1].getValue(), manageRulesEntryPoint);
                        i13 |= 2;
                    } else if (w13 != 2) {
                        jy1.a.q(w13);
                        return null;
                    } else {
                        str2 = (String) c13.A(eVar2, 2, a2.f86824a, str2);
                        i13 |= 4;
                    }
                }
                c13.a(eVar2);
                return new Graph(i13, str, manageRulesEntryPoint, str2, (w1) null);
            }

            @Override // x42.e0
            public final t42.b<?>[] c() {
                l<t42.b<Object>>[] lVarArr = Graph.f16503g;
                a2 a2Var = a2.f86824a;
                return new t42.b[]{a2Var, lVarArr[1].getValue(), u42.a.a(a2Var)};
            }

            @Override // t42.h
            public final void d(w42.b bVar, Object obj) {
                Graph graph = (Graph) obj;
                graph.getClass();
                v42.e eVar = descriptor;
                d c13 = bVar.c(eVar);
                l<t42.b<Object>>[] lVarArr = Graph.f16503g;
                String str = graph.d;
                String str2 = graph.f16504f;
                c13.l(eVar, 0, str);
                c13.B(eVar, 1, lVarArr[1].getValue(), graph.e);
                if (c13.h(eVar) || str2 != null) {
                    c13.s(eVar, 2, a2.f86824a, str2);
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
                return new Graph(parcel.readString(), ManageRulesEntryPoint.valueOf(parcel.readString()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Graph[] newArray(int i13) {
                return new Graph[i13];
            }
        }

        public /* synthetic */ Graph(int i13, String str, ManageRulesEntryPoint manageRulesEntryPoint, String str2, w1 w1Var) {
            if (3 != (i13 & 3)) {
                l1.g(i13, 3, a.f16505a.a());
                throw null;
            }
            this.d = str;
            this.e = manageRulesEntryPoint;
            if ((i13 & 4) == 0) {
                this.f16504f = null;
            } else {
                this.f16504f = str2;
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
                return r.c(this.d, graph.d) && this.e == graph.e && r.c(this.f16504f, graph.f16504f);
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = (this.e.hashCode() + (this.d.hashCode() * 31)) * 31;
            String str = this.f16504f;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Graph(mapId=");
            sb2.append(this.d);
            sb2.append(", entryPoint=");
            sb2.append(this.e);
            sb2.append(", stuckFaultLocation=");
            return ie.a.h(sb2, this.f16504f, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeString(this.d);
            parcel.writeString(this.e.name());
            parcel.writeString(this.f16504f);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ManageRulesDestination$Graph$b;", "", "<init>", "()V", "Lt42/b;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ManageRulesDestination$Graph;", "serializer", "()Lt42/b;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final t42.b<Graph> serializer() {
                return a.f16505a;
            }

            private b() {
            }
        }

        public Graph(String str, ManageRulesEntryPoint manageRulesEntryPoint, String str2) {
            str.getClass();
            manageRulesEntryPoint.getClass();
            this.d = str;
            this.e = manageRulesEntryPoint;
            this.f16504f = str2;
        }

        public /* synthetic */ Graph(String str, ManageRulesEntryPoint manageRulesEntryPoint, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, manageRulesEntryPoint, (i13 & 4) != 0 ? null : str2);
        }
    }
}
