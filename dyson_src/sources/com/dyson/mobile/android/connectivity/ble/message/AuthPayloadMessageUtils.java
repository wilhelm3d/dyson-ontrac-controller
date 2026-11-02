package com.dyson.mobile.android.connectivity.ble.message;

import android.text.TextUtils;
import c60.a;
import c60.c;
import com.google.gson.Gson;
import in0.b;
import java.nio.ByteBuffer;
import java.util.UUID;
/* loaded from: classes2.dex */
public class AuthPayloadMessageUtils {

    /* loaded from: classes2.dex */
    public static class ChallengeMessage {
        private String challenge;

        public ChallengeMessage(String str) {
            this.challenge = str;
        }

        public String getChallenge() {
            return this.challenge;
        }
    }

    /* loaded from: classes2.dex */
    public static class LtkMessage {
        private String ltk;

        public LtkMessage(String str) {
            this.ltk = str;
        }

        public String getLtk() {
            return this.ltk;
        }
    }

    /* loaded from: classes2.dex */
    public static class PayloadMessage {
        private String payload;

        public PayloadMessage(String str) {
            this.payload = str;
        }

        public String getPayload() {
            return this.payload;
        }
    }

    public static byte[] a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        UUID fromString = UUID.fromString(str);
        ByteBuffer wrap = ByteBuffer.wrap(new byte[16]);
        wrap.putLong(fromString.getMostSignificantBits());
        wrap.putLong(fromString.getLeastSignificantBits());
        return wrap.array();
    }

    public static a b(String str) {
        PayloadMessage payloadMessage = (PayloadMessage) new Gson().fromJson(str, (Class<Object>) PayloadMessage.class);
        if (payloadMessage == null || payloadMessage.getPayload() == null) {
            return null;
        }
        return c.b((byte) 1, in0.c.h(payloadMessage.getPayload()));
    }

    public static String c(b bVar) {
        return new Gson().toJson(new ChallengeMessage(in0.c.b(bVar.b())));
    }

    public static byte[] d(byte[] bArr) {
        byte[] bArr2 = new byte[8];
        int i13 = 7;
        for (int length = bArr.length - 1; length >= 0; length--) {
            byte b13 = bArr[length];
            if (b13 != 0) {
                bArr2[i13] = b13;
                i13--;
            }
        }
        while (i13 >= 0) {
            bArr2[i13] = 48;
            i13--;
        }
        return bArr2;
    }
}
