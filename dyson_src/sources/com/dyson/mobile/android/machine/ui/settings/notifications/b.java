package com.dyson.mobile.android.machine.ui.settings.notifications;

import com.dyson.mobile.android.localisation.LocalisationKey;
import com.dyson.mobile.android.logging.Logger;
import com.dyson.mobile.android.machine.ui.settings.notifications.MachineNotificationItem;
import com.dyson.mobile.android.machine.ui.settings.notifications.a;
import hj.e;
import i12.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/settings/notifications/b;", "", "Lcom/dyson/mobile/android/machine/ui/settings/notifications/MachineNotificationSection;", "machineNotificationSection", "Lorg/json/JSONObject;", "notificationData", "Lcom/dyson/mobile/android/machine/ui/settings/notifications/a$a;", "callback", "Lhj/e;", "trackingManager", "<init>", "(Lcom/dyson/mobile/android/machine/ui/settings/notifications/MachineNotificationSection;Lorg/json/JSONObject;Lcom/dyson/mobile/android/machine/ui/settings/notifications/a$a;Lhj/e;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final LocalisationKey f15491a;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f15492b;

    public b(MachineNotificationSection machineNotificationSection, JSONObject jSONObject, a.InterfaceC0532a interfaceC0532a, e eVar) {
        boolean z13;
        machineNotificationSection.getClass();
        jSONObject.getClass();
        interfaceC0532a.getClass();
        eVar.getClass();
        this.f15491a = machineNotificationSection.d;
        List<MachineNotificationItem> list = machineNotificationSection.e;
        ArrayList arrayList = new ArrayList(u.o(list, 10));
        for (MachineNotificationItem machineNotificationItem : list) {
            a aVar = new a(machineNotificationItem, eVar);
            aVar.f15490c = interfaceC0532a;
            boolean z14 = false;
            if (machineNotificationItem instanceof MachineNotificationItem.SingleMachineNotificationItem) {
                String str = ((MachineNotificationItem.SingleMachineNotificationItem) machineNotificationItem).d;
                try {
                    z14 = jSONObject.getBoolean(str);
                } catch (JSONException unused) {
                    Logger.e("Failed to parse json for item with id: " + str, null);
                }
            } else if (!(machineNotificationItem instanceof MachineNotificationItem.CompositeMachineNotificationItem)) {
                ma.e.o();
                throw null;
            } else {
                List<String> list2 = ((MachineNotificationItem.CompositeMachineNotificationItem) machineNotificationItem).d;
                if (list2 == null || !list2.isEmpty()) {
                    Iterator<T> it = list2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            String str2 = (String) it.next();
                            try {
                                z13 = jSONObject.getBoolean(str2);
                                continue;
                            } catch (JSONException unused2) {
                                Logger.e("Failed to parse json for item with id: " + str2, null);
                                z13 = false;
                                continue;
                            }
                            if (z13) {
                                z14 = true;
                                break;
                            }
                        }
                    }
                }
            }
            aVar.a(z14);
            arrayList.add(aVar);
        }
        this.f15492b = arrayList;
    }
}
