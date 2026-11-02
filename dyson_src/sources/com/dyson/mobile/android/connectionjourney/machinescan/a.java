package com.dyson.mobile.android.connectionjourney.machinescan;

import com.dyson.mobile.android.machinetype.MachineDescriptor;
import i12.c0;
import i12.e0;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB/\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/machinescan/a;", "Ljava/io/Serializable;", "", "showMachinesAlreadyInManifest", "", "machineSerialNumber", "", "Lcom/dyson/mobile/android/machinetype/MachineDescriptor;", "machineDescriptors", "<init>", "(ZLjava/lang/String;Ljava/util/Collection;)V", "a", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a implements Serializable {

    /* renamed from: g  reason: collision with root package name */
    public static final C0426a f13551g = new C0426a(null);
    public final boolean d;
    public final String e;

    /* renamed from: f  reason: collision with root package name */
    public final Collection<MachineDescriptor> f13552f;

    public a(boolean z13, String str, Collection collection, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z13, (i13 & 2) != 0 ? null : str, (i13 & 4) != 0 ? e0.d : collection);
    }

    public static final a a(List list) {
        f13551g.getClass();
        list.getClass();
        return new a(false, null, c0.A0(list), 3, null);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/machinescan/a$a;", "", "<init>", "()V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.connectionjourney.machinescan.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0426a {
        public /* synthetic */ C0426a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0426a() {
        }
    }

    private a(boolean z13, String str, Collection<MachineDescriptor> collection) {
        this.d = z13;
        this.e = str;
        this.f13552f = collection;
    }
}
