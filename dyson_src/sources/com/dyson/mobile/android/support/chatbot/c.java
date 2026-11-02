package com.dyson.mobile.android.support.chatbot;

import androidx.lifecycle.LifecycleOwner;
import b31.j;
import com.dyson.mobile.android.support.chatbot.a;
import com.dyson.mobile.android.support.chatbot.d;
import h12.f0;
import h12.r;
import h71.k;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import n12.i;
import z32.c0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
@n12.e(c = "com.dyson.mobile.android.support.chatbot.ChatBotViewKt$ChatBotView$3$1", f = "ChatBotView.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class c extends i implements Function2<c0, l12.d<? super f0>, Object> {
    public final /* synthetic */ e d;
    public final /* synthetic */ LifecycleOwner e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ hu0.d f16789f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ c0 f16790g;

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ androidx.compose.material.d f16791h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, LifecycleOwner lifecycleOwner, hu0.d dVar, c0 c0Var, androidx.compose.material.d dVar2, l12.d<? super c> dVar3) {
        super(2, dVar3);
        this.d = eVar;
        this.e = lifecycleOwner;
        this.f16789f = dVar;
        this.f16790g = c0Var;
        this.f16791h = dVar2;
    }

    @Override // n12.a
    public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
        return new c(this.d, this.e, this.f16789f, this.f16790g, this.f16791h, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
        return ((c) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
    }

    @Override // n12.a
    public final Object invokeSuspend(Object obj) {
        m12.a aVar = m12.a.COROUTINE_SUSPENDED;
        r.b(obj);
        e eVar = this.d;
        xf1.a<a.AbstractC0602a> aVar2 = eVar.f16795h;
        hu0.d dVar = this.f16789f;
        c0 c0Var = this.f16790g;
        androidx.compose.material.d dVar2 = this.f16791h;
        d.b bVar = new d.b(new j(dVar, eVar, c0Var, dVar2));
        LifecycleOwner lifecycleOwner = this.e;
        aVar2.observe(lifecycleOwner, bVar);
        eVar.f16793f.observe(lifecycleOwner, new d.b(new k(c0Var, dVar2)));
        eVar.f16794g.observe(lifecycleOwner, new d.b(new gf1.i(18, dVar, eVar)));
        return f0.f36844a;
    }
}
