package com.dyson.mobile.android.connectionjourney.nonconnected.serialcapture;

import androidx.annotation.Keep;
import hx.v;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/nonconnected/serialcapture/LaunchState;", "", "<init>", "(Ljava/lang/String;I)V", "ENTER_SN", "ENTER_SN_AFTER_SCAN_FAILED", "ENTER_SN_AFTER_INVALID_SN_SCANNED", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LaunchState {
    private static final /* synthetic */ o12.a $ENTRIES;
    private static final /* synthetic */ LaunchState[] $VALUES;
    public static final LaunchState ENTER_SN = new LaunchState("ENTER_SN", 0);
    public static final LaunchState ENTER_SN_AFTER_SCAN_FAILED = new LaunchState("ENTER_SN_AFTER_SCAN_FAILED", 1);
    public static final LaunchState ENTER_SN_AFTER_INVALID_SN_SCANNED = new LaunchState("ENTER_SN_AFTER_INVALID_SN_SCANNED", 2);

    private static final /* synthetic */ LaunchState[] $values() {
        return new LaunchState[]{ENTER_SN, ENTER_SN_AFTER_SCAN_FAILED, ENTER_SN_AFTER_INVALID_SN_SCANNED};
    }

    static {
        LaunchState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = v.l($values);
    }

    private LaunchState(String str, int i13) {
    }

    public static o12.a<LaunchState> getEntries() {
        return $ENTRIES;
    }

    public static LaunchState valueOf(String str) {
        return (LaunchState) Enum.valueOf(LaunchState.class, str);
    }

    public static LaunchState[] values() {
        return (LaunchState[]) $VALUES.clone();
    }
}
