package com.dyson.mobile.android.robot.menu.settings.remove.moreinfo;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import av0.d;
import bv0.b2;
import bv0.e8;
import fm1.o0;
import fy0.b;
import iu0.z;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pa.c;
import we1.a;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/robot/menu/settings/remove/moreinfo/a;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "a", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a extends Fragment {
    public static final C0559a e = new C0559a(null);
    public fy0.a d;

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        a.C2547a c2547a = we1.a.f85708c;
        Bundle arguments = getArguments();
        c2547a.getClass();
        we1.a b13 = a.C2547a.b(arguments);
        b13.f85710b = "Required arguments are missing, please use the newInstance method";
        String y13 = o0.y("COORDINATOR_ID", b13.a("COORDINATOR_ID"));
        z.f42723r.getClass();
        z a13 = z.a.a(y13);
        if (a13 == null) {
            c.w("Could not initialise the coordinator");
            return null;
        }
        d dVar = a13.f42732o.f42663a;
        e8 e8Var = dVar.f5515c;
        fy0.c cVar = new fy0.c(b2.b(dVar.f5510b), dVar.b());
        e8Var.getClass();
        this.d = new fy0.a(cVar);
        Context requireContext = requireContext();
        requireContext.getClass();
        ComposeView composeView = new ComposeView(requireContext, null, 0, 6, null);
        ps0.a.a(composeView, new c4.c(-2077426284, true, new b(this, 0)));
        return composeView;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/robot/menu/settings/remove/moreinfo/a$a;", "", "<init>", "()V", "", "REMOVE_ROBOT_UI_TAG", "Ljava/lang/String;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.robot.menu.settings.remove.moreinfo.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0559a {
        public /* synthetic */ C0559a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0559a() {
        }
    }
}
