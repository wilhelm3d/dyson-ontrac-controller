package com.dyson.mobile.android.applink;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/applink/AppLinkIntent;", "Leo0/a;", "Landroid/os/Parcelable;", "Landroid/net/Uri;", "appLinkUri", "", "machineSerial", "<init>", "(Landroid/net/Uri;Ljava/lang/String;)V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AppLinkIntent implements eo0.a, Parcelable {
    public static final Parcelable.Creator<AppLinkIntent> CREATOR = new a();
    public final Uri d;
    public final String e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<AppLinkIntent> {
        @Override // android.os.Parcelable.Creator
        public final AppLinkIntent createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new AppLinkIntent((Uri) parcel.readParcelable(AppLinkIntent.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final AppLinkIntent[] newArray(int i13) {
            return new AppLinkIntent[i13];
        }
    }

    public AppLinkIntent(Uri uri, String str) {
        uri.getClass();
        this.d = uri;
        this.e = str;
        uri.hashCode();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // eo0.a
    public final String p() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeParcelable(this.d, i13);
        parcel.writeString(this.e);
    }

    public /* synthetic */ AppLinkIntent(Uri uri, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(uri, (i13 & 2) != 0 ? null : str);
    }
}
