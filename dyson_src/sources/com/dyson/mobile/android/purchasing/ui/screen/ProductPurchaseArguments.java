package com.dyson.mobile.android.purchasing.ui.screen;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/purchasing/ui/screen/ProductPurchaseArguments;", "Landroid/os/Parcelable;", "Lcom/dyson/mobile/android/purchasing/ui/screen/EntryPoint;", "entryPoint", "<init>", "(Lcom/dyson/mobile/android/purchasing/ui/screen/EntryPoint;)V", "mod-purchasing"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductPurchaseArguments implements Parcelable {
    public static final Parcelable.Creator<ProductPurchaseArguments> CREATOR = new a();
    public final EntryPoint d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<ProductPurchaseArguments> {
        @Override // android.os.Parcelable.Creator
        public final ProductPurchaseArguments createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new ProductPurchaseArguments((EntryPoint) parcel.readParcelable(ProductPurchaseArguments.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ProductPurchaseArguments[] newArray(int i13) {
            return new ProductPurchaseArguments[i13];
        }
    }

    public ProductPurchaseArguments(EntryPoint entryPoint) {
        entryPoint.getClass();
        this.d = entryPoint;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ProductPurchaseArguments) && this.d.equals(((ProductPurchaseArguments) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return "ProductPurchaseArguments(entryPoint=" + this.d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeParcelable(this.d, i13);
    }
}
