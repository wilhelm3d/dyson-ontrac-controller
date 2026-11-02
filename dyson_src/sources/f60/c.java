package f60;

import l70.a;
/* loaded from: classes2.dex */
public final /* synthetic */ class c implements iz1.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f29938a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ i f29939b;

    public /* synthetic */ c(i iVar, int i13) {
        this.f29938a = i13;
        this.f29939b = iVar;
    }

    @Override // iz1.a
    public final void run() {
        int i13 = this.f29938a;
        i iVar = this.f29939b;
        switch (i13) {
            case 0:
                int i14 = i.f29950w;
                iVar.g(a.InterfaceC1576a.C1577a.f50966a);
                return;
            case 1:
                iVar.f29964p.onNext(e0.PAIRING_COMPLETE);
                return;
            default:
                iVar.f29964p.onNext(e0.PAIRING_COMPLETE);
                return;
        }
    }
}
