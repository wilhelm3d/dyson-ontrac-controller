package com.dyson.mobile.android.salesforce;

import com.dyson.mobile.android.analytics.tracking.externallink.ExternalLinkTracking;
import com.dyson.mobile.android.machinetype.MachineDefinition;
import h12.y;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x12.r;
/* loaded from: classes3.dex */
public interface a {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/salesforce/a$a;", "Lcom/dyson/mobile/android/salesforce/a;", "<init>", "()V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.salesforce.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0598a implements a {

        /* renamed from: a  reason: collision with root package name */
        public static final C0598a f16665a = new C0598a();

        private C0598a() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C0598a);
        }

        public final int hashCode() {
            return -1837300990;
        }

        public final String toString() {
            return "InvalidDeepLink";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/salesforce/a$b;", "Lcom/dyson/mobile/android/salesforce/a;", "", "machineSerial", "<init>", "(Ljava/lang/String;)V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class b implements a {

        /* renamed from: a  reason: collision with root package name */
        public final String f16666a;

        public b(String str) {
            str.getClass();
            this.f16666a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f16666a.equals(((b) obj).f16666a);
        }

        public final int hashCode() {
            return this.f16666a.hashCode();
        }

        public final String toString() {
            return bv1.f.e("MachineNotFound(machineSerial=", this.f16666a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/salesforce/a$c;", "Lcom/dyson/mobile/android/salesforce/a;", "Lcom/dyson/mobile/android/machinetype/MachineDefinition;", "machineDefinition", "<init>", "(Lcom/dyson/mobile/android/machinetype/MachineDefinition;)V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class c implements a {

        /* renamed from: a  reason: collision with root package name */
        public final MachineDefinition f16667a;

        public c(MachineDefinition machineDefinition) {
            machineDefinition.getClass();
            this.f16667a = machineDefinition;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.f16667a.equals(((c) obj).f16667a);
        }

        public final int hashCode() {
            return this.f16667a.hashCode();
        }

        public final String toString() {
            return "MachineOnboarding(machineDefinition=" + this.f16667a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/salesforce/a$d;", "Lcom/dyson/mobile/android/salesforce/a;", "<init>", "()V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class d implements a {

        /* renamed from: a  reason: collision with root package name */
        public static final d f16668a = new d();

        private d() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -267383863;
        }

        public final String toString() {
            return "NonConnectedJourney";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/salesforce/a$e;", "Lcom/dyson/mobile/android/salesforce/a;", "<init>", "()V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class e implements a {

        /* renamed from: a  reason: collision with root package name */
        public static final e f16669a = new e();

        private e() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -187314351;
        }

        public final String toString() {
            return "PurchaseFinishedGoodsCatalog";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/salesforce/a$f;", "Lcom/dyson/mobile/android/salesforce/a;", "", "machineSerial", "<init>", "(Ljava/lang/String;)V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class f implements a {

        /* renamed from: a  reason: collision with root package name */
        public final String f16670a;

        public f(String str) {
            str.getClass();
            this.f16670a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f16670a.equals(((f) obj).f16670a);
        }

        public final int hashCode() {
            return this.f16670a.hashCode();
        }

        public final String toString() {
            return bv1.f.e("ShowAirQualityReport(machineSerial=", this.f16670a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/salesforce/a$g;", "Lcom/dyson/mobile/android/salesforce/a;", "Lcom/dyson/mobile/android/machinetype/MachineDefinition;", "machineDefinition", "<init>", "(Lcom/dyson/mobile/android/machinetype/MachineDefinition;)V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class g implements a {

        /* renamed from: a  reason: collision with root package name */
        public final MachineDefinition f16671a;

        public g(MachineDefinition machineDefinition) {
            machineDefinition.getClass();
            this.f16671a = machineDefinition;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.f16671a.equals(((g) obj).f16671a);
        }

        public final int hashCode() {
            return this.f16671a.hashCode();
        }

        public final String toString() {
            return "ShowEcAutoMode(machineDefinition=" + this.f16671a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/salesforce/a$h;", "Lcom/dyson/mobile/android/salesforce/a;", "Lcom/dyson/mobile/android/machinetype/MachineDefinition;", "machineDefinition", "<init>", "(Lcom/dyson/mobile/android/machinetype/MachineDefinition;)V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class h implements a {

        /* renamed from: a  reason: collision with root package name */
        public final MachineDefinition f16672a;

        public h(MachineDefinition machineDefinition) {
            machineDefinition.getClass();
            this.f16672a = machineDefinition;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.f16672a.equals(((h) obj).f16672a);
        }

        public final int hashCode() {
            return this.f16672a.hashCode();
        }

        public final String toString() {
            return "ShowEcLocationOn(machineDefinition=" + this.f16672a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/salesforce/a$i;", "Lcom/dyson/mobile/android/salesforce/a;", "Lcom/dyson/mobile/android/machinetype/MachineDefinition;", "machineDefinition", "<init>", "(Lcom/dyson/mobile/android/machinetype/MachineDefinition;)V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class i implements a {

        /* renamed from: a  reason: collision with root package name */
        public final MachineDefinition f16673a;

        public i(MachineDefinition machineDefinition) {
            machineDefinition.getClass();
            this.f16673a = machineDefinition;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.f16673a.equals(((i) obj).f16673a);
        }

        public final int hashCode() {
            return this.f16673a.hashCode();
        }

        public final String toString() {
            return "ShowEcSettings(machineDefinition=" + this.f16673a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/salesforce/a$j;", "Lcom/dyson/mobile/android/salesforce/a;", "Lcom/dyson/mobile/android/machinetype/MachineDefinition;", "machineDefinition", "", "collectionId", "itemId", "<init>", "(Lcom/dyson/mobile/android/machinetype/MachineDefinition;Ljava/lang/String;Ljava/lang/String;)V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class j implements a {

        /* renamed from: a  reason: collision with root package name */
        public final MachineDefinition f16674a;

        /* renamed from: b  reason: collision with root package name */
        public final String f16675b;

        /* renamed from: c  reason: collision with root package name */
        public final String f16676c;

        public j(MachineDefinition machineDefinition, String str, String str2) {
            machineDefinition.getClass();
            str.getClass();
            this.f16674a = machineDefinition;
            this.f16675b = str;
            this.f16676c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof j) {
                j jVar = (j) obj;
                return this.f16674a.equals(jVar.f16674a) && this.f16675b.equals(jVar.f16675b) && r.c(this.f16676c, jVar.f16676c);
            }
            return false;
        }

        public final int hashCode() {
            int c13 = y.c(this.f16674a.hashCode() * 31, 31, this.f16675b);
            String str = this.f16676c;
            return c13 + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowExpertContent(machineDefinition=");
            sb2.append(this.f16674a);
            sb2.append(", collectionId=");
            sb2.append(this.f16675b);
            sb2.append(", itemId=");
            return ie.a.h(sb2, this.f16676c, ")");
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/dyson/mobile/android/salesforce/a$k;", "Lcom/dyson/mobile/android/salesforce/a;", "", "sku", "Llp0/a;", "productType", "Llp0/c;", "trackerCampaignOrigin", "Lcom/dyson/mobile/android/analytics/tracking/externallink/ExternalLinkTracking;", "externalLinkTracking", "<init>", "(Ljava/lang/String;Llp0/a;Llp0/c;Lcom/dyson/mobile/android/analytics/tracking/externallink/ExternalLinkTracking;)V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class k implements a {

        /* renamed from: a  reason: collision with root package name */
        public final String f16677a;

        /* renamed from: b  reason: collision with root package name */
        public final lp0.a f16678b;

        /* renamed from: c  reason: collision with root package name */
        public final lp0.c f16679c;
        public final ExternalLinkTracking d;

        public k(String str, lp0.a aVar, lp0.c cVar, ExternalLinkTracking externalLinkTracking) {
            str.getClass();
            aVar.getClass();
            cVar.getClass();
            externalLinkTracking.getClass();
            this.f16677a = str;
            this.f16678b = aVar;
            this.f16679c = cVar;
            this.d = externalLinkTracking;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof k) {
                k kVar = (k) obj;
                return this.f16677a.equals(kVar.f16677a) && this.f16678b == kVar.f16678b && this.f16679c == kVar.f16679c && this.d.equals(kVar.d);
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = this.f16678b.hashCode();
            int hashCode2 = this.f16679c.hashCode();
            return this.d.hashCode() + ((hashCode2 + ((hashCode + (this.f16677a.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "ShowFinishedGoodsProductDetails(sku=" + this.f16677a + ", productType=" + this.f16678b + ", trackerCampaignOrigin=" + this.f16679c + ", externalLinkTracking=" + this.d + ")";
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/salesforce/a$m;", "Lcom/dyson/mobile/android/salesforce/a;", "<init>", "()V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class m implements a {

        /* renamed from: a  reason: collision with root package name */
        public static final m f16682a = new m();

        private m() {
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return 1136163953;
        }

        public final String toString() {
            return "ShowProduct708Catalog";
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/dyson/mobile/android/salesforce/a$n;", "Lcom/dyson/mobile/android/salesforce/a;", "", "machineSerial", "Llp0/a;", "productType", "Llp0/c;", "trackerCampaignOrigin", "Lcom/dyson/mobile/android/analytics/tracking/externallink/ExternalLinkTracking;", "externalLinkTracking", "<init>", "(Ljava/lang/String;Llp0/a;Llp0/c;Lcom/dyson/mobile/android/analytics/tracking/externallink/ExternalLinkTracking;)V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class n implements a {

        /* renamed from: a  reason: collision with root package name */
        public final String f16683a;

        /* renamed from: b  reason: collision with root package name */
        public final lp0.a f16684b;

        /* renamed from: c  reason: collision with root package name */
        public final lp0.c f16685c;
        public final ExternalLinkTracking d;

        public n(String str, lp0.a aVar, lp0.c cVar, ExternalLinkTracking externalLinkTracking) {
            str.getClass();
            aVar.getClass();
            cVar.getClass();
            externalLinkTracking.getClass();
            this.f16683a = str;
            this.f16684b = aVar;
            this.f16685c = cVar;
            this.d = externalLinkTracking;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof n) {
                n nVar = (n) obj;
                return this.f16683a.equals(nVar.f16683a) && this.f16684b == nVar.f16684b && this.f16685c == nVar.f16685c && this.d.equals(nVar.d);
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = this.f16684b.hashCode();
            int hashCode2 = this.f16685c.hashCode();
            return this.d.hashCode() + ((hashCode2 + ((hashCode + (this.f16683a.hashCode() * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "ShowPurchaseFilter(machineSerial=" + this.f16683a + ", productType=" + this.f16684b + ", trackerCampaignOrigin=" + this.f16685c + ", externalLinkTracking=" + this.d + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/salesforce/a$o;", "Lcom/dyson/mobile/android/salesforce/a;", "", "category", "<init>", "(Ljava/lang/String;)V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class o implements a {

        /* renamed from: a  reason: collision with root package name */
        public final String f16686a;

        public o(String str) {
            str.getClass();
            this.f16686a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && this.f16686a.equals(((o) obj).f16686a);
        }

        public final int hashCode() {
            return this.f16686a.hashCode();
        }

        public final String toString() {
            return bv1.f.e("ShowQuestionnaire(category=", this.f16686a, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/salesforce/a$l;", "Lcom/dyson/mobile/android/salesforce/a;", "Lcom/dyson/mobile/android/machinetype/MachineDefinition;", "machineDefinition", "", "selectedTabId", "<init>", "(Lcom/dyson/mobile/android/machinetype/MachineDefinition;Ljava/lang/String;)V", "DysonLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class l implements a {

        /* renamed from: a  reason: collision with root package name */
        public final MachineDefinition f16680a;

        /* renamed from: b  reason: collision with root package name */
        public final String f16681b;

        public l(MachineDefinition machineDefinition, String str) {
            machineDefinition.getClass();
            this.f16680a = machineDefinition;
            this.f16681b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof l) {
                l lVar = (l) obj;
                return r.c(this.f16680a, lVar.f16680a) && r.c(this.f16681b, lVar.f16681b);
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = this.f16680a.hashCode() * 31;
            String str = this.f16681b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "ShowMachineInLobby(machineDefinition=" + this.f16680a + ", selectedTabId=" + this.f16681b + ")";
        }

        public /* synthetic */ l(MachineDefinition machineDefinition, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
            this(machineDefinition, (i13 & 2) != 0 ? null : str);
        }
    }
}
