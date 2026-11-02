package bk;

import android.graphics.Bitmap;
import bk.f;
import com.dyson.mobile.android.logging.Logger;
import com.dyson.nst.dyson3d.schema.SceneProductViewCoordinator;
import com.dyson.nst.dyson3d.schema.SchemaSceneManager;
import com.dyson.nst.dyson3d.schema.model.Schema;
import com.dyson.nst.dyson3d.schema.model.View;
import com.google.android.filament.View;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.bouncycastle.asn1.x509.DisplayText;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lbk/s;", "", "Lbk/f;", "audio3dEnvironment", "<init>", "(Lbk/f;)V", "a", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class s {

    /* renamed from: a  reason: collision with root package name */
    public final f f7919a;

    static {
        new a(null);
    }

    public s(f fVar) {
        fVar.getClass();
        this.f7919a = fVar;
    }

    public static void a(SchemaSceneManager schemaSceneManager, String str) {
        if (str == null || !schemaSceneManager.getSchema().getFinishes().getFinishes().containsKey(str)) {
            return;
        }
        schemaSceneManager.getFinishCoordinator().apply(str);
    }

    public static void b(SchemaSceneManager schemaSceneManager, k kVar, gl.x xVar) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        bk.a d;
        bk.a a13;
        bk.a d13;
        bk.a a14;
        j c13 = xVar.c();
        String str = null;
        a(schemaSceneManager, c13 != null ? c13.getFinishId() : null);
        Iterator<T> it = kVar.b().b().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            String c14 = ((b) obj).c();
            h12.p<String, String> d14 = xVar.d();
            if (x12.r.c(c14, d14 != null ? d14.d : null)) {
                break;
            }
        }
        b bVar = (b) obj;
        a(schemaSceneManager, (bVar == null || (a14 = bVar.a()) == null) ? null : a14.b());
        Iterator<T> it2 = kVar.b().b().iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            String c15 = ((b) obj2).c();
            h12.p<String, String> d15 = xVar.d();
            if (x12.r.c(c15, d15 != null ? d15.e : null)) {
                break;
            }
        }
        b bVar2 = (b) obj2;
        a(schemaSceneManager, (bVar2 == null || (d13 = bVar2.d()) == null) ? null : d13.b());
        Iterator<T> it3 = kVar.a().b().iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj3 = null;
                break;
            }
            obj3 = it3.next();
            String c16 = ((b) obj3).c();
            h12.p<String, String> b13 = xVar.b();
            if (x12.r.c(c16, b13 != null ? b13.d : null)) {
                break;
            }
        }
        b bVar3 = (b) obj3;
        a(schemaSceneManager, (bVar3 == null || (a13 = bVar3.a()) == null) ? null : a13.b());
        Iterator<T> it4 = kVar.a().b().iterator();
        while (true) {
            if (!it4.hasNext()) {
                obj4 = null;
                break;
            }
            obj4 = it4.next();
            String c17 = ((b) obj4).c();
            h12.p<String, String> b14 = xVar.b();
            if (x12.r.c(c17, b14 != null ? b14.e : null)) {
                break;
            }
        }
        b bVar4 = (b) obj4;
        if (bVar4 != null && (d = bVar4.d()) != null) {
            str = d.b();
        }
        a(schemaSceneManager, str);
    }

    public final Bitmap c(Schema schema, k kVar, gl.x xVar) {
        try {
            f.a a13 = this.f7919a.a(schema);
            Logger.a("Built 3D scene");
            SchemaSceneManager schemaSceneManager = a13.e;
            b(schemaSceneManager, kVar, xVar);
            Logger.a("Applied finishes");
            View view = schema.getViews().get("angled");
            if (view != null) {
                SceneProductViewCoordinator productViewCoordinator = schemaSceneManager.getProductViewCoordinator();
                w32.b.e.getClass();
                productViewCoordinator.m10replaceViewHG0u8IE(view, 0L);
                xg1.a aVar = new xg1.a(1200, 1200, a13.f7884f, View.d.TRANSLUCENT);
                Logger.a("Created offscreen renderer");
                try {
                    tg1.e mainModel = schemaSceneManager.getMainModel();
                    if (mainModel != null) {
                        mainModel.d(0.0d);
                    }
                    Bitmap createBitmap = Bitmap.createBitmap(aVar.b(), (int) DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, (int) DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, 900, 900);
                    aVar.a();
                    createBitmap.getClass();
                    Logger.a("Finished image generation");
                    u12.a.e(a13, null);
                    return createBitmap;
                } catch (Throwable th2) {
                    aVar.a();
                    throw th2;
                }
            }
            throw new IllegalStateException("Model schema doesn't contain required view: angled");
        } catch (Exception e) {
            if (e instanceof CancellationException) {
                throw e;
            }
            Logger.b("Customisation image generation failed", e);
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lbk/s$a;", "", "<init>", "()V", "", "IMAGE_MODEL_VIEW", "Ljava/lang/String;", "", "FULL_IMAGE_SIZE_PX", "I", "CROP_OFFSET", "CROPPED_IMAGE_SIZE_PX", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
