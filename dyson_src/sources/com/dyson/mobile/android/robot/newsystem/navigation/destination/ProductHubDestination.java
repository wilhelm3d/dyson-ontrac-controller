package com.dyson.mobile.android.robot.newsystem.navigation.destination;

import android.os.Parcel;
import android.os.Parcelable;
import com.dyson.mobile.android.robot.traits.consumables.ConsumableType;
import h12.e;
import h12.l;
import h12.m;
import h12.n;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t42.b;
import t42.g;
import w42.d;
import x42.e0;
import x42.l1;
import x42.o1;
import x42.w1;
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ProductHubDestination;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/RobotDestination;", "<init>", "()V", "Graph", "ProductHub", "ConsumableDetails", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ProductHubDestination$ConsumableDetails;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ProductHubDestination$Graph;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ProductHubDestination$ProductHub;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ProductHubDestination implements RobotDestination {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ProductHubDestination$Graph;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ProductHubDestination;", "<init>", "()V", "Lt42/b;", "serializer", "()Lt42/b;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes3.dex */
    public static final class Graph extends ProductHubDestination {
        public static final Graph INSTANCE = new Graph();
        public static final Parcelable.Creator<Graph> CREATOR = new a();
        public static final /* synthetic */ l<b<Object>> d = m.a(n.PUBLICATION, new qy.a(20));

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
            return 1183769726;
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

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ProductHubDestination$ProductHub;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ProductHubDestination;", "<init>", "()V", "Lt42/b;", "serializer", "()Lt42/b;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes3.dex */
    public static final class ProductHub extends ProductHubDestination {
        public static final ProductHub INSTANCE = new ProductHub();
        public static final Parcelable.Creator<ProductHub> CREATOR = new a();
        public static final /* synthetic */ l<b<Object>> d = m.a(n.PUBLICATION, new qy.a(21));

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator<ProductHub> {
            @Override // android.os.Parcelable.Creator
            public final ProductHub createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return ProductHub.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final ProductHub[] newArray(int i13) {
                return new ProductHub[i13];
            }
        }

        private ProductHub() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof ProductHub);
        }

        public final int hashCode() {
            return 1880412246;
        }

        public final b<ProductHub> serializer() {
            return d.getValue();
        }

        public final String toString() {
            return "ProductHub";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ ProductHubDestination(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ProductHubDestination$ConsumableDetails;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ProductHubDestination;", "Lcom/dyson/mobile/android/robot/traits/consumables/ConsumableType;", "consumableType", "<init>", "(Lcom/dyson/mobile/android/robot/traits/consumables/ConsumableType;)V", "", "seen0", "Lx42/w1;", "serializationConstructorMarker", "(ILcom/dyson/mobile/android/robot/traits/consumables/ConsumableType;Lx42/w1;)V", "Companion", "a", "b", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes3.dex */
    public static final class ConsumableDetails extends ProductHubDestination {
        public final ConsumableType d;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<ConsumableDetails> CREATOR = new c();
        public static final l<t42.b<Object>>[] e = {m.a(n.PUBLICATION, new qy.a(19))};

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/dyson/mobile/android/robot/newsystem/navigation/destination/ProductHubDestination.ConsumableDetails.$serializer", "Lx42/e0;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ProductHubDestination$ConsumableDetails;", "<init>", "()V", "Lv42/e;", "descriptor", "Lv42/e;", "a", "()Lv42/e;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @e
        /* loaded from: classes3.dex */
        public static final /* synthetic */ class a implements e0<ConsumableDetails> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f16510a;
            private static final v42.e descriptor;

            static {
                a aVar = new a();
                f16510a = aVar;
                o1 o1Var = new o1("com.dyson.mobile.android.robot.newsystem.navigation.destination.ProductHubDestination.ConsumableDetails", aVar, 1);
                o1Var.i("consumableType", false);
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
                l<t42.b<Object>>[] lVarArr = ConsumableDetails.e;
                boolean z13 = true;
                int i13 = 0;
                ConsumableType consumableType = null;
                while (z13) {
                    int w13 = c13.w(eVar2);
                    if (w13 == -1) {
                        z13 = false;
                    } else if (w13 != 0) {
                        jy1.a.q(w13);
                        return null;
                    } else {
                        consumableType = (ConsumableType) c13.i(eVar2, 0, lVarArr[0].getValue(), consumableType);
                        i13 = 1;
                    }
                }
                c13.a(eVar2);
                return new ConsumableDetails(i13, consumableType, null);
            }

            @Override // x42.e0
            public final t42.b<?>[] c() {
                return new t42.b[]{ConsumableDetails.e[0].getValue()};
            }

            @Override // t42.h
            public final void d(w42.b bVar, Object obj) {
                ConsumableDetails consumableDetails = (ConsumableDetails) obj;
                consumableDetails.getClass();
                v42.e eVar = descriptor;
                d c13 = bVar.c(eVar);
                c13.B(eVar, 0, ConsumableDetails.e[0].getValue(), consumableDetails.d);
                c13.a(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class c implements Parcelable.Creator<ConsumableDetails> {
            @Override // android.os.Parcelable.Creator
            public final ConsumableDetails createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ConsumableDetails(ConsumableType.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final ConsumableDetails[] newArray(int i13) {
                return new ConsumableDetails[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ConsumableDetails(int i13, ConsumableType consumableType, w1 w1Var) {
            super(null);
            if (1 != (i13 & 1)) {
                l1.g(i13, 1, a.f16510a.a());
                throw null;
            }
            this.d = consumableType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConsumableDetails) && this.d == ((ConsumableDetails) obj).d;
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return "ConsumableDetails(consumableType=" + this.d + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeString(this.d.name());
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ProductHubDestination$ConsumableDetails$b;", "", "<init>", "()V", "Lt42/b;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ProductHubDestination$ConsumableDetails;", "serializer", "()Lt42/b;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final t42.b<ConsumableDetails> serializer() {
                return a.f16510a;
            }

            private b() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ConsumableDetails(ConsumableType consumableType) {
            super(null);
            consumableType.getClass();
            this.d = consumableType;
        }
    }

    private ProductHubDestination() {
    }
}
