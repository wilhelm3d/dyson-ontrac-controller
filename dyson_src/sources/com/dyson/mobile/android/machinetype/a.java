package com.dyson.mobile.android.machinetype;

import hx.v;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import x12.r;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0013\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/dyson/mobile/android/machinetype/a;", "", "", "serialisationIdentifier", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getSerialisationIdentifier", "()Ljava/lang/String;", "Companion", "a", "RABBIT_MQ", "AWS_IOT", "UNKNOWN", "mod-machine-type"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {
    private static final /* synthetic */ o12.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final C0538a Companion;
    private final String serialisationIdentifier;
    public static final a RABBIT_MQ = new a("RABBIT_MQ", 0, "mqtts");
    public static final a AWS_IOT = new a("AWS_IOT", 1, "wss");
    public static final a UNKNOWN = new a("UNKNOWN", 2, null, 1, null);

    private static final /* synthetic */ a[] $values() {
        return new a[]{RABBIT_MQ, AWS_IOT, UNKNOWN};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = v.l($values);
        Companion = new C0538a(null);
    }

    public /* synthetic */ a(String str, int i13, String str2, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, (i14 & 1) != 0 ? "None" : str2);
    }

    public static final a connectionTypeBySerialisationIdentifier(String str) {
        Companion.getClass();
        return C0538a.a(str);
    }

    public static o12.a<a> getEntries() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final String getSerialisationIdentifier() {
        return this.serialisationIdentifier;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/machinetype/a$a;", "", "<init>", "()V", "mod-machine-type"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.machinetype.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0538a {
        public /* synthetic */ C0538a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static a a(String str) {
            a aVar;
            a[] values = a.values();
            int length = values.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    aVar = null;
                    break;
                }
                aVar = values[i13];
                if (r.c(aVar.getSerialisationIdentifier(), str)) {
                    break;
                }
                i13++;
            }
            return aVar == null ? a.UNKNOWN : aVar;
        }

        private C0538a() {
        }
    }

    private a(String str, int i13, String str2) {
        this.serialisationIdentifier = str2;
    }
}
