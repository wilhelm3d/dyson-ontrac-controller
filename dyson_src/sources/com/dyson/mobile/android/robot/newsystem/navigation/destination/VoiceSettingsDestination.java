package com.dyson.mobile.android.robot.newsystem.navigation.destination;

import android.os.Parcel;
import android.os.Parcelable;
import h12.e;
import h12.l;
import h12.m;
import h12.n;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t42.b;
import t42.g;
import w42.d;
import x42.e0;
import x42.l1;
import x42.o1;
import x42.w1;
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/VoiceSettingsDestination;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/RobotDestination;", "<init>", "()V", "Graph", "VoiceSettings", "VoiceLanguageSettings", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/VoiceSettingsDestination$Graph;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/VoiceSettingsDestination$VoiceLanguageSettings;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/VoiceSettingsDestination$VoiceSettings;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class VoiceSettingsDestination implements RobotDestination {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/VoiceSettingsDestination$VoiceLanguageSettings;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/VoiceSettingsDestination;", "<init>", "()V", "Lt42/b;", "serializer", "()Lt42/b;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes3.dex */
    public static final class VoiceLanguageSettings extends VoiceSettingsDestination {
        public static final VoiceLanguageSettings INSTANCE = new VoiceLanguageSettings();
        public static final Parcelable.Creator<VoiceLanguageSettings> CREATOR = new a();
        public static final /* synthetic */ l<b<Object>> d = m.a(n.PUBLICATION, new qy.a(29));

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator<VoiceLanguageSettings> {
            @Override // android.os.Parcelable.Creator
            public final VoiceLanguageSettings createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return VoiceLanguageSettings.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final VoiceLanguageSettings[] newArray(int i13) {
                return new VoiceLanguageSettings[i13];
            }
        }

        private VoiceLanguageSettings() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof VoiceLanguageSettings);
        }

        public final int hashCode() {
            return 531037218;
        }

        public final b<VoiceLanguageSettings> serializer() {
            return d.getValue();
        }

        public final String toString() {
            return "VoiceLanguageSettings";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ VoiceSettingsDestination(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/VoiceSettingsDestination$Graph;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/VoiceSettingsDestination;", "", "isOnboardingFlow", "<init>", "(Z)V", "", "seen0", "Lx42/w1;", "serializationConstructorMarker", "(IZLx42/w1;)V", "Companion", "a", "b", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes3.dex */
    public static final class Graph extends VoiceSettingsDestination {
        public final boolean d;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<Graph> CREATOR = new c();

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/dyson/mobile/android/robot/newsystem/navigation/destination/VoiceSettingsDestination.Graph.$serializer", "Lx42/e0;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/VoiceSettingsDestination$Graph;", "<init>", "()V", "Lv42/e;", "descriptor", "Lv42/e;", "a", "()Lv42/e;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @e
        /* loaded from: classes3.dex */
        public static final /* synthetic */ class a implements e0<Graph> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f16538a;
            private static final v42.e descriptor;

            static {
                a aVar = new a();
                f16538a = aVar;
                o1 o1Var = new o1("com.dyson.mobile.android.robot.newsystem.navigation.destination.VoiceSettingsDestination.Graph", aVar, 1);
                o1Var.i("isOnboardingFlow", false);
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
                boolean z14 = false;
                while (z13) {
                    int w13 = c13.w(eVar2);
                    if (w13 == -1) {
                        z13 = false;
                    } else if (w13 != 0) {
                        jy1.a.q(w13);
                        return null;
                    } else {
                        z14 = c13.v(eVar2, 0);
                        i13 = 1;
                    }
                }
                c13.a(eVar2);
                return new Graph(i13, z14, null);
            }

            @Override // x42.e0
            public final t42.b<?>[] c() {
                return new t42.b[]{x42.g.f86854a};
            }

            @Override // t42.h
            public final void d(w42.b bVar, Object obj) {
                Graph graph = (Graph) obj;
                graph.getClass();
                v42.e eVar = descriptor;
                d c13 = bVar.c(eVar);
                c13.n(eVar, 0, graph.d);
                c13.a(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class c implements Parcelable.Creator<Graph> {
            @Override // android.os.Parcelable.Creator
            public final Graph createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new Graph(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Graph[] newArray(int i13) {
                return new Graph[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Graph(int i13, boolean z13, w1 w1Var) {
            super(null);
            if (1 != (i13 & 1)) {
                l1.g(i13, 1, a.f16538a.a());
                throw null;
            }
            this.d = z13;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Graph) && this.d == ((Graph) obj).d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d);
        }

        public final String toString() {
            return d72.a.j("Graph(isOnboardingFlow=", ")", this.d);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeInt(this.d ? 1 : 0);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/VoiceSettingsDestination$Graph$b;", "", "<init>", "()V", "Lt42/b;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/VoiceSettingsDestination$Graph;", "serializer", "()Lt42/b;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final t42.b<Graph> serializer() {
                return a.f16538a;
            }

            private b() {
            }
        }

        public Graph(boolean z13) {
            super(null);
            this.d = z13;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/VoiceSettingsDestination$VoiceSettings;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/VoiceSettingsDestination;", "", "isOnboardingFlow", "<init>", "(Z)V", "", "seen0", "Lx42/w1;", "serializationConstructorMarker", "(IZLx42/w1;)V", "Companion", "a", "b", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes3.dex */
    public static final class VoiceSettings extends VoiceSettingsDestination {
        public final boolean d;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<VoiceSettings> CREATOR = new c();

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/dyson/mobile/android/robot/newsystem/navigation/destination/VoiceSettingsDestination.VoiceSettings.$serializer", "Lx42/e0;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/VoiceSettingsDestination$VoiceSettings;", "<init>", "()V", "Lv42/e;", "descriptor", "Lv42/e;", "a", "()Lv42/e;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @e
        /* loaded from: classes3.dex */
        public static final /* synthetic */ class a implements e0<VoiceSettings> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f16539a;
            private static final v42.e descriptor;

            static {
                a aVar = new a();
                f16539a = aVar;
                o1 o1Var = new o1("com.dyson.mobile.android.robot.newsystem.navigation.destination.VoiceSettingsDestination.VoiceSettings", aVar, 1);
                o1Var.i("isOnboardingFlow", false);
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
                boolean z14 = false;
                while (z13) {
                    int w13 = c13.w(eVar2);
                    if (w13 == -1) {
                        z13 = false;
                    } else if (w13 != 0) {
                        jy1.a.q(w13);
                        return null;
                    } else {
                        z14 = c13.v(eVar2, 0);
                        i13 = 1;
                    }
                }
                c13.a(eVar2);
                return new VoiceSettings(i13, z14, null);
            }

            @Override // x42.e0
            public final t42.b<?>[] c() {
                return new t42.b[]{x42.g.f86854a};
            }

            @Override // t42.h
            public final void d(w42.b bVar, Object obj) {
                VoiceSettings voiceSettings = (VoiceSettings) obj;
                voiceSettings.getClass();
                v42.e eVar = descriptor;
                d c13 = bVar.c(eVar);
                c13.n(eVar, 0, voiceSettings.d);
                c13.a(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class c implements Parcelable.Creator<VoiceSettings> {
            @Override // android.os.Parcelable.Creator
            public final VoiceSettings createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new VoiceSettings(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final VoiceSettings[] newArray(int i13) {
                return new VoiceSettings[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ VoiceSettings(int i13, boolean z13, w1 w1Var) {
            super(null);
            if (1 != (i13 & 1)) {
                l1.g(i13, 1, a.f16539a.a());
                throw null;
            }
            this.d = z13;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof VoiceSettings) && this.d == ((VoiceSettings) obj).d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d);
        }

        public final String toString() {
            return d72.a.j("VoiceSettings(isOnboardingFlow=", ")", this.d);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeInt(this.d ? 1 : 0);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/VoiceSettingsDestination$VoiceSettings$b;", "", "<init>", "()V", "Lt42/b;", "Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/VoiceSettingsDestination$VoiceSettings;", "serializer", "()Lt42/b;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final t42.b<VoiceSettings> serializer() {
                return a.f16539a;
            }

            private b() {
            }
        }

        public VoiceSettings(boolean z13) {
            super(null);
            this.d = z13;
        }
    }

    private VoiceSettingsDestination() {
    }
}
