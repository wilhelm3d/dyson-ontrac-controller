package com.dyson.mobile.android.connectivity.ble.lec;

import f60.a0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x12.r;
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/connectivity/ble/lec/ConnectionResultException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lf60/a0;", "errorReason", "", "exception", "<init>", "(Lf60/a0;Ljava/lang/Throwable;)V", "mod-connectivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ConnectionResultException extends Exception {
    public final a0 d;
    public final Throwable e;

    public ConnectionResultException(a0 a0Var, Throwable th2) {
        a0Var.getClass();
        this.d = a0Var;
        this.e = th2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConnectionResultException) {
            ConnectionResultException connectionResultException = (ConnectionResultException) obj;
            return this.d == connectionResultException.d && r.c(this.e, connectionResultException.e);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.d.hashCode() * 31;
        Throwable th2 = this.e;
        return hashCode + (th2 == null ? 0 : th2.hashCode());
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "ConnectionResultException(errorReason=" + this.d + ", exception=" + this.e + ")";
    }

    public /* synthetic */ ConnectionResultException(a0 a0Var, Throwable th2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(a0Var, (i13 & 2) != 0 ? null : th2);
    }
}
