package com.dyson.mobile.android.interactableec.control.oscillation;

import androidx.databinding.ObservableInt;
import com.dyson.mobile.android.resources.view.b;
import d22.k;
import d22.p;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/interactableec/control/oscillation/AdvancedOscillationControlViewModel$angleOscillationIndex$1", "Landroidx/databinding/ObservableInt;", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AdvancedOscillationControlViewModel$angleOscillationIndex$1 extends ObservableInt {
    public final /* synthetic */ AdvancedOscillationControlViewModel e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdvancedOscillationControlViewModel$angleOscillationIndex$1(AdvancedOscillationControlViewModel advancedOscillationControlViewModel, int i13) {
        super(i13);
        this.e = advancedOscillationControlViewModel;
    }

    @Override // androidx.databinding.ObservableInt
    public final void l(int i13) {
        super.l(i13);
        AdvancedOscillationControlViewModel advancedOscillationControlViewModel = this.e;
        if (advancedOscillationControlViewModel.T() <= 0) {
            advancedOscillationControlViewModel.f14358s = p.f(advancedOscillationControlViewModel.f14358s, b.f15765b);
        } else if (!advancedOscillationControlViewModel.f14348i && advancedOscillationControlViewModel.T() > 0) {
            b bVar = b.f15764a;
            k kVar = b.f15765b;
            bVar.getClass();
            advancedOscillationControlViewModel.f14358s = b.c(kVar);
        }
        ObservableInt observableInt = advancedOscillationControlViewModel.f14354o;
        int i14 = advancedOscillationControlViewModel.f14358s;
        k f13 = b.f(Integer.valueOf(advancedOscillationControlViewModel.T()));
        observableInt.l(p.f(i14, f13) - f13.d);
        notifyChange();
    }
}
