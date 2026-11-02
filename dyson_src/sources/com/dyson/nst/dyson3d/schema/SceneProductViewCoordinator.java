package com.dyson.nst.dyson3d.schema;

import com.dyson.nst.dyson3d.schema.model.AnimationState;
import com.dyson.nst.dyson3d.schema.model.Schema;
import com.dyson.nst.dyson3d.schema.model.TransformComponent;
import com.dyson.nst.dyson3d.schema.model.View;
import i12.c0;
import java.util.Iterator;
import java.util.List;
import jg1.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lg1.a;
import tg1.f;
import x12.r;
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R$\u0010#\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006)"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/SceneProductViewCoordinator;", "", "Lcom/dyson/nst/dyson3d/schema/model/Schema;", "schema", "Ljg1/b;", "scene", "<init>", "(Lcom/dyson/nst/dyson3d/schema/model/Schema;Ljg1/b;)V", "", "named", "Lcom/dyson/nst/dyson3d/schema/model/View;", "view", "(Ljava/lang/String;)Lcom/dyson/nst/dyson3d/schema/model/View;", "Lw32/b;", "animationDuration", "Lh12/f0;", "replaceView-HG0u8IE", "(Lcom/dyson/nst/dyson3d/schema/model/View;J)V", "replaceView", "showInitialView-LRDsOJo", "(J)V", "showInitialView", "Lcom/dyson/nst/dyson3d/schema/model/Schema;", "getSchema", "()Lcom/dyson/nst/dyson3d/schema/model/Schema;", "Ljg1/b;", "getScene", "()Ljg1/b;", "setScene", "(Ljg1/b;)V", "", "allViews", "Ljava/util/List;", "getAllViews", "()Ljava/util/List;", "currentView", "Lcom/dyson/nst/dyson3d/schema/model/View;", "getCurrentView", "()Lcom/dyson/nst/dyson3d/schema/model/View;", "setCurrentView", "(Lcom/dyson/nst/dyson3d/schema/model/View;)V", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SceneProductViewCoordinator {
    public static final int $stable = 8;
    private final List<View> allViews;
    private View currentView;
    private b scene;
    private final Schema schema;

    public SceneProductViewCoordinator(Schema schema, b bVar) {
        schema.getClass();
        this.schema = schema;
        this.scene = bVar;
        this.allViews = c0.A0(schema.getViews().values());
    }

    public final List<View> getAllViews() {
        return this.allViews;
    }

    public final View getCurrentView() {
        return this.currentView;
    }

    public final b getScene() {
        return this.scene;
    }

    public final Schema getSchema() {
        return this.schema;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: replaceView-HG0u8IE  reason: not valid java name */
    public final void m10replaceViewHG0u8IE(View view, long j8) {
        yy1.b bVar;
        yy1.b bVar2;
        yy1.b bVar3;
        boolean z13;
        view.getClass();
        b bVar4 = this.scene;
        if (bVar4 == null) {
            return;
        }
        for (String str : view.getHiddenNodes()) {
            f d = bVar4.d(str);
            if (d != null) {
                d.setHidden(true);
            }
        }
        for (String str2 : view.getVisibleNodes()) {
            f d13 = bVar4.d(str2);
            if (d13 != null) {
                d13.setHidden(false);
            }
        }
        for (AnimationState animationState : view.getStates()) {
            if (r.c(animationState.getNode(), "camera")) {
                a aVar = bVar4.f45129f;
                TransformComponent position = animationState.getTransform().getPosition();
                r3 = position != null ? position.getVector() : null;
                TransformComponent rotation = animationState.getTransform().getRotation();
                if (rotation == null || (bVar = rotation.getVector()) == null) {
                    bVar = new yy1.b(0.0f, 0.0f, 0.0f, 7, null);
                }
                w32.b.e.getClass();
                if (w32.b.d(j8, 0L) > 0) {
                    yy1.b bVar5 = r3;
                    bVar2 = bVar;
                    bVar3 = bVar5;
                    z13 = true;
                } else {
                    yy1.b bVar6 = r3;
                    bVar2 = bVar;
                    bVar3 = bVar6;
                    z13 = false;
                }
                SchemaSceneManagerKt.m12applyTransformzkXUZaI(aVar, bVar3, bVar2, j8, z13);
            } else {
                TransformHelper transformHelper = new TransformHelper();
                TransformComponent position2 = animationState.getTransform().getPosition();
                transformHelper.setPosition(position2 != null ? position2.getVector() : null);
                TransformComponent rotation2 = animationState.getTransform().getRotation();
                transformHelper.setRotation(rotation2 != null ? rotation2.getVector() : null);
                TransformComponent scale = animationState.getTransform().getScale();
                transformHelper.setScale(scale != null ? scale.getVector() : null);
                Iterator it = c0.A0(bVar4.f45128c).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (r.c(((f) next).getName(), animationState.getNode())) {
                        r3 = next;
                        break;
                    }
                }
                f fVar = (f) r3;
                if (fVar != null) {
                    w32.b.e.getClass();
                    transformHelper.m16applyToNode8Mi8wO0(fVar, j8, w32.b.d(j8, 0L) > 0);
                }
            }
        }
        this.currentView = view;
    }

    public final void setCurrentView(View view) {
        this.currentView = view;
    }

    public final void setScene(b bVar) {
        this.scene = bVar;
    }

    /* renamed from: showInitialView-LRDsOJo  reason: not valid java name */
    public final void m11showInitialViewLRDsOJo(long j8) {
        View defaultView = this.schema.getDefaultView();
        if (defaultView == null) {
            return;
        }
        m10replaceViewHG0u8IE(defaultView, j8);
    }

    public final View view(String str) {
        str.getClass();
        return this.schema.getViews().get(str);
    }

    public /* synthetic */ SceneProductViewCoordinator(Schema schema, b bVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(schema, (i13 & 2) != 0 ? null : bVar);
    }
}
