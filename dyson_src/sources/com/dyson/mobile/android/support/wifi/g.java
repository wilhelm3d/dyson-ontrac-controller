package com.dyson.mobile.android.support.wifi;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* loaded from: classes3.dex */
public interface g {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/support/wifi/g$a;", "Lcom/dyson/mobile/android/support/wifi/g;", "<init>", "()V", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final a f16927a = new a();

        private a() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -754882390;
        }

        public final String toString() {
            return "ApiError";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/support/wifi/g$b;", "Lcom/dyson/mobile/android/support/wifi/g;", "", "isLoading", "shouldShowWifiNotConnectedAlert", "<init>", "(ZZ)V", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b implements g {

        /* renamed from: a  reason: collision with root package name */
        public final boolean f16928a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f16929b;

        public /* synthetic */ b(boolean z13, boolean z14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this((i13 & 1) != 0 ? false : z13, (i13 & 2) != 0 ? false : z14);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.f16928a == bVar.f16928a && this.f16929b == bVar.f16929b;
            }
            return false;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f16929b) + (Boolean.hashCode(this.f16928a) * 31);
        }

        public final String toString() {
            return "Ready(isLoading=" + this.f16928a + ", shouldShowWifiNotConnectedAlert=" + this.f16929b + ")";
        }

        public b(boolean z13, boolean z14) {
            this.f16928a = z13;
            this.f16929b = z14;
        }

        public b() {
            this(false, false, 3, null);
        }
    }
}
