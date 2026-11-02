package com.dyson.mobile.android.dynamiccontent.responsemodels;

import com.brightcove.player.captioning.preferences.CaptionConstants;
import com.dyson.mobile.android.dynamiccontent.responsemodels.a;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import kotlin.Metadata;
import x12.r;
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/dynamiccontent/responsemodels/GridItemJsonAdapter;", "Lcom/google/gson/JsonDeserializer;", "Lcom/dyson/mobile/android/dynamiccontent/responsemodels/a;", "Lcom/google/gson/JsonSerializer;", "<init>", "()V", "mod-dynamic-content"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
final class GridItemJsonAdapter implements JsonDeserializer<a>, JsonSerializer<a> {
    @Override // com.google.gson.JsonDeserializer
    public final a deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        JsonObject asJsonObject;
        JsonElement jsonElement2;
        jsonDeserializationContext.getClass();
        String asString = (jsonElement == null || (asJsonObject = jsonElement.getAsJsonObject()) == null || (jsonElement2 = asJsonObject.get(com.salesforce.marketingcloud.messages.inbox.b.f21448j)) == null) ? null : jsonElement2.getAsString();
        return (a) jsonDeserializationContext.deserialize(jsonElement, r.c(asString, CaptionConstants.PREF_STANDARD) ? a.b.class : r.c(asString, "native") ? a.C0452a.class : a.c.class);
    }

    @Override // com.google.gson.JsonSerializer
    public final JsonElement serialize(a aVar, Type type, JsonSerializationContext jsonSerializationContext) {
        a aVar2 = aVar;
        jsonSerializationContext.getClass();
        JsonElement serialize = jsonSerializationContext.serialize(aVar2);
        serialize.getAsJsonObject().addProperty(com.salesforce.marketingcloud.messages.inbox.b.f21448j, aVar2 instanceof a.b ? CaptionConstants.PREF_STANDARD : aVar2 instanceof a.C0452a ? "native" : null);
        return serialize;
    }
}
