package com.dyson.mobile.android.purchasing.ui.screen.payment.paypal;

import android.content.Context;
import android.content.Intent;
import com.dyson.mobile.android.purchasing.ui.screen.payment.paypal.PayPalActivity;
import com.dyson.mobile.android.purchasing.ui.screen.payment.paypal.model.PayPalRequest;
import eq0.b;
import kotlin.Metadata;
import l12.h;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/purchasing/ui/screen/payment/paypal/a;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "mod-purchasing"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Context f15620a;

    /* renamed from: b  reason: collision with root package name */
    public hr0.a f15621b;

    public a(Context context) {
        context.getClass();
        this.f15620a = context;
    }

    public final Object a(PayPalRequest payPalRequest, b.d.C0933b c0933b) {
        h hVar = new h(m12.b.b(c0933b));
        this.f15621b = new hr0.a(this, hVar);
        PayPalActivity.a aVar = PayPalActivity.f15616m;
        PayPalArguments payPalArguments = new PayPalArguments(payPalRequest);
        aVar.getClass();
        Context context = this.f15620a;
        Intent putExtra = new Intent(context, PayPalActivity.class).putExtra("PAYPAL_ARGS", payPalArguments);
        putExtra.getClass();
        putExtra.addFlags(268435456);
        context.startActivity(putExtra);
        Object b13 = hVar.b();
        m12.a aVar2 = m12.a.COROUTINE_SUSPENDED;
        return b13;
    }
}
