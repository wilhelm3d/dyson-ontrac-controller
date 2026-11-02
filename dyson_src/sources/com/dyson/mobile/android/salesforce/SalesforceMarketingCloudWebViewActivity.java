package com.dyson.mobile.android.salesforce;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.FragmentManager;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.salesforce.d;
import f.j;
import f.x;
import h12.p;
import hj.e;
import i12.p0;
import ij.f;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mj.g0;
import se1.q0;
import v32.y;
import x12.r;
import x70.g;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/salesforce/SalesforceMarketingCloudWebViewActivity;", "Ll/b;", "<init>", "()V", "a", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SalesforceMarketingCloudWebViewActivity extends l.b {

    /* renamed from: k  reason: collision with root package name */
    public static final a f16663k = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public hj.e f16664j;

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        x.a aVar = x.e;
        int i13 = q0.f76062b;
        aVar.getClass();
        j.a(this, x.a.b(0, i13), x.a.b(q0.f76061a, i13));
        super.onCreate(bundle);
        this.f16664j = ((e80.b) pa.c.d(com.dyson.mobile.android.b.A)).f26218f.get();
        setSupportActionBar(((g) q8.g.d(this, R.layout.activity_salesforce_marketing_cloud_webview)).e);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
        d.a aVar3 = d.f16689m;
        Intent intent = getIntent();
        intent.getClass();
        aVar3.getClass();
        d dVar = new d();
        Bundle extras = intent.getExtras();
        p pVar = new p("salesforce_marketing_cloud_tracking_id", extras != null ? extras.getString("salesforce_marketing_cloud_tracking_id") : null);
        Bundle extras2 = intent.getExtras();
        p pVar2 = new p("salesforce_marketing_cloud_notification_url", extras2 != null ? extras2.getString("salesforce_marketing_cloud_notification_url") : null);
        Bundle extras3 = intent.getExtras();
        dVar.setArguments(k7.c.a(pVar, pVar2, new p("salesforce_marketing_cloud_notification_type", extras3 != null ? extras3.getString("salesforce_marketing_cloud_notification_type") : null)));
        aVar2.i(R.id.fragment_container_view, dVar, "TAG_FRAGMENT_SALESFORCE_MARKETING_CLOUD_WEBVIEW");
        aVar2.n(true, true);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.n(true);
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() == 16908332) {
            hj.e eVar = this.f16664j;
            if (eVar == null) {
                r.i("trackingManager");
                throw null;
            }
            g0 g0Var = new g0(getIntent().getStringExtra("salesforce_marketing_cloud_tracking_id"), getIntent().getStringExtra("salesforce_marketing_cloud_notification_type"), g0.a.NOTIFICATION_WEB_VIEW);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(p0.c(new p("web_view_name", g0Var.f54209c.getValue())));
            String str = g0Var.f54207a;
            if (str != null && !y.A(str)) {
                linkedHashMap.put("notification_tracking_id", str);
            }
            String str2 = g0Var.f54208b;
            if (str2 != null && !y.A(str2)) {
                linkedHashMap.put("notification_type", str2);
            }
            f fVar = new f("web_view_dismiss", linkedHashMap);
            e.a aVar = hj.e.f38312g;
            eVar.g(fVar, null);
            finish();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/salesforce/SalesforceMarketingCloudWebViewActivity$a;", "", "<init>", "()V", "", "TAG_FRAGMENT_SALESFORCE_MARKETING_CLOUD_WEBVIEW", "Ljava/lang/String;", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static Intent a(Activity activity, String str, String str2, String str3) {
            activity.getClass();
            str.getClass();
            str2.getClass();
            str3.getClass();
            Intent intent = new Intent(activity, SalesforceMarketingCloudWebViewActivity.class);
            intent.putExtra("salesforce_marketing_cloud_tracking_id", str);
            intent.putExtra("salesforce_marketing_cloud_notification_url", str2);
            intent.putExtra("salesforce_marketing_cloud_notification_type", str3);
            return intent;
        }

        private a() {
        }
    }
}
