package com.dyson.mobile.android.robot.cloud.newsystem.common;

import androidx.annotation.Keep;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.salesforce.marketingcloud.messages.iam.j;
import hx.v;
import kotlin.Metadata;
import o12.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@JsonAdapter(MapFaultTypeAdapter.class)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/dyson/mobile/android/robot/cloud/newsystem/common/MapFaultType;", "", "keyName", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getKeyName", "()Ljava/lang/String;", "STUCK", "UNKNOWN", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MapFaultType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ MapFaultType[] $VALUES;
    @SerializedName("stuck")
    public static final MapFaultType STUCK = new MapFaultType("STUCK", 0, "stuck");
    public static final MapFaultType UNKNOWN = new MapFaultType("UNKNOWN", 1, j.f21377i);
    private final String keyName;

    private static final /* synthetic */ MapFaultType[] $values() {
        return new MapFaultType[]{STUCK, UNKNOWN};
    }

    static {
        MapFaultType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = v.l($values);
    }

    private MapFaultType(String str, int i13, String str2) {
        this.keyName = str2;
    }

    public static a<MapFaultType> getEntries() {
        return $ENTRIES;
    }

    public static MapFaultType valueOf(String str) {
        return (MapFaultType) Enum.valueOf(MapFaultType.class, str);
    }

    public static MapFaultType[] values() {
        return (MapFaultType[]) $VALUES.clone();
    }

    public final String getKeyName() {
        return this.keyName;
    }
}
