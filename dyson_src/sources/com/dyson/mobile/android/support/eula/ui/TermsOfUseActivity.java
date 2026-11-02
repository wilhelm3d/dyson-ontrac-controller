package com.dyson.mobile.android.support.eula.ui;

import android.content.Intent;
import android.os.Bundle;
import c4.c;
import cd.b;
import f.g;
import f.j;
import f.x;
import fm1.o0;
import g.f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import we1.a;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/support/eula/ui/TermsOfUseActivity;", "Lf/g;", "<init>", "()V", "a", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TermsOfUseActivity extends g {

    /* renamed from: k  reason: collision with root package name */
    public static final a f16823k = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public String f16824j;

    @Override // f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        x.e.getClass();
        j.a(this, x.a.a(0), x.a.a(0));
        super.onCreate(bundle);
        b.J(this);
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "TermsOfUseActivity requires mandatory arguments; Please use newInstance method to create intents";
        this.f16824j = o0.y("ARG_TARGET_COUNTRY_CODE", a13.a("ARG_TARGET_COUNTRY_CODE"));
        f.a(this, new c(-872610127, true, new t71.a(this, 0)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/support/eula/ui/TermsOfUseActivity$a;", "", "<init>", "()V", "", "ARG_TARGET_COUNTRY_CODE", "Ljava/lang/String;", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
