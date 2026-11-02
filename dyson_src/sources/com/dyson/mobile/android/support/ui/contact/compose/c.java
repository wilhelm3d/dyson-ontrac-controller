package com.dyson.mobile.android.support.ui.contact.compose;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.m;
import c42.f2;
import c42.g2;
import c42.q1;
import c42.r1;
import c42.u1;
import c42.w1;
import com.dyson.mobile.android.analytics.tracking.externallink.ExternalLinkTracking;
import com.dyson.mobile.android.localisation.LocalisationKey;
import com.dyson.mobile.android.machinetype.MachineDescriptor;
import com.dyson.mobile.android.machinetype.MachineType;
import com.dyson.mobile.android.support.ui.contact.compose.b;
import h12.f0;
import h12.p;
import h12.r;
import h71.i;
import i12.p0;
import i12.q0;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lj.a;
import m9.u;
import m9.v;
import mj.m;
import nj.h;
import r3.l4;
import rf0.i0;
import x81.o;
import z32.c0;
import z32.d2;
import z32.g0;
import z32.m1;
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0014\u0015BQ\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/dyson/mobile/android/support/ui/contact/compose/c;", "Lm9/u;", "Landroidx/lifecycle/m;", "Lk71/c;", "supportContactManager", "Lpf0/c;", "localisationManager", "Lhj/e;", "trackingManager", "Lr81/d;", "salesforceChatBotHandler", "Lye1/a;", "clipboardHelper", "", "serialNumber", "Lcom/dyson/mobile/android/machinetype/MachineDescriptor;", "machineDescriptor", "faultCode", "<init>", "(Lk71/c;Lpf0/c;Lhj/e;Lr81/d;Lye1/a;Ljava/lang/String;Lcom/dyson/mobile/android/machinetype/MachineDescriptor;Ljava/lang/String;)V", "b", "a", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c extends u implements m {

    /* renamed from: t  reason: collision with root package name */
    public static final /* synthetic */ int f16876t = 0;
    public final k71.c d;
    public final pf0.c e;

    /* renamed from: f  reason: collision with root package name */
    public final hj.e f16877f;

    /* renamed from: g  reason: collision with root package name */
    public final r81.d f16878g;

    /* renamed from: h  reason: collision with root package name */
    public final ye1.a f16879h;

    /* renamed from: i  reason: collision with root package name */
    public final String f16880i;

    /* renamed from: j  reason: collision with root package name */
    public final MachineDescriptor f16881j;

    /* renamed from: k  reason: collision with root package name */
    public final String f16882k;

    /* renamed from: l  reason: collision with root package name */
    public com.salesforce.android.smi.ui.b f16883l;

    /* renamed from: m  reason: collision with root package name */
    public i f16884m;

    /* renamed from: n  reason: collision with root package name */
    public final f2 f16885n;

    /* renamed from: o  reason: collision with root package name */
    public final r1 f16886o;

    /* renamed from: p  reason: collision with root package name */
    public final u1 f16887p;

    /* renamed from: q  reason: collision with root package name */
    public final q1 f16888q;

    /* renamed from: r  reason: collision with root package name */
    public d2 f16889r;

    /* renamed from: s  reason: collision with root package name */
    public final MachineType f16890s;

    @wy1.a
    /* loaded from: classes3.dex */
    public interface b {
        c a(String str, MachineDescriptor machineDescriptor, String str2);
    }

    /* renamed from: com.dyson.mobile.android.support.ui.contact.compose.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class C0614c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f16891a;

        static {
            int[] iArr = new int[Lifecycle.a.values().length];
            try {
                iArr[Lifecycle.a.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.a.ON_DESTROY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.a.ON_PAUSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f16891a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.support.ui.contact.compose.ErrorCustomerSupportViewModel$onUrlButtonClicked$1", f = "ErrorCustomerSupportViewModel.kt", l = {271}, m = "invokeSuspend", v = 2)
    /* loaded from: classes3.dex */
    public static final class d extends n12.i implements Function2<c0, l12.d<? super f0>, Object> {
        public int d;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ URL f16892f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(URL url, l12.d<? super d> dVar) {
            super(2, dVar);
            this.f16892f = url;
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            return new d(this.f16892f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
            return ((d) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            int i13 = this.d;
            if (i13 == 0) {
                r.b(obj);
                u1 u1Var = c.this.f16887p;
                b.e eVar = new b.e(this.f16892f);
                this.d = 1;
                if (u1Var.emit(eVar, this) == aVar) {
                    return aVar;
                }
            } else if (i13 != 1) {
                pa.c.w("call to 'resume' before 'invoke' with coroutine");
                return null;
            } else {
                r.b(obj);
            }
            return f0.f36844a;
        }
    }

    static {
        new a(null);
    }

    public c(k71.c cVar, pf0.c cVar2, hj.e eVar, r81.d dVar, ye1.a aVar, String str, MachineDescriptor machineDescriptor, String str2) {
        Object value;
        cVar.getClass();
        cVar2.getClass();
        eVar.getClass();
        dVar.getClass();
        aVar.getClass();
        str.getClass();
        machineDescriptor.getClass();
        this.d = cVar;
        this.e = cVar2;
        this.f16877f = eVar;
        this.f16878g = dVar;
        this.f16879h = aVar;
        this.f16880i = str;
        this.f16881j = machineDescriptor;
        this.f16882k = str2;
        f2 a13 = g2.a(new o(null, null, null, null, null, false, 63, null));
        this.f16885n = a13;
        this.f16886o = c42.r.d(a13);
        u1 b13 = w1.b(0, 0, null, 6);
        this.f16887p = b13;
        this.f16888q = c42.r.c(b13);
        MachineType.a aVar2 = MachineType.Companion;
        String machineType = machineDescriptor.getMachineType();
        aVar2.getClass();
        this.f16890s = MachineType.a.a(machineType);
        cVar.c();
        do {
            value = a13.getValue();
        } while (!a13.f(value, o.a((o) value, this.f16880i, this.f16882k, this.e.d(rf0.f.E7), this.e.d(i0.E5), null, false, 48)));
    }

    public static final Object S(c cVar, URL url, n12.i iVar) {
        cVar.getClass();
        W(cVar, "contact_us");
        u1 u1Var = cVar.f16887p;
        String url2 = url.toString();
        url2.getClass();
        Object emit = u1Var.emit(new b.d(new kj.b(url2, new ExternalLinkTracking("contact_us", m.a.CONTACT_US_DIALOG, null, null, 12, null))), iVar);
        return emit == m12.a.COROUTINE_SUSPENDED ? emit : f0.f36844a;
    }

    public static void T(ArrayList arrayList, String str, LocalisationKey localisationKey, boolean z13, int i13, int i14, w12.a aVar) {
        if (str == null || str.length() == 0 || !z13) {
            return;
        }
        arrayList.add(new x81.b(localisationKey, i13, str, i14, new l4(aVar, 22)));
    }

    public static /* synthetic */ void W(c cVar, String str) {
        cVar.V(str, m.b.EXTERNAL_APP);
    }

    public final void U(URL url, String str) {
        g0.r(v.a(this), null, null, new d(url, null), 3);
        W(this, str);
    }

    public final void V(String str, m.b bVar) {
        ij.f a13 = new mj.m(str, bVar, m.a.CONTACT_US_DIALOG, null, null, 24, null).a();
        a.j.f52159a.getClass();
        this.f16877f.g(a13, q0.f(new p(a.j.d.toString(), this.f16880i), new p(a.j.f52161c.toString(), this.f16890s.getTypeName()), new p(a.j.e.toString(), this.f16881j.getMachineVariant())));
    }

    @Override // androidx.lifecycle.m
    public final void g(LifecycleOwner lifecycleOwner, Lifecycle.a aVar) {
        int i13 = C0614c.f16891a[aVar.ordinal()];
        r81.d dVar = this.f16878g;
        if (i13 == 1) {
            i71.a j8 = this.d.j();
            i iVar = j8 != null ? j8.f40997h : null;
            this.f16884m = iVar;
            if (iVar == i.SALESFORCE) {
                dVar.b();
                this.f16883l = dVar.f70735f;
            }
            int i14 = h.f57505a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            a.r.f52188a.getClass();
            ij.b e = ma.e.e(linkedHashMap, a.r.f52189b, "#token_previousScreenName", "common.help.contact_details", linkedHashMap);
            a.j.f52159a.getClass();
            this.f16877f.h(e, p0.c(new p(a.j.f52160b, jn0.a.a(this.f16881j.getMachineCategory()))));
        } else if (i13 == 2) {
            d2 d2Var = this.f16889r;
            if (d2Var != null) {
                m1.a aVar2 = m1.f91486a1;
                d2Var.c(null);
            }
        } else if (i13 == 3 && this.f16883l != null) {
            z32.f2 f2Var = dVar.d;
            m1.a aVar3 = m1.f91486a1;
            f2Var.c(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/support/ui/contact/compose/c$a;", "", "<init>", "()V", "", "ASSISTED_SERIAL_NUMBER_KEY", "Ljava/lang/String;", "ASSISTED_MACHINE_DESCRIPTOR_KEY", "ASSISTED_FAULT_CODE_KEY", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
