package com.dyson.mobile.android.interactableec.settings.filter.filtermanagement;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import bt0.f;
import com.dyson.mobile.android.interactableec.settings.filter.filtermanagement.a;
import fm1.o0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pa0.t0;
import pl0.e;
import w90.g;
import we1.a;
import x12.r;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/interactableec/settings/filter/filtermanagement/ECFilterManagementActivity;", "Lbt0/f;", "Lbt0/c;", "<init>", "()V", "a", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ECFilterManagementActivity extends f<bt0.c> {

    /* renamed from: s  reason: collision with root package name */
    public static final a f14679s = new a(null);

    /* renamed from: p  reason: collision with root package name */
    public g f14680p;

    /* renamed from: q  reason: collision with root package name */
    public pf0.c f14681q;

    /* renamed from: r  reason: collision with root package name */
    public boolean f14682r;

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        if (this.f14682r) {
            zs0.c.f93105a.getClass();
            zs0.c.c(this);
        }
    }

    @Override // bt0.f
    public final bt0.a i1() {
        return new e();
    }

    @Override // bt0.f, bt0.g, androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (cd.b.J(this)) {
            return;
        }
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Please use the newInstance method";
        Bundle a14 = a13.a("COORDINATOR_ID");
        String y13 = o0.y("COORDINATOR_ID", a14);
        this.f14682r = a14.getBoolean("isFrom829Settings", false);
        g.f85506o.getClass();
        g a15 = g.a.a(y13);
        if (a15 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        this.f14680p = a15;
        this.f14681q = t0.b(a15.f85510j.f59825a);
        if (this.f14682r) {
            e1();
            zs0.c.f93105a.getClass();
            zs0.c.b(this);
        }
        se1.a.a(this, (r3 & 1) == 0, false);
    }

    @Override // bt0.f, android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        if (this.f14682r) {
            return false;
        }
        super.onCreateOptionsMenu(menu);
        return true;
    }

    @Override // bt0.f, l.b, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        a.C0486a c0486a = com.dyson.mobile.android.interactableec.settings.filter.filtermanagement.a.f14683i;
        g gVar = this.f14680p;
        if (gVar == null) {
            r.i("coordinator");
            throw null;
        }
        String str = gVar.f85509i;
        c0486a.getClass();
        str.getClass();
        com.dyson.mobile.android.interactableec.settings.filter.filtermanagement.a aVar = new com.dyson.mobile.android.interactableec.settings.filter.filtermanagement.a();
        Bundle bundle2 = new Bundle();
        bundle2.putString("COORDINATOR_ID", str);
        aVar.setArguments(bundle2);
        pf0.c cVar = this.f14681q;
        if (cVar != null) {
            o1(aVar, cVar.d(rf0.f.f71307q1), null, null);
        } else {
            r.i("localisationManager");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/interactableec/settings/filter/filtermanagement/ECFilterManagementActivity$a;", "", "<init>", "()V", "", "EXTRA_IS_FROM_829_SETTINGS", "Ljava/lang/String;", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
