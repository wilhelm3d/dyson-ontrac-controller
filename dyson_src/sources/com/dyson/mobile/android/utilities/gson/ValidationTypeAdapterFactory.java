package com.dyson.mobile.android.utilities.gson;

import com.dyson.mobile.android.logging.Logger;
import com.dyson.mobile.android.utilities.gson.validator.JsonValidationException;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.Primitives;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import lf1.b;
import mf1.a;
/* loaded from: classes3.dex */
public class ValidationTypeAdapterFactory implements TypeAdapterFactory {

    /* loaded from: classes3.dex */
    public class ValidationTypeAdapter<T> extends TypeAdapter<T> {

        /* renamed from: a  reason: collision with root package name */
        public final TypeAdapter<T> f17013a;

        /* renamed from: b  reason: collision with root package name */
        public final Excluder f17014b;

        /* renamed from: c  reason: collision with root package name */
        public final b f17015c;

        public ValidationTypeAdapter(ValidationTypeAdapterFactory validationTypeAdapterFactory, TypeAdapter<T> typeAdapter, Excluder excluder, b bVar) {
            this.f17013a = typeAdapter;
            this.f17014b = excluder;
            this.f17015c = bVar;
        }

        public static ArrayList a(b bVar) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
            ArrayList arrayList = new ArrayList();
            for (Class<? extends a> cls : bVar.value()) {
                arrayList.add(cls.getConstructor(null).newInstance(null));
            }
            return arrayList;
        }

        public static void b(Field field, Object obj) throws IllegalAccessException {
            if (!Primitives.isPrimitive(field.getType())) {
                field.set(obj, null);
                return;
            }
            Logger.e("Primitive types are not supported by the ValidationTypeAdapter: " + field.getName(), null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.TypeAdapter
        public final T read(JsonReader jsonReader) throws IOException {
            Field[] declaredFields;
            mf1.b bVar;
            b bVar2;
            mf1.b bVar3;
            T read = this.f17013a.read(jsonReader);
            if (read != null) {
                try {
                    for (Field field : read.getClass().getDeclaredFields()) {
                        if (!this.f17014b.excludeField(field, false) && (bVar2 = (b) field.getAnnotation(b.class)) != null) {
                            field.setAccessible(true);
                            Object obj = field.get(read);
                            Iterator it = a(bVar2).iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    bVar3 = mf1.b.f53843c;
                                    break;
                                }
                                bVar3 = ((a) it.next()).a(obj);
                                if (!bVar3.f53844a) {
                                    break;
                                }
                            }
                            boolean z13 = bVar3.f53844a;
                            String str = bVar3.f53845b;
                            if (z13) {
                                continue;
                            } else if (!bVar2.nullIfInvalid()) {
                                throw new JsonValidationException(str);
                            } else {
                                Logger.e("Validation failed for " + read.getClass().getSimpleName() + "." + field.getName() + ": " + str, null);
                                b(field, read);
                            }
                        }
                    }
                    b bVar4 = this.f17015c;
                    if (bVar4 != null) {
                        Iterator it2 = a(bVar4).iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                bVar = mf1.b.f53843c;
                                break;
                            }
                            bVar = ((a) it2.next()).a(read);
                            if (!bVar.f53844a) {
                                break;
                            }
                        }
                        boolean z14 = bVar.f53844a;
                        String str2 = bVar.f53845b;
                        if (!z14) {
                            if (bVar4.nullIfInvalid()) {
                                Logger.e("Validation failed for " + read.getClass().getSimpleName() + ": " + str2, null);
                                return null;
                            }
                            throw new JsonValidationException(str2);
                        }
                    }
                } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
                    throw new JsonStrictParseException("An error occurred while validating: ".concat(read.getClass().getSimpleName()), e);
                }
            }
            return read;
        }

        @Override // com.google.gson.TypeAdapter
        public final void write(JsonWriter jsonWriter, T t13) throws IOException {
            this.f17013a.write(jsonWriter, t13);
        }
    }

    @Override // com.google.gson.TypeAdapterFactory
    public final <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
        return new ValidationTypeAdapter(this, gson.getDelegateAdapter(this, typeToken), gson.excluder(), (b) typeToken.getRawType().getAnnotation(b.class));
    }
}
