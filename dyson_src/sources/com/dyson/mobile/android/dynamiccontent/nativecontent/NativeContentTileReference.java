package com.dyson.mobile.android.dynamiccontent.nativecontent;

import android.os.Parcel;
import android.os.Parcelable;
import bv1.f;
import kotlin.Metadata;
import x12.r;
@v12.a
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/dynamiccontent/nativecontent/NativeContentTileReference;", "Landroid/os/Parcelable;", "reference", "", "mod-dynamic-content"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NativeContentTileReference implements Parcelable {
    public static final Parcelable.Creator<NativeContentTileReference> CREATOR = new a();
    public final String d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<NativeContentTileReference> {
        @Override // android.os.Parcelable.Creator
        public final NativeContentTileReference createFromParcel(Parcel parcel) {
            parcel.getClass();
            String readString = parcel.readString();
            Parcelable.Creator<NativeContentTileReference> creator = NativeContentTileReference.CREATOR;
            readString.getClass();
            return NativeContentTileReference.a(readString);
        }

        @Override // android.os.Parcelable.Creator
        public final NativeContentTileReference[] newArray(int i13) {
            return new NativeContentTileReference[i13];
        }
    }

    private /* synthetic */ NativeContentTileReference(String str) {
        this.d = str;
    }

    public static final /* synthetic */ NativeContentTileReference a(String str) {
        return new NativeContentTileReference(str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof NativeContentTileReference) {
            return r.c(this.d, ((NativeContentTileReference) obj).d);
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return f.e("NativeContentTileReference(reference=", this.d, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeString(this.d);
    }
}
