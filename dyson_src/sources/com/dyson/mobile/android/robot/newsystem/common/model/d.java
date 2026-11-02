package com.dyson.mobile.android.robot.newsystem.common.model;

import com.dyson.mobile.android.R;
import com.dyson.mobile.android.localisation.LocalisationKey;
import hx.v;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rf0.w;
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0014B#\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/common/model/d;", "", "Lcom/dyson/mobile/android/localisation/LocalisationKey;", "descriptionKey", "", "icon", "", "iconTestTag", "<init>", "(Ljava/lang/String;ILcom/dyson/mobile/android/localisation/LocalisationKey;ILjava/lang/String;)V", "Lcom/dyson/mobile/android/localisation/LocalisationKey;", "getDescriptionKey", "()Lcom/dyson/mobile/android/localisation/LocalisationKey;", "I", "getIcon", "()I", "Ljava/lang/String;", "getIconTestTag", "()Ljava/lang/String;", "Companion", "a", "AUTO", "QUICK", "QUIET", "BOOST", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class d {
    private static final /* synthetic */ o12.a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d AUTO;
    public static final d BOOST;
    public static final a Companion;
    private static final d DEFAULT;
    public static final d QUICK;
    public static final d QUIET;
    private static final LocalisationKey TITLE;
    private final LocalisationKey descriptionKey;
    private final int icon;
    private final String iconTestTag;

    private static final /* synthetic */ d[] $values() {
        return new d[]{AUTO, QUICK, QUIET, BOOST};
    }

    static {
        d dVar = new d("AUTO", 0, w.f72985w, R.drawable.ic_auto, "VacuumModeIcon.Auto");
        AUTO = dVar;
        QUICK = new d("QUICK", 1, w.f72993x, R.drawable.ic_quick, "VacuumModeIcon.Quick");
        QUIET = new d("QUIET", 2, w.f73001y, R.drawable.ic_volume_low, "VacuumModeIcon.Quiet");
        BOOST = new d("BOOST", 3, w.f73008z, R.drawable.ic_gauge, "VacuumModeIcon.Boost");
        d[] $values = $values();
        $VALUES = $values;
        $ENTRIES = v.l($values);
        Companion = new a(null);
        TITLE = w.f72977v;
        DEFAULT = dVar;
    }

    private d(String str, int i13, LocalisationKey localisationKey, int i14, String str2) {
        super(str, i13);
        this.descriptionKey = localisationKey;
        this.icon = i14;
        this.iconTestTag = str2;
    }

    public static o12.a<d> getEntries() {
        return $ENTRIES;
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }

    public final LocalisationKey getDescriptionKey() {
        return this.descriptionKey;
    }

    public final int getIcon() {
        return this.icon;
    }

    public final String getIconTestTag() {
        return this.iconTestTag;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/common/model/d$a;", "", "<init>", "()V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
