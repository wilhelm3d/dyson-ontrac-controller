package com.dyson.mobile.android.support.guide;

import android.os.Parcel;
import android.os.Parcelable;
import com.dyson.mobile.android.support.validator.SectionValidator;
import com.dyson.mobile.android.utilities.gson.StripNullItemsListTypeAdapterFactory;
import com.dyson.mobile.android.utilities.gson.ValidationTypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@lf1.b(nullIfInvalid = true, value = {SectionValidator.class})
@JsonAdapter(ValidationTypeAdapterFactory.class)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001-B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R*\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u000b\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b\"\u0004\b\u000f\u0010\nR$\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\b\"\u0004\b\u0013\u0010\nR$\u0010\u001c\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR$\u0010 \u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\b\"\u0004\b\u001f\u0010\nR*\u0010)\u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R*\u0010,\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010!8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010$\u001a\u0004\b#\u0010&\"\u0004\b+\u0010(¨\u0006."}, d2 = {"Lcom/dyson/mobile/android/support/guide/Section;", "Landroid/os/Parcelable;", "<init>", "()V", "", "d", "Ljava/lang/String;", "l", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "getType$annotations", com.salesforce.marketingcloud.messages.inbox.b.f21448j, "e", "k", "setTitle", "title", "f", "getIcon", "setIcon", "icon", "", "g", "Ljava/lang/Integer;", "getPosition", "()Ljava/lang/Integer;", "setPosition", "(Ljava/lang/Integer;)V", "position", "h", "j", "setIdentifier", "identifier", "", "Lcom/dyson/mobile/android/support/guide/View;", "i", "Ljava/util/List;", "m", "()Ljava/util/List;", "setViews", "(Ljava/util/List;)V", "views", "Lcom/dyson/mobile/android/support/guide/Diagnosis;", "setDiagnoses", "diagnoses", "a", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Section implements Parcelable {
    public static final Parcelable.Creator<Section> CREATOR;
    @SerializedName(com.salesforce.marketingcloud.messages.inbox.b.f21448j)
    private String d;
    @SerializedName("menuTitle")
    private String e;
    @SerializedName("menuIcon")

    /* renamed from: f  reason: collision with root package name */
    private String f16849f;
    @SerializedName("menuPosition")

    /* renamed from: g  reason: collision with root package name */
    private Integer f16850g;
    @SerializedName("identifier")

    /* renamed from: h  reason: collision with root package name */
    private String f16851h;
    @SerializedName("views")
    @JsonAdapter(StripNullItemsListTypeAdapterFactory.class)

    /* renamed from: i  reason: collision with root package name */
    private List<View> f16852i;
    @SerializedName("diagnoses")
    @JsonAdapter(StripNullItemsListTypeAdapterFactory.class)

    /* renamed from: j  reason: collision with root package name */
    private List<? extends Diagnosis> f16853j;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b implements Parcelable.Creator<Section> {
        @Override // android.os.Parcelable.Creator
        public final Section createFromParcel(Parcel parcel) {
            parcel.getClass();
            parcel.readInt();
            return new Section();
        }

        @Override // android.os.Parcelable.Creator
        public final Section[] newArray(int i13) {
            return new Section[i13];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<Diagnosis> i() {
        return this.f16853j;
    }

    public final String j() {
        return this.f16851h;
    }

    public final String k() {
        return this.e;
    }

    public final String l() {
        return this.d;
    }

    public final List<View> m() {
        return this.f16852i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeInt(1);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/dyson/mobile/android/support/guide/Section$a;", "", "<init>", "()V", "", "CAROUSEL", "Ljava/lang/String;", "ANNOTATED_CAROUSEL", "DIAGNOSTIC", "CONTACT", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
