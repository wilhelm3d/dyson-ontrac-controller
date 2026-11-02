package com.dyson.mobile.android.light.control;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.dyson.mobile.android.R;
import e71.n;
import je0.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import le0.d1;
import le0.i1;
import le0.r1;
import x12.r;
import yd0.c;
import z32.g0;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/light/control/a;", "Landroidx/fragment/app/Fragment;", "Landroidx/lifecycle/LifecycleOwner;", "<init>", "()V", "a", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a extends Fragment implements LifecycleOwner {

    /* renamed from: g  reason: collision with root package name */
    public static final C0493a f14797g = new C0493a(null);
    public ie0.c d;
    public LightControlActivity e;

    /* renamed from: f  reason: collision with root package name */
    public final b f14798f = new b();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/light/control/a$b", "Lie0/e;", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements ie0.e {
        public b() {
        }

        @Override // ie0.e
        public final void a() {
            a aVar = a.this;
            androidx.fragment.app.e activity = aVar.getActivity();
            if (activity != null) {
                activity.finish();
            }
            aVar.s().f41543n.l(8);
        }

        @Override // ie0.e
        public final void b() {
            LightControlActivity lightControlActivity = a.this.e;
            if (lightControlActivity != null) {
                lightControlActivity.c1();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        androidx.fragment.app.e activity = getActivity();
        activity.getClass();
        Lifecycle lifecycle = ((l.b) activity).getLifecycle();
        lifecycle.getClass();
        return lifecycle;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("COORDINATOR_ID") : null;
        string.getClass();
        yd0.c.f89775o.getClass();
        yd0.c a13 = c.a.a(string);
        a13.getClass();
        ke0.d dVar = a13.f89779j;
        d1 d1Var = dVar.f47423a;
        d1Var.getClass();
        n.f26183r.getClass();
        this.d = r1.a(dVar.f47425c, dVar.Q.get(), dVar.c(), dVar.d.get(), n.a.a().a(), i1.a(d1Var), dVar.a());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        n0 n0Var = (n0) q8.g.c(layoutInflater, R.layout.fragment_light_control_dialog, viewGroup, false, null);
        n0Var.l(s());
        ie0.c s13 = s();
        s13.f41550u.setValue(s13, ie0.c.E[0], this.f14798f);
        s().f41543n.l(0);
        Bundle arguments = getArguments();
        if (arguments != null) {
            boolean z13 = arguments.getBoolean("ARGUMENT_PRODUCT_MODE", false);
            int i13 = arguments.getInt("ARGUMENT_COLOR_TEMPERATURE_VALUE", 0);
            int i14 = arguments.getInt("ARGUMENT_BRIGHTNESS_VALUE", 0);
            ie0.c s14 = s();
            mf0.a aVar = s14.e;
            if (s14.f41555z) {
                s14.b(aVar.d());
                s14.a(aVar.c());
            } else {
                s14.f41553x.m(z13);
                s14.f41551v.m(!z13);
                s14.b(i13);
                s14.a(i14);
            }
            g0.r(s14.D, null, null, new ie0.d(s14, null), 3);
            Drawable thumb = n0Var.f44720h.getThumb();
            nf0.c.f57219a.getClass();
            int g13 = nf0.c.g(i13);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            thumb.setColorFilter(g13, mode);
            n0Var.f44724l.getThumb().setColorFilter(nf0.c.d(i14 / 10), mode);
        }
        View root = n0Var.getRoot();
        root.getClass();
        return root;
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

    public final ie0.c s() {
        ie0.c cVar = this.d;
        if (cVar != null) {
            return cVar;
        }
        r.i("viewModel");
        throw null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/light/control/a$a;", "", "<init>", "()V", "", "ARGUMENT_PRODUCT_MODE", "Ljava/lang/String;", "ARGUMENT_COLOR_TEMPERATURE_VALUE", "ARGUMENT_BRIGHTNESS_VALUE", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.light.control.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0493a {
        public /* synthetic */ C0493a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0493a() {
        }
    }
}
