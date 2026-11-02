package com.dyson.mobile.android.machine.response.expertcontent;

import android.os.Parcel;
import android.os.Parcelable;
import b0.y1;
import com.google.gson.annotations.SerializedName;
import com.salesforce.marketingcloud.messages.inbox.b;
import kotlin.Metadata;
import x12.r;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/dyson/mobile/android/machine/response/expertcontent/CollectionPoster;", "Landroid/os/Parcelable;", "", b.f21448j, "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "d", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "e", "i", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CollectionPoster implements Parcelable {
    public static final Parcelable.Creator<CollectionPoster> CREATOR = new a();
    @SerializedName(b.f21448j)
    private final String d;
    @SerializedName("url")
    private final String e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<CollectionPoster> {
        @Override // android.os.Parcelable.Creator
        public final CollectionPoster createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new CollectionPoster(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CollectionPoster[] newArray(int i13) {
            return new CollectionPoster[i13];
        }
    }

    public CollectionPoster(String str, String str2) {
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
        if (obj instanceof CollectionPoster) {
            CollectionPoster collectionPoster = (CollectionPoster) obj;
            return r.c(this.d, collectionPoster.d) && r.c(this.e, collectionPoster.e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }

    public final String i() {
        return this.e;
    }

    public final String toString() {
        return y1.j("CollectionPoster(type=", this.d, ", url=", this.e, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeString(this.d);
        parcel.writeString(this.e);
    }
}
