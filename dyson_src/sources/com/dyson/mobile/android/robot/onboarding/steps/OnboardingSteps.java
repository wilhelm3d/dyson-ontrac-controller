package com.dyson.mobile.android.robot.onboarding.steps;

import android.os.Parcel;
import android.os.Parcelable;
import b0.y1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/robot/onboarding/steps/OnboardingSteps;", "Landroid/os/Parcelable;", "", "Lcom/dyson/mobile/android/robot/onboarding/steps/OnboardingStep;", "steps", "<init>", "(Ljava/util/List;)V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OnboardingSteps implements Parcelable {
    public static final Parcelable.Creator<OnboardingSteps> CREATOR = new a();
    public final List<OnboardingStep> d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<OnboardingSteps> {
        @Override // android.os.Parcelable.Creator
        public final OnboardingSteps createFromParcel(Parcel parcel) {
            parcel.getClass();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i13 = 0;
            while (i13 != readInt) {
                i13 = d72.a.d(OnboardingStep.CREATOR, parcel, arrayList, i13, 1);
            }
            return new OnboardingSteps(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final OnboardingSteps[] newArray(int i13) {
            return new OnboardingSteps[i13];
        }
    }

    public OnboardingSteps(List<OnboardingStep> list) {
        list.getClass();
        this.d = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof OnboardingSteps) && this.d.equals(((OnboardingSteps) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return y1.l("OnboardingSteps(steps=", ")", this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        Iterator n13 = d72.a.n(this.d, parcel);
        while (n13.hasNext()) {
            ((OnboardingStep) n13.next()).writeToParcel(parcel, i13);
        }
    }
}
