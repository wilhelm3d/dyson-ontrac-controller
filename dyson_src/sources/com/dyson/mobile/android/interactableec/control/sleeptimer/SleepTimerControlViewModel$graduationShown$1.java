package com.dyson.mobile.android.interactableec.control.sleeptimer;

import androidx.databinding.ObservableBoolean;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/interactableec/control/sleeptimer/SleepTimerControlViewModel$graduationShown$1", "Landroidx/databinding/ObservableBoolean;", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SleepTimerControlViewModel$graduationShown$1 extends ObservableBoolean {
    public final /* synthetic */ SleepTimerControlViewModel e;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/interactableec/control/sleeptimer/SleepTimerControlViewModel$graduationShown$1$a", "Ljava/util/TimerTask;", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            SleepTimerControlViewModel$graduationShown$1.this.m(false);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SleepTimerControlViewModel$graduationShown$1(SleepTimerControlViewModel sleepTimerControlViewModel) {
        super(false);
        this.e = sleepTimerControlViewModel;
    }

    @Override // androidx.databinding.ObservableBoolean
    public final void m(boolean z13) {
        super.m(z13);
        if (z13) {
            SleepTimerControlViewModel sleepTimerControlViewModel = this.e;
            Timer timer = sleepTimerControlViewModel.f14404j;
            if (timer != null) {
                timer.cancel();
            }
            sleepTimerControlViewModel.f14404j = null;
            sleepTimerControlViewModel.f14404j = new Timer();
            Timer timer2 = sleepTimerControlViewModel.f14404j;
            if (timer2 != null) {
                timer2.schedule(new a(), 3000L);
            }
        }
    }
}
