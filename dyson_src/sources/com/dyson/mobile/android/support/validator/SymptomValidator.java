package com.dyson.mobile.android.support.validator;

import android.text.TextUtils;
import com.dyson.mobile.android.support.guide.Symptom;
import mf1.a;
import mf1.b;
/* loaded from: classes3.dex */
public class SymptomValidator implements a<Symptom> {
    @Override // mf1.a
    public final b a(Symptom symptom) {
        Symptom symptom2 = symptom;
        if (symptom2 != null) {
            if (TextUtils.isEmpty(symptom2.k())) {
                return new b(false, "Invalid symptom, the symptom type is null or empty");
            }
            String k13 = symptom2.k();
            k13.getClass();
            return !k13.equals("FaultCode") ? !k13.equals("Symptom") ? new b(false, "Invalid symptom, unknown Symptom Type") : TextUtils.isEmpty(symptom2.j()) ? new b(false, "The symptom text is null or empty") : b.f53843c : TextUtils.isEmpty(symptom2.i()) ? new b(false, "The symptom code is null or empty") : b.f53843c;
        }
        return new b(false, "Invalid symptom, the symptom must not be null");
    }
}
