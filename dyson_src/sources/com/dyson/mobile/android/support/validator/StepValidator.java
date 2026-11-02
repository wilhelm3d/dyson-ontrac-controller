package com.dyson.mobile.android.support.validator;

import android.text.TextUtils;
import com.dyson.mobile.android.support.common.Step;
import mf1.a;
import mf1.b;
/* loaded from: classes3.dex */
public class StepValidator implements a<Step> {
    @Override // mf1.a
    public final b a(Step step) {
        Step step2 = step;
        return step2 != null ? (TextUtils.isEmpty(step2.j()) && TextUtils.isEmpty(step2.i()) && TextUtils.isEmpty(step2.k())) ? new b(false, "The step text, image and videoId are all null or empty") : b.f53843c : new b(false, "Invalid step, the step must not be null");
    }
}
