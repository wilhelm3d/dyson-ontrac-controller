package com.dyson.mobile.android.support.guide;

import android.os.Parcel;
import android.os.Parcelable;
import com.brightcove.player.event.EventType;
import com.dyson.mobile.android.support.common.Version;
import com.dyson.mobile.android.utilities.gson.StripNullItemsListTypeAdapterFactory;
import com.dyson.mobile.android.utilities.gson.ValidationTypeAdapterFactory;
import com.dyson.mobile.android.utilities.gson.validator.ListNotEmptyValidator;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import lf1.b;
import x12.r;
@JsonAdapter(ValidationTypeAdapterFactory.class)
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/dyson/mobile/android/support/guide/ProductGuide;", "Landroid/os/Parcelable;", "Lcom/dyson/mobile/android/support/common/Version;", EventType.VERSION, "", "Lcom/dyson/mobile/android/support/guide/Section;", "sections", "<init>", "(Lcom/dyson/mobile/android/support/common/Version;Ljava/util/List;)V", "d", "Lcom/dyson/mobile/android/support/common/Version;", "getVersion", "()Lcom/dyson/mobile/android/support/common/Version;", "e", "Ljava/util/List;", "i", "()Ljava/util/List;", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductGuide implements Parcelable {
    public static final Parcelable.Creator<ProductGuide> CREATOR = new a();
    @SerializedName(EventType.VERSION)
    private final Version d;
    @SerializedName("sections")
    @b({ListNotEmptyValidator.class})
    @JsonAdapter(StripNullItemsListTypeAdapterFactory.class)
    private final List<Section> e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<ProductGuide> {
        @Override // android.os.Parcelable.Creator
        public final ProductGuide createFromParcel(Parcel parcel) {
            parcel.getClass();
            Version createFromParcel = Version.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i13 = 0;
            while (i13 != readInt) {
                i13 = d72.a.d(Section.CREATOR, parcel, arrayList, i13, 1);
            }
            return new ProductGuide(createFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ProductGuide[] newArray(int i13) {
            return new ProductGuide[i13];
        }
    }

    public ProductGuide(Version version, List<Section> list) {
        version.getClass();
        list.getClass();
        this.d = version;
        this.e = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ProductGuide) {
            ProductGuide productGuide = (ProductGuide) obj;
            return r.c(this.d, productGuide.d) && r.c(this.e, productGuide.e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }

    public final List<Section> i() {
        return this.e;
    }

    public final String toString() {
        Version version = this.d;
        List<Section> list = this.e;
        return "ProductGuide(version=" + version + ", sections=" + list + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        this.d.writeToParcel(parcel, i13);
        Iterator n13 = d72.a.n(this.e, parcel);
        while (n13.hasNext()) {
            ((Section) n13.next()).getClass();
            parcel.writeInt(1);
        }
    }
}
