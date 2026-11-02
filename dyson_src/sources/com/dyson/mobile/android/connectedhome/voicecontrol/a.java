package com.dyson.mobile.android.connectedhome.voicecontrol;

import androidx.lifecycle.ViewModelProvider;
import com.dyson.mobile.android.connectedhome.voicecontrol.alexa.AlexaError;
import com.dyson.mobile.android.connectedhome.voicecontrol.alexa.parser.AlexaAuthResult;
import kotlin.Metadata;
import m9.o;
import m9.u;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/a;", "Lm9/u;", "Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/parser/a;", "alexaAuthResultParser", "<init>", "(Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/parser/a;)V", "a", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a extends u {
    public final com.dyson.mobile.android.connectedhome.voicecontrol.alexa.parser.a d;
    public final o<Boolean> e;

    /* renamed from: f  reason: collision with root package name */
    public final o f13004f;

    /* renamed from: g  reason: collision with root package name */
    public final xf1.a<AlexaAuthResult.AlexaAuthArgs> f13005g;

    /* renamed from: h  reason: collision with root package name */
    public final xf1.a<AlexaError> f13006h;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/voicecontrol/a$a;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/parser/a;", "alexaAuthResultParser", "<init>", "(Lcom/dyson/mobile/android/connectedhome/voicecontrol/alexa/parser/a;)V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.connectedhome.voicecontrol.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0380a implements ViewModelProvider.Factory {

        /* renamed from: a  reason: collision with root package name */
        public final com.dyson.mobile.android.connectedhome.voicecontrol.alexa.parser.a f13007a;

        public C0380a(com.dyson.mobile.android.connectedhome.voicecontrol.alexa.parser.a aVar) {
            aVar.getClass();
            this.f13007a = aVar;
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public final <T extends u> T create(Class<T> cls) {
            cls.getClass();
            return new a(this.f13007a);
        }
    }

    public a(com.dyson.mobile.android.connectedhome.voicecontrol.alexa.parser.a aVar) {
        aVar.getClass();
        this.d = aVar;
        o<Boolean> oVar = new o<>(Boolean.TRUE);
        this.e = oVar;
        this.f13004f = oVar;
        this.f13005g = new xf1.a<>();
        this.f13006h = new xf1.a<>();
    }

    public final void S(boolean z13) {
        this.e.setValue(Boolean.valueOf(z13));
    }
}
