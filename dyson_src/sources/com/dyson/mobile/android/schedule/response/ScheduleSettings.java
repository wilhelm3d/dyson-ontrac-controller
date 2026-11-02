package com.dyson.mobile.android.schedule.response;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/schedule/response/ScheduleSettings;", "", "Landroid/os/Parcelable;", "<init>", "()V", "mod-schedule"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public class ScheduleSettings implements Cloneable, Parcelable {
    public static final Parcelable.Creator<ScheduleSettings> CREATOR = new a();

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<ScheduleSettings> {
        @Override // android.os.Parcelable.Creator
        public final ScheduleSettings createFromParcel(Parcel parcel) {
            parcel.getClass();
            parcel.readInt();
            return new ScheduleSettings();
        }

        @Override // android.os.Parcelable.Creator
        public final ScheduleSettings[] newArray(int i13) {
            return new ScheduleSettings[i13];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // 
    /* renamed from: i */
    public ScheduleSettings clone() {
        return new ScheduleSettings();
    }

    public void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeInt(1);
    }
}
