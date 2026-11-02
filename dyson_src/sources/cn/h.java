package cn;

import androidx.databinding.ObservableInt;
import hj.e;
import kotlin.Metadata;
import m9.u;
import nj.ne;
import nj.pe;
import qv1.s;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcn/h;", "Lm9/u;", "Lpf0/c;", "localisationManager", "Lhj/e;", "trackingManager", "<init>", "(Lpf0/c;Lhj/e;)V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class h extends u {
    public final pf0.c d;
    public final hj.e e;

    /* renamed from: f  reason: collision with root package name */
    public final q8.l<at0.m> f11789f;

    /* renamed from: g  reason: collision with root package name */
    public final ObservableInt f11790g;

    /* loaded from: classes2.dex */
    public static final /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f11791a;

        static {
            int[] iArr = new int[m.values().length];
            try {
                iArr[m.ANC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m.EQUALIZER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f11791a = iArr;
        }
    }

    public h(pf0.c cVar, hj.e eVar) {
        cVar.getClass();
        eVar.getClass();
        this.d = cVar;
        this.e = eVar;
        this.f11789f = new q8.l<>();
        this.f11790g = new ObservableInt(m.ANC.getTabPosition());
    }

    public final void S(int i13) {
        m mVar;
        ij.b bVar;
        m.Companion.getClass();
        m[] values = m.values();
        int length = values.length;
        int i14 = 0;
        while (true) {
            if (i14 >= length) {
                mVar = null;
                break;
            }
            mVar = values[i14];
            if (mVar.getTabPosition() == i13) {
                break;
            }
            i14++;
        }
        if (mVar == null) {
            pa.c.w(s.f(i13, "Could not find a SoundControlTab for tabPosition = "));
            return;
        }
        int i15 = a.f11791a[mVar.ordinal()];
        if (i15 == 1) {
            int i16 = ne.f57620a;
            bVar = new ij.b("wearable_ec.instant_control.anc_mode", null, 2, null);
        } else if (i15 != 2) {
            ma.e.o();
            return;
        } else {
            int i17 = pe.f57653a;
            bVar = new ij.b("wearable_ec.instant_control.eq_mode", null, 2, null);
        }
        e.a aVar = hj.e.f38312g;
        this.e.h(bVar, null);
    }
}
