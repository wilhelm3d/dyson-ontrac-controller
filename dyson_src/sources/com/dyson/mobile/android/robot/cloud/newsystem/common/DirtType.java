package com.dyson.mobile.android.robot.cloud.newsystem.common;

import androidx.annotation.Keep;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import hx.v;
import kotlin.Metadata;
import o12.a;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@JsonAdapter(DirtTypeAdapter.class)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/robot/cloud/newsystem/common/DirtType;", "", "<init>", "(Ljava/lang/String;I)V", "SOLID", "LIQUID", "UV", "UNKNOWN", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DirtType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ DirtType[] $VALUES;
    @SerializedName("solid")
    public static final DirtType SOLID = new DirtType("SOLID", 0);
    @SerializedName("liquid")
    public static final DirtType LIQUID = new DirtType("LIQUID", 1);
    @SerializedName("uv")
    public static final DirtType UV = new DirtType("UV", 2);
    public static final DirtType UNKNOWN = new DirtType("UNKNOWN", 3);

    private static final /* synthetic */ DirtType[] $values() {
        return new DirtType[]{SOLID, LIQUID, UV, UNKNOWN};
    }

    static {
        DirtType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = v.l($values);
    }

    private DirtType(String str, int i13) {
    }

    public static a<DirtType> getEntries() {
        return $ENTRIES;
    }

    public static DirtType valueOf(String str) {
        return (DirtType) Enum.valueOf(DirtType.class, str);
    }

    public static DirtType[] values() {
        return (DirtType[]) $VALUES.clone();
    }
}
