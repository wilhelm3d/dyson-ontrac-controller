package com.dyson.mobile.android.utilities.gson.validator;

import java.util.List;
import kotlin.Metadata;
import mf1.a;
import mf1.b;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/utilities/gson/validator/ListNotEmptyValidator;", "Lmf1/a;", "", "<init>", "()V", "mod-utilities"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ListNotEmptyValidator implements a<List<?>> {
    @Override // mf1.a
    public final b a(List<?> list) {
        List<?> list2 = list;
        return (list2 == null || list2.isEmpty()) ? new b(false, "List is null or empty.") : b.f53843c;
    }
}
