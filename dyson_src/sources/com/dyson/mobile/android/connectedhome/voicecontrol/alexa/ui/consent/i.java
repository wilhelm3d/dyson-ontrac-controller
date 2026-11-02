package com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.consent;

import android.net.Uri;
import com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.consent.e;
/* loaded from: classes2.dex */
public final class i implements e.a {

    /* renamed from: a  reason: collision with root package name */
    public final d00.g f13042a;

    public i(d00.g gVar) {
        this.f13042a = gVar;
    }

    @Override // com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.consent.e.a
    public final e a(Uri uri) {
        d00.g gVar = this.f13042a;
        return new e(uri, gVar.f22461a.get(), gVar.f22462b.get(), gVar.f22463c.get(), gVar.d.get(), gVar.e.get());
    }
}
