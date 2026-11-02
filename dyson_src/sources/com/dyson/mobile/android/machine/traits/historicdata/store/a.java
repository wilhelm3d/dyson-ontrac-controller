package com.dyson.mobile.android.machine.traits.historicdata.store;

import androidx.room.j;
import b0.d1;
import c42.a1;
import fl0.d;
import fl0.f;
import fl0.g;
import fl0.i;
import fl0.j;
import hx.v;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kz1.b;
import q62.n;
import qa.h;
import qa.w;
import qv1.s;
import rz1.l;
import z32.f1;
import z32.m1;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/machine/traits/historicdata/store/a;", "Lfl0/f;", "Lqa/w;", "__db", "<init>", "(Lqa/w;)V", "c", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements f {
    public static final c d = new c(null);

    /* renamed from: a  reason: collision with root package name */
    public final w f15329a;

    /* renamed from: b  reason: collision with root package name */
    public final C0521a f15330b;

    /* renamed from: c  reason: collision with root package name */
    public final b f15331c;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/dyson/mobile/android/machine/traits/historicdata/store/a$a", "Lqa/h;", "Lfl0/i;", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.machine.traits.historicdata.store.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0521a extends h<i> {
        @Override // qa.h
        public final void a(cb.c cVar, i iVar) {
            i iVar2 = iVar;
            cVar.getClass();
            iVar2.getClass();
            cVar.h(1, iVar2.f31920a);
            cVar.h(2, iVar2.f31921b);
            cVar.U(3, iVar2.f31922c);
        }

        @Override // qa.h
        public final String b() {
            return "INSERT OR REPLACE INTO `historic_data_to_upload` (`logId`,`recordId`,`entireDataHexStringV2`) VALUES (?,?,?)";
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/dyson/mobile/android/machine/traits/historicdata/store/a$b", "Lqa/h;", "Lfl0/j;", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b extends h<j> {
        @Override // qa.h
        public final void a(cb.c cVar, j jVar) {
            j jVar2 = jVar;
            cVar.getClass();
            jVar2.getClass();
            cVar.h(1, jVar2.f31923a);
            cVar.h(2, jVar2.f31924b);
        }

        @Override // qa.h
        public final String b() {
            return "INSERT OR REPLACE INTO `last_uploaded_historic_data_record_for_log` (`logId`,`recordId`) VALUES (?,?)";
        }
    }

    public a(w wVar) {
        wVar.getClass();
        this.f15329a = wVar;
        this.f15330b = new C0521a();
        this.f15331c = new b();
    }

    @Override // fl0.f
    public final nz1.f a(int i13, long j8) {
        j.a aVar = androidx.room.j.f4954a;
        g gVar = new g(i13, j8, 0);
        aVar.getClass();
        return j.a.a(this.f15329a, gVar);
    }

    @Override // fl0.f
    public final nz1.f b() {
        j.a aVar = androidx.room.j.f4954a;
        fd1.f fVar = new fd1.f(7);
        aVar.getClass();
        return j.a.a(this.f15329a, fVar);
    }

    @Override // fl0.f
    public final nz1.f c(int i13, ArrayList arrayList) {
        StringBuilder j8 = s.j("DELETE FROM historic_data_to_upload WHERE logId IS ? AND recordId IN (");
        ya.c.a(arrayList.size(), j8);
        j8.append(")");
        String sb2 = j8.toString();
        j.a aVar = androidx.room.j.f4954a;
        d dVar = new d(sb2, i13, arrayList, 1);
        aVar.getClass();
        return j.a.a(this.f15329a, dVar);
    }

    @Override // fl0.f
    public final sz1.c d() {
        j.a aVar = androidx.room.j.f4954a;
        fd1.f fVar = new fd1.f(11);
        aVar.getClass();
        return j.a.b(this.f15329a, true, false, fVar);
    }

    @Override // fl0.f
    public final l f() {
        j.a aVar = androidx.room.j.f4954a;
        fd1.f fVar = new fd1.f(10);
        aVar.getClass();
        w wVar = this.f15329a;
        a1.i iVar = new a1.i(20, wVar.m(), new a1(v.k(wVar, false, new String[]{"historic_data_to_upload"}, fVar)));
        b.a aVar2 = kz1.b.f50218a;
        return new l(iVar);
    }

    @Override // fl0.f
    public final nz1.f g() {
        j.a aVar = androidx.room.j.f4954a;
        fd1.f fVar = new fd1.f(8);
        aVar.getClass();
        return j.a.a(this.f15329a, fVar);
    }

    @Override // fl0.f
    public final sz1.c h() {
        j.a aVar = androidx.room.j.f4954a;
        fd1.f fVar = new fd1.f(9);
        aVar.getClass();
        return j.a.b(this.f15329a, true, false, fVar);
    }

    @Override // fl0.f
    public final sz1.c i(fl0.j jVar) {
        j.a aVar = androidx.room.j.f4954a;
        dy1.d dVar = new dy1.d(22, this, jVar);
        aVar.getClass();
        return j.a.b(this.f15329a, false, true, dVar);
    }

    @Override // fl0.f
    public final nz1.f j(ArrayList arrayList) {
        j.a aVar = androidx.room.j.f4954a;
        dy1.d dVar = new dy1.d(21, this, arrayList);
        aVar.getClass();
        return j.a.a(this.f15329a, dVar);
    }

    @Override // fl0.f
    public final pz1.c k(int i13) {
        j.a aVar = androidx.room.j.f4954a;
        bz0.b bVar = new bz0.b(i13, 2);
        aVar.getClass();
        w wVar = this.f15329a;
        l12.f m13 = wVar.m();
        m1.a aVar2 = m1.f91486a1;
        l12.f n03 = m13.n0(aVar2);
        androidx.room.h hVar = new androidx.room.h(wVar, true, false, bVar, null);
        if (n03.v0(aVar2) != null) {
            n.p(n03, "Maybe context cannot contain job in it.Its lifecycle should be managed via Disposable handle. Had ");
            return null;
        }
        d1 d1Var = new d1(10, f1.d, n03, hVar);
        b.a aVar3 = kz1.b.f50218a;
        return new pz1.c(d1Var);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/machine/traits/historicdata/store/a$c;", "", "<init>", "()V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }
}
