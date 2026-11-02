package com.dyson.mobile.android.robot.newsystem.navigation.destination;

import androidx.annotation.Keep;
import hx.v;
import kotlin.Metadata;
import o12.a;
import xz0.e;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Keep
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/navigation/destination/EditFurnitureEntryPoint;", "", "Lxz0/e;", "furnitureNavigationEvent", "<init>", "(Ljava/lang/String;ILxz0/e;)V", "Lxz0/e;", "getFurnitureNavigationEvent", "()Lxz0/e;", "MANAGE_MAPS", "MAP_MANAGEMENT", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EditFurnitureEntryPoint {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ EditFurnitureEntryPoint[] $VALUES;
    public static final EditFurnitureEntryPoint MANAGE_MAPS = new EditFurnitureEntryPoint("MANAGE_MAPS", 0, e.b.f88350a);
    public static final EditFurnitureEntryPoint MAP_MANAGEMENT = new EditFurnitureEntryPoint("MAP_MANAGEMENT", 1, e.c.f88351a);
    private final e furnitureNavigationEvent;

    private static final /* synthetic */ EditFurnitureEntryPoint[] $values() {
        return new EditFurnitureEntryPoint[]{MANAGE_MAPS, MAP_MANAGEMENT};
    }

    static {
        EditFurnitureEntryPoint[] $values = $values();
        $VALUES = $values;
        $ENTRIES = v.l($values);
    }

    private EditFurnitureEntryPoint(String str, int i13, e eVar) {
        this.furnitureNavigationEvent = eVar;
    }

    public static a<EditFurnitureEntryPoint> getEntries() {
        return $ENTRIES;
    }

    public static EditFurnitureEntryPoint valueOf(String str) {
        return (EditFurnitureEntryPoint) Enum.valueOf(EditFurnitureEntryPoint.class, str);
    }

    public static EditFurnitureEntryPoint[] values() {
        return (EditFurnitureEntryPoint[]) $VALUES.clone();
    }

    public final e getFurnitureNavigationEvent() {
        return this.furnitureNavigationEvent;
    }
}
