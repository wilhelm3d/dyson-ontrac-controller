package com.dyson.mobile.android.support.validator;

import android.text.TextUtils;
import com.dyson.mobile.android.support.guide.Annotation;
import mf1.a;
import mf1.b;
/* loaded from: classes3.dex */
public class AnnotationValidator implements a<Annotation> {
    @Override // mf1.a
    public final b a(Annotation annotation) {
        Annotation annotation2 = annotation;
        return annotation2 != null ? TextUtils.isEmpty(annotation2.i()) ? new b(false, "Invalid annotation, the annotation text is null or empty") : b.f53843c : new b(false, "Invalid annotation, the annotation must not be null");
    }
}
