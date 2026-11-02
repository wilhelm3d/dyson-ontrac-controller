package com.dyson.mobile.android.updaterequired;

import android.os.Bundle;
import com.dyson.mobile.android.b;
import de1.f;
import f.j;
import f.x;
import f80.t1;
import h12.f0;
import hj.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import se1.w;
import x12.p;
import x12.r;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/updaterequired/UpdateRequiredActivity;", "Ll/b;", "<init>", "()V", "a", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UpdateRequiredActivity extends l.b {

    /* renamed from: l  reason: collision with root package name */
    public static final a f16962l = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public f f16963j;

    /* renamed from: k  reason: collision with root package name */
    public com.dyson.mobile.android.b f16964k;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class b extends p implements w12.a<f0> {
        public b(Object obj) {
            super(0, obj, f.class, "trackScreen", "trackScreen()V", 0);
        }

        @Override // w12.a
        public final f0 invoke() {
            e eVar = ((f) this.receiver).f23585a;
            int i13 = nj.c.f57425a;
            ij.b bVar = new ij.b("common.app_unsupported.force_update", null, 2, null);
            e.a aVar = e.f38312g;
            eVar.h(bVar, null);
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class c extends p implements w12.a<f0> {
        public c(Object obj) {
            super(0, obj, UpdateRequiredActivity.class, "onUpdateClicked", "onUpdateClicked()V", 0);
        }

        @Override // w12.a
        public final f0 invoke() {
            UpdateRequiredActivity updateRequiredActivity = (UpdateRequiredActivity) this.receiver;
            if (updateRequiredActivity.f16964k != null) {
                com.dyson.mobile.android.b.r(updateRequiredActivity);
                return f0.f36844a;
            }
            r.i("coordinator");
            throw null;
        }
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        x.e.getClass();
        j.a(this, x.a.a(0), x.a.a(0));
        super.onCreate(bundle);
        te1.a.f79277a.getClass();
        if (!te1.a.f79278b) {
            te1.a.a(this);
            return;
        }
        com.dyson.mobile.android.b.A.getClass();
        com.dyson.mobile.android.b a13 = b.a.a();
        e80.b bVar = (e80.b) a13.f();
        t1 t1Var = bVar.f26212b;
        bVar.f26210a.getClass();
        t1Var.getClass();
        this.f16963j = new f(new w(bVar.e.get()), bVar.f26218f.get());
        this.f16964k = a13;
        g.f.a(this, new c4.c(-713429243, true, new de1.e(this, 0)));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/updaterequired/UpdateRequiredActivity$a;", "", "<init>", "()V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
