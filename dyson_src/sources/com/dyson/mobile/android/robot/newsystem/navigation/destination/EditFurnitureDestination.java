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
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/EditFurnitureDestination;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/RobotDestination;", "<init>", "()V", "Graph", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/EditFurnitureDestination$Graph;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class EditFurnitureDestination implements RobotDestination {
    public /* synthetic */ EditFurnitureDestination(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \r2\u00020\u0001:\u0002\u000e\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/EditFurnitureDestination$Graph;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/EditFurnitureDestination;", "", "mapId", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/EditFurnitureEntryPoint;", "entryPoint", "<init>", "(Ljava/lang/String;Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/EditFurnitureEntryPoint;)V", "", "seen0", "Lx42/w1;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/EditFurnitureEntryPoint;Lx42/w1;)V", "Companion", "a", "b", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes3.dex */
    public static final class Graph extends EditFurnitureDestination {
        public final String d;
        public final EditFurnitureEntryPoint e;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<Graph> CREATOR = new c();

        /* renamed from: f  reason: collision with root package name */
        public static final l<t42.b<Object>>[] f16495f = {null, m.a(n.PUBLICATION, new qy.a(11))};

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/dyson/mobile/android/robot/newsystem/navigation/destination/EditFurnitureDestination.Graph.$serializer", "Lx42/e0;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/EditFurnitureDestination$Graph;", "<init>", "()V", "Lv42/e;", "descriptor", "Lv42/e;", "a", "()Lv42/e;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @e
        /* loaded from: classes3.dex */
        public static final /* synthetic */ class a implements e0<Graph> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f16496a;
            private static final v42.e descriptor;

            static {
                a aVar = new a();
                f16496a = aVar;
                o1 o1Var = new o1("com.dyson.mobile.android.robot.newsystem.navigation.destination.EditFurnitureDestination.Graph", aVar, 2);
                o1Var.i("mapId", false);
                o1Var.i("entryPoint", false);
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
                l<t42.b<Object>>[] lVarArr = Graph.f16495f;
                boolean z13 = true;
                int i13 = 0;
                String str = null;
                EditFurnitureEntryPoint editFurnitureEntryPoint = null;
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
                        editFurnitureEntryPoint = (EditFurnitureEntryPoint) c13.i(eVar2, 1, lVarArr[1].getValue(), editFurnitureEntryPoint);
                        i13 |= 2;
                    }
                }
                c13.a(eVar2);
                return new Graph(i13, str, editFurnitureEntryPoint, null);
            }

            @Override // x42.e0
            public final t42.b<?>[] c() {
                return new t42.b[]{a2.f86824a, Graph.f16495f[1].getValue()};
            }

            @Override // t42.h
            public final void d(w42.b bVar, Object obj) {
                Graph graph = (Graph) obj;
                graph.getClass();
                v42.e eVar = descriptor;
                d c13 = bVar.c(eVar);
                l<t42.b<Object>>[] lVarArr = Graph.f16495f;
                c13.l(eVar, 0, graph.d);
                c13.B(eVar, 1, lVarArr[1].getValue(), graph.e);
                c13.a(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class c implements Parcelable.Creator<Graph> {
            @Override // android.os.Parcelable.Creator
            public final Graph createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new Graph(parcel.readString(), EditFurnitureEntryPoint.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Graph[] newArray(int i13) {
                return new Graph[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Graph(int i13, String str, EditFurnitureEntryPoint editFurnitureEntryPoint, w1 w1Var) {
            super(null);
            if (3 != (i13 & 3)) {
                l1.g(i13, 3, a.f16496a.a());
                throw null;
            }
            this.d = str;
            this.e = editFurnitureEntryPoint;
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
                return r.c(this.d, graph.d) && this.e == graph.e;
            }
            return false;
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        public final String toString() {
            return "Graph(mapId=" + this.d + ", entryPoint=" + this.e + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeString(this.d);
            parcel.writeString(this.e.name());
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/EditFurnitureDestination$Graph$b;", "", "<init>", "()V", "Lt42/b;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/EditFurnitureDestination$Graph;", "serializer", "()Lt42/b;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final t42.b<Graph> serializer() {
                return a.f16496a;
            }

            private b() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Graph(String str, EditFurnitureEntryPoint editFurnitureEntryPoint) {
            super(null);
            str.getClass();
            editFurnitureEntryPoint.getClass();
            this.d = str;
            this.e = editFurnitureEntryPoint;
        }
    }

    private EditFurnitureDestination() {
    }
}
