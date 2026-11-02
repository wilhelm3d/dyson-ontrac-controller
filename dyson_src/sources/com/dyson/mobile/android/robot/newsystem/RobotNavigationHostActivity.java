package com.dyson.mobile.android.robot.newsystem;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import bv0.f3;
import bv0.s0;
import c42.r1;
import com.dyson.mobile.android.logging.Logger;
import com.dyson.mobile.android.robot.newsystem.navigation.destination.RobotDestination;
import f.j;
import f.x;
import fm1.o0;
import h12.f0;
import h12.q;
import iu0.z;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n12.i;
import qh.l0;
import we1.a;
import x12.p;
import x12.p0;
import x12.r;
import x12.t;
import z32.c0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/RobotNavigationHostActivity;", "Ll/b;", "<init>", "()V", "a", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RobotNavigationHostActivity extends l.b {

    /* renamed from: r  reason: collision with root package name */
    public static final a f16231r = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public z f16232j;

    /* renamed from: k  reason: collision with root package name */
    public RobotDestination f16233k;

    /* renamed from: l  reason: collision with root package name */
    public zf1.b f16234l;

    /* renamed from: m  reason: collision with root package name */
    public t21.b f16235m;

    /* renamed from: n  reason: collision with root package name */
    public qh.a f16236n;

    /* renamed from: o  reason: collision with root package name */
    public qg0.b f16237o;

    /* renamed from: p  reason: collision with root package name */
    public hj.e f16238p;

    /* renamed from: q  reason: collision with root package name */
    public final d0 f16239q = new d0(p0.f86717a.b(sy0.g.class), new f(this), new sy0.b(this, 1), new g(null, this));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class b extends p implements Function1<Boolean, f0> {
        public b(Object obj) {
            super(1, obj, RobotNavigationHostActivity.class, "removeRobot", "removeRobot(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final f0 invoke(Boolean bool) {
            boolean booleanValue = bool.booleanValue();
            RobotNavigationHostActivity robotNavigationHostActivity = (RobotNavigationHostActivity) this.receiver;
            z zVar = robotNavigationHostActivity.f16232j;
            if (zVar != null) {
                zVar.u(robotNavigationHostActivity, booleanValue, new sy0.d(robotNavigationHostActivity, 0));
                return f0.f36844a;
            }
            r.i("coordinator");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.robot.newsystem.RobotNavigationHostActivity$RobotNavHost$4$1$1$1", f = "RobotNavigationHostActivity.kt", l = {152}, m = "invokeSuspend", v = 2)
    /* loaded from: classes3.dex */
    public static final class c extends i implements Function2<c0, l12.d<? super f0>, Object> {
        public int d;

        public c(l12.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            return new c(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
            return ((c) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            Object bVar;
            Object obj2 = m12.a.COROUTINE_SUSPENDED;
            int i13 = this.d;
            RobotNavigationHostActivity robotNavigationHostActivity = RobotNavigationHostActivity.this;
            try {
                if (i13 == 0) {
                    h12.r.b(obj);
                    int i14 = q.e;
                    a aVar = RobotNavigationHostActivity.f16231r;
                    this.d = 1;
                    Object a13 = g42.b.a(((sy0.g) robotNavigationHostActivity.f16239q.getValue()).e.j(), this);
                    if (a13 != obj2) {
                        a13 = f0.f36844a;
                    }
                    if (a13 == obj2) {
                        return obj2;
                    }
                } else if (i13 != 1) {
                    pa.c.w("call to 'resume' before 'invoke' with coroutine");
                    return null;
                } else {
                    h12.r.b(obj);
                }
                bVar = f0.f36844a;
                int i15 = q.e;
            } catch (Throwable th2) {
                int i16 = q.e;
                bVar = new q.b(th2);
            }
            Throwable b13 = q.b(bVar);
            if (b13 == null || !(b13 instanceof CancellationException)) {
                if (!(bVar instanceof q.b)) {
                    f0 f0Var = (f0) bVar;
                    robotNavigationHostActivity.finish();
                }
                Throwable b14 = q.b(bVar);
                if (b14 != null) {
                    Logger.b("Unable to start mapping:", b14);
                    robotNavigationHostActivity.finish();
                }
                return f0.f36844a;
            }
            throw b13;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.robot.newsystem.RobotNavigationHostActivity$onCreate$2$1$1$1$1", f = "RobotNavigationHostActivity.kt", l = {106}, m = "invokeSuspend", v = 2)
    /* loaded from: classes3.dex */
    public static final class d extends i implements Function2<c0, l12.d<? super f0>, Object> {
        public int d;

        public d(l12.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            return new d(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
            return ((d) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            Object obj2 = m12.a.COROUTINE_SUSPENDED;
            int i13 = this.d;
            if (i13 == 0) {
                h12.r.b(obj);
                a aVar = RobotNavigationHostActivity.f16231r;
                RobotNavigationHostActivity robotNavigationHostActivity = RobotNavigationHostActivity.this;
                r1 r1Var = ((sy0.g) robotNavigationHostActivity.f16239q.getValue()).f77179g;
                this.d = 1;
                Object i14 = c42.r.i(r1Var, new sy0.f(robotNavigationHostActivity, null), this);
                if (i14 != obj2) {
                    i14 = f0.f36844a;
                }
                if (i14 == obj2) {
                    return obj2;
                }
            } else if (i13 != 1) {
                pa.c.w("call to 'resume' before 'invoke' with coroutine");
                return null;
            } else {
                h12.r.b(obj);
            }
            return f0.f36844a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.robot.newsystem.RobotNavigationHostActivity$onCreate$2$1$1$1$2", f = "RobotNavigationHostActivity.kt", l = {com.salesforce.marketingcloud.analytics.stats.b.f20726n}, m = "invokeSuspend", v = 2)
    /* loaded from: classes3.dex */
    public static final class e extends i implements Function2<c0, l12.d<? super f0>, Object> {
        public int d;

        public e(l12.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            return new e(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
            return ((e) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            Object obj2 = m12.a.COROUTINE_SUSPENDED;
            int i13 = this.d;
            if (i13 == 0) {
                h12.r.b(obj);
                RobotNavigationHostActivity robotNavigationHostActivity = RobotNavigationHostActivity.this;
                qg0.b bVar = robotNavigationHostActivity.f16237o;
                if (bVar == null) {
                    r.i("homeDeeplinkNavigator");
                    throw null;
                }
                c42.e b13 = bVar.b();
                this.d = 1;
                Object i14 = c42.r.i(b13, new sy0.e(robotNavigationHostActivity, null), this);
                if (i14 != obj2) {
                    i14 = f0.f36844a;
                }
                if (i14 == obj2) {
                    return obj2;
                }
            } else if (i13 != 1) {
                pa.c.w("call to 'resume' before 'invoke' with coroutine");
                return null;
            } else {
                h12.r.b(obj);
            }
            return f0.f36844a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class f extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ f.g f16240f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(f.g gVar) {
            super(0);
            this.f16240f = gVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return this.f16240f.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class g extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f16241f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ f.g f16242g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(w12.a aVar, f.g gVar) {
            super(0);
            this.f16241f = aVar;
            this.f16242g = gVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f16241f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f16242g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
        if (r4 == androidx.compose.runtime.Composer.a.f3142b) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0067, code lost:
        if (r7 == androidx.compose.runtime.Composer.a.f3142b) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0084, code lost:
        if (r9 == androidx.compose.runtime.Composer.a.f3142b) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a1, code lost:
        if (r10 == androidx.compose.runtime.Composer.a.f3142b) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c1(y9.q0 r12, androidx.compose.runtime.Composer r13, int r14) {
        /*
            r11 = this;
            r0 = 1270005250(0x4bb2be02, float:2.34281E7)
            androidx.compose.runtime.a r8 = r13.k(r0)
            boolean r13 = r8.D(r12)
            if (r13 == 0) goto Lf
            r13 = 4
            goto L10
        Lf:
            r13 = 2
        L10:
            r13 = r13 | r14
            boolean r0 = r8.D(r11)
            if (r0 == 0) goto L1a
            r0 = 32
            goto L1c
        L1a:
            r0 = 16
        L1c:
            r13 = r13 | r0
            r0 = r13 & 19
            r1 = 18
            r2 = 0
            if (r0 == r1) goto L26
            r0 = 1
            goto L27
        L26:
            r0 = r2
        L27:
            r1 = r13 & 1
            boolean r0 = r8.t(r1, r0)
            if (r0 == 0) goto Lc5
            u3.p1 r0 = androidx.compose.runtime.b.f3172a
            zf1.b r1 = r11.f16234l
            r0 = 0
            if (r1 == 0) goto Lbf
            com.dyson.mobile.android.robot.newsystem.navigation.destination.RobotDestination r3 = r11.f16233k
            if (r3 == 0) goto Lb9
            boolean r0 = r8.D(r11)
            java.lang.Object r4 = r8.B()
            r5 = 3
            androidx.compose.runtime.Composer$a r6 = androidx.compose.runtime.Composer.f3140a
            if (r0 != 0) goto L4e
            r6.getClass()
            androidx.compose.runtime.Composer$a$a r0 = androidx.compose.runtime.Composer.a.f3142b
            if (r4 != r0) goto L56
        L4e:
            sy0.b r4 = new sy0.b
            r4.<init>(r11, r5)
            r8.u(r4)
        L56:
            w12.a r4 = (w12.a) r4
            boolean r0 = r8.D(r11)
            java.lang.Object r7 = r8.B()
            if (r0 != 0) goto L69
            r6.getClass()
            androidx.compose.runtime.Composer$a$a r0 = androidx.compose.runtime.Composer.a.f3142b
            if (r7 != r0) goto L73
        L69:
            r3.e7 r7 = new r3.e7
            r0 = 26
            r7.<init>(r11, r0)
            r8.u(r7)
        L73:
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            boolean r0 = r8.D(r11)
            java.lang.Object r9 = r8.B()
            if (r0 != 0) goto L86
            r6.getClass()
            androidx.compose.runtime.Composer$a$a r0 = androidx.compose.runtime.Composer.a.f3142b
            if (r9 != r0) goto L8e
        L86:
            com.dyson.mobile.android.robot.newsystem.RobotNavigationHostActivity$b r9 = new com.dyson.mobile.android.robot.newsystem.RobotNavigationHostActivity$b
            r9.<init>(r11)
            r8.u(r9)
        L8e:
            e22.g r9 = (e22.g) r9
            kotlin.jvm.functions.Function1 r9 = (kotlin.jvm.functions.Function1) r9
            boolean r0 = r8.D(r11)
            java.lang.Object r10 = r8.B()
            if (r0 != 0) goto La3
            r6.getClass()
            androidx.compose.runtime.Composer$a$a r0 = androidx.compose.runtime.Composer.a.f3142b
            if (r10 != r0) goto Lab
        La3:
            sy0.b r10 = new sy0.b
            r10.<init>(r11, r2)
            r8.u(r10)
        Lab:
            w12.a r10 = (w12.a) r10
            int r13 = r13 << r5
            r13 = r13 & 112(0x70, float:1.57E-43)
            r2 = r12
            r5 = r7
            r6 = r9
            r7 = r10
            r9 = r13
            q11.b.a(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            goto Lc9
        Lb9:
            java.lang.String r11 = "startDestination"
            x12.r.i(r11)
            throw r0
        Lbf:
            java.lang.String r11 = "viewModelFactory"
            x12.r.i(r11)
            throw r0
        Lc5:
            r2 = r12
            r8.J()
        Lc9:
            androidx.compose.runtime.f r12 = r8.c0()
            if (r12 == 0) goto Ld6
            sy0.c r13 = new sy0.c
            r13.<init>(r11, r2, r14)
            r12.d = r13
        Ld6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.robot.newsystem.RobotNavigationHostActivity.c1(y9.q0, androidx.compose.runtime.Composer, int):void");
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
        a13.f85710b = "Please provide the required arguments";
        Bundle a14 = a13.a("COORDINATOR_ID", "NAVIGATION_DESTINATION");
        String y13 = o0.y("COORDINATOR_ID", a14);
        Object a15 = k7.b.a(a14, "NAVIGATION_DESTINATION", RobotDestination.class);
        if (a15 == null) {
            pa.c.w("NAVIGATION_DESTINATION was null");
            return;
        }
        this.f16233k = (RobotDestination) ((Parcelable) a15);
        z.f42723r.getClass();
        z a16 = z.a.a(y13);
        if (a16 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        this.f16232j = a16;
        av0.d dVar = a16.f42732o.f42663a;
        this.f16234l = dVar.a();
        this.f16235m = dVar.S3.get();
        s0 s0Var = dVar.f5510b;
        qh.a aVar = new l0(s0Var.f9015a).f66894b;
        aVar.getClass();
        this.f16236n = aVar;
        f3.b(s0Var);
        this.f16237o = dVar.O2.get();
        this.f16238p = dVar.V.get();
        g.f.a(this, new c4.c(2128050266, true, new sy0.a(this, 0)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/RobotNavigationHostActivity$a;", "", "<init>", "()V", "", "NAVIGATION_DESTINATION", "Ljava/lang/String;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
