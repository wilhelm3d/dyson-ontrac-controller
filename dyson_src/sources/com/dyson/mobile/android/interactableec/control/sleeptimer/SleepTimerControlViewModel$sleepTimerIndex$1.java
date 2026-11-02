package com.dyson.mobile.android.interactableec.control.sleeptimer;

import androidx.databinding.ObservableInt;
import kotlin.Metadata;
import rf0.i0;
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/interactableec/control/sleeptimer/SleepTimerControlViewModel$sleepTimerIndex$1", "Landroidx/databinding/ObservableInt;", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SleepTimerControlViewModel$sleepTimerIndex$1 extends ObservableInt {
    public final /* synthetic */ SleepTimerControlViewModel e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepTimerControlViewModel$sleepTimerIndex$1(SleepTimerControlViewModel sleepTimerControlViewModel) {
        super(0);
        this.e = sleepTimerControlViewModel;
    }

    @Override // androidx.databinding.ObservableInt
    public final void l(int i13) {
        SleepTimerControlViewModel sleepTimerControlViewModel = this.e;
        sleepTimerControlViewModel.f14403i = i13;
        sleepTimerControlViewModel.f14409o.m(i0.D6);
        sleepTimerControlViewModel.f14407m.m(true);
        sleepTimerControlViewModel.S(i13);
    }
}
