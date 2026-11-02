package com.dyson.mobile.android.interactableec.home.n829.indoordata.history;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import c42.f2;
import f.g;
import fm1.o0;
import g.f;
import h12.f0;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import sb0.r;
import tb0.l0;
import tb0.t0;
import ub0.g;
import w90.g;
import we1.a;
import x12.p;
import x12.p0;
import x12.t;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/interactableec/home/n829/indoordata/history/N829ECIndoorDataHistoryActivity;", "Lf/g;", "<init>", "()V", "a", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class N829ECIndoorDataHistoryActivity extends g {

    /* renamed from: m  reason: collision with root package name */
    public static final a f14497m = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public zf1.b f14498j;

    /* renamed from: k  reason: collision with root package name */
    public w90.g f14499k;

    /* renamed from: l  reason: collision with root package name */
    public final d0 f14500l = new d0(p0.f86717a.b(t0.class), new c(this), new s41.a(this, 15), new d(null, this));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class b extends p implements w12.a<f0> {
        public b(Object obj) {
            super(0, obj, N829ECIndoorDataHistoryActivity.class, "finish", "finish()V", 0);
        }

        @Override // w12.a
        public final f0 invoke() {
            ((N829ECIndoorDataHistoryActivity) this.receiver).finish();
            return f0.f36844a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class c extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ g f14501f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(g gVar) {
            super(0);
            this.f14501f = gVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return this.f14501f.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class d extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f14502f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ g f14503g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(w12.a aVar, g gVar) {
            super(0);
            this.f14502f = aVar;
            this.f14503g = gVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f14502f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f14503g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object obj;
        Object value;
        if (cd.b.J(this)) {
            super.onCreate(null);
            return;
        }
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Please use newInstance method to create N829ECIndoorDataHistoryActivity";
        Bundle a14 = a13.a("COORDINATOR_ID", "SELECTED_SENSOR_IDENTIFIER");
        String y13 = o0.y("COORDINATOR_ID", a14);
        g.a aVar = ub0.g.Companion;
        short s13 = a14.getShort("SELECTED_SENSOR_IDENTIFIER");
        aVar.getClass();
        Iterator<E> it = ub0.g.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ub0.g) obj).getId() == s13) {
                break;
            }
        }
        ub0.g gVar = (ub0.g) obj;
        if (gVar == null) {
            gVar = ub0.g.UNKNOWN;
        }
        w90.g.f85506o.getClass();
        w90.g a15 = g.a.a(y13);
        if (a15 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        this.f14499k = a15;
        this.f14498j = a15.f85510j.a();
        t0 t0Var = (t0) this.f14500l.getValue();
        gVar.getClass();
        if (gVar == t0Var.S()) {
            super.onCreate(bundle);
            f.a(this, new c4.c(1388760284, true, new l0(this, 0)));
        }
        t0Var.f79169y.l(null, gVar);
        t0Var.W();
        f2 f2Var = t0Var.f79159o;
        do {
            value = f2Var.getValue();
        } while (!f2Var.f(value, ub0.d.a((ub0.d) value, null, null, null, null, (r) ((Map) t0Var.f79170z.getValue()).get(t0Var.S()), 31)));
        super.onCreate(bundle);
        f.a(this, new c4.c(1388760284, true, new l0(this, 0)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/interactableec/home/n829/indoordata/history/N829ECIndoorDataHistoryActivity$a;", "", "<init>", "()V", "", "SELECTED_SENSOR_IDENTIFIER", "Ljava/lang/String;", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
