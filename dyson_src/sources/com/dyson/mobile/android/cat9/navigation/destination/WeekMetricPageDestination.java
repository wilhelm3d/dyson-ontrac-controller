package com.dyson.mobile.android.cat9.navigation.destination;

import android.os.Parcel;
import android.os.Parcelable;
import bv1.f;
import h12.e;
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
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/dyson/mobile/android/cat9/navigation/destination/WeekMetricPageDestination;", "Lcom/dyson/mobile/android/cat9/navigation/destination/OralCareDestination;", "<init>", "()V", "BrushingDurationPageDestination", "BrushingCoveragePageDestination", "FlossingCoveragePageDestination", "OverpressurePageDestination", "OverscrubbingPageDestination", "Lcom/dyson/mobile/android/cat9/navigation/destination/WeekMetricPageDestination$BrushingCoveragePageDestination;", "Lcom/dyson/mobile/android/cat9/navigation/destination/WeekMetricPageDestination$BrushingDurationPageDestination;", "Lcom/dyson/mobile/android/cat9/navigation/destination/WeekMetricPageDestination$FlossingCoveragePageDestination;", "Lcom/dyson/mobile/android/cat9/navigation/destination/WeekMetricPageDestination$OverpressurePageDestination;", "Lcom/dyson/mobile/android/cat9/navigation/destination/WeekMetricPageDestination$OverscrubbingPageDestination;", "mod-cat9-oralcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class WeekMetricPageDestination implements OralCareDestination {
    public /* synthetic */ WeekMetricPageDestination(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/dyson/mobile/android/cat9/navigation/destination/WeekMetricPageDestination$BrushingCoveragePageDestination;", "Lcom/dyson/mobile/android/cat9/navigation/destination/WeekMetricPageDestination;", "", "yearWeek", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lx42/w1;", "serializationConstructorMarker", "(ILjava/lang/String;Lx42/w1;)V", "Companion", "a", "b", "mod-cat9-oralcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes2.dex */
    public static final class BrushingCoveragePageDestination extends WeekMetricPageDestination {
        public final String d;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<BrushingCoveragePageDestination> CREATOR = new c();

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/dyson/mobile/android/cat9/navigation/destination/WeekMetricPageDestination.BrushingCoveragePageDestination.$serializer", "Lx42/e0;", "Lcom/dyson/mobile/android/cat9/navigation/destination/WeekMetricPageDestination$BrushingCoveragePageDestination;", "<init>", "()V", "Lv42/e;", "descriptor", "Lv42/e;", "a", "()Lv42/e;", "mod-cat9-oralcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @e
        /* loaded from: classes2.dex */
        public static final /* synthetic */ class a implements e0<BrushingCoveragePageDestination> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f12912a;
            private static final v42.e descriptor;

            static {
                a aVar = new a();
                f12912a = aVar;
                o1 o1Var = new o1("com.dyson.mobile.android.cat9.navigation.destination.WeekMetricPageDestination.BrushingCoveragePageDestination", aVar, 1);
                o1Var.i("yearWeek", false);
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
                return new BrushingCoveragePageDestination(i13, str, null);
            }

            @Override // x42.e0
            public final t42.b<?>[] c() {
                return new t42.b[]{a2.f86824a};
            }

            @Override // t42.h
            public final void d(w42.b bVar, Object obj) {
                BrushingCoveragePageDestination brushingCoveragePageDestination = (BrushingCoveragePageDestination) obj;
                brushingCoveragePageDestination.getClass();
                v42.e eVar = descriptor;
                d c13 = bVar.c(eVar);
                c13.l(eVar, 0, brushingCoveragePageDestination.d);
                c13.a(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class c implements Parcelable.Creator<BrushingCoveragePageDestination> {
            @Override // android.os.Parcelable.Creator
            public final BrushingCoveragePageDestination createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new BrushingCoveragePageDestination(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final BrushingCoveragePageDestination[] newArray(int i13) {
                return new BrushingCoveragePageDestination[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ BrushingCoveragePageDestination(int i13, String str, w1 w1Var) {
            super(null);
            if (1 != (i13 & 1)) {
                l1.g(i13, 1, a.f12912a.a());
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
            return (obj instanceof BrushingCoveragePageDestination) && r.c(this.d, ((BrushingCoveragePageDestination) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return f.e("BrushingCoveragePageDestination(yearWeek=", this.d, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeString(this.d);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/cat9/navigation/destination/WeekMetricPageDestination$BrushingCoveragePageDestination$b;", "", "<init>", "()V", "Lt42/b;", "Lcom/dyson/mobile/android/cat9/navigation/destination/WeekMetricPageDestination$BrushingCoveragePageDestination;", "serializer", "()Lt42/b;", "mod-cat9-oralcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final t42.b<BrushingCoveragePageDestination> serializer() {
                return a.f12912a;
            }

            private b() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BrushingCoveragePageDestination(String str) {
            super(null);
            str.getClass();
            this.d = str;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/dyson/mobile/android/cat9/navigation/destination/WeekMetricPageDestination$BrushingDurationPageDestination;", "Lcom/dyson/mobile/android/cat9/navigation/destination/WeekMetricPageDestination;", "", "yearWeek", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lx42/w1;", "serializationConstructorMarker", "(ILjava/lang/String;Lx42/w1;)V", "Companion", "a", "b", "mod-cat9-oralcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes2.dex */
    public static final class BrushingDurationPageDestination extends WeekMetricPageDestination {
        public final String d;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<BrushingDurationPageDestination> CREATOR = new c();

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/dyson/mobile/android/cat9/navigation/destination/WeekMetricPageDestination.BrushingDurationPageDestination.$serializer", "Lx42/e0;", "Lcom/dyson/mobile/android/cat9/navigation/destination/WeekMetricPageDestination$BrushingDurationPageDestination;", "<init>", "()V", "Lv42/e;", "descriptor", "Lv42/e;", "a", "()Lv42/e;", "mod-cat9-oralcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @e
        /* loaded from: classes2.dex */
        public static final /* synthetic */ class a implements e0<BrushingDurationPageDestination> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f12913a;
            private static final v42.e descriptor;

            static {
                a aVar = new a();
                f12913a = aVar;
                o1 o1Var = new o1("com.dyson.mobile.android.cat9.navigation.destination.WeekMetricPageDestination.BrushingDurationPageDestination", aVar, 1);
                o1Var.i("yearWeek", false);
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
                return new BrushingDurationPageDestination(i13, str, null);
            }

            @Override // x42.e0
            public final t42.b<?>[] c() {
                return new t42.b[]{a2.f86824a};
            }

            @Override // t42.h
            public final void d(w42.b bVar, Object obj) {
                BrushingDurationPageDestination brushingDurationPageDestination = (BrushingDurationPageDestination) obj;
                brushingDurationPageDestination.getClass();
                v42.e eVar = descriptor;
                d c13 = bVar.c(eVar);
                c13.l(eVar, 0, brushingDurationPageDestination.d);
                c13.a(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class c implements Parcelable.Creator<BrushingDurationPageDestination> {
            @Override // android.os.Parcelable.Creator
            public final BrushingDurationPageDestination createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new BrushingDurationPageDestination(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final BrushingDurationPageDestination[] newArray(int i13) {
                return new BrushingDurationPageDestination[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ BrushingDurationPageDestination(int i13, String str, w1 w1Var) {
            super(null);
            if (1 != (i13 & 1)) {
                l1.g(i13, 1, a.f12913a.a());
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
            return (obj instanceof BrushingDurationPageDestination) && r.c(this.d, ((BrushingDurationPageDestination) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return f.e("BrushingDurationPageDestination(yearWeek=", this.d, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeString(this.d);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/cat9/navigation/destination/WeekMetricPageDestination$BrushingDurationPageDestination$b;", "", "<init>", "()V", "Lt42/b;", "Lcom/dyson/mobile/android/cat9/navigation/destination/WeekMetricPageDestination$BrushingDurationPageDestination;", "serializer", "()Lt42/b;", "mod-cat9-oralcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final t42.b<BrushingDurationPageDestination> serializer() {
                return a.f12913a;
            }

            private b() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BrushingDurationPageDestination(String str) {
            super(null);
            str.getClass();
            this.d = str;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/dyson/mobile/android/cat9/navigation/destination/WeekMetricPageDestination$FlossingCoveragePageDestination;", "Lcom/dyson/mobile/android/cat9/navigation/destination/WeekMetricPageDestination;", "", "yearWeek", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lx42/w1;", "serializationConstructorMarker", "(ILjava/lang/String;Lx42/w1;)V", "Companion", "a", "b", "mod-cat9-oralcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes2.dex */
    public static final class FlossingCoveragePageDestination extends WeekMetricPageDestination {
        public final String d;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<FlossingCoveragePageDestination> CREATOR = new c();

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/dyson/mobile/android/cat9/navigation/destination/WeekMetricPageDestination.FlossingCoveragePageDestination.$serializer", "Lx42/e0;", "Lcom/dyson/mobile/android/cat9/navigation/destination/WeekMetricPageDestination$FlossingCoveragePageDestination;", "<init>", "()V", "Lv42/e;", "descriptor", "Lv42/e;", "a", "()Lv42/e;", "mod-cat9-oralcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @e
        /* loaded from: classes2.dex */
        public static final /* synthetic */ class a implements e0<FlossingCoveragePageDestination> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f12914a;
            private static final v42.e descriptor;

            static {
                a aVar = new a();
                f12914a = aVar;
                o1 o1Var = new o1("com.dyson.mobile.android.cat9.navigation.destination.WeekMetricPageDestination.FlossingCoveragePageDestination", aVar, 1);
                o1Var.i("yearWeek", false);
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
                return new FlossingCoveragePageDestination(i13, str, null);
            }

            @Override // x42.e0
            public final t42.b<?>[] c() {
                return new t42.b[]{a2.f86824a};
            }

            @Override // t42.h
            public final void d(w42.b bVar, Object obj) {
                FlossingCoveragePageDestination flossingCoveragePageDestination = (FlossingCoveragePageDestination) obj;
                flossingCoveragePageDestination.getClass();
                v42.e eVar = descriptor;
                d c13 = bVar.c(eVar);
                c13.l(eVar, 0, flossingCoveragePageDestination.d);
                c13.a(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class c implements Parcelable.Creator<FlossingCoveragePageDestination> {
            @Override // android.os.Parcelable.Creator
            public final FlossingCoveragePageDestination createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new FlossingCoveragePageDestination(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final FlossingCoveragePageDestination[] newArray(int i13) {
                return new FlossingCoveragePageDestination[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ FlossingCoveragePageDestination(int i13, String str, w1 w1Var) {
            super(null);
            if (1 != (i13 & 1)) {
                l1.g(i13, 1, a.f12914a.a());
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
            return (obj instanceof FlossingCoveragePageDestination) && r.c(this.d, ((FlossingCoveragePageDestination) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return f.e("FlossingCoveragePageDestination(yearWeek=", this.d, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeString(this.d);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/cat9/navigation/destination/WeekMetricPageDestination$FlossingCoveragePageDestination$b;", "", "<init>", "()V", "Lt42/b;", "Lcom/dyson/mobile/android/cat9/navigation/destination/WeekMetricPageDestination$FlossingCoveragePageDestination;", "serializer", "()Lt42/b;", "mod-cat9-oralcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final t42.b<FlossingCoveragePageDestination> serializer() {
                return a.f12914a;
            }

            private b() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FlossingCoveragePageDestination(String str) {
            super(null);
            str.getClass();
            this.d = str;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/dyson/mobile/android/cat9/navigation/destination/WeekMetricPageDestination$OverpressurePageDestination;", "Lcom/dyson/mobile/android/cat9/navigation/destination/WeekMetricPageDestination;", "", "yearWeek", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lx42/w1;", "serializationConstructorMarker", "(ILjava/lang/String;Lx42/w1;)V", "Companion", "a", "b", "mod-cat9-oralcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes2.dex */
    public static final class OverpressurePageDestination extends WeekMetricPageDestination {
        public final String d;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<OverpressurePageDestination> CREATOR = new c();

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/dyson/mobile/android/cat9/navigation/destination/WeekMetricPageDestination.OverpressurePageDestination.$serializer", "Lx42/e0;", "Lcom/dyson/mobile/android/cat9/navigation/destination/WeekMetricPageDestination$OverpressurePageDestination;", "<init>", "()V", "Lv42/e;", "descriptor", "Lv42/e;", "a", "()Lv42/e;", "mod-cat9-oralcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @e
        /* loaded from: classes2.dex */
        public static final /* synthetic */ class a implements e0<OverpressurePageDestination> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f12915a;
            private static final v42.e descriptor;

            static {
                a aVar = new a();
                f12915a = aVar;
                o1 o1Var = new o1("com.dyson.mobile.android.cat9.navigation.destination.WeekMetricPageDestination.OverpressurePageDestination", aVar, 1);
                o1Var.i("yearWeek", false);
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
                return new OverpressurePageDestination(i13, str, null);
            }

            @Override // x42.e0
            public final t42.b<?>[] c() {
                return new t42.b[]{a2.f86824a};
            }

            @Override // t42.h
            public final void d(w42.b bVar, Object obj) {
                OverpressurePageDestination overpressurePageDestination = (OverpressurePageDestination) obj;
                overpressurePageDestination.getClass();
                v42.e eVar = descriptor;
                d c13 = bVar.c(eVar);
                c13.l(eVar, 0, overpressurePageDestination.d);
                c13.a(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class c implements Parcelable.Creator<OverpressurePageDestination> {
            @Override // android.os.Parcelable.Creator
            public final OverpressurePageDestination createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new OverpressurePageDestination(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final OverpressurePageDestination[] newArray(int i13) {
                return new OverpressurePageDestination[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ OverpressurePageDestination(int i13, String str, w1 w1Var) {
            super(null);
            if (1 != (i13 & 1)) {
                l1.g(i13, 1, a.f12915a.a());
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
            return (obj instanceof OverpressurePageDestination) && r.c(this.d, ((OverpressurePageDestination) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return f.e("OverpressurePageDestination(yearWeek=", this.d, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeString(this.d);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/cat9/navigation/destination/WeekMetricPageDestination$OverpressurePageDestination$b;", "", "<init>", "()V", "Lt42/b;", "Lcom/dyson/mobile/android/cat9/navigation/destination/WeekMetricPageDestination$OverpressurePageDestination;", "serializer", "()Lt42/b;", "mod-cat9-oralcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final t42.b<OverpressurePageDestination> serializer() {
                return a.f12915a;
            }

            private b() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OverpressurePageDestination(String str) {
            super(null);
            str.getClass();
            this.d = str;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/dyson/mobile/android/cat9/navigation/destination/WeekMetricPageDestination$OverscrubbingPageDestination;", "Lcom/dyson/mobile/android/cat9/navigation/destination/WeekMetricPageDestination;", "", "yearWeek", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lx42/w1;", "serializationConstructorMarker", "(ILjava/lang/String;Lx42/w1;)V", "Companion", "a", "b", "mod-cat9-oralcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes2.dex */
    public static final class OverscrubbingPageDestination extends WeekMetricPageDestination {
        public final String d;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<OverscrubbingPageDestination> CREATOR = new c();

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/dyson/mobile/android/cat9/navigation/destination/WeekMetricPageDestination.OverscrubbingPageDestination.$serializer", "Lx42/e0;", "Lcom/dyson/mobile/android/cat9/navigation/destination/WeekMetricPageDestination$OverscrubbingPageDestination;", "<init>", "()V", "Lv42/e;", "descriptor", "Lv42/e;", "a", "()Lv42/e;", "mod-cat9-oralcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @e
        /* loaded from: classes2.dex */
        public static final /* synthetic */ class a implements e0<OverscrubbingPageDestination> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f12916a;
            private static final v42.e descriptor;

            static {
                a aVar = new a();
                f12916a = aVar;
                o1 o1Var = new o1("com.dyson.mobile.android.cat9.navigation.destination.WeekMetricPageDestination.OverscrubbingPageDestination", aVar, 1);
                o1Var.i("yearWeek", false);
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
                return new OverscrubbingPageDestination(i13, str, null);
            }

            @Override // x42.e0
            public final t42.b<?>[] c() {
                return new t42.b[]{a2.f86824a};
            }

            @Override // t42.h
            public final void d(w42.b bVar, Object obj) {
                OverscrubbingPageDestination overscrubbingPageDestination = (OverscrubbingPageDestination) obj;
                overscrubbingPageDestination.getClass();
                v42.e eVar = descriptor;
                d c13 = bVar.c(eVar);
                c13.l(eVar, 0, overscrubbingPageDestination.d);
                c13.a(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class c implements Parcelable.Creator<OverscrubbingPageDestination> {
            @Override // android.os.Parcelable.Creator
            public final OverscrubbingPageDestination createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new OverscrubbingPageDestination(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final OverscrubbingPageDestination[] newArray(int i13) {
                return new OverscrubbingPageDestination[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ OverscrubbingPageDestination(int i13, String str, w1 w1Var) {
            super(null);
            if (1 != (i13 & 1)) {
                l1.g(i13, 1, a.f12916a.a());
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
            return (obj instanceof OverscrubbingPageDestination) && r.c(this.d, ((OverscrubbingPageDestination) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return f.e("OverscrubbingPageDestination(yearWeek=", this.d, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeString(this.d);
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/cat9/navigation/destination/WeekMetricPageDestination$OverscrubbingPageDestination$b;", "", "<init>", "()V", "Lt42/b;", "Lcom/dyson/mobile/android/cat9/navigation/destination/WeekMetricPageDestination$OverscrubbingPageDestination;", "serializer", "()Lt42/b;", "mod-cat9-oralcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final t42.b<OverscrubbingPageDestination> serializer() {
                return a.f12916a;
            }

            private b() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OverscrubbingPageDestination(String str) {
            super(null);
            str.getClass();
            this.d = str;
        }
    }

    private WeekMetricPageDestination() {
    }
}
