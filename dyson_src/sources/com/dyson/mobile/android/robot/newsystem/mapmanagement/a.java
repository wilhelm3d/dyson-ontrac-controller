package com.dyson.mobile.android.robot.newsystem.mapmanagement;

import com.dyson.mobile.android.R;
import hx.v;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b\u0080\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000ej\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/mapmanagement/a;", "", "", "id", "", "drawableResId", "labelResId", "<init>", "(Ljava/lang/String;ILjava/lang/String;II)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "I", "getDrawableResId", "()I", "getLabelResId", "Companion", "a", "SPLIT", "MERGE", "DELETE", "RENAME", "RULES", "FURNITURE", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {
    private static final /* synthetic */ o12.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final C0581a Companion;
    private final int drawableResId;

    /* renamed from: id  reason: collision with root package name */
    private final String f16453id;
    private final int labelResId;
    public static final a SPLIT = new a("SPLIT", 0, "split", R.drawable.ic_divide, R.string.machine804a_manageRooms_split);
    public static final a MERGE = new a("MERGE", 1, "merge", R.drawable.ic_merge, R.string.machine804a_manageRooms_merge);
    public static final a DELETE = new a("DELETE", 2, "delete", R.drawable.ic_delete, R.string.button_delete);
    public static final a RENAME = new a("RENAME", 3, "rename", R.drawable.ic_edit, R.string.machine804a_renameRooms_title);
    public static final a RULES = new a("RULES", 4, "rules", R.drawable.ic_obstacle, R.string.machine804a_mapElements_general_rules);
    public static final a FURNITURE = new a("FURNITURE", 5, "furniture", R.drawable.ic_chair, R.string.machine804a_mapElements_general_furniture);

    private static final /* synthetic */ a[] $values() {
        return new a[]{SPLIT, MERGE, DELETE, RENAME, RULES, FURNITURE};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = v.l($values);
        Companion = new C0581a(null);
    }

    private a(String str, int i13, String str2, int i14, int i15) {
        this.f16453id = str2;
        this.drawableResId = i14;
        this.labelResId = i15;
    }

    public static o12.a<a> getEntries() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final int getDrawableResId() {
        return this.drawableResId;
    }

    public final String getId() {
        return this.f16453id;
    }

    public final int getLabelResId() {
        return this.labelResId;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/robot/newsystem/mapmanagement/a$a;", "", "<init>", "()V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.robot.newsystem.mapmanagement.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0581a {
        public /* synthetic */ C0581a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0581a() {
        }
    }
}
