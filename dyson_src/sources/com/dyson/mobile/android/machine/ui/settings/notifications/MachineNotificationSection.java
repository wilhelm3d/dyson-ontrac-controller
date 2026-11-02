package com.dyson.mobile.android.machine.ui.settings.notifications;

import android.os.Parcel;
import android.os.Parcelable;
import com.dyson.mobile.android.localisation.LocalisationKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/settings/notifications/MachineNotificationSection;", "Landroid/os/Parcelable;", "Lcom/dyson/mobile/android/localisation/LocalisationKey;", "sectionTitle", "", "Lcom/dyson/mobile/android/machine/ui/settings/notifications/MachineNotificationItem;", "notifications", "<init>", "(Lcom/dyson/mobile/android/localisation/LocalisationKey;Ljava/util/List;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MachineNotificationSection implements Parcelable {
    public static final Parcelable.Creator<MachineNotificationSection> CREATOR = new a();
    public final LocalisationKey d;
    public final List<MachineNotificationItem> e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<MachineNotificationSection> {
        @Override // android.os.Parcelable.Creator
        public final MachineNotificationSection createFromParcel(Parcel parcel) {
            parcel.getClass();
            LocalisationKey localisationKey = (LocalisationKey) parcel.readParcelable(MachineNotificationSection.class.getClassLoader());
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i13 = 0; i13 != readInt; i13++) {
                arrayList.add(parcel.readParcelable(MachineNotificationSection.class.getClassLoader()));
            }
            return new MachineNotificationSection(localisationKey, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final MachineNotificationSection[] newArray(int i13) {
            return new MachineNotificationSection[i13];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MachineNotificationSection(LocalisationKey localisationKey, List<? extends MachineNotificationItem> list) {
        localisationKey.getClass();
        list.getClass();
        this.d = localisationKey;
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
        if (obj instanceof MachineNotificationSection) {
            MachineNotificationSection machineNotificationSection = (MachineNotificationSection) obj;
            return this.d.equals(machineNotificationSection.d) && this.e.equals(machineNotificationSection.e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return "MachineNotificationSection(sectionTitle=" + this.d + ", notifications=" + this.e + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeParcelable(this.d, i13);
        Iterator n13 = d72.a.n(this.e, parcel);
        while (n13.hasNext()) {
            parcel.writeParcelable((Parcelable) n13.next(), i13);
        }
    }
}
