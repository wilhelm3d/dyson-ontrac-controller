package yo;

import com.paypal.android.platform.authsdk.BR;
import h12.f0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import z32.c0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
@n12.e(c = "com.dyson.mobile.android.audio.traits.anc.DefaultAncModeController$setAncMode$2", f = "DefaultAncModeController.kt", l = {BR.errorVisibility, BR.filterLabel, BR.hasInfiniteLife}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class e extends n12.i implements Function2<c0, l12.d<? super f0>, Object> {
    public a d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ f f90299f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ a f90300g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, a aVar, l12.d<? super e> dVar) {
        super(2, dVar);
        this.f90299f = fVar;
        this.f90300g = aVar;
    }

    @Override // n12.a
    public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
        return new e(this.f90299f, this.f90300g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
        return ((e) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
        if (r9 == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
        if (r9.emit(r6, r8) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
        if (r9.b(r1, r8) == r0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
        return r0;
     */
    @Override // n12.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            m12.a r0 = m12.a.COROUTINE_SUSPENDED
            int r1 = r8.e
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            yo.a r6 = r8.f90300g
            yo.f r7 = r8.f90299f
            if (r1 == 0) goto L28
            if (r1 == r5) goto L24
            if (r1 == r4) goto L1e
            if (r1 != r3) goto L18
            h12.r.b(r9)
            goto L5a
        L18:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            pa.c.w(r8)
            return r2
        L1e:
            yo.a r1 = r8.d
            h12.r.b(r9)
            goto L46
        L24:
            h12.r.b(r9)
            goto L36
        L28:
            h12.r.b(r9)
            c42.q1 r9 = r7.d
            r8.e = r5
            java.lang.Object r9 = c42.r.t(r9, r8)
            if (r9 != r0) goto L36
            goto L59
        L36:
            r1 = r9
            yo.a r1 = (yo.a) r1
            c42.u1 r9 = r7.f90303c
            r8.d = r1
            r8.e = r4
            java.lang.Object r9 = r9.emit(r6, r8)
            if (r9 != r0) goto L46
            goto L59
        L46:
            if (r6 == r1) goto L5a
            gi0.a r9 = r7.f90301a
            yo.d r1 = new yo.d
            r1.<init>(r6)
            r8.d = r2
            r8.e = r3
            java.lang.Object r8 = r9.b(r1, r8)
            if (r8 != r0) goto L5a
        L59:
            return r0
        L5a:
            h12.f0 r8 = h12.f0.f36844a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: yo.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
