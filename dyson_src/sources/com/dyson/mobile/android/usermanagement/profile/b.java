package com.dyson.mobile.android.usermanagement.profile;

import com.dyson.mobile.android.usermanagement.profile.a;
import com.dyson.mobile.android.usermanagement.profile.model.QuestionnaireActivityPayload;
import he1.i;
/* loaded from: classes3.dex */
public final class b implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public final i f17000a;

    public b(i iVar) {
        this.f17000a = iVar;
    }

    @Override // com.dyson.mobile.android.usermanagement.profile.a.b
    public final a a(QuestionnaireActivityPayload questionnaireActivityPayload) {
        i iVar = this.f17000a;
        return new a(iVar.f38174a.get(), iVar.f38175b.get(), iVar.f38176c.get(), iVar.d.get(), questionnaireActivityPayload);
    }
}
