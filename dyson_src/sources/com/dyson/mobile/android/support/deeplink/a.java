package com.dyson.mobile.android.support.deeplink;

import com.dyson.mobile.android.dynamiccontent.deeplinks.DynamicContentDeepLink;
import com.dyson.mobile.android.logging.Logger;
import com.dyson.mobile.android.machinetype.MachineDefinition;
import com.dyson.mobile.android.machinetype.MachineDescriptor;
import com.dyson.mobile.android.support.deeplink.DeepLinkAction;
import com.paypal.android.platform.authsdk.BR;
import h12.f0;
import h12.r;
import hj.e;
import ij.f;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import l12.d;
import mj.m;
import n12.e;
import n12.i;
import z32.c0;
import z32.g0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
@e(c = "com.dyson.mobile.android.support.deeplink.SupportDeeplinkHandler$parseSupportDeeplinkEventAndNavigateToAction$2", f = "SupportDeeplinkHandler.kt", l = {BR.passwordErrorVisibility}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class a extends i implements Function2<c0, d<? super f0>, Object> {
    public int d;
    public final /* synthetic */ b e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ String f16816f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ MachineDefinition f16817g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ String f16818h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, String str, MachineDefinition machineDefinition, String str2, d<? super a> dVar) {
        super(2, dVar);
        this.e = bVar;
        this.f16816f = str;
        this.f16817g = machineDefinition;
        this.f16818h = str2;
    }

    @Override // n12.a
    public final d<f0> create(Object obj, d<?> dVar) {
        return new a(this.e, this.f16816f, this.f16817g, this.f16818h, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(c0 c0Var, d<? super f0> dVar) {
        return ((a) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
    }

    @Override // n12.a
    public final Object invokeSuspend(Object obj) {
        DeepLinkAction deepLinkAction;
        Object obj2 = m12.a.COROUTINE_SUSPENDED;
        int i13 = this.d;
        if (i13 == 0) {
            r.b(obj);
            b bVar = this.e;
            bVar.getClass();
            hj.e eVar = bVar.e;
            String str = this.f16816f;
            str.getClass();
            DynamicContentDeepLink a13 = bVar.f16819a.a(str);
            if (a13 != null) {
                if (a13 instanceof DynamicContentDeepLink.g) {
                    MachineDefinition machineDefinition = this.f16817g;
                    String str2 = machineDefinition.d.d;
                    MachineDescriptor machineDescriptor = machineDefinition.f15569q;
                    String str3 = this.f16818h;
                    if (str3 == null) {
                        str3 = ((DynamicContentDeepLink.g) a13).f14036a;
                    }
                    deepLinkAction = new DeepLinkAction.OpenErrorSupportScreen(str2, machineDescriptor, str3);
                } else if (a13 instanceof DynamicContentDeepLink.m0) {
                    DynamicContentDeepLink.m0 m0Var = (DynamicContentDeepLink.m0) a13;
                    deepLinkAction = new DeepLinkAction.OpenResolveContentUrl(bVar.f16820b.a(m0Var.f14047a, m0Var.f14048b));
                } else if (a13 instanceof DynamicContentDeepLink.t) {
                    f a14 = new m("ai_assistant", m.b.WEB_VIEW, m.a.MACHINE_HOME, null, null, 24, null).a();
                    e.a aVar = hj.e.f38312g;
                    eVar.g(a14, null);
                    deepLinkAction = new DeepLinkAction.OpenAiChatBot(null, null, null, 7, null);
                } else if (a13 instanceof DynamicContentDeepLink.z) {
                    f a15 = new m("ai_assistant", m.b.WEB_VIEW, m.a.MACHINE_HOME, null, null, 24, null).a();
                    e.a aVar2 = hj.e.f38312g;
                    eVar.g(a15, null);
                    DynamicContentDeepLink.z zVar = (DynamicContentDeepLink.z) a13;
                    deepLinkAction = new DeepLinkAction.OpenAiChatBot(zVar.f14069a, zVar.f14070b, zVar.f14071c);
                } else {
                    Logger.b("Deeplink not supported: ".concat(str), null);
                    deepLinkAction = null;
                }
                if (deepLinkAction != null) {
                    this.d = 1;
                    Object v13 = g0.v(bVar.d.a(), new p71.b(bVar, deepLinkAction, null), this);
                    if (v13 != obj2) {
                        v13 = f0.f36844a;
                    }
                    if (v13 == obj2) {
                        return obj2;
                    }
                }
            }
            return null;
        } else if (i13 != 1) {
            pa.c.w("call to 'resume' before 'invoke' with coroutine");
            return null;
        } else {
            r.b(obj);
        }
        return f0.f36844a;
    }
}
