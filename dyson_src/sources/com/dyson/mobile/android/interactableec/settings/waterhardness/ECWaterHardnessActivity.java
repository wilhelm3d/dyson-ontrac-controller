package com.dyson.mobile.android.interactableec.settings.waterhardness;

import android.content.Intent;
import android.os.Bundle;
import bt0.c;
import bt0.f;
import cd.b;
import com.dyson.mobile.android.interactableec.settings.waterhardness.a;
import fm1.o0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pa0.t0;
import pl0.e;
import rf0.l;
import w90.g;
import we1.a;
import x12.r;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/interactableec/settings/waterhardness/ECWaterHardnessActivity;", "Lbt0/f;", "Lbt0/c;", "<init>", "()V", "a", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ECWaterHardnessActivity extends f<c> {

    /* renamed from: r  reason: collision with root package name */
    public static final a f14709r = new a(null);

    /* renamed from: p  reason: collision with root package name */
    public g f14710p;

    /* renamed from: q  reason: collision with root package name */
    public pf0.c f14711q;

    @Override // bt0.f
    public final bt0.a i1() {
        return new e();
    }

    @Override // bt0.f, bt0.g, androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (b.J(this)) {
            return;
        }
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Please use the newInstance method";
        String y13 = o0.y("COORDINATOR_ID", a13.a("COORDINATOR_ID"));
        g.f85506o.getClass();
        g a14 = g.a.a(y13);
        if (a14 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        this.f14710p = a14;
        this.f14711q = t0.b(a14.f85510j.f59825a);
    }

    @Override // bt0.f, l.b, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        a.C0490a c0490a = com.dyson.mobile.android.interactableec.settings.waterhardness.a.f14712h;
        g gVar = this.f14710p;
        if (gVar == null) {
            r.i("coordinator");
            throw null;
        }
        String str = gVar.f85509i;
        c0490a.getClass();
        str.getClass();
        com.dyson.mobile.android.interactableec.settings.waterhardness.a aVar = new com.dyson.mobile.android.interactableec.settings.waterhardness.a();
        Bundle bundle2 = new Bundle();
        bundle2.putString("COORDINATOR_ID", str);
        aVar.setArguments(bundle2);
        pf0.c cVar = this.f14711q;
        if (cVar != null) {
            o1(aVar, cVar.d(l.J), null, null);
        } else {
            r.i("localisationManager");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/interactableec/settings/waterhardness/ECWaterHardnessActivity$a;", "", "<init>", "()V", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
