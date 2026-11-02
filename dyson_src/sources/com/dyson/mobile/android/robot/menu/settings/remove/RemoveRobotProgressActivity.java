package com.dyson.mobile.android.robot.menu.settings.remove;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.widget.Toast;
import bv0.a2;
import bv0.d9;
import bv0.e8;
import bv0.s0;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.localisation.LocalisationKey;
import com.dyson.mobile.android.robot.menu.settings.remove.RemoveRobotProgressActivity;
import com.dyson.mobile.android.robot.menu.settings.remove.moreinfo.RemoveRobotMoreInfoActivity;
import ey0.d;
import ey0.h;
import f.j;
import f.x;
import iu0.t;
import iu0.z;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pf0.c;
import q8.g;
import rf0.g0;
import we1.a;
import x12.r;
import zs0.e;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/robot/menu/settings/remove/RemoveRobotProgressActivity;", "Ll/b;", "<init>", "()V", "a", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RemoveRobotProgressActivity extends l.b {

    /* renamed from: n  reason: collision with root package name */
    public static final a f16222n = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public h f16223j;

    /* renamed from: k  reason: collision with root package name */
    public c f16224k;

    /* renamed from: l  reason: collision with root package name */
    public z f16225l;

    /* renamed from: m  reason: collision with root package name */
    public final b f16226m = new b();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/robot/menu/settings/remove/RemoveRobotProgressActivity$b", "Ley0/d;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b implements d {
        public b() {
        }

        @Override // ey0.d
        public final void a(LocalisationKey localisationKey) {
            localisationKey.getClass();
            RemoveRobotProgressActivity removeRobotProgressActivity = RemoveRobotProgressActivity.this;
            Toast.makeText(removeRobotProgressActivity, removeRobotProgressActivity.c1().d(localisationKey), 1).show();
        }

        @Override // ey0.d
        public final void b() {
            RemoveRobotProgressActivity removeRobotProgressActivity = RemoveRobotProgressActivity.this;
            removeRobotProgressActivity.setResult(0);
            removeRobotProgressActivity.finish();
        }

        @Override // ey0.d
        public final void c() {
            RemoveRobotProgressActivity removeRobotProgressActivity = RemoveRobotProgressActivity.this;
            removeRobotProgressActivity.setResult(-1);
            removeRobotProgressActivity.finish();
        }

        @Override // ey0.d
        public final void d(LocalisationKey localisationKey, LocalisationKey localisationKey2, LocalisationKey localisationKey3, LocalisationKey localisationKey4, LocalisationKey localisationKey5) {
            localisationKey.getClass();
            localisationKey2.getClass();
            localisationKey3.getClass();
            localisationKey4.getClass();
            final RemoveRobotProgressActivity removeRobotProgressActivity = RemoveRobotProgressActivity.this;
            e.a a13 = new e(removeRobotProgressActivity).a();
            a13.f93107a = removeRobotProgressActivity.c1().d(localisationKey);
            a13.f93108b = removeRobotProgressActivity.c1().d(localisationKey2);
            a13.c(removeRobotProgressActivity.c1().d(localisationKey3), new e.b() { // from class: ey0.c
                @Override // zs0.e.b
                public final void a() {
                    int i13 = r2;
                    RemoveRobotProgressActivity removeRobotProgressActivity2 = removeRobotProgressActivity;
                    switch (i13) {
                        case 0:
                            h d13 = removeRobotProgressActivity2.d1();
                            if (d13.f28728j == h.b.Incomplete) {
                                d13.b(true);
                                return;
                            } else {
                                d13.b(false);
                                return;
                            }
                        case 1:
                            d a14 = removeRobotProgressActivity2.d1().a();
                            if (a14 != null) {
                                a14.b();
                                return;
                            }
                            return;
                        default:
                            h d14 = removeRobotProgressActivity2.d1();
                            d14.f28728j = h.b.SkippedFailure;
                            d14.b(false);
                            return;
                    }
                }
            });
            a13.b(removeRobotProgressActivity.c1().d(localisationKey4), new e.b() { // from class: ey0.c
                @Override // zs0.e.b
                public final void a() {
                    int i13 = r2;
                    RemoveRobotProgressActivity removeRobotProgressActivity2 = removeRobotProgressActivity;
                    switch (i13) {
                        case 0:
                            h d13 = removeRobotProgressActivity2.d1();
                            if (d13.f28728j == h.b.Incomplete) {
                                d13.b(true);
                                return;
                            } else {
                                d13.b(false);
                                return;
                            }
                        case 1:
                            d a14 = removeRobotProgressActivity2.d1().a();
                            if (a14 != null) {
                                a14.b();
                                return;
                            }
                            return;
                        default:
                            h d14 = removeRobotProgressActivity2.d1();
                            d14.f28728j = h.b.SkippedFailure;
                            d14.b(false);
                            return;
                    }
                }
            });
            if (localisationKey5 != null) {
                a13.e = new Pair<>(removeRobotProgressActivity.c1().d(localisationKey5), new e.b() { // from class: ey0.c
                    @Override // zs0.e.b
                    public final void a() {
                        int i13 = r2;
                        RemoveRobotProgressActivity removeRobotProgressActivity2 = removeRobotProgressActivity;
                        switch (i13) {
                            case 0:
                                h d13 = removeRobotProgressActivity2.d1();
                                if (d13.f28728j == h.b.Incomplete) {
                                    d13.b(true);
                                    return;
                                } else {
                                    d13.b(false);
                                    return;
                                }
                            case 1:
                                d a14 = removeRobotProgressActivity2.d1().a();
                                if (a14 != null) {
                                    a14.b();
                                    return;
                                }
                                return;
                            default:
                                h d14 = removeRobotProgressActivity2.d1();
                                d14.f28728j = h.b.SkippedFailure;
                                d14.b(false);
                                return;
                        }
                    }
                });
            }
            a13.d();
        }

        @Override // ey0.d
        public final void e() {
            RemoveRobotMoreInfoActivity.a aVar = RemoveRobotMoreInfoActivity.f16228n;
            RemoveRobotProgressActivity removeRobotProgressActivity = RemoveRobotProgressActivity.this;
            z zVar = removeRobotProgressActivity.f16225l;
            if (zVar == null) {
                r.i("robotCoordinator");
                throw null;
            }
            String str = zVar.f42726i;
            aVar.getClass();
            removeRobotProgressActivity.getClass();
            str.getClass();
            Intent intent = new Intent(removeRobotProgressActivity, RemoveRobotMoreInfoActivity.class);
            intent.putExtra("COORDINATOR_ID", str);
            intent.putExtra("extraTheme", 2132083504);
            removeRobotProgressActivity.startActivity(intent);
        }
    }

    public final c c1() {
        c cVar = this.f16224k;
        if (cVar != null) {
            return cVar;
        }
        r.i("localisationManager");
        throw null;
    }

    public final h d1() {
        h hVar = this.f16223j;
        if (hVar != null) {
            return hVar;
        }
        r.i("viewModel");
        throw null;
    }

    @Override // f.g, android.app.Activity
    @SuppressLint({"MissingSuperCall"})
    @h12.e
    public final void onBackPressed() {
        h d13 = d1();
        if (d13.f28729k == h.b.Complete) {
            d a13 = d13.a();
            if (a13 != null) {
                a13.c();
                return;
            }
            return;
        }
        d a14 = d13.a();
        if (a14 != null) {
            a14.a(g0.R1);
        }
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        x.e.getClass();
        j.a(this, x.a.a(0), x.a.a(0));
        super.onCreate(bundle);
        if (cd.b.J(this)) {
            return;
        }
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "RemoveRobotProgressActivity cannot be initialised without the required arguments, please use the newInstance method";
        a13.a("COORDINATOR_ID", "reset-required");
        String stringExtra = getIntent().getStringExtra("COORDINATOR_ID");
        z.f42723r.getClass();
        z a14 = z.a.a(stringExtra);
        if (a14 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        this.f16225l = a14;
        av0.d dVar = a14.f42732o.f42663a;
        e8 e8Var = dVar.f5515c;
        s0 s0Var = dVar.f5510b;
        this.f16223j = d9.a(e8Var, s0Var.f9016b, a2.b(s0Var), new t(new u50.d().b().c(s0Var.f9016b.f42685b)), dVar.f(), dVar.K.get());
        this.f16224k = dVar.b();
        ((yu0.a) g.d(this, R.layout.activity_remove_robot_progress)).l(d1());
        h d13 = d1();
        d13.f28730l.setValue(d13, h.f28723r[0], this.f16226m);
        h d14 = d1();
        boolean booleanExtra = getIntent().getBooleanExtra("reset-required", false);
        d14.f28728j = booleanExtra ? h.b.Incomplete : h.b.SkippedNotRequired;
        d14.b(booleanExtra);
        getLifecycle().a(d1());
    }

    @Override // l.b, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        getLifecycle().c(d1());
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/robot/menu/settings/remove/RemoveRobotProgressActivity$a;", "", "<init>", "()V", "", "RESET_REQUIRED_ARG", "Ljava/lang/String;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
