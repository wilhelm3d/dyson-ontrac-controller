package com.dyson.mobile.android.connectionjourney.bleconnection;

import af1.g;
import b42.m;
import c42.b1;
import c42.r;
import com.dyson.mobile.android.connectionjourney.bleconnection.c;
import h12.f0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import m10.l;
import m10.r1;
import m9.u;
import m9.v;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/bleconnection/f;", "Lm9/u;", "Lm10/l;", "gattConnectionManager", "<init>", "(Lm10/l;)V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class f extends u {
    public final b42.c d;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class a extends x12.a implements Function2<r1, l12.d<? super f0>, Object> {
        public a(Object obj) {
            super(2, obj, f.class, "onStatusChange", "onStatusChange(Lcom/dyson/mobile/android/connectionjourney/bleconnection/GattConnectionStatus;)V", 4);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(r1 r1Var, l12.d<? super f0> dVar) {
            f fVar = (f) this.d;
            fVar.getClass();
            if (b.f13379a[r1Var.ordinal()] == 1) {
                g.a(fVar.d, v.a(fVar), c.f.f13347a);
            }
            return f0.f36844a;
        }
    }

    /* loaded from: classes2.dex */
    public static final /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f13379a;

        static {
            int[] iArr = new int[r1.values().length];
            try {
                iArr[r1.CONNECTION_JOURNEY_FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f13379a = iArr;
        }
    }

    public f(l lVar) {
        lVar.getClass();
        b42.c b13 = m.b(0, null, null, 7);
        this.d = b13;
        r.B(b13);
        r.y(new b1(lVar.f52861i, new a(this)), v.a(this));
    }
}
