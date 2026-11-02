package bk;

import com.paypal.android.platform.authsdk.BR;
import kotlin.Metadata;
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@n12.e(c = "com.dyson.mobile.android.audio.customisation.DefaultCustomisationRepository", f = "DefaultCustomisationRepository.kt", l = {BR.sessionActiveDurationTooltip}, m = "loadModelSchema", v = 2)
/* loaded from: classes2.dex */
public final class q extends n12.c {
    public /* synthetic */ Object d;
    public final /* synthetic */ n e;

    /* renamed from: f  reason: collision with root package name */
    public int f7918f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(n nVar, l12.d<? super q> dVar) {
        super(dVar);
        this.e = nVar;
    }

    @Override // n12.a
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f7918f |= Integer.MIN_VALUE;
        int i13 = n.f7893n;
        return this.e.j(this);
    }
}
