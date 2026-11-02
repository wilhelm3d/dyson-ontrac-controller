package com.dyson.mobile.android.audio.customisation;

import bk.j;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.Iterator;
import kotlin.Metadata;
import x12.r;
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/audio/customisation/ColorwayJsonAdapter;", "Lcom/google/gson/JsonSerializer;", "Lbk/j;", "Lcom/google/gson/JsonDeserializer;", "<init>", "()V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ColorwayJsonAdapter implements JsonSerializer<j>, JsonDeserializer<j> {
    @Override // com.google.gson.JsonDeserializer
    public final j deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        Object obj;
        type.getClass();
        jsonDeserializationContext.getClass();
        Iterator<E> it = j.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (r.c(((j) next).getFinishId(), jsonElement != null ? jsonElement.getAsString() : null)) {
                obj = next;
                break;
            }
        }
        return (j) obj;
    }

    @Override // com.google.gson.JsonSerializer
    public final JsonElement serialize(j jVar, Type type, JsonSerializationContext jsonSerializationContext) {
        j jVar2 = jVar;
        jsonSerializationContext.getClass();
        JsonElement serialize = jsonSerializationContext.serialize(jVar2 != null ? jVar2.getFinishId() : null);
        serialize.getClass();
        return serialize;
    }
}
