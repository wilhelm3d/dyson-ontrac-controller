package com.dyson.mobile.android.machine.machinecontent.productinformation;

import android.content.Intent;
import android.os.Bundle;
import androidx.compose.animation.i;
import androidx.compose.animation.x;
import androidx.compose.animation.y;
import androidx.lifecycle.ViewModelProvider;
import b0.y1;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.dynamiccontent.deeplinks.DynamicContentDeepLink;
import com.dyson.mobile.android.machine.machinecontent.productinformation.b;
import com.dyson.mobile.android.machine.machinecontent.productinformation.d;
import f.x;
import fm1.o0;
import h12.f0;
import h12.r;
import k80.b;
import kotlin.Metadata;
import kotlin.UninitializedPropertyAccessException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.u;
import m9.v;
import we1.a;
import x12.p;
import x42.a2;
import x42.e0;
import x42.l1;
import x42.o1;
import x42.w1;
import y9.c0;
import y9.q0;
import y9.z;
import z32.g0;
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lcom/dyson/mobile/android/machine/machinecontent/productinformation/ProductInformationActivity;", "Lf/g;", "<init>", "()V", "b", "a", "Lcom/dyson/mobile/android/machine/machinecontent/productinformation/g;", "viewState", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductInformationActivity extends f.g {

    /* renamed from: l  reason: collision with root package name */
    public static final a f15251l = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public d.a f15252j;

    /* renamed from: k  reason: collision with root package name */
    public b f15253k;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class c extends p implements w12.a<f0> {
        public c(Object obj) {
            super(0, obj, com.dyson.mobile.android.machine.machinecontent.productinformation.d.class, "refreshApi", "refreshApi()V", 0);
        }

        @Override // w12.a
        public final f0 invoke() {
            ((com.dyson.mobile.android.machine.machinecontent.productinformation.d) this.receiver).S();
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class d extends p implements Function1<k80.b, f0> {
        public d(Object obj) {
            super(1, obj, com.dyson.mobile.android.machine.machinecontent.productinformation.d.class, "onEvent", "onEvent(Lcom/dyson/mobile/android/dynamiccontent/entities/ContentEvent;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final f0 invoke(k80.b bVar) {
            k80.b bVar2 = bVar;
            bVar2.getClass();
            com.dyson.mobile.android.machine.machinecontent.productinformation.d dVar = (com.dyson.mobile.android.machine.machinecontent.productinformation.d) this.receiver;
            dVar.getClass();
            if (bVar2 instanceof b.C1499b) {
                DynamicContentDeepLink dynamicContentDeepLink = ((b.C1499b) bVar2).f47095a;
                if (dynamicContentDeepLink instanceof DynamicContentDeepLink.e0) {
                    g0.r(v.a(dVar), null, null, new com.dyson.mobile.android.machine.machinecontent.productinformation.e(dVar, dynamicContentDeepLink, null), 3);
                }
            }
            return f0.f36844a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/dyson/mobile/android/machine/machinecontent/productinformation/b;", com.salesforce.marketingcloud.push.g.f21676h, "Lh12/f0;", "<anonymous>", "(Lcom/dyson/mobile/android/machine/machinecontent/productinformation/b;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.machine.machinecontent.productinformation.ProductInformationActivity$onCreate$2$1$1$1$1$4$1", f = "ProductInformationActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    /* loaded from: classes3.dex */
    public static final class e extends n12.i implements Function2<com.dyson.mobile.android.machine.machinecontent.productinformation.b, l12.d<? super f0>, Object> {
        public /* synthetic */ Object d;
        public final /* synthetic */ q0 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(q0 q0Var, l12.d<? super e> dVar) {
            super(2, dVar);
            this.e = q0Var;
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            e eVar = new e(this.e, dVar);
            eVar.d = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(com.dyson.mobile.android.machine.machinecontent.productinformation.b bVar, l12.d<? super f0> dVar) {
            return ((e) create(bVar, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            com.dyson.mobile.android.machine.machinecontent.productinformation.b bVar = (com.dyson.mobile.android.machine.machinecontent.productinformation.b) this.d;
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            r.b(obj);
            if (!(bVar instanceof b.a)) {
                ma.e.o();
                return null;
            }
            b.a aVar2 = (b.a) bVar;
            c0.j(this.e, new b(aVar2.f15262a, aVar2.f15263b), null, 6);
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class f implements Function1<androidx.compose.animation.i<z>, x> {
        public static final f d = new f();

        @Override // kotlin.jvm.functions.Function1
        public final x invoke(androidx.compose.animation.i<z> iVar) {
            androidx.compose.animation.i<z> iVar2 = iVar;
            iVar2.getClass();
            if (pf1.a.a(iVar2)) {
                i.a.f2669b.getClass();
                return androidx.compose.animation.i.a(iVar2, i.a.f2671f, null, 6);
            }
            x.f2747a.getClass();
            return x.f2748b;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class g implements Function1<androidx.compose.animation.i<z>, y> {
        public static final g d = new g();

        @Override // kotlin.jvm.functions.Function1
        public final y invoke(androidx.compose.animation.i<z> iVar) {
            androidx.compose.animation.i<z> iVar2 = iVar;
            iVar2.getClass();
            if (pf1.a.a(iVar2)) {
                i.a.f2669b.getClass();
                return androidx.compose.animation.i.g(iVar2, i.a.f2671f, null, 6);
            }
            y.f2749a.getClass();
            return y.f2750b;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class h implements Function1<androidx.compose.animation.i<z>, x> {
        public static final h d = new h();

        @Override // kotlin.jvm.functions.Function1
        public final x invoke(androidx.compose.animation.i<z> iVar) {
            androidx.compose.animation.i<z> iVar2 = iVar;
            iVar2.getClass();
            i.a.f2669b.getClass();
            return androidx.compose.animation.i.a(iVar2, i.a.f2672g, null, 6);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class i implements Function1<androidx.compose.animation.i<z>, y> {
        public static final i d = new i();

        @Override // kotlin.jvm.functions.Function1
        public final y invoke(androidx.compose.animation.i<z> iVar) {
            androidx.compose.animation.i<z> iVar2 = iVar;
            iVar2.getClass();
            if (pf1.a.a(iVar2)) {
                i.a.f2669b.getClass();
                return androidx.compose.animation.i.g(iVar2, i.a.f2672g, null, 6);
            }
            y.f2749a.getClass();
            return y.f2750b;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/machine/machinecontent/productinformation/ProductInformationActivity$j", "Landroidx/lifecycle/ViewModelProvider$Factory;", "mod-utilities"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class j implements ViewModelProvider.Factory {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f15257a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f15258b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ sg0.c f15259c;

        public j(String str, String str2, sg0.c cVar) {
            this.f15257a = str;
            this.f15258b = str2;
            this.f15259c = cVar;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [com.dyson.mobile.android.machine.machinecontent.productinformation.d$a, VMF] */
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public final <T extends u> T create(Class<T> cls) {
            cls.getClass();
            if (d.a.class.isAnnotationPresent(wy1.a.class)) {
                ef1.a aVar = new ef1.a();
                aVar.f26823a = (d.a) ((sg0.b) this.f15259c).F0.f88315a;
                try {
                    return ((d.a) aVar.a()).a(this.f15257a, this.f15258b);
                } catch (UninitializedPropertyAccessException unused) {
                    throw new ef1.b();
                }
            }
            throw new ef1.g();
        }
    }

    @Override // f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Please use newInstance method to create ProductInformationActivity";
        Bundle a14 = a13.a("machineSerial", "productInformationItemId");
        uf0.g a15 = uf0.g.a(this);
        if (a15 == null) {
            pa.c.w("Could not initialise the Machine Coordinator");
            return;
        }
        this.f15252j = (d.a) a15.f81922a.F0.f88315a;
        this.f15253k = new b(o0.y("machineSerial", a14), o0.y("productInformationItemId", a14));
        f.x.e.getClass();
        f.j.a(this, x.a.a(0), x.a.a(0));
        g.f.a(this, new c4.c(-2139047683, true, new si0.a(this, 0)));
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \f2\u00020\u0001:\u0002\r\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/dyson/mobile/android/machine/machinecontent/productinformation/ProductInformationActivity$b;", "", "", "serial", "itemId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lx42/w1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lx42/w1;)V", "Companion", "a", "b", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @t42.g
    /* loaded from: classes3.dex */
    public static final class b {
        public static final C0519b Companion = new C0519b(null);

        /* renamed from: a  reason: collision with root package name */
        public final String f15254a;

        /* renamed from: b  reason: collision with root package name */
        public final String f15255b;

        @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"com/dyson/mobile/android/machine/machinecontent/productinformation/ProductInformationActivity.ProductInformationRoute.$serializer", "Lx42/e0;", "Lcom/dyson/mobile/android/machine/machinecontent/productinformation/ProductInformationActivity$b;", "<init>", "()V", "Lv42/e;", "descriptor", "Lv42/e;", "a", "()Lv42/e;", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
        @h12.e
        /* loaded from: classes3.dex */
        public static final /* synthetic */ class a implements e0<b> {

            /* renamed from: a  reason: collision with root package name */
            public static final a f15256a;
            private static final v42.e descriptor;

            static {
                a aVar = new a();
                f15256a = aVar;
                o1 o1Var = new o1("com.dyson.mobile.android.machine.machinecontent.productinformation.ProductInformationActivity.ProductInformationRoute", aVar, 2);
                o1Var.i("serial", false);
                o1Var.i("itemId", false);
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
                String str2 = null;
                while (z13) {
                    int w13 = c13.w(eVar2);
                    if (w13 == -1) {
                        z13 = false;
                    } else if (w13 == 0) {
                        str = c13.g(eVar2, 0);
                        i13 |= 1;
                    } else if (w13 != 1) {
                        jy1.a.q(w13);
                        return null;
                    } else {
                        str2 = c13.g(eVar2, 1);
                        i13 |= 2;
                    }
                }
                c13.a(eVar2);
                return new b(i13, str, str2, null);
            }

            @Override // x42.e0
            public final t42.b<?>[] c() {
                a2 a2Var = a2.f86824a;
                return new t42.b[]{a2Var, a2Var};
            }

            @Override // t42.h
            public final void d(w42.b bVar, Object obj) {
                b bVar2 = (b) obj;
                bVar2.getClass();
                v42.e eVar = descriptor;
                w42.d c13 = bVar.c(eVar);
                c13.l(eVar, 0, bVar2.f15254a);
                c13.l(eVar, 1, bVar2.f15255b);
                c13.a(eVar);
            }
        }

        public /* synthetic */ b(int i13, String str, String str2, w1 w1Var) {
            if (3 != (i13 & 3)) {
                l1.g(i13, 3, a.f15256a.a());
                throw null;
            }
            this.f15254a = str;
            this.f15255b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return x12.r.c(this.f15254a, bVar.f15254a) && x12.r.c(this.f15255b, bVar.f15255b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f15255b.hashCode() + (this.f15254a.hashCode() * 31);
        }

        public final String toString() {
            return y1.j("ProductInformationRoute(serial=", this.f15254a, ", itemId=", this.f15255b, ")");
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/machine/machinecontent/productinformation/ProductInformationActivity$b$b;", "", "<init>", "()V", "Lt42/b;", "Lcom/dyson/mobile/android/machine/machinecontent/productinformation/ProductInformationActivity$b;", "serializer", "()Lt42/b;", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.machine.machinecontent.productinformation.ProductInformationActivity$b$b  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0519b {
            public /* synthetic */ C0519b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final t42.b<b> serializer() {
                return a.f15256a;
            }

            private C0519b() {
            }
        }

        public b(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.f15254a = str;
            this.f15255b = str2;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/machine/machinecontent/productinformation/ProductInformationActivity$a;", "", "<init>", "()V", "", "MACHINE_SERIAL_EXTRA", "Ljava/lang/String;", "PRODUCT_INFORMATION_ITEM_ID_EXTRA", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
