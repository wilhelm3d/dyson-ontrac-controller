package com.dyson.mobile.android.connectionjourney.userguidance.steps;

import android.os.Parcel;
import android.os.Parcelable;
import com.dyson.mobile.android.localisation.LocalisationKey;
import hx.v;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0003\f\r\u000eB+\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/userguidance/steps/UserGuidanceView;", "Landroid/os/Parcelable;", "", "viewId", "Lcom/dyson/mobile/android/localisation/LocalisationKey;", "nextButtonTransKey", "Lcom/dyson/mobile/android/connectionjourney/userguidance/steps/UserGuidanceView$d;", "trackingId", "Lcom/dyson/mobile/android/connectionjourney/userguidance/steps/UserGuidanceView$a;", "actionButtonAction", "<init>", "(ILcom/dyson/mobile/android/localisation/LocalisationKey;Lcom/dyson/mobile/android/connectionjourney/userguidance/steps/UserGuidanceView$d;Lcom/dyson/mobile/android/connectionjourney/userguidance/steps/UserGuidanceView$a;)V", "c", "d", "a", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UserGuidanceView implements Parcelable {
    public static final Parcelable.Creator<UserGuidanceView> CREATOR;
    public final int d;
    public final LocalisationKey e;

    /* renamed from: f  reason: collision with root package name */
    public final d f13901f;

    /* renamed from: g  reason: collision with root package name */
    public final a f13902g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/userguidance/steps/UserGuidanceView$a;", "", "<init>", "(Ljava/lang/String;I)V", "CANT_SEE_ROBOT_LIGHT", "FIND_WIFI_PASSWORD", "NO_ACTION", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        private static final /* synthetic */ o12.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a CANT_SEE_ROBOT_LIGHT = new a("CANT_SEE_ROBOT_LIGHT", 0);
        public static final a FIND_WIFI_PASSWORD = new a("FIND_WIFI_PASSWORD", 1);
        public static final a NO_ACTION = new a("NO_ACTION", 2);

        private static final /* synthetic */ a[] $values() {
            return new a[]{CANT_SEE_ROBOT_LIGHT, FIND_WIFI_PASSWORD, NO_ACTION};
        }

        static {
            a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = v.l($values);
        }

        private a(String str, int i13) {
        }

        public static o12.a<a> getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements Parcelable.Creator<UserGuidanceView> {
        @Override // android.os.Parcelable.Creator
        public final UserGuidanceView createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new UserGuidanceView(parcel.readInt(), (LocalisationKey) parcel.readParcelable(UserGuidanceView.class.getClassLoader()), d.valueOf(parcel.readString()), a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final UserGuidanceView[] newArray(int i13) {
            return new UserGuidanceView[i13];
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/userguidance/steps/UserGuidanceView$c;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "FIRST", "SECOND", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c {
        private static final /* synthetic */ o12.a $ENTRIES;
        private static final /* synthetic */ c[] $VALUES;
        public static final c FIRST = new c("FIRST", 0, 0);
        public static final c SECOND = new c("SECOND", 1, 1);
        private final int value;

        private static final /* synthetic */ c[] $values() {
            return new c[]{FIRST, SECOND};
        }

        static {
            c[] $values = $values();
            $VALUES = $values;
            $ENTRIES = v.l($values);
        }

        private c(String str, int i13, int i14) {
            this.value = i14;
        }

        public static o12.a<c> getEntries() {
            return $ENTRIES;
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/userguidance/steps/UserGuidanceView$d;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "I", "getValue", "()I", "FIRST", "SECOND", "THIRD", "FOURTH", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class d {
        private static final /* synthetic */ o12.a $ENTRIES;
        private static final /* synthetic */ d[] $VALUES;
        private final int value;
        public static final d FIRST = new d("FIRST", 0, 1);
        public static final d SECOND = new d("SECOND", 1, 2);
        public static final d THIRD = new d("THIRD", 2, 3);
        public static final d FOURTH = new d("FOURTH", 3, 4);

        private static final /* synthetic */ d[] $values() {
            return new d[]{FIRST, SECOND, THIRD, FOURTH};
        }

        static {
            d[] $values = $values();
            $VALUES = $values;
            $ENTRIES = v.l($values);
        }

        private d(String str, int i13, int i14) {
            this.value = i14;
        }

        public static o12.a<d> getEntries() {
            return $ENTRIES;
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }

        public final int getValue() {
            return this.value;
        }
    }

    static {
        LocalisationKey.a aVar = LocalisationKey.f15077f;
        CREATOR = new b();
    }

    public UserGuidanceView(int i13, LocalisationKey localisationKey, d dVar, a aVar) {
        localisationKey.getClass();
        dVar.getClass();
        aVar.getClass();
        this.d = i13;
        this.e = localisationKey;
        this.f13901f = dVar;
        this.f13902g = aVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i13) {
        parcel.getClass();
        parcel.writeInt(this.d);
        parcel.writeParcelable(this.e, i13);
        parcel.writeString(this.f13901f.name());
        parcel.writeString(this.f13902g.name());
    }

    public /* synthetic */ UserGuidanceView(int i13, LocalisationKey localisationKey, d dVar, a aVar, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, localisationKey, dVar, (i14 & 8) != 0 ? a.NO_ACTION : aVar);
    }
}
