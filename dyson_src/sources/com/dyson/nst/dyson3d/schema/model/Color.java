package com.dyson.nst.dyson3d.schema.model;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/model/Color;", "", "r", "", "g", "b", "a", "(FFFF)V", "getA", "()F", "getB", "getG", "getR", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Color {
    public static final int $stable = 0;

    /* renamed from: a  reason: collision with root package name */
    private final float f17017a;

    /* renamed from: b  reason: collision with root package name */
    private final float f17018b;

    /* renamed from: g  reason: collision with root package name */
    private final float f17019g;

    /* renamed from: r  reason: collision with root package name */
    private final float f17020r;

    public Color(float f13, float f14, float f15, float f16) {
        this.f17020r = f13;
        this.f17019g = f14;
        this.f17018b = f15;
        this.f17017a = f16;
    }

    public final float getA() {
        return this.f17017a;
    }

    public final float getB() {
        return this.f17018b;
    }

    public final float getG() {
        return this.f17019g;
    }

    public final float getR() {
        return this.f17020r;
    }

    public /* synthetic */ Color(float f13, float f14, float f15, float f16, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(f13, f14, f15, (i13 & 8) != 0 ? 1.0f : f16);
    }
}
