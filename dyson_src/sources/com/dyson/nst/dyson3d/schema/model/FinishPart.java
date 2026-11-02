package com.dyson.nst.dyson3d.schema.model;

import java.util.List;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/model/FinishPart;", "", "material", "", "nodes", "", "(Ljava/lang/String;Ljava/util/List;)V", "getMaterial", "()Ljava/lang/String;", "getNodes", "()Ljava/util/List;", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FinishPart {
    public static final int $stable = 8;
    private final String material;
    private final List<String> nodes;

    public FinishPart(String str, List<String> list) {
        str.getClass();
        list.getClass();
        this.material = str;
        this.nodes = list;
    }

    public final String getMaterial() {
        return this.material;
    }

    public final List<String> getNodes() {
        return this.nodes;
    }
}
