package com.dyson.nst.dyson3d.schema;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.dyson.nst.dyson3d.schema.model.Finish;
import com.dyson.nst.dyson3d.schema.model.FinishPart;
import com.dyson.nst.dyson3d.schema.model.MaterialProperty;
import com.dyson.nst.dyson3d.schema.model.MaterialPropertyType;
import com.dyson.nst.dyson3d.schema.model.Schema;
import com.dyson.nst.dyson3d.schema.model.Texture;
import com.google.android.filament.Colors;
import com.google.android.filament.Engine;
import com.google.android.filament.Material;
import com.google.android.filament.MaterialInstance;
import com.google.android.filament.RenderableManager;
import com.google.android.filament.Texture;
import com.google.android.filament.TextureSampler;
import h12.f0;
import i12.a1;
import i12.q0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import jg1.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nk1.g;
import rg1.a;
import tg1.f;
import yg1.a;
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0011\u0010\u0015J\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0011\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010&R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010.¨\u00060"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/SceneFinishCoordinator;", "", "Lcom/dyson/nst/dyson3d/schema/model/Schema;", "schema", "Lcom/dyson/nst/dyson3d/schema/TextureLocation;", "textureLocation", "Lyg1/b;", "textureLoader", "Lrg1/a;", "materialLoader", "Ljg1/b;", "scene", "<init>", "(Lcom/dyson/nst/dyson3d/schema/model/Schema;Lcom/dyson/nst/dyson3d/schema/TextureLocation;Lyg1/b;Lrg1/a;Ljg1/b;)V", "Lcom/dyson/nst/dyson3d/schema/model/FinishPart;", "part", "Lh12/f0;", "apply", "(Lcom/dyson/nst/dyson3d/schema/model/FinishPart;Ljg1/b;)V", "", "named", "(Ljava/lang/String;)V", "Lcom/dyson/nst/dyson3d/schema/model/Finish;", "finish", "(Lcom/dyson/nst/dyson3d/schema/model/Finish;)V", "applyDefaultFinishes", "()V", "Lcom/dyson/nst/dyson3d/schema/model/Schema;", "getSchema", "()Lcom/dyson/nst/dyson3d/schema/model/Schema;", "Lcom/dyson/nst/dyson3d/schema/TextureLocation;", "getTextureLocation", "()Lcom/dyson/nst/dyson3d/schema/TextureLocation;", "Lyg1/b;", "getTextureLoader", "()Lyg1/b;", "Lrg1/a;", "getMaterialLoader", "()Lrg1/a;", "Ljg1/b;", "getScene", "()Ljg1/b;", "setScene", "(Ljg1/b;)V", "Lcom/google/android/filament/Material;", "defaultMaterial", "Lcom/google/android/filament/Material;", "defaultMaterialOpacityMask", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SceneFinishCoordinator {
    public static final int $stable = 8;
    private final Material defaultMaterial;
    private final Material defaultMaterialOpacityMask;
    private final a materialLoader;
    private b scene;
    private final Schema schema;
    private final yg1.b textureLoader;
    private final TextureLocation textureLocation;

    public SceneFinishCoordinator(Schema schema, TextureLocation textureLocation, yg1.b bVar, a aVar, b bVar2) {
        schema.getClass();
        textureLocation.getClass();
        bVar.getClass();
        aVar.getClass();
        this.schema = schema;
        this.textureLocation = textureLocation;
        this.textureLoader = bVar;
        this.materialLoader = aVar;
        this.scene = bVar2;
        Material b13 = aVar.b("materials/schema-pbr.filamat");
        Material b14 = aVar.b("materials/schema-pbr-opacity-masked.filamat");
        TextureSampler textureSampler = new TextureSampler();
        a.C2724a c2724a = new a.C2724a();
        c2724a.b(-16777216);
        g gVar = g.DATA;
        c2724a.c(gVar);
        Engine engine = bVar.f89994a;
        Texture a13 = c2724a.a(engine);
        a.C2724a c2724a2 = new a.C2724a();
        c2724a2.b(-65536);
        c2724a2.c(gVar);
        Texture a14 = c2724a2.a(engine);
        a.C2724a c2724a3 = new a.C2724a();
        c2724a3.b(-1);
        c2724a3.c(gVar);
        Texture a15 = c2724a3.a(engine);
        MaterialPropertyType materialPropertyType = MaterialPropertyType.ANISOTROPY_LEVEL;
        b13.f(materialPropertyType.getValue(), a13, textureSampler);
        MaterialPropertyType materialPropertyType2 = MaterialPropertyType.ANISOTROPY_ANGLE;
        b13.f(materialPropertyType2.getValue(), a14, textureSampler);
        MaterialPropertyType materialPropertyType3 = MaterialPropertyType.AMBIENT_OCCLUSION;
        b13.f(materialPropertyType3.getValue(), a15, textureSampler);
        b14.f(materialPropertyType.getValue(), a13, textureSampler);
        b14.f(materialPropertyType2.getValue(), a14, textureSampler);
        b14.f(materialPropertyType3.getValue(), a15, textureSampler);
        this.defaultMaterial = b13;
        this.defaultMaterialOpacityMask = b14;
    }

    private final void apply(FinishPart finishPart, b bVar) {
        vg1.a c13;
        com.dyson.nst.dyson3d.schema.model.Material material = this.schema.getFinishes().getMaterials().get(finishPart.getMaterial());
        if (material == null || material.getProperties().isEmpty()) {
            return;
        }
        MaterialInstance a13 = (material.getOpacityThreshold() == null || material.getOpacityThreshold().doubleValue() >= 1.0d) ? this.materialLoader.a(this.defaultMaterial) : this.materialLoader.a(this.defaultMaterialOpacityMask);
        for (MaterialProperty materialProperty : material.getProperties()) {
            com.dyson.nst.dyson3d.schema.model.Texture texture = (com.dyson.nst.dyson3d.schema.model.Texture) q0.d(this.schema.getFinishes().getTextures(), materialProperty.getTexture());
            if (texture instanceof Texture.Color) {
                Texture.Color color = (Texture.Color) texture;
                a13.e(materialProperty.getProperty().getValue(), Colors.c.SRGB, color.getR(), color.getB(), color.getG());
            } else if (texture instanceof Texture.Image) {
                g gVar = g.DATA;
                if (materialProperty.getProperty() == MaterialPropertyType.BASE_COLOR) {
                    gVar = g.COLOR;
                }
                if (materialProperty.getProperty() == MaterialPropertyType.NORMAL) {
                    gVar = g.NORMAL;
                }
                String value = materialProperty.getProperty().getValue();
                yg1.b bVar2 = this.textureLoader;
                String str = this.textureLocation.getPath() + ((Texture.Image) texture).getImage();
                bVar2.getClass();
                gVar.getClass();
                int i13 = jg1.a.f45125a;
                gVar.name();
                a.C2724a c2724a = new a.C2724a();
                AssetManager assets = bVar2.f89995b.getAssets();
                assets.getClass();
                yg1.a.f89989a.getClass();
                g gVar2 = yg1.a.f89990b;
                gVar2.getClass();
                InputStream open = assets.open(str);
                open.getClass();
                try {
                    byte[] bArr = new byte[open.available()];
                    open.read(bArr);
                    open.close();
                    ByteBuffer wrap = ByteBuffer.wrap(bArr);
                    wrap.getClass();
                    byte[] array = wrap.array();
                    int capacity = wrap.capacity();
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inPremultiplied = gVar2 == g.COLOR;
                    f0 f0Var = f0.f36844a;
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(array, 0, capacity, options);
                    decodeByteArray.getClass();
                    int width = decodeByteArray.getWidth();
                    long j8 = c2724a.f18799b;
                    com.google.android.filament.Texture.nBuilderWidth(j8, width);
                    com.google.android.filament.Texture.nBuilderHeight(j8, decodeByteArray.getHeight());
                    c2724a.c(gVar2);
                    c2724a.f89991c = decodeByteArray;
                    c2724a.c(gVar);
                    com.google.android.filament.Texture a14 = c2724a.a(bVar2.f89994a);
                    gVar.name();
                    bVar2.f89996c.add(a14);
                    a13.g(value, a14, new TextureSampler());
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        a1.p(open, th2);
                        throw th3;
                    }
                }
            } else {
                continue;
            }
        }
        for (String str2 : finishPart.getNodes()) {
            f d = bVar.d(str2);
            if (d != null && (c13 = d.c()) != null) {
                RenderableManager renderableManager = c13.f84188b;
                int i14 = c13.f84187a;
                int j13 = renderableManager.j(renderableManager.i(i14));
                for (int i15 = 0; i15 < j13; i15++) {
                    renderableManager.m(renderableManager.i(i14), i15, a13);
                }
            }
        }
    }

    public final void applyDefaultFinishes() {
        for (String str : this.schema.getModel().getDefaultFinishes()) {
            apply(str);
        }
    }

    public final rg1.a getMaterialLoader() {
        return this.materialLoader;
    }

    public final b getScene() {
        return this.scene;
    }

    public final Schema getSchema() {
        return this.schema;
    }

    public final yg1.b getTextureLoader() {
        return this.textureLoader;
    }

    public final TextureLocation getTextureLocation() {
        return this.textureLocation;
    }

    public final void setScene(b bVar) {
        this.scene = bVar;
    }

    public /* synthetic */ SceneFinishCoordinator(Schema schema, TextureLocation textureLocation, yg1.b bVar, rg1.a aVar, b bVar2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(schema, textureLocation, bVar, aVar, (i13 & 16) != 0 ? null : bVar2);
    }

    public final void apply(Finish finish) {
        finish.getClass();
        b bVar = this.scene;
        if (bVar == null) {
            return;
        }
        for (FinishPart finishPart : finish.getParts()) {
            apply(finishPart, bVar);
        }
    }

    public final void apply(String str) {
        str.getClass();
        Finish finish = this.schema.getFinishes().getFinishes().get(str);
        if (finish == null) {
            return;
        }
        apply(finish);
    }
}
