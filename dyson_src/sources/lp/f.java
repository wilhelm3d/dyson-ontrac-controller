package lp;

import kotlin.Metadata;
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@n12.e(c = "com.dyson.mobile.android.audio.traits.equalization.DefaultCustomEqualizationController", f = "DefaultCustomEqualizationController.kt", l = {25}, m = "setCustomEqualization", v = 2)
/* loaded from: classes2.dex */
public final class f extends n12.c {
    public /* synthetic */ Object d;
    public final /* synthetic */ g e;

    /* renamed from: f  reason: collision with root package name */
    public int f52511f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, l12.d<? super f> dVar) {
        super(dVar);
        this.e = gVar;
    }

    @Override // n12.a
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f52511f |= Integer.MIN_VALUE;
        return this.e.a(null, this);
    }
}
