package com.dyson.mobile.android.robot.newsystem.mapmanagement;

import c42.f2;
import com.dyson.mobile.android.logging.Logger;
import com.dyson.mobile.android.robot.newsystem.mapmanagement.MapManagementApiError;
import h12.f0;
import h12.q;
import h12.r;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import m11.l;
import m9.v;
import nl0.h;
import z32.c0;
import z32.g0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
@n12.e(c = "com.dyson.mobile.android.robot.newsystem.mapmanagement.RobotMapManagementViewModel$deleteMap$1$1", f = "RobotMapManagementViewModel.kt", l = {413}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class g extends n12.i implements Function2<c0, l12.d<? super f0>, Object> {
    public int d;
    public final /* synthetic */ e e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f16491f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(e eVar, String str, l12.d<? super g> dVar) {
        super(2, dVar);
        this.e = eVar;
        this.f16491f = str;
    }

    @Override // n12.a
    public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
        return new g(this.e, this.f16491f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
        return ((g) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
    }

    @Override // n12.a
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        Object value;
        Object value2;
        m12.a aVar = m12.a.COROUTINE_SUSPENDED;
        int i13 = this.d;
        String str = this.f16491f;
        e eVar = this.e;
        try {
            if (i13 == 0) {
                r.b(obj);
                f2 f2Var = eVar.f16476n;
                do {
                    value2 = f2Var.getValue();
                } while (!f2Var.f(value2, m11.c.a((m11.c) value2, h.b.f57897a, false, 0, null, 14)));
                int i14 = q.e;
                h41.d dVar = eVar.f16471i;
                this.d = 1;
                if (dVar.a(str, this) == aVar) {
                    return aVar;
                }
            } else if (i13 != 1) {
                pa.c.w("call to 'resume' before 'invoke' with coroutine");
                return null;
            } else {
                r.b(obj);
            }
            bVar = f0.f36844a;
            int i15 = q.e;
        } catch (Throwable th2) {
            int i16 = q.e;
            bVar = new q.b(th2);
        }
        Throwable b13 = q.b(bVar);
        if (b13 == null || !(b13 instanceof CancellationException)) {
            if (!(bVar instanceof q.b)) {
                f0 f0Var = (f0) bVar;
                int i17 = e.f16467v;
                eVar.X(false);
                m11.e eVar2 = m11.e.DELETE_MAP;
                eVar2.getClass();
                g0.r(v.a(eVar), null, null, new l(eVar, eVar2, null), 3);
            }
            Throwable b14 = q.b(bVar);
            if (b14 != null) {
                Logger.b("Failed to delete map with mapId: " + str + " " + b14, null);
                f2 f2Var2 = eVar.f16476n;
                do {
                    value = f2Var2.getValue();
                } while (!f2Var2.f(value, m11.c.a((m11.c) value, new h.a(new MapManagementApiError.DeleteMapApiError()), false, 0, null, 14)));
                return f0.f36844a;
            }
            return f0.f36844a;
        }
        throw b13;
    }
}
