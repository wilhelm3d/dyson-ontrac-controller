package com.dyson.mobile.android.robot.newsystem.managerules;

import com.dyson.mobile.android.localisation.LocalisationKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rf0.w;
import x12.r;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/managerules/i;", "", "<init>", "()V", "c", "a", "b", "Lcom/dyson/mobile/android/robot/newsystem/managerules/i$a;", "Lcom/dyson/mobile/android/robot/newsystem/managerules/i$c;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class i {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/managerules/i$a;", "Lcom/dyson/mobile/android/robot/newsystem/managerules/i;", "Lcom/dyson/mobile/android/robot/newsystem/managerules/i$b;", "error", "<init>", "(Lcom/dyson/mobile/android/robot/newsystem/managerules/i$b;)V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends i {

        /* renamed from: a  reason: collision with root package name */
        public final b f16436a;

        static {
            LocalisationKey.a aVar = LocalisationKey.f15077f;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b bVar) {
            super(null);
            bVar.getClass();
            this.f16436a = bVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && r.c(this.f16436a, ((a) obj).f16436a);
        }

        public final int hashCode() {
            return this.f16436a.hashCode();
        }

        public final String toString() {
            return "Invalid(error=" + this.f16436a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/managerules/i$c;", "Lcom/dyson/mobile/android/robot/newsystem/managerules/i;", "<init>", "()V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c extends i {

        /* renamed from: a  reason: collision with root package name */
        public static final c f16441a = new c();

        private c() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 761933516;
        }

        public final String toString() {
            return "Valid";
        }
    }

    public /* synthetic */ i(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private i() {
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/managerules/i$b;", "", "Lcom/dyson/mobile/android/localisation/LocalisationKey;", "title", "description", "<init>", "(Lcom/dyson/mobile/android/localisation/LocalisationKey;Lcom/dyson/mobile/android/localisation/LocalisationKey;)V", "a", "b", "Lcom/dyson/mobile/android/robot/newsystem/managerules/i$b$a;", "Lcom/dyson/mobile/android/robot/newsystem/managerules/i$b$b;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static abstract class b {

        /* renamed from: a  reason: collision with root package name */
        public final LocalisationKey f16437a;

        /* renamed from: b  reason: collision with root package name */
        public final LocalisationKey f16438b;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/managerules/i$b$a;", "Lcom/dyson/mobile/android/robot/newsystem/managerules/i$b;", "<init>", "()V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a extends b {

            /* renamed from: c  reason: collision with root package name */
            public static final a f16439c = new a();

            static {
                LocalisationKey.a aVar = LocalisationKey.f15077f;
            }

            private a() {
                super(w.O2, w.P2, null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -465135578;
            }

            public final String toString() {
                return "OutSideMapError";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/managerules/i$b$b;", "Lcom/dyson/mobile/android/robot/newsystem/managerules/i$b;", "<init>", "()V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.robot.newsystem.managerules.i$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0575b extends b {

            /* renamed from: c  reason: collision with root package name */
            public static final C0575b f16440c = new C0575b();

            static {
                LocalisationKey.a aVar = LocalisationKey.f15077f;
            }

            private C0575b() {
                super(w.M2, w.N2, null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0575b);
            }

            public final int hashCode() {
                return 850419678;
            }

            public final String toString() {
                return "OverlapsDockError";
            }
        }

        static {
            LocalisationKey.a aVar = LocalisationKey.f15077f;
        }

        private b(LocalisationKey localisationKey, LocalisationKey localisationKey2) {
            this.f16437a = localisationKey;
            this.f16438b = localisationKey2;
        }

        public /* synthetic */ b(LocalisationKey localisationKey, LocalisationKey localisationKey2, DefaultConstructorMarker defaultConstructorMarker) {
            this(localisationKey, localisationKey2);
        }
    }
}
