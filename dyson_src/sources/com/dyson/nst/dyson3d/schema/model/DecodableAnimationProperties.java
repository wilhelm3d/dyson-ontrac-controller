package com.dyson.nst.dyson3d.schema.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sg1.d;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/model/DecodableAnimationProperties;", "", "", "duration", "Lsg1/d;", "timingCurve", "delay", "<init>", "(FLsg1/d;F)V", "F", "getDuration", "()F", "Lsg1/d;", "getTimingCurve", "()Lsg1/d;", "getDelay", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DecodableAnimationProperties {
    public static final int $stable = 0;
    private final float delay;
    private final float duration;
    private final d timingCurve;

    public /* synthetic */ DecodableAnimationProperties(float f13, d dVar, float f14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 1.0f : f13, (i13 & 2) != 0 ? d.a.f76140b : dVar, (i13 & 4) != 0 ? 0.0f : f14);
    }

    public final float getDelay() {
        return this.delay;
    }

    public final float getDuration() {
        return this.duration;
    }

    public final d getTimingCurve() {
        return this.timingCurve;
    }

    public DecodableAnimationProperties(float f13, d dVar, float f14) {
        dVar.getClass();
        this.duration = f13;
        this.timingCurve = dVar;
        this.delay = f14;
    }

    public DecodableAnimationProperties() {
        this(0.0f, null, 0.0f, 7, null);
    }
}
