package bk;

import android.content.Context;
import com.dyson.nst.dyson3d.schema.ModelLocation;
import com.dyson.nst.dyson3d.schema.SchemaSceneManager;
import com.dyson.nst.dyson3d.schema.model.Schema;
import com.google.android.filament.Engine;
import ig1.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n4.z;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lbk/f;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "a", "b", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class f {

    /* renamed from: b  reason: collision with root package name */
    public static final b f7881b = new b(null);

    /* renamed from: c  reason: collision with root package name */
    public static final ig1.b f7882c;

    /* renamed from: a  reason: collision with root package name */
    public final Context f7883a;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00060\u0001j\u0002`\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lbk/f$a;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "Lcom/google/android/filament/Engine;", "engine", "Lcom/dyson/nst/dyson3d/schema/SchemaSceneManager;", "sceneManager", "Ljg1/b;", "sceneWrapper", "<init>", "(Lcom/google/android/filament/Engine;Lcom/dyson/nst/dyson3d/schema/SchemaSceneManager;Ljg1/b;)V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a implements AutoCloseable {
        public final Engine d;
        public final SchemaSceneManager e;

        /* renamed from: f  reason: collision with root package name */
        public final jg1.b f7884f;

        public a(Engine engine, SchemaSceneManager schemaSceneManager, jg1.b bVar) {
            engine.getClass();
            schemaSceneManager.getClass();
            bVar.getClass();
            this.d = engine;
            this.e = schemaSceneManager;
            this.f7884f = bVar;
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            this.f7884f.c();
            jg1.a.a(this.d);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.d.equals(aVar.d) && this.e == aVar.e && this.f7884f == aVar.f7884f;
            }
            return false;
        }

        public final int hashCode() {
            int hashCode = this.e.hashCode();
            return this.f7884f.hashCode() + ((hashCode + (this.d.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "Audio3DEnvironmentEntity(engine=" + this.d + ", sceneManager=" + this.e + ", sceneWrapper=" + this.f7884f + ")";
        }
    }

    static {
        b.a aVar = new b.a(false, 0.0f, null, null, null, 31, null);
        z.f55660b.getClass();
        long j8 = z.f55666j;
        aVar.d = new yy1.c(z.i(j8), z.h(j8), z.f(j8), z.e(j8));
        aVar.f41661b = 60000.0f;
        aVar.f41662c = "environments/ibls_ibl.ktx";
        aVar.f41660a = false;
        f7882c = new ig1.b(aVar.f41660a, aVar.f41661b, aVar.f41662c, aVar.d, aVar.e, null);
    }

    public f(Context context) {
        context.getClass();
        this.f7883a = context;
    }

    public final a a(Schema schema) {
        long nBuilderBuild;
        int i13 = Engine.f18748f;
        nBuilderBuild = Engine.nBuilderBuild(new Engine.b().f18753b);
        if (nBuilderBuild == 0) {
            pa.c.w("Couldn't create Engine");
            return null;
        }
        Engine engine = new Engine(nBuilderBuild);
        jg1.b bVar = new jg1.b(engine, null, null, 6, null);
        int i14 = jg1.a.f45125a;
        Context context = this.f7883a;
        tg1.d dVar = new tg1.d(engine, context);
        pg1.c cVar = new pg1.c(engine, context);
        ModelLocation modelLocation = new ModelLocation("model/", false, 2, null);
        bVar.b(cVar.a(f7882c));
        SchemaSceneManager schemaSceneManager = new SchemaSceneManager(engine, dVar, schema, modelLocation, null, 16, null);
        schemaSceneManager.buildScene(bVar);
        return new a(engine, schemaSceneManager, bVar);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbk/f$b;", "", "<init>", "()V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }
}
