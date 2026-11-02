package com.dyson.mobile.android.support.aichatbot;

import com.dyson.mobile.android.support.MachineSpecificTab;
import kotlin.Metadata;
/* loaded from: classes3.dex */
public interface b {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/support/aichatbot/b$a;", "Lcom/dyson/mobile/android/support/aichatbot/b;", "", "serialNumber", "Lcom/dyson/mobile/android/support/MachineSpecificTab;", "machineSpecificTab", "<init>", "(Ljava/lang/String;Lcom/dyson/mobile/android/support/MachineSpecificTab;)V", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public final String f16757a;

        /* renamed from: b  reason: collision with root package name */
        public final MachineSpecificTab f16758b;

        public a(String str, MachineSpecificTab machineSpecificTab) {
            str.getClass();
            machineSpecificTab.getClass();
            this.f16757a = str;
            this.f16758b = machineSpecificTab;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.f16757a.equals(aVar.f16757a) && this.f16758b == aVar.f16758b;
            }
            return false;
        }

        public final int hashCode() {
            return this.f16758b.hashCode() + (this.f16757a.hashCode() * 31);
        }

        public final String toString() {
            return "NavigateToManageMapsTab(serialNumber=" + this.f16757a + ", machineSpecificTab=" + this.f16758b + ")";
        }
    }
}
