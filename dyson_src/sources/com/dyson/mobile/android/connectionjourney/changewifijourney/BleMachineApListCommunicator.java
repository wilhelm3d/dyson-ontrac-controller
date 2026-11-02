package com.dyson.mobile.android.connectionjourney.changewifijourney;

import f60.j0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q70.p0;
import q70.x;
import qv1.s;
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\n\u000bB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/changewifijourney/BleMachineApListCommunicator;", "", "Lq70/x;", "gattTaskFactory", "Lf60/j0;", "ltkRetriever", "Lq70/p0;", "regionIndexResolver", "<init>", "(Lq70/x;Lf60/j0;Lq70/p0;)V", "WifiConnectionException", "a", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BleMachineApListCommunicator {
    public static final /* synthetic */ int d = 0;

    /* renamed from: a  reason: collision with root package name */
    public final x f13380a;

    /* renamed from: b  reason: collision with root package name */
    public final j0 f13381b;

    /* renamed from: c  reason: collision with root package name */
    public final p0 f13382c;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/changewifijourney/BleMachineApListCommunicator$WifiConnectionException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "reason", "<init>", "(I)V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class WifiConnectionException extends Exception {
        public final int d;

        public WifiConnectionException(int i13) {
            super(s.f(i13, "Could not connect to AP - "));
            this.d = i13;
        }
    }

    static {
        new a(null);
    }

    public BleMachineApListCommunicator(x xVar, j0 j0Var, p0 p0Var) {
        xVar.getClass();
        j0Var.getClass();
        p0Var.getClass();
        this.f13380a = xVar;
        this.f13381b = j0Var;
        this.f13382c = p0Var;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/changewifijourney/BleMachineApListCommunicator$a;", "", "<init>", "()V", "", "WIFI_LIST_TIMEOUT_SECS", "J", "", "WIFI_LIST_RETRIES", "I", "READY_TO_RECEIVE_WAIT_RESPONSE_SECS", "READY_TO_RECEIVE_TIMEOUT_SECS", "SEND_JOIN_NETWORK_TIMEOUT_SECS", "JOIN_NETWORK_MAX_RETRIES", "JOIN_NETWORK_DELAY_BETWEEN_RETRIES", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
