package com.dyson.mobile.android.connectionjourney.machinescan;

import c42.r1;
import cg0.l;
import cg0.m;
import cg0.r;
import com.dyson.mobile.android.connectionjourney.machinescan.c;
import com.paypal.pyplcheckout.ui.feature.addressbook.view.customviews.PayPalNewShippingAddressReviewViewKt;
import h12.f0;
import h12.r;
import i12.p0;
import i12.u;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import n12.i;
import u3.y2;
import z32.c0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
@n12.e(c = "com.dyson.mobile.android.connectionjourney.machinescan.MachineScanViewModel$fetchWebRegisteredThumbnails$1", f = "MachineScanViewModel.kt", l = {342}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class d extends i implements Function2<c0, l12.d<? super f0>, Object> {
    public int d;
    public final /* synthetic */ c e;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcg0/m;", PayPalNewShippingAddressReviewViewKt.STATE, "Lh12/f0;", "<anonymous>", "(Lcg0/m;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.connectionjourney.machinescan.MachineScanViewModel$fetchWebRegisteredThumbnails$1$1", f = "MachineScanViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class a extends i implements Function2<m, l12.d<? super f0>, Object> {
        public /* synthetic */ Object d;
        public final /* synthetic */ c e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c cVar, l12.d<? super a> dVar) {
            super(2, dVar);
            this.e = cVar;
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            a aVar = new a(this.e, dVar);
            aVar.d = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(m mVar, l12.d<? super f0> dVar) {
            return ((a) create(mVar, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            m mVar = (m) this.d;
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            r.b(obj);
            boolean z13 = mVar instanceof m.c;
            c cVar = this.e;
            if (z13) {
                List<c.d> list = ((c.e) ((y2) cVar.f13568t).getValue()).e;
                arrayList = new ArrayList(u.o(list, 10));
                for (c.d dVar : list) {
                    arrayList.add(c.d.a(dVar, r.c.f11149a));
                }
            } else if (mVar instanceof m.b) {
                List<c.d> list2 = ((c.e) ((y2) cVar.f13568t).getValue()).e;
                arrayList = new ArrayList(u.o(list2, 10));
                for (c.d dVar2 : list2) {
                    arrayList.add(c.d.a(dVar2, r.b.f11148a));
                }
            } else if (!(mVar instanceof m.a)) {
                ma.e.o();
                return null;
            } else {
                List<l> list3 = ((m.a) mVar).f11131a;
                int b13 = p0.b(u.o(list3, 10));
                if (b13 < 16) {
                    b13 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(b13);
                for (Object obj2 : list3) {
                    linkedHashMap.put(((l) obj2).c(), obj2);
                }
                List<c.d> list4 = ((c.e) ((y2) cVar.f13568t).getValue()).e;
                arrayList = new ArrayList(u.o(list4, 10));
                for (c.d dVar3 : list4) {
                    l lVar = (l) linkedHashMap.get(dVar3.f13579a.j());
                    arrayList.add(c.d.a(dVar3, lVar != null ? new r.a(lVar) : r.b.f11148a));
                }
            }
            ArrayList arrayList2 = arrayList;
            y2 y2Var = (y2) cVar.f13568t;
            y2Var.setValue(c.e.a((c.e) y2Var.getValue(), false, false, null, arrayList2, null, null, 239));
            return f0.f36844a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, l12.d<? super d> dVar) {
        super(2, dVar);
        this.e = cVar;
    }

    @Override // n12.a
    public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
        return new d(this.e, dVar);
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
            h12.r.b(obj);
            c cVar = this.e;
            r1 c13 = cVar.f13554f.c();
            a aVar2 = new a(cVar, null);
            this.d = 1;
            if (c42.r.i(c13, aVar2, this) == aVar) {
                return aVar;
            }
        } else if (i13 != 1) {
            pa.c.w("call to 'resume' before 'invoke' with coroutine");
            return null;
        } else {
            h12.r.b(obj);
        }
        return f0.f36844a;
    }
}
