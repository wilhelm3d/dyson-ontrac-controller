package com.dyson.mobile.android.connectedhome.listeners;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.dyson.mobile.android.logging.Logger;
import kotlin.Metadata;
import kz.a;
import x12.r;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/listeners/ConnectedHomeLocaleChangedListener;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ConnectedHomeLocaleChangedListener extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        if (r.c(intent.getAction(), "android.intent.action.LOCALE_CHANGED")) {
            Logger.a("Connected home: Locale has been changed");
            a.f50192c.getClass();
            a.C1547a.a(context);
            a.d = null;
        }
    }
}
