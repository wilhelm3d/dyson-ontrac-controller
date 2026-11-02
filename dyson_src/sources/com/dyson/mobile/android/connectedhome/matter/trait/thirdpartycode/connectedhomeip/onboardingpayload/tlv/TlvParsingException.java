package com.dyson.mobile.android.connectedhome.matter.trait.thirdpartycode.connectedhomeip.onboardingpayload.tlv;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001d\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/matter/trait/thirdpartycode/connectedhomeip/onboardingpayload/tlv/TlvParsingException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "msg", "", "cause", "", "<init>", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TlvParsingException extends RuntimeException {
    public /* synthetic */ TlvParsingException(String str, Throwable th2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? null : th2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TlvParsingException(String str, Throwable th2) {
        super(str, th2);
        str.getClass();
    }
}
