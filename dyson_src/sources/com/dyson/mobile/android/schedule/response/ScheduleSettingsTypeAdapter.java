package com.dyson.mobile.android.schedule.response;

import com.dyson.mobile.android.schedule.response.ScheduleSettings;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import h12.m;
import h12.t;
import kotlin.Metadata;
import my0.a;
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/schedule/response/ScheduleSettingsTypeAdapter;", "Lcom/dyson/mobile/android/schedule/response/ScheduleSettings;", "T", "Lcom/google/gson/TypeAdapter;", "Ljava/lang/Class;", "scheduleSettingsClass", "<init>", "(Ljava/lang/Class;)V", "mod-schedule"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public class ScheduleSettingsTypeAdapter<T extends ScheduleSettings> extends TypeAdapter<T> {

    /* renamed from: a  reason: collision with root package name */
    public final Class<T> f16743a;

    /* renamed from: b  reason: collision with root package name */
    public final t f16744b;

    public ScheduleSettingsTypeAdapter(Class<T> cls) {
        cls.getClass();
        this.f16743a = cls;
        this.f16744b = m.b(new a(21));
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: a */
    public T read(JsonReader jsonReader) {
        jsonReader.getClass();
        Object fromJson = ((Gson) this.f16744b.getValue()).fromJson(jsonReader, this.f16743a);
        fromJson.getClass();
        return (T) fromJson;
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: b */
    public void write(JsonWriter jsonWriter, T t13) {
        jsonWriter.getClass();
        t13.getClass();
        jsonWriter.jsonValue(((Gson) this.f16744b.getValue()).toJson(t13));
    }
}
