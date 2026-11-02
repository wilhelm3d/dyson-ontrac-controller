package com.dyson.mobile.android.connectionjourney.addbyserial;

import android.annotation.SuppressLint;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.f;
import com.brightcove.player.C;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.connectionjourney.nonconnected.scanserial.ScannedSerialError;
import h12.f0;
import hx.v;
import k30.e;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import u3.p1;
/* loaded from: classes2.dex */
public final class d {

    /* loaded from: classes2.dex */
    public static final /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f13265a;

        static {
            int[] iArr = new int[ScannedSerialError.values().length];
            try {
                iArr[ScannedSerialError.UNSUPPORTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScannedSerialError.INVALID_BARCODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ScannedSerialError.INVALID_QR_CODE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ScannedSerialError.ALREADY_ADDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f13265a = iArr;
        }
    }

    @SuppressLint({"FunctionCallWithoutNamedArguments"})
    public static final void a(ScannedSerialError scannedSerialError, e eVar, Function2<? super String, ? super Boolean, f0> function2, w12.a<f0> aVar, w12.a<f0> aVar2, Function1<? super com.dyson.mobile.android.connectionjourney.nonconnected.scanserial.a, f0> function1, w12.a<f0> aVar3, w12.a<f0> aVar4, boolean z13, boolean z14, Composer composer, int i13, int i14) {
        int i15;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        boolean z15;
        int i16;
        boolean z16;
        int i17;
        boolean z17;
        NewScannedSerialError newScannedSerialError;
        function2.getClass();
        aVar.getClass();
        aVar2.getClass();
        function1.getClass();
        aVar3.getClass();
        aVar4.getClass();
        androidx.compose.runtime.a k13 = composer.k(-2100361646);
        if ((i13 & 6) == 0) {
            i15 = (k13.f(scannedSerialError == null ? -1 : scannedSerialError.ordinal()) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= k13.Q(eVar) ? 32 : 16;
        }
        if ((i13 & MLKEMEngine.KyberPolyBytes) == 0) {
            obj = function2;
            i15 |= k13.D(obj) ? 256 : 128;
        } else {
            obj = function2;
        }
        if ((i13 & 3072) == 0) {
            obj2 = aVar;
            i15 |= k13.D(obj2) ? 2048 : 1024;
        } else {
            obj2 = aVar;
        }
        if ((i13 & 24576) == 0) {
            obj3 = aVar2;
            i15 |= k13.D(obj3) ? 16384 : C.DASH_ROLE_ALTERNATE_FLAG;
        } else {
            obj3 = aVar2;
        }
        if ((196608 & i13) == 0) {
            i15 |= k13.D(function1) ? C.DASH_ROLE_COMMENTARY_FLAG : C.DASH_ROLE_SUPPLEMENTARY_FLAG;
        }
        if ((1572864 & i13) == 0) {
            obj4 = aVar3;
            i15 |= k13.D(obj4) ? 1048576 : 524288;
        } else {
            obj4 = aVar3;
        }
        int i18 = i14 & 256;
        if (i18 != 0) {
            i16 = i15 | 100663296;
            z15 = z13;
        } else {
            z15 = z13;
            i16 = i15 | (k13.c(z15) ? 67108864 : 33554432);
        }
        int i19 = i14 & 512;
        if (i19 != 0) {
            i17 = i16 | 805306368;
            z16 = z14;
        } else {
            z16 = z14;
            i17 = i16 | (k13.c(z16) ? 536870912 : 268435456);
        }
        int i23 = i17;
        if (k13.t(i23 & 1, (i17 & 306783379) != 306783378)) {
            boolean z18 = i18 != 0 ? true : z15;
            boolean z19 = i19 != 0 ? false : z16;
            p1 p1Var = androidx.compose.runtime.b.f3172a;
            z15 = z18;
            boolean z23 = z19;
            int i24 = i23 << 3;
            qs0.c.a(v.T(R.string.connectionJourney_addSerialNumber_navigationTitle, 0, k13), "connectionJourney.cameraScanView", null, null, obj2, obj3, null, c4.d.c(-1063734524, new ed1.e(function1, eVar, obj, aVar4, z18, z19), k13), k13, (57344 & i24) | 12582960 | (i24 & 458752), 76);
            if (scannedSerialError != null) {
                int i25 = a.f13265a[scannedSerialError.ordinal()];
                if (i25 == 1) {
                    newScannedSerialError = NewScannedSerialError.MACHINE_NOT_COMPATIBLE;
                } else if (i25 == 2) {
                    newScannedSerialError = NewScannedSerialError.NOT_RECOGNIZED_BARCODE;
                } else if (i25 == 3) {
                    newScannedSerialError = NewScannedSerialError.NOT_RECOGNIZED_QRCODE;
                } else if (i25 != 4) {
                    ma.e.o();
                    return;
                } else {
                    newScannedSerialError = NewScannedSerialError.MACHINE_ALREADY_ADDED;
                }
            } else {
                newScannedSerialError = null;
            }
            if (newScannedSerialError == null) {
                k13.R(1507003245);
                k13.a0(false);
            } else {
                k13.R(1507003246);
                k91.b.a(v.T(newScannedSerialError.getTitle(), 0, k13), v.T(newScannedSerialError.getDescription(), 0, k13), v.T(R.string.button_tryAgain, 0, k13), obj4, null, null, null, null, null, k13, (i23 >> 9) & 7168, 496);
                k13.a0(false);
            }
            z17 = z23;
        } else {
            k13.J();
            z17 = z16;
        }
        f c03 = k13.c0();
        if (c03 != null) {
            c03.d = new bx1.b(scannedSerialError, eVar, function2, aVar, aVar2, function1, aVar3, aVar4, z15, z17, i13, i14);
        }
    }
}
