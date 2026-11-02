package com.dyson.mobile.android.support;

import androidx.annotation.Keep;
import hx.v;
import kotlin.Metadata;
import o12.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/support/MachineSpecificTab;", "", "id", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "RobotManageMapsTab", "mod-support"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MachineSpecificTab {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MachineSpecificTab[] $VALUES;
    public static final MachineSpecificTab RobotManageMapsTab = new MachineSpecificTab("RobotManageMapsTab", 0, "RobotManageMapsTab");

    /* renamed from: id  reason: collision with root package name */
    private final String f16748id;

    private static final /* synthetic */ MachineSpecificTab[] $values() {
        return new MachineSpecificTab[]{RobotManageMapsTab};
    }

    static {
        MachineSpecificTab[] $values = $values();
        $VALUES = $values;
        $ENTRIES = v.l($values);
    }

    private MachineSpecificTab(String str, int i13, String str2) {
        this.f16748id = str2;
    }

    public static a<MachineSpecificTab> getEntries() {
        return $ENTRIES;
    }

    public static MachineSpecificTab valueOf(String str) {
        return (MachineSpecificTab) Enum.valueOf(MachineSpecificTab.class, str);
    }

    public static MachineSpecificTab[] values() {
        return (MachineSpecificTab[]) $VALUES.clone();
    }

    public final String getId() {
        return this.f16748id;
    }
}
