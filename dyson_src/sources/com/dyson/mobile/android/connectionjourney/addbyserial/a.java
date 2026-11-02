package com.dyson.mobile.android.connectionjourney.addbyserial;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.f;
import h12.f0;
import h12.r;
import hj.e;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import n12.i;
import nj.n2;
import nj.o2;
import nj.p2;
import nj.q2;
import nj.r2;
import nj.s2;
import nl0.h;
import u2.k0;
import u3.p1;
import x12.p;
import z32.c0;
/* loaded from: classes2.dex */
public final class a {

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.connectionjourney.addbyserial.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class C0405a extends p implements Function1<Integer, f0> {
        public C0405a(Object obj) {
            super(1, obj, com.dyson.mobile.android.connectionjourney.addbyserial.b.class, "onUserGuidePageChanged", "onUserGuidePageChanged(I)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final f0 invoke(Integer num) {
            ij.b bVar;
            int intValue = num.intValue();
            com.dyson.mobile.android.connectionjourney.addbyserial.b bVar2 = (com.dyson.mobile.android.connectionjourney.addbyserial.b) this.receiver;
            bVar2.getClass();
            if (intValue == 0) {
                int i13 = n2.f57608a;
                bVar = new ij.b("connection_journey.non_connected_product.locate_serial_number_guide_page_1", null, 2, null);
            } else if (intValue == 1) {
                int i14 = o2.f57624a;
                bVar = new ij.b("connection_journey.non_connected_product.locate_serial_number_guide_page_2", null, 2, null);
            } else if (intValue == 2) {
                int i15 = p2.f57641a;
                bVar = new ij.b("connection_journey.non_connected_product.locate_serial_number_guide_page_3", null, 2, null);
            } else if (intValue == 3) {
                int i16 = q2.f57658a;
                bVar = new ij.b("connection_journey.non_connected_product.locate_serial_number_guide_page_4", null, 2, null);
            } else if (intValue == 4) {
                int i17 = r2.f57675a;
                bVar = new ij.b("connection_journey.non_connected_product.locate_serial_number_guide_page_5", null, 2, null);
            } else if (intValue != 5) {
                bVar = null;
            } else {
                int i18 = s2.f57692a;
                bVar = new ij.b("connection_journey.non_connected_product.locate_serial_number_guide_page_6", null, 2, null);
            }
            if (bVar != null) {
                e eVar = bVar2.d;
                e.a aVar = e.f38312g;
                eVar.h(bVar, null);
            }
            return f0.f36844a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.connectionjourney.addbyserial.LocateSerialGuidePageContentKt$LocalSerialGuidePageContent$4$1", f = "LocateSerialGuidePageContent.kt", l = {}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class b extends i implements Function2<c0, l12.d<? super f0>, Object> {
        public final /* synthetic */ Function1<Integer, f0> d;
        public final /* synthetic */ k0 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super Integer, f0> function1, k0 k0Var, l12.d<? super b> dVar) {
            super(2, dVar);
            this.d = function1;
            this.e = k0Var;
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            return new b(this.d, this.e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
            return ((b) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            r.b(obj);
            this.d.invoke(new Integer(this.e.k()));
            return f0.f36844a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006b, code lost:
        if (r1 == androidx.compose.runtime.Composer.a.f3142b) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00cb, code lost:
        if (r4 == androidx.compose.runtime.Composer.a.f3142b) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(com.dyson.mobile.android.connectionjourney.addbyserial.b.a r8, com.dyson.mobile.android.machinetype.MachineCategory r9, com.dyson.mobile.android.machinetype.MachineDescriptor r10, androidx.compose.runtime.Composer r11, int r12) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.connectionjourney.addbyserial.a.a(com.dyson.mobile.android.connectionjourney.addbyserial.b$a, com.dyson.mobile.android.machinetype.MachineCategory, com.dyson.mobile.android.machinetype.MachineDescriptor, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
        if (r2 == androidx.compose.runtime.Composer.a.f3142b) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0073, code lost:
        if (r1 == androidx.compose.runtime.Composer.a.f3142b) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(java.util.List<x00.c> r10, kotlin.jvm.functions.Function1<? super java.lang.Integer, h12.f0> r11, androidx.compose.runtime.Composer r12, int r13) {
        /*
            r0 = -1871175305(0xffffffff90782177, float:-4.8935157E-29)
            androidx.compose.runtime.a r7 = r12.k(r0)
            boolean r12 = r7.D(r10)
            if (r12 == 0) goto Lf
            r12 = 4
            goto L10
        Lf:
            r12 = 2
        L10:
            r12 = r12 | r13
            boolean r0 = r7.D(r11)
            r1 = 32
            if (r0 == 0) goto L1b
            r0 = r1
            goto L1d
        L1b:
            r0 = 16
        L1d:
            r12 = r12 | r0
            r0 = r12 & 19
            r2 = 18
            r3 = 0
            r4 = 1
            if (r0 == r2) goto L28
            r0 = r4
            goto L29
        L28:
            r0 = r3
        L29:
            r2 = r12 & 1
            boolean r0 = r7.t(r2, r0)
            if (r0 == 0) goto L9f
            u3.p1 r0 = androidx.compose.runtime.b.f3172a
            boolean r0 = r7.D(r10)
            java.lang.Object r2 = r7.B()
            androidx.compose.runtime.Composer$a r5 = androidx.compose.runtime.Composer.f3140a
            if (r0 != 0) goto L46
            r5.getClass()
            androidx.compose.runtime.Composer$a$a r0 = androidx.compose.runtime.Composer.a.f3142b
            if (r2 != r0) goto L4f
        L46:
            bq0.h r2 = new bq0.h
            r0 = 7
            r2.<init>(r10, r0)
            r7.u(r2)
        L4f:
            w12.a r2 = (w12.a) r2
            r0 = 3
            u2.b r0 = u2.o0.b(r3, r2, r7, r3, r0)
            int r2 = r0.k()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r12 = r12 & 112(0x70, float:1.57E-43)
            if (r12 != r1) goto L63
            r3 = r4
        L63:
            boolean r12 = r7.Q(r0)
            r12 = r12 | r3
            java.lang.Object r1 = r7.B()
            if (r12 != 0) goto L75
            r5.getClass()
            androidx.compose.runtime.Composer$a$a r12 = androidx.compose.runtime.Composer.a.f3142b
            if (r1 != r12) goto L7e
        L75:
            com.dyson.mobile.android.connectionjourney.addbyserial.a$b r1 = new com.dyson.mobile.android.connectionjourney.addbyserial.a$b
            r12 = 0
            r1.<init>(r11, r0, r12)
            r7.u(r1)
        L7e:
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            u3.m0.d(r7, r2, r1)
            rj0.b r12 = new rj0.b
            r1 = 12
            r12.<init>(r1, r0, r10)
            r0 = 1727986935(0x66fefcf7, float:6.0207373E23)
            c4.c r6 = c4.d.c(r0, r12, r7)
            r8 = 199680(0x30c00, float:2.79811E-40)
            r9 = 23
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            xd1.j.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            goto La2
        L9f:
            r7.J()
        La2:
            androidx.compose.runtime.f r12 = r7.c0()
            if (r12 == 0) goto Lb1
            hc0.h r0 = new hc0.h
            r1 = 11
            r0.<init>(r10, r11, r13, r1)
            r12.d = r0
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.connectionjourney.addbyserial.a.b(java.util.List, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int):void");
    }

    public static final void c(h<? extends List<x00.c>> hVar, Function1<? super Integer, f0> function1, Composer composer, int i13) {
        androidx.compose.runtime.a k13 = composer.k(-981928086);
        int i14 = (k13.Q(hVar) ? 4 : 2) | i13 | (k13.D(function1) ? 32 : 16);
        if (k13.t(i14 & 1, (i14 & 19) != 18)) {
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            if (hVar instanceof h.c) {
                k13.R(1259920521);
                b((List) ((h.c) hVar).f57898a, function1, k13, i14 & com.salesforce.marketingcloud.analytics.stats.b.f20728p);
                k13.a0(false);
            } else {
                k13.R(402970454);
                k13.a0(false);
            }
        } else {
            k13.J();
        }
        f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new b20.p(i13, function1, hVar);
        }
    }
}
