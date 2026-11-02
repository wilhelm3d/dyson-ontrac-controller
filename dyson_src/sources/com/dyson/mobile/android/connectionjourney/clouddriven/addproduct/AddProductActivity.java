package com.dyson.mobile.android.connectionjourney.clouddriven.addproduct;

import android.os.Bundle;
import androidx.activity.result.ActivityResultLauncher;
import ap.h;
import com.dyson.mobile.android.connectionjourney.clouddriven.addproduct.f;
import f.j;
import f.x;
import h12.f0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import n30.k;
import w00.i;
import x12.p;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/clouddriven/addproduct/AddProductActivity;", "Lf/g;", "<init>", "()V", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AddProductActivity extends f.g {

    /* renamed from: m  reason: collision with root package name */
    public static final /* synthetic */ int f13426m = 0;

    /* renamed from: j  reason: collision with root package name */
    public String f13427j;

    /* renamed from: k  reason: collision with root package name */
    public Function1<? super Boolean, f0> f13428k = new h(12);

    /* renamed from: l  reason: collision with root package name */
    public final ActivityResultLauncher<String> f13429l = registerForActivityResult(new androidx.activity.result.contract.f(), new an0.e(this, 13));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class a extends p implements Function1<ef1.a<f.a>, f0> {
        public a(Object obj) {
            super(1, obj, h20.c.class, "injectProductGroupViewModel", "injectProductGroupViewModel(Lcom/dyson/mobile/android/utilities/dependencyinjection/AssistedFactoryContainer;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final f0 invoke(ef1.a<f.a> aVar) {
            ef1.a<f.a> aVar2 = aVar;
            aVar2.getClass();
            ((h20.c) this.receiver).N(aVar2);
            return f0.f36844a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class b extends p implements Function1<ef1.a<k.a>, f0> {
        public b(Object obj) {
            super(1, obj, h20.c.class, "injectAddNonSerialProductViewModel", "injectAddNonSerialProductViewModel(Lcom/dyson/mobile/android/utilities/dependencyinjection/AssistedFactoryContainer;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final f0 invoke(ef1.a<k.a> aVar) {
            ef1.a<k.a> aVar2 = aVar;
            aVar2.getClass();
            ((h20.c) this.receiver).P(aVar2);
            return f0.f36844a;
        }
    }

    @Override // f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        if (cd.b.J(this)) {
            super.onCreate(null);
            return;
        }
        h20.c cVar = i.c(this).e;
        cVar.B(this);
        super.onCreate(bundle);
        x.e.getClass();
        j.a(this, x.a.a(0), x.a.a(0));
        g.f.a(this, new c4.c(-1204074158, true, new a10.k(15, this, cVar)));
    }
}
