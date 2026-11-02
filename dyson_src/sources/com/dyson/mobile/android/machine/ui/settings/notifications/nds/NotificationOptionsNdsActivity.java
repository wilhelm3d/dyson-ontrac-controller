package com.dyson.mobile.android.machine.ui.settings.notifications.nds;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.dyson.mobile.android.machine.ui.settings.notifications.nds.a;
import f.x;
import h12.f0;
import hj.e;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.v;
import mj.a;
import nj.a1;
import r3.e7;
import rm0.m;
import we1.a;
import x12.p;
import x12.p0;
import x12.t;
import z32.g0;
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\u0012\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/settings/notifications/nds/NotificationOptionsNdsActivity;", "Lf/g;", "<init>", "()V", "ActivityInput", "a", "Lnl0/h;", "Lrm0/l;", "uiState", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NotificationOptionsNdsActivity extends f.g {

    /* renamed from: l  reason: collision with root package name */
    public static final /* synthetic */ int f15502l = 0;

    /* renamed from: j  reason: collision with root package name */
    public a.b f15503j;

    /* renamed from: k  reason: collision with root package name */
    public final d0 f15504k = new d0(p0.f86717a.b(com.dyson.mobile.android.machine.ui.settings.notifications.nds.a.class), new i(this), new h(g.d, this, new e7(this, 5)), new j(null, this));

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/settings/notifications/nds/NotificationOptionsNdsActivity$ActivityInput;", "Landroid/os/Parcelable;", "", "machineSerial", "<init>", "(Ljava/lang/String;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
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

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class b extends p implements w12.a<f0> {
        public b(Object obj) {
            super(0, obj, NotificationOptionsNdsActivity.class, "finish", "finish()V", 0);
        }

        @Override // w12.a
        public final f0 invoke() {
            ((NotificationOptionsNdsActivity) this.receiver).finish();
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class c extends p implements Function1<m, f0> {
        public c(Object obj) {
            super(1, obj, com.dyson.mobile.android.machine.ui.settings.notifications.nds.a.class, "updateNotificationPreference", "updateNotificationPreference$mod_machine(Lcom/dyson/mobile/android/machine/ui/settings/notifications/nds/SingleNotificationItem;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final f0 invoke(m mVar) {
            m mVar2 = mVar;
            mVar2.getClass();
            com.dyson.mobile.android.machine.ui.settings.notifications.nds.a aVar = (com.dyson.mobile.android.machine.ui.settings.notifications.nds.a) this.receiver;
            aVar.getClass();
            g0.r(v.a(aVar), null, null, new rm0.j(aVar, mVar2, null), 3);
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class d extends p implements w12.a<f0> {
        public d(Object obj) {
            super(0, obj, com.dyson.mobile.android.machine.ui.settings.notifications.nds.a.class, "trackScreenEvent", "trackScreenEvent$mod_machine()V", 0);
        }

        @Override // w12.a
        public final f0 invoke() {
            hj.e eVar = ((com.dyson.mobile.android.machine.ui.settings.notifications.nds.a) this.receiver).f15510g;
            int i13 = a1.f57394a;
            ij.b bVar = new ij.b("common.settings.manage_notifications", null, 2, null);
            e.a aVar = hj.e.f38312g;
            eVar.h(bVar, null);
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class e extends p implements w12.a<f0> {
        public e(Object obj) {
            super(0, obj, com.dyson.mobile.android.machine.ui.settings.notifications.nds.a.class, "retry", "retry$mod_machine()V", 0);
        }

        @Override // w12.a
        public final f0 invoke() {
            com.dyson.mobile.android.machine.ui.settings.notifications.nds.a aVar = (com.dyson.mobile.android.machine.ui.settings.notifications.nds.a) this.receiver;
            aVar.getClass();
            ij.f a13 = new mj.a(a.b.CONNECTIVITY_FAILURE, a.EnumC1668a.CONNECTIVITY_FAILURE, (String) null, 4, (DefaultConstructorMarker) null).a();
            hj.e eVar = aVar.f15510g;
            e.a aVar2 = hj.e.f38312g;
            eVar.g(a13, null);
            g0.r(v.a(aVar), null, null, new rm0.i(aVar, null), 3);
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class f extends p implements w12.a<f0> {
        public f(Object obj) {
            super(0, obj, com.dyson.mobile.android.machine.ui.settings.notifications.nds.a.class, "dismissAlert", "dismissAlert$mod_machine()V", 0);
        }

        @Override // w12.a
        public final f0 invoke() {
            com.dyson.mobile.android.machine.ui.settings.notifications.nds.a aVar = (com.dyson.mobile.android.machine.ui.settings.notifications.nds.a) this.receiver;
            aVar.f15513j.l(null, Boolean.FALSE);
            ij.f a13 = new mj.a(a.b.NOTIFICATION_PREFERENCES_UPDATE_FAILED, a.EnumC1668a.NOTIFICATION_PREFERENCES_UPDATE_FAILED, (String) null, 4, (DefaultConstructorMarker) null).a();
            hj.e eVar = aVar.f15510g;
            e.a aVar2 = hj.e.f38312g;
            eVar.g(a13, null);
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class g implements w12.a<Bundle> {
        public static final g d = new g();

        @Override // w12.a
        public final /* bridge */ /* synthetic */ Bundle invoke() {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class h implements w12.a<ViewModelProvider.Factory> {
        public final /* synthetic */ w12.a d;
        public final /* synthetic */ f.g e;

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ Function1 f15505f;

        public h(w12.a aVar, f.g gVar, Function1 function1) {
            this.d = aVar;
            this.e = gVar;
            this.f15505f = function1;
        }

        @Override // w12.a
        public final ViewModelProvider.Factory invoke() {
            Bundle bundle = (Bundle) this.d.invoke();
            f.g gVar = this.e;
            if (bundle == null) {
                Intent intent = gVar.getIntent();
                bundle = intent != null ? intent.getExtras() : null;
            }
            return ef1.d.a(gVar, bundle, this.f15505f);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class i extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ f.g f15506f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(f.g gVar) {
            super(0);
            this.f15506f = gVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return this.f15506f.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes3.dex */
    public static final class j extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f15507f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ f.g f15508g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(w12.a aVar, f.g gVar) {
            super(0);
            this.f15507f = aVar;
            this.f15508g = gVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f15507f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f15508g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    static {
        new a(null);
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
        a13.f85710b = "Please use the ActivityLauncherContract";
        a13.a("ACTIVITY_ARGS");
        uf0.g a14 = uf0.g.a(this);
        if (a14 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        this.f15503j = (a.b) a14.f81922a.A0.f88315a;
        x.e.getClass();
        f.j.a(this, x.a.a(0), x.a.a(0));
        g.f.a(this, new c4.c(614462448, true, new rm0.b(this, 0)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/settings/notifications/nds/NotificationOptionsNdsActivity$a;", "", "<init>", "()V", "", "ACTIVITY_ARGS", "Ljava/lang/String;", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
