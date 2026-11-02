package com.dyson.nst.dyson3d.schema;

import android.content.Context;
import com.dyson.nst.dyson3d.schema.model.AxisLimitation;
import com.dyson.nst.dyson3d.schema.model.Camera;
import com.dyson.nst.dyson3d.schema.model.Light;
import com.dyson.nst.dyson3d.schema.model.Manipulator;
import com.dyson.nst.dyson3d.schema.model.Schema;
import com.dyson.nst.dyson3d.schema.model.Transform;
import com.dyson.nst.dyson3d.schema.model.TransformComponent;
import com.google.android.filament.Engine;
import com.google.android.filament.LightManager;
import com.salesforce.marketingcloud.config.a;
import i12.c0;
import i12.p0;
import i12.q0;
import i12.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mg1.a;
import mg1.d;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import qg1.a;
import qv1.s;
import tg1.e;
import tg1.f;
import u3.d2;
import x12.r;
import yg1.b;
import yy1.g;
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010%\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010 \u001a\u00020\u00152\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u0010H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u000eH\u0002¢\u0006\u0004\b#\u0010$J\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&2\u0006\u0010%\u001a\u00020\u0015H\u0002¢\u0006\u0004\b(\u0010)J'\u00100\u001a\u00020/2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020'2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b0\u00101J\u0015\u00102\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b8\u00109R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010=\u001a\u0004\b>\u0010?R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010D\u001a\u00020C8\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010I\u001a\u00020H8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0017\u0010N\u001a\u00020M8\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0017\u0010S\u001a\u00020R8\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR(\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010W\u001a\u0004\u0018\u00010\u00158\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0016\u0010X\u001a\u0004\bY\u0010ZR(\u0010[\u001a\u0004\u0018\u00010/2\b\u0010W\u001a\u0004\u0018\u00010/8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\"\u0010`\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00150_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u001a\u0010d\u001a\b\u0012\u0004\u0012\u00020\u000e0&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bb\u0010c¨\u0006e"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/SchemaSceneManager;", "", "Lcom/google/android/filament/Engine;", "engine", "Ltg1/d;", "modelLoader", "Lcom/dyson/nst/dyson3d/schema/model/Schema;", "schema", "Lcom/dyson/nst/dyson3d/schema/ModelLocation;", "modelLocation", "Lcom/dyson/nst/dyson3d/schema/TextureLocation;", "textureLocation", "<init>", "(Lcom/google/android/filament/Engine;Ltg1/d;Lcom/dyson/nst/dyson3d/schema/model/Schema;Lcom/dyson/nst/dyson3d/schema/ModelLocation;Lcom/dyson/nst/dyson3d/schema/TextureLocation;)V", "", a.f20857j, "", "isModelLoaded", "(Ljava/lang/String;)Z", "Ljg1/b;", "scene", "Ltg1/e;", "mainModel", "Lh12/f0;", "applyCamera", "(Lcom/dyson/nst/dyson3d/schema/model/Schema;Ljg1/b;Ltg1/e;)V", "Lcom/dyson/nst/dyson3d/schema/model/Light;", "light", "Lqg1/a;", "createLight", "(Lcom/dyson/nst/dyson3d/schema/model/Light;)Lqg1/a;", "initialOnly", "loadModels", "(Lcom/dyson/nst/dyson3d/schema/model/Schema;Ljg1/b;Z)Ltg1/e;", "schemaPathName", "loadModel", "(Ljava/lang/String;)Ltg1/e;", "model", "", "Llg1/a;", "findExistingCameraNodes", "(Ltg1/e;)Ljava/util/List;", "Lcom/dyson/nst/dyson3d/schema/model/Manipulator;", "manipulator", "camera", "Lyy1/b;", "target", "Lmg1/d;", "createCameraManipulator", "(Lcom/dyson/nst/dyson3d/schema/model/Manipulator;Llg1/a;Lyy1/b;)Lmg1/d;", "buildScene", "(Ljg1/b;)V", "Lcom/google/android/filament/Engine;", "getEngine", "()Lcom/google/android/filament/Engine;", "Ltg1/d;", "getModelLoader", "()Ltg1/d;", "Lcom/dyson/nst/dyson3d/schema/model/Schema;", "getSchema", "()Lcom/dyson/nst/dyson3d/schema/model/Schema;", "Lcom/dyson/nst/dyson3d/schema/ModelLocation;", "getModelLocation", "()Lcom/dyson/nst/dyson3d/schema/ModelLocation;", "Lcom/dyson/nst/dyson3d/schema/TextureLocation;", "getTextureLocation", "()Lcom/dyson/nst/dyson3d/schema/TextureLocation;", "Lcom/dyson/nst/dyson3d/schema/SceneProductViewCoordinator;", "productViewCoordinator", "Lcom/dyson/nst/dyson3d/schema/SceneProductViewCoordinator;", "getProductViewCoordinator", "()Lcom/dyson/nst/dyson3d/schema/SceneProductViewCoordinator;", "Lcom/dyson/nst/dyson3d/schema/SceneFinishCoordinator;", "finishCoordinator", "Lcom/dyson/nst/dyson3d/schema/SceneFinishCoordinator;", "getFinishCoordinator", "()Lcom/dyson/nst/dyson3d/schema/SceneFinishCoordinator;", "Lcom/dyson/nst/dyson3d/schema/SceneAnimationCoordinator;", "animationCoordinator", "Lcom/dyson/nst/dyson3d/schema/SceneAnimationCoordinator;", "getAnimationCoordinator", "()Lcom/dyson/nst/dyson3d/schema/SceneAnimationCoordinator;", "Lcom/dyson/nst/dyson3d/schema/SceneAttachmentsCoordinator;", "attachmentCoordinator", "Lcom/dyson/nst/dyson3d/schema/SceneAttachmentsCoordinator;", "getAttachmentCoordinator", "()Lcom/dyson/nst/dyson3d/schema/SceneAttachmentsCoordinator;", "<set-?>", "Ltg1/e;", "getMainModel", "()Ltg1/e;", "cameraManipulator", "Lmg1/d;", "getCameraManipulator", "()Lmg1/d;", "", "loadedModels", "Ljava/util/Map;", "getAvailableModelPaths", "()Ljava/util/List;", "availableModelPaths", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SchemaSceneManager {
    public static final int $stable = 8;
    private final SceneAnimationCoordinator animationCoordinator;
    private final SceneAttachmentsCoordinator attachmentCoordinator;
    private d cameraManipulator;
    private final Engine engine;
    private final SceneFinishCoordinator finishCoordinator;
    private Map<String, e> loadedModels;
    private e mainModel;
    private final tg1.d modelLoader;
    private final ModelLocation modelLocation;
    private final SceneProductViewCoordinator productViewCoordinator;
    private final Schema schema;
    private final TextureLocation textureLocation;

    public SchemaSceneManager(Engine engine, tg1.d dVar, Schema schema, ModelLocation modelLocation, TextureLocation textureLocation) {
        engine.getClass();
        dVar.getClass();
        schema.getClass();
        modelLocation.getClass();
        textureLocation.getClass();
        this.engine = engine;
        this.modelLoader = dVar;
        this.schema = schema;
        this.modelLocation = modelLocation;
        this.textureLocation = textureLocation;
        this.productViewCoordinator = new SceneProductViewCoordinator(schema, null, 2, null);
        Context context = dVar.f79530a;
        this.finishCoordinator = new SceneFinishCoordinator(schema, textureLocation, new b(engine, context), new rg1.a(engine, context), null, 16, null);
        SceneAnimationCoordinator sceneAnimationCoordinator = new SceneAnimationCoordinator(schema, null, 2, null);
        this.animationCoordinator = sceneAnimationCoordinator;
        this.attachmentCoordinator = new SceneAttachmentsCoordinator(schema, sceneAnimationCoordinator, null, 4, null);
        this.loadedModels = new LinkedHashMap();
    }

    private final void applyCamera(Schema schema, jg1.b bVar, e eVar) {
        Object obj;
        Transform transform;
        yy1.b bVar2;
        yy1.b a13;
        List<lg1.a> findExistingCameraNodes = findExistingCameraNodes(eVar);
        String node = schema.getDefaultCamera().getNode();
        Iterator<T> it = findExistingCameraNodes.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (r.c(((lg1.a) obj).f51819c, node)) {
                break;
            }
        }
        lg1.a aVar = (lg1.a) obj;
        if (aVar != null) {
            bVar.getClass();
            jg1.a.b(bVar.f45126a, bVar.f45129f.f51818b);
            bVar.f45129f = aVar;
        }
        Camera camera = (Camera) c0.P(schema.getCameraConfiguration().getCameras());
        if (camera == null || (transform = camera.getTransform()) == null) {
            return;
        }
        lg1.a aVar2 = bVar.f45129f;
        TransformComponent position = transform.getPosition();
        if (position == null || (bVar2 = position.getVector()) == null) {
            bVar2 = bVar.f45129f.e;
        }
        yy1.b bVar3 = bVar2;
        TransformComponent rotation = transform.getRotation();
        if (rotation == null || (a13 = rotation.getVector()) == null) {
            g gVar = bVar.f45129f.f51820f;
            gVar.getClass();
            a13 = yy1.b.a(d2.i(gVar));
            a13.f91166a *= 0.017453292f;
            a13.f91167b *= 0.017453292f;
            a13.f91168c *= 0.017453292f;
        }
        SchemaSceneManagerKt.m13applyTransformzkXUZaI$default(aVar2, bVar3, a13, 0L, false, 4, null);
    }

    private final d createCameraManipulator(Manipulator manipulator, lg1.a aVar, yy1.b bVar) {
        if (!(manipulator instanceof Manipulator.ArcBall)) {
            if (manipulator instanceof Manipulator.Camera) {
                Manipulator.Camera camera = (Manipulator.Camera) manipulator;
                return new mg1.g(aVar, bVar, false, true, new d22.e(camera.getDetails().getMinScale(), camera.getDetails().getMaxScale()));
            } else if (manipulator instanceof Manipulator.Node) {
                Manipulator.Node node = (Manipulator.Node) manipulator;
                return new mg1.g(aVar, bVar, false, true, new d22.e(node.getDetails().getMinScale(), node.getDetails().getMaxScale()));
            } else {
                ma.e.o();
                return null;
            }
        }
        Manipulator.ArcBall arcBall = (Manipulator.ArcBall) manipulator;
        float axisClampBias = arcBall.getDetails().getAxisClampBias();
        float sensitivity = arcBall.getDetails().getSensitivity();
        boolean allowInertia = arcBall.getDetails().getAllowInertia();
        float inertiaSensitivity = arcBall.getDetails().getInertiaSensitivity();
        boolean allowZoom = arcBall.getDetails().getAllowZoom();
        float minZoomDistance = arcBall.getDetails().getMinZoomDistance();
        float maxZoomDistance = arcBall.getDetails().getMaxZoomDistance();
        boolean allowZoom2 = arcBall.getDetails().getAllowZoom();
        AxisLimitation horizontalAxisTravelLimitation = arcBall.getDetails().getHorizontalAxisTravelLimitation();
        a.C1662a c1662a = horizontalAxisTravelLimitation != null ? new a.C1662a(horizontalAxisTravelLimitation.getAllowTravel()) : null;
        AxisLimitation verticalAxisTravelLimitation = arcBall.getDetails().getVerticalAxisTravelLimitation();
        return new mg1.a(aVar, bVar, axisClampBias, sensitivity, allowInertia, inertiaSensitivity, allowZoom, minZoomDistance, maxZoomDistance, allowZoom2, c1662a, verticalAxisTravelLimitation != null ? new a.C1662a(verticalAxisTravelLimitation.getAllowTravel()) : null);
    }

    private final qg1.a createLight(Light light) {
        LightManager.b bVar;
        String style = light.getStyle();
        int hashCode = style.hashCode();
        if (hashCode == -1631834134) {
            if (style.equals("directional")) {
                bVar = LightManager.b.DIRECTIONAL;
            }
            bVar = LightManager.b.DIRECTIONAL;
        } else if (hashCode != 3537154) {
            if (hashCode == 106845584 && style.equals("point")) {
                bVar = LightManager.b.POINT;
            }
            bVar = LightManager.b.DIRECTIONAL;
        } else {
            if (style.equals("spot")) {
                bVar = LightManager.b.SPOT;
            }
            bVar = LightManager.b.DIRECTIONAL;
        }
        qg1.a a13 = a.C2005a.a(qg1.a.d, this.engine, bVar);
        int i13 = a13.f66826b;
        yy1.b bVar2 = new yy1.b(light.getDirection().get(0).floatValue(), light.getDirection().get(1).floatValue(), light.getDirection().get(2).floatValue());
        a13.a().f(bVar2.f91166a, bVar2.f91167b, bVar2.f91168c, a13.a().d(i13));
        a13.h(new yy1.b(light.getPosition().get(0).floatValue(), light.getPosition().get(1).floatValue(), light.getPosition().get(2).floatValue()));
        yy1.b bVar3 = new yy1.b(light.getColor().getR() / 255.0f, light.getColor().getG() / 255.0f, light.getColor().getB() / 255.0f);
        a13.a().e(bVar3.f91166a, bVar3.f91167b, bVar3.f91168c, a13.a().d(i13));
        a13.a().g(light.getIntensity(), a13.a().d(i13));
        a13.a().i(a13.a().d(i13));
        return a13;
    }

    private final List<lg1.a> findExistingCameraNodes(e eVar) {
        int[] a13 = eVar.f79533f.a();
        ArrayList arrayList = new ArrayList(a13.length);
        for (int i13 : a13) {
            arrayList.add(this.engine.z(i13));
        }
        ArrayList L = c0.L(arrayList);
        ArrayList arrayList2 = new ArrayList(u.o(L, 10));
        Iterator it = L.iterator();
        while (it.hasNext()) {
            com.google.android.filament.Camera camera = (com.google.android.filament.Camera) it.next();
            Engine engine = this.engine;
            camera.getClass();
            arrayList2.add(new lg1.a(engine, camera, eVar.f79533f.d(camera.f18741b)));
        }
        return arrayList2;
    }

    private final List<String> getAvailableModelPaths() {
        return this.schema.getModel().getPaths();
    }

    private final boolean isModelLoaded(String str) {
        return this.loadedModels.keySet().contains(str);
    }

    private final e loadModel(String str) {
        return tg1.d.a(this.modelLoader, s.i(this.modelLocation.getPath(), str, ".glb"), 8);
    }

    private final e loadModels(Schema schema, jg1.b bVar, boolean z13) {
        e eVar;
        String str = (String) c0.N(schema.getModel().getPaths());
        if (z13) {
            eVar = loadModel(str);
            this.loadedModels.put(str, eVar);
        } else {
            List<String> paths = schema.getModel().getPaths();
            int b13 = p0.b(u.o(paths, 10));
            if (b13 < 16) {
                b13 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(b13);
            for (Object obj : paths) {
                linkedHashMap.put(obj, loadModel((String) obj));
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
            this.loadedModels = linkedHashMap2;
            eVar = (e) q0.d(linkedHashMap2, str);
        }
        for (f fVar : this.loadedModels.values()) {
            wg1.g i13 = fVar.i(MqttTopic.TOPIC_LEVEL_SEPARATOR);
            f fVar2 = i13 instanceof f ? (f) i13 : null;
            if (fVar2 != null) {
                fVar = fVar2;
            }
            bVar.a(fVar);
        }
        return eVar;
    }

    public final void buildScene(jg1.b bVar) {
        bVar.getClass();
        e loadModels = loadModels(this.schema, bVar, false);
        this.mainModel = loadModels;
        applyCamera(this.schema, bVar, loadModels);
        lg1.a aVar = bVar.f45129f;
        lg1.d dVar = new lg1.d(20.78461f);
        aVar.getClass();
        aVar.f51823i = dVar;
        aVar.m();
        this.cameraManipulator = new mg1.a(bVar.f45129f, loadModels.f79546c, 0.0f, 0.0f, false, 0.0f, false, 0.0f, 0.0f, false, null, null, 4092, null);
        Manipulator manipulator = this.schema.getModel().getManipulator();
        if (manipulator != null) {
            this.cameraManipulator = createCameraManipulator(manipulator, bVar.f45129f, loadModels.f79546c);
        }
        for (Light light : this.schema.getModel().getLights()) {
            qg1.a createLight = createLight(light);
            createLight.getClass();
            bVar.f45127b.b(createLight.f66826b);
            bVar.d.add(createLight);
        }
        this.productViewCoordinator.setScene(bVar);
        SceneProductViewCoordinator sceneProductViewCoordinator = this.productViewCoordinator;
        w32.b.e.getClass();
        sceneProductViewCoordinator.m11showInitialViewLRDsOJo(0L);
        this.finishCoordinator.setScene(bVar);
        this.finishCoordinator.applyDefaultFinishes();
        this.attachmentCoordinator.setScene(bVar);
        this.attachmentCoordinator.initialConfigure$Dyson3D_release();
        this.attachmentCoordinator.applyDefaultAttachment(false);
        this.animationCoordinator.setScene(bVar);
    }

    public final SceneAnimationCoordinator getAnimationCoordinator() {
        return this.animationCoordinator;
    }

    public final SceneAttachmentsCoordinator getAttachmentCoordinator() {
        return this.attachmentCoordinator;
    }

    public final d getCameraManipulator() {
        return this.cameraManipulator;
    }

    public final Engine getEngine() {
        return this.engine;
    }

    public final SceneFinishCoordinator getFinishCoordinator() {
        return this.finishCoordinator;
    }

    public final e getMainModel() {
        return this.mainModel;
    }

    public final tg1.d getModelLoader() {
        return this.modelLoader;
    }

    public final ModelLocation getModelLocation() {
        return this.modelLocation;
    }

    public final SceneProductViewCoordinator getProductViewCoordinator() {
        return this.productViewCoordinator;
    }

    public final Schema getSchema() {
        return this.schema;
    }

    public final TextureLocation getTextureLocation() {
        return this.textureLocation;
    }

    public /* synthetic */ SchemaSceneManager(Engine engine, tg1.d dVar, Schema schema, ModelLocation modelLocation, TextureLocation textureLocation, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(engine, dVar, schema, (i13 & 8) != 0 ? new ModelLocation(null, false, 3, null) : modelLocation, (i13 & 16) != 0 ? new TextureLocation(null, false, 3, null) : textureLocation);
    }
}
