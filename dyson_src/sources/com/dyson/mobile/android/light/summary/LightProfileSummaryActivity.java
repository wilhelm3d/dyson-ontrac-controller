package com.dyson.mobile.android.light.summary;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.light.summary.a;
import f.j;
import f.x;
import fm1.o0;
import je0.k;
import ke0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import le0.n1;
import q8.g;
import we1.a;
import x12.r;
import yd0.c;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/light/summary/LightProfileSummaryActivity;", "Ll/b;", "<init>", "()V", "a", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LightProfileSummaryActivity extends l.b {

    /* renamed from: m  reason: collision with root package name */
    public static final a f15061m = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public com.dyson.mobile.android.light.summary.a f15062j;

    /* renamed from: k  reason: collision with root package name */
    public c f15063k;

    /* renamed from: l  reason: collision with root package name */
    public final b f15064l = new b();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/light/summary/LightProfileSummaryActivity$b", "Lcom/dyson/mobile/android/light/summary/a$b;", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements a.b {
        public b() {
        }

        @Override // com.dyson.mobile.android.light.summary.a.b
        public final void a() {
            LightProfileSummaryActivity lightProfileSummaryActivity = LightProfileSummaryActivity.this;
            c cVar = lightProfileSummaryActivity.f15063k;
            if (cVar != null) {
                cVar.o(lightProfileSummaryActivity);
            } else {
                r.i("coordinator");
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Please use the newInstance method";
        String y13 = o0.y("COORDINATOR_ID", a13.a("COORDINATOR_ID"));
        c.f89775o.getClass();
        c a14 = c.a.a(y13);
        if (a14 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        this.f15063k = a14;
        d dVar = a14.f89779j;
        n1 n1Var = dVar.f47425c;
        og0.a c13 = dVar.c();
        n1Var.getClass();
        this.f15062j = new com.dyson.mobile.android.light.summary.a(c13);
        x.e.getClass();
        j.a(this, x.a.a(0), x.a.a(0));
        super.onCreate(bundle);
        k kVar = (k) g.d(this, R.layout.activity_light_profile_summary);
        kVar.f44664j.x(this);
        com.dyson.mobile.android.light.summary.a aVar = this.f15062j;
        if (aVar == null) {
            r.i("viewModel");
            throw null;
        }
        kVar.l(aVar);
        com.dyson.mobile.android.light.summary.a aVar2 = this.f15062j;
        if (aVar2 == null) {
            r.i("viewModel");
            throw null;
        }
        aVar2.f15072k.setValue(aVar2, com.dyson.mobile.android.light.summary.a.f15066p[0], this.f15064l);
        Lifecycle lifecycle = getLifecycle();
        com.dyson.mobile.android.light.summary.a aVar3 = this.f15062j;
        if (aVar3 != null) {
            lifecycle.a(aVar3);
        } else {
            r.i("viewModel");
            throw null;
        }
    }

    @Override // l.b, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        Lifecycle lifecycle = getLifecycle();
        com.dyson.mobile.android.light.summary.a aVar = this.f15062j;
        if (aVar != null) {
            lifecycle.c(aVar);
        } else {
            r.i("viewModel");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/light/summary/LightProfileSummaryActivity$a;", "", "<init>", "()V", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
