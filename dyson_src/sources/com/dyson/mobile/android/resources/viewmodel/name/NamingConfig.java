package com.dyson.mobile.android.resources.viewmodel.name;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ma.e;
import x12.r;
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0087\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B-\b\u0007\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/dyson/mobile/android/resources/viewmodel/name/NamingConfig;", "Landroid/os/Parcelable;", "Extras", "", "existingName", "", "usedNames", "extras", "<init>", "(Ljava/lang/String;[Ljava/lang/String;Landroid/os/Parcelable;)V", "mod-resources"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NamingConfig<Extras extends Parcelable> implements Parcelable {
    public static final Parcelable.Creator<NamingConfig<?>> CREATOR = new a();
    public final String d;
    public final String[] e;

    /* renamed from: f  reason: collision with root package name */
    public final Extras f15910f;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<NamingConfig<?>> {
        @Override // android.os.Parcelable.Creator
        public final NamingConfig<?> createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new NamingConfig<>(parcel.readString(), parcel.createStringArray(), parcel.readParcelable(NamingConfig.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final NamingConfig<?>[] newArray(int i13) {
            return new NamingConfig[i13];
        }
    }

    public NamingConfig(String str, String[] strArr, Extras extras) {
        strArr.getClass();
        extras.getClass();
        this.d = str;
        this.e = strArr;
        this.f15910f = extras;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (NamingConfig.class.equals(obj != null ? obj.getClass() : null)) {
            obj.getClass();
            NamingConfig namingConfig = (NamingConfig) obj;
            return r.c(this.d, namingConfig.d) && Arrays.equals(this.e, namingConfig.e) && r.c(this.f15910f, namingConfig.f15910f);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.d;
        return this.f15910f.hashCode() + ((((str != null ? str.hashCode() : 0) * 31) + Arrays.hashCode(this.e)) * 31);
    }

    public final String toString() {
        StringBuilder m13 = e.m("NamingConfig(existingName=", this.d, ", usedNames=", Arrays.toString(this.e), ", extras=");
        m13.append(this.f15910f);
        m13.append(")");
        return m13.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeString(this.d);
        parcel.writeStringArray(this.e);
        parcel.writeParcelable(this.f15910f, i13);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NamingConfig(String str, Extras extras) {
        this(str, null, extras, 2, null);
        extras.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NamingConfig(Extras extras) {
        this(null, null, extras, 3, null);
        extras.getClass();
    }

    public /* synthetic */ NamingConfig(String str, String[] strArr, Parcelable parcelable, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? new String[0] : strArr, parcelable);
    }
}
