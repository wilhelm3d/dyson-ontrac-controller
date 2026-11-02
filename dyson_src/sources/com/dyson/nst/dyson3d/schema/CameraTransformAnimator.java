package com.dyson.nst.dyson3d.schema;

import kg1.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sg1.d;
import w32.e;
import yy1.b;
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\f\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u0003B1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u0017R\u0018\u0010 \u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u0017R\u0018\u0010!\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u0017R$\u0010$\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006*"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/CameraTransformAnimator;", "Lkg1/a;", "Llg1/a;", "Lcom/dyson/nst/dyson3d/filament/animation/CameraAnimator;", "Lw32/b;", "duration", "Lyy1/b;", "position", "target", "up", "Lsg1/d;", "interpolation", "<init>", "(JLyy1/b;Lyy1/b;Lyy1/b;Lsg1/d;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "node", "", "frameTime", "Lh12/f0;", "apply", "(Llg1/a;D)V", "J", "getDuration-UwyO8pc", "()J", "Lyy1/b;", "getPosition", "()Lyy1/b;", "getTarget", "getUp", "Lsg1/d;", "getInterpolation", "()Lsg1/d;", "startPosition", "startTarget", "startUp", "", "<set-?>", "hasEnded", "Z", "getHasEnded", "()Z", "currentOffset", "D", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CameraTransformAnimator implements a<lg1.a> {
    public static final int $stable = 8;
    private double currentOffset;
    private final long duration;
    private boolean hasEnded;
    private final d interpolation;
    private final b position;
    private b startPosition;
    private b startTarget;
    private b startUp;
    private final b target;

    /* renamed from: up  reason: collision with root package name */
    private final b f17016up;

    private CameraTransformAnimator(long j8, b bVar, b bVar2, b bVar3, d dVar) {
        bVar.getClass();
        bVar2.getClass();
        bVar3.getClass();
        dVar.getClass();
        this.duration = j8;
        this.position = bVar;
        this.target = bVar2;
        this.f17016up = bVar3;
        this.interpolation = dVar;
    }

    @Override // kg1.a
    public void apply(lg1.a aVar, double d) {
        aVar.getClass();
        b bVar = this.startPosition;
        if (bVar == null) {
            bVar = aVar.e;
        }
        this.startPosition = bVar;
        b bVar2 = this.startTarget;
        if (bVar2 == null) {
            bVar2 = aVar.j();
        }
        this.startTarget = bVar2;
        b bVar3 = this.startUp;
        if (bVar3 == null) {
            bVar3 = aVar.k();
        }
        this.startUp = bVar3;
        double d13 = this.currentOffset + d;
        this.currentOffset = d13;
        float l13 = ((float) d13) / ((float) w32.b.l(this.duration, e.SECONDS));
        if (l13 < 0.0f) {
            l13 = 0.0f;
        } else if (l13 > 1.0f) {
            l13 = 1.0f;
        }
        d dVar = this.interpolation;
        b bVar4 = this.startTarget;
        bVar4.getClass();
        b a13 = dVar.a(bVar4, this.target, l13);
        d dVar2 = this.interpolation;
        b bVar5 = this.startPosition;
        bVar5.getClass();
        b a14 = dVar2.a(bVar5, this.position, l13);
        d dVar3 = this.interpolation;
        b bVar6 = this.startUp;
        bVar6.getClass();
        aVar.l(a13, a14, dVar3.a(bVar6, this.f17016up, l13));
        if (l13 == 1.0f) {
            this.hasEnded = true;
        }
    }

    /* renamed from: getDuration-UwyO8pc  reason: not valid java name */
    public final long m9getDurationUwyO8pc() {
        return this.duration;
    }

    @Override // kg1.a
    public boolean getHasEnded() {
        return this.hasEnded;
    }

    public final d getInterpolation() {
        return this.interpolation;
    }

    public final b getPosition() {
        return this.position;
    }

    public final b getTarget() {
        return this.target;
    }

    public final b getUp() {
        return this.f17016up;
    }

    public /* synthetic */ CameraTransformAnimator(long j8, b bVar, b bVar2, b bVar3, d dVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j8, bVar, bVar2, bVar3, dVar);
    }

    public /* synthetic */ CameraTransformAnimator(long j8, b bVar, b bVar2, b bVar3, d dVar, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j8, bVar, bVar2, bVar3, (i13 & 16) != 0 ? d.b.f76142b : dVar, null);
    }
}
