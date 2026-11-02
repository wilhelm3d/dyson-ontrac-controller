package com.dyson.mobile.android.robot.menu.mappingandzoning.zones.mapname;

import androidx.compose.runtime.d;
import ay0.i;
import hj.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.u;
import rf0.j;
import u3.k1;
import u3.y2;
import v32.y;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/robot/menu/mappingandzoning/zones/mapname/c;", "Lm9/u;", "Lpf0/c;", "localisationManager", "Lhj/e;", "trackingManager", "<init>", "(Lpf0/c;Lhj/e;)V", "a", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c extends u {
    public final pf0.c d;
    public final e e;

    /* renamed from: f  reason: collision with root package name */
    public final xf1.a<com.dyson.mobile.android.robot.menu.mappingandzoning.zones.mapname.a> f16196f;

    /* renamed from: g  reason: collision with root package name */
    public final k1 f16197g;

    static {
        new a(null);
    }

    public c(pf0.c cVar, e eVar) {
        cVar.getClass();
        eVar.getClass();
        this.d = cVar;
        this.e = eVar;
        this.f16196f = new xf1.a<>();
        this.f16197g = d.j(new i("", false));
    }

    public final void S(String str) {
        k1 k1Var = this.f16197g;
        i iVar = (i) ((y2) k1Var).getValue();
        String d = str == null ? this.d.d(j.f72016n0) : str;
        boolean z13 = str == null || y.A(str);
        iVar.getClass();
        ((y2) k1Var).setValue(new i(d, !z13));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/robot/menu/mappingandzoning/zones/mapname/c$a;", "", "<init>", "()V", "", "MAP_NAME", "Ljava/lang/String;", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
