package com.dyson.mobile.android.connectionjourney.ownership.question;

import android.content.Intent;
import android.os.Bundle;
import bt0.g;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.connectionjourney.ownership.claiminfo.OwnershipClaimInfoActivity;
import com.dyson.mobile.android.connectionjourney.ownership.justusing.OwnershipJustUsingActivity;
import d40.e;
import f.j;
import f.x;
import f20.a1;
import i20.x1;
import nj.j3;
import p30.z;
import t30.b;
/* loaded from: classes2.dex */
public class OwnershipQuestionActivity extends g {

    /* renamed from: k  reason: collision with root package name */
    public e f13844k;

    /* renamed from: l  reason: collision with root package name */
    public final a f13845l = new a();

    /* loaded from: classes2.dex */
    public class a implements d40.a {
        public a() {
        }

        @Override // d40.a
        public final void a() {
            OwnershipQuestionActivity ownershipQuestionActivity = OwnershipQuestionActivity.this;
            z.d(ownershipQuestionActivity).getClass();
            OwnershipJustUsingActivity.f13831l.getClass();
            ownershipQuestionActivity.getClass();
            ownershipQuestionActivity.startActivity(new Intent(ownershipQuestionActivity, OwnershipJustUsingActivity.class));
        }

        @Override // d40.a
        public final void b() {
            OwnershipQuestionActivity ownershipQuestionActivity = OwnershipQuestionActivity.this;
            z.d(ownershipQuestionActivity).getClass();
            OwnershipClaimInfoActivity.f13785l.getClass();
            ownershipQuestionActivity.getClass();
            ownershipQuestionActivity.startActivity(new Intent(ownershipQuestionActivity, OwnershipClaimInfoActivity.class));
        }
    }

    @Override // bt0.g, androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        x.e.getClass();
        j.a(this, x.a.a(0), x.a.a(0));
        super.onCreate(bundle);
        b bVar = z.d(this).f62827c;
        bVar.b();
        bVar.f78103c.getClass();
        e eVar = new e(bVar.a(), x1.b(bVar.f78102b), bVar.f78117s.get());
        this.f13844k = eVar;
        eVar.f22768k.setValue(eVar, e.f22766l[0], this.f13845l);
        a1 a1Var = (a1) q8.g.d(this, R.layout.activity_ownership_question_screen);
        a1Var.l(this.f13844k);
        a1Var.f28925j.x(this);
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        int i13 = j3.f57541a;
        new ij.b("connection_journey.ownership.ownership_question", null, 2, null).b();
        invalidateOptionsMenu();
    }

    @Override // l.b
    public final boolean onSupportNavigateUp() {
        z.d(this).e(this);
        return true;
    }
}
