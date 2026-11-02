package com.dyson.mobile.android.machine.ui.name;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.lifecycle.ViewModelProvider;
import c42.f2;
import c42.q1;
import com.dyson.mobile.android.machine.ui.settings.name.MachineNamingExtras;
import com.dyson.mobile.android.machine.ui.settings.name.c;
import com.dyson.mobile.android.machine.ui.settings.name.g;
import com.paypal.android.platform.authsdk.BR;
import f.x;
import h12.f0;
import hj.e;
import i12.e0;
import java.util.List;
import kotlin.Metadata;
import kotlin.UninitializedPropertyAccessException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.u;
import m9.v;
import mj.a;
import mj.b;
import nl0.j;
import v32.a0;
import v32.y;
import we1.a;
import x12.p;
import x12.r;
import y9.w;
import z32.c0;
import z32.g0;
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u000e²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002²\u0006\f\u0010\f\u001a\u00020\n8\nX\u008a\u0084\u0002²\u0006\f\u0010\r\u001a\u00020\n8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/name/CustomNameActivity;", "Lf/g;", "<init>", "()V", "a", "ActivityInput", "b", "c", "Lvl0/h;", "customViewState", "", "showDiscardDialog", "showSaveErrorScreen", "isExiting", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CustomNameActivity extends f.g {

    /* renamed from: j  reason: collision with root package name */
    public static final c f15366j = new c(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/name/CustomNameActivity$a;", "Landroidx/activity/result/contract/ActivityResultContract;", "Lcom/dyson/mobile/android/machine/ui/name/CustomNameActivity$ActivityInput;", "Lcom/dyson/mobile/android/machine/ui/name/CustomNameActivity$b;", "<init>", "()V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a extends ActivityResultContract<ActivityInput, b> {
        @Override // androidx.activity.result.contract.ActivityResultContract
        public final Intent a(Context context, ActivityInput activityInput) {
            ActivityInput activityInput2 = activityInput;
            context.getClass();
            activityInput2.getClass();
            CustomNameActivity.f15366j.getClass();
            Intent intent = new Intent(context, CustomNameActivity.class);
            intent.putExtra("ACTIVITY_ARGS", activityInput2);
            return intent;
        }

        @Override // androidx.activity.result.contract.ActivityResultContract
        public final b c(int i13, Intent intent) {
            Bundle extras;
            String string = (intent == null || (extras = intent.getExtras()) == null) ? null : extras.getString("NEW_MACHINE_NAME");
            if (string == null) {
                string = "";
            }
            return new b(string);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/name/CustomNameActivity$b;", "", "", "updatedName", "<init>", "(Ljava/lang/String;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f15370a;

        public b(String str) {
            str.getClass();
            this.f15370a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f15370a.equals(((b) obj).f15370a);
        }

        public final int hashCode() {
            return this.f15370a.hashCode();
        }

        public final String toString() {
            return bv1.f.e("ActivityResult(updatedName=", this.f15370a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.machine.ui.name.CustomNameActivity$onCreate$1$1$1", f = "CustomNameActivity.kt", l = {BR.progressRange}, m = "invokeSuspend", v = 2)
    /* loaded from: classes3.dex */
    public static final class d extends n12.i implements Function2<c0, l12.d<? super f0>, Object> {
        public int d;
        public final /* synthetic */ com.dyson.mobile.android.machine.ui.settings.name.c e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ CustomNameActivity f15371f;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a<T> implements c42.j {
            public final /* synthetic */ CustomNameActivity d;

            public a(CustomNameActivity customNameActivity) {
                this.d = customNameActivity;
            }

            @Override // c42.j
            public final Object emit(Object obj, l12.d dVar) {
                com.dyson.mobile.android.machine.ui.settings.name.g gVar = (com.dyson.mobile.android.machine.ui.settings.name.g) obj;
                boolean z13 = gVar instanceof g.b;
                CustomNameActivity customNameActivity = this.d;
                if (z13) {
                    Intent intent = new Intent();
                    intent.putExtra("NEW_MACHINE_NAME", ((g.b) gVar).f15461a);
                    f0 f0Var = f0.f36844a;
                    customNameActivity.setResult(-1, intent);
                    customNameActivity.finish();
                } else if (!r.c(gVar, g.a.f15460a)) {
                    ma.e.o();
                    return null;
                } else {
                    customNameActivity.finish();
                }
                return f0.f36844a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.dyson.mobile.android.machine.ui.settings.name.c cVar, CustomNameActivity customNameActivity, l12.d<? super d> dVar) {
            super(2, dVar);
            this.e = cVar;
            this.f15371f = customNameActivity;
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            return new d(this.e, this.f15371f, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
            return ((d) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            int i13 = this.d;
            if (i13 == 0) {
                h12.r.b(obj);
                q1 q1Var = this.e.f15443l;
                a aVar2 = new a(this.f15371f);
                this.d = 1;
                if (q1Var.d.collect(aVar2, this) == aVar) {
                    return aVar;
                }
            } else if (i13 != 1) {
                pa.c.w("call to 'resume' before 'invoke' with coroutine");
                return null;
            } else {
                h12.r.b(obj);
            }
            w.j();
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class e extends p implements w12.a<f0> {
        public e(Object obj) {
            super(0, obj, com.dyson.mobile.android.machine.ui.settings.name.c.class, "onSaveErrorRetry", "onSaveErrorRetry()V", 0);
        }

        @Override // w12.a
        public final f0 invoke() {
            ((com.dyson.mobile.android.machine.ui.settings.name.c) this.receiver).V();
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class f extends p implements w12.a<f0> {
        public f(Object obj) {
            super(0, obj, com.dyson.mobile.android.machine.ui.settings.name.c.class, "onSaveErrorDismissed", "onSaveErrorDismissed()V", 0);
        }

        @Override // w12.a
        public final f0 invoke() {
            com.dyson.mobile.android.machine.ui.settings.name.c cVar = (com.dyson.mobile.android.machine.ui.settings.name.c) this.receiver;
            cVar.f15448q.l(null, Boolean.TRUE);
            g0.r(v.a(cVar), null, null, new com.dyson.mobile.android.machine.ui.settings.name.e(cVar, null), 3);
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class g extends p implements Function1<String, f0> {
        public g(Object obj) {
            super(1, obj, com.dyson.mobile.android.machine.ui.settings.name.c.class, "onNameInputChanged", "onNameInputChanged(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final f0 invoke(String str) {
            Object value;
            vl0.h hVar;
            boolean c13;
            boolean z13;
            String str2;
            nl0.j bVar;
            int i13;
            int i14;
            String str3 = str;
            str3.getClass();
            com.dyson.mobile.android.machine.ui.settings.name.c cVar = (com.dyson.mobile.android.machine.ui.settings.name.c) this.receiver;
            cVar.getClass();
            if (str3.equals(cVar.f84568f)) {
                return f0.f36844a;
            }
            boolean z14 = str3.length() > cVar.T();
            cVar.f84568f = a0.Z(cVar.T(), str3);
            f2 f2Var = cVar.f84569g;
            do {
                value = f2Var.getValue();
                hVar = (vl0.h) value;
                c13 = r.c(cVar.d, cVar.f84568f);
                z13 = y.U(cVar.f84568f).toString().length() == 0;
                String str4 = cVar.f84568f;
                str2 = null;
                if (z13) {
                    str4 = null;
                }
                if (str4 == null || (bVar = cVar.e.b(str4)) == null) {
                    bVar = new j.b(cVar.f84568f);
                }
                if (!z13) {
                    j.a aVar = bVar instanceof j.a ? (j.a) bVar : null;
                    if (aVar != null) {
                        str2 = aVar.f57900a;
                    }
                }
                if (z13) {
                    i13 = hVar.e;
                } else {
                    if (z14) {
                        i14 = hVar.e;
                    } else if (str2 != null) {
                        i14 = hVar.e;
                    } else {
                        i13 = hVar.e;
                    }
                    i13 = i14 + 1;
                }
            } while (!f2Var.f(value, vl0.h.a(hVar, cVar.f84568f, (z13 || c13 || !(bVar instanceof j.b)) ? false : true, str2, false, i13, 8)));
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class h extends p implements w12.a<f0> {
        public h(Object obj) {
            super(0, obj, com.dyson.mobile.android.machine.ui.settings.name.c.class, "onDoneClicked", "onDoneClicked()V", 0);
        }

        @Override // w12.a
        public final f0 invoke() {
            ((com.dyson.mobile.android.machine.ui.settings.name.c) this.receiver).V();
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class i extends p implements w12.a<f0> {
        public i(Object obj) {
            super(0, obj, com.dyson.mobile.android.machine.ui.settings.name.c.class, "onBackPressed", "onBackPressed()V", 0);
        }

        @Override // w12.a
        public final f0 invoke() {
            ((com.dyson.mobile.android.machine.ui.settings.name.c) this.receiver).U();
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class j extends p implements w12.a<f0> {
        public j(Object obj) {
            super(0, obj, com.dyson.mobile.android.machine.ui.settings.name.c.class, "onDiscardConfirmed", "onDiscardConfirmed()V", 0);
        }

        @Override // w12.a
        public final f0 invoke() {
            com.dyson.mobile.android.machine.ui.settings.name.c cVar = (com.dyson.mobile.android.machine.ui.settings.name.c) this.receiver;
            hj.e eVar = cVar.f15440i;
            ij.f a13 = new mj.a(a.b.CUSTOM_NAME_DISCARD, a.EnumC1668a.CUSTOM_NAME_DISCARD, (String) null, 4, (DefaultConstructorMarker) null).a();
            e.a aVar = hj.e.f38312g;
            eVar.g(a13, null);
            cVar.f15444m.l(null, Boolean.FALSE);
            cVar.f15448q.l(null, Boolean.TRUE);
            g0.r(v.a(cVar), null, null, new com.dyson.mobile.android.machine.ui.settings.name.d(cVar, null), 3);
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class k extends p implements w12.a<f0> {
        public k(Object obj) {
            super(0, obj, com.dyson.mobile.android.machine.ui.settings.name.c.class, "onDiscardDismissed", "onDiscardDismissed()V", 0);
        }

        @Override // w12.a
        public final f0 invoke() {
            com.dyson.mobile.android.machine.ui.settings.name.c cVar = (com.dyson.mobile.android.machine.ui.settings.name.c) this.receiver;
            hj.e eVar = cVar.f15440i;
            ij.f a13 = new mj.b(b.a.CUSTOM_NAME_DISCARD).a();
            e.a aVar = hj.e.f38312g;
            eVar.g(a13, null);
            cVar.f15444m.l(null, Boolean.FALSE);
            return f0.f36844a;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/machine/ui/name/CustomNameActivity$l", "Landroidx/lifecycle/ViewModelProvider$Factory;", "mod-utilities"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class l implements ViewModelProvider.Factory {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ActivityInput f15372a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ sg0.c f15373b;

        public l(ActivityInput activityInput, sg0.c cVar) {
            this.f15372a = activityInput;
            this.f15373b = cVar;
        }

        /* JADX WARN: Type inference failed for: r0v5, types: [com.dyson.mobile.android.machine.ui.settings.name.c$b, VMF] */
        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public final <T extends u> T create(Class<T> cls) {
            cls.getClass();
            if (c.b.class.isAnnotationPresent(wy1.a.class)) {
                ef1.a aVar = new ef1.a();
                aVar.f26823a = (c.b) ((sg0.b) this.f15373b).O0.f88315a;
                try {
                    return ((c.b) aVar.a()).a(this.f15372a);
                } catch (UninitializedPropertyAccessException unused) {
                    throw new ef1.b();
                }
            }
            throw new ef1.g();
        }
    }

    @Override // f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        x.e.getClass();
        f.j.a(this, x.a.a(0), x.a.a(0));
        super.onCreate(bundle);
        if (cd.b.J(this)) {
            return;
        }
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        a.C2547a.a(intent).a("ACTIVITY_ARGS");
        Intent intent2 = getIntent();
        intent2.getClass();
        Object a13 = k7.b.a(cd.b.I(intent2), "ACTIVITY_ARGS", ActivityInput.class);
        if (a13 == null) {
            pa.c.w("ACTIVITY_ARGS was null");
            return;
        }
        g.f.a(this, new c4.c(-399718479, true, new q80.c(22, uf0.g.a(this), this, (ActivityInput) ((Parcelable) a13))));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/name/CustomNameActivity$c;", "", "<init>", "()V", "", "ACTIVITY_ARGS", "Ljava/lang/String;", "EXTRA_NEW_MACHINE_NAME", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/name/CustomNameActivity$ActivityInput;", "Landroid/os/Parcelable;", "", "customName", "Lcom/dyson/mobile/android/machine/ui/settings/name/MachineNamingExtras;", "machineNameExtras", "", "existingNames", "Lcom/dyson/mobile/android/machine/ui/name/CustomNameType;", "customNameType", "", "isPreset", "<init>", "(Ljava/lang/String;Lcom/dyson/mobile/android/machine/ui/settings/name/MachineNamingExtras;Ljava/util/List;Lcom/dyson/mobile/android/machine/ui/name/CustomNameType;Z)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static class ActivityInput implements Parcelable {
        public static final Parcelable.Creator<ActivityInput> CREATOR = new a();
        public final String d;
        public final MachineNamingExtras e;

        /* renamed from: f  reason: collision with root package name */
        public final List<String> f15367f;

        /* renamed from: g  reason: collision with root package name */
        public final CustomNameType f15368g;

        /* renamed from: h  reason: collision with root package name */
        public final boolean f15369h;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class a implements Parcelable.Creator<ActivityInput> {
            @Override // android.os.Parcelable.Creator
            public final ActivityInput createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new ActivityInput(parcel.readString(), (MachineNamingExtras) parcel.readParcelable(ActivityInput.class.getClassLoader()), parcel.createStringArrayList(), CustomNameType.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final ActivityInput[] newArray(int i13) {
                return new ActivityInput[i13];
            }
        }

        public ActivityInput(String str, MachineNamingExtras machineNamingExtras, List list, CustomNameType customNameType, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i13 & 2) != 0 ? null : machineNamingExtras, (i13 & 4) != 0 ? e0.d : list, (i13 & 8) != 0 ? CustomNameType.MACHINE_NAME : customNameType, (i13 & 16) != 0 ? false : z13);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i13) {
            parcel.getClass();
            parcel.writeString(this.d);
            parcel.writeParcelable(this.e, i13);
            parcel.writeStringList(this.f15367f);
            this.f15368g.writeToParcel(parcel, i13);
            parcel.writeInt(this.f15369h ? 1 : 0);
        }

        public ActivityInput(String str, MachineNamingExtras machineNamingExtras, List<String> list, CustomNameType customNameType, boolean z13) {
            str.getClass();
            list.getClass();
            customNameType.getClass();
            this.d = str;
            this.e = machineNamingExtras;
            this.f15367f = list;
            this.f15368g = customNameType;
            this.f15369h = z13;
        }
    }
}
