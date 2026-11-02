package com.dyson.mobile.android.robot.menu.mappingandzoning.restrictions.restrictionlist;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.FragmentManager;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.robot.menu.mappingandzoning.restrictions.restrictionlist.a;
import f.j;
import f.x;
import fm1.o0;
import iu0.z;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l.b;
import pa.c;
import q8.g;
import q8.t;
import se1.q0;
import we1.a;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/robot/menu/mappingandzoning/restrictions/restrictionlist/RestrictionListActivity;", "Ll/b;", "<init>", "()V", "a", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RestrictionListActivity extends b {

    /* renamed from: j  reason: collision with root package name */
    public static final a f16131j = new a(null);

    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        x.a aVar = x.e;
        int i13 = q0.f76062b;
        aVar.getClass();
        j.a(this, x.a.b(0, i13), x.a.b(q0.f76061a, i13));
        super.onCreate(bundle);
        if (cd.b.J(this)) {
            return;
        }
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Please use the newInstance method";
        Bundle a14 = a13.a("COORDINATOR_ID", "MAP_ID");
        z.a aVar2 = z.f42723r;
        f16131j.getClass();
        String y13 = o0.y("COORDINATOR_ID", a14);
        aVar2.getClass();
        z a15 = z.a.a(y13);
        if (a15 == null) {
            c.p("Required value was null.");
            return;
        }
        a15.f42732o.f42663a.getClass();
        setTheme(2132083627);
        LayoutInflater layoutInflater = getLayoutInflater();
        int i14 = yu0.c.f90611h;
        DataBinderMapperImpl dataBinderMapperImpl = g.f66228a;
        yu0.c cVar = (yu0.c) t.inflateInternal(layoutInflater, R.layout.activity_restriction_list, null, false, null);
        cVar.f90612f.x(this);
        cVar.d.setOnClickListener(new ao1.a(this, 25));
        setContentView(cVar.getRoot());
    }

    @Override // l.b, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        if (bundle == null) {
            Intent intent = getIntent();
            intent.getClass();
            Bundle I = cd.b.I(intent);
            a.C0553a c0553a = com.dyson.mobile.android.robot.menu.mappingandzoning.restrictions.restrictionlist.a.f16132j;
            f16131j.getClass();
            String y13 = o0.y("COORDINATOR_ID", I);
            String y14 = o0.y("MAP_ID", I);
            c0553a.getClass();
            com.dyson.mobile.android.robot.menu.mappingandzoning.restrictions.restrictionlist.a a13 = a.C0553a.a(y13, y14);
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
            aVar.i(R.id.fragment_container, a13, null);
            aVar.n(true, true);
        }
    }

    @Override // l.b
    public final boolean onSupportNavigateUp() {
        finish();
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/robot/menu/mappingandzoning/restrictions/restrictionlist/RestrictionListActivity$a;", "", "<init>", "()V", "", "MAP_ID", "Ljava/lang/String;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
