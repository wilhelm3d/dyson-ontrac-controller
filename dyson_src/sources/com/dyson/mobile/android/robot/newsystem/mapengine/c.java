package com.dyson.mobile.android.robot.newsystem.mapengine;

import com.dyson.mobile.android.robot.newsystem.mapengine.a;
/* loaded from: classes3.dex */
public final class c implements a.InterfaceC0576a {

    /* renamed from: a  reason: collision with root package name */
    public final x01.a f16452a;

    public c(x01.a aVar) {
        this.f16452a = aVar;
    }

    @Override // com.dyson.mobile.android.robot.newsystem.mapengine.a.InterfaceC0576a
    public final a a(String str) {
        x01.a aVar = this.f16452a;
        return new a(aVar.f86639a.get(), aVar.f86640b.get(), aVar.f86641c.get(), str, aVar.d.get(), aVar.e.get());
    }
}
