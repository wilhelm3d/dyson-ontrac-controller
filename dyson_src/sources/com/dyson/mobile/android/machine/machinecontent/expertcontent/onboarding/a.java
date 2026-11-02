package com.dyson.mobile.android.machine.machinecontent.expertcontent.onboarding;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.u;
import c42.q1;
import com.dyson.mobile.android.machine.machinecontent.expertcontent.onboarding.b;
import com.dyson.mobile.android.machine.machinecontent.expertcontent.onboarding.h;
import com.dyson.mobile.android.machine.response.expertcontent.ExpertContentVideoPlaylist;
import com.paypal.android.platform.authsdk.BR;
import h12.f0;
import h12.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import z32.c0;
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
@n12.e(c = "com.dyson.mobile.android.machine.machinecontent.expertcontent.onboarding.ExpertContentChapteredGuideLoadingFragment$initObservers$1", f = "ExpertContentChapteredGuideLoadingFragment.kt", l = {BR.stepDescription}, m = "invokeSuspend", v = 2)
/* loaded from: classes3.dex */
public final class a extends n12.i implements Function2<c0, l12.d<? super f0>, Object> {
    public int d;
    public final /* synthetic */ ExpertContentChapteredGuideLoadingFragment e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz32/c0;", "Lh12/f0;", "<anonymous>", "(Lz32/c0;)V"}, k = 3, mv = {2, 3, 0})
    @n12.e(c = "com.dyson.mobile.android.machine.machinecontent.expertcontent.onboarding.ExpertContentChapteredGuideLoadingFragment$initObservers$1$1", f = "ExpertContentChapteredGuideLoadingFragment.kt", l = {BR.stepImage}, m = "invokeSuspend", v = 2)
    /* renamed from: com.dyson.mobile.android.machine.machinecontent.expertcontent.onboarding.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0516a extends n12.i implements Function2<c0, l12.d<? super f0>, Object> {
        public int d;
        public final /* synthetic */ ExpertContentChapteredGuideLoadingFragment e;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/onboarding/h;", "event", "Lh12/f0;", "<anonymous>", "(Lcom/dyson/mobile/android/machine/machinecontent/expertcontent/onboarding/h;)V"}, k = 3, mv = {2, 3, 0})
        @n12.e(c = "com.dyson.mobile.android.machine.machinecontent.expertcontent.onboarding.ExpertContentChapteredGuideLoadingFragment$initObservers$1$1$1", f = "ExpertContentChapteredGuideLoadingFragment.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: com.dyson.mobile.android.machine.machinecontent.expertcontent.onboarding.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public static final class C0517a extends n12.i implements Function2<h, l12.d<? super f0>, Object> {
            public /* synthetic */ Object d;
            public final /* synthetic */ ExpertContentChapteredGuideLoadingFragment e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0517a(ExpertContentChapteredGuideLoadingFragment expertContentChapteredGuideLoadingFragment, l12.d<? super C0517a> dVar) {
                super(2, dVar);
                this.e = expertContentChapteredGuideLoadingFragment;
            }

            @Override // n12.a
            public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
                C0517a c0517a = new C0517a(this.e, dVar);
                c0517a.d = obj;
                return c0517a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(h hVar, l12.d<? super f0> dVar) {
                return ((C0517a) create(hVar, dVar)).invokeSuspend(f0.f36844a);
            }

            @Override // n12.a
            public final Object invokeSuspend(Object obj) {
                h hVar = (h) this.d;
                m12.a aVar = m12.a.COROUTINE_SUSPENDED;
                r.b(obj);
                boolean c13 = x12.r.c(hVar, h.a.f15247a);
                ExpertContentChapteredGuideLoadingFragment expertContentChapteredGuideLoadingFragment = this.e;
                if (c13) {
                    ExpertContentChapteredGuideLoadingFragment.s(expertContentChapteredGuideLoadingFragment);
                } else if (!(hVar instanceof h.b)) {
                    ma.e.o();
                    return null;
                } else {
                    ExpertContentVideoPlaylist expertContentVideoPlaylist = ((h.b) hVar).f15248a;
                    expertContentChapteredGuideLoadingFragment.getClass();
                    b.C0518b c0518b = b.f15235a;
                    String str = expertContentChapteredGuideLoadingFragment.t().f64171a;
                    c0518b.getClass();
                    expertContentVideoPlaylist.getClass();
                    androidx.navigation.fragment.a.a(expertContentChapteredGuideLoadingFragment).i(new b.a(expertContentVideoPlaylist, str));
                }
                return f0.f36844a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0516a(ExpertContentChapteredGuideLoadingFragment expertContentChapteredGuideLoadingFragment, l12.d<? super C0516a> dVar) {
            super(2, dVar);
            this.e = expertContentChapteredGuideLoadingFragment;
        }

        @Override // n12.a
        public final l12.d<f0> create(Object obj, l12.d<?> dVar) {
            return new C0516a(this.e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(c0 c0Var, l12.d<? super f0> dVar) {
            return ((C0516a) create(c0Var, dVar)).invokeSuspend(f0.f36844a);
        }

        @Override // n12.a
        public final Object invokeSuspend(Object obj) {
            m12.a aVar = m12.a.COROUTINE_SUSPENDED;
            int i13 = this.d;
            if (i13 == 0) {
                r.b(obj);
                ExpertContentChapteredGuideLoadingFragment expertContentChapteredGuideLoadingFragment = this.e;
                q1 q1Var = ((c) expertContentChapteredGuideLoadingFragment.f15228h.getValue()).f15242j;
                C0517a c0517a = new C0517a(expertContentChapteredGuideLoadingFragment, null);
                this.d = 1;
                if (c42.r.i(q1Var, c0517a, this) == aVar) {
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
    public a(ExpertContentChapteredGuideLoadingFragment expertContentChapteredGuideLoadingFragment, l12.d<? super a> dVar) {
        super(2, dVar);
        this.e = expertContentChapteredGuideLoadingFragment;
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
            ExpertContentChapteredGuideLoadingFragment expertContentChapteredGuideLoadingFragment = this.e;
            C0516a c0516a = new C0516a(expertContentChapteredGuideLoadingFragment, null);
            this.d = 1;
            if (u.b(expertContentChapteredGuideLoadingFragment, state, c0516a, this) == aVar) {
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
