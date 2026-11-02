package com.dyson.mobile.android.machine.ui.settings.name;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import com.dyson.mobile.android.machine.ui.settings.name.MachineNamingExtras;
import com.dyson.mobile.android.machinetype.MachineCategory;
import com.dyson.mobile.android.resources.viewmodel.name.NamingConfig;
import nj.n7;
import rf0.g0;
import rf0.i0;
import y9.w;
/* loaded from: classes3.dex */
public abstract class i extends pt0.b<MachineNamingExtras, j> {
    public String e;

    /* renamed from: f  reason: collision with root package name */
    public String f15470f;

    /* renamed from: g  reason: collision with root package name */
    public String f15471g;

    /* renamed from: h  reason: collision with root package name */
    public MachineCategory f15472h;

    @Override // pt0.b, gu0.f
    public final void h(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("RESULT_CODE", "MACHINE_NAME");
        bundle.putString("NEW_NAME", str);
        ((bt0.f) getActivity()).j1(bundle);
    }

    @Override // pt0.b, gu0.d
    public final void n(String str) {
        NamingConfig namingConfig = new NamingConfig(str, new MachineNamingExtras.ReturnName(this.e, this.f15470f, this.f15471g, this.f15472h));
        a.f15435f.getClass();
        a aVar = new a();
        Bundle bundle = new Bundle();
        bundle.putParcelable("CONFIG", namingConfig);
        aVar.setArguments(bundle);
        bt0.f fVar = (bt0.f) getActivity();
        MachineCategory machineCategory = this.f15472h;
        fVar.d1(aVar, (machineCategory == MachineCategory.EC || machineCategory == MachineCategory.LIGHTING) ? w().d(i0.I9) : w().d(g0.f71500r2), null, null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menu.clear();
        zs0.i.a(menu);
        super.onCreateOptionsMenu(menu, menuInflater);
    }

    @Override // pt0.b, androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        setHasOptionsMenu(true);
        return onCreateView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        int i13 = n7.f57613a;
        w.t("machine.name.list", null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pt0.b
    public void v(Bundle bundle) {
        super.v(bundle);
        this.e = ((MachineNamingExtras) this.d.f15910f).l();
        this.f15470f = ((MachineNamingExtras) this.d.f15910f).k();
        this.f15471g = ((MachineNamingExtras) this.d.f15910f).i();
        this.f15472h = ((MachineNamingExtras) this.d.f15910f).j();
    }

    public abstract pf0.c w();
}
