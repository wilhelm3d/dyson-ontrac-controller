package com.dyson.mobile.android.robot.cloud.newsystem.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import hx.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import x12.r;
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/dyson/mobile/android/robot/cloud/newsystem/common/Restriction;", "Landroid/os/Parcelable;", "", "id", "", "Lcom/dyson/mobile/android/robot/cloud/newsystem/common/Point;", "points", "Lcom/dyson/mobile/android/robot/cloud/newsystem/common/Restriction$Behavior;", "behavior", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/dyson/mobile/android/robot/cloud/newsystem/common/Restriction$Behavior;)V", "d", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "e", "Ljava/util/List;", "k", "()Ljava/util/List;", "f", "Lcom/dyson/mobile/android/robot/cloud/newsystem/common/Restriction$Behavior;", "i", "()Lcom/dyson/mobile/android/robot/cloud/newsystem/common/Restriction$Behavior;", "Behavior", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Restriction implements Parcelable {
    public static final Parcelable.Creator<Restriction> CREATOR = new a();
    @SerializedName("id")
    private final String d;
    @SerializedName("points")
    private final List<Point> e;
    @SerializedName("behavior")

    /* renamed from: f  reason: collision with root package name */
    private final Behavior f15986f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Keep
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/dyson/mobile/android/robot/cloud/newsystem/common/Restriction$Behavior;", "", "keyValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getKeyValue", "()Ljava/lang/String;", "KEEP_OUT", "BRUSH_BAR_OFF", "CLIMB_OBSTACLE", "NO_MOP", "NO_CLIMB", "PET_DEEP_CLEAN", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Behavior {
        private static final /* synthetic */ o12.a $ENTRIES;
        private static final /* synthetic */ Behavior[] $VALUES;
        private final transient String keyValue;
        @SerializedName("keepOut")
        public static final Behavior KEEP_OUT = new Behavior("KEEP_OUT", 0, "keepOut");
        @SerializedName("brushBarOff")
        public static final Behavior BRUSH_BAR_OFF = new Behavior("BRUSH_BAR_OFF", 1, "brushBarOff");
        @SerializedName("climbObstacle")
        public static final Behavior CLIMB_OBSTACLE = new Behavior("CLIMB_OBSTACLE", 2, "climbObstacle");
        @SerializedName("noMop")
        public static final Behavior NO_MOP = new Behavior("NO_MOP", 3, "noMop");
        @SerializedName("noClimbing")
        public static final Behavior NO_CLIMB = new Behavior("NO_CLIMB", 4, "noClimbing");
        @SerializedName("petDeepClean")
        public static final Behavior PET_DEEP_CLEAN = new Behavior("PET_DEEP_CLEAN", 5, "petDeepClean");

        private static final /* synthetic */ Behavior[] $values() {
            return new Behavior[]{KEEP_OUT, BRUSH_BAR_OFF, CLIMB_OBSTACLE, NO_MOP, NO_CLIMB, PET_DEEP_CLEAN};
        }

        static {
            Behavior[] $values = $values();
            $VALUES = $values;
            $ENTRIES = v.l($values);
        }

        private Behavior(String str, int i13, String str2) {
            this.keyValue = str2;
        }

        public static o12.a<Behavior> getEntries() {
            return $ENTRIES;
        }

        public static Behavior valueOf(String str) {
            return (Behavior) Enum.valueOf(Behavior.class, str);
        }

        public static Behavior[] values() {
            return (Behavior[]) $VALUES.clone();
        }

        public final String getKeyValue() {
            return this.keyValue;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements Parcelable.Creator<Restriction> {
        @Override // android.os.Parcelable.Creator
        public final Restriction createFromParcel(Parcel parcel) {
            parcel.getClass();
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i13 = 0;
            while (i13 != readInt) {
                i13 = d72.a.d(Point.CREATOR, parcel, arrayList, i13, 1);
            }
            return new Restriction(readString, arrayList, Behavior.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Restriction[] newArray(int i13) {
            return new Restriction[i13];
        }
    }

    public Restriction(String str, List<Point> list, Behavior behavior) {
        str.getClass();
        list.getClass();
        behavior.getClass();
        this.d = str;
        this.e = list;
        this.f15986f = behavior;
    }

    public static Restriction a(Restriction restriction, ArrayList arrayList) {
        String str = restriction.d;
        Behavior behavior = restriction.f15986f;
        str.getClass();
        behavior.getClass();
        return new Restriction(str, arrayList, behavior);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Restriction) {
            Restriction restriction = (Restriction) obj;
            return r.c(this.d, restriction.d) && r.c(this.e, restriction.e) && this.f15986f == restriction.f15986f;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15986f.hashCode() + tq1.a.h(this.d.hashCode() * 31, 31, this.e);
    }

    public final Behavior i() {
        return this.f15986f;
    }

    public final String j() {
        return this.d;
    }

    public final List<Point> k() {
        return this.e;
    }

    public final String toString() {
        String str = this.d;
        List<Point> list = this.e;
        Behavior behavior = this.f15986f;
        return "Restriction(id=" + str + ", points=" + list + ", behavior=" + behavior + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeString(this.d);
        Iterator n13 = d72.a.n(this.e, parcel);
        while (n13.hasNext()) {
            ((Point) n13.next()).writeToParcel(parcel, i13);
        }
        parcel.writeString(this.f15986f.name());
    }
}
