package com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.lwa;

import android.net.Uri;
import com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.lwa.b;
/* loaded from: classes2.dex */
public final class c implements b.c {

    /* renamed from: a  reason: collision with root package name */
    public final h00.c f13164a;

    public c(h00.c cVar) {
        this.f13164a = cVar;
    }

    @Override // com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.lwa.b.c
    public final b a(Uri uri) {
        h00.c cVar = this.f13164a;
        return new b(cVar.f36674a.get(), cVar.f36675b.get(), cVar.f36676c.get(), uri);
    }
}
