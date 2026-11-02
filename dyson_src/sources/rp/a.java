package rp;

import com.paypal.android.platform.authsdk.BR;
import kotlin.Metadata;
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
@n12.e(c = "com.dyson.mobile.android.audio.traits.headdetection.DefaultHeadDetectionToggleController", f = "DefaultHeadDetectionToggleController.kt", l = {BR.hasInfiniteLife, BR.icon, 50}, m = "setHeadDetectionMode", v = 2)
/* loaded from: classes2.dex */
public final class a extends n12.c {
    public e d;
    public /* synthetic */ Object e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ b f73492f;

    /* renamed from: g  reason: collision with root package name */
    public int f73493g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, l12.d<? super a> dVar) {
        super(dVar);
        this.f73492f = bVar;
    }

    @Override // n12.a
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.f73493g |= Integer.MIN_VALUE;
        return this.f73492f.a(null, this);
    }
}
