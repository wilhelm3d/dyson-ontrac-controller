package com.dyson.mobile.android.light.schedule;

import android.os.Parcel;
import android.os.Parcelable;
import com.dyson.mobile.android.schedule.response.ScheduleSettings;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0017\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0005¨\u0006\u000b"}, d2 = {"Lcom/dyson/mobile/android/light/schedule/LightScheduleSettings;", "Lcom/dyson/mobile/android/schedule/response/ScheduleSettings;", "", "eventType", "<init>", "(I)V", "d", "I", "getEventType", "()I", "setEventType", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public class LightScheduleSettings extends ScheduleSettings {
    public static final Parcelable.Creator<LightScheduleSettings> CREATOR = new a();
    @SerializedName("et")
    private int d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements Parcelable.Creator<LightScheduleSettings> {
        @Override // android.os.Parcelable.Creator
        public final LightScheduleSettings createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new LightScheduleSettings(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final LightScheduleSettings[] newArray(int i13) {
            return new LightScheduleSettings[i13];
        }
    }

    public /* synthetic */ LightScheduleSettings(int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 1 : i13);
    }

    @Override // com.dyson.mobile.android.schedule.response.ScheduleSettings
    public final Object clone() {
        return new LightScheduleSettings(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (getClass().equals(obj != null ? obj.getClass() : null)) {
            obj.getClass();
            return this.d != ((LightScheduleSettings) obj).d;
        }
        return false;
    }

    public final int hashCode() {
        return this.d;
    }

    @Override // com.dyson.mobile.android.schedule.response.ScheduleSettings
    public final ScheduleSettings i() {
        return new LightScheduleSettings(this.d);
    }

    @Override // com.dyson.mobile.android.schedule.response.ScheduleSettings, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeInt(this.d);
    }

    public LightScheduleSettings(int i13) {
        this.d = i13;
    }

    public LightScheduleSettings() {
        this(0, 1, null);
    }
}
