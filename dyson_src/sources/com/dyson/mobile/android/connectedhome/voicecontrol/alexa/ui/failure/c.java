package com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.failure;

import com.dyson.mobile.android.connectedhome.voicecontrol.alexa.AlexaError;
import com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.failure.b;
/* loaded from: classes2.dex */
public final class c implements b.a {

    /* renamed from: a  reason: collision with root package name */
    public final e00.c f13060a;

    public c(e00.c cVar) {
        this.f13060a = cVar;
    }

    @Override // com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.failure.b.a
    public final b a(AlexaError alexaError) {
        e00.c cVar = this.f13060a;
        return new b(cVar.f25409a.get(), cVar.f25410b.get(), alexaError);
    }
}
