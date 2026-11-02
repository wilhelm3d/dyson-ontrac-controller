package com.dyson.mobile.android.machine.response.sectioncontent;

import com.brightcove.player.event.AbstractEvent;
import com.dyson.mobile.android.machine.response.sectioncontent.SectionContentItem;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.paypal.android.platform.authsdk.authcommon.AuthAnalyticsConstants;
import com.salesforce.marketingcloud.messages.inbox.b;
import java.lang.reflect.Type;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/machine/response/sectioncontent/SectionContentAdapter;", "Lcom/google/gson/JsonDeserializer;", "Lcom/dyson/mobile/android/machine/response/sectioncontent/SectionContentItem;", "Lcom/google/gson/JsonSerializer;", "<init>", "()V", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SectionContentAdapter implements JsonDeserializer<SectionContentItem>, JsonSerializer<SectionContentItem> {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.gson.JsonDeserializer
    public final SectionContentItem deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        Type type2;
        JsonObject asJsonObject;
        JsonElement jsonElement2;
        jsonDeserializationContext.getClass();
        String asString = (jsonElement == null || (asJsonObject = jsonElement.getAsJsonObject()) == null || (jsonElement2 = asJsonObject.get(b.f21448j)) == null) ? null : jsonElement2.getAsString();
        if (asString != null) {
            switch (asString.hashCode()) {
                case -1741312354:
                    if (asString.equals("collection")) {
                        type2 = SectionContentItem.Collection.class;
                        break;
                    }
                    break;
                case -1052618729:
                    if (asString.equals("native")) {
                        type2 = SectionContentItem.Native.class;
                        break;
                    }
                    break;
                case 3321850:
                    if (asString.equals(AuthAnalyticsConstants.LINK_KEY)) {
                        type2 = SectionContentItem.Link.class;
                        break;
                    }
                    break;
                case 3322014:
                    if (asString.equals(AbstractEvent.LIST)) {
                        type2 = SectionContentItem.List.class;
                        break;
                    }
                    break;
            }
            return (SectionContentItem) jsonDeserializationContext.deserialize(jsonElement, type2);
        }
        type2 = SectionContentItem.Unknown.class;
        return (SectionContentItem) jsonDeserializationContext.deserialize(jsonElement, type2);
    }

    @Override // com.google.gson.JsonSerializer
    public final JsonElement serialize(SectionContentItem sectionContentItem, Type type, JsonSerializationContext jsonSerializationContext) {
        SectionContentItem sectionContentItem2 = sectionContentItem;
        jsonSerializationContext.getClass();
        JsonElement serialize = jsonSerializationContext.serialize(sectionContentItem2);
        serialize.getAsJsonObject().addProperty(b.f21448j, sectionContentItem2 instanceof SectionContentItem.Collection ? "collection" : sectionContentItem2 instanceof SectionContentItem.List ? AbstractEvent.LIST : sectionContentItem2 instanceof SectionContentItem.Native ? "native" : sectionContentItem2 instanceof SectionContentItem.Link ? AuthAnalyticsConstants.LINK_KEY : null);
        return serialize;
    }
}
