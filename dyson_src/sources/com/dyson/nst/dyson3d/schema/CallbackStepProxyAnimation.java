package com.dyson.nst.dyson3d.schema;

import h12.f0;
import kg1.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/CallbackStepProxyAnimation;", "NodeType", "Lkg1/a;", "Lkotlin/Function1;", "Lh12/f0;", "callback", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "node", "", "frameTime", "apply", "(Ljava/lang/Object;D)V", "Lkotlin/jvm/functions/Function1;", "getCallback", "()Lkotlin/jvm/functions/Function1;", "", "called", "Z", "getHasEnded", "()Z", "hasEnded", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CallbackStepProxyAnimation<NodeType> implements a<NodeType> {
    public static final int $stable = 8;
    private final Function1<NodeType, f0> callback;
    private boolean called;

    /* JADX WARN: Multi-variable type inference failed */
    public CallbackStepProxyAnimation(Function1<? super NodeType, f0> function1) {
        function1.getClass();
        this.callback = function1;
    }

    @Override // kg1.a
    public void apply(NodeType nodetype, double d) {
        this.callback.invoke(nodetype);
        this.called = true;
    }

    public final Function1<NodeType, f0> getCallback() {
        return this.callback;
    }

    @Override // kg1.a
    public boolean getHasEnded() {
        return this.called;
    }
}
