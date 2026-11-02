package com.dyson.nst.dyson3d.schema.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/model/DecodableAttachment;", "", "node", "", "name", "containingFile", "initialAttachedProperties", "Lcom/dyson/nst/dyson3d/schema/model/DecodableAttachmentInitialProperties;", "initialDetachedProperties", "attachAnimation", "detachAnimation", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/dyson/nst/dyson3d/schema/model/DecodableAttachmentInitialProperties;Lcom/dyson/nst/dyson3d/schema/model/DecodableAttachmentInitialProperties;Ljava/lang/String;Ljava/lang/String;)V", "getAttachAnimation", "()Ljava/lang/String;", "getContainingFile", "getDetachAnimation", "getInitialAttachedProperties", "()Lcom/dyson/nst/dyson3d/schema/model/DecodableAttachmentInitialProperties;", "getInitialDetachedProperties", "getName", "getNode", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DecodableAttachment {
    public static final int $stable = 8;
    private final String attachAnimation;
    private final String containingFile;
    private final String detachAnimation;
    private final DecodableAttachmentInitialProperties initialAttachedProperties;
    private final DecodableAttachmentInitialProperties initialDetachedProperties;
    private final String name;
    private final String node;

    public /* synthetic */ DecodableAttachment(String str, String str2, String str3, DecodableAttachmentInitialProperties decodableAttachmentInitialProperties, DecodableAttachmentInitialProperties decodableAttachmentInitialProperties2, String str4, String str5, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i13 & 8) != 0 ? new DecodableAttachmentInitialProperties(false, null, 2, null) : decodableAttachmentInitialProperties, (i13 & 16) != 0 ? new DecodableAttachmentInitialProperties(true, null, 2, null) : decodableAttachmentInitialProperties2, str4, str5);
    }

    public final String getAttachAnimation() {
        return this.attachAnimation;
    }

    public final String getContainingFile() {
        return this.containingFile;
    }

    public final String getDetachAnimation() {
        return this.detachAnimation;
    }

    public final DecodableAttachmentInitialProperties getInitialAttachedProperties() {
        return this.initialAttachedProperties;
    }

    public final DecodableAttachmentInitialProperties getInitialDetachedProperties() {
        return this.initialDetachedProperties;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNode() {
        return this.node;
    }

    public DecodableAttachment(String str, String str2, String str3, DecodableAttachmentInitialProperties decodableAttachmentInitialProperties, DecodableAttachmentInitialProperties decodableAttachmentInitialProperties2, String str4, String str5) {
        str.getClass();
        decodableAttachmentInitialProperties.getClass();
        decodableAttachmentInitialProperties2.getClass();
        this.node = str;
        this.name = str2;
        this.containingFile = str3;
        this.initialAttachedProperties = decodableAttachmentInitialProperties;
        this.initialDetachedProperties = decodableAttachmentInitialProperties2;
        this.attachAnimation = str4;
        this.detachAnimation = str5;
    }
}
