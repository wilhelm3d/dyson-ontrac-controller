package com.dyson.mobile.android.connectionjourney.machineconnection;

import a1.k;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import b50.f;
import b50.q;
import b50.v;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.b;
import com.dyson.mobile.android.connectionjourney.machineconnection.MachineConnectionActivity;
import com.dyson.mobile.android.connectionjourney.password.homepassword.gen1.Gen1HomePasswordActivity;
import com.dyson.mobile.android.logging.Logger;
import com.dyson.mobile.android.machinetype.MachineCategory;
import com.dyson.mobile.android.machinetype.MachineDescriptor;
import f.j;
import f.x;
import f20.e0;
import gf1.e;
import h12.f0;
import ie0.l;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pi.n0;
import q8.g;
import rf0.i0;
import u10.d;
import w00.i;
import we1.a;
import x12.r;
import zs0.e;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/machineconnection/MachineConnectionActivity;", "Ll/b;", "<init>", "()V", "b", "a", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MachineConnectionActivity extends l.b {

    /* renamed from: q  reason: collision with root package name */
    public static final a f13509q = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public r20.b f13510j;

    /* renamed from: k  reason: collision with root package name */
    public u10.c f13511k;

    /* renamed from: l  reason: collision with root package name */
    public d f13512l;

    /* renamed from: m  reason: collision with root package name */
    public f.b f13513m;

    /* renamed from: n  reason: collision with root package name */
    public boolean f13514n;

    /* renamed from: o  reason: collision with root package name */
    public b f13515o;

    /* renamed from: p  reason: collision with root package name */
    public final c f13516p = new c();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/connectionjourney/machineconnection/MachineConnectionActivity$c", "Lr20/a;", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c implements r20.a {
        public c() {
        }

        @Override // r20.a
        public final void a() {
            MachineConnectionActivity machineConnectionActivity = MachineConnectionActivity.this;
            Lifecycle lifecycle = machineConnectionActivity.getLifecycle();
            q3.a aVar = new q3.a(machineConnectionActivity, 12);
            lifecycle.getClass();
            Lifecycle.State state = Lifecycle.State.RESUMED;
            state.getClass();
            if (lifecycle.b().compareTo(state) >= 0) {
                aVar.invoke();
            } else {
                lifecycle.a(new e(lifecycle, state, aVar));
            }
        }

        @Override // r20.a
        public final void b(int i13, boolean z13) {
            MachineConnectionActivity machineConnectionActivity = MachineConnectionActivity.this;
            if (machineConnectionActivity.f13514n) {
                machineConnectionActivity.f13515o = new b.C0424b(i13);
                return;
            }
            i c13 = i.c(machineConnectionActivity);
            f.b bVar = machineConnectionActivity.f13513m;
            c13.getClass();
            c13.i(machineConnectionActivity, new w00.f(c13, machineConnectionActivity, bVar, i13), new w00.c(machineConnectionActivity, 2), z13);
        }

        @Override // r20.a
        public final void c(int i13, boolean z13) {
            b.d dVar = new b.d(i13);
            MachineConnectionActivity machineConnectionActivity = MachineConnectionActivity.this;
            machineConnectionActivity.f13515o = dVar;
            machineConnectionActivity.f1(i13, z13);
        }

        @Override // r20.a
        public final void d(boolean z13) {
            MachineConnectionActivity machineConnectionActivity = MachineConnectionActivity.this;
            if (machineConnectionActivity.f13514n) {
                machineConnectionActivity.f13515o = b.c.f13520a;
            } else {
                machineConnectionActivity.e1(z13);
            }
        }

        @Override // r20.a
        public final void e() {
            a aVar = MachineConnectionActivity.f13509q;
            MachineConnectionActivity machineConnectionActivity = MachineConnectionActivity.this;
            machineConnectionActivity.getClass();
            i.c(machineConnectionActivity).getClass();
            int i13 = Gen1HomePasswordActivity.f13848j;
            Intent intent = new Intent(machineConnectionActivity, Gen1HomePasswordActivity.class);
            intent.putExtra("isRetry", true);
            intent.putExtra("flow", 1);
            machineConnectionActivity.startActivity(intent);
        }

        @Override // r20.a
        public final void f(n0 n0Var, n0 n0Var2) {
            MachineConnectionActivity machineConnectionActivity = MachineConnectionActivity.this;
            if (machineConnectionActivity.f13514n) {
                machineConnectionActivity.f13515o = new b.a(n0Var, n0Var2);
                return;
            }
            i c13 = i.c(machineConnectionActivity);
            fi.a aVar = new fi.a(n0Var, 5);
            fi.a aVar2 = new fi.a(n0Var2, 6);
            c13.getClass();
            machineConnectionActivity.runOnUiThread(new k(c13, machineConnectionActivity, aVar, aVar2, 10));
        }

        @Override // r20.a
        public final void j() {
            MachineConnectionActivity machineConnectionActivity = MachineConnectionActivity.this;
            if (machineConnectionActivity.c1().f68476s) {
                i.c(machineConnectionActivity).h(machineConnectionActivity);
            } else {
                i.c(machineConnectionActivity).g(machineConnectionActivity);
            }
        }

        @Override // r20.a
        public final void s(String str, MachineDescriptor machineDescriptor) {
            str.getClass();
            a aVar = MachineConnectionActivity.f13509q;
            MachineConnectionActivity machineConnectionActivity = MachineConnectionActivity.this;
            machineConnectionActivity.getClass();
            i.c(machineConnectionActivity).getClass();
            i.m(machineConnectionActivity, str, 2, machineDescriptor);
        }
    }

    public final r20.b c1() {
        r20.b bVar = this.f13510j;
        if (bVar != null) {
            return bVar;
        }
        r.i("machineConnectionViewModel");
        throw null;
    }

    public final void d1() {
        r20.b c13 = c1();
        c13.f68467j.m(true);
        c13.s();
        c13.f68470m = false;
        c13.s();
    }

    public final void e1(boolean z13) {
        final i c13 = i.c(this);
        final Boolean valueOf = Boolean.valueOf(z13);
        c13.getClass();
        e.a a13 = new zs0.e(this).a();
        a13.f93107a = c13.f85125b.d(i0.f71669h4);
        a13.f93108b = c13.f85125b.d(i0.f71684i4);
        a13.f93110f = false;
        a13.c(c13.f85125b.d(i0.f71700j4), new vx0.f(c13, this));
        a13.b(c13.f85125b.d(i0.f71714k4), new e.b() { // from class: w00.e
            @Override // zs0.e.b
            public final void a() {
                b.e eVar = i.this.f85127f;
                if (eVar == null) {
                    Logger.b("No mCoordinatorListener", null);
                    return;
                }
                MachineConnectionActivity machineConnectionActivity = this;
                eVar.b(machineConnectionActivity, new c(machineConnectionActivity, 0), valueOf.booleanValue());
            }
        });
        a13.d();
    }

    public final void f1(int i13, final boolean z13) {
        final i c13 = i.c(this);
        f.b bVar = this.f13513m;
        c13.getClass();
        e.a a13 = new zs0.e(this).a();
        a13.f93107a = c13.f85125b.d(i0.C3);
        a13.f93108b = c13.f85125b.d(i0.D3);
        a13.f93110f = false;
        a13.c(c13.f85125b.d(i0.S8), new w00.f(this, bVar, i13));
        a13.b(c13.f85125b.d(i0.f71719k9), new e.b() { // from class: w00.g
            @Override // zs0.e.b
            public final void a() {
                b.e eVar = i.this.f85127f;
                if (eVar == null) {
                    Logger.b("No mCoordinatorListener", null);
                    return;
                }
                MachineConnectionActivity machineConnectionActivity = this;
                eVar.b(machineConnectionActivity, new c(machineConnectionActivity, 1), z13);
            }
        });
        a13.d();
    }

    @Override // f.g, android.app.Activity
    @h12.e
    public final void onBackPressed() {
        if (!c1().f68470m) {
            i.c(this).e(this);
            return;
        }
        i c13 = i.c(this);
        c13.getClass();
        c13.f(this, i0.N9, i0.O9, new l(2, c13, this));
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        b50.e vVar;
        x.e.getClass();
        j.a(this, x.a.a(0), x.a.a(0));
        super.onCreate(bundle);
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "You should use the newInstance method to instantiate this activity";
        a13.a("connection-type");
        i.c(this).e.n(this);
        r20.b c13 = c1();
        c13.f68474q.setValue(c13, r20.b.f68462w[0], this.f13516p);
        String stringExtra = getIntent().getStringExtra("connection-type");
        if (stringExtra == null) {
            pa.c.p("Required value was null.");
            return;
        }
        this.f13513m = f.b.valueOf(stringExtra);
        u10.c cVar = this.f13511k;
        if (cVar == null) {
            r.i("carouselHelper");
            throw null;
        }
        this.f13512l = cVar.b(c1().f68463f.j().getMachineType(), c1().f68463f.j().getMachineVariant());
        e0 e0Var = (e0) g.d(this, R.layout.activity_machine_connection);
        e0Var.f29009k.x(this);
        e0Var.m(c1());
        e0Var.l(this.f13512l);
        d dVar = this.f13512l;
        if (dVar != null) {
            dVar.e = e0Var.f29005g;
        }
        e0Var.f29008j.setVisibility(8);
        c1().f68477t = getIntent().getIntExtra("recoverable-failure-type", -1);
        f.b bVar = this.f13513m;
        if (bVar != null) {
            r20.b c14 = c1();
            b50.g gVar = c14.d;
            d10.a aVar = gVar.d;
            r70.i iVar = gVar.f6713c;
            Context context = gVar.f6711a;
            if (bVar == f.b.INITIAL) {
                MachineDescriptor j8 = gVar.f6712b.j();
                String machineType = j8.getMachineType();
                MachineCategory machineCategory = j8.getMachineCategory();
                if (machineCategory == MachineCategory.EC) {
                    vVar = new b50.k(context, iVar, aVar, gVar.e);
                } else if (machineCategory != MachineCategory.ROBOT) {
                    pa.c.w(bv1.f.d(machineType, "\" is not a supported MachineType."));
                    return;
                } else {
                    vVar = new q(context, iVar, aVar);
                }
            } else if (bVar != f.b.SUBSEQUENT) {
                throw new IllegalStateException(bVar + "\" is not a supported ConnectionJourneySteps.Type.");
            } else {
                vVar = new v(context);
            }
            vVar.f6708p = c14.f68479v;
            vVar.f6709q = c14;
            c14.f68471n = vVar;
            int i13 = c14.f68477t;
            if (i13 == -1) {
                vVar.c();
            } else {
                vVar.d(i13);
            }
            c14.f68467j.m(false);
            c14.f68466i.l(0);
            c14.f68477t = -1;
        }
        getLifecycle().a(c1());
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f13514n = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0096  */
    @Override // androidx.fragment.app.e, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onResume() {
        /*
            r9 = this;
            super.onResume()
            r20.b r0 = r9.c1()
            int r0 = r0.f68477t
            r1 = -1
            if (r0 != r1) goto L13
            ij.b r0 = nj.y1.c()
            r0.b()
        L13:
            r0 = 0
            r9.f13514n = r0
            com.dyson.mobile.android.connectionjourney.machineconnection.MachineConnectionActivity$b r0 = r9.f13515o
            if (r0 == 0) goto L9e
            boolean r1 = r0 instanceof com.dyson.mobile.android.connectionjourney.machineconnection.MachineConnectionActivity.b.C0424b
            if (r1 == 0) goto L44
            r1 = r0
            com.dyson.mobile.android.connectionjourney.machineconnection.MachineConnectionActivity$b$b r1 = (com.dyson.mobile.android.connectionjourney.machineconnection.MachineConnectionActivity.b.C0424b) r1
            int r1 = r1.f13519a
            r20.b r2 = r9.c1()
            boolean r2 = r2.m()
            w00.i r3 = w00.i.c(r9)
            b50.f$b r4 = r9.f13513m
            r3.getClass()
            w00.f r5 = new w00.f
            r5.<init>(r3, r9, r4, r1)
            w00.c r1 = new w00.c
            r4 = 2
            r1.<init>(r9, r4)
            r3.i(r9, r5, r1, r2)
        L42:
            r5 = r9
            goto L92
        L44:
            boolean r1 = r0 instanceof com.dyson.mobile.android.connectionjourney.machineconnection.MachineConnectionActivity.b.c
            if (r1 == 0) goto L54
            r20.b r1 = r9.c1()
            boolean r1 = r1.m()
            r9.e1(r1)
            goto L42
        L54:
            boolean r1 = r0 instanceof com.dyson.mobile.android.connectionjourney.machineconnection.MachineConnectionActivity.b.d
            if (r1 == 0) goto L69
            r1 = r0
            com.dyson.mobile.android.connectionjourney.machineconnection.MachineConnectionActivity$b$d r1 = (com.dyson.mobile.android.connectionjourney.machineconnection.MachineConnectionActivity.b.d) r1
            int r1 = r1.f13521a
            r20.b r2 = r9.c1()
            boolean r2 = r2.m()
            r9.f1(r1, r2)
            goto L42
        L69:
            boolean r1 = r0 instanceof com.dyson.mobile.android.connectionjourney.machineconnection.MachineConnectionActivity.b.a
            if (r1 == 0) goto L9a
            r1 = r0
            com.dyson.mobile.android.connectionjourney.machineconnection.MachineConnectionActivity$b$a r1 = (com.dyson.mobile.android.connectionjourney.machineconnection.MachineConnectionActivity.b.a) r1
            w12.a<h12.f0> r2 = r1.f13517a
            w12.a<h12.f0> r1 = r1.f13518b
            w00.i r4 = w00.i.c(r9)
            fi.a r6 = new fi.a
            r3 = 5
            r6.<init>(r2, r3)
            fi.a r7 = new fi.a
            r2 = 6
            r7.<init>(r1, r2)
            r4.getClass()
            a1.k r3 = new a1.k
            r8 = 10
            r5 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            r5.runOnUiThread(r3)
        L92:
            boolean r9 = r0 instanceof com.dyson.mobile.android.connectionjourney.machineconnection.MachineConnectionActivity.b.d
            if (r9 != 0) goto L9f
            r9 = 0
            r5.f13515o = r9
            goto L9f
        L9a:
            ma.e.o()
            return
        L9e:
            r5 = r9
        L9f:
            r5.invalidateOptionsMenu()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.connectionjourney.machineconnection.MachineConnectionActivity.onResume():void");
    }

    @Override // l.b, androidx.fragment.app.e, android.app.Activity
    public final void onStop() {
        b50.e eVar = c1().f68471n;
        if (eVar != null) {
            eVar.f6704l.j();
            eVar.f6706n.a(eVar.f6704l.f89187a);
            eVar.f6704l.i();
        }
        super.onStop();
    }

    @Override // l.b
    public final boolean onSupportNavigateUp() {
        if (!c1().f68470m) {
            i.c(this).e(this);
            return true;
        }
        i c13 = i.c(this);
        c13.getClass();
        c13.f(this, i0.N9, i0.O9, new l(2, c13, this));
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/machineconnection/MachineConnectionActivity$a;", "", "<init>", "()V", "", "EXTRA_CONNECTION_TYPE", "Ljava/lang/String;", "EXTRA_RECOVERABLE_FAILURE_TYPE", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static Intent a(Activity activity, f.b bVar, Integer num) {
            activity.getClass();
            bVar.getClass();
            Intent intent = new Intent(activity, MachineConnectionActivity.class);
            intent.putExtra("connection-type", bVar.name());
            if (num != null) {
                intent.putExtra("recoverable-failure-type", num.intValue());
            }
            return intent;
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/machineconnection/MachineConnectionActivity$b;", "", "<init>", "()V", "c", "b", "d", "a", "Lcom/dyson/mobile/android/connectionjourney/machineconnection/MachineConnectionActivity$b$a;", "Lcom/dyson/mobile/android/connectionjourney/machineconnection/MachineConnectionActivity$b$b;", "Lcom/dyson/mobile/android/connectionjourney/machineconnection/MachineConnectionActivity$b$c;", "Lcom/dyson/mobile/android/connectionjourney/machineconnection/MachineConnectionActivity$b$d;", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static abstract class b {

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/machineconnection/MachineConnectionActivity$b$a;", "Lcom/dyson/mobile/android/connectionjourney/machineconnection/MachineConnectionActivity$b;", "Lkotlin/Function0;", "Lh12/f0;", "openWifiSettingsCallback", "cancelCallback", "<init>", "(Lw12/a;Lw12/a;)V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class a extends b {

            /* renamed from: a  reason: collision with root package name */
            public final w12.a<f0> f13517a;

            /* renamed from: b  reason: collision with root package name */
            public final w12.a<f0> f13518b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(w12.a<f0> aVar, w12.a<f0> aVar2) {
                super(null);
                aVar.getClass();
                aVar2.getClass();
                this.f13517a = aVar;
                this.f13518b = aVar2;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/machineconnection/MachineConnectionActivity$b$b;", "Lcom/dyson/mobile/android/connectionjourney/machineconnection/MachineConnectionActivity$b;", "", "recoverableFailure", "<init>", "(I)V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.connectionjourney.machineconnection.MachineConnectionActivity$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0424b extends b {

            /* renamed from: a  reason: collision with root package name */
            public final int f13519a;

            public C0424b(int i13) {
                super(null);
                this.f13519a = i13;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/machineconnection/MachineConnectionActivity$b$c;", "Lcom/dyson/mobile/android/connectionjourney/machineconnection/MachineConnectionActivity$b;", "<init>", "()V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class c extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final c f13520a = new c();

            private c() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/machineconnection/MachineConnectionActivity$b$d;", "Lcom/dyson/mobile/android/connectionjourney/machineconnection/MachineConnectionActivity$b;", "", "recoverableFailure", "<init>", "(I)V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class d extends b {

            /* renamed from: a  reason: collision with root package name */
            public final int f13521a;

            public d(int i13) {
                super(null);
                this.f13521a = i13;
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }
}
