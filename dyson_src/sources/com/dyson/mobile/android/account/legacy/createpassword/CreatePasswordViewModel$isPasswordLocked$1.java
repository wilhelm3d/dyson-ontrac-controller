package com.dyson.mobile.android.account.legacy.createpassword;

import androidx.databinding.ObservableBoolean;
import kotlin.Metadata;
import qh.b;
@Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/account/legacy/createpassword/CreatePasswordViewModel$isPasswordLocked$1", "Landroidx/databinding/ObservableBoolean;", "mod-user-login"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CreatePasswordViewModel$isPasswordLocked$1 extends ObservableBoolean {
    public final /* synthetic */ CreatePasswordViewModel e;

    public CreatePasswordViewModel$isPasswordLocked$1(CreatePasswordViewModel createPasswordViewModel) {
        this.e = createPasswordViewModel;
    }

    @Override // androidx.databinding.ObservableBoolean
    public final boolean l() {
        b a13 = this.e.a();
        return ((Boolean) a13.f66839m.getValue(a13, b.f66831p[8])).booleanValue();
    }

    @Override // androidx.databinding.ObservableBoolean
    public final void m(boolean z13) {
        super.m(z13);
        b a13 = this.e.a();
        a13.f66839m.b(a13, b.f66831p[8], Boolean.valueOf(z13));
    }
}
