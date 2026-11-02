package com.dyson.mobile.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.dyson.mobile.android.b;
import ee1.e;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import p30.z;
import qh.j0;
import sp0.a;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/a;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        if (intent == null || !intent.hasExtra("coordinator-intent")) {
            return;
        }
        int intExtra = intent.getIntExtra("coordinator-intent", 0);
        if (intExtra == 0) {
            b.A.getClass();
            b.a.a().v(context);
        } else if (intExtra == 1) {
            b.A.getClass();
            b a13 = b.a.a();
            z d = z.d(context);
            b.g gVar = a13.f12822x;
            d.getClass();
            d.f62826b = new WeakReference<>(gVar);
        } else if (intExtra == 2) {
            b.A.getClass();
            b a14 = b.a.a();
            j0 c13 = j0.c(context);
            b.d dVar = a14.f12818t;
            c13.getClass();
            c13.e = new WeakReference<>(dVar);
        } else if (intExtra == 3) {
            b.A.getClass();
            b a15 = b.a.a();
            e.f26806c.getClass();
            e.a.a(context).f26808b = new SoftReference<>(a15.f12819u);
        } else if (intExtra != 4) {
            pa.c.o(" is not being handled in the ", "The SubCoordinator with ID: ", intExtra, a.class);
        } else {
            b.A.getClass();
            b a16 = b.a.a();
            sp0.a.d.getClass();
            sp0.a a17 = a.C2225a.a(context);
            b.h hVar = a16.f12824z;
            hVar.getClass();
            a17.f76712a = new SoftReference<>(hVar);
        }
    }
}
