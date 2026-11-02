package com.dyson.mobile.android.connectedhaircare.ui.home.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.dyson.mobile.android.connectedhaircare.ui.home.settingstab.heat.HeatSettingsType;
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
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/SettingsDestination;", "Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/ConnectedHaircareHomeDestination;", "<init>", "()V", "HeatSettings", "IdCurlSettings", "FilterStatus", "RemoveMachine", "Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/SettingsDestination$FilterStatus;", "Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/SettingsDestination$HeatSettings;", "Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/SettingsDestination$IdCurlSettings;", "Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/SettingsDestination$RemoveMachine;", "mod-connected-haircare"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class SettingsDestination implements ConnectedHaircareHomeDestination {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/SettingsDestination$FilterStatus;", "Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/SettingsDestination;", "<init>", "()V", "Lt42/b;", "serializer", "()Lt42/b;", "mod-connected-haircare"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes2.dex */
    public static final class FilterStatus extends SettingsDestination {
        public static final FilterStatus INSTANCE = new FilterStatus();
        public static final Parcelable.Creator<FilterStatus> CREATOR = new a();
        public static final /* synthetic */ l<b<Object>> d = m.a(n.PUBLICATION, new qr1.a(24));

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class a implements Parcelable.Creator<FilterStatus> {
            @Override // android.os.Parcelable.Creator
            public final FilterStatus createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return FilterStatus.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final FilterStatus[] newArray(int i13) {
                return new FilterStatus[i13];
            }
        }

        private FilterStatus() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FilterStatus);
        }

        public final int hashCode() {
            return -568313709;
        }

        public final b<FilterStatus> serializer() {
            return d.getValue();
        }

        public final String toString() {
            return "FilterStatus";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/SettingsDestination$RemoveMachine;", "Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/SettingsDestination;", "<init>", "()V", "Lt42/b;", "serializer", "()Lt42/b;", "mod-connected-haircare"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes2.dex */
    public static final class RemoveMachine extends SettingsDestination {
        public static final RemoveMachine INSTANCE = new RemoveMachine();
        public static final Parcelable.Creator<RemoveMachine> CREATOR = new a();
        public static final /* synthetic */ l<b<Object>> d = m.a(n.PUBLICATION, new qy.a(0));

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class a implements Parcelable.Creator<RemoveMachine> {
            @Override // android.os.Parcelable.Creator
            public final RemoveMachine createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return RemoveMachine.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final RemoveMachine[] newArray(int i13) {
                return new RemoveMachine[i13];
            }
        }

        private RemoveMachine() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RemoveMachine);
        }

        public final int hashCode() {
            return -115655366;
        }

        public final b<RemoveMachine> serializer() {
            return d.getValue();
        }

        public final String toString() {
            return "RemoveMachine";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ SettingsDestination(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/SettingsDestination$HeatSettings;", "Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/SettingsDestination;", "Lcom/dyson/mobile/android/connectedhaircare/ui/home/settingstab/heat/HeatSettingsType;", "heatSettingType", "<init>", "(Lcom/dyson/mobile/android/connectedhaircare/ui/home/settingstab/heat/HeatSettingsType;)V", "", "seen0", "Lx42/w1;", "serializationConstructorMarker", "(ILcom/dyson/mobile/android/connectedhaircare/ui/home/settingstab/heat/HeatSettingsType;Lx42/w1;)V", "Companion", "a", "b", "mod-connected-haircare"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes2.dex */
    public static final class HeatSettings extends SettingsDestination {
        public final HeatSettingsType d;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<HeatSettings> CREATOR = new c();
        public static final l<t42.b<Object>>[] e = {m.a(n.PUBLICATION, new qr1.a(25))};

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/dyson/mobile/android/connectedhaircare/ui/home/navigation/SettingsDestination.HeatSettings.$serializer", "Lx42/e0;", "Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/SettingsDestination$HeatSettings;", "<init>", "()V", "Lv42/e;", "descriptor", "Lv42/e;", "a", "()Lv42/e;", "mod-connected-haircare"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @e
        /* loaded from: classes2.dex */
        public static final /* synthetic */ class a implements e0<HeatSettings> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f12945a;
            private static final v42.e descriptor;

            static {
                a aVar = new a();
                f12945a = aVar;
                o1 o1Var = new o1("com.dyson.mobile.android.connectedhaircare.ui.home.navigation.SettingsDestination.HeatSettings", aVar, 1);
                o1Var.i("heatSettingType", false);
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
                l<t42.b<Object>>[] lVarArr = HeatSettings.e;
                boolean z13 = true;
                int i13 = 0;
                HeatSettingsType heatSettingsType = null;
                while (z13) {
                    int w13 = c13.w(eVar2);
                    if (w13 == -1) {
                        z13 = false;
                    } else if (w13 != 0) {
                        jy1.a.q(w13);
                        return null;
                    } else {
                        heatSettingsType = (HeatSettingsType) c13.i(eVar2, 0, lVarArr[0].getValue(), heatSettingsType);
                        i13 = 1;
                    }
                }
                c13.a(eVar2);
                return new HeatSettings(i13, heatSettingsType, null);
            }

            @Override // x42.e0
            public final t42.b<?>[] c() {
                return new t42.b[]{HeatSettings.e[0].getValue()};
            }

            @Override // t42.h
            public final void d(w42.b bVar, Object obj) {
                HeatSettings heatSettings = (HeatSettings) obj;
                heatSettings.getClass();
                v42.e eVar = descriptor;
                d c13 = bVar.c(eVar);
                c13.B(eVar, 0, HeatSettings.e[0].getValue(), heatSettings.d);
                c13.a(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class c implements Parcelable.Creator<HeatSettings> {
            @Override // android.os.Parcelable.Creator
            public final HeatSettings createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new HeatSettings(HeatSettingsType.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final HeatSettings[] newArray(int i13) {
                return new HeatSettings[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ HeatSettings(int i13, HeatSettingsType heatSettingsType, w1 w1Var) {
            super(null);
            if (1 != (i13 & 1)) {
                l1.g(i13, 1, a.f12945a.a());
                throw null;
            }
            this.d = heatSettingsType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof HeatSettings) && this.d == ((HeatSettings) obj).d;
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return "HeatSettings(heatSettingType=" + this.d + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeString(this.d.name());
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/SettingsDestination$HeatSettings$b;", "", "<init>", "()V", "Lt42/b;", "Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/SettingsDestination$HeatSettings;", "serializer", "()Lt42/b;", "mod-connected-haircare"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final t42.b<HeatSettings> serializer() {
                return a.f12945a;
            }

            private b() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HeatSettings(HeatSettingsType heatSettingsType) {
            super(null);
            heatSettingsType.getClass();
            this.d = heatSettingsType;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \t2\u00020\u0001:\u0004\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\b\u0082\u0001\u0003\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/SettingsDestination$IdCurlSettings;", "Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/SettingsDestination;", "<init>", "()V", "", "seen0", "Lx42/w1;", "serializationConstructorMarker", "(ILx42/w1;)V", "Companion", "Graph", "IdCurlEnable", "IdCurlTiming", "a", "Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/SettingsDestination$IdCurlSettings$Graph;", "Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/SettingsDestination$IdCurlSettings$IdCurlEnable;", "Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/SettingsDestination$IdCurlSettings$IdCurlTiming;", "mod-connected-haircare"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes2.dex */
    public static abstract class IdCurlSettings extends SettingsDestination {
        public static final a Companion = new a(null);
        public static final l<b<Object>> d = m.a(n.PUBLICATION, new qr1.a(26));

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/SettingsDestination$IdCurlSettings$Graph;", "Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/SettingsDestination$IdCurlSettings;", "<init>", "()V", "Lt42/b;", "serializer", "()Lt42/b;", "mod-connected-haircare"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @g
        /* loaded from: classes2.dex */
        public static final class Graph extends IdCurlSettings {
            public static final Graph INSTANCE = new Graph();
            public static final Parcelable.Creator<Graph> CREATOR = new a();
            public static final /* synthetic */ l<b<Object>> e = m.a(n.PUBLICATION, new qr1.a(27));

            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* loaded from: classes2.dex */
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
                return -600648845;
            }

            public final b<Graph> serializer() {
                return e.getValue();
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

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/SettingsDestination$IdCurlSettings$IdCurlEnable;", "Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/SettingsDestination$IdCurlSettings;", "<init>", "()V", "Lt42/b;", "serializer", "()Lt42/b;", "mod-connected-haircare"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @g
        /* loaded from: classes2.dex */
        public static final class IdCurlEnable extends IdCurlSettings {
            public static final IdCurlEnable INSTANCE = new IdCurlEnable();
            public static final Parcelable.Creator<IdCurlEnable> CREATOR = new a();
            public static final /* synthetic */ l<b<Object>> e = m.a(n.PUBLICATION, new qr1.a(28));

            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* loaded from: classes2.dex */
            public static final class a implements Parcelable.Creator<IdCurlEnable> {
                @Override // android.os.Parcelable.Creator
                public final IdCurlEnable createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    parcel.readInt();
                    return IdCurlEnable.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final IdCurlEnable[] newArray(int i13) {
                    return new IdCurlEnable[i13];
                }
            }

            private IdCurlEnable() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof IdCurlEnable);
            }

            public final int hashCode() {
                return -1254869883;
            }

            public final b<IdCurlEnable> serializer() {
                return e.getValue();
            }

            public final String toString() {
                return "IdCurlEnable";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i13) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/SettingsDestination$IdCurlSettings$IdCurlTiming;", "Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/SettingsDestination$IdCurlSettings;", "<init>", "()V", "Lt42/b;", "serializer", "()Lt42/b;", "mod-connected-haircare"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @g
        /* loaded from: classes2.dex */
        public static final class IdCurlTiming extends IdCurlSettings {
            public static final IdCurlTiming INSTANCE = new IdCurlTiming();
            public static final Parcelable.Creator<IdCurlTiming> CREATOR = new a();
            public static final /* synthetic */ l<b<Object>> e = m.a(n.PUBLICATION, new qr1.a(29));

            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* loaded from: classes2.dex */
            public static final class a implements Parcelable.Creator<IdCurlTiming> {
                @Override // android.os.Parcelable.Creator
                public final IdCurlTiming createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    parcel.readInt();
                    return IdCurlTiming.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final IdCurlTiming[] newArray(int i13) {
                    return new IdCurlTiming[i13];
                }
            }

            private IdCurlTiming() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof IdCurlTiming);
            }

            public final int hashCode() {
                return -829685940;
            }

            public final b<IdCurlTiming> serializer() {
                return e.getValue();
            }

            public final String toString() {
                return "IdCurlTiming";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i13) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }

        private IdCurlSettings() {
            super(null);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/SettingsDestination$IdCurlSettings$a;", "", "<init>", "()V", "Lt42/b;", "Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/SettingsDestination$IdCurlSettings;", "serializer", "()Lt42/b;", "mod-connected-haircare"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b<IdCurlSettings> serializer() {
                return IdCurlSettings.d.getValue();
            }

            private a() {
            }
        }

        public /* synthetic */ IdCurlSettings(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public /* synthetic */ IdCurlSettings(int i13, w1 w1Var) {
            super(null);
        }
    }

    private SettingsDestination() {
    }
}
