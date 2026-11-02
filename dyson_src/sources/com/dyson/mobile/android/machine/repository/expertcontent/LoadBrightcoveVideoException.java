package com.dyson.mobile.android.machine.repository.expertcontent;

import com.brightcove.player.event.AbstractEvent;
import kotlin.Metadata;
import x12.r;
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/machine/repository/expertcontent/LoadBrightcoveVideoException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", AbstractEvent.ERROR_MESSAGE, "", "throwable", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LoadBrightcoveVideoException extends Exception {
    public final String d;
    public final Throwable e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadBrightcoveVideoException(String str, Throwable th2) {
        super(str, th2);
        str.getClass();
        this.d = str;
        this.e = th2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LoadBrightcoveVideoException) {
            LoadBrightcoveVideoException loadBrightcoveVideoException = (LoadBrightcoveVideoException) obj;
            return r.c(this.d, loadBrightcoveVideoException.d) && r.c(this.e, loadBrightcoveVideoException.e);
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
        return "LoadBrightcoveVideoException(errorMessage=" + this.d + ", throwable=" + this.e + ")";
    }
}
