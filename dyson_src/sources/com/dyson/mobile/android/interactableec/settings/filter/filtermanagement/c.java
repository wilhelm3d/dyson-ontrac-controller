package com.dyson.mobile.android.interactableec.settings.filter.filtermanagement;

import androidx.databinding.ObservableInt;
import com.dyson.mobile.android.localisation.LocalisationKey;
import e22.m;
import jz1.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.u;
import mz1.j;
import q8.n;
import x12.p0;
import x12.y;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/interactableec/settings/filter/filtermanagement/c;", "Lm9/u;", "<init>", "()V", "a", "b", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class c extends u {

    /* renamed from: i  reason: collision with root package name */
    public static final /* synthetic */ m<Object>[] f14705i = {p0.f86717a.f(new y(c.class, "navigator", "getNavigator()Lcom/dyson/mobile/android/interactableec/settings/filter/filtermanagement/ECFilterResetStatusViewModel$Navigator;", 0))};
    public j e;
    public final tf1.a d = new tf1.a(null, 1, null);

    /* renamed from: f  reason: collision with root package name */
    public final ObservableInt f14706f = new ObservableInt(4);

    /* renamed from: g  reason: collision with root package name */
    public final ObservableInt f14707g = new ObservableInt(0);

    /* renamed from: h  reason: collision with root package name */
    public final n<LocalisationKey> f14708h = new n<>();

    /* loaded from: classes2.dex */
    public interface b {
        void dismiss();

        void m();
    }

    static {
        new a(null);
    }

    public final b S() {
        return (b) this.d.getValue(this, f14705i[0]);
    }

    @Override // m9.u
    public final void onCleared() {
        super.onCleared();
        b S = S();
        if (S != null) {
            S.dismiss();
        }
        j jVar = this.e;
        if (jVar != null) {
            d.dispose(jVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/interactableec/settings/filter/filtermanagement/c$a;", "", "<init>", "()V", "", "SUCCESSFUL_RESET_DELAY_SECONDS", "J", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
