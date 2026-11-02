package com.dyson.mobile.android.connectionjourney.userguidance.steps.ap;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.g;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.dyson.mobile.android.connectionjourney.userguidance.steps.UserGuidanceView;
import com.dyson.mobile.android.machinetype.MachineDescriptor;
import h12.l;
import h12.m;
import h12.n;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.w;
import w00.i;
import x12.p0;
import x12.t;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/userguidance/steps/ap/a;", "Lcom/dyson/mobile/android/connectionjourney/userguidance/steps/b;", "<init>", "()V", "a", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a extends com.dyson.mobile.android.connectionjourney.userguidance.steps.b {

    /* renamed from: h  reason: collision with root package name */
    public static final C0449a f13911h = new C0449a(null);

    /* renamed from: f  reason: collision with root package name */
    public i50.c f13912f;

    /* renamed from: g  reason: collision with root package name */
    public final d0 f13913g;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class b extends t implements w12.a<Fragment> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Fragment f13914f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Fragment fragment) {
            super(0);
            this.f13914f = fragment;
        }

        @Override // w12.a
        public final Fragment invoke() {
            return this.f13914f;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Lm9/w;", "invoke", "()Lm9/w;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class c extends t implements w12.a<w> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f13915f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(w12.a aVar) {
            super(0);
            this.f13915f = aVar;
        }

        @Override // w12.a
        public final w invoke() {
            return (w) this.f13915f.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class d extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ l f13916f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(l lVar) {
            super(0);
            this.f13916f = lVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return ((w) this.f13916f.getValue()).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class e extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f13917f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ l f13918g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(w12.a aVar, l lVar) {
            super(0);
            this.f13917f = aVar;
            this.f13918g = lVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f13917f;
            if (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) {
                w wVar = (w) this.f13918g.getValue();
                g gVar = wVar instanceof g ? (g) wVar : null;
                return gVar != null ? gVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f4572c;
            }
            return creationExtras;
        }
    }

    public a() {
        gv.c cVar = new gv.c(this, 29);
        l a13 = m.a(n.NONE, new c(new b(this)));
        this.f13913g = new d0(p0.f86717a.b(i50.b.class), new d(a13), cVar, new e(null, a13));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        i.c(context).e.y(this);
        if (!(context instanceof i50.a)) {
            pa.c.w("Activity must implement ApUserGuidanceStepsNavigator");
            return;
        }
        i50.b bVar = (i50.b) this.f13913g.getValue();
        bVar.f40803h.setValue(bVar, i50.b.f40802i[0], (i50.a) context);
    }

    @Override // com.dyson.mobile.android.connectionjourney.userguidance.steps.b
    public final com.dyson.mobile.android.connectionjourney.userguidance.steps.c s() {
        return (i50.b) this.f13913g.getValue();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/userguidance/steps/ap/a$a;", "", "<init>", "()V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.connectionjourney.userguidance.steps.ap.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0449a {
        public /* synthetic */ C0449a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static a a(UserGuidanceView userGuidanceView, MachineDescriptor machineDescriptor) {
            userGuidanceView.getClass();
            a aVar = new a();
            Bundle bundle = new Bundle();
            bundle.putParcelable("ap-user-guidance-extra", userGuidanceView);
            bundle.putSerializable("machineDescriptor", machineDescriptor);
            aVar.setArguments(bundle);
            return aVar;
        }

        private C0449a() {
        }
    }
}
