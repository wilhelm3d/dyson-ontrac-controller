package com.dyson.mobile.android.support.ui.contact.compose;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.u;
import c42.q1;
import com.dyson.mobile.android.support.ui.contact.compose.ErrorCustomerSupportActivity;
import com.dyson.mobile.android.support.ui.contact.compose.b;
import com.paypal.android.platform.authsdk.BR;
import e71.j;
import h12.f0;
import h12.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import n12.i;
import z32.c0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
@n12.e(c = "com.dyson.mobile.android.support.ui.contact.compose.ErrorCustomerSupportActivity$listenToNavigationEvents$1", f = "ErrorCustomerSupportActivity.kt", l = {BR.stepDescription}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class a extends i implements Function2<c0, l12.d<? super f0>, Object> {
    public int d;
    public final /* synthetic */ ErrorCustomerSupportActivity e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.support.ui.contact.compose.ErrorCustomerSupportActivity$listenToNavigationEvents$1$1", f = "ErrorCustomerSupportActivity.kt", l = {BR.stepImage}, m = "invokeSuspend", v = 2)
    /* renamed from: com.dyson.mobile.android.support.ui.contact.compose.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0611a extends i implements Function2<c0, l12.d<? super f0>, Object> {
        public int d;
        public final /* synthetic */ ErrorCustomerSupportActivity e;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/dyson/mobile/android/support/ui/contact/compose/b;", "event", "Lh12/f0;", "<anonymous>", "(Lcom/dyson/mobile/android/support/ui/contact/compose/b;)V"}, k = 3, mv = {2, 3, 0})
        @n12.e(c = "com.dyson.mobile.android.support.ui.contact.compose.ErrorCustomerSupportActivity$listenToNavigationEvents$1$1$1", f = "ErrorCustomerSupportActivity.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.dyson.mobile.android.support.ui.contact.compose.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0612a extends i implements Function2<b, l12.d<? super f0>, Object> {
            public /* synthetic */ Object d;
            public final /* synthetic */ ErrorCustomerSupportActivity e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0612a(ErrorCustomerSupportActivity errorCustomerSupportActivity, l12.d<? super C0612a> dVar) {
                super(2, dVar);
                this.e = errorCustomerSupportActivity;
            }

            @Override // n12.a
            public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
                C0612a c0612a = new C0612a(this.e, dVar);
                c0612a.d = obj;
                return c0612a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(b bVar, l12.d<? super f0> dVar) {
                return ((C0612a) create(bVar, dVar)).invokeSuspend(f0.f36844a);
            }

            @Override // n12.a
            public final Object invokeSuspend(Object obj) {
                b bVar = (b) this.d;
                m12.a aVar = m12.a.COROUTINE_SUSPENDED;
                r.b(obj);
                boolean z13 = bVar instanceof b.a;
                ErrorCustomerSupportActivity errorCustomerSupportActivity = this.e;
                if (z13) {
                    errorCustomerSupportActivity.c1();
                    j.b(errorCustomerSupportActivity, ((b.a) bVar).f16871a);
                } else if (bVar instanceof b.c) {
                    errorCustomerSupportActivity.c1();
                    j.c(errorCustomerSupportActivity, ((b.c) bVar).f16873a);
                } else if (bVar instanceof b.e) {
                    errorCustomerSupportActivity.c1();
                    j.f(errorCustomerSupportActivity, ((b.e) bVar).f16875a);
                } else if (bVar instanceof b.d) {
                    j c13 = errorCustomerSupportActivity.c1();
                    kj.b bVar2 = ((b.d) bVar).f16874a;
                    c13.e(errorCustomerSupportActivity, bVar2.f47574a, bVar2.f47575b);
                } else if (!(bVar instanceof b.C0613b)) {
                    ma.e.o();
                    return null;
                } else {
                    r81.a aVar2 = r81.a.f70727a;
                    ErrorCustomerSupportActivity.a aVar3 = ErrorCustomerSupportActivity.f16863m;
                    com.salesforce.android.smi.ui.b bVar3 = errorCustomerSupportActivity.d1().f16883l;
                    h71.i iVar = ((b.C0613b) bVar).f16872a;
                    j c14 = errorCustomerSupportActivity.c1();
                    aVar2.getClass();
                    r81.a.a(bVar3, iVar, c14, errorCustomerSupportActivity);
                }
                return f0.f36844a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0611a(ErrorCustomerSupportActivity errorCustomerSupportActivity, l12.d<? super C0611a> dVar) {
            super(2, dVar);
            this.e = errorCustomerSupportActivity;
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            return new C0611a(this.e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
            return ((C0611a) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            int i13 = this.d;
            if (i13 == 0) {
                r.b(obj);
                ErrorCustomerSupportActivity.a aVar2 = ErrorCustomerSupportActivity.f16863m;
                ErrorCustomerSupportActivity errorCustomerSupportActivity = this.e;
                q1 q1Var = errorCustomerSupportActivity.d1().f16888q;
                C0612a c0612a = new C0612a(errorCustomerSupportActivity, null);
                this.d = 1;
                if (c42.r.i(q1Var, c0612a, this) == aVar) {
                    return aVar;
                }
            } else if (i13 != 1) {
                pa.c.w("call to 'resume' before 'invoke' with coroutine");
                return null;
            } else {
                r.b(obj);
            }
            return f0.f36844a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ErrorCustomerSupportActivity errorCustomerSupportActivity, l12.d<? super a> dVar) {
        super(2, dVar);
        this.e = errorCustomerSupportActivity;
    }

    @Override // n12.a
    public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
        return new a(this.e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
        return ((a) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
    }

    @Override // n12.a
    public final Object invokeSuspend(Object obj) {
        m12.a aVar = m12.a.COROUTINE_SUSPENDED;
        int i13 = this.d;
        if (i13 == 0) {
            r.b(obj);
            Lifecycle.State state = Lifecycle.State.STARTED;
            ErrorCustomerSupportActivity errorCustomerSupportActivity = this.e;
            C0611a c0611a = new C0611a(errorCustomerSupportActivity, null);
            this.d = 1;
            if (u.b(errorCustomerSupportActivity, state, c0611a, this) == aVar) {
                return aVar;
            }
        } else if (i13 != 1) {
            pa.c.w("call to 'resume' before 'invoke' with coroutine");
            return null;
        } else {
            r.b(obj);
        }
        return f0.f36844a;
    }
}
