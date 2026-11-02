package com.dyson.mobile.android.connectedhome.matter;

import kotlin.Metadata;
import se1.n;
/* loaded from: classes2.dex */
public interface f {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/matter/f$a;", "Lcom/dyson/mobile/android/connectedhome/matter/f;", "<init>", "()V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final a f12989a = new a();

        private a() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1840804939;
        }

        public final String toString() {
            return "Loading";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/matter/f$b;", "Lcom/dyson/mobile/android/connectedhome/matter/f;", "Lse1/n;", "Lcom/dyson/mobile/android/connectedhome/matter/c;", "items", "<init>", "(Lse1/n;)V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements f {

        /* renamed from: a  reason: collision with root package name */
        public final n<c> f12990a;

        public b(n<c> nVar) {
            nVar.getClass();
            this.f12990a = nVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f12990a == ((b) obj).f12990a;
        }

        public final int hashCode() {
            return this.f12990a.hashCode();
        }

        public final String toString() {
            return "Success(items=" + this.f12990a + ")";
        }
    }
}
