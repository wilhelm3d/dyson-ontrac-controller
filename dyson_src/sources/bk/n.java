package bk;

import android.graphics.Bitmap;
import android.os.Build;
import c42.u1;
import c42.w1;
import com.dyson.mobile.android.logging.Logger;
import com.dyson.mobile.android.machinetype.MachineSerial;
import com.dyson.nst.dyson3d.schema.SchemaLoader;
import com.dyson.nst.dyson3d.schema.model.Schema;
import com.paypal.android.platform.authsdk.BR;
import h12.f0;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import z32.c0;
import z32.g0;
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0014\u0015BI\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lbk/n;", "Lbk/l;", "", "storageDirectoryPath", "Lz32/c0;", "coroutineScope", "Lcom/dyson/mobile/android/machinetype/MachineSerial;", "machineSerial", "Lbk/d;", "assetTextReader", "Lcom/dyson/nst/dyson3d/schema/SchemaLoader;", "schemaLoader", "Lvj/h;", "audioMachineDataStore", "Lbk/s;", "generateCustomisationImageUseCase", "Lbk/r;", "filamentContext", "<init>", "(Ljava/lang/String;Lz32/c0;Lcom/dyson/mobile/android/machinetype/MachineSerial;Lbk/d;Lcom/dyson/nst/dyson3d/schema/SchemaLoader;Lvj/h;Lbk/s;Lbk/r;)V", "c", "b", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class n implements l {

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ int f7893n = 0;

    /* renamed from: a  reason: collision with root package name */
    public final c0 f7894a;

    /* renamed from: b  reason: collision with root package name */
    public final MachineSerial f7895b;

    /* renamed from: c  reason: collision with root package name */
    public final bk.d f7896c;
    public final SchemaLoader d;
    public final vj.h e;

    /* renamed from: f  reason: collision with root package name */
    public final s f7897f;

    /* renamed from: g  reason: collision with root package name */
    public final r f7898g;

    /* renamed from: h  reason: collision with root package name */
    public final String f7899h;

    /* renamed from: i  reason: collision with root package name */
    public k f7900i;

    /* renamed from: j  reason: collision with root package name */
    public c f7901j;

    /* renamed from: k  reason: collision with root package name */
    public final j42.c f7902k;

    /* renamed from: l  reason: collision with root package name */
    public final u1 f7903l;

    /* renamed from: m  reason: collision with root package name */
    public final u1 f7904m;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.audio.customisation.DefaultCustomisationRepository$1", f = "DefaultCustomisationRepository.kt", l = {BR.isDecreaseSensitivityVisible, BR.isHelpClickable, 56}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class a extends n12.i implements Function2<c0, l12.d<? super f0>, Object> {
        public int d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
        @n12.e(c = "com.dyson.mobile.android.audio.customisation.DefaultCustomisationRepository$1$1", f = "DefaultCustomisationRepository.kt", l = {57}, m = "invokeSuspend", v = 2)
        /* renamed from: bk.n$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0232a extends n12.i implements Function2<c0, l12.d<? super f0>, Object> {
            public int d;
            public final /* synthetic */ n e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0232a(n nVar, l12.d<? super C0232a> dVar) {
                super(2, dVar);
                this.e = nVar;
            }

            @Override // n12.a
            public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
                return new C0232a(this.e, dVar);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
                return ((C0232a) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
            }

            @Override // n12.a
            public final Object invokeSuspend(Object obj) {
                m12.a aVar = m12.a.COROUTINE_SUSPENDED;
                int i13 = this.d;
                if (i13 == 0) {
                    h12.r.b(obj);
                    this.d = 1;
                    if (this.e.f(this) == aVar) {
                        return aVar;
                    }
                } else if (i13 != 1) {
                    pa.c.w("call to 'resume' before 'invoke' with coroutine");
                    return null;
                } else {
                    h12.r.b(obj);
                }
                return f0.f36844a;
            }
        }

        public a(l12.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            return new a(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
            return ((a) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
            if (r8.a(r7) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
            if (r8.emit(r2, r7) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x007a, code lost:
            if (z32.g0.v(r8, r1, r7) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x007c, code lost:
            return r0;
         */
        @Override // n12.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                m12.a r0 = m12.a.COROUTINE_SUSPENDED
                int r1 = r7.d
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                bk.n r6 = bk.n.this
                if (r1 == 0) goto L21
                if (r1 == r5) goto L1d
                if (r1 == r4) goto L19
                if (r1 != r3) goto L13
                goto L19
            L13:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                pa.c.w(r7)
                return r2
            L19:
                h12.r.b(r8)
                goto L7d
            L1d:
                h12.r.b(r8)
                goto L2f
            L21:
                h12.r.b(r8)
                bk.r r8 = r6.f7898g
                r7.d = r5
                java.lang.Object r8 = r8.a(r7)
                if (r8 != r0) goto L2f
                goto L7c
            L2f:
                java.io.File r8 = new java.io.File
                java.lang.String r1 = r6.f7899h
                r8.<init>(r1)
                boolean r8 = r8.exists()
                if (r8 == 0) goto L69
                c42.u1 r8 = r6.f7903l
                java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> L5a
                java.lang.String r3 = r6.f7899h     // Catch: java.lang.Exception -> L5a
                r1.<init>(r3)     // Catch: java.lang.Exception -> L5a
                boolean r3 = r1.exists()     // Catch: java.lang.Exception -> L5a
                if (r3 == 0) goto L60
                boolean r3 = r1.canRead()     // Catch: java.lang.Exception -> L5a
                if (r3 == 0) goto L60
                java.lang.String r1 = r1.getAbsolutePath()     // Catch: java.lang.Exception -> L5a
                android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeFile(r1)     // Catch: java.lang.Exception -> L5a
                goto L60
            L5a:
                r1 = move-exception
                java.lang.String r3 = "Customisation image cannot be retrieved"
                com.dyson.mobile.android.logging.Logger.b(r3, r1)
            L60:
                r7.d = r4
                java.lang.Object r7 = r8.emit(r2, r7)
                if (r7 != r0) goto L7d
                goto L7c
            L69:
                bk.r r8 = r6.f7898g
                z32.y r8 = r8.b()
                bk.n$a$a r1 = new bk.n$a$a
                r1.<init>(r6, r2)
                r7.d = r3
                java.lang.Object r7 = z32.g0.v(r8, r1, r7)
                if (r7 != r0) goto L7d
            L7c:
                return r0
            L7d:
                h12.f0 r7 = h12.f0.f36844a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: bk.n.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* loaded from: classes2.dex */
    public interface c {

        /* renamed from: a  reason: collision with root package name */
        public static final a f7905a = a.f7906a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbk/n$c$a;", "", "<init>", "()V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ a f7906a = new a();

            private a() {
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lbk/n$c$b;", "Lbk/n$c;", "Lcom/dyson/nst/dyson3d/schema/model/Schema;", "schema", "<init>", "(Lcom/dyson/nst/dyson3d/schema/model/Schema;)V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final class b implements c {

            /* renamed from: b  reason: collision with root package name */
            public final Schema f7907b;

            public b(Schema schema) {
                schema.getClass();
                this.f7907b = schema;
            }

            @Override // bk.n.c
            public final Schema a() {
                return this.f7907b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.f7907b.equals(((b) obj).f7907b);
            }

            public final int hashCode() {
                return this.f7907b.hashCode();
            }

            public final String toString() {
                return "Loaded(schema=" + this.f7907b + ")";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lbk/n$c$c;", "Lbk/n$c;", "<init>", "()V", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: bk.n$c$c  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0233c implements c {

            /* renamed from: b  reason: collision with root package name */
            public static final C0233c f7908b = new C0233c();

            private C0233c() {
            }

            @Override // bk.n.c
            public final /* bridge */ /* synthetic */ Schema a() {
                return null;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C0233c);
            }

            public final int hashCode() {
                return -1748558931;
            }

            public final String toString() {
                return "NotAvailable";
            }
        }

        Schema a();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.audio.customisation.DefaultCustomisationRepository$clearCustomisation$1", f = "DefaultCustomisationRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* loaded from: classes2.dex */
    public static final class d extends n12.i implements Function2<c0, l12.d<? super f0>, Object> {
        public d(l12.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            return new d(dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
            return ((d) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            h12.r.b(obj);
            n nVar = n.this;
            vj.h hVar = nVar.e;
            hVar.f84328a.putString("user_customisation", hVar.f84329b.toJson(new gl.x(null, null, null, false, 15, null)));
            try {
                Files.deleteIfExists(Paths.get(nVar.f7899h, new String[0]));
            } catch (Exception e) {
                Logger.b("Customisation image was not deleted", e);
            }
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @n12.e(c = "com.dyson.mobile.android.audio.customisation.DefaultCustomisationRepository", f = "DefaultCustomisationRepository.kt", l = {109, com.salesforce.marketingcloud.analytics.stats.b.f20726n, 121}, m = "generateCustomisationImage", v = 2)
    /* loaded from: classes2.dex */
    public static final class e extends n12.c {
        public c d;
        public /* synthetic */ Object e;

        /* renamed from: g  reason: collision with root package name */
        public int f7910g;

        public e(l12.d<? super e> dVar) {
            super(dVar);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            this.e = obj;
            this.f7910g |= Integer.MIN_VALUE;
            return n.this.f(this);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @n12.e(c = "com.dyson.mobile.android.audio.customisation.DefaultCustomisationRepository", f = "DefaultCustomisationRepository.kt", l = {BR.timeRangeTooltip}, m = "getCustomisationOptions", v = 2)
    /* loaded from: classes2.dex */
    public static final class f extends n12.c {
        public /* synthetic */ Object d;

        /* renamed from: f  reason: collision with root package name */
        public int f7911f;

        public f(l12.d<? super f> dVar) {
            super(dVar);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f7911f |= Integer.MIN_VALUE;
            return n.this.d(this);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @n12.e(c = "com.dyson.mobile.android.audio.customisation.DefaultCustomisationRepository", f = "DefaultCustomisationRepository.kt", l = {BR.passwordErrorVisibility}, m = "getModelSchema", v = 2)
    /* loaded from: classes2.dex */
    public static final class g extends n12.c {
        public /* synthetic */ Object d;

        /* renamed from: f  reason: collision with root package name */
        public int f7912f;

        public g(l12.d<? super g> dVar) {
            super(dVar);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            this.d = obj;
            this.f7912f |= Integer.MIN_VALUE;
            return n.this.c(this);
        }
    }

    static {
        new b(null);
    }

    public n(String str, c0 c0Var, MachineSerial machineSerial, bk.d dVar, SchemaLoader schemaLoader, vj.h hVar, s sVar, r rVar) {
        str.getClass();
        c0Var.getClass();
        machineSerial.getClass();
        dVar.getClass();
        schemaLoader.getClass();
        hVar.getClass();
        sVar.getClass();
        rVar.getClass();
        this.f7894a = c0Var;
        this.f7895b = machineSerial;
        this.f7896c = dVar;
        this.d = schemaLoader;
        this.e = hVar;
        this.f7897f = sVar;
        this.f7898g = rVar;
        this.f7899h = ma.e.j(str, "/571h_3d_custom_image_", machineSerial.d, ".webp");
        this.f7902k = j42.d.a();
        u1 b13 = w1.b(1, 0, null, 6);
        this.f7903l = b13;
        this.f7904m = b13;
        g0.r(c0Var, null, null, new a(null), 3);
    }

    @Override // bk.l
    public final void a(gl.x xVar) {
        xVar.getClass();
        vj.h hVar = this.e;
        hVar.f84328a.putString("user_customisation", hVar.f84329b.toJson(xVar));
    }

    @Override // bk.l
    public final c42.i<Bitmap> b() {
        return this.f7904m;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    @Override // bk.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(l12.d<? super com.dyson.nst.dyson3d.schema.model.Schema> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof bk.n.g
            if (r0 == 0) goto L13
            r0 = r5
            bk.n$g r0 = (bk.n.g) r0
            int r1 = r0.f7912f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7912f = r1
            goto L18
        L13:
            bk.n$g r0 = new bk.n$g
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.d
            m12.a r1 = m12.a.COROUTINE_SUSPENDED
            int r2 = r0.f7912f
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            h12.r.b(r5)
            goto L3a
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            pa.c.w(r4)
            r4 = 0
            return r4
        L2e:
            h12.r.b(r5)
            r0.f7912f = r3
            java.lang.Object r5 = r4.i(r0)
            if (r5 != r1) goto L3a
            return r1
        L3a:
            bk.n$c r5 = (bk.n.c) r5
            com.dyson.nst.dyson3d.schema.model.Schema r4 = r5.a()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: bk.n.c(l12.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    @Override // bk.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(l12.d<? super bk.k> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof bk.n.f
            if (r0 == 0) goto L13
            r0 = r7
            bk.n$f r0 = (bk.n.f) r0
            int r1 = r0.f7911f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7911f = r1
            goto L18
        L13:
            bk.n$f r0 = new bk.n$f
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.d
            m12.a r1 = m12.a.COROUTINE_SUSPENDED
            int r2 = r0.f7911f
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L2a
            h12.r.b(r7)     // Catch: java.lang.Exception -> L28
            goto L4b
        L28:
            r6 = move-exception
            goto L5d
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            pa.c.w(r6)
            return r3
        L30:
            h12.r.b(r7)
            java.lang.String r7 = "model/n571h-customisation.json"
            bk.d r2 = r6.f7896c     // Catch: java.lang.Exception -> L28
            r0.f7911f = r4     // Catch: java.lang.Exception -> L28
            af1.i r4 = r2.f7878b     // Catch: java.lang.Exception -> L28
            h42.b r4 = r4.c()     // Catch: java.lang.Exception -> L28
            bk.c r5 = new bk.c     // Catch: java.lang.Exception -> L28
            r5.<init>(r2, r7, r3)     // Catch: java.lang.Exception -> L28
            java.lang.Object r7 = z32.g0.v(r4, r5, r0)     // Catch: java.lang.Exception -> L28
            if (r7 != r1) goto L4b
            return r1
        L4b:
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L28
            com.google.gson.Gson r0 = new com.google.gson.Gson     // Catch: java.lang.Exception -> L28
            r0.<init>()     // Catch: java.lang.Exception -> L28
            java.lang.Class<bk.k> r1 = bk.k.class
            java.lang.Object r7 = r0.fromJson(r7, r1)     // Catch: java.lang.Exception -> L28
            bk.k r7 = (bk.k) r7     // Catch: java.lang.Exception -> L28
            r6.f7900i = r7     // Catch: java.lang.Exception -> L28
            return r7
        L5d:
            boolean r7 = r6 instanceof java.util.concurrent.CancellationException
            if (r7 != 0) goto L67
            java.lang.String r7 = "Error loading customisation options"
            com.dyson.mobile.android.logging.Logger.b(r7, r6)
            return r3
        L67:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: bk.n.d(l12.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    @Override // bk.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(n12.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof bk.p
            if (r0 == 0) goto L13
            r0 = r5
            bk.p r0 = (bk.p) r0
            int r1 = r0.f7917f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7917f = r1
            goto L18
        L13:
            bk.p r0 = new bk.p
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.d
            m12.a r1 = m12.a.COROUTINE_SUSPENDED
            int r2 = r0.f7917f
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            h12.r.b(r5)
            goto L3a
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            pa.c.w(r4)
            r4 = 0
            return r4
        L2e:
            h12.r.b(r5)
            r0.f7917f = r3
            java.lang.Object r5 = r4.i(r0)
            if (r5 != r1) goto L3a
            return r1
        L3a:
            boolean r4 = r5 instanceof bk.n.c.b
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: bk.n.e(n12.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(10:5|6|7|(1:(1:(1:(4:12|13|14|15)(2:18|19))(4:20|21|22|(2:30|31)(5:25|(1:27)|13|14|15)))(1:32))(1:37)|33|(1:35)|22|(0)|30|31))|44|6|7|(0)(0)|33|(0)|22|(0)|30|31) */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004c, code lost:
        if (r8 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
        if (r8 == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0087, code lost:
        if (r7.emit(r8, r0) == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0089, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008a, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008d, code lost:
        if ((r7 instanceof java.util.concurrent.CancellationException) == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008f, code lost:
        com.dyson.mobile.android.logging.Logger.b("Customisation image saving failed", r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0097, code lost:
        throw r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0067 A[ADDED_TO_REGION] */
    @Override // bk.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(l12.d<? super h12.f0> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof bk.n.e
            if (r0 == 0) goto L13
            r0 = r8
            bk.n$e r0 = (bk.n.e) r0
            int r1 = r0.f7910g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7910g = r1
            goto L18
        L13:
            bk.n$e r0 = new bk.n$e
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.e
            m12.a r1 = m12.a.COROUTINE_SUSPENDED
            int r2 = r0.f7910g
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L3e
            if (r2 == r5) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2e
            h12.r.b(r8)     // Catch: java.lang.Exception -> L8a
            goto L94
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            pa.c.w(r7)
            return r6
        L34:
            bk.n$c r2 = r0.d
            h12.r.b(r8)
            goto L61
        L3a:
            h12.r.b(r8)
            goto L4f
        L3e:
            h12.r.b(r8)
            java.lang.String r8 = "Generate customisation image"
            com.dyson.mobile.android.logging.Logger.c(r8)
            r0.f7910g = r5
            java.lang.Object r8 = r7.i(r0)
            if (r8 != r1) goto L4f
            goto L89
        L4f:
            r2 = r8
            bk.n$c r2 = (bk.n.c) r2
            bk.k r8 = r7.f7900i
            if (r8 != 0) goto L63
            r0.d = r2
            r0.f7910g = r4
            java.lang.Object r8 = r7.d(r0)
            if (r8 != r1) goto L61
            goto L89
        L61:
            bk.k r8 = (bk.k) r8
        L63:
            boolean r4 = r2 instanceof bk.n.c.b
            if (r4 == 0) goto L98
            if (r8 != 0) goto L6a
            goto L98
        L6a:
            bk.s r4 = r7.f7897f     // Catch: java.lang.Exception -> L8a
            bk.n$c$b r2 = (bk.n.c.b) r2     // Catch: java.lang.Exception -> L8a
            com.dyson.nst.dyson3d.schema.model.Schema r2 = r2.f7907b     // Catch: java.lang.Exception -> L8a
            gl.x r5 = r7.g()     // Catch: java.lang.Exception -> L8a
            android.graphics.Bitmap r8 = r4.c(r2, r8, r5)     // Catch: java.lang.Exception -> L8a
            if (r8 == 0) goto L94
            r7.k(r8)     // Catch: java.lang.Exception -> L8a
            c42.u1 r7 = r7.f7903l     // Catch: java.lang.Exception -> L8a
            r0.d = r6     // Catch: java.lang.Exception -> L8a
            r0.f7910g = r3     // Catch: java.lang.Exception -> L8a
            java.lang.Object r7 = r7.emit(r8, r0)     // Catch: java.lang.Exception -> L8a
            if (r7 != r1) goto L94
        L89:
            return r1
        L8a:
            r7 = move-exception
            boolean r8 = r7 instanceof java.util.concurrent.CancellationException
            if (r8 != 0) goto L97
            java.lang.String r8 = "Customisation image saving failed"
            com.dyson.mobile.android.logging.Logger.b(r8, r7)
        L94:
            h12.f0 r7 = h12.f0.f36844a
            return r7
        L97:
            throw r7
        L98:
            h12.f0 r7 = h12.f0.f36844a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: bk.n.f(l12.d):java.lang.Object");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
        r1 = bk.j.CNC_BLACK_NICKEL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
        if (r1.equals("6KK") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
        if (r1.equals("6FH") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
        if (r1.equals("2MN") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
        r1 = bk.j.CERAMIC_CINNABAR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004d, code lost:
        if (r1.equals("2MK") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
        r1 = bk.j.CNC_ALUMINIUM;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0082, code lost:
        if (r8 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (r1.equals("8MG") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
        if (r1.equals("8MF") == false) goto L29;
     */
    @Override // bk.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final gl.x g() {
        /*
            r8 = this;
            gl.x r0 = new gl.x
            com.dyson.mobile.android.machinetype.MachineSerial r1 = r8.f7895b
            java.lang.String r1 = r1.d
            r2 = 0
            r3 = 3
            java.lang.String r1 = r1.substring(r2, r3)
            int r2 = r1.hashCode()
            switch(r2) {
                case 50512: goto L47;
                case 50515: goto L3b;
                case 54136: goto L32;
                case 54294: goto L29;
                case 56273: goto L1d;
                case 56274: goto L14;
                default: goto L13;
            }
        L13:
            goto L4f
        L14:
            java.lang.String r2 = "8MG"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L26
            goto L4f
        L1d:
            java.lang.String r2 = "8MF"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L26
            goto L4f
        L26:
            bk.j r1 = bk.j.CNC_BLACK_NICKEL
            goto L54
        L29:
            java.lang.String r2 = "6KK"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L44
            goto L4f
        L32:
            java.lang.String r2 = "6FH"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L52
            goto L4f
        L3b:
            java.lang.String r2 = "2MN"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L44
            goto L4f
        L44:
            bk.j r1 = bk.j.CERAMIC_CINNABAR
            goto L54
        L47:
            java.lang.String r2 = "2MK"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L52
        L4f:
            bk.j r1 = bk.j.CNC_COPPER
            goto L54
        L52:
            bk.j r1 = bk.j.CNC_ALUMINIUM
        L54:
            r5 = 14
            r6 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            vj.h r8 = r8.e
            y70.a r1 = r8.f84328a
            java.lang.String r2 = "user_customisation"
            java.lang.String r1 = r1.getString(r2)
            if (r1 == 0) goto L84
            com.google.gson.Gson r8 = r8.f84329b     // Catch: com.google.gson.JsonSyntaxException -> L75
            java.lang.Class<gl.x> r2 = gl.x.class
            java.lang.Object r8 = r8.fromJson(r1, r2)     // Catch: com.google.gson.JsonSyntaxException -> L75
            gl.x r8 = (gl.x) r8     // Catch: com.google.gson.JsonSyntaxException -> L75
            goto L82
        L75:
            gl.x r1 = new gl.x
            r6 = 15
            r7 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8 = r1
        L82:
            if (r8 != 0) goto L91
        L84:
            gl.x r1 = new gl.x
            r6 = 15
            r7 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r8 = r1
        L91:
            gl.x r8 = r0.f(r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: bk.n.g():gl.x");
    }

    @Override // bk.l
    public final void h() {
        g0.r(this.f7894a, null, null, new d(null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
        if (r7.a(r0) == r1) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0057 A[Catch: all -> 0x0081, TRY_LEAVE, TryCatch #0 {all -> 0x0081, blocks: (B:23:0x0053, B:25:0x0057), top: B:41:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073 A[Catch: all -> 0x002f, TryCatch #1 {all -> 0x002f, blocks: (B:13:0x002b, B:29:0x006c, B:31:0x0073, B:33:0x007d, B:32:0x007a), top: B:43:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007a A[Catch: all -> 0x002f, TryCatch #1 {all -> 0x002f, blocks: (B:13:0x002b, B:29:0x006c, B:31:0x0073, B:33:0x007d, B:32:0x007a), top: B:43:0x002b }] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v6, types: [j42.a] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [j42.a] */
    /* JADX WARN: Type inference failed for: r4v8, types: [j42.a] */
    /* JADX WARN: Type inference failed for: r6v0, types: [bk.n] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(n12.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof bk.o
            if (r0 == 0) goto L13
            r0 = r7
            bk.o r0 = (bk.o) r0
            int r1 = r0.f7916i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7916i = r1
            goto L18
        L13:
            bk.o r0 = new bk.o
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f7914g
            m12.a r1 = m12.a.COROUTINE_SUSPENDED
            int r2 = r0.f7916i
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L40
            if (r2 == r4) goto L37
            if (r2 != r3) goto L31
            bk.n$c$a r1 = r0.e
            j42.a r0 = r0.d
            h12.r.b(r7)     // Catch: java.lang.Throwable -> L2f
            goto L6c
        L2f:
            r6 = move-exception
            goto L88
        L31:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            pa.c.w(r6)
            return r5
        L37:
            int r2 = r0.f7913f
            j42.a r4 = r0.d
            h12.r.b(r7)
            r7 = r4
            goto L53
        L40:
            h12.r.b(r7)
            j42.c r7 = r6.f7902k
            r0.d = r7
            r2 = 0
            r0.f7913f = r2
            r0.f7916i = r4
            java.lang.Object r4 = r7.a(r0)
            if (r4 != r1) goto L53
            goto L67
        L53:
            bk.n$c r4 = r6.f7901j     // Catch: java.lang.Throwable -> L81
            if (r4 != 0) goto L84
            bk.n$c$a r4 = bk.n.c.f7905a     // Catch: java.lang.Throwable -> L81
            r0.d = r7     // Catch: java.lang.Throwable -> L81
            r0.e = r4     // Catch: java.lang.Throwable -> L81
            r0.f7913f = r2     // Catch: java.lang.Throwable -> L81
            r0.f7916i = r3     // Catch: java.lang.Throwable -> L81
            java.lang.Object r0 = r6.j(r0)     // Catch: java.lang.Throwable -> L81
            if (r0 != r1) goto L68
        L67:
            return r1
        L68:
            r1 = r0
            r0 = r7
            r7 = r1
            r1 = r4
        L6c:
            com.dyson.nst.dyson3d.schema.model.Schema r7 = (com.dyson.nst.dyson3d.schema.model.Schema) r7     // Catch: java.lang.Throwable -> L2f
            r1.getClass()     // Catch: java.lang.Throwable -> L2f
            if (r7 == 0) goto L7a
            bk.n$c$b r1 = new bk.n$c$b     // Catch: java.lang.Throwable -> L2f
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L2f
            r4 = r1
            goto L7d
        L7a:
            bk.n$c$c r7 = bk.n.c.C0233c.f7908b     // Catch: java.lang.Throwable -> L2f
            r4 = r7
        L7d:
            r6.f7901j = r4     // Catch: java.lang.Throwable -> L2f
            r7 = r0
            goto L84
        L81:
            r6 = move-exception
            r0 = r7
            goto L88
        L84:
            r7.c(r5)
            return r4
        L88:
            r0.c(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: bk.n.i(n12.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(n12.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof bk.q
            if (r0 == 0) goto L13
            r0 = r7
            bk.q r0 = (bk.q) r0
            int r1 = r0.f7918f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f7918f = r1
            goto L18
        L13:
            bk.q r0 = new bk.q
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.d
            m12.a r1 = m12.a.COROUTINE_SUSPENDED
            int r2 = r0.f7918f
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L2a
            h12.r.b(r7)     // Catch: java.lang.Exception -> L28
            goto L4b
        L28:
            r6 = move-exception
            goto L54
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            pa.c.w(r6)
            return r3
        L30:
            h12.r.b(r7)
            java.lang.String r7 = "model/n571h.json"
            bk.d r2 = r6.f7896c     // Catch: java.lang.Exception -> L28
            r0.f7918f = r4     // Catch: java.lang.Exception -> L28
            af1.i r4 = r2.f7878b     // Catch: java.lang.Exception -> L28
            h42.b r4 = r4.c()     // Catch: java.lang.Exception -> L28
            bk.c r5 = new bk.c     // Catch: java.lang.Exception -> L28
            r5.<init>(r2, r7, r3)     // Catch: java.lang.Exception -> L28
            java.lang.Object r7 = z32.g0.v(r4, r5, r0)     // Catch: java.lang.Exception -> L28
            if (r7 != r1) goto L4b
            return r1
        L4b:
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L28
            com.dyson.nst.dyson3d.schema.SchemaLoader r6 = r6.d     // Catch: java.lang.Exception -> L28
            com.dyson.nst.dyson3d.schema.model.Schema r6 = r6.parse(r7)     // Catch: java.lang.Exception -> L28
            return r6
        L54:
            boolean r7 = r6 instanceof java.util.concurrent.CancellationException
            if (r7 != 0) goto L5e
            java.lang.String r7 = "Error loading 3D model schema"
            com.dyson.mobile.android.logging.Logger.b(r7, r6)
            return r3
        L5e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: bk.n.j(n12.c):java.lang.Object");
    }

    public final void k(Bitmap bitmap) {
        File file = new File(this.f7899h);
        Bitmap.CompressFormat compressFormat = Build.VERSION.SDK_INT > 29 ? Bitmap.CompressFormat.WEBP_LOSSY : Bitmap.CompressFormat.WEBP;
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        if (!file.exists()) {
            file.createNewFile();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            bitmap.compress(compressFormat, 90, fileOutputStream);
            fileOutputStream.close();
        } finally {
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lbk/n$b;", "", "<init>", "()V", "", "IMAGE_NAME", "Ljava/lang/String;", "", "IMAGE_QUALITY", "I", "mod-audio"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }
}
