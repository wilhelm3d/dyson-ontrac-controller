package com.dyson.mobile.android.support.guide;

import android.os.Parcel;
import android.os.Parcelable;
import com.brightcove.player.event.EventType;
import com.dyson.mobile.android.support.validator.ViewValidator;
import com.dyson.mobile.android.utilities.gson.StripNullItemsListTypeAdapterFactory;
import com.dyson.mobile.android.utilities.gson.ValidationTypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import lf1.b;
@b(nullIfInvalid = true, value = {ViewValidator.class})
@JsonAdapter(ValidationTypeAdapterFactory.class)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR$\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\b\"\u0004\b\u0012\u0010\nR$\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR*\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/dyson/mobile/android/support/guide/View;", "Landroid/os/Parcelable;", "<init>", "()V", "", "d", "Ljava/lang/String;", "k", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "text", "e", "j", "setImage", "image", "f", "getVideo", EventType.SET_VIDEO, "video", "g", "l", "setVideoId", "videoId", "", "Lcom/dyson/mobile/android/support/guide/Annotation;", "h", "Ljava/util/List;", "i", "()Ljava/util/List;", "setAnnotations", "(Ljava/util/List;)V", "annotations", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class View implements Parcelable {
    public static final Parcelable.Creator<View> CREATOR = new a();
    @SerializedName("text")
    private String d;
    @SerializedName("image")
    private String e;
    @SerializedName("video")

    /* renamed from: f  reason: collision with root package name */
    private String f16855f;
    @SerializedName("videoId")

    /* renamed from: g  reason: collision with root package name */
    private String f16856g;
    @SerializedName("annotations")
    @JsonAdapter(StripNullItemsListTypeAdapterFactory.class)

    /* renamed from: h  reason: collision with root package name */
    private List<Annotation> f16857h;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<View> {
        @Override // android.os.Parcelable.Creator
        public final View createFromParcel(Parcel parcel) {
            parcel.getClass();
            parcel.readInt();
            return new View();
        }

        @Override // android.os.Parcelable.Creator
        public final View[] newArray(int i13) {
            return new View[i13];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<Annotation> i() {
        return this.f16857h;
    }

    public final String j() {
        return this.e;
    }

    public final String k() {
        return this.d;
    }

    public final String l() {
        return this.f16856g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
