package com.dyson.mobile.android.audio.home571.help.history;

import android.content.Intent;
import android.os.Bundle;
import androidx.viewpager2.widget.ViewPager2;
import fm1.o0;
import hj.e;
import hk.j;
import hk.q3;
import i12.t;
import java.util.List;
import km.l;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lm.c;
import lm.d;
import vj.f;
import we1.a;
import x12.r;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/audio/home571/help/history/AudioHistoryGraphHelpActivity;", "Lbh0/a;", "<init>", "()V", "a", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AudioHistoryGraphHelpActivity extends bh0.a {

    /* renamed from: u  reason: collision with root package name */
    public static final a f12627u = new a(null);

    /* renamed from: p  reason: collision with root package name */
    public final d f12628p = new d();

    /* renamed from: q  reason: collision with root package name */
    public final d f12629q = new d();

    /* renamed from: r  reason: collision with root package name */
    public c f12630r;

    /* renamed from: s  reason: collision with root package name */
    public e f12631s;

    /* renamed from: t  reason: collision with root package name */
    public int f12632t;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/audio/home571/help/history/AudioHistoryGraphHelpActivity$b", "Landroidx/viewpager2/widget/ViewPager2$h;", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b extends ViewPager2.h {
        public b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.h
        public final void c(int i13) {
            AudioHistoryGraphHelpActivity audioHistoryGraphHelpActivity = AudioHistoryGraphHelpActivity.this;
            e eVar = audioHistoryGraphHelpActivity.f12631s;
            if (eVar == null) {
                r.i("trackingManager");
                throw null;
            }
            c cVar = audioHistoryGraphHelpActivity.f12630r;
            if (cVar == null) {
                r.i("audioHistoryGraphHelpViewModel");
                throw null;
            }
            ij.b a13 = cVar.d.get(i13).a();
            e.a aVar = e.f38312g;
            eVar.h(a13, null);
        }
    }

    @Override // bh0.a
    public final bh0.c c1() {
        c cVar = this.f12630r;
        if (cVar != null) {
            return cVar;
        }
        r.i("audioHistoryGraphHelpViewModel");
        throw null;
    }

    @Override // bh0.a
    public final List<d> d1() {
        return t.h(this.f12628p, this.f12629q);
    }

    @Override // bh0.a, androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (cd.b.J(this)) {
            return;
        }
        a.C2547a c2547a = we1.a.f85708c;
        Intent intent = getIntent();
        c2547a.getClass();
        we1.a a13 = a.C2547a.a(intent);
        a13.f85710b = "Please use newIntent method";
        Bundle a14 = a13.a("COORDINATOR_ID");
        String y13 = o0.y("COORDINATOR_ID", a14);
        f.f84306m.getClass();
        f a15 = f.a.a(y13);
        if (a15 == null) {
            pa.c.w("Could not initialise the coordinator");
            return;
        }
        gk.a aVar = a15.f84312l;
        aVar.f();
        j jVar = aVar.f34911b;
        pf0.c f13 = aVar.f();
        jVar.getClass();
        l lVar = new l(f13);
        jVar.getClass();
        lm.a aVar2 = new lm.a(new lm.b(lVar, new bf1.b()), new km.b(), aVar.f());
        pf0.c f14 = aVar.f();
        jVar.getClass();
        l lVar2 = new l(f14);
        bf1.b bVar = new bf1.b();
        pf0.c f15 = aVar.f();
        xk0.e h13 = aVar.h();
        jVar.getClass();
        lm.e eVar = new lm.e(lVar2, bVar, new bn.b(f15, new yp.d(new vj.c(h13))));
        xk0.e h14 = aVar.h();
        jVar.getClass();
        km.d dVar = new km.d(q3.a(jVar, new yp.d(new vj.c(h14))));
        xk0.e h15 = aVar.h();
        jVar.getClass();
        km.c cVar = new km.c(q3.a(jVar, new yp.d(new vj.c(h15))));
        pf0.c f16 = aVar.f();
        xk0.e h16 = aVar.h();
        jVar.getClass();
        lm.f fVar = new lm.f(eVar, dVar, cVar, f16, q3.a(jVar, new yp.d(new vj.c(h16))));
        pf0.c f17 = aVar.f();
        xk0.e h17 = aVar.h();
        jVar.getClass();
        this.f12630r = new c(aVar2, fVar, f17, q3.a(jVar, new yp.d(new vj.c(h17))));
        this.f12631s = aVar.f35005u0.get();
        xk0.e h18 = aVar.h();
        jVar.getClass();
        q3.a(jVar, new yp.d(new vj.c(h18)));
        this.f12632t = a14.getInt("SESSION_HISTORY_MODE_INDEX_EXTRA");
    }

    @Override // bh0.a, l.b, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        mg0.e eVar = this.f7745l;
        if (eVar == null) {
            r.i("binding");
            throw null;
        }
        eVar.f53890h.b(new b());
        mg0.e eVar2 = this.f7745l;
        if (eVar2 == null) {
            r.i("binding");
            throw null;
        }
        eVar2.e.setSelectedIndex(this.f12632t);
        bh0.c cVar = this.f7743j;
        if (cVar != null) {
            cVar.b().l(this.f12632t);
        } else {
            r.i("viewModel");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/audio/home571/help/history/AudioHistoryGraphHelpActivity$a;", "", "<init>", "()V", "", "SESSION_HISTORY_MODE_INDEX_EXTRA", "Ljava/lang/String;", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
