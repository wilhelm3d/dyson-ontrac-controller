package com.dyson.mobile.android.support.guide;

import android.os.Parcel;
import android.os.Parcelable;
import com.dyson.mobile.android.support.validator.SymptomValidator;
import com.dyson.mobile.android.utilities.gson.ValidationTypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import h12.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ma.e;
import x12.r;
@lf1.b(nullIfInvalid = true, value = {SymptomValidator.class})
@JsonAdapter(ValidationTypeAdapterFactory.class)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0010B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/dyson/mobile/android/support/guide/Symptom;", "Landroid/os/Parcelable;", "", "text", "code", com.salesforce.marketingcloud.messages.inbox.b.f21448j, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "d", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "e", "i", "f", "k", "a", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Symptom implements Parcelable {
    public static final Parcelable.Creator<Symptom> CREATOR;
    @SerializedName("text")
    private final String d;
    @SerializedName("code")
    private final String e;
    @SerializedName(com.salesforce.marketingcloud.messages.inbox.b.f21448j)

    /* renamed from: f  reason: collision with root package name */
    private final String f16854f;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b implements Parcelable.Creator<Symptom> {
        @Override // android.os.Parcelable.Creator
        public final Symptom createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new Symptom(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Symptom[] newArray(int i13) {
            return new Symptom[i13];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public Symptom(String str, String str2, String str3) {
        d72.a.v(str, str2, str3);
        this.d = str;
        this.e = str2;
        this.f16854f = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Symptom) {
            Symptom symptom = (Symptom) obj;
            return r.c(this.d, symptom.d) && r.c(this.e, symptom.e) && r.c(this.f16854f, symptom.f16854f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f16854f.hashCode() + y.c(this.d.hashCode() * 31, 31, this.e);
    }

    public final String i() {
        return this.e;
    }

    public final String j() {
        return this.d;
    }

    public final String k() {
        return this.f16854f;
    }

    public final String toString() {
        String str = this.d;
        String str2 = this.e;
        return ie.a.h(e.m("Symptom(text=", str, ", code=", str2, ", type="), this.f16854f, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f16854f);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/support/guide/Symptom$a;", "", "<init>", "()V", "", "SYMPTOM", "Ljava/lang/String;", "FAULT_CODE", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
