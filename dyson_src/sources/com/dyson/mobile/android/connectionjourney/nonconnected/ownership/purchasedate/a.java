package com.dyson.mobile.android.connectionjourney.nonconnected.ownership.purchasedate;

import androidx.databinding.ObservableBoolean;
import b30.d;
import c42.r1;
import cg0.j;
import com.dyson.mobile.android.machinetype.MachineDescriptor;
import com.dyson.mobile.android.machinetype.MachineSerial;
import e22.m;
import h12.f0;
import h12.r;
import im1.zb;
import iw0.l;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.u;
import m9.v;
import n12.e;
import n12.i;
import q8.n;
import rf0.i0;
import x12.p0;
import x12.y;
import yi0.f;
import z32.c0;
import z32.g0;
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0015\u0016BW\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\f\u001a\u00020\n\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/nonconnected/ownership/purchasedate/a;", "Lm9/u;", "Lyi0/f;", "machineManager", "Lpf0/c;", "localisationManager", "Ltj/a;", "marketManager", "Lng0/b;", "cjDataObjectManager", "", "_accessToken", "serialNumber", "Lcom/dyson/mobile/android/machinetype/MachineDescriptor;", "machineDescriptor", "Lcg0/j;", "machineAssetStateProvider", "Lb30/d;", "putNonConnectedRegistrationTask", "<init>", "(Lyi0/f;Lpf0/c;Ltj/a;Lng0/b;Ljava/lang/String;Ljava/lang/String;Lcom/dyson/mobile/android/machinetype/MachineDescriptor;Lcg0/j;Lb30/d;)V", "c", "b", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a extends u {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ m<Object>[] f13686x = {p0.f86717a.f(new y(a.class, "navigator", "getNavigator()Lcom/dyson/mobile/android/connectionjourney/nonconnected/ownership/purchasedate/NonConnectedOwnershipPurchaseDateNavigator;", 0))};
    public final f d;
    public final String e;

    /* renamed from: f  reason: collision with root package name */
    public final MachineDescriptor f13687f;

    /* renamed from: g  reason: collision with root package name */
    public final j f13688g;

    /* renamed from: h  reason: collision with root package name */
    public final d f13689h;

    /* renamed from: i  reason: collision with root package name */
    public final ObservableBoolean f13690i;

    /* renamed from: j  reason: collision with root package name */
    public final ObservableBoolean f13691j;

    /* renamed from: k  reason: collision with root package name */
    public final n<String> f13692k;

    /* renamed from: l  reason: collision with root package name */
    public final ObservableBoolean f13693l;

    /* renamed from: m  reason: collision with root package name */
    public final String f13694m;

    /* renamed from: n  reason: collision with root package name */
    public final r1 f13695n;

    /* renamed from: o  reason: collision with root package name */
    public final String f13696o;

    /* renamed from: p  reason: collision with root package name */
    public final tf1.a f13697p;

    /* renamed from: q  reason: collision with root package name */
    public final Calendar f13698q;

    /* renamed from: r  reason: collision with root package name */
    public final Calendar f13699r;

    /* renamed from: s  reason: collision with root package name */
    public final String f13700s;

    /* renamed from: t  reason: collision with root package name */
    public final Calendar f13701t;

    /* renamed from: u  reason: collision with root package name */
    public String f13702u;

    /* renamed from: v  reason: collision with root package name */
    public final gz1.b f13703v;

    /* renamed from: w  reason: collision with root package name */
    public final if1.a f13704w;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @e(c = "com.dyson.mobile.android.connectionjourney.nonconnected.ownership.purchasedate.NonConnectedOwnershipPurchaseDateViewModel$1", f = "NonConnectedOwnershipPurchaseDateViewModel.kt", l = {102}, m = "invokeSuspend", v = 2)
    /* renamed from: com.dyson.mobile.android.connectionjourney.nonconnected.ownership.purchasedate.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0437a extends i implements Function2<c0, l12.d<? super f0>, Object> {
        public int d;

        public C0437a(l12.d<? super C0437a> dVar) {
            super(2, dVar);
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            return new C0437a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
            return ((C0437a) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            int i13 = this.d;
            if (i13 == 0) {
                r.b(obj);
                a aVar2 = a.this;
                j jVar = aVar2.f13688g;
                MachineDescriptor machineDescriptor = aVar2.f13687f;
                ag0.b bVar = new ag0.b(new MachineSerial(aVar2.e), machineDescriptor.getMachineType(), machineDescriptor.getMachineVariant(), null, 8, null);
                this.d = 1;
                if (jVar.d(bVar, this) == aVar) {
                    return aVar;
                }
            } else if (i13 != 1) {
                pa.c.w("call to 'resume' before 'invoke' with coroutine");
                return null;
            } else {
                r.b(obj);
            }
            return f0.f36844a;
        }
    }

    @wy1.a
    /* loaded from: classes2.dex */
    public interface c {
        a a(String str, MachineDescriptor machineDescriptor);
    }

    static {
        new b(null);
    }

    public a(f fVar, pf0.c cVar, tj.a aVar, ng0.b bVar, String str, String str2, MachineDescriptor machineDescriptor, j jVar, d dVar) {
        fVar.getClass();
        cVar.getClass();
        aVar.getClass();
        bVar.getClass();
        str.getClass();
        str2.getClass();
        machineDescriptor.getClass();
        jVar.getClass();
        dVar.getClass();
        this.d = fVar;
        this.e = str2;
        this.f13687f = machineDescriptor;
        this.f13688g = jVar;
        this.f13689h = dVar;
        this.f13690i = new ObservableBoolean(false);
        this.f13691j = new ObservableBoolean(false);
        n<String> nVar = new n<>("");
        this.f13692k = nVar;
        this.f13693l = new ObservableBoolean(false);
        this.f13694m = cVar.d(i0.f71828r9);
        this.f13695n = jVar.d;
        this.f13696o = str;
        this.f13697p = new tf1.a(null, 1, null);
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault(), Locale.getDefault());
        calendar.getClass();
        this.f13698q = calendar;
        Calendar calendar2 = Calendar.getInstance();
        calendar2.getClass();
        this.f13699r = calendar2;
        this.f13700s = aVar.c();
        Object clone = calendar.clone();
        clone.getClass();
        this.f13701t = (Calendar) clone;
        this.f13702u = "";
        this.f13703v = new gz1.b();
        if1.a aVar2 = new if1.a();
        aVar2.f41623a = 1;
        aVar2.f41624b = -1;
        this.f13704w = aVar2;
        String d = cVar.d(bVar.d(machineDescriptor.getMachineType(), machineDescriptor.getMachineVariant()).b(ng0.d.ownershipPurchaseDate_selectDateButton, i0.f71932y9));
        calendar2.set(2012, 0, 1);
        nVar.m(d);
        g0.r(v.a(this), null, null, new C0437a(null), 3);
    }

    public final void S() {
        String machineType = this.f13687f.getMachineType();
        String str = this.f13702u;
        d dVar = this.f13689h;
        dVar.getClass();
        String str2 = this.e;
        str2.getClass();
        machineType.getClass();
        str.getClass();
        String str3 = this.f13700s;
        str3.getClass();
        zb.z(this.f13703v, dVar.f6492a.a(new f30.b(machineType, str2, str, str3, null)).z(c02.a.f10004c).r(fz1.a.a()).o(new l(new j30.d(this, 0), 10)).g(this.d.f90155b.a().t(5L)).x(new l(new j30.d(this, 1), 11), new j30.e(this, 0)));
    }

    @Override // m9.u
    public final void onCleared() {
        super.onCleared();
        this.f13703v.e();
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/nonconnected/ownership/purchasedate/a$b;", "", "<init>", "()V", "", "COMPLETION_VIEW_DISPLAY_TIME", "J", "MANIFEST_FETCH_RETRIES", "", "PAST_YEAR_LIMIT", "I", "PAST_MONTH_LIMIT", "PAST_DATE_LIMIT", "", "DATE_PATTERN_DATASTORE", "Ljava/lang/String;", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }
}
