package com.dyson.mobile.android;

import android.content.Context;
import com.dyson.mobile.android.b;
import com.dyson.mobile.android.logging.Logger;
import j90.q;
import kotlin.Metadata;
import ph.r;
import qh.l0;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/d;", "Lj90/q;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class d implements q {

    /* renamed from: a  reason: collision with root package name */
    public final Context f14016a;

    public d(Context context) {
        context.getClass();
        this.f14016a = context;
    }

    @Override // j90.q
    public final boolean a(String str) {
        str.getClass();
        Context context = this.f14016a;
        if (new l0(context).f66893a.k()) {
            Logger.e(str, null);
            b.A.getClass();
            b a13 = b.a.a();
            gz1.b bVar = a13.e;
            vy1.a<r> aVar = a13.f12806h;
            if (aVar == null) {
                x12.r.i("signOutManager");
                throw null;
            }
            bVar.a(aVar.get().a().z(c02.a.f10004c).v());
            context.startActivity(b.h(context));
            return true;
        }
        return false;
    }
}
