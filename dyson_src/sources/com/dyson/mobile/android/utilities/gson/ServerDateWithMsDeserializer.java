package com.dyson.mobile.android.utilities.gson;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import h12.q;
import if1.a;
import java.lang.reflect.Type;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/utilities/gson/ServerDateWithMsDeserializer;", "Lcom/google/gson/JsonDeserializer;", "Ljava/util/Date;", "<init>", "()V", "mod-utilities"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ServerDateWithMsDeserializer implements JsonDeserializer<Date> {
    @Override // com.google.gson.JsonDeserializer
    public final Date deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        Object bVar;
        jsonElement.getClass();
        type.getClass();
        jsonDeserializationContext.getClass();
        try {
            int i13 = q.e;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.US);
            simpleDateFormat.setTimeZone(a.f41621f);
            bVar = simpleDateFormat.parse(jsonElement.getAsString());
        } catch (Throwable th2) {
            int i14 = q.e;
            bVar = new q.b(th2);
        }
        if (bVar instanceof q.b) {
            bVar = null;
        }
        return (Date) bVar;
    }
}
