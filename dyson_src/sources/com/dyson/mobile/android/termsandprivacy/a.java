package com.dyson.mobile.android.termsandprivacy;

import e91.f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x12.r;
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/dyson/mobile/android/termsandprivacy/a;", "", "<init>", "()V", "c", "a", "b", "Lcom/dyson/mobile/android/termsandprivacy/a$a;", "Lcom/dyson/mobile/android/termsandprivacy/a$b;", "Lcom/dyson/mobile/android/termsandprivacy/a$c;", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class a {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/termsandprivacy/a$a;", "Lcom/dyson/mobile/android/termsandprivacy/a;", "", "throwable", "<init>", "(Ljava/lang/Throwable;)V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.termsandprivacy.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0616a extends a {

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f16944a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0616a(Throwable th2) {
            super(null);
            th2.getClass();
            this.f16944a = th2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0616a) && r.c(this.f16944a, ((C0616a) obj).f16944a);
        }

        public final int hashCode() {
            return this.f16944a.hashCode();
        }

        public final String toString() {
            return "Error(throwable=" + this.f16944a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/termsandprivacy/a$b;", "Lcom/dyson/mobile/android/termsandprivacy/a;", "<init>", "()V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f16945a = new b();

        private b() {
            super(null);
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 846472182;
        }

        public final String toString() {
            return "Loading";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/termsandprivacy/a$c;", "Lcom/dyson/mobile/android/termsandprivacy/a;", "Le91/f;", "data", "<init>", "(Le91/f;)V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c extends a {

        /* renamed from: a  reason: collision with root package name */
        public final f f16946a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(f fVar) {
            super(null);
            fVar.getClass();
            this.f16946a = fVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && r.c(this.f16946a, ((c) obj).f16946a);
        }

        public final int hashCode() {
            return this.f16946a.hashCode();
        }

        public final String toString() {
            return "Success(data=" + this.f16946a + ")";
        }
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private a() {
    }
}
