package com.dyson.mobile.android.cat6.ui.home.settingtab.remove;

import c42.u1;
import c42.w1;
import com.dyson.mobile.android.machinetype.MachineDefinition;
import com.paypal.android.platform.authsdk.BR;
import h12.f0;
import h12.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.u;
import m9.v;
import mz1.f;
import n12.i;
import vk0.n;
import x12.p;
import z32.c0;
import z32.g0;
import zs0.e;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\b\tB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/dyson/mobile/android/cat6/ui/home/settingtab/remove/a;", "Lm9/u;", "Lcom/dyson/mobile/android/machinetype/MachineDefinition;", "machineDefinition", "Lvk0/n;", "machineTaskFactory", "<init>", "(Lcom/dyson/mobile/android/machinetype/MachineDefinition;Lvk0/n;)V", "b", "a", "mod-cat6-connected-floorcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a extends u {

    /* renamed from: i  reason: collision with root package name */
    public static final /* synthetic */ int f12885i = 0;
    public final MachineDefinition d;
    public final n e;

    /* renamed from: f  reason: collision with root package name */
    public final u1 f12886f;

    /* renamed from: g  reason: collision with root package name */
    public f f12887g;

    /* renamed from: h  reason: collision with root package name */
    public final vx0.f f12888h;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.cat6.ui.home.settingtab.remove.ConnectedFloorcareRemoveMachineViewModel$removeListener$1$1$1", f = "ConnectedFloorcareRemoveMachineViewModel.kt", l = {48}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
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
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            int i13 = this.d;
            if (i13 == 0) {
                r.b(obj);
                u1 u1Var = a.this.f12886f;
                b.C0370b c0370b = b.C0370b.f12890a;
                this.d = 1;
                if (u1Var.emit(c0370b, this) == aVar) {
                    return aVar;
                }
            } else if (i13 != 1) {
                pa.c.w("call to 'resume' before 'invoke' with coroutine");
                return null;
            } else {
                r.b(obj);
            }
            return f0.f36844a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.cat6.ui.home.settingtab.remove.ConnectedFloorcareRemoveMachineViewModel$removeListener$1$2$1", f = "ConnectedFloorcareRemoveMachineViewModel.kt", l = {BR.isGraphClickable}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
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
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            int i13 = this.d;
            if (i13 == 0) {
                r.b(obj);
                u1 u1Var = a.this.f12886f;
                b.d dVar = b.d.f12892a;
                this.d = 1;
                if (u1Var.emit(dVar, this) == aVar) {
                    return aVar;
                }
            } else if (i13 != 1) {
                pa.c.w("call to 'resume' before 'invoke' with coroutine");
                return null;
            } else {
                r.b(obj);
            }
            return f0.f36844a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.cat6.ui.home.settingtab.remove.ConnectedFloorcareRemoveMachineViewModel$removeListener$1$3$1", f = "ConnectedFloorcareRemoveMachineViewModel.kt", l = {BR.location}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class e extends i implements Function2<c0, l12.d<? super f0>, Object> {
        public int d;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.cat6.ui.home.settingtab.remove.a$e$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final /* synthetic */ class C0371a extends p implements w12.a<f0> {
            public C0371a(Object obj) {
                super(0, obj, a.class, "onRemoveButtonClicked", "onRemoveButtonClicked()V", 0);
            }

            @Override // w12.a
            public final f0 invoke() {
                a aVar = (a) this.receiver;
                aVar.getClass();
                g0.r(v.a(aVar), null, null, new com.dyson.mobile.android.cat6.ui.home.settingtab.remove.b(aVar, null), 3);
                return f0.f36844a;
            }
        }

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
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            int i13 = this.d;
            if (i13 == 0) {
                r.b(obj);
                a aVar2 = a.this;
                u1 u1Var = aVar2.f12886f;
                b.c cVar = new b.c(new C0371a(aVar2));
                this.d = 1;
                if (u1Var.emit(cVar, this) == aVar) {
                    return aVar;
                }
            } else if (i13 != 1) {
                pa.c.w("call to 'resume' before 'invoke' with coroutine");
                return null;
            } else {
                r.b(obj);
            }
            return f0.f36844a;
        }
    }

    static {
        new C0368a(null);
    }

    public a(MachineDefinition machineDefinition, n nVar) {
        machineDefinition.getClass();
        nVar.getClass();
        this.d = machineDefinition;
        this.e = nVar;
        this.f12886f = w1.b(0, 0, null, 7);
        this.f12888h = new vx0.f(this, 5);
    }

    @Override // m9.u
    public final void onCleared() {
        f fVar = this.f12887g;
        if (fVar != null) {
            jz1.d.dispose(fVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/cat6/ui/home/settingtab/remove/a$a;", "", "<init>", "()V", "", "CONNECTION_AND_REMOVAL_TIMEOUT_SECONDS", "J", "mod-cat6-connected-floorcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.cat6.ui.home.settingtab.remove.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0368a {
        public /* synthetic */ C0368a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0368a() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/dyson/mobile/android/cat6/ui/home/settingtab/remove/a$b;", "", "<init>", "()V", "a", "b", "d", "c", "Lcom/dyson/mobile/android/cat6/ui/home/settingtab/remove/a$b$a;", "Lcom/dyson/mobile/android/cat6/ui/home/settingtab/remove/a$b$b;", "Lcom/dyson/mobile/android/cat6/ui/home/settingtab/remove/a$b$c;", "Lcom/dyson/mobile/android/cat6/ui/home/settingtab/remove/a$b$d;", "mod-cat6-connected-floorcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static abstract class b {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/cat6/ui/home/settingtab/remove/a$b$a;", "Lcom/dyson/mobile/android/cat6/ui/home/settingtab/remove/a$b;", "Lzs0/e$b;", "positiveListener", "<init>", "(Lzs0/e$b;)V", "mod-cat6-connected-floorcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.cat6.ui.home.settingtab.remove.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0369a extends b {

            /* renamed from: a  reason: collision with root package name */
            public final e.b f12889a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0369a(e.b bVar) {
                super(null);
                bVar.getClass();
                this.f12889a = bVar;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/cat6/ui/home/settingtab/remove/a$b$b;", "Lcom/dyson/mobile/android/cat6/ui/home/settingtab/remove/a$b;", "<init>", "()V", "mod-cat6-connected-floorcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.cat6.ui.home.settingtab.remove.a$b$b  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0370b extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final C0370b f12890a = new C0370b();

            private C0370b() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/cat6/ui/home/settingtab/remove/a$b$c;", "Lcom/dyson/mobile/android/cat6/ui/home/settingtab/remove/a$b;", "Lkotlin/Function0;", "Lh12/f0;", "onRetry", "<init>", "(Lw12/a;)V", "mod-cat6-connected-floorcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class c extends b {

            /* renamed from: a  reason: collision with root package name */
            public final w12.a<f0> f12891a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(w12.a<f0> aVar) {
                super(null);
                aVar.getClass();
                this.f12891a = aVar;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/cat6/ui/home/settingtab/remove/a$b$d;", "Lcom/dyson/mobile/android/cat6/ui/home/settingtab/remove/a$b;", "<init>", "()V", "mod-cat6-connected-floorcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class d extends b {

            /* renamed from: a  reason: collision with root package name */
            public static final d f12892a = new d();

            private d() {
                super(null);
            }
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }
}
