package com.dyson.mobile.android.utilities.screendensity;

import kotlin.Metadata;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/utilities/screendensity/InvalidResourceException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "qualifier", "", "<init>", "(Ljava/lang/String;)V", "mod-utilities"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InvalidResourceException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InvalidResourceException(String str) {
        super("Invalid resource qualifier [" + str + "], please check our string resources");
        str.getClass();
    }
}
