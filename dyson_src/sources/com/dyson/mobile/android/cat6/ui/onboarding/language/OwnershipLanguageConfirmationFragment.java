package com.dyson.mobile.android.cat6.ui.onboarding.language;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.w;
import com.dyson.mobile.android.R;
import h12.f0;
import h12.h;
import h12.y;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lq.d;
import m9.p;
import q8.t;
import qq.h1;
import qq.h3;
import qq.i1;
import qq.m3;
import x12.m;
import x12.p0;
import x12.r;
import y9.u;
import y9.z;
import yj0.f;
import ys.d;
import ys.g;
import ys.j;
import z32.d0;
import z32.t0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/cat6/ui/onboarding/language/OwnershipLanguageConfirmationFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "mod-cat6-connected-floorcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OwnershipLanguageConfirmationFragment extends Fragment {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f12895f = 0;
    public g d;
    public final u e = new u(p0.f86717a.b(d.class), new c(this));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
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
    /* loaded from: classes2.dex */
    public static final class c implements w12.a<Bundle> {
        public final /* synthetic */ Fragment d;

        public c(Fragment fragment) {
            this.d = fragment;
        }

        @Override // w12.a
        public final Bundle invoke() {
            Fragment fragment = this.d;
            Bundle arguments = fragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            pa.c.w(y.i("Fragment ", fragment, " has null arguments"));
            return null;
        }
    }

    static {
        new a(null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        d.a aVar = lq.d.f52535n;
        String str = ((ys.d) this.e.getValue()).f90421a;
        aVar.getClass();
        lq.d a13 = d.a.a(str);
        if (a13 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        pq.b bVar = a13.f52538i;
        qq.a aVar2 = bVar.f64579b;
        i1 i1Var = bVar.f64576a;
        h42.c cVar = t0.f91519a;
        this.d = h1.a(aVar2, i1Var.f67541b, h3.b(i1Var), m3.a(i1Var), bVar.U1.get(), bVar.f64582c.get(), bVar.D0.get(), d0.a(h42.b.f37596f), bVar.f64580b0.get());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getLifecycle().a(s());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        int i13 = mq.c.f54489k;
        DataBinderMapperImpl dataBinderMapperImpl = q8.g.f66228a;
        mq.c cVar = (mq.c) t.inflateInternal(layoutInflater, R.layout.fragment_ownership_language_confirmation, viewGroup, false, null);
        cVar.getClass();
        cVar.l(s());
        g s13 = s();
        s13.f90430k.observe(getViewLifecycleOwner(), new b(new ys.c(this, 1)));
        xf1.a<f0> aVar = s13.f90434o;
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        aVar.observe(viewLifecycleOwner, new b(new ys.c(this, 2)));
        xf1.a<j> aVar2 = s13.f90433n;
        LifecycleOwner viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        aVar2.observe(viewLifecycleOwner2, new b(new ys.c(this, 3)));
        s13.f90432m.observe(getViewLifecycleOwner(), new b(new f(cVar, 3)));
        View root = cVar.getRoot();
        root.getClass();
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        getLifecycle().c(s());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        w a13;
        view.getClass();
        super.onViewCreated(view, bundle);
        z h13 = androidx.navigation.fragment.a.a(this).f89416b.h();
        if (h13 == null || (a13 = h13.a()) == null) {
            return;
        }
        o9.a aVar = a13.f4578b;
        LinkedHashMap linkedHashMap = aVar.d;
        LinkedHashMap linkedHashMap2 = aVar.f59812a;
        if (linkedHashMap.containsKey("languageKey")) {
            pa.c.p("StateFlow and LiveData are mutually exclusive for the same key. Please use either 'getMutableStateFlow' or 'getLiveData' for key 'languageKey', but not both.");
            return;
        }
        LinkedHashMap linkedHashMap3 = a13.f4577a;
        w.b bVar = linkedHashMap3.get("languageKey");
        if (bVar == null) {
            bVar = linkedHashMap2.containsKey("languageKey") ? new w.b(a13, "languageKey", linkedHashMap2.get("languageKey")) : new w.b(a13, "languageKey");
            linkedHashMap3.put("languageKey", bVar);
        }
        ((w.b) bVar).observe(getViewLifecycleOwner(), new b(new ys.c(this, 0)));
    }

    public final g s() {
        g gVar = this.d;
        if (gVar != null) {
            return gVar;
        }
        r.i("viewModel");
        throw null;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/cat6/ui/onboarding/language/OwnershipLanguageConfirmationFragment$a;", "", "<init>", "()V", "", "LANGUAGE_KEY", "Ljava/lang/String;", "mod-cat6-connected-floorcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
