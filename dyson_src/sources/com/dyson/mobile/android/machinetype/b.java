package com.dyson.mobile.android.machinetype;

import com.dyson.mobile.android.machinetype.MachineCategory;
import com.dyson.mobile.android.machinetype.MachineConnectionCategory;
import com.google.gson.annotations.SerializedName;
import h12.q;
import h12.y;
import i3.n;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import ma.e;
import pa.c;
import x12.r;
import y9.w;
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013R\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0011\u001a\u0004\b\u001e\u0010\u0013R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0011\u001a\u0004\b \u0010\u0013R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0011R \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/dyson/mobile/android/machinetype/b;", "Ljava/io/Serializable;", "", "productType", "variant", "model", "deviceCategory", "", "generation", "connectionCategory", "mqttRootTopicLevel", "defaultProductName", "", "productNameByMarket", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "d", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "getVariant", "f", "getModel", "g", "b", "h", "I", "getGeneration", "()I", "i", "getConnectionCategory", "j", "c", "k", "l", "Ljava/util/Map;", "mod-machine-type"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements Serializable {
    @SerializedName("productType")
    private final String d;
    @SerializedName("variant")
    private final String e;
    @SerializedName("model")

    /* renamed from: f  reason: collision with root package name */
    private final String f15571f;
    @SerializedName("deviceCategory")

    /* renamed from: g  reason: collision with root package name */
    private final String f15572g;
    @SerializedName("generation")

    /* renamed from: h  reason: collision with root package name */
    private final int f15573h;
    @SerializedName("connectionCategory")

    /* renamed from: i  reason: collision with root package name */
    private final String f15574i;
    @SerializedName("mqttRootTopicLevel")

    /* renamed from: j  reason: collision with root package name */
    private final String f15575j;
    @SerializedName("productName")

    /* renamed from: k  reason: collision with root package name */
    private final String f15576k;
    @SerializedName("productNameByMarket")

    /* renamed from: l  reason: collision with root package name */
    private final Map<String, String> f15577l;

    /* renamed from: m  reason: collision with root package name */
    public transient String f15578m;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, int r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.util.Map r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
            r12 = this;
            r0 = r22
            r1 = r0 & 64
            if (r1 == 0) goto L9
            r1 = 0
            r9 = r1
            goto Lb
        L9:
            r9 = r19
        Lb:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L13
            java.lang.String r1 = ""
            r10 = r1
            goto L15
        L13:
            r10 = r20
        L15:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L2a
            i12.f0 r0 = i12.f0.d
            r0.getClass()
            r11 = r0
        L1f:
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            goto L2d
        L2a:
            r11 = r21
            goto L1f
        L2d:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.mobile.android.machinetype.b.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final String a() {
        return n.n(this.d, this.e, this.f15571f);
    }

    public final String b() {
        return this.f15572g;
    }

    public final String c() {
        return this.f15575j;
    }

    public final String d(String str) {
        String orDefault = this.f15577l.getOrDefault(str, this.f15576k);
        if (orDefault.length() == 0) {
            orDefault = this.f15576k;
        }
        return orDefault;
    }

    public final String e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return r.c(this.d, bVar.d) && r.c(this.e, bVar.e) && r.c(this.f15571f, bVar.f15571f) && r.c(this.f15572g, bVar.f15572g) && this.f15573h == bVar.f15573h && r.c(this.f15574i, bVar.f15574i) && r.c(this.f15575j, bVar.f15575j) && r.c(this.f15576k, bVar.f15576k) && r.c(this.f15577l, bVar.f15577l);
        }
        return false;
    }

    public final MachineDescriptor f() {
        Object bVar;
        String str;
        String a13;
        String str2;
        MachineConnectionCategory a14;
        try {
            int i13 = q.e;
            str = this.d;
            a13 = a();
            str2 = this.f15571f;
            MachineConnectionCategory.a aVar = MachineConnectionCategory.Companion;
            String str3 = this.f15574i;
            aVar.getClass();
            a14 = MachineConnectionCategory.a.a(str3);
        } catch (Throwable th2) {
            int i14 = q.e;
            bVar = new q.b(th2);
        }
        if (a14 != null) {
            MachineCategory.a aVar2 = MachineCategory.Companion;
            String str4 = this.f15572g;
            aVar2.getClass();
            MachineCategory a15 = MachineCategory.a.a(str4);
            if (a15 != null) {
                bVar = new MachineDescriptor(str, a13, str2, a14, a15, this.f15578m);
                if (bVar instanceof q.b) {
                    bVar = null;
                }
                return (MachineDescriptor) bVar;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final int hashCode() {
        int c13 = y.c(w.b(this.f15573h, y.c(y.c(y.c(this.d.hashCode() * 31, 31, this.e), 31, this.f15571f), 31, this.f15572g), 31), 31, this.f15574i);
        String str = this.f15575j;
        return this.f15577l.hashCode() + y.c((c13 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f15576k);
    }

    public final String toString() {
        String str = this.d;
        String str2 = this.e;
        String str3 = this.f15571f;
        String str4 = this.f15572g;
        int i13 = this.f15573h;
        String str5 = this.f15574i;
        String str6 = this.f15575j;
        String str7 = this.f15576k;
        Map<String, String> map = this.f15577l;
        StringBuilder m13 = e.m("MachineMetadata(productType=", str, ", variant=", str2, ", model=");
        q62.n.o(m13, str3, ", deviceCategory=", str4, ", generation=");
        fo1.a.u(m13, i13, ", connectionCategory=", str5, ", mqttRootTopicLevel=");
        q62.n.o(m13, str6, ", defaultProductName=", str7, ", productNameByMarket=");
        return c.g(m13, map, ")");
    }

    public b(String str, String str2, String str3, String str4, int i13, String str5, String str6, String str7, Map<String, String> map) {
        q62.n.m(str, str2, str3, str4, str5);
        str7.getClass();
        map.getClass();
        this.d = str;
        this.e = str2;
        this.f15571f = str3;
        this.f15572g = str4;
        this.f15573h = i13;
        this.f15574i = str5;
        this.f15575j = str6;
        this.f15576k = str7;
        this.f15577l = map;
        this.f15578m = str7;
    }
}
