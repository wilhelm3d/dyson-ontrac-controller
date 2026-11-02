package f60;

import kotlin.Metadata;
/* loaded from: classes2.dex */
public interface z {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf60/z$a;", "Lf60/z;", "<init>", "()V", "mod-connectivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements z {

        /* renamed from: a  reason: collision with root package name */
        public static final a f30013a = new a();

        private a() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1624448671;
        }

        public final String toString() {
            return "Connected";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf60/z$b;", "Lf60/z;", "<init>", "()V", "mod-connectivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements z {

        /* renamed from: a  reason: collision with root package name */
        public static final b f30014a = new b();

        private b() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1181703008;
        }

        public final String toString() {
            return "Connecting";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lf60/z$c;", "Lf60/z;", "Lf60/a0;", "reason", "<init>", "(Lf60/a0;)V", "mod-connectivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c implements z {

        /* renamed from: a  reason: collision with root package name */
        public final a0 f30015a;

        public c(a0 a0Var) {
            a0Var.getClass();
            this.f30015a = a0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f30015a == ((c) obj).f30015a;
        }

        public final int hashCode() {
            return this.f30015a.hashCode();
        }

        public final String toString() {
            return "NotConnected(reason=" + this.f30015a + ")";
        }
    }
}
