package bk;

import com.paypal.android.platform.authsdk.BR;
import kotlin.Metadata;
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@n12.e(c = "com.dyson.mobile.android.audio.customisation.SingleThreadedFilamentContext", f = "SingleThreadedFilamentContext.kt", l = {BR.header, 25}, m = "init", v = 2)
/* loaded from: classes2.dex */
public final class w extends n12.c {
    public j42.a d;
    public int e;

    /* renamed from: f  reason: collision with root package name */
    public /* synthetic */ Object f7926f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ y f7927g;

    /* renamed from: h  reason: collision with root package name */
    public int f7928h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y yVar, l12.d<? super w> dVar) {
        super(dVar);
        this.f7927g = yVar;
    }

    @Override // n12.a
    public final Object invokeSuspend(Object obj) {
        this.f7926f = obj;
        this.f7928h |= Integer.MIN_VALUE;
        return this.f7927g.a(this);
    }
}
