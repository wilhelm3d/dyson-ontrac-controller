package com.dyson.nst.dyson3d.schema.model;

import com.brightcove.player.captioning.TTMLParser;
import java.util.List;
import kotlin.Metadata;
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/model/Light;", "", "name", "", "style", "intensity", "", "direction", "", "position", TTMLParser.Attributes.COLOR, "Lcom/dyson/nst/dyson3d/schema/model/Color;", "(Ljava/lang/String;Ljava/lang/String;FLjava/util/List;Ljava/util/List;Lcom/dyson/nst/dyson3d/schema/model/Color;)V", "getColor", "()Lcom/dyson/nst/dyson3d/schema/model/Color;", "getDirection", "()Ljava/util/List;", "getIntensity", "()F", "getName", "()Ljava/lang/String;", "getPosition", "getStyle", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Light {
    public static final int $stable = 8;
    private final Color color;
    private final List<Float> direction;
    private final float intensity;
    private final String name;
    private final List<Float> position;
    private final String style;

    public Light(String str, String str2, float f13, List<Float> list, List<Float> list2, Color color) {
        str.getClass();
        str2.getClass();
        list.getClass();
        list2.getClass();
        color.getClass();
        this.name = str;
        this.style = str2;
        this.intensity = f13;
        this.direction = list;
        this.position = list2;
        this.color = color;
    }

    public final Color getColor() {
        return this.color;
    }

    public final List<Float> getDirection() {
        return this.direction;
    }

    public final float getIntensity() {
        return this.intensity;
    }

    public final String getName() {
        return this.name;
    }

    public final List<Float> getPosition() {
        return this.position;
    }

    public final String getStyle() {
        return this.style;
    }
}
