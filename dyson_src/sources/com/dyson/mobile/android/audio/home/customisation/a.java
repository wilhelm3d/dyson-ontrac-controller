package com.dyson.mobile.android.audio.home.customisation;

import com.paypal.android.platform.authsdk.authcommon.analytics.EventsNameKt;
import i12.e0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x12.r;
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/dyson/mobile/android/audio/home/customisation/a;", "", "<init>", "()V", "b", "a", "c", "Lcom/dyson/mobile/android/audio/home/customisation/a$a;", "Lcom/dyson/mobile/android/audio/home/customisation/a$b;", "Lcom/dyson/mobile/android/audio/home/customisation/a$c;", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class a {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/audio/home/customisation/a$a;", "Lcom/dyson/mobile/android/audio/home/customisation/a;", "<init>", "()V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.audio.home.customisation.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0344a extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0344a f12454a = new C0344a();

        private C0344a() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0344a);
        }

        public final int hashCode() {
            return -740343583;
        }

        public final String toString() {
            return EventsNameKt.GENERIC_ERROR_MESSAGE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/audio/home/customisation/a$b;", "Lcom/dyson/mobile/android/audio/home/customisation/a;", "<init>", "()V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f12455a = new b();

        private b() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -984941099;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private a() {
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/dyson/mobile/android/audio/home/customisation/a$c;", "Lcom/dyson/mobile/android/audio/home/customisation/a;", "", "Lgl/i;", "capOptionsLeft", "capOptionsRight", "cushionOptionsLeft", "cushionOptionsRight", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c extends a {

        /* renamed from: a  reason: collision with root package name */
        public final List<gl.i> f12456a;

        /* renamed from: b  reason: collision with root package name */
        public final List<gl.i> f12457b;

        /* renamed from: c  reason: collision with root package name */
        public final List<gl.i> f12458c;
        public final List<gl.i> d;

        public c(List list, List list2, List list3, List list4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? e0.d : list, (i13 & 2) != 0 ? e0.d : list2, (i13 & 4) != 0 ? e0.d : list3, (i13 & 8) != 0 ? e0.d : list4);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return r.c(this.f12456a, cVar.f12456a) && r.c(this.f12457b, cVar.f12457b) && r.c(this.f12458c, cVar.f12458c) && r.c(this.d, cVar.d);
            }
            return false;
        }

        public final int hashCode() {
            return this.d.hashCode() + tq1.a.h(tq1.a.h(this.f12456a.hashCode() * 31, 31, this.f12457b), 31, this.f12458c);
        }

        public final String toString() {
            return "Ready(capOptionsLeft=" + this.f12456a + ", capOptionsRight=" + this.f12457b + ", cushionOptionsLeft=" + this.f12458c + ", cushionOptionsRight=" + this.d + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<gl.i> list, List<gl.i> list2, List<gl.i> list3, List<gl.i> list4) {
            super(null);
            list.getClass();
            list2.getClass();
            list3.getClass();
            list4.getClass();
            this.f12456a = list;
            this.f12457b = list2;
            this.f12458c = list3;
            this.d = list4;
        }

        public c() {
            this(null, null, null, null, 15, null);
        }
    }
}
