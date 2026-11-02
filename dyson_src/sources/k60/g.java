package k60;

import com.dyson.mobile.android.machinetype.MachineCategory;
import com.dyson.mobile.android.machinetype.MachineDescriptor;
import com.dyson.mobile.android.machinetype.MachineSerial;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lk60/g;", "Lk60/k;", "Ly60/b;", "machinePrefixMetadataProvider", "Lr60/a;", "connectivityDataStore", "<init>", "(Ly60/b;Lr60/a;)V", "a", "mod-connectivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class g implements k {

    /* renamed from: a  reason: collision with root package name */
    public final y60.b f47012a;

    /* loaded from: classes2.dex */
    public static final /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f47013a;

        static {
            int[] iArr = new int[MachineCategory.values().length];
            try {
                iArr[MachineCategory.WEARABLE_EC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MachineCategory.FLOORCARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MachineCategory.HAIRCARE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f47013a = iArr;
        }
    }

    static {
        new a(null);
    }

    public g(y60.b bVar, r60.a aVar) {
        bVar.getClass();
        aVar.getClass();
        this.f47012a = bVar;
    }

    @Override // k60.k
    public final int a(int i13, String str) {
        MachineDescriptor f13;
        str.getClass();
        com.dyson.mobile.android.machinetype.b b13 = this.f47012a.b(new MachineSerial(str));
        MachineCategory machineCategory = (b13 == null || (f13 = b13.f()) == null) ? null : f13.getMachineCategory();
        if (machineCategory != null) {
            int i14 = b.f47013a[machineCategory.ordinal()];
            if (i14 == 1) {
                if (i13 >= 251) {
                    return 240;
                }
                return i13 - 7;
            } else if (i14 == 2 || i14 == 3) {
                if (i13 >= 251) {
                    return 244;
                }
                return i13 - 7;
            } else {
                return 20;
            }
        }
        return 20;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lk60/g$a;", "", "<init>", "()V", "", "MAXIMUM_WEARABLE_EC_FRAGMENT_CAPACITY", "I", "FRAGMENT_HEADER_SIZE", "MAXIMUM_EXTENDED_FRAGMENT_CAPACITY", "mod-connectivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
