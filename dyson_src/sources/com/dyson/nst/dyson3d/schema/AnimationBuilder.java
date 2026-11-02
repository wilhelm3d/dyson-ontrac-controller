package com.dyson.nst.dyson3d.schema;

import com.dyson.nst.dyson3d.schema.model.AnimationDefinition;
import com.dyson.nst.dyson3d.schema.model.PropertyAnimation;
import com.dyson.nst.dyson3d.schema.model.TransformComponent;
import i12.e0;
import i12.u;
import java.util.ArrayList;
import java.util.List;
import jg1.b;
import kg1.a;
import kg1.c;
import kg1.d;
import kotlin.Metadata;
import ma.e;
import tg1.f;
import u3.d2;
import w32.b;
import yy1.g;
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J3\u0010\u000e\u001a\f\u0012\u0004\u0012\u00020\f0\u000bj\u0002`\r2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/AnimationBuilder;", "", "Ljg1/b;", "scene", "<init>", "(Ljg1/b;)V", "Lcom/dyson/nst/dyson3d/schema/model/AnimationDefinition;", "definition", "Lyy1/b;", "initialPosition", "initialRotation", "Lkg1/a;", "Ltg1/f;", "Lcom/dyson/nst/dyson3d/filament/animation/NodeAnimator;", "create", "(Lcom/dyson/nst/dyson3d/schema/model/AnimationDefinition;Lyy1/b;Lyy1/b;)Lkg1/a;", "Ljg1/b;", "getScene", "()Ljg1/b;", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AnimationBuilder {
    public static final int $stable = 8;
    private final b scene;

    public AnimationBuilder(b bVar) {
        this.scene = bVar;
    }

    public static /* synthetic */ a create$default(AnimationBuilder animationBuilder, AnimationDefinition animationDefinition, yy1.b bVar, yy1.b bVar2, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            bVar = new yy1.b(0.0f);
        }
        if ((i13 & 4) != 0) {
            bVar2 = new yy1.b(0.0f);
        }
        return animationBuilder.create(animationDefinition, bVar, bVar2);
    }

    public final a<f> create(AnimationDefinition animationDefinition, yy1.b bVar, yy1.b bVar2) {
        yy1.b bVar3;
        b bVar4;
        f d;
        yy1.b vector;
        yy1.b vector2;
        animationDefinition.getClass();
        bVar.getClass();
        bVar2.getClass();
        if (animationDefinition instanceof AnimationDefinition.Concurrent) {
            List<AnimationDefinition> animations = ((AnimationDefinition.Concurrent) animationDefinition).getAnimations();
            ArrayList arrayList = new ArrayList(u.o(animations, 10));
            for (AnimationDefinition animationDefinition2 : animations) {
                arrayList.add(create(animationDefinition2, bVar, bVar2));
            }
            return new kg1.b(arrayList);
        } else if (animationDefinition instanceof AnimationDefinition.Named) {
            return new d(e0.d);
        } else {
            yy1.b bVar5 = null;
            if (!(animationDefinition instanceof AnimationDefinition.Property)) {
                if (!(animationDefinition instanceof AnimationDefinition.Sequence)) {
                    e.o();
                    return null;
                }
                List<AnimationDefinition> animations2 = ((AnimationDefinition.Sequence) animationDefinition).getAnimations();
                ArrayList arrayList2 = new ArrayList(u.o(animations2, 10));
                for (AnimationDefinition animationDefinition3 : animations2) {
                    arrayList2.add(create(animationDefinition3, bVar, bVar2));
                }
                return new d(arrayList2);
            }
            AnimationDefinition.Property property = (AnimationDefinition.Property) animationDefinition;
            PropertyAnimation animation = property.getAnimation();
            if (animation instanceof PropertyAnimation.Hidden) {
                return new CallbackStepProxyAnimation(new AnimationBuilder$create$1(animationDefinition));
            }
            if (animation instanceof PropertyAnimation.Other) {
                return new d(e0.d);
            }
            if (!(animation instanceof PropertyAnimation.Transform)) {
                e.o();
                return null;
            }
            TransformComponent rotation = ((PropertyAnimation.Transform) property.getAnimation()).getTransform().getRotation();
            if (rotation == null || (vector2 = rotation.getVector()) == null) {
                bVar3 = null;
            } else {
                g.a aVar = g.e;
                g b13 = g.a.b(aVar, vector2);
                g b14 = g.a.b(aVar, bVar2);
                float f13 = b13.d;
                float f14 = b14.f91178a;
                float f15 = b13.f91178a;
                float f16 = b14.d;
                float f17 = b13.f91179b;
                float f18 = b14.f91180c;
                float f19 = b13.f91180c;
                float f23 = b14.f91179b;
                bVar3 = d2.i(new g(((f17 * f18) + ((f15 * f16) + (f13 * f14))) - (f19 * f23), (f19 * f14) + (f17 * f16) + ((f13 * f23) - (f15 * f18)), (f19 * f16) + (((f15 * f23) + (f13 * f18)) - (f17 * f14)), (((f13 * f16) - (f15 * f14)) - (f17 * f23)) - (f19 * f18)));
            }
            b.a aVar2 = w32.b.e;
            long f24 = w32.d.f(property.getProperties().getDuration(), w32.e.SECONDS);
            TransformComponent position = ((PropertyAnimation.Transform) property.getAnimation()).getTransform().getPosition();
            if (position != null && (vector = position.getVector()) != null) {
                bVar5 = new yy1.b(vector.f91166a + bVar.f91166a, vector.f91167b + bVar.f91167b, vector.f91168c + bVar.f91168c);
            }
            kg1.e eVar = new kg1.e(f24, bVar5, bVar3, null, property.getProperties().getTimingCurve(), null);
            String node = property.getNode();
            return (node == null || (bVar4 = this.scene) == null || (d = bVar4.d(node)) == null) ? eVar : new c(eVar, d);
        }
    }

    public final jg1.b getScene() {
        return this.scene;
    }
}
