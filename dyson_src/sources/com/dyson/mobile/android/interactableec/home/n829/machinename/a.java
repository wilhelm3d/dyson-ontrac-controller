package com.dyson.mobile.android.interactableec.home.n829.machinename;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x12.r;
/* loaded from: classes2.dex */
public interface a {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/interactableec/home/n829/machinename/a$a;", "Lcom/dyson/mobile/android/interactableec/home/n829/machinename/a;", "<init>", "()V", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.interactableec.home.n829.machinename.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0473a implements a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0473a f14514a = new C0473a();

        private C0473a() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0473a);
        }

        public final int hashCode() {
            return 1953107639;
        }

        public final String toString() {
            return "Exit";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/interactableec/home/n829/machinename/a$b;", "Lcom/dyson/mobile/android/interactableec/home/n829/machinename/a;", "", "name", "", "isCustomName", "<init>", "(Ljava/lang/String;Z)V", "mod-interactable-ec"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        public final String f14515a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f14516b;

        public b(String str, boolean z13) {
            str.getClass();
            this.f14515a = str;
            this.f14516b = z13;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return r.c(this.f14515a, bVar.f14515a) && this.f14516b == bVar.f14516b;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f14516b) + (this.f14515a.hashCode() * 31);
        }

        public final String toString() {
            return o1.a.e("NameChanged(name=", this.f14515a, ", isCustomName=", this.f14516b, ")");
        }

        public /* synthetic */ b(String str, boolean z13, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i13 & 2) != 0 ? false : z13);
        }
    }
}
