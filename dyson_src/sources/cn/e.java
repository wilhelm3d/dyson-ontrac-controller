package cn;

import android.view.LayoutInflater;
import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.dyson.mobile.android.R;
import dk.a1;
import dk.y0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import q8.t;
import qv1.s;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcn/e;", "Lob/a;", "Lcn/b;", "ancViewModel", "Lcn/j;", "equalizerViewModel", "<init>", "(Lcn/b;Lcn/j;)V", "a", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class e extends ob.a {

    /* renamed from: c  reason: collision with root package name */
    public final b f11788c;
    public final j d;

    static {
        new a(null);
    }

    public e(b bVar, j jVar) {
        bVar.getClass();
        jVar.getClass();
        this.f11788c = bVar;
        this.d = jVar;
    }

    @Override // ob.a
    public final void e(ViewPager viewPager, int i13, Object obj) {
        viewPager.getClass();
        obj.getClass();
        viewPager.removeView((View) obj);
    }

    @Override // ob.a
    public final int getCount() {
        return 2;
    }

    @Override // ob.a
    public final Object i(ViewPager viewPager, int i13) {
        LayoutInflater from = LayoutInflater.from(viewPager.getContext());
        if (i13 == m.ANC.ordinal()) {
            t c13 = q8.g.c(from, R.layout.item_sound_control_anc, viewPager, false, null);
            c13.getClass();
            y0 y0Var = (y0) c13;
            y0Var.l(this.f11788c);
            viewPager.addView(y0Var.getRoot());
            View root = y0Var.getRoot();
            root.getClass();
            return root;
        } else if (i13 != m.EQUALIZER.ordinal()) {
            pa.c.p(s.f(i13, "Invalid tab index "));
            return null;
        } else {
            t c14 = q8.g.c(from, R.layout.item_sound_control_equalizer, viewPager, false, null);
            c14.getClass();
            a1 a1Var = (a1) c14;
            a1Var.l(this.d);
            viewPager.addView(a1Var.getRoot());
            View root2 = a1Var.getRoot();
            root2.getClass();
            return root2;
        }
    }

    @Override // ob.a
    public final boolean j(View view, Object obj) {
        view.getClass();
        obj.getClass();
        return view.equals(obj);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcn/e$a;", "", "<init>", "()V", "", "NUM_OF_TABS", "I", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
