package com.dyson.nst.dyson3d.schema;

import kg1.e;
import kotlin.Metadata;
import sg1.d;
import tg1.f;
import ug1.a;
import w32.b;
import yy1.b;
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010R$\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R$\u0010\u0019\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R$\u0010\u001c\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/TransformHelper;", "", "<init>", "()V", "Lw32/b;", "duration", "Lkg1/e;", "build-LRDsOJo", "(J)Lkg1/e;", "build", "Ltg1/f;", "node", "", "useTransformAnimations", "Lh12/f0;", "applyToNode-8Mi8wO0", "(Ltg1/f;JZ)V", "applyToNode", "Lyy1/b;", "position", "Lyy1/b;", "getPosition", "()Lyy1/b;", "setPosition", "(Lyy1/b;)V", "rotation", "getRotation", "setRotation", "scale", "getScale", "setScale", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransformHelper {
    public static final int $stable = 8;
    private b position;
    private b rotation;
    private b scale;

    /* renamed from: build-LRDsOJo  reason: not valid java name */
    private final e m14buildLRDsOJo(long j8) {
        return new e(j8, this.position, this.rotation, this.scale, d.a.f76140b, null);
    }

    /* renamed from: build-LRDsOJo$default  reason: not valid java name */
    public static /* synthetic */ e m15buildLRDsOJo$default(TransformHelper transformHelper, long j8, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            b.a aVar = w32.b.e;
            j8 = w32.d.g(1, w32.e.SECONDS);
        }
        return transformHelper.m14buildLRDsOJo(j8);
    }

    /* renamed from: applyToNode-8Mi8wO0  reason: not valid java name */
    public final void m16applyToNode8Mi8wO0(f fVar, long j8, boolean z13) {
        fVar.getClass();
        if (z13) {
            a<f> k13 = fVar.k();
            e m14buildLRDsOJo = m14buildLRDsOJo(j8);
            k13.getClass();
            m14buildLRDsOJo.getClass();
            k13.f82020a.add(m14buildLRDsOJo);
            return;
        }
        yy1.b bVar = this.position;
        if (bVar != null) {
            fVar.q(bVar);
        }
        yy1.b bVar2 = this.rotation;
        if (bVar2 != null) {
            fVar.r(bVar2);
        }
        yy1.b bVar3 = this.scale;
        if (bVar3 != null) {
            fVar.s(bVar3);
        }
    }

    public final yy1.b getPosition() {
        return this.position;
    }

    public final yy1.b getRotation() {
        return this.rotation;
    }

    public final yy1.b getScale() {
        return this.scale;
    }

    public final void setPosition(yy1.b bVar) {
        this.position = bVar;
    }

    public final void setRotation(yy1.b bVar) {
        this.rotation = bVar;
    }

    public final void setScale(yy1.b bVar) {
        this.scale = bVar;
    }
}
