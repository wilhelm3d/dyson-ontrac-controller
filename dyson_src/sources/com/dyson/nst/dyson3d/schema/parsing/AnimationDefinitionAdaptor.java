package com.dyson.nst.dyson3d.schema.parsing;

import com.dyson.nst.dyson3d.schema.SchemaLoader;
import com.dyson.nst.dyson3d.schema.model.AnimationDefinition;
import com.salesforce.marketingcloud.messages.inbox.b;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Metadata;
import oy1.f0;
import oy1.i0;
import oy1.p;
import oy1.r;
import oy1.u;
import pa.c;
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/parsing/AnimationDefinitionAdaptor;", "", "<init>", "()V", "Loy1/u;", "reader", "Lcom/dyson/nst/dyson3d/schema/model/AnimationDefinition;", "fromJson", "(Loy1/u;)Lcom/dyson/nst/dyson3d/schema/model/AnimationDefinition;", b.f21448j, "", "toJson", "(Lcom/dyson/nst/dyson3d/schema/model/AnimationDefinition;)Ljava/lang/String;", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AnimationDefinitionAdaptor {
    public static final int $stable = 0;

    @p
    public final AnimationDefinition fromJson(u uVar) {
        uVar.getClass();
        Object Y = uVar.M().Y();
        Y.getClass();
        Object obj = ((Map) Y).get(b.f21448j);
        obj.getClass();
        String str = (String) obj;
        f0 provideMoshi = SchemaLoader.Companion.provideMoshi();
        if (str.equals("sequence")) {
            r<?> a13 = new ry1.b().a(AnimationDefinition.Sequence.class, new LinkedHashSet(), provideMoshi);
            if (a13 == null) {
                c.w("Required value was null.");
                return null;
            }
            Object fromJson = a13.fromJson(uVar);
            if (fromJson instanceof AnimationDefinition.Sequence) {
                return (AnimationDefinition.Sequence) fromJson;
            }
            c.w("Check failed.");
            return null;
        } else if (str.equals("concurrent")) {
            r<?> a14 = new ry1.b().a(AnimationDefinition.Concurrent.class, new LinkedHashSet(), provideMoshi);
            if (a14 == null) {
                c.w("Required value was null.");
                return null;
            }
            Object fromJson2 = a14.fromJson(uVar);
            if (fromJson2 instanceof AnimationDefinition.Concurrent) {
                return (AnimationDefinition.Concurrent) fromJson2;
            }
            c.w("Check failed.");
            return null;
        } else if (!str.equals("named")) {
            if (str.equals("property")) {
                return new PropertyAnimationDefinitionAdaptor().fromJson(uVar);
            }
            c.w("Unknown type for animation in schema");
            return null;
        } else {
            r<?> a15 = new ry1.b().a(AnimationDefinition.Named.class, new LinkedHashSet(), provideMoshi);
            if (a15 == null) {
                c.w("Required value was null.");
                return null;
            }
            Object fromJson3 = a15.fromJson(uVar);
            if (fromJson3 instanceof AnimationDefinition.Named) {
                return (AnimationDefinition.Named) fromJson3;
            }
            c.w("Check failed.");
            return null;
        }
    }

    @i0
    public final String toJson(AnimationDefinition animationDefinition) {
        animationDefinition.getClass();
        return "";
    }
}
