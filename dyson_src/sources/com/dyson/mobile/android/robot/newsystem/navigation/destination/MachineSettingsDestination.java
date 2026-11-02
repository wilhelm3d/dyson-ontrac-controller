package com.dyson.mobile.android.robot.newsystem.navigation.destination;

import android.os.Parcel;
import android.os.Parcelable;
import h12.l;
import h12.m;
import h12.n;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t42.b;
import t42.g;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/MachineSettingsDestination;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/RobotDestination;", "<init>", "()V", "MopSettings", "DockSettings", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/MachineSettingsDestination$DockSettings;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/MachineSettingsDestination$MopSettings;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class MachineSettingsDestination implements RobotDestination {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/MachineSettingsDestination$DockSettings;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/MachineSettingsDestination;", "<init>", "()V", "Lt42/b;", "serializer", "()Lt42/b;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes3.dex */
    public static final class DockSettings extends MachineSettingsDestination {
        public static final DockSettings INSTANCE = new DockSettings();
        public static final Parcelable.Creator<DockSettings> CREATOR = new a();
        public static final /* synthetic */ l<b<Object>> d = m.a(n.PUBLICATION, new qy.a(12));

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator<DockSettings> {
            @Override // android.os.Parcelable.Creator
            public final DockSettings createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return DockSettings.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final DockSettings[] newArray(int i13) {
                return new DockSettings[i13];
            }
        }

        private DockSettings() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof DockSettings);
        }

        public final int hashCode() {
            return -669883850;
        }

        public final b<DockSettings> serializer() {
            return d.getValue();
        }

        public final String toString() {
            return "DockSettings";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/MachineSettingsDestination$MopSettings;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/MachineSettingsDestination;", "<init>", "()V", "Lt42/b;", "serializer", "()Lt42/b;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes3.dex */
    public static final class MopSettings extends MachineSettingsDestination {
        public static final MopSettings INSTANCE = new MopSettings();
        public static final Parcelable.Creator<MopSettings> CREATOR = new a();
        public static final /* synthetic */ l<b<Object>> d = m.a(n.PUBLICATION, new qy.a(13));

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator<MopSettings> {
            @Override // android.os.Parcelable.Creator
            public final MopSettings createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return MopSettings.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final MopSettings[] newArray(int i13) {
                return new MopSettings[i13];
            }
        }

        private MopSettings() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MopSettings);
        }

        public final int hashCode() {
            return 557088401;
        }

        public final b<MopSettings> serializer() {
            return d.getValue();
        }

        public final String toString() {
            return "MopSettings";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ MachineSettingsDestination(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private MachineSettingsDestination() {
    }
}
