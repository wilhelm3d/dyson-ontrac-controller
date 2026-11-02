package com.dyson.nst.dyson3d.schema.model;

import com.brightcove.player.captioning.TTMLParser;
import com.salesforce.marketingcloud.messages.inbox.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/model/Texture;", "", b.f21448j, "", "(Ljava/lang/String;)V", "getType", "()Ljava/lang/String;", "Color", "Image", "Lcom/dyson/nst/dyson3d/schema/model/Texture$Color;", "Lcom/dyson/nst/dyson3d/schema/model/Texture$Image;", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class Texture {
    public static final int $stable = 0;
    private final String type;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/model/Texture$Color;", "Lcom/dyson/nst/dyson3d/schema/model/Texture;", "r", "", "g", "b", "(FFF)V", "getB", "()F", "getG", "getR", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Color extends Texture {
        public static final int $stable = 0;

        /* renamed from: b  reason: collision with root package name */
        private final float f17021b;

        /* renamed from: g  reason: collision with root package name */
        private final float f17022g;

        /* renamed from: r  reason: collision with root package name */
        private final float f17023r;

        public Color(float f13, float f14, float f15) {
            super(TTMLParser.Attributes.COLOR, null);
            this.f17023r = f13;
            this.f17022g = f14;
            this.f17021b = f15;
        }

        public final float getB() {
            return this.f17021b;
        }

        public final float getG() {
            return this.f17022g;
        }

        public final float getR() {
            return this.f17023r;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/model/Texture$Image;", "Lcom/dyson/nst/dyson3d/schema/model/Texture;", "image", "", "(Ljava/lang/String;)V", "getImage", "()Ljava/lang/String;", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Image extends Texture {
        public static final int $stable = 0;
        private final String image;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Image(String str) {
            super("image", null);
            str.getClass();
            this.image = str;
        }

        public final String getImage() {
            return this.image;
        }
    }

    private Texture(String str) {
        this.type = str;
    }

    public final String getType() {
        return this.type;
    }

    public /* synthetic */ Texture(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }
}
