package com.dyson.mobile.android.robot.newsystem.common.view;

import android.os.Parcel;
import android.os.Parcelable;
import com.dyson.mobile.android.robot.newsystem.common.model.CleanSettings;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/common/view/SpotCleanViewState;", "Landroid/os/Parcelable;", "Lcom/dyson/mobile/android/robot/newsystem/common/view/Map;", "map", "Lcom/dyson/mobile/android/robot/newsystem/common/model/CleanSettings;", "cleanSettings", "<init>", "(Lcom/dyson/mobile/android/robot/newsystem/common/view/Map;Lcom/dyson/mobile/android/robot/newsystem/common/model/CleanSettings;)V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SpotCleanViewState implements Parcelable {
    public static final Parcelable.Creator<SpotCleanViewState> CREATOR = new a();
    public final Map d;
    public final CleanSettings e;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<SpotCleanViewState> {
        @Override // android.os.Parcelable.Creator
        public final SpotCleanViewState createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new SpotCleanViewState(Map.CREATOR.createFromParcel(parcel), CleanSettings.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final SpotCleanViewState[] newArray(int i13) {
            return new SpotCleanViewState[i13];
        }
    }

    public SpotCleanViewState(Map map, CleanSettings cleanSettings) {
        map.getClass();
        cleanSettings.getClass();
        this.d = map;
        this.e = cleanSettings;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SpotCleanViewState) {
            SpotCleanViewState spotCleanViewState = (SpotCleanViewState) obj;
            return this.d.equals(spotCleanViewState.d) && this.e.equals(spotCleanViewState.e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }

    public final String toString() {
        return "SpotCleanViewState(map=" + this.d + ", cleanSettings=" + this.e + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        this.d.writeToParcel(parcel, i13);
        this.e.writeToParcel(parcel, i13);
    }
}
