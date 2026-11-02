package com.dyson.mobile.android.connectedhome.matter;

import kotlin.Metadata;
import n4.j0;
/* loaded from: classes2.dex */
public interface a {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/matter/a$a;", "Lcom/dyson/mobile/android/connectedhome/matter/a;", "<init>", "()V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.connectedhome.matter.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0377a implements a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0377a f12953a = new C0377a();

        private C0377a() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0377a);
        }

        public final int hashCode() {
            return -153918714;
        }

        public final String toString() {
            return "SheetHidden";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/matter/a$b;", "Lcom/dyson/mobile/android/connectedhome/matter/a;", "", "manualEntryCode", "Ln4/j0;", "qrCodeBitmap", "<init>", "(Ljava/lang/String;Ln4/j0;)V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        public final String f12954a;

        /* renamed from: b  reason: collision with root package name */
        public final j0 f12955b;

        public b(String str, j0 j0Var) {
            str.getClass();
            j0Var.getClass();
            this.f12954a = str;
            this.f12955b = j0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return this.f12954a.equals(bVar.f12954a) && this.f12955b.equals(bVar.f12955b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f12955b.hashCode() + (this.f12954a.hashCode() * 31);
        }

        public final String toString() {
            return "SheetVisible(manualEntryCode=" + this.f12954a + ", qrCodeBitmap=" + this.f12955b + ")";
        }
    }
}
