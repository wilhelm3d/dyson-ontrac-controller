package com.dyson.mobile.android.connectionjourney.clouddriven.addproduct;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x12.r;
import x42.a2;
import x42.e0;
import x42.l1;
import x42.o1;
import x42.w1;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/clouddriven/addproduct/b;", "", "<init>", "()V", "c", "b", "a", "Lcom/dyson/mobile/android/connectionjourney/clouddriven/addproduct/b$b;", "Lcom/dyson/mobile/android/connectionjourney/clouddriven/addproduct/b$c;", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a  reason: collision with root package name */
    public static final a f13430a = new a(null);

    /* renamed from: b  reason: collision with root package name */
    public static final String f13431b;

    static {
        df1.a.f23650a.getClass();
        f13431b = "internalScheme:///".concat("add-product");
    }

    public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/clouddriven/addproduct/b$b;", "Lcom/dyson/mobile/android/connectionjourney/clouddriven/addproduct/b;", "", "machineModel", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lx42/w1;", "serializationConstructorMarker", "(ILjava/lang/String;Lx42/w1;)V", "Companion", "a", "b", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @t42.g
    /* renamed from: com.dyson.mobile.android.connectionjourney.clouddriven.addproduct.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0416b extends b {
        public static final C0417b Companion = new C0417b(null);

        /* renamed from: c  reason: collision with root package name */
        public final String f13432c;

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/dyson/mobile/android/connectionjourney/clouddriven/addproduct/AddProductDestination.NonSerialProduct.$serializer", "Lx42/e0;", "Lcom/dyson/mobile/android/connectionjourney/clouddriven/addproduct/b$b;", "<init>", "()V", "Lv42/e;", "descriptor", "Lv42/e;", "a", "()Lv42/e;", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @h12.e
        /* renamed from: com.dyson.mobile.android.connectionjourney.clouddriven.addproduct.b$b$a */
        /* loaded from: classes2.dex */
        public static final /* synthetic */ class a implements e0<C0416b> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f13433a;
            private static final v42.e descriptor;

            static {
                a aVar = new a();
                f13433a = aVar;
                o1 o1Var = new o1("com.dyson.mobile.android.connectionjourney.clouddriven.addproduct.AddProductDestination.NonSerialProduct", aVar, 1);
                o1Var.i("machineModel", false);
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
                return new C0416b(i13, str, null);
            }

            @Override // x42.e0
            public final t42.b<?>[] c() {
                return new t42.b[]{a2.f86824a};
            }

            @Override // t42.h
            public final void d(w42.b bVar, Object obj) {
                C0416b c0416b = (C0416b) obj;
                c0416b.getClass();
                v42.e eVar = descriptor;
                w42.d c13 = bVar.c(eVar);
                c13.l(eVar, 0, c0416b.f13432c);
                c13.a(eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C0416b(int i13, String str, w1 w1Var) {
            super(null);
            if (1 != (i13 & 1)) {
                l1.g(i13, 1, a.f13433a.a());
                throw null;
            }
            this.f13432c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0416b) && r.c(this.f13432c, ((C0416b) obj).f13432c);
        }

        public final int hashCode() {
            return this.f13432c.hashCode();
        }

        public final String toString() {
            return bv1.f.e("NonSerialProduct(machineModel=", this.f13432c, ")");
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/clouddriven/addproduct/b$b$b;", "", "<init>", "()V", "Lt42/b;", "Lcom/dyson/mobile/android/connectionjourney/clouddriven/addproduct/b$b;", "serializer", "()Lt42/b;", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.connectionjourney.clouddriven.addproduct.b$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0417b {
            public /* synthetic */ C0417b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final t42.b<C0416b> serializer() {
                return a.f13433a;
            }

            private C0417b() {
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0416b(String str) {
            super(null);
            str.getClass();
            this.f13432c = str;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u000b2\u00020\u0001:\u0002\f\rB\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/clouddriven/addproduct/b$c;", "Lcom/dyson/mobile/android/connectionjourney/clouddriven/addproduct/b;", "", "identifier", "<init>", "(Ljava/lang/String;)V", "", "seen0", "Lx42/w1;", "serializationConstructorMarker", "(ILjava/lang/String;Lx42/w1;)V", "Companion", "a", "b", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @t42.g
    /* loaded from: classes2.dex */
    public static final class c extends b {
        public static final C0418b Companion = new C0418b(null);

        /* renamed from: c  reason: collision with root package name */
        public final String f13434c;

        public /* synthetic */ c(int i13, String str, w1 w1Var) {
            super(null);
            if ((i13 & 1) == 0) {
                this.f13434c = null;
            } else {
                this.f13434c = str;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && r.c(this.f13434c, ((c) obj).f13434c);
        }

        public final int hashCode() {
            String str = this.f13434c;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return bv1.f.e("ProductGroup(identifier=", this.f13434c, ")");
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/clouddriven/addproduct/b$c$b;", "", "<init>", "()V", "Lt42/b;", "Lcom/dyson/mobile/android/connectionjourney/clouddriven/addproduct/b$c;", "serializer", "()Lt42/b;", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.connectionjourney.clouddriven.addproduct.b$c$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0418b {
            public /* synthetic */ C0418b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final t42.b<c> serializer() {
                return a.f13435a;
            }

            private C0418b() {
            }
        }

        public c() {
            this((String) null, 1, (DefaultConstructorMarker) null);
        }

        public c(String str) {
            super(null);
            this.f13434c = str;
        }

        public /* synthetic */ c(String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? null : str);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/clouddriven/addproduct/b$a;", "", "<init>", "()V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    private b() {
    }
}
