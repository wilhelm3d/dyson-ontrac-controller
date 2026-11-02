package com.dyson.mobile.android.dynamiccontent.responsemodels;

import com.brightcove.player.event.AbstractEvent;
import com.dyson.mobile.android.dynamiccontent.responsemodels.b;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/dynamiccontent/responsemodels/ContentItemJsonAdapter;", "Lcom/google/gson/JsonDeserializer;", "Lcom/dyson/mobile/android/dynamiccontent/responsemodels/b;", "Lcom/google/gson/JsonSerializer;", "<init>", "()V", "mod-dynamic-content"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ContentItemJsonAdapter implements JsonDeserializer<b>, JsonSerializer<b> {
    /* JADX WARN: Removed duplicated region for block: B:47:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0099  */
    @Override // com.google.gson.JsonDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.dyson.mobile.android.dynamiccontent.responsemodels.b deserialize(com.google.gson.JsonElement r2, java.lang.reflect.Type r3, com.google.gson.JsonDeserializationContext r4) {
        /*
            r1 = this;
            r4.getClass()
            r1 = 0
            int r3 = h12.q.e     // Catch: java.lang.Throwable -> L1b
            if (r2 == 0) goto L1e
            com.google.gson.JsonObject r3 = r2.getAsJsonObject()     // Catch: java.lang.Throwable -> L1b
            if (r3 == 0) goto L1e
            java.lang.String r0 = "type"
            com.google.gson.JsonElement r3 = r3.get(r0)     // Catch: java.lang.Throwable -> L1b
            if (r3 == 0) goto L1e
            java.lang.String r3 = r3.getAsString()     // Catch: java.lang.Throwable -> L1b
            goto L1f
        L1b:
            r3 = move-exception
            goto L79
        L1e:
            r3 = r1
        L1f:
            if (r3 == 0) goto L71
            int r0 = r3.hashCode()     // Catch: java.lang.Throwable -> L1b
            switch(r0) {
                case -1052618729: goto L65;
                case 2908512: goto L59;
                case 3181382: goto L4d;
                case 3322014: goto L41;
                case 3556653: goto L35;
                case 100313435: goto L29;
                default: goto L28;
            }     // Catch: java.lang.Throwable -> L1b
        L28:
            goto L71
        L29:
            java.lang.String r0 = "image"
            boolean r3 = r3.equals(r0)     // Catch: java.lang.Throwable -> L1b
            if (r3 != 0) goto L32
            goto L71
        L32:
            java.lang.Class<com.dyson.mobile.android.dynamiccontent.responsemodels.b$c> r3 = com.dyson.mobile.android.dynamiccontent.responsemodels.b.c.class
            goto L72
        L35:
            java.lang.String r0 = "text"
            boolean r3 = r3.equals(r0)     // Catch: java.lang.Throwable -> L1b
            if (r3 != 0) goto L3e
            goto L71
        L3e:
            java.lang.Class<com.dyson.mobile.android.dynamiccontent.responsemodels.b$e> r3 = com.dyson.mobile.android.dynamiccontent.responsemodels.b.e.class
            goto L72
        L41:
            java.lang.String r0 = "list"
            boolean r3 = r3.equals(r0)     // Catch: java.lang.Throwable -> L1b
            if (r3 != 0) goto L4a
            goto L71
        L4a:
            java.lang.Class<com.dyson.mobile.android.dynamiccontent.responsemodels.b$f> r3 = com.dyson.mobile.android.dynamiccontent.responsemodels.b.f.class
            goto L72
        L4d:
            java.lang.String r0 = "grid"
            boolean r3 = r3.equals(r0)     // Catch: java.lang.Throwable -> L1b
            if (r3 != 0) goto L56
            goto L71
        L56:
            java.lang.Class<com.dyson.mobile.android.dynamiccontent.responsemodels.b$b> r3 = com.dyson.mobile.android.dynamiccontent.responsemodels.b.C0453b.class
            goto L72
        L59:
            java.lang.String r0 = "carousel"
            boolean r3 = r3.equals(r0)     // Catch: java.lang.Throwable -> L1b
            if (r3 != 0) goto L62
            goto L71
        L62:
            java.lang.Class<com.dyson.mobile.android.dynamiccontent.responsemodels.b$a> r3 = com.dyson.mobile.android.dynamiccontent.responsemodels.b.a.class
            goto L72
        L65:
            java.lang.String r0 = "native"
            boolean r3 = r3.equals(r0)     // Catch: java.lang.Throwable -> L1b
            if (r3 != 0) goto L6e
            goto L71
        L6e:
            java.lang.Class<com.dyson.mobile.android.dynamiccontent.responsemodels.b$d> r3 = com.dyson.mobile.android.dynamiccontent.responsemodels.b.d.class
            goto L72
        L71:
            r3 = r1
        L72:
            java.lang.Object r3 = r4.deserialize(r2, r3)     // Catch: java.lang.Throwable -> L1b
            com.dyson.mobile.android.dynamiccontent.responsemodels.b r3 = (com.dyson.mobile.android.dynamiccontent.responsemodels.b) r3     // Catch: java.lang.Throwable -> L1b
            goto L81
        L79:
            int r4 = h12.q.e
            h12.q$b r4 = new h12.q$b
            r4.<init>(r3)
            r3 = r4
        L81:
            java.lang.Throwable r4 = h12.q.b(r3)
            if (r4 == 0) goto L94
            if (r2 == 0) goto L8e
            java.lang.String r2 = r2.toString()
            goto L8f
        L8e:
            r2 = r1
        L8f:
            java.lang.String r0 = "Exception thrown parsing unified content item - json "
            q62.n.n(r0, r2, r4)
        L94:
            boolean r2 = r3 instanceof h12.q.b
            if (r2 == 0) goto L99
            goto L9a
        L99:
            r1 = r3
        L9a:
            com.dyson.mobile.android.dynamiccontent.responsemodels.b r1 = (com.dyson.mobile.android.dynamiccontent.responsemodels.b) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.dynamiccontent.responsemodels.ContentItemJsonAdapter.deserialize(com.google.gson.JsonElement, java.lang.reflect.Type, com.google.gson.JsonDeserializationContext):java.lang.Object");
    }

    @Override // com.google.gson.JsonSerializer
    public final JsonElement serialize(b bVar, Type type, JsonSerializationContext jsonSerializationContext) {
        b bVar2 = bVar;
        jsonSerializationContext.getClass();
        JsonElement serialize = jsonSerializationContext.serialize(bVar2);
        serialize.getAsJsonObject().addProperty(com.salesforce.marketingcloud.messages.inbox.b.f21448j, bVar2 instanceof b.e ? "text" : bVar2 instanceof b.c ? "image" : bVar2 instanceof b.C0453b ? "grid" : bVar2 instanceof b.a ? "carousel" : bVar2 instanceof b.f ? AbstractEvent.LIST : bVar2 instanceof b.d ? "native" : null);
        return serialize;
    }
}
