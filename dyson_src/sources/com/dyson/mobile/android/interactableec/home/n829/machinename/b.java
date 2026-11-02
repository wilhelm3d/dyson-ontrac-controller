package com.dyson.mobile.android.interactableec.home.n829.machinename;

import af1.i;
import af1.j;
import c42.f2;
import c42.g2;
import c42.q1;
import c42.r;
import c42.r1;
import c42.u1;
import c42.w1;
import com.dyson.mobile.android.interactableec.home.n829.machinename.f;
import kotlin.Metadata;
import m9.u;
import m9.v;
import vk0.n;
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B=\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/dyson/mobile/android/interactableec/home/n829/machinename/b;", "Lm9/u;", "Lbk0/f;", "machineRepository", "Lvk0/n;", "machineTaskFactory", "Laf1/i;", "dispatcherProvider", "Lhj/e;", "trackingManager", "", "autoUpdateEnabled", "", "machineSerial", "<init>", "(Lbk0/f;Lvk0/n;Laf1/i;Lhj/e;ZLjava/lang/String;)V", "a", "b", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class b extends u {
    public final bk0.f d;
    public final n e;

    /* renamed from: f  reason: collision with root package name */
    public final i f14517f;

    /* renamed from: g  reason: collision with root package name */
    public final hj.e f14518g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f14519h;

    /* renamed from: i  reason: collision with root package name */
    public final String f14520i;

    /* renamed from: j  reason: collision with root package name */
    public final j f14521j;

    /* renamed from: k  reason: collision with root package name */
    public final u1 f14522k;

    /* renamed from: l  reason: collision with root package name */
    public final q1 f14523l;

    /* renamed from: m  reason: collision with root package name */
    public final f2 f14524m;

    /* renamed from: n  reason: collision with root package name */
    public final r1 f14525n;

    /* renamed from: o  reason: collision with root package name */
    public C0474b f14526o;

    @wy1.a
    /* loaded from: classes2.dex */
    public interface a {
        b a(String str, boolean z13);
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/interactableec/home/n829/machinename/b$b;", "", "", "name", "", "isCustomName", "<init>", "(Ljava/lang/String;Z)V", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.interactableec.home.n829.machinename.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0474b {

        /* renamed from: a  reason: collision with root package name */
        public final String f14527a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f14528b;

        public C0474b(String str, boolean z13) {
            str.getClass();
            this.f14527a = str;
            this.f14528b = z13;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C0474b) {
                C0474b c0474b = (C0474b) obj;
                return this.f14527a.equals(c0474b.f14527a) && this.f14528b == c0474b.f14528b;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f14528b) + (this.f14527a.hashCode() * 31);
        }

        public final String toString() {
            return o1.a.e("NameChangeRequest(name=", this.f14527a, ", isCustomName=", this.f14528b, ")");
        }
    }

    public b(bk0.f fVar, n nVar, i iVar, hj.e eVar, boolean z13, String str) {
        fVar.getClass();
        nVar.getClass();
        iVar.getClass();
        eVar.getClass();
        str.getClass();
        this.d = fVar;
        this.e = nVar;
        this.f14517f = iVar;
        this.f14518g = eVar;
        this.f14519h = z13;
        this.f14520i = str;
        this.f14521j = new j(v.a(this));
        u1 b13 = w1.b(0, 0, null, 7);
        this.f14522k = b13;
        this.f14523l = r.c(b13);
        f2 a13 = g2.a(f.b.f14537a);
        this.f14524m = a13;
        this.f14525n = r.d(a13);
    }
}
