package com.dyson.mobile.android.purchasing.ui.screen.payment.paypal;

import af1.h;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.k;
import b0.d1;
import bv1.f;
import com.braintreepayments.api.PayPalNativeCheckoutRequest;
import com.dyson.mobile.android.purchasing.ui.screen.payment.paypal.model.PayPalRequest;
import de.q1;
import de.v;
import de.w;
import h12.f0;
import i3.n;
import ir0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l.b;
import pa.c;
import sp0.a;
import we1.a;
import x12.r;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/purchasing/ui/screen/payment/paypal/PayPalActivity;", "Ll/b;", "", "<init>", "()V", "a", "mod-purchasing"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PayPalActivity extends b {

    /* renamed from: m  reason: collision with root package name */
    public static final a f15616m = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public com.dyson.mobile.android.purchasing.ui.screen.payment.paypal.a f15617j;

    /* renamed from: k  reason: collision with root package name */
    public ip0.b f15618k;

    /* renamed from: l  reason: collision with root package name */
    public h f15619l;

    public final void c1(Exception exc) {
        com.dyson.mobile.android.purchasing.ui.screen.payment.paypal.a aVar = this.f15617j;
        if (aVar == null) {
            r.i("payPalPaymentHandler");
            throw null;
        }
        hr0.a aVar2 = aVar.f15621b;
        if (aVar2 != null) {
            aVar2.a(new a.C1341a(exc));
        }
        finish();
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        Object a13 = k7.b.a(a.C2547a.a(intent).a("PAYPAL_ARGS"), "PAYPAL_ARGS", PayPalArguments.class);
        if (a13 == null) {
            c.w("PAYPAL_ARGS was null");
            return;
        }
        PayPalRequest payPalRequest = ((PayPalArguments) ((Parcelable) a13)).d;
        a.C2225a c2225a = sp0.a.d;
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        c2225a.getClass();
        tp0.b bVar = a.C2225a.a(applicationContext).f76714c;
        this.f15617j = bVar.D.get();
        this.f15618k = bVar.S.get();
        bVar.f80036a.getClass();
        this.f15619l = new h();
        ip0.b bVar2 = this.f15618k;
        if (bVar2 == null) {
            r.i("payPalTokenTask");
            throw null;
        }
        k o13 = n.o(this);
        h hVar = this.f15619l;
        if (hVar == null) {
            r.i("dispatcherProvider");
            throw null;
        }
        w wVar = new w(this, new hr0.c(bVar2, o13, hVar), (String) null, (Uri) null, 12, (DefaultConstructorMarker) null);
        q1 q1Var = new q1(wVar);
        q1Var.f23484c = this;
        PayPalNativeCheckoutRequest payPalNativeCheckoutRequest = new PayPalNativeCheckoutRequest(payPalRequest.d);
        payPalNativeCheckoutRequest.f11922t = payPalRequest.e;
        payPalNativeCheckoutRequest.f11934n = f.d(getPackageName(), "://paypalpay");
        f0 f0Var = f0.f36844a;
        wVar.a(new v(wVar, new d1(14, q1Var, this, payPalNativeCheckoutRequest)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/purchasing/ui/screen/payment/paypal/PayPalActivity$a;", "", "<init>", "()V", "", "PAYPAL_ARGS", "Ljava/lang/String;", "RETURN_URL_SUFFIX", "mod-purchasing"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
