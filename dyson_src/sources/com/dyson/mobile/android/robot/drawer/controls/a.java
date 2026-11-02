package com.dyson.mobile.android.robot.drawer.controls;

import a51.h;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableInt;
import androidx.viewpager.widget.ViewPager;
import com.dyson.mobile.android.robot.cloud.model.PersistentMapMetadata;
import com.dyson.mobile.android.robot.cloud.model.ZoneProperties;
import com.dyson.mobile.android.robot.cloud.model.ZonesDefinition;
import com.dyson.mobile.android.robot.drawer.controls.MapItem;
import d22.p;
import dv0.d;
import dv0.e;
import dv0.i;
import dv0.k;
import dv0.l;
import h12.f0;
import h12.y;
import i12.c0;
import i12.k0;
import i12.p0;
import i12.u;
import iu0.a0;
import iu0.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import ju0.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mz1.j;
import q62.n;
import y9.w;
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0012\u0013\u0014B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/dyson/mobile/android/robot/drawer/controls/a;", "", "Low0/d;", "mapLoader", "Lpf0/c;", "localisationManager", "Lcv0/b;", "cleanSettingsProvider", "Ldv0/d;", "cleanModeInformationViewModel", "Liu0/r;", "robotCapabilitiesSupport", "La51/h;", "recommendedCleansRepository", "Liu0/a0;", "robotDataStore", "<init>", "(Low0/d;Lpf0/c;Lcv0/b;Ldv0/d;Liu0/r;La51/h;Liu0/a0;)V", "a", "c", "b", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: q  reason: collision with root package name */
    public static final /* synthetic */ int f16003q = 0;

    /* renamed from: a  reason: collision with root package name */
    public final ow0.d f16004a;

    /* renamed from: b  reason: collision with root package name */
    public final pf0.c f16005b;

    /* renamed from: c  reason: collision with root package name */
    public final cv0.b f16006c;
    public final dv0.d d;
    public final r e;

    /* renamed from: f  reason: collision with root package name */
    public final h f16007f;

    /* renamed from: g  reason: collision with root package name */
    public final a0 f16008g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f16009h;

    /* renamed from: i  reason: collision with root package name */
    public final ObservableInt f16010i;

    /* renamed from: j  reason: collision with root package name */
    public final ObservableInt f16011j;

    /* renamed from: k  reason: collision with root package name */
    public final ObservableBoolean f16012k;

    /* renamed from: l  reason: collision with root package name */
    public dv0.c f16013l;

    /* renamed from: m  reason: collision with root package name */
    public C0549a f16014m;

    /* renamed from: n  reason: collision with root package name */
    public j f16015n;

    /* renamed from: o  reason: collision with root package name */
    public boolean f16016o;

    /* renamed from: p  reason: collision with root package name */
    public final d f16017p;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/robot/drawer/controls/a$c;", "", "", "", "zonedMaps", "unzonedMaps", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final List<String> f16028a;

        /* renamed from: b  reason: collision with root package name */
        public final List<String> f16029b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f16030c;

        public c(List<String> list, List<String> list2) {
            list.getClass();
            list2.getClass();
            this.f16028a = list;
            this.f16029b = list2;
            this.f16030c = list.isEmpty() && list2.isEmpty();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return this.f16028a.equals(cVar.f16028a) && this.f16029b.equals(cVar.f16029b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f16029b.hashCode() + (this.f16028a.hashCode() * 31);
        }

        public final String toString() {
            return "MapIds(zonedMaps=" + this.f16028a + ", unzonedMaps=" + this.f16029b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/robot/drawer/controls/a$d", "Landroidx/viewpager/widget/ViewPager$l;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d extends ViewPager.l {
        public d() {
        }

        @Override // androidx.viewpager.widget.ViewPager.l, androidx.viewpager.widget.ViewPager.j
        public final void c(int i13) {
            a aVar = a.this;
            if (i13 != aVar.f16011j.d) {
                aVar.j(i13);
            }
        }
    }

    static {
        new b(null);
    }

    public a(ow0.d dVar, pf0.c cVar, cv0.b bVar, dv0.d dVar2, r rVar, h hVar, a0 a0Var) {
        dVar.getClass();
        cVar.getClass();
        bVar.getClass();
        dVar2.getClass();
        rVar.getClass();
        hVar.getClass();
        a0Var.getClass();
        this.f16004a = dVar;
        this.f16005b = cVar;
        this.f16006c = bVar;
        this.d = dVar2;
        this.e = rVar;
        this.f16007f = hVar;
        this.f16008g = a0Var;
        ObservableInt observableInt = new ObservableInt(4);
        this.f16010i = observableInt;
        this.f16011j = new ObservableInt(-1);
        this.f16012k = new ObservableBoolean(true);
        this.f16014m = new C0549a(false, false, false, null, null, null, 63, null);
        if (rVar.d()) {
            observableInt.l(0);
        }
        this.f16017p = new d();
    }

    public static int f(dv0.c cVar) {
        int i13 = 0;
        for (e eVar : cVar.f25059l) {
            if (eVar.a() == ky0.a.GLOBAL) {
                return i13;
            }
            i13++;
        }
        return -1;
    }

    public static List g(Iterable iterable, List list, Function1 function1, Function1 function12, Function1 function13, Function2 function2) {
        Object invoke;
        int b13 = p0.b(u.o(list, 10));
        if (b13 < 16) {
            b13 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(b13);
        for (Object obj : list) {
            linkedHashMap.put(function12.invoke(obj), obj);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : iterable) {
            Object obj3 = linkedHashMap.get(function1.invoke(obj2));
            if (obj3 == null || (invoke = function2.invoke(obj2, obj3)) == null) {
                invoke = function13.invoke(obj2);
            }
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        return c0.A0(arrayList);
    }

    public final void a(String str) {
        dv0.c cVar = this.f16013l;
        if (cVar != null) {
            Iterator<? extends e> it = cVar.f25059l.iterator();
            int i13 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i13 = -1;
                    break;
                } else if (x12.r.c(it.next().c(), str)) {
                    break;
                } else {
                    i13++;
                }
            }
            Integer valueOf = Integer.valueOf(i13);
            if (i13 == -1) {
                valueOf = null;
            }
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                j(intValue);
                if (this.f16009h) {
                    return;
                }
                c(intValue);
            }
        }
    }

    public final void b(C0549a c0549a) {
        if (c0549a.f16026k) {
            dv0.c cVar = this.f16013l;
            if (cVar != null) {
                j(f(cVar));
            }
            d();
        } else if (c0549a.f16024i) {
            dv0.c cVar2 = this.f16013l;
            if (cVar2 != null) {
                int f13 = f(cVar2);
                j(f13);
                if (this.f16009h) {
                    return;
                }
                c(f13);
            }
        } else if (c0549a.f16025j) {
            a(c0549a.e);
        } else if (c0549a.f16027l) {
            if (!c0549a.f16022g) {
                a0 a0Var = this.f16008g;
                if (!a0Var.f42654a.getBoolean("IS_CLEAN_HISTORY_AVAILABLE_".concat(a0Var.f42655b.d), false)) {
                    dv0.c cVar3 = this.f16013l;
                    if (cVar3 != null) {
                        j(f(cVar3));
                    }
                    d();
                }
            }
            j(0);
            d();
        }
    }

    public final void c(int i13) {
        dv0.c cVar = this.f16013l;
        if (cVar != null) {
            Iterator<Integer> it = p.n(0, cVar.f25059l.size()).iterator();
            while (it.hasNext()) {
                int nextInt = ((k0) it).nextInt();
                cVar.f25059l.get(nextInt).f25067b.m(nextInt == i13);
            }
        }
        this.f16012k.m(false);
    }

    public final void d() {
        dv0.c cVar = this.f16013l;
        if (cVar != null) {
            for (e eVar : cVar.f25059l) {
                eVar.f25067b.m(true);
            }
        }
        this.f16012k.m(true);
    }

    public final String e(PersistentMapMetadata persistentMapMetadata) {
        String j8 = persistentMapMetadata.j();
        if (j8 == null) {
            boolean isEmpty = persistentMapMetadata.l().isEmpty();
            pf0.c cVar = this.f16005b;
            return isEmpty ? cVar.d(rf0.j.f71978f2) : cVar.d(rf0.j.f71973e2);
        }
        return j8;
    }

    public final void h(dv0.c cVar, List<PersistentMapMetadata> list) {
        ZonesDefinition.ZonesBehaviours j8;
        String d13;
        ArrayList arrayList = new ArrayList();
        boolean isEmpty = list.isEmpty();
        int i13 = 10;
        pf0.c cVar2 = this.f16005b;
        if (!isEmpty || this.f16009h) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (((PersistentMapMetadata) obj).n()) {
                    arrayList2.add(obj);
                }
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                PersistentMapMetadata persistentMapMetadata = (PersistentMapMetadata) it.next();
                String e = e(persistentMapMetadata);
                List<PersistentMapMetadata.ZoneMetadata> l13 = persistentMapMetadata.l();
                ArrayList arrayList3 = new ArrayList(u.o(l13, i13));
                for (PersistentMapMetadata.ZoneMetadata zoneMetadata : l13) {
                    String l14 = zoneMetadata.l();
                    String m13 = zoneMetadata.m();
                    String k13 = zoneMetadata.k();
                    ZoneProperties k14 = persistentMapMetadata.k(zoneMetadata.l());
                    arrayList3.add(new MapItem.Zone(l14, m13, k13, (k14 == null || (j8 = k14.j()) == null) ? null : this.e.a() ? j8.i().getStateValue() : String.valueOf(j8.j()), zoneMetadata.i(), zoneMetadata.j()));
                }
                String i14 = persistentMapMetadata.i();
                String e13 = e(persistentMapMetadata);
                String m14 = persistentMapMetadata.m();
                if (m14 == null) {
                    n.n("zonesDefinitionLastUpdatedDate is undefined for persistent map: ", persistentMapMetadata.i(), null);
                    m14 = "";
                }
                arrayList.add(new l(e, new MapItem(i14, e13, m14, arrayList3)));
                i13 = 10;
            }
            List<PersistentMapMetadata> list2 = !this.f16009h ? list : null;
            if (list2 != null) {
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : list2) {
                    if (!((PersistentMapMetadata) obj2).n()) {
                        arrayList4.add(obj2);
                    }
                }
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    PersistentMapMetadata persistentMapMetadata2 = (PersistentMapMetadata) it2.next();
                    arrayList.add(new k(e(persistentMapMetadata2), persistentMapMetadata2.i()));
                }
            }
        } else {
            arrayList.add(new dv0.j(cVar2.d(rf0.j.f71998j2)));
        }
        if (this.f16009h) {
            d13 = cVar2.d(rf0.j.N);
            break;
        }
        if (!list.isEmpty()) {
            for (PersistentMapMetadata persistentMapMetadata3 : list) {
                if (persistentMapMetadata3.n()) {
                    d13 = cVar2.d(rf0.j.N);
                    break;
                }
            }
        }
        d13 = cVar2.d(rf0.j.f71993i2);
        arrayList.add(new i(d13));
        cVar.getClass();
        cVar.f25059l = arrayList;
        cVar.k();
        if (this.f16016o) {
            i(ky0.a.GLOBAL);
            this.f16016o = false;
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj3 : list) {
            if (((PersistentMapMetadata) obj3).n()) {
                arrayList5.add(obj3);
            }
        }
        ArrayList arrayList6 = new ArrayList(u.o(arrayList5, 10));
        Iterator it3 = arrayList5.iterator();
        while (it3.hasNext()) {
            arrayList6.add(((PersistentMapMetadata) it3.next()).i());
        }
        ArrayList arrayList7 = new ArrayList();
        for (Object obj4 : list) {
            if (!((PersistentMapMetadata) obj4).n()) {
                arrayList7.add(obj4);
            }
        }
        ArrayList arrayList8 = new ArrayList(u.o(arrayList7, 10));
        Iterator it4 = arrayList7.iterator();
        while (it4.hasNext()) {
            arrayList8.add(((PersistentMapMetadata) it4.next()).i());
        }
        C0549a a13 = C0549a.a(this.f16014m, false, null, null, new c(arrayList6, arrayList8), 30);
        if (a13.f16019b) {
            b(a13);
        }
        this.f16014m = a13;
    }

    public final void i(ky0.a aVar) {
        aVar.getClass();
        int i13 = 0;
        if (aVar != ky0.a.GLOBAL) {
            j(0);
            return;
        }
        dv0.c cVar = this.f16013l;
        if (cVar != null) {
            if (cVar.f25059l.isEmpty()) {
                this.f16016o = true;
                return;
            }
            Iterator<? extends e> it = cVar.f25059l.iterator();
            while (true) {
                if (!it.hasNext()) {
                    i13 = -1;
                    break;
                } else if (it.next().a() == ky0.a.GLOBAL) {
                    break;
                } else {
                    i13++;
                }
            }
            j(i13);
        }
    }

    public final void j(int i13) {
        cv0.b bVar = this.f16006c;
        LinkedHashMap linkedHashMap = bVar.f22249b;
        ArrayList arrayList = bVar.f22248a;
        dv0.c cVar = this.f16013l;
        ObservableInt observableInt = this.f16011j;
        f fVar = null;
        e eVar = cVar != null ? (e) c0.Q(observableInt.d, cVar.f25059l) : null;
        dv0.c cVar2 = this.f16013l;
        e eVar2 = cVar2 != null ? (e) c0.Q(i13, cVar2.f25059l) : null;
        observableInt.l(i13);
        if (eVar2 != null) {
            e eVar3 = !eVar2.equals(eVar) ? eVar2 : null;
            if (eVar3 != null) {
                ky0.a a13 = eVar3.a();
                if (a13 != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        cv0.a aVar = (cv0.a) it.next();
                        aVar.getClass();
                        aVar.o(a13);
                        f0 f0Var = f0.f36844a;
                    }
                }
                String c13 = eVar2.c();
                if (c13 != null) {
                    if (!eVar2.e()) {
                        c13 = null;
                    }
                    if (c13 != null) {
                        fVar = (f) linkedHashMap.get(c13);
                    }
                }
                if (fVar != null) {
                    linkedHashMap.put(fVar.f45735a, fVar);
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    cv0.a aVar2 = (cv0.a) it2.next();
                    aVar2.getClass();
                    aVar2.d(fVar);
                    f0 f0Var2 = f0.f36844a;
                }
                dv0.h b13 = eVar3.b();
                b13.getClass();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    cv0.a aVar3 = (cv0.a) it3.next();
                    aVar3.getClass();
                    aVar3.i(b13);
                    f0 f0Var3 = f0.f36844a;
                }
                ky0.a a14 = eVar3.a();
                String c14 = eVar3.c();
                int i14 = a14 == null ? -1 : d.a.f25065a[a14.ordinal()];
                dv0.d dVar = this.d;
                ObservableInt observableInt2 = dVar.f25064c;
                if (i14 == 1) {
                    observableInt2.l(0);
                } else {
                    observableInt2.l(4);
                }
                ev0.d dVar2 = dVar.f25062a;
                dVar2.f28464m = c14;
                dVar2.c();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/robot/drawer/controls/a$b;", "", "<init>", "()V", "", "FIRST_TAB_INDEX", "I", "NO_SELECTION", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/dyson/mobile/android/robot/drawer/controls/a$a;", "", "", "mapsLoaded", "robotStateReceived", "isCleaning", "Lky0/a;", "cleaningMode", "", "discoveredMapId", "Lcom/dyson/mobile/android/robot/drawer/controls/a$c;", "mapIds", "<init>", "(ZZZLky0/a;Ljava/lang/String;Lcom/dyson/mobile/android/robot/drawer/controls/a$c;)V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.robot.drawer.controls.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0549a {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f16018a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f16019b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f16020c;
        public final ky0.a d;
        public final String e;

        /* renamed from: f  reason: collision with root package name */
        public final c f16021f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f16022g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f16023h;

        /* renamed from: i  reason: collision with root package name */
        public final boolean f16024i;

        /* renamed from: j  reason: collision with root package name */
        public final boolean f16025j;

        /* renamed from: k  reason: collision with root package name */
        public final boolean f16026k;

        /* renamed from: l  reason: collision with root package name */
        public final boolean f16027l;

        public C0549a(boolean z13, boolean z14, boolean z15, ky0.a aVar, String str, c cVar) {
            str.getClass();
            cVar.getClass();
            this.f16018a = z13;
            this.f16019b = z14;
            this.f16020c = z15;
            this.d = aVar;
            this.e = str;
            this.f16021f = cVar;
            boolean z16 = cVar.f16030c;
            this.f16022g = !z16;
            boolean z17 = false;
            boolean z18 = z15 && aVar == ky0.a.ZONE_CONFIGURED;
            this.f16023h = z18;
            this.f16024i = z15 && (aVar == ky0.a.GLOBAL || cVar.f16029b.contains(str) || z16);
            this.f16025j = z18 && cVar.f16028a.contains(str);
            if (z18 && str.length() == 0 && !z16) {
                z17 = true;
            }
            this.f16026k = z17;
            this.f16027l = !z15;
        }

        public static C0549a a(C0549a c0549a, boolean z13, ky0.a aVar, String str, c cVar, int i13) {
            boolean z14 = (i13 & 1) != 0 ? c0549a.f16018a : true;
            boolean z15 = (i13 & 2) != 0 ? c0549a.f16019b : true;
            if ((i13 & 4) != 0) {
                z13 = c0549a.f16020c;
            }
            boolean z16 = z13;
            if ((i13 & 8) != 0) {
                aVar = c0549a.d;
            }
            ky0.a aVar2 = aVar;
            if ((i13 & 16) != 0) {
                str = c0549a.e;
            }
            String str2 = str;
            if ((i13 & 32) != 0) {
                cVar = c0549a.f16021f;
            }
            c cVar2 = cVar;
            c0549a.getClass();
            str2.getClass();
            cVar2.getClass();
            return new C0549a(z14, z15, z16, aVar2, str2, cVar2);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0549a) {
                C0549a c0549a = (C0549a) obj;
                return this.f16018a == c0549a.f16018a && this.f16019b == c0549a.f16019b && this.f16020c == c0549a.f16020c && this.d == c0549a.d && x12.r.c(this.e, c0549a.e) && x12.r.c(this.f16021f, c0549a.f16021f);
            }
            return false;
        }

        public final int hashCode() {
            int c13 = w.c(w.c(Boolean.hashCode(this.f16018a) * 31, 31, this.f16019b), 31, this.f16020c);
            ky0.a aVar = this.d;
            return this.f16021f.hashCode() + y.c((c13 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.e);
        }

        public final String toString() {
            StringBuilder i13 = x1.i.i("CleanModeState(mapsLoaded=", ", robotStateReceived=", ", isCleaning=", this.f16018a, this.f16019b);
            i13.append(this.f16020c);
            i13.append(", cleaningMode=");
            i13.append(this.d);
            i13.append(", discoveredMapId=");
            i13.append(this.e);
            i13.append(", mapIds=");
            i13.append(this.f16021f);
            i13.append(")");
            return i13.toString();
        }

        public C0549a() {
            this(false, false, false, null, null, null, 63, null);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public C0549a(boolean r2, boolean r3, boolean r4, ky0.a r5, java.lang.String r6, com.dyson.mobile.android.robot.drawer.controls.a.c r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
            /*
                r1 = this;
                r9 = r8 & 1
                r0 = 0
                if (r9 == 0) goto L6
                r2 = r0
            L6:
                r9 = r8 & 2
                if (r9 == 0) goto Lb
                r3 = r0
            Lb:
                r9 = r8 & 4
                if (r9 == 0) goto L10
                r4 = r0
            L10:
                r9 = r8 & 8
                if (r9 == 0) goto L15
                r5 = 0
            L15:
                r9 = r8 & 16
                if (r9 == 0) goto L1b
                java.lang.String r6 = ""
            L1b:
                r8 = r8 & 32
                if (r8 == 0) goto L26
                com.dyson.mobile.android.robot.drawer.controls.a$c r7 = new com.dyson.mobile.android.robot.drawer.controls.a$c
                i12.e0 r8 = i12.e0.d
                r7.<init>(r8, r8)
            L26:
                r1.<init>(r2, r3, r4, r5, r6, r7)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.robot.drawer.controls.a.C0549a.<init>(boolean, boolean, boolean, ky0.a, java.lang.String, com.dyson.mobile.android.robot.drawer.controls.a$c, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }
    }
}
