package com.dyson.mobile.android.light.control;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.dyson.mobile.android.R;
import com.paypal.pyplcheckout.data.api.okhttp.interceptor.NetworkRetryInterceptor;
import f.j;
import f.x;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import we1.a;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/light/control/LightModeAnimationActivity;", "Ll/b;", "<init>", "()V", "a", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LightModeAnimationActivity extends l.b {

    /* renamed from: l  reason: collision with root package name */
    public static final a f14781l = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public final Handler f14782j = new Handler();

    /* renamed from: k  reason: collision with root package name */
    public final f8.b f14783k = new f8.b(this, 28);

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        x.e.getClass();
        j.a(this, x.a.a(0), x.a.a(0));
        super.onCreate(bundle);
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Please use the newInstance method";
        Bundle a14 = a13.a("COORDINATOR_ID", "EXTRA_TITLE", "EXTRA_DRAWABLE_ID");
        je0.c cVar = (je0.c) q8.g.d(this, R.layout.activity_light_mode_animation);
        cVar.f44534f.setText(a14.getString("EXTRA_TITLE"));
        mb.d a15 = mb.d.a(this, a14.getInt("EXTRA_DRAWABLE_ID"));
        cVar.d.setImageDrawable(a15);
        a15.start();
        this.f14782j.postDelayed(this.f14783k, NetworkRetryInterceptor.DEFAULT_RETRY_DELAY);
    }

    @Override // l.b, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        this.f14782j.removeCallbacks(this.f14783k);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/dyson/mobile/android/light/control/LightModeAnimationActivity$a;", "", "<init>", "()V", "", "EXTRA_DRAWABLE_ID", "Ljava/lang/String;", "EXTRA_TITLE", "", "ACTIVITY_FINISH_DELAY_MILLIS", "J", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static Intent a(Context context, String str, String str2, int i13) {
            context.getClass();
            str.getClass();
            Intent putExtra = new Intent(context, LightModeAnimationActivity.class).putExtra("COORDINATOR_ID", str).putExtra("EXTRA_TITLE", str2).putExtra("EXTRA_DRAWABLE_ID", i13);
            putExtra.getClass();
            return putExtra;
        }

        private a() {
        }
    }
}
