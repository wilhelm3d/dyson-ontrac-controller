package com.dyson.mobile.android.interactableec.traits.aqreport.http;

import kotlin.Metadata;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/interactableec/traits/aqreport/http/AQReportNoDataException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AQReportNoDataException extends Exception {
    public AQReportNoDataException() {
        super("AQReportResponse doesn't contain any data to display");
    }
}
