package com.dyson.mobile.android.machine.offlinetroubleshooting;

import android.os.Parcel;
import android.os.Parcelable;
import com.dyson.mobile.android.localisation.LocalisationKey;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0010\b\u0003\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/dyson/mobile/android/machine/offlinetroubleshooting/OfflineTroubleshootingItemDetail;", "Landroid/os/Parcelable;", "Lcom/dyson/mobile/android/localisation/LocalisationKey;", "title", "description", "", "", "icons", "<init>", "(Lcom/dyson/mobile/android/localisation/LocalisationKey;Lcom/dyson/mobile/android/localisation/LocalisationKey;Ljava/util/List;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OfflineTroubleshootingItemDetail implements Parcelable {
    public static final Parcelable.Creator<OfflineTroubleshootingItemDetail> CREATOR = new a();
    public final LocalisationKey d;
    public final LocalisationKey e;

    /* renamed from: f  reason: collision with root package name */
    public final List<Integer> f15288f;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<OfflineTroubleshootingItemDetail> {
        @Override // android.os.Parcelable.Creator
        public final OfflineTroubleshootingItemDetail createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            parcel.getClass();
            LocalisationKey localisationKey = (LocalisationKey) parcel.readParcelable(OfflineTroubleshootingItemDetail.class.getClassLoader());
            LocalisationKey localisationKey2 = (LocalisationKey) parcel.readParcelable(OfflineTroubleshootingItemDetail.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                for (int i13 = 0; i13 != readInt; i13++) {
                    arrayList2.add(Integer.valueOf(parcel.readInt()));
                }
                arrayList = arrayList2;
            }
            return new OfflineTroubleshootingItemDetail(localisationKey, localisationKey2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final OfflineTroubleshootingItemDetail[] newArray(int i13) {
            return new OfflineTroubleshootingItemDetail[i13];
        }
    }

    public OfflineTroubleshootingItemDetail(LocalisationKey localisationKey, LocalisationKey localisationKey2, List<Integer> list) {
        localisationKey.getClass();
        localisationKey2.getClass();
        this.d = localisationKey;
        this.e = localisationKey2;
        this.f15288f = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeParcelable(this.d, i13);
        parcel.writeParcelable(this.e, i13);
        List<Integer> list = this.f15288f;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        for (Integer num : list) {
            parcel.writeInt(num.intValue());
        }
    }

    public /* synthetic */ OfflineTroubleshootingItemDetail(LocalisationKey localisationKey, LocalisationKey localisationKey2, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(localisationKey, localisationKey2, (i13 & 4) != 0 ? null : list);
    }
}
