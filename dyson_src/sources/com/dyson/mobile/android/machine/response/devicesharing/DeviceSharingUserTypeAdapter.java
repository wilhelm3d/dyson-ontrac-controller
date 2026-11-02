package com.dyson.mobile.android.machine.response.devicesharing;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import gk0.h;
import java.lang.reflect.Type;
import java.util.Iterator;
import kotlin.Metadata;
import x12.r;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/machine/response/devicesharing/DeviceSharingUserTypeAdapter;", "Lcom/google/gson/JsonDeserializer;", "Lgk0/h;", "<init>", "()V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DeviceSharingUserTypeAdapter implements JsonDeserializer<h> {
    @Override // com.google.gson.JsonDeserializer
    public final h deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        Object obj = null;
        String asString = jsonElement != null ? jsonElement.getAsString() : null;
        Iterator<E> it = h.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (r.c(((h) next).getValue(), asString)) {
                obj = next;
                break;
            }
        }
        h hVar = (h) obj;
        return hVar == null ? h.UNDEFINED : hVar;
    }
}
