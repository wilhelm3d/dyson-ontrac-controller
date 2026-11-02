package com.dyson.mobile.android.support.validator;

import com.dyson.mobile.android.support.guide.Diagnosis;
import mf1.a;
import mf1.b;
/* loaded from: classes3.dex */
public class DiagnosisValidator implements a<Diagnosis> {
    @Override // mf1.a
    public final b a(Diagnosis diagnosis) {
        Diagnosis diagnosis2 = diagnosis;
        return diagnosis2 != null ? (diagnosis2.i() == null || diagnosis2.i().isEmpty()) ? new b(false, "Invalid diagnosis, the Actions list is null or empty") : (diagnosis2.k() == null || diagnosis2.k().isEmpty()) ? new b(false, "Invalid diagnosis, the Symptoms list is null or empty") : b.f53843c : new b(false, "Invalid diagnosis, the diagnosis must not be null");
    }
}
