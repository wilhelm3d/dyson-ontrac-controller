package c60;

import c60.a;
import com.dyson.mobile.android.logging.Logger;
import e60.a;
import e60.e;
/* loaded from: classes2.dex */
public class c {
    public static a a(byte b13) {
        byte[] bArr = in0.b.f42331a;
        if (b13 != 4) {
            if (b13 != 6) {
                if (b13 != 10 && b13 != 12) {
                    if (b13 != 64 && b13 != 70 && b13 != 81) {
                        Logger.b("Unknown typeId: " + ((int) b13), null);
                        return null;
                    }
                }
            }
            a.C0281a c0281a = new a.C0281a();
            c0281a.f10434a = e.f26071a;
            c0281a.f10435b = e.a.f26072a;
            c0281a.f10436c = b13;
            c0281a.d = bArr;
            c0281a.e = 2;
            return c0281a.a();
        }
        a.C0281a c0281a2 = new a.C0281a();
        c0281a2.f10434a = e60.a.f26064b;
        c0281a2.f10435b = a.C0902a.f26066a;
        c0281a2.f10436c = b13;
        c0281a2.d = bArr;
        c0281a2.e = 2;
        return c0281a2.a();
    }

    public static a b(byte b13, byte[] bArr) {
        if (b13 == 1 || b13 == 2 || b13 == 3 || b13 == 6 || b13 == 8 || b13 == 14) {
            a.C0281a c0281a = new a.C0281a();
            c0281a.f10434a = e60.a.f26064b;
            c0281a.f10435b = a.C0902a.f26066a;
            c0281a.f10436c = b13;
            c0281a.d = bArr;
            c0281a.e = 2;
            return c0281a.a();
        } else if (b13 != 48 && b13 != 50 && b13 != 66 && b13 != 68 && b13 != 80) {
            Logger.b("Unknown typeId: " + ((int) b13), null);
            return null;
        } else {
            a.C0281a c0281a2 = new a.C0281a();
            c0281a2.f10434a = e.f26071a;
            c0281a2.f10435b = e.a.f26072a;
            c0281a2.f10436c = b13;
            c0281a2.d = bArr;
            c0281a2.e = 2;
            return c0281a2.a();
        }
    }
}
