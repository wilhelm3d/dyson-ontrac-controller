package com.dyson.nst.dyson3d.schema.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/model/DecodableAttachmentInitialProperties;", "", "hidden", "", "transform", "Lcom/dyson/nst/dyson3d/schema/model/Transform;", "(ZLcom/dyson/nst/dyson3d/schema/model/Transform;)V", "getHidden", "()Z", "getTransform", "()Lcom/dyson/nst/dyson3d/schema/model/Transform;", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DecodableAttachmentInitialProperties {
    public static final int $stable = 8;
    private final boolean hidden;
    private final Transform transform;

    public /* synthetic */ DecodableAttachmentInitialProperties(boolean z13, Transform transform, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(z13, (i13 & 2) != 0 ? null : transform);
    }

    public final boolean getHidden() {
        return this.hidden;
    }

    public final Transform getTransform() {
        return this.transform;
    }

    public DecodableAttachmentInitialProperties(boolean z13, Transform transform) {
        this.hidden = z13;
        this.transform = transform;
    }
}
