package com.dyson.mobile.android.robot.cloud.newsystem.common;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/robot/cloud/newsystem/common/DirtTypeAdapter;", "Lcom/google/gson/JsonDeserializer;", "Lcom/dyson/mobile/android/robot/cloud/newsystem/common/DirtType;", "<init>", "()V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
final class DirtTypeAdapter implements JsonDeserializer<DirtType> {
    @Override // com.google.gson.JsonDeserializer
    public final DirtType deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        jsonElement.getClass();
        type.getClass();
        jsonDeserializationContext.getClass();
        String asString = jsonElement.getAsString();
        if (asString != null) {
            int hashCode = asString.hashCode();
            if (hashCode != -1102567108) {
                if (hashCode != 3745) {
                    if (hashCode == 109618859 && asString.equals("solid")) {
                        return DirtType.SOLID;
                    }
                } else if (asString.equals("uv")) {
                    return DirtType.UV;
                }
            } else if (asString.equals("liquid")) {
                return DirtType.LIQUID;
            }
        }
        return DirtType.UNKNOWN;
    }
}
