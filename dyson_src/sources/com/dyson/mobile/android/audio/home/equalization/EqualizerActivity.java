package com.dyson.mobile.android.audio.home.equalization;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import f.g;
import f.j;
import f.x;
import fm1.o0;
import h12.f0;
import hl.q;
import hl.w;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import vj.f;
import we1.a;
import x12.p;
import x12.p0;
import x12.t;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/audio/home/equalization/EqualizerActivity;", "Ll/b;", "<init>", "()V", "a", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EqualizerActivity extends l.b {

    /* renamed from: l  reason: collision with root package name */
    public static final a f12520l = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public fk.d f12521j;

    /* renamed from: k  reason: collision with root package name */
    public final d0 f12522k = new d0(p0.f86717a.b(w.class), new c(this), new gv.c(this, 15), new d(null, this));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class b extends p implements w12.a<f0> {
        public b(Object obj) {
            super(0, obj, EqualizerActivity.class, "finish", "finish()V", 0);
        }

        @Override // w12.a
        public final f0 invoke() {
            ((EqualizerActivity) this.receiver).finish();
            return f0.f36844a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class c extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ g f12523f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(g gVar) {
            super(0);
            this.f12523f = gVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return this.f12523f.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class d extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f12524f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ g f12525g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(w12.a aVar, g gVar) {
            super(0);
            this.f12524f = aVar;
            this.f12525g = gVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f12524f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f12525g.getDefaultViewModelCreationExtras() : creationExtras;
        }
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
        a13.f85710b = "Please use newIntent method";
        String y13 = o0.y("COORDINATOR_ID", a13.a("COORDINATOR_ID"));
        f.f84306m.getClass();
        f a14 = f.a.a(y13);
        if (a14 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        this.f12521j = a14.f84312l.d();
        g.f.a(this, new c4.c(-1624339010, true, new q(this, 0)));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/audio/home/equalization/EqualizerActivity$a;", "", "<init>", "()V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
