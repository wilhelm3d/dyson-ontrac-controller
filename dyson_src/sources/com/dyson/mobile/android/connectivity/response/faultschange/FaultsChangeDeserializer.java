package com.dyson.mobile.android.connectivity.response.faultschange;

import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import h12.q;
import java.lang.reflect.Type;
import kotlin.Metadata;
import o70.b;
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/connectivity/response/faultschange/FaultsChangeDeserializer;", "Lcom/google/gson/JsonSerializer;", "Lo70/b;", "Lcom/google/gson/JsonDeserializer;", "<init>", "()V", "mod-connectivity"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FaultsChangeDeserializer implements JsonSerializer<b>, JsonDeserializer<b> {

    /* loaded from: classes2.dex */
    public static final /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f14008a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.FAILED_AGAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.NEW_FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.RECOVERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f14008a = iArr;
        }
    }

    @Override // com.google.gson.JsonDeserializer
    public final b deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        Object bVar;
        JsonArray asJsonArray;
        b fault;
        jsonElement.getClass();
        type.getClass();
        jsonDeserializationContext.getClass();
        JsonElement jsonElement2 = jsonElement.isJsonArray() ? jsonElement : null;
        if (jsonElement2 != null && (asJsonArray = jsonElement2.getAsJsonArray()) != null) {
            if (asJsonArray.size() != 2) {
                asJsonArray = null;
            }
            if (asJsonArray != null && (fault = b.getFault(asJsonArray.get(0).getAsString(), asJsonArray.get(1).getAsString())) != null) {
                return fault;
            }
        }
        try {
            int i13 = q.e;
            bVar = b.getFault(jsonElement.getAsString(), jsonElement.getAsString());
        } catch (Throwable th2) {
            int i14 = q.e;
            bVar = new q.b(th2);
        }
        return (b) (bVar instanceof q.b ? null : bVar);
    }

    @Override // com.google.gson.JsonSerializer
    public final JsonElement serialize(b bVar, Type type, JsonSerializationContext jsonSerializationContext) {
        b bVar2 = bVar;
        bVar2.getClass();
        type.getClass();
        jsonSerializationContext.getClass();
        int i13 = a.f14008a[bVar2.ordinal()];
        JsonElement serialize = jsonSerializationContext.serialize(i13 != 1 ? i13 != 2 ? i13 != 3 ? new String[]{"OK", "OK"} : new String[]{"FAIL", "OK"} : new String[]{"OK", "FAIL"} : new String[]{"FAIL", "FAIL"});
        serialize.getClass();
        return serialize;
    }
}
