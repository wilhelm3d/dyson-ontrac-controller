package com.dyson.mobile.android.audio.home.sessionhistory;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager.widget.ViewPager;
import bt0.g;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.audio.home.sessionhistory.SessionHistoryNdsActivity;
import com.dyson.mobile.android.resources.view.DysonTabLayout;
import dk.q;
import f.x;
import fk.d;
import fm1.o0;
import h12.m;
import h12.t;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.p;
import sm.h;
import sm.j;
import sm.n;
import t2.e1;
import vj.f;
import we1.a;
import x12.p0;
import x12.r;
import zn1.e;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/audio/home/sessionhistory/SessionHistoryNdsActivity;", "Lbt0/g;", "<init>", "()V", "a", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SessionHistoryNdsActivity extends g {

    /* renamed from: q  reason: collision with root package name */
    public static final a f12546q = new a(null);

    /* renamed from: k  reason: collision with root package name */
    public fk.d f12547k;

    /* renamed from: l  reason: collision with root package name */
    public f f12548l;

    /* renamed from: m  reason: collision with root package name */
    public q f12549m;

    /* renamed from: n  reason: collision with root package name */
    public final d0 f12550n = new d0(p0.f86717a.b(ul.b.class), new d(this), new w12.a(this) { // from class: ul.a
        public final /* synthetic */ SessionHistoryNdsActivity e;

        {
            this.e = this;
        }

        @Override // w12.a
        public final Object invoke() {
            int i13 = r2;
            SessionHistoryNdsActivity sessionHistoryNdsActivity = this.e;
            switch (i13) {
                case 0:
                    d dVar = sessionHistoryNdsActivity.f12547k;
                    if (dVar != null) {
                        return dVar;
                    }
                    r.i("viewModelFactory");
                    throw null;
                default:
                    SessionHistoryNdsActivity.a aVar = SessionHistoryNdsActivity.f12546q;
                    return new j(sessionHistoryNdsActivity, sessionHistoryNdsActivity.d1().d);
            }
        }
    }, new e(null, this));

    /* renamed from: o  reason: collision with root package name */
    public final t f12551o = m.b(new w12.a(this) { // from class: ul.a
        public final /* synthetic */ SessionHistoryNdsActivity e;

        {
            this.e = this;
        }

        @Override // w12.a
        public final Object invoke() {
            int i13 = r2;
            SessionHistoryNdsActivity sessionHistoryNdsActivity = this.e;
            switch (i13) {
                case 0:
                    d dVar = sessionHistoryNdsActivity.f12547k;
                    if (dVar != null) {
                        return dVar;
                    }
                    r.i("viewModelFactory");
                    throw null;
                default:
                    SessionHistoryNdsActivity.a aVar = SessionHistoryNdsActivity.f12546q;
                    return new j(sessionHistoryNdsActivity, sessionHistoryNdsActivity.d1().d);
            }
        }
    });

    /* renamed from: p  reason: collision with root package name */
    public final b f12552p = new b();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/audio/home/sessionhistory/SessionHistoryNdsActivity$b", "Lsm/a;", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements sm.a {
        public b() {
        }

        @Override // sm.a
        public final void a(h hVar) {
            hVar.getClass();
            SessionHistoryNdsActivity sessionHistoryNdsActivity = SessionHistoryNdsActivity.this;
            f fVar = sessionHistoryNdsActivity.f12548l;
            if (fVar != null) {
                fVar.p(sessionHistoryNdsActivity, hVar);
            } else {
                r.i("coordinator");
                throw null;
            }
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c implements p, x12.m {
        public final /* synthetic */ Function1 d;

        public c(Function1 function1) {
            function1.getClass();
            this.d = function1;
        }

        @Override // x12.m
        public final h12.h<?> d() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof p) && (obj instanceof x12.m)) {
                return r.c(d(), ((x12.m) obj).d());
            }
            return false;
        }

        public final int hashCode() {
            return d().hashCode();
        }

        @Override // m9.p
        public final /* synthetic */ void onChanged(Object obj) {
            this.d.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class d extends x12.t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ f.g f12554f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(f.g gVar) {
            super(0);
            this.f12554f = gVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return this.f12554f.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class e extends x12.t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f12555f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ f.g f12556g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(w12.a aVar, f.g gVar) {
            super(0);
            this.f12555f = aVar;
            this.f12556g = gVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f12555f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f12556g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public final ul.b d1() {
        return (ul.b) this.f12550n.getValue();
    }

    @Override // bt0.g, androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        x.e.getClass();
        f.j.a(this, x.a.a(0), x.a.a(0));
        super.onCreate(bundle);
        if (cd.b.J(this)) {
            return;
        }
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Please use newInstance method";
        String y13 = o0.y("COORDINATOR_ID", a13.a("COORDINATOR_ID"));
        f.f84306m.getClass();
        f a14 = f.a.a(y13);
        if (a14 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        this.f12548l = a14;
        this.f12547k = a14.f84312l.d();
        q8.t d13 = q8.g.d(this, R.layout.activity_session_history_nds);
        d13.getClass();
        q qVar = (q) d13;
        this.f12549m = qVar;
        setSupportActionBar(qVar.e);
        q qVar2 = this.f12549m;
        if (qVar2 == null) {
            r.i("binding");
            throw null;
        }
        qVar2.e.x(this);
        q qVar3 = this.f12549m;
        if (qVar3 == null) {
            r.i("binding");
            throw null;
        }
        qVar3.l(d1());
        n nVar = d1().d;
        nVar.f76552m.setValue(nVar, n.f76541y[0], this.f12552p);
        q qVar4 = this.f12549m;
        if (qVar4 == null) {
            r.i("binding");
            throw null;
        }
        ViewPager viewPager = qVar4.d.f24114m;
        viewPager.getClass();
        q qVar5 = this.f12549m;
        if (qVar5 == null) {
            r.i("binding");
            throw null;
        }
        DysonTabLayout dysonTabLayout = qVar5.d.e;
        dysonTabLayout.getClass();
        viewPager.setAdapter((j) this.f12551o.getValue());
        dysonTabLayout.a(new e.j(viewPager));
        viewPager.b(new e.h(dysonTabLayout));
        d1().d.f76560u.observe(this, new c(new e1(this, 22)));
        getLifecycle().a(d1());
    }

    @Override // l.b, androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (this.f12547k != null) {
            getLifecycle().c(d1());
        }
    }

    @Override // l.b
    public final boolean onSupportNavigateUp() {
        getOnBackPressedDispatcher().d();
        return true;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/audio/home/sessionhistory/SessionHistoryNdsActivity$a;", "", "<init>", "()V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
