package com.dyson.mobile.android.utilities.gson;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.Excluder;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import lf1.a;
/* loaded from: classes3.dex */
public class StrictTypeAdapterFactory implements TypeAdapterFactory {

    /* loaded from: classes3.dex */
    public class StrictTypeAdapter<T> extends TypeAdapter<T> {

        /* renamed from: a  reason: collision with root package name */
        public final TypeAdapter<T> f17010a;

        /* renamed from: b  reason: collision with root package name */
        public final Excluder f17011b;

        public StrictTypeAdapter(StrictTypeAdapterFactory strictTypeAdapterFactory, TypeAdapter<T> typeAdapter, Excluder excluder) {
            this.f17010a = typeAdapter;
            this.f17011b = excluder;
        }

        @Override // com.google.gson.TypeAdapter
        public final T read(JsonReader jsonReader) throws IOException {
            Field[] declaredFields;
            T read = this.f17010a.read(jsonReader);
            if (read != null) {
                try {
                    for (Field field : read.getClass().getDeclaredFields()) {
                        if (!this.f17011b.excludeField(field, false)) {
                            field.setAccessible(true);
                            if (field.get(read) == null && !field.isAnnotationPresent(a.class)) {
                                throw new JsonStrictParseException("The value for required field '" + field.getName() + "' is null for class: " + read.getClass().getSimpleName());
                            }
                        }
                    }
                } catch (IllegalAccessException e) {
                    throw new JsonStrictParseException("An error occurred while parsing: ".concat(read.getClass().getSimpleName()), e);
                }
            }
            return read;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, T t13) throws IOException {
            this.f17010a.write(jsonWriter, t13);
        }
    }

    @Override // com.google.gson.TypeAdapterFactory
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        return new StrictTypeAdapter(this, gson.getDelegateAdapter(this, typeToken), gson.excluder());
    }
}
