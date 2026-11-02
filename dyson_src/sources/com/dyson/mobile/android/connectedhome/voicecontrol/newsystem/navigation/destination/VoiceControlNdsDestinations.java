package com.dyson.mobile.android.connectedhome.voicecontrol.newsystem.navigation.destination;

import android.os.Parcel;
import android.os.Parcelable;
import h12.l;
import h12.m;
import h12.n;
import kotlin.Metadata;
import t42.b;
import t42.g;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bq\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/newsystem/navigation/destination/VoiceControlNdsDestinations;", "Landroid/os/Parcelable;", "VoiceControlOptions", "Lcom/dyson/mobile/android/connectedhome/voicecontrol/newsystem/navigation/destination/VoiceControlNdsDestinations$VoiceControlOptions;", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface VoiceControlNdsDestinations extends Parcelable {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/newsystem/navigation/destination/VoiceControlNdsDestinations$VoiceControlOptions;", "Lcom/dyson/mobile/android/connectedhome/voicecontrol/newsystem/navigation/destination/VoiceControlNdsDestinations;", "<init>", "()V", "Lt42/b;", "serializer", "()Lt42/b;", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes2.dex */
    public static final class VoiceControlOptions implements VoiceControlNdsDestinations {
        public static final VoiceControlOptions INSTANCE = new VoiceControlOptions();
        public static final Parcelable.Creator<VoiceControlOptions> CREATOR = new a();
        public static final /* synthetic */ l<b<Object>> d = m.a(n.PUBLICATION, new my0.a(3));

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class a implements Parcelable.Creator<VoiceControlOptions> {
            @Override // android.os.Parcelable.Creator
            public final VoiceControlOptions createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return VoiceControlOptions.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final VoiceControlOptions[] newArray(int i13) {
                return new VoiceControlOptions[i13];
            }
        }

        private VoiceControlOptions() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof VoiceControlOptions);
        }

        public final int hashCode() {
            return -1418023247;
        }

        public final b<VoiceControlOptions> serializer() {
            return d.getValue();
        }

        public final String toString() {
            return "VoiceControlOptions";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }
}
