package com.dyson.mobile.android.connectedhaircare.ui.home.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import h12.l;
import h12.m;
import h12.n;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t42.b;
import t42.g;
import x42.w1;
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/OverviewDestination;", "Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/ConnectedHaircareHomeDestination;", "<init>", "()V", "AttachmentDetail", "BluetoothGuidance", "IdCurlSetup", "CurlTimer", "Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/OverviewDestination$AttachmentDetail;", "Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/OverviewDestination$BluetoothGuidance;", "Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/OverviewDestination$CurlTimer;", "Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/OverviewDestination$IdCurlSetup;", "mod-connected-haircare"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class OverviewDestination implements ConnectedHaircareHomeDestination {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/OverviewDestination$AttachmentDetail;", "Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/OverviewDestination;", "<init>", "()V", "Lt42/b;", "serializer", "()Lt42/b;", "mod-connected-haircare"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes2.dex */
    public static final class AttachmentDetail extends OverviewDestination {
        public static final AttachmentDetail INSTANCE = new AttachmentDetail();
        public static final Parcelable.Creator<AttachmentDetail> CREATOR = new a();
        public static final /* synthetic */ l<b<Object>> d = m.a(n.PUBLICATION, new qr1.a(14));

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class a implements Parcelable.Creator<AttachmentDetail> {
            @Override // android.os.Parcelable.Creator
            public final AttachmentDetail createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return AttachmentDetail.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final AttachmentDetail[] newArray(int i13) {
                return new AttachmentDetail[i13];
            }
        }

        private AttachmentDetail() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof AttachmentDetail);
        }

        public final int hashCode() {
            return -2060342733;
        }

        public final b<AttachmentDetail> serializer() {
            return d.getValue();
        }

        public final String toString() {
            return "AttachmentDetail";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/OverviewDestination$IdCurlSetup;", "Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/OverviewDestination;", "<init>", "()V", "Lt42/b;", "serializer", "()Lt42/b;", "mod-connected-haircare"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes2.dex */
    public static final class IdCurlSetup extends OverviewDestination {
        public static final IdCurlSetup INSTANCE = new IdCurlSetup();
        public static final Parcelable.Creator<IdCurlSetup> CREATOR = new a();
        public static final /* synthetic */ l<b<Object>> d = m.a(n.PUBLICATION, new qr1.a(23));

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class a implements Parcelable.Creator<IdCurlSetup> {
            @Override // android.os.Parcelable.Creator
            public final IdCurlSetup createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return IdCurlSetup.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final IdCurlSetup[] newArray(int i13) {
                return new IdCurlSetup[i13];
            }
        }

        private IdCurlSetup() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof IdCurlSetup);
        }

        public final int hashCode() {
            return 2022219415;
        }

        public final b<IdCurlSetup> serializer() {
            return d.getValue();
        }

        public final String toString() {
            return "IdCurlSetup";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ OverviewDestination(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \t2\u00020\u0001:\u0004\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\b\u0082\u0001\u0003\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/OverviewDestination$BluetoothGuidance;", "Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/OverviewDestination;", "<init>", "()V", "", "seen0", "Lx42/w1;", "serializationConstructorMarker", "(ILx42/w1;)V", "Companion", "Graph", "Help", "NeedMoreHelp", "a", "Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/OverviewDestination$BluetoothGuidance$Graph;", "Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/OverviewDestination$BluetoothGuidance$Help;", "Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/OverviewDestination$BluetoothGuidance$NeedMoreHelp;", "mod-connected-haircare"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes2.dex */
    public static abstract class BluetoothGuidance extends OverviewDestination {
        public static final a Companion = new a(null);
        public static final l<b<Object>> d = m.a(n.PUBLICATION, new qr1.a(15));

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/OverviewDestination$BluetoothGuidance$Graph;", "Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/OverviewDestination$BluetoothGuidance;", "<init>", "()V", "Lt42/b;", "serializer", "()Lt42/b;", "mod-connected-haircare"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @g
        /* loaded from: classes2.dex */
        public static final class Graph extends BluetoothGuidance {
            public static final Graph INSTANCE = new Graph();
            public static final Parcelable.Creator<Graph> CREATOR = new a();
            public static final /* synthetic */ l<b<Object>> e = m.a(n.PUBLICATION, new qr1.a(16));

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
                return 1710551463;
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

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/OverviewDestination$BluetoothGuidance$Help;", "Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/OverviewDestination$BluetoothGuidance;", "<init>", "()V", "Lt42/b;", "serializer", "()Lt42/b;", "mod-connected-haircare"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @g
        /* loaded from: classes2.dex */
        public static final class Help extends BluetoothGuidance {
            public static final Help INSTANCE = new Help();
            public static final Parcelable.Creator<Help> CREATOR = new a();
            public static final /* synthetic */ l<b<Object>> e = m.a(n.PUBLICATION, new qr1.a(17));

            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* loaded from: classes2.dex */
            public static final class a implements Parcelable.Creator<Help> {
                @Override // android.os.Parcelable.Creator
                public final Help createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    parcel.readInt();
                    return Help.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final Help[] newArray(int i13) {
                    return new Help[i13];
                }
            }

            private Help() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Help);
            }

            public final int hashCode() {
                return 1025028040;
            }

            public final b<Help> serializer() {
                return e.getValue();
            }

            public final String toString() {
                return "Help";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i13) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/OverviewDestination$BluetoothGuidance$NeedMoreHelp;", "Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/OverviewDestination$BluetoothGuidance;", "<init>", "()V", "Lt42/b;", "serializer", "()Lt42/b;", "mod-connected-haircare"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @g
        /* loaded from: classes2.dex */
        public static final class NeedMoreHelp extends BluetoothGuidance {
            public static final NeedMoreHelp INSTANCE = new NeedMoreHelp();
            public static final Parcelable.Creator<NeedMoreHelp> CREATOR = new a();
            public static final /* synthetic */ l<b<Object>> e = m.a(n.PUBLICATION, new qr1.a(18));

            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* loaded from: classes2.dex */
            public static final class a implements Parcelable.Creator<NeedMoreHelp> {
                @Override // android.os.Parcelable.Creator
                public final NeedMoreHelp createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    parcel.readInt();
                    return NeedMoreHelp.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final NeedMoreHelp[] newArray(int i13) {
                    return new NeedMoreHelp[i13];
                }
            }

            private NeedMoreHelp() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof NeedMoreHelp);
            }

            public final int hashCode() {
                return -970249101;
            }

            public final b<NeedMoreHelp> serializer() {
                return e.getValue();
            }

            public final String toString() {
                return "NeedMoreHelp";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i13) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }

        private BluetoothGuidance() {
            super(null);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/OverviewDestination$BluetoothGuidance$a;", "", "<init>", "()V", "Lt42/b;", "Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/OverviewDestination$BluetoothGuidance;", "serializer", "()Lt42/b;", "mod-connected-haircare"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b<BluetoothGuidance> serializer() {
                return BluetoothGuidance.d.getValue();
            }

            private a() {
            }
        }

        public /* synthetic */ BluetoothGuidance(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public /* synthetic */ BluetoothGuidance(int i13, w1 w1Var) {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \t2\u00020\u0001:\u0004\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0002\u0010\b\u0082\u0001\u0003\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/OverviewDestination$CurlTimer;", "Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/OverviewDestination;", "<init>", "()V", "", "seen0", "Lx42/w1;", "serializationConstructorMarker", "(ILx42/w1;)V", "Companion", "Graph", "Summary", "Adjustment", "a", "Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/OverviewDestination$CurlTimer$Adjustment;", "Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/OverviewDestination$CurlTimer$Graph;", "Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/OverviewDestination$CurlTimer$Summary;", "mod-connected-haircare"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes2.dex */
    public static abstract class CurlTimer extends OverviewDestination {
        public static final a Companion = new a(null);
        public static final l<b<Object>> d = m.a(n.PUBLICATION, new qr1.a(19));

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/OverviewDestination$CurlTimer$Adjustment;", "Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/OverviewDestination$CurlTimer;", "<init>", "()V", "Lt42/b;", "serializer", "()Lt42/b;", "mod-connected-haircare"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @g
        /* loaded from: classes2.dex */
        public static final class Adjustment extends CurlTimer {
            public static final Adjustment INSTANCE = new Adjustment();
            public static final Parcelable.Creator<Adjustment> CREATOR = new a();
            public static final /* synthetic */ l<b<Object>> e = m.a(n.PUBLICATION, new qr1.a(20));

            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* loaded from: classes2.dex */
            public static final class a implements Parcelable.Creator<Adjustment> {
                @Override // android.os.Parcelable.Creator
                public final Adjustment createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    parcel.readInt();
                    return Adjustment.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final Adjustment[] newArray(int i13) {
                    return new Adjustment[i13];
                }
            }

            private Adjustment() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Adjustment);
            }

            public final int hashCode() {
                return -1400655487;
            }

            public final b<Adjustment> serializer() {
                return e.getValue();
            }

            public final String toString() {
                return "Adjustment";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i13) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/OverviewDestination$CurlTimer$Graph;", "Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/OverviewDestination$CurlTimer;", "<init>", "()V", "Lt42/b;", "serializer", "()Lt42/b;", "mod-connected-haircare"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @g
        /* loaded from: classes2.dex */
        public static final class Graph extends CurlTimer {
            public static final Graph INSTANCE = new Graph();
            public static final Parcelable.Creator<Graph> CREATOR = new a();
            public static final /* synthetic */ l<b<Object>> e = m.a(n.PUBLICATION, new qr1.a(21));

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
                return -217595718;
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

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/OverviewDestination$CurlTimer$Summary;", "Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/OverviewDestination$CurlTimer;", "<init>", "()V", "Lt42/b;", "serializer", "()Lt42/b;", "mod-connected-haircare"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @g
        /* loaded from: classes2.dex */
        public static final class Summary extends CurlTimer {
            public static final Summary INSTANCE = new Summary();
            public static final Parcelable.Creator<Summary> CREATOR = new a();
            public static final /* synthetic */ l<b<Object>> e = m.a(n.PUBLICATION, new qr1.a(22));

            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* loaded from: classes2.dex */
            public static final class a implements Parcelable.Creator<Summary> {
                @Override // android.os.Parcelable.Creator
                public final Summary createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    parcel.readInt();
                    return Summary.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final Summary[] newArray(int i13) {
                    return new Summary[i13];
                }
            }

            private Summary() {
                super(null);
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Summary);
            }

            public final int hashCode() {
                return -794067950;
            }

            public final b<Summary> serializer() {
                return e.getValue();
            }

            public final String toString() {
                return "Summary";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i13) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }

        private CurlTimer() {
            super(null);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/OverviewDestination$CurlTimer$a;", "", "<init>", "()V", "Lt42/b;", "Lcom/dyson/mobile/android/connectedhaircare/ui/home/navigation/OverviewDestination$CurlTimer;", "serializer", "()Lt42/b;", "mod-connected-haircare"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b<CurlTimer> serializer() {
                return CurlTimer.d.getValue();
            }

            private a() {
            }
        }

        public /* synthetic */ CurlTimer(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public /* synthetic */ CurlTimer(int i13, w1 w1Var) {
            super(null);
        }
    }

    private OverviewDestination() {
    }
}
