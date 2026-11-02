package com.dyson.mobile.android.usermanagement.profile;

import bv1.f;
import kotlin.Metadata;
import x12.r;
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/usermanagement/profile/QuestionnaireAvailabilityDataException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "", "description", "<init>", "(Ljava/lang/String;)V", "mod-user-management"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class QuestionnaireAvailabilityDataException extends IllegalStateException {
    public final String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuestionnaireAvailabilityDataException(String str) {
        super(str);
        str.getClass();
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof QuestionnaireAvailabilityDataException) && r.c(this.d, ((QuestionnaireAvailabilityDataException) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return f.e("QuestionnaireAvailabilityDataException(description=", this.d, ")");
    }
}
