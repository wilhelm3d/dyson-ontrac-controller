package com.dyson.mobile.android.machine.offlinetroubleshooting;

import android.os.Parcel;
import android.os.Parcelable;
import b0.g;
import com.dyson.mobile.android.localisation.LocalisationKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x12.r;
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/dyson/mobile/android/machine/offlinetroubleshooting/OfflineTroubleshootingSection;", "Landroid/os/Parcelable;", "Lcom/dyson/mobile/android/localisation/LocalisationKey;", "title", "description", "", "Lcom/dyson/mobile/android/machine/offlinetroubleshooting/OfflineTroubleshootingItem;", "items", "<init>", "(Lcom/dyson/mobile/android/localisation/LocalisationKey;Lcom/dyson/mobile/android/localisation/LocalisationKey;Ljava/util/List;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OfflineTroubleshootingSection implements Parcelable {
    public static final Parcelable.Creator<OfflineTroubleshootingSection> CREATOR = new a();
    public final LocalisationKey d;
    public final LocalisationKey e;

    /* renamed from: f  reason: collision with root package name */
    public final List<OfflineTroubleshootingItem> f15289f;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<OfflineTroubleshootingSection> {
        @Override // android.os.Parcelable.Creator
        public final OfflineTroubleshootingSection createFromParcel(Parcel parcel) {
            parcel.getClass();
            LocalisationKey localisationKey = (LocalisationKey) parcel.readParcelable(OfflineTroubleshootingSection.class.getClassLoader());
            LocalisationKey localisationKey2 = (LocalisationKey) parcel.readParcelable(OfflineTroubleshootingSection.class.getClassLoader());
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i13 = 0; i13 != readInt; i13++) {
                arrayList.add(parcel.readParcelable(OfflineTroubleshootingSection.class.getClassLoader()));
            }
            return new OfflineTroubleshootingSection(localisationKey, localisationKey2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final OfflineTroubleshootingSection[] newArray(int i13) {
            return new OfflineTroubleshootingSection[i13];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OfflineTroubleshootingSection(LocalisationKey localisationKey, LocalisationKey localisationKey2, List<? extends OfflineTroubleshootingItem> list) {
        localisationKey.getClass();
        list.getClass();
        this.d = localisationKey;
        this.e = localisationKey2;
        this.f15289f = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OfflineTroubleshootingSection) {
            OfflineTroubleshootingSection offlineTroubleshootingSection = (OfflineTroubleshootingSection) obj;
            return r.c(this.d, offlineTroubleshootingSection.d) && r.c(this.e, offlineTroubleshootingSection.e) && r.c(this.f15289f, offlineTroubleshootingSection.f15289f);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.d.hashCode() * 31;
        LocalisationKey localisationKey = this.e;
        return this.f15289f.hashCode() + ((hashCode + (localisationKey == null ? 0 : localisationKey.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OfflineTroubleshootingSection(title=");
        sb2.append(this.d);
        sb2.append(", description=");
        sb2.append(this.e);
        sb2.append(", items=");
        return g.k(sb2, this.f15289f, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeParcelable(this.d, i13);
        parcel.writeParcelable(this.e, i13);
        Iterator n13 = d72.a.n(this.f15289f, parcel);
        while (n13.hasNext()) {
            parcel.writeParcelable((Parcelable) n13.next(), i13);
        }
    }

    public /* synthetic */ OfflineTroubleshootingSection(LocalisationKey localisationKey, LocalisationKey localisationKey2, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(localisationKey, (i13 & 2) != 0 ? null : localisationKey2, list);
    }
}
