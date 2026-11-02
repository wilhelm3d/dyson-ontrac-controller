package com.dyson.nst.dyson3d.schema.model;

import java.util.Map;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\u0010\tR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/model/DecodableAttachments;", "", "defaultAttachment", "", "allAttachments", "", "Lcom/dyson/nst/dyson3d/schema/model/DecodableAttachment;", "animations", "Lcom/dyson/nst/dyson3d/schema/model/AnimationDefinition;", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "getAllAttachments", "()Ljava/util/Map;", "getAnimations", "getDefaultAttachment", "()Ljava/lang/String;", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DecodableAttachments {
    public static final int $stable = 8;
    private final Map<String, DecodableAttachment> allAttachments;
    private final Map<String, AnimationDefinition> animations;
    private final String defaultAttachment;

    /* JADX WARN: Multi-variable type inference failed */
    public DecodableAttachments(String str, Map<String, DecodableAttachment> map, Map<String, ? extends AnimationDefinition> map2) {
        map.getClass();
        map2.getClass();
        this.defaultAttachment = str;
        this.allAttachments = map;
        this.animations = map2;
    }

    public final Map<String, DecodableAttachment> getAllAttachments() {
        return this.allAttachments;
    }

    public final Map<String, AnimationDefinition> getAnimations() {
        return this.animations;
    }

    public final String getDefaultAttachment() {
        return this.defaultAttachment;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DecodableAttachments(java.lang.String r1, java.util.Map r2, java.util.Map r3, int r4, kotlin.jvm.internal.DefaultConstructorMarker r5) {
        /*
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto L9
            i12.f0 r3 = i12.f0.d
            r3.getClass()
        L9:
            r0.<init>(r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.nst.dyson3d.schema.model.DecodableAttachments.<init>(java.lang.String, java.util.Map, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
