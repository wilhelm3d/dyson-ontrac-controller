package cn;

import com.dyson.mobile.android.localisation.LocalisationKey;
import hx.v;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rf0.q;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcn/m;", "", "", "tabPosition", "Lcom/dyson/mobile/android/localisation/LocalisationKey;", "title", "<init>", "(Ljava/lang/String;IILcom/dyson/mobile/android/localisation/LocalisationKey;)V", "I", "getTabPosition", "()I", "Lcom/dyson/mobile/android/localisation/LocalisationKey;", "getTitle", "()Lcom/dyson/mobile/android/localisation/LocalisationKey;", "Companion", "a", "ANC", "EQUALIZER", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class m {
    private static final /* synthetic */ o12.a $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final a Companion;
    private final int tabPosition;
    private final LocalisationKey title;
    public static final m ANC = new m("ANC", 0, 0, q.f72370f2);
    public static final m EQUALIZER = new m("EQUALIZER", 1, 1, q.f72482t2);

    private static final /* synthetic */ m[] $values() {
        return new m[]{ANC, EQUALIZER};
    }

    static {
        m[] $values = $values();
        $VALUES = $values;
        $ENTRIES = v.l($values);
        Companion = new a(null);
    }

    private m(String str, int i13, int i14, LocalisationKey localisationKey) {
        this.tabPosition = i14;
        this.title = localisationKey;
    }

    public static o12.a<m> getEntries() {
        return $ENTRIES;
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }

    public final int getTabPosition() {
        return this.tabPosition;
    }

    public final LocalisationKey getTitle() {
        return this.title;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcn/m$a;", "", "<init>", "()V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
