package com.dyson.mobile.android.machine.ui.dialog;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.dyson.mobile.android.R;
import com.dyson.mobile.android.machine.ui.dialog.DialogDescriptor;
import h12.f0;
import java.util.EnumSet;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mg0.q;
import pa.c;
import q8.g;
import we1.a;
import x12.p;
import x12.r;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/dialog/a;", "Lts0/b;", "<init>", "()V", "a", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a extends ts0.b {

    /* renamed from: i  reason: collision with root package name */
    public static final C0522a f15340i = new C0522a(null);

    /* renamed from: g  reason: collision with root package name */
    public Function1<? super EnumSet<DialogDescriptor.a>, f0> f15341g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f15342h = true;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class b extends p implements w12.a<f0> {
        public b(Object obj) {
            super(0, obj, a.class, "dismiss", "dismiss()V", 0);
        }

        @Override // w12.a
        public final f0 invoke() {
            ((a) this.receiver).dismiss();
            return f0.f36844a;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        a.C2547a c2547a = we1.a.f85708c;
        Bundle arguments = getArguments();
        c2547a.getClass();
        we1.a b13 = a.C2547a.b(arguments);
        b13.f85710b = "Please use the newInstance method";
        b13.a("DESCRIPTOR");
        Bundle requireArguments = requireArguments();
        requireArguments.getClass();
        Object a13 = k7.b.a(requireArguments, "DESCRIPTOR", DialogDescriptor.class);
        if (a13 == null) {
            c.w("DESCRIPTOR was null");
            return null;
        }
        com.dyson.mobile.android.machine.ui.dialog.b bVar = new com.dyson.mobile.android.machine.ui.dialog.b((DialogDescriptor) ((Parcelable) a13));
        Function1<? super EnumSet<DialogDescriptor.a>, f0> function1 = this.f15341g;
        if (function1 == null) {
            r.i("callback");
            throw null;
        }
        bVar.f15354m.setValue(bVar, com.dyson.mobile.android.machine.ui.dialog.b.f15343n[0], function1);
        bVar.f15344a = new b(this);
        q qVar = (q) g.c(layoutInflater, R.layout.fragment_machine_dialog, viewGroup, false, null);
        qVar.l(bVar);
        View root = qVar.getRoot();
        root.getClass();
        return root;
    }

    @Override // ts0.b
    public final boolean s() {
        return false;
    }

    @Override // ts0.b
    public final boolean t() {
        return this.f15342h;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/machine/ui/dialog/a$a;", "", "<init>", "()V", "", "ARG_DESCRIPTOR", "Ljava/lang/String;", "mod-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.machine.ui.dialog.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0522a {
        public /* synthetic */ C0522a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0522a() {
        }
    }
}
