package com.dyson.mobile.android.cat9.navigation.destination;

import android.os.Parcel;
import android.os.Parcelable;
import com.brightcove.player.event.AbstractEvent;
import com.dyson.mobile.android.cat9.ui.privacy.PageSource;
import fy1.d;
import h12.e;
import h12.l;
import h12.m;
import h12.n;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import t42.b;
import t42.g;
import x42.e0;
import x42.l1;
import x42.o1;
import x42.w1;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/cat9/navigation/destination/PrivacyConsentDestination;", "Lcom/dyson/mobile/android/cat9/navigation/destination/OralCareDestination;", "<init>", "()V", "CameraUsagePolicyView", "PrivacyConsentView", "Lcom/dyson/mobile/android/cat9/navigation/destination/PrivacyConsentDestination$CameraUsagePolicyView;", "Lcom/dyson/mobile/android/cat9/navigation/destination/PrivacyConsentDestination$PrivacyConsentView;", "mod-cat9-oralcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class PrivacyConsentDestination implements OralCareDestination {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/cat9/navigation/destination/PrivacyConsentDestination$CameraUsagePolicyView;", "Lcom/dyson/mobile/android/cat9/navigation/destination/PrivacyConsentDestination;", "<init>", "()V", "Lt42/b;", "serializer", "()Lt42/b;", "mod-cat9-oralcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes2.dex */
    public static final class CameraUsagePolicyView extends PrivacyConsentDestination {
        public static final CameraUsagePolicyView INSTANCE = new CameraUsagePolicyView();
        public static final Parcelable.Creator<CameraUsagePolicyView> CREATOR = new a();
        public static final /* synthetic */ l<b<Object>> d = m.a(n.PUBLICATION, new d(26));

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class a implements Parcelable.Creator<CameraUsagePolicyView> {
            @Override // android.os.Parcelable.Creator
            public final CameraUsagePolicyView createFromParcel(Parcel parcel) {
                parcel.getClass();
                parcel.readInt();
                return CameraUsagePolicyView.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final CameraUsagePolicyView[] newArray(int i13) {
                return new CameraUsagePolicyView[i13];
            }
        }

        private CameraUsagePolicyView() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CameraUsagePolicyView);
        }

        public final int hashCode() {
            return 1469060805;
        }

        public final b<CameraUsagePolicyView> serializer() {
            return d.getValue();
        }

        public final String toString() {
            return "CameraUsagePolicyView";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeInt(1);
        }
    }

    public /* synthetic */ PrivacyConsentDestination(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/dyson/mobile/android/cat9/navigation/destination/PrivacyConsentDestination$PrivacyConsentView;", "Lcom/dyson/mobile/android/cat9/navigation/destination/PrivacyConsentDestination;", "Lcom/dyson/mobile/android/cat9/ui/privacy/PageSource;", AbstractEvent.SOURCE, "<init>", "(Lcom/dyson/mobile/android/cat9/ui/privacy/PageSource;)V", "", "seen0", "Lx42/w1;", "serializationConstructorMarker", "(ILcom/dyson/mobile/android/cat9/ui/privacy/PageSource;Lx42/w1;)V", "Companion", "a", "b", "mod-cat9-oralcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @g
    /* loaded from: classes2.dex */
    public static final class PrivacyConsentView extends PrivacyConsentDestination {
        public final PageSource d;
        public static final b Companion = new b(null);
        public static final Parcelable.Creator<PrivacyConsentView> CREATOR = new c();
        public static final l<t42.b<Object>>[] e = {m.a(n.PUBLICATION, new d(27))};

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/dyson/mobile/android/cat9/navigation/destination/PrivacyConsentDestination.PrivacyConsentView.$serializer", "Lx42/e0;", "Lcom/dyson/mobile/android/cat9/navigation/destination/PrivacyConsentDestination$PrivacyConsentView;", "<init>", "()V", "Lv42/e;", "descriptor", "Lv42/e;", "a", "()Lv42/e;", "mod-cat9-oralcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @e
        /* loaded from: classes2.dex */
        public static final /* synthetic */ class a implements e0<PrivacyConsentView> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f12911a;
            private static final v42.e descriptor;

            static {
                a aVar = new a();
                f12911a = aVar;
                o1 o1Var = new o1("com.dyson.mobile.android.cat9.navigation.destination.PrivacyConsentDestination.PrivacyConsentView", aVar, 1);
                o1Var.i(AbstractEvent.SOURCE, false);
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
                l<t42.b<Object>>[] lVarArr = PrivacyConsentView.e;
                boolean z13 = true;
                int i13 = 0;
                PageSource pageSource = null;
                while (z13) {
                    int w13 = c13.w(eVar2);
                    if (w13 == -1) {
                        z13 = false;
                    } else if (w13 != 0) {
                        jy1.a.q(w13);
                        return null;
                    } else {
                        pageSource = (PageSource) c13.i(eVar2, 0, lVarArr[0].getValue(), pageSource);
                        i13 = 1;
                    }
                }
                c13.a(eVar2);
                return new PrivacyConsentView(i13, pageSource, null);
            }

            @Override // x42.e0
            public final t42.b<?>[] c() {
                return new t42.b[]{PrivacyConsentView.e[0].getValue()};
            }

            @Override // t42.h
            public final void d(w42.b bVar, Object obj) {
                PrivacyConsentView privacyConsentView = (PrivacyConsentView) obj;
                privacyConsentView.getClass();
                v42.e eVar = descriptor;
                w42.d c13 = bVar.c(eVar);
                c13.B(eVar, 0, PrivacyConsentView.e[0].getValue(), privacyConsentView.d);
                c13.a(eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class c implements Parcelable.Creator<PrivacyConsentView> {
            @Override // android.os.Parcelable.Creator
            public final PrivacyConsentView createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new PrivacyConsentView(PageSource.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final PrivacyConsentView[] newArray(int i13) {
                return new PrivacyConsentView[i13];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ PrivacyConsentView(int i13, PageSource pageSource, w1 w1Var) {
            super(null);
            if (1 != (i13 & 1)) {
                l1.g(i13, 1, a.f12911a.a());
                throw null;
            }
            this.d = pageSource;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PrivacyConsentView) && this.d == ((PrivacyConsentView) obj).d;
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return "PrivacyConsentView(source=" + this.d + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeString(this.d.name());
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/cat9/navigation/destination/PrivacyConsentDestination$PrivacyConsentView$b;", "", "<init>", "()V", "Lt42/b;", "Lcom/dyson/mobile/android/cat9/navigation/destination/PrivacyConsentDestination$PrivacyConsentView;", "serializer", "()Lt42/b;", "mod-cat9-oralcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final t42.b<PrivacyConsentView> serializer() {
                return a.f12911a;
            }

            private b() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PrivacyConsentView(PageSource pageSource) {
            super(null);
            pageSource.getClass();
            this.d = pageSource;
        }
    }

    private PrivacyConsentDestination() {
    }
}
