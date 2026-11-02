package com.dyson.mobile.android.machine.ui.settings.notifications;

import android.text.TextUtils;
import androidx.databinding.ObservableBoolean;
import com.dyson.mobile.android.localisation.LocalisationKey;
import com.dyson.mobile.android.machine.ui.settings.notifications.MachineNotificationItem;
import com.dyson.mobile.android.machine.ui.settings.notifications.a;
import hj.e;
import im1.zb;
import j90.j;
import j90.k;
import j90.m;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kz1.b;
import org.json.JSONException;
import org.json.JSONObject;
import qm0.d;
import rf0.i0;
import se1.w;
import sz1.h;
import sz1.t;
import sz1.v;
import vk0.i;
import vk0.n;
import vk0.s;
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/settings/notifications/c;", "Lq8/a;", "Lcom/dyson/mobile/android/machine/ui/settings/notifications/a$a;", "Lpf0/c;", "localisationManager", "Lvk0/n;", "machineTaskFactory", "", "notificationApplicationId", "Lse1/w;", "playServicesAvailabilityChecker", "Lhj/e;", "trackingManager", "<init>", "(Lpf0/c;Lvk0/n;Ljava/lang/String;Lse1/w;Lhj/e;)V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c extends q8.a implements a.InterfaceC0532a {
    public final pf0.c d;
    public final n e;

    /* renamed from: f  reason: collision with root package name */
    public final String f15493f;

    /* renamed from: g  reason: collision with root package name */
    public final w f15494g;

    /* renamed from: h  reason: collision with root package name */
    public final e f15495h;

    /* renamed from: i  reason: collision with root package name */
    public ArrayList f15496i;

    /* renamed from: j  reason: collision with root package name */
    public WeakReference<qm0.b> f15497j;

    /* renamed from: k  reason: collision with root package name */
    public final ObservableBoolean f15498k;

    /* renamed from: l  reason: collision with root package name */
    public final ObservableBoolean f15499l;

    /* renamed from: m  reason: collision with root package name */
    public final gz1.b f15500m;

    /* renamed from: n  reason: collision with root package name */
    public JSONObject f15501n;

    public c(pf0.c cVar, n nVar, String str, w wVar, e eVar) {
        cVar.getClass();
        nVar.getClass();
        wVar.getClass();
        eVar.getClass();
        this.d = cVar;
        this.e = nVar;
        this.f15493f = str;
        this.f15494g = wVar;
        this.f15495h = eVar;
        this.f15497j = new WeakReference<>(null);
        this.f15498k = new ObservableBoolean(false);
        this.f15499l = new ObservableBoolean(false);
        this.f15500m = new gz1.b();
        this.f15501n = new JSONObject();
    }

    @Override // com.dyson.mobile.android.machine.ui.settings.notifications.a.InterfaceC0532a
    public final void i() {
        ArrayList arrayList = this.f15496i;
        if (arrayList == null) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            ObservableBoolean observableBoolean = this.f15498k;
            if (!hasNext) {
                observableBoolean.m(false);
                return;
            }
            ArrayList arrayList2 = ((b) it.next()).f15492b;
            if (arrayList2 == null || !arrayList2.isEmpty()) {
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    a aVar = (a) it2.next();
                    Boolean bool = aVar.e;
                    if (bool != null && !bool.equals(Boolean.valueOf(aVar.d.d))) {
                        observableBoolean.m(true);
                        return;
                    }
                }
                continue;
            }
        }
    }

    public final void l(List<MachineNotificationSection> list) {
        String str = this.f15493f;
        if (TextUtils.isEmpty(str)) {
            qm0.b bVar = this.f15497j.get();
            if (bVar != null) {
                LocalisationKey localisationKey = i0.Q9;
                pf0.c cVar = this.d;
                bVar.c(cVar.d(localisationKey), cVar.d(this.f15494g.a() ? i0.R9 : i0.S9));
                return;
            }
            return;
        }
        n nVar = this.e;
        nVar.getClass();
        i.a aVar = new i.a();
        k kVar = nVar.f84502c;
        aVar.f84487a = kVar;
        i iVar = new i(kVar, nVar.f84500a, str, 0);
        URL f13 = iVar.f84485b.f(iVar.f84486c);
        m.a aVar2 = new m.a();
        aVar2.f44105a = iVar.f84484a;
        aVar2.f44106b = true;
        aVar2.d = f13;
        aVar2.e = j.GET;
        sz1.c a13 = aVar2.a().a();
        v80.c cVar2 = new v80.c(9);
        b.a aVar3 = kz1.b.f50218a;
        zb.z(this.f15500m, new h(new sz1.j(new t(a13, cVar2).r(c02.a.f10004c).j(fz1.a.a()), new qh.h(new qm0.c(this, 3), 14)), new qm0.e(this, 3)).p(new qh.h(new d(this, list, 0), 9), new qh.h(new d(this, list, 1), 10)));
    }

    public final void m() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f15496i;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                bVar.getClass();
                JSONObject jSONObject = new JSONObject();
                Iterator it2 = bVar.f15492b.iterator();
                while (it2.hasNext()) {
                    a aVar = (a) it2.next();
                    MachineNotificationItem machineNotificationItem = aVar.f15488a;
                    ObservableBoolean observableBoolean = aVar.d;
                    if (machineNotificationItem instanceof MachineNotificationItem.SingleMachineNotificationItem) {
                        String str = ((MachineNotificationItem.SingleMachineNotificationItem) machineNotificationItem).d;
                        try {
                            jSONObject.put(str, observableBoolean.d);
                        } catch (JSONException unused) {
                            q62.n.n("Failed to add item to payload with id: ", str, null);
                        }
                    } else if (!(machineNotificationItem instanceof MachineNotificationItem.CompositeMachineNotificationItem)) {
                        ma.e.o();
                        return;
                    } else {
                        List<String> list = ((MachineNotificationItem.CompositeMachineNotificationItem) machineNotificationItem).d;
                        boolean z13 = observableBoolean.d;
                        for (String str2 : list) {
                            try {
                                jSONObject.put(str2, z13);
                            } catch (JSONException unused2) {
                                q62.n.n("Failed to add item to payload with id: ", str2, null);
                            }
                        }
                    }
                }
                arrayList.add(jSONObject);
            }
        }
        JSONObject jSONObject2 = this.f15501n;
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            JSONObject jSONObject3 = (JSONObject) it3.next();
            Iterator<String> keys = jSONObject3.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    jSONObject2.put(next, jSONObject3.get(next));
                } catch (JSONException unused3) {
                    q62.n.n("Failed to add notification to payload with id: ", next, null);
                }
            }
        }
        n nVar = this.e;
        nVar.getClass();
        s.a aVar2 = new s.a();
        k kVar = nVar.f84502c;
        aVar2.f84526a = kVar;
        s sVar = new s(kVar, nVar.f84500a, this.f15493f, jSONObject2, 0);
        URL f13 = sVar.f84524b.f(sVar.f84525c);
        m.a aVar3 = new m.a();
        aVar3.f44105a = sVar.f84523a;
        aVar3.f44106b = true;
        aVar3.d = f13;
        aVar3.e = j.PUT;
        aVar3.f44108f = sVar.d.toString();
        v j8 = aVar3.a().a().r(c02.a.f10004c).j(fz1.a.a());
        qh.h hVar = new qh.h(new qm0.c(this, 0), 11);
        b.a aVar4 = kz1.b.f50218a;
        zb.z(this.f15500m, new h(new sz1.j(j8, hVar), new qm0.e(this, 2)).p(new qh.h(new qm0.c(this, 1), 12), new qh.h(new qm0.c(this, 2), 13)));
    }
}
