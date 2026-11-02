package pf0;

import com.dyson.mobile.android.localisation.LocalisationKey;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x12.r;
import x12.u0;
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lpf0/a;", "", "<init>", "()V", "b", "a", "d", "c", "Lpf0/a$a;", "Lpf0/a$b;", "Lpf0/a$c;", "Lpf0/a$d;", "mod-localisation"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class a {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lpf0/a$a;", "Lpf0/a;", "Lcom/dyson/mobile/android/localisation/LocalisationKey;", "localisationKey", "", "", "parameters", "<init>", "(Lcom/dyson/mobile/android/localisation/LocalisationKey;Ljava/util/List;)V", "mod-localisation"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: pf0.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C1928a extends a {

        /* renamed from: a  reason: collision with root package name */
        public final LocalisationKey f64075a;

        /* renamed from: b  reason: collision with root package name */
        public final List<Object> f64076b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1928a(LocalisationKey localisationKey, List<? extends Object> list) {
            super(null);
            localisationKey.getClass();
            list.getClass();
            this.f64075a = localisationKey;
            this.f64076b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C1928a) {
                C1928a c1928a = (C1928a) obj;
                return r.c(this.f64075a, c1928a.f64075a) && r.c(this.f64076b, c1928a.f64076b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f64076b.hashCode() + (this.f64075a.hashCode() * 31);
        }

        public final String toString() {
            return "Format(localisationKey=" + this.f64075a + ", parameters=" + this.f64076b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lpf0/a$b;", "Lpf0/a;", "Lcom/dyson/mobile/android/localisation/LocalisationKey;", "localisationKey", "<init>", "(Lcom/dyson/mobile/android/localisation/LocalisationKey;)V", "mod-localisation"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b extends a {

        /* renamed from: a  reason: collision with root package name */
        public final LocalisationKey f64077a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(LocalisationKey localisationKey) {
            super(null);
            localisationKey.getClass();
            this.f64077a = localisationKey;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && r.c(this.f64077a, ((b) obj).f64077a);
        }

        public final int hashCode() {
            return this.f64077a.hashCode();
        }

        public final String toString() {
            return "Key(localisationKey=" + this.f64077a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lpf0/a$c;", "Lpf0/a;", "", "text", "<init>", "(Ljava/lang/String;)V", "mod-localisation"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c extends a {

        /* renamed from: a  reason: collision with root package name */
        public final String f64078a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(null);
            str.getClass();
            this.f64078a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && r.c(this.f64078a, ((c) obj).f64078a);
        }

        public final int hashCode() {
            return this.f64078a.hashCode();
        }

        public final String toString() {
            return bv1.f.e("PlainText(text=", this.f64078a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lpf0/a$d;", "Lpf0/a;", "Lcom/dyson/mobile/android/localisation/LocalisationKey;", "localisationKey", "", "number", "<init>", "(Lcom/dyson/mobile/android/localisation/LocalisationKey;I)V", "mod-localisation"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class d extends a {

        /* renamed from: a  reason: collision with root package name */
        public final LocalisationKey f64079a;

        /* renamed from: b  reason: collision with root package name */
        public final int f64080b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(LocalisationKey localisationKey, int i13) {
            super(null);
            localisationKey.getClass();
            this.f64079a = localisationKey;
            this.f64080b = i13;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return r.c(this.f64079a, dVar.f64079a) && this.f64080b == dVar.f64080b;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f64080b) + (this.f64079a.hashCode() * 31);
        }

        public final String toString() {
            return "Plural(localisationKey=" + this.f64079a + ", number=" + this.f64080b + ")";
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final String a() {
        if (this instanceof C1928a) {
            u0 u0Var = u0.f86723a;
            C1928a c1928a = (C1928a) this;
            String c13 = f.c(c1928a.f64075a);
            Object[] array = c1928a.f64076b.toArray(new Object[0]);
            Object[] copyOf = Arrays.copyOf(array, array.length);
            return String.format(c13, Arrays.copyOf(copyOf, copyOf.length));
        } else if (this instanceof b) {
            return f.c(((b) this).f64077a);
        } else {
            if (this instanceof d) {
                d dVar = (d) this;
                f.f64086a.getClass();
                return f.b(dVar.f64080b, dVar.f64079a);
            } else if (this instanceof c) {
                return ((c) this).f64078a;
            } else {
                ma.e.o();
                return null;
            }
        }
    }

    private a() {
    }
}
