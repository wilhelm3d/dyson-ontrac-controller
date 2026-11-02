package com.dyson.mobile.android.robot.onboarding.instructionalview;

import android.os.Parcel;
import android.os.Parcelable;
import b0.g;
import com.brightcove.player.captioning.TTMLParser;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.localisation.LocalisationKey;
import h12.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x12.r;
import y9.w;
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0003\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/dyson/mobile/android/robot/onboarding/instructionalview/InstructionalData;", "Landroid/os/Parcelable;", "Lcom/dyson/mobile/android/localisation/LocalisationKey;", "titleTextKey", "detail1TextKey", "ctaTextKey", "", "bottomDrawable", "topDrawable", "detail2TextKey", "externalLinkKey", "linkButtonTextKey", "", "videoId", "animatedDockVisibility", TTMLParser.Attributes.BG_COLOR, "<init>", "(Lcom/dyson/mobile/android/localisation/LocalisationKey;Lcom/dyson/mobile/android/localisation/LocalisationKey;Lcom/dyson/mobile/android/localisation/LocalisationKey;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/dyson/mobile/android/localisation/LocalisationKey;Lcom/dyson/mobile/android/localisation/LocalisationKey;Lcom/dyson/mobile/android/localisation/LocalisationKey;Ljava/lang/String;II)V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InstructionalData implements Parcelable {
    public static final Parcelable.Creator<InstructionalData> CREATOR;
    public final LocalisationKey d;
    public final LocalisationKey e;

    /* renamed from: f  reason: collision with root package name */
    public final LocalisationKey f16574f;

    /* renamed from: g  reason: collision with root package name */
    public final Integer f16575g;

    /* renamed from: h  reason: collision with root package name */
    public final Integer f16576h;

    /* renamed from: i  reason: collision with root package name */
    public final LocalisationKey f16577i;

    /* renamed from: j  reason: collision with root package name */
    public final LocalisationKey f16578j;

    /* renamed from: k  reason: collision with root package name */
    public final LocalisationKey f16579k;

    /* renamed from: l  reason: collision with root package name */
    public final String f16580l;

    /* renamed from: m  reason: collision with root package name */
    public final int f16581m;

    /* renamed from: n  reason: collision with root package name */
    public final int f16582n;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<InstructionalData> {
        @Override // android.os.Parcelable.Creator
        public final InstructionalData createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new InstructionalData((LocalisationKey) parcel.readParcelable(InstructionalData.class.getClassLoader()), (LocalisationKey) parcel.readParcelable(InstructionalData.class.getClassLoader()), (LocalisationKey) parcel.readParcelable(InstructionalData.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, (LocalisationKey) parcel.readParcelable(InstructionalData.class.getClassLoader()), (LocalisationKey) parcel.readParcelable(InstructionalData.class.getClassLoader()), (LocalisationKey) parcel.readParcelable(InstructionalData.class.getClassLoader()), parcel.readString(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final InstructionalData[] newArray(int i13) {
            return new InstructionalData[i13];
        }
    }

    static {
        LocalisationKey.a aVar = LocalisationKey.f15077f;
        CREATOR = new a();
    }

    public /* synthetic */ InstructionalData(LocalisationKey localisationKey, LocalisationKey localisationKey2, LocalisationKey localisationKey3, Integer num, Integer num2, LocalisationKey localisationKey4, LocalisationKey localisationKey5, LocalisationKey localisationKey6, String str, int i13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
        this(localisationKey, localisationKey2, localisationKey3, (i15 & 8) != 0 ? null : num, (i15 & 16) != 0 ? null : num2, (i15 & 32) != 0 ? null : localisationKey4, (i15 & 64) != 0 ? null : localisationKey5, (i15 & 128) != 0 ? null : localisationKey6, (i15 & 256) != 0 ? null : str, (i15 & 512) != 0 ? 8 : i13, (i15 & 1024) != 0 ? R.color.white : i14);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof InstructionalData) {
            InstructionalData instructionalData = (InstructionalData) obj;
            return r.c(this.d, instructionalData.d) && r.c(this.e, instructionalData.e) && r.c(this.f16574f, instructionalData.f16574f) && r.c(this.f16575g, instructionalData.f16575g) && r.c(this.f16576h, instructionalData.f16576h) && r.c(this.f16577i, instructionalData.f16577i) && r.c(this.f16578j, instructionalData.f16578j) && r.c(this.f16579k, instructionalData.f16579k) && r.c(this.f16580l, instructionalData.f16580l) && this.f16581m == instructionalData.f16581m && this.f16582n == instructionalData.f16582n;
        }
        return false;
    }

    public final int hashCode() {
        int e = y.e(this.f16574f, y.e(this.e, this.d.hashCode() * 31, 31), 31);
        Integer num = this.f16575g;
        int hashCode = (e + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f16576h;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        LocalisationKey localisationKey = this.f16577i;
        int hashCode3 = (hashCode2 + (localisationKey == null ? 0 : localisationKey.hashCode())) * 31;
        LocalisationKey localisationKey2 = this.f16578j;
        int hashCode4 = (hashCode3 + (localisationKey2 == null ? 0 : localisationKey2.hashCode())) * 31;
        LocalisationKey localisationKey3 = this.f16579k;
        int hashCode5 = (hashCode4 + (localisationKey3 == null ? 0 : localisationKey3.hashCode())) * 31;
        String str = this.f16580l;
        return Integer.hashCode(this.f16582n) + w.b(this.f16581m, (hashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstructionalData(titleTextKey=");
        sb2.append(this.d);
        sb2.append(", detail1TextKey=");
        sb2.append(this.e);
        sb2.append(", ctaTextKey=");
        sb2.append(this.f16574f);
        sb2.append(", bottomDrawable=");
        sb2.append(this.f16575g);
        sb2.append(", topDrawable=");
        sb2.append(this.f16576h);
        sb2.append(", detail2TextKey=");
        sb2.append(this.f16577i);
        sb2.append(", externalLinkKey=");
        sb2.append(this.f16578j);
        sb2.append(", linkButtonTextKey=");
        sb2.append(this.f16579k);
        sb2.append(", videoId=");
        sb2.append(this.f16580l);
        sb2.append(", animatedDockVisibility=");
        sb2.append(this.f16581m);
        sb2.append(", backgroundColor=");
        return g.i(this.f16582n, ")", sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeParcelable(this.d, i13);
        parcel.writeParcelable(this.e, i13);
        parcel.writeParcelable(this.f16574f, i13);
        Integer num = this.f16575g;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.f16576h;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeParcelable(this.f16577i, i13);
        parcel.writeParcelable(this.f16578j, i13);
        parcel.writeParcelable(this.f16579k, i13);
        parcel.writeString(this.f16580l);
        parcel.writeInt(this.f16581m);
        parcel.writeInt(this.f16582n);
    }

    public InstructionalData(LocalisationKey localisationKey, LocalisationKey localisationKey2, LocalisationKey localisationKey3, Integer num, Integer num2, LocalisationKey localisationKey4, LocalisationKey localisationKey5, LocalisationKey localisationKey6, String str, int i13, int i14) {
        localisationKey.getClass();
        localisationKey2.getClass();
        localisationKey3.getClass();
        this.d = localisationKey;
        this.e = localisationKey2;
        this.f16574f = localisationKey3;
        this.f16575g = num;
        this.f16576h = num2;
        this.f16577i = localisationKey4;
        this.f16578j = localisationKey5;
        this.f16579k = localisationKey6;
        this.f16580l = str;
        this.f16581m = i13;
        this.f16582n = i14;
    }
}
