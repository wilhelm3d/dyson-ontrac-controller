package com.dyson.mobile.android.support.ui.contact.compose;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.dyson.mobile.android.machinetype.MachineDescriptor;
import com.dyson.mobile.android.support.ui.contact.compose.c;
import e71.j;
import e71.n;
import f.x;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x12.p0;
import x12.r;
import x12.t;
import x42.m1;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/support/ui/contact/compose/ErrorCustomerSupportActivity;", "Landroidx/fragment/app/e;", "<init>", "()V", "a", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ErrorCustomerSupportActivity extends androidx.fragment.app.e {

    /* renamed from: m  reason: collision with root package name */
    public static final a f16863m = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public c.b f16864j;

    /* renamed from: k  reason: collision with root package name */
    public j f16865k;

    /* renamed from: l  reason: collision with root package name */
    public final d0 f16866l = new d0(p0.f86717a.b(com.dyson.mobile.android.support.ui.contact.compose.c.class), new d(this), new c(b.d, this, new m1(this, 6)), new e(null, this));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b implements w12.a<Bundle> {
        public static final b d = new b();

        @Override // w12.a
        public final /* bridge */ /* synthetic */ Bundle invoke() {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c implements w12.a<ViewModelProvider.Factory> {
        public final /* synthetic */ w12.a d;
        public final /* synthetic */ f.g e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Function1 f16867f;

        public c(w12.a aVar, f.g gVar, Function1 function1) {
            this.d = aVar;
            this.e = gVar;
            this.f16867f = function1;
        }

        @Override // w12.a
        public final ViewModelProvider.Factory invoke() {
            Bundle bundle = (Bundle) this.d.invoke();
            f.g gVar = this.e;
            if (bundle == null) {
                Intent intent = gVar.getIntent();
                bundle = intent != null ? intent.getExtras() : null;
            }
            return ef1.d.a(gVar, bundle, this.f16867f);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class d extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ f.g f16868f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(f.g gVar) {
            super(0);
            this.f16868f = gVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return this.f16868f.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class e extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f16869f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ f.g f16870g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(w12.a aVar, f.g gVar) {
            super(0);
            this.f16869f = aVar;
            this.f16870g = gVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f16869f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f16870g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public final j c1() {
        j jVar = this.f16865k;
        if (jVar != null) {
            return jVar;
        }
        r.i("coordinator");
        throw null;
    }

    public final com.dyson.mobile.android.support.ui.contact.compose.c d1() {
        return (com.dyson.mobile.android.support.ui.contact.compose.c) this.f16866l.getValue();
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        x.e.getClass();
        f.j.a(this, x.a.a(0), x.a.a(0));
        n.f26183r.getClass();
        q71.b bVar = (q71.b) n.a.b();
        bVar.a();
        this.f16864j = (c.b) bVar.O.f88315a;
        bVar.f66200a.getClass();
        this.f16865k = new j();
        super.onCreate(bundle);
        if (cd.b.J(this)) {
            return;
        }
        getLifecycle().a(d1());
        g.f.a(this, new c4.c(-673211678, true, new x81.c(this, 0)));
    }

    @Override // androidx.fragment.app.e, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        getLifecycle().c(d1());
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/support/ui/contact/compose/ErrorCustomerSupportActivity$a;", "", "<init>", "()V", "", "MACHINE_SERIAL", "Ljava/lang/String;", "MACHINE_FAULT_CODE", "MACHINE_DESCRIPTOR", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static Intent a(Context context, String str, MachineDescriptor machineDescriptor, String str2) {
            context.getClass();
            str.getClass();
            machineDescriptor.getClass();
            Intent intent = new Intent(context, ErrorCustomerSupportActivity.class);
            intent.putExtra("MACHINE_SERIAL", str);
            intent.putExtra("MACHINE_DESCRIPTOR", machineDescriptor);
            if (str2 != null) {
                intent.putExtra("MACHINE_FAULT_CODE", str2);
            }
            return intent;
        }

        private a() {
        }
    }
}
