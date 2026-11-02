package com.dyson.mobile.android.connectedhome.voicecontrol.tmall.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import bt0.b;
import bt0.c;
import bt0.f;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.machinetype.MachineDefinition;
import h12.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kz.a;
import rf0.h0;
import v00.a;
import we1.a;
import x12.r;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/tmall/ui/TmallVoiceControlActivity;", "Lbt0/f;", "Lbt0/c;", "<init>", "()V", "a", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TmallVoiceControlActivity extends f<c> {

    /* renamed from: r  reason: collision with root package name */
    public static final a f13254r = new a(null);

    /* renamed from: p  reason: collision with root package name */
    public pf0.c f13255p;

    /* renamed from: q  reason: collision with root package name */
    public MachineDefinition f13256q;

    @Override // androidx.core.app.ComponentActivity
    public final void R0() {
        setResult(-2);
        finish();
        overridePendingTransition(R.anim.stay, R.anim.slide_out_up);
    }

    @Override // bt0.f
    public final bt0.a i1() {
        return new b(null, 1, null);
    }

    @Override // bt0.f, f.g, android.app.Activity
    @e
    public final void onBackPressed() {
        j1(null);
        overridePendingTransition(R.anim.stay, R.anim.slide_out_right);
    }

    @Override // bt0.f, bt0.g, androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        kz.a.f50192c.getClass();
        this.f13255p = a.C1547a.a(this).f50194b.f55380b.get();
        super.onCreate(bundle);
        if (cd.b.J(this)) {
            return;
        }
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Voice Control cannot be started without machine definition";
        Object a14 = k7.b.a(a13.a("EXTRA_MACHINE_DEFINITION"), "EXTRA_MACHINE_DEFINITION", MachineDefinition.class);
        if (a14 == null) {
            pa.c.w("EXTRA_MACHINE_DEFINITION was null");
            return;
        }
        this.f13256q = (MachineDefinition) ((Parcelable) a14);
        e1();
        overridePendingTransition(R.anim.slide_in_right, R.anim.stay);
    }

    @Override // bt0.f, l.b, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        a.C2443a c2443a = v00.a.f82909g;
        MachineDefinition machineDefinition = this.f13256q;
        if (machineDefinition == null) {
            r.i("machineDefinition");
            throw null;
        }
        c2443a.getClass();
        v00.a aVar = new v00.a();
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("MACHINE_DEFINITION", machineDefinition);
        aVar.setArguments(bundle2);
        pf0.c cVar = this.f13255p;
        if (cVar != null) {
            o1(aVar, cVar.d(h0.f71540a), null, null);
        } else {
            r.i("localisationManager");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/tmall/ui/TmallVoiceControlActivity$a;", "", "<init>", "()V", "", "EXTRA_MACHINE_DEFINITION", "Ljava/lang/String;", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static Intent a(androidx.fragment.app.e eVar, MachineDefinition machineDefinition) {
            machineDefinition.getClass();
            Intent putExtra = new Intent(eVar, TmallVoiceControlActivity.class).putExtra("EXTRA_MACHINE_DEFINITION", machineDefinition).putExtra("extraTheme", 2132083510);
            putExtra.getClass();
            return putExtra;
        }

        private a() {
        }
    }
}
