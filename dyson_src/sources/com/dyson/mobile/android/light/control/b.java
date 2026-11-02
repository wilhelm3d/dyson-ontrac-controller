package com.dyson.mobile.android.light.control;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import bt0.f;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.light.control.c;
import fm1.o0;
import je0.c0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import le0.i1;
import le0.j0;
import le0.n1;
import we1.a;
import x12.r;
import yd0.c;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/light/control/b;", "Landroidx/fragment/app/Fragment;", "Lbt0/f$a;", "<init>", "()V", "a", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class b extends Fragment implements f.a {

    /* renamed from: k  reason: collision with root package name */
    public static final a f14800k = new a(null);
    public ie0.h d;
    public og0.a e;

    /* renamed from: f  reason: collision with root package name */
    public pf0.c f14801f;

    /* renamed from: g  reason: collision with root package name */
    public String f14802g;

    /* renamed from: h  reason: collision with root package name */
    public int f14803h;

    /* renamed from: i  reason: collision with root package name */
    public int f14804i;

    /* renamed from: j  reason: collision with root package name */
    public final C0494b f14805j = new C0494b();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/light/control/b$b", "Lie0/g;", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.light.control.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0494b implements ie0.g {
        public C0494b() {
        }

        @Override // ie0.g
        public final void a(int i13, int i14) {
            b bVar = b.this;
            androidx.fragment.app.e activity = bVar.getActivity();
            activity.getClass();
            bt0.f fVar = (bt0.f) activity;
            c.a aVar = c.f14807k;
            String str = bVar.f14802g;
            if (str == null) {
                r.i("coordinatorId");
                throw null;
            }
            aVar.getClass();
            c cVar = new c();
            Bundle bundle = new Bundle();
            bundle.putString("COORDINATOR_ID", str);
            bundle.putInt("EXTRA_COLOUR_TEMPERATURE_VALUE", i13);
            bundle.putInt("EXTRA_BRIGHTNESS_VALUE", i14);
            cVar.setArguments(bundle);
            pf0.c cVar2 = bVar.f14801f;
            if (cVar2 == null) {
                r.i("localisationManager");
                throw null;
            }
            og0.a aVar2 = bVar.e;
            if (aVar2 != null) {
                fVar.d1(cVar, cVar2.d(aVar2.b(og0.d.light_custom_mode)), null, null);
            } else {
                r.i("machineDataObject");
                throw null;
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        if (!(getActivity() instanceof bt0.f)) {
            pa.c.w("Activity must implement NavigationStackActivity");
            return null;
        }
        a.C2547a c2547a = we1.a.f85708c;
        Bundle arguments = getArguments();
        c2547a.getClass();
        we1.a b13 = a.C2547a.b(arguments);
        b13.f85710b = "Please use the newInstance method";
        Bundle a13 = b13.a("COORDINATOR_ID", "EXTRA_COLOUR_TEMPERATURE_VALUE", "EXTRA_BRIGHTNESS_VALUE");
        String y13 = o0.y("COORDINATOR_ID", a13);
        this.f14802g = y13;
        yd0.c.f89775o.getClass();
        yd0.c a14 = c.a.a(y13);
        if (a14 == null) {
            pa.c.w("Could not initialise the coordinator");
            return null;
        }
        ke0.d dVar = a14.f89779j;
        n1 n1Var = dVar.f47425c;
        lf0.a aVar = dVar.Q.get();
        mf0.a a15 = dVar.a();
        og0.a c13 = dVar.c();
        hj.e eVar = dVar.d.get();
        in0.g a16 = i1.a(dVar.f47423a);
        n1Var.getClass();
        aVar.getClass();
        eVar.getClass();
        this.d = new ie0.h(aVar, a15, c13, eVar, a16);
        this.e = dVar.c();
        this.f14801f = j0.a(dVar.f47424b);
        this.f14803h = a13.getInt("EXTRA_COLOUR_TEMPERATURE_VALUE", 0);
        this.f14804i = a13.getInt("EXTRA_BRIGHTNESS_VALUE", 0);
        c0 c0Var = (c0) q8.g.c(layoutInflater, R.layout.fragment_custom_modes_control, viewGroup, false, null);
        c0Var.l(s());
        ie0.h s13 = s();
        s13.f41569k.setValue(s13, ie0.h.f41563n[0], this.f14805j);
        s().b(this.f14803h);
        s().a(this.f14804i);
        Drawable thumb = c0Var.d.getThumb();
        nf0.c cVar = nf0.c.f57219a;
        int i13 = s().f41567i;
        cVar.getClass();
        int g13 = nf0.c.g(i13);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        thumb.setColorFilter(g13, mode);
        c0Var.f44536g.getThumb().setColorFilter(nf0.c.d(this.f14804i / 10), mode);
        return c0Var.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        getLifecycle().c(s());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        getLifecycle().a(s());
    }

    public final ie0.h s() {
        ie0.h hVar = this.d;
        if (hVar != null) {
            return hVar;
        }
        r.i("viewModel");
        throw null;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/light/control/b$a;", "", "<init>", "()V", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
