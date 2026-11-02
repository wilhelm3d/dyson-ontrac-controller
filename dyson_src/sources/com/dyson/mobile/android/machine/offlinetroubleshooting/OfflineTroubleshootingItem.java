package com.dyson.mobile.android.machine.offlinetroubleshooting;

import android.os.Parcel;
import android.os.Parcelable;
import com.dyson.mobile.android.localisation.LocalisationKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/dyson/mobile/android/machine/offlinetroubleshooting/OfflineTroubleshootingItem;", "Landroid/os/Parcelable;", "Lcom/dyson/mobile/android/localisation/LocalisationKey;", "title", "Lcom/dyson/mobile/android/machine/offlinetroubleshooting/OfflineTroubleshootingItemDetail;", "detail", "", "openSupport", "", "analyticsName", "<init>", "(Lcom/dyson/mobile/android/localisation/LocalisationKey;Lcom/dyson/mobile/android/machine/offlinetroubleshooting/OfflineTroubleshootingItemDetail;ZLjava/lang/String;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public class OfflineTroubleshootingItem implements Parcelable {
    public static final Parcelable.Creator<OfflineTroubleshootingItem> CREATOR = new a();
    public final LocalisationKey d;
    public final OfflineTroubleshootingItemDetail e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f15286f;

    /* renamed from: g  reason: collision with root package name */
    public final String f15287g;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<OfflineTroubleshootingItem> {
        @Override // android.os.Parcelable.Creator
        public final OfflineTroubleshootingItem createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new OfflineTroubleshootingItem((LocalisationKey) parcel.readParcelable(OfflineTroubleshootingItem.class.getClassLoader()), parcel.readInt() == 0 ? null : OfflineTroubleshootingItemDetail.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final OfflineTroubleshootingItem[] newArray(int i13) {
            return new OfflineTroubleshootingItem[i13];
        }
    }

    public /* synthetic */ OfflineTroubleshootingItem(LocalisationKey localisationKey, OfflineTroubleshootingItemDetail offlineTroubleshootingItemDetail, boolean z13, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(localisationKey, (i13 & 2) != 0 ? null : offlineTroubleshootingItemDetail, (i13 & 4) != 0 ? false : z13, (i13 & 8) != 0 ? null : str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeParcelable(this.d, i13);
        OfflineTroubleshootingItemDetail offlineTroubleshootingItemDetail = this.e;
        if (offlineTroubleshootingItemDetail == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            offlineTroubleshootingItemDetail.writeToParcel(parcel, i13);
        }
        parcel.writeInt(this.f15286f ? 1 : 0);
        parcel.writeString(this.f15287g);
    }

    public OfflineTroubleshootingItem(LocalisationKey localisationKey, OfflineTroubleshootingItemDetail offlineTroubleshootingItemDetail, boolean z13, String str) {
        localisationKey.getClass();
        this.d = localisationKey;
        this.e = offlineTroubleshootingItemDetail;
        this.f15286f = z13;
        this.f15287g = str;
    }
}
