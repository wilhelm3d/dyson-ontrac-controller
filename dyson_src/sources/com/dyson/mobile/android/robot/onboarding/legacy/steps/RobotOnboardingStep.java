package com.dyson.mobile.android.robot.onboarding.legacy.steps;

import android.os.Parcel;
import android.os.Parcelable;
import com.dyson.mobile.android.localisation.LocalisationKey;
import com.dyson.mobile.android.robot.onboarding.instructionalview.InstructionalData;
import com.salesforce.marketingcloud.messages.inbox.b;
import h12.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ma.e;
import x12.r;
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/dyson/mobile/android/robot/onboarding/legacy/steps/RobotOnboardingStep;", "Landroid/os/Parcelable;", "", "title", "tag", "Lcom/dyson/mobile/android/robot/onboarding/instructionalview/InstructionalData;", "instructionalData", "La41/a;", b.f21448j, "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/dyson/mobile/android/robot/onboarding/instructionalview/InstructionalData;La41/a;)V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RobotOnboardingStep implements Parcelable {
    public static final Parcelable.Creator<RobotOnboardingStep> CREATOR;
    public final String d;
    public final String e;

    /* renamed from: f  reason: collision with root package name */
    public final InstructionalData f16583f;

    /* renamed from: g  reason: collision with root package name */
    public final a41.a f16584g;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<RobotOnboardingStep> {
        @Override // android.os.Parcelable.Creator
        public final RobotOnboardingStep createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new RobotOnboardingStep(parcel.readString(), parcel.readString(), InstructionalData.CREATOR.createFromParcel(parcel), a41.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final RobotOnboardingStep[] newArray(int i13) {
            return new RobotOnboardingStep[i13];
        }
    }

    static {
        LocalisationKey.a aVar = LocalisationKey.f15077f;
        CREATOR = new a();
    }

    public RobotOnboardingStep(String str, String str2, InstructionalData instructionalData, a41.a aVar) {
        str.getClass();
        str2.getClass();
        instructionalData.getClass();
        aVar.getClass();
        this.d = str;
        this.e = str2;
        this.f16583f = instructionalData;
        this.f16584g = aVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RobotOnboardingStep) {
            RobotOnboardingStep robotOnboardingStep = (RobotOnboardingStep) obj;
            return r.c(this.d, robotOnboardingStep.d) && r.c(this.e, robotOnboardingStep.e) && r.c(this.f16583f, robotOnboardingStep.f16583f) && this.f16584g == robotOnboardingStep.f16584g;
        }
        return false;
    }

    public final int hashCode() {
        int c13 = y.c(this.d.hashCode() * 31, 31, this.e);
        return this.f16584g.hashCode() + ((this.f16583f.hashCode() + c13) * 31);
    }

    public final String toString() {
        StringBuilder m13 = e.m("RobotOnboardingStep(title=", this.d, ", tag=", this.e, ", instructionalData=");
        m13.append(this.f16583f);
        m13.append(", type=");
        m13.append(this.f16584g);
        m13.append(")");
        return m13.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        this.f16583f.writeToParcel(parcel, i13);
        parcel.writeString(this.f16584g.name());
    }

    public /* synthetic */ RobotOnboardingStep(String str, String str2, InstructionalData instructionalData, a41.a aVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, instructionalData, (i13 & 8) != 0 ? a41.a.INSTRUCTIONAL : aVar);
    }
}
