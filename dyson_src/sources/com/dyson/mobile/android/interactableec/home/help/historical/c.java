package com.dyson.mobile.android.interactableec.home.help.historical;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.Fragment;
import com.dyson.mobile.android.R;
import fm1.o0;
import hj.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import na0.c0;
import nj.c4;
import q8.t;
import w90.g;
import we1.a;
import x12.r;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/interactableec/home/help/historical/c;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class c extends Fragment {
    public static final a e = new a(null);
    public hj.e d;

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        a.C2547a c2547a = we1.a.f85708c;
        Bundle arguments = getArguments();
        c2547a.getClass();
        we1.a b13 = a.C2547a.b(arguments);
        b13.f85710b = "Please use newInstance method to create HistoricalHumidityHelpFragment";
        String y13 = o0.y("COORDINATOR_ID", b13.a("COORDINATOR_ID"));
        g.f85506o.getClass();
        g a13 = g.a.a(y13);
        if (a13 != null) {
            this.d = a13.f85510j.e.get();
        } else {
            pa.c.w("Could not initialise the coordinator");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        int i13 = c0.f56206f;
        DataBinderMapperImpl dataBinderMapperImpl = q8.g.f66228a;
        View root = ((c0) t.inflateInternal(layoutInflater, R.layout.fragment_historical_humidity_help, viewGroup, false, null)).getRoot();
        root.getClass();
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        String analyticsKey = wa0.c.HUMIDITY.getAnalyticsKey();
        if (analyticsKey != null) {
            hj.e eVar = this.d;
            if (eVar == null) {
                r.i("trackingManager");
                throw null;
            }
            ij.b a13 = c4.a(analyticsKey);
            e.a aVar = hj.e.f38312g;
            eVar.h(a13, null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/interactableec/home/help/historical/c$a;", "", "<init>", "()V", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
