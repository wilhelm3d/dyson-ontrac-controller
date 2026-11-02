package com.dyson.mobile.android.purchasing.ui.screen.payment.paypal.model;

import android.os.Parcel;
import android.os.Parcelable;
import b0.y1;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/purchasing/ui/screen/payment/paypal/model/PayPalRequest;", "Landroid/os/Parcelable;", "", "price", "currencyCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "mod-purchasing"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PayPalRequest implements Parcelable {
    public static final Parcelable.Creator<PayPalRequest> CREATOR = new a();
    public final String d;
    public final String e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<PayPalRequest> {
        @Override // android.os.Parcelable.Creator
        public final PayPalRequest createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new PayPalRequest(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PayPalRequest[] newArray(int i13) {
            return new PayPalRequest[i13];
        }
    }

    public PayPalRequest(String str, String str2) {
        str.getClass();
        str2.getClass();
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
        if (obj instanceof PayPalRequest) {
            PayPalRequest payPalRequest = (PayPalRequest) obj;
            return this.d.equals(payPalRequest.d) && this.e.equals(payPalRequest.e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return y1.j("PayPalRequest(price=", this.d, ", currencyCode=", this.e, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }
}
