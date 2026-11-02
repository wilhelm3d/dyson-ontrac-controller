package com.dyson.mobile.android.notification.provider.fcm;

import com.dyson.mobile.android.logging.Logger;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.salesforce.marketingcloud.sfmcsdk.modules.ModuleInterface;
import com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleInterface;
import com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleReadyListener;
import eo0.h;
import eo0.n;
import go0.d;
import go0.g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pf0.c;
import pf0.e;
import qh.j;
import x12.r;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/notification/provider/fcm/FcmMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "<init>", "()V", "a", "mod-notification"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FcmMessagingService extends FirebaseMessagingService {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f15587f = 0;
    public final ho0.a d;
    public final n e;

    static {
        new a(null);
    }

    public FcmMessagingService() {
        fo0.b bVar = h.a(this).f28201a;
        go0.a aVar = bVar.f32080a;
        j b13 = go0.b.b(aVar);
        c cVar = new e(aVar.f35917a).f64085a;
        cVar.getClass();
        this.d = d.a(aVar, b13, g.a(aVar, cVar), bVar.f32081b.get());
        this.e = bVar.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00dd A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00de  */
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMessageReceived(com.google.firebase.messaging.RemoteMessage r18) {
        /*
            Method dump skipped, instructions count: 898
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.notification.provider.fcm.FcmMessagingService.onMessageReceived(com.google.firebase.messaging.RemoteMessage):void");
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public final void onNewToken(String str) {
        str.getClass();
        Logger.a("Received FCM token refresh callback - ".concat(str));
        n nVar = this.e;
        if (nVar != null) {
            nVar.a();
        } else {
            r.i("notificationRegistrationManager");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/dyson/mobile/android/notification/provider/fcm/FcmMessagingService$a;", "", "<init>", "()V", "", "KEY_SERIAL", "Ljava/lang/String;", "KEY_TYPE", "KEY_MESSAGE", "KEY_DEEPLINK", "KEY_TITLE", "mod-notification"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b implements PushModuleReadyListener {
        public final /* synthetic */ RemoteMessage d;

        public b(RemoteMessage remoteMessage) {
            this.d = remoteMessage;
        }

        @Override // com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleReadyListener
        public final void ready(PushModuleInterface pushModuleInterface) {
            pushModuleInterface.getClass();
            pushModuleInterface.getPushMessageManager().handleMessage(this.d);
        }

        @Override // com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleReadyListener, com.salesforce.marketingcloud.sfmcsdk.modules.ModuleReadyListener
        public final /* bridge */ void ready(ModuleInterface moduleInterface) {
            PushModuleReadyListener.DefaultImpls.ready(this, moduleInterface);
        }
    }
}
