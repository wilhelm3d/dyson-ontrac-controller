package com.dyson.mobile.android.connectedhome.matter;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.dyson.mobile.android.connectedhome.matter.d;
import com.dyson.mobile.android.connectedhome.matter.e;
import com.dyson.mobile.android.connectedhome.voicecontrol.VoiceControlActivity;
import com.dyson.mobile.android.connectedhome.voicecontrol.newsystem.VoiceControlOptionsNdsActivity;
import f.j;
import f.x;
import fm1.o0;
import h12.f0;
import h12.r;
import hj.e;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.v;
import mj.z;
import n12.i;
import qz.a;
import se1.t;
import we1.a;
import x12.p;
import x12.p0;
import z32.d2;
import z32.g0;
import z32.m1;
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/matter/SmartHomeControlActivity;", "Lf/g;", "<init>", "()V", "a", "Lcom/dyson/mobile/android/connectedhome/matter/f;", "smartHomeControlViewState", "Lcom/dyson/mobile/android/connectedhome/matter/a;", "shareMatterCodeBottomSheetViewState", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SmartHomeControlActivity extends f.g {

    /* renamed from: m  reason: collision with root package name */
    public static final a f12946m = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public l00.d f12947j;

    /* renamed from: k  reason: collision with root package name */
    public e.c f12948k;

    /* renamed from: l  reason: collision with root package name */
    public final d0 f12949l = new d0(p0.f86717a.b(com.dyson.mobile.android.connectedhome.matter.e.class), new d(this), new oz.a(this, 0), new e(null, this));

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/matter/d;", com.salesforce.marketingcloud.push.g.f21676h, "Lh12/f0;", "<anonymous>", "(Lcom/dyson/mobile/android/connectedhome/matter/d;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.connectedhome.matter.SmartHomeControlActivity$onCreate$1$1$1", f = "SmartHomeControlActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class b extends i implements Function2<com.dyson.mobile.android.connectedhome.matter.d, l12.d<? super f0>, Object> {
        public /* synthetic */ Object d;

        public b(l12.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.d = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(com.dyson.mobile.android.connectedhome.matter.d dVar, l12.d<? super f0> dVar2) {
            return ((b) create(dVar, dVar2)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            Intent putExtra;
            com.dyson.mobile.android.connectedhome.matter.d dVar = (com.dyson.mobile.android.connectedhome.matter.d) this.d;
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            r.b(obj);
            boolean z13 = dVar instanceof d.b;
            SmartHomeControlActivity smartHomeControlActivity = SmartHomeControlActivity.this;
            if (z13) {
                t tVar = t.f76065a;
                String str = ((d.b) dVar).f12971a;
                tVar.getClass();
                t.a(smartHomeControlActivity, str);
            } else if (!(dVar instanceof d.a)) {
                ma.e.o();
                return null;
            } else {
                l00.d dVar2 = smartHomeControlActivity.f12947j;
                if (dVar2 == null) {
                    x12.r.i("voiceControlNdsOption");
                    throw null;
                }
                if (dVar2.a()) {
                    VoiceControlOptionsNdsActivity.f13194p.getClass();
                    putExtra = VoiceControlOptionsNdsActivity.a.a(smartHomeControlActivity, "SCREEN_ALEXA");
                } else {
                    VoiceControlActivity.f12992q.getClass();
                    putExtra = new Intent(smartHomeControlActivity, VoiceControlActivity.class).putExtra("EXTRA_STARTING_SCREEN", "SCREEN_ALEXA");
                    putExtra.getClass();
                }
                smartHomeControlActivity.startActivity(putExtra);
            }
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class c extends p implements Function1<oz.d, f0> {
        public c(Object obj) {
            super(1, obj, com.dyson.mobile.android.connectedhome.matter.e.class, "onListItemClicked", "onListItemClicked(Lcom/dyson/mobile/android/connectedhome/matter/SmartHomeControlListItemType;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final f0 invoke(oz.d dVar) {
            z.a aVar;
            oz.d dVar2 = dVar;
            dVar2.getClass();
            com.dyson.mobile.android.connectedhome.matter.e eVar = (com.dyson.mobile.android.connectedhome.matter.e) this.receiver;
            eVar.getClass();
            hj.e eVar2 = eVar.f12974h;
            eVar.f12975i.getClass();
            int i13 = a.C2041a.f68091a[dVar2.ordinal()];
            if (i13 == 1) {
                aVar = z.a.GOOGLE_HOME;
            } else if (i13 == 2) {
                aVar = z.a.AMAZON_ALEXA;
            } else if (i13 != 3) {
                ma.e.o();
                return null;
            } else {
                aVar = z.a.SHARE_MATTER_CODE;
            }
            z zVar = new z(aVar);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.putAll(i12.p0.c(new h12.p("item_name", zVar.f54250a.getValue())));
            ij.f fVar = new ij.f("smart_home_control_item_click", linkedHashMap);
            e.a aVar2 = hj.e.f38312g;
            eVar2.g(fVar, null);
            if (dVar2 == oz.d.AMAZON_ALEXA) {
                g0.r(v.a(eVar), null, null, new oz.f(eVar, d.a.f12970a, null), 3);
            } else {
                d2 d2Var = eVar.f12982p;
                if (d2Var != null) {
                    m1.a aVar3 = m1.f91486a1;
                    d2Var.c(null);
                }
                eVar.f12982p = g0.r(v.a(eVar), null, null, new oz.g(eVar, dVar2, null), 3);
            }
            return f0.f36844a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class d extends x12.t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ f.g f12950f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(f.g gVar) {
            super(0);
            this.f12950f = gVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return this.f12950f.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class e extends x12.t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f12951f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ f.g f12952g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(w12.a aVar, f.g gVar) {
            super(0);
            this.f12951f = aVar;
            this.f12952g = gVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f12951f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f12952g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public final com.dyson.mobile.android.connectedhome.matter.e Y0() {
        return (com.dyson.mobile.android.connectedhome.matter.e) this.f12949l.getValue();
    }

    @Override // f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        x.e.getClass();
        j.a(this, x.a.a(0), x.a.a(0));
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Please use the newInstance method";
        String y13 = o0.y("COORDINATOR_ID", a13.a("COORDINATOR_ID"));
        lz.a.f52817a.getClass();
        o11.a aVar = lz.a.f52818b;
        if (aVar == null) {
            x12.r.i("factoryProvider");
            throw null;
        }
        ((lz.b) aVar.invoke(this, y13)).b().a(this);
        super.onCreate(bundle);
        if (cd.b.J(this)) {
            return;
        }
        getLifecycle().a(Y0());
        g.f.a(this, new c4.c(-1835440660, true, new oz.b(this, 0)));
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        getLifecycle().c(Y0());
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/matter/SmartHomeControlActivity$a;", "", "<init>", "()V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
