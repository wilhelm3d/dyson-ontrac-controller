package com.dyson.mobile.android.robot.home.activitycomplete;

import android.os.Parcel;
import android.os.Parcelable;
import com.salesforce.marketingcloud.UrlHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oi1.s;
import x12.r;
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/dyson/mobile/android/robot/home/activitycomplete/ActivityCompleteData;", "Landroid/os/Parcelable;", "Lew0/a;", "activeMode", "Lfw0/a;", UrlHandler.ACTION, "", "duration", "<init>", "(Lew0/a;Lfw0/a;Ljava/lang/Integer;)V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ActivityCompleteData implements Parcelable {
    public static final Parcelable.Creator<ActivityCompleteData> CREATOR = new a();
    public final ew0.a d;
    public final fw0.a e;

    /* renamed from: f  reason: collision with root package name */
    public final Integer f16055f;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<ActivityCompleteData> {
        @Override // android.os.Parcelable.Creator
        public final ActivityCompleteData createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new ActivityCompleteData(ew0.a.valueOf(parcel.readString()), fw0.a.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final ActivityCompleteData[] newArray(int i13) {
            return new ActivityCompleteData[i13];
        }
    }

    public ActivityCompleteData(ew0.a aVar, fw0.a aVar2, Integer num) {
        aVar.getClass();
        aVar2.getClass();
        this.d = aVar;
        this.e = aVar2;
        this.f16055f = num;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ActivityCompleteData) {
            ActivityCompleteData activityCompleteData = (ActivityCompleteData) obj;
            return this.d == activityCompleteData.d && this.e == activityCompleteData.e && r.c(this.f16055f, activityCompleteData.f16055f);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + (this.d.hashCode() * 31)) * 31;
        Integer num = this.f16055f;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActivityCompleteData(activeMode=");
        sb2.append(this.d);
        sb2.append(", action=");
        sb2.append(this.e);
        sb2.append(", duration=");
        return s.d(sb2, this.f16055f, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeString(this.d.name());
        parcel.writeString(this.e.name());
        Integer num = this.f16055f;
        if (num == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(num.intValue());
    }

    public /* synthetic */ ActivityCompleteData(ew0.a aVar, fw0.a aVar2, Integer num, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, aVar2, (i13 & 4) != 0 ? null : num);
    }
}
