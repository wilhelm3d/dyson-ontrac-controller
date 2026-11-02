package com.dyson.mobile.android.robot.menu.mappingandzoning.restrictions;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import android.widget.PopupWindow;
import bt0.f;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.localisation.LocalisationKey;
import com.dyson.mobile.android.resources.view.DysonTextView;
import com.dyson.mobile.android.resources.viewmodel.name.NamingConfig;
import h12.m;
import h12.t;
import iu0.z;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m10.j0;
import ma.e;
import nx0.a;
import ox0.f;
import px0.a;
import rf0.j;
import we1.a;
import x12.r;
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/robot/menu/mappingandzoning/restrictions/ManageRestrictionsActivity;", "Lbt0/f;", "Lbt0/c;", "Lmx0/a;", "<init>", "()V", "a", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ManageRestrictionsActivity extends f<bt0.c> implements mx0.a {

    /* renamed from: r  reason: collision with root package name */
    public static final a f16126r = new a(null);

    /* renamed from: p  reason: collision with root package name */
    public pf0.c f16127p;

    /* renamed from: q  reason: collision with root package name */
    public final t f16128q = m.b(new j0(this, 15));

    /* loaded from: classes3.dex */
    public static final /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f16129a;

        static {
            int[] iArr = new int[mx0.d.values().length];
            try {
                iArr[mx0.d.CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[mx0.d.UPDATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f16129a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            dz1.b.B(3L, TimeUnit.SECONDS).w(new d());
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d implements iz1.a {
        public d() {
        }

        @Override // iz1.a
        public final void run() {
            ManageRestrictionsActivity.this.finish();
        }
    }

    @Override // mx0.a
    public final void d0(ManageRestrictionData manageRestrictionData) {
        ox0.f.f61793h.getClass();
        ox0.f fVar = new ox0.f();
        Bundle bundle = new Bundle();
        bundle.putParcelable("ManageRestrictionData", manageRestrictionData);
        fVar.setArguments(bundle);
        d1(fVar, q1(), null, "RestrictionDefinitionFragment");
    }

    @Override // mx0.a
    public final void f0(String str, String[] strArr, ManageRestrictionData manageRestrictionData) {
        strArr.getClass();
        NamingConfig namingConfig = new NamingConfig(str, strArr, manageRestrictionData);
        px0.a.f64891g.getClass();
        px0.a aVar = new px0.a();
        Bundle bundle = new Bundle();
        bundle.putParcelable("CONFIG", namingConfig);
        aVar.setArguments(bundle);
        d1(aVar, q1(), null, px0.a.f64892h);
    }

    @Override // bt0.f
    public final bt0.a i1() {
        return new bt0.b(null, 1, null);
    }

    @Override // bt0.f
    public final void k1(int i13, String str, Bundle bundle) {
        if (r.c(str, "RestrictionBehaviorFragment")) {
            if (i13 == a.b.RESTRICTION_DELETED.ordinal()) {
                r1(j.f72014m3);
            } else if (i13 == a.b.CANCEL.ordinal()) {
                finish();
            }
        } else if (r.c(str, "RestrictionDefinitionFragment")) {
            if (i13 == f.b.CANCEL.ordinal()) {
                finish();
            }
        } else {
            px0.a.f64891g.getClass();
            if (r.c(str, px0.a.f64892h)) {
                if (i13 == a.b.RESTRICTION_CREATED.ordinal()) {
                    r1(j.f71979f3);
                } else if (i13 == a.b.RESTRICTION_UPDATED.ordinal()) {
                    r1(j.f71994i3);
                } else if (i13 == a.b.CANCEL.ordinal()) {
                    finish();
                }
            }
        }
    }

    @Override // bt0.f, bt0.g, androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (cd.b.J(this)) {
            return;
        }
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Please use newIntent method to start this activity";
        a13.a("ManageRestrictionData");
        z.a aVar = z.f42723r;
        Intent intent2 = getIntent();
        intent2.getClass();
        String str = a.a(f16126r, intent2).d;
        aVar.getClass();
        z a14 = z.a.a(str);
        if (a14 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        this.f16127p = a14.f42732o.f42663a.b();
        e1();
    }

    @Override // bt0.f, l.b, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        if (bundle == null) {
            a.C1760a c1760a = nx0.a.f59067f;
            Intent intent = getIntent();
            intent.getClass();
            ManageRestrictionData a13 = a.a(f16126r, intent);
            c1760a.getClass();
            nx0.a aVar = new nx0.a();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("ManageRestrictionData", a13);
            aVar.setArguments(bundle2);
            o1(aVar, q1(), null, "RestrictionBehaviorFragment");
        }
    }

    public final String q1() {
        LocalisationKey localisationKey;
        pf0.c cVar = this.f16127p;
        if (cVar == null) {
            r.i("localisationManager");
            throw null;
        }
        Intent intent = getIntent();
        intent.getClass();
        int i13 = b.f16129a[a.a(f16126r, intent).f16123g.ordinal()];
        if (i13 == 1) {
            localisationKey = j.O2;
        } else if (i13 != 2) {
            e.o();
            return null;
        } else {
            localisationKey = j.f71984g3;
        }
        return cVar.d(localisationKey);
    }

    public final void r1(LocalisationKey localisationKey) {
        pf0.c cVar = this.f16127p;
        if (cVar == null) {
            r.i("localisationManager");
            throw null;
        }
        String d13 = cVar.d(localisationKey);
        ow0.a aVar = (ow0.a) this.f16128q.getValue();
        ((PopupWindow) aVar.f61679a.getValue()).showAtLocation(aVar.a(), 17, 0, 0);
        ((DysonTextView) aVar.a().findViewById(R.id.text_view_title)).setText(d13);
        ViewPropertyAnimator animate = aVar.a().animate();
        animate.setInterpolator(new LinearInterpolator());
        animate.setDuration(500L);
        animate.alpha(1.0f);
        animate.withEndAction(new c()).start();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/dyson/mobile/android/robot/menu/mappingandzoning/restrictions/ManageRestrictionsActivity$a;", "", "<init>", "()V", "", "ARG_MANAGE_RESTRICTION_DATA", "Ljava/lang/String;", "", "COMPLETION_VIEW_DURATION_SECONDS", "J", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final ManageRestrictionData a(a aVar, Intent intent) {
            aVar.getClass();
            Object a13 = k7.b.a(cd.b.I(intent), "ManageRestrictionData", ManageRestrictionData.class);
            if (a13 != null) {
                return (ManageRestrictionData) ((Parcelable) a13);
            }
            pa.c.w("ManageRestrictionData was null");
            return null;
        }

        private a() {
        }
    }
}
