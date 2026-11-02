package com.dyson.mobile.android.robot.onboarding.steps;

import android.os.Parcel;
import android.os.Parcelable;
import b0.g;
import com.brightcove.player.captioning.TTMLParser;
import com.dyson.mobile.android.localisation.LocalisationKey;
import h12.y;
import hx.v;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rf0.i0;
import x12.r;
import y9.w;
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000fBI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/dyson/mobile/android/robot/onboarding/steps/OnboardingStep;", "Landroid/os/Parcelable;", "", "identifier", "", "image", "Lcom/dyson/mobile/android/localisation/LocalisationKey;", "heading", TTMLParser.Tags.BODY, "Lcom/dyson/mobile/android/robot/onboarding/steps/OnboardingStep$a;", "buttonType", "videoId", "lottieFilename", "<init>", "(Ljava/lang/String;ILcom/dyson/mobile/android/localisation/LocalisationKey;Lcom/dyson/mobile/android/localisation/LocalisationKey;Lcom/dyson/mobile/android/robot/onboarding/steps/OnboardingStep$a;Ljava/lang/String;Ljava/lang/String;)V", "a", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OnboardingStep implements Parcelable {
    public static final Parcelable.Creator<OnboardingStep> CREATOR;
    public final String d;
    public final int e;

    /* renamed from: f  reason: collision with root package name */
    public final LocalisationKey f16585f;

    /* renamed from: g  reason: collision with root package name */
    public final LocalisationKey f16586g;

    /* renamed from: h  reason: collision with root package name */
    public final a f16587h;

    /* renamed from: i  reason: collision with root package name */
    public final String f16588i;

    /* renamed from: j  reason: collision with root package name */
    public final String f16589j;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b implements Parcelable.Creator<OnboardingStep> {
        @Override // android.os.Parcelable.Creator
        public final OnboardingStep createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new OnboardingStep(parcel.readString(), parcel.readInt(), (LocalisationKey) parcel.readParcelable(OnboardingStep.class.getClassLoader()), (LocalisationKey) parcel.readParcelable(OnboardingStep.class.getClassLoader()), a.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OnboardingStep[] newArray(int i13) {
            return new OnboardingStep[i13];
        }
    }

    static {
        LocalisationKey.a aVar = LocalisationKey.f15077f;
        CREATOR = new b();
    }

    public OnboardingStep(String str, int i13, LocalisationKey localisationKey, LocalisationKey localisationKey2, a aVar, String str2, String str3) {
        str.getClass();
        localisationKey.getClass();
        localisationKey2.getClass();
        aVar.getClass();
        this.d = str;
        this.e = i13;
        this.f16585f = localisationKey;
        this.f16586g = localisationKey2;
        this.f16587h = aVar;
        this.f16588i = str2;
        this.f16589j = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnboardingStep) {
            OnboardingStep onboardingStep = (OnboardingStep) obj;
            return r.c(this.d, onboardingStep.d) && this.e == onboardingStep.e && r.c(this.f16585f, onboardingStep.f16585f) && r.c(this.f16586g, onboardingStep.f16586g) && this.f16587h == onboardingStep.f16587h && r.c(this.f16588i, onboardingStep.f16588i) && r.c(this.f16589j, onboardingStep.f16589j);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f16587h.hashCode() + y.e(this.f16586g, y.e(this.f16585f, w.b(this.e, this.d.hashCode() * 31, 31), 31), 31)) * 31;
        String str = this.f16588i;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f16589j;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m13 = g.m(this.e, "OnboardingStep(identifier=", this.d, ", image=", ", heading=");
        m13.append(this.f16585f);
        m13.append(", body=");
        m13.append(this.f16586g);
        m13.append(", buttonType=");
        m13.append(this.f16587h);
        m13.append(", videoId=");
        m13.append(this.f16588i);
        m13.append(", lottieFilename=");
        return ie.a.h(m13, this.f16589j, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeString(this.d);
        parcel.writeInt(this.e);
        parcel.writeParcelable(this.f16585f, i13);
        parcel.writeParcelable(this.f16586g, i13);
        parcel.writeString(this.f16587h.name());
        parcel.writeString(this.f16588i);
        parcel.writeString(this.f16589j);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0015\b\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/dyson/mobile/android/robot/onboarding/steps/OnboardingStep$a;", "", "Lcom/dyson/mobile/android/localisation/LocalisationKey;", "buttonTextKey", "<init>", "(Ljava/lang/String;ILcom/dyson/mobile/android/localisation/LocalisationKey;)V", "Lcom/dyson/mobile/android/localisation/LocalisationKey;", "getButtonTextKey", "()Lcom/dyson/mobile/android/localisation/LocalisationKey;", "NEXT", "SKIP", "FINISH", "FINISH_CONTINUE", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        private static final /* synthetic */ o12.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        private final LocalisationKey buttonTextKey;
        public static final a NEXT = new a("NEXT", 0, null, 1, null);
        public static final a SKIP = new a("SKIP", 1, null, 1, null);
        public static final a FINISH = new a("FINISH", 2, null, 1, null);
        public static final a FINISH_CONTINUE = new a("FINISH_CONTINUE", 3, i0.D8);

        private static final /* synthetic */ a[] $values() {
            return new a[]{NEXT, SKIP, FINISH, FINISH_CONTINUE};
        }

        static {
            a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = v.l($values);
        }

        public /* synthetic */ a(String str, int i13, LocalisationKey localisationKey, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i13, (i14 & 1) != 0 ? null : localisationKey);
        }

        public static o12.a<a> getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public final LocalisationKey getButtonTextKey() {
            return this.buttonTextKey;
        }

        private a(String str, int i13, LocalisationKey localisationKey) {
            this.buttonTextKey = localisationKey;
        }
    }

    public /* synthetic */ OnboardingStep(String str, int i13, LocalisationKey localisationKey, LocalisationKey localisationKey2, a aVar, String str2, String str3, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, localisationKey, localisationKey2, aVar, (i14 & 32) != 0 ? null : str2, (i14 & 64) != 0 ? null : str3);
    }
}
