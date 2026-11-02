package com.dyson.mobile.android.interactableec.home.n829.machinename;

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
import com.dyson.mobile.android.interactableec.home.n829.machinename.a;
import com.dyson.mobile.android.interactableec.home.n829.machinename.b;
import com.dyson.mobile.android.machine.ui.settings.name.MachineNamingExtras;
import h12.f0;
import h12.r;
import hj.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nj.e5;
import w90.g;
import we1.a;
import x12.p;
import x12.p0;
import x12.t;
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\f²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002²\u0006\u0010\u0010\u000b\u001a\u0004\u0018\u00010\n8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/dyson/mobile/android/interactableec/home/n829/machinename/MachineNameChangeActivity;", "Lf/g;", "<init>", "()V", "a", "ActivityInput", "b", "c", "Lcom/dyson/mobile/android/interactableec/home/n829/machinename/f;", "saveState", "Lvl0/o;", "nameSelectionViewModel", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MachineNameChangeActivity extends f.g {

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ int f14504l = 0;

    /* renamed from: j  reason: collision with root package name */
    public b.a f14505j;

    /* renamed from: k  reason: collision with root package name */
    public final d0 f14506k = new d0(p0.f86717a.b(com.dyson.mobile.android.interactableec.home.n829.machinename.b.class), new i(this), new h(g.d, this, new v42.f(this, 20)), new j(null, this));

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/interactableec/home/n829/machinename/MachineNameChangeActivity$ActivityInput;", "Landroid/os/Parcelable;", "", "coordinatorId", "Lcom/dyson/mobile/android/machine/ui/settings/name/MachineNamingExtras$PersistName;", "machineNameExtras", "machineName", "<init>", "(Ljava/lang/String;Lcom/dyson/mobile/android/machine/ui/settings/name/MachineNamingExtras$PersistName;Ljava/lang/String;)V", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class ActivityInput implements Parcelable {
        public static final Parcelable.Creator<ActivityInput> CREATOR;
        public final String d;
        public final MachineNamingExtras.PersistName e;

        /* renamed from: f  reason: collision with root package name */
        public final String f14507f;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class a implements Parcelable.Creator<ActivityInput> {
            @Override // android.os.Parcelable.Creator
            public final ActivityInput createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ActivityInput(parcel.readString(), (MachineNamingExtras.PersistName) parcel.readParcelable(ActivityInput.class.getClassLoader()), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final ActivityInput[] newArray(int i13) {
                return new ActivityInput[i13];
            }
        }

        static {
            Parcelable.Creator<MachineNamingExtras.PersistName> creator = MachineNamingExtras.PersistName.CREATOR;
            CREATOR = new a();
        }

        public ActivityInput(String str, MachineNamingExtras.PersistName persistName, String str2) {
            str.getClass();
            persistName.getClass();
            str2.getClass();
            this.d = str;
            this.e = persistName;
            this.f14507f = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ActivityInput) {
                ActivityInput activityInput = (ActivityInput) obj;
                return this.d.equals(activityInput.d) && this.e.equals(activityInput.e) && this.f14507f.equals(activityInput.f14507f);
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = this.e.hashCode();
            return this.f14507f.hashCode() + ((hashCode + (this.d.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ActivityInput(coordinatorId=");
            sb2.append(this.d);
            sb2.append(", machineNameExtras=");
            sb2.append(this.e);
            sb2.append(", machineName=");
            return ie.a.h(sb2, this.f14507f, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeString(this.d);
            parcel.writeParcelable(this.e, i13);
            parcel.writeString(this.f14507f);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/interactableec/home/n829/machinename/MachineNameChangeActivity$a;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/dyson/mobile/android/interactableec/home/n829/machinename/MachineNameChangeActivity$ActivityInput;", "Lcom/dyson/mobile/android/interactableec/home/n829/machinename/MachineNameChangeActivity$b;", "<init>", "()V", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a extends ActivityResultContract<ActivityInput, b> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Intent a(Context context, ActivityInput activityInput) {
            ActivityInput activityInput2 = activityInput;
            context.getClass();
            activityInput2.getClass();
            Intent intent = new Intent(context, MachineNameChangeActivity.class);
            intent.putExtra("ACTIVITY_ARGS", activityInput2);
            return intent;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final b c(int i13, Intent intent) {
            Bundle extras;
            Bundle extras2;
            String string = (intent == null || (extras2 = intent.getExtras()) == null) ? null : extras2.getString("NEW_MACHINE_NAME");
            boolean z13 = false;
            if (intent != null && (extras = intent.getExtras()) != null) {
                z13 = extras.getBoolean("SHOW_CUSTOM_NAME_UPDATED_POPOVER", false);
            }
            if (string == null) {
                string = "";
            }
            return new b(string, z13);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/dyson/mobile/android/interactableec/home/n829/machinename/a;", "event", "Lh12/f0;", "<anonymous>", "(Lcom/dyson/mobile/android/interactableec/home/n829/machinename/a;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.interactableec.home.n829.machinename.MachineNameChangeActivity$onCreate$1$1$1$1", f = "MachineNameChangeActivity.kt", l = {}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class d extends n12.i implements Function2<com.dyson.mobile.android.interactableec.home.n829.machinename.a, l12.d<? super f0>, Object> {
        public /* synthetic */ Object d;

        public d(l12.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            d dVar2 = new d(dVar);
            dVar2.d = obj;
            return dVar2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(com.dyson.mobile.android.interactableec.home.n829.machinename.a aVar, l12.d<? super f0> dVar) {
            return ((d) create(aVar, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            com.dyson.mobile.android.interactableec.home.n829.machinename.a aVar = (com.dyson.mobile.android.interactableec.home.n829.machinename.a) this.d;
            m12.a aVar2 = m12.a.COROUTINE_SUSPENDED;
            r.b(obj);
            boolean z13 = aVar instanceof a.b;
            MachineNameChangeActivity machineNameChangeActivity = MachineNameChangeActivity.this;
            if (z13) {
                Intent intent = new Intent();
                a.b bVar = (a.b) aVar;
                intent.putExtra("NEW_MACHINE_NAME", bVar.f14515a);
                intent.putExtra("SHOW_CUSTOM_NAME_UPDATED_POPOVER", bVar.f14516b);
                f0 f0Var = f0.f36844a;
                machineNameChangeActivity.setResult(-1, intent);
                machineNameChangeActivity.finish();
            } else if (!(aVar instanceof a.C0473a)) {
                ma.e.o();
                return null;
            } else {
                machineNameChangeActivity.finish();
            }
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class e extends p implements w12.a<f0> {
        public e(Object obj) {
            super(0, obj, com.dyson.mobile.android.interactableec.home.n829.machinename.b.class, "onSaveErrorRetry", "onSaveErrorRetry()V", 0);
        }

        @Override // w12.a
        public final f0 invoke() {
            com.dyson.mobile.android.interactableec.home.n829.machinename.b bVar = (com.dyson.mobile.android.interactableec.home.n829.machinename.b) this.receiver;
            b.C0474b c0474b = bVar.f14526o;
            if (c0474b != null && c0474b != null) {
                bVar.f14521j.b(bVar.f14517f.c(), new com.dyson.mobile.android.interactableec.home.n829.machinename.d(bVar, true, c0474b, null));
            }
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class f extends p implements w12.a<f0> {
        public f(Object obj) {
            super(0, obj, com.dyson.mobile.android.interactableec.home.n829.machinename.b.class, "trackMachineNameChangeScreenViewEvent", "trackMachineNameChangeScreenViewEvent()V", 0);
        }

        @Override // w12.a
        public final f0 invoke() {
            hj.e eVar = ((com.dyson.mobile.android.interactableec.home.n829.machinename.b) this.receiver).f14518g;
            int i13 = e5.f57462a;
            ij.b bVar = new ij.b("ec.settings.room_name", null, 2, null);
            e.a aVar = hj.e.f38312g;
            eVar.h(bVar, null);
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class g implements w12.a<Bundle> {
        public static final g d = new g();

        @Override // w12.a
        public final /* bridge */ /* synthetic */ Bundle invoke() {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class h implements w12.a<ViewModelProvider.Factory> {
        public final /* synthetic */ w12.a d;
        public final /* synthetic */ f.g e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Function1 f14510f;

        public h(w12.a aVar, f.g gVar, Function1 function1) {
            this.d = aVar;
            this.e = gVar;
            this.f14510f = function1;
        }

        @Override // w12.a
        public final ViewModelProvider.Factory invoke() {
            Bundle bundle = (Bundle) this.d.invoke();
            f.g gVar = this.e;
            if (bundle == null) {
                Intent intent = gVar.getIntent();
                bundle = intent != null ? intent.getExtras() : null;
            }
            return ef1.d.a(gVar, bundle, this.f14510f);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class i extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ f.g f14511f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(f.g gVar) {
            super(0);
            this.f14511f = gVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return this.f14511f.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class j extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f14512f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ f.g f14513g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(w12.a aVar, f.g gVar) {
            super(0);
            this.f14512f = aVar;
            this.f14513g = gVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f14512f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f14513g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    static {
        new c(null);
    }

    public final com.dyson.mobile.android.interactableec.home.n829.machinename.b Y0() {
        return (com.dyson.mobile.android.interactableec.home.n829.machinename.b) this.f14506k.getValue();
    }

    @Override // f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (cd.b.J(this)) {
            return;
        }
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "NdsMachineNameChangeActivity should be initialized with valid arguments. Please use ActivityLauncherContract.";
        a13.a("ACTIVITY_ARGS");
        Intent intent2 = getIntent();
        intent2.getClass();
        Object a14 = k7.b.a(cd.b.I(intent2), "ACTIVITY_ARGS", ActivityInput.class);
        if (a14 == null) {
            pa.c.w("ACTIVITY_ARGS was null");
            return;
        }
        ActivityInput activityInput = (ActivityInput) ((Parcelable) a14);
        g.a aVar = w90.g.f85506o;
        String str = activityInput.d;
        aVar.getClass();
        w90.g a15 = g.a.a(str);
        if (a15 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        this.f14505j = (b.a) a15.f85510j.T3.f88315a;
        g.f.a(this, new c4.c(-1905219395, true, new wb0.a(this, activityInput, 0)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/interactableec/home/n829/machinename/MachineNameChangeActivity$c;", "", "<init>", "()V", "", "ACTIVITY_ARGS", "Ljava/lang/String;", "EXTRA_NEW_MACHINE_NAME", "EXTRA_SHOW_CUSTOM_NAME_UPDATED_POPOVER", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/interactableec/home/n829/machinename/MachineNameChangeActivity$b;", "", "", "updatedName", "", "showCustomNameUpdatedPopover", "<init>", "(Ljava/lang/String;Z)V", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f14508a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f14509b;

        public b(String str, boolean z13) {
            str.getClass();
            this.f14508a = str;
            this.f14509b = z13;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return x12.r.c(this.f14508a, bVar.f14508a) && this.f14509b == bVar.f14509b;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f14509b) + (this.f14508a.hashCode() * 31);
        }

        public final String toString() {
            return o1.a.e("ActivityResult(updatedName=", this.f14508a, ", showCustomNameUpdatedPopover=", this.f14509b, ")");
        }

        public /* synthetic */ b(String str, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i13 & 2) != 0 ? false : z13);
        }
    }
}
