package com.dyson.mobile.android.audio.home.audiosource;

import i12.q0;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lj.a;
import nj.oe;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/audio/home/audiosource/a;", "", "<init>", "()V", "a", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a {
    static {
        new C0340a(null);
    }

    public static ij.b a(String str) {
        int i13 = oe.f57636a;
        ij.b bVar = new ij.b("wearable_ec.instant_control.audio_source_selection", null, 2, null);
        if (str != null) {
            LinkedHashMap m13 = q0.m(bVar.f41701b);
            a.s.f52191a.getClass();
            m13.put(a.s.f52192b, str);
            return ij.b.a(bVar, m13);
        }
        return bVar;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/dyson/mobile/android/audio/home/audiosource/a$a;", "", "<init>", "()V", "", "SCREEN_STATE_DISCONNECTED", "Ljava/lang/String;", "SCREEN_STATE_NO_SOURCES", "SCREEN_STATE_CABLE_CONNECTED", "SCREEN_STATE_UPDATE_REQUIRED", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.audio.home.audiosource.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0340a {
        public /* synthetic */ C0340a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0340a() {
        }
    }
}
