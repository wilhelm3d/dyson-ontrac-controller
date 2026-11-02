package com.dyson.nst.dyson3d.schema;

import com.dyson.nst.dyson3d.schema.model.AnimationDefinition;
import com.paypal.android.platform.authsdk.authcommon.AuthAnalyticsConstants;
import kg1.a;
import kotlin.Metadata;
import tg1.f;
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/AnimationBuilder;", "Lcom/dyson/nst/dyson3d/schema/model/AnimationDefinition;", "definition", "Lcom/dyson/nst/dyson3d/schema/AttachmentComponent;", AuthAnalyticsConstants.COMPONENT_KEY, "Lkg1/a;", "Ltg1/f;", "Lcom/dyson/nst/dyson3d/filament/animation/NodeAnimator;", "create", "(Lcom/dyson/nst/dyson3d/schema/AnimationBuilder;Lcom/dyson/nst/dyson3d/schema/model/AnimationDefinition;Lcom/dyson/nst/dyson3d/schema/AttachmentComponent;)Lkg1/a;", "Dyson3D_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SceneAttachmentsCoordinatorKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final a<f> create(AnimationBuilder animationBuilder, AnimationDefinition animationDefinition, AttachmentComponent attachmentComponent) {
        return animationBuilder.create(animationDefinition, attachmentComponent.getInitialPosition(), attachmentComponent.getInitialRotation());
    }
}
