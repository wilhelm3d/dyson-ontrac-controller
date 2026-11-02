package com.dyson.mobile.android.cat9.cloud.model.response.common;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import kotlin.Metadata;
import xv.d;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/cat9/cloud/model/response/common/YearWeekTypeAdapter;", "Lcom/google/gson/TypeAdapter;", "Lxv/d;", "<init>", "()V", "mod-cat9-oralcare"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class YearWeekTypeAdapter extends TypeAdapter<d> {
    @Override // com.google.gson.TypeAdapter
    public final d read(JsonReader jsonReader) {
        jsonReader.getClass();
        String nextString = jsonReader.nextString();
        d.a aVar = d.f88028f;
        nextString.getClass();
        aVar.getClass();
        return d.a.a(nextString);
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, d dVar) {
        d dVar2 = dVar;
        jsonWriter.getClass();
        jsonWriter.value(dVar2 != null ? dVar2.b() : null);
    }
}
