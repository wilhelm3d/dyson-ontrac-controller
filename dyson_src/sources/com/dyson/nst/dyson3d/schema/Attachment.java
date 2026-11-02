package com.dyson.nst.dyson3d.schema;

import com.dyson.nst.dyson3d.schema.model.DecodableAttachment;
import com.dyson.nst.dyson3d.schema.model.Transform;
import com.dyson.nst.dyson3d.schema.model.TransformComponent;
import kotlin.Metadata;
import yy1.b;
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000b\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0013\u0010\rR\u0014\u0010\u0017\u001a\u00020\u00148@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00148@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/Attachment;", "", "", "node", "name", "schemaName", "Lcom/dyson/nst/dyson3d/schema/model/DecodableAttachment;", "schemaInfo", "modelFile", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/dyson/nst/dyson3d/schema/model/DecodableAttachment;Ljava/lang/String;)V", "Ljava/lang/String;", "getNode", "()Ljava/lang/String;", "getName", "getSchemaName", "Lcom/dyson/nst/dyson3d/schema/model/DecodableAttachment;", "getSchemaInfo", "()Lcom/dyson/nst/dyson3d/schema/model/DecodableAttachment;", "getModelFile", "Lyy1/b;", "getFallbackDeltaDetachedPosition$Dyson3D_release", "()Lyy1/b;", "fallbackDeltaDetachedPosition", "getFallbackDeltaDetachedRotation$Dyson3D_release", "fallbackDeltaDetachedRotation", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Attachment {
    public static final int $stable = 8;
    private final String modelFile;
    private final String name;
    private final String node;
    private final DecodableAttachment schemaInfo;
    private final String schemaName;

    public Attachment(String str, String str2, String str3, DecodableAttachment decodableAttachment, String str4) {
        str.getClass();
        str3.getClass();
        decodableAttachment.getClass();
        this.node = str;
        this.name = str2;
        this.schemaName = str3;
        this.schemaInfo = decodableAttachment;
        this.modelFile = str4;
    }

    public final b getFallbackDeltaDetachedPosition$Dyson3D_release() {
        TransformComponent position;
        b vector;
        Transform transform = this.schemaInfo.getInitialDetachedProperties().getTransform();
        return (transform == null || (position = transform.getPosition()) == null || (vector = position.getVector()) == null) ? new b(0.0f) : vector;
    }

    public final b getFallbackDeltaDetachedRotation$Dyson3D_release() {
        TransformComponent rotation;
        b vector;
        Transform transform = this.schemaInfo.getInitialDetachedProperties().getTransform();
        return (transform == null || (rotation = transform.getRotation()) == null || (vector = rotation.getVector()) == null) ? new b(0.0f) : vector;
    }

    public final String getModelFile() {
        return this.modelFile;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNode() {
        return this.node;
    }

    public final DecodableAttachment getSchemaInfo() {
        return this.schemaInfo;
    }

    public final String getSchemaName() {
        return this.schemaName;
    }
}
