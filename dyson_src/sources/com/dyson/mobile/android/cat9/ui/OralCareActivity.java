package com.dyson.mobile.android.cat9.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.dyson.mobile.android.cat9.navigation.destination.OralCareDestination;
import ef1.h;
import fm1.o0;
import g.f;
import in0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l.b;
import we1.a;
import zs.c;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/cat9/ui/OralCareActivity;", "Ll/b;", "<init>", "()V", "a", "mod-cat9-oralcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OralCareActivity extends b {

    /* renamed from: m  reason: collision with root package name */
    public static final a f12917m = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public c f12918j;

    /* renamed from: k  reason: collision with root package name */
    public OralCareDestination f12919k;

    /* renamed from: l  reason: collision with root package name */
    public h f12920l;

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Please provide the required arguments";
        Bundle a14 = a13.a("COORDINATOR_ID", "NAVIGATION_DESTINATION");
        String y13 = o0.y("COORDINATOR_ID", a14);
        Object a15 = k7.b.a(a14, "NAVIGATION_DESTINATION", OralCareDestination.class);
        if (a15 == null) {
            pa.c.w("NAVIGATION_DESTINATION was null");
            return;
        }
        this.f12919k = (OralCareDestination) ((Parcelable) a15);
        c.f93089n.getClass();
        in0.a.e.getClass();
        c cVar = (c) a.C1330a.a(y13);
        if (cVar == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        this.f12918j = cVar;
        this.f12920l = cVar.f93092i.a();
        super.onCreate(bundle);
        if (cd.b.J(this)) {
            return;
        }
        f.a(this, new c4.c(1368622064, true, new yu.c(this, 0)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/cat9/ui/OralCareActivity$a;", "", "<init>", "()V", "", "NAVIGATION_DESTINATION", "Ljava/lang/String;", "mod-cat9-oralcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
