package f60;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.credentials.playservices.controllers.identityauth.getsigninintent.CredentialProviderGetSignInIntentController;
import com.dyson.mobile.android.interactableec.home.n829.settingstab.location.N829ECSettingsLocationActivity;
import fd0.e;
import fd0.g;
/* loaded from: classes2.dex */
public final /* synthetic */ class w implements iz1.f, iz1.l, sm1.g, ActivityResultCallback, iz1.c {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ w(Object obj, int i13) {
        this.d = i13;
        this.e = obj;
    }

    @Override // iz1.f
    public void accept(Object obj) {
        int i13 = this.d;
        Object obj2 = this.e;
        switch (i13) {
            case 0:
                int i14 = y.f30005j;
                ((v) obj2).invoke(obj);
                return;
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
            default:
                e22.m<Object>[] mVarArr = fe0.f.f30644w;
                ((fe0.c) obj2).invoke(obj);
                return;
            case 5:
                int i15 = y.f30005j;
                ((v) obj2).invoke(obj);
                return;
            case 8:
                byte[] bArr = j0.f29980c;
                ((i0) obj2).invoke(obj);
                return;
            case 12:
                e22.m<Object>[] mVarArr2 = fa0.c.f30408j;
                ((fa0.a) obj2).invoke(obj);
                return;
            case 13:
                e22.m<Object>[] mVarArr3 = fa0.e.f30426k;
                ((fa0.d) obj2).invoke(obj);
                return;
            case 14:
                e22.m<Object>[] mVarArr4 = fa0.f.f30435i;
                ((em0.c) obj2).invoke(obj);
                return;
            case 15:
                e22.m<Object>[] mVarArr5 = fa0.h.f30442k;
                ((fa0.g) obj2).invoke(obj);
                return;
            case 16:
                e22.m<Object>[] mVarArr6 = fa0.k.f30455i;
                ((em0.c) obj2).invoke(obj);
                return;
            case 17:
                e22.m<Object>[] mVarArr7 = fa0.m.f30462j;
                ((fa0.l) obj2).invoke(obj);
                return;
            case 18:
                ((fa0.n) obj2).invoke(obj);
                return;
            case 19:
                int i16 = fa0.t.f30491g;
                ((fa0.s) obj2).invoke(obj);
                return;
            case 20:
                ((fa0.u) obj2).invoke(obj);
                return;
            case 21:
                ((fa0.w) obj2).invoke(obj);
                return;
            case 22:
                e22.m<Object>[] mVarArr8 = fa0.c0.f30416h;
                ((em0.c) obj2).invoke(obj);
                return;
        }
    }

    @Override // iz1.l
    /* renamed from: apply */
    public Object mo7apply(Object obj) {
        int i13 = this.d;
        Object obj2 = this.e;
        switch (i13) {
            case 1:
                int i14 = y.f30005j;
                obj.getClass();
                return (dz1.b0) ((e) obj2).invoke(obj);
            case 2:
                int i15 = y.f30005j;
                obj.getClass();
                return (dz1.b0) ((b31.j) obj2).invoke(obj);
            case 3:
                int i16 = y.f30005j;
                obj.getClass();
                return (dz1.b0) ((a01.g) obj2).invoke(obj);
            case 4:
                int i17 = y.f30005j;
                obj.getClass();
                return (dz1.f) ((dy1.d) obj2).invoke(obj);
            case 6:
                int i18 = y.f30005j;
                obj.getClass();
                return (dz1.b0) ((e) obj2).invoke(obj);
            case 7:
                byte[] bArr = j0.f29980c;
                obj.getClass();
                return (dz1.f) ((i0) obj2).invoke(obj);
            case 9:
                byte[] bArr2 = j0.f29980c;
                obj.getClass();
                return (h0) ((x) obj2).invoke(obj);
            case 10:
                byte[] bArr3 = j0.f29980c;
                obj.getClass();
                return (dz1.b0) ((x) obj2).invoke(obj);
            case 25:
                g.a aVar = fd0.g.e;
                obj.getClass();
                return (wa0.a) ((x) obj2).invoke(obj);
            case 27:
                e22.m<Object>[] mVarArr = fe0.f.f30644w;
                obj.getClass();
                return (dz1.f) ((fe0.c) obj2).invoke(obj);
            case 28:
                e22.m<Object>[] mVarArr2 = fe0.f.f30644w;
                obj.getClass();
                return (dz1.f) ((fe0.c) obj2).invoke(obj);
            default:
                e22.m<Object>[] mVarArr3 = fe0.f.f30644w;
                obj.getClass();
                return (dz1.f) ((fe0.c) obj2).invoke(obj);
        }
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public void e(Object obj) {
        Intent intent;
        Bundle extras;
        Bundle bundle;
        String string;
        N829ECSettingsLocationActivity n829ECSettingsLocationActivity = (N829ECSettingsLocationActivity) this.e;
        ActivityResult activityResult = (ActivityResult) obj;
        N829ECSettingsLocationActivity.a aVar = N829ECSettingsLocationActivity.f14541r;
        activityResult.getClass();
        if (activityResult.d != -1 || (intent = activityResult.e) == null || (extras = intent.getExtras()) == null || (bundle = extras.getBundle("ACTIVITY_RESULT")) == null || !x12.r.c(bundle.getString("RESULT_CODE"), "EXTRA_RESULT_CODE") || (string = bundle.getString("EXTRA_MACHINE_LOCATION")) == null) {
            return;
        }
        if (v32.y.A(string)) {
            string = null;
        }
        if (string != null) {
            com.dyson.mobile.android.interactableec.home.n829.settingstab.location.a c13 = n829ECSettingsLocationActivity.c1();
            z32.g0.r(m9.v.a(c13), null, null, new com.dyson.mobile.android.interactableec.home.n829.settingstab.location.b(c13, string, true, null), 3);
            w90.g gVar = n829ECSettingsLocationActivity.f14547o;
            if (gVar != null) {
                gVar.h(n829ECSettingsLocationActivity);
            } else {
                x12.r.i("coordinator");
                throw null;
            }
        }
    }

    @Override // sm1.g
    public void onSuccess(Object obj) {
        int i13 = CredentialProviderGetSignInIntentController.f4056j;
        ((dy1.d) this.e).invoke(obj);
    }

    @Override // iz1.c
    public Object apply(Object obj, Object obj2) {
        e.a aVar = fd0.e.f30607f;
        obj.getClass();
        obj2.getClass();
        return (wa0.a) ((en.a) this.e).invoke(obj, obj2);
    }
}
