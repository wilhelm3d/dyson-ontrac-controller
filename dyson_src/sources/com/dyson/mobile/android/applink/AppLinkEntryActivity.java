package com.dyson.mobile.android.applink;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.dyson.mobile.android.applink.a;
import f.g;
import h12.h;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import m7.d;
import m9.p;
import x12.m;
import x12.p0;
import x12.r;
import x12.t;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/applink/AppLinkEntryActivity;", "Ll/b;", "<init>", "()V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AppLinkEntryActivity extends l.b {

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ int f12303l = 0;

    /* renamed from: j  reason: collision with root package name */
    public a.b f12304j;

    /* renamed from: k  reason: collision with root package name */
    public final d0 f12305k = new d0(p0.f86717a.b(com.dyson.mobile.android.applink.a.class), new d(this), new c(b.d, this, new uj.a(this, 0)), new e(null, this));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements p, m {
        public final /* synthetic */ Function1 d;

        public a(Function1 function1) {
            function1.getClass();
            this.d = function1;
        }

        @Override // x12.m
        public final h<?> d() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof p) && (obj instanceof m)) {
                return r.c(d(), ((m) obj).d());
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

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements w12.a<Bundle> {
        public static final b d = new b();

        @Override // w12.a
        public final /* bridge */ /* synthetic */ Bundle invoke() {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c implements w12.a<ViewModelProvider.Factory> {
        public final /* synthetic */ w12.a d;
        public final /* synthetic */ g e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Function1 f12306f;

        public c(w12.a aVar, g gVar, Function1 function1) {
            this.d = aVar;
            this.e = gVar;
            this.f12306f = function1;
        }

        @Override // w12.a
        public final ViewModelProvider.Factory invoke() {
            Bundle bundle = (Bundle) this.d.invoke();
            g gVar = this.e;
            if (bundle == null) {
                Intent intent = gVar.getIntent();
                bundle = intent != null ? intent.getExtras() : null;
            }
            return ef1.d.a(gVar, bundle, this.f12306f);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class d extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ g f12307f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(g gVar) {
            super(0);
            this.f12307f = gVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return this.f12307f.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class e extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f12308f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ g f12309g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(w12.a aVar, g gVar) {
            super(0);
            this.f12308f = aVar;
            this.f12309g = gVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f12308f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f12309g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        m7.d.f53195b.getClass();
        d.b bVar = new m7.d(this, null).f53196a;
        bVar.a();
        super.onCreate(bundle);
        bVar.b(new tq1.a(14));
        this.f12304j = (a.b) ((e80.b) pa.c.d(com.dyson.mobile.android.b.A)).M.f88315a;
        d0 d0Var = this.f12305k;
        ((com.dyson.mobile.android.applink.a) d0Var.getValue()).f12313i.observe(this, new a(new uj.a(this, 1)));
        ((com.dyson.mobile.android.applink.a) d0Var.getValue()).f12315k.observe(this, new a(new uj.a(this, 2)));
        ((com.dyson.mobile.android.applink.a) d0Var.getValue()).f12314j.observe(this, new a(new uj.a(this, 3)));
        ((com.dyson.mobile.android.applink.a) d0Var.getValue()).f12316l.observe(this, new a(new uj.a(this, 4)));
    }
}
