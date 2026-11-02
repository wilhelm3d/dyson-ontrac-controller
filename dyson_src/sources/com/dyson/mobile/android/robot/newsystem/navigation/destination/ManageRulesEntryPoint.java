package com.dyson.mobile.android.robot.newsystem.navigation.destination;

import androidx.annotation.Keep;
import com.dyson.mobile.android.robot.CacheLoadPolicy;
import com.dyson.mobile.android.robot.newsystem.managerules.RuleNavigationEvent;
import hx.v;
import kotlin.Metadata;
import o12.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/ManageRulesEntryPoint;", "", "cacheLoadPolicy", "Lcom/dyson/mobile/android/robot/CacheLoadPolicy;", "ruleNavigationEvent", "Lcom/dyson/mobile/android/robot/newsystem/managerules/RuleNavigationEvent;", "<init>", "(Ljava/lang/String;ILcom/dyson/mobile/android/robot/CacheLoadPolicy;Lcom/dyson/mobile/android/robot/newsystem/managerules/RuleNavigationEvent;)V", "getCacheLoadPolicy", "()Lcom/dyson/mobile/android/robot/CacheLoadPolicy;", "getRuleNavigationEvent", "()Lcom/dyson/mobile/android/robot/newsystem/managerules/RuleNavigationEvent;", "MANAGE_MAPS", "MAP_MANAGEMENT", "ACTIVITY_HISTORY", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ManageRulesEntryPoint {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ManageRulesEntryPoint[] $VALUES;
    public static final ManageRulesEntryPoint ACTIVITY_HISTORY;
    public static final ManageRulesEntryPoint MANAGE_MAPS;
    public static final ManageRulesEntryPoint MAP_MANAGEMENT;
    private final CacheLoadPolicy cacheLoadPolicy;
    private final RuleNavigationEvent ruleNavigationEvent;

    private static final /* synthetic */ ManageRulesEntryPoint[] $values() {
        return new ManageRulesEntryPoint[]{MANAGE_MAPS, MAP_MANAGEMENT, ACTIVITY_HISTORY};
    }

    static {
        CacheLoadPolicy cacheLoadPolicy = CacheLoadPolicy.CACHE_OR_REMOTE;
        MANAGE_MAPS = new ManageRulesEntryPoint("MANAGE_MAPS", 0, cacheLoadPolicy, RuleNavigationEvent.c.f16383a);
        MAP_MANAGEMENT = new ManageRulesEntryPoint("MAP_MANAGEMENT", 1, cacheLoadPolicy, RuleNavigationEvent.d.f16384a);
        ACTIVITY_HISTORY = new ManageRulesEntryPoint("ACTIVITY_HISTORY", 2, CacheLoadPolicy.REMOTE_ONLY, RuleNavigationEvent.b.f16382a);
        ManageRulesEntryPoint[] $values = $values();
        $VALUES = $values;
        $ENTRIES = v.l($values);
    }

    private ManageRulesEntryPoint(String str, int i13, CacheLoadPolicy cacheLoadPolicy, RuleNavigationEvent ruleNavigationEvent) {
        this.cacheLoadPolicy = cacheLoadPolicy;
        this.ruleNavigationEvent = ruleNavigationEvent;
    }

    public static a<ManageRulesEntryPoint> getEntries() {
        return $ENTRIES;
    }

    public static ManageRulesEntryPoint valueOf(String str) {
        return (ManageRulesEntryPoint) Enum.valueOf(ManageRulesEntryPoint.class, str);
    }

    public static ManageRulesEntryPoint[] values() {
        return (ManageRulesEntryPoint[]) $VALUES.clone();
    }

    public final CacheLoadPolicy getCacheLoadPolicy() {
        return this.cacheLoadPolicy;
    }

    public final RuleNavigationEvent getRuleNavigationEvent() {
        return this.ruleNavigationEvent;
    }
}
