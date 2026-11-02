package em;

import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableInt;
import cn.l;
import com.dyson.mobile.android.R;
import eh0.e;
import if1.g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import np.d;
import q8.n;
import rf0.q;
import yo.c;
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0011B=\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lem/a;", "", "Leh0/e;", "Lxo/a;", "machine", "Lyo/c;", "ancModeController", "Lzp/a;", "wornStateProvider", "Lep/c;", "audioStatusProvider", "Lpf0/c;", "localisationManager", "Lnp/d;", "fatalFaultProvider", "<init>", "(Leh0/e;Lyo/c;Lzp/a;Lep/c;Lpf0/c;Lnp/d;)V", "a", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: m  reason: collision with root package name */
    public static final int f27341m;

    /* renamed from: n  reason: collision with root package name */
    public static final int f27342n;

    /* renamed from: o  reason: collision with root package name */
    public static final int f27343o;

    /* renamed from: a  reason: collision with root package name */
    public final e<xo.a> f27344a;

    /* renamed from: b  reason: collision with root package name */
    public final c f27345b;

    /* renamed from: c  reason: collision with root package name */
    public final zp.a f27346c;
    public final ep.c d;
    public final pf0.c e;

    /* renamed from: f  reason: collision with root package name */
    public final d f27347f;

    /* renamed from: g  reason: collision with root package name */
    public final n<String> f27348g;

    /* renamed from: h  reason: collision with root package name */
    public final ObservableInt f27349h;

    /* renamed from: i  reason: collision with root package name */
    public final n<String> f27350i;

    /* renamed from: j  reason: collision with root package name */
    public final ObservableBoolean f27351j;

    /* renamed from: k  reason: collision with root package name */
    public final ObservableBoolean f27352k;

    /* renamed from: l  reason: collision with root package name */
    public final gz1.b f27353l;

    /* loaded from: classes2.dex */
    public static final /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f27354a;

        static {
            int[] iArr = new int[l.values().length];
            try {
                iArr[l.CALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l.CONVERSATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[l.ISOLATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[l.TRANSPARENCY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[l.OFF.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f27354a = iArr;
        }
    }

    static {
        new C0923a(null);
        f27341m = R.drawable.ic_fan_speed_off;
        f27342n = R.drawable.ic_anc_isolation;
        f27343o = R.drawable.ic_anc_transparency;
    }

    public a(e<xo.a> eVar, c cVar, zp.a aVar, ep.c cVar2, pf0.c cVar3, d dVar) {
        eVar.getClass();
        cVar.getClass();
        aVar.getClass();
        cVar2.getClass();
        cVar3.getClass();
        dVar.getClass();
        this.f27344a = eVar;
        this.f27345b = cVar;
        this.f27346c = aVar;
        this.d = cVar2;
        this.e = cVar3;
        this.f27347f = dVar;
        this.f27348g = new n<>("");
        this.f27349h = new ObservableInt(f27341m);
        this.f27350i = new n<>(cVar3.d(q.f72410k2));
        this.f27351j = new ObservableBoolean(false);
        this.f27352k = new ObservableBoolean(true);
        this.f27353l = new gz1.b();
    }

    public final void a(l lVar) {
        ObservableBoolean observableBoolean = this.f27352k;
        observableBoolean.m(true);
        int i13 = b.f27354a[lVar.ordinal()];
        int i14 = f27342n;
        ObservableInt observableInt = this.f27349h;
        pf0.c cVar = this.e;
        n<String> nVar = this.f27348g;
        if (i13 != 1) {
            int i15 = f27343o;
            if (i13 == 2) {
                observableBoolean.m(true);
                nVar.m(cVar.d(q.f72442o2));
                observableInt.l(i15);
            } else if (i13 == 3) {
                nVar.m(cVar.d(q.f72378g2));
                observableInt.l(i14);
            } else if (i13 == 4) {
                nVar.m(cVar.d(q.f72394i2));
                observableInt.l(i15);
            } else if (i13 != 5) {
                ma.e.o();
                return;
            } else {
                observableBoolean.m(false);
                nVar.m("");
                observableInt.l(f27341m);
            }
        } else {
            observableBoolean.m(true);
            nVar.m(cVar.d(q.f72426m2));
            observableInt.l(i14);
        }
        this.f27350i.m(g.a(cVar.d(q.f72439o), lVar == l.OFF ? cVar.d(q.f72410k2) : nVar.d));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lem/a$a;", "", "<init>", "()V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: em.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0923a {
        public /* synthetic */ C0923a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0923a() {
        }
    }
}
