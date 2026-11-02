package com.dyson.mobile.android.dynamiccontent.responsemodels;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import java.lang.reflect.Type;
import kotlin.Metadata;
import o80.h;
import x12.r;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/dynamiccontent/responsemodels/UnifiedContentImageDisplayAdapter;", "Lcom/google/gson/JsonDeserializer;", "Lo80/h;", "<init>", "()V", "mod-dynamic-content"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UnifiedContentImageDisplayAdapter implements JsonDeserializer<h> {
    @Override // com.google.gson.JsonDeserializer
    public final h deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        return r.c(jsonElement != null ? jsonElement.getAsString() : null, "inlineWithDescription") ? h.InlineWithDescription : h.UNKNOWN;
    }
}
