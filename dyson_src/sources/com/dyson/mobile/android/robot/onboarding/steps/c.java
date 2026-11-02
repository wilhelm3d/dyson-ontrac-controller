package com.dyson.mobile.android.robot.onboarding.steps;

import com.brightcove.player.model.Video;
import com.dyson.mobile.android.localisation.LocalisationKey;
import com.dyson.mobile.android.robot.onboarding.steps.OnboardingStep;
import h12.f0;
import i12.q;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m9.u;
import ms0.e;
import ms0.l;
import ms0.m;
import mz1.f;
import q8.n;
import rf0.g0;
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0010\u0011B;\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/dyson/mobile/android/robot/onboarding/steps/c;", "Lm9/u;", "Lms0/m;", "videoRepository", "Lms0/l;", "videoCatalogProvider", "Lms0/d;", "brightcoveVideoConfigResolver", "Lms0/e;", "brightcoveVideoTracker", "Lpf0/c;", "localisationManager", "Lcom/dyson/mobile/android/robot/onboarding/steps/OnboardingStep;", "onboardingStep", "<init>", "(Lms0/m;Lms0/l;Lms0/d;Lms0/e;Lpf0/c;Lcom/dyson/mobile/android/robot/onboarding/steps/OnboardingStep;)V", "b", "a", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c extends u {

    /* renamed from: q  reason: collision with root package name */
    public static final Set<OnboardingStep.a> f16609q;
    public final e d;
    public final OnboardingStep e;

    /* renamed from: f  reason: collision with root package name */
    public final int f16610f;

    /* renamed from: g  reason: collision with root package name */
    public final n<Video> f16611g;

    /* renamed from: h  reason: collision with root package name */
    public final String f16612h;

    /* renamed from: i  reason: collision with root package name */
    public final String f16613i;

    /* renamed from: j  reason: collision with root package name */
    public final String f16614j;

    /* renamed from: k  reason: collision with root package name */
    public final String f16615k;

    /* renamed from: l  reason: collision with root package name */
    public final boolean f16616l;

    /* renamed from: m  reason: collision with root package name */
    public final boolean f16617m;

    /* renamed from: n  reason: collision with root package name */
    public final xf1.a<f0> f16618n;

    /* renamed from: o  reason: collision with root package name */
    public final xf1.a<f0> f16619o;

    /* renamed from: p  reason: collision with root package name */
    public final f f16620p;

    @wy1.a
    /* loaded from: classes3.dex */
    public interface b {
        c a(OnboardingStep onboardingStep);
    }

    static {
        new a(null);
        f16609q = q.e0(new OnboardingStep.a[]{OnboardingStep.a.FINISH, OnboardingStep.a.FINISH_CONTINUE});
    }

    public c(m mVar, l lVar, ms0.d dVar, e eVar, pf0.c cVar, OnboardingStep onboardingStep) {
        mVar.getClass();
        lVar.getClass();
        dVar.getClass();
        eVar.getClass();
        cVar.getClass();
        onboardingStep.getClass();
        this.d = eVar;
        this.e = onboardingStep;
        this.f16610f = onboardingStep.e;
        this.f16611g = new n<>();
        this.f16612h = cVar.d(onboardingStep.f16585f);
        this.f16613i = cVar.d(onboardingStep.f16586g);
        this.f16614j = cVar.d(g0.f71501s);
        OnboardingStep.a aVar = onboardingStep.f16587h;
        LocalisationKey buttonTextKey = aVar.getButtonTextKey();
        this.f16615k = cVar.d(buttonTextKey == null ? g0.f71505t : buttonTextKey);
        this.f16616l = aVar == OnboardingStep.a.SKIP;
        this.f16617m = f16609q.contains(aVar);
        this.f16618n = new xf1.a<>();
        this.f16619o = new xf1.a<>();
        String str = onboardingStep.f16588i;
        if (str != null) {
            this.f16620p = (f) mVar.a(str, dVar.b(), lVar.a(ms0.a.MAIN)).p(new bk0.c(new a01.l(this, 29), 25), new bk0.c(new bm.a(10), 26));
        }
    }

    @Override // m9.u
    public final void onCleared() {
        super.onCleared();
        f fVar = this.f16620p;
        if (fVar != null) {
            jz1.d.dispose(fVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/dyson/mobile/android/robot/onboarding/steps/c$a;", "", "<init>", "()V", "mod-robot"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }
}
