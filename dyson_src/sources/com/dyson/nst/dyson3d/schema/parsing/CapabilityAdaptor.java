package com.dyson.nst.dyson3d.schema.parsing;

import com.dyson.nst.dyson3d.schema.model.Capability;
import i12.q0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import oy1.p;
import oy1.u;
import yy1.b;
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/parsing/CapabilityAdaptor;", "", "<init>", "()V", "", "", "", "input", "Lyy1/b;", "createPivotPoint", "(Ljava/util/Map;)Lyy1/b;", "Loy1/u;", "reader", "Lcom/dyson/nst/dyson3d/schema/model/Capability;", "fromJson", "(Loy1/u;)Lcom/dyson/nst/dyson3d/schema/model/Capability;", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CapabilityAdaptor {
    public static final int $stable = 0;

    private final b createPivotPoint(Map<String, Double> map) {
        Double d = map.get("x");
        float doubleValue = d != null ? (float) d.doubleValue() : 0.0f;
        Double d13 = map.get("y");
        float doubleValue2 = d13 != null ? (float) d13.doubleValue() : 0.0f;
        Double d14 = map.get("z");
        return new b(doubleValue, doubleValue2, d14 != null ? (float) d14.doubleValue() : 0.0f);
    }

    @p
    public final Capability fromJson(u uVar) {
        uVar.getClass();
        Object Y = uVar.Y();
        Y.getClass();
        Map map = (Map) Y;
        CapabilityTypeAdaptor capabilityTypeAdaptor = new CapabilityTypeAdaptor();
        Object obj = map.get(com.salesforce.marketingcloud.messages.inbox.b.f21448j);
        obj.getClass();
        Capability.Type fromJson = capabilityTypeAdaptor.fromJson((String) obj);
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.remove(com.salesforce.marketingcloud.messages.inbox.b.f21448j);
        Object obj2 = map.get("node");
        String str = obj2 instanceof String ? (String) obj2 : null;
        linkedHashMap.remove("node");
        Object obj3 = linkedHashMap.get("nodePivot");
        if (obj3 != null) {
            linkedHashMap.put("nodePivot", createPivotPoint((Map) obj3));
        }
        return new Capability(fromJson, q0.l(linkedHashMap), str);
    }
}
