package com.dyson.mobile.android.connectionjourney.userguidance.steps;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.connectionjourney.userguidance.steps.UserGuidanceView;
import com.dyson.mobile.android.machinetype.MachineDescriptor;
import f20.e1;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q8.g;
import q8.t;
import rf0.i0;
import w00.i;
import we1.a;
import x12.r;
import zs0.o;
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\rB\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\"\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/userguidance/steps/a;", "Ll/b;", "Lh50/b;", "<init>", "()V", "Landroid/view/View;", "j", "Landroid/view/View;", "getFragmentContainer", "()Landroid/view/View;", "setFragmentContainer", "(Landroid/view/View;)V", "fragmentContainer", "a", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class a extends l.b implements h50.b {

    /* renamed from: o  reason: collision with root package name */
    public static final /* synthetic */ int f13903o = 0;

    /* renamed from: j  reason: collision with root package name */
    public View f13904j;

    /* renamed from: k  reason: collision with root package name */
    public MachineDescriptor f13905k;

    /* renamed from: l  reason: collision with root package name */
    public pf0.c f13906l;

    /* renamed from: m  reason: collision with root package name */
    public h50.a f13907m;

    /* renamed from: n  reason: collision with root package name */
    public String f13908n;

    static {
        new C0448a(null);
    }

    public abstract Fragment c1(UserGuidanceView userGuidanceView);

    public abstract h50.a d1(MachineDescriptor machineDescriptor);

    public final void e1(UserGuidanceView userGuidanceView) {
        Fragment c13 = c1(userGuidanceView);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        List<Fragment> f13 = supportFragmentManager.f4299c.f();
        f13.getClass();
        boolean isEmpty = f13.isEmpty();
        FragmentManager supportFragmentManager2 = getSupportFragmentManager();
        supportFragmentManager2.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager2);
        aVar.i(R.id.fragment_container, c13, null);
        if (!isEmpty) {
            aVar.e(null);
        }
        aVar.f();
    }

    @Override // h50.b
    public final void m0() {
        h50.a aVar = this.f13907m;
        if (aVar == null) {
            r.i("steps");
            throw null;
        }
        int i13 = aVar.f37612a + 1;
        aVar.f37612a = i13;
        UserGuidanceView userGuidanceView = i13 != aVar.a().size() ? aVar.a().get(aVar.f37612a) : null;
        if (userGuidanceView != null) {
            e1(userGuidanceView);
        } else {
            onComplete();
        }
    }

    public abstract void onComplete();

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        o.a(this);
        i.c(this).e.T(this);
        super.onCreate(bundle);
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Please use the newInstance method";
        a13.a("extra-machine-descriptor");
        Serializable b13 = c7.c.b(getIntent(), "extra-machine-descriptor", MachineDescriptor.class);
        if (b13 == null) {
            pa.c.p("Required value was null.");
            return;
        }
        this.f13905k = (MachineDescriptor) b13;
        String stringExtra = getIntent().getStringExtra("extra-initial-entry-step");
        UserGuidanceView.c valueOf = stringExtra != null ? UserGuidanceView.c.valueOf(stringExtra) : null;
        if (this.f13908n == null) {
            pf0.c cVar = this.f13906l;
            if (cVar == null) {
                r.i("localisationManager");
                throw null;
            }
            this.f13908n = cVar.d(i0.P1);
        }
        MachineDescriptor machineDescriptor = this.f13905k;
        if (machineDescriptor == null) {
            r.i("machineDescriptor");
            throw null;
        }
        this.f13907m = d1(machineDescriptor);
        t d = g.d(this, R.layout.activity_user_guidance_steps);
        d.getClass();
        e1 e1Var = (e1) d;
        e1Var.e.x(this);
        e1Var.getRoot().post(new d50.g(22, e1Var, this));
        FrameLayout frameLayout = e1Var.d;
        frameLayout.getClass();
        setFragmentContainer(frameLayout);
        h50.a aVar = this.f13907m;
        if (aVar == null) {
            r.i("steps");
            throw null;
        }
        if (valueOf == null) {
            valueOf = UserGuidanceView.c.FIRST;
        }
        aVar.f37612a = valueOf.getValue();
        e1(aVar.a().get(aVar.f37612a));
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public void onResume() {
        super.onResume();
        invalidateOptionsMenu();
    }

    @Override // l.b
    public final boolean onSupportNavigateUp() {
        i.c(this).e(this);
        return true;
    }

    public final void setFragmentContainer(View view) {
        view.getClass();
        this.f13904j = view;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0084\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/userguidance/steps/a$a;", "", "<init>", "()V", "", "EXTRA_MACHINE_DESCRIPTOR", "Ljava/lang/String;", "EXTRA_INITIAL_ENTRY_STEP", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.connectionjourney.userguidance.steps.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0448a {
        public /* synthetic */ C0448a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0448a() {
        }
    }
}
