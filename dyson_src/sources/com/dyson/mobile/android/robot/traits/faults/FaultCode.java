package com.dyson.mobile.android.robot.traits.faults;

import android.os.Parcel;
import android.os.Parcelable;
import bv1.f;
import java.util.List;
import kotlin.Metadata;
import v32.y;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/robot/traits/faults/FaultCode;", "Landroid/os/Parcelable;", "", "fullCode", "<init>", "(Ljava/lang/String;)V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FaultCode implements Parcelable {
    public static final Parcelable.Creator<FaultCode> CREATOR = new a();
    public final String d;
    public final List<String> e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<FaultCode> {
        @Override // android.os.Parcelable.Creator
        public final FaultCode createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new FaultCode(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final FaultCode[] newArray(int i13) {
            return new FaultCode[i13];
        }
    }

    public FaultCode(String str) {
        str.getClass();
        this.d = str;
        this.e = y.L(str, new String[]{"."}, 0, 6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FaultCode) && this.d.equals(((FaultCode) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return f.e("FaultCode(fullCode=", this.d, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeString(this.d);
    }
}
