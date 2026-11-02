package com.dyson.mobile.android.machine.response.devicesharing;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import gk0.g;
import java.lang.reflect.Type;
import java.util.Iterator;
import kotlin.Metadata;
import x12.r;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/machine/response/devicesharing/DeviceSharingUserStatusAdapter;", "Lcom/google/gson/JsonDeserializer;", "Lgk0/g;", "<init>", "()V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DeviceSharingUserStatusAdapter implements JsonDeserializer<g> {
    @Override // com.google.gson.JsonDeserializer
    public final g deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        Object obj = null;
        String asString = jsonElement != null ? jsonElement.getAsString() : null;
        Iterator<E> it = g.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (r.c(((g) next).getValue(), asString)) {
                obj = next;
                break;
            }
        }
        g gVar = (g) obj;
        return gVar == null ? g.UNDEFINED : gVar;
    }
}
