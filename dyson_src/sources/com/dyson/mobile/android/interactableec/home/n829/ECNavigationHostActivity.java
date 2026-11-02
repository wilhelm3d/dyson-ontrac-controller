package com.dyson.mobile.android.interactableec.home.n829;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.dyson.mobile.android.interactableec.home.n829.navigation.destination.ECDestination;
import eb0.k;
import f.j;
import f.x;
import fm1.o0;
import g.f;
import h12.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pa.c;
import w90.g;
import we1.a;
import x12.p;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/interactableec/home/n829/ECNavigationHostActivity;", "Ll/b;", "<init>", "()V", "a", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ECNavigationHostActivity extends l.b {

    /* renamed from: l  reason: collision with root package name */
    public static final a f14494l = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public g f14495j;

    /* renamed from: k  reason: collision with root package name */
    public ECDestination f14496k;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class b extends p implements w12.a<f0> {
        public b(Object obj) {
            super(0, obj, ECNavigationHostActivity.class, "finish", "finish()V", 0);
        }

        @Override // w12.a
        public final f0 invoke() {
            ((ECNavigationHostActivity) this.receiver).finish();
            return f0.f36844a;
        }
    }

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        x.e.getClass();
        j.a(this, x.a.a(0), x.a.a(0));
        if (cd.b.J(this)) {
            super.onCreate(null);
            return;
        }
        super.onCreate(bundle);
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Please provide the required arguments";
        Bundle a14 = a13.a("COORDINATOR_ID", "NAVIGATION_DESTINATION");
        String y13 = o0.y("COORDINATOR_ID", a14);
        Object a15 = k7.b.a(a14, "NAVIGATION_DESTINATION", ECDestination.class);
        if (a15 == null) {
            c.w("NAVIGATION_DESTINATION was null");
            return;
        }
        this.f14496k = (ECDestination) ((Parcelable) a15);
        g.f85506o.getClass();
        g a16 = g.a.a(y13);
        if (a16 == null) {
            c.w("Coordinator not found for id: ".concat(y13));
            return;
        }
        this.f14495j = a16;
        f.a(this, new c4.c(1017442073, true, new k(this, 0)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/interactableec/home/n829/ECNavigationHostActivity$a;", "", "<init>", "()V", "", "NAVIGATION_DESTINATION", "Ljava/lang/String;", "COORDINATOR_ID", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
