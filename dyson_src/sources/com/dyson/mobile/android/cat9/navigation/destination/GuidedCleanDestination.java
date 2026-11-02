package com.dyson.mobile.android.cat9.navigation.destination;

import android.os.Parcel;
import android.os.Parcelable;
import fy1.d;
import h12.l;
import h12.m;
import h12.n;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t42.b;
import t42.g;
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/cat9/navigation/destination/GuidedCleanDestination;", "Lcom/dyson/mobile/android/cat9/navigation/destination/OralCareDestination;", "<init>", "()V", "BrushingTimer", "Lcom/dyson/mobile/android/cat9/navigation/destination/GuidedCleanDestination$BrushingTimer;", "mod-cat9-oralcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class GuidedCleanDestination implements OralCareDestination {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/cat9/navigation/destination/GuidedCleanDestination$BrushingTimer;", "Lcom/dyson/mobile/android/cat9/navigation/destination/GuidedCleanDestination;", "<init>", "()V", "Lt42/b;", "serializer", "()Lt42/b;", "mod-cat9-oralcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes2.dex */
    public static final class BrushingTimer extends GuidedCleanDestination {
        public static final BrushingTimer INSTANCE = new BrushingTimer();
        public static final Parcelable.Creator<BrushingTimer> CREATOR = new a();
        public static final /* synthetic */ l<b<Object>> d = m.a(n.PUBLICATION, new d(24));

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class a implements Parcelable.Creator<BrushingTimer> {
            @Override // android.os.Parcelable.Creator
            public final BrushingTimer createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return BrushingTimer.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final BrushingTimer[] newArray(int i13) {
                return new BrushingTimer[i13];
            }
        }

        private BrushingTimer() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BrushingTimer);
        }

        public final int hashCode() {
            return -1300606344;
        }

        public final b<BrushingTimer> serializer() {
            return d.getValue();
        }

        public final String toString() {
            return "BrushingTimer";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ GuidedCleanDestination(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private GuidedCleanDestination() {
    }
}
