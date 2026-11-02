package com.dyson.nst.dyson3d.schema.model;

import i12.e0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tq1.a;
import x12.r;
import y9.w;
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0005\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0\u0005HÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003Ju\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00052\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010%\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u0006*"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/model/Model;", "", "name", "", "paths", "", "nodes", "needsCamera", "", "initialView", "manipulator", "Lcom/dyson/nst/dyson3d/schema/model/Manipulator;", "lights", "Lcom/dyson/nst/dyson3d/schema/model/Light;", "defaultFinishes", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZLjava/lang/String;Lcom/dyson/nst/dyson3d/schema/model/Manipulator;Ljava/util/List;Ljava/util/List;)V", "getDefaultFinishes", "()Ljava/util/List;", "getInitialView", "()Ljava/lang/String;", "getLights", "getManipulator", "()Lcom/dyson/nst/dyson3d/schema/model/Manipulator;", "getName", "getNeedsCamera", "()Z", "getNodes", "getPaths", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Model {
    public static final int $stable = 8;
    private final List<String> defaultFinishes;
    private final String initialView;
    private final List<Light> lights;
    private final Manipulator manipulator;
    private final String name;
    private final boolean needsCamera;
    private final List<String> nodes;
    private final List<String> paths;

    public Model(String str, List list, List list2, boolean z13, String str2, Manipulator manipulator, List list3, List list4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? e0.d : list, (i13 & 4) != 0 ? e0.d : list2, (i13 & 8) != 0 ? true : z13, str2, manipulator, (i13 & 64) != 0 ? e0.d : list3, (i13 & 128) != 0 ? e0.d : list4);
    }

    public static /* synthetic */ Model copy$default(Model model, String str, List list, List list2, boolean z13, String str2, Manipulator manipulator, List list3, List list4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = model.name;
        }
        List<String> list5 = list;
        if ((i13 & 2) != 0) {
            list5 = model.paths;
        }
        List<String> list6 = list2;
        if ((i13 & 4) != 0) {
            list6 = model.nodes;
        }
        if ((i13 & 8) != 0) {
            z13 = model.needsCamera;
        }
        if ((i13 & 16) != 0) {
            str2 = model.initialView;
        }
        if ((i13 & 32) != 0) {
            manipulator = model.manipulator;
        }
        List<Light> list7 = list3;
        if ((i13 & 64) != 0) {
            list7 = model.lights;
        }
        List<String> list8 = list4;
        if ((i13 & 128) != 0) {
            list8 = model.defaultFinishes;
        }
        List list9 = list7;
        List list10 = list8;
        String str3 = str2;
        Manipulator manipulator2 = manipulator;
        return model.copy(str, list5, list6, z13, str3, manipulator2, list9, list10);
    }

    public final String component1() {
        return this.name;
    }

    public final List<String> component2() {
        return this.paths;
    }

    public final List<String> component3() {
        return this.nodes;
    }

    public final boolean component4() {
        return this.needsCamera;
    }

    public final String component5() {
        return this.initialView;
    }

    public final Manipulator component6() {
        return this.manipulator;
    }

    public final List<Light> component7() {
        return this.lights;
    }

    public final List<String> component8() {
        return this.defaultFinishes;
    }

    public final Model copy(String str, List<String> list, List<String> list2, boolean z13, String str2, Manipulator manipulator, List<Light> list3, List<String> list4) {
        str.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        return new Model(str, list, list2, z13, str2, manipulator, list3, list4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Model) {
            Model model = (Model) obj;
            return r.c(this.name, model.name) && r.c(this.paths, model.paths) && r.c(this.nodes, model.nodes) && this.needsCamera == model.needsCamera && r.c(this.initialView, model.initialView) && r.c(this.manipulator, model.manipulator) && r.c(this.lights, model.lights) && r.c(this.defaultFinishes, model.defaultFinishes);
        }
        return false;
    }

    public final List<String> getDefaultFinishes() {
        return this.defaultFinishes;
    }

    public final String getInitialView() {
        return this.initialView;
    }

    public final List<Light> getLights() {
        return this.lights;
    }

    public final Manipulator getManipulator() {
        return this.manipulator;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getNeedsCamera() {
        return this.needsCamera;
    }

    public final List<String> getNodes() {
        return this.nodes;
    }

    public final List<String> getPaths() {
        return this.paths;
    }

    public int hashCode() {
        int c13 = w.c(a.h(a.h(this.name.hashCode() * 31, 31, this.paths), 31, this.nodes), 31, this.needsCamera);
        String str = this.initialView;
        int hashCode = (c13 + (str == null ? 0 : str.hashCode())) * 31;
        Manipulator manipulator = this.manipulator;
        return this.defaultFinishes.hashCode() + a.h((hashCode + (manipulator != null ? manipulator.hashCode() : 0)) * 31, 31, this.lights);
    }

    public String toString() {
        String str = this.name;
        List<String> list = this.paths;
        List<String> list2 = this.nodes;
        boolean z13 = this.needsCamera;
        String str2 = this.initialView;
        Manipulator manipulator = this.manipulator;
        List<Light> list3 = this.lights;
        List<String> list4 = this.defaultFinishes;
        return "Model(name=" + str + ", paths=" + list + ", nodes=" + list2 + ", needsCamera=" + z13 + ", initialView=" + str2 + ", manipulator=" + manipulator + ", lights=" + list3 + ", defaultFinishes=" + list4 + ")";
    }

    public Model(String str, List<String> list, List<String> list2, boolean z13, String str2, Manipulator manipulator, List<Light> list3, List<String> list4) {
        str.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        this.name = str;
        this.paths = list;
        this.nodes = list2;
        this.needsCamera = z13;
        this.initialView = str2;
        this.manipulator = manipulator;
        this.lights = list3;
        this.defaultFinishes = list4;
    }
}
