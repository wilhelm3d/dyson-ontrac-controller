package com.dyson.mobile.android.machine.ui.permissions;

import com.dyson.mobile.android.analytics.tracking.externallink.ExternalLinkTracking;
import kotlin.Metadata;
/* loaded from: classes3.dex */
public interface c {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/permissions/c$a;", "Lcom/dyson/mobile/android/machine/ui/permissions/c;", "<init>", "()V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements c {

        /* renamed from: a  reason: collision with root package name */
        public static final a f15397a = new a();

        private a() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 673150774;
        }

        public final String toString() {
            return "OnCloseScreen";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/permissions/c$b;", "Lcom/dyson/mobile/android/machine/ui/permissions/c;", "Lcom/dyson/mobile/android/analytics/tracking/externallink/ExternalLinkTracking;", "externalLinkTracking", "<init>", "(Lcom/dyson/mobile/android/analytics/tracking/externallink/ExternalLinkTracking;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        public final ExternalLinkTracking f15398a;

        public b(ExternalLinkTracking externalLinkTracking) {
            externalLinkTracking.getClass();
            this.f15398a = externalLinkTracking;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f15398a.equals(((b) obj).f15398a);
        }

        public final int hashCode() {
            return this.f15398a.hashCode();
        }

        public final String toString() {
            return "OnPrivacyPolicyClick(externalLinkTracking=" + this.f15398a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/permissions/c$c;", "Lcom/dyson/mobile/android/machine/ui/permissions/c;", "<init>", "()V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.machine.ui.permissions.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0524c implements c {

        /* renamed from: a  reason: collision with root package name */
        public static final C0524c f15399a = new C0524c();

        private C0524c() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0524c);
        }

        public final int hashCode() {
            return -758538503;
        }

        public final String toString() {
            return "OnRequestEnableLocation";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/permissions/c$d;", "Lcom/dyson/mobile/android/machine/ui/permissions/c;", "<init>", "()V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d implements c {

        /* renamed from: a  reason: collision with root package name */
        public static final d f15400a = new d();

        private d() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1136138512;
        }

        public final String toString() {
            return "OnRequestPermission";
        }
    }
}
