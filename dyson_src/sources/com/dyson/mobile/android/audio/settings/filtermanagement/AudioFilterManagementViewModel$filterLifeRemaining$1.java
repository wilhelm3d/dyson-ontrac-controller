package com.dyson.mobile.android.audio.settings.filtermanagement;

import androidx.databinding.ObservableInt;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/audio/settings/filtermanagement/AudioFilterManagementViewModel$filterLifeRemaining$1", "Landroidx/databinding/ObservableInt;", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AudioFilterManagementViewModel$filterLifeRemaining$1 extends ObservableInt {
    public final /* synthetic */ AudioFilterManagementViewModel e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioFilterManagementViewModel$filterLifeRemaining$1(AudioFilterManagementViewModel audioFilterManagementViewModel) {
        super(0);
        this.e = audioFilterManagementViewModel;
    }

    @Override // androidx.databinding.ObservableInt
    public final void l(int i13) {
        super.l(i13);
        this.e.f12776q.l(i13 * 100);
    }
}
