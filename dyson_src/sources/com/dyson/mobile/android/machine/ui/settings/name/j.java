package com.dyson.mobile.android.machine.ui.settings.name;

import androidx.lifecycle.LifecycleOwner;
import com.dyson.mobile.android.machine.ui.settings.name.MachineNamingExtras;
import com.dyson.mobile.android.machinetype.MachineCategory;
import com.dyson.mobile.android.machinetype.MachineDefinition;
import com.dyson.mobile.android.machinetype.MachineSerial;
import com.dyson.mobile.android.machinetype.MachineType;
import com.dyson.mobile.android.resources.viewmodel.name.NamingConfig;
import gu0.e;
import h12.f0;
import kotlin.Metadata;
import rf0.g0;
import rf0.i0;
import v32.y;
import vk0.n;
import x12.p;
import x12.r;
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B;\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/settings/name/j;", "Lgu0/e;", "Lcom/dyson/mobile/android/machine/ui/settings/name/MachineNamingExtras;", "Lpm0/k;", "Lgu0/d;", "Lvk0/n;", "machineTaskFactory", "Lkz/b;", "connectedHomeManager", "Lpf0/c;", "localisationManager", "Lbk0/f;", "machineRepository", "Lhl0/b;", "machineNameChangeController", "Ljl0/c;", "machineAutoUpdateController", "<init>", "(Lvk0/n;Lkz/b;Lpf0/c;Lbk0/f;Lhl0/b;Ljl0/c;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j extends gu0.e<MachineNamingExtras> implements pm0.k<gu0.d> {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f15473w = 0;

    /* renamed from: n  reason: collision with root package name */
    public final n f15474n;

    /* renamed from: o  reason: collision with root package name */
    public final kz.b f15475o;

    /* renamed from: p  reason: collision with root package name */
    public final pf0.c f15476p;

    /* renamed from: q  reason: collision with root package name */
    public final bk0.f f15477q;

    /* renamed from: r  reason: collision with root package name */
    public final hl0.b f15478r;

    /* renamed from: s  reason: collision with root package name */
    public final jl0.c f15479s;

    /* renamed from: t  reason: collision with root package name */
    public mz1.f f15480t;

    /* renamed from: u  reason: collision with root package name */
    public MachineCategory f15481u;

    /* renamed from: v  reason: collision with root package name */
    public String f15482v;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class a extends p implements w12.a<f0> {
        public a(Object obj) {
            super(0, obj, j.class, "onCustomNameEditClicked", "onCustomNameEditClicked()V", 0);
        }

        @Override // w12.a
        public final f0 invoke() {
            String str;
            j jVar = (j) this.receiver;
            int i13 = j.f15473w;
            gu0.d b13 = jVar.b();
            if (b13 != null) {
                if (jVar.h(jVar.m())) {
                    str = jVar.m();
                } else {
                    str = jVar.f15482v;
                    if (str == null) {
                        r.i("productName");
                        throw null;
                    }
                }
                b13.n(str);
            }
            return f0.f36844a;
        }
    }

    public j(n nVar, kz.b bVar, pf0.c cVar, bk0.f fVar, hl0.b bVar2, jl0.c cVar2) {
        nVar.getClass();
        bVar.getClass();
        cVar.getClass();
        fVar.getClass();
        this.f15474n = nVar;
        this.f15475o = bVar;
        this.f15476p = cVar;
        this.f15477q = fVar;
        this.f15478r = bVar2;
        this.f15479s = cVar2;
    }

    @Override // pm0.k
    public final n a() {
        return this.f15474n;
    }

    @Override // pm0.k
    public final kz.b d() {
        return this.f15475o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // gu0.e
    public final void i() {
        NamingConfig<ConfigExtras> namingConfig = this.f36330l;
        if (namingConfig == 0) {
            r.i("config");
            throw null;
        } else if (namingConfig.f15910f instanceof MachineNamingExtras.PersistName) {
            n();
        } else {
            gu0.d b13 = b();
            if (b13 != null) {
                b13.h(this.f36328j);
            }
        }
    }

    @Override // gu0.e
    public final void j(NamingConfig<MachineNamingExtras> namingConfig) {
        String d;
        String str;
        MachineNamingExtras machineNamingExtras = namingConfig.f15910f;
        super.j(namingConfig);
        hl0.b bVar = this.f15478r;
        if (bVar != null) {
            String e = bVar.e();
            if (e == null) {
                e = "";
            }
            this.f36327i = e;
        }
        MachineType.a aVar = MachineType.Companion;
        MachineNamingExtras machineNamingExtras2 = machineNamingExtras;
        String l13 = machineNamingExtras2.l();
        aVar.getClass();
        MachineType.a.a(l13);
        machineNamingExtras2.getClass();
        this.f15481u = machineNamingExtras2.j();
        MachineDefinition c13 = this.f15477q.c(new MachineSerial(machineNamingExtras2.k()));
        pf0.c cVar = this.f15476p;
        this.f15482v = c13 != null ? c13.f15565m : cVar.d(i0.H2);
        l(this.f36327i);
        this.f36325g = this.f15475o.b(this.f36327i);
        MachineCategory machineCategory = this.f15481u;
        if (machineCategory == null) {
            r.i("machineCategory");
            throw null;
        }
        if (machineCategory == MachineCategory.ROBOT) {
            this.f36324f = e.b.BEFORE;
            d = cVar.d(g0.f71496q2);
        } else {
            this.f36324f = e.b.AFTER;
            d = cVar.d(i0.C8);
        }
        gu0.b bVar2 = new gu0.b(new oc0.c(this, 26));
        e.b bVar3 = this.f36324f;
        a aVar2 = new a(this);
        if (h(m())) {
            str = m();
        } else {
            String str2 = this.f15482v;
            if (str2 == null) {
                r.i("productName");
                throw null;
            }
            str = str2;
        }
        str.getClass();
        bVar2.f36309b = bVar3;
        bVar2.f36310c = aVar2;
        bVar2.e(str);
        bVar2.d = d;
        bVar2.d(this.f36325g);
        bVar2.f(f());
        this.f36326h = bVar2;
    }

    @Override // gu0.e
    public final void k(String str) {
        this.f36329k = str;
    }

    public final String m() {
        if (y.A(this.f36329k) || !h(this.f36329k)) {
            if (y.A(this.f36327i) || !h(this.f36327i)) {
                String str = this.f15482v;
                if (str != null) {
                    return str;
                }
                r.i("productName");
                throw null;
            }
            return this.f36327i;
        }
        return this.f36329k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n() {
        jl0.c cVar = this.f15479s;
        Boolean a13 = cVar != null ? cVar.a() : null;
        NamingConfig<ConfigExtras> namingConfig = this.f36330l;
        if (namingConfig == 0) {
            r.i("config");
            throw null;
        }
        Extras extras = namingConfig.f15910f;
        extras.getClass();
        MachineNamingExtras.PersistName persistName = (MachineNamingExtras.PersistName) extras;
        this.f15480t = c(this.f36327i, this.f36328j, persistName.f15426h, a13 != null ? a13.booleanValue() : persistName.f15429k);
    }

    @Override // m9.c
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        mz1.f fVar = this.f15480t;
        if (fVar != null) {
            if (fVar.b()) {
                fVar = null;
            }
            if (fVar != null) {
                jz1.d.dispose(fVar);
            }
        }
    }
}
