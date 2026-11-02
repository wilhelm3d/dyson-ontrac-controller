package com.dyson.mobile.android.machine.ui.settings.name;

import android.text.Editable;
import androidx.lifecycle.LifecycleOwner;
import com.dyson.mobile.android.localisation.LocalisationKey;
import com.dyson.mobile.android.machine.ui.settings.name.MachineNamingExtras;
import com.dyson.mobile.android.machinetype.MachineCategory;
import com.dyson.mobile.android.resources.viewmodel.name.NamingConfig;
import fm1.o0;
import i12.c0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import rf0.g0;
import rf0.i0;
import rf0.q;
import v32.y;
import vk0.n;
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u00032\u00020\u0005B5\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/settings/name/h;", "Lgu0/a;", "Lcom/dyson/mobile/android/machine/ui/settings/name/MachineNamingExtras;", "Lpm0/k;", "Lgu0/f;", "Lm9/c;", "Lvk0/n;", "machineTaskFactory", "Lkz/b;", "connectedHomeManager", "Lhl0/b;", "machineNameChangeController", "Ljl0/c;", "machineAutoUpdateController", "Lpm0/a;", "bluetoothAliasManager", "<init>", "(Lvk0/n;Lkz/b;Lhl0/b;Ljl0/c;Lpm0/a;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h extends gu0.a<MachineNamingExtras> implements pm0.k<gu0.f>, m9.c {

    /* renamed from: u  reason: collision with root package name */
    public static final /* synthetic */ int f15462u = 0;

    /* renamed from: o  reason: collision with root package name */
    public final n f15463o;

    /* renamed from: p  reason: collision with root package name */
    public final kz.b f15464p;

    /* renamed from: q  reason: collision with root package name */
    public final hl0.b f15465q;

    /* renamed from: r  reason: collision with root package name */
    public final jl0.c f15466r;

    /* renamed from: s  reason: collision with root package name */
    public final pm0.a f15467s;

    /* renamed from: t  reason: collision with root package name */
    public mz1.f f15468t;

    /* loaded from: classes3.dex */
    public static final /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f15469a;

        static {
            int[] iArr = new int[MachineCategory.values().length];
            try {
                iArr[MachineCategory.ROBOT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MachineCategory.WEARABLE_EC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MachineCategory.EC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MachineCategory.LIGHTING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f15469a = iArr;
        }
    }

    public h(n nVar, kz.b bVar, hl0.b bVar2, jl0.c cVar, pm0.a aVar) {
        nVar.getClass();
        bVar.getClass();
        this.f15463o = nVar;
        this.f15464p = bVar;
        this.f15465q = bVar2;
        this.f15466r = cVar;
        this.f15467s = aVar;
    }

    @Override // pm0.k
    public final n a() {
        return this.f15463o;
    }

    @Override // pm0.k
    public final kz.b d() {
        return this.f15464p;
    }

    @Override // gu0.a
    public final void e(Editable editable) {
        editable.getClass();
        super.e(editable);
        this.f36300g.m(h());
    }

    @Override // gu0.a
    public final void i() {
        if (f().f15910f instanceof MachineNamingExtras.PersistName) {
            l();
        } else {
            String str = this.f36304k;
            if (y.A(str)) {
                str = null;
            }
            if (str == null) {
                str = this.f36303j;
            }
            gu0.f b13 = b();
            if (b13 != null) {
                b13.h(str);
            }
        }
        pm0.a aVar = this.f15467s;
        if (aVar != null) {
            aVar.c(this.f36304k);
        }
    }

    @Override // gu0.a
    public final void j(NamingConfig<MachineNamingExtras> namingConfig) {
        super.j(namingConfig);
        hl0.b bVar = this.f15465q;
        if (bVar != null) {
            String e = bVar.e();
            if (e == null) {
                e = "";
            }
            this.f36303j = e;
            k(e);
        }
        MachineCategory j8 = namingConfig.f15910f.j();
        Function1[] function1Arr = {new Function1(this) { // from class: pm0.j
            public final /* synthetic */ com.dyson.mobile.android.machine.ui.settings.name.h e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i13 = r2;
                com.dyson.mobile.android.machine.ui.settings.name.h hVar = this.e;
                String str = (String) obj;
                switch (i13) {
                    case 0:
                        int i14 = com.dyson.mobile.android.machine.ui.settings.name.h.f15462u;
                        str.getClass();
                        kz.b bVar2 = hVar.f15464p;
                        String str2 = hVar.f36303j;
                        bVar2.getClass();
                        ArrayList arrayList = bVar2.f50197c;
                        if (str2 != null) {
                            arrayList = c0.d0(arrayList, str2);
                        }
                        if (o0.m(str, arrayList)) {
                            return i0.E4;
                        }
                        return null;
                    case 1:
                        int i15 = com.dyson.mobile.android.machine.ui.settings.name.h.f15462u;
                        str.getClass();
                        hVar.f15464p.getClass();
                        if (kz.b.a(str)) {
                            return i0.F4;
                        }
                        return null;
                    default:
                        int i16 = com.dyson.mobile.android.machine.ui.settings.name.h.f15462u;
                        str.getClass();
                        if (o0.m(str, hVar.f15464p.b(hVar.f36303j))) {
                            return i0.E4;
                        }
                        return null;
                }
            }
        }, new Function1(this) { // from class: pm0.j
            public final /* synthetic */ com.dyson.mobile.android.machine.ui.settings.name.h e;

            {
                this.e = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i13 = r2;
                com.dyson.mobile.android.machine.ui.settings.name.h hVar = this.e;
                String str = (String) obj;
                switch (i13) {
                    case 0:
                        int i14 = com.dyson.mobile.android.machine.ui.settings.name.h.f15462u;
                        str.getClass();
                        kz.b bVar2 = hVar.f15464p;
                        String str2 = hVar.f36303j;
                        bVar2.getClass();
                        ArrayList arrayList = bVar2.f50197c;
                        if (str2 != null) {
                            arrayList = c0.d0(arrayList, str2);
                        }
                        if (o0.m(str, arrayList)) {
                            return i0.E4;
                        }
                        return null;
                    case 1:
                        int i15 = com.dyson.mobile.android.machine.ui.settings.name.h.f15462u;
                        str.getClass();
                        hVar.f15464p.getClass();
                        if (kz.b.a(str)) {
                            return i0.F4;
                        }
                        return null;
                    default:
                        int i16 = com.dyson.mobile.android.machine.ui.settings.name.h.f15462u;
                        str.getClass();
                        if (o0.m(str, hVar.f15464p.b(hVar.f36303j))) {
                            return i0.E4;
                        }
                        return null;
                }
            }
        }};
        ArrayList arrayList = this.d;
        i12.y.t(arrayList, function1Arr);
        int i13 = a.f15469a[j8.ordinal()];
        q8.n<LocalisationKey> nVar = this.e;
        if (i13 == 1) {
            nVar.m(g0.f71504s2);
        } else if (i13 == 2) {
            nVar.m(q.C0);
        } else if (i13 == 3 || i13 == 4) {
            this.f36299f.m(rf0.f.M0);
            nVar.m(rf0.f.N0);
            i12.y.t(arrayList, new Function1[]{new Function1(this) { // from class: pm0.j
                public final /* synthetic */ com.dyson.mobile.android.machine.ui.settings.name.h e;

                {
                    this.e = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    int i132 = r2;
                    com.dyson.mobile.android.machine.ui.settings.name.h hVar = this.e;
                    String str = (String) obj;
                    switch (i132) {
                        case 0:
                            int i14 = com.dyson.mobile.android.machine.ui.settings.name.h.f15462u;
                            str.getClass();
                            kz.b bVar2 = hVar.f15464p;
                            String str2 = hVar.f36303j;
                            bVar2.getClass();
                            ArrayList arrayList2 = bVar2.f50197c;
                            if (str2 != null) {
                                arrayList2 = c0.d0(arrayList2, str2);
                            }
                            if (o0.m(str, arrayList2)) {
                                return i0.E4;
                            }
                            return null;
                        case 1:
                            int i15 = com.dyson.mobile.android.machine.ui.settings.name.h.f15462u;
                            str.getClass();
                            hVar.f15464p.getClass();
                            if (kz.b.a(str)) {
                                return i0.F4;
                            }
                            return null;
                        default:
                            int i16 = com.dyson.mobile.android.machine.ui.settings.name.h.f15462u;
                            str.getClass();
                            if (o0.m(str, hVar.f15464p.b(hVar.f36303j))) {
                                return i0.E4;
                            }
                            return null;
                    }
                }
            }});
        }
    }

    public final void l() {
        jl0.c cVar = this.f15466r;
        Boolean a13 = cVar != null ? cVar.a() : null;
        MachineNamingExtras machineNamingExtras = f().f15910f;
        machineNamingExtras.getClass();
        MachineNamingExtras.PersistName persistName = (MachineNamingExtras.PersistName) machineNamingExtras;
        this.f15468t = c(this.f36303j, this.f36304k, persistName.f15426h, a13 != null ? a13.booleanValue() : persistName.f15429k);
    }

    @Override // m9.c
    public final void onDestroy(LifecycleOwner lifecycleOwner) {
        mz1.f fVar = this.f15468t;
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
