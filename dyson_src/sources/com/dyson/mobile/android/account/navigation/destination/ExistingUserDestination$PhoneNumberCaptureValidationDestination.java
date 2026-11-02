package com.dyson.mobile.android.account.navigation.destination;

import android.os.Parcel;
import android.os.Parcelable;
import h12.l;
import h12.m;
import h12.n;
import kotlin.Metadata;
import t42.b;
import t42.g;
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/dyson/mobile/android/account/navigation/destination/ExistingUserDestination$PhoneNumberCaptureValidationDestination", "", "<init>", "()V", "Lt42/b;", "Lcom/dyson/mobile/android/account/navigation/destination/ExistingUserDestination$PhoneNumberCaptureValidationDestination;", "serializer", "()Lt42/b;", "mod-user-login"}, k = 1, mv = {2, 3, 0}, xi = 48)
@g
/* loaded from: classes2.dex */
public final class ExistingUserDestination$PhoneNumberCaptureValidationDestination implements UserLoginDestination {
    public static final ExistingUserDestination$PhoneNumberCaptureValidationDestination INSTANCE = new ExistingUserDestination$PhoneNumberCaptureValidationDestination();
    public static final Parcelable.Creator<ExistingUserDestination$PhoneNumberCaptureValidationDestination> CREATOR = new a();
    public static final /* synthetic */ l<b<Object>> d = m.a(n.PUBLICATION, new my0.a(24));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<ExistingUserDestination$PhoneNumberCaptureValidationDestination> {
        @Override // android.os.Parcelable.Creator
        public final ExistingUserDestination$PhoneNumberCaptureValidationDestination createFromParcel(Parcel parcel) {
            parcel.getClass();
            parcel.readInt();
            return ExistingUserDestination$PhoneNumberCaptureValidationDestination.INSTANCE;
        }

        @Override // android.os.Parcelable.Creator
        public final ExistingUserDestination$PhoneNumberCaptureValidationDestination[] newArray(int i13) {
            return new ExistingUserDestination$PhoneNumberCaptureValidationDestination[i13];
        }
    }

    private ExistingUserDestination$PhoneNumberCaptureValidationDestination() {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof ExistingUserDestination$PhoneNumberCaptureValidationDestination);
    }

    public final int hashCode() {
        return -677728444;
    }

    public final b<ExistingUserDestination$PhoneNumberCaptureValidationDestination> serializer() {
        return d.getValue();
    }

    public final String toString() {
        return "PhoneNumberCaptureValidationDestination";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
