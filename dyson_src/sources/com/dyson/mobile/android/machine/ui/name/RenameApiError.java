package com.dyson.mobile.android.machine.ui.name;

import kotlin.Metadata;
import x12.r;
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/name/RenameApiError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lcom/dyson/mobile/android/machine/ui/name/RenameRequest;", "renameRequest", "<init>", "(Lcom/dyson/mobile/android/machine/ui/name/RenameRequest;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RenameApiError extends Exception {
    public final RenameRequest d;

    public RenameApiError(RenameRequest renameRequest) {
        renameRequest.getClass();
        this.d = renameRequest;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RenameApiError) && r.c(this.d, ((RenameApiError) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "RenameApiError(renameRequest=" + this.d + ")";
    }
}
