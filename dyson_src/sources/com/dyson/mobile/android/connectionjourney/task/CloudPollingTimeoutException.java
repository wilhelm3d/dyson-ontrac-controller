package com.dyson.mobile.android.connectionjourney.task;

import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import x12.u0;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/task/CloudPollingTimeoutException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "numberOfRetries", "", "<init>", "(I)V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CloudPollingTimeoutException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloudPollingTimeoutException(int i13) {
        super(String.format(Locale.getDefault(), "Cloud Polling Failed after %d internal retries", Arrays.copyOf(new Object[]{Integer.valueOf(i13)}, 1)));
        u0 u0Var = u0.f86723a;
    }
}
