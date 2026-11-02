package com.dyson.mobile.android.account.legacy.createpassword;

import android.annotation.SuppressLint;
import androidx.databinding.ObservableBoolean;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.m;
import com.dyson.mobile.android.account.legacy.createpassword.CreatePasswordViewModel;
import i12.s;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kz1.b;
import mz1.i;
import nj.hb;
import nz1.w;
import pf0.c;
import qh.d;
import qh.j;
import qh.m0;
import rf0.i0;
import v32.l;
import x12.p0;
import x12.r;
import x12.y;
import zf1.c;
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/dyson/mobile/android/account/legacy/createpassword/CreatePasswordViewModel;", "Landroidx/lifecycle/m;", "Lqh/j;", "accountManager", "Ltj/a;", "marketManager", "Ln81/b;", "marketInformationRepository", "Lpf0/c;", "localisationManager", "<init>", "(Lqh/j;Ltj/a;Ln81/b;Lpf0/c;)V", "a", "mod-user-login"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SuppressLint({"LocalisationKeyUsage"})
/* loaded from: classes2.dex */
public final class CreatePasswordViewModel implements m {

    /* renamed from: p  reason: collision with root package name */
    public static final /* synthetic */ e22.m<Object>[] f12104p = {p0.f86717a.f(new y(CreatePasswordViewModel.class, "navigator", "getNavigator()Lcom/dyson/mobile/android/account/legacy/createpassword/CreatePasswordNavigator;", 0))};

    /* renamed from: q  reason: collision with root package name */
    public static final List<String> f12105q;
    public final j d;
    public final tj.a e;

    /* renamed from: f  reason: collision with root package name */
    public final tf1.a f12106f;

    /* renamed from: g  reason: collision with root package name */
    public final ObservableBoolean f12107g;

    /* renamed from: h  reason: collision with root package name */
    public final ObservableBoolean f12108h;

    /* renamed from: i  reason: collision with root package name */
    public final ObservableBoolean f12109i;

    /* renamed from: j  reason: collision with root package name */
    public final ObservableBoolean f12110j;

    /* renamed from: k  reason: collision with root package name */
    public final String f12111k;

    /* renamed from: l  reason: collision with root package name */
    public final String f12112l;

    /* renamed from: m  reason: collision with root package name */
    public i f12113m;

    /* renamed from: n  reason: collision with root package name */
    public qh.b f12114n;

    /* renamed from: o  reason: collision with root package name */
    public final CreatePasswordViewModel$isPasswordLocked$1 f12115o;

    /* loaded from: classes2.dex */
    public static final /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f12116a;

        static {
            int[] iArr = new int[Lifecycle.a.values().length];
            try {
                iArr[Lifecycle.a.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.a.ON_DESTROY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f12116a = iArr;
        }
    }

    static {
        new a(null);
        f12105q = s.c(Locale.JAPAN.getCountry());
    }

    public CreatePasswordViewModel(j jVar, tj.a aVar, n81.b bVar, c cVar) {
        jVar.getClass();
        aVar.getClass();
        bVar.getClass();
        cVar.getClass();
        this.d = jVar;
        this.e = aVar;
        this.f12106f = new tf1.a(null, 1, null);
        this.f12107g = new ObservableBoolean(f12105q.contains(aVar.c()));
        this.f12108h = new ObservableBoolean(false);
        this.f12109i = new ObservableBoolean(false);
        o81.a c13 = bVar.c();
        c13.getClass();
        this.f12110j = new ObservableBoolean(c13.b().a());
        this.f12111k = cVar.d(i0.f71555a);
        this.f12112l = cVar.d(i0.f71571b);
        this.f12115o = new CreatePasswordViewModel$isPasswordLocked$1(this);
    }

    public final qh.b a() {
        qh.b bVar = this.f12114n;
        if (bVar != null) {
            return bVar;
        }
        r.i("accountDataViewModel");
        throw null;
    }

    public final void b() {
        d a13;
        qh.b a14 = a();
        c.a aVar = a14.f66833g;
        e22.m<?>[] mVarArr = qh.b.f66831p;
        String str = (String) aVar.getValue(a14, mVarArr[2]);
        int i13 = m0.f66899a;
        str.getClass();
        if (str.length() <= 0 || !new l("(?=.*[0-9]).{6,}").e(str)) {
            this.f12109i.m(true);
            return;
        }
        this.f12108h.m(false);
        this.f12115o.m(true);
        String S = a().S();
        qh.b a15 = a();
        String str2 = (String) a15.f66833g.getValue(a15, mVarArr[2]);
        boolean z13 = this.f12107g.d;
        qh.b a16 = a();
        d dVar = new d(null, null, null, null, null, null, S, str2, z13, ((Boolean) a16.f66838l.getValue(a16, mVarArr[7])).booleanValue(), 63, null);
        String country = Locale.JAPAN.getCountry();
        tj.a aVar2 = this.e;
        if (aVar2.e(country)) {
            String firstName = a().getFirstName();
            qh.b a17 = a();
            String str3 = (String) a17.f66836j.getValue(a17, mVarArr[5]);
            String lastName = a().getLastName();
            qh.b a18 = a();
            a13 = d.a(dVar, null, null, firstName, lastName, str3, (String) a18.f66837k.getValue(a18, mVarArr[6]), 963);
        } else {
            a13 = d.a(dVar, a().getFirstName(), a().getLastName(), null, null, null, null, 1020);
        }
        w m13 = this.d.l(aVar2.b("-"), aVar2.c(), a13).z(c02.a.f10004c).r(fz1.a.a()).o(new yc0.d(new yh.b(this, 0), 19)).l(new iz1.a(this) { // from class: yh.c

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ CreatePasswordViewModel f89998b;

            {
                this.f89998b = this;
            }

            @Override // iz1.a
            public final void run() {
                int i14 = r2;
                CreatePasswordViewModel createPasswordViewModel = this.f89998b;
                switch (i14) {
                    case 0:
                        e22.m<Object>[] mVarArr2 = CreatePasswordViewModel.f12104p;
                        a aVar3 = (a) createPasswordViewModel.f12106f.getValue(createPasswordViewModel, CreatePasswordViewModel.f12104p[0]);
                        if (aVar3 != null) {
                            aVar3.a();
                            return;
                        }
                        return;
                    default:
                        createPasswordViewModel.f12108h.m(true);
                        return;
                }
            }
        }).m(new yc0.d(new yh.b(this, 1), 20));
        iz1.a aVar3 = new iz1.a(this) { // from class: yh.c

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ CreatePasswordViewModel f89998b;

            {
                this.f89998b = this;
            }

            @Override // iz1.a
            public final void run() {
                int i14 = r2;
                CreatePasswordViewModel createPasswordViewModel = this.f89998b;
                switch (i14) {
                    case 0:
                        e22.m<Object>[] mVarArr2 = CreatePasswordViewModel.f12104p;
                        a aVar32 = (a) createPasswordViewModel.f12106f.getValue(createPasswordViewModel, CreatePasswordViewModel.f12104p[0]);
                        if (aVar32 != null) {
                            aVar32.a();
                            return;
                        }
                        return;
                    default:
                        createPasswordViewModel.f12108h.m(true);
                        return;
                }
            }
        };
        b.a aVar4 = kz1.b.f50218a;
        this.f12113m = (i) new nz1.i(m13, aVar3).v();
    }

    @Override // androidx.lifecycle.m
    public final void g(LifecycleOwner lifecycleOwner, Lifecycle.a aVar) {
        i iVar;
        int i13 = b.f12116a[aVar.ordinal()];
        if (i13 == 1) {
            int i14 = hb.f57516a;
            y9.w.t("user_management.create_account.create_password", null, 2, null);
        } else if (i13 == 2 && (iVar = this.f12113m) != null) {
            jz1.d.dispose(iVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/account/legacy/createpassword/CreatePasswordViewModel$a;", "", "<init>", "()V", "mod-user-login"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
