package com.dyson.mobile.android.getconnected.legacy;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.b;
import f.j;
import f.x;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kz1.b;
import pa.c;
import q7.j0;
import q7.t0;
import q8.g;
import q8.t;
import se1.q0;
import ss0.k;
import v80.f;
import x12.r;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/getconnected/legacy/GetConnectedActivity;", "Ll/b;", "<init>", "()V", "a", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class GetConnectedActivity extends l.b {

    /* renamed from: l  reason: collision with root package name */
    public static final a f14142l = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public f f14143j;

    /* renamed from: k  reason: collision with root package name */
    public final b f14144k = new b();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/getconnected/legacy/GetConnectedActivity$b", "Lv80/a;", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements v80.a {
        public b() {
        }

        @Override // v80.a
        public final void a() {
            com.dyson.mobile.android.b.A.getClass();
            b.a.a().w(GetConnectedActivity.this);
        }

        @Override // v80.a
        public final void b() {
            com.dyson.mobile.android.b.A.getClass();
            b.a.a().x(GetConnectedActivity.this);
        }

        @Override // v80.a
        public final void c(boolean z13) {
            com.dyson.mobile.android.b.A.getClass();
            b.a.a();
            com.dyson.mobile.android.b.s(GetConnectedActivity.this, z13);
        }
    }

    public final f c1() {
        f fVar = this.f14143j;
        if (fVar != null) {
            return fVar;
        }
        r.i("getConnectedViewModel");
        throw null;
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    @SuppressLint({"FunctionCallWithoutNamedArguments"})
    public final void onCreate(Bundle bundle) {
        e80.b bVar = (e80.b) c.d(com.dyson.mobile.android.b.A);
        bVar.f26212b.getClass();
        this.f14143j = new f(bVar.e.get(), bVar.Q.get(), bVar.f26218f.get());
        te1.a.f79277a.getClass();
        if (!te1.a.f79278b) {
            te1.a.a(this);
            super.onCreate(null);
            return;
        }
        super.onCreate(bundle);
        overridePendingTransition(17432576, 17432577);
        x.e.getClass();
        j.a(this, x.a.a(0), x.a.a(0));
        t d = g.d(this, R.layout.activity_getconnected);
        d.getClass();
        ((x70.c) d).l(c1());
        View findViewById = findViewById(R.id.getconnected_screen);
        findViewById.getClass();
        int i13 = q0.f76061a;
        s72.a aVar = new s72.a(9);
        WeakHashMap<View, t0> weakHashMap = j0.f66049a;
        j0.d.c(findViewById, aVar);
        findViewById.requestApplyInsets();
        View findViewById2 = findViewById(R.id.robot_image);
        View findViewById3 = findViewById(R.id.welcome_textview);
        View findViewById4 = findViewById(R.id.welcome_description_textview);
        getLifecycle().a(c1());
        f c13 = c1();
        c13.f83662g = findViewById2;
        c13.f83663h = findViewById3;
        c13.f83664i = findViewById4;
        findViewById3.setVisibility(4);
        c13.f83664i.setVisibility(4);
        v80.b bVar2 = new v80.b(c13);
        b.a aVar2 = kz1.b.f50218a;
        new nz1.f(bVar2).z(fz1.a.a()).r(fz1.a.a()).g(new nz1.f(new k(3, c13, c13.f83663h))).g(new nz1.f(new k(3, c13, c13.f83664i))).v();
    }

    @Override // l.b, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        c1();
        getLifecycle().c(c1());
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        c1().e = new WeakReference<>(this.f14144k);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/getconnected/legacy/GetConnectedActivity$a;", "", "<init>", "()V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
