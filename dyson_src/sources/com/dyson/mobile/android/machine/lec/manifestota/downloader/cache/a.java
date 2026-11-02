package com.dyson.mobile.android.machine.lec.manifestota.downloader.cache;

import h12.f0;
import hh0.e;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qa.f;
import qa.h;
import qa.w;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/machine/lec/manifestota/downloader/cache/a;", "Lih0/b;", "Lqa/w;", "__db", "<init>", "(Lqa/w;)V", "c", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements ih0.b {
    public static final c d = new c(null);

    /* renamed from: a  reason: collision with root package name */
    public final w f15103a;

    /* renamed from: b  reason: collision with root package name */
    public final C0507a f15104b;

    /* renamed from: c  reason: collision with root package name */
    public final b f15105c;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/dyson/mobile/android/machine/lec/manifestota/downloader/cache/a$a", "Lqa/h;", "Lih0/a;", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.machine.lec.manifestota.downloader.cache.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0507a extends h<ih0.a> {
        @Override // qa.h
        public final void a(cb.c cVar, ih0.a aVar) {
            ih0.a aVar2 = aVar;
            cVar.getClass();
            aVar2.getClass();
            Integer num = aVar2.f41665a;
            if (num == null) {
                cVar.B(1);
            } else {
                cVar.h(1, num.intValue());
            }
            cVar.U(2, aVar2.f41666b);
            cVar.h(3, aVar2.f41667c);
        }

        @Override // qa.h
        public final String b() {
            return "INSERT OR REPLACE INTO `ota_file_cache` (`id`,`url`,`timestamp`) VALUES (?,?,?)";
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/dyson/mobile/android/machine/lec/manifestota/downloader/cache/a$b", "Lqa/f;", "Lih0/a;", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b extends f<ih0.a> {
        @Override // qa.f
        public final void a(cb.c cVar, ih0.a aVar) {
            ih0.a aVar2 = aVar;
            cVar.getClass();
            aVar2.getClass();
            Integer num = aVar2.f41665a;
            if (num == null) {
                cVar.B(1);
            } else {
                cVar.h(1, num.intValue());
            }
        }

        @Override // qa.f
        public final String b() {
            return "DELETE FROM `ota_file_cache` WHERE `id` = ?";
        }
    }

    public a(w wVar) {
        wVar.getClass();
        this.f15103a = wVar;
        this.f15104b = new C0507a();
        this.f15105c = new b();
    }

    @Override // ih0.b
    public final Object a(e eVar) {
        Object m13 = ya.c.m(this.f15103a, false, true, new ic0.b(14), eVar);
        return m13 == m12.a.COROUTINE_SUSPENDED ? m13 : f0.f36844a;
    }

    @Override // ih0.b
    public final Object b(n12.c cVar) {
        return ya.c.m(this.f15103a, true, false, new ic0.b(13), cVar);
    }

    @Override // ih0.b
    public final Object c(ih0.a aVar, hh0.h hVar) {
        return ya.c.m(this.f15103a, false, true, new ih0.c(this, aVar, 1), hVar);
    }

    @Override // ih0.b
    public final Object d(String str, n12.c cVar) {
        return ya.c.m(this.f15103a, true, false, new ay1.b(str, 16), cVar);
    }

    @Override // ih0.b
    public final Object e(String str, e eVar) {
        return ya.c.m(this.f15103a, true, false, new ay1.b(str, 15), eVar);
    }

    @Override // ih0.b
    public final Object f(ih0.a aVar, n12.c cVar) {
        Object m13 = ya.c.m(this.f15103a, false, true, new ih0.c(this, aVar, 0), cVar);
        return m13 == m12.a.COROUTINE_SUSPENDED ? m13 : f0.f36844a;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/machine/lec/manifestota/downloader/cache/a$c;", "", "<init>", "()V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }
}
