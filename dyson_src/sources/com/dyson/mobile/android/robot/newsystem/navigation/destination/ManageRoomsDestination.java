package com.dyson.mobile.android.robot.newsystem.navigation.destination;

import android.os.Parcel;
import android.os.Parcelable;
import b0.y1;
import bv1.f;
import com.dyson.mobile.android.robot.newsystem.mapengine.data.ManageMapAction;
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
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ManageRoomsDestination;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/RobotDestination;", "<init>", "()V", "Graph", "ManageRooms", "ManageRoomsMode", "DeleteRoomPreview", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ManageRoomsDestination$DeleteRoomPreview;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ManageRoomsDestination$Graph;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ManageRoomsDestination$ManageRooms;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ManageRoomsDestination$ManageRoomsMode;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ManageRoomsDestination implements RobotDestination {
    public /* synthetic */ ManageRoomsDestination(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \f2\u00020\u0001:\u0002\r\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ManageRoomsDestination$DeleteRoomPreview;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ManageRoomsDestination;", "", "mapId", "roomId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lx42/w1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lx42/w1;)V", "Companion", "a", "b", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes3.dex */
    public static final class DeleteRoomPreview extends ManageRoomsDestination {
        public final String d;
        public final String e;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<DeleteRoomPreview> CREATOR = new c();

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/dyson/mobile/android/robot/newsystem/navigation/destination/ManageRoomsDestination.DeleteRoomPreview.$serializer", "Lx42/e0;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ManageRoomsDestination$DeleteRoomPreview;", "<init>", "()V", "Lv42/e;", "descriptor", "Lv42/e;", "a", "()Lv42/e;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @e
        /* loaded from: classes3.dex */
        public static final /* synthetic */ class a implements e0<DeleteRoomPreview> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f16497a;
            private static final v42.e descriptor;

            static {
                a aVar = new a();
                f16497a = aVar;
                o1 o1Var = new o1("com.dyson.mobile.android.robot.newsystem.navigation.destination.ManageRoomsDestination.DeleteRoomPreview", aVar, 2);
                o1Var.i("mapId", false);
                o1Var.i("roomId", false);
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
                        str2 = c13.g(eVar2, 1);
                        i13 |= 2;
                    }
                }
                c13.a(eVar2);
                return new DeleteRoomPreview(i13, str, str2, null);
            }

            @Override // x42.e0
            public final t42.b<?>[] c() {
                a2 a2Var = a2.f86824a;
                return new t42.b[]{a2Var, a2Var};
            }

            @Override // t42.h
            public final void d(w42.b bVar, Object obj) {
                DeleteRoomPreview deleteRoomPreview = (DeleteRoomPreview) obj;
                deleteRoomPreview.getClass();
                v42.e eVar = descriptor;
                d c13 = bVar.c(eVar);
                c13.l(eVar, 0, deleteRoomPreview.d);
                c13.l(eVar, 1, deleteRoomPreview.e);
                c13.a(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class c implements Parcelable.Creator<DeleteRoomPreview> {
            @Override // android.os.Parcelable.Creator
            public final DeleteRoomPreview createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new DeleteRoomPreview(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final DeleteRoomPreview[] newArray(int i13) {
                return new DeleteRoomPreview[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ DeleteRoomPreview(int i13, String str, String str2, w1 w1Var) {
            super(null);
            if (3 != (i13 & 3)) {
                l1.g(i13, 3, a.f16497a.a());
                throw null;
            }
            this.d = str;
            this.e = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof DeleteRoomPreview) {
                DeleteRoomPreview deleteRoomPreview = (DeleteRoomPreview) obj;
                return r.c(this.d, deleteRoomPreview.d) && r.c(this.e, deleteRoomPreview.e);
            }
            return false;
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        public final String toString() {
            return y1.j("DeleteRoomPreview(mapId=", this.d, ", roomId=", this.e, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeString(this.d);
            parcel.writeString(this.e);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ManageRoomsDestination$DeleteRoomPreview$b;", "", "<init>", "()V", "Lt42/b;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ManageRoomsDestination$DeleteRoomPreview;", "serializer", "()Lt42/b;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final t42.b<DeleteRoomPreview> serializer() {
                return a.f16497a;
            }

            private b() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeleteRoomPreview(String str, String str2) {
            super(null);
            str.getClass();
            str2.getClass();
            this.d = str;
            this.e = str2;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ManageRoomsDestination$Graph;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ManageRoomsDestination;", "", "mapId", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lx42/w1;", "serializationConstructorMarker", "(ILjava/lang/String;Lx42/w1;)V", "Companion", "a", "b", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes3.dex */
    public static final class Graph extends ManageRoomsDestination {
        public final String d;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<Graph> CREATOR = new c();

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/dyson/mobile/android/robot/newsystem/navigation/destination/ManageRoomsDestination.Graph.$serializer", "Lx42/e0;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ManageRoomsDestination$Graph;", "<init>", "()V", "Lv42/e;", "descriptor", "Lv42/e;", "a", "()Lv42/e;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @e
        /* loaded from: classes3.dex */
        public static final /* synthetic */ class a implements e0<Graph> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f16498a;
            private static final v42.e descriptor;

            static {
                a aVar = new a();
                f16498a = aVar;
                o1 o1Var = new o1("com.dyson.mobile.android.robot.newsystem.navigation.destination.ManageRoomsDestination.Graph", aVar, 1);
                o1Var.i("mapId", false);
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
                while (z13) {
                    int w13 = c13.w(eVar2);
                    if (w13 == -1) {
                        z13 = false;
                    } else if (w13 != 0) {
                        jy1.a.q(w13);
                        return null;
                    } else {
                        str = c13.g(eVar2, 0);
                        i13 = 1;
                    }
                }
                c13.a(eVar2);
                return new Graph(i13, str, null);
            }

            @Override // x42.e0
            public final t42.b<?>[] c() {
                return new t42.b[]{a2.f86824a};
            }

            @Override // t42.h
            public final void d(w42.b bVar, Object obj) {
                Graph graph = (Graph) obj;
                graph.getClass();
                v42.e eVar = descriptor;
                d c13 = bVar.c(eVar);
                c13.l(eVar, 0, graph.d);
                c13.a(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class c implements Parcelable.Creator<Graph> {
            @Override // android.os.Parcelable.Creator
            public final Graph createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new Graph(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Graph[] newArray(int i13) {
                return new Graph[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Graph(int i13, String str, w1 w1Var) {
            super(null);
            if (1 != (i13 & 1)) {
                l1.g(i13, 1, a.f16498a.a());
                throw null;
            }
            this.d = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Graph) && r.c(this.d, ((Graph) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return f.e("Graph(mapId=", this.d, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeString(this.d);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ManageRoomsDestination$Graph$b;", "", "<init>", "()V", "Lt42/b;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ManageRoomsDestination$Graph;", "serializer", "()Lt42/b;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final t42.b<Graph> serializer() {
                return a.f16498a;
            }

            private b() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Graph(String str) {
            super(null);
            str.getClass();
            this.d = str;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ManageRoomsDestination$ManageRooms;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ManageRoomsDestination;", "", "mapId", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lx42/w1;", "serializationConstructorMarker", "(ILjava/lang/String;Lx42/w1;)V", "Companion", "a", "b", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes3.dex */
    public static final class ManageRooms extends ManageRoomsDestination {
        public final String d;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<ManageRooms> CREATOR = new c();

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/dyson/mobile/android/robot/newsystem/navigation/destination/ManageRoomsDestination.ManageRooms.$serializer", "Lx42/e0;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ManageRoomsDestination$ManageRooms;", "<init>", "()V", "Lv42/e;", "descriptor", "Lv42/e;", "a", "()Lv42/e;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @e
        /* loaded from: classes3.dex */
        public static final /* synthetic */ class a implements e0<ManageRooms> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f16499a;
            private static final v42.e descriptor;

            static {
                a aVar = new a();
                f16499a = aVar;
                o1 o1Var = new o1("com.dyson.mobile.android.robot.newsystem.navigation.destination.ManageRoomsDestination.ManageRooms", aVar, 1);
                o1Var.i("mapId", false);
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
                while (z13) {
                    int w13 = c13.w(eVar2);
                    if (w13 == -1) {
                        z13 = false;
                    } else if (w13 != 0) {
                        jy1.a.q(w13);
                        return null;
                    } else {
                        str = c13.g(eVar2, 0);
                        i13 = 1;
                    }
                }
                c13.a(eVar2);
                return new ManageRooms(i13, str, null);
            }

            @Override // x42.e0
            public final t42.b<?>[] c() {
                return new t42.b[]{a2.f86824a};
            }

            @Override // t42.h
            public final void d(w42.b bVar, Object obj) {
                ManageRooms manageRooms = (ManageRooms) obj;
                manageRooms.getClass();
                v42.e eVar = descriptor;
                d c13 = bVar.c(eVar);
                c13.l(eVar, 0, manageRooms.d);
                c13.a(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class c implements Parcelable.Creator<ManageRooms> {
            @Override // android.os.Parcelable.Creator
            public final ManageRooms createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ManageRooms(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ManageRooms[] newArray(int i13) {
                return new ManageRooms[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ManageRooms(int i13, String str, w1 w1Var) {
            super(null);
            if (1 != (i13 & 1)) {
                l1.g(i13, 1, a.f16499a.a());
                throw null;
            }
            this.d = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ManageRooms) && r.c(this.d, ((ManageRooms) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return f.e("ManageRooms(mapId=", this.d, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeString(this.d);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ManageRoomsDestination$ManageRooms$b;", "", "<init>", "()V", "Lt42/b;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ManageRoomsDestination$ManageRooms;", "serializer", "()Lt42/b;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final t42.b<ManageRooms> serializer() {
                return a.f16499a;
            }

            private b() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ManageRooms(String str) {
            super(null);
            str.getClass();
            this.d = str;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \r2\u00020\u0001:\u0002\u000e\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ManageRoomsDestination$ManageRoomsMode;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ManageRoomsDestination;", "", "mapId", "Lcom/dyson/mobile/android/robot/newsystem/mapengine/data/ManageMapAction;", "manageMapAction", "<init>", "(Ljava/lang/String;Lcom/dyson/mobile/android/robot/newsystem/mapengine/data/ManageMapAction;)V", "", "seen0", "Lx42/w1;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/dyson/mobile/android/robot/newsystem/mapengine/data/ManageMapAction;Lx42/w1;)V", "Companion", "a", "b", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes3.dex */
    public static final class ManageRoomsMode extends ManageRoomsDestination {
        public final String d;
        public final ManageMapAction e;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<ManageRoomsMode> CREATOR = new c();

        /* renamed from: f  reason: collision with root package name */
        public static final l<t42.b<Object>>[] f16500f = {null, m.a(n.PUBLICATION, new qy.a(14))};

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/dyson/mobile/android/robot/newsystem/navigation/destination/ManageRoomsDestination.ManageRoomsMode.$serializer", "Lx42/e0;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ManageRoomsDestination$ManageRoomsMode;", "<init>", "()V", "Lv42/e;", "descriptor", "Lv42/e;", "a", "()Lv42/e;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @e
        /* loaded from: classes3.dex */
        public static final /* synthetic */ class a implements e0<ManageRoomsMode> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f16501a;
            private static final v42.e descriptor;

            static {
                a aVar = new a();
                f16501a = aVar;
                o1 o1Var = new o1("com.dyson.mobile.android.robot.newsystem.navigation.destination.ManageRoomsDestination.ManageRoomsMode", aVar, 2);
                o1Var.i("mapId", false);
                o1Var.i("manageMapAction", false);
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
                l<t42.b<Object>>[] lVarArr = ManageRoomsMode.f16500f;
                boolean z13 = true;
                int i13 = 0;
                String str = null;
                ManageMapAction manageMapAction = null;
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
                        manageMapAction = (ManageMapAction) c13.i(eVar2, 1, lVarArr[1].getValue(), manageMapAction);
                        i13 |= 2;
                    }
                }
                c13.a(eVar2);
                return new ManageRoomsMode(i13, str, manageMapAction, null);
            }

            @Override // x42.e0
            public final t42.b<?>[] c() {
                return new t42.b[]{a2.f86824a, ManageRoomsMode.f16500f[1].getValue()};
            }

            @Override // t42.h
            public final void d(w42.b bVar, Object obj) {
                ManageRoomsMode manageRoomsMode = (ManageRoomsMode) obj;
                manageRoomsMode.getClass();
                v42.e eVar = descriptor;
                d c13 = bVar.c(eVar);
                l<t42.b<Object>>[] lVarArr = ManageRoomsMode.f16500f;
                c13.l(eVar, 0, manageRoomsMode.d);
                c13.B(eVar, 1, lVarArr[1].getValue(), manageRoomsMode.e);
                c13.a(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class c implements Parcelable.Creator<ManageRoomsMode> {
            @Override // android.os.Parcelable.Creator
            public final ManageRoomsMode createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ManageRoomsMode(parcel.readString(), ManageMapAction.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final ManageRoomsMode[] newArray(int i13) {
                return new ManageRoomsMode[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ManageRoomsMode(int i13, String str, ManageMapAction manageMapAction, w1 w1Var) {
            super(null);
            if (3 != (i13 & 3)) {
                l1.g(i13, 3, a.f16501a.a());
                throw null;
            }
            this.d = str;
            this.e = manageMapAction;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ManageRoomsMode) {
                ManageRoomsMode manageRoomsMode = (ManageRoomsMode) obj;
                return r.c(this.d, manageRoomsMode.d) && this.e == manageRoomsMode.e;
            }
            return false;
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        public final String toString() {
            return "ManageRoomsMode(mapId=" + this.d + ", manageMapAction=" + this.e + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeString(this.d);
            parcel.writeString(this.e.name());
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ManageRoomsDestination$ManageRoomsMode$b;", "", "<init>", "()V", "Lt42/b;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ManageRoomsDestination$ManageRoomsMode;", "serializer", "()Lt42/b;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final t42.b<ManageRoomsMode> serializer() {
                return a.f16501a;
            }

            private b() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ManageRoomsMode(String str, ManageMapAction manageMapAction) {
            super(null);
            str.getClass();
            manageMapAction.getClass();
            this.d = str;
            this.e = manageMapAction;
        }
    }

    private ManageRoomsDestination() {
    }
}
