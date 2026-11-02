package com.dyson.mobile.android.interactableec.settings;

import android.os.Parcel;
import android.os.Parcelable;
import com.dyson.mobile.android.machine.ui.settings.notifications.MachineNotifications;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/dyson/mobile/android/interactableec/settings/SettingsDestination;", "Landroid/os/Parcelable;", "ManageNotificationScreen", "RemoveMachineScreen", "SetManualLocationScreen", "Lcom/dyson/mobile/android/interactableec/settings/SettingsDestination$ManageNotificationScreen;", "Lcom/dyson/mobile/android/interactableec/settings/SettingsDestination$RemoveMachineScreen;", "Lcom/dyson/mobile/android/interactableec/settings/SettingsDestination$SetManualLocationScreen;", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface SettingsDestination extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/interactableec/settings/SettingsDestination$ManageNotificationScreen;", "Lcom/dyson/mobile/android/interactableec/settings/SettingsDestination;", "Lcom/dyson/mobile/android/machine/ui/settings/notifications/MachineNotifications;", "machineNotificationSections", "<init>", "(Lcom/dyson/mobile/android/machine/ui/settings/notifications/MachineNotifications;)V", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class ManageNotificationScreen implements SettingsDestination {
        public static final Parcelable.Creator<ManageNotificationScreen> CREATOR;
        public final MachineNotifications d;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class a implements Parcelable.Creator<ManageNotificationScreen> {
            @Override // android.os.Parcelable.Creator
            public final ManageNotificationScreen createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ManageNotificationScreen((MachineNotifications) parcel.readParcelable(ManageNotificationScreen.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final ManageNotificationScreen[] newArray(int i13) {
                return new ManageNotificationScreen[i13];
            }
        }

        static {
            Parcelable.Creator<MachineNotifications> creator = MachineNotifications.CREATOR;
            CREATOR = new a();
        }

        public ManageNotificationScreen(MachineNotifications machineNotifications) {
            machineNotifications.getClass();
            this.d = machineNotifications;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeParcelable(this.d, i13);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/interactableec/settings/SettingsDestination$RemoveMachineScreen;", "Lcom/dyson/mobile/android/interactableec/settings/SettingsDestination;", "", "isOwner", "<init>", "(Z)V", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class RemoveMachineScreen implements SettingsDestination {
        public static final Parcelable.Creator<RemoveMachineScreen> CREATOR = new a();
        public final boolean d;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class a implements Parcelable.Creator<RemoveMachineScreen> {
            @Override // android.os.Parcelable.Creator
            public final RemoveMachineScreen createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new RemoveMachineScreen(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final RemoveMachineScreen[] newArray(int i13) {
                return new RemoveMachineScreen[i13];
            }
        }

        public RemoveMachineScreen(boolean z13) {
            this.d = z13;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeInt(this.d ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/interactableec/settings/SettingsDestination$SetManualLocationScreen;", "Lcom/dyson/mobile/android/interactableec/settings/SettingsDestination;", "", "machineSerial", "<init>", "(Ljava/lang/String;)V", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class SetManualLocationScreen implements SettingsDestination {
        public static final Parcelable.Creator<SetManualLocationScreen> CREATOR = new a();
        public final String d;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class a implements Parcelable.Creator<SetManualLocationScreen> {
            @Override // android.os.Parcelable.Creator
            public final SetManualLocationScreen createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new SetManualLocationScreen(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SetManualLocationScreen[] newArray(int i13) {
                return new SetManualLocationScreen[i13];
            }
        }

        public SetManualLocationScreen(String str) {
            str.getClass();
            this.d = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeString(this.d);
        }
    }
}
