package com.dyson.nst.dyson3d.schema;

import com.dyson.nst.dyson3d.schema.model.AnimationDefinition;
import com.dyson.nst.dyson3d.schema.model.Schema;
import i12.c0;
import java.util.List;
import jg1.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tg1.f;
import ug1.a;
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000b\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/SceneAnimationCoordinator;", "", "Lcom/dyson/nst/dyson3d/schema/model/Schema;", "schema", "Ljg1/b;", "scene", "<init>", "(Lcom/dyson/nst/dyson3d/schema/model/Schema;Ljg1/b;)V", "Lcom/dyson/nst/dyson3d/schema/model/AnimationDefinition;", "animation", "Lh12/f0;", "playAnimation", "(Lcom/dyson/nst/dyson3d/schema/model/AnimationDefinition;)V", "", "named", "(Ljava/lang/String;)V", "Lcom/dyson/nst/dyson3d/schema/model/Schema;", "getSchema", "()Lcom/dyson/nst/dyson3d/schema/model/Schema;", "Ljg1/b;", "getScene", "()Ljg1/b;", "setScene", "(Ljg1/b;)V", "", "availableAnimations", "Ljava/util/List;", "getAvailableAnimations", "()Ljava/util/List;", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SceneAnimationCoordinator {
    public static final int $stable = 8;
    private final List<AnimationDefinition> availableAnimations;
    private b scene;
    private final Schema schema;

    public SceneAnimationCoordinator(Schema schema, b bVar) {
        schema.getClass();
        this.schema = schema;
        this.scene = bVar;
        this.availableAnimations = c0.A0(schema.getAnimations().values());
    }

    public final List<AnimationDefinition> getAvailableAnimations() {
        return this.availableAnimations;
    }

    public final b getScene() {
        return this.scene;
    }

    public final Schema getSchema() {
        return this.schema;
    }

    public final void playAnimation(AnimationDefinition animationDefinition) {
        List A0;
        f fVar;
        a<f> k13;
        animationDefinition.getClass();
        kg1.a<f> create$default = AnimationBuilder.create$default(new AnimationBuilder(this.scene), animationDefinition, null, null, 6, null);
        b bVar = this.scene;
        if (bVar == null || (A0 = c0.A0(bVar.f45128c)) == null || (fVar = (f) c0.P(A0)) == null || (k13 = fVar.k()) == null) {
            return;
        }
        create$default.getClass();
        k13.f82020a.add(create$default);
    }

    public final void setScene(b bVar) {
        this.scene = bVar;
    }

    public /* synthetic */ SceneAnimationCoordinator(Schema schema, b bVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(schema, (i13 & 2) != 0 ? null : bVar);
    }

    public final void playAnimation(String str) {
        str.getClass();
        AnimationDefinition animationDefinition = this.schema.getAnimations().get(str);
        if (animationDefinition == null) {
            return;
        }
        playAnimation(animationDefinition);
    }
}
