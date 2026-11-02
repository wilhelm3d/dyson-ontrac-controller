package com.dyson.mobile.android.interactableec.control.sleeptimer;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.resources.view.DysonDial;
import fm1.o0;
import hj.e;
import iw0.l;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import na0.q;
import nj.a5;
import w90.g;
import we1.a;
import x12.p0;
import x12.r;
import x12.t;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/interactableec/control/sleeptimer/SleepTimerControlActivity;", "Ll/b;", "<init>", "()V", "a", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SleepTimerControlActivity extends l.b {

    /* renamed from: o  reason: collision with root package name */
    public static final a f14386o = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public zf1.b f14387j;

    /* renamed from: k  reason: collision with root package name */
    public e f14388k;

    /* renamed from: m  reason: collision with root package name */
    public g f14390m;

    /* renamed from: l  reason: collision with root package name */
    public final d0 f14389l = new d0(p0.f86717a.b(SleepTimerControlViewModel.class), new c(this), new ia0.a(this, 20), new d(null, this));

    /* renamed from: n  reason: collision with root package name */
    public final b f14391n = new b();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/interactableec/control/sleeptimer/SleepTimerControlActivity$b", "Lja0/a;", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements ja0.a {
        public b() {
        }

        @Override // ja0.a
        public final void a() {
            SleepTimerControlActivity sleepTimerControlActivity = SleepTimerControlActivity.this;
            if (sleepTimerControlActivity.f14390m == null) {
                r.i("coordinator");
                throw null;
            }
            g.a aVar = g.f85506o;
            sleepTimerControlActivity.onBackPressed();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class c extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ f.g f14393f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(f.g gVar) {
            super(0);
            this.f14393f = gVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return this.f14393f.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class d extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f14394f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ f.g f14395g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(w12.a aVar, f.g gVar) {
            super(0);
            this.f14394f = aVar;
            this.f14395g = gVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f14394f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f14395g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (cd.b.J(this)) {
            return;
        }
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Please use newIntent method to create a SleepTimerControlActivity Intent";
        String y13 = o0.y("COORDINATOR_ID", a13.a("COORDINATOR_ID"));
        g.f85506o.getClass();
        g a14 = g.a.a(y13);
        if (a14 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        this.f14390m = a14;
        oa0.b bVar = a14.f85510j;
        this.f14387j = bVar.a();
        this.f14388k = bVar.e.get();
        SleepTimerControlViewModel sleepTimerControlViewModel = (SleepTimerControlViewModel) this.f14389l.getValue();
        sleepTimerControlViewModel.f14401g.setValue(sleepTimerControlViewModel, SleepTimerControlViewModel.f14397r[0], this.f14391n);
        sleepTimerControlViewModel.d.f66686f.U(1L).O(new l(new id0.d(sleepTimerControlViewModel, 28), 20));
        q qVar = (q) q8.g.d(this, R.layout.activity_timer_control);
        DysonDial dysonDial = qVar.f56581f;
        SleepTimerControlViewModel.f14396q.getClass();
        dysonDial.setDialOptions(SleepTimerControlViewModel.f14399t);
        dysonDial.setArcMark(sleepTimerControlViewModel.f14406l);
        dysonDial.setDialPosition(sleepTimerControlViewModel.f14405k);
        qVar.l(sleepTimerControlViewModel);
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        e eVar = this.f14388k;
        if (eVar == null) {
            r.i("trackingManager");
            throw null;
        }
        int i13 = a5.f57398a;
        ij.b bVar = new ij.b("ec.instant_control.sleep_timer", null, 2, null);
        e.a aVar = e.f38312g;
        eVar.h(bVar, null);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/interactableec/control/sleeptimer/SleepTimerControlActivity$a;", "", "<init>", "()V", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
