package com.dyson.mobile.android.audio.home.audiosource;

import kotlin.Metadata;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/audio/home/audiosource/d;", "", "Lpf0/c;", "localisationManager", "<init>", "(Lpf0/c;)V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final pf0.c f12396a;

    /* loaded from: classes2.dex */
    public static final /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f12397a;

        static {
            int[] iArr = new int[ap.d.values().length];
            try {
                iArr[ap.d.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ap.d.CANCELED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ap.d.NO_PAIRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ap.d.AUTH_ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ap.d.BLUETOOTH_FAILURE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ap.d.IGNORED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ap.d.UNKNOWN_ERROR.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f12397a = iArr;
        }
    }

    static {
        int i13 = pf0.c.d;
    }

    public d(pf0.c cVar) {
        cVar.getClass();
        this.f12396a = cVar;
    }
}
