package com.dyson.mobile.android.resources.view.activities.connectivityissue;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.fragment.app.e;
import bt0.b;
import bt0.d;
import bv1.f;
import ct0.c;
import iz1.a;
/* loaded from: classes3.dex */
public class ConnectivityIssueActivity extends d implements c {

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ int f15755l = 0;

    public static void f1(e eVar, a aVar, a aVar2) {
        uf1.d.a(eVar).b(new Intent(eVar, ConnectivityIssueActivity.class).putExtra("extraTheme", 2132083505).putExtra("EXTRA_BODY_COPY", (String) null)).p(new ct0.a(aVar, aVar2, 0), new f(15));
    }

    @Override // bt0.d
    public final bt0.a d1() {
        return new b();
    }

    @Override // ct0.c
    public final void m() {
        setResult(2);
        finish();
    }

    @Override // bt0.d, bt0.g, androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        String string = extras != null ? extras.getString("EXTRA_BODY_COPY", null) : null;
        if (TextUtils.isEmpty(string)) {
            e1(new ct0.b());
        } else {
            Bundle bundle2 = new Bundle();
            bundle2.putString("bodyCopy", string);
            ct0.b bVar = new ct0.b();
            bVar.setArguments(bundle2);
            e1(bVar);
        }
        se1.a.a(this, (r3 & 1) == 0, false);
    }
}
