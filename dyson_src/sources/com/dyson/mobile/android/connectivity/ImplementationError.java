package com.dyson.mobile.android.connectivity;

import bv1.f;
import kotlin.Metadata;
import x12.r;
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/connectivity/ImplementationError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "message", "<init>", "(Ljava/lang/String;)V", "mod-connectivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ImplementationError extends Exception {
    public final String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImplementationError(String str) {
        super(str);
        str.getClass();
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ImplementationError) && r.c(this.d, ((ImplementationError) obj).d);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.d;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return f.e("ImplementationError(message=", this.d, ")");
    }
}
