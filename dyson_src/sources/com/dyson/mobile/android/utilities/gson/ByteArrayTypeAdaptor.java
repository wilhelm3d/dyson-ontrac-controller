package com.dyson.mobile.android.utilities.gson;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import gm1.am;
import kotlin.Metadata;
import v32.a;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/utilities/gson/ByteArrayTypeAdaptor;", "Lcom/google/gson/TypeAdapter;", "", "<init>", "()V", "mod-utilities"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ByteArrayTypeAdaptor extends TypeAdapter<byte[]> {
    @Override // com.google.gson.TypeAdapter
    public final byte[] read(JsonReader jsonReader) {
        jsonReader.getClass();
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        String nextString = jsonReader.nextString();
        nextString.getClass();
        int length = nextString.length() / 2;
        byte[] bArr = new byte[length];
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = i13 * 2;
            String substring = nextString.substring(i14, i14 + 2);
            a.a(16);
            bArr[i13] = (byte) Integer.parseInt(substring, 16);
        }
        return bArr;
    }

    @Override // com.google.gson.TypeAdapter
    public final void write(JsonWriter jsonWriter, byte[] bArr) {
        byte[] bArr2 = bArr;
        jsonWriter.getClass();
        if (bArr2 == null) {
            jsonWriter.nullValue();
        } else {
            jsonWriter.value(am.J(bArr2));
        }
    }
}
