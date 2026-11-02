package com.dyson.mobile.android.machine.machinecontent.expertcontent.collection;

import androidx.compose.runtime.d;
import bk0.f;
import com.dyson.mobile.android.machinetype.MachineSerial;
import g42.m;
import h12.f0;
import ji0.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kz1.b;
import l12.g;
import lf0.m0;
import li0.c;
import m9.u;
import mi0.a;
import sz1.j;
import sz1.t;
import u3.k1;
import vi0.i;
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB5\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/collection/a;", "Lm9/u;", "Lvi0/i;", "machineContentRepository", "Lg71/a;", "appFeedbackManager", "Lbk0/f;", "machineRepository", "Lcom/dyson/mobile/android/machinetype/MachineSerial;", "machineSerial", "", "collectionId", "<init>", "(Lvi0/i;Lg71/a;Lbk0/f;Lcom/dyson/mobile/android/machinetype/MachineSerial;Ljava/lang/String;)V", "b", "a", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a extends u {

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ int f15160n = 0;
    public final i d;
    public final g71.a e;

    /* renamed from: f  reason: collision with root package name */
    public final f f15161f;

    /* renamed from: g  reason: collision with root package name */
    public final MachineSerial f15162g;

    /* renamed from: h  reason: collision with root package name */
    public final String f15163h;

    /* renamed from: i  reason: collision with root package name */
    public final xf1.a<f0> f15164i;

    /* renamed from: j  reason: collision with root package name */
    public final xf1.a<a.b> f15165j;

    /* renamed from: k  reason: collision with root package name */
    public final k1 f15166k;

    /* renamed from: l  reason: collision with root package name */
    public volatile String f15167l;

    /* renamed from: m  reason: collision with root package name */
    public mz1.f f15168m;

    @wy1.a
    /* loaded from: classes3.dex */
    public interface b {
        a a(MachineSerial machineSerial, String str);
    }

    static {
        new C0509a(null);
    }

    public a(i iVar, g71.a aVar, f fVar, MachineSerial machineSerial, String str) {
        iVar.getClass();
        aVar.getClass();
        fVar.getClass();
        machineSerial.getClass();
        str.getClass();
        this.d = iVar;
        this.e = aVar;
        this.f15161f = fVar;
        this.f15162g = machineSerial;
        this.f15163h = str;
        this.f15164i = new xf1.a<>();
        this.f15165j = new xf1.a<>();
        this.f15166k = d.j(new a.b("", new c(this, 0)));
        this.f15167l = "";
        S();
    }

    public final void S() {
        String str = this.f15162g.d;
        i iVar = this.d;
        iVar.getClass();
        String str2 = this.f15163h;
        str2.getClass();
        sz1.c a13 = m.a(g.d, new vi0.c(iVar, str2, str, null));
        m0 m0Var = new m0(new li0.d(this, 1), 1);
        b.a aVar = kz1.b.f50218a;
        this.f15168m = (mz1.f) new j(new t(a13, m0Var).r(c02.a.f10004c), new m0(new li0.d(this, 2), 2)).j(fz1.a.a()).p(new m0(new li0.d(this, 3), 3), new m0(new li0.d(this, 4), 4));
    }

    @Override // m9.u
    public final void onCleared() {
        super.onCleared();
        mz1.f fVar = this.f15168m;
        if (fVar != null) {
            jz1.d.dispose(fVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/collection/a$a;", "", "<init>", "()V", "", "EMPTY_TITLE", "Ljava/lang/String;", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.machine.machinecontent.expertcontent.collection.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0509a {
        public /* synthetic */ C0509a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0509a() {
        }
    }
}
