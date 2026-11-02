package com.dyson.mobile.android.machine.machinecontent.productinformation;

import b0.y1;
import kotlin.Metadata;
/* loaded from: classes3.dex */
public interface b {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/machine/machinecontent/productinformation/b$a;", "Lcom/dyson/mobile/android/machine/machinecontent/productinformation/b;", "", "serialNumber", "id", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public final String f15262a;

        /* renamed from: b  reason: collision with root package name */
        public final String f15263b;

        public a(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.f15262a = str;
            this.f15263b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.f15262a.equals(aVar.f15262a) && this.f15263b.equals(aVar.f15263b);
            }
            return false;
        }

        public final int hashCode() {
            return this.f15263b.hashCode() + (this.f15262a.hashCode() * 31);
        }

        public final String toString() {
            return y1.j("NavigateToNextPage(serialNumber=", this.f15262a, ", id=", this.f15263b, ")");
        }
    }
}
