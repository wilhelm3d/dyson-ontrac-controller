package com.dyson.mobile.android.cat6.traits.language;

import android.os.Parcel;
import android.os.Parcelable;
import b0.y1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x12.r;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/cat6/traits/language/ProductUILanguage;", "Landroid/os/Parcelable;", "<init>", "()V", "Ble", "Mqtt", "Lcom/dyson/mobile/android/cat6/traits/language/ProductUILanguage$Ble;", "Lcom/dyson/mobile/android/cat6/traits/language/ProductUILanguage$Mqtt;", "mod-cat6-connected-floorcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class ProductUILanguage implements Parcelable {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/cat6/traits/language/ProductUILanguage$Ble;", "Lcom/dyson/mobile/android/cat6/traits/language/ProductUILanguage;", "", "value", "", "displayName", "<init>", "(ILjava/lang/String;)V", "mod-cat6-connected-floorcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Ble extends ProductUILanguage {
        public static final Parcelable.Creator<Ble> CREATOR = new a();
        public final int d;
        public final String e;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class a implements Parcelable.Creator<Ble> {
            @Override // android.os.Parcelable.Creator
            public final Ble createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new Ble(parcel.readInt(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Ble[] newArray(int i13) {
                return new Ble[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ble(int i13, String str) {
            super(null);
            str.getClass();
            this.d = i13;
            this.e = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Ble) {
                Ble ble = (Ble) obj;
                return this.d == ble.d && r.c(this.e, ble.e);
            }
            return false;
        }

        public final int hashCode() {
            return this.e.hashCode() + (Integer.hashCode(this.d) * 31);
        }

        @Override // com.dyson.mobile.android.cat6.traits.language.ProductUILanguage
        public final String i() {
            return this.e;
        }

        public final String toString() {
            return "Ble(value=" + this.d + ", displayName=" + this.e + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeInt(this.d);
            parcel.writeString(this.e);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/cat6/traits/language/ProductUILanguage$Mqtt;", "Lcom/dyson/mobile/android/cat6/traits/language/ProductUILanguage;", "", "cloudCode", "displayName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "mod-cat6-connected-floorcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class Mqtt extends ProductUILanguage {
        public static final Parcelable.Creator<Mqtt> CREATOR = new a();
        public final String d;
        public final String e;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class a implements Parcelable.Creator<Mqtt> {
            @Override // android.os.Parcelable.Creator
            public final Mqtt createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new Mqtt(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Mqtt[] newArray(int i13) {
                return new Mqtt[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Mqtt(String str, String str2) {
            super(null);
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
            if (obj instanceof Mqtt) {
                Mqtt mqtt = (Mqtt) obj;
                return r.c(this.d, mqtt.d) && r.c(this.e, mqtt.e);
            }
            return false;
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        @Override // com.dyson.mobile.android.cat6.traits.language.ProductUILanguage
        public final String i() {
            return this.e;
        }

        public final String toString() {
            return y1.j("Mqtt(cloudCode=", this.d, ", displayName=", this.e, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeString(this.d);
            parcel.writeString(this.e);
        }
    }

    public /* synthetic */ ProductUILanguage(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String i();

    private ProductUILanguage() {
    }
}
