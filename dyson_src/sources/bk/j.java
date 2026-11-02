package bk;

import com.dyson.mobile.android.localisation.LocalisationKey;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lbk/j;", "", "", "finishId", "Lcom/dyson/mobile/android/localisation/LocalisationKey;", "localisationKey", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lcom/dyson/mobile/android/localisation/LocalisationKey;)V", "Ljava/lang/String;", "getFinishId", "()Ljava/lang/String;", "Lcom/dyson/mobile/android/localisation/LocalisationKey;", "getLocalisationKey", "()Lcom/dyson/mobile/android/localisation/LocalisationKey;", "CNC_COPPER", "CNC_ALUMINIUM", "CNC_BLACK_NICKEL", "CERAMIC_CINNABAR", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class j {
    private static final /* synthetic */ o12.a $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    private final String finishId;
    private final LocalisationKey localisationKey;
    public static final j CNC_COPPER = new j("CNC_COPPER", 0, "Colorway CNC Copper", rf0.e.f71142b);
    public static final j CNC_ALUMINIUM = new j("CNC_ALUMINIUM", 1, "Colorway CNC Aluminium", rf0.e.f71141a);
    public static final j CNC_BLACK_NICKEL = new j("CNC_BLACK_NICKEL", 2, "Colorway CNC Dark Nickel", rf0.e.f71143c);
    public static final j CERAMIC_CINNABAR = new j("CERAMIC_CINNABAR", 3, "Colorway Ceramic Cinnabar", rf0.e.d);

    private static final /* synthetic */ j[] $values() {
        return new j[]{CNC_COPPER, CNC_ALUMINIUM, CNC_BLACK_NICKEL, CERAMIC_CINNABAR};
    }

    static {
        j[] $values = $values();
        $VALUES = $values;
        $ENTRIES = hx.v.l($values);
    }

    private j(String str, int i13, String str2, LocalisationKey localisationKey) {
        this.finishId = str2;
        this.localisationKey = localisationKey;
    }

    public static o12.a<j> getEntries() {
        return $ENTRIES;
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }

    public final String getFinishId() {
        return this.finishId;
    }

    public final LocalisationKey getLocalisationKey() {
        return this.localisationKey;
    }
}
