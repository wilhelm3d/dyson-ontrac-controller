package com.dyson.mobile.android.audio.home571.help.livegraph;

import android.content.Intent;
import android.os.Bundle;
import androidx.viewpager2.widget.ViewPager2;
import fm1.o0;
import hj.e;
import hk.j;
import i12.t;
import java.util.List;
import km.l;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mm.c;
import mm.d;
import vj.f;
import we1.a;
import x12.r;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/audio/home571/help/livegraph/AudioLiveGraphHelpActivity;", "Lbh0/a;", "<init>", "()V", "a", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AudioLiveGraphHelpActivity extends bh0.a {

    /* renamed from: t  reason: collision with root package name */
    public static final a f12634t = new a(null);

    /* renamed from: p  reason: collision with root package name */
    public final d f12635p = new d();

    /* renamed from: q  reason: collision with root package name */
    public final d f12636q = new d();

    /* renamed from: r  reason: collision with root package name */
    public c f12637r;

    /* renamed from: s  reason: collision with root package name */
    public e f12638s;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/dyson/mobile/android/audio/home571/help/livegraph/AudioLiveGraphHelpActivity$b", "Landroidx/viewpager2/widget/ViewPager2$h;", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b extends ViewPager2.h {
        public b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.h
        public final void c(int i13) {
            AudioLiveGraphHelpActivity audioLiveGraphHelpActivity = AudioLiveGraphHelpActivity.this;
            e eVar = audioLiveGraphHelpActivity.f12638s;
            if (eVar == null) {
                r.i("trackingManager");
                throw null;
            }
            c cVar = audioLiveGraphHelpActivity.f12637r;
            if (cVar == null) {
                r.i("audioLiveGraphHelpViewModel");
                throw null;
            }
            ij.b a13 = cVar.d.get(i13).a();
            e.a aVar = e.f38312g;
            eVar.h(a13, null);
        }
    }

    @Override // bh0.a
    public final bh0.c c1() {
        c cVar = this.f12637r;
        if (cVar != null) {
            return cVar;
        }
        r.i("audioLiveGraphHelpViewModel");
        throw null;
    }

    @Override // bh0.a
    public final List<d> d1() {
        return t.h(this.f12635p, this.f12636q);
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
        Bundle a14 = a13.a("COORDINATOR_ID", "LIVE_GRAPH_TYPE_INDEX_EXTRA");
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
        this.f12637r = new c(new mm.a(new mm.b(new l(f13)), new km.b()), new mm.e(new mm.f(aVar.f(), new l(aVar.f()), new bn.b(aVar.f(), new yp.d(new vj.c(aVar.h()))), new yp.d(new vj.c(aVar.h()))), new km.f(), new km.e()), aVar.f());
        this.f12638s = aVar.f35005u0.get();
        int i13 = a14.getInt("LIVE_GRAPH_TYPE_INDEX_EXTRA");
        c cVar = this.f12637r;
        if (cVar != null) {
            cVar.f54396c.l(i13);
        } else {
            r.i("audioLiveGraphHelpViewModel");
            throw null;
        }
    }

    @Override // bh0.a, l.b, android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        mg0.e eVar = this.f7745l;
        if (eVar != null) {
            eVar.f53890h.b(new b());
        } else {
            r.i("binding");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/audio/home571/help/livegraph/AudioLiveGraphHelpActivity$a;", "", "<init>", "()V", "", "LIVE_GRAPH_TYPE_INDEX_EXTRA", "Ljava/lang/String;", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
