package com.dyson.mobile.android.support.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.dyson.mobile.android.support.validator.StepValidator;
import com.dyson.mobile.android.utilities.gson.StrictTypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lf1.b;
@b({StepValidator.class})
@JsonAdapter(StrictTypeAdapterFactory.class)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\t\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/dyson/mobile/android/support/common/Step;", "Landroid/os/Parcelable;", "", "text", "image", "videoId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "d", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "m", "(Ljava/lang/String;)V", "e", "i", "l", "f", "k", "n", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Step implements Parcelable {
    public static final Parcelable.Creator<Step> CREATOR = new a();
    @SerializedName("text")
    @lf1.a
    private String d;
    @SerializedName("image")
    @lf1.a
    private String e;
    @SerializedName("videoId")
    @lf1.a

    /* renamed from: f  reason: collision with root package name */
    private String f16811f;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<Step> {
        @Override // android.os.Parcelable.Creator
        public final Step createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new Step(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Step[] newArray(int i13) {
            return new Step[i13];
        }
    }

    public /* synthetic */ Step(String str, String str2, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2, (i13 & 4) != 0 ? null : str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String i() {
        return this.e;
    }

    public final String j() {
        return this.d;
    }

    public final String k() {
        return this.f16811f;
    }

    public final void l(String str) {
        this.e = str;
    }

    public final void m(String str) {
        this.d = str;
    }

    public final void n(String str) {
        this.f16811f = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f16811f);
    }

    public Step(String str, String str2, String str3) {
        this.d = str;
        this.e = str2;
        this.f16811f = str3;
    }

    public Step() {
        this(null, null, null, 7, null);
    }
}
