package com.dyson.mobile.android.robot.newsystem.home.tabs.maps;

import c42.f2;
import com.dyson.mobile.android.robot.CacheLoadPolicy;
import com.dyson.mobile.android.robot.newsystem.home.tabs.maps.ManageMapsTabApiError;
import com.paypal.pyplcheckout.ui.feature.addressbook.view.customviews.PayPalNewShippingAddressReviewViewKt;
import h12.f0;
import h12.r;
import i12.t;
import i12.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import n12.i;
import nl0.h;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lnl0/h;", "", "Lvu0/a;", PayPalNewShippingAddressReviewViewKt.STATE, "Lh12/f0;", "<anonymous>", "(Lnl0/h;)V"}, k = 3, mv = {2, 3, 0})
@n12.e(c = "com.dyson.mobile.android.robot.newsystem.home.tabs.maps.RobotManageMapsViewModel$observeMapMetadata$2", f = "RobotManageMapsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class g extends i implements Function2<h<? extends List<? extends vu0.a>>, l12.d<? super f0>, Object> {
    public /* synthetic */ Object d;
    public final /* synthetic */ d e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(d dVar, l12.d<? super g> dVar2) {
        super(2, dVar2);
        this.e = dVar;
    }

    @Override // n12.a
    public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
        g gVar = new g(this.e, dVar);
        gVar.d = obj;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(h<? extends List<? extends vu0.a>> hVar, l12.d<? super f0> dVar) {
        return ((g) create(hVar, dVar)).invokeSuspend(f0.f36844a);
    }

    @Override // n12.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        g01.d dVar;
        h.b bVar;
        Integer num;
        h hVar = (h) this.d;
        m12.a aVar = m12.a.COROUTINE_SUSPENDED;
        r.b(obj);
        boolean z13 = hVar instanceof h.c;
        d dVar2 = this.e;
        if (z13) {
            T t13 = ((h.c) hVar).f57898a;
            Iterable<vu0.a> iterable = (Iterable) t13;
            ArrayList arrayList = new ArrayList(u.o(iterable, 10));
            for (vu0.a aVar2 : iterable) {
                String a13 = aVar2.a();
                String c13 = aVar2.c();
                if (c13 == null) {
                    c13 = dVar2.f16365s;
                }
                arrayList.add(new g01.b(a13, c13));
            }
            dVar2.f16358l = arrayList;
            Iterator it = ((List) t13).iterator();
            int i13 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i13 = -1;
                    break;
                } else if (((vu0.a) it.next()).e()) {
                    break;
                } else {
                    i13++;
                }
            }
            int i14 = i13;
            f2 f2Var = dVar2.f16359m;
            do {
                value3 = f2Var.getValue();
                dVar = (g01.d) value3;
                bVar = h.b.f57897a;
                Integer.valueOf(i14);
                num = (i14 < 0 || i14 > t.g(dVar2.f16358l)) ? null : null;
            } while (!f2Var.f(value3, g01.d.a(dVar, bVar, num != null ? num.intValue() : 0, null, 4)));
            dVar2.S(CacheLoadPolicy.CACHE_OR_REMOTE);
        } else if (hVar instanceof h.a) {
            f2 f2Var2 = dVar2.f16359m;
            do {
                value2 = f2Var2.getValue();
            } while (!f2Var2.f(value2, g01.d.a((g01.d) value2, new h.a(ManageMapsTabApiError.MapMetadataApiError.d), 0, null, 6)));
        } else if (hVar instanceof h.b) {
            f2 f2Var3 = dVar2.f16359m;
            do {
                value = f2Var3.getValue();
            } while (!f2Var3.f(value, g01.d.a((g01.d) value, h.b.f57897a, 0, null, 6)));
        }
        return f0.f36844a;
    }
}
