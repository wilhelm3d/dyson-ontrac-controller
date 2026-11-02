package com.dyson.mobile.android.interactableec.home.help.connection;

import a01.k;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ExpandableListView;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.resources.view.DysonActionBar;
import eh0.f;
import f.g;
import fm1.o0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import na0.a1;
import na0.e;
import na0.y0;
import pa0.t0;
import w90.g;
import we1.a;
import x12.p0;
import x12.r;
import x12.t;
import zc0.w;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/interactableec/home/help/connection/ECConnectionHelpActivity;", "Ll/b;", "<init>", "()V", "a", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ECConnectionHelpActivity extends l.b {

    /* renamed from: n  reason: collision with root package name */
    public static final a f14435n = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public zf1.b f14436j;

    /* renamed from: k  reason: collision with root package name */
    public ab0.a f14437k;

    /* renamed from: l  reason: collision with root package name */
    public final d0 f14438l = new d0(p0.f86717a.b(ab0.d.class), new c(this), new k(this, 3), new d(null, this));

    /* renamed from: m  reason: collision with root package name */
    public final b f14439m = new b();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/interactableec/home/help/connection/ECConnectionHelpActivity$b", "Lab0/b;", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements ab0.b {
        public b() {
        }

        @Override // ab0.b
        public final void v() {
            w81.c.f85438h.getClass();
            new w81.c().showNow(ECConnectionHelpActivity.this.getSupportFragmentManager(), "ContactDysonDialog");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class c extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ g f14441f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(g gVar) {
            super(0);
            this.f14441f = gVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return this.f14441f.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class d extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f14442f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ g f14443g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(w12.a aVar, g gVar) {
            super(0);
            this.f14442f = aVar;
            this.f14443g = gVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f14442f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f14443g.getDefaultViewModelCreationExtras() : creationExtras;
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
        a13.f85710b = "Please use newIntent method to create a ECConnectionHelpActivity Intent";
        String y13 = o0.y("COORDINATOR_ID", a13.a("COORDINATOR_ID"));
        w90.g.f85506o.getClass();
        w90.g a14 = g.a.a(y13);
        if (a14 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        oa0.b bVar = a14.f85510j;
        this.f14436j = bVar.a();
        pa0.a aVar = bVar.f59825a;
        f<w> fVar = bVar.F.get();
        aVar.getClass();
        fVar.getClass();
        this.f14437k = new ab0.a(new ab0.c(fVar.b()), t0.b(aVar));
        e eVar = (e) q8.g.d(this, R.layout.activity_connection_help);
        DysonActionBar dysonActionBar = eVar.f56246f;
        ExpandableListView expandableListView = eVar.e;
        dysonActionBar.x(this);
        LayoutInflater from = LayoutInflater.from(this);
        int i13 = a1.f56140h;
        a1 a1Var = (a1) q8.t.inflateInternal(from, R.layout.item_connection_help_header_view, expandableListView, false, null);
        a1Var.getClass();
        int i14 = y0.f56801h;
        y0 y0Var = (y0) q8.t.inflateInternal(from, R.layout.item_connection_help_footer_view, expandableListView, false, null);
        y0Var.getClass();
        d0 d0Var = this.f14438l;
        a1Var.l((ab0.d) d0Var.getValue());
        ab0.d dVar = (ab0.d) d0Var.getValue();
        dVar.d.setValue(dVar, ab0.d.f702f[0], this.f14439m);
        y0Var.l(dVar);
        expandableListView.addHeaderView(a1Var.getRoot());
        expandableListView.addFooterView(y0Var.getRoot());
        ab0.a aVar2 = this.f14437k;
        if (aVar2 == null) {
            r.i("adapter");
            throw null;
        }
        expandableListView.setAdapter(aVar2);
        se1.a.a(this, (r3 & 1) == 0, false);
    }

    @Override // l.b
    public final boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/interactableec/home/help/connection/ECConnectionHelpActivity$a;", "", "<init>", "()V", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
