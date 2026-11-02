package com.dyson.mobile.android.utilities.gson;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
/* loaded from: classes3.dex */
public class StripNullItemsListTypeAdapterFactory implements TypeAdapterFactory {

    /* loaded from: classes3.dex */
    public class StripNullItemsListTypeAdapter<T extends Collection> extends TypeAdapter<T> {

        /* renamed from: a  reason: collision with root package name */
        public final TypeAdapter<T> f17012a;

        public StripNullItemsListTypeAdapter(StripNullItemsListTypeAdapterFactory stripNullItemsListTypeAdapterFactory, TypeAdapter<T> typeAdapter) {
            this.f17012a = typeAdapter;
        }

        @Override // com.google.gson.TypeAdapter
        public final Object read(JsonReader jsonReader) throws IOException {
            T read = this.f17012a.read(jsonReader);
            if (read != null) {
                read.removeAll(Collections.singleton(null));
            }
            return read;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
            this.f17012a.write(jsonWriter, (Collection) obj);
        }
    }

    @Override // com.google.gson.TypeAdapterFactory
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        if (Collection.class.isAssignableFrom(typeToken.getRawType())) {
            return new StripNullItemsListTypeAdapter(this, new Gson().getAdapter(typeToken));
        }
        return null;
    }
}
