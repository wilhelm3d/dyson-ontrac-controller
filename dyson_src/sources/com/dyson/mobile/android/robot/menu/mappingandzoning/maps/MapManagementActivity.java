package com.dyson.mobile.android.robot.menu.mappingandzoning.maps;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import bt0.c;
import bt0.f;
import bv0.b2;
import bv0.e8;
import bv0.j2;
import bv0.r8;
import bv0.s0;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.machinetype.MachineType;
import com.dyson.mobile.android.robot.onboarding.legacy.steps.RobotOnboardingStep;
import dx0.d;
import ew0.i;
import ex0.c;
import fm1.o0;
import iu0.z;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ma.e;
import ms0.l;
import ms0.m;
import rf0.j;
import we1.a;
import x12.r;
import z31.c;
import z31.f;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/robot/menu/mappingandzoning/maps/MapManagementActivity;", "Lbt0/f;", "Lbt0/c;", "<init>", "()V", "a", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MapManagementActivity extends f<c> {

    /* renamed from: w  reason: collision with root package name */
    public static final a f16109w = new a(null);

    /* renamed from: x  reason: collision with root package name */
    public static final int f16110x = R.anim.slide_in_right;

    /* renamed from: y  reason: collision with root package name */
    public static final int f16111y = R.anim.stay;

    /* renamed from: z  reason: collision with root package name */
    public static final int f16112z = R.anim.slide_out_right;

    /* renamed from: p  reason: collision with root package name */
    public d f16113p;

    /* renamed from: q  reason: collision with root package name */
    public pf0.c f16114q;

    /* renamed from: r  reason: collision with root package name */
    public i f16115r;

    /* renamed from: s  reason: collision with root package name */
    public m f16116s;

    /* renamed from: t  reason: collision with root package name */
    public String f16117t;

    /* renamed from: u  reason: collision with root package name */
    public boolean f16118u;

    /* renamed from: v  reason: collision with root package name */
    public final b f16119v = new b();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/robot/menu/mappingandzoning/maps/MapManagementActivity$b", "Ldx0/b;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b implements dx0.b {

        /* loaded from: classes3.dex */
        public static final /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f16121a;

            static {
                int[] iArr = new int[a41.a.values().length];
                try {
                    iArr[a41.a.INSTRUCTIONAL.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a41.a.OBJECT_SENSITIVITY_SETTING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f16121a = iArr;
            }
        }

        public b() {
        }

        @Override // dx0.b
        public final void a(RobotOnboardingStep robotOnboardingStep) {
            Fragment a13;
            robotOnboardingStep.getClass();
            int i13 = a.f16121a[robotOnboardingStep.f16584g.ordinal()];
            MapManagementActivity mapManagementActivity = MapManagementActivity.this;
            if (i13 == 1) {
                f.a aVar = z31.f.f91398h;
                String str = mapManagementActivity.f16117t;
                if (str == null) {
                    r.i("coordinatorId");
                    throw null;
                } else {
                    aVar.getClass();
                    a13 = f.a.a(str, robotOnboardingStep);
                }
            } else if (i13 != 2) {
                e.o();
                return;
            } else {
                c.a aVar2 = z31.c.f91391f;
                String str2 = mapManagementActivity.f16117t;
                if (str2 == null) {
                    r.i("coordinatorId");
                    throw null;
                } else {
                    aVar2.getClass();
                    a13 = c.a.a(str2, robotOnboardingStep);
                }
            }
            mapManagementActivity.d1(a13, robotOnboardingStep.d, null, robotOnboardingStep.e);
        }

        @Override // dx0.b
        public final void b() {
            MapManagementActivity mapManagementActivity = MapManagementActivity.this;
            i iVar = mapManagementActivity.f16115r;
            if (iVar == null) {
                r.i("outOfBoxNavigationController");
                throw null;
            }
            iVar.a(false);
            mapManagementActivity.setResult(-2);
            mapManagementActivity.finish();
        }
    }

    @Override // androidx.core.app.ComponentActivity
    public final void R0() {
        setResult(-2);
        finish();
        overridePendingTransition(f16111y, R.anim.slide_out_up);
    }

    @Override // bt0.f
    public final bt0.a i1() {
        return q1();
    }

    @Override // bt0.f
    public final void k1(int i13, String str, Bundle bundle) {
        if (str != null) {
            q1().m(i13, str, bundle);
        }
    }

    @Override // bt0.f, f.g, android.app.Activity
    @h12.e
    public final void onBackPressed() {
        j1(null);
        overridePendingTransition(f16111y, f16112z);
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
        a13.f85710b = "MapManagementActivity cannot be initialised without a coordinator";
        a13.a("COORDINATOR_ID");
        Intent intent2 = getIntent();
        intent2.getClass();
        String y13 = o0.y("COORDINATOR_ID", cd.b.I(intent2));
        this.f16117t = y13;
        z.f42723r.getClass();
        z a14 = z.a.a(y13);
        if (a14 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        av0.d dVar = a14.f42732o.f42663a;
        e8 e8Var = dVar.f5515c;
        s0 s0Var = dVar.f5510b;
        MachineType b13 = b2.b(s0Var);
        iu0.r rVar = new iu0.r(s0Var.f9016b.f42684a);
        this.f16113p = r8.a(e8Var, new b41.a(b13, rVar.e(), dVar.b()), dVar.K.get());
        this.f16114q = dVar.b();
        this.f16115r = dVar.f5585q1.get();
        this.f16116s = dVar.B3.get();
        new l(new ms0.d(j2.b(s0Var).c()).a());
        hj.e eVar = dVar.V.get();
        eVar.getClass();
        new ms0.e(eVar);
        e1();
        overridePendingTransition(f16110x, f16111y);
        d q13 = q1();
        q13.f25249h.setValue(q13, d.f25246j[0], this.f16119v);
        Intent intent3 = getIntent();
        intent3.getClass();
        this.f16118u = cd.b.I(intent3).getBoolean("IS_START_MAP_ONBOARDING");
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        supportFragmentManager.f4309o.add(new bt0.e(supportFragmentManager, 1));
    }

    @Override // l.b, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        mz1.i iVar = q1().f25250i;
        if (iVar != null) {
            jz1.d.dispose(iVar);
        }
    }

    @Override // bt0.f, l.b, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        if (bundle == null) {
            if (this.f16118u) {
                q1().m(1, "MapListFragment", null);
                return;
            }
            c.a aVar = ex0.c.f28660m;
            String str = this.f16117t;
            if (str == null) {
                r.i("coordinatorId");
                throw null;
            }
            aVar.getClass();
            ex0.c cVar = new ex0.c();
            Bundle bundle2 = new Bundle();
            bundle2.putString("COORDINATOR_ID", str);
            cVar.setArguments(bundle2);
            pf0.c cVar2 = this.f16114q;
            if (cVar2 != null) {
                o1(cVar, cVar2.d(j.f71986h0), null, "MapListFragment");
            } else {
                r.i("localisationManager");
                throw null;
            }
        }
    }

    @Override // bt0.f, l.b
    public final boolean onSupportNavigateUp() {
        super.onSupportNavigateUp();
        overridePendingTransition(f16111y, f16112z);
        return true;
    }

    public final d q1() {
        d dVar = this.f16113p;
        if (dVar != null) {
            return dVar;
        }
        r.i("mapManagementViewModel");
        throw null;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/dyson/mobile/android/robot/menu/mappingandzoning/maps/MapManagementActivity$a;", "", "<init>", "()V", "", "IS_START_MAP_ONBOARDING", "Ljava/lang/String;", "", "ACTIVITY_ENTER_ANIMATION", "I", "ACTIVITY_STAY_ANIMATION", "ACTIVITY_EXIT_ANIMATION", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static Intent a(androidx.fragment.app.e eVar, String str, boolean z13) {
            eVar.getClass();
            str.getClass();
            Intent intent = new Intent(eVar, MapManagementActivity.class);
            intent.putExtra("COORDINATOR_ID", str);
            intent.putExtra("extraTheme", 2132083504);
            intent.putExtra("IS_START_MAP_ONBOARDING", z13);
            return intent;
        }

        private a() {
        }
    }
}
