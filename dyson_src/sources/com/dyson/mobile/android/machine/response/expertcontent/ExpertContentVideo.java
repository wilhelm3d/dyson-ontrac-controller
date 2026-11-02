package com.dyson.mobile.android.machine.response.expertcontent;

import android.os.Parcel;
import android.os.Parcelable;
import com.brightcove.player.event.AbstractEvent;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import q62.n;
import x12.r;
import y9.w;
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/dyson/mobile/android/machine/response/expertcontent/ExpertContentVideo;", "Landroid/os/Parcelable;", "Lcom/dyson/mobile/android/machine/response/expertcontent/ExpertContentVideoSource;", AbstractEvent.SOURCE, "", "durationMillis", "", "description", "longDescription", "videoVoiceOverText", "<init>", "(Lcom/dyson/mobile/android/machine/response/expertcontent/ExpertContentVideoSource;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "d", "Lcom/dyson/mobile/android/machine/response/expertcontent/ExpertContentVideoSource;", "k", "()Lcom/dyson/mobile/android/machine/response/expertcontent/ExpertContentVideoSource;", "e", "I", "getDurationMillis", "()I", "f", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "g", "j", "h", "l", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ExpertContentVideo implements Parcelable {
    public static final Parcelable.Creator<ExpertContentVideo> CREATOR = new a();
    @SerializedName(AbstractEvent.SOURCE)
    private final ExpertContentVideoSource d;
    @SerializedName("duration")
    private final int e;
    @SerializedName("description")

    /* renamed from: f  reason: collision with root package name */
    private final String f15303f;
    @SerializedName("longDescription")

    /* renamed from: g  reason: collision with root package name */
    private final String f15304g;
    @SerializedName("videoVoiceOverText")

    /* renamed from: h  reason: collision with root package name */
    private final String f15305h;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<ExpertContentVideo> {
        @Override // android.os.Parcelable.Creator
        public final ExpertContentVideo createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new ExpertContentVideo(ExpertContentVideoSource.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ExpertContentVideo[] newArray(int i13) {
            return new ExpertContentVideo[i13];
        }
    }

    public ExpertContentVideo(ExpertContentVideoSource expertContentVideoSource, int i13, String str, String str2, String str3) {
        expertContentVideoSource.getClass();
        this.d = expertContentVideoSource;
        this.e = i13;
        this.f15303f = str;
        this.f15304g = str2;
        this.f15305h = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ExpertContentVideo) {
            ExpertContentVideo expertContentVideo = (ExpertContentVideo) obj;
            return r.c(this.d, expertContentVideo.d) && this.e == expertContentVideo.e && r.c(this.f15303f, expertContentVideo.f15303f) && r.c(this.f15304g, expertContentVideo.f15304g) && r.c(this.f15305h, expertContentVideo.f15305h);
        }
        return false;
    }

    public final int hashCode() {
        int b13 = w.b(this.e, this.d.hashCode() * 31, 31);
        String str = this.f15303f;
        int hashCode = (b13 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f15304g;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f15305h;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String i() {
        return this.f15303f;
    }

    public final String j() {
        return this.f15304g;
    }

    public final ExpertContentVideoSource k() {
        return this.d;
    }

    public final String l() {
        return this.f15305h;
    }

    public final String toString() {
        ExpertContentVideoSource expertContentVideoSource = this.d;
        int i13 = this.e;
        String str = this.f15303f;
        String str2 = this.f15304g;
        String str3 = this.f15305h;
        StringBuilder sb2 = new StringBuilder("ExpertContentVideo(source=");
        sb2.append(expertContentVideoSource);
        sb2.append(", durationMillis=");
        sb2.append(i13);
        sb2.append(", description=");
        n.o(sb2, str, ", longDescription=", str2, ", videoVoiceOverText=");
        return ie.a.h(sb2, str3, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        this.d.writeToParcel(parcel, i13);
        parcel.writeInt(this.e);
        parcel.writeString(this.f15303f);
        parcel.writeString(this.f15304g);
        parcel.writeString(this.f15305h);
    }
}
