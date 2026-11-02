package com.dyson.mobile.android.light.permission;

import com.paypal.pyplcheckout.ui.feature.addressbook.view.customviews.PayPalNewShippingAddressReviewViewKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.o;
import m9.u;
import rf1.g;
import ve0.b;
import ve0.c;
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/dyson/mobile/android/light/permission/a;", "Lm9/u;", "Lrf1/g;", "permissionHandler", "<init>", "(Lrf1/g;)V", "a", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a extends u {
    public final g d;
    public final xf1.a<AbstractC0497a> e;

    /* renamed from: f  reason: collision with root package name */
    public final xf1.a f14926f;

    /* renamed from: g  reason: collision with root package name */
    public final o<b> f14927g;

    public a(g gVar) {
        gVar.getClass();
        this.d = gVar;
        xf1.a<AbstractC0497a> aVar = new xf1.a<>();
        this.e = aVar;
        this.f14926f = aVar;
        this.f14927g = new o<>();
    }

    @Override // m9.u
    public final void onCleared() {
        super.onCleared();
        this.d.dispose();
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/dyson/mobile/android/light/permission/a$a;", "", "<init>", "()V", "a", "b", "Lcom/dyson/mobile/android/light/permission/a$a$a;", "Lcom/dyson/mobile/android/light/permission/a$a$b;", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: com.dyson.mobile.android.light.permission.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static abstract class AbstractC0497a {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/light/permission/a$a$a;", "Lcom/dyson/mobile/android/light/permission/a$a;", "<init>", "()V", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.light.permission.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0498a extends AbstractC0497a {

            /* renamed from: a  reason: collision with root package name */
            public static final C0498a f14928a = new C0498a();

            private C0498a() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/dyson/mobile/android/light/permission/a$a$b;", "Lcom/dyson/mobile/android/light/permission/a$a;", "Lve0/c;", PayPalNewShippingAddressReviewViewKt.STATE, "<init>", "(Lve0/c;)V", "mod-light-machine"}, k = 1, mv = {2, 3, 0}, xi = 48)
        /* renamed from: com.dyson.mobile.android.light.permission.a$a$b */
        /* loaded from: classes2.dex */
        public static final class b extends AbstractC0497a {

            /* renamed from: a  reason: collision with root package name */
            public final c f14929a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(c cVar) {
                super(null);
                cVar.getClass();
                this.f14929a = cVar;
            }
        }

        public /* synthetic */ AbstractC0497a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private AbstractC0497a() {
        }
    }
}
