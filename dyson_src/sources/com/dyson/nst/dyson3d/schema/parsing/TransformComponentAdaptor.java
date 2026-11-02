package com.dyson.nst.dyson3d.schema.parsing;

import com.dyson.nst.dyson3d.schema.model.TransformComponent;
import java.util.Map;
import kotlin.Metadata;
import oy1.p;
import oy1.u;
import yy1.b;
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\u0010\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/parsing/TransformComponentAdaptor;", "", "<init>", "()V", "", "", "values", "Lyy1/b;", "readVectorFloatArray", "(Ljava/util/Map;)Lyy1/b;", "Loy1/u;", "reader", "Lcom/dyson/nst/dyson3d/schema/model/TransformComponent;", "fromJson", "(Loy1/u;)Lcom/dyson/nst/dyson3d/schema/model/TransformComponent;", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransformComponentAdaptor {
    public static final int $stable = 0;

    private final b readVectorFloatArray(Map<String, ?> map) {
        if (map.containsKey("value")) {
            Object obj = map.get("value");
            obj.getClass();
            float doubleValue = (float) ((Double) obj).doubleValue();
            return new b(doubleValue, doubleValue, doubleValue);
        }
        Object obj2 = map.get("x");
        Double d = obj2 instanceof Double ? (Double) obj2 : null;
        double doubleValue2 = d != null ? d.doubleValue() : 0.0d;
        Object obj3 = map.get("y");
        Double d13 = obj3 instanceof Double ? (Double) obj3 : null;
        double doubleValue3 = d13 != null ? d13.doubleValue() : 0.0d;
        Object obj4 = map.get("z");
        Double d14 = obj4 instanceof Double ? (Double) obj4 : null;
        return new b((float) doubleValue2, (float) doubleValue3, (float) (d14 != null ? d14.doubleValue() : 0.0d));
    }

    @p
    public final TransformComponent fromJson(u uVar) {
        uVar.getClass();
        Object Y = uVar.Y();
        Y.getClass();
        Map<String, ?> map = (Map) Y;
        b readVectorFloatArray = readVectorFloatArray(map);
        TransformComponent.Type type = TransformComponent.Type.ABSOLUTE;
        if (map.containsKey(com.salesforce.marketingcloud.messages.inbox.b.f21448j)) {
            TransformComponentTypeAdaptor transformComponentTypeAdaptor = new TransformComponentTypeAdaptor();
            Object obj = map.get(com.salesforce.marketingcloud.messages.inbox.b.f21448j);
            obj.getClass();
            type = transformComponentTypeAdaptor.fromJson((String) obj);
        }
        return new TransformComponent(readVectorFloatArray, type);
    }
}
