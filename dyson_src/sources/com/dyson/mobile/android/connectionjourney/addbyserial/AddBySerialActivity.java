package com.dyson.mobile.android.connectionjourney.addbyserial;

import android.os.Bundle;
import android.os.Parcelable;
import com.dyson.mobile.android.connectionjourney.addbyserial.b;
import com.dyson.mobile.android.connectionjourney.addbyserial.navigation.AddBySerialDestination;
import com.dyson.mobile.android.machinetype.MachineCategory;
import com.dyson.mobile.android.machinetype.MachineDescriptor;
import ef1.h;
import g.f;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w00.i;
import we1.a;
import x12.o0;
import zs0.o;
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/addbyserial/AddBySerialActivity;", "Ll/b;", "<init>", "()V", "a", "", "showBottomSheet", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AddBySerialActivity extends l.b {

    /* renamed from: m  reason: collision with root package name */
    public static final a f13260m = new a(null);

    /* renamed from: j  reason: collision with root package name */
    public h f13261j;

    /* renamed from: k  reason: collision with root package name */
    public b.a f13262k;

    /* renamed from: l  reason: collision with root package name */
    public k30.d f13263l;

    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r1v3, types: [T, com.dyson.mobile.android.machinetype.MachineCategory] */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.os.Parcelable, T] */
    @Override // androidx.fragment.app.e, f.g, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        if (cd.b.J(this)) {
            return;
        }
        i c13 = i.c(this);
        c13.e.E(this);
        o0 o0Var = new o0();
        o.a(this);
        super.onCreate(bundle);
        o0 o0Var2 = new o0();
        o0 o0Var3 = new o0();
        a.C2547a c2547a = we1.a.f85708c;
        Bundle extras = getIntent().getExtras();
        c2547a.getClass();
        we1.a b13 = a.C2547a.b(extras);
        b13.f85710b = "Activity cannot be started without machine type and variant";
        Bundle a13 = b13.a("machineDescriptor");
        Serializable c14 = k7.b.c(a13, "machineCategory", MachineCategory.class);
        if (c14 == null) {
            pa.c.w("machineCategory was null");
            return;
        }
        o0Var2.d = (MachineCategory) c14;
        o0Var3.d = k7.b.c(a13, "machineDescriptor", MachineDescriptor.class);
        Object a14 = k7.b.a(a13, "NAVIGATION_DESTINATION", AddBySerialDestination.class);
        if (a14 == null) {
            pa.c.w("NAVIGATION_DESTINATION was null");
            return;
        }
        o0Var.d = (Parcelable) a14;
        f.a(this, new c4.c(-751413597, true, new qs0.a(this, o0Var, c13, o0Var2, o0Var3, 11)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/dyson/mobile/android/connectionjourney/addbyserial/AddBySerialActivity$a;", "", "<init>", "()V", "", "EXTRA_MACHINE_CATEGORY", "Ljava/lang/String;", "EXTRA_MACHINE_DESCRIPTOR", "NAVIGATION_DESTINATION", "mod-connection-journey"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
