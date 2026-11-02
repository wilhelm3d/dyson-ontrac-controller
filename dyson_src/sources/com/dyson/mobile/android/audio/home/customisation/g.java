package com.dyson.mobile.android.audio.home.customisation;

import c42.d2;
import c42.f2;
import c42.g2;
import c42.r1;
import c42.s1;
import com.dyson.mobile.android.audio.home.customisation.a;
import com.dyson.mobile.android.audio.home.customisation.k;
import com.dyson.mobile.android.audio.home.customisation.m;
import com.dyson.mobile.android.localisation.LocalisationKey;
import com.dyson.mobile.android.machinetype.MachineSerial;
import com.paypal.android.platform.authsdk.BR;
import gl.x;
import h12.f0;
import h12.p;
import h12.r;
import h12.t;
import hj.e;
import i12.c0;
import i12.q0;
import i12.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import lj.a;
import m9.u;
import m9.v;
import nj.y;
import w12.o;
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001cBk\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/dyson/mobile/android/audio/home/customisation/g;", "Lm9/u;", "Lvj/b;", "audioAllMachinesDataStore", "Lcom/dyson/mobile/android/audio/home/customisation/l;", "viewStateFactory", "Lcom/dyson/mobile/android/audio/home/customisation/b;", "accessoryOptionsStateFactory", "Lbk/l;", "repository", "Lhj/e;", "trackingManager", "Lgl/f;", "customisationAnalyticsFactory", "Lcom/dyson/mobile/android/machinetype/MachineSerial;", "machineSerial", "Lqo0/d;", "purchaseLinkRetriever", "Lbg0/a;", "machineAssetRepository", "Lag0/b;", "machineInfo", "Lqh/a;", "accountDataStore", "", "isOpenedFromOnboarding", "<init>", "(Lvj/b;Lcom/dyson/mobile/android/audio/home/customisation/l;Lcom/dyson/mobile/android/audio/home/customisation/b;Lbk/l;Lhj/e;Lgl/f;Lcom/dyson/mobile/android/machinetype/MachineSerial;Lqo0/d;Lbg0/a;Lag0/b;Lqh/a;Z)V", "a", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class g extends u {
    public final bk.l d;
    public final hj.e e;

    /* renamed from: f  reason: collision with root package name */
    public final gl.f f12485f;

    /* renamed from: g  reason: collision with root package name */
    public final MachineSerial f12486g;

    /* renamed from: h  reason: collision with root package name */
    public final qo0.d f12487h;

    /* renamed from: i  reason: collision with root package name */
    public final bg0.a f12488i;

    /* renamed from: j  reason: collision with root package name */
    public final ag0.b f12489j;

    /* renamed from: k  reason: collision with root package name */
    public final qh.a f12490k;

    /* renamed from: l  reason: collision with root package name */
    public final s1 f12491l;

    /* renamed from: m  reason: collision with root package name */
    public final f2 f12492m;

    /* renamed from: n  reason: collision with root package name */
    public final r1 f12493n;

    /* renamed from: o  reason: collision with root package name */
    public final r1 f12494o;

    /* renamed from: p  reason: collision with root package name */
    public final b42.c f12495p;

    /* renamed from: q  reason: collision with root package name */
    public final c42.e f12496q;

    /* renamed from: r  reason: collision with root package name */
    public final t f12497r;

    @wy1.a
    /* loaded from: classes2.dex */
    public interface a {
        g a(boolean z13);
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lbk/k;", "customisationOptions", "", "isSeparateSelectionOn", "", "", "finishUrlMap", "Lcom/dyson/mobile/android/audio/home/customisation/a;", "<anonymous>", "(Lbk/k;ZLjava/util/Map;)Lcom/dyson/mobile/android/audio/home/customisation/a;"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.audio.home.customisation.CustomisationViewModel$accessoryOptionsState$2", f = "CustomisationViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class b extends n12.i implements o<bk.k, Boolean, Map<String, ? extends String>, l12.d<? super com.dyson.mobile.android.audio.home.customisation.a>, Object> {
        public /* synthetic */ bk.k d;
        public /* synthetic */ boolean e;

        /* renamed from: f  reason: collision with root package name */
        public /* synthetic */ Map f12498f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ com.dyson.mobile.android.audio.home.customisation.b f12499g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.dyson.mobile.android.audio.home.customisation.b bVar, l12.d<? super b> dVar) {
            super(4, dVar);
            this.f12499g = bVar;
        }

        @Override // w12.o
        public final Object invoke(bk.k kVar, Boolean bool, Map<String, ? extends String> map, l12.d<? super com.dyson.mobile.android.audio.home.customisation.a> dVar) {
            boolean booleanValue = bool.booleanValue();
            b bVar = new b(this.f12499g, dVar);
            bVar.d = kVar;
            bVar.e = booleanValue;
            bVar.f12498f = map;
            return bVar.invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            bk.k kVar = this.d;
            boolean z13 = this.e;
            Map map = this.f12498f;
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            r.b(obj);
            com.dyson.mobile.android.audio.home.customisation.b bVar = this.f12499g;
            bVar.getClass();
            kVar.getClass();
            map.getClass();
            List<bk.b> b13 = kVar.b().b();
            ArrayList arrayList = new ArrayList();
            for (bk.b bVar2 : b13) {
                gl.i a13 = bVar.a(bVar2, true, z13, "earcushions", (String) map.get(bVar2.b()));
                if (a13 != null) {
                    arrayList.add(a13);
                }
            }
            List<bk.b> b14 = kVar.b().b();
            ArrayList arrayList2 = new ArrayList();
            for (bk.b bVar3 : b14) {
                gl.i a14 = bVar.a(bVar3, false, z13, "earcushions", (String) map.get(bVar3.e()));
                if (a14 != null) {
                    arrayList2.add(a14);
                }
            }
            List<bk.b> b15 = kVar.a().b();
            ArrayList arrayList3 = new ArrayList();
            for (bk.b bVar4 : b15) {
                gl.i a15 = bVar.a(bVar4, true, z13, "earcups", (String) map.get(bVar4.b()));
                if (a15 != null) {
                    arrayList3.add(a15);
                }
            }
            List<bk.b> b16 = kVar.a().b();
            ArrayList arrayList4 = new ArrayList();
            for (bk.b bVar5 : b16) {
                gl.i a16 = bVar.a(bVar5, false, z13, "earcups", (String) map.get(bVar5.e()));
                if (a16 != null) {
                    arrayList4.add(a16);
                }
            }
            a.c cVar = new a.c(arrayList3, arrayList4, arrayList, arrayList2);
            cVar = (cVar.f12457b.isEmpty() || cVar.f12456a.isEmpty() || cVar.d.isEmpty() || cVar.f12458c.isEmpty()) ? null : null;
            return cVar != null ? cVar : a.C0344a.f12454a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc42/j;", "Lcom/dyson/mobile/android/audio/home/customisation/a;", "Lh12/f0;", "<anonymous>", "(Lc42/j;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.audio.home.customisation.CustomisationViewModel$accessoryOptionsState$3", f = "CustomisationViewModel.kt", l = {BR.stepImage}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class c extends n12.i implements Function2<c42.j<? super com.dyson.mobile.android.audio.home.customisation.a>, l12.d<? super f0>, Object> {
        public int d;
        public /* synthetic */ Object e;

        public c(l12.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            c cVar = new c(dVar);
            cVar.e = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c42.j<? super com.dyson.mobile.android.audio.home.customisation.a> jVar, l12.d<? super f0> dVar) {
            return ((c) create(jVar, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            c42.j jVar = (c42.j) this.e;
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            int i13 = this.d;
            if (i13 == 0) {
                r.b(obj);
                a.b bVar = a.b.f12455a;
                this.e = null;
                this.d = 1;
                if (jVar.emit(bVar, this) == aVar) {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc42/j;", "Lbk/k;", "Lh12/f0;", "<anonymous>", "(Lc42/j;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.audio.home.customisation.CustomisationViewModel$customisationOptionsFlow$1", f = "CustomisationViewModel.kt", l = {60, BR.machineType}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class d extends n12.i implements Function2<c42.j<? super bk.k>, l12.d<? super f0>, Object> {
        public int d;
        public /* synthetic */ Object e;

        public d(l12.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            d dVar2 = new d(dVar);
            dVar2.e = obj;
            return dVar2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c42.j<? super bk.k> jVar, l12.d<? super f0> dVar) {
            return ((d) create(jVar, dVar)).invokeSuspend(f0.f36844a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
            if (r7 == r1) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
            if (r0.emit(r7, r6) == r1) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
            return r1;
         */
        @Override // n12.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.e
                c42.j r0 = (c42.j) r0
                m12.a r1 = m12.a.COROUTINE_SUSPENDED
                int r2 = r6.d
                r3 = 0
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L1f
                if (r2 == r5) goto L1b
                if (r2 != r4) goto L15
                h12.r.b(r7)
                goto L40
            L15:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                pa.c.w(r6)
                return r3
            L1b:
                h12.r.b(r7)
                goto L31
            L1f:
                h12.r.b(r7)
                com.dyson.mobile.android.audio.home.customisation.g r7 = com.dyson.mobile.android.audio.home.customisation.g.this
                bk.l r7 = r7.d
                r6.e = r0
                r6.d = r5
                java.lang.Object r7 = r7.d(r6)
                if (r7 != r1) goto L31
                goto L3f
            L31:
                bk.k r7 = (bk.k) r7
                if (r7 == 0) goto L40
                r6.e = r3
                r6.d = r4
                java.lang.Object r6 = r0.emit(r7, r6)
                if (r6 != r1) goto L40
            L3f:
                return r1
            L40:
                h12.f0 r6 = h12.f0.f36844a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.audio.home.customisation.g.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lbk/k;", "customisationOptions", "Lgl/x;", "selectionState", "Lcom/dyson/mobile/android/audio/home/customisation/a;", "accessoryOptionsState", "Lcom/dyson/mobile/android/audio/home/customisation/k;", "<anonymous>", "(Lbk/k;Lgl/x;Lcom/dyson/mobile/android/audio/home/customisation/a;)Lcom/dyson/mobile/android/audio/home/customisation/k;"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.audio.home.customisation.CustomisationViewModel$customisationViewState$1", f = "CustomisationViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class e extends n12.i implements o<bk.k, x, com.dyson.mobile.android.audio.home.customisation.a, l12.d<? super k>, Object> {
        public /* synthetic */ bk.k d;
        public /* synthetic */ x e;

        /* renamed from: f  reason: collision with root package name */
        public /* synthetic */ com.dyson.mobile.android.audio.home.customisation.a f12501f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ l f12502g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(l lVar, l12.d<? super e> dVar) {
            super(4, dVar);
            this.f12502g = lVar;
        }

        @Override // w12.o
        public final Object invoke(bk.k kVar, x xVar, com.dyson.mobile.android.audio.home.customisation.a aVar, l12.d<? super k> dVar) {
            e eVar = new e(this.f12502g, dVar);
            eVar.d = kVar;
            eVar.e = xVar;
            eVar.f12501f = aVar;
            return eVar.invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            Object obj2;
            Object obj3;
            Object obj4;
            Object obj5;
            LocalisationKey localisationKey;
            bk.k kVar = this.d;
            x xVar = this.e;
            com.dyson.mobile.android.audio.home.customisation.a aVar = this.f12501f;
            m12.a aVar2 = m12.a.COROUTINE_SUSPENDED;
            r.b(obj);
            l lVar = this.f12502g;
            lVar.getClass();
            kVar.getClass();
            xVar.getClass();
            aVar.getClass();
            if (aVar instanceof a.C0344a) {
                return k.a.f12510a;
            }
            bk.j c13 = xVar.c();
            String str = null;
            String finishId = c13 != null ? c13.getFinishId() : null;
            Iterator<T> it = kVar.b().b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                String c14 = ((bk.b) obj2).c();
                p<String, String> d = xVar.d();
                if (x12.r.c(c14, d != null ? d.d : null)) {
                    break;
                }
            }
            bk.b bVar = (bk.b) obj2;
            String b13 = bVar != null ? bVar.b() : null;
            Iterator<T> it2 = kVar.b().b().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it2.next();
                String c15 = ((bk.b) obj3).c();
                p<String, String> d13 = xVar.d();
                if (x12.r.c(c15, d13 != null ? d13.e : null)) {
                    break;
                }
            }
            bk.b bVar2 = (bk.b) obj3;
            String e = bVar2 != null ? bVar2.e() : null;
            Iterator<T> it3 = kVar.a().b().iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj4 = null;
                    break;
                }
                obj4 = it3.next();
                String c16 = ((bk.b) obj4).c();
                p<String, String> b14 = xVar.b();
                if (x12.r.c(c16, b14 != null ? b14.d : null)) {
                    break;
                }
            }
            bk.b bVar3 = (bk.b) obj4;
            String b15 = bVar3 != null ? bVar3.b() : null;
            Iterator<T> it4 = kVar.a().b().iterator();
            while (true) {
                if (!it4.hasNext()) {
                    obj5 = null;
                    break;
                }
                obj5 = it4.next();
                String c17 = ((bk.b) obj5).c();
                p<String, String> b16 = xVar.b();
                if (x12.r.c(c17, b16 != null ? b16.e : null)) {
                    break;
                }
            }
            bk.b bVar4 = (bk.b) obj5;
            gl.h hVar = new gl.h(finishId, b13, e, b15, bVar4 != null ? bVar4.e() : null);
            if ((hVar.f35123a == null && (hVar.f35124b == null || hVar.f35125c == null || hVar.d == null || hVar.e == null)) || (aVar instanceof a.c)) {
                if (aVar instanceof a.c) {
                    a.c cVar = (a.c) aVar;
                    gl.p pVar = new gl.p(cVar.f12458c, cVar.d, xVar.d(), cVar.f12456a, cVar.f12457b, xVar.b(), xVar.e());
                    String c18 = kVar.b().c();
                    String c19 = kVar.a().c();
                    bk.h hVar2 = lVar.f12516a;
                    bk.j c23 = xVar.c();
                    if (c23 != null && (localisationKey = c23.getLocalisationKey()) != null) {
                        str = hVar2.f7887b.d(localisationKey);
                    }
                    j12.b b17 = s.b();
                    b17.add(hVar2.f7886a.f15565m);
                    if (str != null) {
                        b17.add(str);
                    }
                    String a13 = hVar2.a(xVar.d(), rf0.e.f71145g, rf0.e.e);
                    if (a13 != null) {
                        b17.add(a13);
                    }
                    String a14 = hVar2.a(xVar.b(), rf0.e.f71146h, rf0.e.f71144f);
                    if (a14 != null) {
                        b17.add(a14);
                    }
                    return new k.d(hVar, pVar, c0.W(s.a(b17), ", ", null, null, null, 62), c18, c19);
                }
                return k.c.f12512a;
            }
            return new k.b(hVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc42/j;", "", "Lag0/a;", "Lh12/f0;", "<anonymous>", "(Lc42/j;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.audio.home.customisation.CustomisationViewModel$finishUrlMapFlow$1", f = "CustomisationViewModel.kt", l = {BR.passwordErrorVisibility, BR.passwordErrorVisibility, BR.progressRange}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class f extends n12.i implements Function2<c42.j<? super List<? extends ag0.a>>, l12.d<? super f0>, Object> {
        public c42.j d;
        public int e;

        /* renamed from: f  reason: collision with root package name */
        public /* synthetic */ Object f12503f;

        public f(l12.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            f fVar = new f(dVar);
            fVar.f12503f = obj;
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c42.j<? super List<? extends ag0.a>> jVar, l12.d<? super f0> dVar) {
            return ((f) create(jVar, dVar)).invokeSuspend(f0.f36844a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0051, code lost:
            if (r2.emit(r8, r7) == r1) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0060, code lost:
            if (r0.emit(r8, r7) != r1) goto L8;
         */
        @Override // n12.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f12503f
                c42.j r0 = (c42.j) r0
                m12.a r1 = m12.a.COROUTINE_SUSPENDED
                int r2 = r7.e
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L2c
                if (r2 == r5) goto L26
                if (r2 == r4) goto L22
                if (r2 != r3) goto L1c
                c42.j r7 = r7.d
                java.lang.Exception r7 = (java.lang.Exception) r7
                h12.r.b(r8)
                goto L63
            L1c:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                pa.c.w(r7)
                return r6
            L22:
                h12.r.b(r8)     // Catch: java.lang.Exception -> L54
                goto L63
            L26:
                c42.j r2 = r7.d
                h12.r.b(r8)     // Catch: java.lang.Exception -> L54
                goto L47
            L2c:
                h12.r.b(r8)
                com.dyson.mobile.android.audio.home.customisation.g r8 = com.dyson.mobile.android.audio.home.customisation.g.this     // Catch: java.lang.Exception -> L54
                bg0.a r2 = r8.f12488i     // Catch: java.lang.Exception -> L54
                ag0.b r8 = r8.f12489j     // Catch: java.lang.Exception -> L54
                java.util.List r8 = i12.s.c(r8)     // Catch: java.lang.Exception -> L54
                r7.f12503f = r0     // Catch: java.lang.Exception -> L54
                r7.d = r0     // Catch: java.lang.Exception -> L54
                r7.e = r5     // Catch: java.lang.Exception -> L54
                java.lang.Object r8 = r2.b(r8, r6, r7)     // Catch: java.lang.Exception -> L54
                if (r8 != r1) goto L46
                goto L62
            L46:
                r2 = r0
            L47:
                r7.f12503f = r0     // Catch: java.lang.Exception -> L54
                r7.d = r6     // Catch: java.lang.Exception -> L54
                r7.e = r4     // Catch: java.lang.Exception -> L54
                java.lang.Object r7 = r2.emit(r8, r7)     // Catch: java.lang.Exception -> L54
                if (r7 != r1) goto L63
                goto L62
            L54:
                i12.e0 r8 = i12.e0.d
                r7.f12503f = r6
                r7.d = r6
                r7.e = r3
                java.lang.Object r7 = r0.emit(r8, r7)
                if (r7 != r1) goto L63
            L62:
                return r1
            L63:
                h12.f0 r7 = h12.f0.f36844a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.audio.home.customisation.g.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc42/j;", "Lcom/dyson/mobile/android/audio/home/customisation/m;", "Lh12/f0;", "<anonymous>", "(Lc42/j;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.audio.home.customisation.CustomisationViewModel$modelSchema$1", f = "CustomisationViewModel.kt", l = {BR.targetKey, BR.timelineTooltip}, m = "invokeSuspend", v = 2)
    /* renamed from: com.dyson.mobile.android.audio.home.customisation.g$g  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0346g extends n12.i implements Function2<c42.j<? super m>, l12.d<? super f0>, Object> {
        public int d;
        public /* synthetic */ Object e;

        public C0346g(l12.d<? super C0346g> dVar) {
            super(2, dVar);
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            C0346g c0346g = new C0346g(dVar);
            c0346g.e = obj;
            return c0346g;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c42.j<? super m> jVar, l12.d<? super f0> dVar) {
            return ((C0346g) create(jVar, dVar)).invokeSuspend(f0.f36844a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x002e, code lost:
            if (r7 == r1) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
            if (r0.emit(r2, r6) == r1) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
            return r1;
         */
        @Override // n12.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.e
                c42.j r0 = (c42.j) r0
                m12.a r1 = m12.a.COROUTINE_SUSPENDED
                int r2 = r6.d
                r3 = 0
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L1f
                if (r2 == r5) goto L1b
                if (r2 != r4) goto L15
                h12.r.b(r7)
                goto L48
            L15:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                pa.c.w(r6)
                return r3
            L1b:
                h12.r.b(r7)
                goto L31
            L1f:
                h12.r.b(r7)
                com.dyson.mobile.android.audio.home.customisation.g r7 = com.dyson.mobile.android.audio.home.customisation.g.this
                bk.l r7 = r7.d
                r6.e = r0
                r6.d = r5
                java.lang.Object r7 = r7.c(r6)
                if (r7 != r1) goto L31
                goto L47
            L31:
                com.dyson.nst.dyson3d.schema.model.Schema r7 = (com.dyson.nst.dyson3d.schema.model.Schema) r7
                if (r7 == 0) goto L3b
                com.dyson.mobile.android.audio.home.customisation.m$a r2 = new com.dyson.mobile.android.audio.home.customisation.m$a
                r2.<init>(r7)
                goto L3d
            L3b:
                com.dyson.mobile.android.audio.home.customisation.m$c r2 = com.dyson.mobile.android.audio.home.customisation.m.c.f12519a
            L3d:
                r6.e = r3
                r6.d = r4
                java.lang.Object r6 = r0.emit(r2, r6)
                if (r6 != r1) goto L48
            L47:
                return r1
            L48:
                h12.f0 r6 = h12.f0.f36844a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.audio.home.customisation.g.C0346g.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lc42/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class h implements c42.i<Map<String, ? extends String>> {
        public final /* synthetic */ c42.i d;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class a<T> implements c42.j {
            public final /* synthetic */ c42.j d;

            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @n12.e(c = "com.dyson.mobile.android.audio.home.customisation.CustomisationViewModel$special$$inlined$map$1$2", f = "CustomisationViewModel.kt", l = {50}, m = "emit", v = 2)
            /* renamed from: com.dyson.mobile.android.audio.home.customisation.g$h$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0347a extends n12.c {
                public /* synthetic */ Object d;
                public int e;

                public C0347a(l12.d dVar) {
                    super(dVar);
                }

                @Override // n12.a
                public final Object invokeSuspend(Object obj) {
                    this.d = obj;
                    this.e |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(c42.j jVar) {
                this.d = jVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
            @Override // c42.j
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r7, l12.d r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof com.dyson.mobile.android.audio.home.customisation.g.h.a.C0347a
                    if (r0 == 0) goto L13
                    r0 = r8
                    com.dyson.mobile.android.audio.home.customisation.g$h$a$a r0 = (com.dyson.mobile.android.audio.home.customisation.g.h.a.C0347a) r0
                    int r1 = r0.e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.e = r1
                    goto L18
                L13:
                    com.dyson.mobile.android.audio.home.customisation.g$h$a$a r0 = new com.dyson.mobile.android.audio.home.customisation.g$h$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.d
                    m12.a r1 = m12.a.COROUTINE_SUSPENDED
                    int r2 = r0.e
                    r3 = 1
                    if (r2 == 0) goto L2e
                    if (r2 != r3) goto L27
                    h12.r.b(r8)
                    goto L73
                L27:
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    pa.c.w(r6)
                    r6 = 0
                    return r6
                L2e:
                    h12.r.b(r8)
                    java.util.List r7 = (java.util.List) r7
                    r8 = 10
                    int r8 = i12.u.o(r7, r8)
                    int r8 = i12.p0.b(r8)
                    r2 = 16
                    if (r8 >= r2) goto L42
                    r8 = r2
                L42:
                    java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
                    r2.<init>(r8)
                    java.util.Iterator r7 = r7.iterator()
                L4b:
                    boolean r8 = r7.hasNext()
                    if (r8 == 0) goto L68
                    java.lang.Object r8 = r7.next()
                    ag0.a r8 = (ag0.a) r8
                    h12.p r4 = new h12.p
                    java.lang.String r5 = r8.f1224b
                    java.lang.String r8 = r8.d
                    r4.<init>(r5, r8)
                    A r8 = r4.d
                    B r4 = r4.e
                    r2.put(r8, r4)
                    goto L4b
                L68:
                    r0.e = r3
                    c42.j r6 = r6.d
                    java.lang.Object r6 = r6.emit(r2, r0)
                    if (r6 != r1) goto L73
                    return r1
                L73:
                    h12.f0 r6 = h12.f0.f36844a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.audio.home.customisation.g.h.a.emit(java.lang.Object, l12.d):java.lang.Object");
            }
        }

        public h(c42.i iVar) {
            this.d = iVar;
        }

        @Override // c42.i
        public final Object collect(c42.j<? super Map<String, ? extends String>> jVar, l12.d dVar) {
            Object collect = this.d.collect(new a(jVar), dVar);
            return collect == m12.a.COROUTINE_SUSPENDED ? collect : f0.f36844a;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lc42/i;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class i implements c42.i<Boolean> {
        public final /* synthetic */ c42.i d;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class a<T> implements c42.j {
            public final /* synthetic */ c42.j d;

            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            @n12.e(c = "com.dyson.mobile.android.audio.home.customisation.CustomisationViewModel$special$$inlined$map$2$2", f = "CustomisationViewModel.kt", l = {50}, m = "emit", v = 2)
            /* renamed from: com.dyson.mobile.android.audio.home.customisation.g$i$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0348a extends n12.c {
                public /* synthetic */ Object d;
                public int e;

                public C0348a(l12.d dVar) {
                    super(dVar);
                }

                @Override // n12.a
                public final Object invokeSuspend(Object obj) {
                    this.d = obj;
                    this.e |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(c42.j jVar) {
                this.d = jVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
            @Override // c42.j
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, l12.d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.dyson.mobile.android.audio.home.customisation.g.i.a.C0348a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.dyson.mobile.android.audio.home.customisation.g$i$a$a r0 = (com.dyson.mobile.android.audio.home.customisation.g.i.a.C0348a) r0
                    int r1 = r0.e
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.e = r1
                    goto L18
                L13:
                    com.dyson.mobile.android.audio.home.customisation.g$i$a$a r0 = new com.dyson.mobile.android.audio.home.customisation.g$i$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.d
                    m12.a r1 = m12.a.COROUTINE_SUSPENDED
                    int r2 = r0.e
                    r3 = 1
                    if (r2 == 0) goto L2e
                    if (r2 != r3) goto L27
                    h12.r.b(r6)
                    goto L46
                L27:
                    java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                    pa.c.w(r4)
                    r4 = 0
                    return r4
                L2e:
                    h12.r.b(r6)
                    gl.x r5 = (gl.x) r5
                    boolean r5 = r5.e()
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
                    r0.e = r3
                    c42.j r4 = r4.d
                    java.lang.Object r4 = r4.emit(r5, r0)
                    if (r4 != r1) goto L46
                    return r1
                L46:
                    h12.f0 r4 = h12.f0.f36844a
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.audio.home.customisation.g.i.a.emit(java.lang.Object, l12.d):java.lang.Object");
            }
        }

        public i(c42.i iVar) {
            this.d = iVar;
        }

        @Override // c42.i
        public final Object collect(c42.j<? super Boolean> jVar, l12.d dVar) {
            Object collect = this.d.collect(new a(jVar), dVar);
            return collect == m12.a.COROUTINE_SUSPENDED ? collect : f0.f36844a;
        }
    }

    public g(vj.b bVar, l lVar, com.dyson.mobile.android.audio.home.customisation.b bVar2, bk.l lVar2, hj.e eVar, gl.f fVar, MachineSerial machineSerial, qo0.d dVar, bg0.a aVar, ag0.b bVar3, qh.a aVar2, boolean z13) {
        bVar.getClass();
        lVar.getClass();
        bVar2.getClass();
        lVar2.getClass();
        eVar.getClass();
        fVar.getClass();
        machineSerial.getClass();
        dVar.getClass();
        aVar.getClass();
        bVar3.getClass();
        aVar2.getClass();
        this.d = lVar2;
        this.e = eVar;
        this.f12485f = fVar;
        this.f12486g = machineSerial;
        this.f12487h = dVar;
        this.f12488i = aVar;
        this.f12489j = bVar3;
        this.f12490k = aVar2;
        s1 s1Var = new s1(new d(null));
        this.f12491l = s1Var;
        h hVar = new h(new s1(new f(null)));
        f2 a13 = g2.a(lVar2.g());
        this.f12492m = a13;
        c42.u uVar = new c42.u(new c(null), c42.r.j(s1Var, c42.r.n(new i(a13)), hVar, new b(bVar2, null)));
        s1 s1Var2 = new s1(new C0346g(null));
        s9.a a14 = v.a(this);
        d2 d2Var = aq.f.f5345a;
        this.f12493n = c42.r.D(s1Var2, a14, d2Var, m.b.f12518a);
        this.f12494o = c42.r.D(c42.r.j(s1Var, a13, uVar, new e(lVar, null)), v.a(this), d2Var, k.c.f12512a);
        b42.c b13 = b42.m.b(0, null, null, 7);
        this.f12495p = b13;
        this.f12496q = c42.r.B(b13);
        this.f12497r = h12.m.b(new ew0.k(this, 23));
        T(false);
        if (z13) {
            return;
        }
        bVar.f84297a.putBoolean("show_customisation_tile", false);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object S(com.dyson.mobile.android.audio.home.customisation.g r7, n12.c r8) {
        /*
            r7.getClass()
            boolean r0 = r8 instanceof gl.q
            if (r0 == 0) goto L17
            r0 = r8
            gl.q r0 = (gl.q) r0
            int r1 = r0.f35147f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.f35147f = r1
        L15:
            r5 = r0
            goto L1d
        L17:
            gl.q r0 = new gl.q
            r0.<init>(r7, r8)
            goto L15
        L1d:
            java.lang.Object r8 = r5.d
            m12.a r0 = m12.a.COROUTINE_SUSPENDED
            int r1 = r5.f35147f
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2c
            h12.r.b(r8)     // Catch: java.lang.Exception -> L60
            goto L4a
        L2c:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            pa.c.w(r7)
            r7 = 0
            return r7
        L33:
            h12.r.b(r8)
            qo0.d r1 = r7.f12487h     // Catch: java.lang.Exception -> L60
            lp0.c r4 = lp0.c.TRACKER_SUFFIX_LOBBY     // Catch: java.lang.Exception -> L60
            com.dyson.mobile.android.machinetype.MachineSerial r7 = r7.f12486g     // Catch: java.lang.Exception -> L60
            java.lang.String r7 = r7.d     // Catch: java.lang.Exception -> L60
            r5.f35147f = r2     // Catch: java.lang.Exception -> L60
            r3 = 0
            r6 = 2
            r2 = r7
            java.lang.Object r8 = qo0.d.b(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L60
            if (r8 != r0) goto L4a
            return r0
        L4a:
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L60
            kj.b r7 = new kj.b     // Catch: java.lang.Exception -> L60
            com.dyson.mobile.android.analytics.tracking.externallink.ExternalLinkTracking r0 = new com.dyson.mobile.android.analytics.tracking.externallink.ExternalLinkTracking     // Catch: java.lang.Exception -> L60
            java.lang.String r1 = "parts_and_accessories"
            mj.m$a r2 = mj.m.a.CUSTOMIZE_LOOK     // Catch: java.lang.Exception -> L60
            r5 = 12
            r6 = 0
            r3 = 0
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L60
            r7.<init>(r8, r0)     // Catch: java.lang.Exception -> L60
            return r7
        L60:
            r0 = move-exception
            r7 = r0
            boolean r8 = r7 instanceof java.util.concurrent.CancellationException
            if (r8 != 0) goto L6b
            java.lang.String r8 = "Shop content was not downloaded"
            com.dyson.mobile.android.logging.Logger.b(r8, r7)
        L6b:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.audio.home.customisation.g.S(com.dyson.mobile.android.audio.home.customisation.g, n12.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0016, code lost:
        if (r0 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static h12.p U(h12.p r2, java.lang.String r3, boolean r4, boolean r5) {
        /*
            r0 = 0
            if (r2 == 0) goto L8
            A r1 = r2.d
            java.lang.String r1 = (java.lang.String) r1
            goto L9
        L8:
            r1 = r0
        L9:
            if (r4 == 0) goto L1f
            if (r2 == 0) goto L18
            B r2 = r2.e
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L18
            if (r5 == 0) goto L16
            r0 = r2
        L16:
            if (r0 != 0) goto L19
        L18:
            r0 = r3
        L19:
            h12.p r2 = new h12.p
            r2.<init>(r3, r0)
            return r2
        L1f:
            if (r1 == 0) goto L27
            h12.p r2 = new h12.p
            r2.<init>(r1, r3)
            return r2
        L27:
            h12.p r2 = new h12.p
            r2.<init>(r3, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.audio.home.customisation.g.U(h12.p, java.lang.String, boolean, boolean):h12.p");
    }

    public final void T(boolean z13) {
        this.f12485f.getClass();
        int i13 = y.f57790a;
        ij.b bVar = new ij.b("common.settings.configure_3d_model", null, 2, null);
        if (z13) {
            LinkedHashMap m13 = q0.m(bVar.f41701b);
            a.s.f52191a.getClass();
            m13.put(a.s.f52192b, "error");
            bVar = ij.b.a(bVar, m13);
        }
        e.a aVar = hj.e.f38312g;
        this.e.h(bVar, null);
    }
}
