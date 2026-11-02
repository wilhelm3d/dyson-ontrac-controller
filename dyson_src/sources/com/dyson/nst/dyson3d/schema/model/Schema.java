package com.dyson.nst.dyson3d.schema.model;

import h12.y;
import i12.c0;
import i12.s;
import i12.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.eclipse.paho.client.mqttv3.MqttTopic;
import pa.c;
import tq1.a;
import x12.r;
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00019Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00120\u0007¢\u0006\u0002\u0010\u0013J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0005HÆ\u0003J\u0015\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007HÆ\u0003J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\t\u0010/\u001a\u00020\u000eHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u0015\u00101\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00120\u0007HÆ\u0003Jo\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00120\u0007HÆ\u0001J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u000207HÖ\u0001J\t\u00108\u001a\u00020\bHÖ\u0001R\u001d\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00120\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u001d8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u000b8F¢\u0006\u0006\u001a\u0004\b\"\u0010\u001bR\u0013\u0010#\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0015¨\u0006:"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/model/Schema;", "", "model", "Lcom/dyson/nst/dyson3d/schema/model/Model;", "cameraConfiguration", "Lcom/dyson/nst/dyson3d/schema/model/CameraConfiguration;", "views", "", "", "Lcom/dyson/nst/dyson3d/schema/model/View;", "capabilities", "", "Lcom/dyson/nst/dyson3d/schema/model/Capability;", "finishes", "Lcom/dyson/nst/dyson3d/schema/model/FinishConfiguration;", "attachments", "Lcom/dyson/nst/dyson3d/schema/model/DecodableAttachments;", "animations", "Lcom/dyson/nst/dyson3d/schema/model/AnimationDefinition;", "(Lcom/dyson/nst/dyson3d/schema/model/Model;Lcom/dyson/nst/dyson3d/schema/model/CameraConfiguration;Ljava/util/Map;Ljava/util/List;Lcom/dyson/nst/dyson3d/schema/model/FinishConfiguration;Lcom/dyson/nst/dyson3d/schema/model/DecodableAttachments;Ljava/util/Map;)V", "getAnimations", "()Ljava/util/Map;", "getAttachments", "()Lcom/dyson/nst/dyson3d/schema/model/DecodableAttachments;", "getCameraConfiguration", "()Lcom/dyson/nst/dyson3d/schema/model/CameraConfiguration;", "getCapabilities", "()Ljava/util/List;", "defaultCamera", "Lcom/dyson/nst/dyson3d/schema/model/Camera;", "getDefaultCamera", "()Lcom/dyson/nst/dyson3d/schema/model/Camera;", "defaultModels", "Lcom/dyson/nst/dyson3d/schema/model/Schema$ModelDetails;", "getDefaultModels", "defaultView", "getDefaultView", "()Lcom/dyson/nst/dyson3d/schema/model/View;", "getFinishes", "()Lcom/dyson/nst/dyson3d/schema/model/FinishConfiguration;", "getModel", "()Lcom/dyson/nst/dyson3d/schema/model/Model;", "getViews", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "ModelDetails", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Schema {
    public static final int $stable = 8;
    private final Map<String, AnimationDefinition> animations;
    private final DecodableAttachments attachments;
    private final CameraConfiguration cameraConfiguration;
    private final List<Capability> capabilities;
    private final FinishConfiguration finishes;
    private final Model model;
    private final Map<String, View> views;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/model/Schema$ModelDetails;", "", "filename", "", "node", "transform", "Lcom/dyson/nst/dyson3d/schema/model/Transform;", "(Ljava/lang/String;Ljava/lang/String;Lcom/dyson/nst/dyson3d/schema/model/Transform;)V", "getFilename", "()Ljava/lang/String;", "setFilename", "(Ljava/lang/String;)V", "getNode", "setNode", "getTransform", "()Lcom/dyson/nst/dyson3d/schema/model/Transform;", "setTransform", "(Lcom/dyson/nst/dyson3d/schema/model/Transform;)V", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class ModelDetails {
        public static final int $stable = 8;
        private String filename;
        private String node;
        private Transform transform;

        public ModelDetails(String str, String str2, Transform transform) {
            str.getClass();
            str2.getClass();
            transform.getClass();
            this.filename = str;
            this.node = str2;
            this.transform = transform;
        }

        public final String getFilename() {
            return this.filename;
        }

        public final String getNode() {
            return this.node;
        }

        public final Transform getTransform() {
            return this.transform;
        }

        public final void setFilename(String str) {
            str.getClass();
            this.filename = str;
        }

        public final void setNode(String str) {
            str.getClass();
            this.node = str;
        }

        public final void setTransform(Transform transform) {
            transform.getClass();
            this.transform = transform;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Schema(com.dyson.nst.dyson3d.schema.model.Model r12, com.dyson.nst.dyson3d.schema.model.CameraConfiguration r13, java.util.Map r14, java.util.List r15, com.dyson.nst.dyson3d.schema.model.FinishConfiguration r16, com.dyson.nst.dyson3d.schema.model.DecodableAttachments r17, java.util.Map r18, int r19, kotlin.jvm.internal.DefaultConstructorMarker r20) {
        /*
            r11 = this;
            r0 = r19 & 4
            if (r0 == 0) goto L9
            i12.f0 r14 = i12.f0.d
            r14.getClass()
        L9:
            r3 = r14
            r14 = r19 & 8
            if (r14 == 0) goto L12
            i12.e0 r14 = i12.e0.d
            r4 = r14
            goto L13
        L12:
            r4 = r15
        L13:
            r14 = r19 & 16
            if (r14 == 0) goto L22
            com.dyson.nst.dyson3d.schema.model.FinishConfiguration r5 = new com.dyson.nst.dyson3d.schema.model.FinishConfiguration
            r9 = 7
            r10 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            goto L24
        L22:
            r5 = r16
        L24:
            r14 = r19 & 64
            if (r14 == 0) goto L34
            i12.f0 r14 = i12.f0.d
            r14.getClass()
            r7 = r14
        L2e:
            r0 = r11
            r1 = r12
            r2 = r13
            r6 = r17
            goto L37
        L34:
            r7 = r18
            goto L2e
        L37:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dyson.nst.dyson3d.schema.model.Schema.<init>(com.dyson.nst.dyson3d.schema.model.Model, com.dyson.nst.dyson3d.schema.model.CameraConfiguration, java.util.Map, java.util.List, com.dyson.nst.dyson3d.schema.model.FinishConfiguration, com.dyson.nst.dyson3d.schema.model.DecodableAttachments, java.util.Map, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static /* synthetic */ Schema copy$default(Schema schema, Model model, CameraConfiguration cameraConfiguration, Map map, List list, FinishConfiguration finishConfiguration, DecodableAttachments decodableAttachments, Map map2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            model = schema.model;
        }
        if ((i13 & 2) != 0) {
            cameraConfiguration = schema.cameraConfiguration;
        }
        Map<String, View> map3 = map;
        if ((i13 & 4) != 0) {
            map3 = schema.views;
        }
        List<Capability> list2 = list;
        if ((i13 & 8) != 0) {
            list2 = schema.capabilities;
        }
        if ((i13 & 16) != 0) {
            finishConfiguration = schema.finishes;
        }
        if ((i13 & 32) != 0) {
            decodableAttachments = schema.attachments;
        }
        Map<String, AnimationDefinition> map4 = map2;
        if ((i13 & 64) != 0) {
            map4 = schema.animations;
        }
        DecodableAttachments decodableAttachments2 = decodableAttachments;
        Map map5 = map4;
        FinishConfiguration finishConfiguration2 = finishConfiguration;
        Map map6 = map3;
        return schema.copy(model, cameraConfiguration, map6, list2, finishConfiguration2, decodableAttachments2, map5);
    }

    public final Model component1() {
        return this.model;
    }

    public final CameraConfiguration component2() {
        return this.cameraConfiguration;
    }

    public final Map<String, View> component3() {
        return this.views;
    }

    public final List<Capability> component4() {
        return this.capabilities;
    }

    public final FinishConfiguration component5() {
        return this.finishes;
    }

    public final DecodableAttachments component6() {
        return this.attachments;
    }

    public final Map<String, AnimationDefinition> component7() {
        return this.animations;
    }

    public final Schema copy(Model model, CameraConfiguration cameraConfiguration, Map<String, View> map, List<Capability> list, FinishConfiguration finishConfiguration, DecodableAttachments decodableAttachments, Map<String, ? extends AnimationDefinition> map2) {
        model.getClass();
        cameraConfiguration.getClass();
        map.getClass();
        list.getClass();
        finishConfiguration.getClass();
        map2.getClass();
        return new Schema(model, cameraConfiguration, map, list, finishConfiguration, decodableAttachments, map2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Schema) {
            Schema schema = (Schema) obj;
            return r.c(this.model, schema.model) && r.c(this.cameraConfiguration, schema.cameraConfiguration) && r.c(this.views, schema.views) && r.c(this.capabilities, schema.capabilities) && r.c(this.finishes, schema.finishes) && r.c(this.attachments, schema.attachments) && r.c(this.animations, schema.animations);
        }
        return false;
    }

    public final Map<String, AnimationDefinition> getAnimations() {
        return this.animations;
    }

    public final DecodableAttachments getAttachments() {
        return this.attachments;
    }

    public final CameraConfiguration getCameraConfiguration() {
        return this.cameraConfiguration;
    }

    public final List<Capability> getCapabilities() {
        return this.capabilities;
    }

    public final Camera getDefaultCamera() {
        Object obj;
        Camera camera;
        List<AnimationState> states;
        Iterator<T> it = this.cameraConfiguration.getCameras().iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                y.p("Collection contains no element matching the predicate.");
                return null;
            }
            camera = (Camera) it.next();
        } while (!r.c(camera.getNode(), this.cameraConfiguration.getDefaultCamera()));
        View defaultView = getDefaultView();
        if (defaultView != null && (states = defaultView.getStates()) != null) {
            Iterator<T> it2 = states.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (r.c(((AnimationState) next).getNode(), camera.getNode())) {
                    obj = next;
                    break;
                }
            }
            AnimationState animationState = (AnimationState) obj;
            if (animationState != null) {
                camera.setTransform(animationState.getTransform());
            }
        }
        return camera;
    }

    public final List<ModelDetails> getDefaultModels() {
        List<AnimationState> states;
        Object obj;
        String str = (String) c0.N(this.model.getPaths());
        if (this.model.getNodes().isEmpty()) {
            return s.c(new ModelDetails(str, MqttTopic.TOPIC_LEVEL_SEPARATOR, new Transform(null, null, null)));
        }
        List<String> nodes = this.model.getNodes();
        ArrayList arrayList = new ArrayList(u.o(nodes, 10));
        for (String str2 : nodes) {
            View defaultView = getDefaultView();
            if (defaultView != null && (states = defaultView.getStates()) != null) {
                Iterator<T> it = states.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (r.c(((AnimationState) obj).getNode(), str2)) {
                        break;
                    }
                }
                AnimationState animationState = (AnimationState) obj;
                if (animationState != null && (r5 = animationState.getTransform()) != null) {
                    arrayList.add(new ModelDetails(str, str2, r5));
                }
            }
            Transform transform = new Transform(null, null, null);
            arrayList.add(new ModelDetails(str, str2, transform));
        }
        return arrayList;
    }

    public final View getDefaultView() {
        String initialView = this.model.getInitialView();
        if (initialView == null) {
            return null;
        }
        return this.views.get(initialView);
    }

    public final FinishConfiguration getFinishes() {
        return this.finishes;
    }

    public final Model getModel() {
        return this.model;
    }

    public final Map<String, View> getViews() {
        return this.views;
    }

    public int hashCode() {
        int hashCode = (this.finishes.hashCode() + a.h(c.b(this.views, (this.cameraConfiguration.hashCode() + (this.model.hashCode() * 31)) * 31, 31), 31, this.capabilities)) * 31;
        DecodableAttachments decodableAttachments = this.attachments;
        return this.animations.hashCode() + ((hashCode + (decodableAttachments == null ? 0 : decodableAttachments.hashCode())) * 31);
    }

    public String toString() {
        Model model = this.model;
        CameraConfiguration cameraConfiguration = this.cameraConfiguration;
        Map<String, View> map = this.views;
        List<Capability> list = this.capabilities;
        FinishConfiguration finishConfiguration = this.finishes;
        DecodableAttachments decodableAttachments = this.attachments;
        Map<String, AnimationDefinition> map2 = this.animations;
        StringBuilder sb2 = new StringBuilder("Schema(model=");
        sb2.append(model);
        sb2.append(", cameraConfiguration=");
        sb2.append(cameraConfiguration);
        sb2.append(", views=");
        sb2.append(map);
        sb2.append(", capabilities=");
        sb2.append(list);
        sb2.append(", finishes=");
        sb2.append(finishConfiguration);
        sb2.append(", attachments=");
        sb2.append(decodableAttachments);
        sb2.append(", animations=");
        return c.g(sb2, map2, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Schema(Model model, CameraConfiguration cameraConfiguration, Map<String, View> map, List<Capability> list, FinishConfiguration finishConfiguration, DecodableAttachments decodableAttachments, Map<String, ? extends AnimationDefinition> map2) {
        model.getClass();
        cameraConfiguration.getClass();
        map.getClass();
        list.getClass();
        finishConfiguration.getClass();
        map2.getClass();
        this.model = model;
        this.cameraConfiguration = cameraConfiguration;
        this.views = map;
        this.capabilities = list;
        this.finishes = finishConfiguration;
        this.attachments = decodableAttachments;
        this.animations = map2;
    }
}
