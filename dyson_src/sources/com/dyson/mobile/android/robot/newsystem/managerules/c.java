package com.dyson.mobile.android.robot.newsystem.managerules;

import com.dyson.mobile.android.localisation.LocalisationKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rf0.i0;
import rf0.w;
import x12.r;
/* loaded from: classes3.dex */
public interface c {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/managerules/c$a;", "Lcom/dyson/mobile/android/robot/newsystem/managerules/c;", "<init>", "()V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        public static final a f16389a = new a();

        private a() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1709584327;
        }

        public final String toString() {
            return "Idle";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/managerules/c$c;", "Lcom/dyson/mobile/android/robot/newsystem/managerules/c;", "<init>", "()V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.robot.newsystem.managerules.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0570c implements c {

        /* renamed from: a  reason: collision with root package name */
        public static final C0570c f16392a = new C0570c();

        private C0570c() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0570c);
        }

        public final int hashCode() {
            return -1806153842;
        }

        public final String toString() {
            return "UpdateInProgress";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/managerules/c$b;", "Lcom/dyson/mobile/android/robot/newsystem/managerules/c;", "Lcom/dyson/mobile/android/localisation/LocalisationKey;", "error", "description", "<init>", "(Lcom/dyson/mobile/android/localisation/LocalisationKey;Lcom/dyson/mobile/android/localisation/LocalisationKey;)V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        public final LocalisationKey f16390a;

        /* renamed from: b  reason: collision with root package name */
        public final LocalisationKey f16391b;

        static {
            LocalisationKey.a aVar = LocalisationKey.f15077f;
        }

        public /* synthetic */ b(LocalisationKey localisationKey, LocalisationKey localisationKey2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? w.Q2 : localisationKey, (i13 & 2) != 0 ? i0.f71922y : localisationKey2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return r.c(this.f16390a, bVar.f16390a) && r.c(this.f16391b, bVar.f16391b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f16391b.hashCode() + (this.f16390a.hashCode() * 31);
        }

        public final String toString() {
            return "UpdateFailed(error=" + this.f16390a + ", description=" + this.f16391b + ")";
        }

        public b(LocalisationKey localisationKey, LocalisationKey localisationKey2) {
            localisationKey.getClass();
            localisationKey2.getClass();
            this.f16390a = localisationKey;
            this.f16391b = localisationKey2;
        }

        public b() {
            this(null, null, 3, null);
        }
    }
}
