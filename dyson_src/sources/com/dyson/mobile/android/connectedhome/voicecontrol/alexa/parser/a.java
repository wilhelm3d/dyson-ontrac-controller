package com.dyson.mobile.android.connectedhome.voicecontrol.alexa.parser;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/parser/a;", "", "<init>", "()V", "a", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a {
    static {
        new C0381a(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0033, code lost:
        if (x12.r.c(r10.getQueryParameterNames(), i12.q.e0(java.util.Arrays.copyOf(new java.lang.String[]{com.paypal.pyplcheckout.ui.feature.addressbook.view.customviews.PayPalNewShippingAddressReviewViewKt.STATE, "code"}, 2))) != false) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a5 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.dyson.mobile.android.connectedhome.voicecontrol.alexa.parser.AlexaAuthResult a(android.net.Uri r10) {
        /*
            java.lang.String r0 = "scope"
            java.lang.String r1 = "state"
            java.lang.String r2 = "code"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r0}
            java.util.Set r3 = r10.getQueryParameterNames()
            r4 = 3
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r4)
            java.util.Set r0 = i12.q.e0(r0)
            boolean r0 = x12.r.c(r3, r0)
            r3 = 0
            if (r0 != 0) goto L35
            java.lang.String[] r0 = new java.lang.String[]{r1, r2}
            java.util.Set r5 = r10.getQueryParameterNames()
            r6 = 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r6)
            java.util.Set r0 = i12.q.e0(r0)
            boolean r0 = x12.r.c(r5, r0)
            if (r0 == 0) goto L60
        L35:
            java.lang.String r0 = r10.getQueryParameter(r1)
            java.lang.String r2 = r10.getQueryParameter(r2)
            if (r0 == 0) goto L60
            if (r2 == 0) goto L60
            com.dyson.mobile.android.connectedhome.voicecontrol.alexa.parser.AlexaAuthResult$AlexaAuthArgs r5 = new com.dyson.mobile.android.connectedhome.voicecontrol.alexa.parser.AlexaAuthResult$AlexaAuthArgs
            java.lang.String r6 = r10.toString()
            r6.getClass()
            java.lang.String r7 = "?"
            java.lang.String[] r7 = new java.lang.String[]{r7}
            r8 = 6
            r9 = 0
            java.util.List r6 = v32.y.L(r6, r7, r9, r8)
            java.lang.Object r6 = r6.get(r9)
            java.lang.String r6 = (java.lang.String) r6
            r5.<init>(r0, r2, r6)
            goto L61
        L60:
            r5 = r3
        L61:
            if (r5 != 0) goto La5
            java.lang.String r0 = "error"
            java.lang.String r2 = "error_description"
            java.lang.String[] r5 = new java.lang.String[]{r0, r2, r1}
            java.util.Set r6 = r10.getQueryParameterNames()
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r5, r4)
            java.util.Set r4 = i12.q.e0(r4)
            boolean r4 = x12.r.c(r6, r4)
            if (r4 == 0) goto L94
            java.lang.String r0 = r10.getQueryParameter(r0)
            java.lang.String r2 = r10.getQueryParameter(r2)
            java.lang.String r1 = r10.getQueryParameter(r1)
            if (r0 == 0) goto L94
            if (r2 == 0) goto L94
            if (r1 == 0) goto L94
            com.dyson.mobile.android.connectedhome.voicecontrol.alexa.parser.AlexaAuthResult$a r3 = new com.dyson.mobile.android.connectedhome.voicecontrol.alexa.parser.AlexaAuthResult$a
            r3.<init>(r0, r2)
        L94:
            if (r3 != 0) goto La4
            com.dyson.mobile.android.connectedhome.voicecontrol.alexa.parser.AlexaAuthResult$a r0 = new com.dyson.mobile.android.connectedhome.voicecontrol.alexa.parser.AlexaAuthResult$a
            java.lang.String r1 = "Expected parameters missing from "
            java.lang.String r10 = qv1.s.g(r10, r1)
            java.lang.String r1 = "invalid_parameters"
            r0.<init>(r1, r10)
            return r0
        La4:
            return r3
        La5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.connectedhome.voicecontrol.alexa.parser.a.a(android.net.Uri):com.dyson.mobile.android.connectedhome.voicecontrol.alexa.parser.AlexaAuthResult");
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/parser/a$a;", "", "<init>", "()V", "", "CODE_PARAMETER", "Ljava/lang/String;", "STATE_PARAMETER", "SCOPE_PARAMETER", "ERROR_PARAMETER", "ERROR_DESCRIPTION_PARAMETER", "INVALID_PARAMETERS_ERROR", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.connectedhome.voicecontrol.alexa.parser.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0381a {
        public /* synthetic */ C0381a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0381a() {
        }
    }
}
