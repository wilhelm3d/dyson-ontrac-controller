package com.dyson.mobile.android.utilities.gson;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import h12.m;
import h12.t;
import java.lang.reflect.Type;
import k30.f;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/utilities/gson/DefaultValueDeserializer;", "T", "Lcom/google/gson/JsonDeserializer;", "defaultValue", "<init>", "(Ljava/lang/Object;)V", "mod-utilities"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DefaultValueDeserializer<T> implements JsonDeserializer<T> {

    /* renamed from: a  reason: collision with root package name */
    public final T f17008a;

    /* renamed from: b  reason: collision with root package name */
    public final t f17009b = m.b(new f(5));

    public DefaultValueDeserializer(T t13) {
        this.f17008a = t13;
    }

    @Override // com.google.gson.JsonDeserializer
    public final T deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext) {
        T t13 = (T) ((Gson) this.f17009b.getValue()).fromJson(jsonElement, type);
        return t13 == null ? this.f17008a : t13;
    }
}
