package com.dyson.nst.dyson3d.schema;

import kotlin.Metadata;
import lg1.a;
import nk1.d;
import sg1.c;
import sg1.d;
import w32.b;
import w32.e;
import yy1.b;
import yy1.g;
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a<\u0010\u0011\u001a\u00020\u000e*\u00020\t2\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a%\u0010\u0015\u001a\u00020\u000e*\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Lyy1/b;", "position", "rotation", "Lsg1/a;", "calculateDetailsForRotation", "(Lyy1/b;Lyy1/b;)Lsg1/a;", "target", "calculateUpVector", "(Lyy1/b;Lyy1/b;)Lyy1/b;", "Llg1/a;", "Lw32/b;", "duration", "", "useAnimation", "Lh12/f0;", "applyTransform-zkXUZaI", "(Llg1/a;Lyy1/b;Lyy1/b;JZ)V", "applyTransform", "Lwg1/g;", "node", "customUp", "lookAt", "(Llg1/a;Lwg1/g;Lyy1/b;)V", "Dyson3D_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SchemaSceneManagerKt {
    /* renamed from: applyTransform-zkXUZaI */
    public static final void m12applyTransformzkXUZaI(a aVar, b bVar, b bVar2, long j8, boolean z13) {
        aVar.getClass();
        bVar2.getClass();
        if (bVar == null) {
            bVar = aVar.e;
        }
        b bVar3 = bVar;
        b bVar4 = new b(0.0f, 0.0f, -1.0f);
        b bVar5 = new b(0.0f, 1.0f, 0.0f);
        bVar3.getClass();
        d d = c.d(d.e, bVar2);
        b b13 = c.b(d, bVar4);
        sg1.a aVar2 = new sg1.a(bVar3, new b(b13.f91166a + bVar3.f91166a, b13.f91167b + bVar3.f91167b, b13.f91168c + bVar3.f91168c), c.b(d, bVar5));
        if (z13) {
            CameraTransformAnimator cameraTransformAnimator = new CameraTransformAnimator(j8, bVar3, aVar2.f76137b, aVar2.f76138c, d.a.f76140b, null);
            ug1.a<a> aVar3 = aVar.d;
            aVar3.getClass();
            aVar3.f82020a.add(cameraTransformAnimator);
            return;
        }
        aVar.e = bVar3;
        aVar.n();
        b a13 = b.a(bVar2);
        a13.f91166a *= 57.295776f;
        a13.f91167b *= 57.295776f;
        a13.f91168c *= 57.295776f;
        aVar.f51820f = g.a.b(g.e, a13);
        aVar.n();
    }

    /* renamed from: applyTransform-zkXUZaI$default */
    public static /* synthetic */ void m13applyTransformzkXUZaI$default(a aVar, b bVar, b bVar2, long j8, boolean z13, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            bVar = null;
        }
        if ((i13 & 2) != 0) {
            bVar2 = new b(0.0f, 0.0f, 0.0f, 7, null);
        }
        if ((i13 & 4) != 0) {
            b.a aVar2 = w32.b.e;
            j8 = w32.d.g(1, e.SECONDS);
        }
        m12applyTransformzkXUZaI(aVar, bVar, bVar2, j8, z13);
    }

    private static final sg1.a calculateDetailsForRotation(yy1.b bVar, yy1.b bVar2) {
        yy1.b bVar3 = new yy1.b(0.0f, 0.0f, -1.0f);
        yy1.b bVar4 = new yy1.b(0.0f, 1.0f, 0.0f);
        nk1.d d = c.d(nk1.d.e, bVar2);
        yy1.b b13 = c.b(d, bVar3);
        return new sg1.a(bVar, new yy1.b(b13.f91166a + bVar.f91166a, b13.f91167b + bVar.f91167b, b13.f91168c + bVar.f91168c), c.b(d, bVar4));
    }

    private static final yy1.b calculateUpVector(yy1.b bVar, yy1.b bVar2) {
        yy1.b k13 = u12.a.k(new yy1.b(bVar.f91166a - bVar2.f91166a, bVar.f91167b - bVar2.f91167b, bVar.f91168c - bVar2.f91168c));
        yy1.b bVar3 = new yy1.b(0.0f, 1.0f, 0.0f);
        float f13 = bVar3.f91167b;
        float f14 = k13.f91168c;
        float f15 = bVar3.f91168c;
        float f16 = k13.f91167b;
        float f17 = k13.f91166a;
        float f18 = bVar3.f91166a;
        yy1.b k14 = u12.a.k(new yy1.b((f13 * f14) - (f15 * f16), (f15 * f17) - (f14 * f18), (f18 * f16) - (f13 * f17)));
        float f19 = k13.f91167b;
        float f23 = k14.f91168c;
        float f24 = k13.f91168c;
        float f25 = k14.f91167b;
        float f26 = k14.f91166a;
        float f27 = k13.f91166a;
        return u12.a.k(new yy1.b((f19 * f23) - (f24 * f25), (f24 * f26) - (f23 * f27), (f27 * f25) - (f19 * f26)));
    }

    public static final void lookAt(a aVar, wg1.g gVar, yy1.b bVar) {
        aVar.getClass();
        gVar.getClass();
        if (bVar == null) {
            bVar = calculateUpVector(aVar.e, gVar.getPosition());
        }
        aVar.l(gVar.getPosition(), aVar.e, bVar);
    }

    public static /* synthetic */ void lookAt$default(a aVar, wg1.g gVar, yy1.b bVar, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            bVar = null;
        }
        lookAt(aVar, gVar, bVar);
    }
}
