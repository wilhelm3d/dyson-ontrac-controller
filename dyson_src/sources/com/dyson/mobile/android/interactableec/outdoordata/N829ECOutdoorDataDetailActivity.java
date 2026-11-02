package com.dyson.mobile.android.interactableec.outdoordata;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.dyson.mobile.android.interactableec.outdoordata.N829ECOutdoorDataDetailActivity;
import com.dyson.mobile.android.logging.Logger;
import h12.m;
import h12.t;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pj0.i0;
import pj0.o;
import w90.g;
import x12.p0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/interactableec/outdoordata/N829ECOutdoorDataDetailActivity;", "Lpj0/b;", "<init>", "()V", "a", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class N829ECOutdoorDataDetailActivity extends pj0.b {

    /* renamed from: p  reason: collision with root package name */
    public static final a f14585p = new a(null);

    /* renamed from: k  reason: collision with root package name */
    public o.b f14586k;

    /* renamed from: l  reason: collision with root package name */
    public g f14587l;

    /* renamed from: m  reason: collision with root package name */
    public final d0 f14588m = new d0(p0.f86717a.b(o.class), new d(this), new c(b.d, this, new jg0.a(this, 25)), new e(null, this));

    /* renamed from: n  reason: collision with root package name */
    public final t f14589n = m.b(new w12.a(this) { // from class: lc0.a
        public final /* synthetic */ N829ECOutdoorDataDetailActivity e;

        {
            this.e = this;
        }

        @Override // w12.a
        public final Object invoke() {
            int i13 = r2;
            N829ECOutdoorDataDetailActivity n829ECOutdoorDataDetailActivity = this.e;
            switch (i13) {
                case 0:
                    N829ECOutdoorDataDetailActivity.a aVar = N829ECOutdoorDataDetailActivity.f14585p;
                    return n829ECOutdoorDataDetailActivity.getIntent().getStringExtra("MACHINE_LOCATION");
                default:
                    N829ECOutdoorDataDetailActivity.a aVar2 = N829ECOutdoorDataDetailActivity.f14585p;
                    return Boolean.valueOf(n829ECOutdoorDataDetailActivity.getIntent().getBooleanExtra("IS_LOCATION_MANUALLY_SET", false));
            }
        }
    });

    /* renamed from: o  reason: collision with root package name */
    public final t f14590o = m.b(new w12.a(this) { // from class: lc0.a
        public final /* synthetic */ N829ECOutdoorDataDetailActivity e;

        {
            this.e = this;
        }

        @Override // w12.a
        public final Object invoke() {
            int i13 = r2;
            N829ECOutdoorDataDetailActivity n829ECOutdoorDataDetailActivity = this.e;
            switch (i13) {
                case 0:
                    N829ECOutdoorDataDetailActivity.a aVar = N829ECOutdoorDataDetailActivity.f14585p;
                    return n829ECOutdoorDataDetailActivity.getIntent().getStringExtra("MACHINE_LOCATION");
                default:
                    N829ECOutdoorDataDetailActivity.a aVar2 = N829ECOutdoorDataDetailActivity.f14585p;
                    return Boolean.valueOf(n829ECOutdoorDataDetailActivity.getIntent().getBooleanExtra("IS_LOCATION_MANUALLY_SET", false));
            }
        }
    });

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
        public final /* synthetic */ f.g e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Function1 f14591f;

        public c(w12.a aVar, f.g gVar, Function1 function1) {
            this.d = aVar;
            this.e = gVar;
            this.f14591f = function1;
        }

        @Override // w12.a
        public final ViewModelProvider.Factory invoke() {
            Bundle bundle = (Bundle) this.d.invoke();
            f.g gVar = this.e;
            if (bundle == null) {
                Intent intent = gVar.getIntent();
                bundle = intent != null ? intent.getExtras() : null;
            }
            return ef1.d.a(gVar, bundle, this.f14591f);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class d extends x12.t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ f.g f14592f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(f.g gVar) {
            super(0);
            this.f14592f = gVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return this.f14592f.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class e extends x12.t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f14593f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ f.g f14594g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(w12.a aVar, f.g gVar) {
            super(0);
            this.f14593f = aVar;
            this.f14594g = gVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f14593f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f14594g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // pj0.b
    public final void Y0(i0 i0Var) {
        i0Var.getClass();
        if (!i0Var.equals(i0.a.f64322a)) {
            ma.e.o();
            return;
        }
        g gVar = this.f14587l;
        if (gVar == null) {
            Logger.b("Navigation cannot be done because coordinator is not initialized", null);
        } else {
            gVar.G(this, (String) this.f14589n.getValue(), ((Boolean) this.f14590o.getValue()).booleanValue());
        }
    }

    @Override // pj0.b
    public final o Z0() {
        return (o) this.f14588m.getValue();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/interactableec/outdoordata/N829ECOutdoorDataDetailActivity$a;", "", "<init>", "()V", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
