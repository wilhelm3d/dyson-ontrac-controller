package com.dyson.mobile.android.connectivity;

import android.os.Parcelable;
import com.dyson.mobile.android.machinetype.MachineDescriptor;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import u50.o;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/connectivity/MachineScanRecord;", "Landroid/os/Parcelable;", "<init>", "()V", "a", "mod-connectivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class MachineScanRecord implements Parcelable {
    public String d;
    public MachineDescriptor e;

    static {
        new a(null);
    }

    public final MachineDescriptor i() {
        if (this.e == null) {
            this.e = p();
        }
        MachineDescriptor machineDescriptor = this.e;
        machineDescriptor.getClass();
        return machineDescriptor;
    }

    public abstract String j();

    public final String k() {
        if (this.d == null) {
            this.d = q();
        }
        String str = this.d;
        str.getClass();
        return str;
    }

    public abstract String l();

    public abstract Set<o> m();

    public abstract int n();

    public abstract MachineDescriptor p();

    public abstract String q();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/connectivity/MachineScanRecord$a;", "", "<init>", "()V", "", "TYPE_NON_CONNECTED", "I", "TYPE_BLE", "TYPE_MDNS", "mod-connectivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
