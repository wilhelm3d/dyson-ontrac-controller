package com.dyson.mobile.android.connectionjourney.userguidance.steps;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import bv1.f;
import com.dyson.mobile.android.connectionjourney.userguidance.steps.UserGuidanceView;
import com.dyson.mobile.android.localisation.LocalisationKey;
import com.dyson.mobile.android.machinetype.MachineDescriptor;
import f20.a3;
import f20.c3;
import f20.e3;
import f20.g2;
import f20.g3;
import f20.i2;
import f20.k2;
import f20.m1;
import f20.m2;
import f20.n5;
import f20.o1;
import f20.o2;
import f20.q1;
import f20.q2;
import f20.s1;
import f20.s2;
import f20.u1;
import f20.u2;
import f20.w1;
import f20.w2;
import f20.y2;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q8.g;
import q8.t;
import we1.a;
import x12.r;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/userguidance/steps/b;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class b extends Fragment {
    public h50.c d;
    public UserGuidanceView e;

    static {
        new a(null);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        a.C2547a c2547a = we1.a.f85708c;
        Bundle arguments = getArguments();
        c2547a.getClass();
        we1.a b13 = a.C2547a.b(arguments);
        b13.f85710b = "Required arguments are missing, please use the newInstance method";
        Bundle a13 = b13.a("ap-user-guidance-extra", "machineDescriptor");
        Object a14 = k7.b.a(a13, "ap-user-guidance-extra", UserGuidanceView.class);
        if (a14 == null) {
            pa.c.w("ap-user-guidance-extra was null");
            return null;
        }
        this.e = (UserGuidanceView) ((Parcelable) a14);
        Serializable c13 = k7.b.c(a13, "machineDescriptor", MachineDescriptor.class);
        if (c13 == null) {
            pa.c.p("Required value was null.");
            return null;
        }
        MachineDescriptor machineDescriptor = (MachineDescriptor) c13;
        c s13 = s();
        UserGuidanceView userGuidanceView = this.e;
        if (userGuidanceView == null) {
            r.i("userGuidanceView");
            throw null;
        }
        LocalisationKey localisationKey = userGuidanceView.e;
        s13.getClass();
        localisationKey.getClass();
        s13.e.m(s13.d.d(localisationKey));
        UserGuidanceView userGuidanceView2 = this.e;
        if (userGuidanceView2 == null) {
            r.i("userGuidanceView");
            throw null;
        }
        UserGuidanceView.d dVar = userGuidanceView2.f13901f;
        UserGuidanceView.a aVar = userGuidanceView2.f13902g;
        dVar.getClass();
        aVar.getClass();
        s13.f13931f = dVar;
        s13.f13932g = aVar;
        getLifecycle().a(s());
        UserGuidanceView userGuidanceView3 = this.e;
        if (userGuidanceView3 == null) {
            r.i("userGuidanceView");
            throw null;
        }
        t c14 = g.c(layoutInflater, userGuidanceView3.d, viewGroup, false, null);
        if (this.d == null) {
            r.i("userGuidanceViewBindingFactory");
            throw null;
        }
        c14.getClass();
        c s14 = s();
        s14.getClass();
        if (c14 instanceof m1) {
            ((m1) c14).l((i50.b) s14);
        } else if (c14 instanceof q1) {
            ((q1) c14).l((i50.b) s14);
        } else if (c14 instanceof o1) {
            ((o1) c14).l((i50.b) s14);
        } else if (c14 instanceof s1) {
            ((s1) c14).l((i50.b) s14);
        } else if (c14 instanceof w1) {
            ((w1) c14).l((i50.b) s14);
        } else if (c14 instanceof u1) {
            ((u1) c14).l((i50.b) s14);
        } else if (c14 instanceof q2) {
            ((q2) c14).l((k50.a) s14);
        } else if (c14 instanceof u2) {
            ((u2) c14).l((k50.a) s14);
        } else if (c14 instanceof s2) {
            ((s2) c14).l((k50.a) s14);
        } else if (c14 instanceof o2) {
            ((o2) c14).l((k50.a) s14);
        } else if (c14 instanceof w2) {
            ((w2) c14).l((k50.a) s14);
        } else if (c14 instanceof y2) {
            ((y2) c14).l((k50.a) s14);
        } else if (c14 instanceof c3) {
            ((c3) c14).l((k50.a) s14);
        } else if (c14 instanceof g3) {
            ((g3) c14).l((k50.a) s14);
        } else if (c14 instanceof e3) {
            ((e3) c14).l((k50.a) s14);
        } else if (c14 instanceof a3) {
            ((a3) c14).l((k50.a) s14);
        } else if (c14 instanceof g2) {
            ((g2) c14).l((k50.a) s14);
        } else if (c14 instanceof i2) {
            ((i2) c14).l((k50.a) s14);
        } else if (c14 instanceof k2) {
            ((k2) c14).l((k50.a) s14);
        } else if (c14 instanceof m2) {
            ((m2) c14).l((k50.a) s14);
        } else if (!(c14 instanceof n5)) {
            pa.c.w(f.e("Incorrect databinding class, the instance of (", c14.getClass().getName(), ") was not expected"));
            return null;
        } else {
            ((n5) c14).l((k50.a) s14);
        }
        return c14.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        getLifecycle().c(s());
    }

    public abstract c s();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0084\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/userguidance/steps/b$a;", "", "<init>", "()V", "", "USER_GUIDANCE_EXTRA", "Ljava/lang/String;", "USER_GUIDANCE_MACHINE_DESCRIPTOR", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
