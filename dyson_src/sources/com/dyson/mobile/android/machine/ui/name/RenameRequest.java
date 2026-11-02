package com.dyson.mobile.android.machine.ui.name;

import android.os.Parcel;
import android.os.Parcelable;
import com.salesforce.marketingcloud.messages.inbox.b;
import h12.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ma.e;
import x12.r;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/name/RenameRequest;", "Landroid/os/Parcelable;", "", "objectId", "name", b.f21448j, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RenameRequest implements Parcelable {
    public static final Parcelable.Creator<RenameRequest> CREATOR = new a();
    public final String d;
    public final String e;

    /* renamed from: f  reason: collision with root package name */
    public final String f15374f;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<RenameRequest> {
        @Override // android.os.Parcelable.Creator
        public final RenameRequest createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new RenameRequest(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RenameRequest[] newArray(int i13) {
            return new RenameRequest[i13];
        }
    }

    public RenameRequest(String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        this.d = str;
        this.e = str2;
        this.f15374f = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RenameRequest) {
            RenameRequest renameRequest = (RenameRequest) obj;
            return r.c(this.d, renameRequest.d) && r.c(this.e, renameRequest.e) && r.c(this.f15374f, renameRequest.f15374f);
        }
        return false;
    }

    public final int hashCode() {
        int c13 = y.c(this.d.hashCode() * 31, 31, this.e);
        String str = this.f15374f;
        return c13 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return ie.a.h(e.m("RenameRequest(objectId=", this.d, ", name=", this.e, ", type="), this.f15374f, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f15374f);
    }

    public /* synthetic */ RenameRequest(String str, String str2, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i13 & 4) != 0 ? null : str3);
    }
}
