package com.dyson.mobile.android.account.legacy.resetpassword.host;

import androidx.annotation.Keep;
import hx.v;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/account/legacy/resetpassword/host/PasswordResetType;", "", "<init>", "(Ljava/lang/String;I)V", "FORGOTTEN_PASSWORD", "ACTIVATE_ACCOUNT", "mod-user-login"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PasswordResetType {
    private static final /* synthetic */ o12.a $ENTRIES;
    private static final /* synthetic */ PasswordResetType[] $VALUES;
    public static final PasswordResetType FORGOTTEN_PASSWORD = new PasswordResetType("FORGOTTEN_PASSWORD", 0);
    public static final PasswordResetType ACTIVATE_ACCOUNT = new PasswordResetType("ACTIVATE_ACCOUNT", 1);

    private static final /* synthetic */ PasswordResetType[] $values() {
        return new PasswordResetType[]{FORGOTTEN_PASSWORD, ACTIVATE_ACCOUNT};
    }

    static {
        PasswordResetType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = v.l($values);
    }

    private PasswordResetType(String str, int i13) {
    }

    public static o12.a<PasswordResetType> getEntries() {
        return $ENTRIES;
    }

    public static PasswordResetType valueOf(String str) {
        return (PasswordResetType) Enum.valueOf(PasswordResetType.class, str);
    }

    public static PasswordResetType[] values() {
        return (PasswordResetType[]) $VALUES.clone();
    }
}
