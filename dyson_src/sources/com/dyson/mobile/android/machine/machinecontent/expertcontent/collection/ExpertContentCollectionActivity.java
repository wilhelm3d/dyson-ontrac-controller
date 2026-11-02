package com.dyson.mobile.android.machine.machinecontent.expertcontent.collection;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.machine.machinecontent.expertcontent.collection.a;
import f.g;
import f.j;
import f.x;
import fm1.o0;
import h12.h;
import hj.e;
import java.util.LinkedHashMap;
import ji0.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lj.a;
import m9.p;
import nj.j7;
import we1.a;
import x12.m;
import x12.p0;
import x12.r;
import x12.t;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/collection/ExpertContentCollectionActivity;", "Lf/g;", "<init>", "()V", "a", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ExpertContentCollectionActivity extends g {

    /* renamed from: o  reason: collision with root package name */
    public static final a f15150o = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public String f15151j;

    /* renamed from: k  reason: collision with root package name */
    public hj.e f15152k;

    /* renamed from: l  reason: collision with root package name */
    public uf0.g f15153l;

    /* renamed from: m  reason: collision with root package name */
    public a.b f15154m;

    /* renamed from: n  reason: collision with root package name */
    public final d0 f15155n = new d0(p0.f86717a.b(com.dyson.mobile.android.machine.machinecontent.expertcontent.collection.a.class), new e(this), new d(c.d, this, new li0.a(this, 0)), new f(null, this));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b implements p, m {
        public final /* synthetic */ Function1 d;

        public b(Function1 function1) {
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
    /* loaded from: classes3.dex */
    public static final class c implements w12.a<Bundle> {
        public static final c d = new c();

        @Override // w12.a
        public final /* bridge */ /* synthetic */ Bundle invoke() {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d implements w12.a<ViewModelProvider.Factory> {
        public final /* synthetic */ w12.a d;
        public final /* synthetic */ g e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Function1 f15156f;

        public d(w12.a aVar, g gVar, Function1 function1) {
            this.d = aVar;
            this.e = gVar;
            this.f15156f = function1;
        }

        @Override // w12.a
        public final ViewModelProvider.Factory invoke() {
            Bundle bundle = (Bundle) this.d.invoke();
            g gVar = this.e;
            if (bundle == null) {
                Intent intent = gVar.getIntent();
                bundle = intent != null ? intent.getExtras() : null;
            }
            return ef1.d.a(gVar, bundle, this.f15156f);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class e extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ g f15157f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(g gVar) {
            super(0);
            this.f15157f = gVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return this.f15157f.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class f extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f15158f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ g f15159g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(w12.a aVar, g gVar) {
            super(0);
            this.f15158f = aVar;
            this.f15159g = gVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f15158f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f15159g.getDefaultViewModelCreationExtras() : creationExtras;
        }
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
        this.f15151j = o0.y("machineSerial", a13.a("machineSerial", "expertContentCollectionId"));
        uf0.g a14 = uf0.g.a(this);
        if (a14 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        this.f15153l = a14;
        sg0.b bVar = a14.f81922a;
        this.f15154m = (a.b) bVar.f76127v0.f88315a;
        tg0.j jVar = bVar.f76088b;
        bk0.f fVar = bVar.C.get();
        jVar.getClass();
        fVar.getClass();
        vf0.a aVar = new vf0.a(fVar);
        String str = this.f15151j;
        if (str == null) {
            r.i("machineSerial");
            throw null;
        }
        this.f15152k = aVar.a(str);
        super.onCreate(bundle);
        if (cd.b.J(this)) {
            return;
        }
        overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
        d0 d0Var = this.f15155n;
        ((com.dyson.mobile.android.machine.machinecontent.expertcontent.collection.a) d0Var.getValue()).f15165j.observe(this, new b(new li0.a(this, 1)));
        ((com.dyson.mobile.android.machine.machinecontent.expertcontent.collection.a) d0Var.getValue()).f15164i.observe(this, new b(new li0.a(this, 2)));
        g.f.a(this, new c4.c(-286137133, true, new li0.b(this, 0)));
    }

    @Override // android.app.Activity
    public final void onResume() {
        super.onResume();
        String stringExtra = getIntent().getStringExtra("expertContentCollectionId");
        if (stringExtra != null) {
            hj.e eVar = this.f15152k;
            if (eVar == null) {
                r.i("trackingManager");
                throw null;
            }
            int i13 = j7.f57545a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            a.h.f52154a.getClass();
            ij.b e13 = ma.e.e(linkedHashMap, a.h.f52155b, stringExtra, "machine.expert_content.collection", linkedHashMap);
            e.a aVar = hj.e.f38312g;
            eVar.h(e13, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/collection/ExpertContentCollectionActivity$a;", "", "<init>", "()V", "", "MACHINE_SERIAL_EXTRA", "Ljava/lang/String;", "EXPERT_CONTENT_COLLECTION_ID_EXTRA", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static Intent a(Context context, String str, a.C1436a c1436a) {
            context.getClass();
            str.getClass();
            c1436a.getClass();
            Intent intent = new Intent(context, ExpertContentCollectionActivity.class);
            intent.putExtra("machineSerial", str);
            intent.putExtra("expertContentCollectionId", c1436a.f45135a);
            return intent;
        }

        private a() {
        }
    }
}
