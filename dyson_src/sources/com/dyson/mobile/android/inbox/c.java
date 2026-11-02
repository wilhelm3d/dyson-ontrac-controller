package com.dyson.mobile.android.inbox;

import com.salesforce.marketingcloud.storage.db.i;
import h12.f0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import v90.l;
import x12.r;
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/dyson/mobile/android/inbox/c;", "", "<init>", "()V", "c", "d", "a", "e", "b", "Lcom/dyson/mobile/android/inbox/c$a;", "Lcom/dyson/mobile/android/inbox/c$b;", "Lcom/dyson/mobile/android/inbox/c$c;", "Lcom/dyson/mobile/android/inbox/c$d;", "Lcom/dyson/mobile/android/inbox/c$e;", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class c {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/inbox/c$a;", "Lcom/dyson/mobile/android/inbox/c;", "Lkotlin/Function1;", "", "Lh12/f0;", "onRefresh", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a extends c {

        /* renamed from: a  reason: collision with root package name */
        public final Function1<Boolean, f0> f14268a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super Boolean, f0> function1) {
            super(null);
            function1.getClass();
            this.f14268a = function1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && r.c(this.f14268a, ((a) obj).f14268a);
        }

        public final int hashCode() {
            return this.f14268a.hashCode();
        }

        public final String toString() {
            return "Empty(onRefresh=" + this.f14268a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/inbox/c$b;", "Lcom/dyson/mobile/android/inbox/c;", "Lkotlin/Function1;", "", "Lh12/f0;", "onRefresh", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b extends c {

        /* renamed from: a  reason: collision with root package name */
        public final Function1<Boolean, f0> f14269a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super Boolean, f0> function1) {
            super(null);
            function1.getClass();
            this.f14269a = function1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && r.c(this.f14269a, ((b) obj).f14269a);
        }

        public final int hashCode() {
            return this.f14269a.hashCode();
        }

        public final String toString() {
            return "Error(onRefresh=" + this.f14269a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/inbox/c$c;", "Lcom/dyson/mobile/android/inbox/c;", "<init>", "()V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.inbox.c$c  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0465c extends c {

        /* renamed from: a  reason: collision with root package name */
        public static final C0465c f14270a = new C0465c();

        private C0465c() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0465c);
        }

        public final int hashCode() {
            return -140201714;
        }

        public final String toString() {
            return "Loading";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/inbox/c$d;", "Lcom/dyson/mobile/android/inbox/c;", "<init>", "()V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class d extends c {

        /* renamed from: a  reason: collision with root package name */
        public static final d f14271a = new d();

        private d() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1524013589;
        }

        public final String toString() {
            return "Refreshing";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/dyson/mobile/android/inbox/c$e;", "Lcom/dyson/mobile/android/inbox/c;", "", "Lv90/l;", i.e, "Lkotlin/Function1;", "Lh12/f0;", "onMessageClicked", "", "onRefresh", "<init>", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class e extends c {

        /* renamed from: a  reason: collision with root package name */
        public final List<l> f14272a;

        /* renamed from: b  reason: collision with root package name */
        public final Function1<l, f0> f14273b;

        /* renamed from: c  reason: collision with root package name */
        public final Function1<Boolean, f0> f14274c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(List<l> list, Function1<? super l, f0> function1, Function1<? super Boolean, f0> function12) {
            super(null);
            list.getClass();
            function1.getClass();
            function12.getClass();
            this.f14272a = list;
            this.f14273b = function1;
            this.f14274c = function12;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return r.c(this.f14272a, eVar.f14272a) && r.c(this.f14273b, eVar.f14273b) && r.c(this.f14274c, eVar.f14274c);
            }
            return false;
        }

        public final int hashCode() {
            return this.f14274c.hashCode() + fo1.a.g(this.f14273b, this.f14272a.hashCode() * 31, 31);
        }

        public final String toString() {
            return "Success(messages=" + this.f14272a + ", onMessageClicked=" + this.f14273b + ", onRefresh=" + this.f14274c + ")";
        }
    }

    public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private c() {
    }
}
