package com.dyson.mobile.android.connectionjourney.userguidance.steps.subsequent;

import androidx.fragment.app.Fragment;
import b50.f;
import com.dyson.mobile.android.connectionjourney.userguidance.steps.UserGuidanceView;
import com.dyson.mobile.android.connectionjourney.userguidance.steps.ap.a;
import com.dyson.mobile.android.machinetype.MachineDescriptor;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ma.e;
import nj.r3;
import w00.i;
import x12.r;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/userguidance/steps/subsequent/SubsequentUserGuidanceActivity;", "Lcom/dyson/mobile/android/connectionjourney/userguidance/steps/a;", "Li50/a;", "<init>", "()V", "a", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SubsequentUserGuidanceActivity extends com.dyson.mobile.android.connectionjourney.userguidance.steps.a implements i50.a {

    /* renamed from: p  reason: collision with root package name */
    public static final a f13933p = new a(null);

    /* loaded from: classes2.dex */
    public static final /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f13934a;

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
            f13934a = iArr;
        }
    }

    @Override // i50.a
    public final void D0(UserGuidanceView.a aVar) {
        aVar.getClass();
        int i13 = b.f13934a[aVar.ordinal()];
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
        return new m50.a(machineDescriptor.getMachineCategory());
    }

    @Override // com.dyson.mobile.android.connectionjourney.userguidance.steps.a
    public final void onComplete() {
        i.c(this).getClass();
        i.v(this, f.b.SUBSEQUENT, false);
    }

    @Override // com.dyson.mobile.android.connectionjourney.userguidance.steps.a, androidx.fragment.app.e, android.app.Activity
    public final void onResume() {
        super.onResume();
        int i13 = r3.f57676a;
        new ij.b("connection_journey.product_wifi.help", null, 2, null).b();
        invalidateOptionsMenu();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/userguidance/steps/subsequent/SubsequentUserGuidanceActivity$a;", "", "<init>", "()V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
