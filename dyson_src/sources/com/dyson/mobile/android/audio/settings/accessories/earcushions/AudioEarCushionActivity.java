package com.dyson.mobile.android.audio.settings.accessories.earcushions;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import androidx.appcompat.app.ActionBar;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.d0;
import androidx.lifecycle.viewmodel.CreationExtras;
import bt0.g;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.audio.settings.accessories.earcushions.a;
import f.x;
import fm1.o0;
import h12.y;
import hx.v;
import java.io.Serializable;
import k30.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import no.b;
import oo.b;
import se1.q0;
import vj.f;
import we1.a;
import x12.p0;
import x12.r;
import x12.t;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/audio/settings/accessories/earcushions/AudioEarCushionActivity;", "Lbt0/g;", "<init>", "()V", "a", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AudioEarCushionActivity extends g {

    /* renamed from: q  reason: collision with root package name */
    public static final a f12710q = new a(null);

    /* renamed from: k  reason: collision with root package name */
    public String f12711k;

    /* renamed from: l  reason: collision with root package name */
    public a.b f12712l;

    /* renamed from: m  reason: collision with root package name */
    public a.EnumC0357a f12713m;

    /* renamed from: n  reason: collision with root package name */
    public fk.d f12714n;

    /* renamed from: o  reason: collision with root package name */
    public final d0 f12715o = new d0(p0.f86717a.b(lo.c.class), new d(this), new j(this, 25), new e(null, this));

    /* renamed from: p  reason: collision with root package name */
    public final c f12716p = new c();

    /* loaded from: classes2.dex */
    public static final /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f12717a;

        static {
            int[] iArr = new int[a.EnumC0357a.values().length];
            try {
                iArr[a.EnumC0357a.EAR_CUSHIONS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.EnumC0357a.RECALIBRATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f12717a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/audio/settings/accessories/earcushions/AudioEarCushionActivity$c", "Llo/b;", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c implements lo.b {
        public c() {
        }

        @Override // lo.b
        public final void a() {
            a aVar = AudioEarCushionActivity.f12710q;
            AudioEarCushionActivity.this.e1(false);
        }

        @Override // lo.b
        public final void b() {
            AudioEarCushionActivity.this.getSupportFragmentManager().V();
        }

        @Override // lo.b
        public final void c(mo.a aVar) {
            aVar.getClass();
            a aVar2 = AudioEarCushionActivity.f12710q;
            AudioEarCushionActivity audioEarCushionActivity = AudioEarCushionActivity.this;
            ActionBar supportActionBar = audioEarCushionActivity.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.r(R.drawable.ic_close_black);
                supportActionBar.n(true);
            }
            b.a aVar3 = oo.b.f60584k;
            String str = audioEarCushionActivity.f12711k;
            if (str == null) {
                r.i("coordinatorId");
                throw null;
            }
            aVar3.getClass();
            oo.b bVar = new oo.b();
            Bundle bundle = new Bundle();
            bundle.putString("COORDINATOR_ID", str);
            bVar.setArguments(bundle);
            bVar.e = aVar;
            c cVar = audioEarCushionActivity.f12716p;
            cVar.getClass();
            bVar.f60585f = cVar;
            FragmentManager supportFragmentManager = audioEarCushionActivity.getSupportFragmentManager();
            androidx.fragment.app.a f13 = y.f(supportFragmentManager, supportFragmentManager);
            f13.i(R.id.fragment_container, bVar, bVar.getTag());
            f13.e(bVar.getTag());
            f13.f();
        }

        @Override // lo.b
        public final void d() {
            a aVar = AudioEarCushionActivity.f12710q;
            AudioEarCushionActivity audioEarCushionActivity = AudioEarCushionActivity.this;
            audioEarCushionActivity.setResult(-2);
            audioEarCushionActivity.onSupportNavigateUp();
        }

        @Override // lo.b
        public final void e() {
            a aVar = AudioEarCushionActivity.f12710q;
            AudioEarCushionActivity audioEarCushionActivity = AudioEarCushionActivity.this;
            audioEarCushionActivity.setResult(-2);
            audioEarCushionActivity.onSupportNavigateUp();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/ViewModelStore;", "invoke", "()Landroidx/lifecycle/ViewModelStore;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class d extends t implements w12.a<ViewModelStore> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ f.g f12719f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(f.g gVar) {
            super(0);
            this.f12719f = gVar;
        }

        @Override // w12.a
        public final ViewModelStore invoke() {
            return this.f12719f.getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm9/u;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    /* loaded from: classes2.dex */
    public static final class e extends t implements w12.a<CreationExtras> {

        /* renamed from: f  reason: collision with root package name */
        public final /* synthetic */ w12.a f12720f;

        /* renamed from: g  reason: collision with root package name */
        public final /* synthetic */ f.g f12721g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(w12.a aVar, f.g gVar) {
            super(0);
            this.f12720f = aVar;
            this.f12721g = gVar;
        }

        @Override // w12.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            w12.a aVar = this.f12720f;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f12721g.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public final void d1() {
        if (getSupportFragmentManager().I() <= 0) {
            onSupportNavigateUp();
            return;
        }
        getSupportFragmentManager().V();
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.r(R.drawable.ic_back);
        }
    }

    public final void e1(boolean z13) {
        b.a aVar = no.b.f58760j;
        String str = this.f12711k;
        if (str == null) {
            r.i("coordinatorId");
            throw null;
        }
        aVar.getClass();
        no.b bVar = new no.b();
        Bundle bundle = new Bundle();
        bundle.putString("COORDINATOR_ID", str);
        bVar.setArguments(bundle);
        c cVar = this.f12716p;
        cVar.getClass();
        bVar.f58761f = cVar;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a f13 = y.f(supportFragmentManager, supportFragmentManager);
        f13.i(R.id.fragment_container, bVar, bVar.getTag());
        if (!z13) {
            f13.e(bVar.getTag());
        }
        f13.f();
    }

    @Override // bt0.g, androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        gk.a aVar;
        x.a aVar2 = x.e;
        int i13 = q0.f76062b;
        aVar2.getClass();
        f.j.a(this, x.a.b(0, i13), x.a.b(q0.f76061a, i13));
        super.onCreate(bundle);
        if (cd.b.J(this)) {
            return;
        }
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Please use newInstance method";
        Bundle a14 = a13.a("COORDINATOR_ID");
        this.f12711k = o0.y("COORDINATOR_ID", a14);
        Serializable c13 = k7.b.c(a14, "TRANSITION_MODE_KEY", a.b.class);
        if (c13 == null) {
            pa.c.w("TRANSITION_MODE_KEY was null");
            return;
        }
        this.f12712l = (a.b) c13;
        Serializable c14 = k7.b.c(a14, "TARGET_SCREEN", a.EnumC0357a.class);
        if (c14 == null) {
            pa.c.w("TARGET_SCREEN was null");
            return;
        }
        this.f12713m = (a.EnumC0357a) c14;
        f.a aVar3 = f.f84306m;
        String y13 = o0.y("COORDINATOR_ID", a14);
        aVar3.getClass();
        f a15 = f.a.a(y13);
        if (a15 != null && (aVar = a15.f84312l) != null) {
            this.f12714n = aVar.d();
        }
        dk.c cVar = (dk.c) q8.g.d(this, R.layout.activity_audio_ear_cushions);
        setSupportActionBar(cVar.d);
        ActionBar supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.r(R.drawable.ic_back);
        }
        cVar.d.x(this);
        cVar.l((lo.c) this.f12715o.getValue());
        getOnBackPressedDispatcher().a(this, new lo.a(this));
        a.b bVar = this.f12712l;
        if (bVar == null) {
            r.i("transitionType");
            throw null;
        }
        int inAnimation = bVar.getInAnimation();
        a.b bVar2 = this.f12712l;
        if (bVar2 == null) {
            r.i("transitionType");
            throw null;
        }
        overridePendingTransition(inAnimation, bVar2.getOutAnimation());
        a.EnumC0357a enumC0357a = this.f12713m;
        if (enumC0357a == null) {
            r.i("targetScreen");
            throw null;
        }
        int i14 = b.f12717a[enumC0357a.ordinal()];
        if (i14 != 1) {
            if (i14 == 2) {
                e1(true);
                return;
            } else {
                ma.e.o();
                return;
            }
        }
        a.C0358a c0358a = com.dyson.mobile.android.audio.settings.accessories.earcushions.a.f12722j;
        String str = this.f12711k;
        if (str == null) {
            r.i("coordinatorId");
            throw null;
        }
        c0358a.getClass();
        com.dyson.mobile.android.audio.settings.accessories.earcushions.a aVar4 = new com.dyson.mobile.android.audio.settings.accessories.earcushions.a();
        Bundle bundle2 = new Bundle();
        bundle2.putString("COORDINATOR_ID", str);
        aVar4.setArguments(bundle2);
        c cVar2 = this.f12716p;
        cVar2.getClass();
        aVar4.f12723f = cVar2;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a f13 = y.f(supportFragmentManager, supportFragmentManager);
        f13.i(R.id.fragment_container, aVar4, aVar4.getTag());
        f13.f();
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() == 16908332) {
            d1();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // l.b
    public final boolean onSupportNavigateUp() {
        finish();
        a.b bVar = this.f12712l;
        if (bVar == null) {
            r.i("transitionType");
            throw null;
        } else if (bVar == a.b.HORIZONTAL) {
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);
            return true;
        } else {
            overridePendingTransition(R.anim.slide_in_down, R.anim.slide_out_down);
            return true;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0002\b\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/dyson/mobile/android/audio/settings/accessories/earcushions/AudioEarCushionActivity$a;", "", "<init>", "()V", "", "TRANSITION_MODE_KEY", "Ljava/lang/String;", "TARGET_SCREEN", "b", "a", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/audio/settings/accessories/earcushions/AudioEarCushionActivity$a$a;", "", "<init>", "(Ljava/lang/String;I)V", "EAR_CUSHIONS", "RECALIBRATION", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.audio.settings.accessories.earcushions.AudioEarCushionActivity$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class EnumC0357a {
            private static final /* synthetic */ o12.a $ENTRIES;
            private static final /* synthetic */ EnumC0357a[] $VALUES;
            public static final EnumC0357a EAR_CUSHIONS = new EnumC0357a("EAR_CUSHIONS", 0);
            public static final EnumC0357a RECALIBRATION = new EnumC0357a("RECALIBRATION", 1);

            private static final /* synthetic */ EnumC0357a[] $values() {
                return new EnumC0357a[]{EAR_CUSHIONS, RECALIBRATION};
            }

            static {
                EnumC0357a[] $values = $values();
                $VALUES = $values;
                $ENTRIES = v.l($values);
            }

            private EnumC0357a(String str, int i13) {
            }

            public static o12.a<EnumC0357a> getEntries() {
                return $ENTRIES;
            }

            public static EnumC0357a valueOf(String str) {
                return (EnumC0357a) Enum.valueOf(EnumC0357a.class, str);
            }

            public static EnumC0357a[] values() {
                return (EnumC0357a[]) $VALUES.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\tj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/dyson/mobile/android/audio/settings/accessories/earcushions/AudioEarCushionActivity$a$b;", "", "", "inAnimation", "outAnimation", "<init>", "(Ljava/lang/String;III)V", "I", "getInAnimation", "()I", "getOutAnimation", "HORIZONTAL", "VERTICAL", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class b {
            private static final /* synthetic */ o12.a $ENTRIES;
            private static final /* synthetic */ b[] $VALUES;
            public static final b HORIZONTAL = new b("HORIZONTAL", 0, R.anim.slide_in_right, R.anim.slide_out_left);
            public static final b VERTICAL = new b("VERTICAL", 1, R.anim.slide_in_up, R.anim.slide_out_up);
            private final int inAnimation;
            private final int outAnimation;

            private static final /* synthetic */ b[] $values() {
                return new b[]{HORIZONTAL, VERTICAL};
            }

            static {
                b[] $values = $values();
                $VALUES = $values;
                $ENTRIES = v.l($values);
            }

            private b(String str, int i13, int i14, int i15) {
                this.inAnimation = i14;
                this.outAnimation = i15;
            }

            public static o12.a<b> getEntries() {
                return $ENTRIES;
            }

            public static b valueOf(String str) {
                return (b) Enum.valueOf(b.class, str);
            }

            public static b[] values() {
                return (b[]) $VALUES.clone();
            }

            public final int getInAnimation() {
                return this.inAnimation;
            }

            public final int getOutAnimation() {
                return this.outAnimation;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static Intent a(Context context, String str, b bVar, EnumC0357a enumC0357a) {
            str.getClass();
            bVar.getClass();
            enumC0357a.getClass();
            Intent intent = new Intent(context, AudioEarCushionActivity.class);
            intent.putExtra("COORDINATOR_ID", str);
            intent.putExtra("TRANSITION_MODE_KEY", bVar);
            intent.putExtra("TARGET_SCREEN", enumC0357a);
            return intent;
        }

        private a() {
        }
    }
}
