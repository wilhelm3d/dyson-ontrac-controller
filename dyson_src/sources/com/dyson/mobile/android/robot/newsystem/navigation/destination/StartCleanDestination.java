package com.dyson.mobile.android.robot.newsystem.navigation.destination;

import android.os.Parcel;
import android.os.Parcelable;
import bv1.f;
import com.dyson.mobile.android.robot.newsystem.startclean.CleaningMode;
import h12.e;
import h12.l;
import h12.m;
import h12.n;
import h12.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t42.g;
import w42.d;
import x12.r;
import x42.a2;
import x42.e0;
import x42.l1;
import x42.o1;
import x42.w1;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/StartCleanDestination;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/RobotDestination;", "<init>", "()V", "EditCleanSettings", "EditZoneCleanSettings", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/StartCleanDestination$EditCleanSettings;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/StartCleanDestination$EditZoneCleanSettings;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class StartCleanDestination implements RobotDestination {
    public /* synthetic */ StartCleanDestination(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/StartCleanDestination$EditCleanSettings;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/StartCleanDestination;", "", "mapId", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lx42/w1;", "serializationConstructorMarker", "(ILjava/lang/String;Lx42/w1;)V", "Companion", "a", "b", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes3.dex */
    public static final class EditCleanSettings extends StartCleanDestination {
        public final String d;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<EditCleanSettings> CREATOR = new c();

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/dyson/mobile/android/robot/newsystem/navigation/destination/StartCleanDestination.EditCleanSettings.$serializer", "Lx42/e0;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/StartCleanDestination$EditCleanSettings;", "<init>", "()V", "Lv42/e;", "descriptor", "Lv42/e;", "a", "()Lv42/e;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @e
        /* loaded from: classes3.dex */
        public static final /* synthetic */ class a implements e0<EditCleanSettings> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f16533a;
            private static final v42.e descriptor;

            static {
                a aVar = new a();
                f16533a = aVar;
                o1 o1Var = new o1("com.dyson.mobile.android.robot.newsystem.navigation.destination.StartCleanDestination.EditCleanSettings", aVar, 1);
                o1Var.i("mapId", false);
                descriptor = o1Var;
            }

            private a() {
            }

            @Override // t42.h, t42.a
            public final v42.e a() {
                return descriptor;
            }

            @Override // t42.a
            public final Object b(w42.e eVar) {
                v42.e eVar2 = descriptor;
                w42.c c13 = eVar.c(eVar2);
                boolean z13 = true;
                int i13 = 0;
                String str = null;
                while (z13) {
                    int w13 = c13.w(eVar2);
                    if (w13 == -1) {
                        z13 = false;
                    } else if (w13 != 0) {
                        jy1.a.q(w13);
                        return null;
                    } else {
                        str = c13.g(eVar2, 0);
                        i13 = 1;
                    }
                }
                c13.a(eVar2);
                return new EditCleanSettings(i13, str, null);
            }

            @Override // x42.e0
            public final t42.b<?>[] c() {
                return new t42.b[]{a2.f86824a};
            }

            @Override // t42.h
            public final void d(w42.b bVar, Object obj) {
                EditCleanSettings editCleanSettings = (EditCleanSettings) obj;
                editCleanSettings.getClass();
                v42.e eVar = descriptor;
                d c13 = bVar.c(eVar);
                c13.l(eVar, 0, editCleanSettings.d);
                c13.a(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class c implements Parcelable.Creator<EditCleanSettings> {
            @Override // android.os.Parcelable.Creator
            public final EditCleanSettings createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new EditCleanSettings(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final EditCleanSettings[] newArray(int i13) {
                return new EditCleanSettings[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ EditCleanSettings(int i13, String str, w1 w1Var) {
            super(null);
            if (1 != (i13 & 1)) {
                l1.g(i13, 1, a.f16533a.a());
                throw null;
            }
            this.d = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EditCleanSettings) && r.c(this.d, ((EditCleanSettings) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return f.e("EditCleanSettings(mapId=", this.d, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeString(this.d);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/StartCleanDestination$EditCleanSettings$b;", "", "<init>", "()V", "Lt42/b;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/StartCleanDestination$EditCleanSettings;", "serializer", "()Lt42/b;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final t42.b<EditCleanSettings> serializer() {
                return a.f16533a;
            }

            private b() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EditCleanSettings(String str) {
            super(null);
            str.getClass();
            this.d = str;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000f2\u00020\u0001:\u0002\u0010\u0011B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/StartCleanDestination$EditZoneCleanSettings;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/StartCleanDestination;", "", "mapId", "title", "Lcom/dyson/mobile/android/robot/newsystem/startclean/CleaningMode;", "cleaningMode", "zoneId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/dyson/mobile/android/robot/newsystem/startclean/CleaningMode;Ljava/lang/String;)V", "", "seen0", "Lx42/w1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/dyson/mobile/android/robot/newsystem/startclean/CleaningMode;Ljava/lang/String;Lx42/w1;)V", "Companion", "a", "b", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes3.dex */
    public static final class EditZoneCleanSettings extends StartCleanDestination {
        public final String d;
        public final String e;

        /* renamed from: f  reason: collision with root package name */
        public final CleaningMode f16535f;

        /* renamed from: g  reason: collision with root package name */
        public final String f16536g;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<EditZoneCleanSettings> CREATOR = new c();

        /* renamed from: h  reason: collision with root package name */
        public static final l<t42.b<Object>>[] f16534h = {null, null, m.a(n.PUBLICATION, new qy.a(28)), null};

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/dyson/mobile/android/robot/newsystem/navigation/destination/StartCleanDestination.EditZoneCleanSettings.$serializer", "Lx42/e0;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/StartCleanDestination$EditZoneCleanSettings;", "<init>", "()V", "Lv42/e;", "descriptor", "Lv42/e;", "a", "()Lv42/e;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @e
        /* loaded from: classes3.dex */
        public static final /* synthetic */ class a implements e0<EditZoneCleanSettings> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f16537a;
            private static final v42.e descriptor;

            static {
                a aVar = new a();
                f16537a = aVar;
                o1 o1Var = new o1("com.dyson.mobile.android.robot.newsystem.navigation.destination.StartCleanDestination.EditZoneCleanSettings", aVar, 4);
                o1Var.i("mapId", false);
                o1Var.i("title", false);
                o1Var.i("cleaningMode", false);
                o1Var.i("zoneId", true);
                descriptor = o1Var;
            }

            private a() {
            }

            @Override // t42.h, t42.a
            public final v42.e a() {
                return descriptor;
            }

            @Override // t42.a
            public final Object b(w42.e eVar) {
                v42.e eVar2 = descriptor;
                w42.c c13 = eVar.c(eVar2);
                l<t42.b<Object>>[] lVarArr = EditZoneCleanSettings.f16534h;
                boolean z13 = true;
                int i13 = 0;
                String str = null;
                String str2 = null;
                CleaningMode cleaningMode = null;
                String str3 = null;
                while (z13) {
                    int w13 = c13.w(eVar2);
                    if (w13 == -1) {
                        z13 = false;
                    } else if (w13 == 0) {
                        str = c13.g(eVar2, 0);
                        i13 |= 1;
                    } else if (w13 == 1) {
                        str2 = c13.g(eVar2, 1);
                        i13 |= 2;
                    } else if (w13 == 2) {
                        cleaningMode = (CleaningMode) c13.i(eVar2, 2, lVarArr[2].getValue(), cleaningMode);
                        i13 |= 4;
                    } else if (w13 != 3) {
                        jy1.a.q(w13);
                        return null;
                    } else {
                        str3 = (String) c13.A(eVar2, 3, a2.f86824a, str3);
                        i13 |= 8;
                    }
                }
                c13.a(eVar2);
                return new EditZoneCleanSettings(i13, str, str2, cleaningMode, str3, (w1) null);
            }

            @Override // x42.e0
            public final t42.b<?>[] c() {
                l<t42.b<Object>>[] lVarArr = EditZoneCleanSettings.f16534h;
                a2 a2Var = a2.f86824a;
                return new t42.b[]{a2Var, a2Var, lVarArr[2].getValue(), u42.a.a(a2Var)};
            }

            @Override // t42.h
            public final void d(w42.b bVar, Object obj) {
                EditZoneCleanSettings editZoneCleanSettings = (EditZoneCleanSettings) obj;
                editZoneCleanSettings.getClass();
                v42.e eVar = descriptor;
                d c13 = bVar.c(eVar);
                l<t42.b<Object>>[] lVarArr = EditZoneCleanSettings.f16534h;
                String str = editZoneCleanSettings.d;
                String str2 = editZoneCleanSettings.f16536g;
                c13.l(eVar, 0, str);
                c13.l(eVar, 1, editZoneCleanSettings.e);
                c13.B(eVar, 2, lVarArr[2].getValue(), editZoneCleanSettings.f16535f);
                if (c13.h(eVar) || str2 != null) {
                    c13.s(eVar, 3, a2.f86824a, str2);
                }
                c13.a(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class c implements Parcelable.Creator<EditZoneCleanSettings> {
            @Override // android.os.Parcelable.Creator
            public final EditZoneCleanSettings createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new EditZoneCleanSettings(parcel.readString(), parcel.readString(), CleaningMode.valueOf(parcel.readString()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final EditZoneCleanSettings[] newArray(int i13) {
                return new EditZoneCleanSettings[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ EditZoneCleanSettings(int i13, String str, String str2, CleaningMode cleaningMode, String str3, w1 w1Var) {
            super(null);
            if (7 != (i13 & 7)) {
                l1.g(i13, 7, a.f16537a.a());
                throw null;
            }
            this.d = str;
            this.e = str2;
            this.f16535f = cleaningMode;
            if ((i13 & 8) == 0) {
                this.f16536g = null;
            } else {
                this.f16536g = str3;
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof EditZoneCleanSettings) {
                EditZoneCleanSettings editZoneCleanSettings = (EditZoneCleanSettings) obj;
                return r.c(this.d, editZoneCleanSettings.d) && r.c(this.e, editZoneCleanSettings.e) && this.f16535f == editZoneCleanSettings.f16535f && r.c(this.f16536g, editZoneCleanSettings.f16536g);
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = (this.f16535f.hashCode() + y.c(this.d.hashCode() * 31, 31, this.e)) * 31;
            String str = this.f16536g;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder m13 = ma.e.m("EditZoneCleanSettings(mapId=", this.d, ", title=", this.e, ", cleaningMode=");
            m13.append(this.f16535f);
            m13.append(", zoneId=");
            m13.append(this.f16536g);
            m13.append(")");
            return m13.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeString(this.f16535f.name());
            parcel.writeString(this.f16536g);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/StartCleanDestination$EditZoneCleanSettings$b;", "", "<init>", "()V", "Lt42/b;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/StartCleanDestination$EditZoneCleanSettings;", "serializer", "()Lt42/b;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final t42.b<EditZoneCleanSettings> serializer() {
                return a.f16537a;
            }

            private b() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EditZoneCleanSettings(String str, String str2, CleaningMode cleaningMode, String str3) {
            super(null);
            str.getClass();
            str2.getClass();
            cleaningMode.getClass();
            this.d = str;
            this.e = str2;
            this.f16535f = cleaningMode;
            this.f16536g = str3;
        }

        public /* synthetic */ EditZoneCleanSettings(String str, String str2, CleaningMode cleaningMode, String str3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, cleaningMode, (i13 & 8) != 0 ? null : str3);
        }
    }

    private StartCleanDestination() {
    }
}
