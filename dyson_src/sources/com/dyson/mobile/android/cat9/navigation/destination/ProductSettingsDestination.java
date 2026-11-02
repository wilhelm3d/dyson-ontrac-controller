package com.dyson.mobile.android.cat9.navigation.destination;

import android.os.Parcel;
import android.os.Parcelable;
import fy1.d;
import h12.l;
import h12.m;
import h12.n;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t42.b;
import t42.g;
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/dyson/mobile/android/cat9/navigation/destination/ProductSettingsDestination;", "Lcom/dyson/mobile/android/cat9/navigation/destination/OralCareDestination;", "<init>", "()V", "BrushingAlert", "BrushHeadStatus", "BrushHeadInfo", "BrushHeadAuthenticityGenuine", "BrushHeadAuthenticityUnverified", "RemoveProduct", "Lcom/dyson/mobile/android/cat9/navigation/destination/ProductSettingsDestination$BrushHeadAuthenticityGenuine;", "Lcom/dyson/mobile/android/cat9/navigation/destination/ProductSettingsDestination$BrushHeadAuthenticityUnverified;", "Lcom/dyson/mobile/android/cat9/navigation/destination/ProductSettingsDestination$BrushHeadInfo;", "Lcom/dyson/mobile/android/cat9/navigation/destination/ProductSettingsDestination$BrushHeadStatus;", "Lcom/dyson/mobile/android/cat9/navigation/destination/ProductSettingsDestination$BrushingAlert;", "Lcom/dyson/mobile/android/cat9/navigation/destination/ProductSettingsDestination$RemoveProduct;", "mod-cat9-oralcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class ProductSettingsDestination implements OralCareDestination {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/cat9/navigation/destination/ProductSettingsDestination$BrushHeadAuthenticityGenuine;", "Lcom/dyson/mobile/android/cat9/navigation/destination/ProductSettingsDestination;", "<init>", "()V", "Lt42/b;", "serializer", "()Lt42/b;", "mod-cat9-oralcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes2.dex */
    public static final class BrushHeadAuthenticityGenuine extends ProductSettingsDestination {
        public static final BrushHeadAuthenticityGenuine INSTANCE = new BrushHeadAuthenticityGenuine();
        public static final Parcelable.Creator<BrushHeadAuthenticityGenuine> CREATOR = new a();
        public static final /* synthetic */ l<b<Object>> d = m.a(n.PUBLICATION, new d(28));

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class a implements Parcelable.Creator<BrushHeadAuthenticityGenuine> {
            @Override // android.os.Parcelable.Creator
            public final BrushHeadAuthenticityGenuine createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return BrushHeadAuthenticityGenuine.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final BrushHeadAuthenticityGenuine[] newArray(int i13) {
                return new BrushHeadAuthenticityGenuine[i13];
            }
        }

        private BrushHeadAuthenticityGenuine() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BrushHeadAuthenticityGenuine);
        }

        public final int hashCode() {
            return -946881370;
        }

        public final b<BrushHeadAuthenticityGenuine> serializer() {
            return d.getValue();
        }

        public final String toString() {
            return "BrushHeadAuthenticityGenuine";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/cat9/navigation/destination/ProductSettingsDestination$BrushHeadAuthenticityUnverified;", "Lcom/dyson/mobile/android/cat9/navigation/destination/ProductSettingsDestination;", "<init>", "()V", "Lt42/b;", "serializer", "()Lt42/b;", "mod-cat9-oralcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes2.dex */
    public static final class BrushHeadAuthenticityUnverified extends ProductSettingsDestination {
        public static final BrushHeadAuthenticityUnverified INSTANCE = new BrushHeadAuthenticityUnverified();
        public static final Parcelable.Creator<BrushHeadAuthenticityUnverified> CREATOR = new a();
        public static final /* synthetic */ l<b<Object>> d = m.a(n.PUBLICATION, new d(29));

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class a implements Parcelable.Creator<BrushHeadAuthenticityUnverified> {
            @Override // android.os.Parcelable.Creator
            public final BrushHeadAuthenticityUnverified createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return BrushHeadAuthenticityUnverified.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final BrushHeadAuthenticityUnverified[] newArray(int i13) {
                return new BrushHeadAuthenticityUnverified[i13];
            }
        }

        private BrushHeadAuthenticityUnverified() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BrushHeadAuthenticityUnverified);
        }

        public final int hashCode() {
            return -1040501130;
        }

        public final b<BrushHeadAuthenticityUnverified> serializer() {
            return d.getValue();
        }

        public final String toString() {
            return "BrushHeadAuthenticityUnverified";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/cat9/navigation/destination/ProductSettingsDestination$BrushHeadInfo;", "Lcom/dyson/mobile/android/cat9/navigation/destination/ProductSettingsDestination;", "<init>", "()V", "Lt42/b;", "serializer", "()Lt42/b;", "mod-cat9-oralcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes2.dex */
    public static final class BrushHeadInfo extends ProductSettingsDestination {
        public static final BrushHeadInfo INSTANCE = new BrushHeadInfo();
        public static final Parcelable.Creator<BrushHeadInfo> CREATOR = new a();
        public static final /* synthetic */ l<b<Object>> d = m.a(n.PUBLICATION, new gu.a(0));

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class a implements Parcelable.Creator<BrushHeadInfo> {
            @Override // android.os.Parcelable.Creator
            public final BrushHeadInfo createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return BrushHeadInfo.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final BrushHeadInfo[] newArray(int i13) {
                return new BrushHeadInfo[i13];
            }
        }

        private BrushHeadInfo() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BrushHeadInfo);
        }

        public final int hashCode() {
            return -555649038;
        }

        public final b<BrushHeadInfo> serializer() {
            return d.getValue();
        }

        public final String toString() {
            return "BrushHeadInfo";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/cat9/navigation/destination/ProductSettingsDestination$BrushHeadStatus;", "Lcom/dyson/mobile/android/cat9/navigation/destination/ProductSettingsDestination;", "<init>", "()V", "Lt42/b;", "serializer", "()Lt42/b;", "mod-cat9-oralcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes2.dex */
    public static final class BrushHeadStatus extends ProductSettingsDestination {
        public static final BrushHeadStatus INSTANCE = new BrushHeadStatus();
        public static final Parcelable.Creator<BrushHeadStatus> CREATOR = new a();
        public static final /* synthetic */ l<b<Object>> d = m.a(n.PUBLICATION, new gu.a(1));

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class a implements Parcelable.Creator<BrushHeadStatus> {
            @Override // android.os.Parcelable.Creator
            public final BrushHeadStatus createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return BrushHeadStatus.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final BrushHeadStatus[] newArray(int i13) {
                return new BrushHeadStatus[i13];
            }
        }

        private BrushHeadStatus() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BrushHeadStatus);
        }

        public final int hashCode() {
            return -1111088586;
        }

        public final b<BrushHeadStatus> serializer() {
            return d.getValue();
        }

        public final String toString() {
            return "BrushHeadStatus";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/cat9/navigation/destination/ProductSettingsDestination$BrushingAlert;", "Lcom/dyson/mobile/android/cat9/navigation/destination/ProductSettingsDestination;", "<init>", "()V", "Lt42/b;", "serializer", "()Lt42/b;", "mod-cat9-oralcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes2.dex */
    public static final class BrushingAlert extends ProductSettingsDestination {
        public static final BrushingAlert INSTANCE = new BrushingAlert();
        public static final Parcelable.Creator<BrushingAlert> CREATOR = new a();
        public static final /* synthetic */ l<b<Object>> d = m.a(n.PUBLICATION, new gu.a(2));

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class a implements Parcelable.Creator<BrushingAlert> {
            @Override // android.os.Parcelable.Creator
            public final BrushingAlert createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return BrushingAlert.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final BrushingAlert[] newArray(int i13) {
                return new BrushingAlert[i13];
            }
        }

        private BrushingAlert() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BrushingAlert);
        }

        public final int hashCode() {
            return 660601790;
        }

        public final b<BrushingAlert> serializer() {
            return d.getValue();
        }

        public final String toString() {
            return "BrushingAlert";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/cat9/navigation/destination/ProductSettingsDestination$RemoveProduct;", "Lcom/dyson/mobile/android/cat9/navigation/destination/ProductSettingsDestination;", "<init>", "()V", "Lt42/b;", "serializer", "()Lt42/b;", "mod-cat9-oralcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes2.dex */
    public static final class RemoveProduct extends ProductSettingsDestination {
        public static final RemoveProduct INSTANCE = new RemoveProduct();
        public static final Parcelable.Creator<RemoveProduct> CREATOR = new a();
        public static final /* synthetic */ l<b<Object>> d = m.a(n.PUBLICATION, new gu.a(3));

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class a implements Parcelable.Creator<RemoveProduct> {
            @Override // android.os.Parcelable.Creator
            public final RemoveProduct createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return RemoveProduct.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final RemoveProduct[] newArray(int i13) {
                return new RemoveProduct[i13];
            }
        }

        private RemoveProduct() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof RemoveProduct);
        }

        public final int hashCode() {
            return -1849151563;
        }

        public final b<RemoveProduct> serializer() {
            return d.getValue();
        }

        public final String toString() {
            return "RemoveProduct";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ ProductSettingsDestination(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private ProductSettingsDestination() {
    }
}
