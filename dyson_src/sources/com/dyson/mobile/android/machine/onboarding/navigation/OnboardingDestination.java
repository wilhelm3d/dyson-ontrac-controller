package com.dyson.mobile.android.machine.onboarding.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import h12.e;
import h12.l;
import h12.m;
import h12.n;
import k30.f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t42.b;
import t42.g;
import w42.d;
import x12.r;
import x42.a2;
import x42.e0;
import x42.l1;
import x42.o1;
import x42.w1;
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/dyson/mobile/android/machine/onboarding/navigation/OnboardingDestination;", "Landroid/os/Parcelable;", "MultiChapterOnboardingScreen", "SingleChapterOnboardingScreen", "LegacySingleChapterOnboardingScreen", "Lcom/dyson/mobile/android/machine/onboarding/navigation/OnboardingDestination$LegacySingleChapterOnboardingScreen;", "Lcom/dyson/mobile/android/machine/onboarding/navigation/OnboardingDestination$MultiChapterOnboardingScreen;", "Lcom/dyson/mobile/android/machine/onboarding/navigation/OnboardingDestination$SingleChapterOnboardingScreen;", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface OnboardingDestination extends Parcelable {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/machine/onboarding/navigation/OnboardingDestination$LegacySingleChapterOnboardingScreen;", "Lcom/dyson/mobile/android/machine/onboarding/navigation/OnboardingDestination;", "<init>", "()V", "Lt42/b;", "serializer", "()Lt42/b;", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes3.dex */
    public static final class LegacySingleChapterOnboardingScreen implements OnboardingDestination {
        public static final LegacySingleChapterOnboardingScreen INSTANCE = new LegacySingleChapterOnboardingScreen();
        public static final Parcelable.Creator<LegacySingleChapterOnboardingScreen> CREATOR = new a();
        public static final /* synthetic */ l<b<Object>> d = m.a(n.PUBLICATION, new f(6));

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator<LegacySingleChapterOnboardingScreen> {
            @Override // android.os.Parcelable.Creator
            public final LegacySingleChapterOnboardingScreen createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return LegacySingleChapterOnboardingScreen.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final LegacySingleChapterOnboardingScreen[] newArray(int i13) {
                return new LegacySingleChapterOnboardingScreen[i13];
            }
        }

        private LegacySingleChapterOnboardingScreen() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof LegacySingleChapterOnboardingScreen);
        }

        public final int hashCode() {
            return 42446093;
        }

        public final b<LegacySingleChapterOnboardingScreen> serializer() {
            return d.getValue();
        }

        public final String toString() {
            return "LegacySingleChapterOnboardingScreen";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/machine/onboarding/navigation/OnboardingDestination$MultiChapterOnboardingScreen;", "Lcom/dyson/mobile/android/machine/onboarding/navigation/OnboardingDestination;", "<init>", "()V", "Lt42/b;", "serializer", "()Lt42/b;", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes3.dex */
    public static final class MultiChapterOnboardingScreen implements OnboardingDestination {
        public static final MultiChapterOnboardingScreen INSTANCE = new MultiChapterOnboardingScreen();
        public static final Parcelable.Creator<MultiChapterOnboardingScreen> CREATOR = new a();
        public static final /* synthetic */ l<b<Object>> d = m.a(n.PUBLICATION, new f(7));

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator<MultiChapterOnboardingScreen> {
            @Override // android.os.Parcelable.Creator
            public final MultiChapterOnboardingScreen createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return MultiChapterOnboardingScreen.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final MultiChapterOnboardingScreen[] newArray(int i13) {
                return new MultiChapterOnboardingScreen[i13];
            }
        }

        private MultiChapterOnboardingScreen() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MultiChapterOnboardingScreen);
        }

        public final int hashCode() {
            return 974342577;
        }

        public final b<MultiChapterOnboardingScreen> serializer() {
            return d.getValue();
        }

        public final String toString() {
            return "MultiChapterOnboardingScreen";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/dyson/mobile/android/machine/onboarding/navigation/OnboardingDestination$SingleChapterOnboardingScreen;", "Lcom/dyson/mobile/android/machine/onboarding/navigation/OnboardingDestination;", "", "chapterId", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lx42/w1;", "serializationConstructorMarker", "(ILjava/lang/String;Lx42/w1;)V", "Companion", "a", "b", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes3.dex */
    public static final class SingleChapterOnboardingScreen implements OnboardingDestination {
        public final String d;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<SingleChapterOnboardingScreen> CREATOR = new c();

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/dyson/mobile/android/machine/onboarding/navigation/OnboardingDestination.SingleChapterOnboardingScreen.$serializer", "Lx42/e0;", "Lcom/dyson/mobile/android/machine/onboarding/navigation/OnboardingDestination$SingleChapterOnboardingScreen;", "<init>", "()V", "Lv42/e;", "descriptor", "Lv42/e;", "a", "()Lv42/e;", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @e
        /* loaded from: classes3.dex */
        public static final /* synthetic */ class a implements e0<SingleChapterOnboardingScreen> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f15300a;
            private static final v42.e descriptor;

            static {
                a aVar = new a();
                f15300a = aVar;
                o1 o1Var = new o1("com.dyson.mobile.android.machine.onboarding.navigation.OnboardingDestination.SingleChapterOnboardingScreen", aVar, 1);
                o1Var.i("chapterId", false);
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
                return new SingleChapterOnboardingScreen(i13, str, null);
            }

            @Override // x42.e0
            public final t42.b<?>[] c() {
                return new t42.b[]{a2.f86824a};
            }

            @Override // t42.h
            public final void d(w42.b bVar, Object obj) {
                SingleChapterOnboardingScreen singleChapterOnboardingScreen = (SingleChapterOnboardingScreen) obj;
                singleChapterOnboardingScreen.getClass();
                v42.e eVar = descriptor;
                d c13 = bVar.c(eVar);
                c13.l(eVar, 0, singleChapterOnboardingScreen.d);
                c13.a(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class c implements Parcelable.Creator<SingleChapterOnboardingScreen> {
            @Override // android.os.Parcelable.Creator
            public final SingleChapterOnboardingScreen createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new SingleChapterOnboardingScreen(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final SingleChapterOnboardingScreen[] newArray(int i13) {
                return new SingleChapterOnboardingScreen[i13];
            }
        }

        public /* synthetic */ SingleChapterOnboardingScreen(int i13, String str, w1 w1Var) {
            if (1 == (i13 & 1)) {
                this.d = str;
            } else {
                l1.g(i13, 1, a.f15300a.a());
                throw null;
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
            return (obj instanceof SingleChapterOnboardingScreen) && r.c(this.d, ((SingleChapterOnboardingScreen) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return bv1.f.e("SingleChapterOnboardingScreen(chapterId=", this.d, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeString(this.d);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/machine/onboarding/navigation/OnboardingDestination$SingleChapterOnboardingScreen$b;", "", "<init>", "()V", "Lt42/b;", "Lcom/dyson/mobile/android/machine/onboarding/navigation/OnboardingDestination$SingleChapterOnboardingScreen;", "serializer", "()Lt42/b;", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final t42.b<SingleChapterOnboardingScreen> serializer() {
                return a.f15300a;
            }

            private b() {
            }
        }

        public SingleChapterOnboardingScreen(String str) {
            str.getClass();
            this.d = str;
        }
    }
}
