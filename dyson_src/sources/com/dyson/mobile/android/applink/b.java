package com.dyson.mobile.android.applink;

import android.net.Uri;
import com.dyson.mobile.android.applink.a;
import uj.f;
/* loaded from: classes2.dex */
public final class b implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public final f f12320a;

    public b(f fVar) {
        this.f12320a = fVar;
    }

    @Override // com.dyson.mobile.android.applink.a.b
    public final a a(Uri uri) {
        f fVar = this.f12320a;
        return new a(fVar.f82155a.get(), fVar.f82156b.get(), fVar.f82157c.get(), fVar.d.get(), fVar.e.get(), uri);
    }
}
