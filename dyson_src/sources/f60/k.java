package f60;

import com.dyson.mobile.android.connectivity.ble.lec.AuthenticationFailedException;
import com.dyson.mobile.android.connectivity.ble.lec.ConnectionFailedException;
import com.dyson.mobile.android.connectivity.ble.lec.ConnectionLostException;
import com.dyson.mobile.android.connectivity.ble.lec.PublishFailedException;
import com.dyson.mobile.android.logging.Logger;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf60/k;", "Lz60/s;", "mod-connectivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class k implements z60.s {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ w12.a<h12.f0> f29983a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ dz1.c f29984b;

    public k(w12.a<h12.f0> aVar, dz1.c cVar) {
        this.f29983a = aVar;
        this.f29984b = cVar;
    }

    @Override // z60.s
    public final void a(String str) {
        str.getClass();
        Logger.b("AWSIoT authentication failed: ".concat(str), null);
        this.f29984b.onError(new AuthenticationFailedException());
    }

    @Override // z60.s
    public final void b(String str) {
        str.getClass();
        this.f29983a.invoke();
        Logger.c("AWSIoT connection established: ".concat(str));
    }

    @Override // z60.s
    public final void c(String str) {
        str.getClass();
        Logger.b("AWSIoT Connection Lost: ".concat(str), null);
        this.f29984b.onError(new ConnectionLostException());
    }

    @Override // z60.s
    public final void d(String str, in0.k kVar) {
        str.getClass();
        kVar.getClass();
        Logger.b("AWSIoT publish failed: ".concat(str), null);
        this.f29984b.onError(new PublishFailedException());
    }

    @Override // z60.s
    public final void e(String str) {
        str.getClass();
    }

    @Override // z60.s
    public final void f(String str) {
        str.getClass();
    }

    @Override // z60.s
    public final void g(String str, String str2, String str3) {
        d72.a.v(str, str2, str3);
    }

    @Override // z60.s
    public final void h(String str) {
        str.getClass();
        Logger.b("AWSIoT Connection failed: ".concat(str), null);
        this.f29984b.onError(new ConnectionFailedException());
    }

    @Override // z60.s
    public final void i(String str, in0.k kVar) {
        str.getClass();
        kVar.getClass();
        Logger.c("AWSIoT Message Published: " + str + " : " + kVar);
        this.f29984b.onComplete();
    }
}
