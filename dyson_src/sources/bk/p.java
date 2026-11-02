package bk;

import kotlin.Metadata;
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@n12.e(c = "com.dyson.mobile.android.audio.customisation.DefaultCustomisationRepository", f = "DefaultCustomisationRepository.kt", l = {64}, m = "isModelAvailable", v = 2)
/* loaded from: classes2.dex */
public final class p extends n12.c {
    public /* synthetic */ Object d;
    public final /* synthetic */ n e;

    /* renamed from: f  reason: collision with root package name */
    public int f7917f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(n nVar, l12.d<? super p> dVar) {
        super(dVar);
        this.e = nVar;
    }

    @Override // n12.a
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f7917f |= Integer.MIN_VALUE;
        return this.e.e(this);
    }
}
