package f60;

import kotlin.Metadata;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lf60/f0;", "", "Lf60/i;", "authenticatedBleConnector", "<init>", "(Lf60/i;)V", "mod-connectivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    public final i f29943a;

    /* renamed from: b  reason: collision with root package name */
    public final c42.b f29944b;

    public f0(i iVar) {
        iVar.getClass();
        this.f29943a = iVar;
        this.f29944b = cd.b.o(iVar.f29963o);
    }

    public final d60.b a() {
        d60.b bVar = this.f29943a.f29969u;
        if (bVar != null) {
            return bVar;
        }
        pa.c.w("connectionEstablished was null. Ensure BLE has been connected before retrieving this value.");
        return null;
    }
}
