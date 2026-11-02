package com.dyson.mobile.android.machine.offlinetroubleshooting;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x12.r;
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/machine/offlinetroubleshooting/OfflineTroubleshootingData;", "Landroid/os/Parcelable;", "", "Lcom/dyson/mobile/android/machine/offlinetroubleshooting/OfflineTroubleshootingSection;", "sections", "", "showBottomButtonSection", "<init>", "(Ljava/util/List;Z)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OfflineTroubleshootingData implements Parcelable {
    public static final Parcelable.Creator<OfflineTroubleshootingData> CREATOR = new a();
    public final List<OfflineTroubleshootingSection> d;
    public final boolean e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<OfflineTroubleshootingData> {
        @Override // android.os.Parcelable.Creator
        public final OfflineTroubleshootingData createFromParcel(Parcel parcel) {
            parcel.getClass();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i13 = 0;
            while (i13 != readInt) {
                i13 = d72.a.d(OfflineTroubleshootingSection.CREATOR, parcel, arrayList, i13, 1);
            }
            return new OfflineTroubleshootingData(arrayList, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final OfflineTroubleshootingData[] newArray(int i13) {
            return new OfflineTroubleshootingData[i13];
        }
    }

    public OfflineTroubleshootingData(List<OfflineTroubleshootingSection> list, boolean z13) {
        list.getClass();
        this.d = list;
        this.e = z13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OfflineTroubleshootingData) {
            OfflineTroubleshootingData offlineTroubleshootingData = (OfflineTroubleshootingData) obj;
            return r.c(this.d, offlineTroubleshootingData.d) && this.e == offlineTroubleshootingData.e;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return "OfflineTroubleshootingData(sections=" + this.d + ", showBottomButtonSection=" + this.e + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        Iterator n13 = d72.a.n(this.d, parcel);
        while (n13.hasNext()) {
            ((OfflineTroubleshootingSection) n13.next()).writeToParcel(parcel, i13);
        }
        parcel.writeInt(this.e ? 1 : 0);
    }

    public /* synthetic */ OfflineTroubleshootingData(List list, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i13 & 2) != 0 ? true : z13);
    }
}
