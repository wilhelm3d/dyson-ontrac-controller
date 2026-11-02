package com.dyson.nst.dyson3d.schema;

import com.dyson.nst.dyson3d.schema.model.AnimationDefinition;
import com.dyson.nst.dyson3d.schema.model.PropertyAnimation;
import com.salesforce.marketingcloud.push.g;
import h12.f0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import tg1.f;
import x12.t;
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltg1/f;", g.f21676h, "Lh12/f0;", "invoke", "(Ltg1/f;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class AnimationBuilder$create$1 extends t implements Function1<f, f0> {
    final /* synthetic */ AnimationDefinition $definition;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimationBuilder$create$1(AnimationDefinition animationDefinition) {
        super(1);
        this.$definition = animationDefinition;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(f fVar) {
        fVar.getClass();
        fVar.setHidden(((PropertyAnimation.Hidden) ((AnimationDefinition.Property) this.$definition).getAnimation()).isHidden());
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ f0 invoke(f fVar) {
        invoke2(fVar);
        return f0.f36844a;
    }
}
