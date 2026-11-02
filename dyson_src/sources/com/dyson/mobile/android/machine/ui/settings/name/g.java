package com.dyson.mobile.android.machine.ui.settings.name;

import kotlin.Metadata;
/* loaded from: classes3.dex */
public interface g {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/settings/name/g$a;", "Lcom/dyson/mobile/android/machine/ui/settings/name/g;", "<init>", "()V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements g {

        /* renamed from: a  reason: collision with root package name */
        public static final a f15460a = new a();

        private a() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -185919044;
        }

        public final String toString() {
            return "Exit";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/settings/name/g$b;", "Lcom/dyson/mobile/android/machine/ui/settings/name/g;", "", "name", "<init>", "(Ljava/lang/String;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b implements g {

        /* renamed from: a  reason: collision with root package name */
        public final String f15461a;

        public b(String str) {
            str.getClass();
            this.f15461a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f15461a.equals(((b) obj).f15461a);
        }

        public final int hashCode() {
            return this.f15461a.hashCode();
        }

        public final String toString() {
            return bv1.f.e("NameSaved(name=", this.f15461a, ")");
        }
    }
}
