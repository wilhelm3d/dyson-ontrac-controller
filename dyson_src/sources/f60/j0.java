package f60;

import com.dyson.mobile.android.logging.Logger;
import com.dyson.mobile.android.machinetype.MachineSerial;
import com.paypal.pyplcheckout.data.api.okhttp.interceptor.NetworkRetryInterceptor;
import i12.p0;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kz1.b;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lf60/j0;", "", "Lr60/a;", "connectivityDataStore", "Lf60/g0;", "httpLtkRetrievalTask", "<init>", "(Lr60/a;Lf60/g0;)V", "a", "mod-connectivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class j0 {

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f29980c;

    /* renamed from: a  reason: collision with root package name */
    public final r60.a f29981a;

    /* renamed from: b  reason: collision with root package name */
    public final g0 f29982b;

    static {
        new a(null);
        Charset charset = StandardCharsets.UTF_8;
        charset.getClass();
        byte[] bytes = "USER_AUTH_AES\u0000\u0000\u0000".getBytes(charset);
        bytes.getClass();
        f29980c = bytes;
    }

    public j0(r60.a aVar, g0 g0Var) {
        aVar.getClass();
        g0Var.getClass();
        this.f29981a = aVar;
        this.f29982b = g0Var;
    }

    public final dz1.x<h0> a(MachineSerial machineSerial) {
        String str = machineSerial.d;
        r60.a aVar = this.f29981a;
        r60.b b13 = aVar.b(str);
        h0 h0Var = null;
        if (b13 != null) {
            try {
                byte[] h13 = in0.c.h(b13.f70499a);
                h0Var = new h0(h13, u60.b.b(new byte[0], h13, f29980c));
            } catch (Exception unused) {
                Logger.a("Failed parsing cached long term key - removing from data store");
                aVar.f(str);
            }
        }
        if (h0Var != null) {
            Logger.a("Retrieved LTK from local data store");
            return dz1.x.i(h0Var);
        }
        sz1.x b14 = b(machineSerial);
        w wVar = new w(new i0(this, machineSerial, 1), 8);
        b.a aVar2 = kz1.b.f50218a;
        return new sz1.k(b14, wVar);
    }

    public final sz1.x b(MachineSerial machineSerial) {
        Logger.a("Retrieving LTK from the cloud");
        sz1.z s13 = this.f29982b.f29947a.b(machineSerial.d, p0.c(new h12.p("X-Dyson-ApiAuthCode", "80541406"))).r(c02.a.f10004c).s(NetworkRetryInterceptor.DEFAULT_RETRY_DELAY, TimeUnit.MILLISECONDS);
        w wVar = new w(new x(this, 1), 9);
        b.a aVar = kz1.b.f50218a;
        return new sz1.x(new sz1.t(s13, wVar), new w(new x(2), 10));
    }

    public final void c(MachineSerial machineSerial, h0 h0Var) {
        String str = machineSerial.d;
        h0Var.getClass();
        y70.a aVar = this.f29981a.f70495a;
        r60.a.f70493b.getClass();
        aVar.putString("LTK_".concat(str), in0.c.b(h0Var.f29948a));
        Logger.a("LTK for machine " + str + " stored.");
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lf60/j0$a;", "", "<init>", "()V", "", "LTK_RETRIEVAL_TASK_TIMEOUT_MS", "J", "", "AUTHORISATION_CODE", "Ljava/lang/String;", "USER_AUTH_AES_FORMAT", "", "AES_LENGTH", "I", "mod-connectivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
