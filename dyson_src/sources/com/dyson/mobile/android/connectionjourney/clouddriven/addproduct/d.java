package com.dyson.mobile.android.connectionjourney.clouddriven.addproduct;

import com.dyson.mobile.android.machinetype.MachineCategory;
import com.dyson.mobile.android.machinetype.MachineDescriptor;
import kotlin.Metadata;
/* loaded from: classes2.dex */
public interface d {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/clouddriven/addproduct/d$a;", "Lcom/dyson/mobile/android/connectionjourney/clouddriven/addproduct/d;", "Lcom/dyson/mobile/android/machinetype/MachineCategory;", "machineCategory", "<init>", "(Lcom/dyson/mobile/android/machinetype/MachineCategory;)V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements d {

        /* renamed from: a  reason: collision with root package name */
        public final MachineCategory f13440a;

        public a(MachineCategory machineCategory) {
            machineCategory.getClass();
            this.f13440a = machineCategory;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f13440a == ((a) obj).f13440a;
        }

        public final int hashCode() {
            return this.f13440a.hashCode();
        }

        public final String toString() {
            return "AddMachineWithCategory(machineCategory=" + this.f13440a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/clouddriven/addproduct/d$b;", "Lcom/dyson/mobile/android/connectionjourney/clouddriven/addproduct/d;", "Lcom/dyson/mobile/android/machinetype/MachineDescriptor;", "machineDescriptor", "<init>", "(Lcom/dyson/mobile/android/machinetype/MachineDescriptor;)V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b implements d {

        /* renamed from: a  reason: collision with root package name */
        public final MachineDescriptor f13441a;

        public b(MachineDescriptor machineDescriptor) {
            machineDescriptor.getClass();
            this.f13441a = machineDescriptor;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f13441a.equals(((b) obj).f13441a);
        }

        public final int hashCode() {
            return this.f13441a.hashCode();
        }

        public final String toString() {
            return "AddMachineWithDescriptor(machineDescriptor=" + this.f13441a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/clouddriven/addproduct/d$c;", "Lcom/dyson/mobile/android/connectionjourney/clouddriven/addproduct/d;", "<init>", "()V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class c implements d {

        /* renamed from: a  reason: collision with root package name */
        public static final c f13442a = new c();

        private c() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 478486609;
        }

        public final String toString() {
            return "CancelAndExitConnectionJourney";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/clouddriven/addproduct/d$d;", "Lcom/dyson/mobile/android/connectionjourney/clouddriven/addproduct/d;", "<init>", "()V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.connectionjourney.clouddriven.addproduct.d$d  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0420d implements d {

        /* renamed from: a  reason: collision with root package name */
        public static final C0420d f13443a = new C0420d();

        private C0420d() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0420d);
        }

        public final int hashCode() {
            return 637070402;
        }

        public final String toString() {
            return "NavigateBack";
        }
    }
}
