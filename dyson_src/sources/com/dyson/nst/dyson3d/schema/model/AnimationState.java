package com.dyson.nst.dyson3d.schema.model;

import com.salesforce.marketingcloud.messages.inbox.b;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0015\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0015\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/model/AnimationState;", "", b.f21448j, "", "node", "transform", "Lcom/dyson/nst/dyson3d/schema/model/Transform;", "name", "repeatCount", "", "speed", "(Ljava/lang/String;Ljava/lang/String;Lcom/dyson/nst/dyson3d/schema/model/Transform;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;)V", "getName", "()Ljava/lang/String;", "getNode", "getRepeatCount", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getSpeed", "getTransform", "()Lcom/dyson/nst/dyson3d/schema/model/Transform;", "getType", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AnimationState {
    public static final int $stable = 8;
    private final String name;
    private final String node;
    private final Float repeatCount;
    private final Float speed;
    private final Transform transform;
    private final String type;

    public AnimationState(String str, String str2, Transform transform, String str3, Float f13, Float f14) {
        str.getClass();
        str2.getClass();
        transform.getClass();
        this.type = str;
        this.node = str2;
        this.transform = transform;
        this.name = str3;
        this.repeatCount = f13;
        this.speed = f14;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNode() {
        return this.node;
    }

    public final Float getRepeatCount() {
        return this.repeatCount;
    }

    public final Float getSpeed() {
        return this.speed;
    }

    public final Transform getTransform() {
        return this.transform;
    }

    public final String getType() {
        return this.type;
    }
}
