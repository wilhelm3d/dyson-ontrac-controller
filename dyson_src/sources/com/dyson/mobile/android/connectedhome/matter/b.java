package com.dyson.mobile.android.connectedhome.matter;

import com.dyson.mobile.android.localisation.LocalisationKey;
import hx.v;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rf0.i0;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/matter/b;", "", "Lcom/dyson/mobile/android/localisation/LocalisationKey;", "localisationKey", "<init>", "(Ljava/lang/String;ILcom/dyson/mobile/android/localisation/LocalisationKey;)V", "Lcom/dyson/mobile/android/localisation/LocalisationKey;", "getLocalisationKey", "()Lcom/dyson/mobile/android/localisation/LocalisationKey;", "Companion", "a", "CONNECTED", "NOT_CONNECTED", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class b {
    private static final /* synthetic */ o12.a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final a Companion;
    private final LocalisationKey localisationKey;
    public static final b CONNECTED = new b("CONNECTED", 0, i0.Ud);
    public static final b NOT_CONNECTED = new b("NOT_CONNECTED", 1, i0.Vd);

    private static final /* synthetic */ b[] $values() {
        return new b[]{CONNECTED, NOT_CONNECTED};
    }

    static {
        b[] $values = $values();
        $VALUES = $values;
        $ENTRIES = v.l($values);
        Companion = new a(null);
    }

    private b(String str, int i13, LocalisationKey localisationKey) {
        this.localisationKey = localisationKey;
    }

    public static o12.a<b> getEntries() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final LocalisationKey getLocalisationKey() {
        return this.localisationKey;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectedhome/matter/b$a;", "", "<init>", "()V", "mod-connected-home"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
