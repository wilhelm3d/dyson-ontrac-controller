package com.dyson.mobile.android.connectionjourney.userguidance.steps.ap;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.dyson.mobile.android.connectionjourney.aplist.machineaplist.ApListActivity;
import com.dyson.mobile.android.connectionjourney.userguidance.steps.UserGuidanceView;
import com.dyson.mobile.android.connectionjourney.userguidance.steps.ap.a;
import com.dyson.mobile.android.machinetype.MachineCategory;
import com.dyson.mobile.android.machinetype.MachineDescriptor;
import com.dyson.mobile.android.machinetype.MachineType;
import j50.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ma.e;
import oi1.s;
import w00.i;
import x12.r;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/userguidance/steps/ap/ApUserGuidanceStepsActivity;", "Lcom/dyson/mobile/android/connectionjourney/userguidance/steps/a;", "Li50/a;", "<init>", "()V", "a", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ApUserGuidanceStepsActivity extends com.dyson.mobile.android.connectionjourney.userguidance.steps.a implements i50.a {

    /* renamed from: p  reason: collision with root package name */
    public static final a f13909p = new a(null);

    /* loaded from: classes2.dex */
    public static final /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f13910a;

        static {
            int[] iArr = new int[UserGuidanceView.a.values().length];
            try {
                iArr[UserGuidanceView.a.FIND_WIFI_PASSWORD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserGuidanceView.a.CANT_SEE_ROBOT_LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UserGuidanceView.a.NO_ACTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f13910a = iArr;
        }
    }

    @Override // i50.a
    public final void D0(UserGuidanceView.a aVar) {
        aVar.getClass();
        int i13 = b.f13910a[aVar.ordinal()];
        if (i13 == 1) {
            i.c(this).k(this);
        } else if (i13 == 2) {
            i.c(this).getClass();
            i.x(this, 0);
        } else if (i13 == 3) {
        } else {
            e.o();
        }
    }

    @Override // com.dyson.mobile.android.connectionjourney.userguidance.steps.a
    public final Fragment c1(UserGuidanceView userGuidanceView) {
        userGuidanceView.getClass();
        a.C0449a c0449a = com.dyson.mobile.android.connectionjourney.userguidance.steps.ap.a.f13911h;
        MachineDescriptor machineDescriptor = this.f13905k;
        if (machineDescriptor != null) {
            c0449a.getClass();
            return a.C0449a.a(userGuidanceView, machineDescriptor);
        }
        r.i("machineDescriptor");
        throw null;
    }

    @Override // com.dyson.mobile.android.connectionjourney.userguidance.steps.a
    public final h50.a d1(MachineDescriptor machineDescriptor) {
        new j50.a();
        if (r.c(machineDescriptor.getMachineType(), MachineType.MACHINE_223.getTypeName())) {
            return new c();
        }
        if (machineDescriptor.getMachineCategory() == MachineCategory.EC) {
            return new j50.b();
        }
        pa.c.w(s.c("Unsupported type ", machineDescriptor.getMachineType()));
        return null;
    }

    @Override // com.dyson.mobile.android.connectionjourney.userguidance.steps.a
    public final void onComplete() {
        MachineCategory h13 = i.c(this).f85124a.h();
        Intent intent = new Intent(this, ApListActivity.class);
        intent.putExtra("apFilterMachineCategory", h13.name());
        startActivity(intent);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/userguidance/steps/ap/ApUserGuidanceStepsActivity$a;", "", "<init>", "()V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static Intent a(Activity activity, MachineDescriptor machineDescriptor, UserGuidanceView.c cVar) {
            activity.getClass();
            cVar.getClass();
            Intent putExtra = new Intent(activity, ApUserGuidanceStepsActivity.class).putExtra("extra-machine-descriptor", machineDescriptor).putExtra("extra-initial-entry-step", cVar.name());
            putExtra.getClass();
            return putExtra;
        }

        private a() {
        }
    }
}
