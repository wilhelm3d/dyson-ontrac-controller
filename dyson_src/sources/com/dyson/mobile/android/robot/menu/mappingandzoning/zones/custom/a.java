package com.dyson.mobile.android.robot.menu.mappingandzoning.zones.custom;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.e;
import av0.d;
import bv0.s0;
import com.dyson.mobile.android.resources.viewmodel.name.NamingConfig;
import iu0.z;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import pa.c;
import tw0.f0;
import x12.r;
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/robot/menu/mappingandzoning/zones/custom/a;", "Lpt0/a;", "Lcom/dyson/mobile/android/robot/menu/mappingandzoning/zones/custom/CustomLabelExtras;", "Lux0/a;", "<init>", "()V", "a", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a extends pt0.a<CustomLabelExtras, ux0.a> {

    /* renamed from: f  reason: collision with root package name */
    public static final C0554a f16145f = new C0554a(null);
    public ux0.a e;

    @Override // pt0.a, gu0.f
    public final void h(String str) {
        str.getClass();
        Intent putExtra = new Intent().putExtra("NEW_NAME", str);
        putExtra.getClass();
        e activity = getActivity();
        if (activity != null) {
            activity.setResult(2, putExtra);
        }
        e activity2 = getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
    }

    @Override // pt0.a
    public final ux0.a s() {
        ux0.a aVar = this.e;
        if (aVar != null) {
            return aVar;
        }
        r.i("viewModel");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pt0.a
    public final void t(Bundle bundle) {
        z.a aVar = z.f42723r;
        NamingConfig<ConfigExtras> namingConfig = this.d;
        if (namingConfig == 0) {
            r.i("config");
            throw null;
        }
        String str = ((CustomLabelExtras) namingConfig.f15910f).d;
        aVar.getClass();
        z a13 = z.a.a(str);
        if (a13 == null) {
            c.w("Could not initialise the coordinator");
            return;
        }
        d dVar = a13.f42732o.f42663a;
        s0 s0Var = dVar.f5510b;
        f0 f0Var = dVar.D3.get();
        pf0.c b13 = dVar.b();
        s0Var.getClass();
        f0Var.getClass();
        this.e = new ux0.a(f0Var, b13);
        dVar.b();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/robot/menu/mappingandzoning/zones/custom/a$a;", "", "<init>", "()V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.robot.menu.mappingandzoning.zones.custom.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0554a {
        public /* synthetic */ C0554a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0554a() {
        }
    }
}
