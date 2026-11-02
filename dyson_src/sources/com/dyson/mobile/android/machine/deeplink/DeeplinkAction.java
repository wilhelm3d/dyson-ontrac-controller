package com.dyson.mobile.android.machine.deeplink;

import android.os.Parcel;
import android.os.Parcelable;
import b0.y1;
import bv1.f;
import com.dyson.mobile.android.machinetype.MachineDescriptor;
import h12.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ma.e;
import x12.r;
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0011\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0011\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%¨\u0006&"}, d2 = {"Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction;", "Landroid/os/Parcelable;", "<init>", "()V", "OpenResolveContentUrl", "OpenErrorSupportScreen", "OpenAiChatBot", "OpenExpertContentItem", "OpenExpertContentCollection", "OpenProductInformation", "OpenBrushHeadStatusInfo", "OpenBrushHeadUnverifiedScreen", "OpenWifiTroubleshootScreen", "OpenECFilterManagementScreen", "OpenECUlComplianceBottomSheet", "OpenECSensorInitializingBottomSheet", "OpenECFirmwareUpdateAvailableBottomSheet", "OpenBatteryNonGenuineScreen", "MachinePrerequisites", "MachineOta", "MachineFilter", "Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$MachineFilter;", "Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$MachineOta;", "Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$MachinePrerequisites;", "Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$OpenAiChatBot;", "Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$OpenBatteryNonGenuineScreen;", "Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$OpenBrushHeadStatusInfo;", "Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$OpenBrushHeadUnverifiedScreen;", "Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$OpenECFilterManagementScreen;", "Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$OpenECFirmwareUpdateAvailableBottomSheet;", "Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$OpenECSensorInitializingBottomSheet;", "Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$OpenECUlComplianceBottomSheet;", "Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$OpenErrorSupportScreen;", "Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$OpenExpertContentCollection;", "Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$OpenExpertContentItem;", "Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$OpenProductInformation;", "Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$OpenResolveContentUrl;", "Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$OpenWifiTroubleshootScreen;", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class DeeplinkAction implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$OpenBatteryNonGenuineScreen;", "Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction;", "", "machineSerial", "<init>", "(Ljava/lang/String;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class OpenBatteryNonGenuineScreen extends DeeplinkAction {
        public static final Parcelable.Creator<OpenBatteryNonGenuineScreen> CREATOR = new a();
        public final String d;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator<OpenBatteryNonGenuineScreen> {
            @Override // android.os.Parcelable.Creator
            public final OpenBatteryNonGenuineScreen createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new OpenBatteryNonGenuineScreen(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final OpenBatteryNonGenuineScreen[] newArray(int i13) {
                return new OpenBatteryNonGenuineScreen[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenBatteryNonGenuineScreen(String str) {
            super(null);
            str.getClass();
            this.d = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenBatteryNonGenuineScreen) && r.c(this.d, ((OpenBatteryNonGenuineScreen) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return f.e("OpenBatteryNonGenuineScreen(machineSerial=", this.d, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$OpenBrushHeadStatusInfo;", "Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction;", "", "machineSerial", "<init>", "(Ljava/lang/String;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class OpenBrushHeadStatusInfo extends DeeplinkAction {
        public static final Parcelable.Creator<OpenBrushHeadStatusInfo> CREATOR = new a();
        public final String d;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator<OpenBrushHeadStatusInfo> {
            @Override // android.os.Parcelable.Creator
            public final OpenBrushHeadStatusInfo createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new OpenBrushHeadStatusInfo(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final OpenBrushHeadStatusInfo[] newArray(int i13) {
                return new OpenBrushHeadStatusInfo[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenBrushHeadStatusInfo(String str) {
            super(null);
            str.getClass();
            this.d = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenBrushHeadStatusInfo) && r.c(this.d, ((OpenBrushHeadStatusInfo) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return f.e("OpenBrushHeadStatusInfo(machineSerial=", this.d, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$OpenBrushHeadUnverifiedScreen;", "Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction;", "", "machineSerial", "<init>", "(Ljava/lang/String;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class OpenBrushHeadUnverifiedScreen extends DeeplinkAction {
        public static final Parcelable.Creator<OpenBrushHeadUnverifiedScreen> CREATOR = new a();
        public final String d;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator<OpenBrushHeadUnverifiedScreen> {
            @Override // android.os.Parcelable.Creator
            public final OpenBrushHeadUnverifiedScreen createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new OpenBrushHeadUnverifiedScreen(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final OpenBrushHeadUnverifiedScreen[] newArray(int i13) {
                return new OpenBrushHeadUnverifiedScreen[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenBrushHeadUnverifiedScreen(String str) {
            super(null);
            str.getClass();
            this.d = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenBrushHeadUnverifiedScreen) && r.c(this.d, ((OpenBrushHeadUnverifiedScreen) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return f.e("OpenBrushHeadUnverifiedScreen(machineSerial=", this.d, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$OpenECFilterManagementScreen;", "Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction;", "", "machineSerial", "<init>", "(Ljava/lang/String;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class OpenECFilterManagementScreen extends DeeplinkAction {
        public static final Parcelable.Creator<OpenECFilterManagementScreen> CREATOR = new a();
        public final String d;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator<OpenECFilterManagementScreen> {
            @Override // android.os.Parcelable.Creator
            public final OpenECFilterManagementScreen createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new OpenECFilterManagementScreen(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final OpenECFilterManagementScreen[] newArray(int i13) {
                return new OpenECFilterManagementScreen[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenECFilterManagementScreen(String str) {
            super(null);
            str.getClass();
            this.d = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenECFilterManagementScreen) && r.c(this.d, ((OpenECFilterManagementScreen) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return f.e("OpenECFilterManagementScreen(machineSerial=", this.d, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$OpenECFirmwareUpdateAvailableBottomSheet;", "Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction;", "", "machineSerial", "<init>", "(Ljava/lang/String;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class OpenECFirmwareUpdateAvailableBottomSheet extends DeeplinkAction {
        public static final Parcelable.Creator<OpenECFirmwareUpdateAvailableBottomSheet> CREATOR = new a();
        public final String d;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator<OpenECFirmwareUpdateAvailableBottomSheet> {
            @Override // android.os.Parcelable.Creator
            public final OpenECFirmwareUpdateAvailableBottomSheet createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new OpenECFirmwareUpdateAvailableBottomSheet(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final OpenECFirmwareUpdateAvailableBottomSheet[] newArray(int i13) {
                return new OpenECFirmwareUpdateAvailableBottomSheet[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenECFirmwareUpdateAvailableBottomSheet(String str) {
            super(null);
            str.getClass();
            this.d = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenECFirmwareUpdateAvailableBottomSheet) && r.c(this.d, ((OpenECFirmwareUpdateAvailableBottomSheet) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return f.e("OpenECFirmwareUpdateAvailableBottomSheet(machineSerial=", this.d, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$OpenECSensorInitializingBottomSheet;", "Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction;", "", "machineSerial", "<init>", "(Ljava/lang/String;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class OpenECSensorInitializingBottomSheet extends DeeplinkAction {
        public static final Parcelable.Creator<OpenECSensorInitializingBottomSheet> CREATOR = new a();
        public final String d;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator<OpenECSensorInitializingBottomSheet> {
            @Override // android.os.Parcelable.Creator
            public final OpenECSensorInitializingBottomSheet createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new OpenECSensorInitializingBottomSheet(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final OpenECSensorInitializingBottomSheet[] newArray(int i13) {
                return new OpenECSensorInitializingBottomSheet[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenECSensorInitializingBottomSheet(String str) {
            super(null);
            str.getClass();
            this.d = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenECSensorInitializingBottomSheet) && r.c(this.d, ((OpenECSensorInitializingBottomSheet) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return f.e("OpenECSensorInitializingBottomSheet(machineSerial=", this.d, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$OpenECUlComplianceBottomSheet;", "Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction;", "", "machineSerial", "<init>", "(Ljava/lang/String;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class OpenECUlComplianceBottomSheet extends DeeplinkAction {
        public static final Parcelable.Creator<OpenECUlComplianceBottomSheet> CREATOR = new a();
        public final String d;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator<OpenECUlComplianceBottomSheet> {
            @Override // android.os.Parcelable.Creator
            public final OpenECUlComplianceBottomSheet createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new OpenECUlComplianceBottomSheet(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final OpenECUlComplianceBottomSheet[] newArray(int i13) {
                return new OpenECUlComplianceBottomSheet[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenECUlComplianceBottomSheet(String str) {
            super(null);
            str.getClass();
            this.d = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenECUlComplianceBottomSheet) && r.c(this.d, ((OpenECUlComplianceBottomSheet) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return f.e("OpenECUlComplianceBottomSheet(machineSerial=", this.d, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$OpenErrorSupportScreen;", "Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction;", "", "coordinatorId", "Lcom/dyson/mobile/android/machinetype/MachineDescriptor;", "machineDescriptor", "faultCode", "<init>", "(Ljava/lang/String;Lcom/dyson/mobile/android/machinetype/MachineDescriptor;Ljava/lang/String;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class OpenErrorSupportScreen extends DeeplinkAction {
        public static final Parcelable.Creator<OpenErrorSupportScreen> CREATOR = new a();
        public final String d;
        public final MachineDescriptor e;

        /* renamed from: f  reason: collision with root package name */
        public final String f15085f;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator<OpenErrorSupportScreen> {
            @Override // android.os.Parcelable.Creator
            public final OpenErrorSupportScreen createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new OpenErrorSupportScreen(parcel.readString(), (MachineDescriptor) parcel.readSerializable(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final OpenErrorSupportScreen[] newArray(int i13) {
                return new OpenErrorSupportScreen[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenErrorSupportScreen(String str, MachineDescriptor machineDescriptor, String str2) {
            super(null);
            str.getClass();
            machineDescriptor.getClass();
            this.d = str;
            this.e = machineDescriptor;
            this.f15085f = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof OpenErrorSupportScreen) {
                OpenErrorSupportScreen openErrorSupportScreen = (OpenErrorSupportScreen) obj;
                return r.c(this.d, openErrorSupportScreen.d) && r.c(this.e, openErrorSupportScreen.e) && r.c(this.f15085f, openErrorSupportScreen.f15085f);
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = (this.e.hashCode() + (this.d.hashCode() * 31)) * 31;
            String str = this.f15085f;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenErrorSupportScreen(coordinatorId=");
            sb2.append(this.d);
            sb2.append(", machineDescriptor=");
            sb2.append(this.e);
            sb2.append(", faultCode=");
            return ie.a.h(sb2, this.f15085f, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeString(this.d);
            parcel.writeSerializable(this.e);
            parcel.writeString(this.f15085f);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$OpenExpertContentCollection;", "Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction;", "", "machineSerial", "collectionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class OpenExpertContentCollection extends DeeplinkAction {
        public static final Parcelable.Creator<OpenExpertContentCollection> CREATOR = new a();
        public final String d;
        public final String e;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator<OpenExpertContentCollection> {
            @Override // android.os.Parcelable.Creator
            public final OpenExpertContentCollection createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new OpenExpertContentCollection(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final OpenExpertContentCollection[] newArray(int i13) {
                return new OpenExpertContentCollection[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenExpertContentCollection(String str, String str2) {
            super(null);
            str.getClass();
            str2.getClass();
            this.d = str;
            this.e = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof OpenExpertContentCollection) {
                OpenExpertContentCollection openExpertContentCollection = (OpenExpertContentCollection) obj;
                return r.c(this.d, openExpertContentCollection.d) && r.c(this.e, openExpertContentCollection.e);
            }
            return false;
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        public final String toString() {
            return y1.j("OpenExpertContentCollection(machineSerial=", this.d, ", collectionId=", this.e, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeString(this.d);
            parcel.writeString(this.e);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$OpenExpertContentItem;", "Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction;", "", "machineSerial", "collectionId", "itemId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class OpenExpertContentItem extends DeeplinkAction {
        public static final Parcelable.Creator<OpenExpertContentItem> CREATOR = new a();
        public final String d;
        public final String e;

        /* renamed from: f  reason: collision with root package name */
        public final String f15086f;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator<OpenExpertContentItem> {
            @Override // android.os.Parcelable.Creator
            public final OpenExpertContentItem createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new OpenExpertContentItem(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final OpenExpertContentItem[] newArray(int i13) {
                return new OpenExpertContentItem[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenExpertContentItem(String str, String str2, String str3) {
            super(null);
            d72.a.v(str, str2, str3);
            this.d = str;
            this.e = str2;
            this.f15086f = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof OpenExpertContentItem) {
                OpenExpertContentItem openExpertContentItem = (OpenExpertContentItem) obj;
                return r.c(this.d, openExpertContentItem.d) && r.c(this.e, openExpertContentItem.e) && r.c(this.f15086f, openExpertContentItem.f15086f);
            }
            return false;
        }

        public final int hashCode() {
            return this.f15086f.hashCode() + y.c(this.d.hashCode() * 31, 31, this.e);
        }

        public final String toString() {
            return ie.a.h(e.m("OpenExpertContentItem(machineSerial=", this.d, ", collectionId=", this.e, ", itemId="), this.f15086f, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeString(this.f15086f);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$OpenProductInformation;", "Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction;", "", "machineSerial", "itemId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class OpenProductInformation extends DeeplinkAction {
        public static final Parcelable.Creator<OpenProductInformation> CREATOR = new a();
        public final String d;
        public final String e;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator<OpenProductInformation> {
            @Override // android.os.Parcelable.Creator
            public final OpenProductInformation createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new OpenProductInformation(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final OpenProductInformation[] newArray(int i13) {
                return new OpenProductInformation[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenProductInformation(String str, String str2) {
            super(null);
            str.getClass();
            str2.getClass();
            this.d = str;
            this.e = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof OpenProductInformation) {
                OpenProductInformation openProductInformation = (OpenProductInformation) obj;
                return r.c(this.d, openProductInformation.d) && r.c(this.e, openProductInformation.e);
            }
            return false;
        }

        public final int hashCode() {
            return this.e.hashCode() + (this.d.hashCode() * 31);
        }

        public final String toString() {
            return y1.j("OpenProductInformation(machineSerial=", this.d, ", itemId=", this.e, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeString(this.d);
            parcel.writeString(this.e);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$OpenResolveContentUrl;", "Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction;", "", "url", "<init>", "(Ljava/lang/String;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class OpenResolveContentUrl extends DeeplinkAction {
        public static final Parcelable.Creator<OpenResolveContentUrl> CREATOR = new a();
        public final String d;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator<OpenResolveContentUrl> {
            @Override // android.os.Parcelable.Creator
            public final OpenResolveContentUrl createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new OpenResolveContentUrl(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final OpenResolveContentUrl[] newArray(int i13) {
                return new OpenResolveContentUrl[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenResolveContentUrl(String str) {
            super(null);
            str.getClass();
            this.d = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenResolveContentUrl) && r.c(this.d, ((OpenResolveContentUrl) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return f.e("OpenResolveContentUrl(url=", this.d, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$OpenWifiTroubleshootScreen;", "Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction;", "", "machineSerial", "<init>", "(Ljava/lang/String;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class OpenWifiTroubleshootScreen extends DeeplinkAction {
        public static final Parcelable.Creator<OpenWifiTroubleshootScreen> CREATOR = new a();
        public final String d;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator<OpenWifiTroubleshootScreen> {
            @Override // android.os.Parcelable.Creator
            public final OpenWifiTroubleshootScreen createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new OpenWifiTroubleshootScreen(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final OpenWifiTroubleshootScreen[] newArray(int i13) {
                return new OpenWifiTroubleshootScreen[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenWifiTroubleshootScreen(String str) {
            super(null);
            str.getClass();
            this.d = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenWifiTroubleshootScreen) && r.c(this.d, ((OpenWifiTroubleshootScreen) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return f.e("OpenWifiTroubleshootScreen(machineSerial=", this.d, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeString(this.d);
        }
    }

    public /* synthetic */ DeeplinkAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0006\u0007\bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$MachineFilter;", "Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction;", "", "machineSerial", "<init>", "(Ljava/lang/String;)V", "Blocked", "Dirty", "Removed", "Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$MachineFilter$Blocked;", "Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$MachineFilter$Dirty;", "Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$MachineFilter$Removed;", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static abstract class MachineFilter extends DeeplinkAction {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$MachineFilter$Blocked;", "Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$MachineFilter;", "", "machineSerial", "<init>", "(Ljava/lang/String;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Blocked extends MachineFilter {
            public static final Parcelable.Creator<Blocked> CREATOR = new a();
            public final String d;

            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* loaded from: classes3.dex */
            public static final class a implements Parcelable.Creator<Blocked> {
                @Override // android.os.Parcelable.Creator
                public final Blocked createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new Blocked(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Blocked[] newArray(int i13) {
                    return new Blocked[i13];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Blocked(String str) {
                super(str, null);
                str.getClass();
                this.d = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Blocked) && r.c(this.d, ((Blocked) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return f.e("Blocked(machineSerial=", this.d, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i13) {
                parcel.getClass();
                parcel.writeString(this.d);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$MachineFilter$Dirty;", "Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$MachineFilter;", "", "machineSerial", "<init>", "(Ljava/lang/String;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Dirty extends MachineFilter {
            public static final Parcelable.Creator<Dirty> CREATOR = new a();
            public final String d;

            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* loaded from: classes3.dex */
            public static final class a implements Parcelable.Creator<Dirty> {
                @Override // android.os.Parcelable.Creator
                public final Dirty createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new Dirty(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Dirty[] newArray(int i13) {
                    return new Dirty[i13];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Dirty(String str) {
                super(str, null);
                str.getClass();
                this.d = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Dirty) && r.c(this.d, ((Dirty) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return f.e("Dirty(machineSerial=", this.d, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i13) {
                parcel.getClass();
                parcel.writeString(this.d);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$MachineFilter$Removed;", "Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$MachineFilter;", "", "machineSerial", "<init>", "(Ljava/lang/String;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Removed extends MachineFilter {
            public static final Parcelable.Creator<Removed> CREATOR = new a();
            public final String d;

            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* loaded from: classes3.dex */
            public static final class a implements Parcelable.Creator<Removed> {
                @Override // android.os.Parcelable.Creator
                public final Removed createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new Removed(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Removed[] newArray(int i13) {
                    return new Removed[i13];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Removed(String str) {
                super(str, null);
                str.getClass();
                this.d = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Removed) && r.c(this.d, ((Removed) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return f.e("Removed(machineSerial=", this.d, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i13) {
                parcel.getClass();
                parcel.writeString(this.d);
            }
        }

        private MachineFilter(String str) {
            super(null);
        }

        public /* synthetic */ MachineFilter(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$MachineOta;", "Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction;", "", "machineSerial", "<init>", "(Ljava/lang/String;)V", "Downloading", "ReadyToInstall", "Installing", "Failed", "Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$MachineOta$Downloading;", "Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$MachineOta$Failed;", "Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$MachineOta$Installing;", "Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$MachineOta$ReadyToInstall;", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static abstract class MachineOta extends DeeplinkAction {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$MachineOta$Downloading;", "Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$MachineOta;", "", "machineSerial", "<init>", "(Ljava/lang/String;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Downloading extends MachineOta {
            public static final Parcelable.Creator<Downloading> CREATOR = new a();
            public final String d;

            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* loaded from: classes3.dex */
            public static final class a implements Parcelable.Creator<Downloading> {
                @Override // android.os.Parcelable.Creator
                public final Downloading createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new Downloading(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Downloading[] newArray(int i13) {
                    return new Downloading[i13];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Downloading(String str) {
                super(str, null);
                str.getClass();
                this.d = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Downloading) && r.c(this.d, ((Downloading) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return f.e("Downloading(machineSerial=", this.d, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i13) {
                parcel.getClass();
                parcel.writeString(this.d);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$MachineOta$Failed;", "Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$MachineOta;", "", "machineSerial", "<init>", "(Ljava/lang/String;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Failed extends MachineOta {
            public static final Parcelable.Creator<Failed> CREATOR = new a();
            public final String d;

            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* loaded from: classes3.dex */
            public static final class a implements Parcelable.Creator<Failed> {
                @Override // android.os.Parcelable.Creator
                public final Failed createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new Failed(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Failed[] newArray(int i13) {
                    return new Failed[i13];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Failed(String str) {
                super(str, null);
                str.getClass();
                this.d = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Failed) && r.c(this.d, ((Failed) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return f.e("Failed(machineSerial=", this.d, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i13) {
                parcel.getClass();
                parcel.writeString(this.d);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$MachineOta$Installing;", "Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$MachineOta;", "", "machineSerial", "<init>", "(Ljava/lang/String;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Installing extends MachineOta {
            public static final Parcelable.Creator<Installing> CREATOR = new a();
            public final String d;

            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* loaded from: classes3.dex */
            public static final class a implements Parcelable.Creator<Installing> {
                @Override // android.os.Parcelable.Creator
                public final Installing createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new Installing(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Installing[] newArray(int i13) {
                    return new Installing[i13];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Installing(String str) {
                super(str, null);
                str.getClass();
                this.d = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Installing) && r.c(this.d, ((Installing) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return f.e("Installing(machineSerial=", this.d, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i13) {
                parcel.getClass();
                parcel.writeString(this.d);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$MachineOta$ReadyToInstall;", "Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$MachineOta;", "", "machineSerial", "<init>", "(Ljava/lang/String;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class ReadyToInstall extends MachineOta {
            public static final Parcelable.Creator<ReadyToInstall> CREATOR = new a();
            public final String d;

            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* loaded from: classes3.dex */
            public static final class a implements Parcelable.Creator<ReadyToInstall> {
                @Override // android.os.Parcelable.Creator
                public final ReadyToInstall createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new ReadyToInstall(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final ReadyToInstall[] newArray(int i13) {
                    return new ReadyToInstall[i13];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ReadyToInstall(String str) {
                super(str, null);
                str.getClass();
                this.d = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof ReadyToInstall) && r.c(this.d, ((ReadyToInstall) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return f.e("ReadyToInstall(machineSerial=", this.d, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i13) {
                parcel.getClass();
                parcel.writeString(this.d);
            }
        }

        private MachineOta(String str) {
            super(null);
        }

        public /* synthetic */ MachineOta(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0006\u0007\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0004\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$MachinePrerequisites;", "Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction;", "", "machineSerial", "<init>", "(Ljava/lang/String;)V", "BluetoothOff", "LocationPermissionNotGranted", "NearbyDevicePermissionNotGranted", "MachineNotConnected", "Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$MachinePrerequisites$BluetoothOff;", "Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$MachinePrerequisites$LocationPermissionNotGranted;", "Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$MachinePrerequisites$MachineNotConnected;", "Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$MachinePrerequisites$NearbyDevicePermissionNotGranted;", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static abstract class MachinePrerequisites extends DeeplinkAction {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$MachinePrerequisites$BluetoothOff;", "Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$MachinePrerequisites;", "", "machineSerial", "<init>", "(Ljava/lang/String;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class BluetoothOff extends MachinePrerequisites {
            public static final Parcelable.Creator<BluetoothOff> CREATOR = new a();
            public final String d;

            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* loaded from: classes3.dex */
            public static final class a implements Parcelable.Creator<BluetoothOff> {
                @Override // android.os.Parcelable.Creator
                public final BluetoothOff createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new BluetoothOff(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final BluetoothOff[] newArray(int i13) {
                    return new BluetoothOff[i13];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public BluetoothOff(String str) {
                super(str, null);
                str.getClass();
                this.d = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof BluetoothOff) && r.c(this.d, ((BluetoothOff) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return f.e("BluetoothOff(machineSerial=", this.d, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i13) {
                parcel.getClass();
                parcel.writeString(this.d);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$MachinePrerequisites$LocationPermissionNotGranted;", "Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$MachinePrerequisites;", "", "machineSerial", "<init>", "(Ljava/lang/String;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class LocationPermissionNotGranted extends MachinePrerequisites {
            public static final Parcelable.Creator<LocationPermissionNotGranted> CREATOR = new a();
            public final String d;

            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* loaded from: classes3.dex */
            public static final class a implements Parcelable.Creator<LocationPermissionNotGranted> {
                @Override // android.os.Parcelable.Creator
                public final LocationPermissionNotGranted createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new LocationPermissionNotGranted(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final LocationPermissionNotGranted[] newArray(int i13) {
                    return new LocationPermissionNotGranted[i13];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public LocationPermissionNotGranted(String str) {
                super(str, null);
                str.getClass();
                this.d = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof LocationPermissionNotGranted) && r.c(this.d, ((LocationPermissionNotGranted) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return f.e("LocationPermissionNotGranted(machineSerial=", this.d, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i13) {
                parcel.getClass();
                parcel.writeString(this.d);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$MachinePrerequisites$MachineNotConnected;", "Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$MachinePrerequisites;", "", "machineSerial", "<init>", "(Ljava/lang/String;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class MachineNotConnected extends MachinePrerequisites {
            public static final Parcelable.Creator<MachineNotConnected> CREATOR = new a();
            public final String d;

            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* loaded from: classes3.dex */
            public static final class a implements Parcelable.Creator<MachineNotConnected> {
                @Override // android.os.Parcelable.Creator
                public final MachineNotConnected createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new MachineNotConnected(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final MachineNotConnected[] newArray(int i13) {
                    return new MachineNotConnected[i13];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MachineNotConnected(String str) {
                super(str, null);
                str.getClass();
                this.d = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof MachineNotConnected) && r.c(this.d, ((MachineNotConnected) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return f.e("MachineNotConnected(machineSerial=", this.d, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i13) {
                parcel.getClass();
                parcel.writeString(this.d);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$MachinePrerequisites$NearbyDevicePermissionNotGranted;", "Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$MachinePrerequisites;", "", "machineSerial", "<init>", "(Ljava/lang/String;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class NearbyDevicePermissionNotGranted extends MachinePrerequisites {
            public static final Parcelable.Creator<NearbyDevicePermissionNotGranted> CREATOR = new a();
            public final String d;

            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            /* loaded from: classes3.dex */
            public static final class a implements Parcelable.Creator<NearbyDevicePermissionNotGranted> {
                @Override // android.os.Parcelable.Creator
                public final NearbyDevicePermissionNotGranted createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new NearbyDevicePermissionNotGranted(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final NearbyDevicePermissionNotGranted[] newArray(int i13) {
                    return new NearbyDevicePermissionNotGranted[i13];
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NearbyDevicePermissionNotGranted(String str) {
                super(str, null);
                str.getClass();
                this.d = str;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof NearbyDevicePermissionNotGranted) && r.c(this.d, ((NearbyDevicePermissionNotGranted) obj).d);
            }

            public final int hashCode() {
                return this.d.hashCode();
            }

            public final String toString() {
                return f.e("NearbyDevicePermissionNotGranted(machineSerial=", this.d, ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i13) {
                parcel.getClass();
                parcel.writeString(this.d);
            }
        }

        private MachinePrerequisites(String str) {
            super(null);
        }

        public /* synthetic */ MachinePrerequisites(String str, DefaultConstructorMarker defaultConstructorMarker) {
            this(str);
        }
    }

    private DeeplinkAction() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction$OpenAiChatBot;", "Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction;", "", "machineSerial", "faultCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class OpenAiChatBot extends DeeplinkAction {
        public static final Parcelable.Creator<OpenAiChatBot> CREATOR = new a();
        public final String d;
        public final String e;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator<OpenAiChatBot> {
            @Override // android.os.Parcelable.Creator
            public final OpenAiChatBot createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new OpenAiChatBot(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final OpenAiChatBot[] newArray(int i13) {
                return new OpenAiChatBot[i13];
            }
        }

        public /* synthetic */ OpenAiChatBot(String str, String str2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : str, (i13 & 2) != 0 ? null : str2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof OpenAiChatBot) {
                OpenAiChatBot openAiChatBot = (OpenAiChatBot) obj;
                return r.c(this.d, openAiChatBot.d) && r.c(this.e, openAiChatBot.e);
            }
            return false;
        }

        public final int hashCode() {
            String str = this.d;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.e;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return y1.j("OpenAiChatBot(machineSerial=", this.d, ", faultCode=", this.e, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeString(this.d);
            parcel.writeString(this.e);
        }

        public OpenAiChatBot(String str, String str2) {
            super(null);
            this.d = str;
            this.e = str2;
        }

        public OpenAiChatBot() {
            this(null, null, 3, null);
        }
    }
}
