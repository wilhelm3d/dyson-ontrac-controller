package com.dyson.mobile.android.account.legacy.unreachableemail;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import f.g;
import f.x;
import fm1.o0;
import k30.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qh.j0;
import we1.a;
import x12.p0;
import x12.r;
import x12.t;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/account/legacy/unreachableemail/UnreachableEmailActivity;", "Lbt0/d;", "<init>", "()V", "a", "mod-user-login"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UnreachableEmailActivity extends bt0.d {

    /* renamed from: q  reason: collision with root package name */
    public static final a f12266q = new a(null);

    /* renamed from: l  reason: collision with root package name */
    public pf0.c f12267l;

    /* renamed from: m  reason: collision with root package name */
    public zf1.b f12268m;

    /* renamed from: n  reason: collision with root package name */
    public final d0 f12269n = new d0(p0.f86717a.b(li.b.class), new c(this), new j(this, 24), new d(null, this));

    /* renamed from: o  reason: collision with root package name */
    public final bt0.b f12270o = new bt0.b(null, 1, null);

    /* renamed from: p  reason: collision with root package name */
    public final b f12271p = new b();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/account/legacy/unreachableemail/UnreachableEmailActivity$b", "Lli/a;", "mod-user-login"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements li.a {
        public b() {
        }

        @Override // li.a
        public final void b() {
            UnreachableEmailActivity unreachableEmailActivity = UnreachableEmailActivity.this;
            unreachableEmailActivity.setResult(100);
            unreachableEmailActivity.finish();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class c extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ g f12273f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(g gVar) {
            super(0);
            this.f12273f = gVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return this.f12273f.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class d extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f12274f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ g f12275g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(w12.a aVar, g gVar) {
            super(0);
            this.f12274f = aVar;
            this.f12275g = gVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f12274f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f12275g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // bt0.d
    public final bt0.a d1() {
        return this.f12270o;
    }

    @Override // bt0.d, bt0.g, androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        sh.b bVar = j0.c(this).d;
        this.f12267l = bVar.f76165r.get();
        this.f12268m = bVar.a();
        x.e.getClass();
        f.j.a(this, x.a.a(0), x.a.a(0));
        super.onCreate(bundle);
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Missing argument, please use the newInstance method";
        Bundle a14 = a13.a("email-extra");
        d0 d0Var = this.f12269n;
        ((li.b) d0Var.getValue()).f52129g = o0.y("email-extra", a14);
        pf0.c cVar = this.f12267l;
        if (cVar == null) {
            r.i("localisationManager");
            throw null;
        }
        this.f12270o.l(cVar.d(((li.b) d0Var.getValue()).f52128f));
        li.b bVar2 = (li.b) d0Var.getValue();
        bVar2.e.setValue(bVar2, li.b.f52127h[0], this.f12271p);
    }

    @Override // bt0.d, l.b, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        com.dyson.mobile.android.account.legacy.unreachableemail.a.e.getClass();
        e1(new com.dyson.mobile.android.account.legacy.unreachableemail.a());
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/dyson/mobile/android/account/legacy/unreachableemail/UnreachableEmailActivity$a;", "", "<init>", "()V", "", "RESULT_CONTINUE", "I", "", "EMAIL_EXTRA", "Ljava/lang/String;", "mod-user-login"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
