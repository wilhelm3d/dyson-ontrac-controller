package com.dyson.mobile.android.machine.machinecontent.common;

import android.annotation.SuppressLint;
import androidx.annotation.Keep;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.localisation.LocalisationKey;
import hx.v;
import kotlin.Metadata;
import o12.a;
import rf0.i0;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B+\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0017\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\fR\u0016\u0010\u0019\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\fj\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u001b"}, d2 = {"Lcom/dyson/mobile/android/machine/machinecontent/common/MachineHomeTab;", "", "id", "", "icon", "", "imagePath", "titleKey", "Lcom/dyson/mobile/android/localisation/LocalisationKey;", "<init>", "(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;Lcom/dyson/mobile/android/localisation/LocalisationKey;)V", "getId", "()Ljava/lang/String;", "getIcon", "()I", "getImagePath", "getTitleKey", "()Lcom/dyson/mobile/android/localisation/LocalisationKey;", "OVERVIEW", "HOW_TO", "DISCOVER", "STYLING_GUIDES", "PRODUCT_SETTINGS", "tabTestTag", "getTabTestTag", "contentTestTag", "getContentTestTag", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MachineHomeTab {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MachineHomeTab[] $VALUES;
    @SuppressLint({"VisibleForTests"})
    private final String contentTestTag;
    private final int icon;

    /* renamed from: id  reason: collision with root package name */
    private final String f15114id;
    private final String imagePath;
    @SuppressLint({"VisibleForTests"})
    private final String tabTestTag;
    private final LocalisationKey titleKey;
    public static final MachineHomeTab OVERVIEW = new MachineHomeTab("OVERVIEW", 0, "overview", R.drawable.ic_overview, "asset:///icon/overview", i0.f71723kd);
    public static final MachineHomeTab HOW_TO = new MachineHomeTab("HOW_TO", 1, "how-to", R.drawable.ic_tab_how_to, "asset:///icon/tab_how_to", i0.f71739ld);
    public static final MachineHomeTab DISCOVER = new MachineHomeTab("DISCOVER", 2, "discover", R.drawable.ic_tab_discover, "asset:///icon/tab_discover", i0.f71755md);
    public static final MachineHomeTab STYLING_GUIDES = new MachineHomeTab("STYLING_GUIDES", 3, "styling-guides", R.drawable.ic_tab_styling_guides, "asset:///icon/tab_styling_guides", i0.f71771nd);
    public static final MachineHomeTab PRODUCT_SETTINGS = new MachineHomeTab("PRODUCT_SETTINGS", 4, "settings", R.drawable.ic_gear, "asset:///icon/gear", i0.f71787od);

    private static final /* synthetic */ MachineHomeTab[] $values() {
        return new MachineHomeTab[]{OVERVIEW, HOW_TO, DISCOVER, STYLING_GUIDES, PRODUCT_SETTINGS};
    }

    static {
        MachineHomeTab[] $values = $values();
        $VALUES = $values;
        $ENTRIES = v.l($values);
    }

    private MachineHomeTab(String str, int i13, String str2, int i14, String str3, LocalisationKey localisationKey) {
        this.f15114id = str2;
        this.icon = i14;
        this.imagePath = str3;
        this.titleKey = localisationKey;
        str2.getClass();
        this.tabTestTag = str2.concat("-tab");
        this.contentTestTag = str2.concat("-content");
    }

    public static a<MachineHomeTab> getEntries() {
        return $ENTRIES;
    }

    public static MachineHomeTab valueOf(String str) {
        return (MachineHomeTab) Enum.valueOf(MachineHomeTab.class, str);
    }

    public static MachineHomeTab[] values() {
        return (MachineHomeTab[]) $VALUES.clone();
    }

    public final String getContentTestTag() {
        return this.contentTestTag;
    }

    public final int getIcon() {
        return this.icon;
    }

    public final String getId() {
        return this.f15114id;
    }

    public final String getImagePath() {
        return this.imagePath;
    }

    public final String getTabTestTag() {
        return this.tabTestTag;
    }

    public final LocalisationKey getTitleKey() {
        return this.titleKey;
    }
}
