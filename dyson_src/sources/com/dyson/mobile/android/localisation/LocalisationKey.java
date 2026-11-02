package com.dyson.mobile.android.localisation;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x12.r;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\bB!\b\u0000\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/localisation/LocalisationKey;", "Landroid/os/Parcelable;", "", "messageId", "", "messageIdAsString", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;)V", "a", "mod-localisation"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LocalisationKey implements Parcelable {
    public final Integer d;
    public final String e;

    /* renamed from: f  reason: collision with root package name */
    public static final a f15077f = new a(null);
    public static final Parcelable.Creator<LocalisationKey> CREATOR = new b();

    /* renamed from: g  reason: collision with root package name */
    public static final int f15078g = 8;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements Parcelable.Creator<LocalisationKey> {
        @Override // android.os.Parcelable.Creator
        public final LocalisationKey createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new LocalisationKey(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final LocalisationKey[] newArray(int i13) {
            return new LocalisationKey[i13];
        }
    }

    public /* synthetic */ LocalisationKey(Integer num, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(num, (i13 & 2) != 0 ? null : str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalisationKey) {
            LocalisationKey localisationKey = (LocalisationKey) obj;
            return r.c(this.d, localisationKey.d) && r.c(this.e, localisationKey.e);
        }
        return false;
    }

    public final int hashCode() {
        Integer num = this.d;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.e;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "LocalisationKey(messageId=" + this.d + ", messageIdAsString=" + this.e + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        int intValue;
        parcel.getClass();
        Integer num = this.d;
        if (num == null) {
            intValue = 0;
        } else {
            parcel.writeInt(1);
            intValue = num.intValue();
        }
        parcel.writeInt(intValue);
        parcel.writeString(this.e);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/localisation/LocalisationKey$a;", "", "<init>", "()V", "mod-localisation"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static LocalisationKey a() {
            return new LocalisationKey(null, "");
        }

        public static LocalisationKey b(String str) {
            str.getClass();
            return new LocalisationKey(null, str);
        }

        private a() {
        }
    }

    public LocalisationKey(Integer num, String str) {
        this.d = num;
        this.e = str;
    }
}
