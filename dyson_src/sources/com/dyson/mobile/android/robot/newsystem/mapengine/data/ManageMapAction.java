package com.dyson.mobile.android.robot.newsystem.mapengine.data;

import androidx.annotation.Keep;
import com.dyson.mobile.android.localisation.LocalisationKey;
import hx.v;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o12.a;
import rf0.i0;
import rf0.w;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001BQ\b\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fj\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/mapengine/data/ManageMapAction;", "", "title", "Lcom/dyson/mobile/android/localisation/LocalisationKey;", "description", "buttonLabel", "popoverBannerLabel", "errorDialogTitle", "errorDialogDescription", "<init>", "(Ljava/lang/String;ILcom/dyson/mobile/android/localisation/LocalisationKey;Lcom/dyson/mobile/android/localisation/LocalisationKey;Lcom/dyson/mobile/android/localisation/LocalisationKey;Lcom/dyson/mobile/android/localisation/LocalisationKey;Lcom/dyson/mobile/android/localisation/LocalisationKey;Lcom/dyson/mobile/android/localisation/LocalisationKey;)V", "getTitle", "()Lcom/dyson/mobile/android/localisation/LocalisationKey;", "getDescription", "getButtonLabel", "getPopoverBannerLabel", "getErrorDialogTitle", "getErrorDialogDescription", "DEFAULT", "SPLIT", "MERGE", "RENAME", "DELETE_ROOM", "ROOM_CLEAN", "TARGET_CLEAN", "MAP_GENERIC_TAP", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ManageMapAction {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ManageMapAction[] $VALUES;
    private final LocalisationKey buttonLabel;
    private final LocalisationKey description;
    private final LocalisationKey errorDialogDescription;
    private final LocalisationKey errorDialogTitle;
    private final LocalisationKey popoverBannerLabel;
    private final LocalisationKey title;
    public static final ManageMapAction DEFAULT = new ManageMapAction("DEFAULT", 0, w.Q, w.R, null, null, null, null, 60, null);
    public static final ManageMapAction SPLIT = new ManageMapAction("SPLIT", 1, w.f72850f0, w.f72858g0, w.X, w.f72866h0, w.f72874i0, w.f72882j0);
    public static final ManageMapAction MERGE = new ManageMapAction("MERGE", 2, w.f72812a0, w.f72820b0, w.Y, w.f72828c0, w.f72835d0, w.f72842e0);
    public static final ManageMapAction RENAME = new ManageMapAction("RENAME", 3, w.f72946r0, w.f72954s0, null, w.f72962t0, null, null, 48, null);
    public static final ManageMapAction DELETE_ROOM = new ManageMapAction("DELETE_ROOM", 4, w.f72890k0, w.f72898l0, i0.f71689i9, w.f72906m0, null, null, 48, null);
    public static final ManageMapAction ROOM_CLEAN = new ManageMapAction("ROOM_CLEAN", 5, null, null, null, null, null, null, 63, null);
    public static final ManageMapAction TARGET_CLEAN = new ManageMapAction("TARGET_CLEAN", 6, null, null, null, null, null, null, 63, null);
    public static final ManageMapAction MAP_GENERIC_TAP = new ManageMapAction("MAP_GENERIC_TAP", 7, null, null, null, null, null, null, 63, null);

    private static final /* synthetic */ ManageMapAction[] $values() {
        return new ManageMapAction[]{DEFAULT, SPLIT, MERGE, RENAME, DELETE_ROOM, ROOM_CLEAN, TARGET_CLEAN, MAP_GENERIC_TAP};
    }

    static {
        ManageMapAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = v.l($values);
    }

    public /* synthetic */ ManageMapAction(String str, int i13, LocalisationKey localisationKey, LocalisationKey localisationKey2, LocalisationKey localisationKey3, LocalisationKey localisationKey4, LocalisationKey localisationKey5, LocalisationKey localisationKey6, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i13, (i14 & 1) != 0 ? null : localisationKey, (i14 & 2) != 0 ? null : localisationKey2, (i14 & 4) != 0 ? null : localisationKey3, (i14 & 8) != 0 ? null : localisationKey4, (i14 & 16) != 0 ? null : localisationKey5, (i14 & 32) != 0 ? null : localisationKey6);
    }

    public static a<ManageMapAction> getEntries() {
        return $ENTRIES;
    }

    public static ManageMapAction valueOf(String str) {
        return (ManageMapAction) Enum.valueOf(ManageMapAction.class, str);
    }

    public static ManageMapAction[] values() {
        return (ManageMapAction[]) $VALUES.clone();
    }

    public final LocalisationKey getButtonLabel() {
        return this.buttonLabel;
    }

    public final LocalisationKey getDescription() {
        return this.description;
    }

    public final LocalisationKey getErrorDialogDescription() {
        return this.errorDialogDescription;
    }

    public final LocalisationKey getErrorDialogTitle() {
        return this.errorDialogTitle;
    }

    public final LocalisationKey getPopoverBannerLabel() {
        return this.popoverBannerLabel;
    }

    public final LocalisationKey getTitle() {
        return this.title;
    }

    private ManageMapAction(String str, int i13, LocalisationKey localisationKey, LocalisationKey localisationKey2, LocalisationKey localisationKey3, LocalisationKey localisationKey4, LocalisationKey localisationKey5, LocalisationKey localisationKey6) {
        this.title = localisationKey;
        this.description = localisationKey2;
        this.buttonLabel = localisationKey3;
        this.popoverBannerLabel = localisationKey4;
        this.errorDialogTitle = localisationKey5;
        this.errorDialogDescription = localisationKey6;
    }
}
