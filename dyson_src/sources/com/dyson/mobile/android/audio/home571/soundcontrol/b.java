package com.dyson.mobile.android.audio.home571.soundcontrol;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import cn.f;
import cn.g;
import cn.j;
import com.dyson.mobile.android.R;
import dk.a1;
import fm1.o0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pa.c;
import q8.t;
import vj.f;
import we1.a;
import x12.r;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/audio/home571/soundcontrol/b;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class b extends Fragment {

    /* renamed from: g  reason: collision with root package name */
    public static final a f12687g = new a(null);
    public j d;
    public g e;

    /* renamed from: f  reason: collision with root package name */
    public final C0355b f12688f = new C0355b();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/audio/home571/soundcontrol/b$b", "Lcn/f;", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.audio.home571.soundcontrol.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0355b implements f {
        public C0355b() {
        }

        @Override // cn.f
        public final void w() {
            g gVar = b.this.e;
            if (gVar != null) {
                gVar.w();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        g gVar = context instanceof g ? (g) context : null;
        if (gVar != null) {
            this.e = gVar;
        } else {
            c.p("Fragment must implement AudioSoundControlNavigator");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a.C2547a c2547a = we1.a.f85708c;
        Bundle arguments = getArguments();
        c2547a.getClass();
        we1.a b13 = a.C2547a.b(arguments);
        b13.f85710b = "Please use newInstance method to create EqualizerFragment";
        String y13 = o0.y("COORDINATOR_ID", b13.a("COORDINATOR_ID"));
        vj.f.f84306m.getClass();
        vj.f a13 = f.a.a(y13);
        if (a13 == null) {
            c.w("Could not initialise the coordinator");
            return;
        }
        gk.a aVar = a13.f84312l;
        aVar.d();
        this.d = aVar.e();
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Lifecycle lifecycle = getLifecycle();
        j jVar = this.d;
        if (jVar == null) {
            r.i("viewModel");
            throw null;
        }
        lifecycle.a(jVar);
        int i13 = a1.f23891x;
        DataBinderMapperImpl dataBinderMapperImpl = q8.g.f66228a;
        a1 a1Var = (a1) t.inflateInternal(layoutInflater, R.layout.item_sound_control_equalizer, viewGroup, false, null);
        a1Var.getClass();
        j jVar2 = this.d;
        if (jVar2 == null) {
            r.i("viewModel");
            throw null;
        }
        a1Var.l(jVar2);
        j jVar3 = this.d;
        if (jVar3 == null) {
            r.i("viewModel");
            throw null;
        }
        jVar3.f11803n.setValue(jVar3, j.f11793u[0], this.f12688f);
        View root = a1Var.getRoot();
        root.getClass();
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        Lifecycle lifecycle = getLifecycle();
        j jVar = this.d;
        if (jVar != null) {
            lifecycle.c(jVar);
        } else {
            r.i("viewModel");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/audio/home571/soundcontrol/b$a;", "", "<init>", "()V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
