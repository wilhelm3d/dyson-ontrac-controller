package com.dyson.mobile.android.support.guide;

import android.os.Parcel;
import android.os.Parcelable;
import com.dyson.mobile.android.logging.Logger;
import com.dyson.mobile.android.support.common.Action;
import com.dyson.mobile.android.support.validator.DiagnosisValidator;
import com.dyson.mobile.android.utilities.gson.StripNullItemsListTypeAdapterFactory;
import com.dyson.mobile.android.utilities.gson.ValidationTypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import lf1.b;
@b(nullIfInvalid = true, value = {DiagnosisValidator.class})
@JsonAdapter(ValidationTypeAdapterFactory.class)
/* loaded from: classes3.dex */
public class Diagnosis implements Parcelable {
    public static final Parcelable.Creator<Diagnosis> CREATOR = new a();
    @SerializedName("symptoms")
    @JsonAdapter(StripNullItemsListTypeAdapterFactory.class)
    private List<Symptom> d;
    @SerializedName("actions")
    @JsonAdapter(StripNullItemsListTypeAdapterFactory.class)
    private List<Action> e;

    /* loaded from: classes3.dex */
    public class a implements Parcelable.Creator<Diagnosis> {
        @Override // android.os.Parcelable.Creator
        public final Diagnosis createFromParcel(Parcel parcel) {
            return new Diagnosis(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final Diagnosis[] newArray(int i13) {
            return new Diagnosis[i13];
        }
    }

    public Diagnosis(Parcel parcel) {
        this.d = parcel.createTypedArrayList(Symptom.CREATOR);
        this.e = parcel.createTypedArrayList(Action.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<Action> i() {
        return this.e;
    }

    public final String j() {
        for (Symptom symptom : this.d) {
            if (symptom.k().equals("Symptom")) {
                return symptom.j();
            }
        }
        Logger.e("Symptom list does not contain a SYMPTOM type", null);
        return null;
    }

    public final List<Symptom> k() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.writeTypedList(this.d);
        parcel.writeTypedList(this.e);
    }

    public Diagnosis() {
    }
}
