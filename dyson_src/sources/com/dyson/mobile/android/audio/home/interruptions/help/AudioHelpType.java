package com.dyson.mobile.android.audio.home.interruptions.help;

import androidx.annotation.Keep;
import hx.v;
import kotlin.Metadata;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/audio/home/interruptions/help/AudioHelpType;", "", "<init>", "(Ljava/lang/String;I)V", "RESTART", "RECONNECT", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AudioHelpType {
    private static final /* synthetic */ o12.a $ENTRIES;
    private static final /* synthetic */ AudioHelpType[] $VALUES;
    public static final AudioHelpType RESTART = new AudioHelpType("RESTART", 0);
    public static final AudioHelpType RECONNECT = new AudioHelpType("RECONNECT", 1);

    private static final /* synthetic */ AudioHelpType[] $values() {
        return new AudioHelpType[]{RESTART, RECONNECT};
    }

    static {
        AudioHelpType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = v.l($values);
    }

    private AudioHelpType(String str, int i13) {
    }

    public static o12.a<AudioHelpType> getEntries() {
        return $ENTRIES;
    }

    public static AudioHelpType valueOf(String str) {
        return (AudioHelpType) Enum.valueOf(AudioHelpType.class, str);
    }

    public static AudioHelpType[] values() {
        return (AudioHelpType[]) $VALUES.clone();
    }
}
