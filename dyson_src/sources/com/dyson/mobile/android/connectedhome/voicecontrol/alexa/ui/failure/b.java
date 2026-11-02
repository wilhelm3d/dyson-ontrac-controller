package com.dyson.mobile.android.connectedhome.voicecontrol.alexa.ui.failure;

import com.dyson.mobile.android.R;
import com.dyson.mobile.android.connectedhome.voicecontrol.alexa.AlexaError;
import h12.f0;
import h12.p;
import hj.e;
import i12.p0;
import kotlin.Metadata;
import lj.a;
import m9.u;
import nj.ic;
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/ui/failure/b;", "Lm9/u;", "Lhj/e;", "trackingManager", "Lpf0/c;", "localisationManager", "Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/AlexaError;", "alexaError", "<init>", "(Lhj/e;Lpf0/c;Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/AlexaError;)V", "a", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class b extends u {
    public final xf1.a<f0> d;
    public final String e;

    @wy1.a
    /* loaded from: classes2.dex */
    public interface a {
        b a(AlexaError alexaError);
    }

    public b(e eVar, pf0.c cVar, AlexaError alexaError) {
        eVar.getClass();
        cVar.getClass();
        alexaError.getClass();
        int i13 = ic.f57534a;
        ij.b bVar = new ij.b("voice_control.alexa.link_error", null, 2, null);
        a.C1598a.f52137a.getClass();
        eVar.h(bVar, p0.c(new p(a.C1598a.f52138b, alexaError.getAnalyticsParameter())));
        this.d = new xf1.a<>();
        this.e = cVar.c(R.string.voiceControl_alexa_title);
    }
}
