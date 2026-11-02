package com.dyson.mobile.android.support.validator;

import android.text.TextUtils;
import com.dyson.mobile.android.support.guide.View;
import mf1.a;
import mf1.b;
/* loaded from: classes3.dex */
public class ViewValidator implements a<View> {
    @Override // mf1.a
    public final b a(View view) {
        View view2 = view;
        if (view2 != null) {
            return (TextUtils.isEmpty(view2.k()) && TextUtils.isEmpty(view2.j()) && TextUtils.isEmpty(view2.l()) && !(view2.i() != null && !view2.i().isEmpty())) ? new b(false, "The view text, image, videoId and annotations are all null or empty") : b.f53843c;
        }
        return new b(false, "Invalid view, the view must not be null");
    }
}
