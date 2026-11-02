package com.dyson.mobile.android.machine.ui.settings.notifications;

import android.os.Parcel;
import android.os.Parcelable;
import com.dyson.mobile.android.localisation.LocalisationKey;
import h12.y;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mj.f;
import x12.r;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/settings/notifications/MachineNotificationItem;", "Landroid/os/Parcelable;", "<init>", "()V", "SingleMachineNotificationItem", "CompositeMachineNotificationItem", "Lcom/dyson/mobile/android/machine/ui/settings/notifications/MachineNotificationItem$CompositeMachineNotificationItem;", "Lcom/dyson/mobile/android/machine/ui/settings/notifications/MachineNotificationItem$SingleMachineNotificationItem;", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class MachineNotificationItem implements Parcelable {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/settings/notifications/MachineNotificationItem$CompositeMachineNotificationItem;", "Lcom/dyson/mobile/android/machine/ui/settings/notifications/MachineNotificationItem;", "", "", "notificationIds", "Lcom/dyson/mobile/android/localisation/LocalisationKey;", "notificationText", "<init>", "(Ljava/util/List;Lcom/dyson/mobile/android/localisation/LocalisationKey;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class CompositeMachineNotificationItem extends MachineNotificationItem {
        public static final Parcelable.Creator<CompositeMachineNotificationItem> CREATOR = new a();
        public final List<String> d;
        public final LocalisationKey e;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator<CompositeMachineNotificationItem> {
            @Override // android.os.Parcelable.Creator
            public final CompositeMachineNotificationItem createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new CompositeMachineNotificationItem(parcel.createStringArrayList(), (LocalisationKey) parcel.readParcelable(CompositeMachineNotificationItem.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final CompositeMachineNotificationItem[] newArray(int i13) {
                return new CompositeMachineNotificationItem[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CompositeMachineNotificationItem(List<String> list, LocalisationKey localisationKey) {
            super(null);
            list.getClass();
            localisationKey.getClass();
            this.d = list;
            this.e = localisationKey;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof CompositeMachineNotificationItem) {
                CompositeMachineNotificationItem compositeMachineNotificationItem = (CompositeMachineNotificationItem) obj;
                return r.c(this.d, compositeMachineNotificationItem.d) && r.c(this.e, compositeMachineNotificationItem.e);
            }
            return false;
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        @Override // com.dyson.mobile.android.machine.ui.settings.notifications.MachineNotificationItem
        public final LocalisationKey i() {
            return this.e;
        }

        public final String toString() {
            return "CompositeMachineNotificationItem(notificationIds=" + this.d + ", notificationText=" + this.e + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeStringList(this.d);
            parcel.writeParcelable(this.e, i13);
        }
    }

    public /* synthetic */ MachineNotificationItem(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract LocalisationKey i();

    private MachineNotificationItem() {
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/settings/notifications/MachineNotificationItem$SingleMachineNotificationItem;", "Lcom/dyson/mobile/android/machine/ui/settings/notifications/MachineNotificationItem;", "", "notificationId", "Lcom/dyson/mobile/android/localisation/LocalisationKey;", "notificationText", "", "", "Lmj/f$c;", "analyticsInteractionNames", "<init>", "(Ljava/lang/String;Lcom/dyson/mobile/android/localisation/LocalisationKey;Ljava/util/Map;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class SingleMachineNotificationItem extends MachineNotificationItem {
        public static final Parcelable.Creator<SingleMachineNotificationItem> CREATOR = new a();
        public final String d;
        public final LocalisationKey e;

        /* renamed from: f  reason: collision with root package name */
        public final Map<Boolean, f.c> f15487f;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator<SingleMachineNotificationItem> {
            @Override // android.os.Parcelable.Creator
            public final SingleMachineNotificationItem createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                parcel.getClass();
                String readString = parcel.readString();
                LocalisationKey localisationKey = (LocalisationKey) parcel.readParcelable(SingleMachineNotificationItem.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                    for (int i13 = 0; i13 != readInt; i13++) {
                        linkedHashMap2.put(Boolean.valueOf(parcel.readInt() != 0), f.c.valueOf(parcel.readString()));
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new SingleMachineNotificationItem(readString, localisationKey, linkedHashMap);
            }

            @Override // android.os.Parcelable.Creator
            public final SingleMachineNotificationItem[] newArray(int i13) {
                return new SingleMachineNotificationItem[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public SingleMachineNotificationItem(String str, LocalisationKey localisationKey, Map<Boolean, ? extends f.c> map) {
            super(null);
            str.getClass();
            localisationKey.getClass();
            this.d = str;
            this.e = localisationKey;
            this.f15487f = map;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SingleMachineNotificationItem) {
                SingleMachineNotificationItem singleMachineNotificationItem = (SingleMachineNotificationItem) obj;
                return r.c(this.d, singleMachineNotificationItem.d) && r.c(this.e, singleMachineNotificationItem.e) && r.c(this.f15487f, singleMachineNotificationItem.f15487f);
            }
            return false;
        }

        public final int hashCode() {
            int e = y.e(this.e, this.d.hashCode() * 31, 31);
            Map<Boolean, f.c> map = this.f15487f;
            return e + (map == null ? 0 : map.hashCode());
        }

        @Override // com.dyson.mobile.android.machine.ui.settings.notifications.MachineNotificationItem
        public final LocalisationKey i() {
            return this.e;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("SingleMachineNotificationItem(notificationId=");
            sb2.append(this.d);
            sb2.append(", notificationText=");
            sb2.append(this.e);
            sb2.append(", analyticsInteractionNames=");
            return pa.c.g(sb2, this.f15487f, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeString(this.d);
            parcel.writeParcelable(this.e, i13);
            Map<Boolean, f.c> map = this.f15487f;
            if (map == null) {
                parcel.writeInt(0);
                return;
            }
            parcel.writeInt(1);
            parcel.writeInt(map.size());
            for (Map.Entry<Boolean, f.c> entry : map.entrySet()) {
                parcel.writeInt(entry.getKey().booleanValue() ? 1 : 0);
                parcel.writeString(entry.getValue().name());
            }
        }

        public /* synthetic */ SingleMachineNotificationItem(String str, LocalisationKey localisationKey, Map map, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, localisationKey, (i13 & 4) != 0 ? null : map);
        }
    }
}
