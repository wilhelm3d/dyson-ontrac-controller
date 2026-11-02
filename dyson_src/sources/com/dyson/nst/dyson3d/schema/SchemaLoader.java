package com.dyson.nst.dyson3d.schema;

import android.content.Context;
import com.brightcove.player.C;
import com.brightcove.player.captioning.TTMLParser;
import com.dyson.nst.dyson3d.schema.model.Schema;
import com.dyson.nst.dyson3d.schema.model.Texture;
import com.dyson.nst.dyson3d.schema.parsing.AnimationDefinitionAdaptor;
import com.dyson.nst.dyson3d.schema.parsing.CameraManipulatorAdaptor;
import com.dyson.nst.dyson3d.schema.parsing.CapabilityAdaptor;
import com.dyson.nst.dyson3d.schema.parsing.DecodableAnimationCurveAdaptor;
import com.dyson.nst.dyson3d.schema.parsing.MaterialPropertyTypeAdaptor;
import com.dyson.nst.dyson3d.schema.parsing.PropertyAnimationDefinitionAdaptor;
import com.dyson.nst.dyson3d.schema.parsing.TransformComponentAdaptor;
import com.dyson.nst.dyson3d.schema.parsing.ViewTypeAdaptor;
import e22.q;
import e22.x;
import i22.n;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oy1.f0;
import oy1.r;
import qy1.a;
import qy1.b;
import qy1.c;
import x12.p0;
import x12.q0;
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\t¨\u0006\u000b"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/SchemaLoader;", "", "()V", "parse", "Lcom/dyson/nst/dyson3d/schema/model/Schema;", "string", "", "filename", "context", "Landroid/content/Context;", "Companion", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SchemaLoader {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private static f0 initializedMoshi;

    public final Schema parse(String str) {
        str.getClass();
        f0 provideMoshi = Companion.provideMoshi();
        q0 q0Var = p0.f86717a;
        q m13 = q0Var.m(q0Var.b(Schema.class), Collections.EMPTY_LIST, false);
        provideMoshi.getClass();
        m13.getClass();
        r c13 = provideMoshi.c(x.d(m13), c.f68087a, null);
        if (!(c13 instanceof b) && !(c13 instanceof a)) {
            if (m13.c()) {
                c13 = c13.nullSafe();
                c13.getClass();
            } else {
                c13 = c13.nonNull();
                c13.getClass();
            }
        }
        return (Schema) c13.fromJson(str);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/dyson/nst/dyson3d/schema/SchemaLoader$Companion;", "", "<init>", "()V", "Loy1/f0;", "provideMoshi", "()Loy1/f0;", "initializedMoshi", "Loy1/f0;", "Dyson3D_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final f0 provideMoshi() {
            if (SchemaLoader.initializedMoshi == null) {
                f0.a aVar = new f0.a();
                aVar.b(new CapabilityAdaptor());
                aVar.b(new ViewTypeAdaptor());
                aVar.b(new CameraManipulatorAdaptor());
                aVar.b(new MaterialPropertyTypeAdaptor());
                aVar.b(new TransformComponentAdaptor());
                aVar.b(new AnimationDefinitionAdaptor());
                aVar.b(new PropertyAnimationDefinitionAdaptor());
                aVar.b(new DecodableAnimationCurveAdaptor());
                List list = Collections.EMPTY_LIST;
                aVar.c(new py1.b(Texture.class, com.salesforce.marketingcloud.messages.inbox.b.f21448j, list, list, null).b(Texture.Image.class, "image").b(Texture.Color.class, TTMLParser.Attributes.COLOR));
                aVar.f61957a.add(new ry1.b());
                SchemaLoader.initializedMoshi = new f0(aVar);
            }
            f0 f0Var = SchemaLoader.initializedMoshi;
            if (f0Var != null) {
                return f0Var;
            }
            x12.r.i("initializedMoshi");
            throw null;
        }

        private Companion() {
        }
    }

    public final Schema parse(String str, Context context) {
        str.getClass();
        context.getClass();
        InputStream open = context.getAssets().open(str);
        open.getClass();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open, v32.c.f83073b), C.DASH_ROLE_ALTERNATE_FLAG);
        try {
            String I = n.I(bufferedReader);
            bufferedReader.close();
            return parse(I);
        } finally {
        }
    }
}
