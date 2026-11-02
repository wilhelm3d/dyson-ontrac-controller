package com.dyson.mobile.android.connectedhome.voicecontrol.newsystem;

import h12.f0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import l12.d;
import n12.e;
import n12.i;
import z32.c0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.dyson.mobile.android.connectedhome.voicecontrol.newsystem.VoiceControlNdsViewModel$onUnlinkAlexa$1", f = "VoiceControlNdsViewModel.kt", l = {155}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class c extends i implements Function2<c0, d<? super f0>, Object> {
    public int d;
    public final /* synthetic */ b e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b bVar, d<? super c> dVar) {
        super(2, dVar);
        this.e = bVar;
    }

    @Override // n12.a
    public final d<f0> create(Object obj, d<?> dVar) {
        return new c(this.e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(c0 c0Var, d<? super f0> dVar) {
        return ((c) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    @Override // n12.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            m12.a r0 = m12.a.COROUTINE_SUSPENDED
            int r1 = r6.d
            r2 = 1
            r3 = 0
            com.dyson.mobile.android.connectedhome.voicecontrol.newsystem.b r4 = r6.e
            if (r1 == 0) goto L18
            if (r1 != r2) goto L12
            h12.r.b(r7)     // Catch: java.lang.Throwable -> L10
            goto L31
        L10:
            r6 = move-exception
            goto L36
        L12:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            pa.c.w(r6)
            return r3
        L18:
            h12.r.b(r7)
            c42.f2 r7 = r4.f13221n
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r7.l(r3, r1)
            c00.d r7 = r4.f13214g
            int r1 = h12.q.e     // Catch: java.lang.Throwable -> L10
            r6.d = r2     // Catch: java.lang.Throwable -> L10
            b00.a r7 = r7.f10001a     // Catch: java.lang.Throwable -> L10
            java.lang.Object r7 = r7.d(r6)     // Catch: java.lang.Throwable -> L10
            if (r7 != r0) goto L31
            return r0
        L31:
            a00.d r7 = (a00.d) r7     // Catch: java.lang.Throwable -> L10
            int r6 = h12.q.e     // Catch: java.lang.Throwable -> L10
            goto L3d
        L36:
            int r7 = h12.q.e
            h12.q$b r7 = new h12.q$b
            r7.<init>(r6)
        L3d:
            boolean r6 = r7 instanceof h12.q.b
            if (r6 != 0) goto L63
            r6 = r7
            a00.d r6 = (a00.d) r6
            r4.V(r3)
            c42.f2 r6 = r4.f13217j
        L49:
            java.lang.Object r0 = r6.getValue()
            r1 = r0
            com.dyson.mobile.android.connectedhome.voicecontrol.newsystem.b$c r1 = (com.dyson.mobile.android.connectedhome.voicecontrol.newsystem.b.c) r1
            com.dyson.mobile.android.connectedhome.voicecontrol.newsystem.b$c$e r1 = new com.dyson.mobile.android.connectedhome.voicecontrol.newsystem.b$c$e
            l00.c r2 = r4.d
            l00.n r5 = l00.n.AMAZON_ALEXA_UNLINK_SUCCESS
            l00.e r2 = r2.a(r5)
            r1.<init>(r2)
            boolean r0 = r6.f(r0, r1)
            if (r0 == 0) goto L49
        L63:
            java.lang.Throwable r6 = h12.q.b(r7)
            if (r6 == 0) goto L8d
            r4.V(r3)
            java.lang.String r7 = "Failed to unlink Alexa"
            com.dyson.mobile.android.logging.Logger.b(r7, r6)
            c42.f2 r6 = r4.f13217j
        L73:
            java.lang.Object r7 = r6.getValue()
            r0 = r7
            com.dyson.mobile.android.connectedhome.voicecontrol.newsystem.b$c r0 = (com.dyson.mobile.android.connectedhome.voicecontrol.newsystem.b.c) r0
            com.dyson.mobile.android.connectedhome.voicecontrol.newsystem.b$c$f r0 = new com.dyson.mobile.android.connectedhome.voicecontrol.newsystem.b$c$f
            l00.c r1 = r4.d
            l00.n r2 = l00.n.AMAZON_ALEXA_UNLINK_FAILURE
            l00.e r1 = r1.a(r2)
            r0.<init>(r1)
            boolean r7 = r6.f(r7, r0)
            if (r7 == 0) goto L73
        L8d:
            c42.f2 r6 = r4.f13221n
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r6.l(r3, r7)
            h12.f0 r6 = h12.f0.f36844a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.connectedhome.voicecontrol.newsystem.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
