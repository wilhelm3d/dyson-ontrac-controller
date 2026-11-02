package com.dyson.mobile.android.connectionjourney.troubleconnecting;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import b50.f;
import bt0.b;
import bt0.c;
import bt0.f;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.connectionjourney.aplist.machineaplist.ApListActivity;
import com.dyson.mobile.android.connectionjourney.headsup.switchon.HeadsUpSwitchOnActivity;
import com.dyson.mobile.android.machinetype.MachineCategory;
import com.dyson.mobile.android.support.ui.contact.ContactDysonActivity;
import com.dyson.mobile.android.support.ui.contact.networkcompatible.NetworkCompatibleActivity;
import e50.d;
import e50.j;
import h12.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kz1.b;
import rf0.i0;
import rz1.l;
import w00.i;
import we1.a;
import x12.r;
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/troubleconnecting/TroubleConnectingActivity;", "Lbt0/f;", "Lbt0/c;", "Le50/j;", "<init>", "()V", "a", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TroubleConnectingActivity extends f<c> implements j {

    /* renamed from: u  reason: collision with root package name */
    public static final a f13892u = new a(null);

    /* renamed from: v  reason: collision with root package name */
    public static final int f13893v = R.anim.stay;

    /* renamed from: w  reason: collision with root package name */
    public static final int f13894w = R.anim.slide_in_up;

    /* renamed from: x  reason: collision with root package name */
    public static final int f13895x = R.anim.slide_out_down;

    /* renamed from: p  reason: collision with root package name */
    public f.b f13896p;

    /* renamed from: q  reason: collision with root package name */
    public int f13897q = -1;

    /* renamed from: r  reason: collision with root package name */
    public pf0.c f13898r;

    /* renamed from: s  reason: collision with root package name */
    public d f13899s;

    /* renamed from: t  reason: collision with root package name */
    public mz1.j f13900t;

    @Override // e50.j
    @SuppressLint({"FunctionCallWithoutNamedArguments"})
    public final void G(e50.f fVar) {
        fVar.getClass();
        i c13 = i.c(this);
        f.b bVar = this.f13896p;
        if (bVar == null) {
            r.i("connectionJourneyStepsType");
            throw null;
        }
        int i13 = this.f13897q;
        c13.getClass();
        int i14 = i.a.f85131c[fVar.ordinal()];
        if (i14 == 1) {
            i.q(this, bVar, i13);
        } else if (i14 == 2) {
            Intent intent = new Intent(this, HeadsUpSwitchOnActivity.class);
            intent.addFlags(603979776);
            startActivity(intent);
        } else if (i14 == 3 || i14 == 4) {
            MachineCategory h13 = c13.f85124a.h();
            Intent intent2 = new Intent(this, ApListActivity.class);
            intent2.putExtra("apFilterMachineCategory", h13.name());
            intent2.addFlags(603979776);
            startActivity(intent2);
        }
        finish();
    }

    @Override // bt0.f
    public final bt0.a i1() {
        return new b(null, 1, null);
    }

    @Override // e50.j
    public final void l() {
        i.c(this).getClass();
        startActivity(new Intent(this, NetworkCompatibleActivity.class));
    }

    @Override // bt0.f, f.g, android.app.Activity
    @e
    public final void onBackPressed() {
        j1(null);
        overridePendingTransition(f13893v, f13895x);
    }

    @Override // bt0.f, bt0.g, androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        i.c(this).e.w(this);
        super.onCreate(bundle);
        Bundle extras = getIntent().getExtras();
        we1.a.f85708c.getClass();
        we1.a b13 = a.C2547a.b(extras);
        b13.f85710b = "Please use the newInstance method";
        b13.a("extra_connection_type", "recoverable_failure_type");
        if (extras != null) {
            String string = extras.getString("extra_connection_type");
            if (string == null) {
                pa.c.p("Required value was null.");
                return;
            } else {
                this.f13896p = f.b.valueOf(string);
                this.f13897q = extras.getInt("recoverable_failure_type", -1);
            }
        }
        overridePendingTransition(f13894w, f13893v);
        e1();
        d dVar = this.f13899s;
        if (dVar == null) {
            r.i("fragmentCoordinator");
            throw null;
        }
        e10.f fVar = new e10.f(dVar, 3);
        b.a aVar = kz1.b.f50218a;
        this.f13900t = (mz1.j) new l(fVar).S(c02.a.f10004c).H(fz1.a.a()).t(new e10.f(new c91.c(this, 24), 2)).N();
    }

    @Override // l.b, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        mz1.j jVar = this.f13900t;
        if (jVar != null) {
            jz1.d.dispose(jVar);
        }
    }

    @Override // bt0.f, l.b
    public final boolean onSupportNavigateUp() {
        super.onSupportNavigateUp();
        overridePendingTransition(f13893v, f13895x);
        return true;
    }

    @Override // e50.j
    public final void v() {
        i.c(this).getClass();
        uf1.d.a(this).b(ContactDysonActivity.f1(this, 2132083504, false, i0.f71839s5, i0.f71855t5, false));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/troubleconnecting/TroubleConnectingActivity$a;", "", "<init>", "()V", "", "EXTRA_CONNECTION_TYPE", "Ljava/lang/String;", "EXTRA_RECOVERABLE_FAILURE_TYPE", "", "ACTIVITY_STAY_ANIMATION", "I", "ACTIVITY_ENTER_ANIMATION", "ACTIVITY_EXIT_ANIMATION", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
