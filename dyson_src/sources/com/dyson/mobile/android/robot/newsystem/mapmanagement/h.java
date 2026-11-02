package com.dyson.mobile.android.robot.newsystem.mapmanagement;

import com.dyson.mobile.android.robot.newsystem.mapmanagement.MapManagementApiError;
import h12.f0;
import h12.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import nl0.h;
import y01.k;
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lnl0/h;", "", "Lvu0/a;", "mapMetadata", "Ly01/k;", "persistentMap", "Lm11/d;", "<anonymous>", "(Lnl0/h;Lnl0/h;)Lnl0/h;"}, k = 3, mv = {2, 3, 0})
@n12.e(c = "com.dyson.mobile.android.robot.newsystem.mapmanagement.RobotMapManagementViewModel$observeMapStates$2", f = "RobotMapManagementViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class h extends n12.i implements Function3<nl0.h<? extends List<? extends vu0.a>>, nl0.h<? extends k>, l12.d<? super nl0.h<? extends m11.d>>, Object> {
    public /* synthetic */ nl0.h d;
    public /* synthetic */ nl0.h e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ e f16492f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(e eVar, l12.d<? super h> dVar) {
        super(3, dVar);
        this.f16492f = eVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(nl0.h<? extends List<? extends vu0.a>> hVar, nl0.h<? extends k> hVar2, l12.d<? super nl0.h<? extends m11.d>> dVar) {
        h hVar3 = new h(this.f16492f, dVar);
        hVar3.d = hVar;
        hVar3.e = hVar2;
        return hVar3.invokeSuspend(f0.f36844a);
    }

    @Override // n12.a
    public final Object invokeSuspend(Object obj) {
        nl0.h hVar = this.d;
        nl0.h hVar2 = this.e;
        m12.a aVar = m12.a.COROUTINE_SUSPENDED;
        r.b(obj);
        if ((hVar instanceof h.a) || (hVar2 instanceof h.a)) {
            return new h.a(new MapManagementApiError.GetMapApiError());
        }
        if ((hVar instanceof h.c) && (hVar2 instanceof h.c)) {
            e eVar = this.f16492f;
            e.S(eVar, (List) ((h.c) hVar).f57898a);
            return new h.c(new m11.d((List) eVar.f16475m.getValue(), (k) ((h.c) hVar2).f57898a));
        }
        return null;
    }
}
