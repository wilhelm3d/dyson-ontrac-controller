package com.dyson.nst.dyson3d.schema;

import kotlin.Metadata;
import tg1.f;
import u3.d2;
import yy1.b;
import yy1.g;
/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0018\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/AttachmentComponent;", "", "Lcom/dyson/nst/dyson3d/schema/Attachment;", "attachment", "Ltg1/f;", "node", "Lyy1/b;", "initialPosition", "initialRotation", "<init>", "(Lcom/dyson/nst/dyson3d/schema/Attachment;Ltg1/f;Lyy1/b;Lyy1/b;)V", "Lcom/dyson/nst/dyson3d/schema/Attachment;", "getAttachment", "()Lcom/dyson/nst/dyson3d/schema/Attachment;", "Ltg1/f;", "getNode", "()Ltg1/f;", "Lyy1/b;", "getInitialPosition", "()Lyy1/b;", "getInitialRotation", "getDetachedPosition", "detachedPosition", "getDetachedRotation", "detachedRotation", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AttachmentComponent {
    private final Attachment attachment;
    private final b initialPosition;
    private final b initialRotation;
    private final f node;

    public AttachmentComponent(Attachment attachment, f fVar, b bVar, b bVar2) {
        attachment.getClass();
        fVar.getClass();
        bVar.getClass();
        bVar2.getClass();
        this.attachment = attachment;
        this.node = fVar;
        this.initialPosition = bVar;
        this.initialRotation = bVar2;
    }

    public final Attachment getAttachment() {
        return this.attachment;
    }

    public final b getDetachedPosition() {
        b bVar = this.initialPosition;
        b fallbackDeltaDetachedPosition$Dyson3D_release = this.attachment.getFallbackDeltaDetachedPosition$Dyson3D_release();
        return new b(bVar.f91166a + fallbackDeltaDetachedPosition$Dyson3D_release.f91166a, bVar.f91167b + fallbackDeltaDetachedPosition$Dyson3D_release.f91167b, bVar.f91168c + fallbackDeltaDetachedPosition$Dyson3D_release.f91168c);
    }

    public final b getDetachedRotation() {
        b fallbackDeltaDetachedRotation$Dyson3D_release = this.attachment.getFallbackDeltaDetachedRotation$Dyson3D_release();
        g.a aVar = g.e;
        g b13 = g.a.b(aVar, fallbackDeltaDetachedRotation$Dyson3D_release);
        g b14 = g.a.b(aVar, this.initialRotation);
        float f13 = b13.d;
        float f14 = b14.f91178a;
        float f15 = b13.f91178a;
        float f16 = b14.d;
        float f17 = b13.f91179b;
        float f18 = b14.f91180c;
        float f19 = b13.f91180c;
        float f23 = b14.f91179b;
        return d2.i(new g(((f17 * f18) + ((f15 * f16) + (f13 * f14))) - (f19 * f23), (f19 * f14) + (f17 * f16) + ((f13 * f23) - (f15 * f18)), (f19 * f16) + (((f15 * f23) + (f13 * f18)) - (f17 * f14)), (((f13 * f16) - (f15 * f14)) - (f17 * f23)) - (f19 * f18)));
    }

    public final b getInitialPosition() {
        return this.initialPosition;
    }

    public final b getInitialRotation() {
        return this.initialRotation;
    }

    public final f getNode() {
        return this.node;
    }
}
