package com.dyson.nst.dyson3d.schema.model;

import i12.e0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/model/Finish;", "", "name", "", "parts", "", "Lcom/dyson/nst/dyson3d/schema/model/FinishPart;", "(Ljava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getParts", "()Ljava/util/List;", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Finish {
    public static final int $stable = 8;
    private final String name;
    private final List<FinishPart> parts;

    public Finish(String str, List<FinishPart> list) {
        str.getClass();
        list.getClass();
        this.name = str;
        this.parts = list;
    }

    public final String getName() {
        return this.name;
    }

    public final List<FinishPart> getParts() {
        return this.parts;
    }

    public Finish(String str, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? e0.d : list);
    }
}
