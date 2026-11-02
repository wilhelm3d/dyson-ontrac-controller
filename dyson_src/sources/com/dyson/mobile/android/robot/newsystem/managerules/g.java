package com.dyson.mobile.android.robot.newsystem.managerules;

import com.dyson.mobile.android.robot.cloud.newsystem.common.Point;
import com.dyson.mobile.android.robot.newsystem.managerules.f;
import com.dyson.mobile.android.robot.newsystem.navigation.destination.ManageRulesEntryPoint;
import v01.k;
/* loaded from: classes3.dex */
public final class g implements f.b {

    /* renamed from: a  reason: collision with root package name */
    public final k f16431a;

    public g(k kVar) {
        this.f16431a = kVar;
    }

    @Override // com.dyson.mobile.android.robot.newsystem.managerules.f.b
    public final f a(String str, ManageRulesEntryPoint manageRulesEntryPoint, Point point) {
        k kVar = this.f16431a;
        return new f(str, manageRulesEntryPoint, point, kVar.f82938a.get(), kVar.f82939b.get(), kVar.f82940c.get(), kVar.d.get(), kVar.e.get(), kVar.f82941f.get(), kVar.f82942g.get());
    }
}
