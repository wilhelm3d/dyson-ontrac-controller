package com.dyson.mobile.android.machine.ui.name;

import android.os.Parcel;
import android.os.Parcelable;
import hx.v;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/name/CustomNameType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "Lh12/f0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "MACHINE_NAME", "ROBOT_MAP_NAME", "ROBOT_ROOM_NAME", "EC_ROOM_NAME", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CustomNameType implements Parcelable {
    private static final /* synthetic */ o12.a $ENTRIES;
    private static final /* synthetic */ CustomNameType[] $VALUES;
    public static final Parcelable.Creator<CustomNameType> CREATOR;
    public static final CustomNameType MACHINE_NAME = new CustomNameType("MACHINE_NAME", 0);
    public static final CustomNameType ROBOT_MAP_NAME = new CustomNameType("ROBOT_MAP_NAME", 1);
    public static final CustomNameType ROBOT_ROOM_NAME = new CustomNameType("ROBOT_ROOM_NAME", 2);
    public static final CustomNameType EC_ROOM_NAME = new CustomNameType("EC_ROOM_NAME", 3);

    private static final /* synthetic */ CustomNameType[] $values() {
        return new CustomNameType[]{MACHINE_NAME, ROBOT_MAP_NAME, ROBOT_ROOM_NAME, EC_ROOM_NAME};
    }

    static {
        CustomNameType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = v.l($values);
        CREATOR = new Parcelable.Creator<CustomNameType>() { // from class: com.dyson.mobile.android.machine.ui.name.CustomNameType.a
            @Override // android.os.Parcelable.Creator
            public final CustomNameType createFromParcel(Parcel parcel) {
                parcel.getClass();
                return CustomNameType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final CustomNameType[] newArray(int i13) {
                return new CustomNameType[i13];
            }
        };
    }

    private CustomNameType(String str, int i13) {
    }

    public static o12.a<CustomNameType> getEntries() {
        return $ENTRIES;
    }

    public static CustomNameType valueOf(String str) {
        return (CustomNameType) Enum.valueOf(CustomNameType.class, str);
    }

    public static CustomNameType[] values() {
        return (CustomNameType[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeString(name());
    }
}
