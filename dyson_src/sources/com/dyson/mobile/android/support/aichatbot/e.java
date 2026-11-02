package com.dyson.mobile.android.support.aichatbot;

import android.net.Uri;
import com.paypal.android.platform.authsdk.BR;
import h12.f0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import n12.i;
import z32.c0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
@n12.e(c = "com.dyson.mobile.android.support.aichatbot.AiChatBotViewModel$onLoadRedirectUrl$1", f = "AiChatBotViewModel.kt", l = {BR.stepNumber, BR.titleAccessibilityKey, 100}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class e extends i implements Function2<c0, l12.d<? super f0>, Object> {
    public int d;
    public final /* synthetic */ d e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Uri f16770f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, Uri uri, l12.d<? super e> dVar2) {
        super(2, dVar2);
        this.e = dVar;
        this.f16770f = uri;
    }

    @Override // n12.a
    public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
        return new e(this.e, this.f16770f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
        return ((e) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
        if (r13 == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0077, code lost:
        if (r13.b(r1, r12) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a1, code lost:
        if (r1.b(r3, r12) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a3, code lost:
        return r0;
     */
    @Override // n12.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            m12.a r0 = m12.a.COROUTINE_SUSPENDED
            int r1 = r12.d
            r2 = 3
            r3 = 1
            r4 = 2
            com.dyson.mobile.android.support.aichatbot.d r5 = r12.e
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1e
            if (r1 == r4) goto L19
            if (r1 != r2) goto L12
            goto L19
        L12:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            pa.c.w(r12)
            r12 = 0
            return r12
        L19:
            h12.r.b(r13)
            goto La4
        L1e:
            h12.r.b(r13)
            goto L6a
        L22:
            h12.r.b(r13)
            int r13 = com.dyson.mobile.android.support.aichatbot.d.f16759p
            r5.getClass()
            android.net.Uri r13 = r12.f16770f
            java.lang.String r1 = r13.toString()
            r1.getClass()
            java.lang.String r6 = "dyson:///"
            r7 = 0
            boolean r1 = v32.w.q(r1, r6, r7)
            if (r1 == 0) goto L7a
            h80.c r1 = r5.f16763i
            java.lang.String r13 = r13.toString()
            r13.getClass()
            com.dyson.mobile.android.dynamiccontent.deeplinks.DynamicContentDeepLink r13 = r1.a(r13)
            boolean r1 = r13 instanceof com.dyson.mobile.android.dynamiccontent.deeplinks.DynamicContentDeepLink.c0
            if (r1 == 0) goto La4
            f71.h r1 = r5.f16764j
            com.dyson.mobile.android.support.aichatbot.b$a r2 = new com.dyson.mobile.android.support.aichatbot.b$a
            com.dyson.mobile.android.dynamiccontent.deeplinks.DynamicContentDeepLink$c0 r13 = (com.dyson.mobile.android.dynamiccontent.deeplinks.DynamicContentDeepLink.c0) r13
            java.lang.String r13 = r13.f14026a
            com.dyson.mobile.android.support.MachineSpecificTab r6 = com.dyson.mobile.android.support.MachineSpecificTab.RobotManageMapsTab
            r2.<init>(r13, r6)
            r12.d = r3
            b42.c r13 = r1.f30096a
            java.lang.Object r13 = r13.b(r2, r12)
            if (r13 != r0) goto L65
            goto L67
        L65:
            h12.f0 r13 = h12.f0.f36844a
        L67:
            if (r13 != r0) goto L6a
            goto La3
        L6a:
            b42.c r13 = r5.f16767m
            com.dyson.mobile.android.support.aichatbot.a$b r1 = new com.dyson.mobile.android.support.aichatbot.a$b
            r1.<init>()
            r12.d = r4
            java.lang.Object r12 = r13.b(r1, r12)
            if (r12 != r0) goto La4
            goto La3
        L7a:
            b42.c r1 = r5.f16767m
            com.dyson.mobile.android.support.aichatbot.a$a r3 = new com.dyson.mobile.android.support.aichatbot.a$a
            kj.b r4 = new kj.b
            java.lang.String r13 = r13.toString()
            r13.getClass()
            com.dyson.mobile.android.analytics.tracking.externallink.ExternalLinkTracking r5 = new com.dyson.mobile.android.analytics.tracking.externallink.ExternalLinkTracking
            mj.m$a r7 = mj.m.a.AI_ASSISTANT
            r10 = 12
            r11 = 0
            java.lang.String r6 = "ai_assistant"
            r8 = 0
            r9 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r4.<init>(r13, r5)
            r3.<init>(r4)
            r12.d = r2
            java.lang.Object r12 = r1.b(r3, r12)
            if (r12 != r0) goto La4
        La3:
            return r0
        La4:
            h12.f0 r12 = h12.f0.f36844a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.support.aichatbot.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
