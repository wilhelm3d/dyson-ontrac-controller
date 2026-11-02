package com.dyson.mobile.android.robot.onboarding;

import a41.c;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import bt0.f;
import bv0.b2;
import bv0.e8;
import bv0.s0;
import com.dyson.mobile.android.localisation.LocalisationKey;
import com.dyson.mobile.android.machinetype.MachineType;
import com.dyson.mobile.android.robot.onboarding.legacy.steps.RobotOnboardingStep;
import e22.m;
import fm1.o0;
import h12.f0;
import i12.c0;
import iu0.z;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import we1.a;
import x12.r;
import y31.g;
import y31.j;
import y31.l;
import z31.c;
import z31.f;
import zs0.e;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/robot/onboarding/RobotOnboardingActivity;", "Lbt0/f;", "Lbt0/c;", "<init>", "()V", "a", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
@h12.e
/* loaded from: classes3.dex */
public final class RobotOnboardingActivity extends f<bt0.c> {

    /* renamed from: u  reason: collision with root package name */
    public static final a f16545u = new a(null);

    /* renamed from: p  reason: collision with root package name */
    public pf0.c f16546p;

    /* renamed from: q  reason: collision with root package name */
    public l f16547q;

    /* renamed from: r  reason: collision with root package name */
    public j f16548r;

    /* renamed from: s  reason: collision with root package name */
    public String f16549s;

    /* renamed from: t  reason: collision with root package name */
    public final b f16550t = new b();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/robot/onboarding/RobotOnboardingActivity$b", "Ly31/g;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b implements g {

        /* loaded from: classes3.dex */
        public static final /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f16552a;

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
                f16552a = iArr;
            }
        }

        public b() {
        }

        @Override // y31.g
        public final void a(RobotOnboardingStep robotOnboardingStep) {
            Fragment a13;
            robotOnboardingStep.getClass();
            String str = robotOnboardingStep.e;
            int i13 = a.f16552a[robotOnboardingStep.f16584g.ordinal()];
            RobotOnboardingActivity robotOnboardingActivity = RobotOnboardingActivity.this;
            if (i13 == 1) {
                f.a aVar = z31.f.f91398h;
                String str2 = robotOnboardingActivity.f16549s;
                if (str2 == null) {
                    r.i("coordinatorId");
                    throw null;
                } else {
                    aVar.getClass();
                    a13 = f.a.a(str2, robotOnboardingStep);
                }
            } else if (i13 != 2) {
                ma.e.o();
                return;
            } else {
                c.a aVar2 = z31.c.f91391f;
                String str3 = robotOnboardingActivity.f16549s;
                if (str3 == null) {
                    r.i("coordinatorId");
                    throw null;
                } else {
                    aVar2.getClass();
                    a13 = c.a.a(str3, robotOnboardingStep);
                }
            }
            int size = robotOnboardingActivity.getSupportFragmentManager().f4299c.f().size();
            String str4 = robotOnboardingStep.d;
            if (size > 0) {
                robotOnboardingActivity.d1(a13, str4, null, str);
            } else {
                robotOnboardingActivity.o1(a13, str4, null, str);
            }
        }

        @Override // y31.g
        public final void b() {
            RobotOnboardingActivity robotOnboardingActivity = RobotOnboardingActivity.this;
            robotOnboardingActivity.setResult(0);
            robotOnboardingActivity.finish();
        }

        @Override // y31.g
        public final void c(LocalisationKey localisationKey, LocalisationKey localisationKey2, LocalisationKey localisationKey3, LocalisationKey localisationKey4) {
            localisationKey.getClass();
            localisationKey2.getClass();
            localisationKey3.getClass();
            localisationKey4.getClass();
            RobotOnboardingActivity robotOnboardingActivity = RobotOnboardingActivity.this;
            e.a a13 = new zs0.e(robotOnboardingActivity).a();
            pf0.c cVar = robotOnboardingActivity.f16546p;
            if (cVar == null) {
                r.i("localisationManager");
                throw null;
            }
            a13.f93107a = cVar.d(localisationKey);
            pf0.c cVar2 = robotOnboardingActivity.f16546p;
            if (cVar2 == null) {
                r.i("localisationManager");
                throw null;
            }
            a13.f93108b = cVar2.d(localisationKey2);
            pf0.c cVar3 = robotOnboardingActivity.f16546p;
            if (cVar3 == null) {
                r.i("localisationManager");
                throw null;
            }
            a13.c(cVar3.d(localisationKey3), new vx0.f(robotOnboardingActivity, 7));
            pf0.c cVar4 = robotOnboardingActivity.f16546p;
            if (cVar4 == null) {
                r.i("localisationManager");
                throw null;
            }
            a13.b(cVar4.d(localisationKey4), null);
            a13.d();
        }

        @Override // y31.g
        public final void d(int i13, String str) {
            Intent putExtra = new Intent().putExtra("SELECTED_OBJECT_SENSITIVITY", str);
            putExtra.getClass();
            RobotOnboardingActivity robotOnboardingActivity = RobotOnboardingActivity.this;
            robotOnboardingActivity.setResult(i13, putExtra);
            robotOnboardingActivity.finish();
        }
    }

    @Override // androidx.core.app.ComponentActivity
    public final void R0() {
        q1().a();
    }

    @Override // bt0.f
    public final bt0.a i1() {
        return new bt0.b(null, 1, null);
    }

    @Override // bt0.f
    public final void k1(int i13, String str, Bundle bundle) {
        if (str != null) {
            l q13 = q1();
            String string = bundle != null ? bundle.getString("SELECTED_OBJECT_SENSITIVITY") : null;
            b41.a aVar = q13.f89130c;
            if (aVar != null) {
                aVar.b(str, string);
            } else {
                r.i("onboardingSteps");
                throw null;
            }
        }
    }

    @Override // bt0.f, f.g, android.app.Activity
    @h12.e
    public final void onBackPressed() {
        if (getSupportFragmentManager().I() == 0) {
            q1().a();
        } else {
            j1(null);
        }
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
        Bundle a14 = a13.a("COORDINATOR_ID", "extraTheme", "EXTRA_ONBOARDING_TYPE");
        String y13 = o0.y("COORDINATOR_ID", a14);
        this.f16549s = y13;
        z.f42723r.getClass();
        z a15 = z.a.a(y13);
        if (a15 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        av0.d dVar = a15.f42732o.f42663a;
        this.f16546p = dVar.b();
        e8 e8Var = dVar.f5515c;
        s0 s0Var = dVar.f5510b;
        MachineType b13 = b2.b(s0Var);
        iu0.r rVar = new iu0.r(s0Var.f9016b.f42684a);
        b41.a aVar = new b41.a(b13, rVar.e(), dVar.b());
        s0Var.getClass();
        a41.c cVar = new a41.c(aVar);
        e8Var.getClass();
        this.f16547q = new l(cVar);
        Serializable c13 = k7.b.c(a14, "EXTRA_ONBOARDING_TYPE", j.class);
        if (c13 == null) {
            pa.c.w("EXTRA_ONBOARDING_TYPE was null");
            return;
        }
        this.f16548r = (j) c13;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        supportFragmentManager.f4309o.add(new bt0.e(supportFragmentManager, 1));
    }

    @Override // bt0.f, l.b, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        final l q13 = q1();
        q13.f89129b.setValue(q13, l.e[0], this.f16550t);
        j jVar = this.f16548r;
        if (jVar == null) {
            r.i("onboardingType");
            throw null;
        }
        a41.c cVar = q13.f89128a;
        if (c.a.f300a[jVar.ordinal()] != 1) {
            pa.c.p("Unsupported onboarding type");
            return;
        }
        b41.a aVar = cVar.f299a;
        q13.f89130c = aVar;
        q13.d = jVar == j.MAPPING;
        Function1<? super RobotOnboardingStep, f0> function1 = new Function1() { // from class: y31.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i13 = r2;
                l lVar = q13;
                switch (i13) {
                    case 0:
                        RobotOnboardingStep robotOnboardingStep = (RobotOnboardingStep) obj;
                        m<Object>[] mVarArr = l.e;
                        robotOnboardingStep.getClass();
                        g b13 = lVar.b();
                        if (b13 != null) {
                            b13.a(robotOnboardingStep);
                        }
                        return f0.f36844a;
                    default:
                        String str = (String) obj;
                        m<Object>[] mVarArr2 = l.e;
                        g b14 = lVar.b();
                        if (b14 != null) {
                            b41.a aVar2 = lVar.f89130c;
                            if (aVar2 == null) {
                                r.i("onboardingSteps");
                                throw null;
                            }
                            b14.d(aVar2.d, str);
                        }
                        return f0.f36844a;
                }
            }
        };
        Function1<? super String, f0> function12 = new Function1() { // from class: y31.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i13 = r2;
                l lVar = q13;
                switch (i13) {
                    case 0:
                        RobotOnboardingStep robotOnboardingStep = (RobotOnboardingStep) obj;
                        m<Object>[] mVarArr = l.e;
                        robotOnboardingStep.getClass();
                        g b13 = lVar.b();
                        if (b13 != null) {
                            b13.a(robotOnboardingStep);
                        }
                        return f0.f36844a;
                    default:
                        String str = (String) obj;
                        m<Object>[] mVarArr2 = l.e;
                        g b14 = lVar.b();
                        if (b14 != null) {
                            b41.a aVar2 = lVar.f89130c;
                            if (aVar2 == null) {
                                r.i("onboardingSteps");
                                throw null;
                            }
                            b14.d(aVar2.d, str);
                        }
                        return f0.f36844a;
                }
            }
        };
        aVar.f298b = function1;
        aVar.f297a = function12;
        function1.invoke(c0.N(aVar.a()));
    }

    public final l q1() {
        l lVar = this.f16547q;
        if (lVar != null) {
            return lVar;
        }
        r.i("viewModel");
        throw null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/robot/onboarding/RobotOnboardingActivity$a;", "", "<init>", "()V", "", "EXTRA_ONBOARDING_TYPE", "Ljava/lang/String;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
