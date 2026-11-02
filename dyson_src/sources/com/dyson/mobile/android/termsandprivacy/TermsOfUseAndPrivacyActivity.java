package com.dyson.mobile.android.termsandprivacy;

import android.content.Intent;
import android.os.Bundle;
import androidx.compose.animation.i;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.dyson.mobile.android.DysonApplication;
import com.dyson.mobile.android.analytics.tracking.externallink.ExternalLinkTracking;
import com.dyson.mobile.android.b;
import com.dyson.mobile.android.getconnected.WelcomeActivity;
import com.dyson.mobile.android.getconnected.legacy.GetConnectedActivity;
import com.dyson.mobile.android.termsandprivacy.a;
import com.dyson.mobile.android.termsandprivacy.c;
import e71.n;
import f80.t1;
import f91.c;
import g5.r3;
import h12.f0;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mj.m;
import ur0.b;
import x12.p0;
import y9.q0;
import z32.g0;
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lcom/dyson/mobile/android/termsandprivacy/TermsOfUseAndPrivacyActivity;", "Lf/g;", "<init>", "()V", "a", "Lcom/dyson/mobile/android/termsandprivacy/a;", "uiState", "Lf91/c;", "viewModel", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TermsOfUseAndPrivacyActivity extends f.g {

    /* renamed from: n  reason: collision with root package name */
    public static final a f16930n = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public u71.b f16931j;

    /* renamed from: k  reason: collision with root package name */
    public c.b f16932k;

    /* renamed from: l  reason: collision with root package name */
    public final d0 f16933l = new d0(p0.f86717a.b(com.dyson.mobile.android.termsandprivacy.c.class), new b0(this), new e91.g(this, 2), new c0(null, this));

    /* renamed from: m  reason: collision with root package name */
    public com.dyson.mobile.android.b f16934m;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class a0 extends x12.t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f16935f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ f.g f16936g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a0(w12.a aVar, f.g gVar) {
            super(0);
            this.f16935f = aVar;
            this.f16936g = gVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f16935f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f16936g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/dyson/mobile/android/termsandprivacy/c$c;", "navigationEvent", "Lh12/f0;", "<anonymous>", "(Lcom/dyson/mobile/android/termsandprivacy/c$c;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.termsandprivacy.TermsOfUseAndPrivacyActivity$onCreate$1$1$1$1", f = "TermsOfUseAndPrivacyActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    /* loaded from: classes3.dex */
    public static final class b extends n12.i implements Function2<c.InterfaceC0617c, l12.d<? super f0>, Object> {
        public /* synthetic */ Object d;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ q0 f16937f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(q0 q0Var, l12.d<? super b> dVar) {
            super(2, dVar);
            this.f16937f = q0Var;
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            b bVar = new b(this.f16937f, dVar);
            bVar.d = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c.InterfaceC0617c interfaceC0617c, l12.d<? super f0> dVar) {
            return ((b) create(interfaceC0617c, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            Intent intent;
            c.InterfaceC0617c interfaceC0617c = (c.InterfaceC0617c) this.d;
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            h12.r.b(obj);
            boolean c13 = x12.r.c(interfaceC0617c, c.InterfaceC0617c.C0618c.f16959a);
            TermsOfUseAndPrivacyActivity termsOfUseAndPrivacyActivity = TermsOfUseAndPrivacyActivity.this;
            if (c13) {
                com.dyson.mobile.android.b bVar = termsOfUseAndPrivacyActivity.f16934m;
                if (bVar == null) {
                    x12.r.i("coordinator");
                    throw null;
                }
                s80.b bVar2 = bVar.c().get();
                if (!bVar2.f75540a.e(Locale.CHINA.getCountry())) {
                    s80.f fVar = bVar2.f75541b;
                    b.a aVar2 = ur0.b.f82548c;
                    DysonApplication dysonApplication = fVar.f75543a;
                    Map<String, String> a13 = fVar.f75544b.a();
                    aVar2.getClass();
                    b.a.a(dysonApplication, a13);
                    g0.r(fVar.f75545c, new s80.d(z32.z.Z0), null, new s80.e(fVar, null), 2);
                }
                qh.t tVar = bVar.f12804f;
                if (tVar == null) {
                    x12.r.i("loginSignUpOptions");
                    throw null;
                }
                if (tVar.a()) {
                    WelcomeActivity.f14097p.getClass();
                    intent = new Intent(termsOfUseAndPrivacyActivity, WelcomeActivity.class);
                } else {
                    GetConnectedActivity.f14142l.getClass();
                    intent = new Intent(termsOfUseAndPrivacyActivity, GetConnectedActivity.class);
                }
                intent.addFlags(268468224);
                termsOfUseAndPrivacyActivity.startActivity(intent);
                termsOfUseAndPrivacyActivity.finish();
            } else if (x12.r.c(interfaceC0617c, c.InterfaceC0617c.a.f16957a)) {
                a aVar3 = TermsOfUseAndPrivacyActivity.f16930n;
                termsOfUseAndPrivacyActivity.finishAffinity();
                System.exit(0);
                s72.a.w("System.exit returned normally, while it was supposed to halt JVM.");
                return null;
            } else if (!x12.r.c(interfaceC0617c, c.InterfaceC0617c.b.f16958a)) {
                ma.e.o();
                return null;
            } else {
                this.f16937f.g(e91.i.INSTANCE, new dw0.n(18));
            }
            return f0.f36844a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class b0 extends x12.t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ f.g f16938f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b0(f.g gVar) {
            super(0);
            this.f16938f = gVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return this.f16938f.getViewModelStore();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class c extends x12.p implements Function1<Boolean, f0> {
        public c(Object obj) {
            super(1, obj, com.dyson.mobile.android.termsandprivacy.c.class, "onTermsCheckChanged", "onTermsCheckChanged(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final f0 invoke(Boolean bool) {
            e91.f fVar;
            e91.f fVar2;
            boolean booleanValue = bool.booleanValue();
            com.dyson.mobile.android.termsandprivacy.c cVar = (com.dyson.mobile.android.termsandprivacy.c) this.receiver;
            Object value = cVar.f16950g.getValue();
            a.c cVar2 = value instanceof a.c ? (a.c) value : null;
            boolean z13 = false;
            boolean z14 = (cVar2 == null || (fVar2 = cVar2.f16946a) == null) ? false : fVar2.f26364g;
            Object value2 = cVar.f16950g.getValue();
            a.c cVar3 = value2 instanceof a.c ? (a.c) value2 : null;
            if (cVar3 != null && (fVar = cVar3.f16946a) != null) {
                z13 = fVar.f26367j;
            }
            cVar.U(booleanValue, z14, z13);
            return f0.f36844a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class c0 extends x12.t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f16939f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ f.g f16940g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c0(w12.a aVar, f.g gVar) {
            super(0);
            this.f16939f = aVar;
            this.f16940g = gVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f16939f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f16940g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class d extends x12.p implements Function1<Boolean, f0> {
        public d(Object obj) {
            super(1, obj, com.dyson.mobile.android.termsandprivacy.c.class, "onPrivacyCheckedChanged", "onPrivacyCheckedChanged(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final f0 invoke(Boolean bool) {
            e91.f fVar;
            e91.f fVar2;
            boolean booleanValue = bool.booleanValue();
            com.dyson.mobile.android.termsandprivacy.c cVar = (com.dyson.mobile.android.termsandprivacy.c) this.receiver;
            Object value = cVar.f16950g.getValue();
            a.c cVar2 = value instanceof a.c ? (a.c) value : null;
            boolean z13 = false;
            boolean z14 = (cVar2 == null || (fVar2 = cVar2.f16946a) == null) ? false : fVar2.f26363f;
            Object value2 = cVar.f16950g.getValue();
            a.c cVar3 = value2 instanceof a.c ? (a.c) value2 : null;
            if (cVar3 != null && (fVar = cVar3.f16946a) != null) {
                z13 = fVar.f26367j;
            }
            cVar.U(z14, booleanValue, z13);
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class e extends x12.p implements Function1<Boolean, f0> {
        public e(Object obj) {
            super(1, obj, com.dyson.mobile.android.termsandprivacy.c.class, "onAdditionalConsentChanged", "onAdditionalConsentChanged(Z)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final f0 invoke(Boolean bool) {
            e91.f fVar;
            e91.f fVar2;
            boolean booleanValue = bool.booleanValue();
            com.dyson.mobile.android.termsandprivacy.c cVar = (com.dyson.mobile.android.termsandprivacy.c) this.receiver;
            Object value = cVar.f16950g.getValue();
            a.c cVar2 = value instanceof a.c ? (a.c) value : null;
            boolean z13 = false;
            boolean z14 = (cVar2 == null || (fVar2 = cVar2.f16946a) == null) ? false : fVar2.f26363f;
            Object value2 = cVar.f16950g.getValue();
            a.c cVar3 = value2 instanceof a.c ? (a.c) value2 : null;
            if (cVar3 != null && (fVar = cVar3.f16946a) != null) {
                z13 = fVar.f26364g;
            }
            cVar.U(z14, z13, booleanValue);
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class f extends x12.p implements w12.a<f0> {
        public f(Object obj) {
            super(0, obj, com.dyson.mobile.android.termsandprivacy.c.class, "updateMarket", "updateMarket()V", 0);
        }

        @Override // w12.a
        public final f0 invoke() {
            com.dyson.mobile.android.termsandprivacy.c cVar = (com.dyson.mobile.android.termsandprivacy.c) this.receiver;
            cVar.getClass();
            g0.r(m9.v.a(cVar), null, null, new com.dyson.mobile.android.termsandprivacy.e(cVar, null), 3);
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class g extends x12.p implements w12.a<f0> {
        public g(Object obj) {
            super(0, obj, com.dyson.mobile.android.termsandprivacy.c.class, "onDeclineAndBrowseButtonClick", "onDeclineAndBrowseButtonClick()V", 0);
        }

        @Override // w12.a
        public final f0 invoke() {
            com.dyson.mobile.android.termsandprivacy.c cVar = (com.dyson.mobile.android.termsandprivacy.c) this.receiver;
            tj.a aVar = cVar.d;
            aVar.getClass();
            boolean e = aVar.e(Locale.CHINA.getCountry());
            b42.c cVar2 = cVar.f16951h;
            if (e) {
                cVar2.h(c.InterfaceC0617c.b.f16958a);
            } else {
                cVar2.h(c.InterfaceC0617c.a.f16957a);
            }
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class h extends x12.p implements w12.a<f0> {
        public h(Object obj) {
            super(0, obj, com.dyson.mobile.android.termsandprivacy.c.class, "onRefresh", "onRefresh()V", 0);
        }

        @Override // w12.a
        public final f0 invoke() {
            com.dyson.mobile.android.termsandprivacy.c cVar = (com.dyson.mobile.android.termsandprivacy.c) this.receiver;
            cVar.getClass();
            g0.r(m9.v.a(cVar), null, null, new com.dyson.mobile.android.termsandprivacy.d(cVar, null), 3);
            return f0.f36844a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lf91/c$b;", "event", "Lh12/f0;", "<anonymous>", "(Lf91/c$b;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.termsandprivacy.TermsOfUseAndPrivacyActivity$onCreate$1$1$2$1$1$3$1$1", f = "TermsOfUseAndPrivacyActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    /* loaded from: classes3.dex */
    public static final class i extends n12.i implements Function2<c.b, l12.d<? super f0>, Object> {
        public /* synthetic */ Object d;
        public final /* synthetic */ q0 e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ r3 f16941f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(q0 q0Var, r3 r3Var, l12.d<? super i> dVar) {
            super(2, dVar);
            this.e = q0Var;
            this.f16941f = r3Var;
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            i iVar = new i(this.e, this.f16941f, dVar);
            iVar.d = obj;
            return iVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c.b bVar, l12.d<? super f0> dVar) {
            return ((i) create(bVar, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            c.b bVar = (c.b) this.d;
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            h12.r.b(obj);
            if (x12.r.c(bVar, c.b.a.f30367a)) {
                this.e.l();
            } else if (!(bVar instanceof c.b.C0980b)) {
                ma.e.o();
                return null;
            } else {
                this.f16941f.a(((c.b.C0980b) bVar).f30368a);
            }
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class j extends x12.p implements w12.a<f0> {
        public j(Object obj) {
            super(0, obj, f91.c.class, "onLoginButtonClick", "onLoginButtonClick()V", 0);
        }

        @Override // w12.a
        public final f0 invoke() {
            ((f91.c) this.receiver).d.h(c.b.a.f30367a);
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class k extends x12.p implements w12.a<f0> {
        public k(Object obj) {
            super(0, obj, f91.c.class, "onLaunchDysonWebsiteClick", "onLaunchDysonWebsiteClick()V", 0);
        }

        @Override // w12.a
        public final f0 invoke() {
            ((f91.c) this.receiver).d.h(new c.b.C0980b("https://www.dyson.cn"));
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class l extends x12.p implements w12.a<f0> {
        public l(Object obj) {
            super(0, obj, f91.c.class, "onNavigateBackButtonClick", "onNavigateBackButtonClick()V", 0);
        }

        @Override // w12.a
        public final f0 invoke() {
            ((f91.c) this.receiver).d.h(c.b.a.f30367a);
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class m implements Function1<androidx.compose.animation.i<y9.z>, androidx.compose.animation.y> {
        public static final m d = new m();

        @Override // kotlin.jvm.functions.Function1
        public final androidx.compose.animation.y invoke(androidx.compose.animation.i<y9.z> iVar) {
            androidx.compose.animation.i<y9.z> iVar2 = iVar;
            iVar2.getClass();
            if (pf1.a.a(iVar2)) {
                i.a.f2669b.getClass();
                return androidx.compose.animation.i.g(iVar2, i.a.f2671f, null, 6);
            }
            androidx.compose.animation.y.f2749a.getClass();
            return androidx.compose.animation.y.f2750b;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class n implements Function1<androidx.compose.animation.i<y9.z>, androidx.compose.animation.x> {
        public static final n d = new n();

        @Override // kotlin.jvm.functions.Function1
        public final androidx.compose.animation.x invoke(androidx.compose.animation.i<y9.z> iVar) {
            androidx.compose.animation.i<y9.z> iVar2 = iVar;
            iVar2.getClass();
            i.a.f2669b.getClass();
            return androidx.compose.animation.i.a(iVar2, i.a.f2672g, null, 6);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class o implements Function1<androidx.compose.animation.i<y9.z>, androidx.compose.animation.y> {
        public static final o d = new o();

        @Override // kotlin.jvm.functions.Function1
        public final androidx.compose.animation.y invoke(androidx.compose.animation.i<y9.z> iVar) {
            androidx.compose.animation.i<y9.z> iVar2 = iVar;
            iVar2.getClass();
            if (pf1.a.a(iVar2)) {
                i.a.f2669b.getClass();
                return androidx.compose.animation.i.g(iVar2, i.a.f2672g, null, 6);
            }
            androidx.compose.animation.y.f2749a.getClass();
            return androidx.compose.animation.y.f2750b;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class p implements Function1<androidx.compose.animation.i<y9.z>, androidx.compose.animation.x> {
        public static final p d = new p();

        @Override // kotlin.jvm.functions.Function1
        public final androidx.compose.animation.x invoke(androidx.compose.animation.i<y9.z> iVar) {
            androidx.compose.animation.i<y9.z> iVar2 = iVar;
            iVar2.getClass();
            if (pf1.a.a(iVar2)) {
                i.a.f2669b.getClass();
                return androidx.compose.animation.i.a(iVar2, i.a.f2671f, null, 6);
            }
            androidx.compose.animation.x.f2747a.getClass();
            return androidx.compose.animation.x.f2748b;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class q implements Function1<androidx.compose.animation.i<y9.z>, androidx.compose.animation.y> {
        public static final q d = new q();

        @Override // kotlin.jvm.functions.Function1
        public final androidx.compose.animation.y invoke(androidx.compose.animation.i<y9.z> iVar) {
            androidx.compose.animation.i<y9.z> iVar2 = iVar;
            iVar2.getClass();
            if (pf1.a.a(iVar2)) {
                i.a.f2669b.getClass();
                return androidx.compose.animation.i.g(iVar2, i.a.f2671f, null, 6);
            }
            androidx.compose.animation.y.f2749a.getClass();
            return androidx.compose.animation.y.f2750b;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class r implements Function1<androidx.compose.animation.i<y9.z>, androidx.compose.animation.x> {
        public static final r d = new r();

        @Override // kotlin.jvm.functions.Function1
        public final androidx.compose.animation.x invoke(androidx.compose.animation.i<y9.z> iVar) {
            androidx.compose.animation.i<y9.z> iVar2 = iVar;
            iVar2.getClass();
            i.a.f2669b.getClass();
            return androidx.compose.animation.i.a(iVar2, i.a.f2672g, null, 6);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class s implements Function1<androidx.compose.animation.i<y9.z>, androidx.compose.animation.y> {
        public static final s d = new s();

        @Override // kotlin.jvm.functions.Function1
        public final androidx.compose.animation.y invoke(androidx.compose.animation.i<y9.z> iVar) {
            androidx.compose.animation.i<y9.z> iVar2 = iVar;
            iVar2.getClass();
            if (pf1.a.a(iVar2)) {
                i.a.f2669b.getClass();
                return androidx.compose.animation.i.g(iVar2, i.a.f2672g, null, 6);
            }
            androidx.compose.animation.y.f2749a.getClass();
            return androidx.compose.animation.y.f2750b;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class t implements Function1<androidx.compose.animation.i<y9.z>, androidx.compose.animation.x> {
        public static final t d = new t();

        @Override // kotlin.jvm.functions.Function1
        public final androidx.compose.animation.x invoke(androidx.compose.animation.i<y9.z> iVar) {
            androidx.compose.animation.i<y9.z> iVar2 = iVar;
            iVar2.getClass();
            if (pf1.a.a(iVar2)) {
                i.a.f2669b.getClass();
                return androidx.compose.animation.i.a(iVar2, i.a.f2671f, null, 6);
            }
            androidx.compose.animation.x.f2747a.getClass();
            return androidx.compose.animation.x.f2748b;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class u implements Function1<androidx.compose.animation.i<y9.z>, androidx.compose.animation.y> {
        public static final u d = new u();

        @Override // kotlin.jvm.functions.Function1
        public final androidx.compose.animation.y invoke(androidx.compose.animation.i<y9.z> iVar) {
            androidx.compose.animation.i<y9.z> iVar2 = iVar;
            iVar2.getClass();
            if (pf1.a.a(iVar2)) {
                i.a.f2669b.getClass();
                return androidx.compose.animation.i.g(iVar2, i.a.f2671f, null, 6);
            }
            androidx.compose.animation.y.f2749a.getClass();
            return androidx.compose.animation.y.f2750b;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class v implements Function1<androidx.compose.animation.i<y9.z>, androidx.compose.animation.x> {
        public static final v d = new v();

        @Override // kotlin.jvm.functions.Function1
        public final androidx.compose.animation.x invoke(androidx.compose.animation.i<y9.z> iVar) {
            androidx.compose.animation.i<y9.z> iVar2 = iVar;
            iVar2.getClass();
            i.a.f2669b.getClass();
            return androidx.compose.animation.i.a(iVar2, i.a.f2672g, null, 6);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class w implements Function1<androidx.compose.animation.i<y9.z>, androidx.compose.animation.y> {
        public static final w d = new w();

        @Override // kotlin.jvm.functions.Function1
        public final androidx.compose.animation.y invoke(androidx.compose.animation.i<y9.z> iVar) {
            androidx.compose.animation.i<y9.z> iVar2 = iVar;
            iVar2.getClass();
            if (pf1.a.a(iVar2)) {
                i.a.f2669b.getClass();
                return androidx.compose.animation.i.g(iVar2, i.a.f2672g, null, 6);
            }
            androidx.compose.animation.y.f2749a.getClass();
            return androidx.compose.animation.y.f2750b;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class x implements Function1<androidx.compose.animation.i<y9.z>, androidx.compose.animation.x> {
        public static final x d = new x();

        @Override // kotlin.jvm.functions.Function1
        public final androidx.compose.animation.x invoke(androidx.compose.animation.i<y9.z> iVar) {
            androidx.compose.animation.i<y9.z> iVar2 = iVar;
            iVar2.getClass();
            if (pf1.a.a(iVar2)) {
                i.a.f2669b.getClass();
                return androidx.compose.animation.i.a(iVar2, i.a.f2671f, null, 6);
            }
            androidx.compose.animation.x.f2747a.getClass();
            return androidx.compose.animation.x.f2748b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelProvider$Factory;", "invoke", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class y extends x12.t implements w12.a<ViewModelProvider.Factory> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ f.g f16942f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(f.g gVar) {
            super(0);
            this.f16942f = gVar;
        }

        @Override // w12.a
        public final ViewModelProvider.Factory invoke() {
            return this.f16942f.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class z extends x12.t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ f.g f16943f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(f.g gVar) {
            super(0);
            this.f16943f = gVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return this.f16943f.getViewModelStore();
        }
    }

    public final com.dyson.mobile.android.termsandprivacy.c Y0() {
        return (com.dyson.mobile.android.termsandprivacy.c) this.f16933l.getValue();
    }

    public final void Z0(String str) {
        ExternalLinkTracking externalLinkTracking = new ExternalLinkTracking("privacy_policy", m.a.USER_REGISTRATION, null, null, 12, null);
        u71.b bVar = this.f16931j;
        if (bVar != null) {
            bVar.b(this, str, externalLinkTracking);
        } else {
            x12.r.i("externalLinkOpener");
            throw null;
        }
    }

    @Override // f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        cd.b.J(this);
        com.dyson.mobile.android.b.A.getClass();
        com.dyson.mobile.android.b a13 = b.a.a();
        this.f16934m = a13;
        e80.b bVar = (e80.b) a13.f();
        this.f16931j = (u71.b) bVar.B.get();
        t1 t1Var = bVar.f26212b;
        tj.a aVar = bVar.f26242s.get();
        mi.a aVar2 = bVar.O.get();
        f80.f fVar = bVar.f26210a;
        fVar.getClass();
        oj.c cVar = new oj.c(new y70.f(bVar.e.get().getApplicationContext(), "appConfigOptions"));
        fVar.getClass();
        e71.n.f26183r.getClass();
        n81.b bVar2 = n.a.a().f26190g;
        if (bVar2 == null) {
            x12.r.i("marketInformationRepository");
            throw null;
        }
        t1Var.getClass();
        this.f16932k = new c.b(aVar, aVar2, cVar, bVar2);
        g.f.a(this, new c4.c(-1046424169, true, new aa.g(this, 18)));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/termsandprivacy/TermsOfUseAndPrivacyActivity$a;", "", "<init>", "()V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
