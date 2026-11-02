package com.dyson.mobile.android.dynamiccontent.nativecontent;

import android.os.Parcel;
import android.os.Parcelable;
import bv1.f;
import kotlin.Metadata;
import x12.r;
@v12.a
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/dynamiccontent/nativecontent/NativeContentReference;", "Landroid/os/Parcelable;", "reference", "", "mod-dynamic-content"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NativeContentReference implements Parcelable {
    public static final Parcelable.Creator<NativeContentReference> CREATOR = new a();
    public final String d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<NativeContentReference> {
        @Override // android.os.Parcelable.Creator
        public final NativeContentReference createFromParcel(Parcel parcel) {
            parcel.getClass();
            String readString = parcel.readString();
            Parcelable.Creator<NativeContentReference> creator = NativeContentReference.CREATOR;
            readString.getClass();
            return NativeContentReference.a(readString);
        }

        @Override // android.os.Parcelable.Creator
        public final NativeContentReference[] newArray(int i13) {
            return new NativeContentReference[i13];
        }
    }

    private /* synthetic */ NativeContentReference(String str) {
        this.d = str;
    }

    public static final /* synthetic */ NativeContentReference a(String str) {
        return new NativeContentReference(str);
    }

    public static String b(String str) {
        return f.e("NativeContentReference(reference=", str, ")");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof NativeContentReference) {
            return r.c(this.d, ((NativeContentReference) obj).d);
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return b(this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeString(this.d);
    }
}
