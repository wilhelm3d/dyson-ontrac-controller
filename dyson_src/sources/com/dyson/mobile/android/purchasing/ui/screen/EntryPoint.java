package com.dyson.mobile.android.purchasing.ui.screen;

import android.os.Parcel;
import android.os.Parcelable;
import bv1.f;
import com.dyson.mobile.android.analytics.tracking.externallink.ExternalLinkTracking;
import kotlin.Metadata;
import lp0.c;
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/dyson/mobile/android/purchasing/ui/screen/EntryPoint;", "Landroid/os/Parcelable;", "EcFilters", "FinishedGoods", "Shop", "Lcom/dyson/mobile/android/purchasing/ui/screen/EntryPoint$EcFilters;", "Lcom/dyson/mobile/android/purchasing/ui/screen/EntryPoint$FinishedGoods;", "Lcom/dyson/mobile/android/purchasing/ui/screen/EntryPoint$Shop;", "mod-purchasing"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface EntryPoint extends Parcelable {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/dyson/mobile/android/purchasing/ui/screen/EntryPoint$EcFilters;", "Lcom/dyson/mobile/android/purchasing/ui/screen/EntryPoint;", "", "machineSerial", "Llp0/a;", "purchaseType", "Llp0/c;", "campaignOrigin", "Lcom/dyson/mobile/android/analytics/tracking/externallink/ExternalLinkTracking;", "tracking", "<init>", "(Ljava/lang/String;Llp0/a;Llp0/c;Lcom/dyson/mobile/android/analytics/tracking/externallink/ExternalLinkTracking;)V", "mod-purchasing"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class EcFilters implements EntryPoint {
        public static final Parcelable.Creator<EcFilters> CREATOR = new a();
        public final String d;
        public final lp0.a e;

        /* renamed from: f  reason: collision with root package name */
        public final c f15588f;

        /* renamed from: g  reason: collision with root package name */
        public final ExternalLinkTracking f15589g;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator<EcFilters> {
            @Override // android.os.Parcelable.Creator
            public final EcFilters createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new EcFilters(parcel.readString(), lp0.a.valueOf(parcel.readString()), c.valueOf(parcel.readString()), (ExternalLinkTracking) parcel.readParcelable(EcFilters.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final EcFilters[] newArray(int i13) {
                return new EcFilters[i13];
            }
        }

        public EcFilters(String str, lp0.a aVar, c cVar, ExternalLinkTracking externalLinkTracking) {
            str.getClass();
            aVar.getClass();
            cVar.getClass();
            externalLinkTracking.getClass();
            this.d = str;
            this.e = aVar;
            this.f15588f = cVar;
            this.f15589g = externalLinkTracking;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof EcFilters) {
                EcFilters ecFilters = (EcFilters) obj;
                return this.d.equals(ecFilters.d) && this.e == ecFilters.e && this.f15588f == ecFilters.f15588f && this.f15589g.equals(ecFilters.f15589g);
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = this.e.hashCode();
            int hashCode2 = this.f15588f.hashCode();
            return this.f15589g.hashCode() + ((hashCode2 + ((hashCode + (this.d.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "EcFilters(machineSerial=" + this.d + ", purchaseType=" + this.e + ", campaignOrigin=" + this.f15588f + ", tracking=" + this.f15589g + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeString(this.d);
            parcel.writeString(this.e.name());
            parcel.writeString(this.f15588f.name());
            parcel.writeParcelable(this.f15589g, i13);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/purchasing/ui/screen/EntryPoint$FinishedGoods;", "Lcom/dyson/mobile/android/purchasing/ui/screen/EntryPoint;", "", "sku", "<init>", "(Ljava/lang/String;)V", "mod-purchasing"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class FinishedGoods implements EntryPoint {
        public static final Parcelable.Creator<FinishedGoods> CREATOR = new a();
        public final String d;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator<FinishedGoods> {
            @Override // android.os.Parcelable.Creator
            public final FinishedGoods createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new FinishedGoods(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final FinishedGoods[] newArray(int i13) {
                return new FinishedGoods[i13];
            }
        }

        public FinishedGoods(String str) {
            str.getClass();
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
            return (obj instanceof FinishedGoods) && this.d.equals(((FinishedGoods) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return f.e("FinishedGoods(sku=", this.d, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/purchasing/ui/screen/EntryPoint$Shop;", "Lcom/dyson/mobile/android/purchasing/ui/screen/EntryPoint;", "<init>", "()V", "mod-purchasing"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Shop implements EntryPoint {
        public static final Shop d = new Shop();
        public static final Parcelable.Creator<Shop> CREATOR = new a();

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator<Shop> {
            @Override // android.os.Parcelable.Creator
            public final Shop createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return Shop.d;
            }

            @Override // android.os.Parcelable.Creator
            public final Shop[] newArray(int i13) {
                return new Shop[i13];
            }
        }

        private Shop() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Shop);
        }

        public final int hashCode() {
            return -444939653;
        }

        public final String toString() {
            return "Shop";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }
}
