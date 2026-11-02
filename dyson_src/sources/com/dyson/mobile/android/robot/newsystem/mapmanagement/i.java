package com.dyson.mobile.android.robot.newsystem.mapmanagement;

import com.dyson.mobile.android.robot.newsystem.mapmanagement.b;
import h12.f0;
import h12.r;
import i12.u;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import z32.c0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
@n12.e(c = "com.dyson.mobile.android.robot.newsystem.mapmanagement.RobotMapManagementViewModel$onRenameMapClicked$1$1", f = "RobotMapManagementViewModel.kt", l = {170}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class i extends n12.i implements Function2<c0, l12.d<? super f0>, Object> {
    public int d;
    public final /* synthetic */ e e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ m11.b f16493f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(e eVar, m11.b bVar, l12.d<? super i> dVar) {
        super(2, dVar);
        this.e = eVar;
        this.f16493f = bVar;
    }

    @Override // n12.a
    public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
        return new i(this.e, this.f16493f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
        return ((i) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
    }

    @Override // n12.a
    public final Object invokeSuspend(Object obj) {
        m12.a aVar = m12.a.COROUTINE_SUSPENDED;
        int i13 = this.d;
        if (i13 == 0) {
            r.b(obj);
            e eVar = this.e;
            b42.c cVar = eVar.f16480r;
            m11.b bVar = this.f16493f;
            String str = bVar.f52899a;
            String str2 = bVar.f52900b;
            Iterable<m11.b> iterable = (Iterable) eVar.f16475m.getValue();
            ArrayList arrayList = new ArrayList(u.o(iterable, 10));
            for (m11.b bVar2 : iterable) {
                arrayList.add(bVar2.f52900b);
            }
            b.d dVar = new b.d(str, str2, arrayList);
            this.d = 1;
            if (cVar.b(dVar, this) == aVar) {
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
