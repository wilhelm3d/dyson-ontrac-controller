package com.dyson.mobile.android.machinetype;

import android.annotation.SuppressLint;
import androidx.annotation.Keep;
import com.dyson.mobile.android.localisation.LocalisationKey;
import hx.v;
import i12.q;
import in0.i;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mn0.c;
import mn0.d;
import mn0.e;
import mn0.f;
import rf0.a0;
import rf0.g0;
import rf0.i0;
import rf0.j;
import rf0.k;
import rf0.w;
import rf0.x;
import rf0.y;
import rf0.z;
import x12.r;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b=\b\u0087\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000bj\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bE¨\u0006F"}, d2 = {"Lcom/dyson/mobile/android/machinetype/MachineType;", "", "", "typeName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getTypeName", "()Ljava/lang/String;", "", "isGen1Machine", "()Z", "isSingleUserMachine", "Companion", "a", "MACHINE_475", "MACHINE_469", "MACHINE_455", "MACHINE_455C", "MACHINE_520", "MACHINE_438", "MACHINE_438E", "MACHINE_438K", "MACHINE_527", "MACHINE_527E", "MACHINE_527K", "MACHINE_358", "MACHINE_358E", "MACHINE_358K", "MACHINE_664", "MACHINE_675", "MACHINE_739", "MACHINE_897", "MACHINE_898", "MACHINE_635", "MACHINE_831", "MACHINE_917", "MACHINE_918", "MACHINE_949", "MACHINE_965", "MACHINE_960", "MACHINE_994", "MACHINE_997", "MACHINE_1018", "MACHINE_223", "MACHINE_276", "MACHINE_277", "MACHINE_804", "MACHINE_914", "MACHINE_915", "MACHINE_1038", "MACHINE_1040", "MACHINE_1042", "MACHINE_552", "MACHINE_571", "MACHINE_308", "MACHINE_590", "MACHINE_873", "MACHINE_683", "MACHINE_692", "MACHINE_832", "MACHINE_682", "MACHINE_930", "MACHINE_938", "MACHINE_975", "MACHINE_977", "MACHINE_986", "MACHINE_998", "MACHINE_999", "MACHINE_UNKNOWN", "mod-machine-type"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SuppressLint({"RegionBlocks"})
/* loaded from: classes3.dex */
public final class MachineType {
    private static final /* synthetic */ o12.a $ENTRIES;
    private static final /* synthetic */ MachineType[] $VALUES;
    public static final a Companion;
    public static final MachineType MACHINE_1018;
    public static final MachineType MACHINE_1038;
    public static final MachineType MACHINE_1040;
    public static final MachineType MACHINE_1042;
    public static final MachineType MACHINE_223;
    public static final MachineType MACHINE_276;
    public static final MachineType MACHINE_277;
    public static final MachineType MACHINE_308;
    public static final MachineType MACHINE_358;
    public static final MachineType MACHINE_358E;
    public static final MachineType MACHINE_358K;
    public static final MachineType MACHINE_438;
    public static final MachineType MACHINE_438E;
    public static final MachineType MACHINE_438K;
    public static final MachineType MACHINE_455;
    public static final MachineType MACHINE_455C;
    public static final MachineType MACHINE_469;
    public static final MachineType MACHINE_475;
    public static final MachineType MACHINE_520;
    public static final MachineType MACHINE_527;
    public static final MachineType MACHINE_527E;
    public static final MachineType MACHINE_527K;
    public static final MachineType MACHINE_552;
    public static final MachineType MACHINE_571;
    public static final MachineType MACHINE_590;
    public static final MachineType MACHINE_635;
    public static final MachineType MACHINE_664;
    public static final MachineType MACHINE_675;
    public static final MachineType MACHINE_682;
    public static final MachineType MACHINE_683;
    public static final MachineType MACHINE_692;
    public static final MachineType MACHINE_739;
    public static final MachineType MACHINE_804;
    public static final MachineType MACHINE_831;
    public static final MachineType MACHINE_832;
    public static final MachineType MACHINE_873;
    public static final MachineType MACHINE_897;
    public static final MachineType MACHINE_898;
    public static final MachineType MACHINE_914;
    public static final MachineType MACHINE_915;
    public static final MachineType MACHINE_917;
    public static final MachineType MACHINE_918;
    public static final MachineType MACHINE_930;
    public static final MachineType MACHINE_938;
    public static final MachineType MACHINE_949;
    public static final MachineType MACHINE_960;
    public static final MachineType MACHINE_965;
    public static final MachineType MACHINE_975;
    public static final MachineType MACHINE_977;
    public static final MachineType MACHINE_986;
    public static final MachineType MACHINE_994;
    public static final MachineType MACHINE_997;
    public static final MachineType MACHINE_998;
    public static final MachineType MACHINE_999;
    public static final MachineType MACHINE_UNKNOWN;
    private static final Set<MachineType> gen1Machines;
    private final String typeName;

    private static final /* synthetic */ MachineType[] $values() {
        return new MachineType[]{MACHINE_475, MACHINE_469, MACHINE_455, MACHINE_455C, MACHINE_520, MACHINE_438, MACHINE_438E, MACHINE_438K, MACHINE_527, MACHINE_527E, MACHINE_527K, MACHINE_358, MACHINE_358E, MACHINE_358K, MACHINE_664, MACHINE_675, MACHINE_739, MACHINE_897, MACHINE_898, MACHINE_635, MACHINE_831, MACHINE_917, MACHINE_918, MACHINE_949, MACHINE_965, MACHINE_960, MACHINE_994, MACHINE_997, MACHINE_1018, MACHINE_223, MACHINE_276, MACHINE_277, MACHINE_804, MACHINE_914, MACHINE_915, MACHINE_1038, MACHINE_1040, MACHINE_1042, MACHINE_552, MACHINE_571, MACHINE_308, MACHINE_590, MACHINE_873, MACHINE_683, MACHINE_692, MACHINE_832, MACHINE_682, MACHINE_930, MACHINE_938, MACHINE_975, MACHINE_977, MACHINE_986, MACHINE_998, MACHINE_999, MACHINE_UNKNOWN};
    }

    static {
        MachineType machineType = new MachineType("MACHINE_475", 0, "475");
        MACHINE_475 = machineType;
        MachineType machineType2 = new MachineType("MACHINE_469", 1, "469");
        MACHINE_469 = machineType2;
        MachineType machineType3 = new MachineType("MACHINE_455", 2, "455");
        MACHINE_455 = machineType3;
        MACHINE_455C = new MachineType("MACHINE_455C", 3, "455C");
        MACHINE_520 = new MachineType("MACHINE_520", 4, "520");
        MACHINE_438 = new MachineType("MACHINE_438", 5, "438");
        MACHINE_438E = new MachineType("MACHINE_438E", 6, "438E");
        MACHINE_438K = new MachineType("MACHINE_438K", 7, "438K");
        MACHINE_527 = new MachineType("MACHINE_527", 8, "527");
        MACHINE_527E = new MachineType("MACHINE_527E", 9, "527E");
        MACHINE_527K = new MachineType("MACHINE_527K", 10, "527K");
        MACHINE_358 = new MachineType("MACHINE_358", 11, "358");
        MACHINE_358E = new MachineType("MACHINE_358E", 12, "358E");
        MACHINE_358K = new MachineType("MACHINE_358K", 13, "358K");
        MACHINE_664 = new MachineType("MACHINE_664", 14, "664");
        MACHINE_675 = new MachineType("MACHINE_675", 15, "675");
        MACHINE_739 = new MachineType("MACHINE_739", 16, "739");
        MACHINE_897 = new MachineType("MACHINE_897", 17, "897");
        MACHINE_898 = new MachineType("MACHINE_898", 18, "898");
        MACHINE_635 = new MachineType("MACHINE_635", 19, "635");
        MACHINE_831 = new MachineType("MACHINE_831", 20, "831");
        MACHINE_917 = new MachineType("MACHINE_917", 21, "917");
        MACHINE_918 = new MachineType("MACHINE_918", 22, "918");
        MACHINE_949 = new MachineType("MACHINE_949", 23, "949");
        MACHINE_965 = new MachineType("MACHINE_965", 24, "965");
        MACHINE_960 = new MachineType("MACHINE_960", 25, "960");
        MACHINE_994 = new MachineType("MACHINE_994", 26, "994");
        MACHINE_997 = new MachineType("MACHINE_997", 27, "997");
        MACHINE_1018 = new MachineType("MACHINE_1018", 28, "1018");
        MachineType machineType4 = new MachineType("MACHINE_223", 29, "N223");
        MACHINE_223 = machineType4;
        MACHINE_276 = new MachineType("MACHINE_276", 30, "276");
        MACHINE_277 = new MachineType("MACHINE_277", 31, "277");
        MACHINE_804 = new MachineType("MACHINE_804", 32, "804");
        MACHINE_914 = new MachineType("MACHINE_914", 33, "914");
        MACHINE_915 = new MachineType("MACHINE_915", 34, "915");
        MACHINE_1038 = new MachineType("MACHINE_1038", 35, "1038");
        MACHINE_1040 = new MachineType("MACHINE_1040", 36, "1040");
        MACHINE_1042 = new MachineType("MACHINE_1042", 37, "1042");
        MACHINE_552 = new MachineType("MACHINE_552", 38, "552");
        MACHINE_571 = new MachineType("MACHINE_571", 39, "571");
        MACHINE_308 = new MachineType("MACHINE_308", 40, "308");
        MACHINE_590 = new MachineType("MACHINE_590", 41, "590");
        MACHINE_873 = new MachineType("MACHINE_873", 42, "873");
        MACHINE_683 = new MachineType("MACHINE_683", 43, "683");
        MACHINE_692 = new MachineType("MACHINE_692", 44, "692");
        MACHINE_832 = new MachineType("MACHINE_832", 45, "832");
        MACHINE_682 = new MachineType("MACHINE_682", 46, "682");
        MACHINE_930 = new MachineType("MACHINE_930", 47, "930");
        MACHINE_938 = new MachineType("MACHINE_938", 48, "938");
        MACHINE_975 = new MachineType("MACHINE_975", 49, "975");
        MACHINE_977 = new MachineType("MACHINE_977", 50, "977");
        MACHINE_986 = new MachineType("MACHINE_986", 51, "986");
        MACHINE_998 = new MachineType("MACHINE_998", 52, "998");
        MACHINE_999 = new MachineType("MACHINE_999", 53, "999");
        MACHINE_UNKNOWN = new MachineType("MACHINE_UNKNOWN", 54, "???");
        MachineType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = v.l($values);
        Companion = new a(null);
        gen1Machines = q.e0(new MachineType[]{machineType, machineType2, machineType3, machineType4});
    }

    private MachineType(String str, int i13, String str2) {
        this.typeName = str2;
    }

    public static final MachineType fromTypeName(String str) {
        Companion.getClass();
        return a.a(str);
    }

    public static o12.a<MachineType> getEntries() {
        return $ENTRIES;
    }

    public static final LocalisationKey getShortNameByTypeName(String str) {
        Companion.getClass();
        return a.b(str);
    }

    public static final LocalisationKey getShortNameByTypeVariant(String str, String str2) {
        Companion.getClass();
        return a.c(str, str2);
    }

    public static MachineType valueOf(String str) {
        return (MachineType) Enum.valueOf(MachineType.class, str);
    }

    public static MachineType[] values() {
        return (MachineType[]) $VALUES.clone();
    }

    public final String getTypeName() {
        return this.typeName;
    }

    public final boolean isGen1Machine() {
        return gen1Machines.contains(this);
    }

    public final boolean isSingleUserMachine() {
        return this == MACHINE_571;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/machinetype/MachineType$a;", "", "<init>", "()V", "", "Lcom/dyson/mobile/android/machinetype/MachineType;", "gen1Machines", "Ljava/util/Set;", "mod-machine-type"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static MachineType a(String str) {
            Object obj;
            str.getClass();
            Iterator<E> it = MachineType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (r.c(((MachineType) obj).getTypeName(), str)) {
                    break;
                }
            }
            MachineType machineType = (MachineType) obj;
            return machineType == null ? MachineType.MACHINE_UNKNOWN : machineType;
        }

        public static LocalisationKey b(String str) {
            str.getClass();
            return str.equals(MachineType.MACHINE_223.getTypeName()) ? g0.f71476l2 : str.equals(MachineType.MACHINE_276.getTypeName()) ? j.O : str.equals(MachineType.MACHINE_277.getTypeName()) ? k.f72085a : str.equals(MachineType.MACHINE_804.getTypeName()) ? w.f72811a : str.equals(MachineType.MACHINE_914.getTypeName()) ? a0.f70901a : str.equals(MachineType.MACHINE_915.getTypeName()) ? new f(null, null, null, 7, null).f54443a : str.equals(MachineType.MACHINE_1038.getTypeName()) ? new mn0.a(null, 1, null).f54428a : str.equals(MachineType.MACHINE_1040.getTypeName()) ? new mn0.b(null, 1, null).f54429a : str.equals(MachineType.MACHINE_1042.getTypeName()) ? new c(null, 1, null).f54430a : i0.H2;
        }

        public static LocalisationKey c(String str, String str2) {
            str.getClass();
            return r.c(str2, i.VARIANT_277E.getValue()) ? new d(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null).f54431a : r.c(str2, i.VARIANT_804A.getValue()) ? w.f72811a : r.c(str2, i.VARIANT_804B.getValue()) ? x.f73015a : r.c(str2, i.VARIANT_804E.getValue()) ? y.f73019a : r.c(str2, i.VARIANT_804F.getValue()) ? new e(null, 1, null).f54442a : r.c(str2, i.VARIANT_914A.getValue()) ? z.f73020a : b(str);
        }

        private a() {
        }
    }
}
