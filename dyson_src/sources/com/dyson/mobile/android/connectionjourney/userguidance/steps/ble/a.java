package com.dyson.mobile.android.connectionjourney.userguidance.steps.ble;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.g;
import androidx.lifecycle.viewmodel.CreationExtras;
import h12.l;
import h12.m;
import h12.n;
import k30.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.w;
import w00.i;
import we1.a;
import x12.p0;
import x12.t;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/userguidance/steps/ble/a;", "Lcom/dyson/mobile/android/connectionjourney/userguidance/steps/b;", "<init>", "()V", "a", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a extends com.dyson.mobile.android.connectionjourney.userguidance.steps.b {

    /* renamed from: h  reason: collision with root package name */
    public static final C0450a f13923h = new C0450a(null);

    /* renamed from: f  reason: collision with root package name */
    public k50.b f13924f;

    /* renamed from: g  reason: collision with root package name */
    public final d0 f13925g;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class b extends t implements w12.a<Fragment> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f13926f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f13926f = fragment;
        }

        @Override // w12.a
        public final Fragment invoke() {
            return this.f13926f;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Lm9/w;", "invoke", "()Lm9/w;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class c extends t implements w12.a<w> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f13927f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(w12.a aVar) {
            super(0);
            this.f13927f = aVar;
        }

        @Override // w12.a
        public final w invoke() {
            return (w) this.f13927f.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class d extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ l f13928f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(l lVar) {
            super(0);
            this.f13928f = lVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return ((w) this.f13928f.getValue()).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class e extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f13929f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ l f13930g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(w12.a aVar, l lVar) {
            super(0);
            this.f13929f = aVar;
            this.f13930g = lVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f13929f;
            if (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) {
                w wVar = (w) this.f13930g.getValue();
                g gVar = wVar instanceof g ? (g) wVar : null;
                return gVar != null ? gVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f4572c;
            }
            return creationExtras;
        }
    }

    public a() {
        j jVar = new j(this, 2);
        l a13 = m.a(n.NONE, new c(new b(this)));
        this.f13925g = new d0(p0.f86717a.b(k50.a.class), new d(a13), jVar, new e(null, a13));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        String string;
        h20.b valueOf;
        h20.a baseCjComponent;
        context.getClass();
        super.onAttach(context);
        i.c(context).e.u(this);
        a.C2547a c2547a = we1.a.f85708c;
        Bundle arguments = getArguments();
        c2547a.getClass();
        a.C2547a.b(arguments).a("cjtype");
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string = arguments2.getString("cjtype")) != null && (valueOf = h20.b.valueOf(string)) != null && (baseCjComponent = valueOf.getBaseCjComponent(context)) != null) {
            baseCjComponent.u(this);
        }
        if (!(context instanceof h50.b)) {
            pa.c.w("Activity must implement UserGuidanceStepsNavigator");
            return;
        }
        k50.a aVar = (k50.a) this.f13925g.getValue();
        aVar.f46844i.setValue(aVar, k50.a.f46842j[0], (h50.b) context);
    }

    @Override // com.dyson.mobile.android.connectionjourney.userguidance.steps.b
    public final com.dyson.mobile.android.connectionjourney.userguidance.steps.c s() {
        return (k50.a) this.f13925g.getValue();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/userguidance/steps/ble/a$a;", "", "<init>", "()V", "", "EXTRA_CJ_TYPE", "Ljava/lang/String;", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.connectionjourney.userguidance.steps.ble.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0450a {
        public /* synthetic */ C0450a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0450a() {
        }
    }
}
