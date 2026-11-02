package com.dyson.mobile.android.http;

import com.brightcove.player.event.AbstractEvent;
import ie.a;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x12.r;
import y9.w;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/http/HttpRequestError;", "Ljava/io/IOException;", "", "statusCode", "", AbstractEvent.ERROR_MESSAGE, "errorBody", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "mod-http"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HttpRequestError extends IOException {
    public final int d;
    public final String e;

    /* renamed from: f  reason: collision with root package name */
    public final String f14241f;

    public HttpRequestError(int i13, String str, String str2) {
        super(str);
        this.d = i13;
        this.e = str;
        this.f14241f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HttpRequestError) {
            HttpRequestError httpRequestError = (HttpRequestError) obj;
            return this.d == httpRequestError.d && r.c(this.e, httpRequestError.e) && r.c(this.f14241f, httpRequestError.f14241f);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.d) * 31;
        String str = this.e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f14241f;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return a.h(w.h(this.d, "HttpRequestError(statusCode=", ", errorMessage=", this.e, ", errorBody="), this.f14241f, ")");
    }

    public /* synthetic */ HttpRequestError(int i13, String str, String str2, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(i13, str, (i14 & 4) != 0 ? null : str2);
    }
}
