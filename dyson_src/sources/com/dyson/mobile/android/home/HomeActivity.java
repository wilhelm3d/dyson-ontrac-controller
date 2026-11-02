package com.dyson.mobile.android.home;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import b90.a1;
import c42.f2;
import com.dyson.mobile.android.DysonApplication;
import com.dyson.mobile.android.applink.AppLinkIntent;
import com.dyson.mobile.android.b;
import com.dyson.mobile.android.dynamiccontent.deeplinks.DynamicContentDeepLink;
import com.dyson.mobile.android.home.b;
import com.dyson.mobile.android.home.i;
import com.dyson.mobile.android.inbox.InboxActivity;
import com.dyson.mobile.android.machine.deeplink.DeeplinkAction;
import com.dyson.mobile.android.salesforce.SalesforceMarketingCloudWebViewActivity;
import com.dyson.mobile.android.support.aichatbot.b;
import com.dyson.mobile.android.support.deeplink.DeepLinkAction;
import com.dyson.mobile.android.usermanagement.profile.QuestionnaireActivity;
import com.dyson.mobile.android.usermanagement.profile.model.QuestionnaireActivityPayload;
import com.dyson.mobile.android.usermanagement.profile.model.QuestionnaireStartInfo;
import e71.n;
import ee1.e;
import f.x;
import f80.q1;
import f80.t1;
import f80.y;
import g80.a;
import h12.f0;
import h12.r;
import hj.e;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lj.a;
import m9.v;
import mj.a;
import mj.b;
import mj.m;
import n30.q;
import n30.s;
import nj.w3;
import w80.i0;
import w80.l0;
import x12.p;
import x12.p0;
import x12.t;
import y9.q0;
import z32.c0;
import z32.g0;
import z80.a;
import z80.b;
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u000f²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002²\u0006\f\u0010\u000b\u001a\u00020\t8\nX\u008a\u0084\u0002²\u0006\f\u0010\f\u001a\u00020\t8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u000e\u001a\u0004\u0018\u00010\r8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/dyson/mobile/android/home/HomeActivity;", "Ll/b;", "Lof1/c;", "<init>", "()V", "Lw80/d;", "globalNavigationState", "Lcom/dyson/mobile/android/home/i$c;", "homeUiState", "", "shouldNavigateToLastVisitedMachine", "shouldShowProductRemovedBanner", "shouldShowDeviceAddedBanner", "Lb90/a1;", "systemBarsConfiguration", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HomeActivity extends l.b implements of1.c {

    /* renamed from: r  reason: collision with root package name */
    public static final /* synthetic */ int f14146r = 0;

    /* renamed from: j  reason: collision with root package name */
    public i.b f14147j;

    /* renamed from: k  reason: collision with root package name */
    public defpackage.a f14148k;

    /* renamed from: l  reason: collision with root package name */
    public f71.b f14149l;

    /* renamed from: m  reason: collision with root package name */
    public qg0.b f14150m;

    /* renamed from: n  reason: collision with root package name */
    public hj.e f14151n;

    /* renamed from: p  reason: collision with root package name */
    public com.dyson.mobile.android.b f14153p;

    /* renamed from: o  reason: collision with root package name */
    public final d0 f14152o = new d0(p0.f86717a.b(com.dyson.mobile.android.home.i.class), new n(this), new w80.h(this, 0), new o(null, this));

    /* renamed from: q  reason: collision with root package name */
    public final of1.b f14154q = new of1.b();

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/dyson/mobile/android/home/i$a;", "event", "Lh12/f0;", "<anonymous>", "(Lcom/dyson/mobile/android/home/i$a;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.home.HomeActivity$CollectEvents$1$1", f = "HomeActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class a extends n12.i implements Function2<i.a, l12.d<? super f0>, Object> {
        public /* synthetic */ Object d;
        public final /* synthetic */ q0 e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ HomeActivity f14155f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q0 q0Var, HomeActivity homeActivity, l12.d<? super a> dVar) {
            super(2, dVar);
            this.e = q0Var;
            this.f14155f = homeActivity;
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            a aVar = new a(this.e, this.f14155f, dVar);
            aVar.d = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(i.a aVar, l12.d<? super f0> dVar) {
            return ((a) create(aVar, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            i.a aVar = (i.a) this.d;
            m12.a aVar2 = m12.a.COROUTINE_SUSPENDED;
            r.b(obj);
            boolean z13 = aVar instanceof i.a.d;
            q0 q0Var = this.e;
            if (z13) {
                i.a.d dVar = (i.a.d) aVar;
                com.dyson.mobile.android.home.h.b(q0Var, dVar.f14205a, dVar.f14206b, 4);
            } else if (aVar instanceof i.a.e) {
                q0Var.getClass();
                q0Var.g(b.d.INSTANCE, new vk0.e(21));
            } else if (aVar instanceof i.a.f) {
                q0Var.getClass();
                q0Var.g(b.e.INSTANCE, new vk0.e(21));
            } else {
                boolean z14 = aVar instanceof i.a.g;
                HomeActivity homeActivity = this.f14155f;
                if (z14) {
                    i.a.g gVar = (i.a.g) aVar;
                    int i13 = HomeActivity.f14146r;
                    homeActivity.getClass();
                    String str = gVar.f14209a;
                    String str2 = gVar.f14210b;
                    String str3 = gVar.f14211c;
                    if (homeActivity.f14153p == null) {
                        x12.r.i("coreCoordinator");
                        throw null;
                    }
                    b.a aVar3 = com.dyson.mobile.android.b.A;
                    SalesforceMarketingCloudWebViewActivity.f16663k.getClass();
                    homeActivity.startActivity(SalesforceMarketingCloudWebViewActivity.a.a(homeActivity, str, str2, str3));
                } else if (aVar instanceof i.a.C0461a) {
                    Uri uri = ((i.a.C0461a) aVar).f14202a;
                    com.dyson.mobile.android.b bVar = homeActivity.f14153p;
                    if (bVar == null) {
                        x12.r.i("coreCoordinator");
                        throw null;
                    }
                    bVar.i(uri, homeActivity);
                } else if (aVar instanceof i.a.c) {
                    int i14 = HomeActivity.f14146r;
                    homeActivity.getClass();
                    ls0.a aVar4 = new ls0.a();
                    homeActivity.getSupportFragmentManager().j0("AppReviewDialog", homeActivity, new ss0.k(5, aVar4, homeActivity));
                    FragmentManager supportFragmentManager = homeActivity.getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    aVar4.f52585a.show(supportFragmentManager, "AppReviewDialog");
                } else if (!(aVar instanceof i.a.b)) {
                    ma.e.o();
                    return null;
                } else if (homeActivity.f14153p == null) {
                    x12.r.i("coreCoordinator");
                    throw null;
                } else {
                    com.dyson.mobile.android.b.s(homeActivity, false);
                }
            }
            return f0.f36844a;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.home.HomeActivity$ConfigureSystemBars$1$1", f = "HomeActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class b extends n12.i implements Function2<c0, l12.d<? super f0>, Object> {
        public final /* synthetic */ a1 d;
        public final /* synthetic */ rh1.b e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a1 a1Var, rh1.b bVar, l12.d<? super b> dVar) {
            super(2, dVar);
            this.d = a1Var;
            this.e = bVar;
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            return new b(this.d, this.e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
            return ((b) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            r.b(obj);
            a1 a1Var = this.d;
            if (a1Var != null) {
                cd.b.n(this.e, a1Var);
            }
            return f0.f36844a;
        }
    }

    /* loaded from: classes2.dex */
    public static final /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f14156a;

        static {
            int[] iArr = new int[ot0.c.values().length];
            try {
                iArr[ot0.c.NEGATIVE_BUTTON_CLICK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ot0.c.POSITIVE_BUTTON_CLICK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f14156a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/dyson/mobile/android/support/aichatbot/b;", "event", "Lh12/f0;", "<anonymous>", "(Lcom/dyson/mobile/android/support/aichatbot/b;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.home.HomeActivity$onCreate$4$1$3$1", f = "HomeActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class d extends n12.i implements Function2<com.dyson.mobile.android.support.aichatbot.b, l12.d<? super f0>, Object> {
        public /* synthetic */ Object d;
        public final /* synthetic */ q0 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(q0 q0Var, l12.d<? super d> dVar) {
            super(2, dVar);
            this.e = q0Var;
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            d dVar2 = new d(this.e, dVar);
            dVar2.d = obj;
            return dVar2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(com.dyson.mobile.android.support.aichatbot.b bVar, l12.d<? super f0> dVar) {
            return ((d) create(bVar, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            com.dyson.mobile.android.support.aichatbot.b bVar = (com.dyson.mobile.android.support.aichatbot.b) this.d;
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            r.b(obj);
            if (!(bVar instanceof b.a)) {
                ma.e.o();
                return null;
            }
            b.a aVar2 = (b.a) bVar;
            String str = aVar2.f16757a;
            String id2 = aVar2.f16758b.getId();
            q0 q0Var = this.e;
            q0Var.getClass();
            q0Var.g(new b.C0458b(str, id2, false), new vk0.e(21));
            return f0.f36844a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction;", com.salesforce.marketingcloud.push.g.f21676h, "Lh12/f0;", "<anonymous>", "(Lcom/dyson/mobile/android/machine/deeplink/DeeplinkAction;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.home.HomeActivity$onCreate$4$1$4$1", f = "HomeActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class e extends n12.i implements Function2<DeeplinkAction, l12.d<? super f0>, Object> {
        public /* synthetic */ Object d;

        public e(l12.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            e eVar = new e(dVar);
            eVar.d = obj;
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(DeeplinkAction deeplinkAction, l12.d<? super f0> dVar) {
            return ((e) create(deeplinkAction, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            DeeplinkAction deeplinkAction = (DeeplinkAction) this.d;
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            r.b(obj);
            HomeActivity homeActivity = HomeActivity.this;
            hj.e eVar = homeActivity.f14151n;
            if (eVar != null) {
                com.dyson.mobile.android.machine.deeplink.a.a(deeplinkAction, homeActivity, eVar);
                return f0.f36844a;
            }
            x12.r.i("trackingManager");
            throw null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class f extends p implements w12.a<f0> {
        public f(Object obj) {
            super(0, obj, HomeActivity.class, "onInboxClick", "onInboxClick()V", 0);
        }

        @Override // w12.a
        public final f0 invoke() {
            HomeActivity homeActivity = (HomeActivity) this.receiver;
            if (homeActivity.f14153p == null) {
                x12.r.i("coreCoordinator");
                throw null;
            }
            InboxActivity.f14242n.getClass();
            homeActivity.startActivity(new Intent(homeActivity, InboxActivity.class).setFlags(536870912));
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class g extends p implements Function1<String, f0> {
        public g(Object obj) {
            super(1, obj, com.dyson.mobile.android.home.i.class, "navigateToAiAssistant", "navigateToAiAssistant(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final f0 invoke(String str) {
            com.dyson.mobile.android.home.i iVar = (com.dyson.mobile.android.home.i) this.receiver;
            iVar.f14191p.a(new DeepLinkAction.OpenAiChatBot(str, null, null, 6, null));
            hj.e eVar = iVar.d;
            ij.f a13 = new mj.m("ai_assistant", m.b.WEB_VIEW, m.a.MACHINE_HOME, null, null, 24, null).a();
            e.a aVar = hj.e.f38312g;
            eVar.g(a13, null);
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class h extends p implements w12.a<f0> {
        public h(Object obj) {
            super(0, obj, HomeActivity.class, "onAddProductClick", "onAddProductClick()V", 0);
        }

        @Override // w12.a
        public final f0 invoke() {
            HomeActivity homeActivity = (HomeActivity) this.receiver;
            com.dyson.mobile.android.b bVar = homeActivity.f14153p;
            if (bVar != null) {
                bVar.y(homeActivity, false, null);
                return f0.f36844a;
            }
            x12.r.i("coreCoordinator");
            throw null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class i extends p implements Function1<z80.a, f0> {
        public i(Object obj) {
            super(1, obj, com.dyson.mobile.android.home.i.class, "handleNonSerialClickEvents", "handleNonSerialClickEvents(Lcom/dyson/mobile/android/home/nonserial/NonSerialClickEvents;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final f0 invoke(z80.a aVar) {
            z80.a aVar2 = aVar;
            aVar2.getClass();
            com.dyson.mobile.android.home.i iVar = (com.dyson.mobile.android.home.i) this.receiver;
            hj.e eVar = iVar.d;
            if (aVar2 instanceof a.b) {
                String str = ((a.b) aVar2).f92130a;
                g0.r(v.a(iVar), iVar.f14188m.c(), null, new l0(iVar, str, null), 2);
                eVar.g(new mj.a(a.b.NFC_ADD_CONFIRMATION, (a.EnumC1668a) null, (String) null, 6, (DefaultConstructorMarker) null).a(), com.dyson.mobile.android.home.i.U(str));
            } else if (!aVar2.equals(a.C2799a.f92129a)) {
                ma.e.o();
                return null;
            } else {
                iVar.Z(b.c.f92133a);
                ij.f a13 = new mj.b(b.a.NFC_ADD_CONFIRMATION).a();
                e.a aVar3 = hj.e.f38312g;
                eVar.g(a13, null);
            }
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class j extends p implements w12.a<f0> {
        public j(Object obj) {
            super(0, obj, HomeActivity.class, "openAppInPlayStore", "openAppInPlayStore()V", 0);
        }

        @Override // w12.a
        public final f0 invoke() {
            HomeActivity homeActivity = (HomeActivity) this.receiver;
            if (homeActivity.f14153p != null) {
                com.dyson.mobile.android.b.r(homeActivity);
                return f0.f36844a;
            }
            x12.r.i("coreCoordinator");
            throw null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class k extends p implements Function1<QuestionnaireStartInfo, f0> {
        public k(Object obj) {
            super(1, obj, HomeActivity.class, "showHaircareQuestionnaire", "showHaircareQuestionnaire(Lcom/dyson/mobile/android/usermanagement/profile/model/QuestionnaireStartInfo;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final f0 invoke(QuestionnaireStartInfo questionnaireStartInfo) {
            QuestionnaireStartInfo questionnaireStartInfo2 = questionnaireStartInfo;
            questionnaireStartInfo2.getClass();
            HomeActivity homeActivity = (HomeActivity) this.receiver;
            if (homeActivity.f14153p == null) {
                x12.r.i("coreCoordinator");
                throw null;
            }
            b.a aVar = com.dyson.mobile.android.b.A;
            ee1.e.f26806c.getClass();
            e.a.a(homeActivity);
            QuestionnaireActivity.a aVar2 = QuestionnaireActivity.f16965o;
            QuestionnaireActivityPayload questionnaireActivityPayload = new QuestionnaireActivityPayload(null, questionnaireStartInfo2, 1, null);
            aVar2.getClass();
            Intent intent = new Intent(homeActivity, QuestionnaireActivity.class);
            intent.putExtra("PAYLOAD", questionnaireActivityPayload);
            intent.putExtra("FINISH_ACTIVITY_ON_RESULT", true);
            homeActivity.startActivity(intent);
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class l extends p implements w12.a<f0> {
        public l(Object obj) {
            super(0, obj, HomeActivity.class, "onLogoutComplete", "onLogoutComplete()V", 0);
        }

        @Override // w12.a
        public final f0 invoke() {
            HomeActivity homeActivity = (HomeActivity) this.receiver;
            if (homeActivity.f14153p != null) {
                homeActivity.startActivity(com.dyson.mobile.android.b.h(homeActivity));
                return f0.f36844a;
            }
            x12.r.i("coreCoordinator");
            throw null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class m extends p implements w12.a<f0> {
        public m(Object obj) {
            super(0, obj, com.dyson.mobile.android.home.i.class, "dismissAppFeedbackSurveyDialog", "dismissAppFeedbackSurveyDialog()V", 0);
        }

        @Override // w12.a
        public final f0 invoke() {
            Object value;
            f2 f2Var = ((com.dyson.mobile.android.home.i) this.receiver).f14194s;
            do {
                value = f2Var.getValue();
            } while (!f2Var.f(value, i.c.a((i.c) value, null, null, null, null, i.c.a.C0462a.f14230a, 15)));
            return f0.f36844a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class n extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ f.g f14157f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(f.g gVar) {
            super(0);
            this.f14157f = gVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return this.f14157f.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class o extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f14158f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ f.g f14159g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(w12.a aVar, f.g gVar) {
            super(0);
            this.f14158f = aVar;
            this.f14159g = gVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f14158f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f14159g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Override // of1.c
    public final of1.b b0() {
        return this.f14154q;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
        if (r0 == androidx.compose.runtime.Composer.a.f3142b) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c1(y9.q0 r8, androidx.compose.runtime.Composer r9, int r10) {
        /*
            r7 = this;
            r0 = -973195982(0xffffffffc5fe3532, float:-8134.6494)
            androidx.compose.runtime.a r4 = r9.k(r0)
            boolean r9 = r4.D(r8)
            if (r9 == 0) goto Lf
            r9 = 4
            goto L10
        Lf:
            r9 = 2
        L10:
            r9 = r9 | r10
            boolean r0 = r4.D(r7)
            if (r0 == 0) goto L1a
            r0 = 32
            goto L1c
        L1a:
            r0 = 16
        L1c:
            r9 = r9 | r0
            r0 = r9 & 19
            r1 = 18
            r2 = 1
            if (r0 == r1) goto L26
            r0 = r2
            goto L27
        L26:
            r0 = 0
        L27:
            r9 = r9 & r2
            boolean r9 = r4.t(r9, r0)
            if (r9 == 0) goto L63
            u3.p1 r9 = androidx.compose.runtime.b.f3172a
            com.dyson.mobile.android.home.i r9 = r7.e1()
            c42.e r1 = r9.f14197v
            androidx.lifecycle.Lifecycle$State r2 = androidx.lifecycle.Lifecycle.State.CREATED
            boolean r9 = r4.D(r8)
            boolean r0 = r4.D(r7)
            r9 = r9 | r0
            java.lang.Object r0 = r4.B()
            if (r9 != 0) goto L50
            androidx.compose.runtime.Composer$a r9 = androidx.compose.runtime.Composer.f3140a
            r9.getClass()
            androidx.compose.runtime.Composer$a$a r9 = androidx.compose.runtime.Composer.a.f3142b
            if (r0 != r9) goto L59
        L50:
            com.dyson.mobile.android.home.HomeActivity$a r0 = new com.dyson.mobile.android.home.HomeActivity$a
            r9 = 0
            r0.<init>(r8, r7, r9)
            r4.u(r0)
        L59:
            r3 = r0
            kotlin.jvm.functions.Function2 r3 = (kotlin.jvm.functions.Function2) r3
            r5 = 48
            r6 = 0
            af1.b.a(r1, r2, r3, r4, r5, r6)
            goto L66
        L63:
            r4.J()
        L66:
            androidx.compose.runtime.f r9 = r4.c0()
            if (r9 == 0) goto L75
            uz.b r0 = new uz.b
            r1 = 19
            r0.<init>(r7, r8, r10, r1)
            r9.d = r0
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.home.HomeActivity.c1(y9.q0, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
        if (r2 == androidx.compose.runtime.Composer.a.f3142b) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d1(b90.a1 r7, androidx.compose.runtime.Composer r8, int r9) {
        /*
            r6 = this;
            r0 = 1391949248(0x52f775c0, float:5.3141622E11)
            androidx.compose.runtime.a r8 = r8.k(r0)
            boolean r0 = r8.Q(r7)
            r1 = 2
            r2 = 4
            if (r0 == 0) goto L11
            r0 = r2
            goto L12
        L11:
            r0 = r1
        L12:
            r0 = r0 | r9
            r3 = r0 & 3
            r4 = 0
            r5 = 1
            if (r3 == r1) goto L1b
            r1 = r5
            goto L1c
        L1b:
            r1 = r4
        L1c:
            r3 = r0 & 1
            boolean r1 = r8.t(r3, r1)
            if (r1 == 0) goto L52
            u3.p1 r1 = androidx.compose.runtime.b.f3172a
            rh1.a r1 = rh1.c.a(r8)
            r0 = r0 & 14
            if (r0 != r2) goto L2f
            r4 = r5
        L2f:
            boolean r0 = r8.Q(r1)
            r0 = r0 | r4
            java.lang.Object r2 = r8.B()
            if (r0 != 0) goto L43
            androidx.compose.runtime.Composer$a r0 = androidx.compose.runtime.Composer.f3140a
            r0.getClass()
            androidx.compose.runtime.Composer$a$a r0 = androidx.compose.runtime.Composer.a.f3142b
            if (r2 != r0) goto L4c
        L43:
            com.dyson.mobile.android.home.HomeActivity$b r2 = new com.dyson.mobile.android.home.HomeActivity$b
            r0 = 0
            r2.<init>(r7, r1, r0)
            r8.u(r2)
        L4c:
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            u3.m0.d(r8, r7, r2)
            goto L55
        L52:
            r8.J()
        L55:
            androidx.compose.runtime.f r8 = r8.c0()
            if (r8 == 0) goto L64
            uz.b r0 = new uz.b
            r1 = 17
            r0.<init>(r6, r7, r9, r1)
            r8.d = r0
        L64:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.home.HomeActivity.d1(b90.a1, androidx.compose.runtime.Composer, int):void");
    }

    public final com.dyson.mobile.android.home.i e1() {
        return (com.dyson.mobile.android.home.i) this.f14152o.getValue();
    }

    public final void f1(Intent intent) {
        DynamicContentDeepLink a13;
        eo0.a aVar = (eo0.a) c7.c.b(intent, "DEEP_LINK_INTENT", eo0.a.class);
        if (aVar != null) {
            com.dyson.mobile.android.home.i e13 = e1();
            eo0.b bVar = e13.e;
            hj.e eVar = e13.d;
            boolean z13 = aVar instanceof eo0.o;
            String str = null;
            if (z13) {
                eo0.o oVar = (eo0.o) aVar;
                ij.f a14 = new mj.t("", null, oVar.f28215g, oVar.d, 2, null).a();
                e.a aVar2 = hj.e.f38312g;
                eVar.g(a14, null);
            } else {
                if (aVar instanceof eo0.r) {
                    eo0.r rVar = (eo0.r) aVar;
                    String str2 = rVar.d;
                    if (str2 == null) {
                        str2 = "";
                    }
                    String str3 = rVar.e;
                    String str4 = rVar.f28218g;
                    if (str4 == null) {
                        str4 = "";
                    }
                    String str5 = rVar.f28220i;
                    ij.f a15 = new mj.t(str2, str3, str4, str5 != null ? str5 : "").a();
                    e.a aVar3 = hj.e.f38312g;
                    eVar.g(a15, null);
                } else if (aVar instanceof eo0.g) {
                    String reason = ((eo0.g) aVar).getType().getReason();
                    String p13 = aVar.p();
                    ij.f a16 = new mj.t("", null, reason, p13 == null ? "" : p13, 2, null).a();
                    e.a aVar4 = hj.e.f38312g;
                    eVar.g(a16, null);
                }
            }
            if (aVar instanceof AppLinkIntent) {
                uj.g gVar = uj.g.f82158a;
                Uri uri = ((AppLinkIntent) aVar).d;
                gVar.getClass();
                if (uj.g.d(uri)) {
                    g0.r(v.a(e13), null, null, new i0(e13, uri, null), 3);
                } else {
                    e13.T(new i.a.C0461a(uri));
                }
            } else if (z13) {
                eo0.o oVar2 = (eo0.o) aVar;
                String str6 = oVar2.f28214f;
                if (str6 != null && (a13 = e13.f14193r.a(str6)) != null) {
                    DynamicContentDeepLink.f0 f0Var = a13 instanceof DynamicContentDeepLink.f0 ? (DynamicContentDeepLink.f0) a13 : null;
                    if (f0Var != null) {
                        str = f0Var.f14035b;
                    }
                }
                if (oVar2.f28216h || str != null) {
                    e13.T(new i.a.d(oVar2.d, str));
                }
                bVar.a(aVar);
            } else {
                bVar.a(aVar);
            }
            intent.removeExtra("DEEP_LINK_INTENT");
            setIntent(intent);
        }
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        q valueOf;
        if (cd.b.J(this)) {
            super.onCreate(null);
            return;
        }
        com.dyson.mobile.android.b.A.getClass();
        com.dyson.mobile.android.b a13 = b.a.a();
        e80.b bVar = (e80.b) a13.f();
        f80.f fVar = bVar.f26210a;
        hj.e eVar = bVar.f26218f.get();
        eo0.b c13 = bVar.c();
        no0.h h13 = bVar.h();
        fVar.getClass();
        q51.a aVar = new q51.a(bVar.d(), bVar.f26242s.get());
        le1.a aVar2 = bVar.f26229k0.get();
        DysonApplication dysonApplication = bVar.e.get();
        fVar.getClass();
        no0.a aVar3 = new no0.a(bVar.f26231l0.get(), bVar.f26233m0.get());
        fVar.getClass();
        n.a aVar4 = e71.n.f26183r;
        aVar4.getClass();
        n81.b bVar2 = n.a.a().f26190g;
        if (bVar2 == null) {
            x12.r.i("marketInformationRepository");
            throw null;
        }
        xd0.c cVar = new xd0.c(dysonApplication, aVar3, bVar2, new se1.e());
        t1 t1Var = bVar.f26212b;
        v90.e eVar2 = new v90.e(new no0.i(bVar.c()));
        fVar.getClass();
        q51.a aVar5 = new q51.a(bVar.d(), bVar.f26242s.get());
        af1.h hVar = new af1.h();
        t1Var.getClass();
        on0.a aVar6 = new on0.a(eVar2, aVar5, hVar);
        ph.e d13 = bVar.d();
        aVar4.getClass();
        g71.a a14 = n.a.a().a();
        d91.b bVar3 = bVar.Q.get();
        af1.h hVar2 = new af1.h();
        yi0.f f13 = bVar.f();
        o30.a aVar7 = (o30.a) new j90.h(bVar.f26232m.get()).a(o30.a.class);
        xy1.h.b(aVar7);
        s sVar = new s(new n30.n(aVar7, bVar.f26242s.get(), new af1.h()), bVar.f());
        eo0.n nVar = new eo0.k(bVar.e.get()).f28207a;
        if (nVar == null) {
            x12.r.i("notificationManager");
            throw null;
        }
        aVar4.getClass();
        com.dyson.mobile.android.support.deeplink.c cVar2 = n.a.a().f26196m;
        xy1.h.b(cVar2);
        w71.a a15 = y.a(fVar);
        g80.a.f33730c.getClass();
        h80.c cVar3 = a.C1057a.a().f33731a;
        xy1.h.b(cVar3);
        this.f14147j = new i.b(eVar, c13, h13, aVar, aVar2, cVar, aVar6, d13, a14, bVar3, hVar2, f13, sVar, nVar, cVar2, a15, cVar3);
        q1 q1Var = bVar.f26214c;
        fVar.getClass();
        bk0.f i13 = new uf0.l(bVar.e.get()).i();
        fVar.getClass();
        uf0.k kVar = new uf0.k(new y70.f(bVar.e.get().getApplicationContext(), "machineOptions"));
        fVar.getClass();
        vj.s sVar2 = new vj.s(new y70.f(bVar.e.get().getApplicationContext(), "Machine571Options"));
        yd0.f fVar2 = new yd0.f(bVar.e.get());
        fVar.getClass();
        oj.c cVar4 = new oj.c(new y70.f(bVar.e.get().getApplicationContext(), "appConfigOptions"));
        w90.j jVar = bVar.f26235n0.get();
        q1Var.getClass();
        jVar.getClass();
        this.f14148k = new defpackage.a(i13, kVar, sVar2, fVar2, cVar4, jVar);
        aVar4.getClass();
        f71.b bVar4 = n.a.a().f26198o;
        xy1.h.b(bVar4);
        this.f14149l = bVar4;
        this.f14150m = bVar.f26237o0.get();
        this.f14151n = bVar.f26218f.get();
        this.f14153p = a13;
        super.onCreate(bundle);
        e1().X(getIntent().getBooleanExtra("EXTRA_NAVIGATE_TO_LAST_VISITED_MACHINE", false), getIntent().getBooleanExtra("EXTRA_SHOULD_SHOW_REMOVE_PRODUCT_BANNER", false), getIntent().getBooleanExtra("EXTRA_SHOULD_SHOW_ADD_DEVICE_BANNER", false));
        String stringExtra = getIntent().getStringExtra("NON_SERIAL_REGISTRATION_STATE");
        if (stringExtra != null && (valueOf = q.valueOf(stringExtra)) != null) {
            com.dyson.mobile.android.home.i e13 = e1();
            int i14 = i.d.f14233a[valueOf.ordinal()];
            if (i14 == 1) {
                e13.Z(b.a.f92131a);
            } else if (i14 != 2) {
                ma.e.o();
                return;
            } else {
                e13.Z(b.C2800b.f92132a);
            }
        }
        x.e.getClass();
        f.j.a(this, x.a.a(0), x.a.a(0));
        g.f.a(this, new c4.c(142903488, true, new w80.i(this, 0)));
    }

    @Override // f.g, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        setIntent(intent);
        f1(intent);
    }

    @Override // l.b, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        Intent intent = getIntent();
        intent.getClass();
        f1(intent);
        Intent intent2 = getIntent();
        intent2.getClass();
        if (x12.r.c(intent2.getAction(), "com.dyson.mobile.android.ACTION_APP_SHORTCUT")) {
            String stringExtra = intent2.getStringExtra("APP_SHORTCUT_ID");
            if (stringExtra == null) {
                stringExtra = "";
            }
            int intExtra = intent2.getIntExtra("APP_SHORTCUT_RANK", 0);
            String stringExtra2 = intent2.getStringExtra("EXTRA_MACHINE_SERIAL");
            com.dyson.mobile.android.home.i e13 = e1();
            a.b.f52139a.getClass();
            Map<ij.d, String> f13 = i12.q0.f(new h12.p(a.b.f52141c, stringExtra), new h12.p(a.b.f52140b, String.valueOf(intExtra)));
            hj.e eVar = e13.d;
            int i13 = w3.f57761a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            a.m.f52170a.getClass();
            linkedHashMap.put(a.m.f52171b, "app_control");
            linkedHashMap.put(a.m.f52172c, "android_app_shortcut");
            linkedHashMap.put(a.m.d, "activated");
            eVar.f(new ij.a("app_control", "android_app_shortcut", "activated", null, linkedHashMap), f13);
            e13.f14189n.d(stringExtra2);
        }
    }
}
