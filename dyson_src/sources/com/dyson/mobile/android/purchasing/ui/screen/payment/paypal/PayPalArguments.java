package com.dyson.mobile.android.purchasing.ui.screen.payment.paypal;

import android.os.Parcel;
import android.os.Parcelable;
import com.dyson.mobile.android.purchasing.ui.screen.payment.paypal.model.PayPalRequest;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/purchasing/ui/screen/payment/paypal/PayPalArguments;", "Landroid/os/Parcelable;", "Lcom/dyson/mobile/android/purchasing/ui/screen/payment/paypal/model/PayPalRequest;", "request", "<init>", "(Lcom/dyson/mobile/android/purchasing/ui/screen/payment/paypal/model/PayPalRequest;)V", "mod-purchasing"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PayPalArguments implements Parcelable {
    public static final Parcelable.Creator<PayPalArguments> CREATOR = new a();
    public final PayPalRequest d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<PayPalArguments> {
        @Override // android.os.Parcelable.Creator
        public final PayPalArguments createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new PayPalArguments(PayPalRequest.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final PayPalArguments[] newArray(int i13) {
            return new PayPalArguments[i13];
        }
    }

    public PayPalArguments(PayPalRequest payPalRequest) {
        payPalRequest.getClass();
        this.d = payPalRequest;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PayPalArguments) && this.d.equals(((PayPalArguments) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return "PayPalArguments(request=" + this.d + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        this.d.writeToParcel(parcel, i13);
    }
}
