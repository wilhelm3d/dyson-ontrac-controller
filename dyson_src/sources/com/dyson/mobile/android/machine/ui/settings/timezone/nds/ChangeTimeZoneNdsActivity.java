package com.dyson.mobile.android.machine.ui.settings.timezone.nds;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.dyson.mobile.android.machine.ui.settings.timezone.nds.a;
import f.x;
import h12.f0;
import h12.r;
import hj.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nj.d1;
import v32.y;
import we1.a;
import x12.p;
import x12.p0;
import x12.t;
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\n²\u0006\u0012\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/settings/timezone/nds/ChangeTimeZoneNdsActivity;", "Lf/g;", "<init>", "()V", "a", "ActivityInput", "b", "Lnl0/h;", "Lvm0/h;", "uiState", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ChangeTimeZoneNdsActivity extends f.g {

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ int f15523l = 0;

    /* renamed from: j  reason: collision with root package name */
    public a.c f15524j;

    /* renamed from: k  reason: collision with root package name */
    public final d0 f15525k = new d0(p0.f86717a.b(com.dyson.mobile.android.machine.ui.settings.timezone.nds.a.class), new l(this), new k(j.d, this, new v42.f(this, 12)), new m(null, this));

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/settings/timezone/nds/ChangeTimeZoneNdsActivity$ActivityInput;", "Landroid/os/Parcelable;", "", "machineSerial", "<init>", "(Ljava/lang/String;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class ActivityInput implements Parcelable {
        public static final Parcelable.Creator<ActivityInput> CREATOR = new a();
        public final String d;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator<ActivityInput> {
            @Override // android.os.Parcelable.Creator
            public final ActivityInput createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ActivityInput(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ActivityInput[] newArray(int i13) {
                return new ActivityInput[i13];
            }
        }

        public ActivityInput(String str) {
            str.getClass();
            this.d = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActivityInput) && this.d.equals(((ActivityInput) obj).d);
        }

        public final int hashCode() {
            return this.d.hashCode();
        }

        public final String toString() {
            return bv1.f.e("ActivityInput(machineSerial=", this.d, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/settings/timezone/nds/ChangeTimeZoneNdsActivity$a;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/dyson/mobile/android/machine/ui/settings/timezone/nds/ChangeTimeZoneNdsActivity$ActivityInput;", "", "<init>", "()V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends ActivityResultContract<ActivityInput, String> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Intent a(Context context, ActivityInput activityInput) {
            ActivityInput activityInput2 = activityInput;
            context.getClass();
            activityInput2.getClass();
            Intent intent = new Intent(context, ChangeTimeZoneNdsActivity.class);
            intent.putExtra("ACTIVITY_ARGS", activityInput2);
            return intent;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final String c(int i13, Intent intent) {
            Bundle bundleExtra;
            String string;
            return (intent == null || (bundleExtra = intent.getBundleExtra("ACTIVITY_RESULT")) == null || (string = bundleExtra.getString("UPDATED_TIME_ZONE")) == null) ? "" : string;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvm0/e;", "event", "Lh12/f0;", "<anonymous>", "(Lvm0/e;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.machine.ui.settings.timezone.nds.ChangeTimeZoneNdsActivity$onCreate$2$1$1$1", f = "ChangeTimeZoneNdsActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    /* loaded from: classes3.dex */
    public static final class c extends n12.i implements Function2<vm0.e, l12.d<? super f0>, Object> {
        public /* synthetic */ String d;

        public c(l12.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            c cVar = new c(dVar);
            cVar.d = ((vm0.e) obj).f84633a;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vm0.e eVar, l12.d<? super f0> dVar) {
            return ((c) create(vm0.e.a(eVar.f84633a), dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            String str = this.d;
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            r.b(obj);
            Intent intent = new Intent();
            Bundle bundle = new Bundle();
            bundle.putString("UPDATED_TIME_ZONE", str);
            f0 f0Var = f0.f36844a;
            intent.putExtra("ACTIVITY_RESULT", bundle);
            ChangeTimeZoneNdsActivity changeTimeZoneNdsActivity = ChangeTimeZoneNdsActivity.this;
            changeTimeZoneNdsActivity.setResult(-1, intent);
            changeTimeZoneNdsActivity.finish();
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class d extends p implements Function1<String, f0> {
        public d(Object obj) {
            super(1, obj, com.dyson.mobile.android.machine.ui.settings.timezone.nds.a.class, "onFilterTimeZone", "onFilterTimeZone$mod_machine(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final f0 invoke(String str) {
            String str2 = str;
            str2.getClass();
            com.dyson.mobile.android.machine.ui.settings.timezone.nds.a aVar = (com.dyson.mobile.android.machine.ui.settings.timezone.nds.a) this.receiver;
            aVar.getClass();
            aVar.f15539o.setValue(y.U(str2).toString());
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class e extends p implements Function1<vm0.l, f0> {
        public e(Object obj) {
            super(1, obj, com.dyson.mobile.android.machine.ui.settings.timezone.nds.a.class, "onTimeZoneSelected", "onTimeZoneSelected$mod_machine(Lcom/dyson/mobile/android/machine/ui/settings/timezone/nds/TimezoneListItem;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final f0 invoke(vm0.l lVar) {
            vm0.l lVar2 = lVar;
            lVar2.getClass();
            com.dyson.mobile.android.machine.ui.settings.timezone.nds.a aVar = (com.dyson.mobile.android.machine.ui.settings.timezone.nds.a) this.receiver;
            aVar.getClass();
            aVar.f15538n.l(null, lVar2);
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class f extends p implements w12.a<f0> {
        public f(Object obj) {
            super(0, obj, com.dyson.mobile.android.machine.ui.settings.timezone.nds.a.class, "saveTimeZone", "saveTimeZone$mod_machine()V", 0);
        }

        @Override // w12.a
        public final f0 invoke() {
            ((com.dyson.mobile.android.machine.ui.settings.timezone.nds.a) this.receiver).T();
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class g extends p implements w12.a<f0> {
        public g(Object obj) {
            super(0, obj, ChangeTimeZoneNdsActivity.class, "finish", "finish()V", 0);
        }

        @Override // w12.a
        public final f0 invoke() {
            ((ChangeTimeZoneNdsActivity) this.receiver).finish();
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class h extends p implements w12.a<f0> {
        public h(Object obj) {
            super(0, obj, com.dyson.mobile.android.machine.ui.settings.timezone.nds.a.class, "onRetry", "onRetry$mod_machine()V", 0);
        }

        @Override // w12.a
        public final f0 invoke() {
            ((com.dyson.mobile.android.machine.ui.settings.timezone.nds.a) this.receiver).T();
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class i extends p implements w12.a<f0> {
        public i(Object obj) {
            super(0, obj, com.dyson.mobile.android.machine.ui.settings.timezone.nds.a.class, "trackScreenEvent", "trackScreenEvent$mod_machine()V", 0);
        }

        @Override // w12.a
        public final f0 invoke() {
            hj.e eVar = ((com.dyson.mobile.android.machine.ui.settings.timezone.nds.a) this.receiver).f15532h;
            int i13 = d1.f57442a;
            ij.b bVar = new ij.b("common.settings.time_zone", null, 2, null);
            e.a aVar = hj.e.f38312g;
            eVar.h(bVar, null);
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class j implements w12.a<Bundle> {
        public static final j d = new j();

        @Override // w12.a
        public final /* bridge */ /* synthetic */ Bundle invoke() {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class k implements w12.a<ViewModelProvider.Factory> {
        public final /* synthetic */ w12.a d;
        public final /* synthetic */ f.g e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Function1 f15526f;

        public k(w12.a aVar, f.g gVar, Function1 function1) {
            this.d = aVar;
            this.e = gVar;
            this.f15526f = function1;
        }

        @Override // w12.a
        public final ViewModelProvider.Factory invoke() {
            Bundle bundle = (Bundle) this.d.invoke();
            f.g gVar = this.e;
            if (bundle == null) {
                Intent intent = gVar.getIntent();
                bundle = intent != null ? intent.getExtras() : null;
            }
            return ef1.d.a(gVar, bundle, this.f15526f);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class l extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ f.g f15527f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(f.g gVar) {
            super(0);
            this.f15527f = gVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return this.f15527f.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class m extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f15528f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ f.g f15529g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(w12.a aVar, f.g gVar) {
            super(0);
            this.f15528f = aVar;
            this.f15529g = gVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f15528f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f15529g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    static {
        new b(null);
    }

    public final com.dyson.mobile.android.machine.ui.settings.timezone.nds.a Y0() {
        return (com.dyson.mobile.android.machine.ui.settings.timezone.nds.a) this.f15525k.getValue();
    }

    @Override // f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Please use the ActivityLauncherContract";
        a13.a("ACTIVITY_ARGS");
        uf0.g a14 = uf0.g.a(this);
        if (a14 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        this.f15524j = (a.c) a14.f81922a.f76135z0.f88315a;
        x.e.getClass();
        f.j.a(this, x.a.a(0), x.a.a(0));
        g.f.a(this, new c4.c(1663950905, true, new vm0.b(this, 0)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/settings/timezone/nds/ChangeTimeZoneNdsActivity$b;", "", "<init>", "()V", "", "ACTIVITY_ARGS", "Ljava/lang/String;", "UPDATED_TIME_ZONE", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }
}
