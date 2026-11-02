package com.dyson.mobile.android.light.permission;

import android.content.Intent;
import android.os.Bundle;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.light.permission.a;
import f.j;
import f.x;
import fm1.o0;
import h12.h;
import h12.m;
import h12.t;
import je0.i;
import ke0.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import le0.d1;
import le0.j0;
import le0.l1;
import le0.n1;
import m9.p;
import pf0.c;
import q8.g;
import rf1.a;
import rf1.e;
import ty1.l;
import v42.f;
import we1.a;
import x12.r;
import yd0.c;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/light/permission/LightPermissionActivity;", "Ll/b;", "<init>", "()V", "a", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LightPermissionActivity extends l.b {

    /* renamed from: m  reason: collision with root package name */
    public static final a f14922m = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public com.dyson.mobile.android.light.permission.a f14923j;

    /* renamed from: k  reason: collision with root package name */
    public c f14924k;

    /* renamed from: l  reason: collision with root package name */
    public final t f14925l = m.b(new uk.a(this, 20));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements p, x12.m {
        public final /* synthetic */ Function1 d;

        public b(Function1 function1) {
            function1.getClass();
            this.d = function1;
        }

        @Override // x12.m
        public final h<?> d() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof p) && (obj instanceof x12.m)) {
                return r.c(d(), ((x12.m) obj).d());
            }
            return false;
        }

        public final int hashCode() {
            return d().hashCode();
        }

        @Override // m9.p
        public final /* synthetic */ void onChanged(Object obj) {
            this.d.invoke(obj);
        }
    }

    public final com.dyson.mobile.android.light.permission.a c1() {
        com.dyson.mobile.android.light.permission.a aVar = this.f14923j;
        if (aVar != null) {
            return aVar;
        }
        r.i("viewModel");
        throw null;
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Please use the newInstance method";
        String y13 = o0.y("COORDINATOR_ID", a13.a("COORDINATOR_ID"));
        yd0.c.f89775o.getClass();
        yd0.c a14 = c.a.a(y13);
        if (a14 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        d dVar = a14.f89779j;
        n1 n1Var = dVar.f47425c;
        d1 d1Var = dVar.f47423a;
        d1Var.getClass();
        rf1.c a15 = l1.a(d1Var, new e(new se1.e()));
        n1Var.getClass();
        this.f14923j = new com.dyson.mobile.android.light.permission.a(a15);
        this.f14924k = j0.a(dVar.f47424b);
        x.e.getClass();
        j.a(this, x.a.a(0), x.a.a(0));
        super.onCreate(bundle);
        i iVar = (i) g.d(this, R.layout.activity_light_permission);
        iVar.getClass();
        iVar.setLifecycleOwner(this);
        iVar.l(c1());
        iVar.f44629g.x(this);
        com.dyson.mobile.android.light.permission.a c13 = c1();
        l lVar = new l(this);
        rf1.g gVar = c13.d;
        gVar.e(lVar, this);
        c13.f14927g.setValue(r.c(gVar.a(), a.c.f73033b) ? ve0.b.BLUETOOTH : (r.c(gVar.a(), a.d.f73034b) || r.c(gVar.a(), a.C2084a.f73031b)) ? ve0.b.FINE_LOCATION : ve0.b.BACKGROUND_LOCATION);
        c1().f14926f.observe(this, new b(new f(this, 9)));
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        com.dyson.mobile.android.light.permission.a c13 = c1();
        if (c13.d.c()) {
            c13.e.setValue(a.AbstractC0497a.C0498a.f14928a);
        }
    }

    @Override // l.b
    public final boolean onSupportNavigateUp() {
        finish();
        return true;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/light/permission/LightPermissionActivity$a;", "", "<init>", "()V", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
