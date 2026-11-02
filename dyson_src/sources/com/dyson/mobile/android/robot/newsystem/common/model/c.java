package com.dyson.mobile.android.robot.newsystem.common.model;

import com.dyson.mobile.android.localisation.LocalisationKey;
import hx.v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rf0.w;
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\fj\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/common/model/c;", "", "Lcom/dyson/mobile/android/localisation/LocalisationKey;", "descriptionKey", "<init>", "(Ljava/lang/String;ILcom/dyson/mobile/android/localisation/LocalisationKey;)V", "Lcom/dyson/mobile/android/localisation/LocalisationKey;", "getDescriptionKey", "()Lcom/dyson/mobile/android/localisation/LocalisationKey;", "", "Lcom/dyson/mobile/android/robot/newsystem/common/model/d;", "getVacuumModes", "()Ljava/util/List;", "vacuumModes", "Lcom/dyson/mobile/android/robot/newsystem/common/model/e;", "getWaterLevels", "waterLevels", "Companion", "a", "VACUUM_AND_MOP", "VACUUM", "MOP", "VACUUM_THEN_MOP", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c {
    private static final /* synthetic */ o12.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final a Companion;
    private static final c DEFAULT;
    public static final c MOP;
    private static final LocalisationKey TITLE;
    public static final c VACUUM;
    public static final c VACUUM_AND_MOP;
    public static final c VACUUM_THEN_MOP;
    private final LocalisationKey descriptionKey;

    /* loaded from: classes3.dex */
    public static final /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f16317a;

        static {
            int[] iArr = new int[c.values().length];
            try {
                iArr[c.VACUUM_AND_MOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[c.VACUUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[c.VACUUM_THEN_MOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[c.MOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f16317a = iArr;
        }
    }

    private static final /* synthetic */ c[] $values() {
        return new c[]{VACUUM_AND_MOP, VACUUM, MOP, VACUUM_THEN_MOP};
    }

    static {
        c cVar = new c("VACUUM_AND_MOP", 0, w.f72945r);
        VACUUM_AND_MOP = cVar;
        VACUUM = new c("VACUUM", 1, w.f72953s);
        MOP = new c("MOP", 2, w.f72961t);
        VACUUM_THEN_MOP = new c("VACUUM_THEN_MOP", 3, w.f72969u);
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = v.l($values);
        Companion = new a(null);
        TITLE = w.f72929p;
        DEFAULT = cVar;
    }

    private c(String str, int i13, LocalisationKey localisationKey) {
        super(str, i13);
        this.descriptionKey = localisationKey;
    }

    public static final /* synthetic */ c access$getDEFAULT$cp() {
        return DEFAULT;
    }

    public static o12.a<c> getEntries() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final LocalisationKey getDescriptionKey() {
        return this.descriptionKey;
    }

    public final List<d> getVacuumModes() {
        int i13 = b.f16317a[ordinal()];
        if (i13 == 1 || i13 == 2 || i13 == 3) {
            return d.getEntries();
        }
        if (i13 == 4) {
            return null;
        }
        ma.e.o();
        return null;
    }

    public final List<e> getWaterLevels() {
        int i13 = b.f16317a[ordinal()];
        if (i13 != 1) {
            if (i13 == 2) {
                return null;
            }
            if (i13 != 3 && i13 != 4) {
                ma.e.o();
                return null;
            }
        }
        return e.getEntries();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/common/model/c$a;", "", "<init>", "()V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
