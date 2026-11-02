package com.dyson.mobile.android.robot.newsystem.common.model;

import java.util.Iterator;
import nu0.l;
/* loaded from: classes3.dex */
public final class b {

    /* loaded from: classes3.dex */
    public static final /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f16311a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f16312b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f16313c;
        public static final /* synthetic */ int[] d;
        public static final /* synthetic */ int[] e;

        /* renamed from: f  reason: collision with root package name */
        public static final /* synthetic */ int[] f16314f;

        /* renamed from: g  reason: collision with root package name */
        public static final /* synthetic */ int[] f16315g;

        /* renamed from: h  reason: collision with root package name */
        public static final /* synthetic */ int[] f16316h;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.VACUUM_AND_MOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.VACUUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.MOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c.VACUUM_THEN_MOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f16311a = iArr;
            int[] iArr2 = new int[nu0.c.values().length];
            try {
                iArr2[nu0.c.VACUUM_AND_MOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[nu0.c.VACUUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[nu0.c.MOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[nu0.c.VACUUM_THEN_MOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f16312b = iArr2;
            int[] iArr3 = new int[d.values().length];
            try {
                iArr3[d.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[d.QUICK.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[d.QUIET.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[d.BOOST.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            f16313c = iArr3;
            int[] iArr4 = new int[ky0.d.values().length];
            try {
                iArr4[ky0.d.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[ky0.d.QUICK.ordinal()] = 2;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[ky0.d.QUIET.ordinal()] = 3;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr4[ky0.d.BOOST.ordinal()] = 4;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr4[ky0.d.MIXED.ordinal()] = 5;
            } catch (NoSuchFieldError unused17) {
            }
            d = iArr4;
            int[] iArr5 = new int[e.values().length];
            try {
                iArr5[e.VERY_LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr5[e.LOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr5[e.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr5[e.HIGH.ordinal()] = 4;
            } catch (NoSuchFieldError unused21) {
            }
            e = iArr5;
            int[] iArr6 = new int[l.values().length];
            try {
                iArr6[l.VERY_LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr6[l.LOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr6[l.MEDIUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr6[l.HIGH.ordinal()] = 4;
            } catch (NoSuchFieldError unused25) {
            }
            f16314f = iArr6;
            int[] iArr7 = new int[com.dyson.mobile.android.robot.newsystem.common.model.a.values().length];
            try {
                iArr7[com.dyson.mobile.android.robot.newsystem.common.model.a.ONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr7[com.dyson.mobile.android.robot.newsystem.common.model.a.TWO.ordinal()] = 2;
            } catch (NoSuchFieldError unused27) {
            }
            f16315g = iArr7;
            int[] iArr8 = new int[nu0.a.values().length];
            try {
                iArr8[nu0.a.ONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr8[nu0.a.TWO.ordinal()] = 2;
            } catch (NoSuchFieldError unused29) {
            }
            f16316h = iArr8;
        }
    }

    public static final com.dyson.mobile.android.robot.newsystem.common.model.a a(int i13) {
        Object obj;
        Iterator<E> it = nu0.a.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (i13 == ((nu0.a) obj).getApiValue()) {
                break;
            }
        }
        nu0.a aVar = (nu0.a) obj;
        if (aVar == null) {
            aVar = nu0.a.ONE;
        }
        int i14 = a.f16316h[aVar.ordinal()];
        if (i14 != 1) {
            if (i14 == 2) {
                return com.dyson.mobile.android.robot.newsystem.common.model.a.TWO;
            }
            ma.e.o();
            return null;
        }
        return com.dyson.mobile.android.robot.newsystem.common.model.a.ONE;
    }

    public static final c b(nu0.c cVar) {
        cVar.getClass();
        int i13 = a.f16312b[cVar.ordinal()];
        if (i13 != 1) {
            if (i13 != 2) {
                if (i13 != 3) {
                    if (i13 == 4) {
                        return c.VACUUM_THEN_MOP;
                    }
                    ma.e.o();
                    return null;
                }
                return c.MOP;
            }
            return c.VACUUM;
        }
        return c.VACUUM_AND_MOP;
    }
}
