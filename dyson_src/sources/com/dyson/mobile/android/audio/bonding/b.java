package com.dyson.mobile.android.audio.bonding;

import com.dyson.mobile.android.audio.bonding.c;
import ma.e;
import xj.q;
import z50.g;
/* loaded from: classes2.dex */
public final class b {

    /* loaded from: classes2.dex */
    public static final /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f12364a;

        static {
            int[] iArr = new int[g.values().length];
            try {
                iArr[g.BONDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.BONDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g.NOT_BONDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[g.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f12364a = iArr;
        }
    }

    public static final c a(g gVar) {
        gVar.getClass();
        int i13 = a.f12364a[gVar.ordinal()];
        if (i13 != 1) {
            if (i13 != 2) {
                if (i13 != 3) {
                    if (i13 == 4) {
                        return c.d.f12368a;
                    }
                    e.o();
                    return null;
                }
                return new c.C0339c(q.NOT_STARTED);
            }
            return c.b.f12366a;
        }
        return c.a.f12365a;
    }
}
