package bk;

import com.dyson.mobile.android.machinetype.MachineDefinition;
import hk.a5;
import hk.b2;
/* loaded from: classes2.dex */
public final class i implements xy1.d<h> {

    /* renamed from: a  reason: collision with root package name */
    public final xy1.i<MachineDefinition> f7888a;

    /* renamed from: b  reason: collision with root package name */
    public final xy1.i<pf0.c> f7889b;

    private i(xy1.i<MachineDefinition> iVar, xy1.i<pf0.c> iVar2) {
        this.f7888a = iVar;
        this.f7889b = iVar2;
    }

    public static i a(b2 b2Var, a5 a5Var) {
        return new i(a5Var, b2Var);
    }

    @Override // w02.a
    public final Object get() {
        return new h(this.f7888a.get(), this.f7889b.get());
    }
}
