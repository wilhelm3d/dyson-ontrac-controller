package bk;

import com.brightcove.player.C;
import h12.f0;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import z32.c0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "", "<anonymous>", "(Lz32/c0;)Ljava/lang/String;"}, k = 3, mv = {2, 3, 0})
@n12.e(c = "com.dyson.mobile.android.audio.customisation.AssetTextReader$read$2", f = "AssetTextReader.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes2.dex */
public final class c extends n12.i implements Function2<c0, l12.d<? super String>, Object> {
    public final /* synthetic */ d d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, String str, l12.d<? super c> dVar2) {
        super(2, dVar2);
        this.d = dVar;
        this.e = str;
    }

    @Override // n12.a
    public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
        return new c(this.d, this.e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(c0 c0Var, l12.d<? super String> dVar) {
        return ((c) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
    }

    @Override // n12.a
    public final Object invokeSuspend(Object obj) {
        m12.a aVar = m12.a.COROUTINE_SUSPENDED;
        h12.r.b(obj);
        InputStream open = this.d.f7877a.getAssets().open(this.e);
        open.getClass();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open, v32.c.f83073b), C.DASH_ROLE_ALTERNATE_FLAG);
        try {
            String I = i22.n.I(bufferedReader);
            bufferedReader.close();
            return I;
        } finally {
        }
    }
}
