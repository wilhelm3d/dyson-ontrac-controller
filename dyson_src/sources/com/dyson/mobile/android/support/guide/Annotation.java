package com.dyson.mobile.android.support.guide;

import android.os.Parcel;
import android.os.Parcelable;
import bv1.f;
import com.dyson.mobile.android.support.validator.AnnotationValidator;
import com.dyson.mobile.android.utilities.gson.ValidationTypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import lf1.b;
import x12.r;
@b(nullIfInvalid = true, value = {AnnotationValidator.class})
@JsonAdapter(ValidationTypeAdapterFactory.class)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/dyson/mobile/android/support/guide/Annotation;", "Landroid/os/Parcelable;", "", "text", "<init>", "(Ljava/lang/String;)V", "d", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Annotation implements Parcelable {
    public static final Parcelable.Creator<Annotation> CREATOR = new a();
    @SerializedName("noteText")
    private final String d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<Annotation> {
        @Override // android.os.Parcelable.Creator
        public final Annotation createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new Annotation(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Annotation[] newArray(int i13) {
            return new Annotation[i13];
        }
    }

    public Annotation(String str) {
        str.getClass();
        this.d = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Annotation) && r.c(this.d, ((Annotation) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String i() {
        return this.d;
    }

    public final String toString() {
        return f.e("Annotation(text=", this.d, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeString(this.d);
    }
}
