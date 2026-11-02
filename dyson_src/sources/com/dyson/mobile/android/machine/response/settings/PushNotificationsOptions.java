package com.dyson.mobile.android.machine.response.settings;

import android.os.Parcel;
import android.os.Parcelable;
import b0.y1;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import x12.r;
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/dyson/mobile/android/machine/response/settings/PushNotificationsOptions;", "Landroid/os/Parcelable;", "", "Lcom/dyson/mobile/android/machine/response/settings/NotificationGroup;", "notificationGroup", "<init>", "(Ljava/util/List;)V", "d", "Ljava/util/List;", "i", "()Ljava/util/List;", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PushNotificationsOptions implements Parcelable {
    public static final Parcelable.Creator<PushNotificationsOptions> CREATOR = new a();
    @SerializedName("groups")
    private final List<NotificationGroup> d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<PushNotificationsOptions> {
        @Override // android.os.Parcelable.Creator
        public final PushNotificationsOptions createFromParcel(Parcel parcel) {
            parcel.getClass();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i13 = 0;
            while (i13 != readInt) {
                i13 = d72.a.d(NotificationGroup.CREATOR, parcel, arrayList, i13, 1);
            }
            return new PushNotificationsOptions(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final PushNotificationsOptions[] newArray(int i13) {
            return new PushNotificationsOptions[i13];
        }
    }

    public PushNotificationsOptions(List<NotificationGroup> list) {
        list.getClass();
        this.d = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PushNotificationsOptions) && r.c(this.d, ((PushNotificationsOptions) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final List<NotificationGroup> i() {
        return this.d;
    }

    public final String toString() {
        return y1.l("PushNotificationsOptions(notificationGroup=", ")", this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        Iterator n13 = d72.a.n(this.d, parcel);
        while (n13.hasNext()) {
            ((NotificationGroup) n13.next()).writeToParcel(parcel, i13);
        }
    }
}
