package com.dyson.mobile.android.machine.ui.settings.notifications;

import androidx.databinding.ObservableBoolean;
import com.dyson.mobile.android.machine.ui.settings.notifications.MachineNotificationItem;
import hj.e;
import java.util.Map;
import kotlin.Metadata;
import mj.f;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/settings/notifications/a;", "", "Lcom/dyson/mobile/android/machine/ui/settings/notifications/MachineNotificationItem;", "notificationItem", "Lhj/e;", "trackingManager", "<init>", "(Lcom/dyson/mobile/android/machine/ui/settings/notifications/MachineNotificationItem;Lhj/e;)V", "a", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final MachineNotificationItem f15488a;

    /* renamed from: b  reason: collision with root package name */
    public final e f15489b;

    /* renamed from: c  reason: collision with root package name */
    public InterfaceC0532a f15490c;
    public final ObservableBoolean d;
    public Boolean e;

    /* renamed from: com.dyson.mobile.android.machine.ui.settings.notifications.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0532a {
        void i();
    }

    public a(MachineNotificationItem machineNotificationItem, e eVar) {
        machineNotificationItem.getClass();
        eVar.getClass();
        this.f15488a = machineNotificationItem;
        this.f15489b = eVar;
        this.d = new ObservableBoolean(true);
    }

    public final void a(boolean z13) {
        Map<Boolean, f.c> map;
        f.c cVar;
        if (this.e == null) {
            this.e = Boolean.valueOf(z13);
        }
        this.d.m(z13);
        MachineNotificationItem machineNotificationItem = this.f15488a;
        if ((machineNotificationItem instanceof MachineNotificationItem.SingleMachineNotificationItem) && (map = ((MachineNotificationItem.SingleMachineNotificationItem) machineNotificationItem).f15487f) != null && (cVar = map.get(Boolean.valueOf(z13))) != null) {
            ij.f a13 = new f(cVar, f.a.TOGGLE_CLICK, null, 4, null).a();
            e.a aVar = e.f38312g;
            this.f15489b.g(a13, null);
        }
        InterfaceC0532a interfaceC0532a = this.f15490c;
        if (interfaceC0532a != null) {
            interfaceC0532a.i();
        }
    }
}
