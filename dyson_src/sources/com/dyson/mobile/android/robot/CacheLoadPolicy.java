package com.dyson.mobile.android.robot;

import androidx.annotation.Keep;
import hx.v;
import kotlin.Metadata;
import o12.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/robot/CacheLoadPolicy;", "", "<init>", "(Ljava/lang/String;I)V", "CACHE_ONLY", "REMOTE_ONLY", "CACHE_OR_REMOTE", "CACHE_AND_REMOTE", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CacheLoadPolicy {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ CacheLoadPolicy[] $VALUES;
    public static final CacheLoadPolicy CACHE_ONLY = new CacheLoadPolicy("CACHE_ONLY", 0);
    public static final CacheLoadPolicy REMOTE_ONLY = new CacheLoadPolicy("REMOTE_ONLY", 1);
    public static final CacheLoadPolicy CACHE_OR_REMOTE = new CacheLoadPolicy("CACHE_OR_REMOTE", 2);
    public static final CacheLoadPolicy CACHE_AND_REMOTE = new CacheLoadPolicy("CACHE_AND_REMOTE", 3);

    private static final /* synthetic */ CacheLoadPolicy[] $values() {
        return new CacheLoadPolicy[]{CACHE_ONLY, REMOTE_ONLY, CACHE_OR_REMOTE, CACHE_AND_REMOTE};
    }

    static {
        CacheLoadPolicy[] $values = $values();
        $VALUES = $values;
        $ENTRIES = v.l($values);
    }

    private CacheLoadPolicy(String str, int i13) {
    }

    public static a<CacheLoadPolicy> getEntries() {
        return $ENTRIES;
    }

    public static CacheLoadPolicy valueOf(String str) {
        return (CacheLoadPolicy) Enum.valueOf(CacheLoadPolicy.class, str);
    }

    public static CacheLoadPolicy[] values() {
        return (CacheLoadPolicy[]) $VALUES.clone();
    }
}
