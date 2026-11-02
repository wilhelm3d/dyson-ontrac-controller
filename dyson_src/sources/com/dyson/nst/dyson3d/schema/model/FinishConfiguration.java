package com.dyson.nst.dyson3d.schema.model;

import java.util.Map;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001BG\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0003\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\u0002\u0010\nR\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/model/FinishConfiguration;", "", "textures", "", "", "Lcom/dyson/nst/dyson3d/schema/model/Texture;", "materials", "Lcom/dyson/nst/dyson3d/schema/model/Material;", "finishes", "Lcom/dyson/nst/dyson3d/schema/model/Finish;", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "getFinishes", "()Ljava/util/Map;", "getMaterials", "getTextures", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FinishConfiguration {
    public static final int $stable = 8;
    private final Map<String, Finish> finishes;
    private final Map<String, Material> materials;
    private final Map<String, Texture> textures;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FinishConfiguration(java.util.Map r1, java.util.Map r2, java.util.Map r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
        /*
            r0 = this;
            r5 = r4 & 1
            if (r5 == 0) goto L9
            i12.f0 r1 = i12.f0.d
            r1.getClass()
        L9:
            r5 = r4 & 2
            if (r5 == 0) goto L12
            i12.f0 r2 = i12.f0.d
            r2.getClass()
        L12:
            r4 = r4 & 4
            if (r4 == 0) goto L1b
            i12.f0 r3 = i12.f0.d
            r3.getClass()
        L1b:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.nst.dyson3d.schema.model.FinishConfiguration.<init>(java.util.Map, java.util.Map, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final Map<String, Finish> getFinishes() {
        return this.finishes;
    }

    public final Map<String, Material> getMaterials() {
        return this.materials;
    }

    public final Map<String, Texture> getTextures() {
        return this.textures;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FinishConfiguration(Map<String, ? extends Texture> map, Map<String, Material> map2, Map<String, Finish> map3) {
        map.getClass();
        map2.getClass();
        map3.getClass();
        this.textures = map;
        this.materials = map2;
        this.finishes = map3;
    }

    public FinishConfiguration() {
        this(null, null, null, 7, null);
    }
}
