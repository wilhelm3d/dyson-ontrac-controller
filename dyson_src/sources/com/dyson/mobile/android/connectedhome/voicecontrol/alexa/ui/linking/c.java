package com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.linking;

import com.dyson.mobile.android.connectedhome.voicecontrol.alexa.parser.AlexaAuthResult;
import com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.linking.b;
/* loaded from: classes2.dex */
public final class c implements b.InterfaceC0390b {

    /* renamed from: a  reason: collision with root package name */
    public final g00.c f13128a;

    public c(g00.c cVar) {
        this.f13128a = cVar;
    }

    @Override // com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.linking.b.InterfaceC0390b
    public final b a(AlexaAuthResult.AlexaAuthArgs alexaAuthArgs) {
        g00.c cVar = this.f13128a;
        return new b(cVar.f32610a.get(), cVar.f32611b.get(), cVar.f32612c.get(), alexaAuthArgs);
    }
}
