package com.dyson.nst.dyson3d.schema;

import android.annotation.SuppressLint;
import com.dyson.nst.dyson3d.schema.model.AnimationDefinition;
import com.dyson.nst.dyson3d.schema.model.DecodableAttachment;
import com.dyson.nst.dyson3d.schema.model.DecodableAttachments;
import com.dyson.nst.dyson3d.schema.model.Schema;
import i12.e0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jg1.b;
import kg1.a;
import kg1.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sg1.d;
import tg1.f;
import w32.b;
import w32.d;
import w32.e;
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ+\u0010\u0011\u001a\f\u0012\u0004\u0012\u00020\u000f0\u000ej\u0002`\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000ej\u0004\u0018\u0001`\u00102\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000ej\u0004\u0018\u0001`\u00102\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001e\u001a\u00020\u001bH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001b2\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\f\u0012\u0004\u0012\u00020\u000f0\u000ej\u0002`\u00102\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b!\u0010\"J+\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000ej\u0004\u0018\u0001`\u00102\u0006\u0010\u000b\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010'\u001a\u0004\b(\u0010)R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001a\u00100\u001a\u00020/8\u0002X\u0083\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b0\u00101R\"\u00103\u001a\u0004\u0018\u00010\n2\b\u00102\u001a\u0004\u0018\u00010\n8\u0002@BX\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R \u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\n058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R0\u00109\u001a\b\u0012\u0004\u0012\u00020\u0018082\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u0018088\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0013\u0010?\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b=\u0010>\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006@"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/SceneAttachmentsCoordinator;", "", "Lcom/dyson/nst/dyson3d/schema/model/Schema;", "schema", "Lcom/dyson/nst/dyson3d/schema/SceneAnimationCoordinator;", "animationCoordinator", "Ljg1/b;", "scene", "<init>", "(Lcom/dyson/nst/dyson3d/schema/model/Schema;Lcom/dyson/nst/dyson3d/schema/SceneAnimationCoordinator;Ljg1/b;)V", "Lcom/dyson/nst/dyson3d/schema/AttachmentComponent;", "attachment", "", "animated", "Lkg1/a;", "Ltg1/f;", "Lcom/dyson/nst/dyson3d/filament/animation/NodeAnimator;", "changeAttachment", "(Lcom/dyson/nst/dyson3d/schema/AttachmentComponent;Z)Lkg1/a;", "createAttachAnimation", "(Lcom/dyson/nst/dyson3d/schema/AttachmentComponent;)Lkg1/a;", "createDetachAnimation", "", "name", "Lcom/dyson/nst/dyson3d/schema/Attachment;", "attachmentNamed", "(Ljava/lang/String;)Lcom/dyson/nst/dyson3d/schema/Attachment;", "Lh12/f0;", "initialConfigure$Dyson3D_release", "()V", "initialConfigure", "applyDefaultAttachment", "(Z)V", "removeAttachment", "(Z)Lkg1/a;", "(Lcom/dyson/nst/dyson3d/schema/Attachment;Z)Lkg1/a;", "Lcom/dyson/nst/dyson3d/schema/model/Schema;", "getSchema", "()Lcom/dyson/nst/dyson3d/schema/model/Schema;", "Lcom/dyson/nst/dyson3d/schema/SceneAnimationCoordinator;", "getAnimationCoordinator", "()Lcom/dyson/nst/dyson3d/schema/SceneAnimationCoordinator;", "Ljg1/b;", "getScene", "()Ljg1/b;", "setScene", "(Ljg1/b;)V", "Lw32/b;", "defaultAnimationDuration", "J", "<set-?>", "currentAttachment", "Lcom/dyson/nst/dyson3d/schema/AttachmentComponent;", "", "cachedAttachments", "Ljava/util/Map;", "", "availableAttachments", "Ljava/util/List;", "getAvailableAttachments", "()Ljava/util/List;", "getDefaultAttachment", "()Lcom/dyson/nst/dyson3d/schema/Attachment;", "defaultAttachment", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SceneAttachmentsCoordinator {
    public static final int $stable = 8;
    private final SceneAnimationCoordinator animationCoordinator;
    private List<Attachment> availableAttachments;
    private final Map<String, AttachmentComponent> cachedAttachments;
    private AttachmentComponent currentAttachment;
    @SuppressLint({"TimeUnitsSuffix"})
    private final long defaultAnimationDuration;
    private b scene;
    private final Schema schema;

    public SceneAttachmentsCoordinator(Schema schema, SceneAnimationCoordinator sceneAnimationCoordinator, b bVar) {
        Map<String, DecodableAttachment> allAttachments;
        schema.getClass();
        sceneAnimationCoordinator.getClass();
        this.schema = schema;
        this.animationCoordinator = sceneAnimationCoordinator;
        this.scene = bVar;
        b.a aVar = w32.b.e;
        this.defaultAnimationDuration = d.f(0.5d, e.SECONDS);
        this.cachedAttachments = new LinkedHashMap();
        DecodableAttachments attachments = schema.getAttachments();
        if (attachments != null && (allAttachments = attachments.getAllAttachments()) != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : allAttachments.keySet()) {
                Attachment attachmentNamed = attachmentNamed(str);
                if (attachmentNamed != null) {
                    arrayList.add(attachmentNamed);
                }
            }
            this.availableAttachments = arrayList;
        }
        this.availableAttachments = e0.d;
    }

    public static /* synthetic */ void applyDefaultAttachment$default(SceneAttachmentsCoordinator sceneAttachmentsCoordinator, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z13 = false;
        }
        sceneAttachmentsCoordinator.applyDefaultAttachment(z13);
    }

    private final a<f> changeAttachment(AttachmentComponent attachmentComponent, boolean z13) {
        f fVar;
        ug1.a<f> k13;
        ArrayList arrayList = new ArrayList();
        AttachmentComponent attachmentComponent2 = this.currentAttachment;
        if (attachmentComponent2 != null) {
            if (z13) {
                a<f> createDetachAnimation = createDetachAnimation(attachmentComponent2);
                if (createDetachAnimation == null) {
                    createDetachAnimation = new kg1.e(this.defaultAnimationDuration, attachmentComponent2.getDetachedPosition(), attachmentComponent2.getDetachedRotation(), null, d.a.f76140b, null);
                }
                arrayList.add(new c(createDetachAnimation, attachmentComponent2.getNode()));
            } else {
                attachmentComponent2.getNode().q(attachmentComponent2.getDetachedPosition());
                attachmentComponent2.getNode().r(attachmentComponent2.getDetachedRotation());
                attachmentComponent2.getNode().setHidden(attachmentComponent2.getAttachment().getSchemaInfo().getInitialDetachedProperties().getHidden());
            }
            fVar = attachmentComponent2.getNode();
        } else {
            fVar = null;
        }
        if (attachmentComponent != null) {
            if (z13) {
                a<f> createAttachAnimation = createAttachAnimation(attachmentComponent);
                if (createAttachAnimation == null) {
                    createAttachAnimation = new kg1.e(this.defaultAnimationDuration, attachmentComponent.getInitialPosition(), attachmentComponent.getInitialRotation(), null, d.a.f76140b, null);
                }
                arrayList.add(new c(createAttachAnimation, attachmentComponent.getNode()));
            } else {
                attachmentComponent.getNode().q(attachmentComponent.getInitialPosition());
                attachmentComponent.getNode().r(attachmentComponent.getInitialRotation());
                attachmentComponent.getNode().setHidden(attachmentComponent.getAttachment().getSchemaInfo().getInitialAttachedProperties().getHidden());
            }
            fVar = attachmentComponent.getNode();
            this.currentAttachment = attachmentComponent;
        }
        this.currentAttachment = attachmentComponent;
        kg1.d dVar = new kg1.d(arrayList);
        if (fVar != null && (k13 = fVar.k()) != null) {
            k13.f82020a.add(dVar);
        }
        return dVar;
    }

    private final a<f> createAttachAnimation(AttachmentComponent attachmentComponent) {
        Map<String, AnimationDefinition> animations;
        a<f> create;
        Map<String, DecodableAttachment> allAttachments;
        DecodableAttachments attachments = this.schema.getAttachments();
        DecodableAttachment decodableAttachment = (attachments == null || (allAttachments = attachments.getAllAttachments()) == null) ? null : allAttachments.get(attachmentComponent.getAttachment().getSchemaName());
        DecodableAttachments attachments2 = this.schema.getAttachments();
        if (attachments2 != null && (animations = attachments2.getAnimations()) != null) {
            AnimationDefinition animationDefinition = animations.get(decodableAttachment != null ? decodableAttachment.getAttachAnimation() : null);
            if (animationDefinition != null) {
                create = SceneAttachmentsCoordinatorKt.create(new AnimationBuilder(this.scene), animationDefinition, attachmentComponent);
                return create;
            }
        }
        return null;
    }

    private final a<f> createDetachAnimation(AttachmentComponent attachmentComponent) {
        Map<String, AnimationDefinition> animations;
        a<f> create;
        Map<String, DecodableAttachment> allAttachments;
        DecodableAttachments attachments = this.schema.getAttachments();
        DecodableAttachment decodableAttachment = (attachments == null || (allAttachments = attachments.getAllAttachments()) == null) ? null : allAttachments.get(attachmentComponent.getAttachment().getSchemaName());
        DecodableAttachments attachments2 = this.schema.getAttachments();
        if (attachments2 != null && (animations = attachments2.getAnimations()) != null) {
            AnimationDefinition animationDefinition = animations.get(decodableAttachment != null ? decodableAttachment.getDetachAnimation() : null);
            if (animationDefinition != null) {
                create = SceneAttachmentsCoordinatorKt.create(new AnimationBuilder(this.scene), animationDefinition, attachmentComponent);
                return create;
            }
        }
        return null;
    }

    public final void applyDefaultAttachment(boolean z13) {
        Attachment defaultAttachment = getDefaultAttachment();
        if (defaultAttachment == null) {
            return;
        }
        changeAttachment(defaultAttachment, z13);
    }

    public final Attachment attachmentNamed(String str) {
        DecodableAttachment decodableAttachment;
        str.getClass();
        DecodableAttachments attachments = this.schema.getAttachments();
        if (attachments == null || (decodableAttachment = attachments.getAllAttachments().get(str)) == null) {
            return null;
        }
        return new Attachment(decodableAttachment.getNode(), decodableAttachment.getName(), str, decodableAttachment, decodableAttachment.getContainingFile());
    }

    public final SceneAnimationCoordinator getAnimationCoordinator() {
        return this.animationCoordinator;
    }

    public final List<Attachment> getAvailableAttachments() {
        return this.availableAttachments;
    }

    public final Attachment getDefaultAttachment() {
        String defaultAttachment;
        DecodableAttachments attachments = this.schema.getAttachments();
        if (attachments == null || (defaultAttachment = attachments.getDefaultAttachment()) == null) {
            return null;
        }
        return attachmentNamed(defaultAttachment);
    }

    public final jg1.b getScene() {
        return this.scene;
    }

    public final Schema getSchema() {
        return this.schema;
    }

    public final void initialConfigure$Dyson3D_release() {
        Map<String, DecodableAttachment> allAttachments;
        DecodableAttachments attachments = this.schema.getAttachments();
        if (attachments == null || (allAttachments = attachments.getAllAttachments()) == null) {
            return;
        }
        for (Map.Entry<String, DecodableAttachment> entry : allAttachments.entrySet()) {
            jg1.b bVar = this.scene;
            f d = bVar != null ? bVar.d(entry.getValue().getNode()) : null;
            if (d != null) {
                d.setHidden(true);
            }
        }
    }

    public final a<f> removeAttachment(boolean z13) {
        return changeAttachment((AttachmentComponent) null, z13);
    }

    public final void setScene(jg1.b bVar) {
        this.scene = bVar;
    }

    public /* synthetic */ SceneAttachmentsCoordinator(Schema schema, SceneAnimationCoordinator sceneAnimationCoordinator, jg1.b bVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(schema, sceneAnimationCoordinator, (i13 & 4) != 0 ? null : bVar);
    }

    public final a<f> changeAttachment(Attachment attachment, boolean z13) {
        f d;
        attachment.getClass();
        jg1.b bVar = this.scene;
        if (bVar == null || (d = bVar.d(attachment.getNode())) == null) {
            return null;
        }
        AttachmentComponent attachmentComponent = this.cachedAttachments.get(attachment.getNode());
        if (attachmentComponent == null) {
            attachmentComponent = new AttachmentComponent(attachment, d, d.getPosition(), d.m());
        }
        this.cachedAttachments.put(attachment.getNode(), attachmentComponent);
        return changeAttachment(attachmentComponent, z13);
    }
}
